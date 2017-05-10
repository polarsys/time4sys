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
import org.polarsys.time4sys.analysis.Delay;
import org.polarsys.time4sys.analysis.EventModelContainer;
import org.polarsys.time4sys.analysis.InputJoinBehaviorKind;
import org.polarsys.time4sys.analysis.Port;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.DelayPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class DelayPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

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
	 * Settings for referencedEvent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings referencedEventSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public DelayPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject delay, String editing_mode) {
		super(editingContext, delay, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.Delay.class;
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
			
			final Delay delay = (Delay)elt;
			final DelayPropertiesEditionPart basePart = (DelayPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, delay.getName()));
			
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.ports)) {
				portsSettings = new ReferencesTableSettings(delay, AnalysisPackage.eINSTANCE.getPortContainer_Ports());
				basePart.initPorts(portsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.behaviorKind)) {
				basePart.initBehaviorKind(EEFUtils.choiceOfValues(delay, AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind()), delay.getBehaviorKind());
			}
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.parent_)) {
				// init part
				parent_Settings = new EObjectFlatComboSettings(delay, AnalysisPackage.eINSTANCE.getDelay_Parent());
				basePart.initParent_(parent_Settings);
				// set the button mode
				basePart.setParent_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.referencedEvent)) {
				// init part
				referencedEventSettings = new EObjectFlatComboSettings(delay, AnalysisPackage.eINSTANCE.getDelay_ReferencedEvent());
				basePart.initReferencedEvent(referencedEventSettings);
				// set the button mode
				basePart.setReferencedEventButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.duration))
				basePart.setDuration(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, delay.getDuration()));
			
			// init filters
			
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.ports)) {
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
			
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.parent_)) {
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
			if (isAccessible(AnalysisViewsRepository.Delay.Properties.referencedEvent)) {
				basePart.addFilterToReferencedEvent(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EventModelContainer); //$NON-NLS-1$ 
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
		if (editorKey == AnalysisViewsRepository.Delay.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.Delay.Properties.ports) {
			return AnalysisPackage.eINSTANCE.getPortContainer_Ports();
		}
		if (editorKey == AnalysisViewsRepository.Delay.Properties.behaviorKind) {
			return AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind();
		}
		if (editorKey == AnalysisViewsRepository.Delay.Properties.parent_) {
			return AnalysisPackage.eINSTANCE.getDelay_Parent();
		}
		if (editorKey == AnalysisViewsRepository.Delay.Properties.referencedEvent) {
			return AnalysisPackage.eINSTANCE.getDelay_ReferencedEvent();
		}
		if (editorKey == AnalysisViewsRepository.Delay.Properties.duration) {
			return AnalysisPackage.eINSTANCE.getDelay_Duration();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Delay delay = (Delay)semanticObject;
		if (AnalysisViewsRepository.Delay.Properties.name == event.getAffectedEditor()) {
			delay.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.Delay.Properties.ports == event.getAffectedEditor()) {
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
		if (AnalysisViewsRepository.Delay.Properties.behaviorKind == event.getAffectedEditor()) {
			delay.setBehaviorKind((InputJoinBehaviorKind)event.getNewValue());
		}
		if (AnalysisViewsRepository.Delay.Properties.parent_ == event.getAffectedEditor()) {
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
		if (AnalysisViewsRepository.Delay.Properties.referencedEvent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				referencedEventSettings.setToReference((EventModelContainer)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, referencedEventSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (AnalysisViewsRepository.Delay.Properties.duration == event.getAffectedEditor()) {
			delay.setDuration((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			DelayPropertiesEditionPart basePart = (DelayPropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Delay.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getPortContainer_Ports().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.Delay.Properties.ports))
				basePart.updatePorts();
			if (AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(AnalysisViewsRepository.Delay.Properties.behaviorKind))
				basePart.setBehaviorKind((InputJoinBehaviorKind)msg.getNewValue());
			
			if (AnalysisPackage.eINSTANCE.getDelay_Parent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Delay.Properties.parent_))
				basePart.setParent_((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getDelay_ReferencedEvent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.Delay.Properties.referencedEvent))
				basePart.setReferencedEvent((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getDelay_Duration().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.Delay.Properties.duration)) {
				if (msg.getNewValue() != null) {
					basePart.setDuration(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					basePart.setDuration("");
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
			AnalysisPackage.eINSTANCE.getDelay_Parent(),
			AnalysisPackage.eINSTANCE.getDelay_ReferencedEvent(),
			AnalysisPackage.eINSTANCE.getDelay_Duration()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.Delay.Properties.parent_;
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
				if (AnalysisViewsRepository.Delay.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Delay.Properties.behaviorKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getPortContainer_BehaviorKind().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.Delay.Properties.duration == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getDelay_Duration().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getDelay_Duration().getEAttributeType(), newValue);
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
