// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.signon.util;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

public class EquinoxUtils {

    public static URL[] getConfigAreaURL(BundleContext context) {
        Location configLocation = getConfigLocation(context);
        if (configLocation == null) {
            return null;
        }

        URL baseURL = configLocation.getURL();
        if (configLocation.getParentLocation() != null && configLocation.getURL() != null) {
            if (baseURL == null) {
                return new URL[] { configLocation.getParentLocation().getURL() };
            } else {
                return new URL[] { baseURL, configLocation.getParentLocation().getURL() };
            }
        }
        if (baseURL != null) {
            return new URL[] { baseURL };
        }

        return null;
    }

    public static Location getConfigLocation(BundleContext context) {
        Filter filter = null;
        try {
            filter = context.createFilter(Location.CONFIGURATION_FILTER);
        } catch (InvalidSyntaxException e) {
            // should not happen
        }
        ServiceTracker configLocationTracker = new ServiceTracker(context, filter, null);
        configLocationTracker.open();
        try {
            return (Location) configLocationTracker.getService();
        } finally {
            configLocationTracker.close();
        }
    }

    public static URI getInstallLocationURI(BundleContext context) {
        try {
            ServiceReference[] references = context.getServiceReferences(Location.class.getName(), Location.INSTALL_FILTER);
            if (references != null && references.length > 0) {
                ServiceReference reference = references[0];
                Location installLocation = (Location) context.getService(reference);
                if (installLocation != null) {
                    try {
                        if (installLocation.isSet()) {
                            URL location = installLocation.getURL();
                            return URIUtil.toURI(location);
                        }
                    } catch (URISyntaxException e) {
                        // TODO: log an error
                    } finally {
                        context.ungetService(reference);
                    }
                }
            }
        } catch (InvalidSyntaxException e) {
            // TODO: log an error
        }
        return null;
    }

    // always return a valid bundlesContext or throw a runtimeException
    public static BundleContext getCurrentBundleContext() {
        Bundle bundle = FrameworkUtil.getBundle(EquinoxUtils.class);
        if (bundle != null) {
            BundleContext bundleContext = bundle.getBundleContext();
            if (bundleContext != null) {
                return bundleContext;
            } else {
                throw new RuntimeException(
                        "could not find current BundleContext, this should never happen, check that the bunlde is activated when this class is accessed");
            }
        } else {
            throw new RuntimeException(
                    "could not find current Bundle, this should never happen, check that the bunlde is activated when this class is accessed");
        }
    }

    public static File getConfigurationFolder() {
        BundleContext configuratorBundleContext = getCurrentBundleContext();
        final URL url = getConfigLocation(configuratorBundleContext).getURL();
        try {
            return URIUtil.toFile(URIUtil.toURI(url));
        } catch (URISyntaxException e) {
            //
        }
        return null;
    }
}
