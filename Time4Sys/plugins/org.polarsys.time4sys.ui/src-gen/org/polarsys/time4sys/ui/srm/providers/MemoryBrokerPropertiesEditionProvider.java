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
package org.polarsys.time4sys.ui.srm.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

import org.polarsys.time4sys.marte.srm.MemoryBroker;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.srm.components.MemoryBrokerGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.MemoryBrokerOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.MemoryBrokerPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.MemoryBrokerTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class MemoryBrokerPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public MemoryBrokerPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public MemoryBrokerPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof MemoryBroker) 
					&& (SrmPackage.Literals.MEMORY_BROKER == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof MemoryBroker) && (MemoryBrokerGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || MemoryBrokerTimingPropertiesEditionComponent.TIMING_PART.equals(part) || MemoryBrokerOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof MemoryBroker) && (refinement == MemoryBrokerGeneralPropertiesEditionComponent.class || refinement == MemoryBrokerTimingPropertiesEditionComponent.class || refinement == MemoryBrokerOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof MemoryBroker) && ((MemoryBrokerGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == MemoryBrokerGeneralPropertiesEditionComponent.class) || (MemoryBrokerTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == MemoryBrokerTimingPropertiesEditionComponent.class) || (MemoryBrokerOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == MemoryBrokerOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof MemoryBroker) {
			return new MemoryBrokerPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof MemoryBroker) {
			if (MemoryBrokerGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new MemoryBrokerGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryBrokerTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new MemoryBrokerTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryBrokerOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new MemoryBrokerOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof MemoryBroker) {
			if (MemoryBrokerGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == MemoryBrokerGeneralPropertiesEditionComponent.class)
				return new MemoryBrokerGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryBrokerTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == MemoryBrokerTimingPropertiesEditionComponent.class)
				return new MemoryBrokerTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryBrokerOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == MemoryBrokerOtherPropertiesEditionComponent.class)
				return new MemoryBrokerOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

	/**
	 * Provides the filter used by the plugin.xml to assign part forms.
	 */
	public static class EditionFilter implements IFilter {
	
		/**
		 * {@inheritDoc}
		 * 
		 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
		 */
		public boolean select(Object toTest) {
			EObject eObj = EEFUtils.resolveSemanticObject(toTest);
			return eObj != null && SrmPackage.Literals.MEMORY_BROKER == eObj.eClass();
		}
		
	}

}
