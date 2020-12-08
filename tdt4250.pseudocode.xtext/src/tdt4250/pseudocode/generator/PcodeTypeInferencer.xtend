package tdt4250.pseudocode.generator

import java.util.HashSet
import java.util.StringJoiner
import tdt4250.pseudocode.AndOrExpression
import tdt4250.pseudocode.ArithmeticSigned
import tdt4250.pseudocode.BooleanLiteral
import tdt4250.pseudocode.BooleanNegation
import tdt4250.pseudocode.Collection
import tdt4250.pseudocode.CollectionAccessor
import tdt4250.pseudocode.Comparison
import tdt4250.pseudocode.DoubleLiteral
import tdt4250.pseudocode.Equals
import tdt4250.pseudocode.Expression
import tdt4250.pseudocode.Function
import tdt4250.pseudocode.FunctionCall
import tdt4250.pseudocode.List
import tdt4250.pseudocode.ListLitteral
import tdt4250.pseudocode.Minus
import tdt4250.pseudocode.MultiOrDiv
import tdt4250.pseudocode.NumberLiteral
import tdt4250.pseudocode.Plus
import tdt4250.pseudocode.SetLitteral
import tdt4250.pseudocode.Stop
import tdt4250.pseudocode.StringLiteral
import tdt4250.pseudocode.Type
import tdt4250.pseudocode.Variable
import tdt4250.pseudocode.VariableReference

class PcodeTypeInferencer {

    def dispatch String infer(Function e) {
        var type = ''
        var returnTypes = new HashSet<String>()
        for (stop : e.eAllContents.toIterable.filter(Stop)) {
            if (stop.type == 'return' && stop.value !== null) {
                returnTypes.add(infer(stop.value))
            }
        }
        if (returnTypes.isEmpty) {
            type = 'void'
        } else {
            type = returnTypes.last
        }
        // TODO: handle if set.size > 1
        return type
    }

    def dispatch String infer(Expression e) {
    }

    def dispatch String infer(Variable e) {
        if (e.type !== null) {
            return infer(e.type)
        } else {
            return infer(e.value)
        }
    }

    // LiteralExpression
    def dispatch String infer(List e) {
        return 'List<' + autobox(infer(e.type)) + '>'
    }

    // TODO: only use TypeLiteral rule in grammar and take in that rule instead of string
    def String toJvmType(String type) {
        switch type.toLowerCase {
            case 'number': return 'int'
            case 'text': return 'String'
            case 'decimal': return 'double'
            case 'array',
            case 'list',
            case 'table': return 'List'
            case 'set': return 'Set'
            default: return type
        }
    }

    def String autobox(String type) {
        switch type.toLowerCase {
            case 'boolean': return 'Boolean'
            case 'int': return 'Integer'
            case 'double': return 'Double'
            default: return type
        }
    }

    def String unbox(String type) {
        switch type.toLowerCase {
            case 'boolean': return 'boolean'
            case 'integer': return 'int'
            case 'double': return 'double'
            default: return type
        }
    }

    def dispatch String infer(SetLitteral e) {
        return 'Set<' + autobox(toJvmType(infer(e.elements.get(0)).toString)) + '>' // Handle if list is empty
    }

    def dispatch String infer(ListLitteral e) {
        return 'List<' + autobox(toJvmType(infer(e.elements.get(0)).toString)) + '>'
    }

    def dispatch String infer(CollectionAccessor e) {
        var Collection v = e.collection.value as Collection
        var variable = e.collection as Variable

        if (variable.type !== null) {
            var varType = variable.type as Type
            return unbox(toJvmType(varType.types.get(e.accessor.length)))
        }

        for (var i = 0; i <= e.accessor.length; i++) {
            var element = v.elements.get(0)
            if (element instanceof Collection) {
                v = element as Collection
            } else {
                return infer(element)
            }
        }
    }

    // Tree parsing!
    def dispatch String infer(AndOrExpression e) {
        return infer(e.left)
    }

    def dispatch String infer(Comparison e) {
        return infer(e.left)
    }

    def dispatch String infer(Equals e) {
        return infer(e.left)
    }

    // ---ArithmeticExpressions---
    def dispatch String infer(Plus e) {
        var leftType = infer(e.left)
        var rightType = infer(e.right)
        // Make int + String output String
        if (leftType !== rightType && (leftType == 'String' || rightType == 'String')) {
            return 'String'
        }

        if (leftType == 'double' || rightType == 'double') {
            return 'double'
        }
        return leftType
    }

    def dispatch String infer(Minus e) {
        var leftType = infer(e.left)
        var rightType = infer(e.right)

        if (leftType == 'double' || rightType == 'double') {
            return 'double'
        }
        return infer(e.left)
    }

    def dispatch String infer(MultiOrDiv e) {
        return infer(e.left)
    }

    def dispatch String infer(BooleanNegation e) {
        return infer(e.expression)
    }

    def dispatch String infer(ArithmeticSigned e) {
        return infer(e.expression)
    }

    def dispatch String infer(NumberLiteral e) { return 'int' }

    def dispatch String infer(DoubleLiteral e) { return 'double' }

    def dispatch String infer(StringLiteral e) { return 'String' }

    def dispatch String infer(BooleanLiteral e) { return 'boolean' }

    def dispatch String infer(VariableReference e) {
        return infer(e.ref)
    }

    def dispatch String infer(FunctionCall e) {
        return infer(e.ref)
    }

    def dispatch String infer(Type e) {
        var string = ''
        if (e.types.length > 1) {
            var joiner = new StringJoiner('<');
            for (type : e.types) {
                joiner.add(autobox(toJvmType(type)))
            }
            var endString = ''
            for (var i = 0; i < e.types.size - 1; i++) {
                endString += ('>')
            }
            string += joiner.toString + endString
        } else {
            string += toJvmType(e.types.get(0))
        }
        return string
    }

}
