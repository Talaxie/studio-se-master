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

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.commons.utils.system.EclipseCommandLine;
import org.talend.core.CLIAnswersBridgeService;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ILibraryManagerUserService;
import org.talend.core.model.general.ILibrariesService;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.general.ModuleToInstall;
import org.talend.core.runtime.maven.MavenConstants;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.librariesmanager.model.ModulesNeededProvider;
import org.talend.librariesmanager.prefs.LicenseAcceptancePrefs;
import org.talend.librariesmanager.utils.RemoteModulesHelper;
import org.talend.librariesmanager.utils.nexus.ArtifactDownloadManager;

/**
 * This services manages libraries installation with CLI configuration, without
 * graphical UI.
 */
public class LibraryManagerCLIService extends AbstractLibraryManagerUserService implements ILibraryManagerUserService {

	/**
	 * Indicates whether all licenses should be accepted. If true, the service will
	 * not prompt for license acceptance.
	 */
	private boolean acceptAllLicenses = false;
	/**
	 * Optional folder where to eventually look for libraries to install.
	 */
	private Optional<File> libsFolder = Optional.empty();

	@Override
	public void acceptConfiguration(boolean acceptAllLicenses, Optional<File> libsFolder) {
		this.acceptAllLicenses = acceptAllLicenses;
		this.libsFolder = libsFolder;
	}

	@Override
	public void installModules(String[] jarNames) {
		if (ArrayUtils.contains(Platform.getApplicationArgs(),
				EclipseCommandLine.TALEND_DISABLE_EXTERNAL_MODULE_INSTALL_DIALOG_COMMAND)) {
			CommonExceptionHandler.warn("missing jars: " + ArrayUtils.toString(jarNames)); //$NON-NLS-1$
			return;
		}
		List<ModuleNeeded> requiredModules = Stream.of(jarNames)
				.map(jarName -> new ModuleNeeded(null, jarName, null, true)).toList();
		installModules(requiredModules);
	}

