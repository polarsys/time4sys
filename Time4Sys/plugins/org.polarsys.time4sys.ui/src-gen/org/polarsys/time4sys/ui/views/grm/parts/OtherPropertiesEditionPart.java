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
package org.polarsys.time4sys.ui.views.grm.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface OtherPropertiesEditionPart {

	/**
	 * @return the allocatedmemory
	 * 
	 */
	public String getAllocatedmemory();

	/**
	 * Defines a new allocatedmemory
	 * @param newValue the new allocatedmemory to set
	 * 
	 */
	public void setAllocatedmemory(String newValue);


	/**
	 * @return the usedMemory
	 * 
	 */
	public String getUsedMemory();

	/**
	 * Defines a new usedMemory
	 * @param newValue the new usedMemory to set
	 * 
	 */
	public void setUsedMemory(String newValue);


	/**
	 * @return the powerPeak
	 * 
	 */
	public String getPowerPeak();

	/**
	 * Defines a new powerPeak
	 * @param newValue the new powerPeak to set
	 * 
	 */
	public void setPowerPeak(String newValue);


	/**
	 * @return the energy
	 * 
	 */
	public String getEnergy();

	/**
	 * Defines a new energy
	 * @param newValue the new energy to set
	 * 
	 */
	public void setEnergy(String newValue);




	/**
	 * Init the pServices
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPServices(ReferencesTableSettings settings);

	/**
	 * Update the pServices
	 * @param newValue the pServices to update
	 * 
	 */
	public void updatePServices();

	/**
	 * Adds the given filter to the pServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the pServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the pServices table
	 * 
	 */
	public boolean isContainedInPServicesTable(EObject element);




	/**
	 * Init the rServices
	 * @param settings settings for the rServices ReferencesTable 
	 */
	public void initRServices(ReferencesTableSettings settings);

	/**
	 * Update the rServices
	 * @param newValue the rServices to update
	 * 
	 */
	public void updateRServices();

	/**
	 * Adds the given filter to the rServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the rServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the rServices table
	 * 
	 */
	public boolean isContainedInRServicesTable(EObject element);




	/**
	 * Init the pInterface
	 * @param settings settings for the pInterface ReferencesTable 
	 */
	public void initPInterface(ReferencesTableSettings settings);

	/**
	 * Update the pInterface
	 * @param newValue the pInterface to update
	 * 
	 */
	public void updatePInterface();

	/**
	 * Adds the given filter to the pInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPInterface(ViewerFilter filter);

	/**
	 * Adds the given filter to the pInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPInterface(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the pInterface table
	 * 
	 */
	public boolean isContainedInPInterfaceTable(EObject element);




	/**
	 * Init the rInterface
	 * @param settings settings for the rInterface ReferencesTable 
	 */
	public void initRInterface(ReferencesTableSettings settings);

	/**
	 * Update the rInterface
	 * @param newValue the rInterface to update
	 * 
	 */
	public void updateRInterface();

	/**
	 * Adds the given filter to the rInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRInterface(ViewerFilter filter);

	/**
	 * Adds the given filter to the rInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRInterface(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the rInterface table
	 * 
	 */
	public boolean isContainedInRInterfaceTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
