/**
 */
package tdt4250.pseudocode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Or Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.MultiOrDiv#getLeft <em>Left</em>}</li>
 *   <li>{@link tdt4250.pseudocode.MultiOrDiv#getOp <em>Op</em>}</li>
 *   <li>{@link tdt4250.pseudocode.MultiOrDiv#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getMultiOrDiv()
 * @model
 * @generated
 */
public interface MultiOrDiv extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getMultiOrDiv_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.MultiOrDiv#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see tdt4250.pseudocode.PseudocodePackage#getMultiOrDiv_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.MultiOrDiv#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see tdt4250.pseudocode.PseudocodePackage#getMultiOrDiv_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.MultiOrDiv#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // MultiOrDiv
