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
package org.polarsys.time4sys.ui.hrm.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

import org.polarsys.time4sys.ui.hrm.components.HardwareArbiterGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareArbiterOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareArbiterPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareArbiterTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class HardwareArbiterPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public HardwareArbiterPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public HardwareArbiterPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof HardwareArbiter) 
					&& (HrmPackage.Literals.HARDWARE_ARBITER == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof HardwareArbiter) && (HardwareArbiterGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || HardwareArbiterTimingPropertiesEditionComponent.TIMING_PART.equals(part) || HardwareArbiterOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof HardwareArbiter) && (refinement == HardwareArbiterGeneralPropertiesEditionComponent.class || refinement == HardwareArbiterTimingPropertiesEditionComponent.class || refinement == HardwareArbiterOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof HardwareArbiter) && ((HardwareArbiterGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == HardwareArbiterGeneralPropertiesEditionComponent.class) || (HardwareArbiterTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == HardwareArbiterTimingPropertiesEditionComponent.class) || (HardwareArbiterOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == HardwareArbiterOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof HardwareArbiter) {
			return new HardwareArbiterPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof HardwareArbiter) {
			if (HardwareArbiterGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new HardwareArbiterGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareArbiterTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new HardwareArbiterTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareArbiterOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new HardwareArbiterOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof HardwareArbiter) {
			if (HardwareArbiterGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == HardwareArbiterGeneralPropertiesEditionComponent.class)
				return new HardwareArbiterGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareArbiterTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == HardwareArbiterTimingPropertiesEditionComponent.class)
				return new HardwareArbiterTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareArbiterOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == HardwareArbiterOtherPropertiesEditionComponent.class)
				return new HardwareArbiterOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && HrmPackage.Literals.HARDWARE_ARBITER == eObj.eClass();
		}
		
	}

}
