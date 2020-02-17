/*******************************************************************************
 * Copyright (c) 2017, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author loic
 *
 */
public class Annotations {

	public static EAnnotation annotate(final EModelElement obj, final String source) {
		EAnnotation annot = obj.getEAnnotation(source);
		if (annot != null) {
			return annot;
		}
		annot = EcoreFactory.eINSTANCE.createEAnnotation();
		annot.setSource(source);
		obj.getEAnnotations().add(annot);
		return annot;
	}

	public static boolean hasAnnotation(final EModelElement obj, final String source) {
		return obj.getEAnnotation(source) != null;
	}


	public static void unsetAnnotationAttr(final EModelElement obj, final String source, final String attrname) {
		final EAnnotation annot = obj.getEAnnotation(source);
		//annot.getDetails().removeKey(attrname);
		final int entryIndex = annot.getDetails().indexOfKey(attrname);
		if (entryIndex != -1) {
			final Entry<String, String> entry = annot.getDetails().get(entryIndex);
			if (entry instanceof EStringToStringMapEntryImpl) {
				EcoreUtil.delete((EStringToStringMapEntryImpl)entry);
			} else {
				annot.getDetails().remove(entryIndex);
			}
		}
		if (annot.getDetails().isEmpty() && annot.getReferences().isEmpty()) {
			//obj.getEAnnotations().remove(annot);
			EcoreUtil.delete(annot);
		}
	}
	
	public static void removeAnnotation(final EModelElement obj, final String source) {
		final EAnnotation annot = obj.getEAnnotation(source);
		obj.getEAnnotations().remove(annot);
	}
	
	public static EAnnotation setAttr(final EModelElement obj, String sourceurl, final String attrname, final String value) {
		final EAnnotation annot = Annotations.annotate(obj, sourceurl);
		annot.getDetails().put(attrname, value);
		return annot;
	}
	
	public static String getAttr(final EModelElement obj, String sourceurl, final String attrname) {
		if (hasAnnotation(obj, sourceurl)) {
			final EAnnotation annot = Annotations.annotate(obj, sourceurl);
			return annot.getDetails().get(attrname);
		}
		return null;
	}
	
	public static boolean hasAttr(final EModelElement obj, final String sourceurl, final String attrname) {
		if (hasAnnotation(obj, sourceurl)) {
			final EAnnotation annot = Annotations.annotate(obj, sourceurl);
			return annot.getDetails().containsKey(attrname);
		}
		return false;
	}

	/**
	 * This is an helper class.
	 */
	private Annotations() {
	}

}
