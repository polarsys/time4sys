/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Notification Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotificationResourceTest extends SoftwareSynchronizationResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotificationResourceTest.class);
	}

	/**
	 * Constructs a new Notification Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Notification Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotificationResource getFixture() {
		return (NotificationResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SrmFactory.eINSTANCE.createNotificationResource());
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

} //NotificationResourceTest
