/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Find Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.CollectionFindSize#getCollection <em>Collection</em>}</li>
 *   <li>{@link tdt4250.pseudocode.CollectionFindSize#getLeft <em>Left</em>}</li>
 *   <li>{@link tdt4250.pseudocode.CollectionFindSize#getOp <em>Op</em>}</li>
 *   <li>{@link tdt4250.pseudocode.CollectionFindSize#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionFindSize()
 * @model
 * @generated
 */
public interface CollectionFindSize extends Expression {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Variable)
	 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionFindSize_Collection()
	 * @model
	 * @generated
	 */
	Variable getCollection();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.CollectionFindSize#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Variable value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Variable)
	 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionFindSize_Left()
	 * @model containment="true"
	 * @generated
	 */
	Variable getLeft();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.CollectionFindSize#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Variable value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionFindSize_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.CollectionFindSize#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Variable)
	 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionFindSize_Right()
	 * @model containment="true"
	 * @generated
	 */
	Variable getRight();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.CollectionFindSize#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Variable value);

} // CollectionFindSize
