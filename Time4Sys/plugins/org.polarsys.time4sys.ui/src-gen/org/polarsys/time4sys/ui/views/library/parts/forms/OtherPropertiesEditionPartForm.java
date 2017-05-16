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
package org.polarsys.time4sys.ui.views.library.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.polarsys.time4sys.ui.views.library.parts.LibraryViewsRepository;
import org.polarsys.time4sys.ui.views.library.parts.OtherPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.library.providers.LibraryMessages;

// End of user code

/**
 * 
 * 
 */
public class OtherPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OtherPropertiesEditionPart {

	protected Button isSerial;
	protected Text nbWires;
	protected Text dimension;
	protected Text posX;
	protected Text posY;
	protected Text grid;
	protected Text nbPins;
	protected Text weight;
	protected Text price;
	protected Text addressWidth;
	protected Text wordWidth;
	protected ReferencesTable arbiters;
	protected List<ViewerFilter> arbitersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> arbitersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedPin;
	protected List<ViewerFilter> ownedPinBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedPinFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedWire;
	protected List<ViewerFilter> ownedWireBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedWireFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable pServices;
	protected List<ViewerFilter> pServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> pServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rServices;
	protected List<ViewerFilter> rServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rConditions;
	protected List<ViewerFilter> rConditionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rConditionsFilters = new ArrayList<ViewerFilter>();



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
		CompositionStep propertiesStep = otherStep.addStep(LibraryViewsRepository.Other.Properties.class);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.isSerial);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.nbWires);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.dimension);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.posX);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.posY);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.grid);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.nbPins);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.weight);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.price);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.addressWidth);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.wordWidth);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.arbiters);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.ownedPin);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.ownedWire);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.pServices);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.rServices);
		propertiesStep.addStep(LibraryViewsRepository.Other.Properties.rConditions);
		
		
		composer = new PartComposer(otherStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == LibraryViewsRepository.Other.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.isSerial) {
					return createIsSerialCheckbox(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.nbWires) {
					return createNbWiresText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.dimension) {
					return createDimensionText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.posX) {
					return createPosXText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.posY) {
					return createPosYText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.grid) {
					return createGridText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.nbPins) {
					return createNbPinsText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.weight) {
					return createWeightText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.price) {
					return createPriceText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.addressWidth) {
					return createAddressWidthText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.wordWidth) {
					return createWordWidthText(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.arbiters) {
					return createArbitersReferencesTable(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.ownedPin) {
					return createOwnedPinTableComposition(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.ownedWire) {
					return createOwnedWireTableComposition(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.pServices) {
					return createPServicesTableComposition(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.rServices) {
					return createRServicesReferencesTable(widgetFactory, parent);
				}
				if (key == LibraryViewsRepository.Other.Properties.rConditions) {
					return createRConditionsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(LibraryMessages.OtherPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIsSerialCheckbox(FormToolkit widgetFactory, Composite parent) {
		isSerial = widgetFactory.createButton(parent, getDescription(LibraryViewsRepository.Other.Properties.isSerial, LibraryMessages.OtherPropertiesEditionPart_IsSerialLabel), SWT.CHECK);
		isSerial.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.isSerial, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSerial.getSelection())));
			}

		});
		GridData isSerialData = new GridData(GridData.FILL_HORIZONTAL);
		isSerialData.horizontalSpan = 2;
		isSerial.setLayoutData(isSerialData);
		EditingUtils.setID(isSerial, LibraryViewsRepository.Other.Properties.isSerial);
		EditingUtils.setEEFtype(isSerial, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.isSerial, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsSerialCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createNbWiresText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.nbWires, LibraryMessages.OtherPropertiesEditionPart_NbWiresLabel);
		nbWires = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbWires.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbWiresData = new GridData(GridData.FILL_HORIZONTAL);
		nbWires.setLayoutData(nbWiresData);
		nbWires.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.nbWires,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbWires.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.nbWires,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, nbWires.getText()));
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
		nbWires.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.nbWires, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbWires.getText()));
				}
			}
		});
		EditingUtils.setID(nbWires, LibraryViewsRepository.Other.Properties.nbWires);
		EditingUtils.setEEFtype(nbWires, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.nbWires, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNbWiresText

		// End of user code
		return parent;
	}

	
	protected Composite createDimensionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.dimension, LibraryMessages.OtherPropertiesEditionPart_DimensionLabel);
		dimension = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		dimension.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData dimensionData = new GridData(GridData.FILL_HORIZONTAL);
		dimension.setLayoutData(dimensionData);
		dimension.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.dimension,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dimension.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.dimension,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, dimension.getText()));
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
		dimension.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.dimension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dimension.getText()));
				}
			}
		});
		EditingUtils.setID(dimension, LibraryViewsRepository.Other.Properties.dimension);
		EditingUtils.setEEFtype(dimension, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.dimension, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDimensionText

		// End of user code
		return parent;
	}

	
	protected Composite createPosXText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.posX, LibraryMessages.OtherPropertiesEditionPart_PosXLabel);
		posX = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		posX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData posXData = new GridData(GridData.FILL_HORIZONTAL);
		posX.setLayoutData(posXData);
		posX.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.posX,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posX.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.posX,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, posX.getText()));
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
		posX.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.posX, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posX.getText()));
				}
			}
		});
		EditingUtils.setID(posX, LibraryViewsRepository.Other.Properties.posX);
		EditingUtils.setEEFtype(posX, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.posX, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPosXText

		// End of user code
		return parent;
	}

	
	protected Composite createPosYText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.posY, LibraryMessages.OtherPropertiesEditionPart_PosYLabel);
		posY = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		posY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData posYData = new GridData(GridData.FILL_HORIZONTAL);
		posY.setLayoutData(posYData);
		posY.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.posY,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posY.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.posY,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, posY.getText()));
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
		posY.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.posY, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posY.getText()));
				}
			}
		});
		EditingUtils.setID(posY, LibraryViewsRepository.Other.Properties.posY);
		EditingUtils.setEEFtype(posY, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.posY, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPosYText

		// End of user code
		return parent;
	}

	
	protected Composite createGridText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.grid, LibraryMessages.OtherPropertiesEditionPart_GridLabel);
		grid = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		grid.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		grid.setLayoutData(gridData);
		grid.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.grid,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, grid.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.grid,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, grid.getText()));
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
		grid.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.grid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, grid.getText()));
				}
			}
		});
		EditingUtils.setID(grid, LibraryViewsRepository.Other.Properties.grid);
		EditingUtils.setEEFtype(grid, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.grid, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createGridText

		// End of user code
		return parent;
	}

	
	protected Composite createNbPinsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.nbPins, LibraryMessages.OtherPropertiesEditionPart_NbPinsLabel);
		nbPins = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbPins.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbPinsData = new GridData(GridData.FILL_HORIZONTAL);
		nbPins.setLayoutData(nbPinsData);
		nbPins.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.nbPins,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbPins.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.nbPins,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, nbPins.getText()));
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
		nbPins.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.nbPins, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbPins.getText()));
				}
			}
		});
		EditingUtils.setID(nbPins, LibraryViewsRepository.Other.Properties.nbPins);
		EditingUtils.setEEFtype(nbPins, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.nbPins, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNbPinsText

		// End of user code
		return parent;
	}

	
	protected Composite createWeightText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.weight, LibraryMessages.OtherPropertiesEditionPart_WeightLabel);
		weight = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		weight.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData weightData = new GridData(GridData.FILL_HORIZONTAL);
		weight.setLayoutData(weightData);
		weight.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.weight,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.weight,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, weight.getText()));
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
		weight.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
				}
			}
		});
		EditingUtils.setID(weight, LibraryViewsRepository.Other.Properties.weight);
		EditingUtils.setEEFtype(weight, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.weight, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWeightText

		// End of user code
		return parent;
	}

	
	protected Composite createPriceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.price, LibraryMessages.OtherPropertiesEditionPart_PriceLabel);
		price = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		price.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData priceData = new GridData(GridData.FILL_HORIZONTAL);
		price.setLayoutData(priceData);
		price.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.price,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, price.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.price,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, price.getText()));
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
		price.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.price, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, price.getText()));
				}
			}
		});
		EditingUtils.setID(price, LibraryViewsRepository.Other.Properties.price);
		EditingUtils.setEEFtype(price, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.price, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPriceText

		// End of user code
		return parent;
	}

	
	protected Composite createAddressWidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.addressWidth, LibraryMessages.OtherPropertiesEditionPart_AddressWidthLabel);
		addressWidth = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		addressWidth.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData addressWidthData = new GridData(GridData.FILL_HORIZONTAL);
		addressWidth.setLayoutData(addressWidthData);
		addressWidth.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.addressWidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, addressWidth.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.addressWidth,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, addressWidth.getText()));
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
		addressWidth.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.addressWidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, addressWidth.getText()));
				}
			}
		});
		EditingUtils.setID(addressWidth, LibraryViewsRepository.Other.Properties.addressWidth);
		EditingUtils.setEEFtype(addressWidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.addressWidth, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAddressWidthText

		// End of user code
		return parent;
	}

	
	protected Composite createWordWidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, LibraryViewsRepository.Other.Properties.wordWidth, LibraryMessages.OtherPropertiesEditionPart_WordWidthLabel);
		wordWidth = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wordWidth.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wordWidthData = new GridData(GridData.FILL_HORIZONTAL);
		wordWidth.setLayoutData(wordWidthData);
		wordWidth.addFocusListener(new FocusAdapter() {
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
							LibraryViewsRepository.Other.Properties.wordWidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wordWidth.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OtherPropertiesEditionPartForm.this,
									LibraryViewsRepository.Other.Properties.wordWidth,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wordWidth.getText()));
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
		wordWidth.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.wordWidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wordWidth.getText()));
				}
			}
		});
		EditingUtils.setID(wordWidth, LibraryViewsRepository.Other.Properties.wordWidth);
		EditingUtils.setEEFtype(wordWidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.wordWidth, LibraryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWordWidthText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createArbitersReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.arbiters = new ReferencesTable(getDescription(LibraryViewsRepository.Other.Properties.arbiters, LibraryMessages.OtherPropertiesEditionPart_ArbitersLabel), new ReferencesTableListener	() {
			public void handleAdd() { addArbiters(); }
			public void handleEdit(EObject element) { editArbiters(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveArbiters(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromArbiters(element); }
			public void navigateTo(EObject element) { }
		});
		this.arbiters.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.arbiters, LibraryViewsRepository.FORM_KIND));
		this.arbiters.createControls(parent, widgetFactory);
		this.arbiters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.arbiters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData arbitersData = new GridData(GridData.FILL_HORIZONTAL);
		arbitersData.horizontalSpan = 3;
		this.arbiters.setLayoutData(arbitersData);
		this.arbiters.disableMove();
		arbiters.setID(LibraryViewsRepository.Other.Properties.arbiters);
		arbiters.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createArbitersReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addArbiters() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(arbiters.getInput(), arbitersFilters, arbitersBusinessFilters,
		"arbiters", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.arbiters,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				arbiters.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveArbiters(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.arbiters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		arbiters.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromArbiters(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.arbiters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		arbiters.refresh();
	}

	/**
	 * 
	 */
	protected void editArbiters(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				arbiters.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedPinTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedPin = new ReferencesTable(getDescription(LibraryViewsRepository.Other.Properties.ownedPin, LibraryMessages.OtherPropertiesEditionPart_OwnedPinLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedPin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedPin.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedPin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedPin.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedPin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedPin.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedPin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedPin.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedPinFilters) {
			this.ownedPin.addFilter(filter);
		}
		this.ownedPin.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.ownedPin, LibraryViewsRepository.FORM_KIND));
		this.ownedPin.createControls(parent, widgetFactory);
		this.ownedPin.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedPin, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedPinData = new GridData(GridData.FILL_HORIZONTAL);
		ownedPinData.horizontalSpan = 3;
		this.ownedPin.setLayoutData(ownedPinData);
		this.ownedPin.setLowerBound(0);
		this.ownedPin.setUpperBound(-1);
		ownedPin.setID(LibraryViewsRepository.Other.Properties.ownedPin);
		ownedPin.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedPinTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedWireTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedWire = new ReferencesTable(getDescription(LibraryViewsRepository.Other.Properties.ownedWire, LibraryMessages.OtherPropertiesEditionPart_OwnedWireLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedWire, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedWire.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedWire, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedWire.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedWire, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedWire.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedWire, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedWire.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedWireFilters) {
			this.ownedWire.addFilter(filter);
		}
		this.ownedWire.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.ownedWire, LibraryViewsRepository.FORM_KIND));
		this.ownedWire.createControls(parent, widgetFactory);
		this.ownedWire.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.ownedWire, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedWireData = new GridData(GridData.FILL_HORIZONTAL);
		ownedWireData.horizontalSpan = 3;
		this.ownedWire.setLayoutData(ownedWireData);
		this.ownedWire.setLowerBound(0);
		this.ownedWire.setUpperBound(-1);
		ownedWire.setID(LibraryViewsRepository.Other.Properties.ownedWire);
		ownedWire.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedWireTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPServicesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.pServices = new ReferencesTable(getDescription(LibraryViewsRepository.Other.Properties.pServices, LibraryMessages.OtherPropertiesEditionPart_PServicesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				pServices.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				pServices.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				pServices.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				pServices.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.pServicesFilters) {
			this.pServices.addFilter(filter);
		}
		this.pServices.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.pServices, LibraryViewsRepository.FORM_KIND));
		this.pServices.createControls(parent, widgetFactory);
		this.pServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.pServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData pServicesData = new GridData(GridData.FILL_HORIZONTAL);
		pServicesData.horizontalSpan = 3;
		this.pServices.setLayoutData(pServicesData);
		this.pServices.setLowerBound(0);
		this.pServices.setUpperBound(-1);
		pServices.setID(LibraryViewsRepository.Other.Properties.pServices);
		pServices.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPServicesTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.rServices = new ReferencesTable(getDescription(LibraryViewsRepository.Other.Properties.rServices, LibraryMessages.OtherPropertiesEditionPart_RServicesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addRServices(); }
			public void handleEdit(EObject element) { editRServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.rServices.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.rServices, LibraryViewsRepository.FORM_KIND));
		this.rServices.createControls(parent, widgetFactory);
		this.rServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rServicesData = new GridData(GridData.FILL_HORIZONTAL);
		rServicesData.horizontalSpan = 3;
		this.rServices.setLayoutData(rServicesData);
		this.rServices.disableMove();
		rServices.setID(LibraryViewsRepository.Other.Properties.rServices);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rServices,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param container
	 * 
	 */
	protected Composite createRConditionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.rConditions = new ReferencesTable(getDescription(LibraryViewsRepository.Other.Properties.rConditions, LibraryMessages.OtherPropertiesEditionPart_RConditionsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rConditions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				rConditions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rConditions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				rConditions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rConditions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				rConditions.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rConditions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				rConditions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.rConditionsFilters) {
			this.rConditions.addFilter(filter);
		}
		this.rConditions.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.Other.Properties.rConditions, LibraryViewsRepository.FORM_KIND));
		this.rConditions.createControls(parent, widgetFactory);
		this.rConditions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this, LibraryViewsRepository.Other.Properties.rConditions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rConditionsData = new GridData(GridData.FILL_HORIZONTAL);
		rConditionsData.horizontalSpan = 3;
		this.rConditions.setLayoutData(rConditionsData);
		this.rConditions.setLowerBound(0);
		this.rConditions.setUpperBound(-1);
		rConditions.setID(LibraryViewsRepository.Other.Properties.rConditions);
		rConditions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRConditionsTableComposition

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
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getIsSerial()
	 * 
	 */
	public Boolean getIsSerial() {
		return Boolean.valueOf(isSerial.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setIsSerial(Boolean newValue)
	 * 
	 */
	public void setIsSerial(Boolean newValue) {
		if (newValue != null) {
			isSerial.setSelection(newValue.booleanValue());
		} else {
			isSerial.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.isSerial);
		if (eefElementEditorReadOnlyState && isSerial.isEnabled()) {
			isSerial.setEnabled(false);
			isSerial.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isSerial.isEnabled()) {
			isSerial.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getNbWires()
	 * 
	 */
	public String getNbWires() {
		return nbWires.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setNbWires(String newValue)
	 * 
	 */
	public void setNbWires(String newValue) {
		if (newValue != null) {
			nbWires.setText(newValue);
		} else {
			nbWires.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.nbWires);
		if (eefElementEditorReadOnlyState && nbWires.isEnabled()) {
			nbWires.setEnabled(false);
			nbWires.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbWires.isEnabled()) {
			nbWires.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getDimension()
	 * 
	 */
	public String getDimension() {
		return dimension.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setDimension(String newValue)
	 * 
	 */
	public void setDimension(String newValue) {
		if (newValue != null) {
			dimension.setText(newValue);
		} else {
			dimension.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.dimension);
		if (eefElementEditorReadOnlyState && dimension.isEnabled()) {
			dimension.setEnabled(false);
			dimension.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dimension.isEnabled()) {
			dimension.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getPosX()
	 * 
	 */
	public String getPosX() {
		return posX.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setPosX(String newValue)
	 * 
	 */
	public void setPosX(String newValue) {
		if (newValue != null) {
			posX.setText(newValue);
		} else {
			posX.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.posX);
		if (eefElementEditorReadOnlyState && posX.isEnabled()) {
			posX.setEnabled(false);
			posX.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !posX.isEnabled()) {
			posX.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getPosY()
	 * 
	 */
	public String getPosY() {
		return posY.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setPosY(String newValue)
	 * 
	 */
	public void setPosY(String newValue) {
		if (newValue != null) {
			posY.setText(newValue);
		} else {
			posY.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.posY);
		if (eefElementEditorReadOnlyState && posY.isEnabled()) {
			posY.setEnabled(false);
			posY.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !posY.isEnabled()) {
			posY.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getGrid()
	 * 
	 */
	public String getGrid() {
		return grid.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setGrid(String newValue)
	 * 
	 */
	public void setGrid(String newValue) {
		if (newValue != null) {
			grid.setText(newValue);
		} else {
			grid.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.grid);
		if (eefElementEditorReadOnlyState && grid.isEnabled()) {
			grid.setEnabled(false);
			grid.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !grid.isEnabled()) {
			grid.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getNbPins()
	 * 
	 */
	public String getNbPins() {
		return nbPins.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setNbPins(String newValue)
	 * 
	 */
	public void setNbPins(String newValue) {
		if (newValue != null) {
			nbPins.setText(newValue);
		} else {
			nbPins.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.nbPins);
		if (eefElementEditorReadOnlyState && nbPins.isEnabled()) {
			nbPins.setEnabled(false);
			nbPins.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbPins.isEnabled()) {
			nbPins.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getWeight()
	 * 
	 */
	public String getWeight() {
		return weight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setWeight(String newValue)
	 * 
	 */
	public void setWeight(String newValue) {
		if (newValue != null) {
			weight.setText(newValue);
		} else {
			weight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.weight);
		if (eefElementEditorReadOnlyState && weight.isEnabled()) {
			weight.setEnabled(false);
			weight.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !weight.isEnabled()) {
			weight.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getPrice()
	 * 
	 */
	public String getPrice() {
		return price.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setPrice(String newValue)
	 * 
	 */
	public void setPrice(String newValue) {
		if (newValue != null) {
			price.setText(newValue);
		} else {
			price.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.price);
		if (eefElementEditorReadOnlyState && price.isEnabled()) {
			price.setEnabled(false);
			price.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !price.isEnabled()) {
			price.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getAddressWidth()
	 * 
	 */
	public String getAddressWidth() {
		return addressWidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setAddressWidth(String newValue)
	 * 
	 */
	public void setAddressWidth(String newValue) {
		if (newValue != null) {
			addressWidth.setText(newValue);
		} else {
			addressWidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.addressWidth);
		if (eefElementEditorReadOnlyState && addressWidth.isEnabled()) {
			addressWidth.setEnabled(false);
			addressWidth.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !addressWidth.isEnabled()) {
			addressWidth.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#getWordWidth()
	 * 
	 */
	public String getWordWidth() {
		return wordWidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#setWordWidth(String newValue)
	 * 
	 */
	public void setWordWidth(String newValue) {
		if (newValue != null) {
			wordWidth.setText(newValue);
		} else {
			wordWidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.wordWidth);
		if (eefElementEditorReadOnlyState && wordWidth.isEnabled()) {
			wordWidth.setEnabled(false);
			wordWidth.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wordWidth.isEnabled()) {
			wordWidth.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#initArbiters(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initArbiters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		arbiters.setContentProvider(contentProvider);
		arbiters.setInput(settings);
		arbitersBusinessFilters.clear();
		arbitersFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.arbiters);
		if (eefElementEditorReadOnlyState && arbiters.getTable().isEnabled()) {
			arbiters.setEnabled(false);
			arbiters.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !arbiters.getTable().isEnabled()) {
			arbiters.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#updateArbiters()
	 * 
	 */
	public void updateArbiters() {
	arbiters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addFilterArbiters(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArbiters(ViewerFilter filter) {
		arbitersFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addBusinessFilterArbiters(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArbiters(ViewerFilter filter) {
		arbitersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#isContainedInArbitersTable(EObject element)
	 * 
	 */
	public boolean isContainedInArbitersTable(EObject element) {
		return ((ReferencesTableSettings)arbiters.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#initOwnedPin(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedPin(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedPin.setContentProvider(contentProvider);
		ownedPin.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.ownedPin);
		if (eefElementEditorReadOnlyState && ownedPin.isEnabled()) {
			ownedPin.setEnabled(false);
			ownedPin.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedPin.isEnabled()) {
			ownedPin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#updateOwnedPin()
	 * 
	 */
	public void updateOwnedPin() {
	ownedPin.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addFilterOwnedPin(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedPin(ViewerFilter filter) {
		ownedPinFilters.add(filter);
		if (this.ownedPin != null) {
			this.ownedPin.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addBusinessFilterOwnedPin(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedPin(ViewerFilter filter) {
		ownedPinBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#isContainedInOwnedPinTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedPinTable(EObject element) {
		return ((ReferencesTableSettings)ownedPin.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#initOwnedWire(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedWire(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedWire.setContentProvider(contentProvider);
		ownedWire.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.ownedWire);
		if (eefElementEditorReadOnlyState && ownedWire.isEnabled()) {
			ownedWire.setEnabled(false);
			ownedWire.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedWire.isEnabled()) {
			ownedWire.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#updateOwnedWire()
	 * 
	 */
	public void updateOwnedWire() {
	ownedWire.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addFilterOwnedWire(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedWire(ViewerFilter filter) {
		ownedWireFilters.add(filter);
		if (this.ownedWire != null) {
			this.ownedWire.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addBusinessFilterOwnedWire(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedWire(ViewerFilter filter) {
		ownedWireBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#isContainedInOwnedWireTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedWireTable(EObject element) {
		return ((ReferencesTableSettings)ownedWire.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#initPServices(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		pServices.setContentProvider(contentProvider);
		pServices.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.pServices);
		if (eefElementEditorReadOnlyState && pServices.isEnabled()) {
			pServices.setEnabled(false);
			pServices.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pServices.isEnabled()) {
			pServices.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#updatePServices()
	 * 
	 */
	public void updatePServices() {
	pServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addFilterPServices(ViewerFilter filter)
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
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addBusinessFilterPServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPServices(ViewerFilter filter) {
		pServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#isContainedInPServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPServicesTable(EObject element) {
		return ((ReferencesTableSettings)pServices.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#initRServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rServices.setContentProvider(contentProvider);
		rServices.setInput(settings);
		rServicesBusinessFilters.clear();
		rServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.rServices);
		if (eefElementEditorReadOnlyState && rServices.getTable().isEnabled()) {
			rServices.setEnabled(false);
			rServices.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rServices.getTable().isEnabled()) {
			rServices.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#updateRServices()
	 * 
	 */
	public void updateRServices() {
	rServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addFilterRServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRServices(ViewerFilter filter) {
		rServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addBusinessFilterRServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRServices(ViewerFilter filter) {
		rServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#isContainedInRServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInRServicesTable(EObject element) {
		return ((ReferencesTableSettings)rServices.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#initRConditions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRConditions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rConditions.setContentProvider(contentProvider);
		rConditions.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.Other.Properties.rConditions);
		if (eefElementEditorReadOnlyState && rConditions.isEnabled()) {
			rConditions.setEnabled(false);
			rConditions.setToolTipText(LibraryMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rConditions.isEnabled()) {
			rConditions.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#updateRConditions()
	 * 
	 */
	public void updateRConditions() {
	rConditions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addFilterRConditions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRConditions(ViewerFilter filter) {
		rConditionsFilters.add(filter);
		if (this.rConditions != null) {
			this.rConditions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#addBusinessFilterRConditions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRConditions(ViewerFilter filter) {
		rConditionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.OtherPropertiesEditionPart#isContainedInRConditionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRConditionsTable(EObject element) {
		return ((ReferencesTableSettings)rConditions.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return LibraryMessages.Other_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
