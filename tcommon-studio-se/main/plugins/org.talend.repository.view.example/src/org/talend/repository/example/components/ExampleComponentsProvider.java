package org.talend.repository.example.components;

import java.io.File;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class ExampleComponentsProvider extends org.talend.core.model.components.AbstractComponentsProvider {

    private static Logger logger = Logger.getLogger(ExampleComponentsProvider.class);

    @Override
    protected File getExternalComponentsLocation() {
        Bundle bundle = Platform.getBundle("org.talend.repository.view.example"); //$NON-NLS-1$
        URL url = FileLocator.find(bundle, new Path("components"), null); //$NON-NLS-1$
        URL fileUrl;
        try {
            fileUrl = FileLocator.toFileURL(url);
            return new File(fileUrl.getPath());
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }

}
