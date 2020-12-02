/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.VariableReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Variable)
	 * @see tdt4250.pseudocode.PseudocodePackage#getVariableReference_Ref()
	 * @model
	 * @generated
	 */
	Variable getRef();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.VariableReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Variable value);

} // VariableReference
