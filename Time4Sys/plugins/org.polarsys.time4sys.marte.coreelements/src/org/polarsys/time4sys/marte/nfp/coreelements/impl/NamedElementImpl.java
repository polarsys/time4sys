/**
 */
package org.polarsys.time4sys.marte.nfp.coreelements.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;

import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NamedElementImpl extends ENamedElementImpl implements NamedElement {
	protected NamedElementImpl(final String name) {
		super();
		setName(name);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.NAMED_ELEMENT;
	}

} //NamedElementImpl
