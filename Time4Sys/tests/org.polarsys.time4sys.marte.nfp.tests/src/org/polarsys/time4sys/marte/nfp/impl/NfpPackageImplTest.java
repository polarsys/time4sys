package org.polarsys.time4sys.marte.nfp.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.polarsys.time4sys.marte.nfp.NfpPackage;

public class NfpPackageImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		NfpPackageImpl.init();
		
		final NfpPackageImpl nfpPackageImpl = (NfpPackageImpl)NfpPackage.eINSTANCE;
		nfpPackageImpl.initializePackageContents();
		nfpPackageImpl.createPackageContents();
	}

}
