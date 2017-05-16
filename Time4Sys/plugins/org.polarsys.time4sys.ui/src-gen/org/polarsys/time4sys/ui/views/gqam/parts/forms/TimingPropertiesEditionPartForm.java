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
package org.polarsys.time4sys.ui.views.gqam.parts.forms;

// Start of user code for imports
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

import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.parts.TimingPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.gqam.providers.GqamMessages;

// End of user code

/**
 * 
 * 
 */
public class TimingPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimingPropertiesEditionPart {

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
					return createTimingPropertiesGroup(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.minInterarrival) {
					return createMinInterarrivalText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.maxInterarrival) {
					return createMaxInterarrivalText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.period) {
					return createPeriodText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.jitter) {
					return createJitterText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.phase) {
					return createPhaseText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.bestCET) {
					return createBestCETText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.worstCET) {
					return createWorstCETText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.blockingTime) {
					return createBlockingTimeText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.endToEndTime) {
					return createEndToEndTimeText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.endToEndDeadline) {
					return createEndToEndDeadlineText(widgetFactory, parent);
				}
				if (key == GqamViewsRepository.Timing.TimingProperties.respTime) {
					return createRespTimeText(widgetFactory, parent);
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
		timingPropertiesSection.setText(GqamMessages.TimingPropertiesEditionPart_TimingPropertiesGroupLabel);
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

	
	protected Composite createMinInterarrivalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.minInterarrival, GqamMessages.TimingPropertiesEditionPart_MinInterarrivalLabel);
		minInterarrival = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minInterarrival.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minInterarrivalData = new GridData(GridData.FILL_HORIZONTAL);
		minInterarrival.setLayoutData(minInterarrivalData);
		minInterarrival.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.minInterarrival,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minInterarrival.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.minInterarrival,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, minInterarrival.getText()));
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
		minInterarrival.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.minInterarrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minInterarrival.getText()));
				}
			}
		});
		EditingUtils.setID(minInterarrival, GqamViewsRepository.Timing.TimingProperties.minInterarrival);
		EditingUtils.setEEFtype(minInterarrival, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.minInterarrival, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMinInterarrivalText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxInterarrivalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.maxInterarrival, GqamMessages.TimingPropertiesEditionPart_MaxInterarrivalLabel);
		maxInterarrival = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxInterarrival.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxInterarrivalData = new GridData(GridData.FILL_HORIZONTAL);
		maxInterarrival.setLayoutData(maxInterarrivalData);
		maxInterarrival.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.maxInterarrival,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxInterarrival.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.maxInterarrival,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxInterarrival.getText()));
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
		maxInterarrival.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.maxInterarrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxInterarrival.getText()));
				}
			}
		});
		EditingUtils.setID(maxInterarrival, GqamViewsRepository.Timing.TimingProperties.maxInterarrival);
		EditingUtils.setEEFtype(maxInterarrival, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.maxInterarrival, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxInterarrivalText

		// End of user code
		return parent;
	}

	
	protected Composite createPeriodText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.period, GqamMessages.TimingPropertiesEditionPart_PeriodLabel);
		period = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		period.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData periodData = new GridData(GridData.FILL_HORIZONTAL);
		period.setLayoutData(periodData);
		period.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.period,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.period,
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		period.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
				}
			}
		});
		EditingUtils.setID(period, GqamViewsRepository.Timing.TimingProperties.period);
		EditingUtils.setEEFtype(period, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.period, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPeriodText

		// End of user code
		return parent;
	}

	
	protected Composite createJitterText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.jitter, GqamMessages.TimingPropertiesEditionPart_JitterLabel);
		jitter = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		jitter.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData jitterData = new GridData(GridData.FILL_HORIZONTAL);
		jitter.setLayoutData(jitterData);
		jitter.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.jitter,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jitter.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.jitter,
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
									TimingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		jitter.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jitter.getText()));
				}
			}
		});
		EditingUtils.setID(jitter, GqamViewsRepository.Timing.TimingProperties.jitter);
		EditingUtils.setEEFtype(jitter, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.jitter, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createJitterText

		// End of user code
		return parent;
	}

	
	protected Composite createPhaseText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.phase, GqamMessages.TimingPropertiesEditionPart_PhaseLabel);
		phase = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		phase.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData phaseData = new GridData(GridData.FILL_HORIZONTAL);
		phase.setLayoutData(phaseData);
		phase.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.phase,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, phase.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.phase,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, phase.getText()));
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
		phase.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.phase, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, phase.getText()));
				}
			}
		});
		EditingUtils.setID(phase, GqamViewsRepository.Timing.TimingProperties.phase);
		EditingUtils.setEEFtype(phase, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.phase, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPhaseText

		// End of user code
		return parent;
	}

	
	protected Composite createBestCETText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.bestCET, GqamMessages.TimingPropertiesEditionPart_BestCETLabel);
		bestCET = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		bestCET.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData bestCETData = new GridData(GridData.FILL_HORIZONTAL);
		bestCET.setLayoutData(bestCETData);
		bestCET.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.bestCET,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bestCET.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.bestCET,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, bestCET.getText()));
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
		bestCET.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.bestCET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bestCET.getText()));
				}
			}
		});
		EditingUtils.setID(bestCET, GqamViewsRepository.Timing.TimingProperties.bestCET);
		EditingUtils.setEEFtype(bestCET, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.bestCET, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBestCETText

		// End of user code
		return parent;
	}

	
	protected Composite createWorstCETText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.worstCET, GqamMessages.TimingPropertiesEditionPart_WorstCETLabel);
		worstCET = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		worstCET.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData worstCETData = new GridData(GridData.FILL_HORIZONTAL);
		worstCET.setLayoutData(worstCETData);
		worstCET.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.worstCET,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, worstCET.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.worstCET,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, worstCET.getText()));
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
		worstCET.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.worstCET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, worstCET.getText()));
				}
			}
		});
		EditingUtils.setID(worstCET, GqamViewsRepository.Timing.TimingProperties.worstCET);
		EditingUtils.setEEFtype(worstCET, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.worstCET, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWorstCETText

		// End of user code
		return parent;
	}

	
	protected Composite createBlockingTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.blockingTime, GqamMessages.TimingPropertiesEditionPart_BlockingTimeLabel);
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
							GqamViewsRepository.Timing.TimingProperties.blockingTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.blockingTime,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
				}
			}
		});
		EditingUtils.setID(blockingTime, GqamViewsRepository.Timing.TimingProperties.blockingTime);
		EditingUtils.setEEFtype(blockingTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.blockingTime, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBlockingTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createEndToEndTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.endToEndTime, GqamMessages.TimingPropertiesEditionPart_EndToEndTimeLabel);
		endToEndTime = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		endToEndTime.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData endToEndTimeData = new GridData(GridData.FILL_HORIZONTAL);
		endToEndTime.setLayoutData(endToEndTimeData);
		endToEndTime.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.endToEndTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndTime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.endToEndTime,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, endToEndTime.getText()));
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
		endToEndTime.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.endToEndTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndTime.getText()));
				}
			}
		});
		EditingUtils.setID(endToEndTime, GqamViewsRepository.Timing.TimingProperties.endToEndTime);
		EditingUtils.setEEFtype(endToEndTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.endToEndTime, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndToEndTimeText

		// End of user code
		return parent;
	}

	
	protected Composite createEndToEndDeadlineText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.endToEndDeadline, GqamMessages.TimingPropertiesEditionPart_EndToEndDeadlineLabel);
		endToEndDeadline = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		endToEndDeadline.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData endToEndDeadlineData = new GridData(GridData.FILL_HORIZONTAL);
		endToEndDeadline.setLayoutData(endToEndDeadlineData);
		endToEndDeadline.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.endToEndDeadline,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndDeadline.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.endToEndDeadline,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, endToEndDeadline.getText()));
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
		endToEndDeadline.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.endToEndDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endToEndDeadline.getText()));
				}
			}
		});
		EditingUtils.setID(endToEndDeadline, GqamViewsRepository.Timing.TimingProperties.endToEndDeadline);
		EditingUtils.setEEFtype(endToEndDeadline, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.endToEndDeadline, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndToEndDeadlineText

		// End of user code
		return parent;
	}

	
	protected Composite createRespTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GqamViewsRepository.Timing.TimingProperties.respTime, GqamMessages.TimingPropertiesEditionPart_RespTimeLabel);
		respTime = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		respTime.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData respTimeData = new GridData(GridData.FILL_HORIZONTAL);
		respTime.setLayoutData(respTimeData);
		respTime.addFocusListener(new FocusAdapter() {
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
							GqamViewsRepository.Timing.TimingProperties.respTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, respTime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimingPropertiesEditionPartForm.this,
									GqamViewsRepository.Timing.TimingProperties.respTime,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, respTime.getText()));
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
		respTime.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimingPropertiesEditionPartForm.this, GqamViewsRepository.Timing.TimingProperties.respTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, respTime.getText()));
				}
			}
		});
		EditingUtils.setID(respTime, GqamViewsRepository.Timing.TimingProperties.respTime);
		EditingUtils.setEEFtype(respTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GqamViewsRepository.Timing.TimingProperties.respTime, GqamViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
