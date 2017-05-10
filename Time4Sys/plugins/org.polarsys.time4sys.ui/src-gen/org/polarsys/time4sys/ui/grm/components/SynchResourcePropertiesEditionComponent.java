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

import org.polarsys.time4sys.marte.grm.SynchResource;

import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class SynchResourcePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The SynchResourceGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected SynchResourceGeneralPropertiesEditionComponent synchResourceGeneralPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The SynchResourceOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected SynchResourceOtherPropertiesEditionComponent synchResourceOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param synchResource the EObject to edit
	 * 
	 */
	public SynchResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject synchResource, String editing_mode) {
		super(editingContext, editing_mode);
		if (synchResource instanceof SynchResource) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(synchResource, PropertiesEditingProvider.class);
			synchResourceGeneralPropertiesEditionComponent = (SynchResourceGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SynchResourceGeneralPropertiesEditionComponent.GENERAL_PART, SynchResourceGeneralPropertiesEditionComponent.class);
			addSubComponent(synchResourceGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(synchResource, PropertiesEditingProvider.class);
			synchResourceOtherPropertiesEditionComponent = (SynchResourceOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SynchResourceOtherPropertiesEditionComponent.OTHER_PART, SynchResourceOtherPropertiesEditionComponent.class);
			addSubComponent(synchResourceOtherPropertiesEditionComponent);
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
		if (SynchResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)synchResourceGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (SynchResourceOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)synchResourceOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (key == GrmViewsRepository.Other.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
