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
	 * @return the pldTechnology
	 * 
	 */
	public Enumerator getPldTechnology();

	/**
	 * Init the pldTechnology
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPldTechnology(Object input, Enumerator current);

	/**
	 * Defines a new pldTechnology
	 * @param newValue the new pldTechnology to set
	 * 
	 */
	public void setPldTechnology(Enumerator newValue);


	/**
	 * @return the wordSize
	 * 
	 */
	public String getWordSize();

	/**
	 * Defines a new wordSize
	 * @param newValue the new wordSize to set
	 * 
	 */
	public void setWordSize(String newValue);


	/**
	 * @return the nbRows
	 * 
	 */
	public String getNbRows();

	/**
	 * Defines a new nbRows
	 * @param newValue the new nbRows to set
	 * 
	 */
	public void setNbRows(String newValue);


	/**
	 * @return the nbColumns
	 * 
	 */
	public String getNbColumns();

	/**
	 * Defines a new nbColumns
	 * @param newValue the new nbColumns to set
	 * 
	 */
	public void setNbColumns(String newValue);


	/**
	 * @return the nbBanks
	 * 
	 */
	public String getNbBanks();

	/**
	 * Defines a new nbBanks
	 * @param newValue the new nbBanks to set
	 * 
	 */
	public void setNbBanks(String newValue);


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
	 * @return the nbLuts
	 * 
	 */
	public String getNbLuts();

	/**
	 * Defines a new nbLuts
	 * @param newValue the new nbLuts to set
	 * 
	 */
	public void setNbLuts(String newValue);


	/**
	 * @return the nbLutInputs
	 * 
	 */
	public String getNbLutInputs();

	/**
	 * Defines a new nbLutInputs
	 * @param newValue the new nbLutInputs to set
	 * 
	 */
	public void setNbLutInputs(String newValue);


	/**
	 * @return the nbFlipFlops
	 * 
	 */
	public String getNbFlipFlops();

	/**
	 * Defines a new nbFlipFlops
	 * @param newValue the new nbFlipFlops to set
	 * 
	 */
	public void setNbFlipFlops(String newValue);


	/**
	 * @return the architecture
	 * 
	 */
	public EObject getArchitecture();

	/**
	 * Init the architecture
	 * @param settings the combo setting
	 */
	public void initArchitecture(EObjectFlatComboSettings settings);

	/**
	 * Defines a new architecture
	 * @param newValue the new architecture to set
	 * 
	 */
	public void setArchitecture(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setArchitectureButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the architecture edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArchitecture(ViewerFilter filter);

	/**
	 * Adds the given filter to the architecture edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArchitecture(ViewerFilter filter);


	/**
	 * @return the width
	 * 
	 */
	public String getWidth();

	/**
	 * Defines a new width
	 * @param newValue the new width to set
	 * 
	 */
	public void setWidth(String newValue);


	/**
	 * @return the direction
	 * 
	 */
	public Enumerator getDirection();

	/**
	 * Init the direction
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initDirection(Object input, Enumerator current);

	/**
	 * Defines a new direction
	 * @param newValue the new direction to set
	 * 
	 */
	public void setDirection(Enumerator newValue);


	/**
	 * @return the instWidth
	 * 
	 */
	public String getInstWidth();

	/**
	 * Defines a new instWidth
	 * @param newValue the new instWidth to set
	 * 
	 */
	public void setInstWidth(String newValue);


	/**
	 * @return the addressWidth
	 * 
	 */
	public String getAddressWidth();

	/**
	 * Defines a new addressWidth
	 * @param newValue the new addressWidth to set
	 * 
	 */
	public void setAddressWidth(String newValue);


	/**
	 * @return the wordWidth
	 * 
	 */
	public String getWordWidth();

	/**
	 * Defines a new wordWidth
	 * @param newValue the new wordWidth to set
	 * 
	 */
	public void setWordWidth(String newValue);


	/**
	 * @return the weight
	 * 
	 */
	public String getWeight();

	/**
	 * Defines a new weight
	 * @param newValue the new weight to set
	 * 
	 */
	public void setWeight(String newValue);


	/**
	 * @return the price
	 * 
	 */
	public String getPrice();

	/**
	 * Defines a new price
	 * @param newValue the new price to set
	 * 
	 */
	public void setPrice(String newValue);


	/**
	 * @return the frequency
	 * 
	 */
	public String getFrequency();

	/**
	 * Defines a new frequency
	 * @param newValue the new frequency to set
	 * 
	 */
	public void setFrequency(String newValue);


	/**
	 * @return the opFrequencies
	 * 
	 */
	public String getOpFrequencies();

	/**
	 * Defines a new opFrequencies
	 * @param newValue the new opFrequencies to set
	 * 
	 */
	public void setOpFrequencies(String newValue);


	/**
	 * @return the nbSets
	 * 
	 */
	public String getNbSets();

	/**
	 * Defines a new nbSets
	 * @param newValue the new nbSets to set
	 * 
	 */
	public void setNbSets(String newValue);


	/**
	 * @return the blockSize
	 * 
	 */
	public String getBlockSize();

	/**
	 * Defines a new blockSize
	 * @param newValue the new blockSize to set
	 * 
	 */
	public void setBlockSize(String newValue);


	/**
	 * @return the associativity
	 * 
	 */
	public String getAssociativity();

	/**
	 * Defines a new associativity
	 * @param newValue the new associativity to set
	 * 
	 */
	public void setAssociativity(String newValue);


	/**
	 * @return the technology
	 * 
	 */
	public String getTechnology();

	/**
	 * Defines a new technology
	 * @param newValue the new technology to set
	 * 
	 */
	public void setTechnology(String newValue);


	/**
	 * @return the dimension
	 * 
	 */
	public String getDimension();

	/**
	 * Defines a new dimension
	 * @param newValue the new dimension to set
	 * 
	 */
	public void setDimension(String newValue);


	/**
	 * @return the posX
	 * 
	 */
	public String getPosX();

	/**
	 * Defines a new posX
	 * @param newValue the new posX to set
	 * 
	 */
	public void setPosX(String newValue);


	/**
	 * @return the posY
	 * 
	 */
	public String getPosY();

	/**
	 * Defines a new posY
	 * @param newValue the new posY to set
	 * 
	 */
	public void setPosY(String newValue);


	/**
	 * @return the grid
	 * 
	 */
	public String getGrid();

	/**
	 * Defines a new grid
	 * @param newValue the new grid to set
	 * 
	 */
	public void setGrid(String newValue);


	/**
	 * @return the nbPins
	 * 
	 */
	public String getNbPins();

	/**
	 * Defines a new nbPins
	 * @param newValue the new nbPins to set
	 * 
	 */
	public void setNbPins(String newValue);


	/**
	 * @return the nbWires
	 * 
	 */
	public String getNbWires();

	/**
	 * Defines a new nbWires
	 * @param newValue the new nbWires to set
	 * 
	 */
	public void setNbWires(String newValue);


	/**
	 * @return the mips
	 * 
	 */
	public String getMips();

	/**
	 * Defines a new mips
	 * @param newValue the new mips to set
	 * 
	 */
	public void setMips(String newValue);


	/**
	 * @return the nbCores
	 * 
	 */
	public String getNbCores();

	/**
	 * Defines a new nbCores
	 * @param newValue the new nbCores to set
	 * 
	 */
	public void setNbCores(String newValue);


	/**
	 * @return the nbPipelines
	 * 
	 */
	public String getNbPipelines();

	/**
	 * Defines a new nbPipelines
	 * @param newValue the new nbPipelines to set
	 * 
	 */
	public void setNbPipelines(String newValue);


	/**
	 * @return the nbStages
	 * 
	 */
	public String getNbStages();

	/**
	 * Defines a new nbStages
	 * @param newValue the new nbStages to set
	 * 
	 */
	public void setNbStages(String newValue);


	/**
	 * @return the nbAlus
	 * 
	 */
	public String getNbAlus();

	/**
	 * Defines a new nbAlus
	 * @param newValue the new nbAlus to set
	 * 
	 */
	public void setNbAlus(String newValue);


	/**
	 * @return the nbFpus
	 * 
	 */
	public String getNbFpus();

	/**
	 * Defines a new nbFpus
	 * @param newValue the new nbFpus to set
	 * 
	 */
	public void setNbFpus(String newValue);


	/**
	 * @return the sectorSize
	 * 
	 */
	public String getSectorSize();

	/**
	 * Defines a new sectorSize
	 * @param newValue the new sectorSize to set
	 * 
	 */
	public void setSectorSize(String newValue);


	/**
	 * @return the virtualAddrSpace
	 * 
	 */
	public String getVirtualAddrSpace();

	/**
	 * Defines a new virtualAddrSpace
	 * @param newValue the new virtualAddrSpace to set
	 * 
	 */
	public void setVirtualAddrSpace(String newValue);


	/**
	 * @return the physicalAddrSpace
	 * 
	 */
	public String getPhysicalAddrSpace();

	/**
	 * Defines a new physicalAddrSpace
	 * @param newValue the new physicalAddrSpace to set
	 * 
	 */
	public void setPhysicalAddrSpace(String newValue);


	/**
	 * @return the sourcePin
	 * 
	 */
	public EObject getSourcePin();

	/**
	 * Init the sourcePin
	 * @param settings the combo setting
	 */
	public void initSourcePin(EObjectFlatComboSettings settings);

	/**
	 * Defines a new sourcePin
	 * @param newValue the new sourcePin to set
	 * 
	 */
	public void setSourcePin(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourcePinButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the sourcePin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSourcePin(ViewerFilter filter);

	/**
	 * Adds the given filter to the sourcePin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSourcePin(ViewerFilter filter);


	/**
	 * @return the targetPin
	 * 
	 */
	public EObject getTargetPin();

	/**
	 * Init the targetPin
	 * @param settings the combo setting
	 */
	public void initTargetPin(EObjectFlatComboSettings settings);

	/**
	 * Defines a new targetPin
	 * @param newValue the new targetPin to set
	 * 
	 */
	public void setTargetPin(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetPinButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the targetPin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetPin(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetPin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetPin(ViewerFilter filter);




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
	 * Init the ownedPin
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedPin(ReferencesTableSettings settings);

	/**
	 * Update the ownedPin
	 * @param newValue the ownedPin to update
	 * 
	 */
	public void updateOwnedPin();

	/**
	 * Adds the given filter to the ownedPin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedPin(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedPin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedPin(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedPin table
	 * 
	 */
	public boolean isContainedInOwnedPinTable(EObject element);




	/**
	 * Init the ownedWire
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedWire(ReferencesTableSettings settings);

	/**
	 * Update the ownedWire
	 * @param newValue the ownedWire to update
	 * 
	 */
	public void updateOwnedWire();

	/**
	 * Adds the given filter to the ownedWire edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedWire(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedWire edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedWire(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedWire table
	 * 
	 */
	public boolean isContainedInOwnedWireTable(EObject element);




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
	 * Init the rConditions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRConditions(ReferencesTableSettings settings);

	/**
	 * Update the rConditions
	 * @param newValue the rConditions to update
	 * 
	 */
	public void updateRConditions();

	/**
	 * Adds the given filter to the rConditions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRConditions(ViewerFilter filter);

	/**
	 * Adds the given filter to the rConditions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRConditions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the rConditions table
	 * 
	 */
	public boolean isContainedInRConditionsTable(EObject element);





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
