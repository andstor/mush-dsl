/**
 */
package tdt4250.pseudocode.tests;

import junit.textui.TestRunner;

import tdt4250.pseudocode.PseudoInterface;
import tdt4250.pseudocode.PseudocodeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pseudo Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PseudoInterfaceTest extends PseudoTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PseudoInterfaceTest.class);
	}

	/**
	 * Constructs a new Pseudo Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pseudo Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PseudoInterface getFixture() {
		return (PseudoInterface) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PseudocodeFactory.eINSTANCE.createPseudoInterface());
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

} //PseudoInterfaceTest
