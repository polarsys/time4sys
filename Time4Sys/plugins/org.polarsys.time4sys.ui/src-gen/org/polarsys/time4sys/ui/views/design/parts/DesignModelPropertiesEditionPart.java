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
package org.polarsys.time4sys.ui.views.design.parts;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface DesignModelPropertiesEditionPart {



	/**
	 * Init the endToEndFlows
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEndToEndFlows(ReferencesTableSettings settings);

	/**
	 * Update the endToEndFlows
	 * @param newValue the endToEndFlows to update
	 * @generated
	 */
	public void updateEndToEndFlows();

	/**
	 * Adds the given filter to the endToEndFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToEndToEndFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the endToEndFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToEndToEndFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the endToEndFlows table
	 * @generated
	 */
	public boolean isContainedInEndToEndFlowsTable(EObject element);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
