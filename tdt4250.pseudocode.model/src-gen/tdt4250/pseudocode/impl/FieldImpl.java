/**
 */
package tdt4250.pseudocode.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tdt4250.pseudocode.Expression;
import tdt4250.pseudocode.Field;
import tdt4250.pseudocode.PseudocodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.impl.FieldImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MemberImpl implements Field {
	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Expression initializer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PseudocodePackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getInitializer() {
		if (initializer != null && initializer.eIsProxy()) {
			InternalEObject oldInitializer = (InternalEObject) initializer;
			initializer = (Expression) eResolveProxy(oldInitializer);
			if (initializer != oldInitializer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PseudocodePackage.FIELD__INITIALIZER,
							oldInitializer, initializer));
			}
		}
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializer(Expression newInitializer) {
		Expression oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.FIELD__INITIALIZER, oldInitializer,
					initializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PseudocodePackage.FIELD__INITIALIZER:
			if (resolve)
				return getInitializer();
			return basicGetInitializer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PseudocodePackage.FIELD__INITIALIZER:
			setInitializer((Expression) newValue);
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
		case PseudocodePackage.FIELD__INITIALIZER:
			setInitializer((Expression) null);
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
		case PseudocodePackage.FIELD__INITIALIZER:
			return initializer != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldImpl
