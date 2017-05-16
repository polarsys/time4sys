/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.srm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.NamedElement;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;
import org.polarsys.time4sys.marte.grm.ResourceManager;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.ResourceUsage;

import org.polarsys.time4sys.marte.grm.impl.CommunicationEndPointImpl;

import org.polarsys.time4sys.marte.srm.QueuePolicyKind;
import org.polarsys.time4sys.marte.srm.SoftwareInteractionResource;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Interaction Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getResMult <em>Res Mult</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#isIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getPServices <em>PServices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getRServices <em>RServices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getManagedResource <em>Managed Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getResCtrlPolicy <em>Res Ctrl Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getInitializeServices <em>Initialize Services</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getIdentifierElements <em>Identifier Elements</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#isIsIntraMemoryPartitionInteraction <em>Is Intra Memory Partition Interaction</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getWaitingQueuePolicy <em>Waiting Queue Policy</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getWaitingQueueCapacity <em>Waiting Queue Capacity</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.srm.impl.SoftwareInteractionResourceImpl#getWaitingPolicyElements <em>Waiting Policy Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SoftwareInteractionResourceImpl extends CommunicationEndPointImpl implements SoftwareInteractionResource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedResource() <em>Owned Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> ownedResource;

	/**
	 * The default value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected static final int RES_MULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected int resMult = RES_MULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProtected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROTECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProtected()
	 * @generated
	 * @ordered
	 */
	protected boolean isProtected = IS_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPServices() <em>PServices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> pServices;

	/**
	 * The cached value of the '{@link #getOwnedPort() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcePort> ownedPort;

	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceConnector> ownedConnector;

	/**
	 * The cached value of the '{@link #getRServices() <em>RServices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> rServices;

	/**
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceUsage> usedBy;

	/**
	 * The cached value of the '{@link #getManagedResource() <em>Managed Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> managedResource;

	/**
	 * The cached value of the '{@link #getResCtrlPolicy() <em>Res Ctrl Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResCtrlPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceControlPolicy> resCtrlPolicy;

	/**
	 * The cached value of the '{@link #getCreateServices() <em>Create Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> createServices;

	/**
	 * The cached value of the '{@link #getDeleteServices() <em>Delete Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> deleteServices;

	/**
	 * The cached value of the '{@link #getInitializeServices() <em>Initialize Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceService> initializeServices;

	/**
	 * The default value of the '{@link #getMemorySizeFootprint() <em>Memory Size Footprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeFootprint()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_FOOTPRINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemorySizeFootprint() <em>Memory Size Footprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeFootprint()
	 * @generated
	 * @ordered
	 */
	protected int memorySizeFootprint = MEMORY_SIZE_FOOTPRINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateElements() <em>State Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stateElements;

	/**
	 * The cached value of the '{@link #getIdentifierElements() <em>Identifier Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identifierElements;

	/**
	 * The default value of the '{@link #isIsIntraMemoryPartitionInteraction() <em>Is Intra Memory Partition Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntraMemoryPartitionInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIntraMemoryPartitionInteraction() <em>Is Intra Memory Partition Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntraMemoryPartitionInteraction()
	 * @generated
	 * @ordered
	 */
	protected boolean isIntraMemoryPartitionInteraction = IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingQueuePolicy() <em>Waiting Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueuePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final QueuePolicyKind WAITING_QUEUE_POLICY_EDEFAULT = QueuePolicyKind.FIFO;

	/**
	 * The cached value of the '{@link #getWaitingQueuePolicy() <em>Waiting Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueuePolicy()
	 * @generated
	 * @ordered
	 */
	protected QueuePolicyKind waitingQueuePolicy = WAITING_QUEUE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingQueueCapacity() <em>Waiting Queue Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueueCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int WAITING_QUEUE_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWaitingQueueCapacity() <em>Waiting Queue Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueueCapacity()
	 * @generated
	 * @ordered
	 */
	protected int waitingQueueCapacity = WAITING_QUEUE_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWaitingPolicyElements() <em>Waiting Policy Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingPolicyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> waitingPolicyElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareInteractionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrmPackage.Literals.SOFTWARE_INTERACTION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getOwnedResource() {
		if (ownedResource == null) {
			ownedResource = new EObjectContainmentEList<Resource>(Resource.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE);
		}
		return ownedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResMult() {
		return resMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResMult(int newResMult) {
		int oldResMult = resMult;
		resMult = newResMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT, oldResMult, resMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProtected() {
		return isProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProtected(boolean newIsProtected) {
		boolean oldIsProtected = isProtected;
		isProtected = newIsProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED, oldIsProtected, isProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getPServices() {
		if (pServices == null) {
			pServices = new EObjectContainmentEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES);
		}
		return pServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcePort> getOwnedPort() {
		if (ownedPort == null) {
			ownedPort = new EObjectContainmentEList<ResourcePort>(ResourcePort.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT);
		}
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceConnector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<ResourceConnector>(ResourceConnector.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getRServices() {
		if (rServices == null) {
			rServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RSERVICES);
		}
		return rServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceUsage> getUsedBy() {
		if (usedBy == null) {
			usedBy = new EObjectWithInverseResolvingEList.ManyInverse<ResourceUsage>(ResourceUsage.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY, GrmPackage.RESOURCE_USAGE__USED_RESOURCE);
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getManagedResource() {
		if (managedResource == null) {
			managedResource = new EObjectResolvingEList<Resource>(Resource.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE);
		}
		return managedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceControlPolicy> getResCtrlPolicy() {
		if (resCtrlPolicy == null) {
			resCtrlPolicy = new EObjectContainmentEList<ResourceControlPolicy>(ResourceControlPolicy.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY);
		}
		return resCtrlPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getCreateServices() {
		if (createServices == null) {
			createServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES);
		}
		return createServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getDeleteServices() {
		if (deleteServices == null) {
			deleteServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES);
		}
		return deleteServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceService> getInitializeServices() {
		if (initializeServices == null) {
			initializeServices = new EObjectResolvingEList<ResourceService>(ResourceService.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES);
		}
		return initializeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemorySizeFootprint() {
		return memorySizeFootprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySizeFootprint(int newMemorySizeFootprint) {
		int oldMemorySizeFootprint = memorySizeFootprint;
		memorySizeFootprint = newMemorySizeFootprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT, oldMemorySizeFootprint, memorySizeFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStateElements() {
		if (stateElements == null) {
			stateElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS);
		}
		return stateElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentifierElements() {
		if (identifierElements == null) {
			identifierElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS);
		}
		return identifierElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIntraMemoryPartitionInteraction() {
		return isIntraMemoryPartitionInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIntraMemoryPartitionInteraction(boolean newIsIntraMemoryPartitionInteraction) {
		boolean oldIsIntraMemoryPartitionInteraction = isIntraMemoryPartitionInteraction;
		isIntraMemoryPartitionInteraction = newIsIntraMemoryPartitionInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION, oldIsIntraMemoryPartitionInteraction, isIntraMemoryPartitionInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuePolicyKind getWaitingQueuePolicy() {
		return waitingQueuePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitingQueuePolicy(QueuePolicyKind newWaitingQueuePolicy) {
		QueuePolicyKind oldWaitingQueuePolicy = waitingQueuePolicy;
		waitingQueuePolicy = newWaitingQueuePolicy == null ? WAITING_QUEUE_POLICY_EDEFAULT : newWaitingQueuePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY, oldWaitingQueuePolicy, waitingQueuePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWaitingQueueCapacity() {
		return waitingQueueCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitingQueueCapacity(int newWaitingQueueCapacity) {
		int oldWaitingQueueCapacity = waitingQueueCapacity;
		waitingQueueCapacity = newWaitingQueueCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY, oldWaitingQueueCapacity, waitingQueueCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWaitingPolicyElements() {
		if (waitingPolicyElements == null) {
			waitingPolicyElements = new EDataTypeUniqueEList<String>(String.class, this, SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS);
		}
		return waitingPolicyElements;
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
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedBy()).basicAdd(otherEnd, msgs);
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
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE:
				return ((InternalEList<?>)getOwnedResource()).basicRemove(otherEnd, msgs);
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES:
				return ((InternalEList<?>)getPServices()).basicRemove(otherEnd, msgs);
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT:
				return ((InternalEList<?>)getOwnedPort()).basicRemove(otherEnd, msgs);
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY:
				return ((InternalEList<?>)getUsedBy()).basicRemove(otherEnd, msgs);
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY:
				return ((InternalEList<?>)getResCtrlPolicy()).basicRemove(otherEnd, msgs);
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
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME:
				return getName();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE:
				return getOwnedResource();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT:
				return getResMult();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED:
				return isIsProtected();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE:
				return isIsActive();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES:
				return getPServices();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT:
				return getOwnedPort();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR:
				return getOwnedConnector();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RSERVICES:
				return getRServices();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY:
				return getUsedBy();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE:
				return getManagedResource();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY:
				return getResCtrlPolicy();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES:
				return getCreateServices();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES:
				return getDeleteServices();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES:
				return getInitializeServices();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				return getMemorySizeFootprint();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS:
				return getStateElements();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS:
				return getIdentifierElements();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				return isIsIntraMemoryPartitionInteraction();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				return getWaitingQueuePolicy();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				return getWaitingQueueCapacity();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				return getWaitingPolicyElements();
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
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE:
				getOwnedResource().clear();
				getOwnedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT:
				setResMult((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED:
				setIsProtected((Boolean)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES:
				getPServices().clear();
				getPServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends ResourcePort>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends ResourceConnector>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RSERVICES:
				getRServices().clear();
				getRServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends ResourceUsage>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE:
				getManagedResource().clear();
				getManagedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				getResCtrlPolicy().addAll((Collection<? extends ResourceControlPolicy>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				getCreateServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				getDeleteServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				getInitializeServices().addAll((Collection<? extends ResourceService>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				getStateElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				getIdentifierElements().addAll((Collection<? extends String>)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				setIsIntraMemoryPartitionInteraction((Boolean)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				setWaitingQueuePolicy((QueuePolicyKind)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				setWaitingQueueCapacity((Integer)newValue);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				getWaitingPolicyElements().clear();
				getWaitingPolicyElements().addAll((Collection<? extends String>)newValue);
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
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE:
				getOwnedResource().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT:
				setResMult(RES_MULT_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED:
				setIsProtected(IS_PROTECTED_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES:
				getPServices().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RSERVICES:
				getRServices().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY:
				getUsedBy().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE:
				getManagedResource().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY:
				getResCtrlPolicy().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint(MEMORY_SIZE_FOOTPRINT_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				setIsIntraMemoryPartitionInteraction(IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				setWaitingQueuePolicy(WAITING_QUEUE_POLICY_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				setWaitingQueueCapacity(WAITING_QUEUE_CAPACITY_EDEFAULT);
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				getWaitingPolicyElements().clear();
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
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE:
				return ownedResource != null && !ownedResource.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT:
				return resMult != RES_MULT_EDEFAULT;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED:
				return isProtected != IS_PROTECTED_EDEFAULT;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES:
				return pServices != null && !pServices.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RSERVICES:
				return rServices != null && !rServices.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY:
				return usedBy != null && !usedBy.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE:
				return managedResource != null && !managedResource.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY:
				return resCtrlPolicy != null && !resCtrlPolicy.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES:
				return createServices != null && !createServices.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES:
				return deleteServices != null && !deleteServices.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES:
				return initializeServices != null && !initializeServices.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				return memorySizeFootprint != MEMORY_SIZE_FOOTPRINT_EDEFAULT;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS:
				return stateElements != null && !stateElements.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS:
				return identifierElements != null && !identifierElements.isEmpty();
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				return isIntraMemoryPartitionInteraction != IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				return waitingQueuePolicy != WAITING_QUEUE_POLICY_EDEFAULT;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				return waitingQueueCapacity != WAITING_QUEUE_CAPACITY_EDEFAULT;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				return waitingPolicyElements != null && !waitingPolicyElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME: return GrmPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ResourcePackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Resource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE: return GrmPackage.RESOURCE__OWNED_RESOURCE;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT: return GrmPackage.RESOURCE__RES_MULT;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED: return GrmPackage.RESOURCE__IS_PROTECTED;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE: return GrmPackage.RESOURCE__IS_ACTIVE;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES: return GrmPackage.RESOURCE__PSERVICES;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT: return GrmPackage.RESOURCE__OWNED_PORT;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR: return GrmPackage.RESOURCE__OWNED_CONNECTOR;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RSERVICES: return GrmPackage.RESOURCE__RSERVICES;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY: return GrmPackage.RESOURCE__USED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResourceManager.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE: return GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY: return GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (derivedFeatureID) {
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES: return SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT: return SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS;
				case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS: return SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case GrmPackage.NAMED_ELEMENT__NAME: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME;
				default: return -1;
			}
		}
		if (baseClass == ResourcePackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Resource.class) {
			switch (baseFeatureID) {
				case GrmPackage.RESOURCE__OWNED_RESOURCE: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE;
				case GrmPackage.RESOURCE__RES_MULT: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT;
				case GrmPackage.RESOURCE__IS_PROTECTED: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED;
				case GrmPackage.RESOURCE__IS_ACTIVE: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE;
				case GrmPackage.RESOURCE__PSERVICES: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES;
				case GrmPackage.RESOURCE__OWNED_PORT: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT;
				case GrmPackage.RESOURCE__OWNED_CONNECTOR: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR;
				case GrmPackage.RESOURCE__RSERVICES: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RSERVICES;
				case GrmPackage.RESOURCE__USED_BY: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__USED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResourceManager.class) {
			switch (baseFeatureID) {
				case GrmPackage.RESOURCE_MANAGER__MANAGED_RESOURCE: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MANAGED_RESOURCE;
				case GrmPackage.RESOURCE_MANAGER__RES_CTRL_POLICY: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY;
				default: return -1;
			}
		}
		if (baseClass == SoftwareResource.class) {
			switch (baseFeatureID) {
				case SrmPackage.SOFTWARE_RESOURCE__CREATE_SERVICES: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__CREATE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__DELETE_SERVICES: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__DELETE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__INITIALIZE_SERVICES: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__INITIALIZE_SERVICES;
				case SrmPackage.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT;
				case SrmPackage.SOFTWARE_RESOURCE__STATE_ELEMENTS: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS;
				case SrmPackage.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS: return SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", resMult: ");
		result.append(resMult);
		result.append(", isProtected: ");
		result.append(isProtected);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", memorySizeFootprint: ");
		result.append(memorySizeFootprint);
		result.append(", stateElements: ");
		result.append(stateElements);
		result.append(", identifierElements: ");
		result.append(identifierElements);
		result.append(", isIntraMemoryPartitionInteraction: ");
		result.append(isIntraMemoryPartitionInteraction);
		result.append(", waitingQueuePolicy: ");
		result.append(waitingQueuePolicy);
		result.append(", waitingQueueCapacity: ");
		result.append(waitingQueueCapacity);
		result.append(", waitingPolicyElements: ");
		result.append(waitingPolicyElements);
		result.append(')');
		return result.toString();
	}

} //SoftwareInteractionResourceImpl
