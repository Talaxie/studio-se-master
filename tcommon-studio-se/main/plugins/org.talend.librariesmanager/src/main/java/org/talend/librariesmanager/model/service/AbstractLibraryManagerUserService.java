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
package org.talend.librariesmanager.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.talend.core.GlobalServiceRegister;
import org.talend.core.ILibraryManagerService;
import org.talend.core.ILibraryManagerUserService;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.general.LibraryInfo;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.routines.IRoutinesProvider;
import org.talend.core.model.routines.RoutineLibraryMananger;
import org.talend.core.model.routines.RoutinesUtil;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.librariesmanager.model.ModulesNeededProvider;
import org.talend.librariesmanager.prefs.LibrariesManagerUtils;

/**
 * This is the base implementation for services managing user libraries
 * installation.
 */
public abstract class AbstractLibraryManagerUserService implements ILibraryManagerUserService {

	@Override
	public Collection<IRoutinesProvider> getRoutinesProviders(ECodeLanguage language) {
		return RoutineProviderManager.getInstance().getProviders(language);
	}

	@Override
	public void initializeSystemLibs() {
		RoutineLibraryMananger.getInstance().initializeSystemLibs();
	}

	@Override
	public Map<String, List<LibraryInfo>> getRoutineAndJars() {
		return RoutineLibraryMananger.getInstance().getRoutineAndJars();
	}

	@Override
	public List<IRepositoryViewObject> collectRelatedRoutines(Set<String> includeRoutineIdOrNames, boolean system,
			ERepositoryObjectType type) {
		return RoutinesUtil.collectRelatedRoutines(includeRoutineIdOrNames, system, type);
	}

	@Override
	public String getLibrariesPath(ECodeLanguage language) {
		return LibrariesManagerUtils.getLibrariesPath(language);
	}

	@Override
	public List<String> getNeedInstallModuleForBundle(String bundleName) {
		List<ModuleNeeded> allModulesNeededExtensionsForPlugin = ModulesNeededProvider
				.getAllModulesNeededExtensionsForPlugin();
		List<ModuleNeeded> requiredModulesForBundle = ModulesNeededProvider.filterRequiredModulesForBundle(bundleName,
				allModulesNeededExtensionsForPlugin);
		List<String> requiredJars = new ArrayList<String>(requiredModulesForBundle.size());
		ILibraryManagerService service;
		if (GlobalServiceRegister.getDefault().isServiceRegistered(ILibraryManagerService.class)) {
			service = (ILibraryManagerService) GlobalServiceRegister.getDefault()
					.getService(ILibraryManagerService.class);
			for (ModuleNeeded module : requiredModulesForBundle) {
				String moduleName = module.getModuleName();
				if (!service.contains(moduleName)) {
					requiredJars.add(moduleName);
				}
			}
		}
		return requiredJars;
	}

	@Override
	public boolean isModuleInstalledForBundle(String bundleName) {
		if (CoreRuntimePlugin.getInstance().getBundle().getBundleContext().getProperty("osgi.dev") != null) {
			return true;
		}
		List<ModuleNeeded> allModulesNeededExtensionsForPlugin = ModulesNeededProvider
				.getAllModulesNeededExtensionsForPlugin();
		List<ModuleNeeded> requiredModulesForBundle = ModulesNeededProvider.filterRequiredModulesForBundle(bundleName,
				allModulesNeededExtensionsForPlugin);
		ILibraryManagerService service;
		if (GlobalServiceRegister.getDefault().isServiceRegistered(ILibraryManagerService.class)) {
			service = (ILibraryManagerService) GlobalServiceRegister.getDefault()
					.getService(ILibraryManagerService.class);
			for (ModuleNeeded module : requiredModulesForBundle) {
				String moduleName = module.getModuleName();
				if (!service.contains(moduleName)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
