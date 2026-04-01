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

import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;

public class MysqlExtractor extends AbstractUrlDbNameExtractor {

    @Override
    protected String getDbVersion() {
        return EDatabaseVersion4Drivers.getDbVersionName(EDatabaseTypeName.MYSQL, getDriverName());
    }

    @Override
    protected String getCurrentDbType() {
        return EDatabaseTypeName.MYSQL.getDisplayName();
    }

    @Override
    protected void analyseResult(String[] analyseURL) {
        // need to be implement later

    }

    @Override
    public boolean hasCatalog() {
        return true;
    }

}
