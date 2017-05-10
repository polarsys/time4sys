/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.hrm.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.polarsys.time4sys.marte.hrm.HardwareInterface;

import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.OtherPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class HardwareInterfacePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The HardwareInterfaceGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareInterfaceGeneralPropertiesEditionComponent hardwareInterfaceGeneralPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The HardwareInterfaceOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareInterfaceOtherPropertiesEditionComponent hardwareInterfaceOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hardwareInterface the EObject to edit
	 * 
	 */
	public HardwareInterfacePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareInterface, String editing_mode) {
		super(editingContext, editing_mode);
		if (hardwareInterface instanceof HardwareInterface) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareInterface, PropertiesEditingProvider.class);
			hardwareInterfaceGeneralPropertiesEditionComponent = (HardwareInterfaceGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareInterfaceGeneralPropertiesEditionComponent.GENERAL_PART, HardwareInterfaceGeneralPropertiesEditionComponent.class);
			addSubComponent(hardwareInterfaceGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareInterface, PropertiesEditingProvider.class);
			hardwareInterfaceOtherPropertiesEditionComponent = (HardwareInterfaceOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareInterfaceOtherPropertiesEditionComponent.OTHER_PART, HardwareInterfaceOtherPropertiesEditionComponent.class);
			addSubComponent(hardwareInterfaceOtherPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (HardwareInterfaceGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)hardwareInterfaceGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (HardwareInterfaceOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)hardwareInterfaceOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)otherPart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (HrmViewsRepository.General.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			generalPart = (GeneralPropertiesEditionPart)propertiesEditionPart;
		}
		if (HrmViewsRepository.Other.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			otherPart = (OtherPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == HrmViewsRepository.General.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == HrmViewsRepository.Other.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
