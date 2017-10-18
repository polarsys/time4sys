package org.polarsys.time4sys.analysis.tools.helpers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.internal.registry.IRegistryConstants;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.polarsys.time4sys.analysis.tools.Activator;

public class ActivityExplorerContributionHelper {

	public static final String Analysis_Extension_ID = "org.polarsys.time4sys.analysis.tools.analysisTools"; //$NON-NLS-1$

	private static String Section_Extension_ID = "org.polarsys.time4sys.analysis.tools.section";

	public static void addExtensions() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		Bundle bundle = Activator.getDefault().getBundle();
		IContributor contributor = ContributorFactoryOSGi.createContributor(bundle);
		int position = 1;
		for (IConfigurationElement analysisExtension : registry.getConfigurationElementsFor(Analysis_Extension_ID)) {

			String activityExtension = "<extension point=\"org.eclipse.amalgam.explorer.activity.ui.activitiesProvider\">"
					+ "<Activity "
					+ "class=\"org.polarsys.time4sys.analysis.tools.ActivityExplorerActivityContribution\" "
					+ "sectionId=\"org.polarsys.time4sys.analysis.tools.section\" "
					+ "image=\"icons/Transformation.jpg\" " + "index=\"" + position + "\" " + "name=\""
					+ analysisExtension.getAttribute("Label") + "\">" + "</Activity>"+"</extension>";
			position++;

			try {
				@SuppressWarnings("restriction")
				Field field = ExtensionRegistry.class.getDeclaredField("masterToken");
				field.setAccessible(true);
				Object masterToken = field.get(registry);
				InputStream is = new ByteArrayInputStream(activityExtension.getBytes());
				if (!registry.addContribution(is, analysisExtension.getContributor(), true, null, null, masterToken)) {
					System.out.println(
							"Contribution is not registered : " + is.toString());
				}

			} catch (NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (IExtension ee : registry.getExtensions(contributor)) {
				System.out.println("STARTED"+ee.toString());
			}
		}
	}

//	public static void removeExtensions() {
//		IExtensionRegistry registry = Platform.getExtensionRegistry();
//		Bundle bundle = Activator.getDefault().getBundle();
//		IContributor contributor = ContributorFactoryOSGi.createContributor(bundle);
//		for (IConfigurationElement analysisExtension : registry.getConfigurationElementsFor(Section_Extension_ID)) {
//
//			System.out.println("STOP");
//		}
//	}

}
