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
package org.polarsys.time4sys.ui.views.gqam.parts.impl;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.parts.TimingPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.providers.GqamMessages;

// End of user code

/**
 * 
 * 
 */
public class TimingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TimingPropertiesEditionPart {

	protected Text minInterarrival;
	protected Text maxInterarrival;
	protected Text period;
	protected Text jitter;
	protected Text phase;
	protected Text bestCET;
	protected Text worstCET;
	protected Text blockingTime;
	protected Text endToEndTime;
	protected Text endToEndDeadline;
	protected Text respTime;



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
		CompositionStep timingPropertiesStep = timingStep.addStep(GqamViewsRepository.Timing.TimingProperties.class);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.minInterarrival);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.maxInterarrival);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.period);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.jitter);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.phase);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.bestCET);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.worstCET);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.blockingTime);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.endToEndTime);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.endToEndDeadline);
		timingPropertiesStep.addStep(GqamViewsRepository.Timing.TimingProperties.respTime);
		
		
		composer = new PartComposer(timingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GqamViewsRepository.Timing.TimingProperties.class) {
					return createTimingPropertiesGroup(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.minInterarrival) {
					return createMinInterarrivalText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.maxInterarrival) {
					return createMaxInterarrivalText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.period) {
					return createPeriodText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.jitter) {
					return createJitterText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.phase) {
					return createPhaseText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.bestCET) {
					return createBestCETText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.worstCET) {
					return createWorstCETText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.blockingTime) {
					return createBlockingTimeText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.endToEndTime) {
					return createEndToEndTimeText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.endToEndDeadline) {
					return createEndToEndDeadlineText(parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.respTime) {
					return createRespTimeText(parent);
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
		timingPropertiesGroup.setText(GqamMessages.TimingPropertiesEditionPart_TimingPropertiesGroupLabel);
		GridData timingPropertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		timingPropertiesGroupData.horizontalSpan = 3;
		timingPropertiesGroup.setLayoutData(timingPropertiesGroupData);
		GridLayout timingPropertiesGroupLayout = new GridLayout();
		timingPropertiesGroupLayout.numColumns = 3;
		timingPropertiesGroup.setLayout(timingPropertiesGroupLayout);
		return timingPropertiesGroup;
	}

	
	protected Composite createMinInterarrivalText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.minInterarrival, GqamMessages.TimingPropertiesEditionPart_MinInterarrivalLabel);
		minInterarrival = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData minInterarrivalData = new GridData(GridData.FILL_HORIZONTAL);
		minInterarrival.setLayoutData(minInterarrivalData);
		minInterarrival.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.minInterarrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minInterarrival.getText()));
			}

		});
		minInterarrival.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.minInterarrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minInterarrival.getText()));
				}
			}

		});
		EditingUtils.setID(minInterarrival, GqamViewsRepository.Timing.TimingProperties.minInterarrival);
		EditingUtils.setEEFtype(minInterarrival, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.minInterarrival, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinInterarrivalText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxInterarrivalText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.maxInterarrival, GqamMessages.TimingPropertiesEditionPart_MaxInterarrivalLabel);
		maxInterarrival = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData maxInterarrivalData = new GridData(GridData.FILL_HORIZONTAL);
		maxInterarrival.setLayoutData(maxInterarrivalData);
		maxInterarrival.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.maxInterarrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxInterarrival.getText()));
			}

		});
		maxInterarrival.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.maxInterarrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxInterarrival.getText()));
				}
			}

		});
		EditingUtils.setID(maxInterarrival, GqamViewsRepository.Timing.TimingProperties.maxInterarrival);
		EditingUtils.setEEFtype(maxInterarrival, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.maxInterarrival, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxInterarrivalText

		// End of user code
		return parent;
	}

	
	protected Composite createPeriodText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.period, GqamMessages.TimingPropertiesEditionPart_PeriodLabel);
		period = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData periodData = new GridData(GridData.FILL_HORIZONTAL);
		period.setLayoutData(periodData);
		period.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
			}

		});
		period.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
				}
			}

		});
		EditingUtils.setID(period, GqamViewsRepository.Timing.TimingProperties.period);
		EditingUtils.setEEFtype(period, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.period, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPeriodText

		// End of user code
		return parent;
	}

	
	protected Composite createJitterText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.jitter, GqamMessages.TimingPropertiesEditionPart_JitterLabel);
		jitter = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData jitterData = new GridData(GridData.FILL_HORIZONTAL);
		jitter.setLayoutData(jitterData);
		jitter.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jitter.getText()));
			}

		});
		jitter.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jitter.getText()));
				}
			}

		});
		EditingUtils.setID(jitter, GqamViewsRepository.Timing.TimingProperties.jitter);
		EditingUtils.setEEFtype(jitter, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.jitter, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createJitterText

		// End of user code
		return parent;
	}

	
	protected Composite createPhaseText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.phase, GqamMessages.TimingPropertiesEditionPart_PhaseLabel);
		phase = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData phaseData = new GridData(GridData.FILL_HORIZONTAL);
		phase.setLayoutData(phaseData);
		phase.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.phase, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, phase.getText()));
			}

		});
		phase.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.phase, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, phase.getText()));
				}
			}

		});
		EditingUtils.setID(phase, GqamViewsRepository.Timing.TimingProperties.phase);
		EditingUtils.setEEFtype(phase, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.phase, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPhaseText

		// End of user code
		return parent;
	}

	
	protected Composite createBestCETText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.bestCET, GqamMessages.TimingPropertiesEditionPart_BestCETLabel);
		bestCET = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData bestCETData = new GridData(GridData.FILL_HORIZONTAL);
		bestCET.setLayoutData(bestCETData);
		bestCET.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.bestCET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bestCET.getText()));
			}

		});
		bestCET.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.bestCET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bestCET.getText()));
				}
			}

		});
		EditingUtils.setID(bestCET, GqamViewsRepository.Timing.TimingProperties.bestCET);
		EditingUtils.setEEFtype(bestCET, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.bestCET, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBestCETText

		// End of user code
		return parent;
	}

	
	protected Composite createWorstCETText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.worstCET, GqamMessages.TimingPropertiesEditionPart_WorstCETLabel);
		worstCET = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData worstCETData = new GridData(GridData.FILL_HORIZONTAL);
		worstCET.setLayoutData(worstCETData);
		worstCET.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.worstCET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, worstCET.getText()));
			}

		});
		worstCET.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.worstCET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, worstCET.getText()));
				}
			}

		});
		EditingUtils.setID(worstCET, GqamViewsRepository.Timing.TimingProperties.worstCET);
		EditingUtils.setEEFtype(worstCET, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.worstCET, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWorstCETText

		// End of user code
		return parent;
	}

	
	protected Composite createBlockingTimeText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.blockingTime, GqamMessages.TimingPropertiesEditionPart_BlockingTimeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
				}
			}

		});
		EditingUtils.setID(blockingTime, GqamViewsRepository.Timing.TimingProperties.blockingTime);
		EditingUtils.setEEFtype(blockingTime, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.blockingTime, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBlockingTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createEndToEndTimeText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.endToEndTime, GqamMessages.TimingPropertiesEditionPart_EndToEndTimeLabel);
		endToEndTime = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData endToEndTimeData = new GridData(GridData.FILL_HORIZONTAL);
		endToEndTime.setLayoutData(endToEndTimeData);
		endToEndTime.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.endToEndTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndTime.getText()));
			}

		});
		endToEndTime.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.endToEndTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndTime.getText()));
				}
			}

		});
		EditingUtils.setID(endToEndTime, GqamViewsRepository.Timing.TimingProperties.endToEndTime);
		EditingUtils.setEEFtype(endToEndTime, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.endToEndTime, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndToEndTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createEndToEndDeadlineText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.endToEndDeadline, GqamMessages.TimingPropertiesEditionPart_EndToEndDeadlineLabel);
		endToEndDeadline = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData endToEndDeadlineData = new GridData(GridData.FILL_HORIZONTAL);
		endToEndDeadline.setLayoutData(endToEndDeadlineData);
		endToEndDeadline.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.endToEndDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndDeadline.getText()));
			}

		});
		endToEndDeadline.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.endToEndDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndDeadline.getText()));
				}
			}

		});
		EditingUtils.setID(endToEndDeadline, GqamViewsRepository.Timing.TimingProperties.endToEndDeadline);
		EditingUtils.setEEFtype(endToEndDeadline, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.endToEndDeadline, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndToEndDeadlineText

		// End of user code
		return parent;
	}

	
	protected Composite createRespTimeText(Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.respTime, GqamMessages.TimingPropertiesEditionPart_RespTimeLabel);
		respTime = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData respTimeData = new GridData(GridData.FILL_HORIZONTAL);
		respTime.setLayoutData(respTimeData);
		respTime.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.respTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, respTime.getText()));
			}

		});
		respTime.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartImpl.this, GqamViewsRepository.Timing.TimingProperties.respTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, respTime.getText()));
				}
			}

		});
		EditingUtils.setID(respTime, GqamViewsRepository.Timing.TimingProperties.respTime);
		EditingUtils.setEEFtype(respTime, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.respTime, GqamViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRespTimeText

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
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getMinInterarrival()
	 * 
	 */
	public String getMinInterarrival() {
		return minInterarrival.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setMinInterarrival(String newValue)
	 * 
	 */
	public void setMinInterarrival(String newValue) {
		if (newValue != null) {
			minInterarrival.setText(newValue);
		} else {
			minInterarrival.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.minInterarrival);
		if (eefElementEditorReadOnlyState && minInterarrival.isEnabled()) {
			minInterarrival.setEnabled(false);
			minInterarrival.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !minInterarrival.isEnabled()) {
			minInterarrival.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getMaxInterarrival()
	 * 
	 */
	public String getMaxInterarrival() {
		return maxInterarrival.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setMaxInterarrival(String newValue)
	 * 
	 */
	public void setMaxInterarrival(String newValue) {
		if (newValue != null) {
			maxInterarrival.setText(newValue);
		} else {
			maxInterarrival.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.maxInterarrival);
		if (eefElementEditorReadOnlyState && maxInterarrival.isEnabled()) {
			maxInterarrival.setEnabled(false);
			maxInterarrival.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxInterarrival.isEnabled()) {
			maxInterarrival.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getPeriod()
	 * 
	 */
	public String getPeriod() {
		return period.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setPeriod(String newValue)
	 * 
	 */
	public void setPeriod(String newValue) {
		if (newValue != null) {
			period.setText(newValue);
		} else {
			period.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.period);
		if (eefElementEditorReadOnlyState && period.isEnabled()) {
			period.setEnabled(false);
			period.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !period.isEnabled()) {
			period.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getJitter()
	 * 
	 */
	public String getJitter() {
		return jitter.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setJitter(String newValue)
	 * 
	 */
	public void setJitter(String newValue) {
		if (newValue != null) {
			jitter.setText(newValue);
		} else {
			jitter.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.jitter);
		if (eefElementEditorReadOnlyState && jitter.isEnabled()) {
			jitter.setEnabled(false);
			jitter.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !jitter.isEnabled()) {
			jitter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getPhase()
	 * 
	 */
	public String getPhase() {
		return phase.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setPhase(String newValue)
	 * 
	 */
	public void setPhase(String newValue) {
		if (newValue != null) {
			phase.setText(newValue);
		} else {
			phase.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.phase);
		if (eefElementEditorReadOnlyState && phase.isEnabled()) {
			phase.setEnabled(false);
			phase.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !phase.isEnabled()) {
			phase.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getBestCET()
	 * 
	 */
	public String getBestCET() {
		return bestCET.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setBestCET(String newValue)
	 * 
	 */
	public void setBestCET(String newValue) {
		if (newValue != null) {
			bestCET.setText(newValue);
		} else {
			bestCET.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.bestCET);
		if (eefElementEditorReadOnlyState && bestCET.isEnabled()) {
			bestCET.setEnabled(false);
			bestCET.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !bestCET.isEnabled()) {
			bestCET.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getWorstCET()
	 * 
	 */
	public String getWorstCET() {
		return worstCET.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setWorstCET(String newValue)
	 * 
	 */
	public void setWorstCET(String newValue) {
		if (newValue != null) {
			worstCET.setText(newValue);
		} else {
			worstCET.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.worstCET);
		if (eefElementEditorReadOnlyState && worstCET.isEnabled()) {
			worstCET.setEnabled(false);
			worstCET.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !worstCET.isEnabled()) {
			worstCET.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getBlockingTime()
	 * 
	 */
	public String getBlockingTime() {
		return blockingTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setBlockingTime(String newValue)
	 * 
	 */
	public void setBlockingTime(String newValue) {
		if (newValue != null) {
			blockingTime.setText(newValue);
		} else {
			blockingTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.blockingTime);
		if (eefElementEditorReadOnlyState && blockingTime.isEnabled()) {
			blockingTime.setEnabled(false);
			blockingTime.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !blockingTime.isEnabled()) {
			blockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getEndToEndTime()
	 * 
	 */
	public String getEndToEndTime() {
		return endToEndTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setEndToEndTime(String newValue)
	 * 
	 */
	public void setEndToEndTime(String newValue) {
		if (newValue != null) {
			endToEndTime.setText(newValue);
		} else {
			endToEndTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.endToEndTime);
		if (eefElementEditorReadOnlyState && endToEndTime.isEnabled()) {
			endToEndTime.setEnabled(false);
			endToEndTime.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endToEndTime.isEnabled()) {
			endToEndTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getEndToEndDeadline()
	 * 
	 */
	public String getEndToEndDeadline() {
		return endToEndDeadline.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setEndToEndDeadline(String newValue)
	 * 
	 */
	public void setEndToEndDeadline(String newValue) {
		if (newValue != null) {
			endToEndDeadline.setText(newValue);
		} else {
			endToEndDeadline.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.endToEndDeadline);
		if (eefElementEditorReadOnlyState && endToEndDeadline.isEnabled()) {
			endToEndDeadline.setEnabled(false);
			endToEndDeadline.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endToEndDeadline.isEnabled()) {
			endToEndDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#getRespTime()
	 * 
	 */
	public String getRespTime() {
		return respTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.TimingPropertiesEditionPart#setRespTime(String newValue)
	 * 
	 */
	public void setRespTime(String newValue) {
		if (newValue != null) {
			respTime.setText(newValue);
		} else {
			respTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.Timing.TimingProperties.respTime);
		if (eefElementEditorReadOnlyState && respTime.isEnabled()) {
			respTime.setEnabled(false);
			respTime.setToolTipText(GqamMessages.Timing_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !respTime.isEnabled()) {
			respTime.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GqamMessages.Timing_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
