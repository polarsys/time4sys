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
public interface ProtectionProtocolPropertiesEditionPart {

	/**
	 * @return the protocolName
	 * @generated
	 */
	public String getProtocolName();

	/**
	 * Defines a new protocolName
	 * @param newValue the new protocolName to set
	 * @generated
	 */
	public void setProtocolName(String newValue);




	/**
	 * Init the mutexes
	 * @param settings settings for the mutexes ReferencesTable 
	 */
	public void initMutexes(ReferencesTableSettings settings);

	/**
	 * Update the mutexes
	 * @param newValue the mutexes to update
	 * @generated
	 */
	public void updateMutexes();

	/**
	 * Adds the given filter to the mutexes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToMutexes(ViewerFilter filter);

	/**
	 * Adds the given filter to the mutexes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToMutexes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the mutexes table
	 * @generated
	 */
	public boolean isContainedInMutexesTable(EObject element);




	/**
	 * Init the requiredParameters
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRequiredParameters(ReferencesTableSettings settings);

	/**
	 * Update the requiredParameters
	 * @param newValue the requiredParameters to update
	 * @generated
	 */
	public void updateRequiredParameters();

	/**
	 * Adds the given filter to the requiredParameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToRequiredParameters(ViewerFilter filter);

	/**
	 * Adds the given filter to the requiredParameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToRequiredParameters(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the requiredParameters table
	 * @generated
	 */
	public boolean isContainedInRequiredParametersTable(EObject element);




	/**
	 * Init the resourceParameterValue
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResourceParameterValue(ReferencesTableSettings settings);

	/**
	 * Update the resourceParameterValue
	 * @param newValue the resourceParameterValue to update
	 * @generated
	 */
	public void updateResourceParameterValue();

	/**
	 * Adds the given filter to the resourceParameterValue edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToResourceParameterValue(ViewerFilter filter);

	/**
	 * Adds the given filter to the resourceParameterValue edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToResourceParameterValue(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resourceParameterValue table
	 * @generated
	 */
	public boolean isContainedInResourceParameterValueTable(EObject element);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
