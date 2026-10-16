// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.talend.commons.CommonsPlugin;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.general.LibraryInfo;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.routines.IRoutinesProvider;

/**
 * Manages user-driven choices for library installation, without graphical UI.
 */
public interface ILibraryManagerUserService extends IService {

	public void installModules(String[] jarNames);

	public void installModules(Collection<ModuleNeeded> requiredModules);

	public Collection<IRoutinesProvider> getRoutinesProviders(ECodeLanguage language);

	public void initializeSystemLibs();

	public Map<String, List<LibraryInfo>> getRoutineAndJars();

	public List<IRepositoryViewObject> collectRelatedRoutines(Set<String> includeRoutineIdOrNames, boolean system,
			ERepositoryObjectType type);

	public String getLibrariesPath(ECodeLanguage language);

	public List<String> getNeedInstallModuleForBundle(String bundleName);

	public boolean isModuleInstalledForBundle(String bundleName);

	/**
	 * Get the preferred registered service.
	 * 
	 * @return registered service, with or without UI interactions.
	 */
	public static ILibraryManagerUserService getRegistered() {
		ILibraryManagerUserService libUserService = null;
		if (!CommonsPlugin.isHeadless()
				&& GlobalServiceRegister.getDefault().isServiceRegistered(ILibraryManagerUIService.class)) {
			// prefer UI service for better user experience
			libUserService = GlobalServiceRegister.getDefault().getService(ILibraryManagerUIService.class);
		} else if (CommonsPlugin.isHeadless()
				&& GlobalServiceRegister.getDefault().isServiceRegistered(ILibraryManagerUserService.class)) {
			// use the non-interactive user service in headless mode
			libUserService = GlobalServiceRegister.getDefault().getService(ILibraryManagerUserService.class);
		}
		return libUserService;
	}

	/**
	 * Accept the configuration for library installation, including license
	 * acceptance and libraries folder.
	 * <p>
	 * Sub-implementations are free to exploit this configuration or ignore it.
	 * </p>
	 * 
	 * @param acceptAllLicenses true to accept all licenses, false to ask for
	 *                          acceptance.
	 * @param libsFolder        the folder where to eventually look for libraries to
	 *                          install.
	 */
	default void acceptConfiguration(boolean acceptAllLicenses, Optional<File> libsFolder) {
		// do nothing, just ignore the configuration.
	}
}
