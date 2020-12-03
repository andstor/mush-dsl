/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.ValueExchange#getCollection <em>Collection</em>}</li>
 *   <li>{@link tdt4250.pseudocode.ValueExchange#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getValueExchange()
 * @model
 * @generated
 */
public interface ValueExchange extends Expression {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getValueExchange_Collection()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCollection();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.ValueExchange#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Expression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getValueExchange_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.ValueExchange#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // ValueExchange
