// ============================================================================
//
// Copyright (C) 2006-2020 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.hadoop.version;

import java.util.ArrayList;
import java.util.List;

public enum EDataprocAuthType {

	OAUTH_API("OAuth2 Access Token"), //$NON-NLS-1$

	SERVICE_ACCOUNT("Service account"); //$NON-NLS-1$

    private String displayName;

    EDataprocAuthType(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public static List<String> getAllDataprocAuthTypes() {
        return getAllDataprocAuthTypes(true);
    }

    public static List<String> getAllDataprocAuthTypes(boolean display) {
        List<String> types = new ArrayList<String>();
        EDataprocAuthType[] values = values();
        for (EDataprocAuthType authType : values) {
            if (display) {
            	types.add(authType.getDisplayName());
            } else {
            	types.add(authType.getName());
            }
        }
        return types;
    }

    public static EDataprocAuthType getDataprocAuthTypeByDisplayName(String name) {
        return getDataprocAuthTypeByName(name, true);
    }

    public static EDataprocAuthType getDataprocAuthTypeByName(String type, boolean display) {
        if (type != null) {
            for (EDataprocAuthType authType : values()) {
                if (display) {
                    if (type.equalsIgnoreCase(authType.getDisplayName())) {
                        return authType;
                    }
                } else {
                    if (type.equalsIgnoreCase(authType.getName())) {
                        return authType;
                    }
                }
            }
        }
        return null;
    }
}
