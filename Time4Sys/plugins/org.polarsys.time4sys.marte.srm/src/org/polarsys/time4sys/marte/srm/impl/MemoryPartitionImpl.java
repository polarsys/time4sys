/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.StorageResource;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl#getConcurrentResources <em>Concurrent Resources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl#getForkServices <em>Fork Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl#getExitServices <em>Exit Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.MemoryPartitionImpl#getMemorySpaces <em>Memory Spaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryPartitionImpl extends SoftwareResourceImpl implements MemoryPartition {
	/**
	 * The cached value of the '{@link #getConcurrentResources() <em>Concurrent Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareConcurrentResource> concurrentResources;

	/**
	 * The cached value of the '{@link #getForkServices() <em>Fork Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> forkServices;

	/**
	 * The cached value of the '{@link #getExitServices() <em>Exit Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> exitServices;

	/**
	 * The cached value of the '{@link #getMemorySpaces() <em>Memory Spaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageResource> memorySpaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.MEMORY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareConcurrentResource> getConcurrentResources() {
		if (concurrentResources == null) {
			concurrentResources = new EObjectContainmentWithInverseEList<SoftwareConcurrentResource>(SoftwareConcurrentResource.class, this, SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES, SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ADRESS_SPACE);
		}
		return concurrentResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getForkServices() {
		if (forkServices == null) {
			forkServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_PARTITION__FORK_SERVICES);
		}
		return forkServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getExitServices() {
		if (exitServices == null) {
			exitServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.MEMORY_PARTITION__EXIT_SERVICES);
		}
		return exitServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StorageResource> getMemorySpaces() {
		if (memorySpaces == null) {
			memorySpaces = new EObjectResolvingEList<StorageResource>(StorageResource.class, this, SrmPackage.MEMORY_PARTITION__MEMORY_SPACES);
		}
		return memorySpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcurrentResources()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				return ((InternalEList<?>)getConcurrentResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				return getConcurrentResources();
			case SrmPackage.MEMORY_PARTITION__FORK_SERVICES:
				return getForkServices();
			case SrmPackage.MEMORY_PARTITION__EXIT_SERVICES:
				return getExitServices();
			case SrmPackage.MEMORY_PARTITION__MEMORY_SPACES:
				return getMemorySpaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				getConcurrentResources().clear();
				getConcurrentResources().addAll((Collection<? extends SoftwareConcurrentResource>)newValue);
				return;
			case SrmPackage.MEMORY_PARTITION__FORK_SERVICES:
				getForkServices().clear();
				getForkServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_PARTITION__EXIT_SERVICES:
				getExitServices().clear();
				getExitServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.MEMORY_PARTITION__MEMORY_SPACES:
				getMemorySpaces().clear();
				getMemorySpaces().addAll((Collection<? extends StorageResource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				getConcurrentResources().clear();
				return;
			case SrmPackage.MEMORY_PARTITION__FORK_SERVICES:
				getForkServices().clear();
				return;
			case SrmPackage.MEMORY_PARTITION__EXIT_SERVICES:
				getExitServices().clear();
				return;
			case SrmPackage.MEMORY_PARTITION__MEMORY_SPACES:
				getMemorySpaces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SrmPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				return concurrentResources != null && !concurrentResources.isEmpty();
			case SrmPackage.MEMORY_PARTITION__FORK_SERVICES:
				return forkServices != null && !forkServices.isEmpty();
			case SrmPackage.MEMORY_PARTITION__EXIT_SERVICES:
				return exitServices != null && !exitServices.isEmpty();
			case SrmPackage.MEMORY_PARTITION__MEMORY_SPACES:
				return memorySpaces != null && !memorySpaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryPartitionImpl
