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

import org.polarsys.time4sys.marte.hrm.HardwareWatchdog;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

import org.polarsys.time4sys.ui.hrm.components.HardwareWatchdogGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareWatchdogOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareWatchdogPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareWatchdogTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class HardwareWatchdogPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public HardwareWatchdogPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public HardwareWatchdogPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof HardwareWatchdog) 
					&& (HrmPackage.Literals.HARDWARE_WATCHDOG == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof HardwareWatchdog) && (HardwareWatchdogGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || HardwareWatchdogTimingPropertiesEditionComponent.TIMING_PART.equals(part) || HardwareWatchdogOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof HardwareWatchdog) && (refinement == HardwareWatchdogGeneralPropertiesEditionComponent.class || refinement == HardwareWatchdogTimingPropertiesEditionComponent.class || refinement == HardwareWatchdogOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof HardwareWatchdog) && ((HardwareWatchdogGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == HardwareWatchdogGeneralPropertiesEditionComponent.class) || (HardwareWatchdogTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == HardwareWatchdogTimingPropertiesEditionComponent.class) || (HardwareWatchdogOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == HardwareWatchdogOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof HardwareWatchdog) {
			return new HardwareWatchdogPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof HardwareWatchdog) {
			if (HardwareWatchdogGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new HardwareWatchdogGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareWatchdogTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new HardwareWatchdogTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareWatchdogOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new HardwareWatchdogOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof HardwareWatchdog) {
			if (HardwareWatchdogGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == HardwareWatchdogGeneralPropertiesEditionComponent.class)
				return new HardwareWatchdogGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareWatchdogTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == HardwareWatchdogTimingPropertiesEditionComponent.class)
				return new HardwareWatchdogTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareWatchdogOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == HardwareWatchdogOtherPropertiesEditionComponent.class)
				return new HardwareWatchdogOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && HrmPackage.Literals.HARDWARE_WATCHDOG == eObj.eClass();
		}
		
	}

}
