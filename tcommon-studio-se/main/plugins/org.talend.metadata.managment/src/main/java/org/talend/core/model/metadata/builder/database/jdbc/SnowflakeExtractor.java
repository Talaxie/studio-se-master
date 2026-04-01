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
package org.talend.core.model.metadata.builder.database.jdbc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.conn.DatabaseConnConstants;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;

public class SnowflakeExtractor extends AbstractUrlDbNameExtractor {

    @Override
    protected String getDbVersion() {
        if (this.getVersion() != null) {
            return this.getVersion();
        }
        return EDatabaseVersion4Drivers.getDbVersionName(EDatabaseTypeName.SNOWFLAKE, getDriverName());
    }

    @Override
    protected String getCurrentDbType() {
        return EDatabaseTypeName.SNOWFLAKE.getDisplayName();
    }

    @Override
    protected void analyseResult(String[] analyseURL) {
        if (analyseURL.length >= 5) {
            String line = analyseURL[3];
            String patternSid = "(.*)db=" + DatabaseConnConstants.PATTERN_SID + "(.*)";
            String patternUiSchema = "(.*)schema=" + DatabaseConnConstants.PATTERN_SID + "(.*)";

            // create Pattern
            Pattern sidResult = Pattern.compile(patternSid);
            Pattern uischemaResult = Pattern.compile(patternUiSchema);

            // create matcher
            Matcher mSid = sidResult.matcher(line);
            Matcher mUiSchema = uischemaResult.matcher(line);
            if (mSid.find()) {
                this.setSid(mSid.group(2));
            }
            if (mUiSchema.find()) {
                // set ui schema
                this.setUiSchema(mUiSchema.group(2));
            }
        }
    }

    @Override
    public boolean hasCatalog() {
        return true;
    }

    @Override
    public boolean hasSchema() {
        return true;
    }

}
