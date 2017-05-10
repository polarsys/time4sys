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

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceUsage;
import org.polarsys.time4sys.marte.grm.UsageDemand;

import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class UsageDemandPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for usage ReferencesTable
	 */
	private ReferencesTableSettings usageSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public UsageDemandPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject usageDemand, String editing_mode) {
		super(editingContext, usageDemand, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = GrmViewsRepository.class;
		partKey = GrmViewsRepository.General.class;
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
			
			final UsageDemand usageDemand = (UsageDemand)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.General.Properties.usage)) {
				usageSettings = new ReferencesTableSettings(usageDemand, GrmPackage.eINSTANCE.getUsageDemand_Usage());
				generalPart.initUsage(usageSettings);
			}
			if (isAccessible(GrmViewsRepository.General.Properties.event))
				generalPart.setEvent(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, usageDemand.getEvent()));
			
			// init filters
			if (isAccessible(GrmViewsRepository.General.Properties.usage)) {
				generalPart.addFilterToUsage(new EObjectFilter(GrmPackage.Literals.RESOURCE_USAGE));
				// Start of user code for additional businessfilters for usage
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
		if (editorKey == GrmViewsRepository.General.Properties.usage) {
			return GrmPackage.eINSTANCE.getUsageDemand_Usage();
		}
		if (editorKey == GrmViewsRepository.General.Properties.event) {
			return GrmPackage.eINSTANCE.getUsageDemand_Event();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		UsageDemand usageDemand = (UsageDemand)semanticObject;
		if (GrmViewsRepository.General.Properties.usage == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceUsage) {
					usageSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				usageSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				usageSettings.move(event.getNewIndex(), (ResourceUsage) event.getNewValue());
			}
		}
		if (GrmViewsRepository.General.Properties.event == event.getAffectedEditor()) {
			usageDemand.setEvent((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
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
			if (GrmPackage.eINSTANCE.getUsageDemand_Usage().equals(msg.getFeature())  && isAccessible(GrmViewsRepository.General.Properties.usage))
				generalPart.updateUsage();
			if (GrmPackage.eINSTANCE.getUsageDemand_Event().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.event)) {
				if (msg.getNewValue() != null) {
					generalPart.setEvent(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setEvent("");
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
			GrmPackage.eINSTANCE.getUsageDemand_Usage(),
			GrmPackage.eINSTANCE.getUsageDemand_Event()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.General.Properties.usage || key == GrmViewsRepository.General.Properties.event || key == GrmViewsRepository.General.Properties.class;
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
				if (GrmViewsRepository.General.Properties.event == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getUsageDemand_Event().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getUsageDemand_Event().getEAttributeType(), newValue);
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
