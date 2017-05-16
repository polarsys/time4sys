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
package org.polarsys.time4sys.ui.views.nfp.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
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

import org.polarsys.time4sys.ui.views.nfp.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.nfp.parts.NfpViewsRepository;

import org.polarsys.time4sys.ui.views.nfp.providers.NfpMessages;

// End of user code

/**
 * 
 * 
 */
public class GeneralPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, GeneralPropertiesEditionPart {

	protected Text value;
	protected EMFComboViewer unit;
	protected Button minOpen;
	protected Button maxOpen;
	protected Text best;
	protected Text worst;
	protected Text clock;
	protected Text precision;
	protected EObjectFlatComboViewer min;
	protected EObjectFlatComboViewer max;



	/**
	 * For {@link ISection} use only.
	 */
	public GeneralPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GeneralPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
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
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence generalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = generalStep.addStep(NfpViewsRepository.General.Properties.class);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.value);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.unit);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.minOpen);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.maxOpen);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.best);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.worst);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.clock);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.precision);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.min);
		propertiesStep.addStep(NfpViewsRepository.General.Properties.max);
		
		
		composer = new PartComposer(generalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NfpViewsRepository.General.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.value) {
					return createValueText(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.unit) {
					return createUnitEMFComboViewer(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.minOpen) {
					return createMinOpenCheckbox(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.maxOpen) {
					return createMaxOpenCheckbox(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.best) {
					return createBestText(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.worst) {
					return createWorstText(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.clock) {
					return createClockText(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.precision) {
					return createPrecisionText(widgetFactory, parent);
				}
				if (key == NfpViewsRepository.General.Properties.min) {
					return createMinFlatComboViewer(parent, widgetFactory);
				}
				if (key == NfpViewsRepository.General.Properties.max) {
					return createMaxFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(NfpMessages.GeneralPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NfpViewsRepository.General.Properties.value, NfpMessages.GeneralPropertiesEditionPart_ValueLabel);
		value = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		value.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							NfpViewsRepository.General.Properties.value,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralPropertiesEditionPartForm.this,
									NfpViewsRepository.General.Properties.value,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, value.getText()));
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
									GeneralPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		value.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}
		});
		EditingUtils.setID(value, NfpViewsRepository.General.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.value, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	
	protected Composite createUnitEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NfpViewsRepository.General.Properties.unit, NfpMessages.GeneralPropertiesEditionPart_UnitLabel);
		unit = new EMFComboViewer(parent);
		unit.setContentProvider(new ArrayContentProvider());
		unit.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData unitData = new GridData(GridData.FILL_HORIZONTAL);
		unit.getCombo().setLayoutData(unitData);
		unit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getUnit()));
			}

		});
		unit.setID(NfpViewsRepository.General.Properties.unit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.unit, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createUnitEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createMinOpenCheckbox(FormToolkit widgetFactory, Composite parent) {
		minOpen = widgetFactory.createButton(parent, getDescription(NfpViewsRepository.General.Properties.minOpen, NfpMessages.GeneralPropertiesEditionPart_MinOpenLabel), SWT.CHECK);
		minOpen.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.minOpen, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(minOpen.getSelection())));
			}

		});
		GridData minOpenData = new GridData(GridData.FILL_HORIZONTAL);
		minOpenData.horizontalSpan = 2;
		minOpen.setLayoutData(minOpenData);
		EditingUtils.setID(minOpen, NfpViewsRepository.General.Properties.minOpen);
		EditingUtils.setEEFtype(minOpen, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.minOpen, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinOpenCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createMaxOpenCheckbox(FormToolkit widgetFactory, Composite parent) {
		maxOpen = widgetFactory.createButton(parent, getDescription(NfpViewsRepository.General.Properties.maxOpen, NfpMessages.GeneralPropertiesEditionPart_MaxOpenLabel), SWT.CHECK);
		maxOpen.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.maxOpen, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(maxOpen.getSelection())));
			}

		});
		GridData maxOpenData = new GridData(GridData.FILL_HORIZONTAL);
		maxOpenData.horizontalSpan = 2;
		maxOpen.setLayoutData(maxOpenData);
		EditingUtils.setID(maxOpen, NfpViewsRepository.General.Properties.maxOpen);
		EditingUtils.setEEFtype(maxOpen, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.maxOpen, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxOpenCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createBestText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NfpViewsRepository.General.Properties.best, NfpMessages.GeneralPropertiesEditionPart_BestLabel);
		best = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		best.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData bestData = new GridData(GridData.FILL_HORIZONTAL);
		best.setLayoutData(bestData);
		best.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							NfpViewsRepository.General.Properties.best,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, best.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralPropertiesEditionPartForm.this,
									NfpViewsRepository.General.Properties.best,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, best.getText()));
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
									GeneralPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		best.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.best, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, best.getText()));
				}
			}
		});
		EditingUtils.setID(best, NfpViewsRepository.General.Properties.best);
		EditingUtils.setEEFtype(best, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.best, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBestText

		// End of user code
		return parent;
	}

	
	protected Composite createWorstText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NfpViewsRepository.General.Properties.worst, NfpMessages.GeneralPropertiesEditionPart_WorstLabel);
		worst = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		worst.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData worstData = new GridData(GridData.FILL_HORIZONTAL);
		worst.setLayoutData(worstData);
		worst.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							NfpViewsRepository.General.Properties.worst,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, worst.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralPropertiesEditionPartForm.this,
									NfpViewsRepository.General.Properties.worst,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, worst.getText()));
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
									GeneralPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		worst.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.worst, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, worst.getText()));
				}
			}
		});
		EditingUtils.setID(worst, NfpViewsRepository.General.Properties.worst);
		EditingUtils.setEEFtype(worst, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.worst, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWorstText

		// End of user code
		return parent;
	}

	
	protected Composite createClockText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NfpViewsRepository.General.Properties.clock, NfpMessages.GeneralPropertiesEditionPart_ClockLabel);
		clock = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		clock.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData clockData = new GridData(GridData.FILL_HORIZONTAL);
		clock.setLayoutData(clockData);
		clock.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							NfpViewsRepository.General.Properties.clock,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clock.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralPropertiesEditionPartForm.this,
									NfpViewsRepository.General.Properties.clock,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, clock.getText()));
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
									GeneralPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		clock.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.clock, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clock.getText()));
				}
			}
		});
		EditingUtils.setID(clock, NfpViewsRepository.General.Properties.clock);
		EditingUtils.setEEFtype(clock, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.clock, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClockText

		// End of user code
		return parent;
	}

	
	protected Composite createPrecisionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NfpViewsRepository.General.Properties.precision, NfpMessages.GeneralPropertiesEditionPart_PrecisionLabel);
		precision = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		precision.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData precisionData = new GridData(GridData.FILL_HORIZONTAL);
		precision.setLayoutData(precisionData);
		precision.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							NfpViewsRepository.General.Properties.precision,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, precision.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralPropertiesEditionPartForm.this,
									NfpViewsRepository.General.Properties.precision,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, precision.getText()));
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
									GeneralPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		precision.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.precision, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, precision.getText()));
				}
			}
		});
		EditingUtils.setID(precision, NfpViewsRepository.General.Properties.precision);
		EditingUtils.setEEFtype(precision, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.precision, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPrecisionText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMinFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, NfpViewsRepository.General.Properties.min, NfpMessages.GeneralPropertiesEditionPart_MinLabel);
		min = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NfpViewsRepository.General.Properties.min, NfpViewsRepository.FORM_KIND));
		widgetFactory.adapt(min);
		min.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData minData = new GridData(GridData.FILL_HORIZONTAL);
		min.setLayoutData(minData);
		min.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.min, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMin()));
			}

		});
		min.setID(NfpViewsRepository.General.Properties.min);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.min, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMaxFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, NfpViewsRepository.General.Properties.max, NfpMessages.GeneralPropertiesEditionPart_MaxLabel);
		max = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NfpViewsRepository.General.Properties.max, NfpViewsRepository.FORM_KIND));
		widgetFactory.adapt(max);
		max.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData maxData = new GridData(GridData.FILL_HORIZONTAL);
		max.setLayoutData(maxData);
		max.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this, NfpViewsRepository.General.Properties.max, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMax()));
			}

		});
		max.setID(NfpViewsRepository.General.Properties.max);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NfpViewsRepository.General.Properties.max, NfpViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxFlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getUnit()
	 * 
	 */
	public Enumerator getUnit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) unit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#initUnit(Object input, Enumerator current)
	 */
	public void initUnit(Object input, Enumerator current) {
		unit.setInput(input);
		unit.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.unit);
		if (eefElementEditorReadOnlyState && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !unit.isEnabled()) {
			unit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setUnit(Enumerator newValue)
	 * 
	 */
	public void setUnit(Enumerator newValue) {
		unit.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.unit);
		if (eefElementEditorReadOnlyState && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !unit.isEnabled()) {
			unit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getMinOpen()
	 * 
	 */
	public Boolean getMinOpen() {
		return Boolean.valueOf(minOpen.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setMinOpen(Boolean newValue)
	 * 
	 */
	public void setMinOpen(Boolean newValue) {
		if (newValue != null) {
			minOpen.setSelection(newValue.booleanValue());
		} else {
			minOpen.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.minOpen);
		if (eefElementEditorReadOnlyState && minOpen.isEnabled()) {
			minOpen.setEnabled(false);
			minOpen.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !minOpen.isEnabled()) {
			minOpen.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getMaxOpen()
	 * 
	 */
	public Boolean getMaxOpen() {
		return Boolean.valueOf(maxOpen.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setMaxOpen(Boolean newValue)
	 * 
	 */
	public void setMaxOpen(Boolean newValue) {
		if (newValue != null) {
			maxOpen.setSelection(newValue.booleanValue());
		} else {
			maxOpen.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.maxOpen);
		if (eefElementEditorReadOnlyState && maxOpen.isEnabled()) {
			maxOpen.setEnabled(false);
			maxOpen.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxOpen.isEnabled()) {
			maxOpen.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getBest()
	 * 
	 */
	public String getBest() {
		return best.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setBest(String newValue)
	 * 
	 */
	public void setBest(String newValue) {
		if (newValue != null) {
			best.setText(newValue);
		} else {
			best.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.best);
		if (eefElementEditorReadOnlyState && best.isEnabled()) {
			best.setEnabled(false);
			best.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !best.isEnabled()) {
			best.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getWorst()
	 * 
	 */
	public String getWorst() {
		return worst.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setWorst(String newValue)
	 * 
	 */
	public void setWorst(String newValue) {
		if (newValue != null) {
			worst.setText(newValue);
		} else {
			worst.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.worst);
		if (eefElementEditorReadOnlyState && worst.isEnabled()) {
			worst.setEnabled(false);
			worst.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !worst.isEnabled()) {
			worst.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getClock()
	 * 
	 */
	public String getClock() {
		return clock.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setClock(String newValue)
	 * 
	 */
	public void setClock(String newValue) {
		if (newValue != null) {
			clock.setText(newValue);
		} else {
			clock.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.clock);
		if (eefElementEditorReadOnlyState && clock.isEnabled()) {
			clock.setEnabled(false);
			clock.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clock.isEnabled()) {
			clock.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getPrecision()
	 * 
	 */
	public String getPrecision() {
		return precision.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setPrecision(String newValue)
	 * 
	 */
	public void setPrecision(String newValue) {
		if (newValue != null) {
			precision.setText(newValue);
		} else {
			precision.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.precision);
		if (eefElementEditorReadOnlyState && precision.isEnabled()) {
			precision.setEnabled(false);
			precision.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !precision.isEnabled()) {
			precision.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getMin()
	 * 
	 */
	public EObject getMin() {
		if (min.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) min.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#initMin(EObjectFlatComboSettings)
	 */
	public void initMin(EObjectFlatComboSettings settings) {
		min.setInput(settings);
		if (current != null) {
			min.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.min);
		if (eefElementEditorReadOnlyState && min.isEnabled()) {
			min.setEnabled(false);
			min.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !min.isEnabled()) {
			min.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setMin(EObject newValue)
	 * 
	 */
	public void setMin(EObject newValue) {
		if (newValue != null) {
			min.setSelection(new StructuredSelection(newValue));
		} else {
			min.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.min);
		if (eefElementEditorReadOnlyState && min.isEnabled()) {
			min.setEnabled(false);
			min.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !min.isEnabled()) {
			min.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setMinButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMinButtonMode(ButtonsModeEnum newValue) {
		min.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#addFilterMin(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMin(ViewerFilter filter) {
		min.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#addBusinessFilterMin(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMin(ViewerFilter filter) {
		min.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#getMax()
	 * 
	 */
	public EObject getMax() {
		if (max.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) max.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#initMax(EObjectFlatComboSettings)
	 */
	public void initMax(EObjectFlatComboSettings settings) {
		max.setInput(settings);
		if (current != null) {
			max.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.max);
		if (eefElementEditorReadOnlyState && max.isEnabled()) {
			max.setEnabled(false);
			max.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !max.isEnabled()) {
			max.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setMax(EObject newValue)
	 * 
	 */
	public void setMax(EObject newValue) {
		if (newValue != null) {
			max.setSelection(new StructuredSelection(newValue));
		} else {
			max.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(NfpViewsRepository.General.Properties.max);
		if (eefElementEditorReadOnlyState && max.isEnabled()) {
			max.setEnabled(false);
			max.setToolTipText(NfpMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !max.isEnabled()) {
			max.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#setMaxButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMaxButtonMode(ButtonsModeEnum newValue) {
		max.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#addFilterMax(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMax(ViewerFilter filter) {
		max.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.nfp.parts.GeneralPropertiesEditionPart#addBusinessFilterMax(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMax(ViewerFilter filter) {
		max.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NfpMessages.General_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
