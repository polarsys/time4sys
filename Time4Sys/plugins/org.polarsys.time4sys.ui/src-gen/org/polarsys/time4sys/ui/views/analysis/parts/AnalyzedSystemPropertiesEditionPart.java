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

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface AnalyzedSystemPropertiesEditionPart {

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
	 * Init the schedulableElements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSchedulableElements(ReferencesTableSettings settings);

	/**
	 * Update the schedulableElements
	 * @param newValue the schedulableElements to update
	 * @generated
	 */
	public void updateSchedulableElements();

	/**
	 * Adds the given filter to the schedulableElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToSchedulableElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedulableElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulableElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedulableElements table
	 * @generated
	 */
	public boolean isContainedInSchedulableElementsTable(EObject element);




	/**
	 * Init the schedulers
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSchedulers(ReferencesTableSettings settings);

	/**
	 * Update the schedulers
	 * @param newValue the schedulers to update
	 * @generated
	 */
	public void updateSchedulers();

	/**
	 * Adds the given filter to the schedulers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToSchedulers(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedulers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedulers table
	 * @generated
	 */
	public boolean isContainedInSchedulersTable(EObject element);




	/**
	 * Init the resources
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResources(ReferencesTableSettings settings);

	/**
	 * Update the resources
	 * @param newValue the resources to update
	 * @generated
	 */
	public void updateResources();

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resources table
	 * @generated
	 */
	public boolean isContainedInResourcesTable(EObject element);




	/**
	 * Init the stimuli
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStimuli(ReferencesTableSettings settings);

	/**
	 * Update the stimuli
	 * @param newValue the stimuli to update
	 * @generated
	 */
	public void updateStimuli();

	/**
	 * Adds the given filter to the stimuli edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToStimuli(ViewerFilter filter);

	/**
	 * Adds the given filter to the stimuli edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToStimuli(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the stimuli table
	 * @generated
	 */
	public boolean isContainedInStimuliTable(EObject element);




	/**
	 * Init the delays
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDelays(ReferencesTableSettings settings);

	/**
	 * Update the delays
	 * @param newValue the delays to update
	 * @generated
	 */
	public void updateDelays();

	/**
	 * Adds the given filter to the delays edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToDelays(ViewerFilter filter);

	/**
	 * Adds the given filter to the delays edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToDelays(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the delays table
	 * @generated
	 */
	public boolean isContainedInDelaysTable(EObject element);




	/**
	 * Init the protectionProtocols
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProtectionProtocols(ReferencesTableSettings settings);

	/**
	 * Update the protectionProtocols
	 * @param newValue the protectionProtocols to update
	 * @generated
	 */
	public void updateProtectionProtocols();

	/**
	 * Adds the given filter to the protectionProtocols edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToProtectionProtocols(ViewerFilter filter);

	/**
	 * Adds the given filter to the protectionProtocols edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToProtectionProtocols(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the protectionProtocols table
	 * @generated
	 */
	public boolean isContainedInProtectionProtocolsTable(EObject element);




	/**
	 * Init the mutexes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
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
	 * @return the status
	 * @generated
	 */
	public String getStatus();

	/**
	 * Defines a new status
	 * @param newValue the new status to set
	 * @generated
	 */
	public void setStatus(String newValue);




	/**
	 * Init the resultContainers
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResultContainers(ReferencesTableSettings settings);

	/**
	 * Update the resultContainers
	 * @param newValue the resultContainers to update
	 * @generated
	 */
	public void updateResultContainers();

	/**
	 * Adds the given filter to the resultContainers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToResultContainers(ViewerFilter filter);

	/**
	 * Adds the given filter to the resultContainers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToResultContainers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resultContainers table
	 * @generated
	 */
	public boolean isContainedInResultContainersTable(EObject element);




	/**
	 * Init the mappings
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMappings(ReferencesTableSettings settings);

	/**
	 * Update the mappings
	 * @param newValue the mappings to update
	 * @generated
	 */
	public void updateMappings();

	/**
	 * Adds the given filter to the mappings edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToMappings(ViewerFilter filter);

	/**
	 * Adds the given filter to the mappings edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToMappings(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the mappings table
	 * @generated
	 */
	public boolean isContainedInMappingsTable(EObject element);


	/**
	 * @return the timeUnit
	 * @generated
	 */
	public String getTimeUnit();

	/**
	 * Defines a new timeUnit
	 * @param newValue the new timeUnit to set
	 * @generated
	 */
	public void setTimeUnit(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
