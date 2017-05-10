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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
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
import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.providers.SrmMessages;

// End of user code

/**
 * 
 * 
 */
public class GeneralPropertiesEditionPartForm extends SectionPropertiesEditingPart
		implements IFormPropertiesEditionPart, GeneralPropertiesEditionPart {

	protected Text name;
	protected Text elementSize;
	protected Text speedFactor;
	protected Text resMult;
	protected Text memorySizeFootprint;
	protected Button isProtected;
	protected Button isActive;
	protected Button isModifier;
	protected Button isWatchdog;
	protected Button isBuffered;
	protected Text activationCapacity;
	protected Text accessedElement;
	protected Text identifierElements;
	protected Button editIdentifierElements;
	private EList identifierElementsList;
	protected Text periodElements;
	protected Button editPeriodElements;
	private EList periodElementsList;
	protected Text stateElements;
	protected Button editStateElements;
	private EList stateElementsList;
	protected EObjectFlatComboViewer adressSpace;
	protected EObjectFlatComboViewer scheduler;
	protected EObjectFlatComboViewer mainScheduler;
	protected EObjectFlatComboViewer dependentScheduler;
	protected EObjectFlatComboViewer host;
	protected Text entryPoints;
	protected Button editEntryPoints;
	private EList entryPointsList;
	protected EMFComboViewer kind;
	protected Text isrEntryPoints;
	protected Button editIsrEntryPoints;
	private EList isrEntryPointsList;
	protected EObjectFlatComboViewer sourcePort;
	protected EObjectFlatComboViewer targetPort;
	protected EObjectFlatComboViewer start;
	protected EObjectFlatComboViewer set;
	protected EObjectFlatComboViewer get;
	protected EObjectFlatComboViewer reset;
	protected EObjectFlatComboViewer pause;
	protected ReferencesTable processingUnits;
	protected List<ViewerFilter> processingUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processingUnitsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable schedulableResource;
	protected List<ViewerFilter> schedulableResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulableResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable scheduledResource;
	protected List<ViewerFilter> scheduledResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> scheduledResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedResource;
	protected List<ViewerFilter> ownedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedElement;
	protected List<ViewerFilter> ownedElementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedElementFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedPort;
	protected List<ViewerFilter> ownedPortBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedPortFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedConnector;
	protected List<ViewerFilter> ownedConnectorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedConnectorFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable usedBy;
	protected List<ViewerFilter> usedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usedByFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable brokedResource;
	protected List<ViewerFilter> brokedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> brokedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable managedResource;
	protected List<ViewerFilter> managedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> managedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable schedParams;
	protected List<ViewerFilter> schedParamsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedParamsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable devices;
	protected List<ViewerFilter> devicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> devicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable memories;
	protected List<ViewerFilter> memoriesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> memoriesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable sharedDataResources;
	protected List<ViewerFilter> sharedDataResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sharedDataResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable messageResources;
	protected List<ViewerFilter> messageResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> messageResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable notificationResources;
	protected List<ViewerFilter> notificationResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> notificationResourcesFilters = new ArrayList<ViewerFilter>();

	/**
	 * For {@link ISection} use only.
	 */
	public GeneralPropertiesEditionPartForm() {
		super();
	}

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GeneralPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence generalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = generalStep.addStep(SrmViewsRepository.General.Properties.class);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.name);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.elementSize);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.speedFactor);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.resMult);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.memorySizeFootprint);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.isProtected);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.isActive);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.isModifier);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.isWatchdog);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.isBuffered);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.activationCapacity);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.accessedElement);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.identifierElements);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.periodElements);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.stateElements);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.adressSpace);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.scheduler);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.mainScheduler);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.dependentScheduler);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.host);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.entryPoints);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.kind);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.isrEntryPoints);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.sourcePort);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.targetPort);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.start);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.set);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.get);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.reset);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.pause);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.processingUnits);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.schedulableResource);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.scheduledResource);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.ownedResource);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.ownedElement);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.ownedPort);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.ownedConnector);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.usedBy);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.brokedResource);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.managedResource);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.schedParams);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.devices);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.memories);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.sharedDataResources);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.messageResources);
		propertiesStep.addStep(SrmViewsRepository.General.Properties.notificationResources);

		composer = new PartComposer(generalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SrmViewsRepository.General.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.elementSize) {
					return createElementSizeText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.speedFactor) {
					return createSpeedFactorText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.resMult) {
					return createResMultText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.memorySizeFootprint) {
					return createMemorySizeFootprintText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.isProtected) {
					return createIsProtectedCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.isActive) {
					return createIsActiveCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.isModifier) {
					return createIsModifierCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.isWatchdog) {
					return createIsWatchdogCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.isBuffered) {
					return createIsBufferedCheckbox(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.activationCapacity) {
					return createActivationCapacityText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.accessedElement) {
					return createAccessedElementText(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.identifierElements) {
					return createIdentifierElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.periodElements) {
					return createPeriodElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.stateElements) {
					return createStateElementsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.adressSpace) {
					return createAdressSpaceFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.scheduler) {
					return createSchedulerFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.mainScheduler) {
					return createMainSchedulerFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.dependentScheduler) {
					return createDependentSchedulerFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.host) {
					return createHostFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.entryPoints) {
					return createEntryPointsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.kind) {
					return createKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.isrEntryPoints) {
					return createIsrEntryPointsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.sourcePort) {
					return createSourcePortFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.targetPort) {
					return createTargetPortFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.start) {
					return createStartFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.set) {
					return createSetFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.get) {
					return createGetFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.reset) {
					return createResetFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.pause) {
					return createPauseFlatComboViewer(parent, widgetFactory);
				}
				if (key == SrmViewsRepository.General.Properties.processingUnits) {
					return createProcessingUnitsReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.schedulableResource) {
					return createSchedulableResourceReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.scheduledResource) {
					return createScheduledResourceReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.ownedResource) {
					return createOwnedResourceTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.ownedElement) {
					return createOwnedElementTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.ownedPort) {
					return createOwnedPortTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.ownedConnector) {
					return createOwnedConnectorTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.usedBy) {
					return createUsedByReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.brokedResource) {
					return createBrokedResourceReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.managedResource) {
					return createManagedResourceReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.schedParams) {
					return createSchedParamsTableComposition(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.devices) {
					return createDevicesReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.memories) {
					return createMemoriesReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.sharedDataResources) {
					return createSharedDataResourcesReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.messageResources) {
					return createMessageResourcesReferencesTable(widgetFactory, parent);
				}
				if (key == SrmViewsRepository.General.Properties.notificationResources) {
					return createNotificationResourcesReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(SrmMessages.GeneralPropertiesEditionPart_PropertiesGroupLabel);
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

	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.name,
				SrmMessages.GeneralPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.name, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
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
								GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.name,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SrmViewsRepository.General.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.name, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	protected Composite createElementSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.elementSize,
				SrmMessages.GeneralPropertiesEditionPart_ElementSizeLabel);
		elementSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		elementSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData elementSizeData = new GridData(GridData.FILL_HORIZONTAL);
		elementSize.setLayoutData(elementSizeData);
		elementSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.elementSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, elementSize.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.elementSize,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							elementSize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		elementSize.addKeyListener(new KeyAdapter() {
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
								GeneralPropertiesEditionPartForm.this,
								SrmViewsRepository.General.Properties.elementSize, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, elementSize.getText()));
				}
			}
		});
		EditingUtils.setID(elementSize, SrmViewsRepository.General.Properties.elementSize);
		EditingUtils.setEEFtype(elementSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.elementSize, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createElementSizeText

		// End of user code
		return parent;
	}

	protected Composite createSpeedFactorText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.speedFactor,
				SrmMessages.GeneralPropertiesEditionPart_SpeedFactorLabel);
		speedFactor = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		speedFactor.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData speedFactorData = new GridData(GridData.FILL_HORIZONTAL);
		speedFactor.setLayoutData(speedFactorData);
		speedFactor.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.speedFactor,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.speedFactor,
							PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
							speedFactor.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		speedFactor.addKeyListener(new KeyAdapter() {
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
								GeneralPropertiesEditionPartForm.this,
								SrmViewsRepository.General.Properties.speedFactor, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, speedFactor.getText()));
				}
			}
		});
		EditingUtils.setID(speedFactor, SrmViewsRepository.General.Properties.speedFactor);
		EditingUtils.setEEFtype(speedFactor, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.speedFactor, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createSpeedFactorText

		// End of user code
		return parent;
	}

	protected Composite createResMultText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.resMult,
				SrmMessages.GeneralPropertiesEditionPart_ResMultLabel);
		resMult = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		resMult.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData resMultData = new GridData(GridData.FILL_HORIZONTAL);
		resMult.setLayoutData(resMultData);
		resMult.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.resMult,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resMult.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.resMult, PropertiesEditionEvent.FOCUS_CHANGED,
									PropertiesEditionEvent.FOCUS_LOST, null, resMult.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		resMult.addKeyListener(new KeyAdapter() {
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
								GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.resMult,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resMult.getText()));
				}
			}
		});
		EditingUtils.setID(resMult, SrmViewsRepository.General.Properties.resMult);
		EditingUtils.setEEFtype(resMult, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.resMult, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createResMultText

		// End of user code
		return parent;
	}

	protected Composite createMemorySizeFootprintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.memorySizeFootprint,
				SrmMessages.GeneralPropertiesEditionPart_MemorySizeFootprintLabel);
		memorySizeFootprint = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		memorySizeFootprint.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData memorySizeFootprintData = new GridData(GridData.FILL_HORIZONTAL);
		memorySizeFootprint.setLayoutData(memorySizeFootprintData);
		memorySizeFootprint.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.memorySizeFootprint, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, memorySizeFootprint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.memorySizeFootprint,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
									memorySizeFootprint.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		memorySizeFootprint.addKeyListener(new KeyAdapter() {
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
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.memorySizeFootprint,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										memorySizeFootprint.getText()));
				}
			}
		});
		EditingUtils.setID(memorySizeFootprint, SrmViewsRepository.General.Properties.memorySizeFootprint);
		EditingUtils.setEEFtype(memorySizeFootprint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.General.Properties.memorySizeFootprint, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createMemorySizeFootprintText

		// End of user code
		return parent;
	}

	protected Composite createIsProtectedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isProtected = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.General.Properties.isProtected,
						SrmMessages.GeneralPropertiesEditionPart_IsProtectedLabel),
				SWT.CHECK);
		isProtected.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.isProtected, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isProtected.getSelection())));
			}

		});
		GridData isProtectedData = new GridData(GridData.FILL_HORIZONTAL);
		isProtectedData.horizontalSpan = 2;
		isProtected.setLayoutData(isProtectedData);
		EditingUtils.setID(isProtected, SrmViewsRepository.General.Properties.isProtected);
		EditingUtils.setEEFtype(isProtected, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.isProtected, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsProtectedCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsActiveCheckbox(FormToolkit widgetFactory, Composite parent) {
		isActive = widgetFactory.createButton(parent, getDescription(SrmViewsRepository.General.Properties.isActive,
				SrmMessages.GeneralPropertiesEditionPart_IsActiveLabel), SWT.CHECK);
		isActive.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.isActive, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isActive.getSelection())));
			}

		});
		GridData isActiveData = new GridData(GridData.FILL_HORIZONTAL);
		isActiveData.horizontalSpan = 2;
		isActive.setLayoutData(isActiveData);
		EditingUtils.setID(isActive, SrmViewsRepository.General.Properties.isActive);
		EditingUtils.setEEFtype(isActive, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.isActive, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsActiveCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsModifierCheckbox(FormToolkit widgetFactory, Composite parent) {
		isModifier = widgetFactory.createButton(parent, getDescription(SrmViewsRepository.General.Properties.isModifier,
				SrmMessages.GeneralPropertiesEditionPart_IsModifierLabel), SWT.CHECK);
		isModifier.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.isModifier, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isModifier.getSelection())));
			}

		});
		GridData isModifierData = new GridData(GridData.FILL_HORIZONTAL);
		isModifierData.horizontalSpan = 2;
		isModifier.setLayoutData(isModifierData);
		EditingUtils.setID(isModifier, SrmViewsRepository.General.Properties.isModifier);
		EditingUtils.setEEFtype(isModifier, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.isModifier, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsModifierCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsWatchdogCheckbox(FormToolkit widgetFactory, Composite parent) {
		isWatchdog = widgetFactory.createButton(parent, getDescription(SrmViewsRepository.General.Properties.isWatchdog,
				SrmMessages.GeneralPropertiesEditionPart_IsWatchdogLabel), SWT.CHECK);
		isWatchdog.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.isWatchdog, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isWatchdog.getSelection())));
			}

		});
		GridData isWatchdogData = new GridData(GridData.FILL_HORIZONTAL);
		isWatchdogData.horizontalSpan = 2;
		isWatchdog.setLayoutData(isWatchdogData);
		EditingUtils.setID(isWatchdog, SrmViewsRepository.General.Properties.isWatchdog);
		EditingUtils.setEEFtype(isWatchdog, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.isWatchdog, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsWatchdogCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsBufferedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isBuffered = widgetFactory.createButton(parent, getDescription(SrmViewsRepository.General.Properties.isBuffered,
				SrmMessages.GeneralPropertiesEditionPart_IsBufferedLabel), SWT.CHECK);
		isBuffered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.isBuffered, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isBuffered.getSelection())));
			}

		});
		GridData isBufferedData = new GridData(GridData.FILL_HORIZONTAL);
		isBufferedData.horizontalSpan = 2;
		isBuffered.setLayoutData(isBufferedData);
		EditingUtils.setID(isBuffered, SrmViewsRepository.General.Properties.isBuffered);
		EditingUtils.setEEFtype(isBuffered, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.isBuffered, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsBufferedCheckbox

		// End of user code
		return parent;
	}

	protected Composite createActivationCapacityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.activationCapacity,
				SrmMessages.GeneralPropertiesEditionPart_ActivationCapacityLabel);
		activationCapacity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		activationCapacity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData activationCapacityData = new GridData(GridData.FILL_HORIZONTAL);
		activationCapacity.setLayoutData(activationCapacityData);
		activationCapacity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.activationCapacity, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, activationCapacity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.activationCapacity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST, null,
									activationCapacity.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		activationCapacity.addKeyListener(new KeyAdapter() {
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
								GeneralPropertiesEditionPartForm.this,
								SrmViewsRepository.General.Properties.activationCapacity, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, activationCapacity.getText()));
				}
			}
		});
		EditingUtils.setID(activationCapacity, SrmViewsRepository.General.Properties.activationCapacity);
		EditingUtils.setEEFtype(activationCapacity, "eef::Text"); //$NON-NLS-1$
		FormUtils
				.createHelpButton(widgetFactory, parent,
						propertiesEditionComponent.getHelpContent(
								SrmViewsRepository.General.Properties.activationCapacity, SrmViewsRepository.FORM_KIND),
						null); // $NON-NLS-1$
		// Start of user code for createActivationCapacityText

		// End of user code
		return parent;
	}

	protected Composite createAccessedElementText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.accessedElement,
				SrmMessages.GeneralPropertiesEditionPart_AccessedElementLabel);
		accessedElement = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		accessedElement.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData accessedElementData = new GridData(GridData.FILL_HORIZONTAL);
		accessedElement.setLayoutData(accessedElementData);
		accessedElement.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.accessedElement, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, accessedElement.getText()));
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.accessedElement, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_LOST, null, accessedElement.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, null, PropertiesEditionEvent.FOCUS_CHANGED,
							PropertiesEditionEvent.FOCUS_GAINED, null, null));
				}
			}
		});
		accessedElement.addKeyListener(new KeyAdapter() {
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
								GeneralPropertiesEditionPartForm.this,
								SrmViewsRepository.General.Properties.accessedElement, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, accessedElement.getText()));
				}
			}
		});
		EditingUtils.setID(accessedElement, SrmViewsRepository.General.Properties.accessedElement);
		EditingUtils.setEEFtype(accessedElement, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.General.Properties.accessedElement, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createAccessedElementText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIdentifierElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		identifierElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData identifierElementsData = new GridData(GridData.FILL_HORIZONTAL);
		identifierElementsData.horizontalSpan = 2;
		identifierElements.setLayoutData(identifierElementsData);
		EditingUtils.setID(identifierElements, SrmViewsRepository.General.Properties.identifierElements);
		EditingUtils.setEEFtype(identifierElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editIdentifierElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.General.Properties.identifierElements,
						SrmMessages.GeneralPropertiesEditionPart_IdentifierElementsLabel),
				SWT.NONE);
		GridData editIdentifierElementsData = new GridData();
		editIdentifierElements.setLayoutData(editIdentifierElementsData);
		editIdentifierElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(identifierElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						identifierElementsList,
						SrmPackage.eINSTANCE.getSoftwareResource_IdentifierElements().getEType(), null, false, true,
						null, null);
				if (dialog.open() == Window.OK) {
					identifierElementsList = dialog.getResult();
					if (identifierElementsList == null) {
						identifierElementsList = new BasicEList();
					}
					identifierElements.setText(identifierElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.identifierElements, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(identifierElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editIdentifierElements, SrmViewsRepository.General.Properties.identifierElements);
		EditingUtils.setEEFtype(editIdentifierElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createIdentifierElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPeriodElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		periodElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData periodElementsData = new GridData(GridData.FILL_HORIZONTAL);
		periodElementsData.horizontalSpan = 2;
		periodElements.setLayoutData(periodElementsData);
		EditingUtils.setID(periodElements, SrmViewsRepository.General.Properties.periodElements);
		EditingUtils.setEEFtype(periodElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPeriodElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.General.Properties.periodElements,
						SrmMessages.GeneralPropertiesEditionPart_PeriodElementsLabel),
				SWT.NONE);
		GridData editPeriodElementsData = new GridData();
		editPeriodElements.setLayoutData(editPeriodElementsData);
		editPeriodElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(periodElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						periodElementsList,
						SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PeriodElements().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					periodElementsList = dialog.getResult();
					if (periodElementsList == null) {
						periodElementsList = new BasicEList();
					}
					periodElements.setText(periodElementsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.periodElements, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(periodElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPeriodElements, SrmViewsRepository.General.Properties.periodElements);
		EditingUtils.setEEFtype(editPeriodElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createPeriodElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createStateElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		stateElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData stateElementsData = new GridData(GridData.FILL_HORIZONTAL);
		stateElementsData.horizontalSpan = 2;
		stateElements.setLayoutData(stateElementsData);
		EditingUtils.setID(stateElements, SrmViewsRepository.General.Properties.stateElements);
		EditingUtils.setEEFtype(stateElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editStateElements = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.General.Properties.stateElements,
						SrmMessages.GeneralPropertiesEditionPart_StateElementsLabel),
				SWT.NONE);
		GridData editStateElementsData = new GridData();
		editStateElements.setLayoutData(editStateElementsData);
		editStateElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(stateElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						stateElementsList, SrmPackage.eINSTANCE.getSoftwareResource_StateElements().getEType(), null,
						false, true, null, null);
				if (dialog.open() == Window.OK) {
					stateElementsList = dialog.getResult();
					if (stateElementsList == null) {
						stateElementsList = new BasicEList();
					}
					stateElements.setText(stateElementsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.stateElements, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(stateElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editStateElements, SrmViewsRepository.General.Properties.stateElements);
		EditingUtils.setEEFtype(editStateElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createStateElementsMultiValuedEditor

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
	protected Composite createAdressSpaceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.adressSpace,
				SrmMessages.GeneralPropertiesEditionPart_AdressSpaceLabel);
		adressSpace = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.adressSpace, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(adressSpace);
		adressSpace.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData adressSpaceData = new GridData(GridData.FILL_HORIZONTAL);
		adressSpace.setLayoutData(adressSpaceData);
		adressSpace.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.adressSpace,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAdressSpace()));
			}

		});
		adressSpace.setID(SrmViewsRepository.General.Properties.adressSpace);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.adressSpace, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createAdressSpaceFlatComboViewer

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
	protected Composite createSchedulerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.scheduler,
				SrmMessages.GeneralPropertiesEditionPart_SchedulerLabel);
		scheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.scheduler, SrmViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.scheduler,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getScheduler()));
			}

		});
		scheduler.setID(SrmViewsRepository.General.Properties.scheduler);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.scheduler, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createSchedulerFlatComboViewer

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
	protected Composite createMainSchedulerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.mainScheduler,
				SrmMessages.GeneralPropertiesEditionPart_MainSchedulerLabel);
		mainScheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.mainScheduler, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(mainScheduler);
		mainScheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData mainSchedulerData = new GridData(GridData.FILL_HORIZONTAL);
		mainScheduler.setLayoutData(mainSchedulerData);
		mainScheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.mainScheduler,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMainScheduler()));
			}

		});
		mainScheduler.setID(SrmViewsRepository.General.Properties.mainScheduler);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.General.Properties.mainScheduler, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createMainSchedulerFlatComboViewer

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
	protected Composite createDependentSchedulerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.dependentScheduler,
				SrmMessages.GeneralPropertiesEditionPart_DependentSchedulerLabel);
		dependentScheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.dependentScheduler, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(dependentScheduler);
		dependentScheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData dependentSchedulerData = new GridData(GridData.FILL_HORIZONTAL);
		dependentScheduler.setLayoutData(dependentSchedulerData);
		dependentScheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.dependentScheduler, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, getDependentScheduler()));
			}

		});
		dependentScheduler.setID(SrmViewsRepository.General.Properties.dependentScheduler);
		FormUtils
				.createHelpButton(widgetFactory, parent,
						propertiesEditionComponent.getHelpContent(
								SrmViewsRepository.General.Properties.dependentScheduler, SrmViewsRepository.FORM_KIND),
						null); // $NON-NLS-1$
		// Start of user code for createDependentSchedulerFlatComboViewer

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
	protected Composite createHostFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.host,
				SrmMessages.GeneralPropertiesEditionPart_HostLabel);
		host = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.host, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(host);
		host.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData hostData = new GridData(GridData.FILL_HORIZONTAL);
		host.setLayoutData(hostData);
		host.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.host,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getHost()));
			}

		});
		host.setID(SrmViewsRepository.General.Properties.host);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.host, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createHostFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEntryPointsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		entryPoints = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData entryPointsData = new GridData(GridData.FILL_HORIZONTAL);
		entryPointsData.horizontalSpan = 2;
		entryPoints.setLayoutData(entryPointsData);
		EditingUtils.setID(entryPoints, SrmViewsRepository.General.Properties.entryPoints);
		EditingUtils.setEEFtype(entryPoints, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editEntryPoints = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.General.Properties.entryPoints,
						SrmMessages.GeneralPropertiesEditionPart_EntryPointsLabel),
				SWT.NONE);
		GridData editEntryPointsData = new GridData();
		editEntryPoints.setLayoutData(editEntryPointsData);
		editEntryPoints.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(entryPoints.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						entryPointsList, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EntryPoints().getEType(),
						null, false, true, null, null);
				if (dialog.open() == Window.OK) {
					entryPointsList = dialog.getResult();
					if (entryPointsList == null) {
						entryPointsList = new BasicEList();
					}
					entryPoints.setText(entryPointsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.entryPoints, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(entryPointsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editEntryPoints, SrmViewsRepository.General.Properties.entryPoints);
		EditingUtils.setEEFtype(editEntryPoints, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createEntryPointsMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SrmViewsRepository.General.Properties.kind,
				SrmMessages.GeneralPropertiesEditionPart_KindLabel);
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
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.kind,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(SrmViewsRepository.General.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.kind, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createKindEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIsrEntryPointsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		isrEntryPoints = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData isrEntryPointsData = new GridData(GridData.FILL_HORIZONTAL);
		isrEntryPointsData.horizontalSpan = 2;
		isrEntryPoints.setLayoutData(isrEntryPointsData);
		EditingUtils.setID(isrEntryPoints, SrmViewsRepository.General.Properties.isrEntryPoints);
		EditingUtils.setEEFtype(isrEntryPoints, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editIsrEntryPoints = widgetFactory.createButton(parent,
				getDescription(SrmViewsRepository.General.Properties.isrEntryPoints,
						SrmMessages.GeneralPropertiesEditionPart_IsrEntryPointsLabel),
				SWT.NONE);
		GridData editIsrEntryPointsData = new GridData();
		editIsrEntryPoints.setLayoutData(editIsrEntryPointsData);
		editIsrEntryPoints.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(isrEntryPoints.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						isrEntryPointsList, SrmPackage.eINSTANCE.getInterruptResource_IsrEntryPoints().getEType(), null,
						false, true, null, null);
				if (dialog.open() == Window.OK) {
					isrEntryPointsList = dialog.getResult();
					if (isrEntryPointsList == null) {
						isrEntryPointsList = new BasicEList();
					}
					isrEntryPoints.setText(isrEntryPointsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.isrEntryPoints, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(isrEntryPointsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editIsrEntryPoints, SrmViewsRepository.General.Properties.isrEntryPoints);
		EditingUtils.setEEFtype(editIsrEntryPoints, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createIsrEntryPointsMultiValuedEditor

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
	protected Composite createSourcePortFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.sourcePort,
				SrmMessages.GeneralPropertiesEditionPart_SourcePortLabel);
		sourcePort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.sourcePort, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(sourcePort);
		sourcePort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourcePortData = new GridData(GridData.FILL_HORIZONTAL);
		sourcePort.setLayoutData(sourcePortData);
		sourcePort.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.sourcePort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSourcePort()));
			}

		});
		sourcePort.setID(SrmViewsRepository.General.Properties.sourcePort);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.sourcePort, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createSourcePortFlatComboViewer

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
	protected Composite createTargetPortFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.targetPort,
				SrmMessages.GeneralPropertiesEditionPart_TargetPortLabel);
		targetPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.targetPort, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(targetPort);
		targetPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetPortData = new GridData(GridData.FILL_HORIZONTAL);
		targetPort.setLayoutData(targetPortData);
		targetPort.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.targetPort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTargetPort()));
			}

		});
		targetPort.setID(SrmViewsRepository.General.Properties.targetPort);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.targetPort, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createTargetPortFlatComboViewer

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
	protected Composite createStartFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.start,
				SrmMessages.GeneralPropertiesEditionPart_StartLabel);
		start = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.start, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(start);
		start.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData startData = new GridData(GridData.FILL_HORIZONTAL);
		start.setLayoutData(startData);
		start.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.start,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStart()));
			}

		});
		start.setID(SrmViewsRepository.General.Properties.start);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.start, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createStartFlatComboViewer

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
	protected Composite createSetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.set,
				SrmMessages.GeneralPropertiesEditionPart_SetLabel);
		set = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.set, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(set);
		set.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData setData = new GridData(GridData.FILL_HORIZONTAL);
		set.setLayoutData(setData);
		set.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.set,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSet()));
			}

		});
		set.setID(SrmViewsRepository.General.Properties.set);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.set, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createSetFlatComboViewer

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
	protected Composite createGetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.get,
				SrmMessages.GeneralPropertiesEditionPart_GetLabel);
		get = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.get, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(get);
		get.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData getData = new GridData(GridData.FILL_HORIZONTAL);
		get.setLayoutData(getData);
		get.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.get,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGet()));
			}

		});
		get.setID(SrmViewsRepository.General.Properties.get);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.get, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createGetFlatComboViewer

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
	protected Composite createResetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.reset,
				SrmMessages.GeneralPropertiesEditionPart_ResetLabel);
		reset = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.reset, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(reset);
		reset.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData resetData = new GridData(GridData.FILL_HORIZONTAL);
		reset.setLayoutData(resetData);
		reset.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.reset,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReset()));
			}

		});
		reset.setID(SrmViewsRepository.General.Properties.reset);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.reset, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createResetFlatComboViewer

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
	protected Composite createPauseFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SrmViewsRepository.General.Properties.pause,
				SrmMessages.GeneralPropertiesEditionPart_PauseLabel);
		pause = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(SrmViewsRepository.General.Properties.pause, SrmViewsRepository.FORM_KIND));
		widgetFactory.adapt(pause);
		pause.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData pauseData = new GridData(GridData.FILL_HORIZONTAL);
		pause.setLayoutData(pauseData);
		pause.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.pause,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPause()));
			}

		});
		pause.setID(SrmViewsRepository.General.Properties.pause);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.pause, SrmViewsRepository.FORM_KIND), null); // $NON-NLS-1$
		// Start of user code for createPauseFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessingUnitsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processingUnits = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.processingUnits,
				SrmMessages.GeneralPropertiesEditionPart_ProcessingUnitsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addProcessingUnits();
					}

					public void handleEdit(EObject element) {
						editProcessingUnits(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveProcessingUnits(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromProcessingUnits(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.processingUnits.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.processingUnits, SrmViewsRepository.FORM_KIND));
		this.processingUnits.createControls(parent, widgetFactory);
		this.processingUnits.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.processingUnits, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData processingUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		processingUnitsData.horizontalSpan = 3;
		this.processingUnits.setLayoutData(processingUnitsData);
		this.processingUnits.disableMove();
		processingUnits.setID(SrmViewsRepository.General.Properties.processingUnits);
		processingUnits.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createProcessingUnitsReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcessingUnits() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processingUnits.getInput(),
				processingUnitsFilters, processingUnitsBusinessFilters, "processingUnits",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.processingUnits,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processingUnits.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcessingUnits(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.processingUnits,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processingUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessingUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.processingUnits,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processingUnits.refresh();
	}

	/**
	 * 
	 */
	protected void editProcessingUnits(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processingUnits.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSchedulableResourceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.schedulableResource = new ReferencesTable(
				getDescription(SrmViewsRepository.General.Properties.schedulableResource,
						SrmMessages.GeneralPropertiesEditionPart_SchedulableResourceLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addSchedulableResource();
					}

					public void handleEdit(EObject element) {
						editSchedulableResource(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveSchedulableResource(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromSchedulableResource(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.schedulableResource.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.General.Properties.schedulableResource, SrmViewsRepository.FORM_KIND));
		this.schedulableResource.createControls(parent, widgetFactory);
		this.schedulableResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.schedulableResource, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData schedulableResourceData = new GridData(GridData.FILL_HORIZONTAL);
		schedulableResourceData.horizontalSpan = 3;
		this.schedulableResource.setLayoutData(schedulableResourceData);
		this.schedulableResource.disableMove();
		schedulableResource.setID(SrmViewsRepository.General.Properties.schedulableResource);
		schedulableResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSchedulableResourceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSchedulableResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(schedulableResource.getInput(),
				schedulableResourceFilters, schedulableResourceBusinessFilters, "schedulableResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.schedulableResource,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				schedulableResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSchedulableResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.schedulableResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		schedulableResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSchedulableResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.schedulableResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		schedulableResource.refresh();
	}

	/**
	 * 
	 */
	protected void editSchedulableResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				schedulableResource.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createScheduledResourceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.scheduledResource = new ReferencesTable(
				getDescription(SrmViewsRepository.General.Properties.scheduledResource,
						SrmMessages.GeneralPropertiesEditionPart_ScheduledResourceLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addScheduledResource();
					}

					public void handleEdit(EObject element) {
						editScheduledResource(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveScheduledResource(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromScheduledResource(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.scheduledResource.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.scheduledResource, SrmViewsRepository.FORM_KIND));
		this.scheduledResource.createControls(parent, widgetFactory);
		this.scheduledResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.scheduledResource, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData scheduledResourceData = new GridData(GridData.FILL_HORIZONTAL);
		scheduledResourceData.horizontalSpan = 3;
		this.scheduledResource.setLayoutData(scheduledResourceData);
		this.scheduledResource.disableMove();
		scheduledResource.setID(SrmViewsRepository.General.Properties.scheduledResource);
		scheduledResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createScheduledResourceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addScheduledResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(scheduledResource.getInput(),
				scheduledResourceFilters, scheduledResourceBusinessFilters, "scheduledResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.scheduledResource,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				scheduledResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveScheduledResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.scheduledResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		scheduledResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromScheduledResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.scheduledResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		scheduledResource.refresh();
	}

	/**
	 * 
	 */
	protected void editScheduledResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				scheduledResource.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedResourceTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedResource = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.ownedResource,
				SrmMessages.GeneralPropertiesEditionPart_OwnedResourceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedResource.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedResource.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedResource.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedResource.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedResourceFilters) {
			this.ownedResource.addFilter(filter);
		}
		this.ownedResource.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.ownedResource, SrmViewsRepository.FORM_KIND));
		this.ownedResource.createControls(parent, widgetFactory);
		this.ownedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		ownedResourceData.horizontalSpan = 3;
		this.ownedResource.setLayoutData(ownedResourceData);
		this.ownedResource.setLowerBound(0);
		this.ownedResource.setUpperBound(-1);
		ownedResource.setID(SrmViewsRepository.General.Properties.ownedResource);
		ownedResource.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedResourceTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedElementTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedElement = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.ownedElement,
				SrmMessages.GeneralPropertiesEditionPart_OwnedElementLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedElement.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedElement.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedElement.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedElement.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedElementFilters) {
			this.ownedElement.addFilter(filter);
		}
		this.ownedElement.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.ownedElement, SrmViewsRepository.FORM_KIND));
		this.ownedElement.createControls(parent, widgetFactory);
		this.ownedElement.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.ownedElement, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedElementData = new GridData(GridData.FILL_HORIZONTAL);
		ownedElementData.horizontalSpan = 3;
		this.ownedElement.setLayoutData(ownedElementData);
		this.ownedElement.setLowerBound(0);
		this.ownedElement.setUpperBound(-1);
		ownedElement.setID(SrmViewsRepository.General.Properties.ownedElement);
		ownedElement.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedElementTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedPortTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedPort = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.ownedPort,
				SrmMessages.GeneralPropertiesEditionPart_OwnedPortLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedPort.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedPort.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedPort.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.ownedPort,
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
				.getHelpContent(SrmViewsRepository.General.Properties.ownedPort, SrmViewsRepository.FORM_KIND));
		this.ownedPort.createControls(parent, widgetFactory);
		this.ownedPort.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.ownedPort, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedPortData = new GridData(GridData.FILL_HORIZONTAL);
		ownedPortData.horizontalSpan = 3;
		this.ownedPort.setLayoutData(ownedPortData);
		this.ownedPort.setLowerBound(0);
		this.ownedPort.setUpperBound(-1);
		ownedPort.setID(SrmViewsRepository.General.Properties.ownedPort);
		ownedPort.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedPortTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedConnectorTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedConnector = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.ownedConnector,
				SrmMessages.GeneralPropertiesEditionPart_OwnedConnectorLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedConnector.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedConnector.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedConnector.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedConnector.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedConnectorFilters) {
			this.ownedConnector.addFilter(filter);
		}
		this.ownedConnector.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.ownedConnector, SrmViewsRepository.FORM_KIND));
		this.ownedConnector.createControls(parent, widgetFactory);
		this.ownedConnector.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedConnectorData = new GridData(GridData.FILL_HORIZONTAL);
		ownedConnectorData.horizontalSpan = 3;
		this.ownedConnector.setLayoutData(ownedConnectorData);
		this.ownedConnector.setLowerBound(0);
		this.ownedConnector.setUpperBound(-1);
		ownedConnector.setID(SrmViewsRepository.General.Properties.ownedConnector);
		ownedConnector.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedConnectorTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsedByReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.usedBy = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.usedBy,
				SrmMessages.GeneralPropertiesEditionPart_UsedByLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addUsedBy();
					}

					public void handleEdit(EObject element) {
						editUsedBy(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveUsedBy(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromUsedBy(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.usedBy.setHelpText(propertiesEditionComponent.getHelpContent(SrmViewsRepository.General.Properties.usedBy,
				SrmViewsRepository.FORM_KIND));
		this.usedBy.createControls(parent, widgetFactory);
		this.usedBy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.usedBy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData usedByData = new GridData(GridData.FILL_HORIZONTAL);
		usedByData.horizontalSpan = 3;
		this.usedBy.setLayoutData(usedByData);
		this.usedBy.disableMove();
		usedBy.setID(SrmViewsRepository.General.Properties.usedBy);
		usedBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createUsedByReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addUsedBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(usedBy.getInput(), usedByFilters,
				usedByBusinessFilters, "usedBy", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.usedBy,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				usedBy.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUsedBy(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.usedBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.usedBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		usedBy.refresh();
	}

	/**
	 * 
	 */
	protected void editUsedBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				usedBy.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createBrokedResourceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.brokedResource = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.brokedResource,
				SrmMessages.GeneralPropertiesEditionPart_BrokedResourceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addBrokedResource();
					}

					public void handleEdit(EObject element) {
						editBrokedResource(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveBrokedResource(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromBrokedResource(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.brokedResource.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.brokedResource, SrmViewsRepository.FORM_KIND));
		this.brokedResource.createControls(parent, widgetFactory);
		this.brokedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.brokedResource, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData brokedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		brokedResourceData.horizontalSpan = 3;
		this.brokedResource.setLayoutData(brokedResourceData);
		this.brokedResource.disableMove();
		brokedResource.setID(SrmViewsRepository.General.Properties.brokedResource);
		brokedResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createBrokedResourceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addBrokedResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(brokedResource.getInput(),
				brokedResourceFilters, brokedResourceBusinessFilters, "brokedResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.brokedResource,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				brokedResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBrokedResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.brokedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		brokedResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBrokedResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.brokedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		brokedResource.refresh();
	}

	/**
	 * 
	 */
	protected void editBrokedResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				brokedResource.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createManagedResourceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.managedResource = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.managedResource,
				SrmMessages.GeneralPropertiesEditionPart_ManagedResourceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addManagedResource();
					}

					public void handleEdit(EObject element) {
						editManagedResource(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveManagedResource(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromManagedResource(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.managedResource.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.managedResource, SrmViewsRepository.FORM_KIND));
		this.managedResource.createControls(parent, widgetFactory);
		this.managedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.managedResource, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData managedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		managedResourceData.horizontalSpan = 3;
		this.managedResource.setLayoutData(managedResourceData);
		this.managedResource.disableMove();
		managedResource.setID(SrmViewsRepository.General.Properties.managedResource);
		managedResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createManagedResourceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addManagedResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(managedResource.getInput(),
				managedResourceFilters, managedResourceBusinessFilters, "managedResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.managedResource,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				managedResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveManagedResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.managedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		managedResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromManagedResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.managedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		managedResource.refresh();
	}

	/**
	 * 
	 */
	protected void editManagedResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				managedResource.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSchedParamsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.schedParams = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.schedParams,
				SrmMessages.GeneralPropertiesEditionPart_SchedParamsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						schedParams.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						schedParams.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						schedParams.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
										SrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						schedParams.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.schedParamsFilters) {
			this.schedParams.addFilter(filter);
		}
		this.schedParams.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.schedParams, SrmViewsRepository.FORM_KIND));
		this.schedParams.createControls(parent, widgetFactory);
		this.schedParams.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.schedParams, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData schedParamsData = new GridData(GridData.FILL_HORIZONTAL);
		schedParamsData.horizontalSpan = 3;
		this.schedParams.setLayoutData(schedParamsData);
		this.schedParams.setLowerBound(0);
		this.schedParams.setUpperBound(-1);
		schedParams.setID(SrmViewsRepository.General.Properties.schedParams);
		schedParams.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSchedParamsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDevicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.devices = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.devices,
				SrmMessages.GeneralPropertiesEditionPart_DevicesLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addDevices();
					}

					public void handleEdit(EObject element) {
						editDevices(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveDevices(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromDevices(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.devices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.devices, SrmViewsRepository.FORM_KIND));
		this.devices.createControls(parent, widgetFactory);
		this.devices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.devices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData devicesData = new GridData(GridData.FILL_HORIZONTAL);
		devicesData.horizontalSpan = 3;
		this.devices.setLayoutData(devicesData);
		this.devices.disableMove();
		devices.setID(SrmViewsRepository.General.Properties.devices);
		devices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createDevicesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addDevices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(devices.getInput(), devicesFilters,
				devicesBusinessFilters, "devices", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.devices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				devices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDevices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.devices,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		devices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDevices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.devices,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		devices.refresh();
	}

	/**
	 * 
	 */
	protected void editDevices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				devices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMemoriesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.memories = new ReferencesTable(getDescription(SrmViewsRepository.General.Properties.memories,
				SrmMessages.GeneralPropertiesEditionPart_MemoriesLabel), new ReferencesTableListener() {
					public void handleAdd() {
						addMemories();
					}

					public void handleEdit(EObject element) {
						editMemories(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveMemories(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromMemories(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.memories.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.memories, SrmViewsRepository.FORM_KIND));
		this.memories.createControls(parent, widgetFactory);
		this.memories.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.memories, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData memoriesData = new GridData(GridData.FILL_HORIZONTAL);
		memoriesData.horizontalSpan = 3;
		this.memories.setLayoutData(memoriesData);
		this.memories.disableMove();
		memories.setID(SrmViewsRepository.General.Properties.memories);
		memories.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createMemoriesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addMemories() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(memories.getInput(), memoriesFilters,
				memoriesBusinessFilters, "memories", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.memories,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				memories.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMemories(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.memories,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		memories.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMemories(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.memories,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		memories.refresh();
	}

	/**
	 * 
	 */
	protected void editMemories(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				memories.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSharedDataResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.sharedDataResources = new ReferencesTable(
				getDescription(SrmViewsRepository.General.Properties.sharedDataResources,
						SrmMessages.GeneralPropertiesEditionPart_SharedDataResourcesLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addSharedDataResources();
					}

					public void handleEdit(EObject element) {
						editSharedDataResources(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveSharedDataResources(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromSharedDataResources(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.sharedDataResources.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.General.Properties.sharedDataResources, SrmViewsRepository.FORM_KIND));
		this.sharedDataResources.createControls(parent, widgetFactory);
		this.sharedDataResources.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.sharedDataResources, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData sharedDataResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		sharedDataResourcesData.horizontalSpan = 3;
		this.sharedDataResources.setLayoutData(sharedDataResourcesData);
		this.sharedDataResources.disableMove();
		sharedDataResources.setID(SrmViewsRepository.General.Properties.sharedDataResources);
		sharedDataResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSharedDataResourcesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSharedDataResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sharedDataResources.getInput(),
				sharedDataResourcesFilters, sharedDataResourcesBusinessFilters, "sharedDataResources",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.sharedDataResources,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sharedDataResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSharedDataResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.sharedDataResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sharedDataResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSharedDataResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.sharedDataResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sharedDataResources.refresh();
	}

	/**
	 * 
	 */
	protected void editSharedDataResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sharedDataResources.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMessageResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.messageResources = new ReferencesTable(
				getDescription(SrmViewsRepository.General.Properties.messageResources,
						SrmMessages.GeneralPropertiesEditionPart_MessageResourcesLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addMessageResources();
					}

					public void handleEdit(EObject element) {
						editMessageResources(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveMessageResources(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromMessageResources(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.messageResources.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.General.Properties.messageResources, SrmViewsRepository.FORM_KIND));
		this.messageResources.createControls(parent, widgetFactory);
		this.messageResources.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.messageResources, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData messageResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		messageResourcesData.horizontalSpan = 3;
		this.messageResources.setLayoutData(messageResourcesData);
		this.messageResources.disableMove();
		messageResources.setID(SrmViewsRepository.General.Properties.messageResources);
		messageResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createMessageResourcesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addMessageResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(messageResources.getInput(),
				messageResourcesFilters, messageResourcesBusinessFilters, "messageResources",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.messageResources,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				messageResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMessageResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.messageResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		messageResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMessageResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.messageResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		messageResources.refresh();
	}

	/**
	 * 
	 */
	protected void editMessageResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				messageResources.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createNotificationResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.notificationResources = new ReferencesTable(
				getDescription(SrmViewsRepository.General.Properties.notificationResources,
						SrmMessages.GeneralPropertiesEditionPart_NotificationResourcesLabel),
				new ReferencesTableListener() {
					public void handleAdd() {
						addNotificationResources();
					}

					public void handleEdit(EObject element) {
						editNotificationResources(element);
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						moveNotificationResources(element, oldIndex, newIndex);
					}

					public void handleRemove(EObject element) {
						removeFromNotificationResources(element);
					}

					public void navigateTo(EObject element) {
					}
				});
		this.notificationResources.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.General.Properties.notificationResources, SrmViewsRepository.FORM_KIND));
		this.notificationResources.createControls(parent, widgetFactory);
		this.notificationResources.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartForm.this,
							SrmViewsRepository.General.Properties.notificationResources, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData notificationResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		notificationResourcesData.horizontalSpan = 3;
		this.notificationResources.setLayoutData(notificationResourcesData);
		this.notificationResources.disableMove();
		notificationResources.setID(SrmViewsRepository.General.Properties.notificationResources);
		notificationResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createNotificationResourcesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addNotificationResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(notificationResources.getInput(),
				notificationResourcesFilters, notificationResourcesBusinessFilters, "notificationResources",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartForm.this,
									SrmViewsRepository.General.Properties.notificationResources,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				notificationResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveNotificationResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.notificationResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		notificationResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromNotificationResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartForm.this, SrmViewsRepository.General.Properties.notificationResources,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		notificationResources.refresh();
	}

	/**
	 * 
	 */
	protected void editNotificationResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				notificationResources.refresh();
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
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setName(String
	 *      newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getElementSize()
	 * 
	 */
	public String getElementSize() {
		return elementSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setElementSize(String
	 *      newValue)
	 * 
	 */
	public void setElementSize(String newValue) {
		if (newValue != null) {
			elementSize.setText(newValue);
		} else {
			elementSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.elementSize);
		if (eefElementEditorReadOnlyState && elementSize.isEnabled()) {
			elementSize.setEnabled(false);
			elementSize.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !elementSize.isEnabled()) {
			elementSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getSpeedFactor()
	 * 
	 */
	public String getSpeedFactor() {
		return speedFactor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setSpeedFactor(String
	 *      newValue)
	 * 
	 */
	public void setSpeedFactor(String newValue) {
		if (newValue != null) {
			speedFactor.setText(newValue);
		} else {
			speedFactor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.speedFactor);
		if (eefElementEditorReadOnlyState && speedFactor.isEnabled()) {
			speedFactor.setEnabled(false);
			speedFactor.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !speedFactor.isEnabled()) {
			speedFactor.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getResMult()
	 * 
	 */
	public String getResMult() {
		return resMult.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setResMult(String
	 *      newValue)
	 * 
	 */
	public void setResMult(String newValue) {
		if (newValue != null) {
			resMult.setText(newValue);
		} else {
			resMult.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.resMult);
		if (eefElementEditorReadOnlyState && resMult.isEnabled()) {
			resMult.setEnabled(false);
			resMult.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resMult.isEnabled()) {
			resMult.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getMemorySizeFootprint()
	 * 
	 */
	public String getMemorySizeFootprint() {
		return memorySizeFootprint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setMemorySizeFootprint(String
	 *      newValue)
	 * 
	 */
	public void setMemorySizeFootprint(String newValue) {
		if (newValue != null) {
			memorySizeFootprint.setText(newValue);
		} else {
			memorySizeFootprint.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.memorySizeFootprint);
		if (eefElementEditorReadOnlyState && memorySizeFootprint.isEnabled()) {
			memorySizeFootprint.setEnabled(false);
			memorySizeFootprint.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !memorySizeFootprint.isEnabled()) {
			memorySizeFootprint.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getIsProtected()
	 * 
	 */
	public Boolean getIsProtected() {
		return Boolean.valueOf(isProtected.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setIsProtected(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsProtected(Boolean newValue) {
		if (newValue != null) {
			isProtected.setSelection(newValue.booleanValue());
		} else {
			isProtected.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.isProtected);
		if (eefElementEditorReadOnlyState && isProtected.isEnabled()) {
			isProtected.setEnabled(false);
			isProtected.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isProtected.isEnabled()) {
			isProtected.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getIsActive()
	 * 
	 */
	public Boolean getIsActive() {
		return Boolean.valueOf(isActive.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setIsActive(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsActive(Boolean newValue) {
		if (newValue != null) {
			isActive.setSelection(newValue.booleanValue());
		} else {
			isActive.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.isActive);
		if (eefElementEditorReadOnlyState && isActive.isEnabled()) {
			isActive.setEnabled(false);
			isActive.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isActive.isEnabled()) {
			isActive.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getIsModifier()
	 * 
	 */
	public Boolean getIsModifier() {
		return Boolean.valueOf(isModifier.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setIsModifier(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsModifier(Boolean newValue) {
		if (newValue != null) {
			isModifier.setSelection(newValue.booleanValue());
		} else {
			isModifier.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.isModifier);
		if (eefElementEditorReadOnlyState && isModifier.isEnabled()) {
			isModifier.setEnabled(false);
			isModifier.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isModifier.isEnabled()) {
			isModifier.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getIsWatchdog()
	 * 
	 */
	public Boolean getIsWatchdog() {
		return Boolean.valueOf(isWatchdog.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setIsWatchdog(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsWatchdog(Boolean newValue) {
		if (newValue != null) {
			isWatchdog.setSelection(newValue.booleanValue());
		} else {
			isWatchdog.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.isWatchdog);
		if (eefElementEditorReadOnlyState && isWatchdog.isEnabled()) {
			isWatchdog.setEnabled(false);
			isWatchdog.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isWatchdog.isEnabled()) {
			isWatchdog.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getIsBuffered()
	 * 
	 */
	public Boolean getIsBuffered() {
		return Boolean.valueOf(isBuffered.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setIsBuffered(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsBuffered(Boolean newValue) {
		if (newValue != null) {
			isBuffered.setSelection(newValue.booleanValue());
		} else {
			isBuffered.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.isBuffered);
		if (eefElementEditorReadOnlyState && isBuffered.isEnabled()) {
			isBuffered.setEnabled(false);
			isBuffered.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isBuffered.isEnabled()) {
			isBuffered.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getActivationCapacity()
	 * 
	 */
	public String getActivationCapacity() {
		return activationCapacity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setActivationCapacity(String
	 *      newValue)
	 * 
	 */
	public void setActivationCapacity(String newValue) {
		if (newValue != null) {
			activationCapacity.setText(newValue);
		} else {
			activationCapacity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.activationCapacity);
		if (eefElementEditorReadOnlyState && activationCapacity.isEnabled()) {
			activationCapacity.setEnabled(false);
			activationCapacity.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !activationCapacity.isEnabled()) {
			activationCapacity.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getAccessedElement()
	 * 
	 */
	public String getAccessedElement() {
		return accessedElement.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setAccessedElement(String
	 *      newValue)
	 * 
	 */
	public void setAccessedElement(String newValue) {
		if (newValue != null) {
			accessedElement.setText(newValue);
		} else {
			accessedElement.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.accessedElement);
		if (eefElementEditorReadOnlyState && accessedElement.isEnabled()) {
			accessedElement.setEnabled(false);
			accessedElement.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accessedElement.isEnabled()) {
			accessedElement.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getIdentifierElements()
	 * 
	 */
	public EList getIdentifierElements() {
		return identifierElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setIdentifierElements(EList
	 *      newValue)
	 * 
	 */
	public void setIdentifierElements(EList newValue) {
		identifierElementsList = newValue;
		if (newValue != null) {
			identifierElements.setText(identifierElementsList.toString());
		} else {
			identifierElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.identifierElements);
		if (eefElementEditorReadOnlyState && identifierElements.isEnabled()) {
			identifierElements.setEnabled(false);
			identifierElements.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !identifierElements.isEnabled()) {
			identifierElements.setEnabled(true);
		}

	}

	public void addToIdentifierElements(Object newValue) {
		identifierElementsList.add(newValue);
		if (newValue != null) {
			identifierElements.setText(identifierElementsList.toString());
		} else {
			identifierElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToIdentifierElements(Object newValue) {
		identifierElementsList.remove(newValue);
		if (newValue != null) {
			identifierElements.setText(identifierElementsList.toString());
		} else {
			identifierElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getPeriodElements()
	 * 
	 */
	public EList getPeriodElements() {
		return periodElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setPeriodElements(EList
	 *      newValue)
	 * 
	 */
	public void setPeriodElements(EList newValue) {
		periodElementsList = newValue;
		if (newValue != null) {
			periodElements.setText(periodElementsList.toString());
		} else {
			periodElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.periodElements);
		if (eefElementEditorReadOnlyState && periodElements.isEnabled()) {
			periodElements.setEnabled(false);
			periodElements.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !periodElements.isEnabled()) {
			periodElements.setEnabled(true);
		}

	}

	public void addToPeriodElements(Object newValue) {
		periodElementsList.add(newValue);
		if (newValue != null) {
			periodElements.setText(periodElementsList.toString());
		} else {
			periodElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToPeriodElements(Object newValue) {
		periodElementsList.remove(newValue);
		if (newValue != null) {
			periodElements.setText(periodElementsList.toString());
		} else {
			periodElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getStateElements()
	 * 
	 */
	public EList getStateElements() {
		return stateElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setStateElements(EList
	 *      newValue)
	 * 
	 */
	public void setStateElements(EList newValue) {
		stateElementsList = newValue;
		if (newValue != null) {
			stateElements.setText(stateElementsList.toString());
		} else {
			stateElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.stateElements);
		if (eefElementEditorReadOnlyState && stateElements.isEnabled()) {
			stateElements.setEnabled(false);
			stateElements.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stateElements.isEnabled()) {
			stateElements.setEnabled(true);
		}

	}

	public void addToStateElements(Object newValue) {
		stateElementsList.add(newValue);
		if (newValue != null) {
			stateElements.setText(stateElementsList.toString());
		} else {
			stateElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToStateElements(Object newValue) {
		stateElementsList.remove(newValue);
		if (newValue != null) {
			stateElements.setText(stateElementsList.toString());
		} else {
			stateElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getAdressSpace()
	 * 
	 */
	public EObject getAdressSpace() {
		if (adressSpace.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) adressSpace.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initAdressSpace(EObjectFlatComboSettings)
	 */
	public void initAdressSpace(EObjectFlatComboSettings settings) {
		adressSpace.setInput(settings);
		if (current != null) {
			adressSpace.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.adressSpace);
		if (eefElementEditorReadOnlyState && adressSpace.isEnabled()) {
			adressSpace.setEnabled(false);
			adressSpace.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !adressSpace.isEnabled()) {
			adressSpace.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setAdressSpace(EObject
	 *      newValue)
	 * 
	 */
	public void setAdressSpace(EObject newValue) {
		if (newValue != null) {
			adressSpace.setSelection(new StructuredSelection(newValue));
		} else {
			adressSpace.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.adressSpace);
		if (eefElementEditorReadOnlyState && adressSpace.isEnabled()) {
			adressSpace.setEnabled(false);
			adressSpace.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !adressSpace.isEnabled()) {
			adressSpace.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setAdressSpaceButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setAdressSpaceButtonMode(ButtonsModeEnum newValue) {
		adressSpace.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterAdressSpace(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToAdressSpace(ViewerFilter filter) {
		adressSpace.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterAdressSpace(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToAdressSpace(ViewerFilter filter) {
		adressSpace.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getScheduler()
	 * 
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
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initScheduler(EObjectFlatComboSettings)
	 */
	public void initScheduler(EObjectFlatComboSettings settings) {
		scheduler.setInput(settings);
		if (current != null) {
			scheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setScheduler(EObject
	 *      newValue)
	 * 
	 */
	public void setScheduler(EObject newValue) {
		if (newValue != null) {
			scheduler.setSelection(new StructuredSelection(newValue));
		} else {
			scheduler.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setSchedulerButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSchedulerButtonMode(ButtonsModeEnum newValue) {
		scheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToScheduler(ViewerFilter filter) {
		scheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToScheduler(ViewerFilter filter) {
		scheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getMainScheduler()
	 * 
	 */
	public EObject getMainScheduler() {
		if (mainScheduler.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) mainScheduler.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initMainScheduler(EObjectFlatComboSettings)
	 */
	public void initMainScheduler(EObjectFlatComboSettings settings) {
		mainScheduler.setInput(settings);
		if (current != null) {
			mainScheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.mainScheduler);
		if (eefElementEditorReadOnlyState && mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(false);
			mainScheduler.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setMainScheduler(EObject
	 *      newValue)
	 * 
	 */
	public void setMainScheduler(EObject newValue) {
		if (newValue != null) {
			mainScheduler.setSelection(new StructuredSelection(newValue));
		} else {
			mainScheduler.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.mainScheduler);
		if (eefElementEditorReadOnlyState && mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(false);
			mainScheduler.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setMainSchedulerButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setMainSchedulerButtonMode(ButtonsModeEnum newValue) {
		mainScheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterMainScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMainScheduler(ViewerFilter filter) {
		mainScheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterMainScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMainScheduler(ViewerFilter filter) {
		mainScheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getDependentScheduler()
	 * 
	 */
	public EObject getDependentScheduler() {
		if (dependentScheduler.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) dependentScheduler.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initDependentScheduler(EObjectFlatComboSettings)
	 */
	public void initDependentScheduler(EObjectFlatComboSettings settings) {
		dependentScheduler.setInput(settings);
		if (current != null) {
			dependentScheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.dependentScheduler);
		if (eefElementEditorReadOnlyState && dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(false);
			dependentScheduler.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setDependentScheduler(EObject
	 *      newValue)
	 * 
	 */
	public void setDependentScheduler(EObject newValue) {
		if (newValue != null) {
			dependentScheduler.setSelection(new StructuredSelection(newValue));
		} else {
			dependentScheduler.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.dependentScheduler);
		if (eefElementEditorReadOnlyState && dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(false);
			dependentScheduler.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setDependentSchedulerButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setDependentSchedulerButtonMode(ButtonsModeEnum newValue) {
		dependentScheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterDependentScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDependentScheduler(ViewerFilter filter) {
		dependentScheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterDependentScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDependentScheduler(ViewerFilter filter) {
		dependentScheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getHost()
	 * 
	 */
	public EObject getHost() {
		if (host.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) host.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initHost(EObjectFlatComboSettings)
	 */
	public void initHost(EObjectFlatComboSettings settings) {
		host.setInput(settings);
		if (current != null) {
			host.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.host);
		if (eefElementEditorReadOnlyState && host.isEnabled()) {
			host.setEnabled(false);
			host.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !host.isEnabled()) {
			host.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setHost(EObject
	 *      newValue)
	 * 
	 */
	public void setHost(EObject newValue) {
		if (newValue != null) {
			host.setSelection(new StructuredSelection(newValue));
		} else {
			host.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.host);
		if (eefElementEditorReadOnlyState && host.isEnabled()) {
			host.setEnabled(false);
			host.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !host.isEnabled()) {
			host.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setHostButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setHostButtonMode(ButtonsModeEnum newValue) {
		host.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterHost(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToHost(ViewerFilter filter) {
		host.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterHost(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToHost(ViewerFilter filter) {
		host.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getEntryPoints()
	 * 
	 */
	public EList getEntryPoints() {
		return entryPointsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setEntryPoints(EList
	 *      newValue)
	 * 
	 */
	public void setEntryPoints(EList newValue) {
		entryPointsList = newValue;
		if (newValue != null) {
			entryPoints.setText(entryPointsList.toString());
		} else {
			entryPoints.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.entryPoints);
		if (eefElementEditorReadOnlyState && entryPoints.isEnabled()) {
			entryPoints.setEnabled(false);
			entryPoints.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !entryPoints.isEnabled()) {
			entryPoints.setEnabled(true);
		}

	}

	public void addToEntryPoints(Object newValue) {
		entryPointsList.add(newValue);
		if (newValue != null) {
			entryPoints.setText(entryPointsList.toString());
		} else {
			entryPoints.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToEntryPoints(Object newValue) {
		entryPointsList.remove(newValue);
		if (newValue != null) {
			entryPoints.setText(entryPointsList.toString());
		} else {
			entryPoints.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getKind()
	 * 
	 */
	public Enumerator getKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) kind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initKind(Object
	 *      input, Enumerator current)
	 */
	public void initKind(Object input, Enumerator current) {
		kind.setInput(input);
		kind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setKind(Enumerator
	 *      newValue)
	 * 
	 */
	public void setKind(Enumerator newValue) {
		kind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getIsrEntryPoints()
	 * 
	 */
	public EList getIsrEntryPoints() {
		return isrEntryPointsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setIsrEntryPoints(EList
	 *      newValue)
	 * 
	 */
	public void setIsrEntryPoints(EList newValue) {
		isrEntryPointsList = newValue;
		if (newValue != null) {
			isrEntryPoints.setText(isrEntryPointsList.toString());
		} else {
			isrEntryPoints.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.isrEntryPoints);
		if (eefElementEditorReadOnlyState && isrEntryPoints.isEnabled()) {
			isrEntryPoints.setEnabled(false);
			isrEntryPoints.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isrEntryPoints.isEnabled()) {
			isrEntryPoints.setEnabled(true);
		}

	}

	public void addToIsrEntryPoints(Object newValue) {
		isrEntryPointsList.add(newValue);
		if (newValue != null) {
			isrEntryPoints.setText(isrEntryPointsList.toString());
		} else {
			isrEntryPoints.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToIsrEntryPoints(Object newValue) {
		isrEntryPointsList.remove(newValue);
		if (newValue != null) {
			isrEntryPoints.setText(isrEntryPointsList.toString());
		} else {
			isrEntryPoints.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getSourcePort()
	 * 
	 */
	public EObject getSourcePort() {
		if (sourcePort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourcePort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initSourcePort(EObjectFlatComboSettings)
	 */
	public void initSourcePort(EObjectFlatComboSettings settings) {
		sourcePort.setInput(settings);
		if (current != null) {
			sourcePort.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.sourcePort);
		if (eefElementEditorReadOnlyState && sourcePort.isEnabled()) {
			sourcePort.setEnabled(false);
			sourcePort.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePort.isEnabled()) {
			sourcePort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setSourcePort(EObject
	 *      newValue)
	 * 
	 */
	public void setSourcePort(EObject newValue) {
		if (newValue != null) {
			sourcePort.setSelection(new StructuredSelection(newValue));
		} else {
			sourcePort.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.sourcePort);
		if (eefElementEditorReadOnlyState && sourcePort.isEnabled()) {
			sourcePort.setEnabled(false);
			sourcePort.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePort.isEnabled()) {
			sourcePort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setSourcePortButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSourcePortButtonMode(ButtonsModeEnum newValue) {
		sourcePort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterSourcePort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSourcePort(ViewerFilter filter) {
		sourcePort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterSourcePort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSourcePort(ViewerFilter filter) {
		sourcePort.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getTargetPort()
	 * 
	 */
	public EObject getTargetPort() {
		if (targetPort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetPort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initTargetPort(EObjectFlatComboSettings)
	 */
	public void initTargetPort(EObjectFlatComboSettings settings) {
		targetPort.setInput(settings);
		if (current != null) {
			targetPort.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.targetPort);
		if (eefElementEditorReadOnlyState && targetPort.isEnabled()) {
			targetPort.setEnabled(false);
			targetPort.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPort.isEnabled()) {
			targetPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setTargetPort(EObject
	 *      newValue)
	 * 
	 */
	public void setTargetPort(EObject newValue) {
		if (newValue != null) {
			targetPort.setSelection(new StructuredSelection(newValue));
		} else {
			targetPort.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.targetPort);
		if (eefElementEditorReadOnlyState && targetPort.isEnabled()) {
			targetPort.setEnabled(false);
			targetPort.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPort.isEnabled()) {
			targetPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setTargetPortButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setTargetPortButtonMode(ButtonsModeEnum newValue) {
		targetPort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterTargetPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToTargetPort(ViewerFilter filter) {
		targetPort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterTargetPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToTargetPort(ViewerFilter filter) {
		targetPort.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getStart()
	 * 
	 */
	public EObject getStart() {
		if (start.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) start.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initStart(EObjectFlatComboSettings)
	 */
	public void initStart(EObjectFlatComboSettings settings) {
		start.setInput(settings);
		if (current != null) {
			start.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.start);
		if (eefElementEditorReadOnlyState && start.isEnabled()) {
			start.setEnabled(false);
			start.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !start.isEnabled()) {
			start.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setStart(EObject
	 *      newValue)
	 * 
	 */
	public void setStart(EObject newValue) {
		if (newValue != null) {
			start.setSelection(new StructuredSelection(newValue));
		} else {
			start.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.start);
		if (eefElementEditorReadOnlyState && start.isEnabled()) {
			start.setEnabled(false);
			start.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !start.isEnabled()) {
			start.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setStartButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setStartButtonMode(ButtonsModeEnum newValue) {
		start.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterStart(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToStart(ViewerFilter filter) {
		start.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterStart(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToStart(ViewerFilter filter) {
		start.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getSet()
	 * 
	 */
	public EObject getSet() {
		if (set.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) set.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initSet(EObjectFlatComboSettings)
	 */
	public void initSet(EObjectFlatComboSettings settings) {
		set.setInput(settings);
		if (current != null) {
			set.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.set);
		if (eefElementEditorReadOnlyState && set.isEnabled()) {
			set.setEnabled(false);
			set.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !set.isEnabled()) {
			set.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setSet(EObject
	 *      newValue)
	 * 
	 */
	public void setSet(EObject newValue) {
		if (newValue != null) {
			set.setSelection(new StructuredSelection(newValue));
		} else {
			set.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.set);
		if (eefElementEditorReadOnlyState && set.isEnabled()) {
			set.setEnabled(false);
			set.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !set.isEnabled()) {
			set.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setSetButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSetButtonMode(ButtonsModeEnum newValue) {
		set.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterSet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSet(ViewerFilter filter) {
		set.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterSet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSet(ViewerFilter filter) {
		set.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getGet()
	 * 
	 */
	public EObject getGet() {
		if (get.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) get.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initGet(EObjectFlatComboSettings)
	 */
	public void initGet(EObjectFlatComboSettings settings) {
		get.setInput(settings);
		if (current != null) {
			get.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.get);
		if (eefElementEditorReadOnlyState && get.isEnabled()) {
			get.setEnabled(false);
			get.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !get.isEnabled()) {
			get.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setGet(EObject
	 *      newValue)
	 * 
	 */
	public void setGet(EObject newValue) {
		if (newValue != null) {
			get.setSelection(new StructuredSelection(newValue));
		} else {
			get.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.get);
		if (eefElementEditorReadOnlyState && get.isEnabled()) {
			get.setEnabled(false);
			get.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !get.isEnabled()) {
			get.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setGetButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setGetButtonMode(ButtonsModeEnum newValue) {
		get.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterGet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToGet(ViewerFilter filter) {
		get.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterGet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToGet(ViewerFilter filter) {
		get.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getReset()
	 * 
	 */
	public EObject getReset() {
		if (reset.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) reset.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initReset(EObjectFlatComboSettings)
	 */
	public void initReset(EObjectFlatComboSettings settings) {
		reset.setInput(settings);
		if (current != null) {
			reset.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.reset);
		if (eefElementEditorReadOnlyState && reset.isEnabled()) {
			reset.setEnabled(false);
			reset.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reset.isEnabled()) {
			reset.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setReset(EObject
	 *      newValue)
	 * 
	 */
	public void setReset(EObject newValue) {
		if (newValue != null) {
			reset.setSelection(new StructuredSelection(newValue));
		} else {
			reset.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.reset);
		if (eefElementEditorReadOnlyState && reset.isEnabled()) {
			reset.setEnabled(false);
			reset.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reset.isEnabled()) {
			reset.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setResetButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setResetButtonMode(ButtonsModeEnum newValue) {
		reset.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterReset(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToReset(ViewerFilter filter) {
		reset.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterReset(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToReset(ViewerFilter filter) {
		reset.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#getPause()
	 * 
	 */
	public EObject getPause() {
		if (pause.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) pause.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initPause(EObjectFlatComboSettings)
	 */
	public void initPause(EObjectFlatComboSettings settings) {
		pause.setInput(settings);
		if (current != null) {
			pause.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.pause);
		if (eefElementEditorReadOnlyState && pause.isEnabled()) {
			pause.setEnabled(false);
			pause.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pause.isEnabled()) {
			pause.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setPause(EObject
	 *      newValue)
	 * 
	 */
	public void setPause(EObject newValue) {
		if (newValue != null) {
			pause.setSelection(new StructuredSelection(newValue));
		} else {
			pause.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.pause);
		if (eefElementEditorReadOnlyState && pause.isEnabled()) {
			pause.setEnabled(false);
			pause.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pause.isEnabled()) {
			pause.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#setPauseButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setPauseButtonMode(ButtonsModeEnum newValue) {
		pause.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterPause(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToPause(ViewerFilter filter) {
		pause.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterPause(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToPause(ViewerFilter filter) {
		pause.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initProcessingUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessingUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processingUnits.setContentProvider(contentProvider);
		processingUnits.setInput(settings);
		processingUnitsBusinessFilters.clear();
		processingUnitsFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.processingUnits);
		if (eefElementEditorReadOnlyState && processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(false);
			processingUnits.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateProcessingUnits()
	 * 
	 */
	public void updateProcessingUnits() {
		processingUnits.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterProcessingUnits(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterProcessingUnits(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInProcessingUnitsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInProcessingUnitsTable(EObject element) {
		return ((ReferencesTableSettings) processingUnits.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initSchedulableResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSchedulableResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulableResource.setContentProvider(contentProvider);
		schedulableResource.setInput(settings);
		schedulableResourceBusinessFilters.clear();
		schedulableResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.schedulableResource);
		if (eefElementEditorReadOnlyState && schedulableResource.getTable().isEnabled()) {
			schedulableResource.setEnabled(false);
			schedulableResource.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedulableResource.getTable().isEnabled()) {
			schedulableResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateSchedulableResource()
	 * 
	 */
	public void updateSchedulableResource() {
		schedulableResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterSchedulableResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSchedulableResource(ViewerFilter filter) {
		schedulableResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterSchedulableResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSchedulableResource(ViewerFilter filter) {
		schedulableResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInSchedulableResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSchedulableResourceTable(EObject element) {
		return ((ReferencesTableSettings) schedulableResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initScheduledResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initScheduledResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		scheduledResource.setContentProvider(contentProvider);
		scheduledResource.setInput(settings);
		scheduledResourceBusinessFilters.clear();
		scheduledResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.scheduledResource);
		if (eefElementEditorReadOnlyState && scheduledResource.getTable().isEnabled()) {
			scheduledResource.setEnabled(false);
			scheduledResource.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduledResource.getTable().isEnabled()) {
			scheduledResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateScheduledResource()
	 * 
	 */
	public void updateScheduledResource() {
		scheduledResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterScheduledResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToScheduledResource(ViewerFilter filter) {
		scheduledResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterScheduledResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToScheduledResource(ViewerFilter filter) {
		scheduledResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInScheduledResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInScheduledResourceTable(EObject element) {
		return ((ReferencesTableSettings) scheduledResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initOwnedResource(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedResource.setContentProvider(contentProvider);
		ownedResource.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.ownedResource);
		if (eefElementEditorReadOnlyState && ownedResource.isEnabled()) {
			ownedResource.setEnabled(false);
			ownedResource.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedResource.isEnabled()) {
			ownedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateOwnedResource()
	 * 
	 */
	public void updateOwnedResource() {
		ownedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterOwnedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOwnedResource(ViewerFilter filter) {
		ownedResourceFilters.add(filter);
		if (this.ownedResource != null) {
			this.ownedResource.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedResource(ViewerFilter filter) {
		ownedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInOwnedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedResourceTable(EObject element) {
		return ((ReferencesTableSettings) ownedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initOwnedElement(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedElement.setContentProvider(contentProvider);
		ownedElement.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.ownedElement);
		if (eefElementEditorReadOnlyState && ownedElement.isEnabled()) {
			ownedElement.setEnabled(false);
			ownedElement.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedElement.isEnabled()) {
			ownedElement.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateOwnedElement()
	 * 
	 */
	public void updateOwnedElement() {
		ownedElement.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterOwnedElement(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOwnedElement(ViewerFilter filter) {
		ownedElementFilters.add(filter);
		if (this.ownedElement != null) {
			this.ownedElement.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedElement(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedElement(ViewerFilter filter) {
		ownedElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInOwnedElementTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedElementTable(EObject element) {
		return ((ReferencesTableSettings) ownedElement.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initOwnedPort(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedPort(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedPort.setContentProvider(contentProvider);
		ownedPort.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.ownedPort);
		if (eefElementEditorReadOnlyState && ownedPort.isEnabled()) {
			ownedPort.setEnabled(false);
			ownedPort.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedPort.isEnabled()) {
			ownedPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateOwnedPort()
	 * 
	 */
	public void updateOwnedPort() {
		ownedPort.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterOwnedPort(ViewerFilter
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
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedPort(ViewerFilter filter) {
		ownedPortBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInOwnedPortTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedPortTable(EObject element) {
		return ((ReferencesTableSettings) ownedPort.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initOwnedConnector(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedConnector(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedConnector.setContentProvider(contentProvider);
		ownedConnector.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.ownedConnector);
		if (eefElementEditorReadOnlyState && ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(false);
			ownedConnector.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateOwnedConnector()
	 * 
	 */
	public void updateOwnedConnector() {
		ownedConnector.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterOwnedConnector(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOwnedConnector(ViewerFilter filter) {
		ownedConnectorFilters.add(filter);
		if (this.ownedConnector != null) {
			this.ownedConnector.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedConnector(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedConnector(ViewerFilter filter) {
		ownedConnectorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInOwnedConnectorTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedConnectorTable(EObject element) {
		return ((ReferencesTableSettings) ownedConnector.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initUsedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usedBy.setContentProvider(contentProvider);
		usedBy.setInput(settings);
		usedByBusinessFilters.clear();
		usedByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.usedBy);
		if (eefElementEditorReadOnlyState && usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(false);
			usedBy.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateUsedBy()
	 * 
	 */
	public void updateUsedBy() {
		usedBy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterUsedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToUsedBy(ViewerFilter filter) {
		usedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterUsedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToUsedBy(ViewerFilter filter) {
		usedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInUsedByTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInUsedByTable(EObject element) {
		return ((ReferencesTableSettings) usedBy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initBrokedResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBrokedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		brokedResource.setContentProvider(contentProvider);
		brokedResource.setInput(settings);
		brokedResourceBusinessFilters.clear();
		brokedResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.brokedResource);
		if (eefElementEditorReadOnlyState && brokedResource.getTable().isEnabled()) {
			brokedResource.setEnabled(false);
			brokedResource.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !brokedResource.getTable().isEnabled()) {
			brokedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateBrokedResource()
	 * 
	 */
	public void updateBrokedResource() {
		brokedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterBrokedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToBrokedResource(ViewerFilter filter) {
		brokedResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterBrokedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToBrokedResource(ViewerFilter filter) {
		brokedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInBrokedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInBrokedResourceTable(EObject element) {
		return ((ReferencesTableSettings) brokedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initManagedResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initManagedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		managedResource.setContentProvider(contentProvider);
		managedResource.setInput(settings);
		managedResourceBusinessFilters.clear();
		managedResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.managedResource);
		if (eefElementEditorReadOnlyState && managedResource.getTable().isEnabled()) {
			managedResource.setEnabled(false);
			managedResource.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !managedResource.getTable().isEnabled()) {
			managedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateManagedResource()
	 * 
	 */
	public void updateManagedResource() {
		managedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterManagedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToManagedResource(ViewerFilter filter) {
		managedResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterManagedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToManagedResource(ViewerFilter filter) {
		managedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInManagedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInManagedResourceTable(EObject element) {
		return ((ReferencesTableSettings) managedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initSchedParams(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initSchedParams(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedParams.setContentProvider(contentProvider);
		schedParams.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.schedParams);
		if (eefElementEditorReadOnlyState && schedParams.isEnabled()) {
			schedParams.setEnabled(false);
			schedParams.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedParams.isEnabled()) {
			schedParams.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateSchedParams()
	 * 
	 */
	public void updateSchedParams() {
		schedParams.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterSchedParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSchedParams(ViewerFilter filter) {
		schedParamsFilters.add(filter);
		if (this.schedParams != null) {
			this.schedParams.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterSchedParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSchedParams(ViewerFilter filter) {
		schedParamsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInSchedParamsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSchedParamsTable(EObject element) {
		return ((ReferencesTableSettings) schedParams.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initDevices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDevices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		devices.setContentProvider(contentProvider);
		devices.setInput(settings);
		devicesBusinessFilters.clear();
		devicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.devices);
		if (eefElementEditorReadOnlyState && devices.getTable().isEnabled()) {
			devices.setEnabled(false);
			devices.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !devices.getTable().isEnabled()) {
			devices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateDevices()
	 * 
	 */
	public void updateDevices() {
		devices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterDevices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDevices(ViewerFilter filter) {
		devicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterDevices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDevices(ViewerFilter filter) {
		devicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInDevicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInDevicesTable(EObject element) {
		return ((ReferencesTableSettings) devices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initMemories(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMemories(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		memories.setContentProvider(contentProvider);
		memories.setInput(settings);
		memoriesBusinessFilters.clear();
		memoriesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.memories);
		if (eefElementEditorReadOnlyState && memories.getTable().isEnabled()) {
			memories.setEnabled(false);
			memories.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !memories.getTable().isEnabled()) {
			memories.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateMemories()
	 * 
	 */
	public void updateMemories() {
		memories.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterMemories(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMemories(ViewerFilter filter) {
		memoriesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterMemories(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMemories(ViewerFilter filter) {
		memoriesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInMemoriesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInMemoriesTable(EObject element) {
		return ((ReferencesTableSettings) memories.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initSharedDataResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSharedDataResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sharedDataResources.setContentProvider(contentProvider);
		sharedDataResources.setInput(settings);
		sharedDataResourcesBusinessFilters.clear();
		sharedDataResourcesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.sharedDataResources);
		if (eefElementEditorReadOnlyState && sharedDataResources.getTable().isEnabled()) {
			sharedDataResources.setEnabled(false);
			sharedDataResources.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sharedDataResources.getTable().isEnabled()) {
			sharedDataResources.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateSharedDataResources()
	 * 
	 */
	public void updateSharedDataResources() {
		sharedDataResources.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterSharedDataResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSharedDataResources(ViewerFilter filter) {
		sharedDataResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterSharedDataResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSharedDataResources(ViewerFilter filter) {
		sharedDataResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInSharedDataResourcesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSharedDataResourcesTable(EObject element) {
		return ((ReferencesTableSettings) sharedDataResources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initMessageResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMessageResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		messageResources.setContentProvider(contentProvider);
		messageResources.setInput(settings);
		messageResourcesBusinessFilters.clear();
		messageResourcesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.messageResources);
		if (eefElementEditorReadOnlyState && messageResources.getTable().isEnabled()) {
			messageResources.setEnabled(false);
			messageResources.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !messageResources.getTable().isEnabled()) {
			messageResources.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateMessageResources()
	 * 
	 */
	public void updateMessageResources() {
		messageResources.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterMessageResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMessageResources(ViewerFilter filter) {
		messageResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterMessageResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMessageResources(ViewerFilter filter) {
		messageResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInMessageResourcesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInMessageResourcesTable(EObject element) {
		return ((ReferencesTableSettings) messageResources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#initNotificationResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initNotificationResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		notificationResources.setContentProvider(contentProvider);
		notificationResources.setInput(settings);
		notificationResourcesBusinessFilters.clear();
		notificationResourcesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.General.Properties.notificationResources);
		if (eefElementEditorReadOnlyState && notificationResources.getTable().isEnabled()) {
			notificationResources.setEnabled(false);
			notificationResources.setToolTipText(SrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !notificationResources.getTable().isEnabled()) {
			notificationResources.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#updateNotificationResources()
	 * 
	 */
	public void updateNotificationResources() {
		notificationResources.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addFilterNotificationResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToNotificationResources(ViewerFilter filter) {
		notificationResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#addBusinessFilterNotificationResources(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToNotificationResources(ViewerFilter filter) {
		notificationResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.GeneralPropertiesEditionPart#isContainedInNotificationResourcesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInNotificationResourcesTable(EObject element) {
		return ((ReferencesTableSettings) notificationResources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SrmMessages.General_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
