/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.IfExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link tdt4250.pseudocode.IfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link tdt4250.pseudocode.IfExpression#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getIfExpression_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.IfExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getIfExpression_Then()
	 * @model containment="true"
	 * @generated
	 */
	Expression getThen();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.IfExpression#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Expression value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getIfExpression_Else()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElse();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.IfExpression#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Expression value);

} // IfExpression
