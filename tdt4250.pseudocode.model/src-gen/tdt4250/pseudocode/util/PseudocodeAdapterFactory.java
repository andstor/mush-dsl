/**
 */
package tdt4250.pseudocode.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tdt4250.pseudocode.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250.pseudocode.PseudocodePackage
 * @generated
 */
public class PseudocodeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PseudocodePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudocodeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PseudocodePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudocodeSwitch<Adapter> modelSwitch = new PseudocodeSwitch<Adapter>() {
		@Override
		public Adapter casePseudoType(PseudoType object) {
			return createPseudoTypeAdapter();
		}

		@Override
		public Adapter casePseudoClass(PseudoClass object) {
			return createPseudoClassAdapter();
		}

		@Override
		public Adapter casePseudoInterface(PseudoInterface object) {
			return createPseudoInterfaceAdapter();
		}

		@Override
		public Adapter caseMember(Member object) {
			return createMemberAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseMethod(Method object) {
			return createMethodAdapter();
		}

		@Override
		public Adapter caseConstructor(Constructor object) {
			return createConstructorAdapter();
		}

		@Override
		public Adapter casePseudoPackage(PseudoPackage object) {
			return createPseudoPackageAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.PseudoType <em>Pseudo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.PseudoType
	 * @generated
	 */
	public Adapter createPseudoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.PseudoClass <em>Pseudo Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.PseudoClass
	 * @generated
	 */
	public Adapter createPseudoClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.PseudoInterface <em>Pseudo Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.PseudoInterface
	 * @generated
	 */
	public Adapter createPseudoInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.pseudocode.PseudoPackage <em>Pseudo Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.pseudocode.PseudoPackage
	 * @generated
	 */
	public Adapter createPseudoPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PseudocodeAdapterFactory
