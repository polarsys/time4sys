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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.grm.AccessControlPolicy;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareClock;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class HardwareArbiterTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	/**
	 * Settings for clock EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings clockSettings;
	
	/**
	 * Settings for accCtrlPolicy ReferencesTable
	 */
	protected ReferencesTableSettings accCtrlPolicySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwareArbiterTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareArbiter, String editing_mode) {
		super(editingContext, hardwareArbiter, editing_mode);
		parts = new String[] { TIMING_PART };
		repositoryKey = HrmViewsRepository.class;
		partKey = HrmViewsRepository.Timing.class;
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
			
			final HardwareArbiter hardwareArbiter = (HardwareArbiter)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.clock)) {
				// init part
				clockSettings = new EObjectFlatComboSettings(hardwareArbiter, HrmPackage.eINSTANCE.getHardwareResource_Clock());
				timingPart.initClock(clockSettings);
				// set the button mode
				timingPart.setClockButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy)) {
				accCtrlPolicySettings = new ReferencesTableSettings(hardwareArbiter, GrmPackage.eINSTANCE.getResourceBroker_AccCtrlPolicy());
				timingPart.initAccCtrlPolicy(accCtrlPolicySettings);
			}
			// init filters
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.clock)) {
				timingPart.addFilterToClock(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof HardwareClock); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for clock
				// End of user code
			}
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy)) {
				timingPart.addFilterToAccCtrlPolicy(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof AccessControlPolicy);
					}
			
				});
				// Start of user code for additional businessfilters for accCtrlPolicy
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
		if (editorKey == HrmViewsRepository.Timing.TimingProperties.clock) {
			return HrmPackage.eINSTANCE.getHardwareResource_Clock();
		}
		if (editorKey == HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy) {
			return GrmPackage.eINSTANCE.getResourceBroker_AccCtrlPolicy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwareArbiter hardwareArbiter = (HardwareArbiter)semanticObject;
		if (HrmViewsRepository.Timing.TimingProperties.clock == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				clockSettings.setToReference((HardwareClock)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HardwareClock eObject = HrmFactory.eINSTANCE.createHardwareClock();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				clockSettings.setToReference(eObject);
			}
		}
		if (HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, accCtrlPolicySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				accCtrlPolicySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				accCtrlPolicySettings.move(event.getNewIndex(), (AccessControlPolicy) event.getNewValue());
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
			if (HrmPackage.eINSTANCE.getHardwareResource_Clock().equals(msg.getFeature()) && timingPart != null && isAccessible(HrmViewsRepository.Timing.TimingProperties.clock))
				timingPart.setClock((EObject)msg.getNewValue());
			if (GrmPackage.eINSTANCE.getResourceBroker_AccCtrlPolicy().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy))
				timingPart.updateAccCtrlPolicy();
			
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
			HrmPackage.eINSTANCE.getHardwareResource_Clock(),
			GrmPackage.eINSTANCE.getResourceBroker_AccCtrlPolicy()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == HrmViewsRepository.Timing.TimingProperties.clock || key == HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy || key == HrmViewsRepository.Timing.TimingProperties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == HrmViewsRepository.General.Properties.brokedResource || key == HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy || key == HrmViewsRepository.General.Properties.controlledMedia;
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
