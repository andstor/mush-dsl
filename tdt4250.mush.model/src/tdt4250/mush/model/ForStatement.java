/**
 */
package tdt4250.mush.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.ForStatement#getFrom <em>From</em>}</li>
 *   <li>{@link tdt4250.mush.model.ForStatement#getTo <em>To</em>}</li>
 *   <li>{@link tdt4250.mush.model.ForStatement#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see tdt4250.mush.model.MushPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see tdt4250.mush.model.MushPackage#getForStatement_From()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.ForStatement#getFrom <em>From</em>}' containment reference.
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
	 * @see tdt4250.mush.model.MushPackage#getForStatement_To()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTo();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.ForStatement#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Expression value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.mush.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see tdt4250.mush.model.MushPackage#getForStatement_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getBlock();

} // ForStatement
