/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.Variable#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Statement {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getVariable_Expressions()
	 * @model
	 * @generated
	 */
	EList<Expression> getExpressions();

} // Variable
