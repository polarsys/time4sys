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
package org.polarsys.time4sys.odesign;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorFilter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.polarsys.time4sys.model.time4sys.Project;

public class EEFTabFilter implements IEEFTabDescriptorFilter {

	@Override
	public boolean filter(IEEFTabDescriptor descriptor) {

		if (descriptor.getLabel().equals("Time4Sys") || descriptor.getLabel().equals("Main")) {

			ISelectionService s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
			ISelection context = s.getSelection();

			if (context instanceof StructuredSelection) {
				StructuredSelection structuredSelection = (StructuredSelection) context;
				Object selection = structuredSelection.getFirstElement();

				if (selection instanceof GraphicalEditPart) {
					Object model = ((GraphicalEditPart) selection).getModel();
					if (model instanceof View) {
						EObject obj = ((View) model).getElement();
						if (obj instanceof DSemanticDecorator) {
							DSemanticDecorator deco = (DSemanticDecorator) obj;
							return (EcoreUtil.getRootContainer((EObject) deco.getTarget()) instanceof Project);
						}
					}
				} else if (selection instanceof EObject) {
					return (EcoreUtil.getRootContainer((EObject) selection) instanceof Project);
				} else
					return true;
			}
		}

		if (descriptor.getLabel().equals("Capella") || descriptor.getLabel().equals("Management")) {

			ISelectionService s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
			ISelection context = s.getSelection();

			if (context instanceof StructuredSelection) {
				StructuredSelection structuredSelection = (StructuredSelection) context;
				Object selection = structuredSelection.getFirstElement();

				if (selection instanceof GraphicalEditPart) {
					Object model = ((GraphicalEditPart) selection).getModel();
					if (model instanceof View) {
						EObject obj = ((View) model).getElement();
						if (obj instanceof DSemanticDecorator) {
							DSemanticDecorator deco = (DSemanticDecorator) obj;
							return !(EcoreUtil.getRootContainer((EObject) deco.getTarget()) instanceof Project);
						}
					}
				} else if (selection instanceof EObject) {
					return !(EcoreUtil.getRootContainer((EObject) selection) instanceof Project);
				} else
					return true;
			}
		}

		return true;
	}

}
