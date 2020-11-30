/**
 */
package tdt4250.pseudocode.tests;

import junit.textui.TestRunner;

import tdt4250.pseudocode.Method;
import tdt4250.pseudocode.PseudocodeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodTest.class);
	}

	/**
	 * Constructs a new Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Method getFixture() {
		return (Method) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PseudocodeFactory.eINSTANCE.createMethod());
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

} //MethodTest
