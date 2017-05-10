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
public interface OutputStimulusPropertiesEditionPart {

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
	 * @return the parent
	 * @generated
	 */
	public EObject getParent_();

	/**
	 * Init the parent
	 * @param settings the combo setting
	 */
	public void initParent_(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parent
	 * @param newValue the new parent to set
	 * @generated
	 */
	public void setParent_(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter);




	/**
	 * Init the inputPorts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInputPorts(ReferencesTableSettings settings);

	/**
	 * Update the inputPorts
	 * @param newValue the inputPorts to update
	 * @generated
	 */
	public void updateInputPorts();

	/**
	 * Adds the given filter to the inputPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToInputPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToInputPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inputPorts table
	 * @generated
	 */
	public boolean isContainedInInputPortsTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