	@Override
	public void installModules(Collection<ModuleNeeded> requiredModules) {
		if (ArrayUtils.contains(Platform.getApplicationArgs(),
				EclipseCommandLine.TALEND_DISABLE_EXTERNAL_MODULE_INSTALL_DIALOG_COMMAND)) {
			CommonExceptionHandler.warn("missing jars: " + ArrayUtils.toString(requiredModules)); //$NON-NLS-1$
			return;
		}
		List<ModuleNeeded> required = new ArrayList<>(requiredModules);
		List<ModuleToInstall> toInstallList = new ArrayList<ModuleToInstall>();
		Set<String> modulesNeededNames = ModulesNeededProvider.getAllManagedModuleNames();
		ICoreRunnable notInstalledModulesRunnable = RemoteModulesHelper.getInstance()
				.getNotInstalledModulesRunnable(required, toInstallList, true, true, false);
		try {
			notInstalledModulesRunnable.run(new NullProgressMonitor());
			// now the toInstallList is populated with modules that are not installed
			toInstallList.forEach(moduleToInstall -> {
				if (!MavenConstants.DOWNLOAD_MANUAL.equals(moduleToInstall.getDistribution())) {
					// module can be installed automatically
					boolean isLicenseAccepted = checkLicenseAcceptance(moduleToInstall);
					if (isLicenseAccepted) {
						// like DownloadModuleRunnable.downLoad(IProgressMonitor), but simpler
						ArtifactDownloadManager downloadManager = new ArtifactDownloadManager(List.of(moduleToInstall),
								new NullProgressMonitor());
						downloadManager.start();
					}
				} else if (GlobalServiceRegister.getDefault().isServiceRegistered(ILibrariesService.class)
						&& libsFolder.isPresent()) {
					ILibrariesService libService = GlobalServiceRegister.getDefault()
							.getService(ILibrariesService.class);
					// look in folder for matching jar file
					List<File> allAvailableJars = FilesUtils.getFiles(libsFolder.get(), ".jar", null, null, true);
					String moduleName = moduleToInstall.getName();
					Optional<File> matchingJar = allAvailableJars.stream()
							.filter(file -> file.getName().equals(moduleName)).findFirst();
					Optional<File> file = matchingJar.or(() -> promptForValidJar(moduleToInstall, allAvailableJars));
					if (file.isPresent()) {
						try {
							String mvnUri = moduleToInstall.getMavenUri();
							libService.deployLibrary(file.get().toURI().toURL(), mvnUri, false);
							if (!modulesNeededNames.contains(moduleName)) {
								String mavenUri = MavenUrlHelper.generateMvnUrlForJarName(moduleName, true, true);
								ModulesNeededProvider.addUnknownModules(moduleName, mavenUri, true);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}
			});
		} catch (CoreException e) {
			ExceptionHandler.process(e);
		}
	}

	/**
	 * Prompt the user to choose a valid jar file from the given list of available
	 * jars.
	 * 
	 * @param moduleToInstall  the module for which a jar file is needed.
	 * @param allAvailableJars the list of available jar files in the folder to
	 *                         choose from.
	 * @return the chosen jar file, or empty if the user cancels or does not choose
	 *         a valid file.
	 */
	private Optional<File> promptForValidJar(ModuleToInstall moduleToInstall, List<File> allAvailableJars) {
		// choose the jar by asking the user
		/*
		 * Make the files list to choose from, in the format:
		 * 
		 * (1) file1.jar
		 * 
		 * (2) file2.jar
		 */
		String filesList = allAvailableJars.stream()
				.map(jar -> " ('%s %s') %s".formatted(CLIAnswersBridgeService.SERVICE_COMMAND_NAME,
						allAvailableJars.indexOf(jar) + 1, jar.getName()))
				.collect(Collectors.joining("\n"));
		String prompt = MessageFormat.format(
				"There was no jar file named ''{0}'' in the libraries folder. Type ''{2}'', then the number of the file you want to take:\n (''{2} 0'') Cancel.\n{1}\n",
				moduleToInstall.getName(), filesList, CLIAnswersBridgeService.SERVICE_COMMAND_NAME);
		return CLIAnswersBridgeService.getInstance().promptUser(prompt, answer -> {
			Optional<Integer> answeredInt = Optional.ofNullable(answer).map(String::trim).filter(s -> s.matches("\\d+"))
					.map(Integer::valueOf);
			Optional<File> answeredJar = answeredInt.map(i -> i - 1).filter(i -> i >= 0 && i < allAvailableJars.size())
					.map(allAvailableJars::get);
			return answeredJar;
		}, () -> "You did not choose a valid file. The library will not be installed.\n");
	}

	/**
	 * Check if the license for the given module is accepted, prompting if
	 * necessary.
	 *
	 * @param moduleToInstall The module to check.
	 * @return true if the license is accepted, false otherwise.
	 */
	private boolean checkLicenseAcceptance(ModuleToInstall moduleToInstall) {
		String licenseType = moduleToInstall.getLicenseType();
		boolean isAlreadyAccepted = acceptAllLicenses || moduleToInstall.isFromCustomNexus()
				|| LicenseAcceptancePrefs.isLicenseAccepted(licenseType);
		if (!isAlreadyAccepted) {
			// prompt for license acceptance with CLI interaction
			String prompt = MessageFormat.format(
					"The library ''{0}'' requires acceptance of the license ''{1}''.\nLicense URL: {2}\nDo you accept the license?\nType ''{3} Y'':Yes / ''{3} N'':No.",
					moduleToInstall.getName(), licenseType, moduleToInstall.getLicenseUrl(),
					CLIAnswersBridgeService.SERVICE_COMMAND_NAME);
			boolean accepted = CLIAnswersBridgeService.getInstance().promptUser(prompt, answer -> {
				String fixedAnswer = answer.trim().toUpperCase();
				return fixedAnswer.length() > 0 && fixedAnswer.charAt(0) == 'Y' ? Optional.of(true) : Optional.empty();
			}, () -> "You did not accept the license. The library will not be downloaded nor installed.\n").isPresent();
			if (accepted) {
				LicenseAcceptancePrefs.setLicenseAccepted(licenseType, true);
				isAlreadyAccepted = true;
			} else {
				LicenseAcceptancePrefs.setLicenseAccepted(licenseType, false);
			}
		}
		return isAlreadyAccepted;
	}

}
