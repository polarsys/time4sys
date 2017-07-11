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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.hrm.HardwareCache;
import org.polarsys.time4sys.marte.hrm.HardwareClock;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.hrm.ReplPolicy;
import org.polarsys.time4sys.marte.hrm.WritePolicy;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class HardwareCacheTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	/**
	 * Settings for clock EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings clockSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwareCacheTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareCache, String editing_mode) {
		super(editingContext, hardwareCache, editing_mode);
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
			
			final HardwareCache hardwareCache = (HardwareCache)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.clock)) {
				// init part
				clockSettings = new EObjectFlatComboSettings(hardwareCache, HrmPackage.eINSTANCE.getHardwareResource_Clock());
				timingPart.initClock(clockSettings);
				// set the button mode
				timingPart.setClockButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.timings))
				timingPart.setTimings(hardwareCache.getTimings());
			
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.replPolicy)) {
				timingPart.initReplPolicy(EEFUtils.choiceOfValues(hardwareCache, HrmPackage.eINSTANCE.getHardwareProcessingMemory_ReplPolicy()), hardwareCache.getReplPolicy());
			}
			if (isAccessible(HrmViewsRepository.Timing.TimingProperties.writePolicy)) {
				timingPart.initWritePolicy(EEFUtils.choiceOfValues(hardwareCache, HrmPackage.eINSTANCE.getHardwareProcessingMemory_WritePolicy()), hardwareCache.getWritePolicy());
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
		if (editorKey == HrmViewsRepository.Timing.TimingProperties.timings) {
			return HrmPackage.eINSTANCE.getHardwareMemory_Timings();
		}
		if (editorKey == HrmViewsRepository.Timing.TimingProperties.replPolicy) {
			return HrmPackage.eINSTANCE.getHardwareProcessingMemory_ReplPolicy();
		}
		if (editorKey == HrmViewsRepository.Timing.TimingProperties.writePolicy) {
			return HrmPackage.eINSTANCE.getHardwareProcessingMemory_WritePolicy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwareCache hardwareCache = (HardwareCache)semanticObject;
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
		if (HrmViewsRepository.Timing.TimingProperties.timings == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				hardwareCache.getTimings().clear();
				hardwareCache.getTimings().addAll(((EList) event.getNewValue()));
			}
		}
		if (HrmViewsRepository.Timing.TimingProperties.replPolicy == event.getAffectedEditor()) {
			hardwareCache.setReplPolicy((ReplPolicy)event.getNewValue());
		}
		if (HrmViewsRepository.Timing.TimingProperties.writePolicy == event.getAffectedEditor()) {
			hardwareCache.setWritePolicy((WritePolicy)event.getNewValue());
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
			if (HrmPackage.eINSTANCE.getHardwareMemory_Timings().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(HrmViewsRepository.Timing.TimingProperties.timings)) {
				if (msg.getNewValue() instanceof EList<?>) {
					timingPart.setTimings((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					timingPart.setTimings(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					timingPart.setTimings(newValueAsList);
				}
			}
			
			if (HrmPackage.eINSTANCE.getHardwareProcessingMemory_ReplPolicy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(HrmViewsRepository.Timing.TimingProperties.replPolicy))
				timingPart.setReplPolicy((ReplPolicy)msg.getNewValue());
			
			if (HrmPackage.eINSTANCE.getHardwareProcessingMemory_WritePolicy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(HrmViewsRepository.Timing.TimingProperties.writePolicy))
				timingPart.setWritePolicy((WritePolicy)msg.getNewValue());
			
			
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
			HrmPackage.eINSTANCE.getHardwareMemory_Timings(),
			HrmPackage.eINSTANCE.getHardwareProcessingMemory_ReplPolicy(),
			HrmPackage.eINSTANCE.getHardwareProcessingMemory_WritePolicy()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == HrmViewsRepository.Timing.TimingProperties.clock || key == HrmViewsRepository.Timing.TimingProperties.timings || key == HrmViewsRepository.Timing.TimingProperties.replPolicy || key == HrmViewsRepository.Timing.TimingProperties.writePolicy || key == HrmViewsRepository.Timing.TimingProperties.class;
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
				if (HrmViewsRepository.Timing.TimingProperties.timings == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareMemory_Timings().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (HrmViewsRepository.Timing.TimingProperties.replPolicy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareProcessingMemory_ReplPolicy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareProcessingMemory_ReplPolicy().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Timing.TimingProperties.writePolicy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareProcessingMemory_WritePolicy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareProcessingMemory_WritePolicy().getEAttributeType(), newValue);
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
