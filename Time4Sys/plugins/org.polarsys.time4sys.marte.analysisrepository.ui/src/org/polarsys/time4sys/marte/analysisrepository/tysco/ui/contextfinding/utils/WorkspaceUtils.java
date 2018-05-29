package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.polarsys.time4sys.model.time4sys.Project;

public class WorkspaceUtils {

	/**
	 * Get current project
	 * @return
	 */
	public static IProject getCurrentProject() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench==null) return null;
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		if (window==null) return null;
		IWorkbenchPage page = window.getActivePage();
		if (page==null) return null;
		IEditorPart part = page.getActiveEditor();
		if (part==null) return null;
		IEditorInput editorInput = part.getEditorInput();
		if (editorInput==null) return null;
		if (editorInput instanceof FileEditorInput) {
			IProject project = ((FileEditorInput)editorInput).getFile().getProject();
			return project;
		}
		return null;
	}
	
	/**
	 * Create new folder in project
	 * @param project
	 * @param folderName
	 * @return
	 */
	public static IFolder createFolder(IProject project,String folderName) {
		IFolder folder = project.getFolder(folderName);
		if (project==null||folderName.trim().compareTo("")==0) return null;
		try {
			if (folder.exists()) return folder;
			folder.create(true, true, null);
			ResourcesPlugin.getWorkspace().save(true, null);
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE,null);
			return folder;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * get time4sys project instance
	 * @return
	 */
	public static Project getTime4sysProject () {
		
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		Project time4sys = null;
		
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			if (structuredSelection.getFirstElement() instanceof Project) {
				time4sys = (Project)(structuredSelection.getFirstElement());		
			}
		}
		
		return time4sys;
	}
	
	/**
	 * Get output model path
	 * the default name is "result.xmi"
	 * @return
	 */
	public static String getOutputFolderPath() {
		
		IProject currentProject = WorkspaceUtils.getCurrentProject();
		IFolder folder = WorkspaceUtils.createFolder(currentProject,"tysco_out");
		String outputFolderPath = folder.getLocation().toOSString();
		
		//System.out.println("output folder path: "+outputFolderPath);
		
		//String outputModelPath = outputFolderPath+ "/transformed_model.txt";
		
		return outputFolderPath;
	}
	
	/**
	 * clean a folder with given folder path
	 * @param folderPath
	 * @return
	 */
	public static boolean cleanFolder(String folderPath) {
		File folder = new File(folderPath);
		return cleanFolder(folder);
	}
	
	
	/**
	 * clean a folder
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
	 * @return the model in current editor
	 */
	public static String getInputModelPath() {
		String sourcePath=null;
		
		// get path of source model to transform (first argument of Acceleo)
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench==null) return null;
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		if (window==null) return null;
		IWorkbenchPage page = window.getActivePage();
		if (page==null) return null;
		IEditorPart part = page.getActiveEditor();
		if (part==null) return null;
		IEditorInput editorInput = part.getEditorInput();
		if (editorInput==null) return null;
		if (editorInput instanceof FileEditorInput) {
			sourcePath = ((FileEditorInput)editorInput).getPath().toOSString();
		}
		
		return sourcePath;
	}
	
	
	/**
	 * Refresh project
	 * @param project
	 */
	public static boolean refreshProject() {
		
		try {
			getCurrentProject().refreshLocal(IProject.DEPTH_INFINITE,new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	
	/**
	 * Refresh project
	 * @param project
	 */
	public static boolean refreshProject(IProject project) {
		
		try {
			project.refreshLocal(IProject.DEPTH_INFINITE,new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	
	
	/*
	public static void main(String[] args) {
		String folderPath = "test";
		cleanFolder(folderPath);
	}*/
}
