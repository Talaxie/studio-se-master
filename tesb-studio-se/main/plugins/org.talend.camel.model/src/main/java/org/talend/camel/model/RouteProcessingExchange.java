// ============================================================================
//
// Copyright (C) 2019 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.camel.model;

import org.eclipse.core.runtime.preferences.InstanceScope;

/**
 * This class is a temporary solution for information exchange
 * during route processing, e.g. microservice creation.
 */
public final class RouteProcessingExchange {

    public static final ThreadLocal<Boolean> isCreatingMicroService = new ThreadLocal<>();

    private static final ThreadLocal<Boolean> originalMavenOfflineState = new ThreadLocal<>();

    public static void setMavenOffline(boolean mavenOffline) {
        Boolean b = originalMavenOfflineState.get();
        if (b == null) {
            originalMavenOfflineState.set(InstanceScope.INSTANCE.getNode("org.eclipse.m2e.core")
                    .getBoolean("eclipse.m2.offline", false));
        }
        InstanceScope.INSTANCE.getNode("org.eclipse.m2e.core")
                .putBoolean("eclipse.m2.offline", mavenOffline);
    }

    public static void resetMavenOffline() {
        Boolean b = originalMavenOfflineState.get();
        if (b != null) {
            originalMavenOfflineState.set(null);
            InstanceScope.INSTANCE.getNode("org.eclipse.m2e.core")
                    .putBoolean("eclipse.m2.offline", b.booleanValue());
        }
    }

    private RouteProcessingExchange() {
        super();
    }
}
