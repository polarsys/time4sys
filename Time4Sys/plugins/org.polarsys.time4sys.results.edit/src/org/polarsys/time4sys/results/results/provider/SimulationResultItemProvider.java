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

import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.marte.nfp.coreelements.provider.NamedElementItemProvider;

import org.polarsys.time4sys.results.results.ResultsFactory;
import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.SimulationResult;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.results.results.SimulationResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationResultItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationResultItemProvider(AdapterFactory adapterFactory) {
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

			addToolNamePropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addMappingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractResultSet_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractResultSet_date_feature", "_UI_AbstractResultSet_type"),
				 ResultsPackage.Literals.ABSTRACT_RESULT_SET__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractResultSet_mapping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractResultSet_mapping_feature", "_UI_AbstractResultSet_type"),
				 ResultsPackage.Literals.ABSTRACT_RESULT_SET__MAPPING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractResultSet_toolName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractResultSet_toolName_feature", "_UI_AbstractResultSet_type"),
				 ResultsPackage.Literals.ABSTRACT_RESULT_SET__TOOL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS);
			childrenFeatures.add(ResultsPackage.Literals.ABSTRACT_RESULT_SET__MAPPING);
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
	 * This returns SimulationResult.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimulationResult"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SimulationResult)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SimulationResult_type") :
			getString("_UI_SimulationResult_type") + " " + label;
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

		switch (notification.getFeatureID(SimulationResult.class)) {
			case ResultsPackage.SIMULATION_RESULT__TOOL_NAME:
			case ResultsPackage.SIMULATION_RESULT__DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ResultsPackage.SIMULATION_RESULT__RESULTS:
			case ResultsPackage.SIMULATION_RESULT__MAPPING:
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
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS,
				 ResultsFactory.eINSTANCE.createTaskChainResult()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS,
				 ResultsFactory.eINSTANCE.createContainedResult()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS,
				 ResultsFactory.eINSTANCE.createReferencedResult()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS,
				 ResultsFactory.eINSTANCE.createTaskResult()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS,
				 ResultsFactory.eINSTANCE.createCustomTaskResult()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS,
				 ResultsFactory.eINSTANCE.createComputingResourceResult()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__RESULTS,
				 ResultsFactory.eINSTANCE.createSharedResourceResult()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsPackage.Literals.ABSTRACT_RESULT_SET__MAPPING,
				 MappingFactory.eINSTANCE.createMapping()));
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