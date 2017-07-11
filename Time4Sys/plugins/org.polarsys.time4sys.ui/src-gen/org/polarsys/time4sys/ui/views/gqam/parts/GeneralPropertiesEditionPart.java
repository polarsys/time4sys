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
package org.polarsys.time4sys.ui.views.gqam.parts;

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
	 * @return the referenceName
	 * 
	 */
	public String getReferenceName();

	/**
	 * Defines a new referenceName
	 * @param newValue the new referenceName to set
	 * 
	 */
	public void setReferenceName(String newValue);


	/**
	 * @return the isSchedulable
	 * 
	 */
	public Boolean getIsSchedulable();

	/**
	 * Defines a new isSchedulable
	 * @param newValue the new isSchedulable to set
	 * 
	 */
	public void setIsSchedulable(Boolean newValue);


	/**
	 * @return the isAtomic
	 * 
	 */
	public Boolean getIsAtomic();

	/**
	 * Defines a new isAtomic
	 * @param newValue the new isAtomic to set
	 * 
	 */
	public void setIsAtomic(Boolean newValue);


	/**
	 * @return the connectorKind
	 * 
	 */
	public Enumerator getConnectorKind();

	/**
	 * Init the connectorKind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initConnectorKind(Object input, Enumerator current);

	/**
	 * Defines a new connectorKind
	 * @param newValue the new connectorKind to set
	 * 
	 */
	public void setConnectorKind(Enumerator newValue);


	/**
	 * @return the repetitions
	 * 
	 */
	public String getRepetitions();

	/**
	 * Defines a new repetitions
	 * @param newValue the new repetitions to set
	 * 
	 */
	public void setRepetitions(String newValue);


	/**
	 * @return the probability
	 * 
	 */
	public String getProbability();

	/**
	 * Defines a new probability
	 * @param newValue the new probability to set
	 * 
	 */
	public void setProbability(String newValue);


	/**
	 * @return the priority
	 * 
	 */
	public String getPriority();

	/**
	 * Defines a new priority
	 * @param newValue the new priority to set
	 * 
	 */
	public void setPriority(String newValue);


	/**
	 * @return the occurences
	 * 
	 */
	public String getOccurences();

	/**
	 * Defines a new occurences
	 * @param newValue the new occurences to set
	 * 
	 */
	public void setOccurences(String newValue);


	/**
	 * @return the schedulabilitySlack
	 * 
	 */
	public String getSchedulabilitySlack();

	/**
	 * Defines a new schedulabilitySlack
	 * @param newValue the new schedulabilitySlack to set
	 * 
	 */
	public void setSchedulabilitySlack(String newValue);


	/**
	 * @return the serviceCount
	 * 
	 */
	public String getServiceCount();

	/**
	 * Defines a new serviceCount
	 * @param newValue the new serviceCount to set
	 * 
	 */
	public void setServiceCount(String newValue);


	/**
	 * @return the resUnits
	 * 
	 */
	public String getResUnits();

	/**
	 * Defines a new resUnits
	 * @param newValue the new resUnits to set
	 * 
	 */
	public void setResUnits(String newValue);


	/**
	 * @return the root
	 * 
	 */
	public EObject getRoot();

	/**
	 * Init the root
	 * @param settings the combo setting
	 */
	public void initRoot(EObjectFlatComboSettings settings);

	/**
	 * Defines a new root
	 * @param newValue the new root to set
	 * 
	 */
	public void setRoot(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRootButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the root edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRoot(ViewerFilter filter);

	/**
	 * Adds the given filter to the root edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRoot(ViewerFilter filter);


	/**
	 * @return the parentStep
	 * 
	 */
	public EObject getParentStep();

	/**
	 * Init the parentStep
	 * @param settings the combo setting
	 */
	public void initParentStep(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parentStep
	 * @param newValue the new parentStep to set
	 * 
	 */
	public void setParentStep(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParentStepButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parentStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParentStep(ViewerFilter filter);

	/**
	 * Adds the given filter to the parentStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParentStep(ViewerFilter filter);


	/**
	 * @return the reference
	 * 
	 */
	public EObject getReference();

	/**
	 * Init the reference
	 * @param settings the combo setting
	 */
	public void initReference(EObjectFlatComboSettings settings);

	/**
	 * Defines a new reference
	 * @param newValue the new reference to set
	 * 
	 */
	public void setReference(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferenceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the reference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReference(ViewerFilter filter);

	/**
	 * Adds the given filter to the reference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReference(ViewerFilter filter);


	/**
	 * @return the relRes
	 * 
	 */
	public EObject getRelRes();

	/**
	 * Init the relRes
	 * @param settings the combo setting
	 */
	public void initRelRes(EObjectFlatComboSettings settings);

	/**
	 * Defines a new relRes
	 * @param newValue the new relRes to set
	 * 
	 */
	public void setRelRes(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRelResButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the relRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRelRes(ViewerFilter filter);

	/**
	 * Adds the given filter to the relRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRelRes(ViewerFilter filter);


	/**
	 * @return the scenario
	 * 
	 */
	public EObject getScenario();

	/**
	 * Init the scenario
	 * @param settings the combo setting
	 */
	public void initScenario(EObjectFlatComboSettings settings);

	/**
	 * Defines a new scenario
	 * @param newValue the new scenario to set
	 * 
	 */
	public void setScenario(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setScenarioButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the scenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToScenario(ViewerFilter filter);

	/**
	 * Adds the given filter to the scenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToScenario(ViewerFilter filter);


	/**
	 * @return the childScenario
	 * 
	 */
	public EObject getChildScenario();

	/**
	 * Init the childScenario
	 * @param settings the combo setting
	 */
	public void initChildScenario(EObjectFlatComboSettings settings);

	/**
	 * Defines a new childScenario
	 * @param newValue the new childScenario to set
	 * 
	 */
	public void setChildScenario(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setChildScenarioButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the childScenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToChildScenario(ViewerFilter filter);

	/**
	 * Adds the given filter to the childScenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToChildScenario(ViewerFilter filter);


	/**
	 * @return the parent
	 * 
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
	 * 
	 */
	public void setParent_(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParent_(ViewerFilter filter);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter);


	/**
	 * @return the inputRel
	 * 
	 */
	public EObject getInputRel();

	/**
	 * Init the inputRel
	 * @param settings the combo setting
	 */
	public void initInputRel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new inputRel
	 * @param newValue the new inputRel to set
	 * 
	 */
	public void setInputRel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInputRelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the inputRel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputRel(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputRel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputRel(ViewerFilter filter);


	/**
	 * @return the outputRel
	 * 
	 */
	public EObject getOutputRel();

	/**
	 * Init the outputRel
	 * @param settings the combo setting
	 */
	public void initOutputRel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new outputRel
	 * @param newValue the new outputRel to set
	 * 
	 */
	public void setOutputRel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOutputRelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the outputRel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputRel(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputRel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputRel(ViewerFilter filter);


	/**
	 * @return the endToEndScenario
	 * 
	 */
	public EObject getEndToEndScenario();

	/**
	 * Init the endToEndScenario
	 * @param settings the combo setting
	 */
	public void initEndToEndScenario(EObjectFlatComboSettings settings);

	/**
	 * Defines a new endToEndScenario
	 * @param newValue the new endToEndScenario to set
	 * 
	 */
	public void setEndToEndScenario(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEndToEndScenarioButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the endToEndScenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEndToEndScenario(ViewerFilter filter);

	/**
	 * Adds the given filter to the endToEndScenario edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEndToEndScenario(ViewerFilter filter);


	/**
	 * @return the acqRes
	 * 
	 */
	public EObject getAcqRes();

	/**
	 * Init the acqRes
	 * @param settings the combo setting
	 */
	public void initAcqRes(EObjectFlatComboSettings settings);

	/**
	 * Defines a new acqRes
	 * @param newValue the new acqRes to set
	 * 
	 */
	public void setAcqRes(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAcqResButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the acqRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAcqRes(ViewerFilter filter);

	/**
	 * Adds the given filter to the acqRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAcqRes(ViewerFilter filter);


	/**
	 * @return the concurRes
	 * 
	 */
	public EObject getConcurRes();

	/**
	 * Init the concurRes
	 * @param settings the combo setting
	 */
	public void initConcurRes(EObjectFlatComboSettings settings);

	/**
	 * Defines a new concurRes
	 * @param newValue the new concurRes to set
	 * 
	 */
	public void setConcurRes(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setConcurResButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the concurRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConcurRes(ViewerFilter filter);

	/**
	 * Adds the given filter to the concurRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConcurRes(ViewerFilter filter);


	/**
	 * @return the effect
	 * 
	 */
	public EObject getEffect();

	/**
	 * Init the effect
	 * @param settings the combo setting
	 */
	public void initEffect(EObjectFlatComboSettings settings);

	/**
	 * Defines a new effect
	 * @param newValue the new effect to set
	 * 
	 */
	public void setEffect(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEffectButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the effect edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEffect(ViewerFilter filter);

	/**
	 * Adds the given filter to the effect edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEffect(ViewerFilter filter);


	/**
	 * @return the comRes
	 * 
	 */
	public EObject getComRes();

	/**
	 * Init the comRes
	 * @param settings the combo setting
	 */
	public void initComRes(EObjectFlatComboSettings settings);

	/**
	 * Defines a new comRes
	 * @param newValue the new comRes to set
	 * 
	 */
	public void setComRes(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setComResButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the comRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComRes(ViewerFilter filter);

	/**
	 * Adds the given filter to the comRes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToComRes(ViewerFilter filter);




	/**
	 * Init the predec
	 * @param settings settings for the predec ReferencesTable 
	 */
	public void initPredec(ReferencesTableSettings settings);

	/**
	 * Update the predec
	 * @param newValue the predec to update
	 * 
	 */
	public void updatePredec();

	/**
	 * Adds the given filter to the predec edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPredec(ViewerFilter filter);

	/**
	 * Adds the given filter to the predec edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPredec(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the predec table
	 * 
	 */
	public boolean isContainedInPredecTable(EObject element);




	/**
	 * Init the succes
	 * @param settings settings for the succes ReferencesTable 
	 */
	public void initSucces(ReferencesTableSettings settings);

	/**
	 * Update the succes
	 * @param newValue the succes to update
	 * 
	 */
	public void updateSucces();

	/**
	 * Adds the given filter to the succes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSucces(ViewerFilter filter);

	/**
	 * Adds the given filter to the succes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSucces(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the succes table
	 * 
	 */
	public boolean isContainedInSuccesTable(EObject element);




	/**
	 * Init the steps
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSteps(ReferencesTableSettings settings);

	/**
	 * Update the steps
	 * @param newValue the steps to update
	 * 
	 */
	public void updateSteps();

	/**
	 * Adds the given filter to the steps edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSteps(ViewerFilter filter);

	/**
	 * Adds the given filter to the steps edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSteps(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the steps table
	 * 
	 */
	public boolean isContainedInStepsTable(EObject element);




	/**
	 * Init the connectors
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initConnectors(ReferencesTableSettings settings);

	/**
	 * Update the connectors
	 * @param newValue the connectors to update
	 * 
	 */
	public void updateConnectors();

	/**
	 * Adds the given filter to the connectors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConnectors(ViewerFilter filter);

	/**
	 * Adds the given filter to the connectors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConnectors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the connectors table
	 * 
	 */
	public boolean isContainedInConnectorsTable(EObject element);




	/**
	 * Init the cause
	 * @param settings settings for the cause ReferencesTable 
	 */
	public void initCause(ReferencesTableSettings settings);

	/**
	 * Update the cause
	 * @param newValue the cause to update
	 * 
	 */
	public void updateCause();

	/**
	 * Adds the given filter to the cause edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCause(ViewerFilter filter);

	/**
	 * Adds the given filter to the cause edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCause(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the cause table
	 * 
	 */
	public boolean isContainedInCauseTable(EObject element);




	/**
	 * Init the endToEndStimuli
	 * @param settings settings for the endToEndStimuli ReferencesTable 
	 */
	public void initEndToEndStimuli(ReferencesTableSettings settings);

	/**
	 * Update the endToEndStimuli
	 * @param newValue the endToEndStimuli to update
	 * 
	 */
	public void updateEndToEndStimuli();

	/**
	 * Adds the given filter to the endToEndStimuli edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEndToEndStimuli(ViewerFilter filter);

	/**
	 * Adds the given filter to the endToEndStimuli edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEndToEndStimuli(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the endToEndStimuli table
	 * 
	 */
	public boolean isContainedInEndToEndStimuliTable(EObject element);




	/**
	 * Init the behavior
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initBehavior(ReferencesTableSettings settings);

	/**
	 * Update the behavior
	 * @param newValue the behavior to update
	 * 
	 */
	public void updateBehavior();

	/**
	 * Adds the given filter to the behavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter);

	/**
	 * Adds the given filter to the behavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the behavior table
	 * 
	 */
	public boolean isContainedInBehaviorTable(EObject element);




	/**
	 * Init the demand
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDemand(ReferencesTableSettings settings);

	/**
	 * Update the demand
	 * @param newValue the demand to update
	 * 
	 */
	public void updateDemand();

	/**
	 * Adds the given filter to the demand edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDemand(ViewerFilter filter);

	/**
	 * Adds the given filter to the demand edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDemand(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the demand table
	 * 
	 */
	public boolean isContainedInDemandTable(EObject element);




	/**
	 * Init the references
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initReferences(ReferencesTableSettings settings);

	/**
	 * Update the references
	 * @param newValue the references to update
	 * 
	 */
	public void updateReferences();

	/**
	 * Adds the given filter to the references edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferences(ViewerFilter filter);

	/**
	 * Adds the given filter to the references edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferences(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the references table
	 * 
	 */
	public boolean isContainedInReferencesTable(EObject element);





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
