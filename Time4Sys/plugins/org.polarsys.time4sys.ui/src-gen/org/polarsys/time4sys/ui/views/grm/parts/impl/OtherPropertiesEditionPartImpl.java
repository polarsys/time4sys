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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.providers.GrmMessages;

// End of user code

/**
 * 
 * 
 */
public class OtherPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OtherPropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OtherPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createOtherPropertiesGroup(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.allocatedmemory) {
					return createAllocatedmemoryText(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.usedMemory) {
					return createUsedMemoryText(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.powerPeak) {
					return createPowerPeakText(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.energy) {
					return createEnergyText(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.pServices) {
					return createPServicesAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.rServices) {
					return createRServicesAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.pInterface) {
					return createPInterfaceAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.Other.OtherProperties.rInterface) {
					return createRInterfaceAdvancedReferencesTable(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createOtherPropertiesGroup(Composite parent) {
		Group otherPropertiesGroup = new Group(parent, SWT.NONE);
		otherPropertiesGroup.setText(GrmMessages.OtherPropertiesEditionPart_OtherPropertiesGroupLabel);
		GridData otherPropertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		otherPropertiesGroupData.horizontalSpan = 3;
		otherPropertiesGroup.setLayoutData(otherPropertiesGroupData);
		GridLayout otherPropertiesGroupLayout = new GridLayout();
		otherPropertiesGroupLayout.numColumns = 3;
		otherPropertiesGroup.setLayout(otherPropertiesGroupLayout);
		return otherPropertiesGroup;
	}

	
	protected Composite createAllocatedmemoryText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.allocatedmemory, GrmMessages.OtherPropertiesEditionPart_AllocatedmemoryLabel);
		allocatedmemory = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData allocatedmemoryData = new GridData(GridData.FILL_HORIZONTAL);
		allocatedmemory.setLayoutData(allocatedmemoryData);
		allocatedmemory.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.allocatedmemory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, allocatedmemory.getText()));
			}

		});
		allocatedmemory.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.allocatedmemory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, allocatedmemory.getText()));
				}
			}

		});
		EditingUtils.setID(allocatedmemory, GrmViewsRepository.Other.OtherProperties.allocatedmemory);
		EditingUtils.setEEFtype(allocatedmemory, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.allocatedmemory, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAllocatedmemoryText

		// End of user code
		return parent;
	}

	
	protected Composite createUsedMemoryText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.usedMemory, GrmMessages.OtherPropertiesEditionPart_UsedMemoryLabel);
		usedMemory = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData usedMemoryData = new GridData(GridData.FILL_HORIZONTAL);
		usedMemory.setLayoutData(usedMemoryData);
		usedMemory.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.usedMemory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, usedMemory.getText()));
			}

		});
		usedMemory.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.usedMemory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, usedMemory.getText()));
				}
			}

		});
		EditingUtils.setID(usedMemory, GrmViewsRepository.Other.OtherProperties.usedMemory);
		EditingUtils.setEEFtype(usedMemory, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.usedMemory, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createUsedMemoryText

		// End of user code
		return parent;
	}

	
	protected Composite createPowerPeakText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.powerPeak, GrmMessages.OtherPropertiesEditionPart_PowerPeakLabel);
		powerPeak = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData powerPeakData = new GridData(GridData.FILL_HORIZONTAL);
		powerPeak.setLayoutData(powerPeakData);
		powerPeak.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.powerPeak, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, powerPeak.getText()));
			}

		});
		powerPeak.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.powerPeak, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, powerPeak.getText()));
				}
			}

		});
		EditingUtils.setID(powerPeak, GrmViewsRepository.Other.OtherProperties.powerPeak);
		EditingUtils.setEEFtype(powerPeak, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.powerPeak, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPowerPeakText

		// End of user code
		return parent;
	}

	
	protected Composite createEnergyText(Composite parent) {
		createDescription(parent, GrmViewsRepository.Other.OtherProperties.energy, GrmMessages.OtherPropertiesEditionPart_EnergyLabel);
		energy = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData energyData = new GridData(GridData.FILL_HORIZONTAL);
		energy.setLayoutData(energyData);
		energy.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.energy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, energy.getText()));
			}

		});
		energy.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.energy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, energy.getText()));
				}
			}

		});
		EditingUtils.setID(energy, GrmViewsRepository.Other.OtherProperties.energy);
		EditingUtils.setEEFtype(energy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.energy, GrmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEnergyText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPServicesAdvancedTableComposition(Composite parent) {
		this.pServices = new ReferencesTable(getDescription(GrmViewsRepository.Other.OtherProperties.pServices, GrmMessages.OtherPropertiesEditionPart_PServicesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				pServices.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				pServices.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				pServices.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				pServices.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.pServicesFilters) {
			this.pServices.addFilter(filter);
		}
		this.pServices.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.pServices, GrmViewsRepository.SWT_KIND));
		this.pServices.createControls(parent);
		this.pServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createPServicesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.Other.OtherProperties.rServices, GrmMessages.OtherPropertiesEditionPart_RServicesLabel);		 
		this.rServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addRServices(); }
			public void handleEdit(EObject element) { editRServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.rServices.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.rServices, GrmViewsRepository.SWT_KIND));
		this.rServices.createControls(parent);
		this.rServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rServicesData = new GridData(GridData.FILL_HORIZONTAL);
		rServicesData.horizontalSpan = 3;
		this.rServices.setLayoutData(rServicesData);
		this.rServices.disableMove();
		rServices.setID(GrmViewsRepository.Other.OtherProperties.rServices);
		rServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rServices,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createPInterfaceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.Other.OtherProperties.pInterface, GrmMessages.OtherPropertiesEditionPart_PInterfaceLabel);		 
		this.pInterface = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addPInterface(); }
			public void handleEdit(EObject element) { editPInterface(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePInterface(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPInterface(element); }
			public void navigateTo(EObject element) { }
		});
		this.pInterface.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.pInterface, GrmViewsRepository.SWT_KIND));
		this.pInterface.createControls(parent);
		this.pInterface.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData pInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		pInterfaceData.horizontalSpan = 3;
		this.pInterface.setLayoutData(pInterfaceData);
		this.pInterface.disableMove();
		pInterface.setID(GrmViewsRepository.Other.OtherProperties.pInterface);
		pInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pInterface,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		pInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.pInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createRInterfaceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.Other.OtherProperties.rInterface, GrmMessages.OtherPropertiesEditionPart_RInterfaceLabel);		 
		this.rInterface = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addRInterface(); }
			public void handleEdit(EObject element) { editRInterface(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRInterface(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRInterface(element); }
			public void navigateTo(EObject element) { }
		});
		this.rInterface.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.Other.OtherProperties.rInterface, GrmViewsRepository.SWT_KIND));
		this.rInterface.createControls(parent);
		this.rInterface.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		rInterfaceData.horizontalSpan = 3;
		this.rInterface.setLayoutData(rInterfaceData);
		this.rInterface.disableMove();
		rInterface.setID(GrmViewsRepository.Other.OtherProperties.rInterface);
		rInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rInterface,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		rInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this, GrmViewsRepository.Other.OtherProperties.rInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
