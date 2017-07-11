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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.providers.GrmMessages;

// End of user code

/**
 * 
 * 
 */
public class OtherPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OtherPropertiesEditionPart {

	protected Text allocatedmemory;
	protected Text usedMemory;
	protected Text powerPeak;
	protected Text energy;
	protected ReferencesTable pServices;
	protected List<ViewerFilter> pServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> pServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rServices;
	protected List<ViewerFilter> rServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable pInterface;
	protected List<ViewerFilter> pInterfaceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> pInterfaceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rInterface;
	protected List<ViewerFilter> rInterfaceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rInterfaceFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public OtherPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OtherPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence otherStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep otherPropertiesStep = otherStep.addStep(GrmViewsRepository.Other.OtherProperties.class);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.allocatedmemory);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.usedMemory);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.powerPeak);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.energy);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.pServices);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.rServices);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.pInterface);
		otherPropertiesStep.addStep(GrmViewsRepository.Other.OtherProperties.rInterface);
		
		
		composer = new PartComposer(otherStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GrmViewsRepository.Other.OtherProperties.class) {
					return createOtherPropertiesGroup(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.allocatedmemory) {
					return createAllocatedmemoryText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.usedMemory) {
					return createUsedMemoryText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.powerPeak) {
					return createPowerPeakText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.energy) {
					return createEnergyText(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.pServices) {
					return createPServicesTableComposition(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.rServices) {
					return createRServicesReferencesTable(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.pInterface) {
					return createPInterfaceReferencesTable(widgetFactory, parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.rInterface) {
					return createRInterfaceReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createOtherPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section otherPropertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		otherPropertiesSection.setText(GrmMessages.OtherPropertiesEditionPart_OtherPropertiesGroupLabel);
		GridData otherPropertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		otherPropertiesSectionData.horizontalSpan = 3;
		otherPropertiesSection.setLayoutData(otherPropertiesSectionData);
		Composite otherPropertiesGroup = widgetFactory.createComposite(otherPropertiesSection);
		GridLayout otherPropertiesGroupLayout = new GridLayout();
		otherPropertiesGroupLayout.numColumns = 3;
		otherPropertiesGroup.setLayout(otherPropertiesGroupLayout);
		otherPropertiesSection.setClient(otherPropertiesGroup);
		return otherPropertiesGroup;
	}

	
	protected Composite createAllocatedmemoryText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.allocatedmemory, GrmMessages.OtherPropertiesEditionPart_AllocatedmemoryLabel);
		allocatedmemory = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		allocatedmemory.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData allocatedmemoryData = new GridData(GridData.FILL_HORIZONTAL);
		allocatedmemory.setLayoutData(allocatedmemoryData);
		allocatedmemory.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this,
							GrmViewsRepository.Other.OtherProperties.allocatedmemory,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, allocatedmemory.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									GrmViewsRepository.Other.OtherProperties.allocatedmemory,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, allocatedmemory.getText()));
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
									OtherPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		allocatedmemory.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.allocatedmemory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, allocatedmemory.getText()));
				}
			}
		});
		EditingUtils.setID(allocatedmemory, GrmViewsRepository.Other.OtherProperties.allocatedmemory);
		EditingUtils.setEEFtype(allocatedmemory, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.allocatedmemory, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAllocatedmemoryText

		// End of user code
		return parent;
	}

	
	protected Composite createUsedMemoryText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.usedMemory, GrmMessages.OtherPropertiesEditionPart_UsedMemoryLabel);
		usedMemory = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		usedMemory.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData usedMemoryData = new GridData(GridData.FILL_HORIZONTAL);
		usedMemory.setLayoutData(usedMemoryData);
		usedMemory.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this,
							GrmViewsRepository.Other.OtherProperties.usedMemory,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, usedMemory.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									GrmViewsRepository.Other.OtherProperties.usedMemory,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, usedMemory.getText()));
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
									OtherPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		usedMemory.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.usedMemory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, usedMemory.getText()));
				}
			}
		});
		EditingUtils.setID(usedMemory, GrmViewsRepository.Other.OtherProperties.usedMemory);
		EditingUtils.setEEFtype(usedMemory, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.usedMemory, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createUsedMemoryText

		// End of user code
		return parent;
	}

	
	protected Composite createPowerPeakText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.powerPeak, GrmMessages.OtherPropertiesEditionPart_PowerPeakLabel);
		powerPeak = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		powerPeak.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData powerPeakData = new GridData(GridData.FILL_HORIZONTAL);
		powerPeak.setLayoutData(powerPeakData);
		powerPeak.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this,
							GrmViewsRepository.Other.OtherProperties.powerPeak,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, powerPeak.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									GrmViewsRepository.Other.OtherProperties.powerPeak,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, powerPeak.getText()));
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
									OtherPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		powerPeak.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.powerPeak, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, powerPeak.getText()));
				}
			}
		});
		EditingUtils.setID(powerPeak, GrmViewsRepository.Other.OtherProperties.powerPeak);
		EditingUtils.setEEFtype(powerPeak, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.powerPeak, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPowerPeakText

		// End of user code
		return parent;
	}

	
	protected Composite createEnergyText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.energy, GrmMessages.OtherPropertiesEditionPart_EnergyLabel);
		energy = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		energy.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData energyData = new GridData(GridData.FILL_HORIZONTAL);
		energy.setLayoutData(energyData);
		energy.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this,
							GrmViewsRepository.Other.OtherProperties.energy,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, energy.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									GrmViewsRepository.Other.OtherProperties.energy,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, energy.getText()));
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
									OtherPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		energy.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.energy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, energy.getText()));
				}
			}
		});
		EditingUtils.setID(energy, GrmViewsRepository.Other.OtherProperties.energy);
		EditingUtils.setEEFtype(energy, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.energy, GrmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEnergyText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPServicesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.pServices = new ReferencesTable(getDescription(GrmViewsRepository.Other.OtherProperties.pServices, GrmMessages.OtherPropertiesEditionPart_PServicesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				pServices.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				pServices.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				pServices.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				pServices.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.pServicesFilters) {
			this.pServices.addFilter(filter);
		}
		this.pServices.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.pServices, GrmViewsRepository.FORM_KIND));
		this.pServices.createControls(parent, widgetFactory);
		this.pServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData pServicesData = new GridData(GridData.FILL_HORIZONTAL);
		pServicesData.horizontalSpan = 3;
		this.pServices.setLayoutData(pServicesData);
		this.pServices.setLowerBound(0);
		this.pServices.setUpperBound(-1);
		pServices.setID(GrmViewsRepository.Other.OtherProperties.pServices);
		pServices.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPServicesTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.rServices = new ReferencesTable(getDescription(GrmViewsRepository.Other.OtherProperties.rServices, GrmMessages.OtherPropertiesEditionPart_RServicesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addRServices(); }
			public void handleEdit(EObject element) { editRServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.rServices.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.rServices, GrmViewsRepository.FORM_KIND));
		this.rServices.createControls(parent, widgetFactory);
		this.rServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rServicesData = new GridData(GridData.FILL_HORIZONTAL);
		rServicesData.horizontalSpan = 3;
		this.rServices.setLayoutData(rServicesData);
		this.rServices.disableMove();
		rServices.setID(GrmViewsRepository.Other.OtherProperties.rServices);
		rServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createRServicesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addRServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(rServices.getInput(), rServicesFilters, rServicesBusinessFilters,
		"rServices", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				rServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void editRServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				rServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createPInterfaceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.pInterface = new ReferencesTable(getDescription(GrmViewsRepository.Other.OtherProperties.pInterface, GrmMessages.OtherPropertiesEditionPart_PInterfaceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addPInterface(); }
			public void handleEdit(EObject element) { editPInterface(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePInterface(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPInterface(element); }
			public void navigateTo(EObject element) { }
		});
		this.pInterface.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.pInterface, GrmViewsRepository.FORM_KIND));
		this.pInterface.createControls(parent, widgetFactory);
		this.pInterface.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData pInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		pInterfaceData.horizontalSpan = 3;
		this.pInterface.setLayoutData(pInterfaceData);
		this.pInterface.disableMove();
		pInterface.setID(GrmViewsRepository.Other.OtherProperties.pInterface);
		pInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createPInterfaceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addPInterface() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(pInterface.getInput(), pInterfaceFilters, pInterfaceBusinessFilters,
		"pInterface", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pInterface,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				pInterface.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePInterface(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		pInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.pInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		pInterface.refresh();
	}

	/**
	 * 
	 */
	protected void editPInterface(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				pInterface.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createRInterfaceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.rInterface = new ReferencesTable(getDescription(GrmViewsRepository.Other.OtherProperties.rInterface, GrmMessages.OtherPropertiesEditionPart_RInterfaceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addRInterface(); }
			public void handleEdit(EObject element) { editRInterface(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRInterface(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRInterface(element); }
			public void navigateTo(EObject element) { }
		});
		this.rInterface.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.rInterface, GrmViewsRepository.FORM_KIND));
		this.rInterface.createControls(parent, widgetFactory);
		this.rInterface.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		rInterfaceData.horizontalSpan = 3;
		this.rInterface.setLayoutData(rInterfaceData);
		this.rInterface.disableMove();
		rInterface.setID(GrmViewsRepository.Other.OtherProperties.rInterface);
		rInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createRInterfaceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addRInterface() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(rInterface.getInput(), rInterfaceFilters, rInterfaceBusinessFilters,
		"rInterface", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rInterface,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				rInterface.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRInterface(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		rInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, GrmViewsRepository.Other.OtherProperties.rInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		rInterface.refresh();
	}

	/**
	 * 
	 */
	protected void editRInterface(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				rInterface.refresh();
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
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#getAllocatedmemory()
	 * 
	 */
	public String getAllocatedmemory() {
		return allocatedmemory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#setAllocatedmemory(String newValue)
	 * 
	 */
	public void setAllocatedmemory(String newValue) {
		if (newValue != null) {
			allocatedmemory.setText(newValue);
		} else {
			allocatedmemory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.allocatedmemory);
		if (eefElementEditorReadOnlyState && allocatedmemory.isEnabled()) {
			allocatedmemory.setEnabled(false);
			allocatedmemory.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !allocatedmemory.isEnabled()) {
			allocatedmemory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#getUsedMemory()
	 * 
	 */
	public String getUsedMemory() {
		return usedMemory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#setUsedMemory(String newValue)
	 * 
	 */
	public void setUsedMemory(String newValue) {
		if (newValue != null) {
			usedMemory.setText(newValue);
		} else {
			usedMemory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.usedMemory);
		if (eefElementEditorReadOnlyState && usedMemory.isEnabled()) {
			usedMemory.setEnabled(false);
			usedMemory.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedMemory.isEnabled()) {
			usedMemory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#getPowerPeak()
	 * 
	 */
	public String getPowerPeak() {
		return powerPeak.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#setPowerPeak(String newValue)
	 * 
	 */
	public void setPowerPeak(String newValue) {
		if (newValue != null) {
			powerPeak.setText(newValue);
		} else {
			powerPeak.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.powerPeak);
		if (eefElementEditorReadOnlyState && powerPeak.isEnabled()) {
			powerPeak.setEnabled(false);
			powerPeak.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !powerPeak.isEnabled()) {
			powerPeak.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#getEnergy()
	 * 
	 */
	public String getEnergy() {
		return energy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#setEnergy(String newValue)
	 * 
	 */
	public void setEnergy(String newValue) {
		if (newValue != null) {
			energy.setText(newValue);
		} else {
			energy.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.energy);
		if (eefElementEditorReadOnlyState && energy.isEnabled()) {
			energy.setEnabled(false);
			energy.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !energy.isEnabled()) {
			energy.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#initPServices(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		pServices.setContentProvider(contentProvider);
		pServices.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.pServices);
		if (eefElementEditorReadOnlyState && pServices.isEnabled()) {
			pServices.setEnabled(false);
			pServices.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pServices.isEnabled()) {
			pServices.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#updatePServices()
	 * 
	 */
	public void updatePServices() {
	pServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addFilterPServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPServices(ViewerFilter filter) {
		pServicesFilters.add(filter);
		if (this.pServices != null) {
			this.pServices.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addBusinessFilterPServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPServices(ViewerFilter filter) {
		pServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#isContainedInPServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPServicesTable(EObject element) {
		return ((ReferencesTableSettings)pServices.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#initRServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rServices.setContentProvider(contentProvider);
		rServices.setInput(settings);
		rServicesBusinessFilters.clear();
		rServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.rServices);
		if (eefElementEditorReadOnlyState && rServices.getTable().isEnabled()) {
			rServices.setEnabled(false);
			rServices.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rServices.getTable().isEnabled()) {
			rServices.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#updateRServices()
	 * 
	 */
	public void updateRServices() {
	rServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addFilterRServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRServices(ViewerFilter filter) {
		rServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addBusinessFilterRServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRServices(ViewerFilter filter) {
		rServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#isContainedInRServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInRServicesTable(EObject element) {
		return ((ReferencesTableSettings)rServices.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#initPInterface(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPInterface(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		pInterface.setContentProvider(contentProvider);
		pInterface.setInput(settings);
		pInterfaceBusinessFilters.clear();
		pInterfaceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.pInterface);
		if (eefElementEditorReadOnlyState && pInterface.getTable().isEnabled()) {
			pInterface.setEnabled(false);
			pInterface.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pInterface.getTable().isEnabled()) {
			pInterface.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#updatePInterface()
	 * 
	 */
	public void updatePInterface() {
	pInterface.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addFilterPInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPInterface(ViewerFilter filter) {
		pInterfaceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addBusinessFilterPInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPInterface(ViewerFilter filter) {
		pInterfaceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#isContainedInPInterfaceTable(EObject element)
	 * 
	 */
	public boolean isContainedInPInterfaceTable(EObject element) {
		return ((ReferencesTableSettings)pInterface.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#initRInterface(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRInterface(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rInterface.setContentProvider(contentProvider);
		rInterface.setInput(settings);
		rInterfaceBusinessFilters.clear();
		rInterfaceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.Other.OtherProperties.rInterface);
		if (eefElementEditorReadOnlyState && rInterface.getTable().isEnabled()) {
			rInterface.setEnabled(false);
			rInterface.setToolTipText(GrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rInterface.getTable().isEnabled()) {
			rInterface.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#updateRInterface()
	 * 
	 */
	public void updateRInterface() {
	rInterface.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addFilterRInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRInterface(ViewerFilter filter) {
		rInterfaceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#addBusinessFilterRInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRInterface(ViewerFilter filter) {
		rInterfaceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.OtherPropertiesEditionPart#isContainedInRInterfaceTable(EObject element)
	 * 
	 */
	public boolean isContainedInRInterfaceTable(EObject element) {
		return ((ReferencesTableSettings)rInterface.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GrmMessages.Other_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
