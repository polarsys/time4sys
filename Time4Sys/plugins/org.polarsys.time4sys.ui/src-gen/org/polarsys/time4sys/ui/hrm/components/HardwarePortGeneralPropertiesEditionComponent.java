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
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.hrm.HardwarePin;
import org.polarsys.time4sys.marte.hrm.HardwarePort;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.hrm.PortType;
import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class HardwarePortGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for realizedBy ReferencesTable
	 */
	private ReferencesTableSettings realizedBySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwarePortGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwarePort, String editing_mode) {
		super(editingContext, hardwarePort, editing_mode);
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
			
			final HardwarePort hardwarePort = (HardwarePort)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HrmViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hardwarePort.getName()));
			
			if (isAccessible(HrmViewsRepository.General.Properties.type)) {
				generalPart.initType(EEFUtils.choiceOfValues(hardwarePort, HrmPackage.eINSTANCE.getHardwarePort_Type()), hardwarePort.getType());
			}
			if (isAccessible(HrmViewsRepository.General.Properties.realizedBy)) {
				realizedBySettings = new ReferencesTableSettings(hardwarePort, HrmPackage.eINSTANCE.getHardwarePort_RealizedBy());
				generalPart.initRealizedBy(realizedBySettings);
			}
			// init filters
			
			
			if (isAccessible(HrmViewsRepository.General.Properties.realizedBy)) {
				generalPart.addFilterToRealizedBy(new EObjectFilter(HrmPackage.Literals.HARDWARE_PIN));
				// Start of user code for additional businessfilters for realizedBy
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
		if (editorKey == HrmViewsRepository.General.Properties.name) {
			return EcorePackage.eINSTANCE.getENamedElement_Name();
		}
		if (editorKey == HrmViewsRepository.General.Properties.type) {
			return HrmPackage.eINSTANCE.getHardwarePort_Type();
		}
		if (editorKey == HrmViewsRepository.General.Properties.realizedBy) {
			return HrmPackage.eINSTANCE.getHardwarePort_RealizedBy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwarePort hardwarePort = (HardwarePort)semanticObject;
		if (HrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			hardwarePort.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HrmViewsRepository.General.Properties.type == event.getAffectedEditor()) {
			hardwarePort.setType((PortType)event.getNewValue());
		}
		if (HrmViewsRepository.General.Properties.realizedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HardwarePin) {
					realizedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				realizedBySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				realizedBySettings.move(event.getNewIndex(), (HardwarePin) event.getNewValue());
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
			if (EcorePackage.eINSTANCE.getENamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.name)) {
				if (msg.getNewValue() != null) {
					generalPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setName("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwarePort_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(HrmViewsRepository.General.Properties.type))
				generalPart.setType((PortType)msg.getNewValue());
			
			if (HrmPackage.eINSTANCE.getHardwarePort_RealizedBy().equals(msg.getFeature())  && isAccessible(HrmViewsRepository.General.Properties.realizedBy))
				generalPart.updateRealizedBy();
			
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
			HrmPackage.eINSTANCE.getHardwarePort_Type(),
			HrmPackage.eINSTANCE.getHardwarePort_RealizedBy()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == HrmViewsRepository.General.Properties.name || key == HrmViewsRepository.General.Properties.type || key == HrmViewsRepository.General.Properties.realizedBy || key == HrmViewsRepository.General.Properties.class;
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
				if (HrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwarePort_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwarePort_Type().getEAttributeType(), newValue);
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
