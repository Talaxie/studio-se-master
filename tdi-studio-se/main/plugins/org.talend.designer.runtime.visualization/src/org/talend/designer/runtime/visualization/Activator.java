package org.talend.designer.runtime.visualization;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.talend.designer.runtime.visualization"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in relative path
     * 
     * @param path the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    /**
     * Logs the exception with status and message.
     * 
     * @param severity The status which can be info, warning or error
     * @param message The message
     * @param t The exception
     */
    public static void log(int severity, String message, Throwable t) {
        if (plugin == null || !plugin.isDebugging() && (severity == IStatus.WARNING || severity == IStatus.INFO)) {
            return;
        }
        IStatus status = new Status(severity, PLUGIN_ID, IStatus.OK, message, t);
        plugin.getLog().log(status);
    }

    /**
     * Logs the exception with status and message.
     * 
     * @param message The message
     * @param e The exception
     */
    public static void log(String message, CoreException e) {
        log(e.getStatus().getSeverity(), message, e);
    }

    /**
     * Gets the dialog settings.
     * 
     * @param sectionName The sectionName
     * 
     * @return The dialog settings
     */
    public IDialogSettings getDialogSettings(String sectionName) {
        IDialogSettings settings = getDialogSettings();
        IDialogSettings section = settings.getSection(sectionName);
        if (section == null) {
            section = settings.addNewSection(sectionName);
        }
        return section;
    }

}
