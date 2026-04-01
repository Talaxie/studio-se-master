// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.maven;

import java.lang.reflect.Field;
import java.util.Hashtable;

import org.eclipse.m2e.core.internal.MavenPluginActivator;
import org.eclipse.m2e.core.internal.MvnProtocolHandlerService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.url.URLConstants;
import org.osgi.service.url.URLStreamHandlerService;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;

public class DesignerMavenPlugin implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.talend.designer.maven"; //$NON-NLS-1$

    private static DesignerMavenPlugin plugin;

    private static BundleContext context;

    private ProjectPreferenceManager projectPreferenceManager;

    public BundleContext getContext() {
        return context;
    }

    public static DesignerMavenPlugin getPlugin() {
        return plugin;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        this.plugin = this;
        DesignerMavenPlugin.context = bundleContext;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        DesignerMavenPlugin.context = null;
        // because of the m2e.core and ops4j service conflict, we force to unregister m2e service before logon
        // project. but will cause the exception "java.lang.IllegalStateException: The service has been
        // unregistered" when m2e.core bundle stop . so here try to register the service back before shutdown
        registerM2EServiceBeforeShutdown();
    }

    private void registerM2EServiceBeforeShutdown() {
        try {
            Hashtable<String, Object> properties = new Hashtable<>();
            properties.put(URLConstants.URL_HANDLER_PROTOCOL, new String[] { "mvn" });
            MavenPluginActivator m2eDefault = MavenPluginActivator.getDefault();
            BundleContext bundleContext = m2eDefault.getBundle().getBundleContext();
            ServiceRegistration<URLStreamHandlerService> registerService = bundleContext
                    .registerService(URLStreamHandlerService.class, new MvnProtocolHandlerService(m2eDefault.getMaven(), bundleContext), properties);
            Field declaredField = m2eDefault.getClass().getDeclaredField("protocolHandlerService");
            declaredField.setAccessible(true);
            declaredField.set(m2eDefault, registerService);

        } catch (Exception e) {
            ExceptionHandler
                    .log("Unable to register service back before shutdown " + org.osgi.service.url.URLStreamHandlerService.class);
        }
    }

    public ProjectPreferenceManager getProjectPreferenceManager() {
        if (projectPreferenceManager == null) {
            projectPreferenceManager = new ProjectPreferenceManager(PLUGIN_ID);
        }
        return projectPreferenceManager;
    }
}
