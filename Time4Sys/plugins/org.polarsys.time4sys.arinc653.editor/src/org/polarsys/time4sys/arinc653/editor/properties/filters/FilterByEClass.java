package org.polarsys.time4sys.arinc653.editor.properties.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

public class FilterByEClass<T extends EObject> implements IFilter {
	
	protected Class<T> clz;

	public FilterByEClass(final Class<T> value) {
		this.clz = value;
	}

	public T unwrap(final Object toTest) {
		if (toTest instanceof IStructuredSelection) {
			return unwrap(((IStructuredSelection)toTest).getFirstElement());
		}
		if (toTest instanceof DRepresentationDescriptor) {
			final DRepresentation repr = ((DRepresentationDescriptor)toTest).getRepresentation();
			for(DRepresentationElement eltRepr: repr.getRepresentationElements()) {
				final T r1 = unwrap(eltRepr);
				if (r1 != null) {
					return r1;
				}
			}
		}
		if (toTest instanceof DRepresentationElement) {
			for(EObject elt: ((DRepresentationElement)toTest).getSemanticElements()) {
				final T r2 = unwrap(elt);
				if (r2 != null) {
					return r2;
				}
			}
		}
		if (toTest instanceof IAdaptable) {
			return unwrap(((IAdaptable)toTest).getAdapter(EObject.class));
		}
		if (clz.isInstance(toTest)) {
			return clz.cast(toTest);
		}
		
		return null;
	}
	
	@Override
	public boolean select(Object toTest) {
		return unwrap(toTest) != null;
	}

}
