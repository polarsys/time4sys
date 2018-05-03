/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.CopierMapper.Observer;

/**
 * @author loic
 *
 */
public abstract class AbstractTransformation extends IdentityDerivation implements Observer {

	protected Context mainCtx;
	
	/**
	 * @param project
	 * @param source
	 */
	public AbstractTransformation(Project project, DesignModel source, final String transName) {
		super(project, source);
		mainCtx = mappingFactory.createContext(transName);
	}
	
	@Override
	public CopierMapper createCopierMapper() {
		final CopierMapper result = super.createCopierMapper();
		result.addObserver(this);
		return result;
	}
	
	@Override
	public void createRules() {
		super.createRules();
		mapping.getRules().add(mainCtx);
	}
	
	@Override
	public Transformation transform() {
		final Transformation result = super.transform();
		result.getMapping().setRationale(mainCtx);
		result.setName(mainCtx.getName());
		return result;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.time4sys.transformations.CopierMapper.Observer#copied(org.eclipse.emf.ecore.EObject, org.polarsys.time4sys.mapping.Link, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public abstract void copied(EObject source, Link lnk, EObject theCopy);
	
	@Override
	protected abstract void finalize(final DesignModel target);
}
