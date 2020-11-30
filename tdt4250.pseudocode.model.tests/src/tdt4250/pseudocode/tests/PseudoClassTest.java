/**
 */
package tdt4250.pseudocode.tests;

import junit.textui.TestRunner;

import tdt4250.pseudocode.PseudoClass;
import tdt4250.pseudocode.PseudocodeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pseudo Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PseudoClassTest extends PseudoTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PseudoClassTest.class);
	}

	/**
	 * Constructs a new Pseudo Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pseudo Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PseudoClass getFixture() {
		return (PseudoClass) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PseudocodeFactory.eINSTANCE.createPseudoClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PseudoClassTest
