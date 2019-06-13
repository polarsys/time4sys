/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package taskmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Connection;
import petrinet.Node;
import petrinet.PetriNet;
import petrinet.PetrinetFactory;
import petrinet.Place;
import petrinet.Transition;
import taskmodel.First_Release;
import taskmodel.Fragment;
import taskmodel.Jitter;
import taskmodel.MutualExclusionResource;
import taskmodel.Observer;
import taskmodel.Offset;
import taskmodel.Period;
import taskmodel.SharingResourceFragment;
import taskmodel.Stimulus;
import taskmodel.System;
import taskmodel.Task;
import taskmodel.TaskmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmodel.impl.SystemImpl#getObservers <em>Observers</em>}</li>
 *   <li>{@link taskmodel.impl.SystemImpl#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link taskmodel.impl.SystemImpl#getOwnedMutualExclusionResources <em>Owned Mutual Exclusion Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements taskmodel.System {
	/**
	 * The cached value of the '{@link #getObservers() <em>Observers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservers()
	 * @generated
	 * @ordered
	 */
	protected EList<Observer> observers;

	/**
	 * The cached value of the '{@link #getOwnedTasks() <em>Owned Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> ownedTasks;

	/**
	 * The cached value of the '{@link #getOwnedMutualExclusionResources() <em>Owned Mutual Exclusion Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMutualExclusionResources()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualExclusionResource> ownedMutualExclusionResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observer> getObservers() {
		if (observers == null) {
			observers = new EObjectContainmentEList<Observer>(Observer.class, this, TaskmodelPackage.SYSTEM__OBSERVERS);
		}
		return observers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getOwnedTasks() {
		if (ownedTasks == null) {
			ownedTasks = new EObjectContainmentEList<Task>(Task.class, this, TaskmodelPackage.SYSTEM__OWNED_TASKS);
		}
		return ownedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualExclusionResource> getOwnedMutualExclusionResources() {
		if (ownedMutualExclusionResources == null) {
			ownedMutualExclusionResources = new EObjectContainmentEList<MutualExclusionResource>(MutualExclusionResource.class, this, TaskmodelPackage.SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES);
		}
		return ownedMutualExclusionResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PetriNet convertToPetriNet() {
		
		PetrinetFactory factory = PetrinetFactory.eINSTANCE;
		PetriNet petriNet = factory.createPetriNet();
		
		List<Place> allPlaces = new ArrayList<Place>();
		List<Transition> allTransitions = new ArrayList<Transition>();
		List<Connection> allConnections = new ArrayList<Connection>(); 
		
		for (Task task : getOwnedTasks()) {
			if (task.getStimulus()!=null) {
				allPlaces.add(task.getStimulus().getOffset().getOwnedPlace());
				allPlaces.add(task.getStimulus().getFirstRelease().getOwnedPlace());
				allPlaces.add(task.getStimulus().getPeriod().getOwnedPlace());
				allPlaces.add(task.getStimulus().getJitter().getOwnedPlace());
				
				allTransitions.add(task.getStimulus().getOffset().getOwnedTransition());
				allTransitions.add(task.getStimulus().getFirstRelease().getOwnedTransition());
				allTransitions.add(task.getStimulus().getPeriod().getOwnedTransition());
				allTransitions.add(task.getStimulus().getJitter().getOwnedTransition());
				
				allConnections.addAll(task.getStimulus().getOffset().getConnections());
				allConnections.addAll(task.getStimulus().getFirstRelease().getConnections());
				allConnections.addAll(task.getStimulus().getPeriod().getConnections());
				allConnections.addAll(task.getStimulus().getJitter().getConnections());
				
			}
			
			
			for (Fragment fragment : task.getFragments()) {
				allPlaces.add(fragment.getOwnedPlace());
				allTransitions.add(fragment.getOwnedTransition());
				allConnections.addAll(fragment.getConnections());
			}
			
			for (SharingResourceFragment srf : task.getSharingResourceFragments()) {
				allPlaces.add(srf.getFirstFragment().getOwnedPlace());
				allPlaces.add(srf.getSecondFragment().getOwnedPlace());
				allTransitions.add(srf.getFirstFragment().getOwnedTransition());
				allTransitions.add(srf.getSecondFragment().getOwnedTransition());
				allConnections.addAll(srf.getConnections());
			}
		}
		
		for (Observer observer : getObservers()) {
			allPlaces.addAll(observer.getOwnedPlaces());
			allTransitions.addAll(observer.getOwnedTransitions());
			allConnections.addAll(observer.getConnections());
		}
		
		for (MutualExclusionResource mutex : getOwnedMutualExclusionResources()) {
			allPlaces.add(mutex.getMutualExclusionResourcePlace());
			allConnections.addAll(mutex.getConnections());
		}
		
		// Clone all spaces
		List<Place> allClonedPlaces = clonePlacesList(allPlaces);
		//java.lang.System.out.println(allPlaces);
		
		
		// Clone all transitions
		//java.lang.System.out.println(allTransitions);
		List<Transition> allClonedTransitions = cloneTransitionsList(allTransitions);
		
		
		// Clone all connections
		//java.lang.System.out.println(allClonedTransitions);
		List<Connection> allClonedConnections = cloneConnectionsList(allConnections, allClonedPlaces, allClonedTransitions);
	
		petriNet.getPlaces().addAll(allClonedPlaces);
		petriNet.getTransitions().addAll(allClonedTransitions);
		petriNet.getConnections().addAll(allClonedConnections);
		
		return petriNet;
	}

	
	/**
	 * clone place  list
	 * @param allPlaces
	 * @return
	 */
	private List<Place> clonePlacesList(List<Place> allPlaces) {
		List<Place> allClonedPlaces = new ArrayList<Place>();
		for (Place place : allPlaces) {
			allClonedPlaces.add(place.clone());
		}
		return allClonedPlaces;
	}
	
	/**
	 * get place by id
	 * @param allPlaces
	 * @param id
	 * @return
	 */
	private Place getPlaceById(List<Place> allPlaces,String id) {
		for (Place pl : allPlaces) {
			if (pl.getId().compareTo(id)==0) return pl;
		}
		return null;
	}
	
	/**
	 * get transition by id
	 * @param allTransitions
	 * @param id
	 * @return
	 */
	private Transition getTransitionById(List<Transition> allTransitions, String id) {
		for (Transition trans : allTransitions) {
			if (trans.getId().compareTo(id)==0) return trans;
		}
		return null;
	}
	
	/**
	 * 
	 * @param allConnections
	 * @param allClonedPlaces
	 * @param allClonedTransition
	 * @return
	 */
	private List<Connection> cloneConnectionsList(List<Connection> allConnections, List<Place> allClonedPlaces, List<Transition> allClonedTransitions) {
		
		List<Connection> allClonedConnections = new ArrayList<Connection>();
		for (Connection conn : allConnections) {
			Connection clonedConn = conn.clone();
			allClonedConnections.add(clonedConn);
			
			Node source = conn.getSource();
			if (source instanceof Place) {
				Place cloneOfSource = getPlaceById(allClonedPlaces, source.getId());
				//if (cloneOfSource==null) java.lang.System.out.println("source is null");
				clonedConn.setSource(cloneOfSource);
				cloneOfSource.getOutputRel().add(clonedConn);
			} else {
				Transition cloneOfSource = getTransitionById(allClonedTransitions,source.getId());
				//if (cloneOfSource==null) java.lang.System.out.println("source is null");
				clonedConn.setSource(cloneOfSource);
				cloneOfSource.getOutputRel().add(clonedConn);
			}
			
			Node target = conn.getTarget();
			if (target instanceof Place) {
				Place cloneOfTarget = getPlaceById(allClonedPlaces,target.getId());
				clonedConn.setTarget(cloneOfTarget);
				cloneOfTarget.getInputRel().add(clonedConn);
			} else {
				Transition cloneOfTarget = getTransitionById(allClonedTransitions,target.getId());
				clonedConn.setTarget(cloneOfTarget);
				cloneOfTarget.getInputRel().add(clonedConn);
			}
		}
		
		
		return allClonedConnections;
	}
	
	/**
	 * Clone list of transitions
	 * @param allTransitions
	 * @return
	 */
	private List<Transition> cloneTransitionsList(List<Transition> allTransitions) {
		List<Transition> allClonedTransitions = new ArrayList<Transition>();
		for (Transition trans : allTransitions) {
			allClonedTransitions.add(trans.clone());
		}
		return allClonedTransitions;
	}
	
	
	/**
	 * get connections by 2 ends
	 * @param allConnections
	 * @param source
	 * @param target
	 * @return
	 */
	private Connection getConnectionByEnds(List<Connection> allConnections, Node source, Node target) {
		
		for (Connection conn : allConnections) {
			if (conn.getSource() == source && conn.getTarget()==target) return conn;
		}
		return null;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public taskmodel.System clone() {
		System system = new SystemImpl();
		
		List<Place> allPlaces = new ArrayList<Place>();
		List<Transition> allTransitions = new ArrayList<Transition>();
		List<Connection> allConnections = new ArrayList<Connection>(); 
		
		for (Task task : getOwnedTasks()) {
			if (task.getStimulus()!=null) {
				allPlaces.add(task.getStimulus().getOffset().getOwnedPlace());
				allPlaces.add(task.getStimulus().getFirstRelease().getOwnedPlace());
				allPlaces.add(task.getStimulus().getPeriod().getOwnedPlace());
				allPlaces.add(task.getStimulus().getJitter().getOwnedPlace());
				
				allTransitions.add(task.getStimulus().getOffset().getOwnedTransition());
				allTransitions.add(task.getStimulus().getFirstRelease().getOwnedTransition());
				allTransitions.add(task.getStimulus().getPeriod().getOwnedTransition());
				allTransitions.add(task.getStimulus().getJitter().getOwnedTransition());
				
				allConnections.addAll(task.getStimulus().getOffset().getConnections());
				allConnections.addAll(task.getStimulus().getFirstRelease().getConnections());
				allConnections.addAll(task.getStimulus().getPeriod().getConnections());
				allConnections.addAll(task.getStimulus().getJitter().getConnections());
			
			}
				
			for (Fragment fragment : task.getFragments()) {
				allPlaces.add(fragment.getOwnedPlace());
				allTransitions.add(fragment.getOwnedTransition());
				allConnections.addAll(fragment.getConnections());
			}
			
			for (SharingResourceFragment srf : task.getSharingResourceFragments()) {
				allPlaces.add(srf.getFirstFragment().getOwnedPlace());
				allPlaces.add(srf.getSecondFragment().getOwnedPlace());
				allTransitions.add(srf.getFirstFragment().getOwnedTransition());
				allTransitions.add(srf.getSecondFragment().getOwnedTransition());
				allConnections.addAll(srf.getConnections());
			}
		}
		
		for (Observer observer : getObservers()) {
			allPlaces.addAll(observer.getOwnedPlaces());
			allTransitions.addAll(observer.getOwnedTransitions());
			allConnections.addAll(observer.getConnections());
		}
		
		for (MutualExclusionResource mutex : getOwnedMutualExclusionResources()) {
			allPlaces.add(mutex.getMutualExclusionResourcePlace());
			allConnections.addAll(mutex.getConnections());
		}
		
		// Clone all spaces
		List<Place> allClonedPlaces = clonePlacesList (allPlaces);
		
		// Clone all transitions
		List<Transition> allClonedTransitions = cloneTransitionsList(allTransitions);
		
		// Clone all connections
		List<Connection> allClonedConnections = cloneConnectionsList(allConnections,allClonedPlaces,allClonedTransitions);

		/***********************/
		for (Task task : getOwnedTasks()) {
			
			Task clonedTask = new TaskImpl();
			
			// clone the fragments
			for (Fragment fragment : task.getFragments()) {
				Fragment clonedFragment = new FragmentImpl();
				clonedFragment.setOwnedPlace(getPlaceById(allClonedPlaces, fragment.getOwnedPlace().getId()));
				clonedFragment.setOwnedTransition(getTransitionById(allClonedTransitions, fragment.getOwnedTransition().getId()));
				clonedFragment.setPriority(fragment.getPriority());
				for (Connection conn : fragment.getConnections()) {
					Node source = conn.getSource();
					Node target = conn.getTarget();
				
					if (source instanceof Place)  {
						Place clonedSource = getPlaceById(allClonedPlaces, source.getId());
						Transition clonedTarget = getTransitionById(allClonedTransitions, target.getId());
						clonedFragment.getConnections().add(getConnectionByEnds(allClonedConnections,clonedSource,clonedTarget));
					} else {
						Place clonedTarget = getPlaceById(allClonedPlaces, target.getId());
						Transition clonedSource = getTransitionById(allClonedTransitions, source.getId());
						clonedFragment.getConnections().add(getConnectionByEnds(allClonedConnections,clonedSource,clonedTarget));
					}
				}
				clonedTask.getFragments().add(clonedFragment);
			}
			
			// clone sharing resource fragment
			for (SharingResourceFragment srf : task.getSharingResourceFragments()) {
				//java.lang.System.out.println("oui");
				SharingResourceFragment clonedSrf = new SharingResourceFragmentImpl();
				Fragment firstFragment = new FragmentImpl();
				firstFragment.setOwnedPlace(getPlaceById(allClonedPlaces, srf.getFirstFragment().getOwnedPlace().getId()));
				firstFragment.setOwnedTransition(getTransitionById(allClonedTransitions, srf.getFirstFragment().getOwnedTransition().getId()));
				firstFragment.setPriority(srf.getFirstFragment().getPriority());
				clonedSrf.setFirstFragment(firstFragment);
				
				Fragment secondFragment= new FragmentImpl();
				secondFragment.setOwnedPlace(getPlaceById(allClonedPlaces, srf.getSecondFragment().getOwnedPlace().getId()));
				secondFragment.setOwnedTransition(getTransitionById(allClonedTransitions, srf.getSecondFragment().getOwnedTransition().getId()));
				secondFragment.setPriority(srf.getSecondFragment().getPriority());
				clonedSrf.setSecondFragment(secondFragment);
				
				for (Connection conn : srf.getConnections()) {
					Node source = conn.getSource();
					Node target = conn.getTarget();
					
					if (source instanceof Place)  {
						Place clonedSource = getPlaceById(allClonedPlaces, source.getId());
						Transition clonedTarget = getTransitionById(allClonedTransitions, target.getId());
						clonedSrf.getConnections().add(getConnectionByEnds(allClonedConnections,clonedSource,clonedTarget));
					} else {
						Place clonedTarget = getPlaceById(allClonedPlaces, target.getId());
						Transition clonedSource = getTransitionById(allClonedTransitions, source.getId());
						clonedSrf.getConnections().add(getConnectionByEnds(allClonedConnections,clonedSource,clonedTarget));
					}
				}
				
				clonedTask.getSharingResourceFragments().add(clonedSrf);
			}
			
			// clone stimulus
			if (task.getStimulus()!=null) {
				Stimulus stimulus = task.getStimulus();
				Stimulus clonedStimulus = new StimulusImpl();
				
				// offset
				Offset offset = stimulus.getOffset();
				Offset clonedOffset = new OffsetImpl();
				clonedOffset.setOwnedPlace(getPlaceById(allClonedPlaces, offset.getOwnedPlace().getId()));
				clonedOffset.setOwnedTransition(getTransitionById(allClonedTransitions, offset.getOwnedTransition().getId()));
				
				for (Connection conn : offset.getConnections()) {
					Node source = conn.getSource();
					Node target = conn.getTarget();
					
					if (source instanceof Place)  {
						Place clonedSource = getPlaceById(allClonedPlaces, source.getId());
						Transition clonedTarget = getTransitionById(allClonedTransitions, target.getId());
						clonedOffset.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					} else {
						Place clonedTarget = getPlaceById(allClonedPlaces, target.getId());
						Transition clonedSource = getTransitionById(allClonedTransitions, source.getId());
						clonedOffset.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					}
				}
				clonedStimulus.setOffset(clonedOffset);
		
				// first release
				First_Release firstRelease = stimulus.getFirstRelease();
				First_Release clonedFirstRelease = new First_ReleaseImpl();
				clonedFirstRelease.setOwnedPlace(getPlaceById(allClonedPlaces, firstRelease.getOwnedPlace().getId()));
				clonedFirstRelease.setOwnedTransition(getTransitionById(allClonedTransitions, firstRelease.getOwnedTransition().getId()));
				
				for (Connection conn : firstRelease.getConnections()) {
					Node source = conn.getSource();
					Node target = conn.getTarget();
					
					if (source instanceof Place) {
						Place clonedSource = getPlaceById(allClonedPlaces, source.getId());
						Transition clonedTarget = getTransitionById(allClonedTransitions, target.getId());
						clonedFirstRelease.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					} else {
						Transition clonedSource = getTransitionById(allClonedTransitions, source.getId());
						Place clonedTarget = getPlaceById(allClonedPlaces, target.getId());
						clonedFirstRelease.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					}
				}
				clonedStimulus.setFirstRelease(clonedFirstRelease);
				
				// Period
				Period period = stimulus.getPeriod();
				Period clonedPeriod = new PeriodImpl();
				clonedPeriod.setOwnedPlace(getPlaceById(allClonedPlaces, period.getOwnedPlace().getId()));
				clonedPeriod.setOwnedTransition(getTransitionById(allClonedTransitions, period.getOwnedTransition().getId()));
				
				for (Connection conn : period.getConnections()) {
					Node source = conn.getSource();
					Node target = conn.getTarget();
					
					if (source instanceof Place) {
						Place clonedSource = getPlaceById(allClonedPlaces, source.getId());
						Transition clonedTarget = getTransitionById(allClonedTransitions, target.getId());
						clonedPeriod.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					} else {
						Transition clonedSource = getTransitionById(allClonedTransitions, source.getId());
						Place clonedTarget = getPlaceById(allClonedPlaces,target.getId());
						clonedPeriod.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					}
				}
				clonedStimulus.setPeriod(clonedPeriod);
				
				// Jitter
				Jitter jitter = stimulus.getJitter();
				Jitter clonedJitter = new JitterImpl();
				clonedJitter.setOwnedPlace(getPlaceById(allClonedPlaces, jitter.getOwnedPlace().getId()));
				clonedJitter.setOwnedTransition(getTransitionById(allClonedTransitions, jitter.getOwnedTransition().getId()));
				
				for (Connection conn : jitter.getConnections()) {
					Node source = conn.getSource();
					Node target = conn.getTarget();
					
					if (source instanceof Place) {
						Place clonedSource = getPlaceById(allClonedPlaces, source.getId());
						Transition clonedTarget = getTransitionById(allClonedTransitions, target.getId());
						clonedJitter.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					} else {
						Transition clonedSource = getTransitionById(allClonedTransitions, source.getId());
						Place clonedTarget = getPlaceById(allClonedPlaces,target.getId());
						clonedJitter.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
					}
				}
				clonedStimulus.setJitter(clonedJitter);
				
				clonedTask.setStimulus(clonedStimulus);
			}
			
			system.getOwnedTasks().add(clonedTask);
		}
		
		for (MutualExclusionResource mutex : getOwnedMutualExclusionResources()) {
			MutualExclusionResource newMutex = new MutualExclusionResourceImpl();
			Place mutexPlace = getPlaceById(allClonedPlaces, mutex.getMutualExclusionResourcePlace().getId());
			newMutex.setMutualExclusionResourcePlace(mutexPlace);
			
			for (Connection conn : mutex.getConnections()) {
				Node source = conn.getSource();
				Node target = conn.getTarget();
				
				if (source instanceof Place) {
					Place clonedSource = getPlaceById(allClonedPlaces, source.getId());
					Transition clonedTarget = getTransitionById(allClonedTransitions, target.getId());
					newMutex.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
				} else {
					Transition clonedSource = getTransitionById(allClonedTransitions, source.getId());
					Place clonedTarget = getPlaceById(allClonedPlaces,target.getId());
					newMutex.getConnections().add(getConnectionByEnds(allClonedConnections, clonedSource, clonedTarget));
				}
			}
			
			system.getOwnedMutualExclusionResources().add(newMutex);
		} 
		
		/***********************/
		
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskmodelPackage.SYSTEM__OBSERVERS:
				return ((InternalEList<?>)getObservers()).basicRemove(otherEnd, msgs);
			case TaskmodelPackage.SYSTEM__OWNED_TASKS:
				return ((InternalEList<?>)getOwnedTasks()).basicRemove(otherEnd, msgs);
			case TaskmodelPackage.SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES:
				return ((InternalEList<?>)getOwnedMutualExclusionResources()).basicRemove(otherEnd, msgs);
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
			case TaskmodelPackage.SYSTEM__OBSERVERS:
				return getObservers();
			case TaskmodelPackage.SYSTEM__OWNED_TASKS:
				return getOwnedTasks();
			case TaskmodelPackage.SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES:
				return getOwnedMutualExclusionResources();
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
			case TaskmodelPackage.SYSTEM__OBSERVERS:
				getObservers().clear();
				getObservers().addAll((Collection<? extends Observer>)newValue);
				return;
			case TaskmodelPackage.SYSTEM__OWNED_TASKS:
				getOwnedTasks().clear();
				getOwnedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case TaskmodelPackage.SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES:
				getOwnedMutualExclusionResources().clear();
				getOwnedMutualExclusionResources().addAll((Collection<? extends MutualExclusionResource>)newValue);
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
			case TaskmodelPackage.SYSTEM__OBSERVERS:
				getObservers().clear();
				return;
			case TaskmodelPackage.SYSTEM__OWNED_TASKS:
				getOwnedTasks().clear();
				return;
			case TaskmodelPackage.SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES:
				getOwnedMutualExclusionResources().clear();
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
			case TaskmodelPackage.SYSTEM__OBSERVERS:
				return observers != null && !observers.isEmpty();
			case TaskmodelPackage.SYSTEM__OWNED_TASKS:
				return ownedTasks != null && !ownedTasks.isEmpty();
			case TaskmodelPackage.SYSTEM__OWNED_MUTUAL_EXCLUSION_RESOURCES:
				return ownedMutualExclusionResources != null && !ownedMutualExclusionResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TaskmodelPackage.SYSTEM___CONVERT_TO_PETRI_NET:
				return convertToPetriNet();
			case TaskmodelPackage.SYSTEM___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemImpl
