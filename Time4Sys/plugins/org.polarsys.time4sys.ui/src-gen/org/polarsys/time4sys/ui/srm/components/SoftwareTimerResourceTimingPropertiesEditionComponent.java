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
package org.polarsys.time4sys.ui.srm.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class SoftwareTimerResourceTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoftwareTimerResourceTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwareTimerResource, String editing_mode) {
		super(editingContext, softwareTimerResource, editing_mode);
		parts = new String[] { TIMING_PART };
		repositoryKey = SrmViewsRepository.class;
		partKey = SrmViewsRepository.Timing.class;
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
			
			final SoftwareTimerResource softwareTimerResource = (SoftwareTimerResource)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Timing.Properties.duration)) {
				timingPart.setDuration(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, softwareTimerResource.getDuration()));
			}
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.isPeriodic)) {
				timingPart.setIsPeriodic(softwareTimerResource.isIsPeriodic());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.durationElements))
				timingPart.setDurationElements(softwareTimerResource.getDurationElements());
			
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
		if (editorKey == SrmViewsRepository.Timing.Properties.duration) {
			return GrmPackage.eINSTANCE.getTimerResource_Duration();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.isPeriodic) {
			return GrmPackage.eINSTANCE.getTimerResource_IsPeriodic();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.durationElements) {
			return SrmPackage.eINSTANCE.getSoftwareTimerResource_DurationElements();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoftwareTimerResource softwareTimerResource = (SoftwareTimerResource)semanticObject;
		if (SrmViewsRepository.Timing.Properties.duration == event.getAffectedEditor()) {
			softwareTimerResource.setDuration((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(NfpPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (SrmViewsRepository.Timing.Properties.isPeriodic == event.getAffectedEditor()) {
			softwareTimerResource.setIsPeriodic((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.durationElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				softwareTimerResource.getDurationElements().clear();
				softwareTimerResource.getDurationElements().addAll(((EList) event.getNewValue()));
			}
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
			if (GrmPackage.eINSTANCE.getTimerResource_Duration().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.duration)) {
				if (msg.getNewValue() != null) {
					timingPart.setDuration(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					timingPart.setDuration("");
				}
			}
			if (GrmPackage.eINSTANCE.getTimerResource_IsPeriodic().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.isPeriodic))
				timingPart.setIsPeriodic((Boolean)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getSoftwareTimerResource_DurationElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.durationElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					timingPart.setDurationElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					timingPart.setDurationElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					timingPart.setDurationElements(newValueAsList);
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
			GrmPackage.eINSTANCE.getTimerResource_Duration(),
			GrmPackage.eINSTANCE.getTimerResource_IsPeriodic(),
			SrmPackage.eINSTANCE.getSoftwareTimerResource_DurationElements()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Timing.Properties.duration || key == SrmViewsRepository.Timing.Properties.isPeriodic || key == SrmViewsRepository.Timing.Properties.durationElements || key == SrmViewsRepository.Timing.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.start || key == SrmViewsRepository.General.Properties.set || key == SrmViewsRepository.General.Properties.get || key == SrmViewsRepository.General.Properties.reset || key == SrmViewsRepository.General.Properties.pause;
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
				if (SrmViewsRepository.Timing.Properties.duration == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getTimerResource_Duration().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getTimerResource_Duration().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.isPeriodic == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getTimerResource_IsPeriodic().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getTimerResource_IsPeriodic().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.durationElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareTimerResource_DurationElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
