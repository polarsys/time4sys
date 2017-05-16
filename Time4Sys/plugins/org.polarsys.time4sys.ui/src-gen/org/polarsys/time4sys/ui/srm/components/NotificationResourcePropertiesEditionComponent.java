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

import org.polarsys.time4sys.marte.srm.NotificationResource;

import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class NotificationResourcePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The NotificationResourceGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected NotificationResourceGeneralPropertiesEditionComponent notificationResourceGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The NotificationResourceTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected NotificationResourceTimingPropertiesEditionComponent notificationResourceTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The NotificationResourceOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected NotificationResourceOtherPropertiesEditionComponent notificationResourceOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param notificationResource the EObject to edit
	 * 
	 */
	public NotificationResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject notificationResource, String editing_mode) {
		super(editingContext, editing_mode);
		if (notificationResource instanceof NotificationResource) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(notificationResource, PropertiesEditingProvider.class);
			notificationResourceGeneralPropertiesEditionComponent = (NotificationResourceGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, NotificationResourceGeneralPropertiesEditionComponent.GENERAL_PART, NotificationResourceGeneralPropertiesEditionComponent.class);
			addSubComponent(notificationResourceGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(notificationResource, PropertiesEditingProvider.class);
			notificationResourceTimingPropertiesEditionComponent = (NotificationResourceTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, NotificationResourceTimingPropertiesEditionComponent.TIMING_PART, NotificationResourceTimingPropertiesEditionComponent.class);
			addSubComponent(notificationResourceTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(notificationResource, PropertiesEditingProvider.class);
			notificationResourceOtherPropertiesEditionComponent = (NotificationResourceOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, NotificationResourceOtherPropertiesEditionComponent.OTHER_PART, NotificationResourceOtherPropertiesEditionComponent.class);
			addSubComponent(notificationResourceOtherPropertiesEditionComponent);
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
		if (NotificationResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)notificationResourceGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (NotificationResourceTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)notificationResourceTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (NotificationResourceOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)notificationResourceOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
