/**
 * Copyright (c) 2026 Talaxie.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Apache v2 License
 * which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.talend.librariesmanager.prefs;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.BackingStoreException;
import org.talend.librariesmanager.LibraryManagerPlugin;

/**
 * Handles the preferences for license acceptance. It uses the Eclipse
 * preferences API to store and retrieve the acceptance status of different
 * license types.
 */
public final class LicenseAcceptancePrefs {
	/** The preference node dedicated to license acceptance. */
	private static final String NODE = LibraryManagerPlugin.PLUGIN_ID + "/licenseAcceptance";

	/**
	 * Checks if the license of the given type has been accepted.
	 * 
	 * @param licenseType The type of the license to check.
	 * @return true if the license has been accepted, false otherwise.
	 */
	public static boolean isLicenseAccepted(String licenseType) {
		return getPrefNode().getBoolean(licenseType, false);
	}

	/**
	 * Sets the acceptance status of the license of the given type.
	 * 
	 * @param licenseType The type of the license to set.
	 * @param accepted    true if the license is accepted, false otherwise.
	 */
	public static void setLicenseAccepted(String licenseType, boolean accepted) {
		IEclipsePreferences prefNode = getPrefNode();
		prefNode.putBoolean(licenseType, accepted);
		try {
			prefNode.flush();
		} catch (BackingStoreException e) {
			throw new RuntimeException("Failed to save license acceptance preference for " + licenseType, e);
		}
	}

	/**
	 * Gets the preference node for license acceptance.
	 * 
	 * @return The preference node for license acceptance.
	 */
	private static IEclipsePreferences getPrefNode() {
		return InstanceScope.INSTANCE.getNode(NODE);
	}
}
