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

import tdt4250.pseudocode.Expression;
import tdt4250.pseudocode.Feature;
import tdt4250.pseudocode.IfExpression;
import tdt4250.pseudocode.PseudocodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.impl.IfExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.IfExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.IfExpressionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.IfExpressionImpl#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfExpressionImpl extends StatementImpl implements IfExpression {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> then;

	/**
	 * The cached value of the '{@link #getOtherwise() <em>Otherwise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwise()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> otherwise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PseudocodePackage.Literals.IF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.IF_EXPRESSION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PseudocodePackage.IF_EXPRESSION__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PseudocodePackage.IF_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PseudocodePackage.IF_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.IF_EXPRESSION__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getThen() {
		if (then == null) {
			then = new EObjectContainmentEList<Feature>(Feature.class, this, PseudocodePackage.IF_EXPRESSION__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getOtherwise() {
		if (otherwise == null) {
			otherwise = new EObjectContainmentEList<Feature>(Feature.class, this,
					PseudocodePackage.IF_EXPRESSION__OTHERWISE);
		}
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PseudocodePackage.IF_EXPRESSION__CONDITION:
			return basicSetCondition(null, msgs);
		case PseudocodePackage.IF_EXPRESSION__THEN:
			return ((InternalEList<?>) getThen()).basicRemove(otherEnd, msgs);
		case PseudocodePackage.IF_EXPRESSION__OTHERWISE:
			return ((InternalEList<?>) getOtherwise()).basicRemove(otherEnd, msgs);
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
		case PseudocodePackage.IF_EXPRESSION__NAME:
			return getName();
		case PseudocodePackage.IF_EXPRESSION__CONDITION:
			return getCondition();
		case PseudocodePackage.IF_EXPRESSION__THEN:
			return getThen();
		case PseudocodePackage.IF_EXPRESSION__OTHERWISE:
			return getOtherwise();
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
		case PseudocodePackage.IF_EXPRESSION__NAME:
			setName((String) newValue);
			return;
		case PseudocodePackage.IF_EXPRESSION__CONDITION:
			setCondition((Expression) newValue);
			return;
		case PseudocodePackage.IF_EXPRESSION__THEN:
			getThen().clear();
			getThen().addAll((Collection<? extends Feature>) newValue);
			return;
		case PseudocodePackage.IF_EXPRESSION__OTHERWISE:
			getOtherwise().clear();
			getOtherwise().addAll((Collection<? extends Feature>) newValue);
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
		case PseudocodePackage.IF_EXPRESSION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PseudocodePackage.IF_EXPRESSION__CONDITION:
			setCondition((Expression) null);
			return;
		case PseudocodePackage.IF_EXPRESSION__THEN:
			getThen().clear();
			return;
		case PseudocodePackage.IF_EXPRESSION__OTHERWISE:
			getOtherwise().clear();
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
		case PseudocodePackage.IF_EXPRESSION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PseudocodePackage.IF_EXPRESSION__CONDITION:
			return condition != null;
		case PseudocodePackage.IF_EXPRESSION__THEN:
			return then != null && !then.isEmpty();
		case PseudocodePackage.IF_EXPRESSION__OTHERWISE:
			return otherwise != null && !otherwise.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IfExpressionImpl
