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
package org.polarsys.time4sys.marte.hrm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.polarsys.time4sys.marte.grm.provider.ResourcePackageItemProvider;
import org.polarsys.time4sys.marte.hrm.HardwareInterfacePackage;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.hrm.HardwareInterfacePackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareInterfacePackageItemProvider extends ResourcePackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareInterfacePackageItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns HardwareInterfacePackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HardwareInterfacePackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HardwareInterfacePackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwareInterfacePackage_type") :
			getString("_UI_HardwareInterfacePackage_type") + " " + label;
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
				(EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

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
				 HrmFactory.eINSTANCE.createHardwarePort()));

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
	}

}
