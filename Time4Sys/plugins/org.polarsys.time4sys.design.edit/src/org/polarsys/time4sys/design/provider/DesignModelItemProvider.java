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
package org.polarsys.time4sys.design.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.design.DesignPackage;
import org.polarsys.time4sys.marte.alloc.AllocFactory;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.provider.PackageItemProvider;
import org.polarsys.time4sys.marte.sam.SamFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationFactory;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.design.DesignModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignModelItemProvider 
	extends PackageItemProvider {
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

			addAnnotationConcernPropertyDescriptor(object);
			addEndToEndFlowsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Annotation Concern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationConcernPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnnotatedModel_annotationConcern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnnotatedModel_annotationConcern_feature", "_UI_AnnotatedModel_type"),
				 AnnotationPackage.Literals.ANNOTATED_MODEL__ANNOTATION_CONCERN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNS);
			childrenFeatures.add(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE);
			childrenFeatures.add(DesignPackage.Literals.DESIGN_MODEL__WORKLOAD_BEHAVIOR);
			childrenFeatures.add(DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE);
			childrenFeatures.add(DesignPackage.Literals.DESIGN_MODEL__END_TO_END_FLOWS);
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
			case DesignPackage.DESIGN_MODEL__OWNS:
			case DesignPackage.DESIGN_MODEL__OWNED_RULE:
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
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
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 DesignFactory.eINSTANCE.createDesignModel()));

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

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createClockResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createCommunicationMedia()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createConcurrencyResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createDeviceResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createSynchResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceManager()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createSchedulableResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createSecondaryScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createStorageResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createTimerResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createUsageTypedAmount()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createInterruptResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createAlarm()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createDeviceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createMemoryBroker()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createMemoryPartition()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createMessageComResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createNotificationResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSharedDataComResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareInterfacePackage()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareSchedulableResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareTimerResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createFirmwareArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareDevice()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareIo()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareActuator()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareCommunicationResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareArbiter()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareAsic()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareBranchPredictor()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareMedia()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareBridge()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareBus()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareCache()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareTimingResource()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareClock()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareStorageManager()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareDma()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareDrive()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareInterfacePackage()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareIpBlock()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareIsa()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareMmu()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwarePlatform()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwarePld()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareRam()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareRom()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareSensor()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareSupport()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareTimer()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 HrmFactory.eINSTANCE.createHardwareWatchdog()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 AllocFactory.eINSTANCE.createAllocate()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SamFactory.eINSTANCE.createSchedulingObserver()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 AnnotationFactory.eINSTANCE.createModelingConcern()));

		newChildDescriptors.add
			(createChildParameter
				(CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 AnnotationFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE,
				 GqamFactory.eINSTANCE.createTimedObserver()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE,
				 GqamFactory.eINSTANCE.createLatencyObserver()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE,
				 SamFactory.eINSTANCE.createSchedulingObserver()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE,
				 AnnotationFactory.eINSTANCE.createConstraint()));

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
				 SamFactory.eINSTANCE.createEndToEndFlow()));
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
			childFeature == CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT ||
			childFeature == AnnotationPackage.Literals.ANNOTATED_MODEL__OWNED_RULE ||
			childFeature == DesignPackage.Literals.DESIGN_MODEL__RESOURCE_PACKAGE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
