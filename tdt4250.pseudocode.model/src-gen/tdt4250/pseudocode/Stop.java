/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.Stop#getType <em>Type</em>}</li>
 *   <li>{@link tdt4250.pseudocode.Stop#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getStop()
 * @model
 * @generated
 */
public interface Stop extends Statement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see tdt4250.pseudocode.PseudocodePackage#getStop_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Stop#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getStop_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Stop#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // Stop
