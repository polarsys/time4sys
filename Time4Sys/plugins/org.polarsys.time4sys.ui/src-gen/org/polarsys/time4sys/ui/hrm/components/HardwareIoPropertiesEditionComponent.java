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

import org.polarsys.time4sys.marte.hrm.HardwareIo;

import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class HardwareIoPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The HardwareIoGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareIoGeneralPropertiesEditionComponent hardwareIoGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The HardwareIoTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareIoTimingPropertiesEditionComponent hardwareIoTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The HardwareIoOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareIoOtherPropertiesEditionComponent hardwareIoOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hardwareIo the EObject to edit
	 * 
	 */
	public HardwareIoPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareIo, String editing_mode) {
		super(editingContext, editing_mode);
		if (hardwareIo instanceof HardwareIo) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareIo, PropertiesEditingProvider.class);
			hardwareIoGeneralPropertiesEditionComponent = (HardwareIoGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareIoGeneralPropertiesEditionComponent.GENERAL_PART, HardwareIoGeneralPropertiesEditionComponent.class);
			addSubComponent(hardwareIoGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareIo, PropertiesEditingProvider.class);
			hardwareIoTimingPropertiesEditionComponent = (HardwareIoTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareIoTimingPropertiesEditionComponent.TIMING_PART, HardwareIoTimingPropertiesEditionComponent.class);
			addSubComponent(hardwareIoTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareIo, PropertiesEditingProvider.class);
			hardwareIoOtherPropertiesEditionComponent = (HardwareIoOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareIoOtherPropertiesEditionComponent.OTHER_PART, HardwareIoOtherPropertiesEditionComponent.class);
			addSubComponent(hardwareIoOtherPropertiesEditionComponent);
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
		if (HardwareIoGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)hardwareIoGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (HardwareIoTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)hardwareIoTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (HardwareIoOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)hardwareIoOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (HrmViewsRepository.Timing.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			timingPart = (TimingPropertiesEditionPart)propertiesEditionPart;
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
		if (key == HrmViewsRepository.Timing.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == HrmViewsRepository.Other.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
