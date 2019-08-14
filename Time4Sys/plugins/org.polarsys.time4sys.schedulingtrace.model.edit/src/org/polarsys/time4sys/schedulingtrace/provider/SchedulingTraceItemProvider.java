/**
 */
package org.polarsys.time4sys.schedulingtrace.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.marte.nfp.TimeInterval;

import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;

import org.polarsys.time4sys.trace.TracePackage;

import org.polarsys.time4sys.trace.provider.TraceItemProvider;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.schedulingtrace.SchedulingTrace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingTraceItemProvider extends TraceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingTraceItemProvider(AdapterFactory adapterFactory) {
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

			addJobWithMaxRTPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SchedulingTrace_jobWithMaxRT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchedulingTrace_jobWithMaxRT_feature", "_UI_SchedulingTrace_type"),
				 SchedulingtracePackage.Literals.SCHEDULING_TRACE__JOB_WITH_MAX_RT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SchedulingtracePackage.Literals.SCHEDULING_TRACE__PROCESSORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SchedulingTrace.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SchedulingTrace"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimeInterval labelValue = ((SchedulingTrace)object).getRange();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SchedulingTrace_type") :
			getString("_UI_SchedulingTrace_type") + " " + label;
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

		switch (notification.getFeatureID(SchedulingTrace.class)) {
			case SchedulingtracePackage.SCHEDULING_TRACE__PROCESSORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(TracePackage.Literals.TRACE__SLICES,
				 SchedulingtraceFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__SLICES,
				 SchedulingtraceFactory.eINSTANCE.createTaskTrace()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__SLICES,
				 SchedulingtraceFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__SLICES,
				 SchedulingtraceFactory.eINSTANCE.createJob()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__SLICES,
				 SchedulingtraceFactory.eINSTANCE.createFunctionInstance()));

		newChildDescriptors.add
			(createChildParameter
				(SchedulingtracePackage.Literals.SCHEDULING_TRACE__PROCESSORS,
				 SchedulingtraceFactory.eINSTANCE.createProcessor()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TracePackage.Literals.TRACE__SLICES ||
			childFeature == SchedulingtracePackage.Literals.SCHEDULING_TRACE__PROCESSORS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
