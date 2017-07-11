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
package org.polarsys.time4sys.ui.hrm.components;

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
import org.polarsys.time4sys.marte.hrm.ComponentState;
import org.polarsys.time4sys.marte.hrm.ConditionType;
import org.polarsys.time4sys.marte.hrm.EnvCondition;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class EnvConditionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EnvConditionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject envCondition, String editing_mode) {
		super(editingContext, envCondition, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = HrmViewsRepository.class;
		partKey = HrmViewsRepository.General.class;
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
			
			final EnvCondition envCondition = (EnvCondition)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HrmViewsRepository.General.Properties.type)) {
				generalPart.initType(EEFUtils.choiceOfValues(envCondition, HrmPackage.eINSTANCE.getEnvCondition_Type()), envCondition.getType());
			}
			if (isAccessible(HrmViewsRepository.General.Properties.status)) {
				generalPart.initStatus(EEFUtils.choiceOfValues(envCondition, HrmPackage.eINSTANCE.getEnvCondition_Status()), envCondition.getStatus());
			}
			if (isAccessible(HrmViewsRepository.General.Properties.description))
				generalPart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, envCondition.getDescription()));
			
			if (isAccessible(HrmViewsRepository.General.Properties.range)) {
				generalPart.setRange(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, envCondition.getRange()));
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
		if (editorKey == HrmViewsRepository.General.Properties.type) {
			return HrmPackage.eINSTANCE.getEnvCondition_Type();
		}
		if (editorKey == HrmViewsRepository.General.Properties.status) {
			return HrmPackage.eINSTANCE.getEnvCondition_Status();
		}
		if (editorKey == HrmViewsRepository.General.Properties.description) {
			return HrmPackage.eINSTANCE.getEnvCondition_Description();
		}
		if (editorKey == HrmViewsRepository.General.Properties.range) {
			return HrmPackage.eINSTANCE.getEnvCondition_Range();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EnvCondition envCondition = (EnvCondition)semanticObject;
		if (HrmViewsRepository.General.Properties.type == event.getAffectedEditor()) {
			envCondition.setType((ConditionType)event.getNewValue());
		}
		if (HrmViewsRepository.General.Properties.status == event.getAffectedEditor()) {
			envCondition.setStatus((ComponentState)event.getNewValue());
		}
		if (HrmViewsRepository.General.Properties.description == event.getAffectedEditor()) {
			envCondition.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HrmViewsRepository.General.Properties.range == event.getAffectedEditor()) {
			envCondition.setRange((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
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
			if (HrmPackage.eINSTANCE.getEnvCondition_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(HrmViewsRepository.General.Properties.type))
				generalPart.setType((ConditionType)msg.getNewValue());
			
			if (HrmPackage.eINSTANCE.getEnvCondition_Status().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(HrmViewsRepository.General.Properties.status))
				generalPart.setStatus((ComponentState)msg.getNewValue());
			
			if (HrmPackage.eINSTANCE.getEnvCondition_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.description)) {
				if (msg.getNewValue() != null) {
					generalPart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setDescription("");
				}
			}
			if (HrmPackage.eINSTANCE.getEnvCondition_Range().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.range)) {
				if (msg.getNewValue() != null) {
					generalPart.setRange(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setRange("");
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
			HrmPackage.eINSTANCE.getEnvCondition_Type(),
			HrmPackage.eINSTANCE.getEnvCondition_Status(),
			HrmPackage.eINSTANCE.getEnvCondition_Description(),
			HrmPackage.eINSTANCE.getEnvCondition_Range()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == HrmViewsRepository.General.Properties.type || key == HrmViewsRepository.General.Properties.status || key == HrmViewsRepository.General.Properties.description || key == HrmViewsRepository.General.Properties.range || key == HrmViewsRepository.General.Properties.class;
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
				if (HrmViewsRepository.General.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getEnvCondition_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getEnvCondition_Type().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.status == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getEnvCondition_Status().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getEnvCondition_Status().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getEnvCondition_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getEnvCondition_Description().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.range == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getEnvCondition_Range().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getEnvCondition_Range().getEAttributeType(), newValue);
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
