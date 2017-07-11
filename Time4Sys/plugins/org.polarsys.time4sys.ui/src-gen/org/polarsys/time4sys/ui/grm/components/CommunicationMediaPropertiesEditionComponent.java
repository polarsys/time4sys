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
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class CommunicationMediaPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The CommunicationMediaGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected CommunicationMediaGeneralPropertiesEditionComponent communicationMediaGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The CommunicationMediaTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected CommunicationMediaTimingPropertiesEditionComponent communicationMediaTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The CommunicationMediaOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected CommunicationMediaOtherPropertiesEditionComponent communicationMediaOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param communicationMedia the EObject to edit
	 * 
	 */
	public CommunicationMediaPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject communicationMedia, String editing_mode) {
		super(editingContext, editing_mode);
		if (communicationMedia instanceof CommunicationMedia) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(communicationMedia, PropertiesEditingProvider.class);
			communicationMediaGeneralPropertiesEditionComponent = (CommunicationMediaGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CommunicationMediaGeneralPropertiesEditionComponent.GENERAL_PART, CommunicationMediaGeneralPropertiesEditionComponent.class);
			addSubComponent(communicationMediaGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(communicationMedia, PropertiesEditingProvider.class);
			communicationMediaTimingPropertiesEditionComponent = (CommunicationMediaTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CommunicationMediaTimingPropertiesEditionComponent.TIMING_PART, CommunicationMediaTimingPropertiesEditionComponent.class);
			addSubComponent(communicationMediaTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(communicationMedia, PropertiesEditingProvider.class);
			communicationMediaOtherPropertiesEditionComponent = (CommunicationMediaOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CommunicationMediaOtherPropertiesEditionComponent.OTHER_PART, CommunicationMediaOtherPropertiesEditionComponent.class);
			addSubComponent(communicationMediaOtherPropertiesEditionComponent);
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
		if (CommunicationMediaGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)communicationMediaGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (CommunicationMediaTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)communicationMediaTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (CommunicationMediaOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)communicationMediaOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
