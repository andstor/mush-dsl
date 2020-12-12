/**
 */
package tdt4250.mush.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.mush.model.CollectionAccessor;
import tdt4250.mush.model.Expression;
import tdt4250.mush.model.MushPackage;
import tdt4250.mush.model.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.impl.CollectionAccessorImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link tdt4250.mush.model.impl.CollectionAccessorImpl#getAccessor <em>Accessor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionAccessorImpl extends ExpressionImpl implements CollectionAccessor {
	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected Variable collection;

	/**
	 * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> accessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionAccessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MushPackage.Literals.COLLECTION_ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject)collection;
			collection = (Variable)eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MushPackage.COLLECTION_ACCESSOR__COLLECTION, oldCollection, collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(Variable newCollection) {
		Variable oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MushPackage.COLLECTION_ACCESSOR__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getAccessor() {
		if (accessor == null) {
			accessor = new EObjectContainmentEList<Expression>(Expression.class, this, MushPackage.COLLECTION_ACCESSOR__ACCESSOR);
		}
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MushPackage.COLLECTION_ACCESSOR__ACCESSOR:
				return ((InternalEList<?>)getAccessor()).basicRemove(otherEnd, msgs);
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
			case MushPackage.COLLECTION_ACCESSOR__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case MushPackage.COLLECTION_ACCESSOR__ACCESSOR:
				return getAccessor();
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
			case MushPackage.COLLECTION_ACCESSOR__COLLECTION:
				setCollection((Variable)newValue);
				return;
			case MushPackage.COLLECTION_ACCESSOR__ACCESSOR:
				getAccessor().clear();
				getAccessor().addAll((Collection<? extends Expression>)newValue);
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
			case MushPackage.COLLECTION_ACCESSOR__COLLECTION:
				setCollection((Variable)null);
				return;
			case MushPackage.COLLECTION_ACCESSOR__ACCESSOR:
				getAccessor().clear();
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
			case MushPackage.COLLECTION_ACCESSOR__COLLECTION:
				return collection != null;
			case MushPackage.COLLECTION_ACCESSOR__ACCESSOR:
				return accessor != null && !accessor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectionAccessorImpl
