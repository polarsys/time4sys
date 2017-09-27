/**
 */
package org.polarsys.time4sys.marte.nfp.coreelements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.time4sys.marte.nfp.coreelements.Abstraction;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsFactory;
import org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage;
import org.polarsys.time4sys.marte.nfp.coreelements.Dependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreElementsFactoryImpl extends EFactoryImpl implements CoreElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreElementsFactory init() {
		try {
			CoreElementsFactory theCoreElementsFactory = (CoreElementsFactory)EPackage.Registry.INSTANCE.getEFactory(CoreElementsPackage.eNS_URI);
			if (theCoreElementsFactory != null) {
				return theCoreElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoreElementsPackage.ABSTRACTION: return createAbstraction();
			case CoreElementsPackage.DEPENDENCY: return createDependency();
			case CoreElementsPackage.PACKAGE: return createPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction createAbstraction() {
		AbstractionImpl abstraction = new AbstractionImpl();
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.time4sys.marte.nfp.coreelements.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsPackage getCoreElementsPackage() {
		return (CoreElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoreElementsPackage getPackage() {
		return CoreElementsPackage.eINSTANCE;
	}

} //CoreElementsFactoryImpl
