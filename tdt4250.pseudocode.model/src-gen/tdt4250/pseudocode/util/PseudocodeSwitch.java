/**
 */
package tdt4250.pseudocode.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import tdt4250.pseudocode.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tdt4250.pseudocode.PseudocodePackage
 * @generated
 */
public class PseudocodeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PseudocodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudocodeSwitch() {
		if (modelPackage == null) {
			modelPackage = PseudocodePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PseudocodePackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.FEATURE: {
			Feature feature = (Feature) theEObject;
			T result = caseFeature(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = caseFeature(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseFeature(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.IF_STATEMENT: {
			IfStatement ifStatement = (IfStatement) theEObject;
			T result = caseIfStatement(ifStatement);
			if (result == null)
				result = caseStatement(ifStatement);
			if (result == null)
				result = caseFeature(ifStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.FOR_STATEMENT: {
			ForStatement forStatement = (ForStatement) theEObject;
			T result = caseForStatement(forStatement);
			if (result == null)
				result = caseStatement(forStatement);
			if (result == null)
				result = caseFeature(forStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.WHILE_STATEMENT: {
			WhileStatement whileStatement = (WhileStatement) theEObject;
			T result = caseWhileStatement(whileStatement);
			if (result == null)
				result = caseStatement(whileStatement);
			if (result == null)
				result = caseFeature(whileStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.STOP: {
			Stop stop = (Stop) theEObject;
			T result = caseStop(stop);
			if (result == null)
				result = caseStatement(stop);
			if (result == null)
				result = caseFeature(stop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.PRINT: {
			Print print = (Print) theEObject;
			T result = casePrint(print);
			if (result == null)
				result = caseExpression(print);
			if (result == null)
				result = caseFeature(print);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.FUNCTION_CALL: {
			FunctionCall functionCall = (FunctionCall) theEObject;
			T result = caseFunctionCall(functionCall);
			if (result == null)
				result = caseExpression(functionCall);
			if (result == null)
				result = caseFeature(functionCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.COLLECTION: {
			Collection collection = (Collection) theEObject;
			T result = caseCollection(collection);
			if (result == null)
				result = caseExpression(collection);
			if (result == null)
				result = caseFeature(collection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseExpression(variable);
			if (result == null)
				result = caseFeature(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.COLLECTION_ADD: {
			CollectionAdd collectionAdd = (CollectionAdd) theEObject;
			T result = caseCollectionAdd(collectionAdd);
			if (result == null)
				result = caseExpression(collectionAdd);
			if (result == null)
				result = caseFeature(collectionAdd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.COLLECTION_REMOVE: {
			CollectionRemove collectionRemove = (CollectionRemove) theEObject;
			T result = caseCollectionRemove(collectionRemove);
			if (result == null)
				result = caseExpression(collectionRemove);
			if (result == null)
				result = caseFeature(collectionRemove);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.VALUE_EXCHANGE: {
			ValueExchange valueExchange = (ValueExchange) theEObject;
			T result = caseValueExchange(valueExchange);
			if (result == null)
				result = caseExpression(valueExchange);
			if (result == null)
				result = caseFeature(valueExchange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.LIST: {
			List list = (List) theEObject;
			T result = caseList(list);
			if (result == null)
				result = caseCollection(list);
			if (result == null)
				result = caseExpression(list);
			if (result == null)
				result = caseFeature(list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.SET_LITTERAL: {
			SetLitteral setLitteral = (SetLitteral) theEObject;
			T result = caseSetLitteral(setLitteral);
			if (result == null)
				result = caseCollection(setLitteral);
			if (result == null)
				result = caseExpression(setLitteral);
			if (result == null)
				result = caseFeature(setLitteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.LIST_LITTERAL: {
			ListLitteral listLitteral = (ListLitteral) theEObject;
			T result = caseListLitteral(listLitteral);
			if (result == null)
				result = caseCollection(listLitteral);
			if (result == null)
				result = caseExpression(listLitteral);
			if (result == null)
				result = caseFeature(listLitteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.COLLECTION_ACCESSOR: {
			CollectionAccessor collectionAccessor = (CollectionAccessor) theEObject;
			T result = caseCollectionAccessor(collectionAccessor);
			if (result == null)
				result = caseExpression(collectionAccessor);
			if (result == null)
				result = caseFeature(collectionAccessor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.AND_OR_EXPRESSION: {
			AndOrExpression andOrExpression = (AndOrExpression) theEObject;
			T result = caseAndOrExpression(andOrExpression);
			if (result == null)
				result = caseExpression(andOrExpression);
			if (result == null)
				result = caseFeature(andOrExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.COMPARISON: {
			Comparison comparison = (Comparison) theEObject;
			T result = caseComparison(comparison);
			if (result == null)
				result = caseExpression(comparison);
			if (result == null)
				result = caseFeature(comparison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.EQUALS: {
			Equals equals = (Equals) theEObject;
			T result = caseEquals(equals);
			if (result == null)
				result = caseExpression(equals);
			if (result == null)
				result = caseFeature(equals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseExpression(plus);
			if (result == null)
				result = caseFeature(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseExpression(minus);
			if (result == null)
				result = caseFeature(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.MULTI_OR_DIV: {
			MultiOrDiv multiOrDiv = (MultiOrDiv) theEObject;
			T result = caseMultiOrDiv(multiOrDiv);
			if (result == null)
				result = caseExpression(multiOrDiv);
			if (result == null)
				result = caseFeature(multiOrDiv);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.BOOLEAN_NEGATION: {
			BooleanNegation booleanNegation = (BooleanNegation) theEObject;
			T result = caseBooleanNegation(booleanNegation);
			if (result == null)
				result = caseExpression(booleanNegation);
			if (result == null)
				result = caseFeature(booleanNegation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.ARITHMETIC_SIGNED: {
			ArithmeticSigned arithmeticSigned = (ArithmeticSigned) theEObject;
			T result = caseArithmeticSigned(arithmeticSigned);
			if (result == null)
				result = caseExpression(arithmeticSigned);
			if (result == null)
				result = caseFeature(arithmeticSigned);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.PARENTHESIZED_EXPRESSION: {
			ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression) theEObject;
			T result = caseParenthesizedExpression(parenthesizedExpression);
			if (result == null)
				result = caseExpression(parenthesizedExpression);
			if (result == null)
				result = caseFeature(parenthesizedExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.NUMBER_LITERAL: {
			NumberLiteral numberLiteral = (NumberLiteral) theEObject;
			T result = caseNumberLiteral(numberLiteral);
			if (result == null)
				result = caseExpression(numberLiteral);
			if (result == null)
				result = caseFeature(numberLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.STRING_LITERAL: {
			StringLiteral stringLiteral = (StringLiteral) theEObject;
			T result = caseStringLiteral(stringLiteral);
			if (result == null)
				result = caseExpression(stringLiteral);
			if (result == null)
				result = caseFeature(stringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.BOOLEAN_LITERAL: {
			BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
			T result = caseBooleanLiteral(booleanLiteral);
			if (result == null)
				result = caseExpression(booleanLiteral);
			if (result == null)
				result = caseFeature(booleanLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.VARIABLE_REFERENCE: {
			VariableReference variableReference = (VariableReference) theEObject;
			T result = caseVariableReference(variableReference);
			if (result == null)
				result = caseExpression(variableReference);
			if (result == null)
				result = caseFeature(variableReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.DOUBLE_LITERAL: {
			DoubleLiteral doubleLiteral = (DoubleLiteral) theEObject;
			T result = caseDoubleLiteral(doubleLiteral);
			if (result == null)
				result = caseExpression(doubleLiteral);
			if (result == null)
				result = caseFeature(doubleLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PseudocodePackage.SIZE_EXPRESSION: {
			SizeExpression sizeExpression = (SizeExpression) theEObject;
			T result = caseSizeExpression(sizeExpression);
			if (result == null)
				result = caseExpression(sizeExpression);
			if (result == null)
				result = caseFeature(sizeExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionAdd(CollectionAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionRemove(CollectionRemove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExchange(ValueExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Litteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Litteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetLitteral(SetLitteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Litteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Litteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLitteral(ListLitteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionAccessor(CollectionAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndOrExpression(AndOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Or Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Or Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiOrDiv(MultiOrDiv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanNegation(BooleanNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Signed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Signed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticSigned(ArithmeticSigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesizedExpression(ParenthesizedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableReference(VariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleLiteral(DoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeExpression(SizeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PseudocodeSwitch
