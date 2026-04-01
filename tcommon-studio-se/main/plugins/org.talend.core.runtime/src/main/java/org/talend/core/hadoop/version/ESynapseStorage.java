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

public enum ESynapseStorage {

	ADLS_GEN2("ADLS Gen2"); //$NON-NLS-1$

    private String displayName;

    ESynapseStorage(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public static List<String> getAllSynapseStorageDisplayNames() {
        return getAllSynapseStorageNames(true);
    }

    public static List<String> getAllSynapseStorageNames(boolean display) {
        List<String> names = new ArrayList<String>();
        ESynapseStorage[] values = values();
        for (ESynapseStorage storage : values) {
            if (display) {
                names.add(storage.getDisplayName());
            } else {
                names.add(storage.getName());
            }
        }
        return names;
    }

    public static ESynapseStorage getSynapseStoragenByDisplayName(String name) {
        return getSynapseStorageByName(name, true);
    }

    public static ESynapseStorage getSynapseStorageByName(String name, boolean display) {
        if (name != null) {
            for (ESynapseStorage storage : values()) {
                if (display) {
                    if (name.equalsIgnoreCase(storage.getDisplayName())) {
                        return storage;
                    }
                } else {
                    if (name.equalsIgnoreCase(storage.getName())) {
                        return storage;
                    }
                }
            }
        }
        return null;
    }
}
