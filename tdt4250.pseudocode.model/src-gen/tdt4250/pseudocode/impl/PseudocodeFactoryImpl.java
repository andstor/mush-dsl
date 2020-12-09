/**
 */
package tdt4250.pseudocode.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import tdt4250.pseudocode.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PseudocodeFactoryImpl extends EFactoryImpl implements PseudocodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PseudocodeFactory init() {
		try {
			PseudocodeFactory thePseudocodeFactory = (PseudocodeFactory) EPackage.Registry.INSTANCE
					.getEFactory(PseudocodePackage.eNS_URI);
			if (thePseudocodeFactory != null) {
				return thePseudocodeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PseudocodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudocodeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PseudocodePackage.MODEL:
			return createModel();
		case PseudocodePackage.FUNCTION:
			return createFunction();
		case PseudocodePackage.FEATURE:
			return createFeature();
		case PseudocodePackage.STATEMENT:
			return createStatement();
		case PseudocodePackage.EXPRESSION:
			return createExpression();
		case PseudocodePackage.IF_STATEMENT:
			return createIfStatement();
		case PseudocodePackage.FOR_STATEMENT:
			return createForStatement();
		case PseudocodePackage.WHILE_STATEMENT:
			return createWhileStatement();
		case PseudocodePackage.STOP:
			return createStop();
		case PseudocodePackage.PRINT:
			return createPrint();
		case PseudocodePackage.FUNCTION_CALL:
			return createFunctionCall();
		case PseudocodePackage.COLLECTION:
			return createCollection();
		case PseudocodePackage.VARIABLE:
			return createVariable();
		case PseudocodePackage.COLLECTION_ADD:
			return createCollectionAdd();
		case PseudocodePackage.COLLECTION_REMOVE:
			return createCollectionRemove();
		case PseudocodePackage.VALUE_EXCHANGE:
			return createValueExchange();
		case PseudocodePackage.LIST:
			return createList();
		case PseudocodePackage.SET_LITTERAL:
			return createSetLitteral();
		case PseudocodePackage.LIST_LITTERAL:
			return createListLitteral();
		case PseudocodePackage.COLLECTION_ACCESSOR:
			return createCollectionAccessor();
		case PseudocodePackage.AND_OR_EXPRESSION:
			return createAndOrExpression();
		case PseudocodePackage.COMPARISON:
			return createComparison();
		case PseudocodePackage.EQUALS:
			return createEquals();
		case PseudocodePackage.PLUS:
			return createPlus();
		case PseudocodePackage.MINUS:
			return createMinus();
		case PseudocodePackage.MULTI_OR_DIV:
			return createMultiOrDiv();
		case PseudocodePackage.BOOLEAN_NEGATION:
			return createBooleanNegation();
		case PseudocodePackage.ARITHMETIC_SIGNED:
			return createArithmeticSigned();
		case PseudocodePackage.PARENTHESIZED_EXPRESSION:
			return createParenthesizedExpression();
		case PseudocodePackage.NUMBER_LITERAL:
			return createNumberLiteral();
		case PseudocodePackage.STRING_LITERAL:
			return createStringLiteral();
		case PseudocodePackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case PseudocodePackage.VARIABLE_REFERENCE:
			return createVariableReference();
		case PseudocodePackage.TYPE:
			return createType();
		case PseudocodePackage.DOUBLE_LITERAL:
			return createDoubleLiteral();
		case PseudocodePackage.SIZE_EXPRESSION:
			return createSizeExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionAdd createCollectionAdd() {
		CollectionAddImpl collectionAdd = new CollectionAddImpl();
		return collectionAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionRemove createCollectionRemove() {
		CollectionRemoveImpl collectionRemove = new CollectionRemoveImpl();
		return collectionRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueExchange createValueExchange() {
		ValueExchangeImpl valueExchange = new ValueExchangeImpl();
		return valueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetLitteral createSetLitteral() {
		SetLitteralImpl setLitteral = new SetLitteralImpl();
		return setLitteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListLitteral createListLitteral() {
		ListLitteralImpl listLitteral = new ListLitteralImpl();
		return listLitteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionAccessor createCollectionAccessor() {
		CollectionAccessorImpl collectionAccessor = new CollectionAccessorImpl();
		return collectionAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndOrExpression createAndOrExpression() {
		AndOrExpressionImpl andOrExpression = new AndOrExpressionImpl();
		return andOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiOrDiv createMultiOrDiv() {
		MultiOrDivImpl multiOrDiv = new MultiOrDivImpl();
		return multiOrDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanNegation createBooleanNegation() {
		BooleanNegationImpl booleanNegation = new BooleanNegationImpl();
		return booleanNegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticSigned createArithmeticSigned() {
		ArithmeticSignedImpl arithmeticSigned = new ArithmeticSignedImpl();
		return arithmeticSigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParenthesizedExpression createParenthesizedExpression() {
		ParenthesizedExpressionImpl parenthesizedExpression = new ParenthesizedExpressionImpl();
		return parenthesizedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleLiteral createDoubleLiteral() {
		DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
		return doubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeExpression createSizeExpression() {
		SizeExpressionImpl sizeExpression = new SizeExpressionImpl();
		return sizeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PseudocodePackage getPseudocodePackage() {
		return (PseudocodePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PseudocodePackage getPackage() {
		return PseudocodePackage.eINSTANCE;
	}

} //PseudocodeFactoryImpl
