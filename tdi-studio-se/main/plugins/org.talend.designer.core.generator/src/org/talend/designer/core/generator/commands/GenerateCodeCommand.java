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

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.equinox.app.IApplication;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.talend.core.model.general.Project;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.utils.TalendResourceSet;
import org.talend.core.runtime.util.URIHelper;
import org.talend.designer.core.generator.CodeGenerator;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.OptionDefinition;

/**
 * This command imports a project to the workspace.
 */
public final class GenerateCodeCommand implements CLICommand {

	/**
	 * The process option for the generate command.
	 */
	private final OptionDefinition processOption = new OptionDefinition("process", Optional.empty(),
			"The path to a properties file in workspace, such as `MY_PROJECT/process/myJob_0.1.properties`.", true,
			Optional.of("process path"));
	/**
	 * The command to generate code for a process.
	 */
	private final CommandDefinition generateCommand = new CommandDefinition("generate", "Generates code for a process.",
			List.of(processOption));

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
		// check process path argument points to an existing file in workspace
		var path = options.get(processOption).orElseThrow();
		URI uri = URI.createPlatformResourceURI(path, true);
		var rset = new TalendResourceSet();
		if (!rset.getURIConverter().exists(uri, null)) {
			return fail("The process path provided as argument does not point an existing file: " + path);
		}
		Supplier<IProcess> processSupplier = () -> {
			var resource = rset.getResource(uri, true);
			var property = resource.getContents().stream().filter(Property.class::isInstance).map(Property.class::cast)
					.findFirst();
			var processItem = property.map(Property::getItem).filter(ProcessItem.class::isInstance)
					.map(ProcessItem.class::cast);
			// handle error cases which do not point to a valid process item
			if (!property.isPresent()) {
				fail("The process path provided as argument does not point to a valid properties file: "
						+ uri.toFileString());
			} else if (!processItem.isPresent()) {
				fail("The process path provided as argument points to a properties file which property does not point to a ProcessItem: "
						+ uri.toFileString());
			}

			// In headless CLI, ensure repository context and provider are initialized
			// before Process creation.
			processItem.ifPresent(item -> {
				ensureProjectExploitable(item, wsProjects);
			});

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
			System.out.println("Code generation completed successfully: " + result.getMessage());
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
