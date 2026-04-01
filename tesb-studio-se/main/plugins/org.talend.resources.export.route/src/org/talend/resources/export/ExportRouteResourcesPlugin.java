package org.talend.resources.export;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;

/**
 * The activator class controls the plug-in life cycle
 */
public class ExportRouteResourcesPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.talend.resources.export.route"; //$NON-NLS-1$

    // The shared instance
    private static ExportRouteResourcesPlugin plugin;

    private ProjectPreferenceManager projectPreferenceManager;

    /**
     * The constructor
     */
    public ExportRouteResourcesPlugin() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
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
    public static ExportRouteResourcesPlugin getDefault() {
        return plugin;
    }

    public ProjectPreferenceManager getProjectPreferenceManager() {
        if (projectPreferenceManager == null) {
            projectPreferenceManager = new ProjectPreferenceManager(PLUGIN_ID);
        }
        return projectPreferenceManager;
    }
}
