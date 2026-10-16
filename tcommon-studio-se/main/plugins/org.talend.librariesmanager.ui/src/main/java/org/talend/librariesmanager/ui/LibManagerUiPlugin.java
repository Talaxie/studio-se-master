package org.talend.librariesmanager.ui;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.general.ILibrariesService;
import org.talend.librariesmanager.prefs.LicenseAcceptancePrefs;

public class LibManagerUiPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.talend.librariesmanager.ui"; //$NON-NLS-1$

	public static final Bundle BUNDLE = Platform.getBundle(PLUGIN_ID);

	// The shared instance
	private static LibManagerUiPlugin plugin;

	/**
	 * The constructor
	 */
	public LibManagerUiPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static LibManagerUiPlugin getDefault() {
		return plugin;
	}

	public ILibrariesService getLibrariesService() {
		if (GlobalServiceRegister.getDefault().isServiceRegistered(ILibrariesService.class)) {
			return (ILibrariesService) GlobalServiceRegister.getDefault().getService(ILibrariesService.class);
		}
		return null;
	}

	/**
	 * Test whether the license is accepted or not.
	 * <p>
	 * Since the corresponding preference has moved to
	 * {@link LicenseAcceptancePrefs}, this also ensures a backward compatibility by
	 * migrating the preferences.
	 * </p>
	 * 
	 * @param licenseType The license type to check.
	 * @return true if the license is accepted, false otherwise.
	 */
	public static boolean isAcceptedLicense(String licenseType) {
		// consult the preference store of this plugin to ensure backward compatibility
		IPreferenceStore preferenceStore = getDefault().getPreferenceStore();
		if (preferenceStore.contains(licenseType)) {
			boolean localPref = preferenceStore.getBoolean(licenseType);
			// move to the new preference store
			LicenseAcceptancePrefs.setLicenseAccepted(licenseType, localPref);
			preferenceStore.setToDefault(licenseType);
		}
		return LicenseAcceptancePrefs.isLicenseAccepted(licenseType);
	}
}
