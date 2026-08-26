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

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.equinox.app.IApplication;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.relationship.RelationshipItemBuilder;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProjectRepositoryNode;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.OptionDefinition;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.ui.wizards.exportjob.JavaJobScriptsExportWSWizardPage.JobExportType;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.BuildJobManager;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JobScriptsManager.ExportChoice;
import org.talend.repository.utils.JobVersionUtils;

/**
 * This command builds a project's job to an output zip.
 */
public final class BuildCommand implements CLICommand {

	/**
	 * A user indication that option being taken in account depends on Maven
	 * profiles.
	 */
	private static final String PROFILES_NOTE = " Note this option may not be respected when the pom.xml file does not have the required profiles.";

	/**
	 * The output option for the build command.
	 */
	private final OptionDefinition outputOption = new OptionDefinition("o", Optional.of("output"),
			"The full path to the zip output file, such as `C:/Users/Me/Downloads/OnBoardingDemoJob_0.2.zip`. You may also use a folder name to generate the archive name automatically.",
			true, Optional.of("path"));

	/**
	 * The project option for the build command.
	 */
	private final OptionDefinition projectOption = new OptionDefinition("p", Optional.of("project"),
			"The name of the existing project to build.`.", true, Optional.of("name"));

	/**
	 * The job option for the build command.
	 */
	private final OptionDefinition jobOption = new OptionDefinition("j", Optional.of("jobName"),
			"The name of the job to build (without the version). E.g. `OnBoardingDemoJob`. When absent, all jobs in the project are built. You may also specify several jobs by separating them with a comma, e.g. `OnBoardingDemoJob,MyOtherJob`.",
			false, Optional.of("name"));

	/**
	 * The jobVersion option for the build command.
	 */
	private final OptionDefinition jobVersionOption = new OptionDefinition("v", Optional.of("jobVersion"),
			"The version of the job to build, when there is only a single job. Default is latest version when not specified or when there are several jobs.",
			false, Optional.of("version"));

	/**
	 * The context option for the build command.
	 */
	private final OptionDefinition contextOption = new OptionDefinition("c", Optional.of("context"),
			"The context name for the job to build. Default is `Default`.", false, Optional.of("contextName"));

	/**
	 * The executeTests option for the build command.
	 */
	private final OptionDefinition executeTestsOption = new OptionDefinition("t", Optional.of("executeTests"),
			"To execute test during the job build. Default is `false`." + PROFILES_NOTE, false, Optional.empty());

	/**
	 * The includeTestSource option for the build command.
	 */
	private final OptionDefinition includeTestSourceOption = new OptionDefinition("ts",
			Optional.of("includeTestSource"),
			"To include test source in the job build. Default is `false`." + PROFILES_NOTE, false, Optional.empty());

	/**
	 * The noNeedTalendLibraries option for the build command.
	 */
	private final OptionDefinition noNeedTalendLibrariesOption = new OptionDefinition("noNeedTalendLibraries",
			Optional.empty(),
			"To tell the job build does not need the talend libraries. Default is `false` (talend libraries needed)."
					+ PROFILES_NOTE,
			false, Optional.empty());

	/**
	 * The noNeedSourceCode option for the build command.
	 */
	private final OptionDefinition noNeedSourceCodeOption = new OptionDefinition("noNeedSourceCode", Optional.empty(),
			"To tell the job build does not need the source code. Default is `false` (source code needed)."
					+ PROFILES_NOTE,
			false, Optional.empty());

	/**
	 * The noNeedDependencies option for the build command.
	 */
	private final OptionDefinition noNeedDependenciesOption = new OptionDefinition("noNeedDependencies",
			Optional.empty(),
			"To tell the job build does not need the library dependencies. Default is `false` (dependencies needed)."
					+ PROFILES_NOTE,
			false, Optional.empty());

	/**
	 * The noBinaries option for the build command.
	 */
	private final OptionDefinition noBinariesOption = new OptionDefinition("noBinaries", Optional.empty(),
			"To tell the job build not to build binaries. Default is `false` (binaries built)." + PROFILES_NOTE, false,
			Optional.empty());

