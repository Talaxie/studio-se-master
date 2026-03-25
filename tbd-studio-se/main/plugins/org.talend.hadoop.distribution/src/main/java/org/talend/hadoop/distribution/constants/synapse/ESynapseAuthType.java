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
package org.talend.hadoop.distribution.constants.synapse;

import java.util.ArrayList;
import java.util.List;

public enum ESynapseAuthType {

	SECRETKEY("Secret Key"),

	AAD("Azure Active Directory");

    private String displayName;

    ESynapseAuthType(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public static List<String> getAllSynapseAuthTypes() {
        return getAllSynapseAuthTypes(true);
    }

    public static List<String> getAllSynapseAuthTypes(boolean display) {
        List<String> types = new ArrayList<String>();
        ESynapseAuthType[] values = values();
        for (ESynapseAuthType authType : values) {
            if (display) {
            	types.add(authType.getDisplayName());
            } else {
            	types.add(authType.getName());
            }
        }
        return types;
    }

    public static ESynapseAuthType getSynapseAuthTypeByDisplayName(String name) {
        return getSynapseAuthTypeByName(name, true);
    }

    public static ESynapseAuthType getSynapseAuthTypeByName(String type, boolean display) {
        if (type != null) {
            for (ESynapseAuthType authType : values()) {
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
