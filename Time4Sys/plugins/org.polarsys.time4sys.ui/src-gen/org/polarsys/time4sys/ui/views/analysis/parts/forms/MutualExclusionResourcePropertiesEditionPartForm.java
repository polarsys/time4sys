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
package org.polarsys.time4sys.ui.views.analysis.parts.forms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.MutualExclusionResourcePropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class MutualExclusionResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, MutualExclusionResourcePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable elements;
	protected List<ViewerFilter> elementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> elementsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable protectionParameters;
	protected List<ViewerFilter> protectionParametersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> protectionParametersFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer protectedBy;
	protected EObjectFlatComboViewer parent_;



	/**
	 * For {@link ISection} use only.
	 */
	public MutualExclusionResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public MutualExclusionResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * @generated
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence mutualExclusionResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = mutualExclusionResourceStep.addStep(AnalysisViewsRepository.MutualExclusionResource.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.MutualExclusionResource.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.MutualExclusionResource.Properties.elements);
		propertiesStep.addStep(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters);
		propertiesStep.addStep(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy);
		propertiesStep.addStep(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_);
		
		
		composer = new PartComposer(mutualExclusionResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.MutualExclusionResource.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MutualExclusionResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MutualExclusionResource.Properties.elements) {
					return createElementsReferencesTable(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters) {
					return createProtectionParametersTableComposition(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy) {
					return createProtectedByFlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.MutualExclusionResource.Properties.parent_) {
					return createParent_FlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(AnalysisMessages.MutualExclusionResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @generated
	 */
	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.MutualExclusionResource.Properties.name, AnalysisMessages.MutualExclusionResourcePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MutualExclusionResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.MutualExclusionResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MutualExclusionResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.MutualExclusionResource.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MutualExclusionResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, AnalysisViewsRepository.MutualExclusionResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MutualExclusionResource.Properties.name, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createElementsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.elements = new ReferencesTable(getDescription(AnalysisViewsRepository.MutualExclusionResource.Properties.elements, AnalysisMessages.MutualExclusionResourcePropertiesEditionPart_ElementsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addElements(); }
			public void handleEdit(EObject element) { editElements(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveElements(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromElements(element); }
			public void navigateTo(EObject element) { }
		});
		this.elements.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MutualExclusionResource.Properties.elements, AnalysisViewsRepository.FORM_KIND));
		this.elements.createControls(parent, widgetFactory);
		this.elements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.elements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData elementsData = new GridData(GridData.FILL_HORIZONTAL);
		elementsData.horizontalSpan = 3;
		this.elements.setLayoutData(elementsData);
		this.elements.disableMove();
		elements.setID(AnalysisViewsRepository.MutualExclusionResource.Properties.elements);
		elements.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createElementsReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addElements() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(elements.getInput(), elementsFilters, elementsBusinessFilters,
		"elements", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.elements,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				elements.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveElements(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.elements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		elements.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromElements(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.elements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		elements.refresh();
	}

	/**
	 * @generated
	 */
	protected void editElements(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				elements.refresh();
			}
		}
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createProtectionParametersTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.protectionParameters = new ReferencesTable(getDescription(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters, AnalysisMessages.MutualExclusionResourcePropertiesEditionPart_ProtectionParametersLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				protectionParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				protectionParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				protectionParameters.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				protectionParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.protectionParametersFilters) {
			this.protectionParameters.addFilter(filter);
		}
		this.protectionParameters.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters, AnalysisViewsRepository.FORM_KIND));
		this.protectionParameters.createControls(parent, widgetFactory);
		this.protectionParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData protectionParametersData = new GridData(GridData.FILL_HORIZONTAL);
		protectionParametersData.horizontalSpan = 3;
		this.protectionParameters.setLayoutData(protectionParametersData);
		this.protectionParameters.setLowerBound(0);
		this.protectionParameters.setUpperBound(-1);
		protectionParameters.setID(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters);
		protectionParameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProtectionParametersTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createProtectedByFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy, AnalysisMessages.MutualExclusionResourcePropertiesEditionPart_ProtectedByLabel);
		protectedBy = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(protectedBy);
		protectedBy.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData protectedByData = new GridData(GridData.FILL_HORIZONTAL);
		protectedBy.setLayoutData(protectedByData);
		protectedBy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProtectedBy()));
			}

		});
		protectedBy.setID(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createProtectedByFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.MutualExclusionResource.Properties.parent_, AnalysisMessages.MutualExclusionResourcePropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(parent_);
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MutualExclusionResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MutualExclusionResource.Properties.parent_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		parent_.setID(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MutualExclusionResource.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.MutualExclusionResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#initElements(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		elements.setContentProvider(contentProvider);
		elements.setInput(settings);
		elementsBusinessFilters.clear();
		elementsFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MutualExclusionResource.Properties.elements);
		if (eefElementEditorReadOnlyState && elements.getTable().isEnabled()) {
			elements.setEnabled(false);
			elements.setToolTipText(AnalysisMessages.MutualExclusionResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !elements.getTable().isEnabled()) {
			elements.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#updateElements()
	 * @generated
	 */
	public void updateElements() {
	elements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addFilterElements(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToElements(ViewerFilter filter) {
		elementsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addBusinessFilterElements(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToElements(ViewerFilter filter) {
		elementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#isContainedInElementsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInElementsTable(EObject element) {
		return ((ReferencesTableSettings)elements.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#initProtectionParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProtectionParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		protectionParameters.setContentProvider(contentProvider);
		protectionParameters.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MutualExclusionResource.Properties.protectionParameters);
		if (eefElementEditorReadOnlyState && protectionParameters.isEnabled()) {
			protectionParameters.setEnabled(false);
			protectionParameters.setToolTipText(AnalysisMessages.MutualExclusionResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protectionParameters.isEnabled()) {
			protectionParameters.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#updateProtectionParameters()
	 * @generated
	 */
	public void updateProtectionParameters() {
	protectionParameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addFilterProtectionParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToProtectionParameters(ViewerFilter filter) {
		protectionParametersFilters.add(filter);
		if (this.protectionParameters != null) {
			this.protectionParameters.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addBusinessFilterProtectionParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToProtectionParameters(ViewerFilter filter) {
		protectionParametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#isContainedInProtectionParametersTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInProtectionParametersTable(EObject element) {
		return ((ReferencesTableSettings)protectionParameters.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#getProtectedBy()
	 * @generated
	 */
	public EObject getProtectedBy() {
		if (protectedBy.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) protectedBy.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#initProtectedBy(EObjectFlatComboSettings)
	 */
	public void initProtectedBy(EObjectFlatComboSettings settings) {
		protectedBy.setInput(settings);
		if (current != null) {
			protectedBy.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy);
		if (eefElementEditorReadOnlyState && protectedBy.isEnabled()) {
			protectedBy.setEnabled(false);
			protectedBy.setToolTipText(AnalysisMessages.MutualExclusionResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protectedBy.isEnabled()) {
			protectedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#setProtectedBy(EObject newValue)
	 * @generated
	 */
	public void setProtectedBy(EObject newValue) {
		if (newValue != null) {
			protectedBy.setSelection(new StructuredSelection(newValue));
		} else {
			protectedBy.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MutualExclusionResource.Properties.protectedBy);
		if (eefElementEditorReadOnlyState && protectedBy.isEnabled()) {
			protectedBy.setEnabled(false);
			protectedBy.setToolTipText(AnalysisMessages.MutualExclusionResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protectedBy.isEnabled()) {
			protectedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#setProtectedByButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProtectedByButtonMode(ButtonsModeEnum newValue) {
		protectedBy.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addFilterProtectedBy(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToProtectedBy(ViewerFilter filter) {
		protectedBy.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addBusinessFilterProtectedBy(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToProtectedBy(ViewerFilter filter) {
		protectedBy.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#getParent_()
	 * @generated
	 */
	public EObject getParent_() {
		if (parent_.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parent_.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.MutualExclusionResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MutualExclusionResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.MutualExclusionResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MutualExclusionResourcePropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.MutualExclusionResource_Part_Title;
	}



}
