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
import org.polarsys.time4sys.marte.gqam.EndToEndFlow;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class EndToEndFlowTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EndToEndFlowTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject endToEndFlow, String editing_mode) {
		super(editingContext, endToEndFlow, editing_mode);
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
			
			final EndToEndFlow endToEndFlow = (EndToEndFlow)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GqamViewsRepository.Timing.TimingProperties.endToEndDeadline))
				timingPart.setEndToEndDeadline(EEFConverterUtil.convertToString(GqamPackage.Literals.NFP_DURATION, endToEndFlow.getEndToEndDeadline()));
			
			if (isAccessible(GqamViewsRepository.Timing.TimingProperties.endToEndTime))
				timingPart.setEndToEndTime(EEFConverterUtil.convertToString(GqamPackage.Literals.NFP_DURATION, endToEndFlow.getEndToEndTime()));
			
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
		if (editorKey == GqamViewsRepository.Timing.TimingProperties.endToEndDeadline) {
			return GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndDeadline();
		}
		if (editorKey == GqamViewsRepository.Timing.TimingProperties.endToEndTime) {
			return GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndTime();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EndToEndFlow endToEndFlow = (EndToEndFlow)semanticObject;
		if (GqamViewsRepository.Timing.TimingProperties.endToEndDeadline == event.getAffectedEditor()) {
			endToEndFlow.setEndToEndDeadline((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(GqamPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (GqamViewsRepository.Timing.TimingProperties.endToEndTime == event.getAffectedEditor()) {
			endToEndFlow.setEndToEndTime((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(GqamPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
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
			if (GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndDeadline().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GqamViewsRepository.Timing.TimingProperties.endToEndDeadline)) {
				if (msg.getNewValue() != null) {
					timingPart.setEndToEndDeadline(EcoreUtil.convertToString(GqamPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					timingPart.setEndToEndDeadline("");
				}
			}
			if (GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GqamViewsRepository.Timing.TimingProperties.endToEndTime)) {
				if (msg.getNewValue() != null) {
					timingPart.setEndToEndTime(EcoreUtil.convertToString(GqamPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					timingPart.setEndToEndTime("");
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
			GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndDeadline(),
			GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndTime()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GqamViewsRepository.Timing.TimingProperties.endToEndDeadline || key == GqamViewsRepository.Timing.TimingProperties.endToEndTime || key == GqamViewsRepository.Timing.TimingProperties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == GqamViewsRepository.General.Properties.endToEndScenario;
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
				if (GqamViewsRepository.Timing.TimingProperties.endToEndDeadline == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndDeadline().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndDeadline().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.Timing.TimingProperties.endToEndTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndTime().getEAttributeType(), newValue);
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
