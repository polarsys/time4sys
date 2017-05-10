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
public interface TwcaEventModelPropertiesEditionPart {



	/**
	 * Init the offsets
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOffsets(ReferencesTableSettings settings);

	/**
	 * Update the offsets
	 * @param newValue the offsets to update
	 * @generated
	 */
	public void updateOffsets();

	/**
	 * Adds the given filter to the offsets edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToOffsets(ViewerFilter filter);

	/**
	 * Adds the given filter to the offsets edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToOffsets(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the offsets table
	 * @generated
	 */
	public boolean isContainedInOffsetsTable(EObject element);


	/**
	 * @return the period
	 * @generated
	 */
	public String getPeriod();

	/**
	 * Defines a new period
	 * @param newValue the new period to set
	 * @generated
	 */
	public void setPeriod(String newValue);


	/**
	 * @return the jitter
	 * @generated
	 */
	public String getJitter();

	/**
	 * Defines a new jitter
	 * @param newValue the new jitter to set
	 * @generated
	 */
	public void setJitter(String newValue);


	/**
	 * @return the dmin
	 * @generated
	 */
	public String getDmin();

	/**
	 * Defines a new dmin
	 * @param newValue the new dmin to set
	 * @generated
	 */
	public void setDmin(String newValue);


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
	 * @return the isSporadic
	 * @generated
	 */
	public Boolean getIsSporadic();

	/**
	 * Defines a new isSporadic
	 * @param newValue the new isSporadic to set
	 * @generated
	 */
	public void setIsSporadic(Boolean newValue);


	/**
	 * @return the deltamin_func
	 * @generated
	 */
	public String getDeltamin_func();

	/**
	 * Defines a new deltamin_func
	 * @param newValue the new deltamin_func to set
	 * @generated
	 */
	public void setDeltamin_func(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
