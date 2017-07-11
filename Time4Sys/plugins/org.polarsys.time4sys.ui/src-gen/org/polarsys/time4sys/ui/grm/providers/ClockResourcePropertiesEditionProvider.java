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
package org.polarsys.time4sys.ui.grm.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;
import org.eclipse.jface.viewers.IFilter;
import org.polarsys.time4sys.marte.grm.ClockResource;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.ui.grm.components.ClockResourceGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.ClockResourceOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.ClockResourcePropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.ClockResourceTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class ClockResourcePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public ClockResourcePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public ClockResourcePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof ClockResource) 
					&& (GrmPackage.Literals.CLOCK_RESOURCE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof ClockResource) && (ClockResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || ClockResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) || ClockResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof ClockResource) && (refinement == ClockResourceGeneralPropertiesEditionComponent.class || refinement == ClockResourceTimingPropertiesEditionComponent.class || refinement == ClockResourceOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof ClockResource) && ((ClockResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == ClockResourceGeneralPropertiesEditionComponent.class) || (ClockResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == ClockResourceTimingPropertiesEditionComponent.class) || (ClockResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == ClockResourceOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof ClockResource) {
			return new ClockResourcePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof ClockResource) {
			if (ClockResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new ClockResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ClockResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new ClockResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ClockResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new ClockResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof ClockResource) {
			if (ClockResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == ClockResourceGeneralPropertiesEditionComponent.class)
				return new ClockResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ClockResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == ClockResourceTimingPropertiesEditionComponent.class)
				return new ClockResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ClockResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == ClockResourceOtherPropertiesEditionComponent.class)
				return new ClockResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && GrmPackage.Literals.CLOCK_RESOURCE == eObj.eClass();
		}
		
	}

}
