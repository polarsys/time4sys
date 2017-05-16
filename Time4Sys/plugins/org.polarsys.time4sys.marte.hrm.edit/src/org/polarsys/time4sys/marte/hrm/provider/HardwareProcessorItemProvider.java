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
package org.polarsys.time4sys.marte.hrm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.hrm.HardwareProcessor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareProcessorItemProvider extends HardwareComputingResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareProcessorItemProvider(AdapterFactory adapterFactory) {
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

			addArchitecturePropertyDescriptor(object);
			addMipsPropertyDescriptor(object);
			addIpcPropertyDescriptor(object);
			addNbCoresPropertyDescriptor(object);
			addNbPipelinesPropertyDescriptor(object);
			addNbStagesPropertyDescriptor(object);
			addNbAlusPropertyDescriptor(object);
			addNbFpusPropertyDescriptor(object);
			addOwnedIsasPropertyDescriptor(object);
			addPredictorsPropertyDescriptor(object);
			addCachesPropertyDescriptor(object);
			addOwnedMmusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_architecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_architecture_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__ARCHITECTURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mips feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMipsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_mips_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_mips_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__MIPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ipc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_ipc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_ipc_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__IPC,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_nbCores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_nbCores_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__NB_CORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Pipelines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbPipelinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_nbPipelines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_nbPipelines_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__NB_PIPELINES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Stages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbStagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_nbStages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_nbStages_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__NB_STAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Alus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbAlusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_nbAlus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_nbAlus_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__NB_ALUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Fpus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbFpusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_nbFpus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_nbFpus_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__NB_FPUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Isas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedIsasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_ownedIsas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_ownedIsas_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__OWNED_ISAS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predictors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredictorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_predictors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_predictors_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__PREDICTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Caches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_caches_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_caches_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__CACHES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Mmus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMmusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareProcessor_ownedMmus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareProcessor_ownedMmus_feature", "_UI_HardwareProcessor_type"),
				 HrmPackage.Literals.HARDWARE_PROCESSOR__OWNED_MMUS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns HardwareProcessor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HardwareProcessor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HardwareProcessor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwareProcessor_type") :
			getString("_UI_HardwareProcessor_type") + " " + label;
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

		switch (notification.getFeatureID(HardwareProcessor.class)) {
			case HrmPackage.HARDWARE_PROCESSOR__ARCHITECTURE:
			case HrmPackage.HARDWARE_PROCESSOR__MIPS:
			case HrmPackage.HARDWARE_PROCESSOR__IPC:
			case HrmPackage.HARDWARE_PROCESSOR__NB_CORES:
			case HrmPackage.HARDWARE_PROCESSOR__NB_PIPELINES:
			case HrmPackage.HARDWARE_PROCESSOR__NB_STAGES:
			case HrmPackage.HARDWARE_PROCESSOR__NB_ALUS:
			case HrmPackage.HARDWARE_PROCESSOR__NB_FPUS:
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
	}

}
