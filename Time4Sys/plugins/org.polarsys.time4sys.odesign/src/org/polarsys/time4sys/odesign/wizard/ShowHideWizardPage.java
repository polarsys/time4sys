/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.sirius.common.tools.api.util.TreeItemWrapper;
import org.eclipse.sirius.common.ui.tools.api.selection.page.AbstractSelectionWizardPage;
import org.eclipse.sirius.common.ui.tools.api.view.common.item.ItemDecorator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.google.common.collect.Iterators;

public class ShowHideWizardPage extends AbstractSelectionWizardPage {

	/** */
    Composite pageComposite;

//    private TreeItemWrapper treeObjects;

    /** The label provider adapter factory. */
    private final AdapterFactoryLabelProvider myAdapterFactoryLabelProvider;

    /** The selected instances * */
    private EList<EObject> selectedElements = new BasicEList<EObject>(); 

    private EList<EObject> unselectedElements = new BasicEList<EObject>();

    /** The choice of values viewer. */
    private TableViewer unselectedElementsTableViewer;

    /** The selection viewer */
    private TableViewer selectedElementsTableViewer;

    private Button addButton;

    private Button removeButton;

    private Button upButton;

    private Button downButton;

    private String choiceOfValuesMessage;

    private String selectedValuesMessage;

    /**
     * Constructor.
     * 
     * @param pageName
     *            the name of the page
     * @param title
     *            the title for this wizard page, or <code>null</code> if none
     * @param imageTitle
     *            the image descriptor for the title of this wizard page, or
     *            <code>null</code> if none
     * @param choiceOfValuesMessage
     *            the dialog message
     * @param selectedValuesMessage
     *            the dialog message
     * @param factory
     *            the adapter factory to provide text and images
     */
    public ShowHideWizardPage(final String pageName, final String title, final ImageDescriptor imageTitle, final String choiceOfValuesMessage, final String selectedValuesMessage,
            final AdapterFactory factory) {
        super(pageName, title, imageTitle);
        this.myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(factory);
        this.choiceOfValuesMessage = choiceOfValuesMessage;
        this.selectedValuesMessage = selectedValuesMessage;
    }

