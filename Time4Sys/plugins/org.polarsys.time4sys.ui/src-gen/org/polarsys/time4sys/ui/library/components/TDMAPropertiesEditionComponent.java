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
package org.polarsys.time4sys.ui.library.components;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.polarsys.time4sys.library.LibraryPackage;
import org.polarsys.time4sys.library.TDMA;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.ui.views.library.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.library.parts.LibraryViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class TDMAPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TDMAPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject tDMA, String editing_mode) {
		super(editingContext, tDMA, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = LibraryViewsRepository.class;
		partKey = LibraryViewsRepository.General.class;
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
			
			final TDMA tDMA = (TDMA)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(LibraryViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, tDMA.getName()));
			
			if (isAccessible(LibraryViewsRepository.General.Properties.policy)) {
				generalPart.initPolicy(EEFUtils.choiceOfValues(tDMA, GrmPackage.eINSTANCE.getSchedulingPolicy_Policy()), tDMA.getPolicy());
			}
			if (isAccessible(LibraryViewsRepository.General.Properties.otherSchedPolicy))
				generalPart.setOtherSchedPolicy(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, tDMA.getOtherSchedPolicy()));
			
			if (isAccessible(LibraryViewsRepository.General.Properties.slot))
				generalPart.setSlot(tDMA.getSlot());
			
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
		if (editorKey == LibraryViewsRepository.General.Properties.name) {
			return EcorePackage.eINSTANCE.getENamedElement_Name();
		}
		if (editorKey == LibraryViewsRepository.General.Properties.policy) {
			return GrmPackage.eINSTANCE.getSchedulingPolicy_Policy();
		}
		if (editorKey == LibraryViewsRepository.General.Properties.otherSchedPolicy) {
			return GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy();
		}
		if (editorKey == LibraryViewsRepository.General.Properties.slot) {
			return LibraryPackage.eINSTANCE.getTDMA_Slot();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TDMA tDMA = (TDMA)semanticObject;
		if (LibraryViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			tDMA.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (LibraryViewsRepository.General.Properties.policy == event.getAffectedEditor()) {
			tDMA.setPolicy((SchedPolicyKind)event.getNewValue());
		}
		if (LibraryViewsRepository.General.Properties.otherSchedPolicy == event.getAffectedEditor()) {
			tDMA.setOtherSchedPolicy((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (LibraryViewsRepository.General.Properties.slot == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				tDMA.getSlot().clear();
				tDMA.getSlot().addAll(((EList) event.getNewValue()));
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
			GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			if (EcorePackage.eINSTANCE.getENamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(LibraryViewsRepository.General.Properties.name)) {
				if (msg.getNewValue() != null) {
					generalPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setName("");
				}
			}
			if (GrmPackage.eINSTANCE.getSchedulingPolicy_Policy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(LibraryViewsRepository.General.Properties.policy))
				generalPart.setPolicy((SchedPolicyKind)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(LibraryViewsRepository.General.Properties.otherSchedPolicy)) {
				if (msg.getNewValue() != null) {
					generalPart.setOtherSchedPolicy(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setOtherSchedPolicy("");
				}
			}
			if (LibraryPackage.eINSTANCE.getTDMA_Slot().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(LibraryViewsRepository.General.Properties.slot)) {
				if (msg.getNewValue() instanceof EList<?>) {
					generalPart.setSlot((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					generalPart.setSlot(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					generalPart.setSlot(newValueAsList);
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
			EcorePackage.eINSTANCE.getENamedElement_Name(),
			GrmPackage.eINSTANCE.getSchedulingPolicy_Policy(),
			GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy(),
			LibraryPackage.eINSTANCE.getTDMA_Slot()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == LibraryViewsRepository.General.Properties.name || key == LibraryViewsRepository.General.Properties.policy || key == LibraryViewsRepository.General.Properties.otherSchedPolicy || key == LibraryViewsRepository.General.Properties.slot || key == LibraryViewsRepository.General.Properties.class;
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
				if (LibraryViewsRepository.General.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.General.Properties.policy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getSchedulingPolicy_Policy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getSchedulingPolicy_Policy().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.General.Properties.otherSchedPolicy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.General.Properties.slot == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(LibraryPackage.eINSTANCE.getTDMA_Slot().getEAttributeType(), iterator.next()));
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
