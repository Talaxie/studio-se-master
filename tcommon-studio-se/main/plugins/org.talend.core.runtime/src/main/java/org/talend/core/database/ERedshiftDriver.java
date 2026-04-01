// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.database;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;

/**
 * DOC jding  class global comment. Detailled comment
 */
public enum ERedshiftDriver {

    DRIVER_V2("Driver v2", new String[] { "redshift-jdbc42-2.1.0.10.jar" }),
    DRIVER_V1("Driver v1", new String[] { "redshift-jdbc42-no-awssdk-1.2.55.1083.jar" });

    private String displayName;

    private String[] drivers = new String[] {};

    private ERedshiftDriver(String displayName, String[] drivers) {
        this.displayName = displayName;
        this.drivers = drivers;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String[] getDrivers() {
        return drivers;
    }

    public void setDrivers(String[] drivers) {
        this.drivers = drivers;
    }

    public static Set<String> getDriversByVersion(EDatabaseVersion4Drivers v4d, String version) {
        Set<String> drivers = new HashSet<String>();
        Set<String> providerDrivers = v4d.getProviderDrivers();
        ERedshiftDriver redshiftDriver = ERedshiftDriver.valueOf(version);
        if (redshiftDriver != null && DRIVER_V1 != redshiftDriver) {
            // to replace default one
            String[] v1Drivers = DRIVER_V1.getDrivers();
            for (String driver : providerDrivers) {
                boolean replaced = false;
                for (int i = 0; i < v1Drivers.length; i++) {
                    if (driver.equals(v1Drivers[i])) {
                        drivers.add(redshiftDriver.getDrivers()[i]);
                        replaced = true;
                        break;
                    }
                }
                if (!replaced) {
                    drivers.add(driver);
                }
            }
        } else {
            drivers.addAll(providerDrivers);
        }
        return drivers;
    }

    public static String[] getRedshiftDriverDisplayNames() {
        List<String> names = new ArrayList<String>();
        for (ERedshiftDriver eRedshiftDriver : ERedshiftDriver.values()) {
            names.add(eRedshiftDriver.getDisplayName());
        }
        return names.toArray(new String[0]);
    }

    public static String getDisplayNameByEName(String eName) {
        String displayName = eName;
        ERedshiftDriver eRedshiftDriver = ERedshiftDriver.valueOf(eName);
        if (eRedshiftDriver != null) {
            displayName = eRedshiftDriver.getDisplayName();
        }
        return displayName;
    }

    public static String getEnameByDisplayName(String displayName) {
        String eName = DRIVER_V1.name();
        for (ERedshiftDriver eRedshiftDriver : ERedshiftDriver.values()) {
            if (eRedshiftDriver.getDisplayName().equals(displayName)) {
                eName = eRedshiftDriver.name();
            }
        }
        return eName;
    }

}
