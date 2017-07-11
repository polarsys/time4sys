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
	 * @return the policy
	 * 
	 */
	public Enumerator getPolicy();

	/**
	 * Init the policy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPolicy(Object input, Enumerator current);

	/**
	 * Defines a new policy
	 * @param newValue the new policy to set
	 * 
	 */
	public void setPolicy(Enumerator newValue);


	/**
	 * @return the otherSchedPolicy
	 * 
	 */
	public String getOtherSchedPolicy();

	/**
	 * Defines a new otherSchedPolicy
	 * @param newValue the new otherSchedPolicy to set
	 * 
	 */
	public void setOtherSchedPolicy(String newValue);


	/**
	 * @return the slot
	 * 
	 */
	public EList getSlot();

	/**
	 * Defines a new slot
	 * @param newValue the new slot to set
	 * 
	 */
	public void setSlot(EList newValue);

	/**
	 * Add a value to the slot multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToSlot(Object newValue);

	/**
	 * Remove a value to the slot multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToSlot(Object newValue);


	/**
	 * @return the clock
	 * 
	 */
	public EObject getClock();

	/**
	 * Init the clock
	 * @param settings the combo setting
	 */
	public void initClock(EObjectFlatComboSettings settings);

	/**
	 * Defines a new clock
	 * @param newValue the new clock to set
	 * 
	 */
	public void setClock(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setClockButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the clock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClock(ViewerFilter filter);

	/**
	 * Adds the given filter to the clock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClock(ViewerFilter filter);




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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
