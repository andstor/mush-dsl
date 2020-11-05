/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.PseudoPackage#getTypes <em>Types</em>}</li>
 *   <li>{@link tdt4250.pseudocode.PseudoPackage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getPseudoPackage()
 * @model
 * @generated
 */
public interface PseudoPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.PseudoType}.
	 * It is bidirectional and its opposite is '{@link tdt4250.pseudocode.PseudoType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getPseudoPackage_Types()
	 * @see tdt4250.pseudocode.PseudoType#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<PseudoType> getTypes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.pseudocode.PseudocodePackage#getPseudoPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.PseudoPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PseudoPackage
