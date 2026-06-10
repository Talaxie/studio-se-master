package org.talend.designer.core.generator;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.general.Project;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.RepositoryFactoryProvider;
import org.talend.core.repository.utils.TalendResourceSet;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.util.URIHelper;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.repository.ui.login.LoginHelper;

/**
 * Generates code for the process which URI is provided as argument.
 */
public class CodeGeneratorApplication implements IApplication {

	/**
	 * Fails the application with an error message and usage reminder.
	 * 
	 * @param message the error message to print
	 */
	private Integer fail(String message) {
		System.err.println(message);
		printUsage();
		return IApplication.EXIT_OK;
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		// get the process URI from the application arguments
		String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		if (args == null || args.length == 0) {
			return fail("No process path provided as argument.");
		}

		ensureRepositoryFactoryProvider();
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
				fail(
						"The process path provided as argument does not point to a valid properties file: "
								+ uri.toFileString());
			} else if (!processItem.isPresent()) {
				fail(
						"The process path provided as argument points to a properties file which property does not point to a ProcessItem: "
								+ uri.toFileString());
			}

			// In headless CLI, ensure repository context and provider are initialized before Process creation.
			processItem.ifPresent(item -> {
				ensureRepositoryContextProject(item, wsProjects);
			});

			return processItem.map(CorePlugin.getDefault().getDesignerCoreService()::getProcessFromProcessItem)
					.orElse(null);
		};
		var generator = new CodeGenerator(processSupplier);
		generator.schedule();
		generator.join();
		return IApplication.EXIT_OK;
	}

	/**
	 * Prints usage instructions for this application.
	 */
	private void printUsage() {
		System.out.println("Usage: TOS_CLI_GEN.exe -data <workspace path> <process path>\n"
				+ "or alternatively: TOS_DI.exe -product org.talaxie.cli.branding.generator.product -data <workspace path> <process path>\n"
				+ "You should provide:\n"
				+ " - the <workspace path> to an existing Talaxie workspace, such as `C:/TOS_DI-X.Y.Z/workspace`\n"
				+ " - the <process path> to a properties file in workspace, such as `MY_PROJECT/process/myJob_0.1.properties`");
	}

	/**
	 * Ensure Context.REPOSITORY_CONTEXT_KEY contains a project to avoid NPE in
	 * project-based preference lookups during Process initialization.
	 * 
	 * @param wsProjects workspace projects to find the project of the process item
	 */
	private void ensureRepositoryContextProject(ProcessItem processItem, Project[] wsProjects) {
		var ctx = CoreRuntimePlugin.getInstance().getContext();
		var repoCtx = Optional.ofNullable(ctx.getProperty(Context.REPOSITORY_CONTEXT_KEY))
				.map(RepositoryContext.class::cast).orElseGet(() -> {
					var res = new RepositoryContext();
					ctx.putProperty(Context.REPOSITORY_CONTEXT_KEY, res);
					return res;
				});
		if (repoCtx.getUser() == null) {
			repoCtx.setUser(LoginHelper.getUser(LoginHelper.createDefaultLocalConnection()));
		}
		if (repoCtx.getProject() == null) {
			IFile itemFile = URIHelper.getFile(URIHelper.convert(processItem.eResource().getURI()));
			Stream.of(wsProjects).filter(p -> p.getTechnicalLabel().equals(itemFile.getProject().getName())).findFirst()
					.ifPresentOrElse(repoCtx::setProject, () -> {
						fail("The project of the process item cannot be found in the workspace projects: "
								+ itemFile.getProject().getName());
					});
			;
		}
	}

	/**
	 * In headless CLI, proxy factory may not be initialized by login workflow.
	 */
	private void ensureRepositoryFactoryProvider() {
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
		}
	}

	@Override
	public void stop() {
		// do nothing.
	}

}