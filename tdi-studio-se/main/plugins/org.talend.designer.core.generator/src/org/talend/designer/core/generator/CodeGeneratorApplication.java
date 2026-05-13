package org.talend.designer.core.generator;

import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.talend.core.model.process.IProcess;
import org.talend.core.repository.utils.TalendResourceSet;

/**
 * Generates code for the process which URI is provided as argument.
 */
public class CodeGeneratorApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		// get the process URI from the application arguments
		String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		if (args == null || args.length == 0) {
			System.err.println(
					"No process URI path provided as argument. You should provide the process URI path, such as `myproject/test.tal`.");
			return IApplication.EXIT_OK;
		}
		var path = args[0];
		URI uri = URI.createPlatformPluginURI(path, true);
		var rset = new TalendResourceSet();
		if (!rset.getURIConverter().exists(uri, null)) {
			System.err.println("The process URI path provided as argument does not point an existing file: " + path);
			return IApplication.EXIT_OK;
		}
		Supplier<IProcess> processSupplier = () -> {
			var resource = rset.getResource(uri, true);
			return resource.getContents().stream().filter(IProcess.class::isInstance).map(IProcess.class::cast)
					.findFirst().orElse(null);
		};
		var generator = new CodeGenerator(processSupplier);
		generator.schedule();
		generator.join();
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// do nothing.
	}

}
