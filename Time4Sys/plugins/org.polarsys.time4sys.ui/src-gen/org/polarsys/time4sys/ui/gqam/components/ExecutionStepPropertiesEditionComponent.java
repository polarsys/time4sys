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

import org.polarsys.time4sys.marte.gqam.ExecutionStep;

import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ExecutionStepPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The ExecutionStepGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected ExecutionStepGeneralPropertiesEditionComponent executionStepGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The ExecutionStepTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected ExecutionStepTimingPropertiesEditionComponent executionStepTimingPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param executionStep the EObject to edit
	 * 
	 */
	public ExecutionStepPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject executionStep, String editing_mode) {
		super(editingContext, editing_mode);
		if (executionStep instanceof ExecutionStep) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(executionStep, PropertiesEditingProvider.class);
			executionStepGeneralPropertiesEditionComponent = (ExecutionStepGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExecutionStepGeneralPropertiesEditionComponent.GENERAL_PART, ExecutionStepGeneralPropertiesEditionComponent.class);
			addSubComponent(executionStepGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(executionStep, PropertiesEditingProvider.class);
			executionStepTimingPropertiesEditionComponent = (ExecutionStepTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExecutionStepTimingPropertiesEditionComponent.TIMING_PART, ExecutionStepTimingPropertiesEditionComponent.class);
			addSubComponent(executionStepTimingPropertiesEditionComponent);
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
		if (ExecutionStepGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)executionStepGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (ExecutionStepTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)executionStepTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
