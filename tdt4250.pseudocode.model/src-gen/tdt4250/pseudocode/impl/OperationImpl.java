/**
 */
package tdt4250.pseudocode.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.pseudocode.Operation;
import tdt4250.pseudocode.Parameter;
import tdt4250.pseudocode.PseudoType;
import tdt4250.pseudocode.PseudocodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.OperationImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MemberImpl implements Operation {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected PseudoType exceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PseudocodePackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					PseudocodePackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PseudoType getExceptions() {
		if (exceptions != null && exceptions.eIsProxy()) {
			InternalEObject oldExceptions = (InternalEObject) exceptions;
			exceptions = (PseudoType) eResolveProxy(oldExceptions);
			if (exceptions != oldExceptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PseudocodePackage.OPERATION__EXCEPTIONS,
							oldExceptions, exceptions));
			}
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoType basicGetExceptions() {
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptions(PseudoType newExceptions) {
		PseudoType oldExceptions = exceptions;
		exceptions = newExceptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.OPERATION__EXCEPTIONS,
					oldExceptions, exceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PseudocodePackage.OPERATION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PseudocodePackage.OPERATION__PARAMETERS:
			return getParameters();
		case PseudocodePackage.OPERATION__EXCEPTIONS:
			if (resolve)
				return getExceptions();
			return basicGetExceptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PseudocodePackage.OPERATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case PseudocodePackage.OPERATION__EXCEPTIONS:
			setExceptions((PseudoType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PseudocodePackage.OPERATION__PARAMETERS:
			getParameters().clear();
			return;
		case PseudocodePackage.OPERATION__EXCEPTIONS:
			setExceptions((PseudoType) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PseudocodePackage.OPERATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case PseudocodePackage.OPERATION__EXCEPTIONS:
			return exceptions != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
