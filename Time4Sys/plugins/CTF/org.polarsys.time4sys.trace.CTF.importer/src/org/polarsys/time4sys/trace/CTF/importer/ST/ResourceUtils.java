/*******************************************************************************
 * Copyright (c) 2019 Link Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Khouloud BOUDHHIR / Oualid KHAYATI - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.trace.CTF.importer.ST;
/**
An implementation of the class ResourceUtils
* Load / create resource XMI according to the extension from/To the location
* @author Khouloud
*
*/
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public final class ResourceUtils {

	private ResourceUtils() {
	}

	@SuppressWarnings("unchecked")
	public static <T> T loadModel(String location, Class<T> class1, EPackage package1) {
		// Initialize the model
		package1.eClass();

		// Register the XMI resource factory for the extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(package1.getName(), new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createFileURI(location), true);

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		T root = (T) resource.getContents().get(0);

		return root;
	}


	public static void saveModel(EObject root, String uri, EPackage package1) {
		saveModel(root,URI.createFileURI(uri),package1);
	}
	
	public static void saveModel(EObject root, URI uri, EPackage package1) {

		// Register the XMI resource factory for the extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(package1.getName(), new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(uri);
		resource.getContents().add(root);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void registerPackage(EPackage... ePackages) {
		for (EPackage ePackage : ePackages) {
			new ResourceSetImpl().getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}
	}

}