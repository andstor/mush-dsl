/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.Field#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member {
	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' reference.
	 * @see #setInitializer(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getField_Initializer()
	 * @model
	 * @generated
	 */
	Expression getInitializer();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Field#getInitializer <em>Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Expression value);

} // Field
