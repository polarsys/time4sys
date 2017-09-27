/**
 */
package org.polarsys.time4sys.marte.srm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Memory Partition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryPartitionTest extends SoftwareResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemoryPartitionTest.class);
	}

	/**
	 * Constructs a new Memory Partition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPartitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Memory Partition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MemoryPartition getFixture() {
		return (MemoryPartition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SrmFactory.eINSTANCE.createMemoryPartition());
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

} //MemoryPartitionTest
