/**
 */
package org.polarsys.time4sys.marte.sam;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.sam.SamPackage
 * @generated
 */
public interface SamFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamFactory eINSTANCE = org.polarsys.time4sys.marte.sam.impl.SamFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>End To End Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End To End Flow</em>'.
	 * @generated
	 */
	EndToEndFlow createEndToEndFlow();

	/**
	 * Returns a new object of class '<em>Scheduling Observer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling Observer</em>'.
	 * @generated
	 */
	SchedulingObserver createSchedulingObserver();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SamPackage getSamPackage();

} //SamFactory
