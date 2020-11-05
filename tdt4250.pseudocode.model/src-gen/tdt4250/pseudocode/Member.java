/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.Member#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link tdt4250.pseudocode.Member#getType <em>Type</em>}</li>
 *   <li>{@link tdt4250.pseudocode.Member#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.pseudocode.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see tdt4250.pseudocode.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see tdt4250.pseudocode.PseudocodePackage#getMember_Visibility()
	 * @model
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Member#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see tdt4250.pseudocode.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PseudoType)
	 * @see tdt4250.pseudocode.PseudocodePackage#getMember_Type()
	 * @model
	 * @generated
	 */
	PseudoType getType();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Member#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PseudoType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.pseudocode.PseudocodePackage#getMember_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Member
