/*
 * generated by Xtext 2.22.0
 */
package tdt4250.pseudocode.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import tdt4250.pseudocode.Function
import tdt4250.pseudocode.Model
import tdt4250.pseudocode.services.PcodeGrammarAccess

class PcodeFormatter extends AbstractFormatter2 {
	
	@Inject extension PcodeGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (function : model.functions) {
			function.format
		}
	}

	def dispatch void format(Function function, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (expression : function.parameters) {
			expression.format
		}
		for (feature : function.features) {
			feature.format
		}
	}
	
	// TODO: implement for Variable, IfExpression, ForExpression, WhileExpression, Print, CollectionAdd, ValueExchange, FunctionCall, List, SetLitteral, ListLitteral, CollectionAccessor, AndOrExpression, Comparison, Equals, MultiOrDiv, BooleanNegation, ArithmeticSigned, Plus, Minus
}