	/**
	 * The noIncludeLibs option for the build command.
	 */
	private final OptionDefinition noIncludeLibsOption = new OptionDefinition("noIncludeLibs", Optional.empty(),
			"To tell the job build not to include libraries. Default is `false` (libraries included)." + PROFILES_NOTE,
			false, Optional.empty());

	/**
	 * The command to build a project's job.
	 */
	private final CommandDefinition buildCommand = new CommandDefinition("build",
			"Build a project's job(s) to an output zip file.", //
			List.of(outputOption, projectOption, jobOption, //
					jobVersionOption, contextOption, //
					executeTestsOption, includeTestSourceOption, //
					noNeedTalendLibrariesOption, noNeedSourceCodeOption, noNeedDependenciesOption, //
					noBinariesOption, noIncludeLibsOption));

	@Override
	public CommandDefinition getDefinition() {
		return buildCommand;
	}

	@Override
	public int execute(Map<OptionDefinition, Optional<String>> options) throws Exception {
		String outputPath = options.get(outputOption).orElseThrow();
		String projectName = options.get(projectOption).orElseThrow();
		String projectTechnicalName = Project.createTechnicalName(projectName);
		// find matching existing project
		var wsProjects = ProxyRepositoryFactory.getInstance().readProject();
		Optional<Project> matchingProject = Stream.of(wsProjects)
				.filter(p -> p.getTechnicalLabel().equals(projectTechnicalName)).findFirst();

		AtomicReference<String> successfullZip = new AtomicReference<>();
		matchingProject.ifPresentOrElse(p -> {
			// open the project
			ensureProjectExploitable(p);

			// find the job nodes to build
			List<String> jobNamesList = options.getOrDefault(jobOption, Optional.empty()).map(optionValue -> {
				Stream<String> jobNames = Stream.of(optionValue.split(",")).map(String::trim);
				return jobNames.filter(s -> !s.isEmpty()).toList();
			}).orElseGet(Collections::emptyList);
			IRepositoryNode root = ProjectRepositoryNode.getInstance()
					.getRootRepositoryNode(ERepositoryObjectType.PROCESS);
			ProjectRepositoryNode.getInstance().initializeChildren(root);
			List<IRepositoryNode> jobNodes = getJobNodes(jobNamesList, root);
			if (jobNodes.isEmpty()) {
				fail(format("No job found in project `{0}` matching the specified job names: {1}.", projectName,
						jobNamesList.isEmpty() ? "<any>" : jobNamesList.toString()));
				return;
			}

			// determine the zip path
			String zipPath = getZipPath(outputPath, projectName, jobNodes);

			// build and export the project's jobs
			boolean exportOK = buildAndExportProject(p, zipPath, jobNodes, options);
			successfullZip.set(exportOK ? zipPath : null);
		}, () -> {
			// project does not exist
			fail(format("Project `{0}` does not exist in the workspace.", projectName));
		});

		// display result and return exit code
		if (successfullZip.get() != null) {
			System.out.println(
					format("`{0}` project build completed successfully. The resulting archive is located at `{1}`.",
							projectName, successfullZip.get()));
		}
		return successfullZip.get() != null ? IApplication.EXIT_OK : fail("Project build failed.");
	}

	/**
	 * Get the zip path for the build output. If the output path is a folder, the
	 * zip file name is generated automatically based on the only job name or on the
	 * project name.
	 * 
	 * @param outputPath  the output path specified by the user
	 * @param projectName the name of the project being built
	 * @param jobNodes    the list of job nodes being built
	 * @return the full path to the zip archive
	 */
	private String getZipPath(String outputPath, String projectName, List<IRepositoryNode> jobNodes) {
		if (outputPath.endsWith(".zip")) {
			return outputPath;
		} else if (jobNodes.size() == 1) {
			String jobName = jobNodes.get(0).getObject().getProperty().getDisplayName();
			String version = JobVersionUtils.getCurrentVersion(jobNodes.get(0));
			return "%1$s/%2$s_%3$s.zip".formatted(outputPath, jobName, version);
		} else {
			return "%1$s/%2$s_jobs.zip".formatted(outputPath, projectName);
		}
	}

