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
package org.polarsys.time4sys.design.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.design.DesignPackage;
import org.polarsys.time4sys.marte.alloc.AllocFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.design.DesignModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignModelItemProvider 
	extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModelItemProvider(AdapterFactory adapterFactory) {
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

			addEndToEndFlowsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRelationshipsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the End To End Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndToEndFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DesignModel_endToEndFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DesignModel_endToEndFlows_feature", "_UI_DesignModel_type"),
				 DesignPackage.Literals.DESIGN_MODEL__END_TO_END_FLOWS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DesignModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DesignModel_name_feature", "_UI_DesignModel_type"),
				 DesignPackage.Literals.DESIGN_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relationships feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DesignModel_relationships_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DesignModel_relationships_feature", "_UI_DesignModel_type"),
				 DesignPackage.Literals.DESIGN_MODEL__RELATIONSHIPS,
				 true,
				 false,
				 false,
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
			childrenFeatures.add(DesignPackage.Literals.DESIGN_MODEL__WORKLOAD_BEHAVIOR);
			childrenFeatures.add(DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE);
			childrenFeatures.add(DesignPackage.Literals.DESIGN_MODEL__END_TO_END_FLOWS);
			childrenFeatures.add(DesignPackage.Literals.DESIGN_MODEL__RELATIONSHIPS);
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
	 * This returns DesignModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DesignModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DesignModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DesignModel_type") :
			getString("_UI_DesignModel_type") + " " + label;
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

		switch (notification.getFeatureID(DesignModel.class)) {
			case DesignPackage.DESIGN_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
			case DesignPackage.DESIGN_MODEL__RELATIONSHIPS:
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
				(DesignPackage.Literals.DESIGN_MODEL__WORKLOAD_BEHAVIOR,
				 GqamFactory.eINSTANCE.createWorkloadBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE,
				 GrmFactory.eINSTANCE.createResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE,
				 SrmFactory.eINSTANCE.createSoftwareInterfacePackage()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE,
				 SrmFactory.eINSTANCE.createSoftwareResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE,
				 HrmFactory.eINSTANCE.createHardwareInterfacePackage()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE,
				 HrmFactory.eINSTANCE.createHardwareResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__END_TO_END_FLOWS,
				 GqamFactory.eINSTANCE.createEndToEndFlow()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RELATIONSHIPS,
				 AllocFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RELATIONSHIPS,
				 AllocFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(DesignPackage.Literals.DESIGN_MODEL__RELATIONSHIPS,
				 AllocFactory.eINSTANCE.createAllocate()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
