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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.MutualExclusionProtocol;
import org.polarsys.time4sys.marte.grm.ProtectProtocolKind;

import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MutualExclusionProtocolPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public MutualExclusionProtocolPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject mutualExclusionProtocol, String editing_mode) {
		super(editingContext, mutualExclusionProtocol, editing_mode);
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
			
			final MutualExclusionProtocol mutualExclusionProtocol = (MutualExclusionProtocol)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mutualExclusionProtocol.getName()));
			
			if (isAccessible(GrmViewsRepository.General.Properties.protocol)) {
				generalPart.initProtocol(EEFUtils.choiceOfValues(mutualExclusionProtocol, GrmPackage.eINSTANCE.getMutualExclusionProtocol_Protocol()), mutualExclusionProtocol.getProtocol());
			}
			if (isAccessible(GrmViewsRepository.General.Properties.otherProtocol))
				generalPart.setOtherProtocol(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mutualExclusionProtocol.getOtherProtocol()));
			
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
		if (editorKey == GrmViewsRepository.General.Properties.name) {
			return GrmPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == GrmViewsRepository.General.Properties.protocol) {
			return GrmPackage.eINSTANCE.getMutualExclusionProtocol_Protocol();
		}
		if (editorKey == GrmViewsRepository.General.Properties.otherProtocol) {
			return GrmPackage.eINSTANCE.getMutualExclusionProtocol_OtherProtocol();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MutualExclusionProtocol mutualExclusionProtocol = (MutualExclusionProtocol)semanticObject;
		if (GrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			mutualExclusionProtocol.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GrmViewsRepository.General.Properties.protocol == event.getAffectedEditor()) {
			mutualExclusionProtocol.setProtocol((ProtectProtocolKind)event.getNewValue());
		}
		if (GrmViewsRepository.General.Properties.otherProtocol == event.getAffectedEditor()) {
			mutualExclusionProtocol.setOtherProtocol((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
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
			if (GrmPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.name)) {
				if (msg.getNewValue() != null) {
					generalPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setName("");
				}
			}
			if (GrmPackage.eINSTANCE.getMutualExclusionProtocol_Protocol().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(GrmViewsRepository.General.Properties.protocol))
				generalPart.setProtocol((ProtectProtocolKind)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getMutualExclusionProtocol_OtherProtocol().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.otherProtocol)) {
				if (msg.getNewValue() != null) {
					generalPart.setOtherProtocol(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setOtherProtocol("");
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
			GrmPackage.eINSTANCE.getNamedElement_Name(),
			GrmPackage.eINSTANCE.getMutualExclusionProtocol_Protocol(),
			GrmPackage.eINSTANCE.getMutualExclusionProtocol_OtherProtocol()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.General.Properties.name || key == GrmViewsRepository.General.Properties.protocol || key == GrmViewsRepository.General.Properties.otherProtocol || key == GrmViewsRepository.General.Properties.class;
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
				if (GrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.protocol == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getMutualExclusionProtocol_Protocol().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getMutualExclusionProtocol_Protocol().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.otherProtocol == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getMutualExclusionProtocol_OtherProtocol().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getMutualExclusionProtocol_OtherProtocol().getEAttributeType(), newValue);
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
