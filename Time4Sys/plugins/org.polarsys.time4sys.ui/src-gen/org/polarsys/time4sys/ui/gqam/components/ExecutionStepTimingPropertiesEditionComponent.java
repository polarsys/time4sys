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
package org.polarsys.time4sys.ui.gqam.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.GqamPackage;

import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ExecutionStepTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ExecutionStepTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject executionStep, String editing_mode) {
		super(editingContext, executionStep, editing_mode);
		parts = new String[] { TIMING_PART };
		repositoryKey = GqamViewsRepository.class;
		partKey = GqamViewsRepository.Timing.class;
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
			
			final ExecutionStep executionStep = (ExecutionStep)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GqamViewsRepository.Timing.TimingProperties.respTime))
				timingPart.setRespTime(EEFConverterUtil.convertToString(GqamPackage.Literals.NFP_DURATION, executionStep.getRespTime()));
			
			if (isAccessible(GqamViewsRepository.Timing.TimingProperties.bestCET))
				timingPart.setBestCET(EEFConverterUtil.convertToString(GqamPackage.Literals.NFP_DURATION, executionStep.getBestCET()));
			
			if (isAccessible(GqamViewsRepository.Timing.TimingProperties.worstCET))
				timingPart.setWorstCET(EEFConverterUtil.convertToString(GqamPackage.Literals.NFP_DURATION, executionStep.getWorstCET()));
			
			if (isAccessible(GqamViewsRepository.Timing.TimingProperties.blockingTime))
				timingPart.setBlockingTime(EEFConverterUtil.convertToString(GqamPackage.Literals.NFP_DURATION, executionStep.getBlockingTime()));
			
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
		if (editorKey == GqamViewsRepository.Timing.TimingProperties.respTime) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_RespTime();
		}
		if (editorKey == GqamViewsRepository.Timing.TimingProperties.bestCET) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_BestCET();
		}
		if (editorKey == GqamViewsRepository.Timing.TimingProperties.worstCET) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_WorstCET();
		}
		if (editorKey == GqamViewsRepository.Timing.TimingProperties.blockingTime) {
			return GqamPackage.eINSTANCE.getStep_BlockingTime();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ExecutionStep executionStep = (ExecutionStep)semanticObject;
		if (GqamViewsRepository.Timing.TimingProperties.respTime == event.getAffectedEditor()) {
			executionStep.setRespTime((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(GqamPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (GqamViewsRepository.Timing.TimingProperties.bestCET == event.getAffectedEditor()) {
			executionStep.setBestCET((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(GqamPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (GqamViewsRepository.Timing.TimingProperties.worstCET == event.getAffectedEditor()) {
			executionStep.setWorstCET((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(GqamPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (GqamViewsRepository.Timing.TimingProperties.blockingTime == event.getAffectedEditor()) {
			executionStep.setBlockingTime((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(GqamPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
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
			if (GqamPackage.eINSTANCE.getBehaviorScenario_RespTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GqamViewsRepository.Timing.TimingProperties.respTime)) {
				if (msg.getNewValue() != null) {
					timingPart.setRespTime(EcoreUtil.convertToString(GqamPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					timingPart.setRespTime("");
				}
			}
			if (GqamPackage.eINSTANCE.getBehaviorScenario_BestCET().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GqamViewsRepository.Timing.TimingProperties.bestCET)) {
				if (msg.getNewValue() != null) {
					timingPart.setBestCET(EcoreUtil.convertToString(GqamPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					timingPart.setBestCET("");
				}
			}
			if (GqamPackage.eINSTANCE.getBehaviorScenario_WorstCET().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GqamViewsRepository.Timing.TimingProperties.worstCET)) {
				if (msg.getNewValue() != null) {
					timingPart.setWorstCET(EcoreUtil.convertToString(GqamPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					timingPart.setWorstCET("");
				}
			}
			if (GqamPackage.eINSTANCE.getStep_BlockingTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GqamViewsRepository.Timing.TimingProperties.blockingTime)) {
				if (msg.getNewValue() != null) {
					timingPart.setBlockingTime(EcoreUtil.convertToString(GqamPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					timingPart.setBlockingTime("");
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
			GqamPackage.eINSTANCE.getBehaviorScenario_RespTime(),
			GqamPackage.eINSTANCE.getBehaviorScenario_BestCET(),
			GqamPackage.eINSTANCE.getBehaviorScenario_WorstCET(),
			GqamPackage.eINSTANCE.getStep_BlockingTime()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GqamViewsRepository.Timing.TimingProperties.respTime || key == GqamViewsRepository.Timing.TimingProperties.bestCET || key == GqamViewsRepository.Timing.TimingProperties.worstCET || key == GqamViewsRepository.Timing.TimingProperties.blockingTime || key == GqamViewsRepository.Timing.TimingProperties.class;
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
				if (GqamViewsRepository.Timing.TimingProperties.respTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getBehaviorScenario_RespTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getBehaviorScenario_RespTime().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.Timing.TimingProperties.bestCET == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getBehaviorScenario_BestCET().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getBehaviorScenario_BestCET().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.Timing.TimingProperties.worstCET == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getBehaviorScenario_WorstCET().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getBehaviorScenario_WorstCET().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.Timing.TimingProperties.blockingTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getStep_BlockingTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getStep_BlockingTime().getEAttributeType(), newValue);
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
