/**
 */
package tdt4250.pseudocode.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tdt4250.pseudocode.BooleanExpression;
import tdt4250.pseudocode.Condition;
import tdt4250.pseudocode.PseudocodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.impl.ConditionImpl#isNegation <em>Negation</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.ConditionImpl#getBooleanExpression <em>Boolean Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends BooleanExpressionImpl implements Condition {
	/**
	 * The default value of the '{@link #isNegation() <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegation() <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegation()
	 * @generated
	 * @ordered
	 */
	protected boolean negation = NEGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooleanExpression() <em>Boolean Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression booleanExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PseudocodePackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNegation() {
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegation(boolean newNegation) {
		boolean oldNegation = negation;
		negation = newNegation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.CONDITION__NEGATION, oldNegation,
					negation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpression getBooleanExpression() {
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanExpression(BooleanExpression newBooleanExpression, NotificationChain msgs) {
		BooleanExpression oldBooleanExpression = booleanExpression;
		booleanExpression = newBooleanExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION, oldBooleanExpression, newBooleanExpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanExpression(BooleanExpression newBooleanExpression) {
		if (newBooleanExpression != booleanExpression) {
			NotificationChain msgs = null;
			if (booleanExpression != null)
				msgs = ((InternalEObject) booleanExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION, null, msgs);
			if (newBooleanExpression != null)
				msgs = ((InternalEObject) newBooleanExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION, null, msgs);
			msgs = basicSetBooleanExpression(newBooleanExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION,
					newBooleanExpression, newBooleanExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION:
			return basicSetBooleanExpression(null, msgs);
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
		case PseudocodePackage.CONDITION__NEGATION:
			return isNegation();
		case PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION:
			return getBooleanExpression();
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
		case PseudocodePackage.CONDITION__NEGATION:
			setNegation((Boolean) newValue);
			return;
		case PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION:
			setBooleanExpression((BooleanExpression) newValue);
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
		case PseudocodePackage.CONDITION__NEGATION:
			setNegation(NEGATION_EDEFAULT);
			return;
		case PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION:
			setBooleanExpression((BooleanExpression) null);
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
		case PseudocodePackage.CONDITION__NEGATION:
			return negation != NEGATION_EDEFAULT;
		case PseudocodePackage.CONDITION__BOOLEAN_EXPRESSION:
			return booleanExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (negation: ");
		result.append(negation);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
