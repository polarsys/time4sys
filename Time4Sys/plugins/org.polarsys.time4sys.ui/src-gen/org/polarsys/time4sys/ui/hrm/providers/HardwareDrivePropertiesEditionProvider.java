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
import org.polarsys.time4sys.marte.hrm.HardwareDrive;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.hrm.components.HardwareDriveGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareDriveOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareDrivePropertiesEditionComponent;
import org.polarsys.time4sys.ui.hrm.components.HardwareDriveTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class HardwareDrivePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public HardwareDrivePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public HardwareDrivePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof HardwareDrive) 
					&& (HrmPackage.Literals.HARDWARE_DRIVE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof HardwareDrive) && (HardwareDriveGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || HardwareDriveTimingPropertiesEditionComponent.TIMING_PART.equals(part) || HardwareDriveOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof HardwareDrive) && (refinement == HardwareDriveGeneralPropertiesEditionComponent.class || refinement == HardwareDriveTimingPropertiesEditionComponent.class || refinement == HardwareDriveOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof HardwareDrive) && ((HardwareDriveGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == HardwareDriveGeneralPropertiesEditionComponent.class) || (HardwareDriveTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == HardwareDriveTimingPropertiesEditionComponent.class) || (HardwareDriveOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == HardwareDriveOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof HardwareDrive) {
			return new HardwareDrivePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof HardwareDrive) {
			if (HardwareDriveGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new HardwareDriveGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareDriveTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new HardwareDriveTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareDriveOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new HardwareDriveOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof HardwareDrive) {
			if (HardwareDriveGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == HardwareDriveGeneralPropertiesEditionComponent.class)
				return new HardwareDriveGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareDriveTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == HardwareDriveTimingPropertiesEditionComponent.class)
				return new HardwareDriveTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (HardwareDriveOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == HardwareDriveOtherPropertiesEditionComponent.class)
				return new HardwareDriveOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && HrmPackage.Literals.HARDWARE_DRIVE == eObj.eClass();
		}
		
	}

}
