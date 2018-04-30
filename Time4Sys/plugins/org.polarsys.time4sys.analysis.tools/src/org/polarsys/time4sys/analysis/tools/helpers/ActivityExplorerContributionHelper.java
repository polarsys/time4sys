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

	public static void addExtensions() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		Bundle bundle = Activator.getDefault().getBundle();
		IContributor contributor = ContributorFactoryOSGi.createContributor(bundle);
		int position = 1;
		for (IConfigurationElement analysisExtension : registry.getConfigurationElementsFor(Analysis_Extension_ID)) {

			String activityExtension = "<plugin><extension point=\"org.eclipse.amalgam.explorer.activity.ui.activitiesProvider\">"
					+ "<Activity "
					+ "id=\"org.polarsys.time4sys.analysis.tools.Activity" + position+ "\" "
					+ "class=\""+analysisExtension.getAttribute("class")+"\" "
					+ "sectionId=\"org.polarsys.time4sys.analysis.tools.analysis.section\" "
					+ "image=\"icons/Transformation.jpg\" " + "index=\"" + position + "\" " + "name=\""
					+ analysisExtension.getAttribute("Label") + "\">" + "</Activity>"+"</extension> "

					+"<extension point=\"org.eclipse.amalgam.explorer.activity.ui.activitiesProvider\">"
					+ "<Activity "
					+ "id=\"org.polarsys.time4sys.analysis.tools.Validation" + position+ "\" "
					+ "class=\"org.polarsys.time4sys.analysis.tools.ContextValidationActivities\" "
					+ "sectionId=\"org.polarsys.time4sys.analysis.tools.validation.section\" "
					+ "image=\"icons/Transformation.jpg\" " + "index=\"" + position + "\" " + "name=\""
					+ "Validate context for " +analysisExtension.getAttribute("Label") + " tool" + "\">" + "</Activity>"+"</extension></plugin>";
			position++;

			try {
				@SuppressWarnings("restriction")
				Field field = ExtensionRegistry.class.getDeclaredField("masterToken");
				field.setAccessible(true);
				Object masterToken = field.get(registry);
				InputStream isAnalysis = new ByteArrayInputStream(activityExtension.getBytes());
//				InputStream isContextValidation = new ByteArrayInputStream(contextValidationExtension.getBytes());
				if (!registry.addContribution(isAnalysis, analysisExtension.getContributor(), false, null, null, masterToken)) {
					System.out.println(
							"Contribution is not registered : " + isAnalysis.toString());
				}
//				if (!registry.addContribution(isContextValidation, analysisExtension.getContributor(), false, null, null, masterToken)) {
//					System.out.println(
//							"Contribution is not registered : " + isContextValidation.toString());
//				}

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
