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
package org.polarsys.time4sys.ui.library.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.polarsys.time4sys.library.HardwareCANBus;
import org.polarsys.time4sys.ui.views.library.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.library.parts.LibraryViewsRepository;
import org.polarsys.time4sys.ui.views.library.parts.OtherPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class HardwareCANBusPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The General part
	 * 
	 */
	private GeneralPropertiesEditionPart generalPart;

	/**
	 * The HardwareCANBusGeneralPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareCANBusGeneralPropertiesEditionComponent hardwareCANBusGeneralPropertiesEditionComponent;

	/**
	 * The Other part
	 * 
	 */
	private OtherPropertiesEditionPart otherPart;

	/**
	 * The HardwareCANBusOtherPropertiesEditionComponent sub component
	 * 
	 */
	protected HardwareCANBusOtherPropertiesEditionComponent hardwareCANBusOtherPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hardwareCANBus the EObject to edit
	 * 
	 */
	public HardwareCANBusPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareCANBus, String editing_mode) {
		super(editingContext, editing_mode);
		if (hardwareCANBus instanceof HardwareCANBus) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareCANBus, PropertiesEditingProvider.class);
			hardwareCANBusGeneralPropertiesEditionComponent = (HardwareCANBusGeneralPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareCANBusGeneralPropertiesEditionComponent.GENERAL_PART, HardwareCANBusGeneralPropertiesEditionComponent.class);
			addSubComponent(hardwareCANBusGeneralPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hardwareCANBus, PropertiesEditingProvider.class);
			hardwareCANBusOtherPropertiesEditionComponent = (HardwareCANBusOtherPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HardwareCANBusOtherPropertiesEditionComponent.OTHER_PART, HardwareCANBusOtherPropertiesEditionComponent.class);
			addSubComponent(hardwareCANBusOtherPropertiesEditionComponent);
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
		if (HardwareCANBusGeneralPropertiesEditionComponent.GENERAL_PART.equals(key)) {
			generalPart = (GeneralPropertiesEditionPart)hardwareCANBusGeneralPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)generalPart;
		}
		if (HardwareCANBusOtherPropertiesEditionComponent.OTHER_PART.equals(key)) {
			otherPart = (OtherPropertiesEditionPart)hardwareCANBusOtherPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (LibraryViewsRepository.General.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			generalPart = (GeneralPropertiesEditionPart)propertiesEditionPart;
		}
		if (LibraryViewsRepository.Other.class == key) {
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
		if (key == LibraryViewsRepository.General.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == LibraryViewsRepository.Other.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
