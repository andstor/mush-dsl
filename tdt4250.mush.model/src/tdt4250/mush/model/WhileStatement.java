/**
 */
package tdt4250.mush.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.WhileStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link tdt4250.mush.model.WhileStatement#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see tdt4250.mush.model.MushPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see tdt4250.mush.model.MushPackage#getWhileStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.WhileStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.mush.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see tdt4250.mush.model.MushPackage#getWhileStatement_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getBlock();

} // WhileStatement
