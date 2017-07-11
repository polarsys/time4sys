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
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.ui.views.nfp.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.nfp.parts.NfpViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DurationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public DurationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject duration, String editing_mode) {
		super(editingContext, duration, editing_mode);
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
			
			final Duration duration = (Duration)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(NfpViewsRepository.General.Properties.value)) {
				generalPart.setValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, duration.getValue()));
			}
			
			if (isAccessible(NfpViewsRepository.General.Properties.unit)) {
				generalPart.initUnit(EEFUtils.choiceOfValues(duration, NfpPackage.eINSTANCE.getDuration_Unit()), duration.getUnit());
			}
			if (isAccessible(NfpViewsRepository.General.Properties.best)) {
				generalPart.setBest(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, duration.getBest()));
			}
			
			if (isAccessible(NfpViewsRepository.General.Properties.worst)) {
				generalPart.setWorst(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, duration.getWorst()));
			}
			
			if (isAccessible(NfpViewsRepository.General.Properties.clock))
				generalPart.setClock(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, duration.getClock()));
			
			if (isAccessible(NfpViewsRepository.General.Properties.precision)) {
				generalPart.setPrecision(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, duration.getPrecision()));
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
		if (editorKey == NfpViewsRepository.General.Properties.value) {
			return NfpPackage.eINSTANCE.getDuration_Value();
		}
		if (editorKey == NfpViewsRepository.General.Properties.unit) {
			return NfpPackage.eINSTANCE.getDuration_Unit();
		}
		if (editorKey == NfpViewsRepository.General.Properties.best) {
			return NfpPackage.eINSTANCE.getDuration_Best();
		}
		if (editorKey == NfpViewsRepository.General.Properties.worst) {
			return NfpPackage.eINSTANCE.getDuration_Worst();
		}
		if (editorKey == NfpViewsRepository.General.Properties.clock) {
			return NfpPackage.eINSTANCE.getDuration_Clock();
		}
		if (editorKey == NfpViewsRepository.General.Properties.precision) {
			return NfpPackage.eINSTANCE.getDuration_Precision();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Duration duration = (Duration)semanticObject;
		if (NfpViewsRepository.General.Properties.value == event.getAffectedEditor()) {
			duration.setValue((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (NfpViewsRepository.General.Properties.unit == event.getAffectedEditor()) {
			duration.setUnit((TimeUnitKind)event.getNewValue());
		}
		if (NfpViewsRepository.General.Properties.best == event.getAffectedEditor()) {
			duration.setBest((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (NfpViewsRepository.General.Properties.worst == event.getAffectedEditor()) {
			duration.setWorst((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (NfpViewsRepository.General.Properties.clock == event.getAffectedEditor()) {
			duration.setClock((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (NfpViewsRepository.General.Properties.precision == event.getAffectedEditor()) {
			duration.setPrecision((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
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
			if (NfpPackage.eINSTANCE.getDuration_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.value)) {
				if (msg.getNewValue() != null) {
					generalPart.setValue(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					generalPart.setValue("");
				}
			}
			if (NfpPackage.eINSTANCE.getDuration_Unit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(NfpViewsRepository.General.Properties.unit))
				generalPart.setUnit((TimeUnitKind)msg.getNewValue());
			
			if (NfpPackage.eINSTANCE.getDuration_Best().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.best)) {
				if (msg.getNewValue() != null) {
					generalPart.setBest(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					generalPart.setBest("");
				}
			}
			if (NfpPackage.eINSTANCE.getDuration_Worst().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.worst)) {
				if (msg.getNewValue() != null) {
					generalPart.setWorst(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					generalPart.setWorst("");
				}
			}
			if (NfpPackage.eINSTANCE.getDuration_Clock().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.clock)) {
				if (msg.getNewValue() != null) {
					generalPart.setClock(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setClock("");
				}
			}
			if (NfpPackage.eINSTANCE.getDuration_Precision().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(NfpViewsRepository.General.Properties.precision)) {
				if (msg.getNewValue() != null) {
					generalPart.setPrecision(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					generalPart.setPrecision("");
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
			NfpPackage.eINSTANCE.getDuration_Value(),
			NfpPackage.eINSTANCE.getDuration_Unit(),
			NfpPackage.eINSTANCE.getDuration_Best(),
			NfpPackage.eINSTANCE.getDuration_Worst(),
			NfpPackage.eINSTANCE.getDuration_Clock(),
			NfpPackage.eINSTANCE.getDuration_Precision()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == NfpViewsRepository.General.Properties.value || key == NfpViewsRepository.General.Properties.unit || key == NfpViewsRepository.General.Properties.best || key == NfpViewsRepository.General.Properties.worst || key == NfpViewsRepository.General.Properties.clock || key == NfpViewsRepository.General.Properties.precision || key == NfpViewsRepository.General.Properties.class;
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
				if (NfpViewsRepository.General.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getDuration_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getDuration_Value().getEAttributeType(), newValue);
				}
				if (NfpViewsRepository.General.Properties.unit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getDuration_Unit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getDuration_Unit().getEAttributeType(), newValue);
				}
				if (NfpViewsRepository.General.Properties.best == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getDuration_Best().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getDuration_Best().getEAttributeType(), newValue);
				}
				if (NfpViewsRepository.General.Properties.worst == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getDuration_Worst().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getDuration_Worst().getEAttributeType(), newValue);
				}
				if (NfpViewsRepository.General.Properties.clock == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getDuration_Clock().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getDuration_Clock().getEAttributeType(), newValue);
				}
				if (NfpViewsRepository.General.Properties.precision == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NfpPackage.eINSTANCE.getDuration_Precision().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NfpPackage.eINSTANCE.getDuration_Precision().getEAttributeType(), newValue);
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
