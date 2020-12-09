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
import tdt4250.pseudocode.CollectionSet;
import tdt4250.pseudocode.Expression;
import tdt4250.pseudocode.PseudocodePackage;
import tdt4250.pseudocode.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.impl.CollectionSetImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.CollectionSetImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link tdt4250.pseudocode.impl.CollectionSetImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionSetImpl extends ExpressionImpl implements CollectionSet {
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
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Expression right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PseudocodePackage.Literals.COLLECTION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject) collection;
			collection = (Variable) eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PseudocodePackage.COLLECTION_SET__COLLECTION, oldCollection, collection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.COLLECTION_SET__COLLECTION,
					oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList<Expression>(Expression.class, this,
					PseudocodePackage.COLLECTION_SET__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		Expression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PseudocodePackage.COLLECTION_SET__RIGHT, oldRight, newRight);
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
	public void setRight(Expression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PseudocodePackage.COLLECTION_SET__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PseudocodePackage.COLLECTION_SET__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PseudocodePackage.COLLECTION_SET__RIGHT, newRight,
					newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PseudocodePackage.COLLECTION_SET__LEFT:
			return ((InternalEList<?>) getLeft()).basicRemove(otherEnd, msgs);
		case PseudocodePackage.COLLECTION_SET__RIGHT:
			return basicSetRight(null, msgs);
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
		case PseudocodePackage.COLLECTION_SET__COLLECTION:
			if (resolve)
				return getCollection();
			return basicGetCollection();
		case PseudocodePackage.COLLECTION_SET__LEFT:
			return getLeft();
		case PseudocodePackage.COLLECTION_SET__RIGHT:
			return getRight();
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
		case PseudocodePackage.COLLECTION_SET__COLLECTION:
			setCollection((Variable) newValue);
			return;
		case PseudocodePackage.COLLECTION_SET__LEFT:
			getLeft().clear();
			getLeft().addAll((Collection<? extends Expression>) newValue);
			return;
		case PseudocodePackage.COLLECTION_SET__RIGHT:
			setRight((Expression) newValue);
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
		case PseudocodePackage.COLLECTION_SET__COLLECTION:
			setCollection((Variable) null);
			return;
		case PseudocodePackage.COLLECTION_SET__LEFT:
			getLeft().clear();
			return;
		case PseudocodePackage.COLLECTION_SET__RIGHT:
			setRight((Expression) null);
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
		case PseudocodePackage.COLLECTION_SET__COLLECTION:
			return collection != null;
		case PseudocodePackage.COLLECTION_SET__LEFT:
			return left != null && !left.isEmpty();
		case PseudocodePackage.COLLECTION_SET__RIGHT:
			return right != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionSetImpl
