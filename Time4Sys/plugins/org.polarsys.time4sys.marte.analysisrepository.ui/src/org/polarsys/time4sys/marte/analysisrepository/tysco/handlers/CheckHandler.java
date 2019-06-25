/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 * Aurelien DIDIER- check design model instead of whole project
 *******************************************************************************/
package org.polarsys.time4sys.marte.analysisrepository.tysco.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;


public class CheckHandler extends AbstractHandler {
	
	private AnalysisRepositoryControler ctrl;

	/**
	 * @generated NOT
	 */	
	
	public CheckHandler() {
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ctrl = new AnalysisRepositoryControler();
		WorkspaceUtils.setTime4sysProject();
		DesignModel time4SysModel = WorkspaceUtils.getDesign();
		ctrl.check(time4SysModel);
		return null;
	}
	
	@Override
	public void setEnabled(Object evaluationContext) {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			if (structuredSelection.getFirstElement() instanceof DesignModel) {
					setBaseEnabled(true);
					return;			
			} 
		} 
		setBaseEnabled(false);
	}
}
