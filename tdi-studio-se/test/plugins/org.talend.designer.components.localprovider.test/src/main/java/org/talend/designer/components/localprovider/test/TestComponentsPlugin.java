package org.talend.designer.components.localprovider.test;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.designer.core.IDesignerCoreService;

/**
 * The activator class controls the plug-in life cycle
 */
public class TestComponentsPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.talend.designer.components.localprovider.test"; //$NON-NLS-1$

    public static final String PLUGINCOMPONENTID = "org.talend.designer.components.localprovider"; //$NON-NLS-1$

    // The shared instance
    private static TestComponentsPlugin plugin;

    /**
     * The constructor
     */
    public TestComponentsPlugin() {
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static TestComponentsPlugin getDefault() {
        return plugin;
    }

    public IDesignerCoreService getDesignerCoreService() {
        IService service = GlobalServiceRegister.getDefault().getService(IDesignerCoreService.class);
        return (IDesignerCoreService) service;
    }
}
