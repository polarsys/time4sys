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
public interface ConstraintContainerPropertiesEditionPart {

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
	 * Init the constraints
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initConstraints(ReferencesTableSettings settings);

	/**
	 * Update the constraints
	 * @param newValue the constraints to update
	 * @generated
	 */
	public void updateConstraints();

	/**
	 * Adds the given filter to the constraints edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToConstraints(ViewerFilter filter);

	/**
	 * Adds the given filter to the constraints edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToConstraints(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the constraints table
	 * @generated
	 */
	public boolean isContainedInConstraintsTable(EObject element);


	/**
	 * @return the analyzedSystem
	 * @generated
	 */
	public EObject getAnalyzedSystem();

	/**
	 * Init the analyzedSystem
	 * @param settings the combo setting
	 */
	public void initAnalyzedSystem(EObjectFlatComboSettings settings);

	/**
	 * Defines a new analyzedSystem
	 * @param newValue the new analyzedSystem to set
	 * @generated
	 */
	public void setAnalyzedSystem(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setAnalyzedSystemButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the analyzedSystem edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToAnalyzedSystem(ViewerFilter filter);

	/**
	 * Adds the given filter to the analyzedSystem edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToAnalyzedSystem(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
