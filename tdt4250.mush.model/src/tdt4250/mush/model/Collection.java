/**
 */
package tdt4250.mush.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.mush.model.Collection#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see tdt4250.mush.model.MushPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends Expression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.mush.model.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see tdt4250.mush.model.MushPackage#getCollection_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getElements();

} // Collection
