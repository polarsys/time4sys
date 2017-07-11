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
package org.polarsys.time4sys.ui.views.design.parts.forms;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.polarsys.time4sys.ui.views.design.parts.DesignModelPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.design.parts.DesignViewsRepository;
import org.polarsys.time4sys.ui.views.design.providers.DesignMessages;


/**
 * 
 * @generated
 */
public class DesignModelPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DesignModelPropertiesEditionPart {

	protected ReferencesTable endToEndFlows;
	protected List<ViewerFilter> endToEndFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> endToEndFlowsFilters = new ArrayList<ViewerFilter>();
	protected Text name;



	/**
	 * For {@link ISection} use only.
	 */
	public DesignModelPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public DesignModelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence designModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = designModelStep.addStep(DesignViewsRepository.DesignModel.Properties.class);
		propertiesStep.addStep(DesignViewsRepository.DesignModel.Properties.endToEndFlows);
		propertiesStep.addStep(DesignViewsRepository.DesignModel.Properties.name);
		
		
		composer = new PartComposer(designModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DesignViewsRepository.DesignModel.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DesignViewsRepository.DesignModel.Properties.endToEndFlows) {
					return createEndToEndFlowsTableComposition(widgetFactory, parent);
				}
				if (key == DesignViewsRepository.DesignModel.Properties.name) {
					return createNameText(widgetFactory, parent);
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
		propertiesSection.setText(DesignMessages.DesignModelPropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param container
	 * @generated
	 */
	protected Composite createEndToEndFlowsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.endToEndFlows = new ReferencesTable(getDescription(DesignViewsRepository.DesignModel.Properties.endToEndFlows, DesignMessages.DesignModelPropertiesEditionPart_EndToEndFlowsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DesignModelPropertiesEditionPartForm.this, DesignViewsRepository.DesignModel.Properties.endToEndFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				endToEndFlows.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DesignModelPropertiesEditionPartForm.this, DesignViewsRepository.DesignModel.Properties.endToEndFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				endToEndFlows.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DesignModelPropertiesEditionPartForm.this, DesignViewsRepository.DesignModel.Properties.endToEndFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				endToEndFlows.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DesignModelPropertiesEditionPartForm.this, DesignViewsRepository.DesignModel.Properties.endToEndFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				endToEndFlows.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.endToEndFlowsFilters) {
			this.endToEndFlows.addFilter(filter);
		}
		this.endToEndFlows.setHelpText(propertiesEditionComponent.getHelpContent(DesignViewsRepository.DesignModel.Properties.endToEndFlows, DesignViewsRepository.FORM_KIND));
		this.endToEndFlows.createControls(parent, widgetFactory);
		this.endToEndFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DesignModelPropertiesEditionPartForm.this, DesignViewsRepository.DesignModel.Properties.endToEndFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData endToEndFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		endToEndFlowsData.horizontalSpan = 3;
		this.endToEndFlows.setLayoutData(endToEndFlowsData);
		this.endToEndFlows.setLowerBound(0);
		this.endToEndFlows.setUpperBound(-1);
		endToEndFlows.setID(DesignViewsRepository.DesignModel.Properties.endToEndFlows);
		endToEndFlows.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEndToEndFlowsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, DesignViewsRepository.DesignModel.Properties.name, DesignMessages.DesignModelPropertiesEditionPart_NameLabel);
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
							DesignModelPropertiesEditionPartForm.this,
							DesignViewsRepository.DesignModel.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DesignModelPropertiesEditionPartForm.this,
									DesignViewsRepository.DesignModel.Properties.name,
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
									DesignModelPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DesignModelPropertiesEditionPartForm.this, DesignViewsRepository.DesignModel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DesignViewsRepository.DesignModel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DesignViewsRepository.DesignModel.Properties.name, DesignViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

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
	 * @see org.polarsys.time4sys.ui.design.parts.DesignModelPropertiesEditionPart#initEndToEndFlows(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEndToEndFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		endToEndFlows.setContentProvider(contentProvider);
		endToEndFlows.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(DesignViewsRepository.DesignModel.Properties.endToEndFlows);
		if (eefElementEditorReadOnlyState && endToEndFlows.isEnabled()) {
			endToEndFlows.setEnabled(false);
			endToEndFlows.setToolTipText(DesignMessages.DesignModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endToEndFlows.isEnabled()) {
			endToEndFlows.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.design.parts.DesignModelPropertiesEditionPart#updateEndToEndFlows()
	 * @generated
	 */
	public void updateEndToEndFlows() {
	endToEndFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.design.parts.DesignModelPropertiesEditionPart#addFilterEndToEndFlows(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToEndToEndFlows(ViewerFilter filter) {
		endToEndFlowsFilters.add(filter);
		if (this.endToEndFlows != null) {
			this.endToEndFlows.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.design.parts.DesignModelPropertiesEditionPart#addBusinessFilterEndToEndFlows(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToEndToEndFlows(ViewerFilter filter) {
		endToEndFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.design.parts.DesignModelPropertiesEditionPart#isContainedInEndToEndFlowsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInEndToEndFlowsTable(EObject element) {
		return ((ReferencesTableSettings)endToEndFlows.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.design.parts.DesignModelPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.design.parts.DesignModelPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(DesignViewsRepository.DesignModel.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(DesignMessages.DesignModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return DesignMessages.DesignModel_Part_Title;
	}



}
