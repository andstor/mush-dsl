/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tdt4250.pseudocode.Function#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Identifier {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getParameters();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getFunction_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Function
