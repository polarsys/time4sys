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

import org.polarsys.time4sys.marte.srm.SoftwareScheduler;

import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class SoftwareSchedulerPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The SoftwareSchedulerGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareSchedulerGeneralPropertiesEditionComponent softwareSchedulerGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The SoftwareSchedulerTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareSchedulerTimingPropertiesEditionComponent softwareSchedulerTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The SoftwareSchedulerOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareSchedulerOtherPropertiesEditionComponent softwareSchedulerOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param softwareScheduler the EObject to edit
	 * 
	 */
	public SoftwareSchedulerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwareScheduler, String editing_mode) {
		super(editingContext, editing_mode);
		if (softwareScheduler instanceof SoftwareScheduler) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareScheduler, PropertiesEditingProvider.class);
			softwareSchedulerGeneralPropertiesEditionComponent = (SoftwareSchedulerGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareSchedulerGeneralPropertiesEditionComponent.GENERAL_PART, SoftwareSchedulerGeneralPropertiesEditionComponent.class);
			addSubComponent(softwareSchedulerGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareScheduler, PropertiesEditingProvider.class);
			softwareSchedulerTimingPropertiesEditionComponent = (SoftwareSchedulerTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareSchedulerTimingPropertiesEditionComponent.TIMING_PART, SoftwareSchedulerTimingPropertiesEditionComponent.class);
			addSubComponent(softwareSchedulerTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareScheduler, PropertiesEditingProvider.class);
			softwareSchedulerOtherPropertiesEditionComponent = (SoftwareSchedulerOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareSchedulerOtherPropertiesEditionComponent.OTHER_PART, SoftwareSchedulerOtherPropertiesEditionComponent.class);
			addSubComponent(softwareSchedulerOtherPropertiesEditionComponent);
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
		if (SoftwareSchedulerGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)softwareSchedulerGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (SoftwareSchedulerTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)softwareSchedulerTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (SoftwareSchedulerOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)softwareSchedulerOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
