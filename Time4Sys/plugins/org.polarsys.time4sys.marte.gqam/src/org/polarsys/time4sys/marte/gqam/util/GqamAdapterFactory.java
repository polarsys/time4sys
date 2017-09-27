/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.gqam.*;
import org.polarsys.time4sys.marte.grm.ConcurrencyResource;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement;
import org.polarsys.time4sys.marte.nfp.coreelements.Constraint;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;
import org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage
 * @generated
 */
public class GqamAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GqamPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqamAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GqamPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GqamSwitch<Adapter> modelSwitch =
		new GqamSwitch<Adapter>() {
			@Override
			public Adapter caseAcquireStep(AcquireStep object) {
				return createAcquireStepAdapter();
			}
			@Override
			public Adapter caseArrivalPattern(ArrivalPattern object) {
				return createArrivalPatternAdapter();
			}
			@Override
			public Adapter caseBehaviorScenario(BehaviorScenario object) {
				return createBehaviorScenarioAdapter();
			}
			@Override
			public Adapter caseBurstPattern(BurstPattern object) {
				return createBurstPatternAdapter();
			}
			@Override
			public Adapter caseClosedPattern(ClosedPattern object) {
				return createClosedPatternAdapter();
			}
			@Override
			public Adapter caseCommunicationChannel(CommunicationChannel object) {
				return createCommunicationChannelAdapter();
			}
			@Override
			public Adapter caseCommunicationStep(CommunicationStep object) {
				return createCommunicationStepAdapter();
			}
			@Override
			public Adapter caseControlPin(ControlPin object) {
				return createControlPinAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseExecutionStep(ExecutionStep object) {
				return createExecutionStepAdapter();
			}
			@Override
			public Adapter caseInputPin(InputPin object) {
				return createInputPinAdapter();
			}
			@Override
			public Adapter caseLatencyObserver(LatencyObserver object) {
				return createLatencyObserverAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseOnce(Once object) {
				return createOnceAdapter();
			}
			@Override
			public Adapter caseOutputPin(OutputPin object) {
				return createOutputPinAdapter();
			}
			@Override
			public Adapter casePeriodicPattern(PeriodicPattern object) {
				return createPeriodicPatternAdapter();
			}
			@Override
			public Adapter casePrecedenceRelation(PrecedenceRelation object) {
				return createPrecedenceRelationAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseReleaseStep(ReleaseStep object) {
				return createReleaseStepAdapter();
			}
			@Override
			public Adapter caseRequestedService(RequestedService object) {
				return createRequestedServiceAdapter();
			}
			@Override
			public Adapter caseResourceServiceExcecution(ResourceServiceExcecution object) {
				return createResourceServiceExcecutionAdapter();
			}
			@Override
			public Adapter caseSlidingWindowPattern(SlidingWindowPattern object) {
				return createSlidingWindowPatternAdapter();
			}
			@Override
			public Adapter caseSporadicPattern(SporadicPattern object) {
				return createSporadicPatternAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseTimedObserver(TimedObserver object) {
				return createTimedObserverAdapter();
			}
			@Override
			public Adapter caseWorkloadBehavior(WorkloadBehavior object) {
				return createWorkloadBehaviorAdapter();
			}
			@Override
			public Adapter caseWorkloadEvent(WorkloadEvent object) {
				return createWorkloadEventAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAnnotatedElement(AnnotatedElement object) {
				return createAnnotatedElementAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter caseResourcePackageableElement(ResourcePackageableElement object) {
				return createResourcePackageableElementAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseConcurrencyResource(ConcurrencyResource object) {
				return createConcurrencyResourceAdapter();
			}
			@Override
			public Adapter caseSchedulableResource(SchedulableResource object) {
				return createSchedulableResourceAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseAnnotation_Constraint(org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint object) {
				return createAnnotation_ConstraintAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario <em>Behavior Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario
	 * @generated
	 */
	public Adapter createBehaviorScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.BurstPattern <em>Burst Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern
	 * @generated
	 */
	public Adapter createBurstPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.ClosedPattern <em>Closed Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.ClosedPattern
	 * @generated
	 */
	public Adapter createClosedPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent <em>Workload Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadEvent
	 * @generated
	 */
	public Adapter createWorkloadEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.TimedObserver <em>Timed Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.TimedObserver
	 * @generated
	 */
	public Adapter createTimedObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation <em>Precedence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.PrecedenceRelation
	 * @generated
	 */
	public Adapter createPrecedenceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior <em>Workload Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadBehavior
	 * @generated
	 */
	public Adapter createWorkloadBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.ControlPin <em>Control Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.ControlPin
	 * @generated
	 */
	public Adapter createControlPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.InputPin
	 * @generated
	 */
	public Adapter createInputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.LatencyObserver <em>Latency Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.LatencyObserver
	 * @generated
	 */
	public Adapter createLatencyObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.OutputPin
	 * @generated
	 */
	public Adapter createOutputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.Once <em>Once</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.Once
	 * @generated
	 */
	public Adapter createOnceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.CommunicationChannel <em>Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.CommunicationChannel
	 * @generated
	 */
	public Adapter createCommunicationChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.CommunicationStep <em>Communication Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.CommunicationStep
	 * @generated
	 */
	public Adapter createCommunicationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.AcquireStep <em>Acquire Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.AcquireStep
	 * @generated
	 */
	public Adapter createAcquireStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.ReleaseStep <em>Release Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.ReleaseStep
	 * @generated
	 */
	public Adapter createReleaseStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.RequestedService <em>Requested Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.RequestedService
	 * @generated
	 */
	public Adapter createRequestedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution <em>Resource Service Excecution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution
	 * @generated
	 */
	public Adapter createResourceServiceExcecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern <em>Sliding Window Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.SlidingWindowPattern
	 * @generated
	 */
	public Adapter createSlidingWindowPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.ExecutionStep <em>Execution Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.ExecutionStep
	 * @generated
	 */
	public Adapter createExecutionStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern <em>Arrival Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.ArrivalPattern
	 * @generated
	 */
	public Adapter createArrivalPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern <em>Periodic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.PeriodicPattern
	 * @generated
	 */
	public Adapter createPeriodicPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.SporadicPattern <em>Sporadic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.SporadicPattern
	 * @generated
	 */
	public Adapter createSporadicPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.gqam.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.gqam.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ResourcePackageableElement <em>Resource Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ResourcePackageableElement
	 * @generated
	 */
	public Adapter createResourcePackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.ConcurrencyResource <em>Concurrency Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.ConcurrencyResource
	 * @generated
	 */
	public Adapter createConcurrencyResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.grm.SchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.grm.SchedulableResource
	 * @generated
	 */
	public Adapter createSchedulableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.coreelements.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.coreelements.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint
	 * @generated
	 */
	public Adapter createAnnotation_ConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GqamAdapterFactory
