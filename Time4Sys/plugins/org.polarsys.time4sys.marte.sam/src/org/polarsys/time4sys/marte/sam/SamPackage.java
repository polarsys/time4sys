/**
 */
package org.polarsys.time4sys.marte.sam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

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
 * @see org.polarsys.time4sys.marte.sam.SamFactory
 * @model kind="package"
 * @generated
 */
public interface SamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/sam/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamPackage eINSTANCE = org.polarsys.time4sys.marte.sam.impl.SamPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.sam.impl.EndToEndFlowImpl <em>End To End Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.sam.impl.EndToEndFlowImpl
	 * @see org.polarsys.time4sys.marte.sam.impl.SamPackageImpl#getEndToEndFlow()
	 * @generated
	 */
	int END_TO_END_FLOW = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__EANNOTATIONS = CoreElementsPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__NAME = CoreElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__OWNER = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End To End Stimuli</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_STIMULI = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End To End Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_SCENARIO = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__IS_SCHEDULABLE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schedulability Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__SCHEDULABILITY_SLACK = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End To End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_TIME = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End To End Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_DEADLINE = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__TIMING = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>End To End Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_FEATURE_COUNT = CoreElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW___GET_EANNOTATION__STRING = CoreElementsPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Find Steps On Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW___FIND_STEPS_ON_PATH = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>End To End Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_OPERATION_COUNT = CoreElementsPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.sam.impl.SchedulingObserverImpl <em>Scheduling Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.sam.impl.SchedulingObserverImpl
	 * @see org.polarsys.time4sys.marte.sam.impl.SamPackageImpl#getSchedulingObserver()
	 * @generated
	 */
	int SCHEDULING_OBSERVER = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__EANNOTATIONS = GqamPackage.TIMED_OBSERVER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__NAME = GqamPackage.TIMED_OBSERVER__NAME;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__CONSTRAINED_ELEMENT = GqamPackage.TIMED_OBSERVER__CONSTRAINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__CONTEXT = GqamPackage.TIMED_OBSERVER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__KIND = GqamPackage.TIMED_OBSERVER__KIND;

	/**
	 * The feature id for the '<em><b>Laxity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__LAXITY = GqamPackage.TIMED_OBSERVER__LAXITY;

	/**
	 * The feature id for the '<em><b>Suspensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__SUSPENSIONS = GqamPackage.TIMED_OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__BLOCKING_TIME = GqamPackage.TIMED_OBSERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overlaps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER__OVERLAPS = GqamPackage.TIMED_OBSERVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scheduling Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER_FEATURE_COUNT = GqamPackage.TIMED_OBSERVER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER___GET_EANNOTATION__STRING = GqamPackage.TIMED_OBSERVER___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Scheduling Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_OBSERVER_OPERATION_COUNT = GqamPackage.TIMED_OBSERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>NFP Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @see org.polarsys.time4sys.marte.sam.impl.SamPackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 2;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow <em>End To End Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End To End Flow</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow
	 * @generated
	 */
	EClass getEndToEndFlow();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndStimuli <em>End To End Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End To End Stimuli</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndStimuli()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EReference getEndToEndFlow_EndToEndStimuli();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndScenario <em>End To End Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End To End Scenario</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndScenario()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EReference getEndToEndFlow_EndToEndScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#isIsSchedulable <em>Is Schedulable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Schedulable</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#isIsSchedulable()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_IsSchedulable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getSchedulabilitySlack <em>Schedulability Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedulability Slack</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#getSchedulabilitySlack()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_SchedulabilitySlack();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndTime <em>End To End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End To End Time</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndTime()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_EndToEndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndDeadline <em>End To End Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End To End Deadline</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndDeadline()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_EndToEndDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing</em>'.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#getTiming()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EReference getEndToEndFlow_Timing();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#findStepsOnPath() <em>Find Steps On Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Steps On Path</em>' operation.
	 * @see org.polarsys.time4sys.marte.sam.EndToEndFlow#findStepsOnPath()
	 * @generated
	 */
	EOperation getEndToEndFlow__FindStepsOnPath();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.sam.SchedulingObserver <em>Scheduling Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Observer</em>'.
	 * @see org.polarsys.time4sys.marte.sam.SchedulingObserver
	 * @generated
	 */
	EClass getSchedulingObserver();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getSuspensions <em>Suspensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspensions</em>'.
	 * @see org.polarsys.time4sys.marte.sam.SchedulingObserver#getSuspensions()
	 * @see #getSchedulingObserver()
	 * @generated
	 */
	EAttribute getSchedulingObserver_Suspensions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking Time</em>'.
	 * @see org.polarsys.time4sys.marte.sam.SchedulingObserver#getBlockingTime()
	 * @see #getSchedulingObserver()
	 * @generated
	 */
	EAttribute getSchedulingObserver_BlockingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.sam.SchedulingObserver#getOverlaps <em>Overlaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlaps</em>'.
	 * @see org.polarsys.time4sys.marte.sam.SchedulingObserver#getOverlaps()
	 * @see #getSchedulingObserver()
	 * @generated
	 */
	EAttribute getSchedulingObserver_Overlaps();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.time4sys.marte.nfp.Duration <em>NFP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NFP Duration</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @model instanceClass="org.polarsys.time4sys.marte.nfp.Duration"
	 * @generated
	 */
	EDataType getNFP_Duration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SamFactory getSamFactory();

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
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.sam.impl.EndToEndFlowImpl <em>End To End Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.sam.impl.EndToEndFlowImpl
		 * @see org.polarsys.time4sys.marte.sam.impl.SamPackageImpl#getEndToEndFlow()
		 * @generated
		 */
		EClass END_TO_END_FLOW = eINSTANCE.getEndToEndFlow();

		/**
		 * The meta object literal for the '<em><b>End To End Stimuli</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW__END_TO_END_STIMULI = eINSTANCE.getEndToEndFlow_EndToEndStimuli();

		/**
		 * The meta object literal for the '<em><b>End To End Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW__END_TO_END_SCENARIO = eINSTANCE.getEndToEndFlow_EndToEndScenario();

		/**
		 * The meta object literal for the '<em><b>Is Schedulable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__IS_SCHEDULABLE = eINSTANCE.getEndToEndFlow_IsSchedulable();

		/**
		 * The meta object literal for the '<em><b>Schedulability Slack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__SCHEDULABILITY_SLACK = eINSTANCE.getEndToEndFlow_SchedulabilitySlack();

		/**
		 * The meta object literal for the '<em><b>End To End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__END_TO_END_TIME = eINSTANCE.getEndToEndFlow_EndToEndTime();

		/**
		 * The meta object literal for the '<em><b>End To End Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__END_TO_END_DEADLINE = eINSTANCE.getEndToEndFlow_EndToEndDeadline();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW__TIMING = eINSTANCE.getEndToEndFlow_Timing();

		/**
		 * The meta object literal for the '<em><b>Find Steps On Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation END_TO_END_FLOW___FIND_STEPS_ON_PATH = eINSTANCE.getEndToEndFlow__FindStepsOnPath();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.sam.impl.SchedulingObserverImpl <em>Scheduling Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.sam.impl.SchedulingObserverImpl
		 * @see org.polarsys.time4sys.marte.sam.impl.SamPackageImpl#getSchedulingObserver()
		 * @generated
		 */
		EClass SCHEDULING_OBSERVER = eINSTANCE.getSchedulingObserver();

		/**
		 * The meta object literal for the '<em><b>Suspensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_OBSERVER__SUSPENSIONS = eINSTANCE.getSchedulingObserver_Suspensions();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_OBSERVER__BLOCKING_TIME = eINSTANCE.getSchedulingObserver_BlockingTime();

		/**
		 * The meta object literal for the '<em><b>Overlaps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_OBSERVER__OVERLAPS = eINSTANCE.getSchedulingObserver_Overlaps();

		/**
		 * The meta object literal for the '<em>NFP Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.Duration
		 * @see org.polarsys.time4sys.marte.sam.impl.SamPackageImpl#getNFP_Duration()
		 * @generated
		 */
		EDataType NFP_DURATION = eINSTANCE.getNFP_Duration();

	}

} //SamPackage
