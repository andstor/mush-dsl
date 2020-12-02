/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.Condition#isNegation <em>Negation</em>}</li>
 *   <li>{@link tdt4250.pseudocode.Condition#getBooleanExpression <em>Boolean Expression</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negation</em>' attribute.
	 * @see #setNegation(boolean)
	 * @see tdt4250.pseudocode.PseudocodePackage#getCondition_Negation()
	 * @model
	 * @generated
	 */
	boolean isNegation();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Condition#isNegation <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negation</em>' attribute.
	 * @see #isNegation()
	 * @generated
	 */
	void setNegation(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #setBooleanExpression(BooleanExpression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getCondition_BooleanExpression()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpression getBooleanExpression();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.Condition#getBooleanExpression <em>Boolean Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #getBooleanExpression()
	 * @generated
	 */
	void setBooleanExpression(BooleanExpression value);

} // Condition
