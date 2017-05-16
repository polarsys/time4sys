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
package org.polarsys.time4sys.ui.nfp.components;

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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

import org.polarsys.time4sys.ui.views.nfp.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.nfp.parts.NfpViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class TimeIntervalPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for min EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings minSettings;
	
	/**
	 * Settings for max EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings maxSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimeIntervalPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timeInterval, String editing_mode) {
		super(editingContext, timeInterval, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = NfpViewsRepository.class;
		partKey = NfpViewsRepository.General.class;
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
			
			final TimeInterval timeInterval = (TimeInterval)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(NfpViewsRepository.General.Properties.min)) {
				// init part
				minSettings = new EObjectFlatComboSettings(timeInterval, NfpPackage.eINSTANCE.getTimeInterval_Min());
				generalPart.initMin(minSettings);
				// set the button mode
				generalPart.setMinButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NfpViewsRepository.General.Properties.max)) {
				// init part
				maxSettings = new EObjectFlatComboSettings(timeInterval, NfpPackage.eINSTANCE.getTimeInterval_Max());
				generalPart.initMax(maxSettings);
				// set the button mode
				generalPart.setMaxButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NfpViewsRepository.General.Properties.minOpen)) {
				generalPart.setMinOpen(timeInterval.isMinOpen());
			}
			if (isAccessible(NfpViewsRepository.General.Properties.maxOpen)) {
				generalPart.setMaxOpen(timeInterval.isMaxOpen());
			}
			// init filters
			if (isAccessible(NfpViewsRepository.General.Properties.min)) {
				generalPart.addFilterToMin(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Duration);
					}
					
				});
				// Start of user code for additional businessfilters for min
				// End of user code
			}
			if (isAccessible(NfpViewsRepository.General.Properties.max)) {
				generalPart.addFilterToMax(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Duration);
					}
					
				});
				// Start of user code for additional businessfilters for max
				// End of user code
			}
			
			
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
		if (editorKey == NfpViewsRepository.General.Properties.min) {
			return NfpPackage.eINSTANCE.getTimeInterval_Min();
		}
		if (editorKey == NfpViewsRepository.General.Properties.max) {
			return NfpPackage.eINSTANCE.getTimeInterval_Max();
		}
		if (editorKey == NfpViewsRepository.General.Properties.minOpen) {
			return NfpPackage.eINSTANCE.getTimeInterval_MinOpen();
		}
		if (editorKey == NfpViewsRepository.General.Properties.maxOpen) {
			return NfpPackage.eINSTANCE.getTimeInterval_MaxOpen();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimeInterval timeInterval = (TimeInterval)semanticObject;
		if (NfpViewsRepository.General.Properties.min == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				minSettings.setToReference((Duration)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Duration eObject = NfpFactory.eINSTANCE.createDuration();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				minSettings.setToReference(eObject);
			}
		}
		if (NfpViewsRepository.General.Properties.max == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				maxSettings.setToReference((Duration)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Duration eObject = NfpFactory.eINSTANCE.createDuration();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				maxSettings.setToReference(eObject);
			}
		}
		if (NfpViewsRepository.General.Properties.minOpen == event.getAffectedEditor()) {
			timeInterval.setMinOpen((Boolean)event.getNewValue());
		}
		if (NfpViewsRepository.General.Properties.maxOpen == event.getAffectedEditor()) {
			timeInterval.setMaxOpen((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			if (NfpPackage.eINSTANCE.getTimeInterval_Min().equals(msg.getFeature()) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.min))
				generalPart.setMin((EObject)msg.getNewValue());
			if (NfpPackage.eINSTANCE.getTimeInterval_Max().equals(msg.getFeature()) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.max))
				generalPart.setMax((EObject)msg.getNewValue());
			if (NfpPackage.eINSTANCE.getTimeInterval_MinOpen().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.minOpen))
				generalPart.setMinOpen((Boolean)msg.getNewValue());
			
			if (NfpPackage.eINSTANCE.getTimeInterval_MaxOpen().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.maxOpen))
				generalPart.setMaxOpen((Boolean)msg.getNewValue());
			
			
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
			NfpPackage.eINSTANCE.getTimeInterval_Min(),
			NfpPackage.eINSTANCE.getTimeInterval_Max(),
			NfpPackage.eINSTANCE.getTimeInterval_MinOpen(),
			NfpPackage.eINSTANCE.getTimeInterval_MaxOpen()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == NfpViewsRepository.General.Properties.min || key == NfpViewsRepository.General.Properties.max || key == NfpViewsRepository.General.Properties.minOpen || key == NfpViewsRepository.General.Properties.maxOpen || key == NfpViewsRepository.General.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == NfpViewsRepository.General.Properties.min || key == NfpViewsRepository.General.Properties.max || key == NfpViewsRepository.General.Properties.minOpen || key == NfpViewsRepository.General.Properties.maxOpen;
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
				if (NfpViewsRepository.General.Properties.minOpen == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getTimeInterval_MinOpen().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getTimeInterval_MinOpen().getEAttributeType(), newValue);
				}
				if (NfpViewsRepository.General.Properties.maxOpen == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getTimeInterval_MaxOpen().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getTimeInterval_MaxOpen().getEAttributeType(), newValue);
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
