// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.utils;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.talend.commons.exception.ExceptionHandler;

public class OsgiServices {

    public static <T> T get(Class<T> clz) {
        try {
            BundleContext bc = FrameworkUtil.getBundle(OsgiServices.class).getBundleContext();
            ServiceReference<T> serviceReference = bc.getServiceReference(clz);
            if (serviceReference != null) {
                return bc.getService(serviceReference);
            }
        } catch (Throwable e) {
            ExceptionHandler.process(e);
        }
        return null;
    }

}
