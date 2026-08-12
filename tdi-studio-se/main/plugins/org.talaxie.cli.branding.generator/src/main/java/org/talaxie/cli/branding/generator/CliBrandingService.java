package org.talaxie.cli.branding.generator;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;
import org.talaxie.cli.branding.generator.i18n.Messages;
import org.talend.core.branding.AbstractTalendBrandingService;
import org.talend.core.branding.DefaultBrandingConfiguration;
import org.talend.core.ui.branding.IBrandingConfiguration;

public class CliBrandingService extends AbstractTalendBrandingService {

	private IBrandingConfiguration brandingConfiguration;

	@Override
	public String getStartingBrowserId() {
		// won't show the starting page
		return null;
	}

	@Override
	public String getShortProductName() {
		return getProductName();
	}

	@Override
	public String getCorporationName() {
		return Messages.getString("corporationname"); //$NON-NLS-1$
	}

	@Override
	public ImageDescriptor getLoginHImage() {
		return null;
	}

	@Override
	public ImageDescriptor getLoginVImage() {
		return null;
	}

	@Override
	public URL getLicenseFile() throws IOException {
		final Bundle b = Platform.getBundle(Activator.PLUGIN_ID);
		final URL url = FileLocator.toFileURL(FileLocator.find(b, new Path("resources/license.txt"), null)); //$NON-NLS-1$
		return url;
	}

	@Override
	public IBrandingConfiguration getBrandingConfiguration() {
		/*
		 * The return result is expected NonNullable.
		 * 
		 * It is used without null check e.g. in
		 * org.talend.repository.items.importexport.handlers.model.ImportItem.
		 * getItemName()
		 */
		if (brandingConfiguration == null) {
			brandingConfiguration = new DefaultBrandingConfiguration();
		}
		return brandingConfiguration;
	}

	@Override
	public String getAcronym() {
		return "tos_cli_gen";
	}

	@Override
	public String getJobLicenseHeader(String version) {
		return Messages.getString("TosBrandingService_job_license_header_content", this.getFullProductName(), version);
	}

	@Override
	public String getRoutineLicenseHeader(String version) {
		return Messages.getString("TosBrandingService_routine_license_header_content", this.getFullProductName(),
				version);
	}

	@Override
	public String getProductName() {
		return "Talaxie CLI Generator";
	}

	@Override
	public String getOptionName() {
		return "";
	}

	@Override
	public String getUserManuals() {
		return "DI";
	}
}
