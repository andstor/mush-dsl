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
		case PseudocodePackage.VARIABLE_REFERENCE:
			return createVariableReference();
		case PseudocodePackage.PARAMETER:
			return createParameter();
		case PseudocodePackage.FUNCTION:
			return createFunction();
		case PseudocodePackage.FOR:
			return createFor();
		case PseudocodePackage.IF_EXPRESSION:
			return createIfExpression();
		case PseudocodePackage.WHILE:
			return createWhile();
		case PseudocodePackage.VARIABLE:
			return createVariable();
		case PseudocodePackage.STOP:
			return createStop();
		case PseudocodePackage.PRIMARY:
			return createPrimary();
		case PseudocodePackage.FUNCTION_CALL:
			return createFunctionCall();
		case PseudocodePackage.CONDITION:
			return createCondition();
		case PseudocodePackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case PseudocodePackage.BOOLEAN_TEST:
			return createBooleanTest();
		case PseudocodePackage.AND_OR_EXPRESSION:
			return createAndOrExpression();
		case PseudocodePackage.COMPARISON:
			return createComparison();
		case PseudocodePackage.EQUALS:
			return createEquals();
		case PseudocodePackage.MINUS:
			return createMinus();
		case PseudocodePackage.MULTI_OR_DIV:
			return createMultiOrDiv();
		case PseudocodePackage.BOOLEAN_NEGATION:
			return createBooleanNegation();
		case PseudocodePackage.ARITHMETIC_SIGNED:
			return createArithmeticSigned();
		case PseudocodePackage.NUMBER_LITERAL:
			return createNumberLiteral();
		case PseudocodePackage.STRING_LITERAL:
			return createStringLiteral();
		case PseudocodePackage.PLUS:
			return createPlus();
		case PseudocodePackage.MODEL:
			return createModel();
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
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
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
	public For createFor() {
		ForImpl for_ = new ForImpl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
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
	public Primary createPrimary() {
		PrimaryImpl primary = new PrimaryImpl();
		return primary;
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
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
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
	public BooleanTest createBooleanTest() {
		BooleanTestImpl booleanTest = new BooleanTestImpl();
		return booleanTest;
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
