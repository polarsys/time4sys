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
package org.polarsys.time4sys.ui.analysis.components;

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

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.Offset;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.OffsetPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class OffsetPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for eventModel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings eventModelSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public OffsetPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject offset, String editing_mode) {
		super(editingContext, offset, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.Offset.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * @generated
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Offset offset = (Offset)elt;
			final OffsetPropertiesEditionPart basePart = (OffsetPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.Offset.Properties.eventModel)) {
				// init part
				eventModelSettings = new EObjectFlatComboSettings(offset, AnalysisPackage.eINSTANCE.getOffset_EventModel());
				basePart.initEventModel(eventModelSettings);
				// set the button mode
				basePart.setEventModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Offset.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, offset.getValue()));
			
			if (isAccessible(AnalysisViewsRepository.Offset.Properties.reference))
				basePart.setReference(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, offset.getReference()));
			
			// init filters
			if (isAccessible(AnalysisViewsRepository.Offset.Properties.eventModel)) {
				basePart.addFilterToEventModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof EventModel);
					}
					
				});
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
		if (editorKey == AnalysisViewsRepository.Offset.Properties.eventModel) {
			return AnalysisPackage.eINSTANCE.getOffset_EventModel();
		}
		if (editorKey == AnalysisViewsRepository.Offset.Properties.value) {
			return AnalysisPackage.eINSTANCE.getOffset_Value();
		}
		if (editorKey == AnalysisViewsRepository.Offset.Properties.reference) {
			return AnalysisPackage.eINSTANCE.getOffset_Reference();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Offset offset = (Offset)semanticObject;
		if (AnalysisViewsRepository.Offset.Properties.eventModel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				eventModelSettings.setToReference((EventModel)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EventModel eObject = AnalysisFactory.eINSTANCE.createEventModel();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				eventModelSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Offset.Properties.value == event.getAffectedEditor()) {
			offset.setValue((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.Offset.Properties.reference == event.getAffectedEditor()) {
			offset.setReference((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			OffsetPropertiesEditionPart basePart = (OffsetPropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getOffset_EventModel().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Offset.Properties.eventModel))
				basePart.setEventModel((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getOffset_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Offset.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getOffset_Reference().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Offset.Properties.reference)) {
				if (msg.getNewValue() != null) {
					basePart.setReference(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setReference("");
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
			AnalysisPackage.eINSTANCE.getOffset_EventModel(),
			AnalysisPackage.eINSTANCE.getOffset_Value(),
			AnalysisPackage.eINSTANCE.getOffset_Reference()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.Offset.Properties.eventModel || key == AnalysisViewsRepository.Offset.Properties.value;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (AnalysisViewsRepository.Offset.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getOffset_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getOffset_Value().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Offset.Properties.reference == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getOffset_Reference().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getOffset_Reference().getEAttributeType(), newValue);
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
