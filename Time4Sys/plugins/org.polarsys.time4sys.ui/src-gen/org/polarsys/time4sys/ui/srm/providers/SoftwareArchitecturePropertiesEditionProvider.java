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

import org.polarsys.time4sys.marte.srm.SoftwareArchitecture;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.srm.components.SoftwareArchitectureGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SoftwareArchitectureOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SoftwareArchitecturePropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SoftwareArchitectureTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class SoftwareArchitecturePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public SoftwareArchitecturePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public SoftwareArchitecturePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof SoftwareArchitecture) 
					&& (SrmPackage.Literals.SOFTWARE_ARCHITECTURE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof SoftwareArchitecture) && (SoftwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || SoftwareArchitectureTimingPropertiesEditionComponent.TIMING_PART.equals(part) || SoftwareArchitectureOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof SoftwareArchitecture) && (refinement == SoftwareArchitectureGeneralPropertiesEditionComponent.class || refinement == SoftwareArchitectureTimingPropertiesEditionComponent.class || refinement == SoftwareArchitectureOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof SoftwareArchitecture) && ((SoftwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == SoftwareArchitectureGeneralPropertiesEditionComponent.class) || (SoftwareArchitectureTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == SoftwareArchitectureTimingPropertiesEditionComponent.class) || (SoftwareArchitectureOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == SoftwareArchitectureOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof SoftwareArchitecture) {
			return new SoftwareArchitecturePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof SoftwareArchitecture) {
			if (SoftwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new SoftwareArchitectureGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareArchitectureTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new SoftwareArchitectureTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareArchitectureOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new SoftwareArchitectureOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof SoftwareArchitecture) {
			if (SoftwareArchitectureGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == SoftwareArchitectureGeneralPropertiesEditionComponent.class)
				return new SoftwareArchitectureGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareArchitectureTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == SoftwareArchitectureTimingPropertiesEditionComponent.class)
				return new SoftwareArchitectureTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareArchitectureOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == SoftwareArchitectureOtherPropertiesEditionComponent.class)
				return new SoftwareArchitectureOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && SrmPackage.Literals.SOFTWARE_ARCHITECTURE == eObj.eClass();
		}
		
	}

}
