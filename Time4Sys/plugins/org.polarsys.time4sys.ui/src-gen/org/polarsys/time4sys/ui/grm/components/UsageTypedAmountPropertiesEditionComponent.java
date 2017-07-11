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
import org.polarsys.time4sys.marte.grm.UsageTypedAmount;
import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class UsageTypedAmountPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The UsageTypedAmountGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected UsageTypedAmountGeneralPropertiesEditionComponent usageTypedAmountGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The UsageTypedAmountTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected UsageTypedAmountTimingPropertiesEditionComponent usageTypedAmountTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The UsageTypedAmountOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected UsageTypedAmountOtherPropertiesEditionComponent usageTypedAmountOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param usageTypedAmount the EObject to edit
	 * 
	 */
	public UsageTypedAmountPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject usageTypedAmount, String editing_mode) {
		super(editingContext, editing_mode);
		if (usageTypedAmount instanceof UsageTypedAmount) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(usageTypedAmount, PropertiesEditingProvider.class);
			usageTypedAmountGeneralPropertiesEditionComponent = (UsageTypedAmountGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, UsageTypedAmountGeneralPropertiesEditionComponent.GENERAL_PART, UsageTypedAmountGeneralPropertiesEditionComponent.class);
			addSubComponent(usageTypedAmountGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(usageTypedAmount, PropertiesEditingProvider.class);
			usageTypedAmountTimingPropertiesEditionComponent = (UsageTypedAmountTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, UsageTypedAmountTimingPropertiesEditionComponent.TIMING_PART, UsageTypedAmountTimingPropertiesEditionComponent.class);
			addSubComponent(usageTypedAmountTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(usageTypedAmount, PropertiesEditingProvider.class);
			usageTypedAmountOtherPropertiesEditionComponent = (UsageTypedAmountOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, UsageTypedAmountOtherPropertiesEditionComponent.OTHER_PART, UsageTypedAmountOtherPropertiesEditionComponent.class);
			addSubComponent(usageTypedAmountOtherPropertiesEditionComponent);
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
		if (UsageTypedAmountGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)usageTypedAmountGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (UsageTypedAmountTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)usageTypedAmountTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (UsageTypedAmountOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)usageTypedAmountOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (GrmViewsRepository.General.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			generalPart = (GeneralPropertiesEditionPart)propertiesEditionPart;
		}
		if (GrmViewsRepository.Timing.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			timingPart = (TimingPropertiesEditionPart)propertiesEditionPart;
		}
		if (GrmViewsRepository.Other.class == key) {
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
		if (key == GrmViewsRepository.General.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == GrmViewsRepository.Timing.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == GrmViewsRepository.Other.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
