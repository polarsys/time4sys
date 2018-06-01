/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *      Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.odesign.OdesignFactory
 * @model kind="package"
 * @generated
 */
public interface OdesignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "odesign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/siriusdesign/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odesign";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OdesignPackage eINSTANCE = org.polarsys.time4sys.odesign.impl.OdesignPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.odesign.impl.UtilizationStatImpl <em>Utilization Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.odesign.impl.UtilizationStatImpl
	 * @see org.polarsys.time4sys.odesign.impl.OdesignPackageImpl#getUtilizationStat()
	 * @generated
	 */
	int UTILIZATION_STAT = 0;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_STAT__UTILIZATION = 0;

	/**
	 * The feature id for the '<em><b>Not Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_STAT__NOT_SCHEDULABLE = 1;

	/**
	 * The feature id for the '<em><b>Maybe Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_STAT__MAYBE_SCHEDULABLE = 2;

	/**
	 * The feature id for the '<em><b>Is Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_STAT__IS_SCHEDULABLE = 3;

	/**
	 * The number of structural features of the '<em>Utilization Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_STAT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Utilization Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_STAT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.odesign.UtilizationStat <em>Utilization Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilization Stat</em>'.
	 * @see org.polarsys.time4sys.odesign.UtilizationStat
	 * @generated
	 */
	EClass getUtilizationStat();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.odesign.UtilizationStat#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see org.polarsys.time4sys.odesign.UtilizationStat#getUtilization()
	 * @see #getUtilizationStat()
	 * @generated
	 */
	EAttribute getUtilizationStat_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.odesign.UtilizationStat#isNotSchedulable <em>Not Schedulable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Schedulable</em>'.
	 * @see org.polarsys.time4sys.odesign.UtilizationStat#isNotSchedulable()
	 * @see #getUtilizationStat()
	 * @generated
	 */
	EAttribute getUtilizationStat_NotSchedulable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.odesign.UtilizationStat#isMaybeSchedulable <em>Maybe Schedulable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maybe Schedulable</em>'.
	 * @see org.polarsys.time4sys.odesign.UtilizationStat#isMaybeSchedulable()
	 * @see #getUtilizationStat()
	 * @generated
	 */
	EAttribute getUtilizationStat_MaybeSchedulable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.odesign.UtilizationStat#isIsSchedulable <em>Is Schedulable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Schedulable</em>'.
	 * @see org.polarsys.time4sys.odesign.UtilizationStat#isIsSchedulable()
	 * @see #getUtilizationStat()
	 * @generated
	 */
	EAttribute getUtilizationStat_IsSchedulable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OdesignFactory getOdesignFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.odesign.impl.UtilizationStatImpl <em>Utilization Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.odesign.impl.UtilizationStatImpl
		 * @see org.polarsys.time4sys.odesign.impl.OdesignPackageImpl#getUtilizationStat()
		 * @generated
		 */
		EClass UTILIZATION_STAT = eINSTANCE.getUtilizationStat();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_STAT__UTILIZATION = eINSTANCE.getUtilizationStat_Utilization();

		/**
		 * The meta object literal for the '<em><b>Not Schedulable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_STAT__NOT_SCHEDULABLE = eINSTANCE.getUtilizationStat_NotSchedulable();

		/**
		 * The meta object literal for the '<em><b>Maybe Schedulable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_STAT__MAYBE_SCHEDULABLE = eINSTANCE.getUtilizationStat_MaybeSchedulable();

		/**
		 * The meta object literal for the '<em><b>Is Schedulable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION_STAT__IS_SCHEDULABLE = eINSTANCE.getUtilizationStat_IsSchedulable();

	}

} //OdesignPackage
