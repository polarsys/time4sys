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
package org.polarsys.time4sys.ui.hrm.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.polarsys.time4sys.marte.hrm.FirmwareArchitecture;
import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class FirmwareArchitecturePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The FirmwareArchitectureGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected FirmwareArchitectureGeneralPropertiesEditionComponent firmwareArchitectureGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The FirmwareArchitectureTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected FirmwareArchitectureTimingPropertiesEditionComponent firmwareArchitectureTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The FirmwareArchitectureOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected FirmwareArchitectureOtherPropertiesEditionComponent firmwareArchitectureOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param firmwareArchitecture the EObject to edit
	 * 
	 */
	public FirmwareArchitecturePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject firmwareArchitecture, String editing_mode) {
		super(editingContext, editing_mode);
		if (firmwareArchitecture instanceof FirmwareArchitecture) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(firmwareArchitecture, PropertiesEditingProvider.class);
			firmwareArchitectureGeneralPropertiesEditionComponent = (FirmwareArchitectureGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FirmwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART, FirmwareArchitectureGeneralPropertiesEditionComponent.class);
			addSubComponent(firmwareArchitectureGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(firmwareArchitecture, PropertiesEditingProvider.class);
			firmwareArchitectureTimingPropertiesEditionComponent = (FirmwareArchitectureTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FirmwareArchitectureTimingPropertiesEditionComponent.TIMING_PART, FirmwareArchitectureTimingPropertiesEditionComponent.class);
			addSubComponent(firmwareArchitectureTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(firmwareArchitecture, PropertiesEditingProvider.class);
			firmwareArchitectureOtherPropertiesEditionComponent = (FirmwareArchitectureOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FirmwareArchitectureOtherPropertiesEditionComponent.OTHER_PART, FirmwareArchitectureOtherPropertiesEditionComponent.class);
			addSubComponent(firmwareArchitectureOtherPropertiesEditionComponent);
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
		if (FirmwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)firmwareArchitectureGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (FirmwareArchitectureTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)firmwareArchitectureTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (FirmwareArchitectureOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)firmwareArchitectureOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (HrmViewsRepository.General.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			generalPart = (GeneralPropertiesEditionPart)propertiesEditionPart;
		}
		if (HrmViewsRepository.Timing.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			timingPart = (TimingPropertiesEditionPart)propertiesEditionPart;
		}
		if (HrmViewsRepository.Other.class == key) {
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
		if (key == HrmViewsRepository.General.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == HrmViewsRepository.Timing.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == HrmViewsRepository.Other.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
