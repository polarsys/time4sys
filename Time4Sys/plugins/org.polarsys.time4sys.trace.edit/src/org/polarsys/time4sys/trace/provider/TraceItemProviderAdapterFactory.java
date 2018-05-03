/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.trace.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.time4sys.trace.util.TraceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceItemProviderAdapterFactory extends TraceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TraceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.Trace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceItemProvider traceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.Trace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTraceAdapter() {
		if (traceItemProvider == null) {
			traceItemProvider = new TraceItemProvider(this);
		}

		return traceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.ResourceEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEventItemProvider resourceEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.ResourceEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceEventAdapter() {
		if (resourceEventItemProvider == null) {
			resourceEventItemProvider = new ResourceEventItemProvider(this);
		}

		return resourceEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.SchedulingEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingEventItemProvider schedulingEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.SchedulingEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulingEventAdapter() {
		if (schedulingEventItemProvider == null) {
			schedulingEventItemProvider = new SchedulingEventItemProvider(this);
		}

		return schedulingEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.MessageEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEventItemProvider messageEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.MessageEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageEventAdapter() {
		if (messageEventItemProvider == null) {
			messageEventItemProvider = new MessageEventItemProvider(this);
		}

		return messageEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.Slice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliceItemProvider sliceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.Slice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSliceAdapter() {
		if (sliceItemProvider == null) {
			sliceItemProvider = new SliceItemProvider(this);
		}

		return sliceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.Properties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesItemProvider propertiesItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.Properties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertiesAdapter() {
		if (propertiesItemProvider == null) {
			propertiesItemProvider = new PropertiesItemProvider(this);
		}

		return propertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.ValueChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueChangeEventItemProvider valueChangeEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.ValueChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueChangeEventAdapter() {
		if (valueChangeEventItemProvider == null) {
			valueChangeEventItemProvider = new ValueChangeEventItemProvider(this);
		}

		return valueChangeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.ObjectValueChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectValueChangeEventItemProvider objectValueChangeEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.ObjectValueChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectValueChangeEventAdapter() {
		if (objectValueChangeEventItemProvider == null) {
			objectValueChangeEventItemProvider = new ObjectValueChangeEventItemProvider(this);
		}

		return objectValueChangeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.DurationValueChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationValueChangeEventItemProvider durationValueChangeEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.DurationValueChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDurationValueChangeEventAdapter() {
		if (durationValueChangeEventItemProvider == null) {
			durationValueChangeEventItemProvider = new DurationValueChangeEventItemProvider(this);
		}

		return durationValueChangeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.DataSizeValueChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSizeValueChangeEventItemProvider dataSizeValueChangeEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.DataSizeValueChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataSizeValueChangeEventAdapter() {
		if (dataSizeValueChangeEventItemProvider == null) {
			dataSizeValueChangeEventItemProvider = new DataSizeValueChangeEventItemProvider(this);
		}

		return dataSizeValueChangeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.trace.NumberValueChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberValueChangeEventItemProvider numberValueChangeEventItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.trace.NumberValueChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberValueChangeEventAdapter() {
		if (numberValueChangeEventItemProvider == null) {
			numberValueChangeEventItemProvider = new NumberValueChangeEventItemProvider(this);
		}

		return numberValueChangeEventItemProvider;
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
		if (traceItemProvider != null) traceItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (resourceEventItemProvider != null) resourceEventItemProvider.dispose();
		if (schedulingEventItemProvider != null) schedulingEventItemProvider.dispose();
		if (messageEventItemProvider != null) messageEventItemProvider.dispose();
		if (sliceItemProvider != null) sliceItemProvider.dispose();
		if (propertiesItemProvider != null) propertiesItemProvider.dispose();
		if (valueChangeEventItemProvider != null) valueChangeEventItemProvider.dispose();
		if (objectValueChangeEventItemProvider != null) objectValueChangeEventItemProvider.dispose();
		if (durationValueChangeEventItemProvider != null) durationValueChangeEventItemProvider.dispose();
		if (dataSizeValueChangeEventItemProvider != null) dataSizeValueChangeEventItemProvider.dispose();
		if (numberValueChangeEventItemProvider != null) numberValueChangeEventItemProvider.dispose();
	}

}
