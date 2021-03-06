/*
 * generated by Xtext 2.22.0
 */
package tdt4250.mush.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import tdt4250.mush.model.Function
import tdt4250.mush.model.Model
import tdt4250.mush.xtext.services.MushGrammarAccess

class MushFormatter extends AbstractFormatter2 {
	
	@Inject extension MushGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
        for (function : model.functions) {
            function.format.append[setNewLines(1, 1, 2)]
        }
    }

    def dispatch void format(Function function, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
        for (expression : function.parameters) {
            expression.format
        }
        
        val begin = function.regionFor.ruleCallTo(BEGINRule)
        val end = function.regionFor.ruleCallTo(ENDRule)

        function.regionFor.keyword("synthetic:BEGIN").append[newLine]
        function.regionFor.keyword("synthetic:END").prepend[newLine]

        interior(begin, end)[indent]
        
        for (feature : function.features) {
            feature.format
        }
    }
	
	// TODO: implement for Variable, IfStatement, ForStatement, WhileStatement, Stop, Print, CollectionAdd, CollectionRemove, CollectionSet, ValueExchange, List, SetLitteral, ListLitteral, CollectionAccessor, AndOrExpression, Comparison, Equals, MultiOrDiv, BooleanNegation, ArithmeticSigned, ParenthesizedExpression, FunctionCall, SizeExpression, Plus, Minus
}
