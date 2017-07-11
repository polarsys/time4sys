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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.hrm.HardwarePin;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.OtherPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class HardwareWirePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String OTHER_PART = "Other"; //$NON-NLS-1$

	
	/**
	 * Settings for sourcePin EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourcePinSettings;
	
	/**
	 * Settings for targetPin EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetPinSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwareWirePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareWire, String editing_mode) {
		super(editingContext, hardwareWire, editing_mode);
		parts = new String[] { OTHER_PART };
		repositoryKey = HrmViewsRepository.class;
		partKey = HrmViewsRepository.Other.class;
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
			
			final HardwareWire hardwareWire = (HardwareWire)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HrmViewsRepository.Other.Properties.sourcePin)) {
				// init part
				sourcePinSettings = new EObjectFlatComboSettings(hardwareWire, HrmPackage.eINSTANCE.getHardwareWire_SourcePin());
				otherPart.initSourcePin(sourcePinSettings);
				// set the button mode
				otherPart.setSourcePinButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.targetPin)) {
				// init part
				targetPinSettings = new EObjectFlatComboSettings(hardwareWire, HrmPackage.eINSTANCE.getHardwareWire_TargetPin());
				otherPart.initTargetPin(targetPinSettings);
				// set the button mode
				otherPart.setTargetPinButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(HrmViewsRepository.Other.Properties.sourcePin)) {
				otherPart.addFilterToSourcePin(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof HardwarePin);
					}
					
				});
				// Start of user code for additional businessfilters for sourcePin
				// End of user code
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.targetPin)) {
				otherPart.addFilterToTargetPin(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof HardwarePin);
					}
					
				});
				// Start of user code for additional businessfilters for targetPin
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
		if (editorKey == HrmViewsRepository.Other.Properties.sourcePin) {
			return HrmPackage.eINSTANCE.getHardwareWire_SourcePin();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.targetPin) {
			return HrmPackage.eINSTANCE.getHardwareWire_TargetPin();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwareWire hardwareWire = (HardwareWire)semanticObject;
		if (HrmViewsRepository.Other.Properties.sourcePin == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourcePinSettings.setToReference((HardwarePin)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HardwarePin eObject = HrmFactory.eINSTANCE.createHardwarePin();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sourcePinSettings.setToReference(eObject);
			}
		}
		if (HrmViewsRepository.Other.Properties.targetPin == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetPinSettings.setToReference((HardwarePin)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HardwarePin eObject = HrmFactory.eINSTANCE.createHardwarePin();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				targetPinSettings.setToReference(eObject);
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
			OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			if (HrmPackage.eINSTANCE.getHardwareWire_SourcePin().equals(msg.getFeature()) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.sourcePin))
				otherPart.setSourcePin((EObject)msg.getNewValue());
			if (HrmPackage.eINSTANCE.getHardwareWire_TargetPin().equals(msg.getFeature()) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.targetPin))
				otherPart.setTargetPin((EObject)msg.getNewValue());
			
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
			HrmPackage.eINSTANCE.getHardwareWire_SourcePin(),
			HrmPackage.eINSTANCE.getHardwareWire_TargetPin()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == HrmViewsRepository.Other.Properties.sourcePin || key == HrmViewsRepository.Other.Properties.targetPin || key == HrmViewsRepository.Other.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == HrmViewsRepository.Other.Properties.sourcePin || key == HrmViewsRepository.Other.Properties.targetPin;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