	/**
	 * Get the job nodes to build inside a folder node (recursively).
	 * 
	 * @param jobNamesList    the list of job names to build. If empty, all jobs in
	 *                        the project are built.
	 * @param folderToInspect the folder repository node to inspect for job nodes.
	 * @return the list of job nodes to build
	 */
	private List<IRepositoryNode> getJobNodes(List<String> jobNamesList, IRepositoryNode folderToInspect) {
		Stream<IRepositoryNode> matchingJobNodes = folderToInspect.getChildren().stream().flatMap(node -> {
			if (node.getObject().getProperty().getItem() instanceof FolderItem) {
				// search recursively in the folder
				return getJobNodes(jobNamesList, node).stream();
			} else if (node.getObject().getProperty().getItem() instanceof ProcessItem) {
				// test the job name against our list
				String name = node.getObject().getProperty().getDisplayName();
				boolean matches = jobNamesList.isEmpty() || jobNamesList.contains(name);
				return matches ? Stream.of(node) : Stream.empty();
			} else {
				return Stream.empty();
			}
		});
		return matchingJobNodes.toList();
	}

	/**
	 * Build and export the project to a zip archive.
	 * 
	 * @param project  the existing project
	 * @param zipPath  the path to the zip archive
	 * @param jobNodes the list of job nodes to build
	 * @param options  the command line options
	 * @return true if the export was successful, false otherwise
	 */
	private boolean buildAndExportProject(Project project, String zipPath, List<IRepositoryNode> jobNodes,
			Map<OptionDefinition, Optional<String>> options) {
		try {
			IProgressMonitor monitor = new CodeGenUtil.EclipseUtil.StreamProgressMonitor(System.out);
			// get command line options
			String jobVersion = options.getOrDefault(jobVersionOption, Optional.empty())
					.orElse(RelationshipItemBuilder.LATEST_VERSION);
			String context = options.getOrDefault(contextOption, Optional.empty()).orElse("Default");
			boolean executeTests = options.containsKey(executeTestsOption);
			boolean includeTestSource = options.containsKey(includeTestSourceOption);
			boolean needTalendLibraries = !options.containsKey(noNeedTalendLibrariesOption);
			boolean needSourceCode = !options.containsKey(noNeedSourceCodeOption);
			boolean needDependencies = !options.containsKey(noNeedDependenciesOption);
			boolean binaries = !options.containsKey(noBinariesOption);
			boolean includeLibs = !options.containsKey(noIncludeLibsOption);

			// make choice map
			Map<ExportChoice, Object> exportChoiceMap = new EnumMap<ExportChoice, Object>(ExportChoice.class);
			exportChoiceMap.put(ExportChoice.needLauncher, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needTalendLibraries, needTalendLibraries);
			exportChoiceMap.put(ExportChoice.launcherName, "All");
			exportChoiceMap.put(ExportChoice.needSystemRoutine, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needUserRoutine, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needJobItem, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needSourceCode, needSourceCode);
			exportChoiceMap.put(ExportChoice.needDependencies, needDependencies);
			exportChoiceMap.put(ExportChoice.needJobScript, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needContext, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.contextName, context);
			exportChoiceMap.put(ExportChoice.needWebhook, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.applyToChildren, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.needParameterValues, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.binaries, binaries);
			exportChoiceMap.put(ExportChoice.executeTests, executeTests);
			exportChoiceMap.put(ExportChoice.includeTestSource, includeTestSource);
			exportChoiceMap.put(ExportChoice.includeLibs, includeLibs);
			exportChoiceMap.put(ExportChoice.needLog4jLevel, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.log4jLevel, null);

			// and launch the build job
			JobExportType jobExportType = JobExportType.POJO;
			return BuildJobManager.getInstance().buildJobs(zipPath, jobNodes, null, jobVersion, context.toString(),
					exportChoiceMap, jobExportType, monitor);
		} catch (Exception e) {
			fail(format("Error occurred during `{0}` project import.", project.getLabel()), e);
			return false;
		}
	}

}
