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
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class SchedulingPolicyTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public SchedulingPolicyTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject schedulingPolicy, String editing_mode) {
		super(editingContext, schedulingPolicy, editing_mode);
		parts = new String[] { TIMING_PART };
		repositoryKey = GrmViewsRepository.class;
		partKey = GrmViewsRepository.Timing.class;
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
			
			final SchedulingPolicy schedulingPolicy = (SchedulingPolicy)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.Timing.TimingProperties.policy)) {
				timingPart.initPolicy(EEFUtils.choiceOfValues(schedulingPolicy, GrmPackage.eINSTANCE.getSchedulingPolicy_Policy()), schedulingPolicy.getPolicy());
			}
			if (isAccessible(GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy))
				timingPart.setOtherSchedPolicy(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, schedulingPolicy.getOtherSchedPolicy()));
			
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
		if (editorKey == GrmViewsRepository.Timing.TimingProperties.policy) {
			return GrmPackage.eINSTANCE.getSchedulingPolicy_Policy();
		}
		if (editorKey == GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy) {
			return GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SchedulingPolicy schedulingPolicy = (SchedulingPolicy)semanticObject;
		if (GrmViewsRepository.Timing.TimingProperties.policy == event.getAffectedEditor()) {
			schedulingPolicy.setPolicy((SchedPolicyKind)event.getNewValue());
		}
		if (GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy == event.getAffectedEditor()) {
			schedulingPolicy.setOtherSchedPolicy((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
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
			if (GrmPackage.eINSTANCE.getSchedulingPolicy_Policy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(GrmViewsRepository.Timing.TimingProperties.policy))
				timingPart.setPolicy((SchedPolicyKind)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy)) {
				if (msg.getNewValue() != null) {
					timingPart.setOtherSchedPolicy(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					timingPart.setOtherSchedPolicy("");
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
			GrmPackage.eINSTANCE.getSchedulingPolicy_Policy(),
			GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.Timing.TimingProperties.policy || key == GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy || key == GrmViewsRepository.Timing.TimingProperties.class;
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
				if (GrmViewsRepository.Timing.TimingProperties.policy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getSchedulingPolicy_Policy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getSchedulingPolicy_Policy().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getSchedulingPolicy_OtherSchedPolicy().getEAttributeType(), newValue);
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
