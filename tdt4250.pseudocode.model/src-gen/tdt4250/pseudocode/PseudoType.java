/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.PseudoType#getMembers <em>Members</em>}</li>
 *   <li>{@link tdt4250.pseudocode.PseudoType#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link tdt4250.pseudocode.PseudoType#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getPseudoType()
 * @model abstract="true"
 * @generated
 */
public interface PseudoType extends Member {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getPseudoType_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.PseudoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getPseudoType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<PseudoType> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.pseudocode.PseudoPackage#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(PseudoPackage)
	 * @see tdt4250.pseudocode.PseudocodePackage#getPseudoType_Package()
	 * @see tdt4250.pseudocode.PseudoPackage#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	PseudoPackage getPackage();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.PseudoType#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PseudoPackage value);

} // PseudoType
