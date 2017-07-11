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
package org.polarsys.time4sys.ui.views.grm.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.providers.GrmMessages;

// End of user code

/**
 * 
 * 
 */
public class TimingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TimingPropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
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
					return createTimingPropertiesGroup(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.duration) {
					return createDurationText(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.policy) {
					return createPolicyEMFComboViewer(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy) {
					return createOtherSchedPolicyText(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.capacity) {
					return createCapacityText(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.packetTime) {
					return createPacketTimeText(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.blockingTime) {
					return createBlockingTimeText(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.priorityCeiling) {
					return createPriorityCeilingText(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.preemptionLevel) {
					return createPreemptionLevelText(parent);
				}
				if (key == GrmViewsRepository.Timing.TimingProperties.execTime) {
					return createExecTimeText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createTimingPropertiesGroup(Composite parent) {
		Group timingPropertiesGroup = new Group(parent, SWT.NONE);
		timingPropertiesGroup.setText(GrmMessages.TimingPropertiesEditionPart_TimingPropertiesGroupLabel);
		GridData timingPropertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		timingPropertiesGroupData.horizontalSpan = 3;
		timingPropertiesGroup.setLayoutData(timingPropertiesGroupData);
		GridLayout timingPropertiesGroupLayout = new GridLayout();
		timingPropertiesGroupLayout.numColumns = 3;
		timingPropertiesGroup.setLayout(timingPropertiesGroupLayout);
		return timingPropertiesGroup;
	}

	
	protected Composite createDurationText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.duration, GrmMessages.TimingPropertiesEditionPart_DurationLabel);
		duration = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData durationData = new GridData(GridData.FILL_HORIZONTAL);
		duration.setLayoutData(durationData);
		duration.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.duration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
			}

		});
		duration.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.duration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
				}
			}

		});
		EditingUtils.setID(duration, GrmViewsRepository.Timing.TimingProperties.duration);
		EditingUtils.setEEFtype(duration, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.duration, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDurationText

		// End of user code
		return parent;
	}

	
	protected Composite createPolicyEMFComboViewer(Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.policy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPolicy()));
			}

		});
		policy.setID(GrmViewsRepository.Timing.TimingProperties.policy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.policy, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPolicyEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOtherSchedPolicyText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy, GrmMessages.TimingPropertiesEditionPart_OtherSchedPolicyLabel);
		otherSchedPolicy = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData otherSchedPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		otherSchedPolicy.setLayoutData(otherSchedPolicyData);
		otherSchedPolicy.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, otherSchedPolicy.getText()));
			}

		});
		otherSchedPolicy.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, otherSchedPolicy.getText()));
				}
			}

		});
		EditingUtils.setID(otherSchedPolicy, GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy);
		EditingUtils.setEEFtype(otherSchedPolicy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.otherSchedPolicy, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOtherSchedPolicyText

		// End of user code
		return parent;
	}

	
	protected Composite createCapacityText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.capacity, GrmMessages.TimingPropertiesEditionPart_CapacityLabel);
		capacity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData capacityData = new GridData(GridData.FILL_HORIZONTAL);
		capacity.setLayoutData(capacityData);
		capacity.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.capacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacity.getText()));
			}

		});
		capacity.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.capacity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacity.getText()));
				}
			}

		});
		EditingUtils.setID(capacity, GrmViewsRepository.Timing.TimingProperties.capacity);
		EditingUtils.setEEFtype(capacity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.capacity, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCapacityText

		// End of user code
		return parent;
	}

	
	protected Composite createPacketTimeText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.packetTime, GrmMessages.TimingPropertiesEditionPart_PacketTimeLabel);
		packetTime = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData packetTimeData = new GridData(GridData.FILL_HORIZONTAL);
		packetTime.setLayoutData(packetTimeData);
		packetTime.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.packetTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetTime.getText()));
			}

		});
		packetTime.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.packetTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetTime.getText()));
				}
			}

		});
		EditingUtils.setID(packetTime, GrmViewsRepository.Timing.TimingProperties.packetTime);
		EditingUtils.setEEFtype(packetTime, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.packetTime, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPacketTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createBlockingTimeText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.blockingTime, GrmMessages.TimingPropertiesEditionPart_BlockingTimeLabel);
		blockingTime = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData blockingTimeData = new GridData(GridData.FILL_HORIZONTAL);
		blockingTime.setLayoutData(blockingTimeData);
		blockingTime.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
			}

		});
		blockingTime.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
				}
			}

		});
		EditingUtils.setID(blockingTime, GrmViewsRepository.Timing.TimingProperties.blockingTime);
		EditingUtils.setEEFtype(blockingTime, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.blockingTime, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBlockingTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createPriorityCeilingText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.priorityCeiling, GrmMessages.TimingPropertiesEditionPart_PriorityCeilingLabel);
		priorityCeiling = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData priorityCeilingData = new GridData(GridData.FILL_HORIZONTAL);
		priorityCeiling.setLayoutData(priorityCeilingData);
		priorityCeiling.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.priorityCeiling, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priorityCeiling.getText()));
			}

		});
		priorityCeiling.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.priorityCeiling, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priorityCeiling.getText()));
				}
			}

		});
		EditingUtils.setID(priorityCeiling, GrmViewsRepository.Timing.TimingProperties.priorityCeiling);
		EditingUtils.setEEFtype(priorityCeiling, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.priorityCeiling, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPriorityCeilingText

		// End of user code
		return parent;
	}

	
	protected Composite createPreemptionLevelText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.preemptionLevel, GrmMessages.TimingPropertiesEditionPart_PreemptionLevelLabel);
		preemptionLevel = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData preemptionLevelData = new GridData(GridData.FILL_HORIZONTAL);
		preemptionLevel.setLayoutData(preemptionLevelData);
		preemptionLevel.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.preemptionLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, preemptionLevel.getText()));
			}

		});
		preemptionLevel.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.preemptionLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, preemptionLevel.getText()));
				}
			}

		});
		EditingUtils.setID(preemptionLevel, GrmViewsRepository.Timing.TimingProperties.preemptionLevel);
		EditingUtils.setEEFtype(preemptionLevel, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.preemptionLevel, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPreemptionLevelText

		// End of user code
		return parent;
	}

	
	protected Composite createExecTimeText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Timing.TimingProperties.execTime, GrmMessages.TimingPropertiesEditionPart_ExecTimeLabel);
		execTime = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData execTimeData = new GridData(GridData.FILL_HORIZONTAL);
		execTime.setLayoutData(execTimeData);
		execTime.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.execTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, execTime.getText()));
			}

		});
		execTime.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GrmViewsRepository.Timing.TimingProperties.execTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, execTime.getText()));
				}
			}

		});
		EditingUtils.setID(execTime, GrmViewsRepository.Timing.TimingProperties.execTime);
		EditingUtils.setEEFtype(execTime, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Timing.TimingProperties.execTime, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
