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
package org.polarsys.time4sys.ui.views.library.parts;

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
