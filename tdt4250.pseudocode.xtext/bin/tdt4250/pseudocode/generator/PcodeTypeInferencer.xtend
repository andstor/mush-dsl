package tdt4250.pseudocode.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import tdt4250.pseudocode.Expression
import tdt4250.pseudocode.ForExpression
import tdt4250.pseudocode.Function
import tdt4250.pseudocode.IfExpression
import tdt4250.pseudocode.Statement
import tdt4250.pseudocode.Stop
import tdt4250.pseudocode.Variable
import tdt4250.pseudocode.WhileExpression
import tdt4250.pseudocode.TypeLiteral
import tdt4250.pseudocode.Print
import tdt4250.pseudocode.CollectionAdd
import tdt4250.pseudocode.CollectionRemove
import tdt4250.pseudocode.ValueExchange
import tdt4250.pseudocode.List
import tdt4250.pseudocode.SetLitteral
import tdt4250.pseudocode.ListLitteral
import tdt4250.pseudocode.CollectionAccessor
import tdt4250.pseudocode.AndOrExpression
import tdt4250.pseudocode.Comparison
import tdt4250.pseudocode.Equals
import tdt4250.pseudocode.Plus
import tdt4250.pseudocode.MultiOrDiv
import tdt4250.pseudocode.BooleanNegation
import tdt4250.pseudocode.ArithmeticSigned
import tdt4250.pseudocode.NumberLiteral
import tdt4250.pseudocode.StringLiteral
import tdt4250.pseudocode.VariableReference
import tdt4250.pseudocode.TypeLiteral
import tdt4250.pseudocode.Collection
import org.eclipse.emf.ecore.EObject

class PcodeTypeInferencer {

	def dispatch infer(Expression e) {
	}

	def dispatch infer(Variable e) {
		if (e.type !== null) {
			return infer(e.type)
		} else {
			return infer(e.value)
		}
	}

	// LiteralExpression
	def dispatch infer(List e) {
		return 'ArrayList<' + autobox(toJvmType(e.type)) + '>'
	}

	// TODO: only use TypeLiteral rule in grammar and take in that rule instead of string
	def toJvmType(String type) {
		switch type.toLowerCase {
			case 'number': return 'int'
			case 'text': return 'String'
			case 'decimal': return 'float'
			case 'array',
			case 'list', 
			case 'table': return 'ArrayList'
			default: return type
		}
	}

	def autobox(String type) {
		switch type.toLowerCase {
			case 'boolean': return 'Boolean'
			case 'int': return 'Integer'
			case 'float': return 'Float'
			default: return type
		}
	}

	def dispatch infer(SetLitteral e) {
		return autobox(toJvmType(infer(e.elements.get(0)).toString)) // Handle if list is empty
	}

	def dispatch infer(ListLitteral e) {
		return 'ArrayList<' + autobox(toJvmType(infer(e.elements.get(0)).toString)) + '>'
	}

	def dispatch infer(CollectionAccessor e) {
		var Collection v = e.collection.value as Collection
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
	def dispatch infer(AndOrExpression e) {
		return infer(e.left)
	}

	def dispatch infer(Comparison e) {
		return infer(e.left)
	}

	def dispatch infer(Equals e) {
		return infer(e.left)
	}

	// ArithmeticExpression
	def dispatch infer(Plus e) {
		return infer(e.left)
	}

	def dispatch infer(MultiOrDiv e) {
		return infer(e.left)
	}

	def dispatch infer(BooleanNegation e) {
		return infer(e.expression)
	}

	def dispatch infer(ArithmeticSigned e) {
		return infer(e.expression)
	}

	def dispatch infer(NumberLiteral e) { return 'int' }

	def dispatch infer(StringLiteral e) { return 'String' }

	def dispatch infer(VariableReference e) {
		return infer(e.ref)
	}

	def dispatch infer(TypeLiteral e) {
		return toJvmType(e.name)
	}

}
