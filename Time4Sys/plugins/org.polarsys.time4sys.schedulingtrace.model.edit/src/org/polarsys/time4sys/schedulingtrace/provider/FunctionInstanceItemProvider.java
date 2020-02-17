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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.schedulingtrace.FunctionInstance;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;

import org.polarsys.time4sys.trace.TracePackage;

import org.polarsys.time4sys.trace.provider.SliceItemProvider;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.schedulingtrace.FunctionInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionInstanceItemProvider extends SliceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addStepPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionInstance_step_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionInstance_step_feature", "_UI_FunctionInstance_type"),
				 SchedulingtracePackage.Literals.FUNCTION_INSTANCE__STEP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionInstance_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionInstance_id_feature", "_UI_FunctionInstance_type"),
				 SchedulingtracePackage.Literals.FUNCTION_INSTANCE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FunctionInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionInstance_type") :
			getString("_UI_FunctionInstance_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionInstance.class)) {
			case SchedulingtracePackage.FUNCTION_INSTANCE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
