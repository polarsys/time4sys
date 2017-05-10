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

import org.polarsys.time4sys.marte.grm.ResourceBroker;

import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ResourceBrokerPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The ResourceBrokerGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected ResourceBrokerGeneralPropertiesEditionComponent resourceBrokerGeneralPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The ResourceBrokerOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected ResourceBrokerOtherPropertiesEditionComponent resourceBrokerOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param resourceBroker the EObject to edit
	 * 
	 */
	public ResourceBrokerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject resourceBroker, String editing_mode) {
		super(editingContext, editing_mode);
		if (resourceBroker instanceof ResourceBroker) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(resourceBroker, PropertiesEditingProvider.class);
			resourceBrokerGeneralPropertiesEditionComponent = (ResourceBrokerGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ResourceBrokerGeneralPropertiesEditionComponent.GENERAL_PART, ResourceBrokerGeneralPropertiesEditionComponent.class);
			addSubComponent(resourceBrokerGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(resourceBroker, PropertiesEditingProvider.class);
			resourceBrokerOtherPropertiesEditionComponent = (ResourceBrokerOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ResourceBrokerOtherPropertiesEditionComponent.OTHER_PART, ResourceBrokerOtherPropertiesEditionComponent.class);
			addSubComponent(resourceBrokerOtherPropertiesEditionComponent);
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
		if (ResourceBrokerGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)resourceBrokerGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (ResourceBrokerOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)resourceBrokerOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
