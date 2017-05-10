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

import org.polarsys.time4sys.marte.srm.InterruptResource;

import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class InterruptResourcePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The InterruptResourceGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected InterruptResourceGeneralPropertiesEditionComponent interruptResourceGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The InterruptResourceTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected InterruptResourceTimingPropertiesEditionComponent interruptResourceTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The InterruptResourceOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected InterruptResourceOtherPropertiesEditionComponent interruptResourceOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param interruptResource the EObject to edit
	 * 
	 */
	public InterruptResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject interruptResource, String editing_mode) {
		super(editingContext, editing_mode);
		if (interruptResource instanceof InterruptResource) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(interruptResource, PropertiesEditingProvider.class);
			interruptResourceGeneralPropertiesEditionComponent = (InterruptResourceGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, InterruptResourceGeneralPropertiesEditionComponent.GENERAL_PART, InterruptResourceGeneralPropertiesEditionComponent.class);
			addSubComponent(interruptResourceGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(interruptResource, PropertiesEditingProvider.class);
			interruptResourceTimingPropertiesEditionComponent = (InterruptResourceTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, InterruptResourceTimingPropertiesEditionComponent.TIMING_PART, InterruptResourceTimingPropertiesEditionComponent.class);
			addSubComponent(interruptResourceTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(interruptResource, PropertiesEditingProvider.class);
			interruptResourceOtherPropertiesEditionComponent = (InterruptResourceOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, InterruptResourceOtherPropertiesEditionComponent.OTHER_PART, InterruptResourceOtherPropertiesEditionComponent.class);
			addSubComponent(interruptResourceOtherPropertiesEditionComponent);
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
		if (InterruptResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)interruptResourceGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (InterruptResourceTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)interruptResourceTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (InterruptResourceOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)interruptResourceOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
