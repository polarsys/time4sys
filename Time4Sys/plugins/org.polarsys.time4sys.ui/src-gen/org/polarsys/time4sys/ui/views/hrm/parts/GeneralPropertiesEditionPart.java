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
package org.polarsys.time4sys.ui.views.hrm.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface GeneralPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the type
	 * 
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initType(Object input, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);


	/**
	 * @return the family
	 * 
	 */
	public String getFamily();

	/**
	 * Defines a new family
	 * @param newValue the new family to set
	 * 
	 */
	public void setFamily(String newValue);


	/**
	 * @return the status
	 * 
	 */
	public Enumerator getStatus();

	/**
	 * Init the status
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initStatus(Object input, Enumerator current);

	/**
	 * Defines a new status
	 * @param newValue the new status to set
	 * 
	 */
	public void setStatus(Enumerator newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the speedFactor
	 * 
	 */
	public String getSpeedFactor();

	/**
	 * Defines a new speedFactor
	 * @param newValue the new speedFactor to set
	 * 
	 */
	public void setSpeedFactor(String newValue);


	/**
	 * @return the memoryProtection
	 * 
	 */
	public Boolean getMemoryProtection();

	/**
	 * Defines a new memoryProtection
	 * @param newValue the new memoryProtection to set
	 * 
	 */
	public void setMemoryProtection(Boolean newValue);


	/**
	 * @return the range
	 * 
	 */
	public String getRange();

	/**
	 * Defines a new range
	 * @param newValue the new range to set
	 * 
	 */
	public void setRange(String newValue);


	/**
	 * @return the isActive
	 * 
	 */
	public Boolean getIsActive();

	/**
	 * Defines a new isActive
	 * @param newValue the new isActive to set
	 * 
	 */
	public void setIsActive(Boolean newValue);


	/**
	 * @return the isProtected
	 * 
	 */
	public Boolean getIsProtected();

	/**
	 * Defines a new isProtected
	 * @param newValue the new isProtected to set
	 * 
	 */
	public void setIsProtected(Boolean newValue);


	/**
	 * @return the isSynchronous
	 * 
	 */
	public Boolean getIsSynchronous();

	/**
	 * Defines a new isSynchronous
	 * @param newValue the new isSynchronous to set
	 * 
	 */
	public void setIsSynchronous(Boolean newValue);


	/**
	 * @return the isSerial
	 * 
	 */
	public Boolean getIsSerial();

	/**
	 * Defines a new isSerial
	 * @param newValue the new isSerial to set
	 * 
	 */
	public void setIsSerial(Boolean newValue);


	/**
	 * @return the isStatic
	 * 
	 */
	public Boolean getIsStatic();

	/**
	 * Defines a new isStatic
	 * @param newValue the new isStatic to set
	 * 
	 */
	public void setIsStatic(Boolean newValue);


	/**
	 * @return the isNonVolatile
	 * 
	 */
	public Boolean getIsNonVolatile();

	/**
	 * Defines a new isNonVolatile
	 * @param newValue the new isNonVolatile to set
	 * 
	 */
	public void setIsNonVolatile(Boolean newValue);


	/**
	 * @return the memorySize
	 * 
	 */
	public String getMemorySize();

	/**
	 * Defines a new memorySize
	 * @param newValue the new memorySize to set
	 * 
	 */
	public void setMemorySize(String newValue);


	/**
	 * @return the addressSize
	 * 
	 */
	public String getAddressSize();

	/**
	 * Defines a new addressSize
	 * @param newValue the new addressSize to set
	 * 
	 */
	public void setAddressSize(String newValue);


	/**
	 * @return the nbChannels
	 * 
	 */
	public String getNbChannels();

	/**
	 * Defines a new nbChannels
	 * @param newValue the new nbChannels to set
	 * 
	 */
	public void setNbChannels(String newValue);


	/**
	 * @return the transferWidth
	 * 
	 */
	public String getTransferWidth();

	/**
	 * Defines a new transferWidth
	 * @param newValue the new transferWidth to set
	 * 
	 */
	public void setTransferWidth(String newValue);


	/**
	 * @return the throughput
	 * 
	 */
	public String getThroughput();

	/**
	 * Defines a new throughput
	 * @param newValue the new throughput to set
	 * 
	 */
	public void setThroughput(String newValue);


	/**
	 * @return the level
	 * 
	 */
	public String getLevel();

	/**
	 * Defines a new level
	 * @param newValue the new level to set
	 * 
	 */
	public void setLevel(String newValue);


	/**
	 * @return the resMult
	 * 
	 */
	public String getResMult();

	/**
	 * Defines a new resMult
	 * @param newValue the new resMult to set
	 * 
	 */
	public void setResMult(String newValue);


	/**
	 * @return the sourcePort
	 * 
	 */
	public EObject getSourcePort();

	/**
	 * Init the sourcePort
	 * @param settings the combo setting
	 */
	public void initSourcePort(EObjectFlatComboSettings settings);

	/**
	 * Defines a new sourcePort
	 * @param newValue the new sourcePort to set
	 * 
	 */
	public void setSourcePort(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourcePortButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the sourcePort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSourcePort(ViewerFilter filter);

	/**
	 * Adds the given filter to the sourcePort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSourcePort(ViewerFilter filter);


	/**
	 * @return the targetPort
	 * 
	 */
	public EObject getTargetPort();

	/**
	 * Init the targetPort
	 * @param settings the combo setting
	 */
	public void initTargetPort(EObjectFlatComboSettings settings);

	/**
	 * Defines a new targetPort
	 * @param newValue the new targetPort to set
	 * 
	 */
	public void setTargetPort(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetPortButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the targetPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetPort(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetPort(ViewerFilter filter);


	/**
	 * @return the mainScheduler
	 * 
	 */
	public EObject getMainScheduler();

	/**
	 * Init the mainScheduler
	 * @param settings the combo setting
	 */
	public void initMainScheduler(EObjectFlatComboSettings settings);

	/**
	 * Defines a new mainScheduler
	 * @param newValue the new mainScheduler to set
	 * 
	 */
	public void setMainScheduler(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMainSchedulerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the mainScheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMainScheduler(ViewerFilter filter);

	/**
	 * Adds the given filter to the mainScheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMainScheduler(ViewerFilter filter);




	/**
	 * Init the usedBy
	 * @param settings settings for the usedBy ReferencesTable 
	 */
	public void initUsedBy(ReferencesTableSettings settings);

	/**
	 * Update the usedBy
	 * @param newValue the usedBy to update
	 * 
	 */
	public void updateUsedBy();

	/**
	 * Adds the given filter to the usedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUsedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the usedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUsedBy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the usedBy table
	 * 
	 */
	public boolean isContainedInUsedByTable(EObject element);




	/**
	 * Init the realizedBy
	 * @param settings settings for the realizedBy ReferencesTable 
	 */
	public void initRealizedBy(ReferencesTableSettings settings);

	/**
	 * Update the realizedBy
	 * @param newValue the realizedBy to update
	 * 
	 */
	public void updateRealizedBy();

	/**
	 * Adds the given filter to the realizedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRealizedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the realizedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRealizedBy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the realizedBy table
	 * 
	 */
	public boolean isContainedInRealizedByTable(EObject element);




	/**
	 * Init the arbiters
	 * @param settings settings for the arbiters ReferencesTable 
	 */
	public void initArbiters(ReferencesTableSettings settings);

	/**
	 * Update the arbiters
	 * @param newValue the arbiters to update
	 * 
	 */
	public void updateArbiters();

	/**
	 * Adds the given filter to the arbiters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArbiters(ViewerFilter filter);

	/**
	 * Adds the given filter to the arbiters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArbiters(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the arbiters table
	 * 
	 */
	public boolean isContainedInArbitersTable(EObject element);




	/**
	 * Init the sides
	 * @param settings settings for the sides ReferencesTable 
	 */
	public void initSides(ReferencesTableSettings settings);

	/**
	 * Update the sides
	 * @param newValue the sides to update
	 * 
	 */
	public void updateSides();

	/**
	 * Adds the given filter to the sides edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSides(ViewerFilter filter);

	/**
	 * Adds the given filter to the sides edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSides(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the sides table
	 * 
	 */
	public boolean isContainedInSidesTable(EObject element);




	/**
	 * Init the managedMemories
	 * @param settings settings for the managedMemories ReferencesTable 
	 */
	public void initManagedMemories(ReferencesTableSettings settings);

	/**
	 * Update the managedMemories
	 * @param newValue the managedMemories to update
	 * 
	 */
	public void updateManagedMemories();

	/**
	 * Adds the given filter to the managedMemories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToManagedMemories(ViewerFilter filter);

	/**
	 * Adds the given filter to the managedMemories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToManagedMemories(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the managedMemories table
	 * 
	 */
	public boolean isContainedInManagedMemoriesTable(EObject element);




	/**
	 * Init the controlledMedia
	 * @param settings settings for the controlledMedia ReferencesTable 
	 */
	public void initControlledMedia(ReferencesTableSettings settings);

	/**
	 * Update the controlledMedia
	 * @param newValue the controlledMedia to update
	 * 
	 */
	public void updateControlledMedia();

	/**
	 * Adds the given filter to the controlledMedia edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToControlledMedia(ViewerFilter filter);

	/**
	 * Adds the given filter to the controlledMedia edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToControlledMedia(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the controlledMedia table
	 * 
	 */
	public boolean isContainedInControlledMediaTable(EObject element);




	/**
	 * Init the drivenBy
	 * @param settings settings for the drivenBy ReferencesTable 
	 */
	public void initDrivenBy(ReferencesTableSettings settings);

	/**
	 * Update the drivenBy
	 * @param newValue the drivenBy to update
	 * 
	 */
	public void updateDrivenBy();

	/**
	 * Adds the given filter to the drivenBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDrivenBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the drivenBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDrivenBy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the drivenBy table
	 * 
	 */
	public boolean isContainedInDrivenByTable(EObject element);




	/**
	 * Init the brokedResource
	 * @param settings settings for the brokedResource ReferencesTable 
	 */
	public void initBrokedResource(ReferencesTableSettings settings);

	/**
	 * Update the brokedResource
	 * @param newValue the brokedResource to update
	 * 
	 */
	public void updateBrokedResource();

	/**
	 * Adds the given filter to the brokedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBrokedResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the brokedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBrokedResource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the brokedResource table
	 * 
	 */
	public boolean isContainedInBrokedResourceTable(EObject element);




	/**
	 * Init the ownedElement
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedElement(ReferencesTableSettings settings);

	/**
	 * Update the ownedElement
	 * @param newValue the ownedElement to update
	 * 
	 */
	public void updateOwnedElement();

	/**
	 * Adds the given filter to the ownedElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedElement(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedElement table
	 * 
	 */
	public boolean isContainedInOwnedElementTable(EObject element);




	/**
	 * Init the ownedResource
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedResource(ReferencesTableSettings settings);

	/**
	 * Update the ownedResource
	 * @param newValue the ownedResource to update
	 * 
	 */
	public void updateOwnedResource();

	/**
	 * Adds the given filter to the ownedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedResource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedResource table
	 * 
	 */
	public boolean isContainedInOwnedResourceTable(EObject element);




	/**
	 * Init the ownedConnector
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedConnector(ReferencesTableSettings settings);

	/**
	 * Update the ownedConnector
	 * @param newValue the ownedConnector to update
	 * 
	 */
	public void updateOwnedConnector();

	/**
	 * Adds the given filter to the ownedConnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedConnector(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedConnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedConnector(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedConnector table
	 * 
	 */
	public boolean isContainedInOwnedConnectorTable(EObject element);





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
