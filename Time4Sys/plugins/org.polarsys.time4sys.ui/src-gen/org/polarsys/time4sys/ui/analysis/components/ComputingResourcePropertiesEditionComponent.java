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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.CommunicationResource;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.Task;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.ComputingResourcePropertiesEditionPart;


/**
 * 
 * @generated
 */
public class ComputingResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for scheduler EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings schedulerSettings;
	
	/**
	 * Settings for parent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parent_Settings;
	
	/**
	 * Settings for tasksAffectedOn ReferencesTable
	 */
	private ReferencesTableSettings tasksAffectedOnSettings;
	
	/**
	 * Settings for linkedBy ReferencesTable
	 */
	private ReferencesTableSettings linkedBySettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public ComputingResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject computingResource, String editing_mode) {
		super(editingContext, computingResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.ComputingResource.class;
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
			
			final ComputingResource computingResource = (ComputingResource)elt;
			final ComputingResourcePropertiesEditionPart basePart = (ComputingResourcePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, computingResource.getName()));
			
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.scheduler)) {
				// init part
				schedulerSettings = new EObjectFlatComboSettings(computingResource, AnalysisPackage.eINSTANCE.getResource_Scheduler());
				basePart.initScheduler(schedulerSettings);
				// set the button mode
				basePart.setSchedulerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.parent_)) {
				// init part
				parent_Settings = new EObjectFlatComboSettings(computingResource, AnalysisPackage.eINSTANCE.getResource_Parent());
				basePart.initParent_(parent_Settings);
				// set the button mode
				basePart.setParent_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.speedFactor)) {
				basePart.setSpeedFactor(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, computingResource.getSpeedFactor()));
			}
			
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.delay))
				basePart.setDelay(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, computingResource.getDelay()));
			
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn)) {
				tasksAffectedOnSettings = new ReferencesTableSettings(computingResource, AnalysisPackage.eINSTANCE.getComputingResource_TasksAffectedOn());
				basePart.initTasksAffectedOn(tasksAffectedOnSettings);
			}
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.linkedBy)) {
				linkedBySettings = new ReferencesTableSettings(computingResource, AnalysisPackage.eINSTANCE.getComputingResource_LinkedBy());
				basePart.initLinkedBy(linkedBySettings);
			}
			// init filters
			
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.scheduler)) {
				basePart.addFilterToScheduler(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Scheduler);
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.parent_)) {
				basePart.addFilterToParent_(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof AnalyzedSystem);
					}
					
				});
			}
			
			
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn)) {
				basePart.addFilterToTasksAffectedOn(new EObjectFilter(AnalysisPackage.Literals.TASK));
			}
			if (isAccessible(AnalysisViewsRepository.ComputingResource.Properties.linkedBy)) {
				basePart.addFilterToLinkedBy(new EObjectFilter(AnalysisPackage.Literals.COMMUNICATION_RESOURCE));
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
		if (editorKey == AnalysisViewsRepository.ComputingResource.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.ComputingResource.Properties.scheduler) {
			return AnalysisPackage.eINSTANCE.getResource_Scheduler();
		}
		if (editorKey == AnalysisViewsRepository.ComputingResource.Properties.parent_) {
			return AnalysisPackage.eINSTANCE.getResource_Parent();
		}
		if (editorKey == AnalysisViewsRepository.ComputingResource.Properties.speedFactor) {
			return AnalysisPackage.eINSTANCE.getResource_SpeedFactor();
		}
		if (editorKey == AnalysisViewsRepository.ComputingResource.Properties.delay) {
			return AnalysisPackage.eINSTANCE.getResource_Delay();
		}
		if (editorKey == AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn) {
			return AnalysisPackage.eINSTANCE.getComputingResource_TasksAffectedOn();
		}
		if (editorKey == AnalysisViewsRepository.ComputingResource.Properties.linkedBy) {
			return AnalysisPackage.eINSTANCE.getComputingResource_LinkedBy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ComputingResource computingResource = (ComputingResource)semanticObject;
		if (AnalysisViewsRepository.ComputingResource.Properties.name == event.getAffectedEditor()) {
			computingResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.ComputingResource.Properties.scheduler == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				schedulerSettings.setToReference((Scheduler)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Scheduler eObject = AnalysisFactory.eINSTANCE.createScheduler();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				schedulerSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.ComputingResource.Properties.parent_ == event.getAffectedEditor()) {
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
		if (AnalysisViewsRepository.ComputingResource.Properties.speedFactor == event.getAffectedEditor()) {
			computingResource.setSpeedFactor((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (AnalysisViewsRepository.ComputingResource.Properties.delay == event.getAffectedEditor()) {
			computingResource.setDelay((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Task) {
					tasksAffectedOnSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				tasksAffectedOnSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				tasksAffectedOnSettings.move(event.getNewIndex(), (Task) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.ComputingResource.Properties.linkedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof CommunicationResource) {
					linkedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				linkedBySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				linkedBySettings.move(event.getNewIndex(), (CommunicationResource) event.getNewValue());
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
			ComputingResourcePropertiesEditionPart basePart = (ComputingResourcePropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.ComputingResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getResource_Scheduler().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.ComputingResource.Properties.scheduler))
				basePart.setScheduler((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getResource_Parent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.ComputingResource.Properties.parent_))
				basePart.setParent_((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getResource_SpeedFactor().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.ComputingResource.Properties.speedFactor)) {
				if (msg.getNewValue() != null) {
					basePart.setSpeedFactor(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setSpeedFactor("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getResource_Delay().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.ComputingResource.Properties.delay)) {
				if (msg.getNewValue() != null) {
					basePart.setDelay(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					basePart.setDelay("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getComputingResource_TasksAffectedOn().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn))
				basePart.updateTasksAffectedOn();
			if (AnalysisPackage.eINSTANCE.getComputingResource_LinkedBy().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.ComputingResource.Properties.linkedBy))
				basePart.updateLinkedBy();
			
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
			AnalysisPackage.eINSTANCE.getResource_Scheduler(),
			AnalysisPackage.eINSTANCE.getResource_Parent(),
			AnalysisPackage.eINSTANCE.getResource_SpeedFactor(),
			AnalysisPackage.eINSTANCE.getResource_Delay(),
			AnalysisPackage.eINSTANCE.getComputingResource_TasksAffectedOn(),
			AnalysisPackage.eINSTANCE.getComputingResource_LinkedBy()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.ComputingResource.Properties.scheduler || key == AnalysisViewsRepository.ComputingResource.Properties.parent_;
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
				if (AnalysisViewsRepository.ComputingResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.ComputingResource.Properties.speedFactor == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getResource_SpeedFactor().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getResource_SpeedFactor().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.ComputingResource.Properties.delay == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getResource_Delay().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getResource_Delay().getEAttributeType(), newValue);
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
