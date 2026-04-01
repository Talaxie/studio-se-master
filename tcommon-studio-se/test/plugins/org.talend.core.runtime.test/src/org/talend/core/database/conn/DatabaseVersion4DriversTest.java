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
package org.talend.core.database.conn;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.ERedshiftDriver;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class DatabaseVersion4DriversTest {

    @Test
    public void testGetDriversByDriverVersion4Redshift() {
        String[] redshiftDrivers = new String[] { "redshift-jdbc42-no-awssdk-1.2.55.1083.jar", "antlr4-runtime-4.8-1.jar" };
        List<String> drivers = EDatabaseVersion4Drivers.getDrivers(EDatabaseTypeName.REDSHIFT.getDisplayName(),
                ERedshiftDriver.DRIVER_V1.name());
        assertTrue(drivers.containsAll(Arrays.asList(redshiftDrivers)));

        redshiftDrivers = new String[] { "redshift-jdbc42-2.1.0.10.jar", "antlr4-runtime-4.8-1.jar" };
        drivers = EDatabaseVersion4Drivers.getDrivers(EDatabaseTypeName.REDSHIFT.getDisplayName(),
                ERedshiftDriver.DRIVER_V2.name());
        assertTrue(drivers.containsAll(Arrays.asList(redshiftDrivers)));

        String[] redshiftSSODrivers = new String[] { "redshift-jdbc42-no-awssdk-1.2.55.1083.jar", "antlr4-runtime-4.8-1.jar",
                "jackson-core-2.14.3.jar", "jackson-databind-2.14.3.jar",
                "jackson-annotations-2.14.3.jar", "httpcore-4.4.13.jar", "httpclient-4.5.13.jar", "joda-time-2.8.1.jar",
                "commons-logging-1.2.jar", "commons-codec-1.14.jar", "aws-java-sdk-redshift-internal-1.12.x.jar" };
        drivers = EDatabaseVersion4Drivers.getDrivers(EDatabaseTypeName.REDSHIFT_SSO.getDisplayName(),
                ERedshiftDriver.DRIVER_V1.name());
        assertTrue(drivers.containsAll(Arrays.asList(redshiftSSODrivers)));

        redshiftSSODrivers = new String[] { "redshift-jdbc42-2.1.0.10.jar", "antlr4-runtime-4.8-1.jar", "jackson-core-2.14.3.jar",
                "jackson-databind-2.14.3.jar", "jackson-annotations-2.14.3.jar", "httpcore-4.4.13.jar", "httpclient-4.5.13.jar",
                "joda-time-2.8.1.jar", "commons-logging-1.2.jar", "commons-codec-1.14.jar",
                "aws-java-sdk-redshift-internal-1.12.x.jar", "aws-java-sdk-core-1.12.315.jar", "aws-java-sdk-sts-1.12.315.jar",
                "aws-java-sdk-redshift-1.12.315.jar", "jmespath-java-1.12.315.jar" };
        drivers = EDatabaseVersion4Drivers.getDrivers(EDatabaseTypeName.REDSHIFT_SSO.getDisplayName(),
                ERedshiftDriver.DRIVER_V2.name());
        assertTrue(drivers.containsAll(Arrays.asList(redshiftSSODrivers)));
    }

}
