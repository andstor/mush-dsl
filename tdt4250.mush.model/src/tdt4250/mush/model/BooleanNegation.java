/**
 */
package tdt4250.mush.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.BooleanNegation#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see tdt4250.mush.model.MushPackage#getBooleanNegation()
 * @model
 * @generated
 */
public interface BooleanNegation extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see tdt4250.mush.model.MushPackage#getBooleanNegation_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.BooleanNegation#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // BooleanNegation
