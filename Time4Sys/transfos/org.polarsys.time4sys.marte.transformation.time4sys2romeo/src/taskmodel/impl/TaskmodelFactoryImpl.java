/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import taskmodel.AbstractFragment;
import taskmodel.BoundObserver;
import taskmodel.First_Release;
import taskmodel.Fragment;
import taskmodel.Jitter;
import taskmodel.MutualExclusionResource;
import taskmodel.Offset;
import taskmodel.Period;
import taskmodel.ResponseTimeObserver;
import taskmodel.SharingResourceFragment;
import taskmodel.Stimulus;
import taskmodel.Task;
import taskmodel.TaskmodelFactory;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskmodelFactoryImpl extends EFactoryImpl implements TaskmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskmodelFactory init() {
		try {
			TaskmodelFactory theTaskmodelFactory = (TaskmodelFactory)EPackage.Registry.INSTANCE.getEFactory(TaskmodelPackage.eNS_URI);
			if (theTaskmodelFactory != null) {
				return theTaskmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TaskmodelPackage.SYSTEM: return createSystem();
			case TaskmodelPackage.TASK: return createTask();
			case TaskmodelPackage.STIMULUS: return createStimulus();
			case TaskmodelPackage.FIRST_RELEASE: return createFirst_Release();
			case TaskmodelPackage.PERIOD: return createPeriod();
			case TaskmodelPackage.JITTER: return createJitter();
			case TaskmodelPackage.FRAGMENT: return createFragment();
			case TaskmodelPackage.OFFSET: return createOffset();
			case TaskmodelPackage.BOUND_OBSERVER: return createBoundObserver();
			case TaskmodelPackage.RESPONSE_TIME_OBSERVER: return createResponseTimeObserver();
			case TaskmodelPackage.SHARING_RESOURCE_FRAGMENT: return createSharingResourceFragment();
			case TaskmodelPackage.MUTUAL_EXCLUSION_RESOURCE: return createMutualExclusionResource();
			case TaskmodelPackage.ABSTRACT_FRAGMENT: return createAbstractFragment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public taskmodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus createStimulus() {
		StimulusImpl stimulus = new StimulusImpl();
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public First_Release createFirst_Release() {
		First_ReleaseImpl first_Release = new First_ReleaseImpl();
		return first_Release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jitter createJitter() {
		JitterImpl jitter = new JitterImpl();
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment createFragment() {
		FragmentImpl fragment = new FragmentImpl();
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offset createOffset() {
		OffsetImpl offset = new OffsetImpl();
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundObserver createBoundObserver() {
		BoundObserverImpl boundObserver = new BoundObserverImpl();
		return boundObserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTimeObserver createResponseTimeObserver() {
		ResponseTimeObserverImpl responseTimeObserver = new ResponseTimeObserverImpl();
		return responseTimeObserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingResourceFragment createSharingResourceFragment() {
		SharingResourceFragmentImpl sharingResourceFragment = new SharingResourceFragmentImpl();
		return sharingResourceFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusionResource createMutualExclusionResource() {
		MutualExclusionResourceImpl mutualExclusionResource = new MutualExclusionResourceImpl();
		return mutualExclusionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFragment createAbstractFragment() {
		AbstractFragmentImpl abstractFragment = new AbstractFragmentImpl();
		return abstractFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskmodelPackage getTaskmodelPackage() {
		return (TaskmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskmodelPackage getPackage() {
		return TaskmodelPackage.eINSTANCE;
	}

} //TaskmodelFactoryImpl
