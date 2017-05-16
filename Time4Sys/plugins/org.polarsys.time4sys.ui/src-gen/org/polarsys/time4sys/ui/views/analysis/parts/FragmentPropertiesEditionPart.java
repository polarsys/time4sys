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
package org.polarsys.time4sys.ui.views.analysis.parts;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface FragmentPropertiesEditionPart {

	/**
	 * @return the name
	 * @generated
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * @generated
	 */
	public void setName(String newValue);




	/**
	 * Init the lockedMutexes
	 * @param settings settings for the lockedMutexes ReferencesTable 
	 */
	public void initLockedMutexes(ReferencesTableSettings settings);

	/**
	 * Update the lockedMutexes
	 * @param newValue the lockedMutexes to update
	 * @generated
	 */
	public void updateLockedMutexes();

	/**
	 * Adds the given filter to the lockedMutexes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToLockedMutexes(ViewerFilter filter);

	/**
	 * Adds the given filter to the lockedMutexes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToLockedMutexes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the lockedMutexes table
	 * @generated
	 */
	public boolean isContainedInLockedMutexesTable(EObject element);


	/**
	 * @return the next
	 * @generated
	 */
	public EObject getNext();

	/**
	 * Init the next
	 * @param settings the combo setting
	 */
	public void initNext(EObjectFlatComboSettings settings);

	/**
	 * Defines a new next
	 * @param newValue the new next to set
	 * @generated
	 */
	public void setNext(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setNextButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the next edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToNext(ViewerFilter filter);

	/**
	 * Adds the given filter to the next edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToNext(ViewerFilter filter);


	/**
	 * @return the previous
	 * @generated
	 */
	public EObject getPrevious();

	/**
	 * Init the previous
	 * @param settings the combo setting
	 */
	public void initPrevious(EObjectFlatComboSettings settings);

	/**
	 * Defines a new previous
	 * @param newValue the new previous to set
	 * @generated
	 */
	public void setPrevious(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setPreviousButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the previous edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToPrevious(ViewerFilter filter);

	/**
	 * Adds the given filter to the previous edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToPrevious(ViewerFilter filter);


	/**
	 * @return the task
	 * @generated
	 */
	public EObject getTask();

	/**
	 * Init the task
	 * @param settings the combo setting
	 */
	public void initTask(EObjectFlatComboSettings settings);

	/**
	 * Defines a new task
	 * @param newValue the new task to set
	 * @generated
	 */
	public void setTask(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setTaskButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the task edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTask(ViewerFilter filter);

	/**
	 * Adds the given filter to the task edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTask(ViewerFilter filter);


	/**
	 * @return the CET
	 * @generated
	 */
	public String getCET();

	/**
	 * Defines a new CET
	 * @param newValue the new CET to set
	 * @generated
	 */
	public void setCET(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
