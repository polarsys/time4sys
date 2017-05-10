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

import org.polarsys.time4sys.marte.hrm.HardwareCache;

import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class HardwareCachePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The HardwareCacheGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareCacheGeneralPropertiesEditionComponent hardwareCacheGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The HardwareCacheTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareCacheTimingPropertiesEditionComponent hardwareCacheTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The HardwareCacheOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareCacheOtherPropertiesEditionComponent hardwareCacheOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hardwareCache the EObject to edit
	 * 
	 */
	public HardwareCachePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareCache, String editing_mode) {
		super(editingContext, editing_mode);
		if (hardwareCache instanceof HardwareCache) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareCache, PropertiesEditingProvider.class);
			hardwareCacheGeneralPropertiesEditionComponent = (HardwareCacheGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareCacheGeneralPropertiesEditionComponent.GENERAL_PART, HardwareCacheGeneralPropertiesEditionComponent.class);
			addSubComponent(hardwareCacheGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareCache, PropertiesEditingProvider.class);
			hardwareCacheTimingPropertiesEditionComponent = (HardwareCacheTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareCacheTimingPropertiesEditionComponent.TIMING_PART, HardwareCacheTimingPropertiesEditionComponent.class);
			addSubComponent(hardwareCacheTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareCache, PropertiesEditingProvider.class);
			hardwareCacheOtherPropertiesEditionComponent = (HardwareCacheOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareCacheOtherPropertiesEditionComponent.OTHER_PART, HardwareCacheOtherPropertiesEditionComponent.class);
			addSubComponent(hardwareCacheOtherPropertiesEditionComponent);
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
		if (HardwareCacheGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)hardwareCacheGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (HardwareCacheTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)hardwareCacheTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (HardwareCacheOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)hardwareCacheOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
