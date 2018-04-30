package org.polarsys.time4sys.marte.sam.impl;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

public class EObjectNotUniqueEList<E> extends EObjectResolvingEList<E> {

	public EObjectNotUniqueEList(Class<?> dataClass, InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isUnique() {
		return false;
	}
}
