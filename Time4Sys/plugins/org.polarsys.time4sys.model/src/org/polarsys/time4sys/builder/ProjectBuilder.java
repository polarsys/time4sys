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
package org.polarsys.time4sys.builder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;

public class ProjectBuilder {

	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;
	
	private final Project project;
	private final DesignBuilder design;
	
	public ProjectBuilder() {
		this((Project)null);
	}
	
	public ProjectBuilder(final DesignBuilder designBuilder) {
		if (designBuilder == null) {
			throw new IllegalArgumentException("designBuilder must not be null");
		}
		design = designBuilder;
		if (design.build().eContainer() instanceof Project) {
			project = (Project)design.build().eContainer();
		} else {
			project = Time4sysFactory.eINSTANCE.createProject();
			project.setDesign(design.build());
		}
		assert(design != null);
		assert(project.getDesign() == design.build());
	}

	public ProjectBuilder(final Project prj) {
		if (prj == null) {
			project = Time4sysFactory.eINSTANCE.createProject();
		} else {
			project = prj;
		}
		DesignModel designModel = project.getDesign();
		design = new DesignBuilder(designModel);
		project.setDesign(design.build());
		assert(design != null);
		assert(project.getDesign() == design.build());
	}

	public DesignBuilder design() {
		assert(project.getDesign() == design.build());
		return design;
	}

	public Project build() {
		return project;
	}

	public void saveDesignAsEcore(final String pathName) throws IOException {
		
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry reg = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("design", new XMIResourceFactoryImpl());

		final ResourceSet resSet = new ResourceSetImpl();
		final URI uri = URI.createFileURI(pathName);
		final org.eclipse.emf.ecore.resource.Resource resource = resSet.createResource(uri);
		assert(resource != null);
		EList<EObject> contents = resource.getContents();
		final DesignModel designModel = design.build();
		contents.add(designModel); // This change ownership of designModel thus need to set back project's design.
		resource.save(new HashMap<Object, Object>());
		
		project.setDesign(designModel);
	}

	public void saveAsEcore(final String pathName) throws IOException {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry reg = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("time4sys", new XMIResourceFactoryImpl());

		final ResourceSet resSet = new ResourceSetImpl();
		final URI uri = URI.createFileURI(pathName);
		final org.eclipse.emf.ecore.resource.Resource resource = resSet.createResource(uri);
		assert(resource != null);
		EList<EObject> contents = resource.getContents();
		final Project theProject = build();
		contents.add(theProject);
		resource.save(new HashMap<Object, Object>());		
	}

	public ProjectBuilder isNamed(final String name) {
		project.setName(name);
		return this;
	}
}
