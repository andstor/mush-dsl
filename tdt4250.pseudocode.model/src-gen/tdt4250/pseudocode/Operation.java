/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tdt4250.pseudocode.Operation#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link tdt4250.pseudocode.Operation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Member {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' reference.
	 * @see #setExceptions(PseudoType)
	 * @see tdt4250.pseudocode.PseudocodePackage#getOperation_Exceptions()
	 * @model
	 * @generated
	 */
	PseudoType getExceptions();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Operation#getExceptions <em>Exceptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exceptions</em>' reference.
	 * @see #getExceptions()
	 * @generated
	 */
	void setExceptions(PseudoType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see tdt4250.pseudocode.PseudocodePackage#getOperation_Body()
	 * @model containment="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Operation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

} // Operation
