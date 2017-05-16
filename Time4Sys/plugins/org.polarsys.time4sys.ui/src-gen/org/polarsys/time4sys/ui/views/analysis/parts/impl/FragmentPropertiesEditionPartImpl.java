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
package org.polarsys.time4sys.ui.views.analysis.parts.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.FragmentPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class FragmentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FragmentPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable lockedMutexes;
	protected List<ViewerFilter> lockedMutexesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> lockedMutexesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer next;
	protected EObjectFlatComboViewer previous;
	protected EObjectFlatComboViewer task;
	protected Text cET;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public FragmentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * @generated
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
	 * @generated
	 */
	public void createControls(Composite view) { 
		CompositionSequence fragmentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = fragmentStep.addStep(AnalysisViewsRepository.Fragment.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.Fragment.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.Fragment.Properties.lockedMutexes);
		propertiesStep.addStep(AnalysisViewsRepository.Fragment.Properties.next);
		propertiesStep.addStep(AnalysisViewsRepository.Fragment.Properties.previous);
		propertiesStep.addStep(AnalysisViewsRepository.Fragment.Properties.task);
		propertiesStep.addStep(AnalysisViewsRepository.Fragment.Properties.cET);
		
		
		composer = new PartComposer(fragmentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.Fragment.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.Fragment.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.Fragment.Properties.lockedMutexes) {
					return createLockedMutexesAdvancedReferencesTable(parent);
				}
				if (key == AnalysisViewsRepository.Fragment.Properties.next) {
					return createNextFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Fragment.Properties.previous) {
					return createPreviousFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Fragment.Properties.task) {
					return createTaskFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Fragment.Properties.cET) {
					return createCETText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(AnalysisMessages.FragmentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @generated
	 */
	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Fragment.Properties.name, AnalysisMessages.FragmentPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.Fragment.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Fragment.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createLockedMutexesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.Fragment.Properties.lockedMutexes, AnalysisMessages.FragmentPropertiesEditionPart_LockedMutexesLabel);		 
		this.lockedMutexes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLockedMutexes(); }
			public void handleEdit(EObject element) { editLockedMutexes(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLockedMutexes(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLockedMutexes(element); }
			public void navigateTo(EObject element) { }
		});
		this.lockedMutexes.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Fragment.Properties.lockedMutexes, AnalysisViewsRepository.SWT_KIND));
		this.lockedMutexes.createControls(parent);
		this.lockedMutexes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.lockedMutexes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData lockedMutexesData = new GridData(GridData.FILL_HORIZONTAL);
		lockedMutexesData.horizontalSpan = 3;
		this.lockedMutexes.setLayoutData(lockedMutexesData);
		this.lockedMutexes.disableMove();
		lockedMutexes.setID(AnalysisViewsRepository.Fragment.Properties.lockedMutexes);
		lockedMutexes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addLockedMutexes() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(lockedMutexes.getInput(), lockedMutexesFilters, lockedMutexesBusinessFilters,
		"lockedMutexes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.lockedMutexes,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				lockedMutexes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveLockedMutexes(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.lockedMutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		lockedMutexes.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromLockedMutexes(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.lockedMutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		lockedMutexes.refresh();
	}

	/**
	 * @generated
	 */
	protected void editLockedMutexes(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				lockedMutexes.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createNextFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Fragment.Properties.next, AnalysisMessages.FragmentPropertiesEditionPart_NextLabel);
		next = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Fragment.Properties.next, AnalysisViewsRepository.SWT_KIND));
		next.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		next.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.next, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getNext()));
			}

		});
		GridData nextData = new GridData(GridData.FILL_HORIZONTAL);
		next.setLayoutData(nextData);
		next.setID(AnalysisViewsRepository.Fragment.Properties.next);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Fragment.Properties.next, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNextFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createPreviousFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Fragment.Properties.previous, AnalysisMessages.FragmentPropertiesEditionPart_PreviousLabel);
		previous = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Fragment.Properties.previous, AnalysisViewsRepository.SWT_KIND));
		previous.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		previous.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.previous, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPrevious()));
			}

		});
		GridData previousData = new GridData(GridData.FILL_HORIZONTAL);
		previous.setLayoutData(previousData);
		previous.setID(AnalysisViewsRepository.Fragment.Properties.previous);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Fragment.Properties.previous, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPreviousFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createTaskFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Fragment.Properties.task, AnalysisMessages.FragmentPropertiesEditionPart_TaskLabel);
		task = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Fragment.Properties.task, AnalysisViewsRepository.SWT_KIND));
		task.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		task.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.task, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTask()));
			}

		});
		GridData taskData = new GridData(GridData.FILL_HORIZONTAL);
		task.setLayoutData(taskData);
		task.setID(AnalysisViewsRepository.Fragment.Properties.task);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Fragment.Properties.task, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTaskFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createCETText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Fragment.Properties.cET, AnalysisMessages.FragmentPropertiesEditionPart_CETLabel);
		cET = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData cETData = new GridData(GridData.FILL_HORIZONTAL);
		cET.setLayoutData(cETData);
		cET.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.cET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
			}

		});
		cET.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FragmentPropertiesEditionPartImpl.this, AnalysisViewsRepository.Fragment.Properties.cET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
				}
			}

		});
		EditingUtils.setID(cET, AnalysisViewsRepository.Fragment.Properties.cET);
		EditingUtils.setEEFtype(cET, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Fragment.Properties.cET, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCETText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#initLockedMutexes(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLockedMutexes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		lockedMutexes.setContentProvider(contentProvider);
		lockedMutexes.setInput(settings);
		lockedMutexesBusinessFilters.clear();
		lockedMutexesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.lockedMutexes);
		if (eefElementEditorReadOnlyState && lockedMutexes.getTable().isEnabled()) {
			lockedMutexes.setEnabled(false);
			lockedMutexes.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !lockedMutexes.getTable().isEnabled()) {
			lockedMutexes.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#updateLockedMutexes()
	 * @generated
	 */
	public void updateLockedMutexes() {
	lockedMutexes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addFilterLockedMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToLockedMutexes(ViewerFilter filter) {
		lockedMutexesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addBusinessFilterLockedMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToLockedMutexes(ViewerFilter filter) {
		lockedMutexesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#isContainedInLockedMutexesTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInLockedMutexesTable(EObject element) {
		return ((ReferencesTableSettings)lockedMutexes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#getNext()
	 * @generated
	 */
	public EObject getNext() {
		if (next.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) next.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#initNext(EObjectFlatComboSettings)
	 */
	public void initNext(EObjectFlatComboSettings settings) {
		next.setInput(settings);
		if (current != null) {
			next.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.next);
		if (eefElementEditorReadOnlyState && next.isEnabled()) {
			next.setEnabled(false);
			next.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !next.isEnabled()) {
			next.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setNext(EObject newValue)
	 * @generated
	 */
	public void setNext(EObject newValue) {
		if (newValue != null) {
			next.setSelection(new StructuredSelection(newValue));
		} else {
			next.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.next);
		if (eefElementEditorReadOnlyState && next.isEnabled()) {
			next.setEnabled(false);
			next.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !next.isEnabled()) {
			next.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setNextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextButtonMode(ButtonsModeEnum newValue) {
		next.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addFilterNext(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToNext(ViewerFilter filter) {
		next.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addBusinessFilterNext(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToNext(ViewerFilter filter) {
		next.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#getPrevious()
	 * @generated
	 */
	public EObject getPrevious() {
		if (previous.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) previous.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#initPrevious(EObjectFlatComboSettings)
	 */
	public void initPrevious(EObjectFlatComboSettings settings) {
		previous.setInput(settings);
		if (current != null) {
			previous.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.previous);
		if (eefElementEditorReadOnlyState && previous.isEnabled()) {
			previous.setEnabled(false);
			previous.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !previous.isEnabled()) {
			previous.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setPrevious(EObject newValue)
	 * @generated
	 */
	public void setPrevious(EObject newValue) {
		if (newValue != null) {
			previous.setSelection(new StructuredSelection(newValue));
		} else {
			previous.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.previous);
		if (eefElementEditorReadOnlyState && previous.isEnabled()) {
			previous.setEnabled(false);
			previous.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !previous.isEnabled()) {
			previous.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setPreviousButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPreviousButtonMode(ButtonsModeEnum newValue) {
		previous.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addFilterPrevious(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToPrevious(ViewerFilter filter) {
		previous.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addBusinessFilterPrevious(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToPrevious(ViewerFilter filter) {
		previous.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#getTask()
	 * @generated
	 */
	public EObject getTask() {
		if (task.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) task.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#initTask(EObjectFlatComboSettings)
	 */
	public void initTask(EObjectFlatComboSettings settings) {
		task.setInput(settings);
		if (current != null) {
			task.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.task);
		if (eefElementEditorReadOnlyState && task.isEnabled()) {
			task.setEnabled(false);
			task.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !task.isEnabled()) {
			task.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setTask(EObject newValue)
	 * @generated
	 */
	public void setTask(EObject newValue) {
		if (newValue != null) {
			task.setSelection(new StructuredSelection(newValue));
		} else {
			task.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.task);
		if (eefElementEditorReadOnlyState && task.isEnabled()) {
			task.setEnabled(false);
			task.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !task.isEnabled()) {
			task.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setTaskButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTaskButtonMode(ButtonsModeEnum newValue) {
		task.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addFilterTask(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTask(ViewerFilter filter) {
		task.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#addBusinessFilterTask(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTask(ViewerFilter filter) {
		task.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#getCET()
	 * @generated
	 */
	public String getCET() {
		return cET.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.FragmentPropertiesEditionPart#setCET(String newValue)
	 * @generated
	 */
	public void setCET(String newValue) {
		if (newValue != null) {
			cET.setText(newValue);
		} else {
			cET.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Fragment.Properties.cET);
		if (eefElementEditorReadOnlyState && cET.isEnabled()) {
			cET.setEnabled(false);
			cET.setToolTipText(AnalysisMessages.Fragment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cET.isEnabled()) {
			cET.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.Fragment_Part_Title;
	}



}
