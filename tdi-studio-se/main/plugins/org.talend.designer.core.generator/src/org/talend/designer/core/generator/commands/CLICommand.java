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

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.equinox.app.IApplication;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.time.TimeMeasurePerformance;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ICoreService;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.general.Project;
import org.talend.core.repository.i18n.Messages;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.utils.LoginTaskRegistryReader;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.designer.core.generator.CodeGeneratorApplication;
import org.talend.designer.core.generator.cli.CommandDefinition;
import org.talend.designer.core.generator.cli.HelpBuilder;
import org.talend.designer.core.generator.cli.OptionDefinition;
import org.talend.login.ILoginTask;
import org.talend.repository.RepositoryWorkUnit;
import org.talend.repository.ui.login.LoginHelper;

/**
 * An executable command that can be executed by the CLI
 * {@link CodeGeneratorApplication}.
 */
public sealed interface CLICommand permits ImportCommand, GenerateCodeCommand, BuildCommand {

	/**
	 * Get the CLI definition of the command.
	 * 
	 * @return the command definition
	 */
	public CommandDefinition getDefinition();

	/**
	 * Execute the command.
	 * 
	 * @param options the options for the command
	 * @return the exit code for application
	 * @throws Exception exception during command execution
	 */
	public int execute(Map<OptionDefinition, Optional<String>> options) throws Exception;

	/**
	 * Fails the application with an error message and usage reminder.
	 * 
	 * @param message the error message to print
	 * @param e       the exception to print stack trace for
	 * @return the exit code for application
	 */
	default Integer fail(String message, Exception e) {
		System.err.println(message);
		printCommandUsage();
		Optional.ofNullable(e).ifPresent(Exception::printStackTrace);
		return IApplication.EXIT_OK;
	}

	/**
	 * Fails the application with an error message and usage reminder.
	 * 
	 * @param message the error message to print
	 * @return the exit code for application
	 */
	default Integer fail(String message) {
		return fail(message, null);
	}

	/**
	 * Prints usage instructions for this command.
	 */
	private void printCommandUsage() {
		String help = HelpBuilder.buildHelpMessage(getDefinition());
		System.out.println(help);
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
	 * @param wsProject an existing workspace project
	 */
	default void ensureProjectExploitable(Project wsProject) {
		var repoCtx = ensureRepositoryContextInitialized();
		// set the appropriate project
		if (repoCtx.getProject() == null || !repoCtx.getProject().equals(wsProject)) {
			// repoCtx::setProject is not enough, we must also log on the project to
			// initialize all services
			repoCtx.setProject(wsProject);
			// we won't actually open a dialog as headless mode is active
			try {
				ProxyRepositoryFactory.getInstance().logOnProject(wsProject, new NullProgressMonitor());
			} catch (LoginException | PersistenceException e) {
				fail("Failed to log on the project: " + wsProject.getLabel(), e);
			}
		}
		/*
		 * Handle login tasks
		 */
		LoginTaskRegistryReader loginTaskRegistryReader = new LoginTaskRegistryReader();
		ILoginTask[] allLoginTasks = loginTaskRegistryReader.getAllTaskListInstance();
		IProgressMonitor monitor = new CodeGenUtil.EclipseUtil.StreamProgressMonitor(System.out);
		SubMonitor subMonitor = SubMonitor.convert(monitor, allLoginTasks.length + 1);
		ProxyRepositoryFactory.getInstance()
				.executeRepositoryWorkUnit(new RepositoryWorkUnit<Void>("Applying login tasks") {

					@Override
					protected void run() throws LoginException, PersistenceException {
						for (ILoginTask toBeRun : allLoginTasks) {
							try {
								toBeRun.execute(subMonitor.newChild(1, SubMonitor.SUPPRESS_NONE));
							} catch (Exception e) {
								// log but do not propagate
								fail("Error while executing a login task.", e);
							}
						}
					}
				});
		/*
		 * Login tasks may have changed the Maven settings. Reinstall components in the
		 * correct repository.
		 */
		ICoreService coreService = GlobalServiceRegister.getDefault().getService(ICoreService.class);
		if (coreService != null) {
			SubMonitor subMonitor2 = SubMonitor.convert(monitor, 3);
			subMonitor2.beginTask(Messages.getString("ProxyRepositoryFactory.installComponents"), 1);
			coreService.installComponents(subMonitor2);
			TimeMeasurePerformance.step("logOnProject", "Install components");
		}
	}

	/**
	 * 
	 * Ensure required services are correctly initialized.
	 * 
	 * <ul>
	 * <li>{@link Context#REPOSITORY_CONTEXT_KEY} is associated to a repository
	 * context</li>
	 * <li>This context contains a user</li>
	 * </ul>
	 * 
	 * @return the repository context, initialized if it was not already
	 */
	default RepositoryContext ensureRepositoryContextInitialized() {
		var ctx = CoreRuntimePlugin.getInstance().getContext();
		// initialize repository context
		var repoCtx = Optional.ofNullable(ctx.getProperty(Context.REPOSITORY_CONTEXT_KEY))
				.map(RepositoryContext.class::cast).orElseGet(() -> {
					var res = new RepositoryContext();
					ctx.putProperty(Context.REPOSITORY_CONTEXT_KEY, res);
					return res;
				});
		// set user
		if (repoCtx.getUser() == null) {
			repoCtx.setUser(LoginHelper.getUser(LoginHelper.createDefaultLocalConnection()));
		}
		// set fields
		if (repoCtx.getFields() == null) {
			repoCtx.setFields(new HashMap<String, String>());
		}
		return repoCtx;
	}

}
