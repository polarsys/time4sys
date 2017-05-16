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

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.Delay;
import org.polarsys.time4sys.analysis.Mapping;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.ProtectionProtocol;
import org.polarsys.time4sys.analysis.Resource;
import org.polarsys.time4sys.analysis.ResultContainer;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.Stimulus;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.AnalyzedSystemPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class AnalyzedSystemPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for schedulableElements ReferencesTable
	 */
	protected ReferencesTableSettings schedulableElementsSettings;
	
	/**
	 * Settings for schedulers ReferencesTable
	 */
	protected ReferencesTableSettings schedulersSettings;
	
	/**
	 * Settings for resources ReferencesTable
	 */
	protected ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for stimuli ReferencesTable
	 */
	protected ReferencesTableSettings stimuliSettings;
	
	/**
	 * Settings for delays ReferencesTable
	 */
	protected ReferencesTableSettings delaysSettings;
	
	/**
	 * Settings for protectionProtocols ReferencesTable
	 */
	protected ReferencesTableSettings protectionProtocolsSettings;
	
	/**
	 * Settings for mutexes ReferencesTable
	 */
	protected ReferencesTableSettings mutexesSettings;
	
	/**
	 * Settings for resultContainers ReferencesTable
	 */
	protected ReferencesTableSettings resultContainersSettings;
	
	/**
	 * Settings for mappings ReferencesTable
	 */
	protected ReferencesTableSettings mappingsSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public AnalyzedSystemPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject analyzedSystem, String editing_mode) {
		super(editingContext, analyzedSystem, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.AnalyzedSystem.class;
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
			
			final AnalyzedSystem analyzedSystem = (AnalyzedSystem)elt;
			final AnalyzedSystemPropertiesEditionPart basePart = (AnalyzedSystemPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, analyzedSystem.getName()));
			
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements)) {
				schedulableElementsSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_SchedulableElements());
				basePart.initSchedulableElements(schedulableElementsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers)) {
				schedulersSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_Schedulers());
				basePart.initSchedulers(schedulersSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli)) {
				stimuliSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_Stimuli());
				basePart.initStimuli(stimuliSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.delays)) {
				delaysSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_Delays());
				basePart.initDelays(delaysSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols)) {
				protectionProtocolsSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_ProtectionProtocols());
				basePart.initProtectionProtocols(protectionProtocolsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes)) {
				mutexesSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mutexes());
				basePart.initMutexes(mutexesSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.status))
				basePart.setStatus(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, analyzedSystem.getStatus()));
			
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers)) {
				resultContainersSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_ResultContainers());
				basePart.initResultContainers(resultContainersSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings)) {
				mappingsSettings = new ReferencesTableSettings(analyzedSystem, AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mappings());
				basePart.initMappings(mappingsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit))
				basePart.setTimeUnit(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, analyzedSystem.getTimeUnit()));
			
			// init filters
			
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements)) {
				basePart.addFilterToSchedulableElements(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SchedulableElement); //$NON-NLS-1$ 
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers)) {
				basePart.addFilterToSchedulers(new ViewerFilter() {
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
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.resources)) {
				basePart.addFilterToResources(new ViewerFilter() {
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
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli)) {
				basePart.addFilterToStimuli(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Stimulus); //$NON-NLS-1$ 
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.delays)) {
				basePart.addFilterToDelays(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Delay); //$NON-NLS-1$ 
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols)) {
				basePart.addFilterToProtectionProtocols(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ProtectionProtocol); //$NON-NLS-1$ 
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes)) {
				basePart.addFilterToMutexes(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MutualExclusionResource); //$NON-NLS-1$ 
					}
			
				});
			}
			
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers)) {
				basePart.addFilterToResultContainers(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResultContainer); //$NON-NLS-1$ 
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings)) {
				basePart.addFilterToMappings(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Mapping); //$NON-NLS-1$ 
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
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_SchedulableElements();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_Schedulers();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.resources) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_Resources();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_Stimuli();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.delays) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_Delays();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_ProtectionProtocols();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mutexes();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.status) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_Status();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_ResultContainers();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.mappings) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mappings();
		}
		if (editorKey == AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit) {
			return AnalysisPackage.eINSTANCE.getAnalyzedSystem_TimeUnit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AnalyzedSystem analyzedSystem = (AnalyzedSystem)semanticObject;
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.name == event.getAffectedEditor()) {
			analyzedSystem.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, schedulableElementsSettings, editingContext.getAdapterFactory());
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
				schedulableElementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				schedulableElementsSettings.move(event.getNewIndex(), (SchedulableElement) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, schedulersSettings, editingContext.getAdapterFactory());
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
				schedulersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				schedulersSettings.move(event.getNewIndex(), (Scheduler) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.resources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourcesSettings, editingContext.getAdapterFactory());
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
				resourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourcesSettings.move(event.getNewIndex(), (Resource) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, stimuliSettings, editingContext.getAdapterFactory());
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
				stimuliSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				stimuliSettings.move(event.getNewIndex(), (Stimulus) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.delays == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, delaysSettings, editingContext.getAdapterFactory());
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
				delaysSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				delaysSettings.move(event.getNewIndex(), (Delay) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, protectionProtocolsSettings, editingContext.getAdapterFactory());
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
				protectionProtocolsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				protectionProtocolsSettings.move(event.getNewIndex(), (ProtectionProtocol) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, mutexesSettings, editingContext.getAdapterFactory());
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
				mutexesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				mutexesSettings.move(event.getNewIndex(), (MutualExclusionResource) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.status == event.getAffectedEditor()) {
			analyzedSystem.setStatus((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resultContainersSettings, editingContext.getAdapterFactory());
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
				resultContainersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resultContainersSettings.move(event.getNewIndex(), (ResultContainer) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.mappings == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, mappingsSettings, editingContext.getAdapterFactory());
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
				mappingsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				mappingsSettings.move(event.getNewIndex(), (Mapping) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit == event.getAffectedEditor()) {
			analyzedSystem.setTimeUnit((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			AnalyzedSystemPropertiesEditionPart basePart = (AnalyzedSystemPropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_SchedulableElements().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements))
				basePart.updateSchedulableElements();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_Schedulers().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers))
				basePart.updateSchedulers();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_Resources().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.resources))
				basePart.updateResources();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_Stimuli().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli))
				basePart.updateStimuli();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_Delays().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.delays))
				basePart.updateDelays();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_ProtectionProtocols().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols))
				basePart.updateProtectionProtocols();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mutexes().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes))
				basePart.updateMutexes();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_Status().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.status)) {
				if (msg.getNewValue() != null) {
					basePart.setStatus(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setStatus("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_ResultContainers().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers))
				basePart.updateResultContainers();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mappings().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings))
				basePart.updateMappings();
			if (AnalysisPackage.eINSTANCE.getAnalyzedSystem_TimeUnit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit)) {
				if (msg.getNewValue() != null) {
					basePart.setTimeUnit(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTimeUnit("");
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
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_SchedulableElements(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_Schedulers(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_Resources(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_Stimuli(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_Delays(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_ProtectionProtocols(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mutexes(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_Status(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_ResultContainers(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_Mappings(),
			AnalysisPackage.eINSTANCE.getAnalyzedSystem_TimeUnit()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.AnalyzedSystem.Properties.status;
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
				if (AnalysisViewsRepository.AnalyzedSystem.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.AnalyzedSystem.Properties.status == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getAnalyzedSystem_Status().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getAnalyzedSystem_Status().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getAnalyzedSystem_TimeUnit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getAnalyzedSystem_TimeUnit().getEAttributeType(), newValue);
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
