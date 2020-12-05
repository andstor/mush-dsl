/*
 * generated by Xtext 2.22.0
 */
package tdt4250.pseudocode.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import tdt4250.pseudocode.ide.contentassist.antlr.internal.InternalPcodeParser;
import tdt4250.pseudocode.services.PcodeGrammarAccess;

public class PcodeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PcodeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PcodeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
			builder.put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives_1(), "rule__Variable__Alternatives_1");
			builder.put(grammarAccess.getVariableAccess().getOpAlternatives_1_0_1_0(), "rule__Variable__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getVariableAccess().getOpAlternatives_1_1_1_0(), "rule__Variable__OpAlternatives_1_1_1_0");
			builder.put(grammarAccess.getStopAccess().getAlternatives_1(), "rule__Stop__Alternatives_1");
			builder.put(grammarAccess.getStopAccess().getTypeAlternatives_1_0_0(), "rule__Stop__TypeAlternatives_1_0_0");
			builder.put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
			builder.put(grammarAccess.getCollectionAccess().getAlternatives(), "rule__Collection__Alternatives");
			builder.put(grammarAccess.getListAccess().getTypeAlternatives_2_0(), "rule__List__TypeAlternatives_2_0");
			builder.put(grammarAccess.getListAccess().getAlternatives_3(), "rule__List__Alternatives_3");
			builder.put(grammarAccess.getCollectionLitteralAccess().getAlternatives(), "rule__CollectionLitteral__Alternatives");
			builder.put(grammarAccess.getCollectionAccessorAccess().getAlternatives_1(), "rule__CollectionAccessor__Alternatives_1");
			builder.put(grammarAccess.getBooleanExpressionAccess().getOpAlternatives_1_0_1_0(), "rule__BooleanExpression__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_1_0(), "rule__Comparison__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getEqualsAccess().getOpAlternatives_1_0_1_0(), "rule__Equals__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
			builder.put(grammarAccess.getAdditionAccess().getAlternatives_1_0_1_1(), "rule__Addition__Alternatives_1_0_1_1");
			builder.put(grammarAccess.getPlusOperatorAccess().getAlternatives(), "rule__PlusOperator__Alternatives");
			builder.put(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0(), "rule__Multiplication__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getPrefixedAccess().getAlternatives(), "rule__Prefixed__Alternatives");
			builder.put(grammarAccess.getPrefixedAccess().getAlternatives_1_1_0(), "rule__Prefixed__Alternatives_1_1_0");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0(), "rule__Atomic__ValueAlternatives_3_1_0");
			builder.put(grammarAccess.getBooleanOperatorAccess().getAlternatives(), "rule__BooleanOperator__Alternatives");
			builder.put(grammarAccess.getBooleanTestOperatorAccess().getAlternatives(), "rule__BooleanTestOperator__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getTypeLiteralAccess().getNameAlternatives_1_0(), "rule__TypeLiteral__NameAlternatives_1_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1_0(), "rule__Variable__Group_1_0__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1_1(), "rule__Variable__Group_1_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup_7(), "rule__IfExpression__Group_7__0");
			builder.put(grammarAccess.getForExpressionAccess().getGroup(), "rule__ForExpression__Group__0");
			builder.put(grammarAccess.getWhileExpressionAccess().getGroup(), "rule__WhileExpression__Group__0");
			builder.put(grammarAccess.getStopAccess().getGroup(), "rule__Stop__Group__0");
			builder.put(grammarAccess.getStopAccess().getGroup_1_1(), "rule__Stop__Group_1_1__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getCollectionAddAccess().getGroup(), "rule__CollectionAdd__Group__0");
			builder.put(grammarAccess.getCollectionRemoveAccess().getGroup(), "rule__CollectionRemove__Group__0");
			builder.put(grammarAccess.getValueExchangeAccess().getGroup(), "rule__ValueExchange__Group__0");
			builder.put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
			builder.put(grammarAccess.getListAccess().getGroup_4(), "rule__List__Group_4__0");
			builder.put(grammarAccess.getListAccess().getGroup_4_3(), "rule__List__Group_4_3__0");
			builder.put(grammarAccess.getSetLitteralAccess().getGroup(), "rule__SetLitteral__Group__0");
			builder.put(grammarAccess.getSetLitteralAccess().getGroup_2(), "rule__SetLitteral__Group_2__0");
			builder.put(grammarAccess.getSetLitteralAccess().getGroup_2_1(), "rule__SetLitteral__Group_2_1__0");
			builder.put(grammarAccess.getListLitteralAccess().getGroup(), "rule__ListLitteral__Group__0");
			builder.put(grammarAccess.getListLitteralAccess().getGroup_2(), "rule__ListLitteral__Group_2__0");
			builder.put(grammarAccess.getListLitteralAccess().getGroup_2_1(), "rule__ListLitteral__Group_2_1__0");
			builder.put(grammarAccess.getCollectionAccessorAccess().getGroup(), "rule__CollectionAccessor__Group__0");
			builder.put(grammarAccess.getCollectionAccessorAccess().getGroup_1_0(), "rule__CollectionAccessor__Group_1_0__0");
			builder.put(grammarAccess.getCollectionAccessorAccess().getGroup_1_0_1(), "rule__CollectionAccessor__Group_1_0_1__0");
			builder.put(grammarAccess.getCollectionAccessorAccess().getGroup_1_1(), "rule__CollectionAccessor__Group_1_1__0");
			builder.put(grammarAccess.getCollectionAccessorAccess().getGroup_1_1_4(), "rule__CollectionAccessor__Group_1_1_4__0");
			builder.put(grammarAccess.getBooleanExpressionAccess().getGroup(), "rule__BooleanExpression__Group__0");
			builder.put(grammarAccess.getBooleanExpressionAccess().getGroup_1(), "rule__BooleanExpression__Group_1__0");
			builder.put(grammarAccess.getBooleanExpressionAccess().getGroup_1_0(), "rule__BooleanExpression__Group_1_0__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_0(), "rule__Comparison__Group_1_0__0");
			builder.put(grammarAccess.getEqualsAccess().getGroup(), "rule__Equals__Group__0");
			builder.put(grammarAccess.getEqualsAccess().getGroup_1(), "rule__Equals__Group_1__0");
			builder.put(grammarAccess.getEqualsAccess().getGroup_1_0(), "rule__Equals__Group_1_0__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1_0(), "rule__Multiplication__Group_1_0__0");
			builder.put(grammarAccess.getPrefixedAccess().getGroup_0(), "rule__Prefixed__Group_0__0");
			builder.put(grammarAccess.getPrefixedAccess().getGroup_1(), "rule__Prefixed__Group_1__0");
			builder.put(grammarAccess.getPrefixedAccess().getGroup_1_1(), "rule__Prefixed__Group_1_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3(), "rule__FunctionCall__Group_3__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3_1(), "rule__FunctionCall__Group_3_1__0");
			builder.put(grammarAccess.getTypeLiteralAccess().getGroup(), "rule__TypeLiteral__Group__0");
			builder.put(grammarAccess.getModelAccess().getFunctionsAssignment_1(), "rule__Model__FunctionsAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getParametersAssignment_3_0(), "rule__Function__ParametersAssignment_3_0");
			builder.put(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_1(), "rule__Function__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getFunctionAccess().getFeaturesAssignment_6(), "rule__Function__FeaturesAssignment_6");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1_0_0(), "rule__Variable__NameAssignment_1_0_0");
			builder.put(grammarAccess.getVariableAccess().getOpAssignment_1_0_1(), "rule__Variable__OpAssignment_1_0_1");
			builder.put(grammarAccess.getVariableAccess().getValueAssignment_1_0_2(), "rule__Variable__ValueAssignment_1_0_2");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1_1_0(), "rule__Variable__NameAssignment_1_1_0");
			builder.put(grammarAccess.getVariableAccess().getOpAssignment_1_1_1(), "rule__Variable__OpAssignment_1_1_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_1(), "rule__Parameter__TypeAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
			builder.put(grammarAccess.getIfExpressionAccess().getNameAssignment_1(), "rule__IfExpression__NameAssignment_1");
			builder.put(grammarAccess.getIfExpressionAccess().getConditionAssignment_2(), "rule__IfExpression__ConditionAssignment_2");
			builder.put(grammarAccess.getIfExpressionAccess().getThenAssignment_5(), "rule__IfExpression__ThenAssignment_5");
			builder.put(grammarAccess.getIfExpressionAccess().getOtherwiseAssignment_7_2(), "rule__IfExpression__OtherwiseAssignment_7_2");
			builder.put(grammarAccess.getForExpressionAccess().getFromAssignment_3(), "rule__ForExpression__FromAssignment_3");
			builder.put(grammarAccess.getForExpressionAccess().getToAssignment_5(), "rule__ForExpression__ToAssignment_5");
			builder.put(grammarAccess.getForExpressionAccess().getBlockAssignment_7(), "rule__ForExpression__BlockAssignment_7");
			builder.put(grammarAccess.getWhileExpressionAccess().getConditionAssignment_2(), "rule__WhileExpression__ConditionAssignment_2");
			builder.put(grammarAccess.getWhileExpressionAccess().getBlockAssignment_4(), "rule__WhileExpression__BlockAssignment_4");
			builder.put(grammarAccess.getStopAccess().getTypeAssignment_1_0(), "rule__Stop__TypeAssignment_1_0");
			builder.put(grammarAccess.getStopAccess().getTypeAssignment_1_1_0(), "rule__Stop__TypeAssignment_1_1_0");
			builder.put(grammarAccess.getStopAccess().getValueAssignment_1_1_1(), "rule__Stop__ValueAssignment_1_1_1");
			builder.put(grammarAccess.getPrintAccess().getNameAssignment_0(), "rule__Print__NameAssignment_0");
			builder.put(grammarAccess.getPrintAccess().getValueAssignment_1(), "rule__Print__ValueAssignment_1");
			builder.put(grammarAccess.getCollectionAddAccess().getCollectionAssignment_1(), "rule__CollectionAdd__CollectionAssignment_1");
			builder.put(grammarAccess.getCollectionAddAccess().getValueAssignment_3(), "rule__CollectionAdd__ValueAssignment_3");
			builder.put(grammarAccess.getCollectionRemoveAccess().getCollectionAssignment_1(), "rule__CollectionRemove__CollectionAssignment_1");
			builder.put(grammarAccess.getCollectionRemoveAccess().getValueAssignment_3(), "rule__CollectionRemove__ValueAssignment_3");
			builder.put(grammarAccess.getValueExchangeAccess().getCollectionAssignment_2(), "rule__ValueExchange__CollectionAssignment_2");
			builder.put(grammarAccess.getValueExchangeAccess().getValueAssignment_4(), "rule__ValueExchange__ValueAssignment_4");
			builder.put(grammarAccess.getListAccess().getTypeAssignment_2(), "rule__List__TypeAssignment_2");
			builder.put(grammarAccess.getListAccess().getElementsAssignment_4_2(), "rule__List__ElementsAssignment_4_2");
			builder.put(grammarAccess.getListAccess().getElementsAssignment_4_3_1(), "rule__List__ElementsAssignment_4_3_1");
			builder.put(grammarAccess.getSetLitteralAccess().getElementsAssignment_2_0(), "rule__SetLitteral__ElementsAssignment_2_0");
			builder.put(grammarAccess.getSetLitteralAccess().getElementsAssignment_2_1_1(), "rule__SetLitteral__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getListLitteralAccess().getElementsAssignment_2_0(), "rule__ListLitteral__ElementsAssignment_2_0");
			builder.put(grammarAccess.getListLitteralAccess().getElementsAssignment_2_1_1(), "rule__ListLitteral__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getCollectionAccessorAccess().getCollectionAssignment_1_0_0(), "rule__CollectionAccessor__CollectionAssignment_1_0_0");
			builder.put(grammarAccess.getCollectionAccessorAccess().getAccessorAssignment_1_0_1_1(), "rule__CollectionAccessor__AccessorAssignment_1_0_1_1");
			builder.put(grammarAccess.getCollectionAccessorAccess().getCollectionAssignment_1_1_0(), "rule__CollectionAccessor__CollectionAssignment_1_1_0");
			builder.put(grammarAccess.getCollectionAccessorAccess().getAccessorAssignment_1_1_3(), "rule__CollectionAccessor__AccessorAssignment_1_1_3");
			builder.put(grammarAccess.getCollectionAccessorAccess().getAccessorAssignment_1_1_4_1(), "rule__CollectionAccessor__AccessorAssignment_1_1_4_1");
			builder.put(grammarAccess.getBooleanExpressionAccess().getOpAssignment_1_0_1(), "rule__BooleanExpression__OpAssignment_1_0_1");
			builder.put(grammarAccess.getBooleanExpressionAccess().getRightAssignment_1_1(), "rule__BooleanExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1(), "rule__Comparison__OpAssignment_1_0_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_1(), "rule__Comparison__RightAssignment_1_1");
			builder.put(grammarAccess.getEqualsAccess().getOpAssignment_1_0_1(), "rule__Equals__OpAssignment_1_0_1");
			builder.put(grammarAccess.getEqualsAccess().getRightAssignment_1_1(), "rule__Equals__RightAssignment_1_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1(), "rule__Multiplication__OpAssignment_1_0_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
			builder.put(grammarAccess.getPrefixedAccess().getExpressionAssignment_0_2(), "rule__Prefixed__ExpressionAssignment_0_2");
			builder.put(grammarAccess.getPrefixedAccess().getExpressionAssignment_1_2(), "rule__Prefixed__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getAtomicAccess().getExpressionAssignment_0_2(), "rule__Atomic__ExpressionAssignment_0_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
			builder.put(grammarAccess.getAtomicAccess().getRefAssignment_4_1(), "rule__Atomic__RefAssignment_4_1");
			builder.put(grammarAccess.getFunctionCallAccess().getRefAssignment_1(), "rule__FunctionCall__RefAssignment_1");
			builder.put(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_0(), "rule__FunctionCall__ParametersAssignment_3_0");
			builder.put(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_1_1(), "rule__FunctionCall__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getTypeLiteralAccess().getNameAssignment_1(), "rule__TypeLiteral__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PcodeGrammarAccess grammarAccess;

	@Override
	protected InternalPcodeParser createParser() {
		InternalPcodeParser result = new InternalPcodeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new PcodeTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PcodeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PcodeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
