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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.pseudocode.Member;
import tdt4250.pseudocode.PseudoPackage;
import tdt4250.pseudocode.PseudoType;
import tdt4250.pseudocode.PseudocodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudo Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.impl.PseudoTypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.PseudoTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.PseudoTypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PseudoTypeImpl extends MemberImpl implements PseudoType {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PseudoType> superTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PseudocodePackage.Literals.PSEUDO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, PseudocodePackage.PSEUDO_TYPE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PseudoType> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<PseudoType>(PseudoType.class, this,
					PseudocodePackage.PSEUDO_TYPE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PseudoPackage getPackage() {
		if (eContainerFeatureID() != PseudocodePackage.PSEUDO_TYPE__PACKAGE)
			return null;
		return (PseudoPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PseudoPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPackage, PseudocodePackage.PSEUDO_TYPE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(PseudoPackage newPackage) {
		if (newPackage != eInternalContainer()
				|| (eContainerFeatureID() != PseudocodePackage.PSEUDO_TYPE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject) newPackage).eInverseAdd(this, PseudocodePackage.PSEUDO_PACKAGE__TYPES,
						PseudoPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.PSEUDO_TYPE__PACKAGE, newPackage,
					newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PseudocodePackage.PSEUDO_TYPE__PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPackage((PseudoPackage) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PseudocodePackage.PSEUDO_TYPE__MEMBERS:
			return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
		case PseudocodePackage.PSEUDO_TYPE__PACKAGE:
			return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PseudocodePackage.PSEUDO_TYPE__PACKAGE:
			return eInternalContainer().eInverseRemove(this, PseudocodePackage.PSEUDO_PACKAGE__TYPES,
					PseudoPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PseudocodePackage.PSEUDO_TYPE__MEMBERS:
			return getMembers();
		case PseudocodePackage.PSEUDO_TYPE__SUPER_TYPES:
			return getSuperTypes();
		case PseudocodePackage.PSEUDO_TYPE__PACKAGE:
			return getPackage();
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
		case PseudocodePackage.PSEUDO_TYPE__MEMBERS:
			getMembers().clear();
			getMembers().addAll((Collection<? extends Member>) newValue);
			return;
		case PseudocodePackage.PSEUDO_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection<? extends PseudoType>) newValue);
			return;
		case PseudocodePackage.PSEUDO_TYPE__PACKAGE:
			setPackage((PseudoPackage) newValue);
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
		case PseudocodePackage.PSEUDO_TYPE__MEMBERS:
			getMembers().clear();
			return;
		case PseudocodePackage.PSEUDO_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			return;
		case PseudocodePackage.PSEUDO_TYPE__PACKAGE:
			setPackage((PseudoPackage) null);
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
		case PseudocodePackage.PSEUDO_TYPE__MEMBERS:
			return members != null && !members.isEmpty();
		case PseudocodePackage.PSEUDO_TYPE__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		case PseudocodePackage.PSEUDO_TYPE__PACKAGE:
			return getPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //PseudoTypeImpl
