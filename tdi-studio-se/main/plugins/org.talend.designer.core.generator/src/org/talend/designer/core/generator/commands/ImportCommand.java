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
package org.talend.designer.core.generator.commands;

import static java.text.MessageFormat.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.equinox.app.IApplication;
import org.talend.commons.runtime.model.emf.provider.EmfResourcesFactoryReader;
import org.talend.commons.runtime.model.emf.provider.ResourceOption;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.model.general.Project;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.OptionDefinition;
import org.talend.repository.ui.actions.importproject.ImportProjectHelper;
import org.talend.repository.ui.views.link.ServerUtil;
import org.talend.repository.utils.ZipFileUtils;

/**
 * This command imports a project to the workspace.
 */
public final class ImportCommand implements CLICommand {

	/**
	 * The project option for the import command.
	 */
	private final OptionDefinition projectOption = new OptionDefinition("p", Optional.of("project"),
			"The name of the project where we should import the items. This may be an existing project or a new one.`.",
			true, Optional.of("name"));

	/**
	 * The file option for the import command.
	 */
	private final OptionDefinition fileOption = new OptionDefinition("f", Optional.of("file"),
			"The full path to a zip file containing the project to import, such as `C:/Users/Me/Downloads/OnBoardingDemoJob_0.2.zip`.",
			true, Optional.of("path"));
	/**
	 * The overwrite option for the import command.
	 */
	private final OptionDefinition overwriteOption = new OptionDefinition("o", Optional.of("overwrite"),
			"This flag indicates that the project items must be overwritten if they already exist. Ignored for new project.",
			false, Optional.empty());
	/**
	 * The migrate option for the import command.
	 */
	private final OptionDefinition migrateOption = new OptionDefinition("m", Optional.of("migrate"),
			"This flag indicates that the project items must be migrated during import. Ignored for new project.",
			false, Optional.empty());
	/**
	 * The command to import a project.
	 */
	private final CommandDefinition importCommand = new CommandDefinition("import",
			"Import a project to the workspace.", List.of(projectOption, fileOption, overwriteOption, migrateOption));

	@Override
	public CommandDefinition getDefinition() {
		return importCommand;
	}

	@Override
	public int execute(Map<OptionDefinition, Optional<String>> options) throws Exception {
		String projectName = options.get(projectOption).orElseThrow();
		String projectTechnicalName = Project.createTechnicalName(projectName);
		String zipPath = options.get(fileOption).orElseThrow();
		// find matching existing project
		var wsProjects = ProxyRepositoryFactory.getInstance().readProject();
		Optional<Project> matchingProject = Stream.of(wsProjects)
				.filter(p -> p.getTechnicalLabel().equals(projectTechnicalName)).findFirst();

		AtomicBoolean importOK = new AtomicBoolean(false);
		matchingProject.ifPresentOrElse(p -> {
			importOK.set(importInExistingProject(p, zipPath, options));
		}, () -> {
			// create new project
			importOK.set(importInNewProject(projectName, projectTechnicalName, zipPath));
		});

		// display result and return exit code
		if (importOK.get()) {
			System.out.println(format("`{0}` project import completed successfully.", projectName));
		}
		return importOK.get() ? IApplication.EXIT_OK : fail("Project import failed.");
	}

	/**
	 * Import zip archive in a new project.
	 * 
	 * @param projectName          the name of the new project
	 * @param projectTechnicalName the technical name of the new project
	 * @param zipPath              the path to the zip archive
	 * @return true if the import was successful, false otherwise
	 */
	private boolean importInNewProject(String projectName, String projectTechnicalName, String zipPath) {
		ensureRepositoryContextInitialized();
		List<Runnable> cleanupOperations = new ArrayList<>();
		ImportProjectHelper helper = new ImportProjectHelper();
		String sourcePath;
		try {
			String tempPath = helper.checkPackageIsCompressed(zipPath, cleanupOperations);
			tempPath = helper.items2Projects(tempPath, cleanupOperations);
			sourcePath = tempPath +".zip";
            ZipFileUtils.zip(tempPath, sourcePath, false);
		} catch (Exception e) {
			fail(format("Error occurred during project extraction from `{0}`.", zipPath), e);
			return false;
		}
		IProgressMonitor monitor = new CodeGenUtil.EclipseUtil.StreamProgressMonitor(System.out);
		final ResourceOption importOption = ResourceOption.ITEM_IMPORTATION;
		try {
			EmfResourcesFactoryReader.INSTANCE.addOption(importOption, false);
			helper.importProjectAs(null, projectName, projectTechnicalName, sourcePath, true, monitor);
			// take care of temp folder cleanup
			cleanupOperations.forEach(Runnable::run);
			return ResourceUtils.getProject(projectTechnicalName).exists();
		} catch (Exception e) {
			fail(format("Error occurred during `{0}` project import.", projectName), e);
			return false;
		} finally {
			EmfResourcesFactoryReader.INSTANCE.removOption(importOption, false);
		}
	}

	/**
	 * Import zip archive in an existing project.
	 * 
	 * @param project the existing project
	 * @param zipPath the path to the zip archive
	 * @param options the command line options
	 * @return true if the import was successful, false otherwise
	 */
	private boolean importInExistingProject(Project project, String zipPath,
			Map<OptionDefinition, Optional<String>> options) {
		// open the project
		ensureProjectExploitable(project);
		// import project items
		boolean overwrite = options.containsKey(overwriteOption);
		boolean doMigration = options.containsKey(migrateOption);
		// openThem argument is actually never used...
		try {
			IProgressMonitor monitor = new CodeGenUtil.EclipseUtil.StreamProgressMonitor(System.out);
			return ServerUtil.importItems(zipPath, monitor, overwrite, false, doMigration);
		} catch (IOException e) {
			fail(format("Error occurred during `{0}` project import.", project.getLabel()), e);
			return false;
		}
	}

}
