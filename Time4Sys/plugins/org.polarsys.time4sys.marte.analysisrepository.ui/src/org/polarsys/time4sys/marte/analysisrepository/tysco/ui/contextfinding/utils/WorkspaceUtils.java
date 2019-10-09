/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 * Aurelien DIDIER- remove deprecated
 *******************************************************************************/
package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Project;

public class WorkspaceUtils {

	static DesignModel design = null;
	static IProject project = null;

	public static DesignModel getDesign(){
		return design;
	}
	public static IProject getProject(){
		return project;
	}

	/**
	 * Get current project
	 * 
	 * @return
	 */
	public static IProject getCurrentProject() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench == null)
			return null;
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		if (window == null)
			return null;
		IWorkbenchPage page = window.getActivePage();
		if (page == null)
			return null;
		IEditorPart part = page.getActiveEditor();
		if (part == null)
			return null;
		IEditorInput editorInput = part.getEditorInput();
		if (editorInput == null)
			return null;
		if (editorInput instanceof FileEditorInput) {
			IProject project = ((FileEditorInput) editorInput).getFile().getProject();
			return project;
		}
		return null;
	}

	public static IFile getIFile(Resource res) {
		URI uri = res.getURI();
		String filePath = uri.toPlatformString(true);
		IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath));
		return ifile;
	}

	/**
	 * Create new folder in project
	 * 
	 * @param project
	 * @param folderName
	 * @return
	 */
	public static IFolder createFolder(IProject project, String folderName) {
		IFolder folder = project.getFolder(folderName);
		if (project == null || folderName.trim().compareTo("") == 0)
			return null;
		try {
			if (folder.exists())
				return folder;
			folder.create(true, true, null);
			ResourcesPlugin.getWorkspace().save(true, null);
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
			return folder;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * get time4sys project instance
	 * 
	 * @return
	 * @return
	 */
	public static void setTime4sysProject() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof DesignModel) {
				design = (DesignModel) (structuredSelection.getFirstElement());
				project = getIFile(design.eResource()).getProject();
			}
		}
	}

	/**
	 * Get output model path the default name is "result.xmi"
	 * 
	 * @return
	 */
	public static String getOutputFolderPath(String results) {

		IFolder folder = createFolder(project, results);
		String outputFolderPath = folder.getLocation().toOSString();

		return outputFolderPath;
	}

	/**
	 * clean a folder with given folder path
	 * 
	 * @param folderPath
	 * @return
	 */
	public static boolean cleanFolder(String folderPath) {
		File folder = new File(folderPath);
		return cleanFolder(folder);
	}

	/**
	 * clean a folder
	 * 
	 * @param folder
	 * @return
	 */
	public static boolean cleanFolder(File folder) {

		try {
			FileUtils.cleanDirectory(folder);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	/**
	 * Get path of model to transform
	 * 
	 * @return the model in current editor
	 */
	// public static String getInputModelPath() {
	// String sourcePath=null;
	//
	// // get path of source model to transform (first argument of Acceleo)
	// IWorkbench workbench = PlatformUI.getWorkbench();
	// if (workbench==null) return null;
	// IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
	// if (window==null) return null;
	// IWorkbenchPage page = window.getActivePage();
	// if (page==null) return null;
	// IEditorPart part = page.getActiveEditor();
	// if (part==null) return null;
	// IEditorInput editorInput = part.getEditorInput();
	// if (editorInput==null) return null;
	// if (editorInput instanceof FileEditorInput) {
	// sourcePath = ((FileEditorInput)editorInput).getPath().toOSString();
	// }
	//
	// return sourcePath;
	// }

	/**
	 * Refresh project
	 * 
	 * @param project
	 */
	public static boolean refreshProject() {

		try {
			project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	/**
	 * Refresh project
	 * 
	 * @param project
	 */
	public static boolean refreshProject(IProject project) {

		try {
			project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	/*
	 * public static void main(String[] args) { String folderPath = "test";
	 * cleanFolder(folderPath); }
	 */
}
