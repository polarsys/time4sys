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
package org.polarsys.time4sys.ui.views.srm.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;

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
	 * @return the packetSize
	 * 
	 */
	public String getPacketSize();

	/**
	 * Defines a new packetSize
	 * @param newValue the new packetSize to set
	 * 
	 */
	public void setPacketSize(String newValue);


	/**
	 * @return the isMaskable
	 * 
	 */
	public Boolean getIsMaskable();

	/**
	 * Defines a new isMaskable
	 * @param newValue the new isMaskable to set
	 * 
	 */
	public void setIsMaskable(Boolean newValue);


	/**
	 * @return the isStaticSchedulingFeature
	 * 
	 */
	public Boolean getIsStaticSchedulingFeature();

	/**
	 * Defines a new isStaticSchedulingFeature
	 * @param newValue the new isStaticSchedulingFeature to set
	 * 
	 */
	public void setIsStaticSchedulingFeature(Boolean newValue);


	/**
	 * @return the isIntraMemoryPartitionInteraction
	 * 
	 */
	public Boolean getIsIntraMemoryPartitionInteraction();

	/**
	 * Defines a new isIntraMemoryPartitionInteraction
	 * @param newValue the new isIntraMemoryPartitionInteraction to set
	 * 
	 */
	public void setIsIntraMemoryPartitionInteraction(Boolean newValue);


	/**
	 * @return the memoryBlockAddressElements
	 * 
	 */
	public EList getMemoryBlockAddressElements();

	/**
	 * Defines a new memoryBlockAddressElements
	 * @param newValue the new memoryBlockAddressElements to set
	 * 
	 */
	public void setMemoryBlockAddressElements(EList newValue);

	/**
	 * Add a value to the memoryBlockAddressElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMemoryBlockAddressElements(Object newValue);

	/**
	 * Remove a value to the memoryBlockAddressElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMemoryBlockAddressElements(Object newValue);


	/**
	 * @return the stackSizeElements
	 * 
	 */
	public EList getStackSizeElements();

	/**
	 * Defines a new stackSizeElements
	 * @param newValue the new stackSizeElements to set
	 * 
	 */
	public void setStackSizeElements(EList newValue);

	/**
	 * Add a value to the stackSizeElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToStackSizeElements(Object newValue);

	/**
	 * Remove a value to the stackSizeElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToStackSizeElements(Object newValue);


	/**
	 * @return the heapSizeElements
	 * 
	 */
	public EList getHeapSizeElements();

	/**
	 * Defines a new heapSizeElements
	 * @param newValue the new heapSizeElements to set
	 * 
	 */
	public void setHeapSizeElements(EList newValue);

	/**
	 * Add a value to the heapSizeElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToHeapSizeElements(Object newValue);

	/**
	 * Remove a value to the heapSizeElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToHeapSizeElements(Object newValue);


	/**
	 * @return the maskElements
	 * 
	 */
	public EList getMaskElements();

	/**
	 * Defines a new maskElements
	 * @param newValue the new maskElements to set
	 * 
	 */
	public void setMaskElements(EList newValue);

	/**
	 * Add a value to the maskElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMaskElements(Object newValue);

	/**
	 * Remove a value to the maskElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMaskElements(Object newValue);


	/**
	 * @return the vectorElements
	 * 
	 */
	public EList getVectorElements();

	/**
	 * Defines a new vectorElements
	 * @param newValue the new vectorElements to set
	 * 
	 */
	public void setVectorElements(EList newValue);

	/**
	 * Add a value to the vectorElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToVectorElements(Object newValue);

	/**
	 * Remove a value to the vectorElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToVectorElements(Object newValue);


	/**
	 * @return the memoryBlockSizeElements
	 * 
	 */
	public EList getMemoryBlockSizeElements();

	/**
	 * Defines a new memoryBlockSizeElements
	 * @param newValue the new memoryBlockSizeElements to set
	 * 
	 */
	public void setMemoryBlockSizeElements(EList newValue);

	/**
	 * Add a value to the memoryBlockSizeElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMemoryBlockSizeElements(Object newValue);

	/**
	 * Remove a value to the memoryBlockSizeElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMemoryBlockSizeElements(Object newValue);




	/**
	 * Init the ownedService
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedService(ReferencesTableSettings settings);

	/**
	 * Update the ownedService
	 * @param newValue the ownedService to update
	 * 
	 */
	public void updateOwnedService();

	/**
	 * Adds the given filter to the ownedService edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedService(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedService edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedService(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedService table
	 * 
	 */
	public boolean isContainedInOwnedServiceTable(EObject element);




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
	 * Init the createServices
	 * @param settings settings for the createServices ReferencesTable 
	 */
	public void initCreateServices(ReferencesTableSettings settings);

	/**
	 * Update the createServices
	 * @param newValue the createServices to update
	 * 
	 */
	public void updateCreateServices();

	/**
	 * Adds the given filter to the createServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCreateServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the createServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCreateServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the createServices table
	 * 
	 */
	public boolean isContainedInCreateServicesTable(EObject element);




	/**
	 * Init the deleteServices
	 * @param settings settings for the deleteServices ReferencesTable 
	 */
	public void initDeleteServices(ReferencesTableSettings settings);

	/**
	 * Update the deleteServices
	 * @param newValue the deleteServices to update
	 * 
	 */
	public void updateDeleteServices();

	/**
	 * Adds the given filter to the deleteServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDeleteServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the deleteServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDeleteServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the deleteServices table
	 * 
	 */
	public boolean isContainedInDeleteServicesTable(EObject element);




	/**
	 * Init the initializeServices
	 * @param settings settings for the initializeServices ReferencesTable 
	 */
	public void initInitializeServices(ReferencesTableSettings settings);

	/**
	 * Update the initializeServices
	 * @param newValue the initializeServices to update
	 * 
	 */
	public void updateInitializeServices();

	/**
	 * Adds the given filter to the initializeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInitializeServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the initializeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInitializeServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the initializeServices table
	 * 
	 */
	public boolean isContainedInInitializeServicesTable(EObject element);




	/**
	 * Init the activateServices
	 * @param settings settings for the activateServices ReferencesTable 
	 */
	public void initActivateServices(ReferencesTableSettings settings);

	/**
	 * Update the activateServices
	 * @param newValue the activateServices to update
	 * 
	 */
	public void updateActivateServices();

	/**
	 * Adds the given filter to the activateServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToActivateServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the activateServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToActivateServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the activateServices table
	 * 
	 */
	public boolean isContainedInActivateServicesTable(EObject element);




	/**
	 * Init the resumeServices
	 * @param settings settings for the resumeServices ReferencesTable 
	 */
	public void initResumeServices(ReferencesTableSettings settings);

	/**
	 * Update the resumeServices
	 * @param newValue the resumeServices to update
	 * 
	 */
	public void updateResumeServices();

	/**
	 * Adds the given filter to the resumeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResumeServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the resumeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResumeServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resumeServices table
	 * 
	 */
	public boolean isContainedInResumeServicesTable(EObject element);




	/**
	 * Init the suspendServices
	 * @param settings settings for the suspendServices ReferencesTable 
	 */
	public void initSuspendServices(ReferencesTableSettings settings);

	/**
	 * Update the suspendServices
	 * @param newValue the suspendServices to update
	 * 
	 */
	public void updateSuspendServices();

	/**
	 * Adds the given filter to the suspendServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSuspendServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the suspendServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSuspendServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the suspendServices table
	 * 
	 */
	public boolean isContainedInSuspendServicesTable(EObject element);




	/**
	 * Init the enableConcurrencyServices
	 * @param settings settings for the enableConcurrencyServices ReferencesTable 
	 */
	public void initEnableConcurrencyServices(ReferencesTableSettings settings);

	/**
	 * Update the enableConcurrencyServices
	 * @param newValue the enableConcurrencyServices to update
	 * 
	 */
	public void updateEnableConcurrencyServices();

	/**
	 * Adds the given filter to the enableConcurrencyServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEnableConcurrencyServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the enableConcurrencyServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEnableConcurrencyServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the enableConcurrencyServices table
	 * 
	 */
	public boolean isContainedInEnableConcurrencyServicesTable(EObject element);




	/**
	 * Init the disableConcurrencyServices
	 * @param settings settings for the disableConcurrencyServices ReferencesTable 
	 */
	public void initDisableConcurrencyServices(ReferencesTableSettings settings);

	/**
	 * Update the disableConcurrencyServices
	 * @param newValue the disableConcurrencyServices to update
	 * 
	 */
	public void updateDisableConcurrencyServices();

	/**
	 * Adds the given filter to the disableConcurrencyServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDisableConcurrencyServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the disableConcurrencyServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDisableConcurrencyServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the disableConcurrencyServices table
	 * 
	 */
	public boolean isContainedInDisableConcurrencyServicesTable(EObject element);




	/**
	 * Init the forkServices
	 * @param settings settings for the forkServices ReferencesTable 
	 */
	public void initForkServices(ReferencesTableSettings settings);

	/**
	 * Update the forkServices
	 * @param newValue the forkServices to update
	 * 
	 */
	public void updateForkServices();

	/**
	 * Adds the given filter to the forkServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToForkServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the forkServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToForkServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the forkServices table
	 * 
	 */
	public boolean isContainedInForkServicesTable(EObject element);




	/**
	 * Init the exitServices
	 * @param settings settings for the exitServices ReferencesTable 
	 */
	public void initExitServices(ReferencesTableSettings settings);

	/**
	 * Update the exitServices
	 * @param newValue the exitServices to update
	 * 
	 */
	public void updateExitServices();

	/**
	 * Adds the given filter to the exitServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExitServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the exitServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExitServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the exitServices table
	 * 
	 */
	public boolean isContainedInExitServicesTable(EObject element);




	/**
	 * Init the memorySpaces
	 * @param settings settings for the memorySpaces ReferencesTable 
	 */
	public void initMemorySpaces(ReferencesTableSettings settings);

	/**
	 * Update the memorySpaces
	 * @param newValue the memorySpaces to update
	 * 
	 */
	public void updateMemorySpaces();

	/**
	 * Adds the given filter to the memorySpaces edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMemorySpaces(ViewerFilter filter);

	/**
	 * Adds the given filter to the memorySpaces edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMemorySpaces(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the memorySpaces table
	 * 
	 */
	public boolean isContainedInMemorySpacesTable(EObject element);




	/**
	 * Init the closeServices
	 * @param settings settings for the closeServices ReferencesTable 
	 */
	public void initCloseServices(ReferencesTableSettings settings);

	/**
	 * Update the closeServices
	 * @param newValue the closeServices to update
	 * 
	 */
	public void updateCloseServices();

	/**
	 * Adds the given filter to the closeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCloseServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the closeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCloseServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the closeServices table
	 * 
	 */
	public boolean isContainedInCloseServicesTable(EObject element);




	/**
	 * Init the openServices
	 * @param settings settings for the openServices ReferencesTable 
	 */
	public void initOpenServices(ReferencesTableSettings settings);

	/**
	 * Update the openServices
	 * @param newValue the openServices to update
	 * 
	 */
	public void updateOpenServices();

	/**
	 * Adds the given filter to the openServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOpenServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the openServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOpenServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the openServices table
	 * 
	 */
	public boolean isContainedInOpenServicesTable(EObject element);




	/**
	 * Init the acquireServices
	 * @param settings settings for the acquireServices ReferencesTable 
	 */
	public void initAcquireServices(ReferencesTableSettings settings);

	/**
	 * Update the acquireServices
	 * @param newValue the acquireServices to update
	 * 
	 */
	public void updateAcquireServices();

	/**
	 * Adds the given filter to the acquireServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAcquireServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the acquireServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAcquireServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the acquireServices table
	 * 
	 */
	public boolean isContainedInAcquireServicesTable(EObject element);




	/**
	 * Init the releaseServices
	 * @param settings settings for the releaseServices ReferencesTable 
	 */
	public void initReleaseServices(ReferencesTableSettings settings);

	/**
	 * Update the releaseServices
	 * @param newValue the releaseServices to update
	 * 
	 */
	public void updateReleaseServices();

	/**
	 * Adds the given filter to the releaseServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReleaseServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the releaseServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReleaseServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the releaseServices table
	 * 
	 */
	public boolean isContainedInReleaseServicesTable(EObject element);




	/**
	 * Init the controlServices
	 * @param settings settings for the controlServices ReferencesTable 
	 */
	public void initControlServices(ReferencesTableSettings settings);

	/**
	 * Update the controlServices
	 * @param newValue the controlServices to update
	 * 
	 */
	public void updateControlServices();

	/**
	 * Adds the given filter to the controlServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToControlServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the controlServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToControlServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the controlServices table
	 * 
	 */
	public boolean isContainedInControlServicesTable(EObject element);




	/**
	 * Init the sendServices
	 * @param settings settings for the sendServices ReferencesTable 
	 */
	public void initSendServices(ReferencesTableSettings settings);

	/**
	 * Update the sendServices
	 * @param newValue the sendServices to update
	 * 
	 */
	public void updateSendServices();

	/**
	 * Adds the given filter to the sendServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSendServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the sendServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSendServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the sendServices table
	 * 
	 */
	public boolean isContainedInSendServicesTable(EObject element);




	/**
	 * Init the receiveServices
	 * @param settings settings for the receiveServices ReferencesTable 
	 */
	public void initReceiveServices(ReferencesTableSettings settings);

	/**
	 * Update the receiveServices
	 * @param newValue the receiveServices to update
	 * 
	 */
	public void updateReceiveServices();

	/**
	 * Adds the given filter to the receiveServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReceiveServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the receiveServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReceiveServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the receiveServices table
	 * 
	 */
	public boolean isContainedInReceiveServicesTable(EObject element);




	/**
	 * Init the readServices
	 * @param settings settings for the readServices ReferencesTable 
	 */
	public void initReadServices(ReferencesTableSettings settings);

	/**
	 * Update the readServices
	 * @param newValue the readServices to update
	 * 
	 */
	public void updateReadServices();

	/**
	 * Adds the given filter to the readServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReadServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the readServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReadServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the readServices table
	 * 
	 */
	public boolean isContainedInReadServicesTable(EObject element);




	/**
	 * Init the writeServices
	 * @param settings settings for the writeServices ReferencesTable 
	 */
	public void initWriteServices(ReferencesTableSettings settings);

	/**
	 * Update the writeServices
	 * @param newValue the writeServices to update
	 * 
	 */
	public void updateWriteServices();

	/**
	 * Adds the given filter to the writeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToWriteServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the writeServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToWriteServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the writeServices table
	 * 
	 */
	public boolean isContainedInWriteServicesTable(EObject element);




	/**
	 * Init the flushServices
	 * @param settings settings for the flushServices ReferencesTable 
	 */
	public void initFlushServices(ReferencesTableSettings settings);

	/**
	 * Update the flushServices
	 * @param newValue the flushServices to update
	 * 
	 */
	public void updateFlushServices();

	/**
	 * Adds the given filter to the flushServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFlushServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the flushServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFlushServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the flushServices table
	 * 
	 */
	public boolean isContainedInFlushServicesTable(EObject element);




	/**
	 * Init the signalServices
	 * @param settings settings for the signalServices ReferencesTable 
	 */
	public void initSignalServices(ReferencesTableSettings settings);

	/**
	 * Update the signalServices
	 * @param newValue the signalServices to update
	 * 
	 */
	public void updateSignalServices();

	/**
	 * Adds the given filter to the signalServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSignalServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the signalServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSignalServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the signalServices table
	 * 
	 */
	public boolean isContainedInSignalServicesTable(EObject element);




	/**
	 * Init the waitServices
	 * @param settings settings for the waitServices ReferencesTable 
	 */
	public void initWaitServices(ReferencesTableSettings settings);

	/**
	 * Update the waitServices
	 * @param newValue the waitServices to update
	 * 
	 */
	public void updateWaitServices();

	/**
	 * Adds the given filter to the waitServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToWaitServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the waitServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToWaitServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the waitServices table
	 * 
	 */
	public boolean isContainedInWaitServicesTable(EObject element);




	/**
	 * Init the clearServices
	 * @param settings settings for the clearServices ReferencesTable 
	 */
	public void initClearServices(ReferencesTableSettings settings);

	/**
	 * Update the clearServices
	 * @param newValue the clearServices to update
	 * 
	 */
	public void updateClearServices();

	/**
	 * Adds the given filter to the clearServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClearServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the clearServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClearServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the clearServices table
	 * 
	 */
	public boolean isContainedInClearServicesTable(EObject element);




	/**
	 * Init the lockServices
	 * @param settings settings for the lockServices ReferencesTable 
	 */
	public void initLockServices(ReferencesTableSettings settings);

	/**
	 * Update the lockServices
	 * @param newValue the lockServices to update
	 * 
	 */
	public void updateLockServices();

	/**
	 * Adds the given filter to the lockServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLockServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the lockServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLockServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the lockServices table
	 * 
	 */
	public boolean isContainedInLockServicesTable(EObject element);




	/**
	 * Init the unlockServices
	 * @param settings settings for the unlockServices ReferencesTable 
	 */
	public void initUnlockServices(ReferencesTableSettings settings);

	/**
	 * Update the unlockServices
	 * @param newValue the unlockServices to update
	 * 
	 */
	public void updateUnlockServices();

	/**
	 * Adds the given filter to the unlockServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUnlockServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the unlockServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUnlockServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the unlockServices table
	 * 
	 */
	public boolean isContainedInUnlockServicesTable(EObject element);




	/**
	 * Init the joinServices
	 * @param settings settings for the joinServices ReferencesTable 
	 */
	public void initJoinServices(ReferencesTableSettings settings);

	/**
	 * Update the joinServices
	 * @param newValue the joinServices to update
	 * 
	 */
	public void updateJoinServices();

	/**
	 * Adds the given filter to the joinServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToJoinServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the joinServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToJoinServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the joinServices table
	 * 
	 */
	public boolean isContainedInJoinServicesTable(EObject element);




	/**
	 * Init the yieldServices
	 * @param settings settings for the yieldServices ReferencesTable 
	 */
	public void initYieldServices(ReferencesTableSettings settings);

	/**
	 * Update the yieldServices
	 * @param newValue the yieldServices to update
	 * 
	 */
	public void updateYieldServices();

	/**
	 * Adds the given filter to the yieldServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToYieldServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the yieldServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToYieldServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the yieldServices table
	 * 
	 */
	public boolean isContainedInYieldServicesTable(EObject element);




	/**
	 * Init the delayServices
	 * @param settings settings for the delayServices ReferencesTable 
	 */
	public void initDelayServices(ReferencesTableSettings settings);

	/**
	 * Update the delayServices
	 * @param newValue the delayServices to update
	 * 
	 */
	public void updateDelayServices();

	/**
	 * Adds the given filter to the delayServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDelayServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the delayServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDelayServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the delayServices table
	 * 
	 */
	public boolean isContainedInDelayServicesTable(EObject element);




	/**
	 * Init the mapServices
	 * @param settings settings for the mapServices ReferencesTable 
	 */
	public void initMapServices(ReferencesTableSettings settings);

	/**
	 * Update the mapServices
	 * @param newValue the mapServices to update
	 * 
	 */
	public void updateMapServices();

	/**
	 * Adds the given filter to the mapServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMapServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the mapServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMapServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the mapServices table
	 * 
	 */
	public boolean isContainedInMapServicesTable(EObject element);




	/**
	 * Init the unmapServices
	 * @param settings settings for the unmapServices ReferencesTable 
	 */
	public void initUnmapServices(ReferencesTableSettings settings);

	/**
	 * Update the unmapServices
	 * @param newValue the unmapServices to update
	 * 
	 */
	public void updateUnmapServices();

	/**
	 * Adds the given filter to the unmapServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUnmapServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the unmapServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUnmapServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the unmapServices table
	 * 
	 */
	public boolean isContainedInUnmapServicesTable(EObject element);




	/**
	 * Init the terminateServices
	 * @param settings settings for the terminateServices ReferencesTable 
	 */
	public void initTerminateServices(ReferencesTableSettings settings);

	/**
	 * Update the terminateServices
	 * @param newValue the terminateServices to update
	 * 
	 */
	public void updateTerminateServices();

	/**
	 * Adds the given filter to the terminateServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTerminateServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the terminateServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTerminateServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the terminateServices table
	 * 
	 */
	public boolean isContainedInTerminateServicesTable(EObject element);




	/**
	 * Init the routineConnectServices
	 * @param settings settings for the routineConnectServices ReferencesTable 
	 */
	public void initRoutineConnectServices(ReferencesTableSettings settings);

	/**
	 * Update the routineConnectServices
	 * @param newValue the routineConnectServices to update
	 * 
	 */
	public void updateRoutineConnectServices();

	/**
	 * Adds the given filter to the routineConnectServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRoutineConnectServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the routineConnectServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRoutineConnectServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the routineConnectServices table
	 * 
	 */
	public boolean isContainedInRoutineConnectServicesTable(EObject element);




	/**
	 * Init the routineDisconnectServices
	 * @param settings settings for the routineDisconnectServices ReferencesTable 
	 */
	public void initRoutineDisconnectServices(ReferencesTableSettings settings);

	/**
	 * Update the routineDisconnectServices
	 * @param newValue the routineDisconnectServices to update
	 * 
	 */
	public void updateRoutineDisconnectServices();

	/**
	 * Adds the given filter to the routineDisconnectServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRoutineDisconnectServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the routineDisconnectServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRoutineDisconnectServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the routineDisconnectServices table
	 * 
	 */
	public boolean isContainedInRoutineDisconnectServicesTable(EObject element);





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
