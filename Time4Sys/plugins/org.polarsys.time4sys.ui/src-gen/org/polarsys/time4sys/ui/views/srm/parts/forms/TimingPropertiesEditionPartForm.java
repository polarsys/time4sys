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
package org.polarsys.time4sys.ui.views.srm.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.providers.SrmMessages;

// End of user code

/**
 * 
 * 
 */
public class TimingPropertiesEditionPartForm extends SectionPropertiesEditingPart
		implements IFormPropertiesEditionPart, TimingPropertiesEditionPart {

	protected Text capacity;
	protected Button isPeriodic;
	protected Button isPreemptable;
	protected Button isFixedMessageSize;
	protected Text duration;
	protected Text arrivalPattern;
	protected Text packetTime;
	protected Text blockingTime;
	protected Text waitingQueueCapacity;
	protected EMFComboViewer waitingQueuePolicy;
	protected EMFComboViewer policy;
	protected EMFComboViewer messageQueuePolicy;
	protected EMFComboViewer mechanism;
	protected EMFComboViewer transmMode;
	protected EMFComboViewer concurrentAccessProtocol;
	protected EMFComboViewer accessPolicy;
	protected Text durationElements;
	protected Button editDurationElements;
	private EList durationElementsList;
	protected Text messageQueueCapacityElements;
	protected Button editMessageQueueCapacityElements;
	private EList messageQueueCapacityElementsList;
	protected Text priorityElements;
	protected Button editPriorityElements;
	private EList priorityElementsList;
	protected Text messageSizeElements;
	protected Button editMessageSizeElements;
	private EList messageSizeElementsList;
	protected Text occurenceCountElements;
	protected Button editOccurenceCountElements;
	private EList occurenceCountElementsList;
	protected Text waitingPolicyElements;
	protected Button editWaitingPolicyElements;
	private EList waitingPolicyElementsList;
	protected Text deadlineElements;
	protected Button editDeadlineElements;
	private EList deadlineElementsList;
	protected Text deadlineTypeElements;
	protected Button editDeadlineTypeElements;
	private EList deadlineTypeElementsList;
	protected Text timeSliceElements;
	protected Button editTimeSliceElements;
	private EList timeSliceElementsList;
	protected ReferencesTable accCtrlPolicy;
	protected List<ViewerFilter> accCtrlPolicyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> accCtrlPolicyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resCtrlPolicy;
	protected List<ViewerFilter> resCtrlPolicyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resCtrlPolicyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable accessTokenElements;
	protected List<ViewerFilter> accessTokenElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> accessTokenElementsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable mutualExclusionResources;
	protected List<ViewerFilter> mutualExclusionResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mutualExclusionResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable timers;
	protected List<ViewerFilter> timersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> timersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable protectParams;
	protected List<ViewerFilter> protectParamsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> protectParamsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable concurrentResources;
	protected List<ViewerFilter> concurrentResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> concurrentResourcesFilters = new ArrayList<ViewerFilter>();

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
		CompositionStep propertiesStep = timingStep.addStep(SrmViewsRepository.Timing.Properties.class);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.capacity);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.isPeriodic);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.isPreemptable);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.isFixedMessageSize);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.duration);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.arrivalPattern);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.packetTime);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.blockingTime);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.waitingQueueCapacity);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.waitingQueuePolicy);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.policy);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.messageQueuePolicy);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.mechanism);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.transmMode);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.concurrentAccessProtocol);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.accessPolicy);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.durationElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.messageQueueCapacityElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.priorityElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.messageSizeElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.occurenceCountElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.waitingPolicyElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.deadlineElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.deadlineTypeElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.timeSliceElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.accCtrlPolicy);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.resCtrlPolicy);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.accessTokenElements);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.mutualExclusionResources);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.timers);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.protectParams);
		propertiesStep.addStep(SrmViewsRepository.Timing.Properties.concurrentResources);

		composer = new PartComposer(timingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SrmViewsRepository.Timing.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.capacity) {
					return createCapacityText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.isPeriodic) {
					return createIsPeriodicCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.isPreemptable) {
					return createIsPreemptableCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.isFixedMessageSize) {
					return createIsFixedMessageSizeCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.duration) {
					return createDurationText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.arrivalPattern) {
					return createArrivalPatternText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.packetTime) {
					return createPacketTimeText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.blockingTime) {
					return createBlockingTimeText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.waitingQueueCapacity) {
					return createWaitingQueueCapacityText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.waitingQueuePolicy) {
					return createWaitingQueuePolicyEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.policy) {
					return createPolicyEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.messageQueuePolicy) {
					return createMessageQueuePolicyEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.mechanism) {
					return createMechanismEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.transmMode) {
					return createTransmModeEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.concurrentAccessProtocol) {
					return createConcurrentAccessProtocolEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.accessPolicy) {
					return createAccessPolicyEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.durationElements) {
					return createDurationElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.messageQueueCapacityElements) {
					return createMessageQueueCapacityElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.priorityElements) {
					return createPriorityElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.messageSizeElements) {
					return createMessageSizeElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.occurenceCountElements) {
					return createOccurenceCountElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.waitingPolicyElements) {
					return createWaitingPolicyElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.deadlineElements) {
					return createDeadlineElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.deadlineTypeElements) {
					return createDeadlineTypeElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.timeSliceElements) {
					return createTimeSliceElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.accCtrlPolicy) {
					return createAccCtrlPolicyTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.resCtrlPolicy) {
					return createResCtrlPolicyTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.accessTokenElements) {
					return createAccessTokenElementsReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.mutualExclusionResources) {
					return createMutualExclusionResourcesReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.timers) {
					return createTimersReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.protectParams) {
					return createProtectParamsTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.Timing.Properties.concurrentResources) {
					return createConcurrentResourcesReferencesTable(widgetFactory, parent);
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
		Section propertiesSection = widgetFactory.createSection(parent,
				Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(SrmMessages.TimingPropertiesEditionPart_PropertiesGroupLabel);
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

	protected Composite createCapacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.capacity,
				SrmMessages.TimingPropertiesEditionPart_CapacityLabel);
		capacity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		capacity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData capacityData = new GridData(GridData.FILL_HORIZONTAL);
		capacity.setLayoutData(capacityData);
		capacity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.capacity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.capacity, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, capacity.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		capacity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.capacity,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacity.getText()));
				}
			}
		});
		EditingUtils.setID(capacity, SrmViewsRepository.Timing.Properties.capacity);
		EditingUtils.setEEFtype(capacity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.capacity, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createCapacityText

		// End of user code
		return parent;
	}

	protected Composite createIsPeriodicCheckbox(FormToolkit widgetFactory, Composite parent) {
		isPeriodic = widgetFactory.createButton(parent, getDescription(SrmViewsRepository.Timing.Properties.isPeriodic,
				SrmMessages.TimingPropertiesEditionPart_IsPeriodicLabel), SWT.CHECK);
		isPeriodic.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.isPeriodic, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isPeriodic.getSelection())));
			}

		});
		GridData isPeriodicData = new GridData(GridData.FILL_HORIZONTAL);
		isPeriodicData.horizontalSpan = 2;
		isPeriodic.setLayoutData(isPeriodicData);
		EditingUtils.setID(isPeriodic, SrmViewsRepository.Timing.Properties.isPeriodic);
		EditingUtils.setEEFtype(isPeriodic, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.isPeriodic, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsPeriodicCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsPreemptableCheckbox(FormToolkit widgetFactory, Composite parent) {
		isPreemptable = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.isPreemptable,
						SrmMessages.TimingPropertiesEditionPart_IsPreemptableLabel),
				SWT.CHECK);
		isPreemptable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.isPreemptable, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isPreemptable.getSelection())));
			}

		});
		GridData isPreemptableData = new GridData(GridData.FILL_HORIZONTAL);
		isPreemptableData.horizontalSpan = 2;
		isPreemptable.setLayoutData(isPreemptableData);
		EditingUtils.setID(isPreemptable, SrmViewsRepository.Timing.Properties.isPreemptable);
		EditingUtils.setEEFtype(isPreemptable, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Timing.Properties.isPreemptable, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsPreemptableCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsFixedMessageSizeCheckbox(FormToolkit widgetFactory, Composite parent) {
		isFixedMessageSize = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.isFixedMessageSize,
						SrmMessages.TimingPropertiesEditionPart_IsFixedMessageSizeLabel),
				SWT.CHECK);
		isFixedMessageSize.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.isFixedMessageSize, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new Boolean(isFixedMessageSize.getSelection())));
			}

		});
		GridData isFixedMessageSizeData = new GridData(GridData.FILL_HORIZONTAL);
		isFixedMessageSizeData.horizontalSpan = 2;
		isFixedMessageSize.setLayoutData(isFixedMessageSizeData);
		EditingUtils.setID(isFixedMessageSize, SrmViewsRepository.Timing.Properties.isFixedMessageSize);
		EditingUtils.setEEFtype(isFixedMessageSize, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils
				.createHelpButton(widgetFactory, parent,
						propertiesEditionComponent.getHelpContent(
								SrmViewsRepository.Timing.Properties.isFixedMessageSize, SrmViewsRepository.FORM_KIND),
						null); // $NON-NLS-1$
		// Start of user code for createIsFixedMessageSizeCheckbox

		// End of user code
		return parent;
	}

	protected Composite createDurationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.duration,
				SrmMessages.TimingPropertiesEditionPart_DurationLabel);
		duration = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		duration.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData durationData = new GridData(GridData.FILL_HORIZONTAL);
		duration.setLayoutData(durationData);
		duration.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.duration,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.duration, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, duration.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		duration.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.duration,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
				}
			}
		});
		EditingUtils.setID(duration, SrmViewsRepository.Timing.Properties.duration);
		EditingUtils.setEEFtype(duration, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.duration, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createDurationText

		// End of user code
		return parent;
	}

	protected Composite createArrivalPatternText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.arrivalPattern,
				SrmMessages.TimingPropertiesEditionPart_ArrivalPatternLabel);
		arrivalPattern = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		arrivalPattern.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData arrivalPatternData = new GridData(GridData.FILL_HORIZONTAL);
		arrivalPattern.setLayoutData(arrivalPatternData);
		arrivalPattern.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.arrivalPattern,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, arrivalPattern.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.arrivalPattern,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							arrivalPattern.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		arrivalPattern.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								TimingPropertiesEditionPartForm.this,
								SrmViewsRepository.Timing.Properties.arrivalPattern, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, arrivalPattern.getText()));
				}
			}
		});
		EditingUtils.setID(arrivalPattern, SrmViewsRepository.Timing.Properties.arrivalPattern);
		EditingUtils.setEEFtype(arrivalPattern, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Timing.Properties.arrivalPattern, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createArrivalPatternText

		// End of user code
		return parent;
	}

	protected Composite createPacketTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.packetTime,
				SrmMessages.TimingPropertiesEditionPart_PacketTimeLabel);
		packetTime = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		packetTime.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData packetTimeData = new GridData(GridData.FILL_HORIZONTAL);
		packetTime.setLayoutData(packetTimeData);
		packetTime.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.packetTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetTime.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.packetTime,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							packetTime.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		packetTime.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.packetTime,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetTime.getText()));
				}
			}
		});
		EditingUtils.setID(packetTime, SrmViewsRepository.Timing.Properties.packetTime);
		EditingUtils.setEEFtype(packetTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.packetTime, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPacketTimeText

		// End of user code
		return parent;
	}

	protected Composite createBlockingTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.blockingTime,
				SrmMessages.TimingPropertiesEditionPart_BlockingTimeLabel);
		blockingTime = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		blockingTime.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData blockingTimeData = new GridData(GridData.FILL_HORIZONTAL);
		blockingTime.setLayoutData(blockingTimeData);
		blockingTime.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.blockingTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.blockingTime,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							blockingTime.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		blockingTime.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.blockingTime,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
								blockingTime.getText()));
				}
			}
		});
		EditingUtils.setID(blockingTime, SrmViewsRepository.Timing.Properties.blockingTime);
		EditingUtils.setEEFtype(blockingTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.blockingTime, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createBlockingTimeText

		// End of user code
		return parent;
	}

	protected Composite createWaitingQueueCapacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.waitingQueueCapacity,
				SrmMessages.TimingPropertiesEditionPart_WaitingQueueCapacityLabel);
		waitingQueueCapacity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		waitingQueueCapacity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData waitingQueueCapacityData = new GridData(GridData.FILL_HORIZONTAL);
		waitingQueueCapacity.setLayoutData(waitingQueueCapacityData);
		waitingQueueCapacity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.waitingQueueCapacity, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, waitingQueueCapacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.waitingQueueCapacity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
									waitingQueueCapacity.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		waitingQueueCapacity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.waitingQueueCapacity,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										waitingQueueCapacity.getText()));
				}
			}
		});
		EditingUtils.setID(waitingQueueCapacity, SrmViewsRepository.Timing.Properties.waitingQueueCapacity);
		EditingUtils.setEEFtype(waitingQueueCapacity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Timing.Properties.waitingQueueCapacity, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createWaitingQueueCapacityText

		// End of user code
		return parent;
	}

	protected Composite createWaitingQueuePolicyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.waitingQueuePolicy,
				SrmMessages.TimingPropertiesEditionPart_WaitingQueuePolicyLabel);
		waitingQueuePolicy = new EMFComboViewer(parent);
		waitingQueuePolicy.setContentProvider(new ArrayContentProvider());
		waitingQueuePolicy
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData waitingQueuePolicyData = new GridData(GridData.FILL_HORIZONTAL);
		waitingQueuePolicy.getCombo().setLayoutData(waitingQueuePolicyData);
		waitingQueuePolicy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.waitingQueuePolicy, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, getWaitingQueuePolicy()));
			}

		});
		waitingQueuePolicy.setID(SrmViewsRepository.Timing.Properties.waitingQueuePolicy);
		FormUtils
				.createHelpButton(widgetFactory, parent,
						propertiesEditionComponent.getHelpContent(
								SrmViewsRepository.Timing.Properties.waitingQueuePolicy, SrmViewsRepository.FORM_KIND),
						null); // $NON-NLS-1$
		// Start of user code for createWaitingQueuePolicyEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createPolicyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.policy,
				SrmMessages.TimingPropertiesEditionPart_PolicyLabel);
		policy = new EMFComboViewer(parent);
		policy.setContentProvider(new ArrayContentProvider());
		policy.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData policyData = new GridData(GridData.FILL_HORIZONTAL);
		policy.getCombo().setLayoutData(policyData);
		policy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.policy,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPolicy()));
			}

		});
		policy.setID(SrmViewsRepository.Timing.Properties.policy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.policy, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPolicyEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createMessageQueuePolicyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.messageQueuePolicy,
				SrmMessages.TimingPropertiesEditionPart_MessageQueuePolicyLabel);
		messageQueuePolicy = new EMFComboViewer(parent);
		messageQueuePolicy.setContentProvider(new ArrayContentProvider());
		messageQueuePolicy
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData messageQueuePolicyData = new GridData(GridData.FILL_HORIZONTAL);
		messageQueuePolicy.getCombo().setLayoutData(messageQueuePolicyData);
		messageQueuePolicy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.messageQueuePolicy, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, getMessageQueuePolicy()));
			}

		});
		messageQueuePolicy.setID(SrmViewsRepository.Timing.Properties.messageQueuePolicy);
		FormUtils
				.createHelpButton(widgetFactory, parent,
						propertiesEditionComponent.getHelpContent(
								SrmViewsRepository.Timing.Properties.messageQueuePolicy, SrmViewsRepository.FORM_KIND),
						null); // $NON-NLS-1$
		// Start of user code for createMessageQueuePolicyEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createMechanismEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.mechanism,
				SrmMessages.TimingPropertiesEditionPart_MechanismLabel);
		mechanism = new EMFComboViewer(parent);
		mechanism.setContentProvider(new ArrayContentProvider());
		mechanism.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData mechanismData = new GridData(GridData.FILL_HORIZONTAL);
		mechanism.getCombo().setLayoutData(mechanismData);
		mechanism.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.mechanism,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMechanism()));
			}

		});
		mechanism.setID(SrmViewsRepository.Timing.Properties.mechanism);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.mechanism, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createMechanismEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createTransmModeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.transmMode,
				SrmMessages.TimingPropertiesEditionPart_TransmModeLabel);
		transmMode = new EMFComboViewer(parent);
		transmMode.setContentProvider(new ArrayContentProvider());
		transmMode.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transmModeData = new GridData(GridData.FILL_HORIZONTAL);
		transmMode.getCombo().setLayoutData(transmModeData);
		transmMode.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.transmMode,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransmMode()));
			}

		});
		transmMode.setID(SrmViewsRepository.Timing.Properties.transmMode);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.transmMode, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createTransmModeEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createConcurrentAccessProtocolEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.concurrentAccessProtocol,
				SrmMessages.TimingPropertiesEditionPart_ConcurrentAccessProtocolLabel);
		concurrentAccessProtocol = new EMFComboViewer(parent);
		concurrentAccessProtocol.setContentProvider(new ArrayContentProvider());
		concurrentAccessProtocol
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData concurrentAccessProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		concurrentAccessProtocol.getCombo().setLayoutData(concurrentAccessProtocolData);
		concurrentAccessProtocol.addSelectionChangedListener(new ISelectionChangedListener() {

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
									SrmViewsRepository.Timing.Properties.concurrentAccessProtocol,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									getConcurrentAccessProtocol()));
			}

		});
		concurrentAccessProtocol.setID(SrmViewsRepository.Timing.Properties.concurrentAccessProtocol);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Timing.Properties.concurrentAccessProtocol, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createConcurrentAccessProtocolEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createAccessPolicyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.Timing.Properties.accessPolicy,
				SrmMessages.TimingPropertiesEditionPart_AccessPolicyLabel);
		accessPolicy = new EMFComboViewer(parent);
		accessPolicy.setContentProvider(new ArrayContentProvider());
		accessPolicy
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData accessPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		accessPolicy.getCombo().setLayoutData(accessPolicyData);
		accessPolicy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.accessPolicy,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAccessPolicy()));
			}

		});
		accessPolicy.setID(SrmViewsRepository.Timing.Properties.accessPolicy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.accessPolicy, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createAccessPolicyEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDurationElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		durationElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData durationElementsData = new GridData(GridData.FILL_HORIZONTAL);
		durationElementsData.horizontalSpan = 2;
		durationElements.setLayoutData(durationElementsData);
		EditingUtils.setID(durationElements, SrmViewsRepository.Timing.Properties.durationElements);
		EditingUtils.setEEFtype(durationElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editDurationElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.durationElements,
						SrmMessages.TimingPropertiesEditionPart_DurationElementsLabel),
				SWT.NONE);
		GridData editDurationElementsData = new GridData();
		editDurationElements.setLayoutData(editDurationElementsData);
		editDurationElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(durationElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						durationElementsList,
						SrmPackage.eINSTANCE.getSoftwareTimerResource_DurationElements().getEType(), null, false, true,
						null, null);
				if (dialog.open() == Window.OK) {
					durationElementsList = dialog.getResult();
					if (durationElementsList == null) {
						durationElementsList = new BasicEList();
					}
					durationElements.setText(durationElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.durationElements,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
							new BasicEList(durationElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editDurationElements, SrmViewsRepository.Timing.Properties.durationElements);
		EditingUtils.setEEFtype(editDurationElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createDurationElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMessageQueueCapacityElementsMultiValuedEditor(FormToolkit widgetFactory,
			Composite parent) {
		messageQueueCapacityElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData messageQueueCapacityElementsData = new GridData(GridData.FILL_HORIZONTAL);
		messageQueueCapacityElementsData.horizontalSpan = 2;
		messageQueueCapacityElements.setLayoutData(messageQueueCapacityElementsData);
		EditingUtils.setID(messageQueueCapacityElements,
				SrmViewsRepository.Timing.Properties.messageQueueCapacityElements);
		EditingUtils.setEEFtype(messageQueueCapacityElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMessageQueueCapacityElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.messageQueueCapacityElements,
						SrmMessages.TimingPropertiesEditionPart_MessageQueueCapacityElementsLabel),
				SWT.NONE);
		GridData editMessageQueueCapacityElementsData = new GridData();
		editMessageQueueCapacityElements.setLayoutData(editMessageQueueCapacityElementsData);
		editMessageQueueCapacityElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(messageQueueCapacityElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						messageQueueCapacityElementsList,
						SrmPackage.eINSTANCE.getMessageComResource_MessageQueueCapacityElements().getEType(), null,
						false, true, null, null);
				if (dialog.open() == Window.OK) {
					messageQueueCapacityElementsList = dialog.getResult();
					if (messageQueueCapacityElementsList == null) {
						messageQueueCapacityElementsList = new BasicEList();
					}
					messageQueueCapacityElements.setText(messageQueueCapacityElementsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.messageQueueCapacityElements,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new BasicEList(messageQueueCapacityElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMessageQueueCapacityElements,
				SrmViewsRepository.Timing.Properties.messageQueueCapacityElements);
		EditingUtils.setEEFtype(editMessageQueueCapacityElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for
		// createMessageQueueCapacityElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPriorityElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		priorityElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData priorityElementsData = new GridData(GridData.FILL_HORIZONTAL);
		priorityElementsData.horizontalSpan = 2;
		priorityElements.setLayoutData(priorityElementsData);
		EditingUtils.setID(priorityElements, SrmViewsRepository.Timing.Properties.priorityElements);
		EditingUtils.setEEFtype(priorityElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPriorityElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.priorityElements,
						SrmMessages.TimingPropertiesEditionPart_PriorityElementsLabel),
				SWT.NONE);
		GridData editPriorityElementsData = new GridData();
		editPriorityElements.setLayoutData(editPriorityElementsData);
		editPriorityElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(priorityElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						priorityElementsList,
						SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PriorityElements().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					priorityElementsList = dialog.getResult();
					if (priorityElementsList == null) {
						priorityElementsList = new BasicEList();
					}
					priorityElements.setText(priorityElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.priorityElements,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
							new BasicEList(priorityElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPriorityElements, SrmViewsRepository.Timing.Properties.priorityElements);
		EditingUtils.setEEFtype(editPriorityElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createPriorityElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMessageSizeElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		messageSizeElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData messageSizeElementsData = new GridData(GridData.FILL_HORIZONTAL);
		messageSizeElementsData.horizontalSpan = 2;
		messageSizeElements.setLayoutData(messageSizeElementsData);
		EditingUtils.setID(messageSizeElements, SrmViewsRepository.Timing.Properties.messageSizeElements);
		EditingUtils.setEEFtype(messageSizeElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMessageSizeElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.messageSizeElements,
						SrmMessages.TimingPropertiesEditionPart_MessageSizeElementsLabel),
				SWT.NONE);
		GridData editMessageSizeElementsData = new GridData();
		editMessageSizeElements.setLayoutData(editMessageSizeElementsData);
		editMessageSizeElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(messageSizeElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						messageSizeElementsList,
						SrmPackage.eINSTANCE.getMessageComResource_MessageSizeElements().getEType(), null, false, true,
						null, null);
				if (dialog.open() == Window.OK) {
					messageSizeElementsList = dialog.getResult();
					if (messageSizeElementsList == null) {
						messageSizeElementsList = new BasicEList();
					}
					messageSizeElements.setText(messageSizeElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.messageSizeElements, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(messageSizeElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMessageSizeElements, SrmViewsRepository.Timing.Properties.messageSizeElements);
		EditingUtils.setEEFtype(editMessageSizeElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createMessageSizeElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOccurenceCountElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		occurenceCountElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData occurenceCountElementsData = new GridData(GridData.FILL_HORIZONTAL);
		occurenceCountElementsData.horizontalSpan = 2;
		occurenceCountElements.setLayoutData(occurenceCountElementsData);
		EditingUtils.setID(occurenceCountElements, SrmViewsRepository.Timing.Properties.occurenceCountElements);
		EditingUtils.setEEFtype(occurenceCountElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editOccurenceCountElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.occurenceCountElements,
						SrmMessages.TimingPropertiesEditionPart_OccurenceCountElementsLabel),
				SWT.NONE);
		GridData editOccurenceCountElementsData = new GridData();
		editOccurenceCountElements.setLayoutData(editOccurenceCountElementsData);
		editOccurenceCountElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(occurenceCountElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						occurenceCountElementsList,
						SrmPackage.eINSTANCE.getNotificationResource_OccurenceCountElements().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					occurenceCountElementsList = dialog.getResult();
					if (occurenceCountElementsList == null) {
						occurenceCountElementsList = new BasicEList();
					}
					occurenceCountElements.setText(occurenceCountElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.occurenceCountElements, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(occurenceCountElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editOccurenceCountElements, SrmViewsRepository.Timing.Properties.occurenceCountElements);
		EditingUtils.setEEFtype(editOccurenceCountElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createOccurenceCountElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createWaitingPolicyElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		waitingPolicyElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData waitingPolicyElementsData = new GridData(GridData.FILL_HORIZONTAL);
		waitingPolicyElementsData.horizontalSpan = 2;
		waitingPolicyElements.setLayoutData(waitingPolicyElementsData);
		EditingUtils.setID(waitingPolicyElements, SrmViewsRepository.Timing.Properties.waitingPolicyElements);
		EditingUtils.setEEFtype(waitingPolicyElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editWaitingPolicyElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.waitingPolicyElements,
						SrmMessages.TimingPropertiesEditionPart_WaitingPolicyElementsLabel),
				SWT.NONE);
		GridData editWaitingPolicyElementsData = new GridData();
		editWaitingPolicyElements.setLayoutData(editWaitingPolicyElementsData);
		editWaitingPolicyElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(waitingPolicyElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						waitingPolicyElementsList,
						SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingPolicyElements().getEType(), null,
						false, true, null, null);
				if (dialog.open() == Window.OK) {
					waitingPolicyElementsList = dialog.getResult();
					if (waitingPolicyElementsList == null) {
						waitingPolicyElementsList = new BasicEList();
					}
					waitingPolicyElements.setText(waitingPolicyElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.waitingPolicyElements, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(waitingPolicyElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editWaitingPolicyElements, SrmViewsRepository.Timing.Properties.waitingPolicyElements);
		EditingUtils.setEEFtype(editWaitingPolicyElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createWaitingPolicyElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDeadlineElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		deadlineElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData deadlineElementsData = new GridData(GridData.FILL_HORIZONTAL);
		deadlineElementsData.horizontalSpan = 2;
		deadlineElements.setLayoutData(deadlineElementsData);
		EditingUtils.setID(deadlineElements, SrmViewsRepository.Timing.Properties.deadlineElements);
		EditingUtils.setEEFtype(deadlineElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editDeadlineElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.deadlineElements,
						SrmMessages.TimingPropertiesEditionPart_DeadlineElementsLabel),
				SWT.NONE);
		GridData editDeadlineElementsData = new GridData();
		editDeadlineElements.setLayoutData(editDeadlineElementsData);
		editDeadlineElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(deadlineElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						deadlineElementsList,
						SrmPackage.eINSTANCE.getSoftwareSchedulableResource_DeadlineElements().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					deadlineElementsList = dialog.getResult();
					if (deadlineElementsList == null) {
						deadlineElementsList = new BasicEList();
					}
					deadlineElements.setText(deadlineElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.deadlineElements,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
							new BasicEList(deadlineElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editDeadlineElements, SrmViewsRepository.Timing.Properties.deadlineElements);
		EditingUtils.setEEFtype(editDeadlineElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createDeadlineElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDeadlineTypeElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		deadlineTypeElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData deadlineTypeElementsData = new GridData(GridData.FILL_HORIZONTAL);
		deadlineTypeElementsData.horizontalSpan = 2;
		deadlineTypeElements.setLayoutData(deadlineTypeElementsData);
		EditingUtils.setID(deadlineTypeElements, SrmViewsRepository.Timing.Properties.deadlineTypeElements);
		EditingUtils.setEEFtype(deadlineTypeElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editDeadlineTypeElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.deadlineTypeElements,
						SrmMessages.TimingPropertiesEditionPart_DeadlineTypeElementsLabel),
				SWT.NONE);
		GridData editDeadlineTypeElementsData = new GridData();
		editDeadlineTypeElements.setLayoutData(editDeadlineTypeElementsData);
		editDeadlineTypeElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(deadlineTypeElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						deadlineTypeElementsList,
						SrmPackage.eINSTANCE.getSoftwareSchedulableResource_DeadlineTypeElements().getEType(), null,
						false, true, null, null);
				if (dialog.open() == Window.OK) {
					deadlineTypeElementsList = dialog.getResult();
					if (deadlineTypeElementsList == null) {
						deadlineTypeElementsList = new BasicEList();
					}
					deadlineTypeElements.setText(deadlineTypeElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.deadlineTypeElements, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(deadlineTypeElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editDeadlineTypeElements, SrmViewsRepository.Timing.Properties.deadlineTypeElements);
		EditingUtils.setEEFtype(editDeadlineTypeElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createDeadlineTypeElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTimeSliceElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		timeSliceElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData timeSliceElementsData = new GridData(GridData.FILL_HORIZONTAL);
		timeSliceElementsData.horizontalSpan = 2;
		timeSliceElements.setLayoutData(timeSliceElementsData);
		EditingUtils.setID(timeSliceElements, SrmViewsRepository.Timing.Properties.timeSliceElements);
		EditingUtils.setEEFtype(timeSliceElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editTimeSliceElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.Timing.Properties.timeSliceElements,
						SrmMessages.TimingPropertiesEditionPart_TimeSliceElementsLabel),
				SWT.NONE);
		GridData editTimeSliceElementsData = new GridData();
		editTimeSliceElements.setLayoutData(editTimeSliceElementsData);
		editTimeSliceElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(timeSliceElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						timeSliceElementsList,
						SrmPackage.eINSTANCE.getSoftwareSchedulableResource_TimeSliceElements().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					timeSliceElementsList = dialog.getResult();
					if (timeSliceElementsList == null) {
						timeSliceElementsList = new BasicEList();
					}
					timeSliceElements.setText(timeSliceElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.timeSliceElements, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(timeSliceElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editTimeSliceElements, SrmViewsRepository.Timing.Properties.timeSliceElements);
		EditingUtils.setEEFtype(editTimeSliceElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createTimeSliceElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAccCtrlPolicyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.accCtrlPolicy = new ReferencesTable(getDescription(SrmViewsRepository.Timing.Properties.accCtrlPolicy,
				SrmMessages.TimingPropertiesEditionPart_AccCtrlPolicyLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						accCtrlPolicy.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						accCtrlPolicy.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						accCtrlPolicy.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						accCtrlPolicy.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.accCtrlPolicyFilters) {
			this.accCtrlPolicy.addFilter(filter);
		}
		this.accCtrlPolicy.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.accCtrlPolicy, SrmViewsRepository.FORM_KIND));
		this.accCtrlPolicy.createControls(parent, widgetFactory);
		this.accCtrlPolicy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.accCtrlPolicy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData accCtrlPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		accCtrlPolicyData.horizontalSpan = 3;
		this.accCtrlPolicy.setLayoutData(accCtrlPolicyData);
		this.accCtrlPolicy.setLowerBound(0);
		this.accCtrlPolicy.setUpperBound(-1);
		accCtrlPolicy.setID(SrmViewsRepository.Timing.Properties.accCtrlPolicy);
		accCtrlPolicy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAccCtrlPolicyTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResCtrlPolicyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.resCtrlPolicy = new ReferencesTable(getDescription(SrmViewsRepository.Timing.Properties.resCtrlPolicy,
				SrmMessages.TimingPropertiesEditionPart_ResCtrlPolicyLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						resCtrlPolicy.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						resCtrlPolicy.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						resCtrlPolicy.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						resCtrlPolicy.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.resCtrlPolicyFilters) {
			this.resCtrlPolicy.addFilter(filter);
		}
		this.resCtrlPolicy.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.resCtrlPolicy, SrmViewsRepository.FORM_KIND));
		this.resCtrlPolicy.createControls(parent, widgetFactory);
		this.resCtrlPolicy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.resCtrlPolicy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData resCtrlPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		resCtrlPolicyData.horizontalSpan = 3;
		this.resCtrlPolicy.setLayoutData(resCtrlPolicyData);
		this.resCtrlPolicy.setLowerBound(0);
		this.resCtrlPolicy.setUpperBound(-1);
		resCtrlPolicy.setID(SrmViewsRepository.Timing.Properties.resCtrlPolicy);
		resCtrlPolicy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createResCtrlPolicyTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createAccessTokenElementsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.accessTokenElements = new ReferencesTable(
				getDescription(SrmViewsRepository.Timing.Properties.accessTokenElements,
						SrmMessages.TimingPropertiesEditionPart_AccessTokenElementsLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addAccessTokenElements();
					}

					public void handleEdit(EObject element) {
						editAccessTokenElements(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveAccessTokenElements(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromAccessTokenElements(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.accessTokenElements.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Timing.Properties.accessTokenElements, SrmViewsRepository.FORM_KIND));
		this.accessTokenElements.createControls(parent, widgetFactory);
		this.accessTokenElements.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.accessTokenElements, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData accessTokenElementsData = new GridData(GridData.FILL_HORIZONTAL);
		accessTokenElementsData.horizontalSpan = 3;
		this.accessTokenElements.setLayoutData(accessTokenElementsData);
		this.accessTokenElements.disableMove();
		accessTokenElements.setID(SrmViewsRepository.Timing.Properties.accessTokenElements);
		accessTokenElements.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createAccessTokenElementsReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addAccessTokenElements() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(accessTokenElements.getInput(),
				accessTokenElementsFilters, accessTokenElementsBusinessFilters, "accessTokenElements",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.accessTokenElements,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				accessTokenElements.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAccessTokenElements(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.accessTokenElements,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		accessTokenElements.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAccessTokenElements(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.accessTokenElements,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		accessTokenElements.refresh();
	}

	/**
	 * 
	 */
	protected void editAccessTokenElements(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				accessTokenElements.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMutualExclusionResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.mutualExclusionResources = new ReferencesTable(
				getDescription(SrmViewsRepository.Timing.Properties.mutualExclusionResources,
						SrmMessages.TimingPropertiesEditionPart_MutualExclusionResourcesLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addMutualExclusionResources();
					}

					public void handleEdit(EObject element) {
						editMutualExclusionResources(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveMutualExclusionResources(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromMutualExclusionResources(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.mutualExclusionResources.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Timing.Properties.mutualExclusionResources, SrmViewsRepository.FORM_KIND));
		this.mutualExclusionResources.createControls(parent, widgetFactory);
		this.mutualExclusionResources.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.mutualExclusionResources,
									PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null,
									e.item.getData()));
				}
			}

		});
		GridData mutualExclusionResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		mutualExclusionResourcesData.horizontalSpan = 3;
		this.mutualExclusionResources.setLayoutData(mutualExclusionResourcesData);
		this.mutualExclusionResources.disableMove();
		mutualExclusionResources.setID(SrmViewsRepository.Timing.Properties.mutualExclusionResources);
		mutualExclusionResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createMutualExclusionResourcesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addMutualExclusionResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(mutualExclusionResources.getInput(),
				mutualExclusionResourcesFilters, mutualExclusionResourcesBusinessFilters, "mutualExclusionResources",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.mutualExclusionResources,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				mutualExclusionResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMutualExclusionResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.mutualExclusionResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		mutualExclusionResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMutualExclusionResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.mutualExclusionResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		mutualExclusionResources.refresh();
	}

	/**
	 * 
	 */
	protected void editMutualExclusionResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				mutualExclusionResources.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createTimersReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.timers = new ReferencesTable(getDescription(SrmViewsRepository.Timing.Properties.timers,
				SrmMessages.TimingPropertiesEditionPart_TimersLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addTimers();
					}

					public void handleEdit(EObject element) {
						editTimers(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveTimers(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromTimers(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.timers.setHelpText(propertiesEditionComponent.getHelpContent(SrmViewsRepository.Timing.Properties.timers,
				SrmViewsRepository.FORM_KIND));
		this.timers.createControls(parent, widgetFactory);
		this.timers.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.timers, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData timersData = new GridData(GridData.FILL_HORIZONTAL);
		timersData.horizontalSpan = 3;
		this.timers.setLayoutData(timersData);
		this.timers.disableMove();
		timers.setID(SrmViewsRepository.Timing.Properties.timers);
		timers.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createTimersReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addTimers() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(timers.getInput(), timersFilters,
				timersBusinessFilters, "timers", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.timers,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				timers.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTimers(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.timers,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		timers.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTimers(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.timers,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		timers.refresh();
	}

	/**
	 * 
	 */
	protected void editTimers(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				timers.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProtectParamsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.protectParams = new ReferencesTable(getDescription(SrmViewsRepository.Timing.Properties.protectParams,
				SrmMessages.TimingPropertiesEditionPart_ProtectParamsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						protectParams.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						protectParams.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						protectParams.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
										SrmViewsRepository.Timing.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						protectParams.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.protectParamsFilters) {
			this.protectParams.addFilter(filter);
		}
		this.protectParams.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Timing.Properties.protectParams, SrmViewsRepository.FORM_KIND));
		this.protectParams.createControls(parent, widgetFactory);
		this.protectParams.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.protectParams, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData protectParamsData = new GridData(GridData.FILL_HORIZONTAL);
		protectParamsData.horizontalSpan = 3;
		this.protectParams.setLayoutData(protectParamsData);
		this.protectParams.setLowerBound(0);
		this.protectParams.setUpperBound(-1);
		protectParams.setID(SrmViewsRepository.Timing.Properties.protectParams);
		protectParams.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProtectParamsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createConcurrentResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.concurrentResources = new ReferencesTable(
				getDescription(SrmViewsRepository.Timing.Properties.concurrentResources,
						SrmMessages.TimingPropertiesEditionPart_ConcurrentResourcesLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addConcurrentResources();
					}

					public void handleEdit(EObject element) {
						editConcurrentResources(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveConcurrentResources(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromConcurrentResources(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.concurrentResources.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Timing.Properties.concurrentResources, SrmViewsRepository.FORM_KIND));
		this.concurrentResources.createControls(parent, widgetFactory);
		this.concurrentResources.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimingPropertiesEditionPartForm.this,
							SrmViewsRepository.Timing.Properties.concurrentResources, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData concurrentResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		concurrentResourcesData.horizontalSpan = 3;
		this.concurrentResources.setLayoutData(concurrentResourcesData);
		this.concurrentResources.disableMove();
		concurrentResources.setID(SrmViewsRepository.Timing.Properties.concurrentResources);
		concurrentResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createConcurrentResourcesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addConcurrentResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(concurrentResources.getInput(),
				concurrentResourcesFilters, concurrentResourcesBusinessFilters, "concurrentResources",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this,
									SrmViewsRepository.Timing.Properties.concurrentResources,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				concurrentResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveConcurrentResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.concurrentResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		concurrentResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConcurrentResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				TimingPropertiesEditionPartForm.this, SrmViewsRepository.Timing.Properties.concurrentResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		concurrentResources.refresh();
	}

	/**
	 * 
	 */
	protected void editConcurrentResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				concurrentResources.refresh();
			}
		}
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
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getCapacity()
	 * 
	 */
	public String getCapacity() {
		return capacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setCapacity(String
	 *      newValue)
	 * 
	 */
	public void setCapacity(String newValue) {
		if (newValue != null) {
			capacity.setText(newValue);
		} else {
			capacity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.capacity);
		if (eefElementEditorReadOnlyState && capacity.isEnabled()) {
			capacity.setEnabled(false);
			capacity.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !capacity.isEnabled()) {
			capacity.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getIsPeriodic()
	 * 
	 */
	public Boolean getIsPeriodic() {
		return Boolean.valueOf(isPeriodic.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setIsPeriodic(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsPeriodic(Boolean newValue) {
		if (newValue != null) {
			isPeriodic.setSelection(newValue.booleanValue());
		} else {
			isPeriodic.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.isPeriodic);
		if (eefElementEditorReadOnlyState && isPeriodic.isEnabled()) {
			isPeriodic.setEnabled(false);
			isPeriodic.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isPeriodic.isEnabled()) {
			isPeriodic.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getIsPreemptable()
	 * 
	 */
	public Boolean getIsPreemptable() {
		return Boolean.valueOf(isPreemptable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setIsPreemptable(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsPreemptable(Boolean newValue) {
		if (newValue != null) {
			isPreemptable.setSelection(newValue.booleanValue());
		} else {
			isPreemptable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.isPreemptable);
		if (eefElementEditorReadOnlyState && isPreemptable.isEnabled()) {
			isPreemptable.setEnabled(false);
			isPreemptable.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isPreemptable.isEnabled()) {
			isPreemptable.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getIsFixedMessageSize()
	 * 
	 */
	public Boolean getIsFixedMessageSize() {
		return Boolean.valueOf(isFixedMessageSize.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setIsFixedMessageSize(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsFixedMessageSize(Boolean newValue) {
		if (newValue != null) {
			isFixedMessageSize.setSelection(newValue.booleanValue());
		} else {
			isFixedMessageSize.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.isFixedMessageSize);
		if (eefElementEditorReadOnlyState && isFixedMessageSize.isEnabled()) {
			isFixedMessageSize.setEnabled(false);
			isFixedMessageSize.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isFixedMessageSize.isEnabled()) {
			isFixedMessageSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getDuration()
	 * 
	 */
	public String getDuration() {
		return duration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setDuration(String
	 *      newValue)
	 * 
	 */
	public void setDuration(String newValue) {
		if (newValue != null) {
			duration.setText(newValue);
		} else {
			duration.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.duration);
		if (eefElementEditorReadOnlyState && duration.isEnabled()) {
			duration.setEnabled(false);
			duration.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !duration.isEnabled()) {
			duration.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getArrivalPattern()
	 * 
	 */
	public String getArrivalPattern() {
		return arrivalPattern.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setArrivalPattern(String
	 *      newValue)
	 * 
	 */
	public void setArrivalPattern(String newValue) {
		if (newValue != null) {
			arrivalPattern.setText(newValue);
		} else {
			arrivalPattern.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.arrivalPattern);
		if (eefElementEditorReadOnlyState && arrivalPattern.isEnabled()) {
			arrivalPattern.setEnabled(false);
			arrivalPattern.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !arrivalPattern.isEnabled()) {
			arrivalPattern.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getPacketTime()
	 * 
	 */
	public String getPacketTime() {
		return packetTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setPacketTime(String
	 *      newValue)
	 * 
	 */
	public void setPacketTime(String newValue) {
		if (newValue != null) {
			packetTime.setText(newValue);
		} else {
			packetTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.packetTime);
		if (eefElementEditorReadOnlyState && packetTime.isEnabled()) {
			packetTime.setEnabled(false);
			packetTime.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !packetTime.isEnabled()) {
			packetTime.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getBlockingTime()
	 * 
	 */
	public String getBlockingTime() {
		return blockingTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setBlockingTime(String
	 *      newValue)
	 * 
	 */
	public void setBlockingTime(String newValue) {
		if (newValue != null) {
			blockingTime.setText(newValue);
		} else {
			blockingTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.blockingTime);
		if (eefElementEditorReadOnlyState && blockingTime.isEnabled()) {
			blockingTime.setEnabled(false);
			blockingTime.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !blockingTime.isEnabled()) {
			blockingTime.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getWaitingQueueCapacity()
	 * 
	 */
	public String getWaitingQueueCapacity() {
		return waitingQueueCapacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setWaitingQueueCapacity(String
	 *      newValue)
	 * 
	 */
	public void setWaitingQueueCapacity(String newValue) {
		if (newValue != null) {
			waitingQueueCapacity.setText(newValue);
		} else {
			waitingQueueCapacity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.waitingQueueCapacity);
		if (eefElementEditorReadOnlyState && waitingQueueCapacity.isEnabled()) {
			waitingQueueCapacity.setEnabled(false);
			waitingQueueCapacity.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !waitingQueueCapacity.isEnabled()) {
			waitingQueueCapacity.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getWaitingQueuePolicy()
	 * 
	 */
	public Enumerator getWaitingQueuePolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) waitingQueuePolicy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initWaitingQueuePolicy(Object
	 *      input, Enumerator current)
	 */
	public void initWaitingQueuePolicy(Object input, Enumerator current) {
		waitingQueuePolicy.setInput(input);
		waitingQueuePolicy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.waitingQueuePolicy);
		if (eefElementEditorReadOnlyState && waitingQueuePolicy.isEnabled()) {
			waitingQueuePolicy.setEnabled(false);
			waitingQueuePolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !waitingQueuePolicy.isEnabled()) {
			waitingQueuePolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setWaitingQueuePolicy(Enumerator
	 *      newValue)
	 * 
	 */
	public void setWaitingQueuePolicy(Enumerator newValue) {
		waitingQueuePolicy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.waitingQueuePolicy);
		if (eefElementEditorReadOnlyState && waitingQueuePolicy.isEnabled()) {
			waitingQueuePolicy.setEnabled(false);
			waitingQueuePolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !waitingQueuePolicy.isEnabled()) {
			waitingQueuePolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getPolicy()
	 * 
	 */
	public Enumerator getPolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) policy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initPolicy(Object
	 *      input, Enumerator current)
	 */
	public void initPolicy(Object input, Enumerator current) {
		policy.setInput(input);
		policy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.policy);
		if (eefElementEditorReadOnlyState && policy.isEnabled()) {
			policy.setEnabled(false);
			policy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policy.isEnabled()) {
			policy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setPolicy(Enumerator
	 *      newValue)
	 * 
	 */
	public void setPolicy(Enumerator newValue) {
		policy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.policy);
		if (eefElementEditorReadOnlyState && policy.isEnabled()) {
			policy.setEnabled(false);
			policy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policy.isEnabled()) {
			policy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getMessageQueuePolicy()
	 * 
	 */
	public Enumerator getMessageQueuePolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) messageQueuePolicy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initMessageQueuePolicy(Object
	 *      input, Enumerator current)
	 */
	public void initMessageQueuePolicy(Object input, Enumerator current) {
		messageQueuePolicy.setInput(input);
		messageQueuePolicy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.messageQueuePolicy);
		if (eefElementEditorReadOnlyState && messageQueuePolicy.isEnabled()) {
			messageQueuePolicy.setEnabled(false);
			messageQueuePolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !messageQueuePolicy.isEnabled()) {
			messageQueuePolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setMessageQueuePolicy(Enumerator
	 *      newValue)
	 * 
	 */
	public void setMessageQueuePolicy(Enumerator newValue) {
		messageQueuePolicy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.messageQueuePolicy);
		if (eefElementEditorReadOnlyState && messageQueuePolicy.isEnabled()) {
			messageQueuePolicy.setEnabled(false);
			messageQueuePolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !messageQueuePolicy.isEnabled()) {
			messageQueuePolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getMechanism()
	 * 
	 */
	public Enumerator getMechanism() {
		Enumerator selection = (Enumerator) ((StructuredSelection) mechanism.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initMechanism(Object
	 *      input, Enumerator current)
	 */
	public void initMechanism(Object input, Enumerator current) {
		mechanism.setInput(input);
		mechanism.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.mechanism);
		if (eefElementEditorReadOnlyState && mechanism.isEnabled()) {
			mechanism.setEnabled(false);
			mechanism.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mechanism.isEnabled()) {
			mechanism.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setMechanism(Enumerator
	 *      newValue)
	 * 
	 */
	public void setMechanism(Enumerator newValue) {
		mechanism.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.mechanism);
		if (eefElementEditorReadOnlyState && mechanism.isEnabled()) {
			mechanism.setEnabled(false);
			mechanism.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mechanism.isEnabled()) {
			mechanism.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getTransmMode()
	 * 
	 */
	public Enumerator getTransmMode() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transmMode.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initTransmMode(Object
	 *      input, Enumerator current)
	 */
	public void initTransmMode(Object input, Enumerator current) {
		transmMode.setInput(input);
		transmMode.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.transmMode);
		if (eefElementEditorReadOnlyState && transmMode.isEnabled()) {
			transmMode.setEnabled(false);
			transmMode.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transmMode.isEnabled()) {
			transmMode.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setTransmMode(Enumerator
	 *      newValue)
	 * 
	 */
	public void setTransmMode(Enumerator newValue) {
		transmMode.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.transmMode);
		if (eefElementEditorReadOnlyState && transmMode.isEnabled()) {
			transmMode.setEnabled(false);
			transmMode.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transmMode.isEnabled()) {
			transmMode.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getConcurrentAccessProtocol()
	 * 
	 */
	public Enumerator getConcurrentAccessProtocol() {
		Enumerator selection = (Enumerator) ((StructuredSelection) concurrentAccessProtocol.getSelection())
				.getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initConcurrentAccessProtocol(Object
	 *      input, Enumerator current)
	 */
	public void initConcurrentAccessProtocol(Object input, Enumerator current) {
		concurrentAccessProtocol.setInput(input);
		concurrentAccessProtocol.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Timing.Properties.concurrentAccessProtocol);
		if (eefElementEditorReadOnlyState && concurrentAccessProtocol.isEnabled()) {
			concurrentAccessProtocol.setEnabled(false);
			concurrentAccessProtocol.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !concurrentAccessProtocol.isEnabled()) {
			concurrentAccessProtocol.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setConcurrentAccessProtocol(Enumerator
	 *      newValue)
	 * 
	 */
	public void setConcurrentAccessProtocol(Enumerator newValue) {
		concurrentAccessProtocol.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Timing.Properties.concurrentAccessProtocol);
		if (eefElementEditorReadOnlyState && concurrentAccessProtocol.isEnabled()) {
			concurrentAccessProtocol.setEnabled(false);
			concurrentAccessProtocol.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !concurrentAccessProtocol.isEnabled()) {
			concurrentAccessProtocol.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getAccessPolicy()
	 * 
	 */
	public Enumerator getAccessPolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) accessPolicy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initAccessPolicy(Object
	 *      input, Enumerator current)
	 */
	public void initAccessPolicy(Object input, Enumerator current) {
		accessPolicy.setInput(input);
		accessPolicy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.accessPolicy);
		if (eefElementEditorReadOnlyState && accessPolicy.isEnabled()) {
			accessPolicy.setEnabled(false);
			accessPolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessPolicy.isEnabled()) {
			accessPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setAccessPolicy(Enumerator
	 *      newValue)
	 * 
	 */
	public void setAccessPolicy(Enumerator newValue) {
		accessPolicy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.accessPolicy);
		if (eefElementEditorReadOnlyState && accessPolicy.isEnabled()) {
			accessPolicy.setEnabled(false);
			accessPolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessPolicy.isEnabled()) {
			accessPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getDurationElements()
	 * 
	 */
	public EList getDurationElements() {
		return durationElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setDurationElements(EList
	 *      newValue)
	 * 
	 */
	public void setDurationElements(EList newValue) {
		durationElementsList = newValue;
		if (newValue != null) {
			durationElements.setText(durationElementsList.toString());
		} else {
			durationElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.durationElements);
		if (eefElementEditorReadOnlyState && durationElements.isEnabled()) {
			durationElements.setEnabled(false);
			durationElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !durationElements.isEnabled()) {
			durationElements.setEnabled(true);
		}

	}

	public void addToDurationElements(Object newValue) {
		durationElementsList.add(newValue);
		if (newValue != null) {
			durationElements.setText(durationElementsList.toString());
		} else {
			durationElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToDurationElements(Object newValue) {
		durationElementsList.remove(newValue);
		if (newValue != null) {
			durationElements.setText(durationElementsList.toString());
		} else {
			durationElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getMessageQueueCapacityElements()
	 * 
	 */
	public EList getMessageQueueCapacityElements() {
		return messageQueueCapacityElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setMessageQueueCapacityElements(EList
	 *      newValue)
	 * 
	 */
	public void setMessageQueueCapacityElements(EList newValue) {
		messageQueueCapacityElementsList = newValue;
		if (newValue != null) {
			messageQueueCapacityElements.setText(messageQueueCapacityElementsList.toString());
		} else {
			messageQueueCapacityElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Timing.Properties.messageQueueCapacityElements);
		if (eefElementEditorReadOnlyState && messageQueueCapacityElements.isEnabled()) {
			messageQueueCapacityElements.setEnabled(false);
			messageQueueCapacityElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !messageQueueCapacityElements.isEnabled()) {
			messageQueueCapacityElements.setEnabled(true);
		}

	}

	public void addToMessageQueueCapacityElements(Object newValue) {
		messageQueueCapacityElementsList.add(newValue);
		if (newValue != null) {
			messageQueueCapacityElements.setText(messageQueueCapacityElementsList.toString());
		} else {
			messageQueueCapacityElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMessageQueueCapacityElements(Object newValue) {
		messageQueueCapacityElementsList.remove(newValue);
		if (newValue != null) {
			messageQueueCapacityElements.setText(messageQueueCapacityElementsList.toString());
		} else {
			messageQueueCapacityElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getPriorityElements()
	 * 
	 */
	public EList getPriorityElements() {
		return priorityElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setPriorityElements(EList
	 *      newValue)
	 * 
	 */
	public void setPriorityElements(EList newValue) {
		priorityElementsList = newValue;
		if (newValue != null) {
			priorityElements.setText(priorityElementsList.toString());
		} else {
			priorityElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.priorityElements);
		if (eefElementEditorReadOnlyState && priorityElements.isEnabled()) {
			priorityElements.setEnabled(false);
			priorityElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !priorityElements.isEnabled()) {
			priorityElements.setEnabled(true);
		}

	}

	public void addToPriorityElements(Object newValue) {
		priorityElementsList.add(newValue);
		if (newValue != null) {
			priorityElements.setText(priorityElementsList.toString());
		} else {
			priorityElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToPriorityElements(Object newValue) {
		priorityElementsList.remove(newValue);
		if (newValue != null) {
			priorityElements.setText(priorityElementsList.toString());
		} else {
			priorityElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getMessageSizeElements()
	 * 
	 */
	public EList getMessageSizeElements() {
		return messageSizeElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setMessageSizeElements(EList
	 *      newValue)
	 * 
	 */
	public void setMessageSizeElements(EList newValue) {
		messageSizeElementsList = newValue;
		if (newValue != null) {
			messageSizeElements.setText(messageSizeElementsList.toString());
		} else {
			messageSizeElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.messageSizeElements);
		if (eefElementEditorReadOnlyState && messageSizeElements.isEnabled()) {
			messageSizeElements.setEnabled(false);
			messageSizeElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !messageSizeElements.isEnabled()) {
			messageSizeElements.setEnabled(true);
		}

	}

	public void addToMessageSizeElements(Object newValue) {
		messageSizeElementsList.add(newValue);
		if (newValue != null) {
			messageSizeElements.setText(messageSizeElementsList.toString());
		} else {
			messageSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMessageSizeElements(Object newValue) {
		messageSizeElementsList.remove(newValue);
		if (newValue != null) {
			messageSizeElements.setText(messageSizeElementsList.toString());
		} else {
			messageSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getOccurenceCountElements()
	 * 
	 */
	public EList getOccurenceCountElements() {
		return occurenceCountElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setOccurenceCountElements(EList
	 *      newValue)
	 * 
	 */
	public void setOccurenceCountElements(EList newValue) {
		occurenceCountElementsList = newValue;
		if (newValue != null) {
			occurenceCountElements.setText(occurenceCountElementsList.toString());
		} else {
			occurenceCountElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.occurenceCountElements);
		if (eefElementEditorReadOnlyState && occurenceCountElements.isEnabled()) {
			occurenceCountElements.setEnabled(false);
			occurenceCountElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !occurenceCountElements.isEnabled()) {
			occurenceCountElements.setEnabled(true);
		}

	}

	public void addToOccurenceCountElements(Object newValue) {
		occurenceCountElementsList.add(newValue);
		if (newValue != null) {
			occurenceCountElements.setText(occurenceCountElementsList.toString());
		} else {
			occurenceCountElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToOccurenceCountElements(Object newValue) {
		occurenceCountElementsList.remove(newValue);
		if (newValue != null) {
			occurenceCountElements.setText(occurenceCountElementsList.toString());
		} else {
			occurenceCountElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getWaitingPolicyElements()
	 * 
	 */
	public EList getWaitingPolicyElements() {
		return waitingPolicyElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setWaitingPolicyElements(EList
	 *      newValue)
	 * 
	 */
	public void setWaitingPolicyElements(EList newValue) {
		waitingPolicyElementsList = newValue;
		if (newValue != null) {
			waitingPolicyElements.setText(waitingPolicyElementsList.toString());
		} else {
			waitingPolicyElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.waitingPolicyElements);
		if (eefElementEditorReadOnlyState && waitingPolicyElements.isEnabled()) {
			waitingPolicyElements.setEnabled(false);
			waitingPolicyElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !waitingPolicyElements.isEnabled()) {
			waitingPolicyElements.setEnabled(true);
		}

	}

	public void addToWaitingPolicyElements(Object newValue) {
		waitingPolicyElementsList.add(newValue);
		if (newValue != null) {
			waitingPolicyElements.setText(waitingPolicyElementsList.toString());
		} else {
			waitingPolicyElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToWaitingPolicyElements(Object newValue) {
		waitingPolicyElementsList.remove(newValue);
		if (newValue != null) {
			waitingPolicyElements.setText(waitingPolicyElementsList.toString());
		} else {
			waitingPolicyElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getDeadlineElements()
	 * 
	 */
	public EList getDeadlineElements() {
		return deadlineElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setDeadlineElements(EList
	 *      newValue)
	 * 
	 */
	public void setDeadlineElements(EList newValue) {
		deadlineElementsList = newValue;
		if (newValue != null) {
			deadlineElements.setText(deadlineElementsList.toString());
		} else {
			deadlineElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.deadlineElements);
		if (eefElementEditorReadOnlyState && deadlineElements.isEnabled()) {
			deadlineElements.setEnabled(false);
			deadlineElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !deadlineElements.isEnabled()) {
			deadlineElements.setEnabled(true);
		}

	}

	public void addToDeadlineElements(Object newValue) {
		deadlineElementsList.add(newValue);
		if (newValue != null) {
			deadlineElements.setText(deadlineElementsList.toString());
		} else {
			deadlineElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToDeadlineElements(Object newValue) {
		deadlineElementsList.remove(newValue);
		if (newValue != null) {
			deadlineElements.setText(deadlineElementsList.toString());
		} else {
			deadlineElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getDeadlineTypeElements()
	 * 
	 */
	public EList getDeadlineTypeElements() {
		return deadlineTypeElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setDeadlineTypeElements(EList
	 *      newValue)
	 * 
	 */
	public void setDeadlineTypeElements(EList newValue) {
		deadlineTypeElementsList = newValue;
		if (newValue != null) {
			deadlineTypeElements.setText(deadlineTypeElementsList.toString());
		} else {
			deadlineTypeElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.deadlineTypeElements);
		if (eefElementEditorReadOnlyState && deadlineTypeElements.isEnabled()) {
			deadlineTypeElements.setEnabled(false);
			deadlineTypeElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !deadlineTypeElements.isEnabled()) {
			deadlineTypeElements.setEnabled(true);
		}

	}

	public void addToDeadlineTypeElements(Object newValue) {
		deadlineTypeElementsList.add(newValue);
		if (newValue != null) {
			deadlineTypeElements.setText(deadlineTypeElementsList.toString());
		} else {
			deadlineTypeElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToDeadlineTypeElements(Object newValue) {
		deadlineTypeElementsList.remove(newValue);
		if (newValue != null) {
			deadlineTypeElements.setText(deadlineTypeElementsList.toString());
		} else {
			deadlineTypeElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#getTimeSliceElements()
	 * 
	 */
	public EList getTimeSliceElements() {
		return timeSliceElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#setTimeSliceElements(EList
	 *      newValue)
	 * 
	 */
	public void setTimeSliceElements(EList newValue) {
		timeSliceElementsList = newValue;
		if (newValue != null) {
			timeSliceElements.setText(timeSliceElementsList.toString());
		} else {
			timeSliceElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.timeSliceElements);
		if (eefElementEditorReadOnlyState && timeSliceElements.isEnabled()) {
			timeSliceElements.setEnabled(false);
			timeSliceElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !timeSliceElements.isEnabled()) {
			timeSliceElements.setEnabled(true);
		}

	}

	public void addToTimeSliceElements(Object newValue) {
		timeSliceElementsList.add(newValue);
		if (newValue != null) {
			timeSliceElements.setText(timeSliceElementsList.toString());
		} else {
			timeSliceElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToTimeSliceElements(Object newValue) {
		timeSliceElementsList.remove(newValue);
		if (newValue != null) {
			timeSliceElements.setText(timeSliceElementsList.toString());
		} else {
			timeSliceElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initAccCtrlPolicy(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initAccCtrlPolicy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		accCtrlPolicy.setContentProvider(contentProvider);
		accCtrlPolicy.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.accCtrlPolicy);
		if (eefElementEditorReadOnlyState && accCtrlPolicy.isEnabled()) {
			accCtrlPolicy.setEnabled(false);
			accCtrlPolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accCtrlPolicy.isEnabled()) {
			accCtrlPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#updateAccCtrlPolicy()
	 * 
	 */
	public void updateAccCtrlPolicy() {
		accCtrlPolicy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addFilterAccCtrlPolicy(ViewerFilter
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
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addBusinessFilterAccCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToAccCtrlPolicy(ViewerFilter filter) {
		accCtrlPolicyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#isContainedInAccCtrlPolicyTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInAccCtrlPolicyTable(EObject element) {
		return ((ReferencesTableSettings) accCtrlPolicy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initResCtrlPolicy(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initResCtrlPolicy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resCtrlPolicy.setContentProvider(contentProvider);
		resCtrlPolicy.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.resCtrlPolicy);
		if (eefElementEditorReadOnlyState && resCtrlPolicy.isEnabled()) {
			resCtrlPolicy.setEnabled(false);
			resCtrlPolicy.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resCtrlPolicy.isEnabled()) {
			resCtrlPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#updateResCtrlPolicy()
	 * 
	 */
	public void updateResCtrlPolicy() {
		resCtrlPolicy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addFilterResCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToResCtrlPolicy(ViewerFilter filter) {
		resCtrlPolicyFilters.add(filter);
		if (this.resCtrlPolicy != null) {
			this.resCtrlPolicy.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addBusinessFilterResCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToResCtrlPolicy(ViewerFilter filter) {
		resCtrlPolicyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#isContainedInResCtrlPolicyTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInResCtrlPolicyTable(EObject element) {
		return ((ReferencesTableSettings) resCtrlPolicy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initAccessTokenElements(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAccessTokenElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		accessTokenElements.setContentProvider(contentProvider);
		accessTokenElements.setInput(settings);
		accessTokenElementsBusinessFilters.clear();
		accessTokenElementsFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.accessTokenElements);
		if (eefElementEditorReadOnlyState && accessTokenElements.getTable().isEnabled()) {
			accessTokenElements.setEnabled(false);
			accessTokenElements.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessTokenElements.getTable().isEnabled()) {
			accessTokenElements.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#updateAccessTokenElements()
	 * 
	 */
	public void updateAccessTokenElements() {
		accessTokenElements.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addFilterAccessTokenElements(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToAccessTokenElements(ViewerFilter filter) {
		accessTokenElementsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addBusinessFilterAccessTokenElements(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToAccessTokenElements(ViewerFilter filter) {
		accessTokenElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#isContainedInAccessTokenElementsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInAccessTokenElementsTable(EObject element) {
		return ((ReferencesTableSettings) accessTokenElements.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initMutualExclusionResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMutualExclusionResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mutualExclusionResources.setContentProvider(contentProvider);
		mutualExclusionResources.setInput(settings);
		mutualExclusionResourcesBusinessFilters.clear();
		mutualExclusionResourcesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Timing.Properties.mutualExclusionResources);
		if (eefElementEditorReadOnlyState && mutualExclusionResources.getTable().isEnabled()) {
			mutualExclusionResources.setEnabled(false);
			mutualExclusionResources.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mutualExclusionResources.getTable().isEnabled()) {
			mutualExclusionResources.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#updateMutualExclusionResources()
	 * 
	 */
	public void updateMutualExclusionResources() {
		mutualExclusionResources.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addFilterMutualExclusionResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMutualExclusionResources(ViewerFilter filter) {
		mutualExclusionResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addBusinessFilterMutualExclusionResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMutualExclusionResources(ViewerFilter filter) {
		mutualExclusionResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#isContainedInMutualExclusionResourcesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInMutualExclusionResourcesTable(EObject element) {
		return ((ReferencesTableSettings) mutualExclusionResources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initTimers(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTimers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		timers.setContentProvider(contentProvider);
		timers.setInput(settings);
		timersBusinessFilters.clear();
		timersFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.timers);
		if (eefElementEditorReadOnlyState && timers.getTable().isEnabled()) {
			timers.setEnabled(false);
			timers.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !timers.getTable().isEnabled()) {
			timers.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#updateTimers()
	 * 
	 */
	public void updateTimers() {
		timers.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addFilterTimers(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToTimers(ViewerFilter filter) {
		timersFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addBusinessFilterTimers(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToTimers(ViewerFilter filter) {
		timersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#isContainedInTimersTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInTimersTable(EObject element) {
		return ((ReferencesTableSettings) timers.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initProtectParams(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initProtectParams(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		protectParams.setContentProvider(contentProvider);
		protectParams.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.protectParams);
		if (eefElementEditorReadOnlyState && protectParams.isEnabled()) {
			protectParams.setEnabled(false);
			protectParams.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protectParams.isEnabled()) {
			protectParams.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#updateProtectParams()
	 * 
	 */
	public void updateProtectParams() {
		protectParams.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addFilterProtectParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToProtectParams(ViewerFilter filter) {
		protectParamsFilters.add(filter);
		if (this.protectParams != null) {
			this.protectParams.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addBusinessFilterProtectParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToProtectParams(ViewerFilter filter) {
		protectParamsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#isContainedInProtectParamsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInProtectParamsTable(EObject element) {
		return ((ReferencesTableSettings) protectParams.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#initConcurrentResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initConcurrentResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		concurrentResources.setContentProvider(contentProvider);
		concurrentResources.setInput(settings);
		concurrentResourcesBusinessFilters.clear();
		concurrentResourcesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Timing.Properties.concurrentResources);
		if (eefElementEditorReadOnlyState && concurrentResources.getTable().isEnabled()) {
			concurrentResources.setEnabled(false);
			concurrentResources.setToolTipText(SrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !concurrentResources.getTable().isEnabled()) {
			concurrentResources.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#updateConcurrentResources()
	 * 
	 */
	public void updateConcurrentResources() {
		concurrentResources.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addFilterConcurrentResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToConcurrentResources(ViewerFilter filter) {
		concurrentResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#addBusinessFilterConcurrentResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToConcurrentResources(ViewerFilter filter) {
		concurrentResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.TimingPropertiesEditionPart#isContainedInConcurrentResourcesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInConcurrentResourcesTable(EObject element) {
		return ((ReferencesTableSettings) concurrentResources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SrmMessages.Timing_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
