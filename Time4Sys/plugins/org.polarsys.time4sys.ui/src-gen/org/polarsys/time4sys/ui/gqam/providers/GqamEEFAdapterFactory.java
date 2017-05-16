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
package org.polarsys.time4sys.ui.gqam.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory;

/**
 * 
 * 
 */
public class GqamEEFAdapterFactory extends GqamAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createBehaviorScenarioAdapter()
	 * 
	 */
	public Adapter createBehaviorScenarioAdapter() {
		return new BehaviorScenarioPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createStepAdapter()
	 * 
	 */
	public Adapter createStepAdapter() {
		return new StepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createAcquireStepAdapter()
	 * 
	 */
	public Adapter createAcquireStepAdapter() {
		return new AcquireStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createCommunicationStepAdapter()
	 * 
	 */
	public Adapter createCommunicationStepAdapter() {
		return new CommunicationStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createEndToEndFlowAdapter()
	 * 
	 */
	public Adapter createEndToEndFlowAdapter() {
		return new EndToEndFlowPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createExecutionStepAdapter()
	 * 
	 */
	public Adapter createExecutionStepAdapter() {
		return new ExecutionStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createPeriodicPatternAdapter()
	 * 
	 */
	public Adapter createPeriodicPatternAdapter() {
		return new PeriodicPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createPrecedenceRelationAdapter()
	 * 
	 */
	public Adapter createPrecedenceRelationAdapter() {
		return new PrecedenceRelationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createReferenceAdapter()
	 * 
	 */
	public Adapter createReferenceAdapter() {
		return new ReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createReleaseStepAdapter()
	 * 
	 */
	public Adapter createReleaseStepAdapter() {
		return new ReleaseStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createRequestedServiceAdapter()
	 * 
	 */
	public Adapter createRequestedServiceAdapter() {
		return new RequestedServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createSporadicPatternAdapter()
	 * 
	 */
	public Adapter createSporadicPatternAdapter() {
		return new SporadicPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createWorkloadEventAdapter()
	 * 
	 */
	public Adapter createWorkloadEventAdapter() {
		return new WorkloadEventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.gqam.util.GqamAdapterFactory#createWorkloadBehaviorAdapter()
	 * 
	 */
	public Adapter createWorkloadBehaviorAdapter() {
		return new WorkloadBehaviorPropertiesEditionProvider();
	}

}
