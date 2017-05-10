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
package org.polarsys.time4sys.ui.views.hrm.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
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
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.TimingPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.providers.HrmMessages;

// End of user code

/**
 * 
 * 
 */
public class TimingPropertiesEditionPartForm extends SectionPropertiesEditingPart
		implements IFormPropertiesEditionPart, TimingPropertiesEditionPart {

	protected EMFComboViewer replPolicy;
	protected EMFComboViewer writePolicy;
	protected EObjectFlatComboViewer clock;
	protected Text timings;
	protected Button editTimings;
	private EList timingsList;
	protected EObjectFlatComboViewer inputClock;
	protected ReferencesTable accCtrlPolicy;
	protected List<ViewerFilter> accCtrlPolicyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> accCtrlPolicyFilters = new ArrayList<ViewerFilter>();

	/**
	 * For {@link ISection} use only.
	 */
	public TimingPropertiesEditionPartForm() {
		super();
	}

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimingPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *      createFigure(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.forms.widgets.FormToolkit)
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
	 *      createControls(org.eclipse.ui.forms.widgets.FormToolkit,
	 *      org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence timingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep timingPropertiesStep = timingStep.addStep(HrmViewsRepository.Timing.TimingProperties.class);
		timingPropertiesStep.addStep(HrmViewsRepository.Timing.TimingProperties.replPolicy);
		timingPropertiesStep.addStep(HrmViewsRepository.Timing.TimingProperties.writePolicy);
		timingPropertiesStep.addStep(HrmViewsRepository.Timing.TimingProperties.clock);
		timingPropertiesStep.addStep(HrmViewsRepository.Timing.TimingProperties.timings);
		timingPropertiesStep.addStep(HrmViewsRepository.Timing.TimingProperties.inputClock);
		timingPropertiesStep.addStep(HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy);

		composer = new PartComposer(timingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HrmViewsRepository.Timing.TimingProperties.class) {
					return createTimingPropertiesGroup(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Timing.TimingProperties.replPolicy) {
					return createReplPolicyEMFComboViewer(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Timing.TimingProperties.writePolicy) {
					return createWritePolicyEMFComboViewer(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Timing.TimingProperties.clock) {
					return createClockFlatComboViewer(parent, widgetFactory);
				}
				if (key == HrmViewsRepository.Timing.TimingProperties.timings) {
					return createTimingsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Timing.TimingProperties.inputClock) {
					return createInputClockFlatComboViewer(parent, widgetFactory);
				}
				if (key == HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy) {
					return createAccCtrlPolicyTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createTimingPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section timingPropertiesSection = widgetFactory.createSection(parent,
				Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		timingPropertiesSection.setText(HrmMessages.TimingPropertiesEditionPart_TimingPropertiesGroupLabel);
		GridData timingPropertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		timingPropertiesSectionData.horizontalSpan = 3;
		timingPropertiesSection.setLayoutData(timingPropertiesSectionData);
		Composite timingPropertiesGroup = widgetFactory.createComposite(timingPropertiesSection);
		GridLayout timingPropertiesGroupLayout = new GridLayout();
		timingPropertiesGroupLayout.numColumns = 3;
		timingPropertiesGroup.setLayout(timingPropertiesGroupLayout);
		timingPropertiesSection.setClient(timingPropertiesGroup);
		return timingPropertiesGroup;
	}

	protected Composite createReplPolicyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Timing.TimingProperties.replPolicy,
				HrmMessages.TimingPropertiesEditionPart_ReplPolicyLabel);
		replPolicy = new EMFComboViewer(parent);
		replPolicy.setContentProvider(new ArrayContentProvider());
		replPolicy.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData replPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		replPolicy.getCombo().setLayoutData(replPolicyData);
		replPolicy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, HrmViewsRepository.Timing.TimingProperties.replPolicy,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReplPolicy()));
			}

		});
		replPolicy.setID(HrmViewsRepository.Timing.TimingProperties.replPolicy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.Timing.TimingProperties.replPolicy, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createReplPolicyEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createWritePolicyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Timing.TimingProperties.writePolicy,
				HrmMessages.TimingPropertiesEditionPart_WritePolicyLabel);
		writePolicy = new EMFComboViewer(parent);
		writePolicy.setContentProvider(new ArrayContentProvider());
		writePolicy
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData writePolicyData = new GridData(GridData.FILL_HORIZONTAL);
		writePolicy.getCombo().setLayoutData(writePolicyData);
		writePolicy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									HrmViewsRepository.Timing.TimingProperties.writePolicy,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getWritePolicy()));
			}

		});
		writePolicy.setID(HrmViewsRepository.Timing.TimingProperties.writePolicy);
		FormUtils
				.createHelpButton(widgetFactory, parent,
						propertiesEditionComponent.getHelpContent(
								HrmViewsRepository.Timing.TimingProperties.writePolicy, HrmViewsRepository.FORM_KIND),
						null); // $NON-NLS-1$
		// Start of user code for createWritePolicyEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * @param widgetFactory
	 *            factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createClockFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HrmViewsRepository.Timing.TimingProperties.clock,
				HrmMessages.TimingPropertiesEditionPart_ClockLabel);
		clock = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.Timing.TimingProperties.clock, HrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(clock);
		clock.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData clockData = new GridData(GridData.FILL_HORIZONTAL);
		clock.setLayoutData(clockData);
		clock.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, HrmViewsRepository.Timing.TimingProperties.clock,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getClock()));
			}

		});
		clock.setID(HrmViewsRepository.Timing.TimingProperties.clock);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Timing.TimingProperties.clock, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createClockFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTimingsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		timings = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData timingsData = new GridData(GridData.FILL_HORIZONTAL);
		timingsData.horizontalSpan = 2;
		timings.setLayoutData(timingsData);
		EditingUtils.setID(timings, HrmViewsRepository.Timing.TimingProperties.timings);
		EditingUtils.setEEFtype(timings, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editTimings = widgetFactory.createButton(parent,
				getDescription(HrmViewsRepository.Timing.TimingProperties.timings,
						HrmMessages.TimingPropertiesEditionPart_TimingsLabel),
				SWT.NONE);
		GridData editTimingsData = new GridData();
		editTimings.setLayoutData(editTimingsData);
		editTimings.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(timings.getShell(), "HardwareWatchdog", //$NON-NLS-1$
						new AdapterFactoryLabelProvider(adapterFactory),
						timingsList, HrmPackage.eINSTANCE.getHardwareMemory_Timings().getEType(), null, false, true,
						null, null);
				if (dialog.open() == Window.OK) {
					timingsList = dialog.getResult();
					if (timingsList == null) {
						timingsList = new BasicEList();
					}
					timings.setText(timingsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									HrmViewsRepository.Timing.TimingProperties.timings, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(timingsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editTimings, HrmViewsRepository.Timing.TimingProperties.timings);
		EditingUtils.setEEFtype(editTimings, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createTimingsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * @param widgetFactory
	 *            factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createInputClockFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HrmViewsRepository.Timing.TimingProperties.inputClock,
				HrmMessages.TimingPropertiesEditionPart_InputClockLabel);
		inputClock = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.Timing.TimingProperties.inputClock, HrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(inputClock);
		inputClock.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData inputClockData = new GridData(GridData.FILL_HORIZONTAL);
		inputClock.setLayoutData(inputClockData);
		inputClock.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, HrmViewsRepository.Timing.TimingProperties.inputClock,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInputClock()));
			}

		});
		inputClock.setID(HrmViewsRepository.Timing.TimingProperties.inputClock);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.Timing.TimingProperties.inputClock, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createInputClockFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAccCtrlPolicyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.accCtrlPolicy = new ReferencesTable(
				getDescription(HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy,
						HrmMessages.TimingPropertiesEditionPart_AccCtrlPolicyLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						accCtrlPolicy.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						accCtrlPolicy.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						accCtrlPolicy.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						accCtrlPolicy.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.accCtrlPolicyFilters) {
			this.accCtrlPolicy.addFilter(filter);
		}
		this.accCtrlPolicy.setHelpText(propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy, HrmViewsRepository.FORM_KIND));
		this.accCtrlPolicy.createControls(parent, widgetFactory);
		this.accCtrlPolicy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData accCtrlPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		accCtrlPolicyData.horizontalSpan = 3;
		this.accCtrlPolicy.setLayoutData(accCtrlPolicyData);
		this.accCtrlPolicy.setLowerBound(0);
		this.accCtrlPolicy.setUpperBound(-1);
		accCtrlPolicy.setID(HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy);
		accCtrlPolicy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAccCtrlPolicyTableComposition

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
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#getReplPolicy()
	 * 
	 */
	public Enumerator getReplPolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) replPolicy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#initReplPolicy(Object
	 *      input, Enumerator current)
	 */
	public void initReplPolicy(Object input, Enumerator current) {
		replPolicy.setInput(input);
		replPolicy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.replPolicy);
		if (eefElementEditorReadOnlyState && replPolicy.isEnabled()) {
			replPolicy.setEnabled(false);
			replPolicy.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !replPolicy.isEnabled()) {
			replPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#setReplPolicy(Enumerator
	 *      newValue)
	 * 
	 */
	public void setReplPolicy(Enumerator newValue) {
		replPolicy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.replPolicy);
		if (eefElementEditorReadOnlyState && replPolicy.isEnabled()) {
			replPolicy.setEnabled(false);
			replPolicy.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !replPolicy.isEnabled()) {
			replPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#getWritePolicy()
	 * 
	 */
	public Enumerator getWritePolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) writePolicy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#initWritePolicy(Object
	 *      input, Enumerator current)
	 */
	public void initWritePolicy(Object input, Enumerator current) {
		writePolicy.setInput(input);
		writePolicy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.writePolicy);
		if (eefElementEditorReadOnlyState && writePolicy.isEnabled()) {
			writePolicy.setEnabled(false);
			writePolicy.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !writePolicy.isEnabled()) {
			writePolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#setWritePolicy(Enumerator
	 *      newValue)
	 * 
	 */
	public void setWritePolicy(Enumerator newValue) {
		writePolicy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.writePolicy);
		if (eefElementEditorReadOnlyState && writePolicy.isEnabled()) {
			writePolicy.setEnabled(false);
			writePolicy.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !writePolicy.isEnabled()) {
			writePolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#getClock()
	 * 
	 */
	public EObject getClock() {
		if (clock.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) clock.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#initClock(EObjectFlatComboSettings)
	 */
	public void initClock(EObjectFlatComboSettings settings) {
		clock.setInput(settings);
		if (current != null) {
			clock.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.clock);
		if (eefElementEditorReadOnlyState && clock.isEnabled()) {
			clock.setEnabled(false);
			clock.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clock.isEnabled()) {
			clock.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#setClock(EObject
	 *      newValue)
	 * 
	 */
	public void setClock(EObject newValue) {
		if (newValue != null) {
			clock.setSelection(new StructuredSelection(newValue));
		} else {
			clock.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.clock);
		if (eefElementEditorReadOnlyState && clock.isEnabled()) {
			clock.setEnabled(false);
			clock.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clock.isEnabled()) {
			clock.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#setClockButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setClockButtonMode(ButtonsModeEnum newValue) {
		clock.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#addFilterClock(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToClock(ViewerFilter filter) {
		clock.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#addBusinessFilterClock(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToClock(ViewerFilter filter) {
		clock.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#getTimings()
	 * 
	 */
	public EList getTimings() {
		return timingsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#setTimings(EList
	 *      newValue)
	 * 
	 */
	public void setTimings(EList newValue) {
		timingsList = newValue;
		if (newValue != null) {
			timings.setText(timingsList.toString());
		} else {
			timings.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.timings);
		if (eefElementEditorReadOnlyState && timings.isEnabled()) {
			timings.setEnabled(false);
			timings.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !timings.isEnabled()) {
			timings.setEnabled(true);
		}

	}

	public void addToTimings(Object newValue) {
		timingsList.add(newValue);
		if (newValue != null) {
			timings.setText(timingsList.toString());
		} else {
			timings.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToTimings(Object newValue) {
		timingsList.remove(newValue);
		if (newValue != null) {
			timings.setText(timingsList.toString());
		} else {
			timings.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#getInputClock()
	 * 
	 */
	public EObject getInputClock() {
		if (inputClock.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) inputClock.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#initInputClock(EObjectFlatComboSettings)
	 */
	public void initInputClock(EObjectFlatComboSettings settings) {
		inputClock.setInput(settings);
		if (current != null) {
			inputClock.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.inputClock);
		if (eefElementEditorReadOnlyState && inputClock.isEnabled()) {
			inputClock.setEnabled(false);
			inputClock.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputClock.isEnabled()) {
			inputClock.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#setInputClock(EObject
	 *      newValue)
	 * 
	 */
	public void setInputClock(EObject newValue) {
		if (newValue != null) {
			inputClock.setSelection(new StructuredSelection(newValue));
		} else {
			inputClock.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.inputClock);
		if (eefElementEditorReadOnlyState && inputClock.isEnabled()) {
			inputClock.setEnabled(false);
			inputClock.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputClock.isEnabled()) {
			inputClock.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#setInputClockButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setInputClockButtonMode(ButtonsModeEnum newValue) {
		inputClock.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#addFilterInputClock(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToInputClock(ViewerFilter filter) {
		inputClock.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#addBusinessFilterInputClock(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToInputClock(ViewerFilter filter) {
		inputClock.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#initAccCtrlPolicy(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initAccCtrlPolicy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		accCtrlPolicy.setContentProvider(contentProvider);
		accCtrlPolicy.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Timing.TimingProperties.accCtrlPolicy);
		if (eefElementEditorReadOnlyState && accCtrlPolicy.isEnabled()) {
			accCtrlPolicy.setEnabled(false);
			accCtrlPolicy.setToolTipText(HrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accCtrlPolicy.isEnabled()) {
			accCtrlPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#updateAccCtrlPolicy()
	 * 
	 */
	public void updateAccCtrlPolicy() {
		accCtrlPolicy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#addFilterAccCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToAccCtrlPolicy(ViewerFilter filter) {
		accCtrlPolicyFilters.add(filter);
		if (this.accCtrlPolicy != null) {
			this.accCtrlPolicy.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#addBusinessFilterAccCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToAccCtrlPolicy(ViewerFilter filter) {
		accCtrlPolicyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.TimingPropertiesEditionPart#isContainedInAccCtrlPolicyTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInAccCtrlPolicyTable(EObject element) {
		return ((ReferencesTableSettings) accCtrlPolicy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HrmMessages.Timing_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
