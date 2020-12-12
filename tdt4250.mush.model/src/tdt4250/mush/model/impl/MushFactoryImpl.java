/**
 */
package tdt4250.mush.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.mush.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MushFactoryImpl extends EFactoryImpl implements MushFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MushFactory init() {
		try {
			MushFactory theMushFactory = (MushFactory)EPackage.Registry.INSTANCE.getEFactory(MushPackage.eNS_URI);
			if (theMushFactory != null) {
				return theMushFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MushFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MushFactoryImpl() {
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
			case MushPackage.MODEL: return createModel();
			case MushPackage.FUNCTION: return createFunction();
			case MushPackage.FEATURE: return createFeature();
			case MushPackage.STATEMENT: return createStatement();
			case MushPackage.EXPRESSION: return createExpression();
			case MushPackage.IF_STATEMENT: return createIfStatement();
			case MushPackage.FOR_STATEMENT: return createForStatement();
			case MushPackage.WHILE_STATEMENT: return createWhileStatement();
			case MushPackage.STOP: return createStop();
			case MushPackage.PRINT: return createPrint();
			case MushPackage.FUNCTION_CALL: return createFunctionCall();
			case MushPackage.COLLECTION: return createCollection();
			case MushPackage.VARIABLE: return createVariable();
			case MushPackage.COLLECTION_ADD: return createCollectionAdd();
			case MushPackage.COLLECTION_REMOVE: return createCollectionRemove();
			case MushPackage.VALUE_EXCHANGE: return createValueExchange();
			case MushPackage.LIST: return createList();
			case MushPackage.SET_LITTERAL: return createSetLitteral();
			case MushPackage.LIST_LITTERAL: return createListLitteral();
			case MushPackage.COLLECTION_ACCESSOR: return createCollectionAccessor();
			case MushPackage.AND_OR_EXPRESSION: return createAndOrExpression();
			case MushPackage.COMPARISON: return createComparison();
			case MushPackage.EQUALS: return createEquals();
			case MushPackage.PLUS: return createPlus();
			case MushPackage.MINUS: return createMinus();
			case MushPackage.MULTI_OR_DIV: return createMultiOrDiv();
			case MushPackage.BOOLEAN_NEGATION: return createBooleanNegation();
			case MushPackage.ARITHMETIC_SIGNED: return createArithmeticSigned();
			case MushPackage.PARENTHESIZED_EXPRESSION: return createParenthesizedExpression();
			case MushPackage.NUMBER_LITERAL: return createNumberLiteral();
			case MushPackage.STRING_LITERAL: return createStringLiteral();
			case MushPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case MushPackage.VARIABLE_REFERENCE: return createVariableReference();
			case MushPackage.TYPE: return createType();
			case MushPackage.DOUBLE_LITERAL: return createDoubleLiteral();
			case MushPackage.SIZE_EXPRESSION: return createSizeExpression();
			case MushPackage.COLLECTION_SET: return createCollectionSet();
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
	public CollectionSet createCollectionSet() {
		CollectionSetImpl collectionSet = new CollectionSetImpl();
		return collectionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MushPackage getMushPackage() {
		return (MushPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MushPackage getPackage() {
		return MushPackage.eINSTANCE;
	}

} //MushFactoryImpl
