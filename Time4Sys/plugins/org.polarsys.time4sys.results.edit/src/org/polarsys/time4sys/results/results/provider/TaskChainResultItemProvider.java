/**
 */
package org.polarsys.time4sys.results.results.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.marte.nfp.NfpFactory;

import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.provider.NamedElementItemProvider;

import org.polarsys.time4sys.results.results.ResultsFactory;
import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.TaskChainResult;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.results.results.TaskChainResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskChainResultItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskChainResultItemProvider(AdapterFactory adapterFactory) {
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

			addSubResultsPropertyDescriptor(object);
			addLoadPropertyDescriptor(object);
			addSlackPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addNbOfSuspensionPropertyDescriptor(object);
			addDeadlinePropertyDescriptor(object);
			addResponseTimePropertyDescriptor(object);
			addResourcePropertyDescriptor(object);
			addSlicePropertyDescriptor(object);
			addSchedulingTracePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sub Results feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubResultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractResult_subResults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractResult_subResults_feature", "_UI_AbstractResult_type"),
				 ResultsPackage.Literals.ABSTRACT_RESULT__SUB_RESULTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AtomicResult_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AtomicResult_load_feature", "_UI_AtomicResult_type"),
				 ResultsPackage.Literals.ATOMIC_RESULT__LOAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskResult_deadline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskResult_deadline_feature", "_UI_TaskResult_type"),
				 ResultsPackage.Literals.TASK_RESULT__DEADLINE,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskResult_responseTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskResult_responseTime_feature", "_UI_TaskResult_type"),
				 ResultsPackage.Literals.TASK_RESULT__RESPONSE_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskResult_slack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskResult_slack_feature", "_UI_TaskResult_type"),
				 ResultsPackage.Literals.TASK_RESULT__SLACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskResult_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskResult_priority_feature", "_UI_TaskResult_type"),
				 ResultsPackage.Literals.TASK_RESULT__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Of Suspension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbOfSuspensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskResult_nbOfSuspension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskResult_nbOfSuspension_feature", "_UI_TaskResult_type"),
				 ResultsPackage.Literals.TASK_RESULT__NB_OF_SUSPENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskChainResult_resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskChainResult_resource_feature", "_UI_TaskChainResult_type"),
				 ResultsPackage.Literals.TASK_CHAIN_RESULT__RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskChainResult_slice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskChainResult_slice_feature", "_UI_TaskChainResult_type"),
				 ResultsPackage.Literals.TASK_CHAIN_RESULT__SLICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduling Trace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulingTracePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskChainResult_schedulingTrace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskChainResult_schedulingTrace_feature", "_UI_TaskChainResult_type"),
				 ResultsPackage.Literals.TASK_CHAIN_RESULT__SCHEDULING_TRACE,
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
			childrenFeatures.add(ResultsPackage.Literals.ATOMIC_RESULT__PARAMETER);
			childrenFeatures.add(ResultsPackage.Literals.TASK_RESULT__EVENT);
			childrenFeatures.add(ResultsPackage.Literals.TASK_RESULT__CET);
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
	 * This returns TaskChainResult.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskChainResult"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskChainResult)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskChainResult_type") :
			getString("_UI_TaskChainResult_type") + " " + label;
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

		switch (notification.getFeatureID(TaskChainResult.class)) {
			case ResultsPackage.TASK_CHAIN_RESULT__LOAD:
			case ResultsPackage.TASK_CHAIN_RESULT__SLACK:
			case ResultsPackage.TASK_CHAIN_RESULT__PRIORITY:
			case ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__PARAMETER:
			case ResultsPackage.TASK_CHAIN_RESULT__EVENT:
			case ResultsPackage.TASK_CHAIN_RESULT__CET:
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
				(ResultsPackage.Literals.ATOMIC_RESULT__PARAMETER,
				 ResultsFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.TASK_RESULT__EVENT,
				 ResultsFactory.eINSTANCE.createSimplePeriodicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.TASK_RESULT__EVENT,
				 ResultsFactory.eINSTANCE.createSimpleSporadicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.TASK_RESULT__EVENT,
				 ResultsFactory.eINSTANCE.createOnceEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.TASK_RESULT__EVENT,
				 ResultsFactory.eINSTANCE.createSlidingWindowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.TASK_RESULT__EVENT,
				 ResultsFactory.eINSTANCE.createTindellEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.TASK_RESULT__CET,
				 NfpFactory.eINSTANCE.createFromString(NfpPackage.Literals.NFP_TIME_INTERVAL, null))); // TODO: ensure this is a valid literal value
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ResultsEditPlugin.INSTANCE;
	}

}
