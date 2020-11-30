/**
 */
package tdt4250.pseudocode.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.pseudocode.Member;
import tdt4250.pseudocode.PseudocodeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberTest extends TestCase {

	/**
	 * The fixture for this Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Member fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemberTest.class);
	}

	/**
	 * Constructs a new Member test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Member fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Member getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PseudocodeFactory.eINSTANCE.createMember());
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

} //MemberTest
