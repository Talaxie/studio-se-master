package org.talend.designer.core.generator;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.time.TimeMeasurePerformance;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ICoreService;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.general.Project;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.repository.i18n.Messages;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.RepositoryFactoryProvider;
import org.talend.core.repository.utils.LoginTaskRegistryReader;
import org.talend.core.repository.utils.TalendResourceSet;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.util.URIHelper;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.designer.codegen.CodeGeneratorActivator;
import org.talend.designer.runprocess.RunProcessPlugin;
import org.talend.login.ILoginTask;
import org.talend.repository.RepositoryWorkUnit;
import org.talend.repository.ui.login.LoginHelper;

/**
 * Generates code for the process which URI is provided as argument.
 */
public class CodeGeneratorApplication implements IApplication {

	/**
	 * Fails the application with an error message and usage reminder.
	 * 
	 * @param message the error message to print
	 * @param e       the exception to print stack trace for
	 * @return the exit code for application
	 */
	private Integer fail(String message, Exception e) {
		System.err.println(message);
		printUsage();
		Optional.ofNullable(e).ifPresent(Exception::printStackTrace);
		return IApplication.EXIT_OK;
	}

	/**
	 * Fails the application with an error message and usage reminder.
	 * 
	 * @param message the error message to print
	 * @return the exit code for application
	 */
	private Integer fail(String message) {
		return fail(message, null);
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		// get the process URI from the application arguments
		CommonsPlugin.setHeadless(true);
		String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		if (args == null || args.length == 0) {
			return fail("No process path provided as argument.");
		}

		preStartup();
		// check workspace location is an existing workspace
		var wsProjects = ProxyRepositoryFactory.getInstance().readProject();
		if (wsProjects.length == 0) {
			return fail("The workspace provided does not contain any Talaxie project: "
					+ Platform.getInstanceLocation().getURL().getPath());
		}

		// check process path argument points to an existing file in workspace
		var path = args[0];
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
	 * Prints usage instructions for this application.
	 */
	private void printUsage() {
		String suffix = Platform.getOS().equals(Platform.OS_WIN32) ? "c.exe" : "";
		System.out.println(MessageFormat.format("Usage: TOS_CLI_GEN{0} -data <workspace path> <process path>\n"
				+ "or alternatively: TOS_DI{0} -product org.talaxie.cli.branding.generator.product -data <workspace path> <process path>\n"
				+ "You should provide:\n"
				+ " - the <workspace path> to an existing Talaxie workspace, such as `C:/TOS_DI-X.Y.Z/workspace`\n"
				+ " - the <process path> to a properties file in workspace, such as `MY_PROJECT/process/myJob_0.1.properties`",
				suffix));
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
		// set the appropriate project
		if (repoCtx.getProject() == null) {
			IFile itemFile = URIHelper.getFile(URIHelper.convert(processItem.eResource().getURI()));
			// repoCtx::setProject is not enough, we must also log on the project to
			// initialize all services
			Consumer<Project> setTheProject = p -> {
				repoCtx.setProject(p);
				// we won't actually open a dialog as headless mode is active
				try {
					ProxyRepositoryFactory.getInstance().logOnProject(p, new NullProgressMonitor());
				} catch (LoginException | PersistenceException e) {
					fail("Failed to log on the project of the process item: " + p.getLabel());
					e.printStackTrace();
				}
			};
			Stream.of(wsProjects).filter(p -> p.getTechnicalLabel().equals(itemFile.getProject().getName())).findFirst()
					.ifPresentOrElse(setTheProject, () -> {
						fail("The project of the process item cannot be found in the workspace projects: "
								+ itemFile.getProject().getName());
					});
			;
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