    /**
     * Initializer.
     * 
     * @param choiceOfValues
     *            the candidate objects
     * @param preSelectedValues
     *            the pre-selected candidate objects
     */
    public void init(final Collection<? extends EObject> choiceOfValues, final Collection<? extends EObject> preSelectedValues) {
        this.unselectedElements.addAll(choiceOfValues);
        this.selectedElements.addAll(preSelectedValues);

    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(final Composite parent) {
        initializeDialogUnits(parent);

        final GridLayout contentsGridLayout = new GridLayout();
        contentsGridLayout.numColumns = 1;
        pageComposite = new Composite(parent, SWT.NONE);
        pageComposite.setLayout(contentsGridLayout);
        pageComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

        createSelectionGroup(pageComposite);

        final GridLayout otherLayout = new GridLayout();
        otherLayout.numColumns = 3;
        final Composite otherComposite = new Composite(pageComposite, SWT.NONE);
        otherComposite.setLayout(otherLayout);
        otherComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        createChoiceComposite(otherComposite);
        createControlButtons(otherComposite);
        createSelectionComposite(otherComposite);

        createButtonListeners();

        setControl(pageComposite);
    }

    private void createButtonListeners() {
        createAddButtonListener();
        createRemoveButtonListener();
        createUpButtonListener();
        createDownButtonListener();
    }

    private void createAddButtonListener() {
        if (addButton != null && unselectedElementsTableViewer != null) {
            unselectedElementsTableViewer.addDoubleClickListener(new IDoubleClickListener() {
                public void doubleClick(final DoubleClickEvent event) {
                    if (addButton.isEnabled()) {
                        addButton.notifyListeners(SWT.Selection, null);
                    }
                }
            });
            addButton.addSelectionListener(new SelectionAdapter() {
                // event is null when choiceTableViewer is double clicked
                @Override
                public void widgetSelected(final SelectionEvent event) {
                    if (unselectedElementsTableViewer != null) {
                        final IStructuredSelection treeSelection = (IStructuredSelection) unselectedElementsTableViewer.getSelection();
                        final List<EObject> tableSelection = new ArrayList<EObject>();
                        final Iterator<?> i = treeSelection.iterator();
                        while (i.hasNext()) {
                            Object value = i.next();
                            if (value instanceof EObject) {
                                tableSelection.add((EObject) value);
                                unselectedElements.remove(value);
                                if (!selectedElements.contains(value)) {
                                	selectedElements.add((EObject) value);
                                }
                            }
                        }
                        unselectedElementsTableViewer.refresh();
                        selectedElementsTableViewer.refresh();
                        selectedElementsTableViewer.setSelection(new StructuredSelection(tableSelection));
                    }
                }
            });
        }
    }

    private void createRemoveButtonListener() {
        if (removeButton != null && selectedElementsTableViewer != null) {
            selectedElementsTableViewer.addDoubleClickListener(new IDoubleClickListener() {
                public void doubleClick(final DoubleClickEvent event) {
                    if (removeButton.isEnabled()) {
                        removeButton.notifyListeners(SWT.Selection, null);
                    }
                }
            });
            removeButton.addSelectionListener(new SelectionAdapter() {
                // event is null when featureTableViewer is double clicked
                @Override
                public void widgetSelected(final SelectionEvent event) {
                    final IStructuredSelection selection = (IStructuredSelection) selectedElementsTableViewer.getSelection();
                    final Iterator<?> i = selection.iterator();
                    while (i.hasNext()) {
                    	EObject next = (EObject) i.next();
                        selectedElements.remove(next);
                        unselectedElements.add(next);
                    }
                    unselectedElementsTableViewer.refresh();
                    selectedElementsTableViewer.refresh();
                    selectedElementsTableViewer.setSelection(null);
                }
            });
        }
    }

    private void createDownButtonListener() {
        if (downButton != null && selectedElementsTableViewer != null) {
            downButton.addSelectionListener(new SelectionAdapter() {
                // event is null when featureTableViewer is double clicked
                @Override
                public void widgetSelected(final SelectionEvent event) {
                    final IStructuredSelection selection = (IStructuredSelection) selectedElementsTableViewer.getSelection();
                    final Iterator<EObject> i = Iterators.filter(selection.iterator(), EObject.class);
                    int maxIndex = selectedElements.size() - selection.size();
                    while (i.hasNext()) {
                        final EObject value = i.next();
                        final int index = selectedElements.indexOf(value);
                        selectedElements.move(Math.min(index + 1, maxIndex++), value);
                    }
                    selectedElementsTableViewer.refresh();
                }
            });
        }
    }

    private void createUpButtonListener() {
        if (upButton != null && selectedElementsTableViewer != null) {
            upButton.addSelectionListener(new SelectionAdapter() {
                // event is null when featureTableViewer is double clicked
                @Override
                public void widgetSelected(final SelectionEvent event) {
                    final IStructuredSelection selection = (IStructuredSelection) selectedElementsTableViewer.getSelection();
                    final Iterator<EObject> i = Iterators.filter(selection.iterator(), EObject.class);
                    int minIndex = 0;
                    while (i.hasNext()) {
                        final EObject value = i.next();
                        final int index = selectedElements.indexOf(value);
                        selectedElements.move(Math.max(index - 1, minIndex++), value);
                    }
                    selectedElementsTableViewer.refresh();
                }
            });
        }
    }

    private void createChoiceComposite(final Composite parent) {
        final Composite pane = new Composite(parent, SWT.NONE);

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginHeight = 0;
        gridLayout.marginWidth = 0;
        gridLayout.numColumns = 1;
        pane.setLayout(gridLayout);

        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.widthHint = 250;
        pane.setLayoutData(gridData);

        final Label label = new Label(pane, SWT.NONE);
        label.setText(choiceOfValuesMessage);
        final GridData labelGridData = new GridData();
        labelGridData.verticalAlignment = SWT.FILL;
        labelGridData.horizontalAlignment = SWT.FILL;
        label.setLayoutData(labelGridData);

        unselectedElementsTableViewer = createTableViewer(pane);
        unselectedElementsTableViewer.setInput(this.unselectedElements);
    }

    private void createSelectionComposite(final Composite parent) {
        final Composite pane = new Composite(parent, SWT.NONE);
        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.horizontalAlignment = SWT.FILL;
        gridData.widthHint = 200;
        pane.setLayoutData(gridData);

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginHeight = 0;
        gridLayout.marginWidth = 0;
        gridLayout.numColumns = 1;
        pane.setLayout(gridLayout);

        final Label label = new Label(pane, SWT.NONE);
        label.setText(selectedValuesMessage);
        final GridData labelGridData = new GridData();
        labelGridData.verticalAlignment = SWT.FILL;
        labelGridData.horizontalAlignment = SWT.FILL;
        label.setLayoutData(labelGridData);

        selectedElementsTableViewer = createTableViewer(pane);
        selectedElementsTableViewer.setInput(this.selectedElements);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.jface.wizard.WizardPage#isCurrentPage()
     */
    @Override
    public boolean isCurrentPage() {
        // increases visibility
        return super.isCurrentPage();
    }

    /**
     * Create a treeViewer
     * 
     * @param parent
     *            the parent composite
     * @return the created treeViewer
     */
//    private TreeViewer createTreeViewer(final Composite parent) {
//        final TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
//        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
//        viewer.getControl().setLayoutData(gridData);
//        viewer.getTree().setHeaderVisible(false);
//        viewer.getTree().setLinesVisible(false);
//        final ITreeContentProvider contentProvider = new GroupingContentProvider(new TreeItemWrapperContentProvider());
//        viewer.setContentProvider(contentProvider);
//        viewer.setLabelProvider(new EObjectSelectionLabelProvider());
//        viewer.addFilter(this.myViewerfilter);
//        return viewer;
//    }

    /**
     * Create a tableViewer
     * 
     * @param parent
     *            the parent composite
     * @return the created tableViewer
     */
    private TableViewer createTableViewer(final Composite parent) {
        TableViewer viewer = null;
        viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        viewer.getControl().setLayoutData(gridData);
        viewer.getTable().setHeaderVisible(false);
        viewer.getTable().setLinesVisible(false);
        viewer.setContentProvider(new ArrayContentProvider());
        viewer.setLabelProvider(new EObjectSelectionLabelProvider());
        return viewer;
    }

    private void createControlButtons(final Composite parent) {
        final Composite pane = new Composite(parent, SWT.NONE);
        final GridData gridData = new GridData();
        gridData.verticalAlignment = SWT.FILL;
        gridData.horizontalAlignment = SWT.FILL;
        pane.setLayoutData(gridData);

        final GridLayout controlsButtonGridLayout = new GridLayout();
        pane.setLayout(controlsButtonGridLayout);

        final Label label = new Label(pane, SWT.NONE);
        final GridData labelGridData = new GridData();
        labelGridData.verticalSpan = 4;
        label.setLayoutData(labelGridData);

        addButton = new Button(pane, SWT.PUSH);
        addButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Add_label")); //$NON-NLS-1$
        final GridData addButtonGridData = new GridData();
        addButtonGridData.verticalAlignment = SWT.FILL;
        addButtonGridData.horizontalAlignment = SWT.FILL;
        addButton.setLayoutData(addButtonGridData);

        removeButton = new Button(pane, SWT.PUSH);
        removeButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Remove_label")); //$NON-NLS-1$
        final GridData removeButtonGridData = new GridData();
        removeButtonGridData.verticalAlignment = SWT.FILL;
        removeButtonGridData.horizontalAlignment = SWT.FILL;
        removeButton.setLayoutData(removeButtonGridData);

        final Label spaceLabel = new Label(pane, SWT.NONE);
        final GridData spaceLabelGridData = new GridData();
        spaceLabelGridData.verticalSpan = 2;
        spaceLabel.setLayoutData(spaceLabelGridData);

        upButton = new Button(pane, SWT.PUSH);
        upButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Up_label")); //$NON-NLS-1$
        final GridData upButtonGridData = new GridData();
        upButtonGridData.verticalAlignment = SWT.FILL;
        upButtonGridData.horizontalAlignment = SWT.FILL;
        upButton.setLayoutData(upButtonGridData);

        downButton = new Button(pane, SWT.PUSH);
        downButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Down_label")); //$NON-NLS-1$
        final GridData downButtonGridData = new GridData();
        downButtonGridData.verticalAlignment = SWT.FILL;
        downButtonGridData.horizontalAlignment = SWT.FILL;
        downButton.setLayoutData(downButtonGridData);
    }

    /**
     * Get the selected {@link EObject}.
     * 
     * @return the list of selected instances.
     */
    public EList<EObject> getSelectedElements() {
        return this.selectedElements;

    }
    
    /**
     * Get the selected {@link EObject}.
     * 
     * @return the list of selected instances.
     */
    public EList<EObject> getUnselectedElements() {
        return this.unselectedElements;

    }

    /**
     * A label provider.
     * 
     * @author mchauvin
     */
    private class EObjectSelectionLabelProvider extends LabelProvider {

        @Override
        public Image getImage(final Object element) {
            Image result = null;
            if (element instanceof TreeItemWrapper) {
                result = myAdapterFactoryLabelProvider.getImage(((TreeItemWrapper) element).getWrappedObject());
            } else if (element instanceof ItemDecorator) {
                result = ((ItemDecorator) element).getImage();
            } else {
                result = myAdapterFactoryLabelProvider.getImage(element);
            }
            return result;
        }

        @Override
        public String getText(final Object element) {
            String result = null;
            if (element instanceof TreeItemWrapper) {
                result = myAdapterFactoryLabelProvider.getText(((TreeItemWrapper) element).getWrappedObject());
            } else if (element instanceof ItemDecorator) {
                result = ((ItemDecorator) element).getText();
            } else {
                result = myAdapterFactoryLabelProvider.getText(element);
            }
            return result;
        }
    }

    /**
     * Dispose the created swt resources. {@inheritDoc}
     * 
     * @see org.eclipse.jface.dialogs.DialogPage#dispose()
     */
    @Override
    public void dispose() {

        myAdapterFactoryLabelProvider.dispose();

        if (pageComposite != null && !pageComposite.isDisposed()) {
            pageComposite.dispose();
        }

        addButton.dispose();
        upButton.dispose();
        downButton.dispose();
        removeButton.dispose();

        super.dispose();
    }

}
