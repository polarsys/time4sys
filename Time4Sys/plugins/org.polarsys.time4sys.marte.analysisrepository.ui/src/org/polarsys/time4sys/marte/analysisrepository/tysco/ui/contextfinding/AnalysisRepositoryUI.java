/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;

public class AnalysisRepositoryUI extends TitleAreaDialog {

	/** User Interface's components **/
	private Shell parent;
	private Text repositoryLocationField,notifField;//aaxlLocationField,
	private Button browseSystem4Repository,browseWorkspace4Repository,check;//loadAaxl,
	
	private AnalysisRepositoryControler ctrl;
	
	private static final String title = "Analysis Repository";
	private static final String message = "Specify neccessary informations to analysis context";
	private Image image;
	
	/**
	 * Constructeur par défaut
	 * @param parentShell
	 * @generated NOT
	 */
	public AnalysisRepositoryUI(Shell parentShell) {
		super(parentShell);
		parent = parentShell;
		ctrl = new AnalysisRepositoryControler();
		//image = new Image(Display.getDefault(),"/icons/logolias.jpg");
	}

	@Override
	public void create() {
		super.create();
		setTitle(title);
		setMessage(message);
		if (image != null) setTitleImage(image);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout(1,true);
		parent.setLayout(layout);
		
		Composite loadSourceCompo = new Composite(parent, SWT.None);
		GridData gridData = new GridData(SWT.FILL,SWT.FILL,true,true);
		gridData.horizontalSpan = 1;
		loadSourceCompo.setLayoutData(gridData);
		loadSourceCompo.setLayout(new GridLayout(8,true));
		
		Label arLabel = new Label(loadSourceCompo, SWT.NONE);
		gridData = new GridData(SWT.LEFT,SWT.CENTER,true,true);
		gridData.horizontalSpan = 1;
		arLabel.setLayoutData(gridData);
		arLabel.setText("Repository");
		
		repositoryLocationField = new Text(loadSourceCompo,SWT.NONE|SWT.BORDER);
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 5;
		repositoryLocationField.setLayoutData(gridData);
		repositoryLocationField.setText("");
		
		browseSystem4Repository = new Button(loadSourceCompo,SWT.PUSH);
		gridData = new GridData(SWT.FILL,SWT.FILL,true,true);
		gridData.horizontalSpan = 1;
		browseSystem4Repository.setLayoutData(gridData);
		browseSystem4Repository.setText("System browse");
		browseSystem4Repository.addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
//				loadRepositoryInSystem();
			}			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {	
			}
		});
		
		browseWorkspace4Repository = new Button(loadSourceCompo,SWT.PUSH);
		gridData = new GridData(SWT.FILL,SWT.FILL,true,true);
		gridData.horizontalSpan = 1;
		browseWorkspace4Repository.setLayoutData(gridData);
		browseWorkspace4Repository.setText("Workspace browse");
		browseWorkspace4Repository.addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
//				loadRepositoryInWorkspace();
			}			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {	
			}
		});
		
		Composite resultCompo = new Composite(parent, SWT.None);
		gridData = new GridData(SWT.FILL,SWT.FILL,true,true);
		gridData.horizontalSpan = 1;
		resultCompo.setLayoutData(gridData);
		resultCompo.setLayout(new GridLayout(8,true));

		//Group group = new Group(resultCompo,SWT.BORDER);
		//group.setText("Error Messages");		
				
		notifField = new Text(resultCompo, SWT.MULTI|SWT.BORDER|SWT.READ_ONLY);
		notifField.setBackground(new Color(Display.getCurrent(),255,255,255));
		gridData = new GridData(SWT.FILL,SWT.FILL,true,true);
		gridData.horizontalSpan = 6;
		gridData.verticalSpan = 17;
		notifField.setLayoutData(gridData);
		
		check = new Button(resultCompo,SWT.PUSH);
		gridData = new GridData(GridData.CENTER, GridData.CENTER, false, false);
		gridData.horizontalSpan = 2;
		check.setLayoutData(gridData);
		check.setText("Check");
	    check.addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				WorkspaceUtils.setTime4sysProject();
				DesignModel time4SysModel = WorkspaceUtils.getDesign();
				check(time4SysModel);
			}			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {	
			}
		});
		
		
		return super.createDialogArea(parent);
	}
	
	public void check(DesignModel dm) {
		ctrl.check(dm);
	}
	
//	public void loadRepositoryInSystem(){
//		ctrl.loadRepositoryInSystem();
//	}
//	
//	public void loadRepositoryInWorkspace(){
//		ctrl.loadRepositoryInWorkspace();
//	}
	
	/*
	public void loadAaxl() {
		ctrl.loadAaxl();
	}*/
	
	//public String getAaxlLocation() {
	//	return aaxlLocationField.getText();
	//}
	
	public String getRepositoryLocation() {
		return repositoryLocationField.getText();
	}
	
	//public void setAaxlLocation(String lct) {
	///	if (lct==null) {
	//		setNotification("No file (*.aaxl2) to import");
	//		return;
	//	}
	//	aaxlLocationField.setText(lct);
	//}
	
	public void setRepositoryLocation(String lct) {
		if (lct==null) {
			setNotification("No file (*.tysco) to import");
			return;
		}
		repositoryLocationField.setText(lct);
	}
	
	public void setNotification(String notification) {
		if (notification!=null) notifField.setText(notification);
	}
	
	public AnalysisRepositoryControler getControler() {
		return ctrl;
	}
	
	public void setControler(AnalysisRepositoryControler ct){
		ctrl = ct;
	}
	
	public Shell getShell() {
		return parent;
	}
}
