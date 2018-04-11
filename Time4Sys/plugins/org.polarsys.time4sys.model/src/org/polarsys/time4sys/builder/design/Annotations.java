/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

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
		annot.getDetails().removeKey(attrname);
		if (annot.getDetails().isEmpty() && annot.getReferences().isEmpty()) {
			obj.getEAnnotations().remove(annot);
		}
	}

	/**
	 * This is an helper class.
	 */
	private Annotations() {
	}

}
