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
package org.polarsys.time4sys.ui.gqam.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.polarsys.time4sys.marte.gqam.CommunicationStep;

import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class CommunicationStepPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The CommunicationStepGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected CommunicationStepGeneralPropertiesEditionComponent communicationStepGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The CommunicationStepTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected CommunicationStepTimingPropertiesEditionComponent communicationStepTimingPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param communicationStep the EObject to edit
	 * 
	 */
	public CommunicationStepPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject communicationStep, String editing_mode) {
		super(editingContext, editing_mode);
		if (communicationStep instanceof CommunicationStep) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(communicationStep, PropertiesEditingProvider.class);
			communicationStepGeneralPropertiesEditionComponent = (CommunicationStepGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CommunicationStepGeneralPropertiesEditionComponent.GENERAL_PART, CommunicationStepGeneralPropertiesEditionComponent.class);
			addSubComponent(communicationStepGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(communicationStep, PropertiesEditingProvider.class);
			communicationStepTimingPropertiesEditionComponent = (CommunicationStepTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CommunicationStepTimingPropertiesEditionComponent.TIMING_PART, CommunicationStepTimingPropertiesEditionComponent.class);
			addSubComponent(communicationStepTimingPropertiesEditionComponent);
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
		if (CommunicationStepGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)communicationStepGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (CommunicationStepTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)communicationStepTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (GqamViewsRepository.General.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			generalPart = (GeneralPropertiesEditionPart)propertiesEditionPart;
		}
		if (GqamViewsRepository.Timing.class == key) {
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
		if (key == GqamViewsRepository.General.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == GqamViewsRepository.Timing.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
