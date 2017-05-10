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
package org.polarsys.time4sys.ui.srm.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.polarsys.time4sys.marte.srm.SoftwareResource;

import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class SoftwareResourcePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The SoftwareResourceGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareResourceGeneralPropertiesEditionComponent softwareResourceGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The SoftwareResourceTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareResourceTimingPropertiesEditionComponent softwareResourceTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The SoftwareResourceOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareResourceOtherPropertiesEditionComponent softwareResourceOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param softwareResource the EObject to edit
	 * 
	 */
	public SoftwareResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwareResource, String editing_mode) {
		super(editingContext, editing_mode);
		if (softwareResource instanceof SoftwareResource) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareResource, PropertiesEditingProvider.class);
			softwareResourceGeneralPropertiesEditionComponent = (SoftwareResourceGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareResourceGeneralPropertiesEditionComponent.GENERAL_PART, SoftwareResourceGeneralPropertiesEditionComponent.class);
			addSubComponent(softwareResourceGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareResource, PropertiesEditingProvider.class);
			softwareResourceTimingPropertiesEditionComponent = (SoftwareResourceTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareResourceTimingPropertiesEditionComponent.TIMING_PART, SoftwareResourceTimingPropertiesEditionComponent.class);
			addSubComponent(softwareResourceTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareResource, PropertiesEditingProvider.class);
			softwareResourceOtherPropertiesEditionComponent = (SoftwareResourceOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareResourceOtherPropertiesEditionComponent.OTHER_PART, SoftwareResourceOtherPropertiesEditionComponent.class);
			addSubComponent(softwareResourceOtherPropertiesEditionComponent);
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
		if (SoftwareResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)softwareResourceGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (SoftwareResourceTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)softwareResourceTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (SoftwareResourceOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)softwareResourceOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (SrmViewsRepository.General.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			generalPart = (GeneralPropertiesEditionPart)propertiesEditionPart;
		}
		if (SrmViewsRepository.Timing.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			timingPart = (TimingPropertiesEditionPart)propertiesEditionPart;
		}
		if (SrmViewsRepository.Other.class == key) {
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
		if (key == SrmViewsRepository.General.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == SrmViewsRepository.Timing.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == SrmViewsRepository.Other.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
