package org.talend.designer.core.generator;

import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.repository.utils.TalendResourceSet;
import org.talend.designer.core.ui.editor.process.Process;

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
					"No process URI path provided as argument. You should provide the process URI path, such as `C:/myworkspace/MY_PROJECT/process/myJob_0.1.properties`.");
			return IApplication.EXIT_OK;
		}
		var path = args[0];
		URI uri = URI.createFileURI(path);
		var rset = new TalendResourceSet();
		if (!rset.getURIConverter().exists(uri, null)) {
			System.err.println("The process URI path provided as argument does not point an existing file: " + path);
			return IApplication.EXIT_OK;
		}
		Supplier<IProcess> processSupplier = () -> {
			var resource = rset.getResource(uri, true);
			var property = resource.getContents().stream().filter(Property.class::isInstance).map(Property.class::cast)
					.findFirst();
			var processItem = property.map(Property::getItem).filter(ProcessItem.class::isInstance)
					.map(ProcessItem.class::cast);
			// handle error cases which do not point to a valid process item
			if (!property.isPresent()) {
				System.err.println(
						"The process URI path provided as argument does not point to a valid properties file: "
								+ uri.toFileString());
			} else if (!processItem.isPresent()) {
				System.err.println(
						"The process URI path provided as argument points to a properties file which property does not point to a ProcessItem: "
								+ uri.toFileString());
			}
			return processItem.map(ProcessItem::getProperty).map(Process::new).orElse(null);
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
