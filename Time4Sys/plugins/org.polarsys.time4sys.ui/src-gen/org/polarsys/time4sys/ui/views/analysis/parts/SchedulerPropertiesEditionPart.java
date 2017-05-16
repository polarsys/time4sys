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

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface SchedulerPropertiesEditionPart {

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
	 * @return the policyKind
	 * @generated
	 */
	public Enumerator getPolicyKind();

	/**
	 * Init the policyKind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPolicyKind(Object input, Enumerator current);

	/**
	 * Defines a new policyKind
	 * @param newValue the new policyKind to set
	 * @generated
	 */
	public void setPolicyKind(Enumerator newValue);




	/**
	 * Init the scheduledElements
	 * @param settings settings for the scheduledElements ReferencesTable 
	 */
	public void initScheduledElements(ReferencesTableSettings settings);

	/**
	 * Update the scheduledElements
	 * @param newValue the scheduledElements to update
	 * @generated
	 */
	public void updateScheduledElements();

	/**
	 * Adds the given filter to the scheduledElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToScheduledElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the scheduledElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToScheduledElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the scheduledElements table
	 * @generated
	 */
	public boolean isContainedInScheduledElementsTable(EObject element);


	/**
	 * @return the usedBy
	 * @generated
	 */
	public EObject getUsedBy();

	/**
	 * Init the usedBy
	 * @param settings the combo setting
	 */
	public void initUsedBy(EObjectFlatComboSettings settings);

	/**
	 * Defines a new usedBy
	 * @param newValue the new usedBy to set
	 * @generated
	 */
	public void setUsedBy(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setUsedByButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the usedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToUsedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the usedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToUsedBy(ViewerFilter filter);




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
	 * @return the preferredPolicy
	 * @generated
	 */
	public String getPreferredPolicy();

	/**
	 * Defines a new preferredPolicy
	 * @param newValue the new preferredPolicy to set
	 * @generated
	 */
	public void setPreferredPolicy(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
