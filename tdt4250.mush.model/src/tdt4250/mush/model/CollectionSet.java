/**
 */
package tdt4250.mush.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.CollectionSet#getCollection <em>Collection</em>}</li>
 *   <li>{@link tdt4250.mush.model.CollectionSet#getLeft <em>Left</em>}</li>
 *   <li>{@link tdt4250.mush.model.CollectionSet#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see tdt4250.mush.model.MushPackage#getCollectionSet()
 * @model
 * @generated
 */
public interface CollectionSet extends Expression {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Variable)
	 * @see tdt4250.mush.model.MushPackage#getCollectionSet_Collection()
	 * @model
	 * @generated
	 */
	Variable getCollection();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.CollectionSet#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Variable value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.mush.model.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see tdt4250.mush.model.MushPackage#getCollectionSet_Left()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Expression> getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see tdt4250.mush.model.MushPackage#getCollectionSet_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.CollectionSet#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // CollectionSet
