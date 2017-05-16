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
import org.polarsys.time4sys.analysis.Fragment;
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.Task;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.FragmentPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class FragmentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for lockedMutexes ReferencesTable
	 */
	private ReferencesTableSettings lockedMutexesSettings;
	
	/**
	 * Settings for next EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings nextSettings;
	
	/**
	 * Settings for previous EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings previousSettings;
	
	/**
	 * Settings for task EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings taskSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public FragmentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject fragment, String editing_mode) {
		super(editingContext, fragment, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.Fragment.class;
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
			
			final Fragment fragment = (Fragment)elt;
			final FragmentPropertiesEditionPart basePart = (FragmentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, fragment.getName()));
			
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.lockedMutexes)) {
				lockedMutexesSettings = new ReferencesTableSettings(fragment, AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes());
				basePart.initLockedMutexes(lockedMutexesSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.next)) {
				// init part
				nextSettings = new EObjectFlatComboSettings(fragment, AnalysisPackage.eINSTANCE.getFragment_Next());
				basePart.initNext(nextSettings);
				// set the button mode
				basePart.setNextButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.previous)) {
				// init part
				previousSettings = new EObjectFlatComboSettings(fragment, AnalysisPackage.eINSTANCE.getFragment_Previous());
				basePart.initPrevious(previousSettings);
				// set the button mode
				basePart.setPreviousButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.task)) {
				// init part
				taskSettings = new EObjectFlatComboSettings(fragment, AnalysisPackage.eINSTANCE.getFragment_Task());
				basePart.initTask(taskSettings);
				// set the button mode
				basePart.setTaskButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.cET))
				basePart.setCET(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_TIME_INTERVAL, fragment.getCET()));
			
			// init filters
			
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.lockedMutexes)) {
				basePart.addFilterToLockedMutexes(new EObjectFilter(AnalysisPackage.Literals.MUTUAL_EXCLUSION_RESOURCE));
			}
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.next)) {
				basePart.addFilterToNext(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Fragment); //$NON-NLS-1$ 
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.previous)) {
				basePart.addFilterToPrevious(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Fragment); //$NON-NLS-1$ 
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.Fragment.Properties.task)) {
				basePart.addFilterToTask(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Task);
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
		if (editorKey == AnalysisViewsRepository.Fragment.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.Fragment.Properties.lockedMutexes) {
			return AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes();
		}
		if (editorKey == AnalysisViewsRepository.Fragment.Properties.next) {
			return AnalysisPackage.eINSTANCE.getFragment_Next();
		}
		if (editorKey == AnalysisViewsRepository.Fragment.Properties.previous) {
			return AnalysisPackage.eINSTANCE.getFragment_Previous();
		}
		if (editorKey == AnalysisViewsRepository.Fragment.Properties.task) {
			return AnalysisPackage.eINSTANCE.getFragment_Task();
		}
		if (editorKey == AnalysisViewsRepository.Fragment.Properties.cET) {
			return AnalysisPackage.eINSTANCE.getFragment_CET();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Fragment fragment = (Fragment)semanticObject;
		if (AnalysisViewsRepository.Fragment.Properties.name == event.getAffectedEditor()) {
			fragment.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.Fragment.Properties.lockedMutexes == event.getAffectedEditor()) {
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
		if (AnalysisViewsRepository.Fragment.Properties.next == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				nextSettings.setToReference((Fragment)event.getNewValue());
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
				nextSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Fragment.Properties.previous == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				previousSettings.setToReference((Fragment)event.getNewValue());
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
				previousSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Fragment.Properties.task == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				taskSettings.setToReference((Task)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Task eObject = AnalysisFactory.eINSTANCE.createTask();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				taskSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.Fragment.Properties.cET == event.getAffectedEditor()) {
			fragment.setCET((org.polarsys.time4sys.marte.nfp.TimeInterval)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_TIME_INTERVAL, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			FragmentPropertiesEditionPart basePart = (FragmentPropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Fragment.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.Fragment.Properties.lockedMutexes))
				basePart.updateLockedMutexes();
			if (AnalysisPackage.eINSTANCE.getFragment_Next().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Fragment.Properties.next))
				basePart.setNext((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getFragment_Previous().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Fragment.Properties.previous))
				basePart.setPrevious((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getFragment_Task().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Fragment.Properties.task))
				basePart.setTask((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getFragment_CET().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Fragment.Properties.cET)) {
				if (msg.getNewValue() != null) {
					basePart.setCET(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_TIME_INTERVAL, msg.getNewValue()));
				} else {
					basePart.setCET("");
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
			AnalysisPackage.eINSTANCE.getSynchronizableElement_LockedMutexes(),
			AnalysisPackage.eINSTANCE.getFragment_Next(),
			AnalysisPackage.eINSTANCE.getFragment_Previous(),
			AnalysisPackage.eINSTANCE.getFragment_Task(),
			AnalysisPackage.eINSTANCE.getFragment_CET()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.Fragment.Properties.task;
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
				if (AnalysisViewsRepository.Fragment.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Fragment.Properties.cET == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getFragment_CET().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getFragment_CET().getEAttributeType(), newValue);
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
