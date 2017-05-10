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
package org.polarsys.time4sys.ui.analysis.components;

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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.RequiredSchedulingParameter;
import org.polarsys.time4sys.analysis.Resource;
import org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerPolicyKind;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.SchedulerPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class SchedulerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for scheduledElements ReferencesTable
	 */
	private ReferencesTableSettings scheduledElementsSettings;
	
	/**
	 * Settings for usedBy EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings usedBySettings;
	
	/**
	 * Settings for requiredParameters ReferencesTable
	 */
	protected ReferencesTableSettings requiredParametersSettings;
	
	/**
	 * Settings for parent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parent_Settings;
	
	/**
	 * Settings for resourceParameterValue ReferencesTable
	 */
	protected ReferencesTableSettings resourceParameterValueSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public SchedulerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject scheduler, String editing_mode) {
		super(editingContext, scheduler, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.Scheduler.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * @generated
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Scheduler scheduler = (Scheduler)elt;
			final SchedulerPropertiesEditionPart basePart = (SchedulerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, scheduler.getName()));
			
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.policyKind)) {
				basePart.initPolicyKind(EEFUtils.choiceOfValues(scheduler, AnalysisPackage.eINSTANCE.getScheduler_PolicyKind()), scheduler.getPolicyKind());
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.scheduledElements)) {
				scheduledElementsSettings = new ReferencesTableSettings(scheduler, AnalysisPackage.eINSTANCE.getScheduler_ScheduledElements());
				basePart.initScheduledElements(scheduledElementsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.usedBy)) {
				// init part
				usedBySettings = new EObjectFlatComboSettings(scheduler, AnalysisPackage.eINSTANCE.getScheduler_UsedBy());
				basePart.initUsedBy(usedBySettings);
				// set the button mode
				basePart.setUsedByButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.requiredParameters)) {
				requiredParametersSettings = new ReferencesTableSettings(scheduler, AnalysisPackage.eINSTANCE.getScheduler_RequiredParameters());
				basePart.initRequiredParameters(requiredParametersSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.parent_)) {
				// init part
				parent_Settings = new EObjectFlatComboSettings(scheduler, AnalysisPackage.eINSTANCE.getScheduler_Parent());
				basePart.initParent_(parent_Settings);
				// set the button mode
				basePart.setParent_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue)) {
				resourceParameterValueSettings = new ReferencesTableSettings(scheduler, AnalysisPackage.eINSTANCE.getScheduler_ResourceParameterValue());
				basePart.initResourceParameterValue(resourceParameterValueSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.preferredPolicy))
				basePart.setPreferredPolicy(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, scheduler.getPreferredPolicy()));
			
			// init filters
			
			
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.scheduledElements)) {
				basePart.addFilterToScheduledElements(new EObjectFilter(AnalysisPackage.Literals.SCHEDULABLE_ELEMENT));
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.usedBy)) {
				basePart.addFilterToUsedBy(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Resource); //$NON-NLS-1$ 
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.requiredParameters)) {
				basePart.addFilterToRequiredParameters(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RequiredSchedulingParameter); //$NON-NLS-1$ 
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.parent_)) {
				basePart.addFilterToParent_(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof AnalyzedSystem); //$NON-NLS-1$ 
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue)) {
				basePart.addFilterToResourceParameterValue(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceSchedulingParameterValue); //$NON-NLS-1$ 
					}
			
				});
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
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.policyKind) {
			return AnalysisPackage.eINSTANCE.getScheduler_PolicyKind();
		}
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.scheduledElements) {
			return AnalysisPackage.eINSTANCE.getScheduler_ScheduledElements();
		}
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.usedBy) {
			return AnalysisPackage.eINSTANCE.getScheduler_UsedBy();
		}
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.requiredParameters) {
			return AnalysisPackage.eINSTANCE.getScheduler_RequiredParameters();
		}
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.parent_) {
			return AnalysisPackage.eINSTANCE.getScheduler_Parent();
		}
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue) {
			return AnalysisPackage.eINSTANCE.getScheduler_ResourceParameterValue();
		}
		if (editorKey == AnalysisViewsRepository.Scheduler.Properties.preferredPolicy) {
			return AnalysisPackage.eINSTANCE.getScheduler_PreferredPolicy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Scheduler scheduler = (Scheduler)semanticObject;
		if (AnalysisViewsRepository.Scheduler.Properties.name == event.getAffectedEditor()) {
			scheduler.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.Scheduler.Properties.policyKind == event.getAffectedEditor()) {
			scheduler.setPolicyKind((SchedulerPolicyKind)event.getNewValue());
		}
		if (AnalysisViewsRepository.Scheduler.Properties.scheduledElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SchedulableElement) {
					scheduledElementsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				scheduledElementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				scheduledElementsSettings.move(event.getNewIndex(), (SchedulableElement) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.Scheduler.Properties.usedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				usedBySettings.setToReference((Resource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, usedBySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (AnalysisViewsRepository.Scheduler.Properties.requiredParameters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, requiredParametersSettings, editingContext.getAdapterFactory());
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
				requiredParametersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				requiredParametersSettings.move(event.getNewIndex(), (RequiredSchedulingParameter) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.Scheduler.Properties.parent_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parent_Settings.setToReference((AnalyzedSystem)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				AnalyzedSystem eObject = AnalysisFactory.eINSTANCE.createAnalyzedSystem();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parent_Settings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourceParameterValueSettings, editingContext.getAdapterFactory());
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
				resourceParameterValueSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourceParameterValueSettings.move(event.getNewIndex(), (ResourceSchedulingParameterValue) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.Scheduler.Properties.preferredPolicy == event.getAffectedEditor()) {
			scheduler.setPreferredPolicy((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			SchedulerPropertiesEditionPart basePart = (SchedulerPropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Scheduler.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getScheduler_PolicyKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(AnalysisViewsRepository.Scheduler.Properties.policyKind))
				basePart.setPolicyKind((SchedulerPolicyKind)msg.getNewValue());
			
			if (AnalysisPackage.eINSTANCE.getScheduler_ScheduledElements().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.Scheduler.Properties.scheduledElements))
				basePart.updateScheduledElements();
			if (AnalysisPackage.eINSTANCE.getScheduler_UsedBy().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Scheduler.Properties.usedBy))
				basePart.setUsedBy((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getScheduler_RequiredParameters().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.Scheduler.Properties.requiredParameters))
				basePart.updateRequiredParameters();
			if (AnalysisPackage.eINSTANCE.getScheduler_Parent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Scheduler.Properties.parent_))
				basePart.setParent_((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getScheduler_ResourceParameterValue().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue))
				basePart.updateResourceParameterValue();
			if (AnalysisPackage.eINSTANCE.getScheduler_PreferredPolicy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Scheduler.Properties.preferredPolicy)) {
				if (msg.getNewValue() != null) {
					basePart.setPreferredPolicy(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPreferredPolicy("");
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
			AnalysisPackage.eINSTANCE.getNamedElement_Name(),
			AnalysisPackage.eINSTANCE.getScheduler_PolicyKind(),
			AnalysisPackage.eINSTANCE.getScheduler_ScheduledElements(),
			AnalysisPackage.eINSTANCE.getScheduler_UsedBy(),
			AnalysisPackage.eINSTANCE.getScheduler_RequiredParameters(),
			AnalysisPackage.eINSTANCE.getScheduler_Parent(),
			AnalysisPackage.eINSTANCE.getScheduler_ResourceParameterValue(),
			AnalysisPackage.eINSTANCE.getScheduler_PreferredPolicy()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.Scheduler.Properties.policyKind;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (AnalysisViewsRepository.Scheduler.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Scheduler.Properties.policyKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getScheduler_PolicyKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getScheduler_PolicyKind().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Scheduler.Properties.preferredPolicy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getScheduler_PreferredPolicy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getScheduler_PreferredPolicy().getEAttributeType(), newValue);
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
