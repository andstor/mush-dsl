/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.ForExpression#getFrom <em>From</em>}</li>
 *   <li>{@link tdt4250.pseudocode.ForExpression#getTo <em>To</em>}</li>
 *   <li>{@link tdt4250.pseudocode.ForExpression#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getForExpression()
 * @model
 * @generated
 */
public interface ForExpression extends Statement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getForExpression_From()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.ForExpression#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getForExpression_To()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTo();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.ForExpression#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Expression value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getForExpression_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getBlock();

} // ForExpression
