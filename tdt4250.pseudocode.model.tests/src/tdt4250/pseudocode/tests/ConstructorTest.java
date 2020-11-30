/**
 */
package tdt4250.pseudocode.tests;

import junit.textui.TestRunner;

import tdt4250.pseudocode.Constructor;
import tdt4250.pseudocode.PseudocodeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructorTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstructorTest.class);
	}

	/**
	 * Constructs a new Constructor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Constructor getFixture() {
		return (Constructor) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PseudocodeFactory.eINSTANCE.createConstructor());
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

} //ConstructorTest
