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
	 * @return the isPeriodic
	 * 
	 */
	public Boolean getIsPeriodic();

	/**
	 * Defines a new isPeriodic
	 * @param newValue the new isPeriodic to set
	 * 
	 */
	public void setIsPeriodic(Boolean newValue);


	/**
	 * @return the value
	 * 
	 */
	public String getValue();

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * 
	 */
	public void setValue(String newValue);


	/**
	 * @return the elementSize
	 * 
	 */
	public String getElementSize();

	/**
	 * Defines a new elementSize
	 * @param newValue the new elementSize to set
	 * 
	 */
	public void setElementSize(String newValue);


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
	 * @return the msgSize
	 * 
	 */
	public String getMsgSize();

	/**
	 * Defines a new msgSize
	 * @param newValue the new msgSize to set
	 * 
	 */
	public void setMsgSize(String newValue);


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
	 * @return the event
	 * 
	 */
	public String getEvent();

	/**
	 * Defines a new event
	 * @param newValue the new event to set
	 * 
	 */
	public void setEvent(String newValue);


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
	 * @return the otherProtocol
	 * 
	 */
	public String getOtherProtocol();

	/**
	 * Defines a new otherProtocol
	 * @param newValue the new otherProtocol to set
	 * 
	 */
	public void setOtherProtocol(String newValue);


	/**
	 * @return the protocol
	 * 
	 */
	public Enumerator getProtocol();

	/**
	 * Init the protocol
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initProtocol(Object input, Enumerator current);

	/**
	 * Defines a new protocol
	 * @param newValue the new protocol to set
	 * 
	 */
	public void setProtocol(Enumerator newValue);


	/**
	 * @return the transmMode
	 * 
	 */
	public Enumerator getTransmMode();

	/**
	 * Init the transmMode
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initTransmMode(Object input, Enumerator current);

	/**
	 * Defines a new transmMode
	 * @param newValue the new transmMode to set
	 * 
	 */
	public void setTransmMode(Enumerator newValue);


	/**
	 * @return the start
	 * 
	 */
	public EObject getStart();

	/**
	 * Init the start
	 * @param settings the combo setting
	 */
	public void initStart(EObjectFlatComboSettings settings);

	/**
	 * Defines a new start
	 * @param newValue the new start to set
	 * 
	 */
	public void setStart(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setStartButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the start edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStart(ViewerFilter filter);

	/**
	 * Adds the given filter to the start edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStart(ViewerFilter filter);


	/**
	 * @return the set
	 * 
	 */
	public EObject getSet();

	/**
	 * Init the set
	 * @param settings the combo setting
	 */
	public void initSet(EObjectFlatComboSettings settings);

	/**
	 * Defines a new set
	 * @param newValue the new set to set
	 * 
	 */
	public void setSet(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSetButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the set edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSet(ViewerFilter filter);

	/**
	 * Adds the given filter to the set edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSet(ViewerFilter filter);


	/**
	 * @return the get
	 * 
	 */
	public EObject getGet();

	/**
	 * Init the get
	 * @param settings the combo setting
	 */
	public void initGet(EObjectFlatComboSettings settings);

	/**
	 * Defines a new get
	 * @param newValue the new get to set
	 * 
	 */
	public void setGet(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setGetButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the get edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGet(ViewerFilter filter);

	/**
	 * Adds the given filter to the get edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGet(ViewerFilter filter);


	/**
	 * @return the reset
	 * 
	 */
	public EObject getReset();

	/**
	 * Init the reset
	 * @param settings the combo setting
	 */
	public void initReset(EObjectFlatComboSettings settings);

	/**
	 * Defines a new reset
	 * @param newValue the new reset to set
	 * 
	 */
	public void setReset(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setResetButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the reset edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReset(ViewerFilter filter);

	/**
	 * Adds the given filter to the reset edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReset(ViewerFilter filter);


	/**
	 * @return the pause
	 * 
	 */
	public EObject getPause();

	/**
	 * Init the pause
	 * @param settings the combo setting
	 */
	public void initPause(EObjectFlatComboSettings settings);

	/**
	 * Defines a new pause
	 * @param newValue the new pause to set
	 * 
	 */
	public void setPause(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPauseButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the pause edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPause(ViewerFilter filter);

	/**
	 * Adds the given filter to the pause edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPause(ViewerFilter filter);


	/**
	 * @return the scheduler
	 * 
	 */
	public EObject getScheduler();

	/**
	 * Init the scheduler
	 * @param settings the combo setting
	 */
	public void initScheduler(EObjectFlatComboSettings settings);

	/**
	 * Defines a new scheduler
	 * @param newValue the new scheduler to set
	 * 
	 */
	public void setScheduler(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSchedulerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the scheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToScheduler(ViewerFilter filter);

	/**
	 * Adds the given filter to the scheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToScheduler(ViewerFilter filter);


	/**
	 * @return the type
	 * 
	 */
	public EObject getType();

	/**
	 * Init the type
	 * @param settings the combo setting
	 */
	public void initType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToType(ViewerFilter filter);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToType(ViewerFilter filter);


	/**
	 * @return the host
	 * 
	 */
	public EObject getHost();

	/**
	 * Init the host
	 * @param settings the combo setting
	 */
	public void initHost(EObjectFlatComboSettings settings);

	/**
	 * Defines a new host
	 * @param newValue the new host to set
	 * 
	 */
	public void setHost(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setHostButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the host edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToHost(ViewerFilter filter);

	/**
	 * Adds the given filter to the host edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToHost(ViewerFilter filter);


	/**
	 * @return the dependentScheduler
	 * 
	 */
	public EObject getDependentScheduler();

	/**
	 * Init the dependentScheduler
	 * @param settings the combo setting
	 */
	public void initDependentScheduler(EObjectFlatComboSettings settings);

	/**
	 * Defines a new dependentScheduler
	 * @param newValue the new dependentScheduler to set
	 * 
	 */
	public void setDependentScheduler(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDependentSchedulerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the dependentScheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDependentScheduler(ViewerFilter filter);

	/**
	 * Adds the given filter to the dependentScheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDependentScheduler(ViewerFilter filter);


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
	 * Init the usedResource
	 * @param settings settings for the usedResource ReferencesTable 
	 */
	public void initUsedResource(ReferencesTableSettings settings);

	/**
	 * Update the usedResource
	 * @param newValue the usedResource to update
	 * 
	 */
	public void updateUsedResource();

	/**
	 * Adds the given filter to the usedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUsedResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the usedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUsedResource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the usedResource table
	 * 
	 */
	public boolean isContainedInUsedResourceTable(EObject element);




	/**
	 * Init the processingUnits
	 * @param settings settings for the processingUnits ReferencesTable 
	 */
	public void initProcessingUnits(ReferencesTableSettings settings);

	/**
	 * Update the processingUnits
	 * @param newValue the processingUnits to update
	 * 
	 */
	public void updateProcessingUnits();

	/**
	 * Adds the given filter to the processingUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessingUnits(ViewerFilter filter);

	/**
	 * Adds the given filter to the processingUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processingUnits table
	 * 
	 */
	public boolean isContainedInProcessingUnitsTable(EObject element);




	/**
	 * Init the workload
	 * @param settings settings for the workload ReferencesTable 
	 */
	public void initWorkload(ReferencesTableSettings settings);

	/**
	 * Update the workload
	 * @param newValue the workload to update
	 * 
	 */
	public void updateWorkload();

	/**
	 * Adds the given filter to the workload edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToWorkload(ViewerFilter filter);

	/**
	 * Adds the given filter to the workload edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToWorkload(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the workload table
	 * 
	 */
	public boolean isContainedInWorkloadTable(EObject element);




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
	 * Init the managedResource
	 * @param settings settings for the managedResource ReferencesTable 
	 */
	public void initManagedResource(ReferencesTableSettings settings);

	/**
	 * Update the managedResource
	 * @param newValue the managedResource to update
	 * 
	 */
	public void updateManagedResource();

	/**
	 * Adds the given filter to the managedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToManagedResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the managedResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToManagedResource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the managedResource table
	 * 
	 */
	public boolean isContainedInManagedResourceTable(EObject element);




	/**
	 * Init the schedulableResource
	 * @param settings settings for the schedulableResource ReferencesTable 
	 */
	public void initSchedulableResource(ReferencesTableSettings settings);

	/**
	 * Update the schedulableResource
	 * @param newValue the schedulableResource to update
	 * 
	 */
	public void updateSchedulableResource();

	/**
	 * Adds the given filter to the schedulableResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSchedulableResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedulableResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSchedulableResource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedulableResource table
	 * 
	 */
	public boolean isContainedInSchedulableResourceTable(EObject element);




	/**
	 * Init the virtualProcessingUnit
	 * @param settings settings for the virtualProcessingUnit ReferencesTable 
	 */
	public void initVirtualProcessingUnit(ReferencesTableSettings settings);

	/**
	 * Update the virtualProcessingUnit
	 * @param newValue the virtualProcessingUnit to update
	 * 
	 */
	public void updateVirtualProcessingUnit();

	/**
	 * Adds the given filter to the virtualProcessingUnit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToVirtualProcessingUnit(ViewerFilter filter);

	/**
	 * Adds the given filter to the virtualProcessingUnit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToVirtualProcessingUnit(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the virtualProcessingUnit table
	 * 
	 */
	public boolean isContainedInVirtualProcessingUnitTable(EObject element);




	/**
	 * Init the protectParams
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProtectParams(ReferencesTableSettings settings);

	/**
	 * Update the protectParams
	 * @param newValue the protectParams to update
	 * 
	 */
	public void updateProtectParams();

	/**
	 * Adds the given filter to the protectParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProtectParams(ViewerFilter filter);

	/**
	 * Adds the given filter to the protectParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProtectParams(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the protectParams table
	 * 
	 */
	public boolean isContainedInProtectParamsTable(EObject element);




	/**
	 * Init the schedParams
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSchedParams(ReferencesTableSettings settings);

	/**
	 * Update the schedParams
	 * @param newValue the schedParams to update
	 * 
	 */
	public void updateSchedParams();

	/**
	 * Adds the given filter to the schedParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSchedParams(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSchedParams(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedParams table
	 * 
	 */
	public boolean isContainedInSchedParamsTable(EObject element);




	/**
	 * Init the requiredAmount
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRequiredAmount(ReferencesTableSettings settings);

	/**
	 * Update the requiredAmount
	 * @param newValue the requiredAmount to update
	 * 
	 */
	public void updateRequiredAmount();

	/**
	 * Adds the given filter to the requiredAmount edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRequiredAmount(ViewerFilter filter);

	/**
	 * Adds the given filter to the requiredAmount edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRequiredAmount(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the requiredAmount table
	 * 
	 */
	public boolean isContainedInRequiredAmountTable(EObject element);




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
	 * Init the ownedPort
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedPort(ReferencesTableSettings settings);

	/**
	 * Update the ownedPort
	 * @param newValue the ownedPort to update
	 * 
	 */
	public void updateOwnedPort();

	/**
	 * Adds the given filter to the ownedPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedPort(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedPort(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedPort table
	 * 
	 */
	public boolean isContainedInOwnedPortTable(EObject element);




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
	 * Init the usage
	 * @param settings settings for the usage ReferencesTable 
	 */
	public void initUsage(ReferencesTableSettings settings);

	/**
	 * Update the usage
	 * @param newValue the usage to update
	 * 
	 */
	public void updateUsage();

	/**
	 * Adds the given filter to the usage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUsage(ViewerFilter filter);

	/**
	 * Adds the given filter to the usage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUsage(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the usage table
	 * 
	 */
	public boolean isContainedInUsageTable(EObject element);




	/**
	 * Init the accCtrlPolicy
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAccCtrlPolicy(ReferencesTableSettings settings);

	/**
	 * Update the accCtrlPolicy
	 * @param newValue the accCtrlPolicy to update
	 * 
	 */
	public void updateAccCtrlPolicy();

	/**
	 * Adds the given filter to the accCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAccCtrlPolicy(ViewerFilter filter);

	/**
	 * Adds the given filter to the accCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAccCtrlPolicy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the accCtrlPolicy table
	 * 
	 */
	public boolean isContainedInAccCtrlPolicyTable(EObject element);




	/**
	 * Init the resCtrlPolicy
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResCtrlPolicy(ReferencesTableSettings settings);

	/**
	 * Update the resCtrlPolicy
	 * @param newValue the resCtrlPolicy to update
	 * 
	 */
	public void updateResCtrlPolicy();

	/**
	 * Adds the given filter to the resCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResCtrlPolicy(ViewerFilter filter);

	/**
	 * Adds the given filter to the resCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResCtrlPolicy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resCtrlPolicy table
	 * 
	 */
	public boolean isContainedInResCtrlPolicyTable(EObject element);





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
