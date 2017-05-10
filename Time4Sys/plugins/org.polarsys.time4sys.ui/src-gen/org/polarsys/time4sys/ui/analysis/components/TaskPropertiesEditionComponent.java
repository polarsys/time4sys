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
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.Fragment;
import org.polarsys.time4sys.analysis.InputJoinBehaviorKind;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.Port;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerParameterValue;
import org.polarsys.time4sys.analysis.Task;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.TaskPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class TaskPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ports ReferencesTable
	 */
	protected ReferencesTableSettings portsSettings;
	
	/**
	 * Settings for parent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parent_Settings;
	
	/**
	 * Settings for scheduledBy EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings scheduledBySettings;
	
	/**
	 * Settings for schedulingParameters ReferencesTable
	 */
	protected ReferencesTableSettings schedulingParametersSettings;
	
	/**
	 * Settings for lockedMutexes ReferencesTable
	 */
	private ReferencesTableSettings lockedMutexesSettings;
	
	/**
	 * Settings for mappedTo EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings mappedToSettings;
	
	/**
	 * Settings for fragments ReferencesTable
	 */
	protected ReferencesTableSettings fragmentsSettings;
	
	/**
	 * Settings for first EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings firstSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public TaskPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject task, String editing_mode) {
		super(editingContext, task, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.Task.class;
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
			
			final Task task = (Task)elt;
			final TaskPropertiesEditionPart basePart = (TaskPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.Task.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, task.getName()));
			
			if (isAccessible(AnalysisViewsRepository.Task.Properties.ports)) {
				portsSettings = new ReferencesTableSettings(task, AnalysisPackage.eINSTANCE.getPortContainer_Ports());
				basePart.initPorts(portsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.behaviorKind)) {
				basePart.initBehaviorKind(EEFUtils.choiceOfValues(task, AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind()), task.getBehaviorKind());
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.parent_)) {
				// init part
				parent_Settings = new EObjectFlatComboSettings(task, AnalysisPackage.eINSTANCE.getSchedulableElement_Parent());
				basePart.initParent_(parent_Settings);
				// set the button mode
				basePart.setParent_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.scheduledBy)) {
				// init part
				scheduledBySettings = new EObjectFlatComboSettings(task, AnalysisPackage.eINSTANCE.getSchedulableElement_ScheduledBy());
				basePart.initScheduledBy(scheduledBySettings);
				// set the button mode
				basePart.setScheduledByButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.cET))
				basePart.setCET(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_TIME_INTERVAL, task.getCET()));
			
			if (isAccessible(AnalysisViewsRepository.Task.Properties.schedulingParameters)) {
				schedulingParametersSettings = new ReferencesTableSettings(task, AnalysisPackage.eINSTANCE.getSchedulableElement_SchedulingParameters());
				basePart.initSchedulingParameters(schedulingParametersSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.originalName))
				basePart.setOriginalName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, task.getOriginalName()));
			
			if (isAccessible(AnalysisViewsRepository.Task.Properties.lockedMutexes)) {
				lockedMutexesSettings = new ReferencesTableSettings(task, AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes());
				basePart.initLockedMutexes(lockedMutexesSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.mappedTo)) {
				// init part
				mappedToSettings = new EObjectFlatComboSettings(task, AnalysisPackage.eINSTANCE.getTask_MappedTo());
				basePart.initMappedTo(mappedToSettings);
				// set the button mode
				basePart.setMappedToButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.fragments)) {
				fragmentsSettings = new ReferencesTableSettings(task, AnalysisPackage.eINSTANCE.getTask_Fragments());
				basePart.initFragments(fragmentsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.first)) {
				// init part
				firstSettings = new EObjectFlatComboSettings(task, AnalysisPackage.eINSTANCE.getTask_First());
				basePart.initFirst(firstSettings);
				// set the button mode
				basePart.setFirstButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.blockingTime)) {
				basePart.setBlockingTime(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, task.getBlockingTime()));
			}
			
			// init filters
			
			if (isAccessible(AnalysisViewsRepository.Task.Properties.ports)) {
				basePart.addFilterToPorts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Port); //$NON-NLS-1$ 
					}
			
				});
			}
			
			if (isAccessible(AnalysisViewsRepository.Task.Properties.parent_)) {
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
			if (isAccessible(AnalysisViewsRepository.Task.Properties.scheduledBy)) {
				basePart.addFilterToScheduledBy(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Scheduler); //$NON-NLS-1$ 
					}
					
				});
			}
			
			if (isAccessible(AnalysisViewsRepository.Task.Properties.schedulingParameters)) {
				basePart.addFilterToSchedulingParameters(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SchedulerParameterValue); //$NON-NLS-1$ 
					}
			
				});
			}
			
			if (isAccessible(AnalysisViewsRepository.Task.Properties.lockedMutexes)) {
				basePart.addFilterToLockedMutexes(new EObjectFilter(AnalysisPackage.Literals.MUTUAL_EXCLUSION_RESOURCE));
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.mappedTo)) {
				basePart.addFilterToMappedTo(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ComputingResource);
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.fragments)) {
				basePart.addFilterToFragments(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Fragment);
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.Task.Properties.first)) {
				basePart.addFilterToFirst(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Fragment);
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
		if (editorKey == AnalysisViewsRepository.Task.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.ports) {
			return AnalysisPackage.eINSTANCE.getPortContainer_Ports();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.behaviorKind) {
			return AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.parent_) {
			return AnalysisPackage.eINSTANCE.getSchedulableElement_Parent();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.scheduledBy) {
			return AnalysisPackage.eINSTANCE.getSchedulableElement_ScheduledBy();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.cET) {
			return AnalysisPackage.eINSTANCE.getSchedulableElement_CET();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.schedulingParameters) {
			return AnalysisPackage.eINSTANCE.getSchedulableElement_SchedulingParameters();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.originalName) {
			return AnalysisPackage.eINSTANCE.getSchedulableElement_OriginalName();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.lockedMutexes) {
			return AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.mappedTo) {
			return AnalysisPackage.eINSTANCE.getTask_MappedTo();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.fragments) {
			return AnalysisPackage.eINSTANCE.getTask_Fragments();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.first) {
			return AnalysisPackage.eINSTANCE.getTask_First();
		}
		if (editorKey == AnalysisViewsRepository.Task.Properties.blockingTime) {
			return AnalysisPackage.eINSTANCE.getTask_BlockingTime();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Task task = (Task)semanticObject;
		if (AnalysisViewsRepository.Task.Properties.name == event.getAffectedEditor()) {
			task.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.Task.Properties.ports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, portsSettings, editingContext.getAdapterFactory());
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
				portsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				portsSettings.move(event.getNewIndex(), (Port) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.Task.Properties.behaviorKind == event.getAffectedEditor()) {
			task.setBehaviorKind((InputJoinBehaviorKind)event.getNewValue());
		}
		if (AnalysisViewsRepository.Task.Properties.parent_ == event.getAffectedEditor()) {
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
		if (AnalysisViewsRepository.Task.Properties.scheduledBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				scheduledBySettings.setToReference((Scheduler)event.getNewValue());
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
				scheduledBySettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Task.Properties.cET == event.getAffectedEditor()) {
			task.setCET((org.polarsys.time4sys.marte.nfp.TimeInterval)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_TIME_INTERVAL, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.Task.Properties.schedulingParameters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, schedulingParametersSettings, editingContext.getAdapterFactory());
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
				schedulingParametersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				schedulingParametersSettings.move(event.getNewIndex(), (SchedulerParameterValue) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.Task.Properties.originalName == event.getAffectedEditor()) {
			task.setOriginalName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.Task.Properties.lockedMutexes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MutualExclusionResource) {
					lockedMutexesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				lockedMutexesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				lockedMutexesSettings.move(event.getNewIndex(), (MutualExclusionResource) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.Task.Properties.mappedTo == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mappedToSettings.setToReference((ComputingResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ComputingResource eObject = AnalysisFactory.eINSTANCE.createComputingResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				mappedToSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Task.Properties.fragments == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, fragmentsSettings, editingContext.getAdapterFactory());
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
				fragmentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				fragmentsSettings.move(event.getNewIndex(), (Fragment) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.Task.Properties.first == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				firstSettings.setToReference((Fragment)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Fragment eObject = AnalysisFactory.eINSTANCE.createFragment();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				firstSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Task.Properties.blockingTime == event.getAffectedEditor()) {
			task.setBlockingTime((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TaskPropertiesEditionPart basePart = (TaskPropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getPortContainer_Ports().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.Task.Properties.ports))
				basePart.updatePorts();
			if (AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(AnalysisViewsRepository.Task.Properties.behaviorKind))
				basePart.setBehaviorKind((InputJoinBehaviorKind)msg.getNewValue());
			
			if (AnalysisPackage.eINSTANCE.getSchedulableElement_Parent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.parent_))
				basePart.setParent_((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getSchedulableElement_ScheduledBy().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.scheduledBy))
				basePart.setScheduledBy((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getSchedulableElement_CET().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.cET)) {
				if (msg.getNewValue() != null) {
					basePart.setCET(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_TIME_INTERVAL, msg.getNewValue()));
				} else {
					basePart.setCET("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getSchedulableElement_SchedulingParameters().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.Task.Properties.schedulingParameters))
				basePart.updateSchedulingParameters();
			if (AnalysisPackage.eINSTANCE.getSchedulableElement_OriginalName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.originalName)) {
				if (msg.getNewValue() != null) {
					basePart.setOriginalName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOriginalName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.Task.Properties.lockedMutexes))
				basePart.updateLockedMutexes();
			if (AnalysisPackage.eINSTANCE.getTask_MappedTo().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.mappedTo))
				basePart.setMappedTo((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getTask_Fragments().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.Task.Properties.fragments))
				basePart.updateFragments();
			if (AnalysisPackage.eINSTANCE.getTask_First().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.first))
				basePart.setFirst((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getTask_BlockingTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Task.Properties.blockingTime)) {
				if (msg.getNewValue() != null) {
					basePart.setBlockingTime(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setBlockingTime("");
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
			AnalysisPackage.eINSTANCE.getPortContainer_Ports(),
			AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind(),
			AnalysisPackage.eINSTANCE.getSchedulableElement_Parent(),
			AnalysisPackage.eINSTANCE.getSchedulableElement_ScheduledBy(),
			AnalysisPackage.eINSTANCE.getSchedulableElement_CET(),
			AnalysisPackage.eINSTANCE.getSchedulableElement_SchedulingParameters(),
			AnalysisPackage.eINSTANCE.getSchedulableElement_OriginalName(),
			AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes(),
			AnalysisPackage.eINSTANCE.getTask_MappedTo(),
			AnalysisPackage.eINSTANCE.getTask_Fragments(),
			AnalysisPackage.eINSTANCE.getTask_First(),
			AnalysisPackage.eINSTANCE.getTask_BlockingTime()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.Task.Properties.parent_ || key == AnalysisViewsRepository.Task.Properties.cET || key == AnalysisViewsRepository.Task.Properties.mappedTo || key == AnalysisViewsRepository.Task.Properties.fragments || key == AnalysisViewsRepository.Task.Properties.first;
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
				if (AnalysisViewsRepository.Task.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Task.Properties.behaviorKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Task.Properties.cET == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getSchedulableElement_CET().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getSchedulableElement_CET().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Task.Properties.originalName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getSchedulableElement_OriginalName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getSchedulableElement_OriginalName().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Task.Properties.blockingTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getTask_BlockingTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getTask_BlockingTime().getEAttributeType(), newValue);
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
