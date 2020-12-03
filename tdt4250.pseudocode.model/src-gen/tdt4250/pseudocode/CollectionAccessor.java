/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.CollectionAccessor#getCollection <em>Collection</em>}</li>
 *   <li>{@link tdt4250.pseudocode.CollectionAccessor#getAccessor <em>Accessor</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionAccessor()
 * @model
 * @generated
 */
public interface CollectionAccessor extends Expression {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Variable)
	 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionAccessor_Collection()
	 * @model
	 * @generated
	 */
	Variable getCollection();

	/**
	 * Sets the value of the '{@link tdt4250.pseudocode.CollectionAccessor#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Variable value);

	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getCollectionAccessor_Accessor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getAccessor();

} // CollectionAccessor
