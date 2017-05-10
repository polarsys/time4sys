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
import org.polarsys.time4sys.analysis.MutualExclusionResource;
import org.polarsys.time4sys.analysis.ProtectionParameterValue;
import org.polarsys.time4sys.analysis.ProtectionProtocol;
import org.polarsys.time4sys.analysis.SynchronizableElement;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.MutualExclusionResourcePropertiesEditionPart;


/**
 * 
 * @generated
 */
public class MutualExclusionResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for elements ReferencesTable
	 */
	private ReferencesTableSettings elementsSettings;
	
	/**
	 * Settings for protectionParameters ReferencesTable
	 */
	protected ReferencesTableSettings protectionParametersSettings;
	
	/**
	 * Settings for protectedBy EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings protectedBySettings;
	
	/**
	 * Settings for parent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parent_Settings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public MutualExclusionResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject mutualExclusionResource, String editing_mode) {
		super(editingContext, mutualExclusionResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.MutualExclusionResource.class;
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
			
			final MutualExclusionResource mutualExclusionResource = (MutualExclusionResource)elt;
			final MutualExclusionResourcePropertiesEditionPart basePart = (MutualExclusionResourcePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, mutualExclusionResource.getName()));
			
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.elements)) {
				elementsSettings = new ReferencesTableSettings(mutualExclusionResource, AnalysisPackage.eINSTANCE.getMutualExclusionResource_Elements());
				basePart.initElements(elementsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters)) {
				protectionParametersSettings = new ReferencesTableSettings(mutualExclusionResource, AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectionParameters());
				basePart.initProtectionParameters(protectionParametersSettings);
			}
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy)) {
				// init part
				protectedBySettings = new EObjectFlatComboSettings(mutualExclusionResource, AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectedBy());
				basePart.initProtectedBy(protectedBySettings);
				// set the button mode
				basePart.setProtectedByButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_)) {
				// init part
				parent_Settings = new EObjectFlatComboSettings(mutualExclusionResource, AnalysisPackage.eINSTANCE.getMutualExclusionResource_Parent());
				basePart.initParent_(parent_Settings);
				// set the button mode
				basePart.setParent_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.elements)) {
				basePart.addFilterToElements(new EObjectFilter(AnalysisPackage.Literals.SYNCHRONIZABLE_ELEMENT));
			}
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters)) {
				basePart.addFilterToProtectionParameters(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ProtectionParameterValue); //$NON-NLS-1$ 
					}
			
				});
			}
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy)) {
				basePart.addFilterToProtectedBy(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ProtectionProtocol);
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_)) {
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
		if (editorKey == AnalysisViewsRepository.MutualExclusionResource.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.MutualExclusionResource.Properties.elements) {
			return AnalysisPackage.eINSTANCE.getMutualExclusionResource_Elements();
		}
		if (editorKey == AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters) {
			return AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectionParameters();
		}
		if (editorKey == AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy) {
			return AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectedBy();
		}
		if (editorKey == AnalysisViewsRepository.MutualExclusionResource.Properties.parent_) {
			return AnalysisPackage.eINSTANCE.getMutualExclusionResource_Parent();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MutualExclusionResource mutualExclusionResource = (MutualExclusionResource)semanticObject;
		if (AnalysisViewsRepository.MutualExclusionResource.Properties.name == event.getAffectedEditor()) {
			mutualExclusionResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.MutualExclusionResource.Properties.elements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SynchronizableElement) {
					elementsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				elementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				elementsSettings.move(event.getNewIndex(), (SynchronizableElement) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, protectionParametersSettings, editingContext.getAdapterFactory());
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
				protectionParametersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				protectionParametersSettings.move(event.getNewIndex(), (ProtectionParameterValue) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				protectedBySettings.setToReference((ProtectionProtocol)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ProtectionProtocol eObject = AnalysisFactory.eINSTANCE.createProtectionProtocol();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				protectedBySettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.MutualExclusionResource.Properties.parent_ == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			MutualExclusionResourcePropertiesEditionPart basePart = (MutualExclusionResourcePropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getMutualExclusionResource_Elements().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.elements))
				basePart.updateElements();
			if (AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectionParameters().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters))
				basePart.updateProtectionParameters();
			if (AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectedBy().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy))
				basePart.setProtectedBy((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getMutualExclusionResource_Parent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_))
				basePart.setParent_((EObject)msg.getNewValue());
			
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
			AnalysisPackage.eINSTANCE.getMutualExclusionResource_Elements(),
			AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectionParameters(),
			AnalysisPackage.eINSTANCE.getMutualExclusionResource_ProtectedBy(),
			AnalysisPackage.eINSTANCE.getMutualExclusionResource_Parent()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy || key == AnalysisViewsRepository.MutualExclusionResource.Properties.parent_;
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
				if (AnalysisViewsRepository.MutualExclusionResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
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
