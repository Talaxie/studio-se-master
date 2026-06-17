package org.talend.designer.core.generator;

import java.io.File;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ICoreService;
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
import org.talend.designer.codegen.ICodeGeneratorService;
import org.talend.designer.maven.tools.AggregatorPomsHelper;
import org.talend.repository.ProjectManager;
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
		// run without a Workbench, so services take their non-UI code paths
		CommonsPlugin.setHeadless(true);
		// non-interactive poms handling, as for a CI build
		System.setProperty("ci.mode", "true");
		// generation needs only the source; component runtime jars are resolved by the downstream build
		System.setProperty("skip_missing_jars", "true");
		// get the process URI from the application arguments
		String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		if (args == null || args.length == 0) {
			return fail("No process path provided as argument.");
		}

		ensureRepositoryFactoryProvider();
		// register project folders found in the workspace dir (a fresh checkout is not yet imported)
		importWorkspaceProjects();
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

		// load the ProcessItem before the poms/generation steps, which rely on the current project
		var resource = rset.getResource(uri, true);
		var property = resource.getContents().stream().filter(Property.class::isInstance).map(Property.class::cast)
				.findFirst();
		if (!property.isPresent()) {
			return fail("The process path provided as argument does not point to a valid properties file: "
					+ uri.toFileString());
		}
		var processItemOpt = property.map(Property::getItem).filter(ProcessItem.class::isInstance)
				.map(ProcessItem.class::cast);
		if (!processItemOpt.isPresent()) {
			return fail("The process path provided as argument points to a properties file which property does not "
					+ "point to a ProcessItem: " + uri.toFileString());
		}
		ProcessItem processItem = processItemOpt.get();
		ensureRepositoryContextProject(processItem, wsProjects);

		// initialize the JET code-generation templates (the GUI does this at logon)
		Job templateInit = GlobalServiceRegister.getDefault().getService(ICodeGeneratorService.class)
				.initializeTemplates();
		templateInit.schedule();
		templateInit.join();

		// sync routines/beans source so the generated job's `import routines.*` resolve
		ICoreService coreService = GlobalServiceRegister.getDefault().getService(ICoreService.class);
		coreService.syncAllRoutines();
		coreService.syncAllBeans();

		// write the project poms (root code.Master + code + job) without forking Maven
		String techLabel = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
		new AggregatorPomsHelper(techLabel).syncAllPomsNoBuild(new NullProgressMonitor());

		IProcess process = CorePlugin.getDefault().getDesignerCoreService().getProcessFromProcessItem(processItem);
		CodeGenerator generator = new CodeGenerator(() -> process);
		generator.schedule();
		generator.join();

		// flush the generated resources before exit
		ResourcesPlugin.getWorkspace().save(true, new NullProgressMonitor());
		return IApplication.EXIT_OK;
	}

	/**
	 * Registers every Talaxie project folder (one containing both {@code .project} and
	 * {@code talend.project}) found directly under the workspace location as an Eclipse project,
	 * so that {@link ProxyRepositoryFactory#readProject()} can find it. This makes a fresh,
	 * non-GUI workspace usable headlessly (e.g. a git checkout mounted in CI).
	 */
	private void importWorkspaceProjects() {
		try {
			File wsDir = new File(Platform.getInstanceLocation().getURL().toURI());
			File[] subs = wsDir.listFiles();
			if (subs == null) {
				return;
			}
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = ws.getRoot();
			for (File sub : subs) {
				File dotProject = new File(sub, ".project");
				File talendProject = new File(sub, "talend.project");
				if (sub.isDirectory() && dotProject.isFile() && talendProject.isFile()) {
					IProjectDescription desc = ws.loadProjectDescription(new Path(dotProject.getAbsolutePath()));
					IProject p = root.getProject(desc.getName());
					if (!p.exists()) {
						p.create(desc, null);
					}
					if (!p.isOpen()) {
						p.open(null);
					}
				}
			}
		} catch (Exception e) {
			ExceptionHandler.process(e);
		}
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
		// branch/field lookups (getReferencedProjects) require a non-null fields map
		if (repoCtx.getFields() == null) {
			repoCtx.setFields(new HashMap<>());
		}
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