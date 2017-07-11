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
import org.polarsys.time4sys.marte.srm.SoftwareArchitecture;
import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class SoftwareArchitecturePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The SoftwareArchitectureGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareArchitectureGeneralPropertiesEditionComponent softwareArchitectureGeneralPropertiesEditionComponent;

	/**
	 * The Timing part
	 * 
	 */
	private TimingPropertiesEditionPart timingPart;

	/**
	 * The SoftwareArchitectureTimingPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareArchitectureTimingPropertiesEditionComponent softwareArchitectureTimingPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The SoftwareArchitectureOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected SoftwareArchitectureOtherPropertiesEditionComponent softwareArchitectureOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param softwareArchitecture the EObject to edit
	 * 
	 */
	public SoftwareArchitecturePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwareArchitecture, String editing_mode) {
		super(editingContext, editing_mode);
		if (softwareArchitecture instanceof SoftwareArchitecture) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareArchitecture, PropertiesEditingProvider.class);
			softwareArchitectureGeneralPropertiesEditionComponent = (SoftwareArchitectureGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART, SoftwareArchitectureGeneralPropertiesEditionComponent.class);
			addSubComponent(softwareArchitectureGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareArchitecture, PropertiesEditingProvider.class);
			softwareArchitectureTimingPropertiesEditionComponent = (SoftwareArchitectureTimingPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareArchitectureTimingPropertiesEditionComponent.TIMING_PART, SoftwareArchitectureTimingPropertiesEditionComponent.class);
			addSubComponent(softwareArchitectureTimingPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(softwareArchitecture, PropertiesEditingProvider.class);
			softwareArchitectureOtherPropertiesEditionComponent = (SoftwareArchitectureOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SoftwareArchitectureOtherPropertiesEditionComponent.OTHER_PART, SoftwareArchitectureOtherPropertiesEditionComponent.class);
			addSubComponent(softwareArchitectureOtherPropertiesEditionComponent);
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
		if (SoftwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)softwareArchitectureGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (SoftwareArchitectureTimingPropertiesEditionComponent.TIMING_PART.equals(key)) {
			timingPart = (TimingPropertiesEditionPart)softwareArchitectureTimingPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)timingPart;
		}
		if (SoftwareArchitectureOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)softwareArchitectureOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
