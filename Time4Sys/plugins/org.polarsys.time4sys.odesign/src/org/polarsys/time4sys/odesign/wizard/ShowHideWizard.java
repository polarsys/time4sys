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
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.time4sys.odesign.service.DiagramServices;

public class ShowHideWizard extends Wizard implements IExternalJavaAction {

	protected static final String CONTEXT = "context"; //$NON-NLS-1$
	/**
	 * Scope tag.
	 */
	protected static final String SCOPE = "scope"; //$NON-NLS-1$
	/**
	 * Wizard Message tag.
	 */
	protected static final String WIZARD_MESSAGE = "wizardMessage"; //$NON-NLS-1$
	/**
	 * Wizard Title tag.
	 */
	protected static final String WIZARD_TITLE = "Show Hide wizard"; //$NON-NLS-1$
	/**
	 * Multiple tag.
	 */
	protected static final String MULTIPLE = "multiple"; //$NON-NLS-1$
	/**
	 * Initial Selection tag.
	 */
	protected static final String INITIAL_SELECTION = "initialSelection"; //$NON-NLS-1$

	/**
	 * Selected element mapping.
	 */
	protected static final String ELEMENT_MAPPING_ID = "elementToCreateMapping"; //$NON-NLS-1$

	/** "Choice of values". */
	public static final String WIZARD_GENERIC_CHOICE_OF_VALUES_MESSAGE = "Hidden Elements";

	/** "Selected". */
	public static final String WIZARD_GENERIC_SELECTED_VALUES_MESSAGE = "Displayed Elements";

	/** "Please select an element". */
	public static final String WIZARD_GENERIC_DIALOG_MESSAGE = "Messages.ShowHideWizard_askSelect";

	private static final String SHOW_HIDE_WIZARD_PAGE_NAME = "page"; //$NON-NLS-1$

	private ShowHideWizardPage page;

	public ShowHideWizard() {
		super();
	}

	/**
	 * Default constructor.
	 * 
	 * @param windowTitle
	 *            the window title,
	 *            {@link ShowHideWizard#WIZARD_GENERIC_DIALOG_TITLE} can be used
	 * @param wizardPageTitle
	 *            the dialog message,
	 *            {@link ShowHideWizard#WIZARD_GENERIC_DIALOG_MESSAGE} can be
	 *            used
	 * @param wizardPageTitleImage
	 *            the title image
	 * @param choiceOfValuesMessage
	 *            the dialog message,
	 *            {@link ShowHideWizard#WIZARD_GENERIC_LEFT_PANE_MESSAGE} can be
	 *            used
	 * @param selectedValuesMessage
	 *            the dialog message,
	 *            {@link ShowHideWizard#WIZARD_GENERIC_RIGHT_PANE_MESSAGE} can
	 *            be used
	 * @param factory
	 *            the adapter factory to provides labels and icons for the
	 *            objects
	 */
	public ShowHideWizard(final String windowTitle, final String wizardPageTitle,
			final ImageDescriptor wizardPageTitleImage, final String choiceOfValuesMessage,
			final String selectedValuesMessage, final AdapterFactory factory) {
		setWindowTitle(windowTitle);
		page = new ShowHideWizardPage(SHOW_HIDE_WIZARD_PAGE_NAME, wizardPageTitle, wizardPageTitleImage,
				choiceOfValuesMessage, selectedValuesMessage, factory);
		addPage(page);
	}

	/**
	 * Initializer.
	 * 
	 * @param objects
	 *            the candidates objects
	 * @param preSelectedObjects
	 *            the pre-selected objects
	 */
	public void init(final Collection<? extends EObject> objects,
			final Collection<? extends EObject> preSelectedObjects) {
		page.init(objects, preSelectedObjects);
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	/**
	 * Get the selected EObject instances.
	 * 
	 * @return a list of the selected {@link EObject}.
	 */
	public Collection<EObject> getUnselectedEObjects() {
		return page.getUnselectedElements();
	}

	/**
	 * Get the selected EObject instances.
	 * 
	 * @return a list of the selected {@link EObject}.
	 */
	public Collection<EObject> getSelectedEObjects() {
		return page.getSelectedElements();
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		EObject context = (EObject) parameters.get(CONTEXT);
		Collection<EObject> choiceSelection = (Collection<EObject>) parameters.get("choiceSelection");
		Collection<EObject> choices = new ArrayList(choiceSelection);
		Collection<EObject> initialSelection = (Collection<EObject>) parameters.get(INITIAL_SELECTION);
		String elementToCreateMapping = (String) parameters.get(ELEMENT_MAPPING_ID);
		choices.removeAll(initialSelection);
		String wizardMessage = (String) parameters.get(WIZARD_MESSAGE);

		Shell shell = null;
		boolean createdShell = false;
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		}
		if (shell == null) {
			shell = new Shell();
			createdShell = true;
		}

		final ShowHideWizard wizard = new ShowHideWizard(WIZARD_TITLE, wizardMessage, null,
				WIZARD_GENERIC_CHOICE_OF_VALUES_MESSAGE, WIZARD_GENERIC_SELECTED_VALUES_MESSAGE,
				DiagramUIPlugin.getPlugin().getItemProvidersAdapterFactory());
		wizard.init(choices, initialSelection);
		final WizardDialog dlg = new WizardDialog(shell, wizard);
		dlg.setMinimumPageSize(200, 300);
		final int result = dlg.open();
		if (result == Window.OK) {
			updateDiagram(context, elementToCreateMapping, wizard);
		}
		if (createdShell) {
			shell.dispose();
		}
	}

	protected void updateDiagram(EObject context, String elementToCreateMapping, final ShowHideWizard wizard) {
		final Collection<EObject> selectedElements = wizard.getSelectedEObjects();
		final Collection<EObject> unselectedElements = wizard.getUnselectedEObjects();

		for (EObject eObject : unselectedElements) {
			removeObjectInDiagram(context, eObject);
		}

		for (EObject eObject : selectedElements) {
			createObjectInDiagram(context, elementToCreateMapping, eObject);
		}
	}

	protected void removeObjectInDiagram(EObject context, EObject eObject) {
		Collection<EObject> representations = new EObjectQuery(eObject)
				.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
		for (EObject representation : representations) {
			if (representation.eContainer().equals(context)) {
				DiagramServices.getDiagramServices().removeContainerView(representation);
			}
		}
	}

	protected void createObjectInDiagram(EObject context, String elementToCreateMapping, EObject eObject) {
		if (context instanceof DSemanticDiagram) {
			DDiagram diag = (DDiagram) context;
			DiagramElementMapping mapping = DiagramServices.getDiagramServices().getMappingByName(diag.getDescription(),
					elementToCreateMapping);

			if (mapping instanceof AbstractNodeMapping) {
				DiagramServices.getDiagramServices().createNode((AbstractNodeMapping) mapping, eObject, diag, diag);
			}
		}
		if (context instanceof DDiagramElement) {
			DNodeContainer node = (DNodeContainer) context;
			DiagramElementMapping mapping = DiagramServices.getDiagramServices()
					.getMappingByName(node.getParentDiagram().getDescription(), elementToCreateMapping);
			if (mapping instanceof AbstractNodeMapping) {
				DiagramServices.getDiagramServices().createNode((AbstractNodeMapping) mapping, eObject, node,
						node.getParentDiagram());
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
