/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.ComplexType#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.TypeLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getComplexType_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeLiteral> getTypes();

} // ComplexType
