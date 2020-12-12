/**
 */
package tdt4250.mush.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.CollectionRemove#getCollection <em>Collection</em>}</li>
 *   <li>{@link tdt4250.mush.model.CollectionRemove#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tdt4250.mush.model.MushPackage#getCollectionRemove()
 * @model
 * @generated
 */
public interface CollectionRemove extends Expression {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Variable)
	 * @see tdt4250.mush.model.MushPackage#getCollectionRemove_Collection()
	 * @model
	 * @generated
	 */
	Variable getCollection();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.CollectionRemove#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Variable value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see tdt4250.mush.model.MushPackage#getCollectionRemove_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.CollectionRemove#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // CollectionRemove
