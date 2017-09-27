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
package org.polarsys.time4sys.marte.srm.provider;

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
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.util.GrmSwitch;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SrmItemProviderAdapterFactory extends SrmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(SrmEditPlugin.INSTANCE, SrmPackage.eNS_URI);

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
	public SrmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResourceItemProvider softwareResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareResourceAdapter() {
		if (softwareResourceItemProvider == null) {
			softwareResourceItemProvider = new SoftwareResourceItemProvider(this);
		}

		return softwareResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareAccessService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareAccessServiceItemProvider softwareAccessServiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareAccessService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareAccessServiceAdapter() {
		if (softwareAccessServiceItemProvider == null) {
			softwareAccessServiceItemProvider = new SoftwareAccessServiceItemProvider(this);
		}

		return softwareAccessServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.InterruptResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptResourceItemProvider interruptResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.InterruptResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterruptResourceAdapter() {
		if (interruptResourceItemProvider == null) {
			interruptResourceItemProvider = new InterruptResourceItemProvider(this);
		}

		return interruptResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSchedulableResourceItemProvider softwareSchedulableResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareSchedulableResourceAdapter() {
		if (softwareSchedulableResourceItemProvider == null) {
			softwareSchedulableResourceItemProvider = new SoftwareSchedulableResourceItemProvider(this);
		}

		return softwareSchedulableResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.MemoryPartition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryPartitionItemProvider memoryPartitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.MemoryPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryPartitionAdapter() {
		if (memoryPartitionItemProvider == null) {
			memoryPartitionItemProvider = new MemoryPartitionItemProvider(this);
		}

		return memoryPartitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.Alarm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmItemProvider alarmItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.Alarm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlarmAdapter() {
		if (alarmItemProvider == null) {
			alarmItemProvider = new AlarmItemProvider(this);
		}

		return alarmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareTimerResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareTimerResourceItemProvider softwareTimerResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareTimerResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareTimerResourceAdapter() {
		if (softwareTimerResourceItemProvider == null) {
			softwareTimerResourceItemProvider = new SoftwareTimerResourceItemProvider(this);
		}

		return softwareTimerResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareMutualExclusionResourceItemProvider softwareMutualExclusionResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareMutualExclusionResourceAdapter() {
		if (softwareMutualExclusionResourceItemProvider == null) {
			softwareMutualExclusionResourceItemProvider = new SoftwareMutualExclusionResourceItemProvider(this);
		}

		return softwareMutualExclusionResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.NotificationResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationResourceItemProvider notificationResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.NotificationResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotificationResourceAdapter() {
		if (notificationResourceItemProvider == null) {
			notificationResourceItemProvider = new NotificationResourceItemProvider(this);
		}

		return notificationResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SharedDataComResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedDataComResourceItemProvider sharedDataComResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SharedDataComResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSharedDataComResourceAdapter() {
		if (sharedDataComResourceItemProvider == null) {
			sharedDataComResourceItemProvider = new SharedDataComResourceItemProvider(this);
		}

		return sharedDataComResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.MessageComResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageComResourceItemProvider messageComResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.MessageComResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageComResourceAdapter() {
		if (messageComResourceItemProvider == null) {
			messageComResourceItemProvider = new MessageComResourceItemProvider(this);
		}

		return messageComResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.DeviceBroker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceBrokerItemProvider deviceBrokerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.DeviceBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceBrokerAdapter() {
		if (deviceBrokerItemProvider == null) {
			deviceBrokerItemProvider = new DeviceBrokerItemProvider(this);
		}

		return deviceBrokerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.MemoryBroker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryBrokerItemProvider memoryBrokerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.MemoryBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryBrokerAdapter() {
		if (memoryBrokerItemProvider == null) {
			memoryBrokerItemProvider = new MemoryBrokerItemProvider(this);
		}

		return memoryBrokerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareScheduler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSchedulerItemProvider softwareSchedulerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareScheduler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareSchedulerAdapter() {
		if (softwareSchedulerItemProvider == null) {
			softwareSchedulerItemProvider = new SoftwareSchedulerItemProvider(this);
		}

		return softwareSchedulerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwarePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwarePortItemProvider softwarePortItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwarePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwarePortAdapter() {
		if (softwarePortItemProvider == null) {
			softwarePortItemProvider = new SoftwarePortItemProvider(this);
		}

		return softwarePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareServiceItemProvider softwareServiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareServiceAdapter() {
		if (softwareServiceItemProvider == null) {
			softwareServiceItemProvider = new SoftwareServiceItemProvider(this);
		}

		return softwareServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareInterfaceItemProvider softwareInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareInterfaceAdapter() {
		if (softwareInterfaceItemProvider == null) {
			softwareInterfaceItemProvider = new SoftwareInterfaceItemProvider(this);
		}

		return softwareInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareArchitecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareArchitectureItemProvider softwareArchitectureItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareArchitectureAdapter() {
		if (softwareArchitectureItemProvider == null) {
			softwareArchitectureItemProvider = new SoftwareArchitectureItemProvider(this);
		}

		return softwareArchitectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareConnectorItemProvider softwareConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareConnectorAdapter() {
		if (softwareConnectorItemProvider == null) {
			softwareConnectorItemProvider = new SoftwareConnectorItemProvider(this);
		}

		return softwareConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareResourcePackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResourcePackageItemProvider softwareResourcePackageItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareResourcePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareResourcePackageAdapter() {
		if (softwareResourcePackageItemProvider == null) {
			softwareResourcePackageItemProvider = new SoftwareResourcePackageItemProvider(this);
		}

		return softwareResourcePackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareInterfacePackageItemProvider softwareInterfacePackageItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareInterfacePackageAdapter() {
		if (softwareInterfacePackageItemProvider == null) {
			softwareInterfacePackageItemProvider = new SoftwareInterfacePackageItemProvider(this);
		}

		return softwareInterfacePackageItemProvider;
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
		if (alarmItemProvider != null) alarmItemProvider.dispose();
		if (deviceBrokerItemProvider != null) deviceBrokerItemProvider.dispose();
		if (interruptResourceItemProvider != null) interruptResourceItemProvider.dispose();
		if (memoryBrokerItemProvider != null) memoryBrokerItemProvider.dispose();
		if (memoryPartitionItemProvider != null) memoryPartitionItemProvider.dispose();
		if (messageComResourceItemProvider != null) messageComResourceItemProvider.dispose();
		if (notificationResourceItemProvider != null) notificationResourceItemProvider.dispose();
		if (sharedDataComResourceItemProvider != null) sharedDataComResourceItemProvider.dispose();
		if (softwareAccessServiceItemProvider != null) softwareAccessServiceItemProvider.dispose();
		if (softwareArchitectureItemProvider != null) softwareArchitectureItemProvider.dispose();
		if (softwareConnectorItemProvider != null) softwareConnectorItemProvider.dispose();
		if (softwareInterfaceItemProvider != null) softwareInterfaceItemProvider.dispose();
		if (softwareInterfacePackageItemProvider != null) softwareInterfacePackageItemProvider.dispose();
		if (softwareMutualExclusionResourceItemProvider != null) softwareMutualExclusionResourceItemProvider.dispose();
		if (softwarePortItemProvider != null) softwarePortItemProvider.dispose();
		if (softwareResourceItemProvider != null) softwareResourceItemProvider.dispose();
		if (softwareResourcePackageItemProvider != null) softwareResourcePackageItemProvider.dispose();
		if (softwareSchedulableResourceItemProvider != null) softwareSchedulableResourceItemProvider.dispose();
		if (softwareSchedulerItemProvider != null) softwareSchedulerItemProvider.dispose();
		if (softwareServiceItemProvider != null) softwareServiceItemProvider.dispose();
		if (softwareTimerResourceItemProvider != null) softwareTimerResourceItemProvider.dispose();
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
						 SrmFactory.eINSTANCE.createSoftwareResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createInterruptResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createAlarm()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createDeviceBroker()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createMemoryBroker()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createMemoryPartition()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createMessageComResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createNotificationResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createSharedDataComResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createSoftwareArchitecture()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createSoftwareMutualExclusionResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createSoftwareSchedulableResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createSoftwareScheduler()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
						 SrmFactory.eINSTANCE.createSoftwareTimerResource()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_PORT,
						 SrmFactory.eINSTANCE.createSoftwarePort()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
						 SrmFactory.eINSTANCE.createSoftwareConnector()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__PSERVICES,
						 SrmFactory.eINSTANCE.createSoftwareAccessService()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE__PSERVICES,
						 SrmFactory.eINSTANCE.createSoftwareService()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseResourceInterface(ResourceInterface object) {
				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE_INTERFACE__OWNED_SERVICE,
						 SrmFactory.eINSTANCE.createSoftwareAccessService()));

				newChildDescriptors.add
					(createChildParameter
						(GrmPackage.Literals.RESOURCE_INTERFACE__OWNED_SERVICE,
						 SrmFactory.eINSTANCE.createSoftwareService()));

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
			return SrmEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage}.
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
		protected static class CreationSwitch extends org.polarsys.time4sys.marte.nfp.coreelements.util.CoreElementsSwitch<Object> {
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
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareResource()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createInterruptResource()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createAlarm()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createDeviceBroker()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createMemoryBroker()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createMemoryPartition()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createMessageComResource()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createNotificationResource()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSharedDataComResource()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareArchitecture()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareInterface()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareInterfacePackage()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareMutualExclusionResource()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareResourcePackage()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareSchedulableResource()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareScheduler()));

				newChildDescriptors.add
					(createChildParameter
						(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
						 SrmFactory.eINSTANCE.createSoftwareTimerResource()));

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
			return SrmEditPlugin.INSTANCE;
		}
	}

}
