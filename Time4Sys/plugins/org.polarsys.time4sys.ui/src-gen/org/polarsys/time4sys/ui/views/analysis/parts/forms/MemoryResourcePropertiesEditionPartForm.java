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

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.MemoryResourcePropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class MemoryResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, MemoryResourcePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer scheduler;
	protected EObjectFlatComboViewer parent_;
	protected Text speedFactor;
	protected Text delay;
	protected Text size;



	/**
	 * For {@link ISection} use only.
	 */
	public MemoryResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public MemoryResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence memoryResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = memoryResourceStep.addStep(AnalysisViewsRepository.MemoryResource.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.MemoryResource.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.MemoryResource.Properties.scheduler);
		propertiesStep.addStep(AnalysisViewsRepository.MemoryResource.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.MemoryResource.Properties.speedFactor);
		propertiesStep.addStep(AnalysisViewsRepository.MemoryResource.Properties.delay);
		propertiesStep.addStep(AnalysisViewsRepository.MemoryResource.Properties.size);
		
		
		composer = new PartComposer(memoryResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.MemoryResource.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MemoryResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MemoryResource.Properties.scheduler) {
					return createSchedulerFlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.MemoryResource.Properties.parent_) {
					return createParent_FlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.MemoryResource.Properties.speedFactor) {
					return createSpeedFactorText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MemoryResource.Properties.delay) {
					return createDelayText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.MemoryResource.Properties.size) {
					return createSizeText(widgetFactory, parent);
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
		propertiesSection.setText(AnalysisMessages.MemoryResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.MemoryResource.Properties.name, AnalysisMessages.MemoryResourcePropertiesEditionPart_NameLabel);
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
							MemoryResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.MemoryResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MemoryResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.MemoryResource.Properties.name,
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
									MemoryResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoryResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MemoryResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, AnalysisViewsRepository.MemoryResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MemoryResource.Properties.name, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createSchedulerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.MemoryResource.Properties.scheduler, AnalysisMessages.MemoryResourcePropertiesEditionPart_SchedulerLabel);
		scheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.MemoryResource.Properties.scheduler, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(scheduler);
		scheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData schedulerData = new GridData(GridData.FILL_HORIZONTAL);
		scheduler.setLayoutData(schedulerData);
		scheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoryResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MemoryResource.Properties.scheduler, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getScheduler()));
			}

		});
		scheduler.setID(AnalysisViewsRepository.MemoryResource.Properties.scheduler);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MemoryResource.Properties.scheduler, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.MemoryResource.Properties.parent_, AnalysisMessages.MemoryResourcePropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.MemoryResource.Properties.parent_, AnalysisViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoryResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MemoryResource.Properties.parent_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		parent_.setID(AnalysisViewsRepository.MemoryResource.Properties.parent_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MemoryResource.Properties.parent_, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createSpeedFactorText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.MemoryResource.Properties.speedFactor, AnalysisMessages.MemoryResourcePropertiesEditionPart_SpeedFactorLabel);
		speedFactor = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		speedFactor.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData speedFactorData = new GridData(GridData.FILL_HORIZONTAL);
		speedFactor.setLayoutData(speedFactorData);
		speedFactor.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MemoryResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.MemoryResource.Properties.speedFactor,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MemoryResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.MemoryResource.Properties.speedFactor,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, speedFactor.getText()));
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
									MemoryResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		speedFactor.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoryResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MemoryResource.Properties.speedFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
				}
			}
		});
		EditingUtils.setID(speedFactor, AnalysisViewsRepository.MemoryResource.Properties.speedFactor);
		EditingUtils.setEEFtype(speedFactor, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MemoryResource.Properties.speedFactor, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSpeedFactorText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createDelayText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.MemoryResource.Properties.delay, AnalysisMessages.MemoryResourcePropertiesEditionPart_DelayLabel);
		delay = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		delay.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData delayData = new GridData(GridData.FILL_HORIZONTAL);
		delay.setLayoutData(delayData);
		delay.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MemoryResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.MemoryResource.Properties.delay,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MemoryResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.MemoryResource.Properties.delay,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, delay.getText()));
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
									MemoryResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		delay.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoryResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MemoryResource.Properties.delay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
				}
			}
		});
		EditingUtils.setID(delay, AnalysisViewsRepository.MemoryResource.Properties.delay);
		EditingUtils.setEEFtype(delay, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MemoryResource.Properties.delay, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDelayText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.MemoryResource.Properties.size, AnalysisMessages.MemoryResourcePropertiesEditionPart_SizeLabel);
		size = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		size.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sizeData = new GridData(GridData.FILL_HORIZONTAL);
		size.setLayoutData(sizeData);
		size.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MemoryResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.MemoryResource.Properties.size,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, size.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MemoryResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.MemoryResource.Properties.size,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, size.getText()));
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
									MemoryResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		size.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoryResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.MemoryResource.Properties.size, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, size.getText()));
				}
			}
		});
		EditingUtils.setID(size, AnalysisViewsRepository.MemoryResource.Properties.size);
		EditingUtils.setEEFtype(size, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.MemoryResource.Properties.size, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSizeText

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#getScheduler()
	 * @generated
	 */
	public EObject getScheduler() {
		if (scheduler.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) scheduler.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#initScheduler(EObjectFlatComboSettings)
	 */
	public void initScheduler(EObjectFlatComboSettings settings) {
		scheduler.setInput(settings);
		if (current != null) {
			scheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setScheduler(EObject newValue)
	 * @generated
	 */
	public void setScheduler(EObject newValue) {
		if (newValue != null) {
			scheduler.setSelection(new StructuredSelection(newValue));
		} else {
			scheduler.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setSchedulerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSchedulerButtonMode(ButtonsModeEnum newValue) {
		scheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#addFilterScheduler(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToScheduler(ViewerFilter filter) {
		scheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#addBusinessFilterScheduler(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToScheduler(ViewerFilter filter) {
		scheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#getSpeedFactor()
	 * @generated
	 */
	public String getSpeedFactor() {
		return speedFactor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setSpeedFactor(String newValue)
	 * @generated
	 */
	public void setSpeedFactor(String newValue) {
		if (newValue != null) {
			speedFactor.setText(newValue);
		} else {
			speedFactor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.speedFactor);
		if (eefElementEditorReadOnlyState && speedFactor.isEnabled()) {
			speedFactor.setEnabled(false);
			speedFactor.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !speedFactor.isEnabled()) {
			speedFactor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#getDelay()
	 * @generated
	 */
	public String getDelay() {
		return delay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setDelay(String newValue)
	 * @generated
	 */
	public void setDelay(String newValue) {
		if (newValue != null) {
			delay.setText(newValue);
		} else {
			delay.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.delay);
		if (eefElementEditorReadOnlyState && delay.isEnabled()) {
			delay.setEnabled(false);
			delay.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !delay.isEnabled()) {
			delay.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#getSize()
	 * @generated
	 */
	public String getSize() {
		return size.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.MemoryResourcePropertiesEditionPart#setSize(String newValue)
	 * @generated
	 */
	public void setSize(String newValue) {
		if (newValue != null) {
			size.setText(newValue);
		} else {
			size.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.MemoryResource.Properties.size);
		if (eefElementEditorReadOnlyState && size.isEnabled()) {
			size.setEnabled(false);
			size.setToolTipText(AnalysisMessages.MemoryResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !size.isEnabled()) {
			size.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.MemoryResource_Part_Title;
	}



}
