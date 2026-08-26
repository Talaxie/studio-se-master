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
package org.talend.designer.core.generator;

import java.util.List;
import java.util.Optional;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.RepositoryFactoryProvider;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.designer.codegen.CodeGeneratorActivator;
import org.talend.designer.core.generator.cli.CLIDefinition;
import org.talend.designer.core.generator.cli.CLIDefinition.Parsed;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.HelpBuilder;
import org.talend.designer.core.generator.cli.OptionDefinition;
import org.talend.designer.core.generator.commands.BuildCommand;
import org.talend.designer.core.generator.commands.CLICommand;
import org.talend.designer.core.generator.commands.GenerateCodeCommand;
import org.talend.designer.core.generator.commands.ImportCommand;
import org.talend.designer.runprocess.RunProcessPlugin;
import org.talend.repository.ui.login.LoginHelper;

/**
 * Generates code for the process which URI is provided as argument.
 */
public class CodeGeneratorApplication implements IApplication {

	/**
	 * The help option for the CLI, which prints usage instructions.
	 */
	private final OptionDefinition helpOption = new OptionDefinition("h", Optional.of("help"),
			"Prints this help message.", false, Optional.empty());

	/** CLI commands to support */
	private List<CLICommand> supportedCommands = List.of(new ImportCommand(), new GenerateCodeCommand(),
			new BuildCommand());
	/**
	 * The CLI definition for this application, including global options and
	 * commands.
	 */
	private final CLIDefinition cliDefinition = new CLIDefinition(
			// global options
			List.of(helpOption),
			// commands
			supportedCommands.stream().map(CLICommand::getDefinition).toList());

	/**
	 * Fails the application with an error message and usage reminder.
	 * 
	 * @param message the error message to print
	 * @param e       the exception to print stack trace for
	 * @return the exit code for application
	 */
	private Integer fail(String message, Exception e) {
		System.err.println(message);
		printGlobalUsage();
		Optional.ofNullable(e).ifPresent(Exception::printStackTrace);
		return IApplication.EXIT_OK;
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		// parse application arguments
		CommonsPlugin.setHeadless(true);
		String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		Parsed parsed;
		try {
			parsed = cliDefinition.parseArguments(args);
		} catch (IllegalArgumentException e) {
			return fail("Invalid arguments: " + e.getMessage(), e);
		}

		// print usage if needed
		if (parsed.parsedGlobalOptions().containsKey(helpOption)) {
			printGlobalUsage();
		}

		preStartup();

		// run commands sequentially, in the recommended order
		for (CLICommand command : supportedCommands) {
			CommandDefinition definition = command.getDefinition();
			if (parsed.parsedCommandsWithOptions().containsKey(definition)) {
				int code = command.execute(parsed.parsedCommandsWithOptions().get(definition));
				if (code != IApplication.EXIT_OK) {
					return code;
				}
			}
		}
		return IApplication.EXIT_OK;
	}

	/**
	 * Prints usage instructions for this application.
	 */
	private void printGlobalUsage() {
		String help = HelpBuilder.buildHelpMessage(cliDefinition, "TOS_CLI_GEN", "TOS_DI",
				"org.talaxie.cli.branding.generator.product");
		System.out.println(help);
	}

	/**
	 * Ensure first initialization tasks before startup.
	 * <ul>
	 * <li>Plugin activation.</li>
	 * <li>In headless CLI, proxy factory may not be initialized by login
	 * workflow.</li>
	 * </ul>
	 */
	private void preStartup() {
		/*
		 * Make sure RunProcessPlugin & CodeGeneratorActivator plugins are registered as
		 * in org.talend.rcp.intro.ApplicationWorkbenchAdvisor.preStartup()
		 */
		RunProcessPlugin.getDefault();
		CodeGeneratorActivator.getDefault();
		/*
		 * There is no ICloudSignOnService implementation in Talaxie. So we do not need
		 * to worry about cloud connection and login, and can directly proceed with
		 * local workspace (default local connection).
		 */
		var connBean = LoginHelper.createDefaultLocalConnection();
		var proxyRepositoryFactory = ProxyRepositoryFactory.getInstance();
		if (proxyRepositoryFactory.getRepositoryFactoryFromProvider() == null) {
			// need a branding service to get the repository factory provider
			GlobalServiceRegister.getDefault().getService(IBrandingService.class);
			// set repository factory provider with the default local connection
			proxyRepositoryFactory.setRepositoryFactoryFromProvider(
					RepositoryFactoryProvider.getRepositoriyById(connBean.getRepositoryId()));
			try {
				proxyRepositoryFactory.initialize();
			} catch (PersistenceException e) {
				// log but do not propagate
				fail("Failed to initialize repository factory.", e);
			}
		}
	}

	@Override
	public void stop() {
		// do nothing.
	}

}