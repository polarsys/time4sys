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

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface OffsetPropertiesEditionPart {

	/**
	 * @return the eventModel
	 * @generated
	 */
	public EObject getEventModel();

	/**
	 * Init the eventModel
	 * @param settings the combo setting
	 */
	public void initEventModel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new eventModel
	 * @param newValue the new eventModel to set
	 * @generated
	 */
	public void setEventModel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setEventModelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eventModel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToEventModel(ViewerFilter filter);

	/**
	 * Adds the given filter to the eventModel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToEventModel(ViewerFilter filter);


	/**
	 * @return the value
	 * @generated
	 */
	public String getValue();

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * @generated
	 */
	public void setValue(String newValue);


	/**
	 * @return the reference
	 * @generated
	 */
	public String getReference();

	/**
	 * Defines a new reference
	 * @param newValue the new reference to set
	 * @generated
	 */
	public void setReference(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
