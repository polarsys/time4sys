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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.model.time4sys.Project;

/**
 * @author loic
 *
 */
public class IdentityDerivation {


	public static final String IDENTITY_RULE_NAME = "Identity Rule".intern();

	public static Mapping duplicate(final Project project, final DesignModel source) {
		return new IdentityDerivation(project, source).transform();
	}

	protected DesignModel source;
	protected Project project;
	protected Context identityRule;
	protected Mapping mapping;
	protected CopierMapper copierMapper;
	
	protected static final MappingFactory mappingFactory = MappingFactory.eINSTANCE;

	public IdentityDerivation(final Project project, final DesignModel source) {
		this.source = source;
		this.project = project;
	}
 
	public Mapping transform() {
		mapping = mappingFactory.createMapping();
		mapping.getSources().add(mappingFactory.createResourceArtefact("original", source.eResource()));
		createRules();
		final DesignModel target = copy();
		project.getDerivations().add(target);
		mapping.getTargets().add(mappingFactory.createResourceArtefact("copy", target.eResource()));
		project.getMappings().add(mapping);
		finalize(target);
		return mapping;
	}

	protected void finalize(final DesignModel target) {
	}

	public void createRules() {
		identityRule = mappingFactory.createContext(IDENTITY_RULE_NAME);
		mapping.getRules().add(identityRule);
	}

	public DesignModel copy() {
		copierMapper = createCopierMapper();
		final DesignModel target = copierMapper.copyAndMap(source);
		return target;
	}

	public CopierMapper createCopierMapper() {
		final CopierMapper copierMapper = new CopierMapper(mapping, identityRule);
		return copierMapper;
	}
	
	public Link getUniqueLinkFor(final EObject key) {
		final List<Link> links = copierMapper.getLinksFor(key);
		assert(!links.isEmpty());
		assert(links.size() == 1);
		final Link copyLnk = links.get(0);
		return copyLnk;
	}
}
