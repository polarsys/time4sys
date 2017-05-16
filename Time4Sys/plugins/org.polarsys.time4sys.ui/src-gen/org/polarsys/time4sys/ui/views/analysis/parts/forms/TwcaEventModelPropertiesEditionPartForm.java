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
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.TwcaEventModelPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class TwcaEventModelPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TwcaEventModelPropertiesEditionPart {

	protected ReferencesTable offsets;
	protected List<ViewerFilter> offsetsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> offsetsFilters = new ArrayList<ViewerFilter>();
	protected Text period;
	protected Text jitter;
	protected Text dmin;
	protected EObjectFlatComboViewer parent_;
	protected Button isSporadic;
	protected Text deltamin_func;



	/**
	 * For {@link ISection} use only.
	 */
	public TwcaEventModelPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TwcaEventModelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence twcaEventModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = twcaEventModelStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.offsets);
		propertiesStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.period);
		propertiesStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.jitter);
		propertiesStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.dmin);
		propertiesStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.isSporadic);
		propertiesStep.addStep(AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func);
		
		
		composer = new PartComposer(twcaEventModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.offsets) {
					return createOffsetsTableComposition(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.period) {
					return createPeriodText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.jitter) {
					return createJitterText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.dmin) {
					return createDminText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.parent_) {
					return createParent_FlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.isSporadic) {
					return createIsSporadicCheckbox(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func) {
					return createDeltamin_funcText(widgetFactory, parent);
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
		propertiesSection.setText(AnalysisMessages.TwcaEventModelPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createOffsetsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.offsets = new ReferencesTable(getDescription(AnalysisViewsRepository.TwcaEventModel.Properties.offsets, AnalysisMessages.TwcaEventModelPropertiesEditionPart_OffsetsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.offsets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				offsets.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.offsets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				offsets.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.offsets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				offsets.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.offsets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				offsets.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.offsetsFilters) {
			this.offsets.addFilter(filter);
		}
		this.offsets.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.TwcaEventModel.Properties.offsets, AnalysisViewsRepository.FORM_KIND));
		this.offsets.createControls(parent, widgetFactory);
		this.offsets.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.offsets, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData offsetsData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsData.horizontalSpan = 3;
		this.offsets.setLayoutData(offsetsData);
		this.offsets.setLowerBound(0);
		this.offsets.setUpperBound(-1);
		offsets.setID(AnalysisViewsRepository.TwcaEventModel.Properties.offsets);
		offsets.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOffsetsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createPeriodText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.TwcaEventModel.Properties.period, AnalysisMessages.TwcaEventModelPropertiesEditionPart_PeriodLabel);
		period = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		period.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData periodData = new GridData(GridData.FILL_HORIZONTAL);
		period.setLayoutData(periodData);
		period.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TwcaEventModelPropertiesEditionPartForm.this,
							AnalysisViewsRepository.TwcaEventModel.Properties.period,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TwcaEventModelPropertiesEditionPartForm.this,
									AnalysisViewsRepository.TwcaEventModel.Properties.period,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, period.getText()));
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
									TwcaEventModelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		period.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
				}
			}
		});
		EditingUtils.setID(period, AnalysisViewsRepository.TwcaEventModel.Properties.period);
		EditingUtils.setEEFtype(period, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.TwcaEventModel.Properties.period, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPeriodText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createJitterText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.TwcaEventModel.Properties.jitter, AnalysisMessages.TwcaEventModelPropertiesEditionPart_JitterLabel);
		jitter = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		jitter.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData jitterData = new GridData(GridData.FILL_HORIZONTAL);
		jitter.setLayoutData(jitterData);
		jitter.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TwcaEventModelPropertiesEditionPartForm.this,
							AnalysisViewsRepository.TwcaEventModel.Properties.jitter,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jitter.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TwcaEventModelPropertiesEditionPartForm.this,
									AnalysisViewsRepository.TwcaEventModel.Properties.jitter,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, jitter.getText()));
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
									TwcaEventModelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		jitter.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jitter.getText()));
				}
			}
		});
		EditingUtils.setID(jitter, AnalysisViewsRepository.TwcaEventModel.Properties.jitter);
		EditingUtils.setEEFtype(jitter, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.TwcaEventModel.Properties.jitter, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createJitterText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createDminText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.TwcaEventModel.Properties.dmin, AnalysisMessages.TwcaEventModelPropertiesEditionPart_DminLabel);
		dmin = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		dmin.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData dminData = new GridData(GridData.FILL_HORIZONTAL);
		dmin.setLayoutData(dminData);
		dmin.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TwcaEventModelPropertiesEditionPartForm.this,
							AnalysisViewsRepository.TwcaEventModel.Properties.dmin,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dmin.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TwcaEventModelPropertiesEditionPartForm.this,
									AnalysisViewsRepository.TwcaEventModel.Properties.dmin,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, dmin.getText()));
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
									TwcaEventModelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		dmin.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.dmin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dmin.getText()));
				}
			}
		});
		EditingUtils.setID(dmin, AnalysisViewsRepository.TwcaEventModel.Properties.dmin);
		EditingUtils.setEEFtype(dmin, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.TwcaEventModel.Properties.dmin, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDminText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.TwcaEventModel.Properties.parent_, AnalysisMessages.TwcaEventModelPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.TwcaEventModel.Properties.parent_, AnalysisViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.parent_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		parent_.setID(AnalysisViewsRepository.TwcaEventModel.Properties.parent_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.TwcaEventModel.Properties.parent_, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createIsSporadicCheckbox(FormToolkit widgetFactory, Composite parent) {
		isSporadic = widgetFactory.createButton(parent, getDescription(AnalysisViewsRepository.TwcaEventModel.Properties.isSporadic, AnalysisMessages.TwcaEventModelPropertiesEditionPart_IsSporadicLabel), SWT.CHECK);
		isSporadic.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	@generated
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.isSporadic, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSporadic.getSelection())));
			}

		});
		GridData isSporadicData = new GridData(GridData.FILL_HORIZONTAL);
		isSporadicData.horizontalSpan = 2;
		isSporadic.setLayoutData(isSporadicData);
		EditingUtils.setID(isSporadic, AnalysisViewsRepository.TwcaEventModel.Properties.isSporadic);
		EditingUtils.setEEFtype(isSporadic, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.TwcaEventModel.Properties.isSporadic, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsSporadicCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createDeltamin_funcText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func, AnalysisMessages.TwcaEventModelPropertiesEditionPart_Deltamin_funcLabel);
		deltamin_func = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		deltamin_func.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData deltamin_funcData = new GridData(GridData.FILL_HORIZONTAL);
		deltamin_func.setLayoutData(deltamin_funcData);
		deltamin_func.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TwcaEventModelPropertiesEditionPartForm.this,
							AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, deltamin_func.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TwcaEventModelPropertiesEditionPartForm.this,
									AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, deltamin_func.getText()));
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
									TwcaEventModelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		deltamin_func.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TwcaEventModelPropertiesEditionPartForm.this, AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, deltamin_func.getText()));
				}
			}
		});
		EditingUtils.setID(deltamin_func, AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func);
		EditingUtils.setEEFtype(deltamin_func, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDeltamin_funcText

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#initOffsets(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOffsets(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		offsets.setContentProvider(contentProvider);
		offsets.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.offsets);
		if (eefElementEditorReadOnlyState && offsets.isEnabled()) {
			offsets.setEnabled(false);
			offsets.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsets.isEnabled()) {
			offsets.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#updateOffsets()
	 * @generated
	 */
	public void updateOffsets() {
	offsets.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#addFilterOffsets(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOffsets(ViewerFilter filter) {
		offsetsFilters.add(filter);
		if (this.offsets != null) {
			this.offsets.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#addBusinessFilterOffsets(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOffsets(ViewerFilter filter) {
		offsetsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#isContainedInOffsetsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInOffsetsTable(EObject element) {
		return ((ReferencesTableSettings)offsets.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#getPeriod()
	 * @generated
	 */
	public String getPeriod() {
		return period.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#setPeriod(String newValue)
	 * @generated
	 */
	public void setPeriod(String newValue) {
		if (newValue != null) {
			period.setText(newValue);
		} else {
			period.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.period);
		if (eefElementEditorReadOnlyState && period.isEnabled()) {
			period.setEnabled(false);
			period.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !period.isEnabled()) {
			period.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#getJitter()
	 * @generated
	 */
	public String getJitter() {
		return jitter.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#setJitter(String newValue)
	 * @generated
	 */
	public void setJitter(String newValue) {
		if (newValue != null) {
			jitter.setText(newValue);
		} else {
			jitter.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.jitter);
		if (eefElementEditorReadOnlyState && jitter.isEnabled()) {
			jitter.setEnabled(false);
			jitter.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !jitter.isEnabled()) {
			jitter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#getDmin()
	 * @generated
	 */
	public String getDmin() {
		return dmin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#setDmin(String newValue)
	 * @generated
	 */
	public void setDmin(String newValue) {
		if (newValue != null) {
			dmin.setText(newValue);
		} else {
			dmin.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.dmin);
		if (eefElementEditorReadOnlyState && dmin.isEnabled()) {
			dmin.setEnabled(false);
			dmin.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dmin.isEnabled()) {
			dmin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#getIsSporadic()
	 * @generated
	 */
	public Boolean getIsSporadic() {
		return Boolean.valueOf(isSporadic.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#setIsSporadic(Boolean newValue)
	 * @generated
	 */
	public void setIsSporadic(Boolean newValue) {
		if (newValue != null) {
			isSporadic.setSelection(newValue.booleanValue());
		} else {
			isSporadic.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.isSporadic);
		if (eefElementEditorReadOnlyState && isSporadic.isEnabled()) {
			isSporadic.setEnabled(false);
			isSporadic.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isSporadic.isEnabled()) {
			isSporadic.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#getDeltamin_func()
	 * @generated
	 */
	public String getDeltamin_func() {
		return deltamin_func.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TwcaEventModelPropertiesEditionPart#setDeltamin_func(String newValue)
	 * @generated
	 */
	public void setDeltamin_func(String newValue) {
		if (newValue != null) {
			deltamin_func.setText(newValue);
		} else {
			deltamin_func.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.TwcaEventModel.Properties.deltamin_func);
		if (eefElementEditorReadOnlyState && deltamin_func.isEnabled()) {
			deltamin_func.setEnabled(false);
			deltamin_func.setToolTipText(AnalysisMessages.TwcaEventModel_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !deltamin_func.isEnabled()) {
			deltamin_func.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.TwcaEventModel_Part_Title;
	}



}
