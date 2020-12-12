/**
 */
package tdt4250.mush.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.IfStatement#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.mush.model.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link tdt4250.mush.model.IfStatement#getThen <em>Then</em>}</li>
 *   <li>{@link tdt4250.mush.model.IfStatement#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @see tdt4250.mush.model.MushPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.mush.model.MushPackage#getIfStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.IfStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see tdt4250.mush.model.MushPackage#getIfStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link tdt4250.mush.model.IfStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.mush.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see tdt4250.mush.model.MushPackage#getIfStatement_Then()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getThen();

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.mush.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference list.
	 * @see tdt4250.mush.model.MushPackage#getIfStatement_Otherwise()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getOtherwise();

} // IfStatement
