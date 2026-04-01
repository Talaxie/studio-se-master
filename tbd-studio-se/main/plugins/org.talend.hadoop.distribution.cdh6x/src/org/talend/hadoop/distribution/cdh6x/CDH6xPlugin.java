package org.talend.hadoop.distribution.cdh6x;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class CDH6xPlugin extends Plugin {

    private static CDH6xPlugin instance;

    public static CDH6xPlugin getInstance() {
        return instance;
    }

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        super.start(bundleContext);
        instance = this;
    }

	@Override
    public void stop(BundleContext bundleContext) throws Exception {
        super.stop(bundleContext);
	}

}