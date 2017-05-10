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

import org.polarsys.time4sys.marte.gqam.BehaviorScenario;

import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class BehaviorScenarioPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The BehaviorScenarioGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected BehaviorScenarioGeneralPropertiesEditionComponent behaviorScenarioGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The BehaviorScenarioTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected BehaviorScenarioTimingPropertiesEditionComponent behaviorScenarioTimingPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param behaviorScenario the EObject to edit
	 * 
	 */
	public BehaviorScenarioPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject behaviorScenario, String editing_mode) {
		super(editingContext, editing_mode);
		if (behaviorScenario instanceof BehaviorScenario) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(behaviorScenario, PropertiesEditingProvider.class);
			behaviorScenarioGeneralPropertiesEditionComponent = (BehaviorScenarioGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BehaviorScenarioGeneralPropertiesEditionComponent.GENERAL_PART, BehaviorScenarioGeneralPropertiesEditionComponent.class);
			addSubComponent(behaviorScenarioGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(behaviorScenario, PropertiesEditingProvider.class);
			behaviorScenarioTimingPropertiesEditionComponent = (BehaviorScenarioTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BehaviorScenarioTimingPropertiesEditionComponent.TIMING_PART, BehaviorScenarioTimingPropertiesEditionComponent.class);
			addSubComponent(behaviorScenarioTimingPropertiesEditionComponent);
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
		if (BehaviorScenarioGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)behaviorScenarioGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (BehaviorScenarioTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)behaviorScenarioTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
