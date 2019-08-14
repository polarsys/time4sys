/**
 */
package org.polarsys.time4sys.schedulingtrace.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.polarsys.time4sys.schedulingtrace.Partition;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;

import org.polarsys.time4sys.trace.TracePackage;

import org.polarsys.time4sys.trace.provider.SliceItemProvider;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.schedulingtrace.Partition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitionItemProvider extends SliceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTasktracesPropertyDescriptor(object);
			addSchedulableResourcePropertyDescriptor(object);
			addJobWithMaxRTPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tasktraces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasktracesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Partition_tasktraces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Partition_tasktraces_feature", "_UI_Partition_type"),
				 SchedulingtracePackage.Literals.PARTITION__TASKTRACES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedulable Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulableResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Partition_schedulableResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Partition_schedulableResource_feature", "_UI_Partition_type"),
				 SchedulingtracePackage.Literals.PARTITION__SCHEDULABLE_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Job With Max RT feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobWithMaxRTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Partition_jobWithMaxRT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Partition_jobWithMaxRT_feature", "_UI_Partition_type"),
				 SchedulingtracePackage.Literals.PARTITION__JOB_WITH_MAX_RT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Partition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Partition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Partition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Partition_type") :
			getString("_UI_Partition_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.SLICE__OWNED_SUB_SLICES,
				 SchedulingtraceFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.SLICE__OWNED_SUB_SLICES,
				 SchedulingtraceFactory.eINSTANCE.createTaskTrace()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.SLICE__OWNED_SUB_SLICES,
				 SchedulingtraceFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.SLICE__OWNED_SUB_SLICES,
				 SchedulingtraceFactory.eINSTANCE.createJob()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.SLICE__OWNED_SUB_SLICES,
				 SchedulingtraceFactory.eINSTANCE.createFunctionInstance()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SchedulingtraceEditPlugin.INSTANCE;
	}

}
