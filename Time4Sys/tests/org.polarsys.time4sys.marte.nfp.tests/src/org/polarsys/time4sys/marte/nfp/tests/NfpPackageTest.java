package org.polarsys.time4sys.marte.nfp.tests;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.marte.nfp.NfpPackage;

public class NfpPackageTest {

	private NfpPackage pkg;

	@Before
	public void setUp() throws Exception {
		pkg = NfpPackage.eINSTANCE;
	}

	@Test
	public void test() {
		EClass clz = pkg.eClass();
		for(EAttribute attr: clz.getEAllAttributes()) {
			pkg.eGet(attr);
		}
		for(EClassifier subclz: pkg.getEClassifiers()) {
			
		}
	}

}
