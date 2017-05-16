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
public interface TaskPropertiesEditionPart {

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
	 * Init the ports
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPorts(ReferencesTableSettings settings);

	/**
	 * Update the ports
	 * @param newValue the ports to update
	 * @generated
	 */
	public void updatePorts();

	/**
	 * Adds the given filter to the ports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the ports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ports table
	 * @generated
	 */
	public boolean isContainedInPortsTable(EObject element);


	/**
	 * @return the behaviorKind
	 * @generated
	 */
	public Enumerator getBehaviorKind();

	/**
	 * Init the behaviorKind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initBehaviorKind(Object input, Enumerator current);

	/**
	 * Defines a new behaviorKind
	 * @param newValue the new behaviorKind to set
	 * @generated
	 */
	public void setBehaviorKind(Enumerator newValue);


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
	 * @return the scheduledBy
	 * @generated
	 */
	public EObject getScheduledBy();

	/**
	 * Init the scheduledBy
	 * @param settings the combo setting
	 */
	public void initScheduledBy(EObjectFlatComboSettings settings);

	/**
	 * Defines a new scheduledBy
	 * @param newValue the new scheduledBy to set
	 * @generated
	 */
	public void setScheduledBy(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setScheduledByButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the scheduledBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToScheduledBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the scheduledBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToScheduledBy(ViewerFilter filter);


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
	 * Init the schedulingParameters
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSchedulingParameters(ReferencesTableSettings settings);

	/**
	 * Update the schedulingParameters
	 * @param newValue the schedulingParameters to update
	 * @generated
	 */
	public void updateSchedulingParameters();

	/**
	 * Adds the given filter to the schedulingParameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToSchedulingParameters(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedulingParameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulingParameters(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedulingParameters table
	 * @generated
	 */
	public boolean isContainedInSchedulingParametersTable(EObject element);


	/**
	 * @return the originalName
	 * @generated
	 */
	public String getOriginalName();

	/**
	 * Defines a new originalName
	 * @param newValue the new originalName to set
	 * @generated
	 */
	public void setOriginalName(String newValue);




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
	 * @return the mappedTo
	 * @generated
	 */
	public EObject getMappedTo();

	/**
	 * Init the mappedTo
	 * @param settings the combo setting
	 */
	public void initMappedTo(EObjectFlatComboSettings settings);

	/**
	 * Defines a new mappedTo
	 * @param newValue the new mappedTo to set
	 * @generated
	 */
	public void setMappedTo(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setMappedToButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the mappedTo edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToMappedTo(ViewerFilter filter);

	/**
	 * Adds the given filter to the mappedTo edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToMappedTo(ViewerFilter filter);




	/**
	 * Init the fragments
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFragments(ReferencesTableSettings settings);

	/**
	 * Update the fragments
	 * @param newValue the fragments to update
	 * @generated
	 */
	public void updateFragments();

	/**
	 * Adds the given filter to the fragments edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToFragments(ViewerFilter filter);

	/**
	 * Adds the given filter to the fragments edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToFragments(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the fragments table
	 * @generated
	 */
	public boolean isContainedInFragmentsTable(EObject element);


	/**
	 * @return the first
	 * @generated
	 */
	public EObject getFirst();

	/**
	 * Init the first
	 * @param settings the combo setting
	 */
	public void initFirst(EObjectFlatComboSettings settings);

	/**
	 * Defines a new first
	 * @param newValue the new first to set
	 * @generated
	 */
	public void setFirst(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setFirstButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the first edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToFirst(ViewerFilter filter);

	/**
	 * Adds the given filter to the first edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToFirst(ViewerFilter filter);


	/**
	 * @return the blockingTime
	 * @generated
	 */
	public String getBlockingTime();

	/**
	 * Defines a new blockingTime
	 * @param newValue the new blockingTime to set
	 * @generated
	 */
	public void setBlockingTime(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
