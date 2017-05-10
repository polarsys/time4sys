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

import org.polarsys.time4sys.marte.srm.DeviceBroker;

import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class DeviceBrokerPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The DeviceBrokerGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected DeviceBrokerGeneralPropertiesEditionComponent deviceBrokerGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The DeviceBrokerTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected DeviceBrokerTimingPropertiesEditionComponent deviceBrokerTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The DeviceBrokerOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected DeviceBrokerOtherPropertiesEditionComponent deviceBrokerOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param deviceBroker the EObject to edit
	 * 
	 */
	public DeviceBrokerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deviceBroker, String editing_mode) {
		super(editingContext, editing_mode);
		if (deviceBroker instanceof DeviceBroker) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(deviceBroker, PropertiesEditingProvider.class);
			deviceBrokerGeneralPropertiesEditionComponent = (DeviceBrokerGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DeviceBrokerGeneralPropertiesEditionComponent.GENERAL_PART, DeviceBrokerGeneralPropertiesEditionComponent.class);
			addSubComponent(deviceBrokerGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(deviceBroker, PropertiesEditingProvider.class);
			deviceBrokerTimingPropertiesEditionComponent = (DeviceBrokerTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DeviceBrokerTimingPropertiesEditionComponent.TIMING_PART, DeviceBrokerTimingPropertiesEditionComponent.class);
			addSubComponent(deviceBrokerTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(deviceBroker, PropertiesEditingProvider.class);
			deviceBrokerOtherPropertiesEditionComponent = (DeviceBrokerOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DeviceBrokerOtherPropertiesEditionComponent.OTHER_PART, DeviceBrokerOtherPropertiesEditionComponent.class);
			addSubComponent(deviceBrokerOtherPropertiesEditionComponent);
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
		if (DeviceBrokerGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)deviceBrokerGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (DeviceBrokerTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)deviceBrokerTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (DeviceBrokerOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)deviceBrokerOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
