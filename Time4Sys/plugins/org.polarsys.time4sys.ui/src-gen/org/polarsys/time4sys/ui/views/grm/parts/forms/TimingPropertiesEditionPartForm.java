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
package org.polarsys.time4sys.ui.views.grm.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

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

import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.grm.providers.GrmMessages;

// End of user code

/**
 * 
 * 
 */
public class TimingPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimingPropertiesEditionPart {

	protected Text duration;
	protected EMFComboViewer policy;
	protected Text otherSchedPolicy;
	protected Text capacity;
	protected Text packetTime;
	protected Text blockingTime;
	protected Text priorityCeiling;
	protected Text preemptionLevel;
	protected Text execTime;



	/**
	 * For {@link ISection} use only.
	 */
	public TimingPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimingPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep timingPropertiesStep = timingStep.addStep(GrmViewsRepository.Timing.TimingProperties.class);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.duration);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.policy);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.capacity);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.packetTime);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.blockingTime);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.priorityCeiling);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.preemptionLevel);
		timingPropertiesStep.addStep(GrmViewsRepository.Timing.TimingProperties.execTime);
		
		
		composer = new PartComposer(timingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GrmViewsRepository.Timing.TimingProperties.class) {
					return createTimingPropertiesGroup(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.duration) {
					return createDurationText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.policy) {
					return createPolicyEMFComboViewer(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy) {
					return createOtherSchedPolicyText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.capacity) {
					return createCapacityText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.packetTime) {
					return createPacketTimeText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.blockingTime) {
					return createBlockingTimeText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.priorityCeiling) {
					return createPriorityCeilingText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.preemptionLevel) {
					return createPreemptionLevelText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.execTime) {
					return createExecTimeText(widgetFactory, parent);
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
		Section timingPropertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		timingPropertiesSection.setText(GrmMessages.TimingPropertiesEditionPart_TimingPropertiesGroupLabel);
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

	
	protected Composite createDurationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.duration, GrmMessages.TimingPropertiesEditionPart_DurationLabel);
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
							TimingPropertiesEditionPartForm.this,
							GrmViewsRepository.Timing.TimingProperties.duration,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.duration,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, duration.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.duration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
				}
			}
		});
		EditingUtils.setID(duration, GrmViewsRepository.Timing.TimingProperties.duration);
		EditingUtils.setEEFtype(duration, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.duration, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDurationText

		// End of user code
		return parent;
	}

	
	protected Composite createPolicyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.policy, GrmMessages.TimingPropertiesEditionPart_PolicyLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.policy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPolicy()));
			}

		});
		policy.setID(GrmViewsRepository.Timing.TimingProperties.policy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.policy, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPolicyEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOtherSchedPolicyText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy, GrmMessages.TimingPropertiesEditionPart_OtherSchedPolicyLabel);
		otherSchedPolicy = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		otherSchedPolicy.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData otherSchedPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		otherSchedPolicy.setLayoutData(otherSchedPolicyData);
		otherSchedPolicy.addFocusListener(new FocusAdapter() {
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
							GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, otherSchedPolicy.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, otherSchedPolicy.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		otherSchedPolicy.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, otherSchedPolicy.getText()));
				}
			}
		});
		EditingUtils.setID(otherSchedPolicy, GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy);
		EditingUtils.setEEFtype(otherSchedPolicy, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOtherSchedPolicyText

		// End of user code
		return parent;
	}

	
	protected Composite createCapacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.capacity, GrmMessages.TimingPropertiesEditionPart_CapacityLabel);
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
							TimingPropertiesEditionPartForm.this,
							GrmViewsRepository.Timing.TimingProperties.capacity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.capacity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, capacity.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.capacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacity.getText()));
				}
			}
		});
		EditingUtils.setID(capacity, GrmViewsRepository.Timing.TimingProperties.capacity);
		EditingUtils.setEEFtype(capacity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.capacity, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCapacityText

		// End of user code
		return parent;
	}

	
	protected Composite createPacketTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.packetTime, GrmMessages.TimingPropertiesEditionPart_PacketTimeLabel);
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
							TimingPropertiesEditionPartForm.this,
							GrmViewsRepository.Timing.TimingProperties.packetTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetTime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.packetTime,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, packetTime.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.packetTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetTime.getText()));
				}
			}
		});
		EditingUtils.setID(packetTime, GrmViewsRepository.Timing.TimingProperties.packetTime);
		EditingUtils.setEEFtype(packetTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.packetTime, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPacketTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createBlockingTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.blockingTime, GrmMessages.TimingPropertiesEditionPart_BlockingTimeLabel);
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
							TimingPropertiesEditionPartForm.this,
							GrmViewsRepository.Timing.TimingProperties.blockingTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.blockingTime,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, blockingTime.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
				}
			}
		});
		EditingUtils.setID(blockingTime, GrmViewsRepository.Timing.TimingProperties.blockingTime);
		EditingUtils.setEEFtype(blockingTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.blockingTime, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBlockingTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createPriorityCeilingText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.priorityCeiling, GrmMessages.TimingPropertiesEditionPart_PriorityCeilingLabel);
		priorityCeiling = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		priorityCeiling.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData priorityCeilingData = new GridData(GridData.FILL_HORIZONTAL);
		priorityCeiling.setLayoutData(priorityCeilingData);
		priorityCeiling.addFocusListener(new FocusAdapter() {
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
							GrmViewsRepository.Timing.TimingProperties.priorityCeiling,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priorityCeiling.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.priorityCeiling,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, priorityCeiling.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		priorityCeiling.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.priorityCeiling, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priorityCeiling.getText()));
				}
			}
		});
		EditingUtils.setID(priorityCeiling, GrmViewsRepository.Timing.TimingProperties.priorityCeiling);
		EditingUtils.setEEFtype(priorityCeiling, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.priorityCeiling, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPriorityCeilingText

		// End of user code
		return parent;
	}

	
	protected Composite createPreemptionLevelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.preemptionLevel, GrmMessages.TimingPropertiesEditionPart_PreemptionLevelLabel);
		preemptionLevel = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		preemptionLevel.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData preemptionLevelData = new GridData(GridData.FILL_HORIZONTAL);
		preemptionLevel.setLayoutData(preemptionLevelData);
		preemptionLevel.addFocusListener(new FocusAdapter() {
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
							GrmViewsRepository.Timing.TimingProperties.preemptionLevel,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, preemptionLevel.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.preemptionLevel,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, preemptionLevel.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		preemptionLevel.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.preemptionLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, preemptionLevel.getText()));
				}
			}
		});
		EditingUtils.setID(preemptionLevel, GrmViewsRepository.Timing.TimingProperties.preemptionLevel);
		EditingUtils.setEEFtype(preemptionLevel, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.preemptionLevel, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPreemptionLevelText

		// End of user code
		return parent;
	}

	
	protected Composite createExecTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.execTime, GrmMessages.TimingPropertiesEditionPart_ExecTimeLabel);
		execTime = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		execTime.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData execTimeData = new GridData(GridData.FILL_HORIZONTAL);
		execTime.setLayoutData(execTimeData);
		execTime.addFocusListener(new FocusAdapter() {
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
							GrmViewsRepository.Timing.TimingProperties.execTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, execTime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GrmViewsRepository.Timing.TimingProperties.execTime,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, execTime.getText()));
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		execTime.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GrmViewsRepository.Timing.TimingProperties.execTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, execTime.getText()));
				}
			}
		});
		EditingUtils.setID(execTime, GrmViewsRepository.Timing.TimingProperties.execTime);
		EditingUtils.setEEFtype(execTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.execTime, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createExecTimeText

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
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getDuration()
	 * 
	 */
	public String getDuration() {
		return duration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setDuration(String newValue)
	 * 
	 */
	public void setDuration(String newValue) {
		if (newValue != null) {
			duration.setText(newValue);
		} else {
			duration.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.duration);
		if (eefElementEditorReadOnlyState && duration.isEnabled()) {
			duration.setEnabled(false);
			duration.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !duration.isEnabled()) {
			duration.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getPolicy()
	 * 
	 */
	public Enumerator getPolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) policy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#initPolicy(Object input, Enumerator current)
	 */
	public void initPolicy(Object input, Enumerator current) {
		policy.setInput(input);
		policy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.policy);
		if (eefElementEditorReadOnlyState && policy.isEnabled()) {
			policy.setEnabled(false);
			policy.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policy.isEnabled()) {
			policy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setPolicy(Enumerator newValue)
	 * 
	 */
	public void setPolicy(Enumerator newValue) {
		policy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.policy);
		if (eefElementEditorReadOnlyState && policy.isEnabled()) {
			policy.setEnabled(false);
			policy.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policy.isEnabled()) {
			policy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getOtherSchedPolicy()
	 * 
	 */
	public String getOtherSchedPolicy() {
		return otherSchedPolicy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setOtherSchedPolicy(String newValue)
	 * 
	 */
	public void setOtherSchedPolicy(String newValue) {
		if (newValue != null) {
			otherSchedPolicy.setText(newValue);
		} else {
			otherSchedPolicy.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy);
		if (eefElementEditorReadOnlyState && otherSchedPolicy.isEnabled()) {
			otherSchedPolicy.setEnabled(false);
			otherSchedPolicy.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !otherSchedPolicy.isEnabled()) {
			otherSchedPolicy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getCapacity()
	 * 
	 */
	public String getCapacity() {
		return capacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setCapacity(String newValue)
	 * 
	 */
	public void setCapacity(String newValue) {
		if (newValue != null) {
			capacity.setText(newValue);
		} else {
			capacity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.capacity);
		if (eefElementEditorReadOnlyState && capacity.isEnabled()) {
			capacity.setEnabled(false);
			capacity.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !capacity.isEnabled()) {
			capacity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getPacketTime()
	 * 
	 */
	public String getPacketTime() {
		return packetTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setPacketTime(String newValue)
	 * 
	 */
	public void setPacketTime(String newValue) {
		if (newValue != null) {
			packetTime.setText(newValue);
		} else {
			packetTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.packetTime);
		if (eefElementEditorReadOnlyState && packetTime.isEnabled()) {
			packetTime.setEnabled(false);
			packetTime.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !packetTime.isEnabled()) {
			packetTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getBlockingTime()
	 * 
	 */
	public String getBlockingTime() {
		return blockingTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setBlockingTime(String newValue)
	 * 
	 */
	public void setBlockingTime(String newValue) {
		if (newValue != null) {
			blockingTime.setText(newValue);
		} else {
			blockingTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.blockingTime);
		if (eefElementEditorReadOnlyState && blockingTime.isEnabled()) {
			blockingTime.setEnabled(false);
			blockingTime.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !blockingTime.isEnabled()) {
			blockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getPriorityCeiling()
	 * 
	 */
	public String getPriorityCeiling() {
		return priorityCeiling.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setPriorityCeiling(String newValue)
	 * 
	 */
	public void setPriorityCeiling(String newValue) {
		if (newValue != null) {
			priorityCeiling.setText(newValue);
		} else {
			priorityCeiling.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.priorityCeiling);
		if (eefElementEditorReadOnlyState && priorityCeiling.isEnabled()) {
			priorityCeiling.setEnabled(false);
			priorityCeiling.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !priorityCeiling.isEnabled()) {
			priorityCeiling.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getPreemptionLevel()
	 * 
	 */
	public String getPreemptionLevel() {
		return preemptionLevel.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setPreemptionLevel(String newValue)
	 * 
	 */
	public void setPreemptionLevel(String newValue) {
		if (newValue != null) {
			preemptionLevel.setText(newValue);
		} else {
			preemptionLevel.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.preemptionLevel);
		if (eefElementEditorReadOnlyState && preemptionLevel.isEnabled()) {
			preemptionLevel.setEnabled(false);
			preemptionLevel.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !preemptionLevel.isEnabled()) {
			preemptionLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#getExecTime()
	 * 
	 */
	public String getExecTime() {
		return execTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.TimingPropertiesEditionPart#setExecTime(String newValue)
	 * 
	 */
	public void setExecTime(String newValue) {
		if (newValue != null) {
			execTime.setText(newValue);
		} else {
			execTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Timing.TimingProperties.execTime);
		if (eefElementEditorReadOnlyState && execTime.isEnabled()) {
			execTime.setEnabled(false);
			execTime.setToolTipText(GrmMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !execTime.isEnabled()) {
			execTime.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GrmMessages.Timing_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
