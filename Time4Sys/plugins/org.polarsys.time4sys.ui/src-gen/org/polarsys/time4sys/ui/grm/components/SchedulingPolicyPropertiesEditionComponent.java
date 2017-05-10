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
package org.polarsys.time4sys.ui.grm.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.polarsys.time4sys.marte.grm.SchedulingPolicy;

import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class SchedulingPolicyPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The SchedulingPolicyGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected SchedulingPolicyGeneralPropertiesEditionComponent schedulingPolicyGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The SchedulingPolicyTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected SchedulingPolicyTimingPropertiesEditionComponent schedulingPolicyTimingPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param schedulingPolicy the EObject to edit
	 * 
	 */
	public SchedulingPolicyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject schedulingPolicy, String editing_mode) {
		super(editingContext, editing_mode);
		if (schedulingPolicy instanceof SchedulingPolicy) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(schedulingPolicy, PropertiesEditingProvider.class);
			schedulingPolicyGeneralPropertiesEditionComponent = (SchedulingPolicyGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SchedulingPolicyGeneralPropertiesEditionComponent.GENERAL_PART, SchedulingPolicyGeneralPropertiesEditionComponent.class);
			addSubComponent(schedulingPolicyGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(schedulingPolicy, PropertiesEditingProvider.class);
			schedulingPolicyTimingPropertiesEditionComponent = (SchedulingPolicyTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SchedulingPolicyTimingPropertiesEditionComponent.TIMING_PART, SchedulingPolicyTimingPropertiesEditionComponent.class);
			addSubComponent(schedulingPolicyTimingPropertiesEditionComponent);
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
		if (SchedulingPolicyGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)schedulingPolicyGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (SchedulingPolicyTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)schedulingPolicyTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
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
		if (GrmViewsRepository.General.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			generalPart = (GeneralPropertiesEditionPart)propertiesEditionPart;
		}
		if (GrmViewsRepository.Timing.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			timingPart = (TimingPropertiesEditionPart)propertiesEditionPart;
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
		if (key == GrmViewsRepository.General.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == GrmViewsRepository.Timing.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
