package org.talend.dataquality;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class DataQualityPlugin extends Plugin {

    private static DataQualityPlugin plugin = null;

    private BundleContext bundleContext = null;

    public DataQualityPlugin() {
        super();
        plugin = this;
    }

    public static DataQualityPlugin getDefault() {
        return plugin;
    }

    public BundleContext getBundleContext() {
        return this.bundleContext;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        this.bundleContext = context;

    }

}
