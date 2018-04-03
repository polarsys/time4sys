/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcoreFactory;

/**
 * @author loic
 *
 */
class Annotations {

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


	/**
	 * This is an helper class.
	 */
	private Annotations() {
	}

}
