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
package org.polarsys.time4sys.marte.gqam.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.util.GrmSwitch;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.util.AnnotationSwitch;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.util.CoreElementsSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GqamItemProviderAdapterFactory extends GqamAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(GqamEditPlugin.INSTANCE, GqamPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqamItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.BehaviorScenario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorScenarioItemProvider behaviorScenarioItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.BehaviorScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorScenarioAdapter() {
		if (behaviorScenarioItemProvider == null) {
			behaviorScenarioItemProvider = new BehaviorScenarioItemProvider(this);
		}

		return behaviorScenarioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.BurstPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BurstPatternItemProvider burstPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.BurstPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBurstPatternAdapter() {
		if (burstPatternItemProvider == null) {
			burstPatternItemProvider = new BurstPatternItemProvider(this);
		}

		return burstPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.ClosedPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedPatternItemProvider closedPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.ClosedPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClosedPatternAdapter() {
		if (closedPatternItemProvider == null) {
			closedPatternItemProvider = new ClosedPatternItemProvider(this);
		}

		return closedPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.WorkloadEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadEventItemProvider workloadEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.WorkloadEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkloadEventAdapter() {
		if (workloadEventItemProvider == null) {
			workloadEventItemProvider = new WorkloadEventItemProvider(this);
		}

		return workloadEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.Step} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepItemProvider stepItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepAdapter() {
		if (stepItemProvider == null) {
			stepItemProvider = new StepItemProvider(this);
		}

		return stepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.TimedObserver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedObserverItemProvider timedObserverItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.TimedObserver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedObserverAdapter() {
		if (timedObserverItemProvider == null) {
			timedObserverItemProvider = new TimedObserverItemProvider(this);
		}

		return timedObserverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceRelationItemProvider precedenceRelationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrecedenceRelationAdapter() {
		if (precedenceRelationItemProvider == null) {
			precedenceRelationItemProvider = new PrecedenceRelationItemProvider(this);
		}

		return precedenceRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadBehaviorItemProvider workloadBehaviorItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkloadBehaviorAdapter() {
		if (workloadBehaviorItemProvider == null) {
			workloadBehaviorItemProvider = new WorkloadBehaviorItemProvider(this);
		}

		return workloadBehaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.Delay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayItemProvider delayItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.Delay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelayAdapter() {
		if (delayItemProvider == null) {
			delayItemProvider = new DelayItemProvider(this);
		}

		return delayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.InputPin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPinItemProvider inputPinItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputPinAdapter() {
		if (inputPinItemProvider == null) {
			inputPinItemProvider = new InputPinItemProvider(this);
		}

		return inputPinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.LatencyObserver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyObserverItemProvider latencyObserverItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.LatencyObserver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLatencyObserverAdapter() {
		if (latencyObserverItemProvider == null) {
			latencyObserverItemProvider = new LatencyObserverItemProvider(this);
		}

		return latencyObserverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.OutputPin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPinItemProvider outputPinItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputPinAdapter() {
		if (outputPinItemProvider == null) {
			outputPinItemProvider = new OutputPinItemProvider(this);
		}

		return outputPinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.Once} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnceItemProvider onceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.Once}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOnceAdapter() {
		if (onceItemProvider == null) {
			onceItemProvider = new OnceItemProvider(this);
		}

		return onceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.CommunicationChannel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationChannelItemProvider communicationChannelItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.CommunicationChannel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationChannelAdapter() {
		if (communicationChannelItemProvider == null) {
			communicationChannelItemProvider = new CommunicationChannelItemProvider(this);
		}

		return communicationChannelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.CommunicationStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationStepItemProvider communicationStepItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.CommunicationStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationStepAdapter() {
		if (communicationStepItemProvider == null) {
			communicationStepItemProvider = new CommunicationStepItemProvider(this);
		}

		return communicationStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.AcquireStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireStepItemProvider acquireStepItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.AcquireStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAcquireStepAdapter() {
		if (acquireStepItemProvider == null) {
			acquireStepItemProvider = new AcquireStepItemProvider(this);
		}

		return acquireStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.ReleaseStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseStepItemProvider releaseStepItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.ReleaseStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReleaseStepAdapter() {
		if (releaseStepItemProvider == null) {
			releaseStepItemProvider = new ReleaseStepItemProvider(this);
		}

		return releaseStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.RequestedService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestedServiceItemProvider requestedServiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.RequestedService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequestedServiceAdapter() {
		if (requestedServiceItemProvider == null) {
			requestedServiceItemProvider = new RequestedServiceItemProvider(this);
		}

		return requestedServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceServiceExcecutionItemProvider resourceServiceExcecutionItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.ResourceServiceExcecution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceServiceExcecutionAdapter() {
		if (resourceServiceExcecutionItemProvider == null) {
			resourceServiceExcecutionItemProvider = new ResourceServiceExcecutionItemProvider(this);
		}

		return resourceServiceExcecutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlidingWindowPatternItemProvider slidingWindowPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSlidingWindowPatternAdapter() {
		if (slidingWindowPatternItemProvider == null) {
			slidingWindowPatternItemProvider = new SlidingWindowPatternItemProvider(this);
		}

		return slidingWindowPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.ExecutionStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionStepItemProvider executionStepItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.ExecutionStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionStepAdapter() {
		if (executionStepItemProvider == null) {
			executionStepItemProvider = new ExecutionStepItemProvider(this);
		}

		return executionStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.PeriodicPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicPatternItemProvider periodicPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.PeriodicPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPeriodicPatternAdapter() {
		if (periodicPatternItemProvider == null) {
			periodicPatternItemProvider = new PeriodicPatternItemProvider(this);
		}

		return periodicPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.SporadicPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicPatternItemProvider sporadicPatternItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.SporadicPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSporadicPatternAdapter() {
		if (sporadicPatternItemProvider == null) {
			sporadicPatternItemProvider = new SporadicPatternItemProvider(this);
		}

		return sporadicPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.gqam.Reference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceItemProvider referenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.gqam.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceAdapter() {
		if (referenceItemProvider == null) {
			referenceItemProvider = new ReferenceItemProvider(this);
		}

		return referenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (acquireStepItemProvider != null) acquireStepItemProvider.dispose();
		if (behaviorScenarioItemProvider != null) behaviorScenarioItemProvider.dispose();
		if (burstPatternItemProvider != null) burstPatternItemProvider.dispose();
		if (closedPatternItemProvider != null) closedPatternItemProvider.dispose();
		if (communicationChannelItemProvider != null) communicationChannelItemProvider.dispose();
		if (communicationStepItemProvider != null) communicationStepItemProvider.dispose();
		if (delayItemProvider != null) delayItemProvider.dispose();
		if (executionStepItemProvider != null) executionStepItemProvider.dispose();
		if (inputPinItemProvider != null) inputPinItemProvider.dispose();
		if (latencyObserverItemProvider != null) latencyObserverItemProvider.dispose();
		if (onceItemProvider != null) onceItemProvider.dispose();
		if (outputPinItemProvider != null) outputPinItemProvider.dispose();
		if (periodicPatternItemProvider != null) periodicPatternItemProvider.dispose();
		if (precedenceRelationItemProvider != null) precedenceRelationItemProvider.dispose();
		if (referenceItemProvider != null) referenceItemProvider.dispose();
		if (releaseStepItemProvider != null) releaseStepItemProvider.dispose();
		if (requestedServiceItemProvider != null) requestedServiceItemProvider.dispose();
		if (resourceServiceExcecutionItemProvider != null) resourceServiceExcecutionItemProvider.dispose();
		if (slidingWindowPatternItemProvider != null) slidingWindowPatternItemProvider.dispose();
		if (sporadicPatternItemProvider != null) sporadicPatternItemProvider.dispose();
		if (stepItemProvider != null) stepItemProvider.dispose();
		if (timedObserverItemProvider != null) timedObserverItemProvider.dispose();
		if (workloadBehaviorItemProvider != null) workloadBehaviorItemProvider.dispose();
		if (workloadEventItemProvider != null) workloadEventItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link GrmPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class GrmChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends GrmSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseResource(Resource object) {
				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 GqamFactory.eINSTANCE.createCommunicationChannel()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return GqamEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link CoreElementsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class CoreElementsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends CoreElementsSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePackage(org.polarsys.time4sys.marte.nfp.coreelements.Package object) {
				newChildDescriptors.add
					(createChildParameter
						(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 GqamFactory.eINSTANCE.createCommunicationChannel()));

				newChildDescriptors.add
					(createChildParameter
						(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 GqamFactory.eINSTANCE.createTimedObserver()));

				newChildDescriptors.add
					(createChildParameter
						(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 GqamFactory.eINSTANCE.createLatencyObserver()));

				return null;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return GqamEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link AnnotationPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class AnnotationChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends AnnotationSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAnnotatedModel(AnnotatedModel object) {
				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createStep()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createAcquireStep()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createCommunicationStep()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createDelay()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createExecutionStep()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createReleaseStep()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createRequestedService()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS,
						 GqamFactory.eINSTANCE.createResourceServiceExcecution()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE,
						 GqamFactory.eINSTANCE.createTimedObserver()));

				newChildDescriptors.add
					(createChildParameter
						(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE,
						 GqamFactory.eINSTANCE.createLatencyObserver()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return GqamEditPlugin.INSTANCE;
		}
	}

}
