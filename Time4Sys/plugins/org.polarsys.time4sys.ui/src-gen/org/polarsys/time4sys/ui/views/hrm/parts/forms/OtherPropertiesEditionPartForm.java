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
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.providers.HrmMessages;

// End of user code

/**
 * 
 * 
 */
public class OtherPropertiesEditionPartForm extends SectionPropertiesEditingPart
		implements IFormPropertiesEditionPart, OtherPropertiesEditionPart {

	protected Text packetSize;
	protected EMFComboViewer pldTechnology;
	protected Text wordSize;
	protected Text nbRows;
	protected Text nbColumns;
	protected Text nbBanks;
	protected EMFComboViewer kind;
	protected Text nbLuts;
	protected Text nbLutInputs;
	protected Text nbFlipFlops;
	protected EObjectFlatComboViewer architecture;
	protected Text width;
	protected EMFComboViewer direction;
	protected Text instWidth;
	protected Text addressWidth;
	protected Text wordWidth;
	protected Text weight;
	protected Text price;
	protected Text frequency;
	protected Text opFrequencies;
	protected Text nbSets;
	protected Text blockSize;
	protected Text associativity;
	protected Text technology;
	protected Text dimension;
	protected Text posX;
	protected Text posY;
	protected Text grid;
	protected Text nbPins;
	protected Text nbWires;
	protected Text mips;
	protected Text nbCores;
	protected Text nbPipelines;
	protected Text nbStages;
	protected Text nbAlus;
	protected Text nbFpus;
	protected Text sectorSize;
	protected Text virtualAddrSpace;
	protected Text physicalAddrSpace;
	protected EObjectFlatComboViewer sourcePin;
	protected EObjectFlatComboViewer targetPin;
	protected ReferencesTable ownedPort;
	protected List<ViewerFilter> ownedPortBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedPortFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedPin;
	protected List<ViewerFilter> ownedPinBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedPinFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedWire;
	protected List<ViewerFilter> ownedWireBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedWireFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedService;
	protected List<ViewerFilter> ownedServiceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedServiceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable pInterface;
	protected List<ViewerFilter> pInterfaceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> pInterfaceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rInterface;
	protected List<ViewerFilter> rInterfaceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rInterfaceFilters = new ArrayList<ViewerFilter>();
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
	public OtherPropertiesEditionPartForm() {
		super();
	}

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OtherPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence otherStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = otherStep.addStep(HrmViewsRepository.Other.Properties.class);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.packetSize);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.pldTechnology);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.wordSize);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbRows);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbColumns);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbBanks);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.kind);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbLuts);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbLutInputs);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbFlipFlops);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.architecture);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.width);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.direction);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.instWidth);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.addressWidth);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.wordWidth);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.weight);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.price);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.frequency);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.opFrequencies);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbSets);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.blockSize);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.associativity);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.technology);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.dimension);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.posX);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.posY);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.grid);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbPins);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbWires);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.mips);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbCores);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbPipelines);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbStages);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbAlus);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.nbFpus);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.sectorSize);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.virtualAddrSpace);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.physicalAddrSpace);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.sourcePin);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.targetPin);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.ownedPort);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.ownedPin);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.ownedWire);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.ownedService);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.pInterface);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.rInterface);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.pServices);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.rServices);
		propertiesStep.addStep(HrmViewsRepository.Other.Properties.rConditions);

		composer = new PartComposer(otherStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HrmViewsRepository.Other.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.packetSize) {
					return createPacketSizeText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.pldTechnology) {
					return createPldTechnologyEMFComboViewer(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.wordSize) {
					return createWordSizeText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbRows) {
					return createNbRowsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbColumns) {
					return createNbColumnsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbBanks) {
					return createNbBanksText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.kind) {
					return createKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbLuts) {
					return createNbLutsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbLutInputs) {
					return createNbLutInputsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbFlipFlops) {
					return createNbFlipFlopsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.architecture) {
					return createArchitectureFlatComboViewer(parent, widgetFactory);
				}
				if (key == HrmViewsRepository.Other.Properties.width) {
					return createWidthText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.direction) {
					return createDirectionEMFComboViewer(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.instWidth) {
					return createInstWidthText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.addressWidth) {
					return createAddressWidthText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.wordWidth) {
					return createWordWidthText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.weight) {
					return createWeightText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.price) {
					return createPriceText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.frequency) {
					return createFrequencyText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.opFrequencies) {
					return createOpFrequenciesText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbSets) {
					return createNbSetsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.blockSize) {
					return createBlockSizeText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.associativity) {
					return createAssociativityText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.technology) {
					return createTechnologyText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.dimension) {
					return createDimensionText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.posX) {
					return createPosXText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.posY) {
					return createPosYText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.grid) {
					return createGridText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbPins) {
					return createNbPinsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbWires) {
					return createNbWiresText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.mips) {
					return createMipsText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbCores) {
					return createNbCoresText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbPipelines) {
					return createNbPipelinesText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbStages) {
					return createNbStagesText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbAlus) {
					return createNbAlusText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.nbFpus) {
					return createNbFpusText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.sectorSize) {
					return createSectorSizeText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.virtualAddrSpace) {
					return createVirtualAddrSpaceText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.physicalAddrSpace) {
					return createPhysicalAddrSpaceText(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.sourcePin) {
					return createSourcePinFlatComboViewer(parent, widgetFactory);
				}
				if (key == HrmViewsRepository.Other.Properties.targetPin) {
					return createTargetPinFlatComboViewer(parent, widgetFactory);
				}
				if (key == HrmViewsRepository.Other.Properties.ownedPort) {
					return createOwnedPortTableComposition(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.ownedPin) {
					return createOwnedPinTableComposition(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.ownedWire) {
					return createOwnedWireTableComposition(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.ownedService) {
					return createOwnedServiceTableComposition(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.pInterface) {
					return createPInterfaceReferencesTable(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.rInterface) {
					return createRInterfaceReferencesTable(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.pServices) {
					return createPServicesTableComposition(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.rServices) {
					return createRServicesReferencesTable(widgetFactory, parent);
				}
				if (key == HrmViewsRepository.Other.Properties.rConditions) {
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
		Section propertiesSection = widgetFactory.createSection(parent,
				Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(HrmMessages.OtherPropertiesEditionPart_PropertiesGroupLabel);
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

	protected Composite createPacketSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.packetSize,
				HrmMessages.OtherPropertiesEditionPart_PacketSizeLabel);
		packetSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		packetSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData packetSizeData = new GridData(GridData.FILL_HORIZONTAL);
		packetSize.setLayoutData(packetSizeData);
		packetSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.packetSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetSize.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.packetSize,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							packetSize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		packetSize.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.packetSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetSize.getText()));
				}
			}
		});
		EditingUtils.setID(packetSize, HrmViewsRepository.Other.Properties.packetSize);
		EditingUtils.setEEFtype(packetSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.packetSize, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPacketSizeText

		// End of user code
		return parent;
	}

	protected Composite createPldTechnologyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.pldTechnology,
				HrmMessages.OtherPropertiesEditionPart_PldTechnologyLabel);
		pldTechnology = new EMFComboViewer(parent);
		pldTechnology.setContentProvider(new ArrayContentProvider());
		pldTechnology
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData pldTechnologyData = new GridData(GridData.FILL_HORIZONTAL);
		pldTechnology.getCombo().setLayoutData(pldTechnologyData);
		pldTechnology.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.pldTechnology,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPldTechnology()));
			}

		});
		pldTechnology.setID(HrmViewsRepository.Other.Properties.pldTechnology);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.pldTechnology, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPldTechnologyEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createWordSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.wordSize,
				HrmMessages.OtherPropertiesEditionPart_WordSizeLabel);
		wordSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wordSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wordSizeData = new GridData(GridData.FILL_HORIZONTAL);
		wordSize.setLayoutData(wordSizeData);
		wordSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.wordSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wordSize.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.wordSize, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, wordSize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		wordSize.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.wordSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wordSize.getText()));
				}
			}
		});
		EditingUtils.setID(wordSize, HrmViewsRepository.Other.Properties.wordSize);
		EditingUtils.setEEFtype(wordSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.wordSize, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createWordSizeText

		// End of user code
		return parent;
	}

	protected Composite createNbRowsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbRows,
				HrmMessages.OtherPropertiesEditionPart_NbRowsLabel);
		nbRows = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbRows.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbRowsData = new GridData(GridData.FILL_HORIZONTAL);
		nbRows.setLayoutData(nbRowsData);
		nbRows.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbRows,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbRows.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbRows, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbRows.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbRows.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbRows,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbRows.getText()));
				}
			}
		});
		EditingUtils.setID(nbRows, HrmViewsRepository.Other.Properties.nbRows);
		EditingUtils.setEEFtype(nbRows, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbRows, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbRowsText

		// End of user code
		return parent;
	}

	protected Composite createNbColumnsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbColumns,
				HrmMessages.OtherPropertiesEditionPart_NbColumnsLabel);
		nbColumns = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbColumns.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbColumnsData = new GridData(GridData.FILL_HORIZONTAL);
		nbColumns.setLayoutData(nbColumnsData);
		nbColumns.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbColumns,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbColumns.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbColumns, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbColumns.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbColumns.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbColumns,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbColumns.getText()));
				}
			}
		});
		EditingUtils.setID(nbColumns, HrmViewsRepository.Other.Properties.nbColumns);
		EditingUtils.setEEFtype(nbColumns, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbColumns, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbColumnsText

		// End of user code
		return parent;
	}

	protected Composite createNbBanksText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbBanks,
				HrmMessages.OtherPropertiesEditionPart_NbBanksLabel);
		nbBanks = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbBanks.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbBanksData = new GridData(GridData.FILL_HORIZONTAL);
		nbBanks.setLayoutData(nbBanksData);
		nbBanks.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbBanks,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbBanks.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbBanks, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbBanks.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbBanks.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbBanks,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbBanks.getText()));
				}
			}
		});
		EditingUtils.setID(nbBanks, HrmViewsRepository.Other.Properties.nbBanks);
		EditingUtils.setEEFtype(nbBanks, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbBanks, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbBanksText

		// End of user code
		return parent;
	}

	protected Composite createKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.kind,
				HrmMessages.OtherPropertiesEditionPart_KindLabel);
		kind = new EMFComboViewer(parent);
		kind.setContentProvider(new ArrayContentProvider());
		kind.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.getCombo().setLayoutData(kindData);
		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.kind,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(HrmViewsRepository.Other.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.kind, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createKindEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createNbLutsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbLuts,
				HrmMessages.OtherPropertiesEditionPart_NbLutsLabel);
		nbLuts = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbLuts.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbLutsData = new GridData(GridData.FILL_HORIZONTAL);
		nbLuts.setLayoutData(nbLutsData);
		nbLuts.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbLuts,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbLuts.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbLuts, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbLuts.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbLuts.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbLuts,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbLuts.getText()));
				}
			}
		});
		EditingUtils.setID(nbLuts, HrmViewsRepository.Other.Properties.nbLuts);
		EditingUtils.setEEFtype(nbLuts, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbLuts, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbLutsText

		// End of user code
		return parent;
	}

	protected Composite createNbLutInputsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbLutInputs,
				HrmMessages.OtherPropertiesEditionPart_NbLutInputsLabel);
		nbLutInputs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbLutInputs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbLutInputsData = new GridData(GridData.FILL_HORIZONTAL);
		nbLutInputs.setLayoutData(nbLutInputsData);
		nbLutInputs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbLutInputs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbLutInputs.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbLutInputs,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							nbLutInputs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbLutInputs.addKeyListener(new KeyAdapter() {
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
								.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
										HrmViewsRepository.Other.Properties.nbLutInputs, PropertiesEditionEvent.COMMIT,
										PropertiesEditionEvent.SET, null, nbLutInputs.getText()));
				}
			}
		});
		EditingUtils.setID(nbLutInputs, HrmViewsRepository.Other.Properties.nbLutInputs);
		EditingUtils.setEEFtype(nbLutInputs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbLutInputs, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbLutInputsText

		// End of user code
		return parent;
	}

	protected Composite createNbFlipFlopsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbFlipFlops,
				HrmMessages.OtherPropertiesEditionPart_NbFlipFlopsLabel);
		nbFlipFlops = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbFlipFlops.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbFlipFlopsData = new GridData(GridData.FILL_HORIZONTAL);
		nbFlipFlops.setLayoutData(nbFlipFlopsData);
		nbFlipFlops.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbFlipFlops,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbFlipFlops.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbFlipFlops,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							nbFlipFlops.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbFlipFlops.addKeyListener(new KeyAdapter() {
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
								.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
										HrmViewsRepository.Other.Properties.nbFlipFlops, PropertiesEditionEvent.COMMIT,
										PropertiesEditionEvent.SET, null, nbFlipFlops.getText()));
				}
			}
		});
		EditingUtils.setID(nbFlipFlops, HrmViewsRepository.Other.Properties.nbFlipFlops);
		EditingUtils.setEEFtype(nbFlipFlops, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbFlipFlops, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbFlipFlopsText

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
	protected Composite createArchitectureFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HrmViewsRepository.Other.Properties.architecture,
				HrmMessages.OtherPropertiesEditionPart_ArchitectureLabel);
		architecture = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.Other.Properties.architecture, HrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(architecture);
		architecture.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData architectureData = new GridData(GridData.FILL_HORIZONTAL);
		architecture.setLayoutData(architectureData);
		architecture.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.architecture,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getArchitecture()));
			}

		});
		architecture.setID(HrmViewsRepository.Other.Properties.architecture);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.architecture, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createArchitectureFlatComboViewer

		// End of user code
		return parent;
	}

	protected Composite createWidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.width,
				HrmMessages.OtherPropertiesEditionPart_WidthLabel);
		width = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		width.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData widthData = new GridData(GridData.FILL_HORIZONTAL);
		width.setLayoutData(widthData);
		width.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.width,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, width.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.width, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, width.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		width.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.width,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, width.getText()));
				}
			}
		});
		EditingUtils.setID(width, HrmViewsRepository.Other.Properties.width);
		EditingUtils.setEEFtype(width, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.width, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createWidthText

		// End of user code
		return parent;
	}

	protected Composite createDirectionEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.direction,
				HrmMessages.OtherPropertiesEditionPart_DirectionLabel);
		direction = new EMFComboViewer(parent);
		direction.setContentProvider(new ArrayContentProvider());
		direction.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData directionData = new GridData(GridData.FILL_HORIZONTAL);
		direction.getCombo().setLayoutData(directionData);
		direction.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.direction,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDirection()));
			}

		});
		direction.setID(HrmViewsRepository.Other.Properties.direction);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.direction, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createDirectionEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createInstWidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.instWidth,
				HrmMessages.OtherPropertiesEditionPart_InstWidthLabel);
		instWidth = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		instWidth.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData instWidthData = new GridData(GridData.FILL_HORIZONTAL);
		instWidth.setLayoutData(instWidthData);
		instWidth.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.instWidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, instWidth.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.instWidth, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, instWidth.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		instWidth.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.instWidth,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, instWidth.getText()));
				}
			}
		});
		EditingUtils.setID(instWidth, HrmViewsRepository.Other.Properties.instWidth);
		EditingUtils.setEEFtype(instWidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.instWidth, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createInstWidthText

		// End of user code
		return parent;
	}

	protected Composite createAddressWidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.addressWidth,
				HrmMessages.OtherPropertiesEditionPart_AddressWidthLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.addressWidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, addressWidth.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.addressWidth,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							addressWidth.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
										HrmViewsRepository.Other.Properties.addressWidth, PropertiesEditionEvent.COMMIT,
										PropertiesEditionEvent.SET, null, addressWidth.getText()));
				}
			}
		});
		EditingUtils.setID(addressWidth, HrmViewsRepository.Other.Properties.addressWidth);
		EditingUtils.setEEFtype(addressWidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.addressWidth, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createAddressWidthText

		// End of user code
		return parent;
	}

	protected Composite createWordWidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.wordWidth,
				HrmMessages.OtherPropertiesEditionPart_WordWidthLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.wordWidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wordWidth.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.wordWidth, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, wordWidth.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.wordWidth,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wordWidth.getText()));
				}
			}
		});
		EditingUtils.setID(wordWidth, HrmViewsRepository.Other.Properties.wordWidth);
		EditingUtils.setEEFtype(wordWidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.wordWidth, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createWordWidthText

		// End of user code
		return parent;
	}

	protected Composite createWeightText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.weight,
				HrmMessages.OtherPropertiesEditionPart_WeightLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.weight,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.weight, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, weight.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.weight,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
				}
			}
		});
		EditingUtils.setID(weight, HrmViewsRepository.Other.Properties.weight);
		EditingUtils.setEEFtype(weight, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.weight, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createWeightText

		// End of user code
		return parent;
	}

	protected Composite createPriceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.price,
				HrmMessages.OtherPropertiesEditionPart_PriceLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.price,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, price.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.price, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, price.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.price,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, price.getText()));
				}
			}
		});
		EditingUtils.setID(price, HrmViewsRepository.Other.Properties.price);
		EditingUtils.setEEFtype(price, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.price, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPriceText

		// End of user code
		return parent;
	}

	protected Composite createFrequencyText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.frequency,
				HrmMessages.OtherPropertiesEditionPart_FrequencyLabel);
		frequency = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		frequency.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData frequencyData = new GridData(GridData.FILL_HORIZONTAL);
		frequency.setLayoutData(frequencyData);
		frequency.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.frequency,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, frequency.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.frequency, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, frequency.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		frequency.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.frequency,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, frequency.getText()));
				}
			}
		});
		EditingUtils.setID(frequency, HrmViewsRepository.Other.Properties.frequency);
		EditingUtils.setEEFtype(frequency, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.frequency, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createFrequencyText

		// End of user code
		return parent;
	}

	protected Composite createOpFrequenciesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.opFrequencies,
				HrmMessages.OtherPropertiesEditionPart_OpFrequenciesLabel);
		opFrequencies = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		opFrequencies.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData opFrequenciesData = new GridData(GridData.FILL_HORIZONTAL);
		opFrequencies.setLayoutData(opFrequenciesData);
		opFrequencies.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.opFrequencies,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, opFrequencies.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.opFrequencies,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							opFrequencies.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		opFrequencies.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.opFrequencies,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
								opFrequencies.getText()));
				}
			}
		});
		EditingUtils.setID(opFrequencies, HrmViewsRepository.Other.Properties.opFrequencies);
		EditingUtils.setEEFtype(opFrequencies, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.opFrequencies, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createOpFrequenciesText

		// End of user code
		return parent;
	}

	protected Composite createNbSetsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbSets,
				HrmMessages.OtherPropertiesEditionPart_NbSetsLabel);
		nbSets = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbSets.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbSetsData = new GridData(GridData.FILL_HORIZONTAL);
		nbSets.setLayoutData(nbSetsData);
		nbSets.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbSets,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbSets.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbSets, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbSets.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbSets.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbSets,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbSets.getText()));
				}
			}
		});
		EditingUtils.setID(nbSets, HrmViewsRepository.Other.Properties.nbSets);
		EditingUtils.setEEFtype(nbSets, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbSets, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbSetsText

		// End of user code
		return parent;
	}

	protected Composite createBlockSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.blockSize,
				HrmMessages.OtherPropertiesEditionPart_BlockSizeLabel);
		blockSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		blockSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData blockSizeData = new GridData(GridData.FILL_HORIZONTAL);
		blockSize.setLayoutData(blockSizeData);
		blockSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.blockSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockSize.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.blockSize, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, blockSize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		blockSize.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.blockSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockSize.getText()));
				}
			}
		});
		EditingUtils.setID(blockSize, HrmViewsRepository.Other.Properties.blockSize);
		EditingUtils.setEEFtype(blockSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.blockSize, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createBlockSizeText

		// End of user code
		return parent;
	}

	protected Composite createAssociativityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.associativity,
				HrmMessages.OtherPropertiesEditionPart_AssociativityLabel);
		associativity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		associativity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData associativityData = new GridData(GridData.FILL_HORIZONTAL);
		associativity.setLayoutData(associativityData);
		associativity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.associativity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, associativity.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.associativity,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							associativity.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		associativity.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.associativity,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
								associativity.getText()));
				}
			}
		});
		EditingUtils.setID(associativity, HrmViewsRepository.Other.Properties.associativity);
		EditingUtils.setEEFtype(associativity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.associativity, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createAssociativityText

		// End of user code
		return parent;
	}

	protected Composite createTechnologyText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.technology,
				HrmMessages.OtherPropertiesEditionPart_TechnologyLabel);
		technology = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		technology.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData technologyData = new GridData(GridData.FILL_HORIZONTAL);
		technology.setLayoutData(technologyData);
		technology.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.technology,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.technology,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							technology.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		technology.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.technology,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technology.getText()));
				}
			}
		});
		EditingUtils.setID(technology, HrmViewsRepository.Other.Properties.technology);
		EditingUtils.setEEFtype(technology, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.technology, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createTechnologyText

		// End of user code
		return parent;
	}

	protected Composite createDimensionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.dimension,
				HrmMessages.OtherPropertiesEditionPart_DimensionLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.dimension,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dimension.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.dimension, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, dimension.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.dimension,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dimension.getText()));
				}
			}
		});
		EditingUtils.setID(dimension, HrmViewsRepository.Other.Properties.dimension);
		EditingUtils.setEEFtype(dimension, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.dimension, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createDimensionText

		// End of user code
		return parent;
	}

	protected Composite createPosXText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.posX,
				HrmMessages.OtherPropertiesEditionPart_PosXLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.posX,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posX.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.posX, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, posX.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.posX,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posX.getText()));
				}
			}
		});
		EditingUtils.setID(posX, HrmViewsRepository.Other.Properties.posX);
		EditingUtils.setEEFtype(posX, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.posX, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPosXText

		// End of user code
		return parent;
	}

	protected Composite createPosYText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.posY,
				HrmMessages.OtherPropertiesEditionPart_PosYLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.posY,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posY.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.posY, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, posY.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.posY,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, posY.getText()));
				}
			}
		});
		EditingUtils.setID(posY, HrmViewsRepository.Other.Properties.posY);
		EditingUtils.setEEFtype(posY, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.posY, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPosYText

		// End of user code
		return parent;
	}

	protected Composite createGridText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.grid,
				HrmMessages.OtherPropertiesEditionPart_GridLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.grid,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, grid.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.grid, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, grid.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.grid,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, grid.getText()));
				}
			}
		});
		EditingUtils.setID(grid, HrmViewsRepository.Other.Properties.grid);
		EditingUtils.setEEFtype(grid, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.grid, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createGridText

		// End of user code
		return parent;
	}

	protected Composite createNbPinsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbPins,
				HrmMessages.OtherPropertiesEditionPart_NbPinsLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbPins,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbPins.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbPins, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbPins.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbPins,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbPins.getText()));
				}
			}
		});
		EditingUtils.setID(nbPins, HrmViewsRepository.Other.Properties.nbPins);
		EditingUtils.setEEFtype(nbPins, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbPins, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbPinsText

		// End of user code
		return parent;
	}

	protected Composite createNbWiresText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbWires,
				HrmMessages.OtherPropertiesEditionPart_NbWiresLabel);
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
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbWires,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbWires.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbWires, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbWires.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbWires,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbWires.getText()));
				}
			}
		});
		EditingUtils.setID(nbWires, HrmViewsRepository.Other.Properties.nbWires);
		EditingUtils.setEEFtype(nbWires, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbWires, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbWiresText

		// End of user code
		return parent;
	}

	protected Composite createMipsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.mips,
				HrmMessages.OtherPropertiesEditionPart_MipsLabel);
		mips = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		mips.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData mipsData = new GridData(GridData.FILL_HORIZONTAL);
		mips.setLayoutData(mipsData);
		mips.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.mips,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mips.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.mips, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, mips.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		mips.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.mips,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mips.getText()));
				}
			}
		});
		EditingUtils.setID(mips, HrmViewsRepository.Other.Properties.mips);
		EditingUtils.setEEFtype(mips, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.mips, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createMipsText

		// End of user code
		return parent;
	}

	protected Composite createNbCoresText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbCores,
				HrmMessages.OtherPropertiesEditionPart_NbCoresLabel);
		nbCores = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbCores.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbCoresData = new GridData(GridData.FILL_HORIZONTAL);
		nbCores.setLayoutData(nbCoresData);
		nbCores.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbCores,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbCores.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbCores, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbCores.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbCores.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbCores,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbCores.getText()));
				}
			}
		});
		EditingUtils.setID(nbCores, HrmViewsRepository.Other.Properties.nbCores);
		EditingUtils.setEEFtype(nbCores, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbCores, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbCoresText

		// End of user code
		return parent;
	}

	protected Composite createNbPipelinesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbPipelines,
				HrmMessages.OtherPropertiesEditionPart_NbPipelinesLabel);
		nbPipelines = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbPipelines.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbPipelinesData = new GridData(GridData.FILL_HORIZONTAL);
		nbPipelines.setLayoutData(nbPipelinesData);
		nbPipelines.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbPipelines,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbPipelines.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbPipelines,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							nbPipelines.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbPipelines.addKeyListener(new KeyAdapter() {
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
								.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
										HrmViewsRepository.Other.Properties.nbPipelines, PropertiesEditionEvent.COMMIT,
										PropertiesEditionEvent.SET, null, nbPipelines.getText()));
				}
			}
		});
		EditingUtils.setID(nbPipelines, HrmViewsRepository.Other.Properties.nbPipelines);
		EditingUtils.setEEFtype(nbPipelines, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbPipelines, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbPipelinesText

		// End of user code
		return parent;
	}

	protected Composite createNbStagesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbStages,
				HrmMessages.OtherPropertiesEditionPart_NbStagesLabel);
		nbStages = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbStages.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbStagesData = new GridData(GridData.FILL_HORIZONTAL);
		nbStages.setLayoutData(nbStagesData);
		nbStages.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbStages,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbStages.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbStages, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbStages.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbStages.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbStages,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbStages.getText()));
				}
			}
		});
		EditingUtils.setID(nbStages, HrmViewsRepository.Other.Properties.nbStages);
		EditingUtils.setEEFtype(nbStages, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbStages, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbStagesText

		// End of user code
		return parent;
	}

	protected Composite createNbAlusText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbAlus,
				HrmMessages.OtherPropertiesEditionPart_NbAlusLabel);
		nbAlus = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbAlus.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbAlusData = new GridData(GridData.FILL_HORIZONTAL);
		nbAlus.setLayoutData(nbAlusData);
		nbAlus.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbAlus,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAlus.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbAlus, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbAlus.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbAlus.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbAlus,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAlus.getText()));
				}
			}
		});
		EditingUtils.setID(nbAlus, HrmViewsRepository.Other.Properties.nbAlus);
		EditingUtils.setEEFtype(nbAlus, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbAlus, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbAlusText

		// End of user code
		return parent;
	}

	protected Composite createNbFpusText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.nbFpus,
				HrmMessages.OtherPropertiesEditionPart_NbFpusLabel);
		nbFpus = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbFpus.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbFpusData = new GridData(GridData.FILL_HORIZONTAL);
		nbFpus.setLayoutData(nbFpusData);
		nbFpus.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbFpus,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbFpus.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.nbFpus, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, nbFpus.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		nbFpus.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.nbFpus,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbFpus.getText()));
				}
			}
		});
		EditingUtils.setID(nbFpus, HrmViewsRepository.Other.Properties.nbFpus);
		EditingUtils.setEEFtype(nbFpus, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.nbFpus, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbFpusText

		// End of user code
		return parent;
	}

	protected Composite createSectorSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.sectorSize,
				HrmMessages.OtherPropertiesEditionPart_SectorSizeLabel);
		sectorSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		sectorSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sectorSizeData = new GridData(GridData.FILL_HORIZONTAL);
		sectorSize.setLayoutData(sectorSizeData);
		sectorSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.sectorSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sectorSize.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.sectorSize,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							sectorSize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		sectorSize.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.sectorSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sectorSize.getText()));
				}
			}
		});
		EditingUtils.setID(sectorSize, HrmViewsRepository.Other.Properties.sectorSize);
		EditingUtils.setEEFtype(sectorSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.sectorSize, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createSectorSizeText

		// End of user code
		return parent;
	}

	protected Composite createVirtualAddrSpaceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.virtualAddrSpace,
				HrmMessages.OtherPropertiesEditionPart_VirtualAddrSpaceLabel);
		virtualAddrSpace = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		virtualAddrSpace.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData virtualAddrSpaceData = new GridData(GridData.FILL_HORIZONTAL);
		virtualAddrSpace.setLayoutData(virtualAddrSpaceData);
		virtualAddrSpace.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.virtualAddrSpace, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, virtualAddrSpace.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.virtualAddrSpace,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							virtualAddrSpace.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		virtualAddrSpace.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this,
								HrmViewsRepository.Other.Properties.virtualAddrSpace, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, virtualAddrSpace.getText()));
				}
			}
		});
		EditingUtils.setID(virtualAddrSpace, HrmViewsRepository.Other.Properties.virtualAddrSpace);
		EditingUtils.setEEFtype(virtualAddrSpace, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.Other.Properties.virtualAddrSpace, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createVirtualAddrSpaceText

		// End of user code
		return parent;
	}

	protected Composite createPhysicalAddrSpaceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HrmViewsRepository.Other.Properties.physicalAddrSpace,
				HrmMessages.OtherPropertiesEditionPart_PhysicalAddrSpaceLabel);
		physicalAddrSpace = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		physicalAddrSpace.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData physicalAddrSpaceData = new GridData(GridData.FILL_HORIZONTAL);
		physicalAddrSpace.setLayoutData(physicalAddrSpaceData);
		physicalAddrSpace.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.physicalAddrSpace,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
							physicalAddrSpace.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.physicalAddrSpace,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							physicalAddrSpace.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		physicalAddrSpace.addKeyListener(new KeyAdapter() {
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
								OtherPropertiesEditionPartForm.this,
								HrmViewsRepository.Other.Properties.physicalAddrSpace, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, physicalAddrSpace.getText()));
				}
			}
		});
		EditingUtils.setID(physicalAddrSpace, HrmViewsRepository.Other.Properties.physicalAddrSpace);
		EditingUtils.setEEFtype(physicalAddrSpace, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.Other.Properties.physicalAddrSpace, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPhysicalAddrSpaceText

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
	protected Composite createSourcePinFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HrmViewsRepository.Other.Properties.sourcePin,
				HrmMessages.OtherPropertiesEditionPart_SourcePinLabel);
		sourcePin = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.Other.Properties.sourcePin, HrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(sourcePin);
		sourcePin.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourcePinData = new GridData(GridData.FILL_HORIZONTAL);
		sourcePin.setLayoutData(sourcePinData);
		sourcePin.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.sourcePin,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSourcePin()));
			}

		});
		sourcePin.setID(HrmViewsRepository.Other.Properties.sourcePin);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.sourcePin, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createSourcePinFlatComboViewer

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
	protected Composite createTargetPinFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HrmViewsRepository.Other.Properties.targetPin,
				HrmMessages.OtherPropertiesEditionPart_TargetPinLabel);
		targetPin = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.Other.Properties.targetPin, HrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(targetPin);
		targetPin.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetPinData = new GridData(GridData.FILL_HORIZONTAL);
		targetPin.setLayoutData(targetPinData);
		targetPin.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.targetPin,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTargetPin()));
			}

		});
		targetPin.setID(HrmViewsRepository.Other.Properties.targetPin);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.targetPin, HrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createTargetPinFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedPortTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedPort = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.ownedPort,
				HrmMessages.OtherPropertiesEditionPart_OwnedPortLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedPort.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedPort.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedPort.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedPort.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedPortFilters) {
			this.ownedPort.addFilter(filter);
		}
		this.ownedPort.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.ownedPort, HrmViewsRepository.FORM_KIND));
		this.ownedPort.createControls(parent, widgetFactory);
		this.ownedPort.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.ownedPort, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedPortData = new GridData(GridData.FILL_HORIZONTAL);
		ownedPortData.horizontalSpan = 3;
		this.ownedPort.setLayoutData(ownedPortData);
		this.ownedPort.setLowerBound(0);
		this.ownedPort.setUpperBound(-1);
		ownedPort.setID(HrmViewsRepository.Other.Properties.ownedPort);
		ownedPort.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedPortTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedPinTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedPin = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.ownedPin,
				HrmMessages.OtherPropertiesEditionPart_OwnedPinLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPin,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedPin.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPin,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedPin.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPin,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedPin.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedPin,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedPin.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedPinFilters) {
			this.ownedPin.addFilter(filter);
		}
		this.ownedPin.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.ownedPin, HrmViewsRepository.FORM_KIND));
		this.ownedPin.createControls(parent, widgetFactory);
		this.ownedPin.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.ownedPin, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedPinData = new GridData(GridData.FILL_HORIZONTAL);
		ownedPinData.horizontalSpan = 3;
		this.ownedPin.setLayoutData(ownedPinData);
		this.ownedPin.setLowerBound(0);
		this.ownedPin.setUpperBound(-1);
		ownedPin.setID(HrmViewsRepository.Other.Properties.ownedPin);
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
		this.ownedWire = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.ownedWire,
				HrmMessages.OtherPropertiesEditionPart_OwnedWireLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedWire,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedWire.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedWire,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedWire.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedWire,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedWire.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedWire,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedWire.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedWireFilters) {
			this.ownedWire.addFilter(filter);
		}
		this.ownedWire.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.ownedWire, HrmViewsRepository.FORM_KIND));
		this.ownedWire.createControls(parent, widgetFactory);
		this.ownedWire.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.ownedWire, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedWireData = new GridData(GridData.FILL_HORIZONTAL);
		ownedWireData.horizontalSpan = 3;
		this.ownedWire.setLayoutData(ownedWireData);
		this.ownedWire.setLowerBound(0);
		this.ownedWire.setUpperBound(-1);
		ownedWire.setID(HrmViewsRepository.Other.Properties.ownedWire);
		ownedWire.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedWireTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedServiceTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedService = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.ownedService,
				HrmMessages.OtherPropertiesEditionPart_OwnedServiceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedService,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedService.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedService,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedService.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedService,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedService.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.ownedService,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedService.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedServiceFilters) {
			this.ownedService.addFilter(filter);
		}
		this.ownedService.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.ownedService, HrmViewsRepository.FORM_KIND));
		this.ownedService.createControls(parent, widgetFactory);
		this.ownedService.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.ownedService, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedServiceData = new GridData(GridData.FILL_HORIZONTAL);
		ownedServiceData.horizontalSpan = 3;
		this.ownedService.setLayoutData(ownedServiceData);
		this.ownedService.setLowerBound(0);
		this.ownedService.setUpperBound(-1);
		ownedService.setID(HrmViewsRepository.Other.Properties.ownedService);
		ownedService.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedServiceTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPInterfaceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.pInterface = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.pInterface,
				HrmMessages.OtherPropertiesEditionPart_PInterfaceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addPInterface();
					}

					public void handleEdit(EObject element) {
						editPInterface(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						movePInterface(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromPInterface(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.pInterface.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.pInterface, HrmViewsRepository.FORM_KIND));
		this.pInterface.createControls(parent, widgetFactory);
		this.pInterface.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.pInterface, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData pInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		pInterfaceData.horizontalSpan = 3;
		this.pInterface.setLayoutData(pInterfaceData);
		this.pInterface.disableMove();
		pInterface.setID(HrmViewsRepository.Other.Properties.pInterface);
		pInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createPInterfaceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addPInterface() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(pInterface.getInput(),
				pInterfaceFilters, pInterfaceBusinessFilters, "pInterface",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.pInterface,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
				HrmViewsRepository.Other.Properties.pInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		pInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
				HrmViewsRepository.Other.Properties.pInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		pInterface.refresh();
	}

	/**
	 * 
	 */
	protected void editPInterface(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
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
		this.rInterface = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.rInterface,
				HrmMessages.OtherPropertiesEditionPart_RInterfaceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addRInterface();
					}

					public void handleEdit(EObject element) {
						editRInterface(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveRInterface(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromRInterface(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.rInterface.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.rInterface, HrmViewsRepository.FORM_KIND));
		this.rInterface.createControls(parent, widgetFactory);
		this.rInterface.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.rInterface, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData rInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		rInterfaceData.horizontalSpan = 3;
		this.rInterface.setLayoutData(rInterfaceData);
		this.rInterface.disableMove();
		rInterface.setID(HrmViewsRepository.Other.Properties.rInterface);
		rInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createRInterfaceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addRInterface() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(rInterface.getInput(),
				rInterfaceFilters, rInterfaceBusinessFilters, "rInterface",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.rInterface,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
				HrmViewsRepository.Other.Properties.rInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		rInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
				HrmViewsRepository.Other.Properties.rInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		rInterface.refresh();
	}

	/**
	 * 
	 */
	protected void editRInterface(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				rInterface.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPServicesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.pServices = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.pServices,
				HrmMessages.OtherPropertiesEditionPart_PServicesLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						pServices.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						pServices.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						pServices.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						pServices.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.pServicesFilters) {
			this.pServices.addFilter(filter);
		}
		this.pServices.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.pServices, HrmViewsRepository.FORM_KIND));
		this.pServices.createControls(parent, widgetFactory);
		this.pServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.pServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData pServicesData = new GridData(GridData.FILL_HORIZONTAL);
		pServicesData.horizontalSpan = 3;
		this.pServices.setLayoutData(pServicesData);
		this.pServices.setLowerBound(0);
		this.pServices.setUpperBound(-1);
		pServices.setID(HrmViewsRepository.Other.Properties.pServices);
		pServices.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPServicesTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.rServices = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.rServices,
				HrmMessages.OtherPropertiesEditionPart_RServicesLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addRServices();
					}

					public void handleEdit(EObject element) {
						editRServices(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveRServices(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromRServices(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.rServices.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.rServices, HrmViewsRepository.FORM_KIND));
		this.rServices.createControls(parent, widgetFactory);
		this.rServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData rServicesData = new GridData(GridData.FILL_HORIZONTAL);
		rServicesData.horizontalSpan = 3;
		this.rServices.setLayoutData(rServicesData);
		this.rServices.disableMove();
		rServices.setID(HrmViewsRepository.Other.Properties.rServices);
		rServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createRServicesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addRServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(rServices.getInput(), rServicesFilters,
				rServicesBusinessFilters, "rServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.rServices,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
				HrmViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
				HrmViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void editRServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
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
		this.rConditions = new ReferencesTable(getDescription(HrmViewsRepository.Other.Properties.rConditions,
				HrmMessages.OtherPropertiesEditionPart_RConditionsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.rConditions,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						rConditions.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.rConditions,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						rConditions.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.rConditions,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						rConditions.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartForm.this, HrmViewsRepository.Other.Properties.rConditions,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						rConditions.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.rConditionsFilters) {
			this.rConditions.addFilter(filter);
		}
		this.rConditions.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.Other.Properties.rConditions, HrmViewsRepository.FORM_KIND));
		this.rConditions.createControls(parent, widgetFactory);
		this.rConditions.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartForm.this,
									HrmViewsRepository.Other.Properties.rConditions, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData rConditionsData = new GridData(GridData.FILL_HORIZONTAL);
		rConditionsData.horizontalSpan = 3;
		this.rConditions.setLayoutData(rConditionsData);
		this.rConditions.setLowerBound(0);
		this.rConditions.setUpperBound(-1);
		rConditions.setID(HrmViewsRepository.Other.Properties.rConditions);
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getPacketSize()
	 * 
	 */
	public String getPacketSize() {
		return packetSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setPacketSize(String
	 *      newValue)
	 * 
	 */
	public void setPacketSize(String newValue) {
		if (newValue != null) {
			packetSize.setText(newValue);
		} else {
			packetSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.packetSize);
		if (eefElementEditorReadOnlyState && packetSize.isEnabled()) {
			packetSize.setEnabled(false);
			packetSize.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !packetSize.isEnabled()) {
			packetSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getPldTechnology()
	 * 
	 */
	public Enumerator getPldTechnology() {
		Enumerator selection = (Enumerator) ((StructuredSelection) pldTechnology.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initPldTechnology(Object
	 *      input, Enumerator current)
	 */
	public void initPldTechnology(Object input, Enumerator current) {
		pldTechnology.setInput(input);
		pldTechnology.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.pldTechnology);
		if (eefElementEditorReadOnlyState && pldTechnology.isEnabled()) {
			pldTechnology.setEnabled(false);
			pldTechnology.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pldTechnology.isEnabled()) {
			pldTechnology.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setPldTechnology(Enumerator
	 *      newValue)
	 * 
	 */
	public void setPldTechnology(Enumerator newValue) {
		pldTechnology.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.pldTechnology);
		if (eefElementEditorReadOnlyState && pldTechnology.isEnabled()) {
			pldTechnology.setEnabled(false);
			pldTechnology.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pldTechnology.isEnabled()) {
			pldTechnology.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getWordSize()
	 * 
	 */
	public String getWordSize() {
		return wordSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setWordSize(String
	 *      newValue)
	 * 
	 */
	public void setWordSize(String newValue) {
		if (newValue != null) {
			wordSize.setText(newValue);
		} else {
			wordSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.wordSize);
		if (eefElementEditorReadOnlyState && wordSize.isEnabled()) {
			wordSize.setEnabled(false);
			wordSize.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wordSize.isEnabled()) {
			wordSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbRows()
	 * 
	 */
	public String getNbRows() {
		return nbRows.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbRows(String
	 *      newValue)
	 * 
	 */
	public void setNbRows(String newValue) {
		if (newValue != null) {
			nbRows.setText(newValue);
		} else {
			nbRows.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbRows);
		if (eefElementEditorReadOnlyState && nbRows.isEnabled()) {
			nbRows.setEnabled(false);
			nbRows.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbRows.isEnabled()) {
			nbRows.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbColumns()
	 * 
	 */
	public String getNbColumns() {
		return nbColumns.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbColumns(String
	 *      newValue)
	 * 
	 */
	public void setNbColumns(String newValue) {
		if (newValue != null) {
			nbColumns.setText(newValue);
		} else {
			nbColumns.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbColumns);
		if (eefElementEditorReadOnlyState && nbColumns.isEnabled()) {
			nbColumns.setEnabled(false);
			nbColumns.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbColumns.isEnabled()) {
			nbColumns.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbBanks()
	 * 
	 */
	public String getNbBanks() {
		return nbBanks.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbBanks(String
	 *      newValue)
	 * 
	 */
	public void setNbBanks(String newValue) {
		if (newValue != null) {
			nbBanks.setText(newValue);
		} else {
			nbBanks.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbBanks);
		if (eefElementEditorReadOnlyState && nbBanks.isEnabled()) {
			nbBanks.setEnabled(false);
			nbBanks.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbBanks.isEnabled()) {
			nbBanks.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getKind()
	 * 
	 */
	public Enumerator getKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) kind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initKind(Object
	 *      input, Enumerator current)
	 */
	public void initKind(Object input, Enumerator current) {
		kind.setInput(input);
		kind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setKind(Enumerator
	 *      newValue)
	 * 
	 */
	public void setKind(Enumerator newValue) {
		kind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbLuts()
	 * 
	 */
	public String getNbLuts() {
		return nbLuts.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbLuts(String
	 *      newValue)
	 * 
	 */
	public void setNbLuts(String newValue) {
		if (newValue != null) {
			nbLuts.setText(newValue);
		} else {
			nbLuts.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbLuts);
		if (eefElementEditorReadOnlyState && nbLuts.isEnabled()) {
			nbLuts.setEnabled(false);
			nbLuts.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbLuts.isEnabled()) {
			nbLuts.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbLutInputs()
	 * 
	 */
	public String getNbLutInputs() {
		return nbLutInputs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbLutInputs(String
	 *      newValue)
	 * 
	 */
	public void setNbLutInputs(String newValue) {
		if (newValue != null) {
			nbLutInputs.setText(newValue);
		} else {
			nbLutInputs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbLutInputs);
		if (eefElementEditorReadOnlyState && nbLutInputs.isEnabled()) {
			nbLutInputs.setEnabled(false);
			nbLutInputs.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbLutInputs.isEnabled()) {
			nbLutInputs.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbFlipFlops()
	 * 
	 */
	public String getNbFlipFlops() {
		return nbFlipFlops.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbFlipFlops(String
	 *      newValue)
	 * 
	 */
	public void setNbFlipFlops(String newValue) {
		if (newValue != null) {
			nbFlipFlops.setText(newValue);
		} else {
			nbFlipFlops.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbFlipFlops);
		if (eefElementEditorReadOnlyState && nbFlipFlops.isEnabled()) {
			nbFlipFlops.setEnabled(false);
			nbFlipFlops.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbFlipFlops.isEnabled()) {
			nbFlipFlops.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getArchitecture()
	 * 
	 */
	public EObject getArchitecture() {
		if (architecture.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) architecture.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initArchitecture(EObjectFlatComboSettings)
	 */
	public void initArchitecture(EObjectFlatComboSettings settings) {
		architecture.setInput(settings);
		if (current != null) {
			architecture.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.architecture);
		if (eefElementEditorReadOnlyState && architecture.isEnabled()) {
			architecture.setEnabled(false);
			architecture.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !architecture.isEnabled()) {
			architecture.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setArchitecture(EObject
	 *      newValue)
	 * 
	 */
	public void setArchitecture(EObject newValue) {
		if (newValue != null) {
			architecture.setSelection(new StructuredSelection(newValue));
		} else {
			architecture.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.architecture);
		if (eefElementEditorReadOnlyState && architecture.isEnabled()) {
			architecture.setEnabled(false);
			architecture.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !architecture.isEnabled()) {
			architecture.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setArchitectureButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setArchitectureButtonMode(ButtonsModeEnum newValue) {
		architecture.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterArchitecture(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToArchitecture(ViewerFilter filter) {
		architecture.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterArchitecture(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToArchitecture(ViewerFilter filter) {
		architecture.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getWidth()
	 * 
	 */
	public String getWidth() {
		return width.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setWidth(String
	 *      newValue)
	 * 
	 */
	public void setWidth(String newValue) {
		if (newValue != null) {
			width.setText(newValue);
		} else {
			width.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.width);
		if (eefElementEditorReadOnlyState && width.isEnabled()) {
			width.setEnabled(false);
			width.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !width.isEnabled()) {
			width.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getDirection()
	 * 
	 */
	public Enumerator getDirection() {
		Enumerator selection = (Enumerator) ((StructuredSelection) direction.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initDirection(Object
	 *      input, Enumerator current)
	 */
	public void initDirection(Object input, Enumerator current) {
		direction.setInput(input);
		direction.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.direction);
		if (eefElementEditorReadOnlyState && direction.isEnabled()) {
			direction.setEnabled(false);
			direction.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !direction.isEnabled()) {
			direction.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setDirection(Enumerator
	 *      newValue)
	 * 
	 */
	public void setDirection(Enumerator newValue) {
		direction.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.direction);
		if (eefElementEditorReadOnlyState && direction.isEnabled()) {
			direction.setEnabled(false);
			direction.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !direction.isEnabled()) {
			direction.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getInstWidth()
	 * 
	 */
	public String getInstWidth() {
		return instWidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setInstWidth(String
	 *      newValue)
	 * 
	 */
	public void setInstWidth(String newValue) {
		if (newValue != null) {
			instWidth.setText(newValue);
		} else {
			instWidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.instWidth);
		if (eefElementEditorReadOnlyState && instWidth.isEnabled()) {
			instWidth.setEnabled(false);
			instWidth.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !instWidth.isEnabled()) {
			instWidth.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getAddressWidth()
	 * 
	 */
	public String getAddressWidth() {
		return addressWidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setAddressWidth(String
	 *      newValue)
	 * 
	 */
	public void setAddressWidth(String newValue) {
		if (newValue != null) {
			addressWidth.setText(newValue);
		} else {
			addressWidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.addressWidth);
		if (eefElementEditorReadOnlyState && addressWidth.isEnabled()) {
			addressWidth.setEnabled(false);
			addressWidth.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !addressWidth.isEnabled()) {
			addressWidth.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getWordWidth()
	 * 
	 */
	public String getWordWidth() {
		return wordWidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setWordWidth(String
	 *      newValue)
	 * 
	 */
	public void setWordWidth(String newValue) {
		if (newValue != null) {
			wordWidth.setText(newValue);
		} else {
			wordWidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.wordWidth);
		if (eefElementEditorReadOnlyState && wordWidth.isEnabled()) {
			wordWidth.setEnabled(false);
			wordWidth.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wordWidth.isEnabled()) {
			wordWidth.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getWeight()
	 * 
	 */
	public String getWeight() {
		return weight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setWeight(String
	 *      newValue)
	 * 
	 */
	public void setWeight(String newValue) {
		if (newValue != null) {
			weight.setText(newValue);
		} else {
			weight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.weight);
		if (eefElementEditorReadOnlyState && weight.isEnabled()) {
			weight.setEnabled(false);
			weight.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !weight.isEnabled()) {
			weight.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getPrice()
	 * 
	 */
	public String getPrice() {
		return price.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setPrice(String
	 *      newValue)
	 * 
	 */
	public void setPrice(String newValue) {
		if (newValue != null) {
			price.setText(newValue);
		} else {
			price.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.price);
		if (eefElementEditorReadOnlyState && price.isEnabled()) {
			price.setEnabled(false);
			price.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !price.isEnabled()) {
			price.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getFrequency()
	 * 
	 */
	public String getFrequency() {
		return frequency.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setFrequency(String
	 *      newValue)
	 * 
	 */
	public void setFrequency(String newValue) {
		if (newValue != null) {
			frequency.setText(newValue);
		} else {
			frequency.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.frequency);
		if (eefElementEditorReadOnlyState && frequency.isEnabled()) {
			frequency.setEnabled(false);
			frequency.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !frequency.isEnabled()) {
			frequency.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getOpFrequencies()
	 * 
	 */
	public String getOpFrequencies() {
		return opFrequencies.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setOpFrequencies(String
	 *      newValue)
	 * 
	 */
	public void setOpFrequencies(String newValue) {
		if (newValue != null) {
			opFrequencies.setText(newValue);
		} else {
			opFrequencies.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.opFrequencies);
		if (eefElementEditorReadOnlyState && opFrequencies.isEnabled()) {
			opFrequencies.setEnabled(false);
			opFrequencies.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !opFrequencies.isEnabled()) {
			opFrequencies.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbSets()
	 * 
	 */
	public String getNbSets() {
		return nbSets.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbSets(String
	 *      newValue)
	 * 
	 */
	public void setNbSets(String newValue) {
		if (newValue != null) {
			nbSets.setText(newValue);
		} else {
			nbSets.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbSets);
		if (eefElementEditorReadOnlyState && nbSets.isEnabled()) {
			nbSets.setEnabled(false);
			nbSets.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbSets.isEnabled()) {
			nbSets.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getBlockSize()
	 * 
	 */
	public String getBlockSize() {
		return blockSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setBlockSize(String
	 *      newValue)
	 * 
	 */
	public void setBlockSize(String newValue) {
		if (newValue != null) {
			blockSize.setText(newValue);
		} else {
			blockSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.blockSize);
		if (eefElementEditorReadOnlyState && blockSize.isEnabled()) {
			blockSize.setEnabled(false);
			blockSize.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !blockSize.isEnabled()) {
			blockSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getAssociativity()
	 * 
	 */
	public String getAssociativity() {
		return associativity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setAssociativity(String
	 *      newValue)
	 * 
	 */
	public void setAssociativity(String newValue) {
		if (newValue != null) {
			associativity.setText(newValue);
		} else {
			associativity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.associativity);
		if (eefElementEditorReadOnlyState && associativity.isEnabled()) {
			associativity.setEnabled(false);
			associativity.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !associativity.isEnabled()) {
			associativity.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getTechnology()
	 * 
	 */
	public String getTechnology() {
		return technology.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setTechnology(String
	 *      newValue)
	 * 
	 */
	public void setTechnology(String newValue) {
		if (newValue != null) {
			technology.setText(newValue);
		} else {
			technology.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.technology);
		if (eefElementEditorReadOnlyState && technology.isEnabled()) {
			technology.setEnabled(false);
			technology.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !technology.isEnabled()) {
			technology.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getDimension()
	 * 
	 */
	public String getDimension() {
		return dimension.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setDimension(String
	 *      newValue)
	 * 
	 */
	public void setDimension(String newValue) {
		if (newValue != null) {
			dimension.setText(newValue);
		} else {
			dimension.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.dimension);
		if (eefElementEditorReadOnlyState && dimension.isEnabled()) {
			dimension.setEnabled(false);
			dimension.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dimension.isEnabled()) {
			dimension.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getPosX()
	 * 
	 */
	public String getPosX() {
		return posX.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setPosX(String
	 *      newValue)
	 * 
	 */
	public void setPosX(String newValue) {
		if (newValue != null) {
			posX.setText(newValue);
		} else {
			posX.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.posX);
		if (eefElementEditorReadOnlyState && posX.isEnabled()) {
			posX.setEnabled(false);
			posX.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !posX.isEnabled()) {
			posX.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getPosY()
	 * 
	 */
	public String getPosY() {
		return posY.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setPosY(String
	 *      newValue)
	 * 
	 */
	public void setPosY(String newValue) {
		if (newValue != null) {
			posY.setText(newValue);
		} else {
			posY.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.posY);
		if (eefElementEditorReadOnlyState && posY.isEnabled()) {
			posY.setEnabled(false);
			posY.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !posY.isEnabled()) {
			posY.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getGrid()
	 * 
	 */
	public String getGrid() {
		return grid.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setGrid(String
	 *      newValue)
	 * 
	 */
	public void setGrid(String newValue) {
		if (newValue != null) {
			grid.setText(newValue);
		} else {
			grid.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.grid);
		if (eefElementEditorReadOnlyState && grid.isEnabled()) {
			grid.setEnabled(false);
			grid.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !grid.isEnabled()) {
			grid.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbPins()
	 * 
	 */
	public String getNbPins() {
		return nbPins.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbPins(String
	 *      newValue)
	 * 
	 */
	public void setNbPins(String newValue) {
		if (newValue != null) {
			nbPins.setText(newValue);
		} else {
			nbPins.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbPins);
		if (eefElementEditorReadOnlyState && nbPins.isEnabled()) {
			nbPins.setEnabled(false);
			nbPins.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbPins.isEnabled()) {
			nbPins.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbWires()
	 * 
	 */
	public String getNbWires() {
		return nbWires.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbWires(String
	 *      newValue)
	 * 
	 */
	public void setNbWires(String newValue) {
		if (newValue != null) {
			nbWires.setText(newValue);
		} else {
			nbWires.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbWires);
		if (eefElementEditorReadOnlyState && nbWires.isEnabled()) {
			nbWires.setEnabled(false);
			nbWires.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbWires.isEnabled()) {
			nbWires.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getMips()
	 * 
	 */
	public String getMips() {
		return mips.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setMips(String
	 *      newValue)
	 * 
	 */
	public void setMips(String newValue) {
		if (newValue != null) {
			mips.setText(newValue);
		} else {
			mips.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.mips);
		if (eefElementEditorReadOnlyState && mips.isEnabled()) {
			mips.setEnabled(false);
			mips.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mips.isEnabled()) {
			mips.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbCores()
	 * 
	 */
	public String getNbCores() {
		return nbCores.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbCores(String
	 *      newValue)
	 * 
	 */
	public void setNbCores(String newValue) {
		if (newValue != null) {
			nbCores.setText(newValue);
		} else {
			nbCores.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbCores);
		if (eefElementEditorReadOnlyState && nbCores.isEnabled()) {
			nbCores.setEnabled(false);
			nbCores.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbCores.isEnabled()) {
			nbCores.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbPipelines()
	 * 
	 */
	public String getNbPipelines() {
		return nbPipelines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbPipelines(String
	 *      newValue)
	 * 
	 */
	public void setNbPipelines(String newValue) {
		if (newValue != null) {
			nbPipelines.setText(newValue);
		} else {
			nbPipelines.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbPipelines);
		if (eefElementEditorReadOnlyState && nbPipelines.isEnabled()) {
			nbPipelines.setEnabled(false);
			nbPipelines.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbPipelines.isEnabled()) {
			nbPipelines.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbStages()
	 * 
	 */
	public String getNbStages() {
		return nbStages.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbStages(String
	 *      newValue)
	 * 
	 */
	public void setNbStages(String newValue) {
		if (newValue != null) {
			nbStages.setText(newValue);
		} else {
			nbStages.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbStages);
		if (eefElementEditorReadOnlyState && nbStages.isEnabled()) {
			nbStages.setEnabled(false);
			nbStages.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbStages.isEnabled()) {
			nbStages.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbAlus()
	 * 
	 */
	public String getNbAlus() {
		return nbAlus.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbAlus(String
	 *      newValue)
	 * 
	 */
	public void setNbAlus(String newValue) {
		if (newValue != null) {
			nbAlus.setText(newValue);
		} else {
			nbAlus.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbAlus);
		if (eefElementEditorReadOnlyState && nbAlus.isEnabled()) {
			nbAlus.setEnabled(false);
			nbAlus.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbAlus.isEnabled()) {
			nbAlus.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getNbFpus()
	 * 
	 */
	public String getNbFpus() {
		return nbFpus.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setNbFpus(String
	 *      newValue)
	 * 
	 */
	public void setNbFpus(String newValue) {
		if (newValue != null) {
			nbFpus.setText(newValue);
		} else {
			nbFpus.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.nbFpus);
		if (eefElementEditorReadOnlyState && nbFpus.isEnabled()) {
			nbFpus.setEnabled(false);
			nbFpus.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbFpus.isEnabled()) {
			nbFpus.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getSectorSize()
	 * 
	 */
	public String getSectorSize() {
		return sectorSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setSectorSize(String
	 *      newValue)
	 * 
	 */
	public void setSectorSize(String newValue) {
		if (newValue != null) {
			sectorSize.setText(newValue);
		} else {
			sectorSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.sectorSize);
		if (eefElementEditorReadOnlyState && sectorSize.isEnabled()) {
			sectorSize.setEnabled(false);
			sectorSize.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sectorSize.isEnabled()) {
			sectorSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getVirtualAddrSpace()
	 * 
	 */
	public String getVirtualAddrSpace() {
		return virtualAddrSpace.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setVirtualAddrSpace(String
	 *      newValue)
	 * 
	 */
	public void setVirtualAddrSpace(String newValue) {
		if (newValue != null) {
			virtualAddrSpace.setText(newValue);
		} else {
			virtualAddrSpace.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.virtualAddrSpace);
		if (eefElementEditorReadOnlyState && virtualAddrSpace.isEnabled()) {
			virtualAddrSpace.setEnabled(false);
			virtualAddrSpace.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !virtualAddrSpace.isEnabled()) {
			virtualAddrSpace.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getPhysicalAddrSpace()
	 * 
	 */
	public String getPhysicalAddrSpace() {
		return physicalAddrSpace.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setPhysicalAddrSpace(String
	 *      newValue)
	 * 
	 */
	public void setPhysicalAddrSpace(String newValue) {
		if (newValue != null) {
			physicalAddrSpace.setText(newValue);
		} else {
			physicalAddrSpace.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.physicalAddrSpace);
		if (eefElementEditorReadOnlyState && physicalAddrSpace.isEnabled()) {
			physicalAddrSpace.setEnabled(false);
			physicalAddrSpace.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !physicalAddrSpace.isEnabled()) {
			physicalAddrSpace.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getSourcePin()
	 * 
	 */
	public EObject getSourcePin() {
		if (sourcePin.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourcePin.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initSourcePin(EObjectFlatComboSettings)
	 */
	public void initSourcePin(EObjectFlatComboSettings settings) {
		sourcePin.setInput(settings);
		if (current != null) {
			sourcePin.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.sourcePin);
		if (eefElementEditorReadOnlyState && sourcePin.isEnabled()) {
			sourcePin.setEnabled(false);
			sourcePin.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePin.isEnabled()) {
			sourcePin.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setSourcePin(EObject
	 *      newValue)
	 * 
	 */
	public void setSourcePin(EObject newValue) {
		if (newValue != null) {
			sourcePin.setSelection(new StructuredSelection(newValue));
		} else {
			sourcePin.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.sourcePin);
		if (eefElementEditorReadOnlyState && sourcePin.isEnabled()) {
			sourcePin.setEnabled(false);
			sourcePin.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePin.isEnabled()) {
			sourcePin.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setSourcePinButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSourcePinButtonMode(ButtonsModeEnum newValue) {
		sourcePin.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterSourcePin(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSourcePin(ViewerFilter filter) {
		sourcePin.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterSourcePin(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSourcePin(ViewerFilter filter) {
		sourcePin.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#getTargetPin()
	 * 
	 */
	public EObject getTargetPin() {
		if (targetPin.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetPin.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initTargetPin(EObjectFlatComboSettings)
	 */
	public void initTargetPin(EObjectFlatComboSettings settings) {
		targetPin.setInput(settings);
		if (current != null) {
			targetPin.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.targetPin);
		if (eefElementEditorReadOnlyState && targetPin.isEnabled()) {
			targetPin.setEnabled(false);
			targetPin.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPin.isEnabled()) {
			targetPin.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setTargetPin(EObject
	 *      newValue)
	 * 
	 */
	public void setTargetPin(EObject newValue) {
		if (newValue != null) {
			targetPin.setSelection(new StructuredSelection(newValue));
		} else {
			targetPin.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.targetPin);
		if (eefElementEditorReadOnlyState && targetPin.isEnabled()) {
			targetPin.setEnabled(false);
			targetPin.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPin.isEnabled()) {
			targetPin.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#setTargetPinButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setTargetPinButtonMode(ButtonsModeEnum newValue) {
		targetPin.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterTargetPin(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToTargetPin(ViewerFilter filter) {
		targetPin.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterTargetPin(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToTargetPin(ViewerFilter filter) {
		targetPin.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initOwnedPort(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedPort(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedPort.setContentProvider(contentProvider);
		ownedPort.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.ownedPort);
		if (eefElementEditorReadOnlyState && ownedPort.isEnabled()) {
			ownedPort.setEnabled(false);
			ownedPort.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedPort.isEnabled()) {
			ownedPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updateOwnedPort()
	 * 
	 */
	public void updateOwnedPort() {
		ownedPort.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterOwnedPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOwnedPort(ViewerFilter filter) {
		ownedPortFilters.add(filter);
		if (this.ownedPort != null) {
			this.ownedPort.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterOwnedPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedPort(ViewerFilter filter) {
		ownedPortBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInOwnedPortTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedPortTable(EObject element) {
		return ((ReferencesTableSettings) ownedPort.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initOwnedPin(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedPin(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedPin.setContentProvider(contentProvider);
		ownedPin.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.ownedPin);
		if (eefElementEditorReadOnlyState && ownedPin.isEnabled()) {
			ownedPin.setEnabled(false);
			ownedPin.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedPin.isEnabled()) {
			ownedPin.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updateOwnedPin()
	 * 
	 */
	public void updateOwnedPin() {
		ownedPin.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterOwnedPin(ViewerFilter
	 *      filter)
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterOwnedPin(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedPin(ViewerFilter filter) {
		ownedPinBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInOwnedPinTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedPinTable(EObject element) {
		return ((ReferencesTableSettings) ownedPin.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initOwnedWire(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedWire(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedWire.setContentProvider(contentProvider);
		ownedWire.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.ownedWire);
		if (eefElementEditorReadOnlyState && ownedWire.isEnabled()) {
			ownedWire.setEnabled(false);
			ownedWire.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedWire.isEnabled()) {
			ownedWire.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updateOwnedWire()
	 * 
	 */
	public void updateOwnedWire() {
		ownedWire.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterOwnedWire(ViewerFilter
	 *      filter)
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterOwnedWire(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedWire(ViewerFilter filter) {
		ownedWireBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInOwnedWireTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedWireTable(EObject element) {
		return ((ReferencesTableSettings) ownedWire.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initOwnedService(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedService(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedService.setContentProvider(contentProvider);
		ownedService.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.ownedService);
		if (eefElementEditorReadOnlyState && ownedService.isEnabled()) {
			ownedService.setEnabled(false);
			ownedService.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedService.isEnabled()) {
			ownedService.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updateOwnedService()
	 * 
	 */
	public void updateOwnedService() {
		ownedService.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterOwnedService(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOwnedService(ViewerFilter filter) {
		ownedServiceFilters.add(filter);
		if (this.ownedService != null) {
			this.ownedService.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterOwnedService(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedService(ViewerFilter filter) {
		ownedServiceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInOwnedServiceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedServiceTable(EObject element) {
		return ((ReferencesTableSettings) ownedService.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initPInterface(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPInterface(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		pInterface.setContentProvider(contentProvider);
		pInterface.setInput(settings);
		pInterfaceBusinessFilters.clear();
		pInterfaceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.pInterface);
		if (eefElementEditorReadOnlyState && pInterface.getTable().isEnabled()) {
			pInterface.setEnabled(false);
			pInterface.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pInterface.getTable().isEnabled()) {
			pInterface.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updatePInterface()
	 * 
	 */
	public void updatePInterface() {
		pInterface.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterPInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToPInterface(ViewerFilter filter) {
		pInterfaceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterPInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToPInterface(ViewerFilter filter) {
		pInterfaceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInPInterfaceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInPInterfaceTable(EObject element) {
		return ((ReferencesTableSettings) pInterface.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initRInterface(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRInterface(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rInterface.setContentProvider(contentProvider);
		rInterface.setInput(settings);
		rInterfaceBusinessFilters.clear();
		rInterfaceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.rInterface);
		if (eefElementEditorReadOnlyState && rInterface.getTable().isEnabled()) {
			rInterface.setEnabled(false);
			rInterface.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rInterface.getTable().isEnabled()) {
			rInterface.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updateRInterface()
	 * 
	 */
	public void updateRInterface() {
		rInterface.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterRInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRInterface(ViewerFilter filter) {
		rInterfaceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterRInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRInterface(ViewerFilter filter) {
		rInterfaceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInRInterfaceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRInterfaceTable(EObject element) {
		return ((ReferencesTableSettings) rInterface.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initPServices(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initPServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		pServices.setContentProvider(contentProvider);
		pServices.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.pServices);
		if (eefElementEditorReadOnlyState && pServices.isEnabled()) {
			pServices.setEnabled(false);
			pServices.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pServices.isEnabled()) {
			pServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updatePServices()
	 * 
	 */
	public void updatePServices() {
		pServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterPServices(ViewerFilter
	 *      filter)
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterPServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToPServices(ViewerFilter filter) {
		pServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInPServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInPServicesTable(EObject element) {
		return ((ReferencesTableSettings) pServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initRServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rServices.setContentProvider(contentProvider);
		rServices.setInput(settings);
		rServicesBusinessFilters.clear();
		rServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.rServices);
		if (eefElementEditorReadOnlyState && rServices.getTable().isEnabled()) {
			rServices.setEnabled(false);
			rServices.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rServices.getTable().isEnabled()) {
			rServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updateRServices()
	 * 
	 */
	public void updateRServices() {
		rServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterRServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRServices(ViewerFilter filter) {
		rServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterRServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRServices(ViewerFilter filter) {
		rServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInRServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRServicesTable(EObject element) {
		return ((ReferencesTableSettings) rServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#initRConditions(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initRConditions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rConditions.setContentProvider(contentProvider);
		rConditions.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.Other.Properties.rConditions);
		if (eefElementEditorReadOnlyState && rConditions.isEnabled()) {
			rConditions.setEnabled(false);
			rConditions.setToolTipText(HrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rConditions.isEnabled()) {
			rConditions.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#updateRConditions()
	 * 
	 */
	public void updateRConditions() {
		rConditions.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addFilterRConditions(ViewerFilter
	 *      filter)
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#addBusinessFilterRConditions(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRConditions(ViewerFilter filter) {
		rConditionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.OtherPropertiesEditionPart#isContainedInRConditionsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRConditionsTable(EObject element) {
		return ((ReferencesTableSettings) rConditions.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HrmMessages.Other_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
