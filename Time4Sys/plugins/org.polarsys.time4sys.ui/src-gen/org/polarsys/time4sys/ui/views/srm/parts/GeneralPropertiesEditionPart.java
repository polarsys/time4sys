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
	 * @return the memorySizeFootprint
	 * 
	 */
	public String getMemorySizeFootprint();

	/**
	 * Defines a new memorySizeFootprint
	 * @param newValue the new memorySizeFootprint to set
	 * 
	 */
	public void setMemorySizeFootprint(String newValue);


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
	 * @return the isModifier
	 * 
	 */
	public Boolean getIsModifier();

	/**
	 * Defines a new isModifier
	 * @param newValue the new isModifier to set
	 * 
	 */
	public void setIsModifier(Boolean newValue);


	/**
	 * @return the isWatchdog
	 * 
	 */
	public Boolean getIsWatchdog();

	/**
	 * Defines a new isWatchdog
	 * @param newValue the new isWatchdog to set
	 * 
	 */
	public void setIsWatchdog(Boolean newValue);


	/**
	 * @return the isBuffered
	 * 
	 */
	public Boolean getIsBuffered();

	/**
	 * Defines a new isBuffered
	 * @param newValue the new isBuffered to set
	 * 
	 */
	public void setIsBuffered(Boolean newValue);


	/**
	 * @return the activationCapacity
	 * 
	 */
	public String getActivationCapacity();

	/**
	 * Defines a new activationCapacity
	 * @param newValue the new activationCapacity to set
	 * 
	 */
	public void setActivationCapacity(String newValue);


	/**
	 * @return the accessedElement
	 * 
	 */
	public String getAccessedElement();

	/**
	 * Defines a new accessedElement
	 * @param newValue the new accessedElement to set
	 * 
	 */
	public void setAccessedElement(String newValue);


	/**
	 * @return the identifierElements
	 * 
	 */
	public EList getIdentifierElements();

	/**
	 * Defines a new identifierElements
	 * @param newValue the new identifierElements to set
	 * 
	 */
	public void setIdentifierElements(EList newValue);

	/**
	 * Add a value to the identifierElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToIdentifierElements(Object newValue);

	/**
	 * Remove a value to the identifierElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToIdentifierElements(Object newValue);


	/**
	 * @return the periodElements
	 * 
	 */
	public EList getPeriodElements();

	/**
	 * Defines a new periodElements
	 * @param newValue the new periodElements to set
	 * 
	 */
	public void setPeriodElements(EList newValue);

	/**
	 * Add a value to the periodElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToPeriodElements(Object newValue);

	/**
	 * Remove a value to the periodElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToPeriodElements(Object newValue);


	/**
	 * @return the stateElements
	 * 
	 */
	public EList getStateElements();

	/**
	 * Defines a new stateElements
	 * @param newValue the new stateElements to set
	 * 
	 */
	public void setStateElements(EList newValue);

	/**
	 * Add a value to the stateElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToStateElements(Object newValue);

	/**
	 * Remove a value to the stateElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToStateElements(Object newValue);


	/**
	 * @return the adressSpace
	 * 
	 */
	public EObject getAdressSpace();

	/**
	 * Init the adressSpace
	 * @param settings the combo setting
	 */
	public void initAdressSpace(EObjectFlatComboSettings settings);

	/**
	 * Defines a new adressSpace
	 * @param newValue the new adressSpace to set
	 * 
	 */
	public void setAdressSpace(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAdressSpaceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the adressSpace edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdressSpace(ViewerFilter filter);

	/**
	 * Adds the given filter to the adressSpace edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdressSpace(ViewerFilter filter);


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
	 * @return the entryPoints
	 * 
	 */
	public EList getEntryPoints();

	/**
	 * Defines a new entryPoints
	 * @param newValue the new entryPoints to set
	 * 
	 */
	public void setEntryPoints(EList newValue);

	/**
	 * Add a value to the entryPoints multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToEntryPoints(Object newValue);

	/**
	 * Remove a value to the entryPoints multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToEntryPoints(Object newValue);


	/**
	 * @return the kind
	 * 
	 */
	public Enumerator getKind();

	/**
	 * Init the kind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initKind(Object input, Enumerator current);

	/**
	 * Defines a new kind
	 * @param newValue the new kind to set
	 * 
	 */
	public void setKind(Enumerator newValue);


	/**
	 * @return the isrEntryPoints
	 * 
	 */
	public EList getIsrEntryPoints();

	/**
	 * Defines a new isrEntryPoints
	 * @param newValue the new isrEntryPoints to set
	 * 
	 */
	public void setIsrEntryPoints(EList newValue);

	/**
	 * Add a value to the isrEntryPoints multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToIsrEntryPoints(Object newValue);

	/**
	 * Remove a value to the isrEntryPoints multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToIsrEntryPoints(Object newValue);


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
	 * Init the scheduledResource
	 * @param settings settings for the scheduledResource ReferencesTable 
	 */
	public void initScheduledResource(ReferencesTableSettings settings);

	/**
	 * Update the scheduledResource
	 * @param newValue the scheduledResource to update
	 * 
	 */
	public void updateScheduledResource();

	/**
	 * Adds the given filter to the scheduledResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToScheduledResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the scheduledResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToScheduledResource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the scheduledResource table
	 * 
	 */
	public boolean isContainedInScheduledResourceTable(EObject element);




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
	 * Init the devices
	 * @param settings settings for the devices ReferencesTable 
	 */
	public void initDevices(ReferencesTableSettings settings);

	/**
	 * Update the devices
	 * @param newValue the devices to update
	 * 
	 */
	public void updateDevices();

	/**
	 * Adds the given filter to the devices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDevices(ViewerFilter filter);

	/**
	 * Adds the given filter to the devices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDevices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the devices table
	 * 
	 */
	public boolean isContainedInDevicesTable(EObject element);




	/**
	 * Init the memories
	 * @param settings settings for the memories ReferencesTable 
	 */
	public void initMemories(ReferencesTableSettings settings);

	/**
	 * Update the memories
	 * @param newValue the memories to update
	 * 
	 */
	public void updateMemories();

	/**
	 * Adds the given filter to the memories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMemories(ViewerFilter filter);

	/**
	 * Adds the given filter to the memories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMemories(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the memories table
	 * 
	 */
	public boolean isContainedInMemoriesTable(EObject element);




	/**
	 * Init the sharedDataResources
	 * @param settings settings for the sharedDataResources ReferencesTable 
	 */
	public void initSharedDataResources(ReferencesTableSettings settings);

	/**
	 * Update the sharedDataResources
	 * @param newValue the sharedDataResources to update
	 * 
	 */
	public void updateSharedDataResources();

	/**
	 * Adds the given filter to the sharedDataResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSharedDataResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the sharedDataResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSharedDataResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the sharedDataResources table
	 * 
	 */
	public boolean isContainedInSharedDataResourcesTable(EObject element);




	/**
	 * Init the messageResources
	 * @param settings settings for the messageResources ReferencesTable 
	 */
	public void initMessageResources(ReferencesTableSettings settings);

	/**
	 * Update the messageResources
	 * @param newValue the messageResources to update
	 * 
	 */
	public void updateMessageResources();

	/**
	 * Adds the given filter to the messageResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMessageResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the messageResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMessageResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the messageResources table
	 * 
	 */
	public boolean isContainedInMessageResourcesTable(EObject element);




	/**
	 * Init the notificationResources
	 * @param settings settings for the notificationResources ReferencesTable 
	 */
	public void initNotificationResources(ReferencesTableSettings settings);

	/**
	 * Update the notificationResources
	 * @param newValue the notificationResources to update
	 * 
	 */
	public void updateNotificationResources();

	/**
	 * Adds the given filter to the notificationResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNotificationResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the notificationResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNotificationResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the notificationResources table
	 * 
	 */
	public boolean isContainedInNotificationResourcesTable(EObject element);





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
