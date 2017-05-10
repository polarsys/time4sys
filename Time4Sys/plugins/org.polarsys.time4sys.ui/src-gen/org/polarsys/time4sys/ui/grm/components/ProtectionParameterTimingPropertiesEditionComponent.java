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
package org.polarsys.time4sys.ui.grm.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ProtectionParameter;

import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ProtectionParameterTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ProtectionParameterTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject protectionParameter, String editing_mode) {
		super(editingContext, protectionParameter, editing_mode);
		parts = new String[] { TIMING_PART };
		repositoryKey = GrmViewsRepository.class;
		partKey = GrmViewsRepository.Timing.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final ProtectionParameter protectionParameter = (ProtectionParameter)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.Timing.TimingProperties.priorityCeiling)) {
				timingPart.setPriorityCeiling(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, protectionParameter.getPriorityCeiling()));
			}
			
			if (isAccessible(GrmViewsRepository.Timing.TimingProperties.preemptionLevel)) {
				timingPart.setPreemptionLevel(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, protectionParameter.getPreemptionLevel()));
			}
			
			// init filters
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == GrmViewsRepository.Timing.TimingProperties.priorityCeiling) {
			return GrmPackage.eINSTANCE.getProtectionParameter_PriorityCeiling();
		}
		if (editorKey == GrmViewsRepository.Timing.TimingProperties.preemptionLevel) {
			return GrmPackage.eINSTANCE.getProtectionParameter_PreemptionLevel();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ProtectionParameter protectionParameter = (ProtectionParameter)semanticObject;
		if (GrmViewsRepository.Timing.TimingProperties.priorityCeiling == event.getAffectedEditor()) {
			protectionParameter.setPriorityCeiling((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.Timing.TimingProperties.preemptionLevel == event.getAffectedEditor()) {
			protectionParameter.setPreemptionLevel((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			if (GrmPackage.eINSTANCE.getProtectionParameter_PriorityCeiling().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GrmViewsRepository.Timing.TimingProperties.priorityCeiling)) {
				if (msg.getNewValue() != null) {
					timingPart.setPriorityCeiling(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					timingPart.setPriorityCeiling("");
				}
			}
			if (GrmPackage.eINSTANCE.getProtectionParameter_PreemptionLevel().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GrmViewsRepository.Timing.TimingProperties.preemptionLevel)) {
				if (msg.getNewValue() != null) {
					timingPart.setPreemptionLevel(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					timingPart.setPreemptionLevel("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			GrmPackage.eINSTANCE.getProtectionParameter_PriorityCeiling(),
			GrmPackage.eINSTANCE.getProtectionParameter_PreemptionLevel()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.Timing.TimingProperties.priorityCeiling || key == GrmViewsRepository.Timing.TimingProperties.preemptionLevel || key == GrmViewsRepository.Timing.TimingProperties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (GrmViewsRepository.Timing.TimingProperties.priorityCeiling == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getProtectionParameter_PriorityCeiling().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getProtectionParameter_PriorityCeiling().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.Timing.TimingProperties.preemptionLevel == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getProtectionParameter_PreemptionLevel().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getProtectionParameter_PreemptionLevel().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
