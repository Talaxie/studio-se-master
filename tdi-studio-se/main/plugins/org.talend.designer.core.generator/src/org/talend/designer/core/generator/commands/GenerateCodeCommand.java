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

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.talend.core.model.general.Project;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.util.URIHelper;
import org.talend.designer.core.generator.CodeGenerator;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.OptionDefinition;

/**
 * This command imports a project to the workspace.
 */
public final class GenerateCodeCommand implements CLICommand {

	/**
	 * The project option for the generate command.
	 */
	private final OptionDefinition projectOption = new OptionDefinition("p", Optional.of("project"),
			"The name of the existing project to look into.`.", true, Optional.of("name"));

	/**
	 * The process option for the generate command.
	 */
	private final OptionDefinition processOption = new OptionDefinition("process", Optional.empty(),
			"The functional path to the process without the `process/` prefix, e.g. `myFolder/myJob`.", true,
			Optional.of("process path"));
	/**
	 * The command to generate code for a process.
	 */
	private final CommandDefinition generateCommand = new CommandDefinition("generate", "Generates code for a process.",
			List.of(projectOption, processOption));

	@Override
	public CommandDefinition getDefinition() {
		return generateCommand;
	}

	@Override
	public int execute(Map<OptionDefinition, Optional<String>> options) throws Exception {
		// check workspace location is an existing workspace
		var wsProjects = ProxyRepositoryFactory.getInstance().readProject();
		if (wsProjects.length == 0) {
			return fail("The workspace provided does not contain any Talaxie project: "
					+ Platform.getInstanceLocation().getURL().getPath());
		}
		// check process path argument points to an existing process item
		String projectName = options.get(projectOption).orElseThrow();
		String processPath = options.get(processOption).orElseThrow();

		List<String> segments = Arrays.asList(processPath.split("/"));
		if (segments.isEmpty()) {
			return fail(format("The process path {0} is invalid. It should be of the form <folder(s)>/<processName>",
					processPath));
		}

		AtomicReference<IRepositoryViewObject> processItemRef = new AtomicReference<>();
		executeWithOpenedProject(projectName, p -> {
			Optional<IRepositoryViewObject> item = findItem(p, ERepositoryObjectType.PROCESS, segments);
			item.ifPresent(processItemRef::set);
		});
		if (processItemRef.get() == null) {
			return fail(format("Could not find process {0} in project {1}", processPath, projectName));
		}

		Supplier<IProcess> processSupplier = () -> {
			var property = Optional.ofNullable(processItemRef.get()).map(IRepositoryViewObject::getProperty);
			var processItem = property.map(Property::getItem).filter(ProcessItem.class::isInstance)
					.map(ProcessItem.class::cast);
			// handle error case which do not point to a valid process item
			if (!processItem.isPresent()) {
				fail(format(
						"The properties file does not point to a ProcessItem. The {0} process is probably corrupted.",
						processPath));
			}
			return processItem.map(CorePlugin.getDefault().getDesignerCoreService()::getProcessFromProcessItem)
					.orElse(null);
		};
		var generator = new CodeGenerator(processSupplier);
		generator.schedule();
		generator.join();
		// make sure the generated resources are not lost on exit, whatever the outcome
		ResourcesPlugin.getWorkspace().save(true, new NullProgressMonitor());
		// inform the user of the resulting outcome
		IStatus result = generator.getResult();
		if (result.isOK()) {
			log("Code generation completed successfully: " + result.getMessage());
		} else {
			if (result.getException() != null) {
				result.getException().printStackTrace();
			}
			return fail("Code generation failed: " + result.getMessage());
		}
		return IApplication.EXIT_OK;
	}

	/**
	 * Ensure project can be exploited and that all required services are correctly
	 * initialized.
	 * 
	 * <ul>
	 * <li>{@link Context#REPOSITORY_CONTEXT_KEY} is associated to a repository
	 * context</li>
	 * <li>This context contains a user</li>
	 * <li>This context contains the project (avoids NPE in project-based preference
	 * lookups during Process initialization).</li>
	 * <li>Execute login tasks created using the extension point
	 * <code>org.talend.core.repository.login.task</code></li>
	 * </ul>
	 * 
	 * @param processItem the process item to find the project for
	 * @param wsProjects  workspace projects to find the project of the process item
	 */
	private void ensureProjectExploitable(ProcessItem processItem, Project[] wsProjects) {
		IFile itemFile = URIHelper.getFile(URIHelper.convert(processItem.eResource().getURI()));
		Stream.of(wsProjects).filter(p -> p.getTechnicalLabel().equals(itemFile.getProject().getName())).findFirst()
				.ifPresentOrElse(this::ensureProjectExploitable, () -> {
					fail("The project of the process item cannot be found in the workspace projects: "
							+ itemFile.getProject().getName());
				});
	}

}
