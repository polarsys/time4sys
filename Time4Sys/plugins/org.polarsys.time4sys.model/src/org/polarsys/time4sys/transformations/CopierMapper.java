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
 * 
 */
package org.polarsys.time4sys.transformations;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;

/**
 * @author loic
 * TODO: Try to create hierarchical links
 */
public class CopierMapper extends Copier {

	protected static final MappingFactory mappingFactory = MappingFactory.eINSTANCE;

	private static final long serialVersionUID = 7035636184301115392L;
	
	protected static interface Observer {

		void copied(EObject source, Link lnk, EObject theCopy);
		
	}

	protected final Context identityRule;
	protected final Mapping mapping;
	protected Stack<Link> stack;
	protected final Map<EObject, List<Link>> maps;

	private Collection<Observer> observers = new LinkedList<>();

	/**
	 * 
	 */
	public CopierMapper(
			final Mapping mapping,
			final Context identityRule) {
		super();
		this.identityRule = identityRule;
		this.mapping = mapping;
		stack = new Stack<>();
		stack.push(mapping);
		maps = new HashMap<>();
	}
	
	public EObject copy(EObject eObject) {
		final Link lnk = mappingFactory.createLink();
		stack.push(lnk);
		final EObject theCopy = super.copy(eObject);
		final Link o = stack.pop();
		assert(lnk == o);
		lnk.getSources().add(mappingFactory.createMappableArtefact("original", eObject));
		lnk.getTargets().add(mappingFactory.createMappableArtefact("copy", theCopy));
		lnk.setRationale(identityRule);
		stack.peek().getSubLinks().add(lnk);
		addMapEntry(eObject, lnk);
		addMapEntry(theCopy, lnk);
		fireCopied(eObject, lnk, theCopy);
		return theCopy;
	}

	protected void addMapEntry(final EObject key, final Link lnk) {
		List<Link> links = maps.get(key);
		if (links == null) {
			links = new LinkedList<>();
			maps.put(key, links);
		}
		links.add(lnk);
	}
	
	public List<Link> getLinksFor(final EObject key) {
		return maps.get(key);
	}

	/**
	 * Returns a self-contained copy of the eObject.
	 * 
	 * @param eObject
	 *            the object to copy.
	 * @return the copy.
	 * @see Copier
	 */
	public <T extends EObject> T copyAndMap(T eObject) {
		EObject result = copy(eObject);
		copyReferences();

		@SuppressWarnings("unchecked")
		T t = (T) result;
		return t;
	}


	protected void fireCopied(final EObject source, final Link lnk, final EObject theCopy) {
		for(Observer obs: observers) {
			obs.copied(source, lnk, theCopy);
		}
	}
	
	public boolean addObserver(final Observer obs) {
		return observers.add(obs);
	}
}
