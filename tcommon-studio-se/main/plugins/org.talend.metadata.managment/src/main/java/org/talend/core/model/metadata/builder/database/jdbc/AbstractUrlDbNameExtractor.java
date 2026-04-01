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

import java.util.ArrayList;
import java.util.List;

import org.talend.core.database.conn.DatabaseConnStrUtil;

public abstract class AbstractUrlDbNameExtractor implements IUrlDbNameExtractor {

    private String url;

    private String driverName;

    private String version;

    private String sid;

    private String uiSchema;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUiSchema() {
        return uiSchema;
    }

    public void setUiSchema(String uiSchema) {
        this.uiSchema = uiSchema;
    }

    /**
     * Sets the driverName.
     * 
     * @param driverName the driverName to set
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * Getter for driverName.
     * 
     * @return the driverName
     */
    public String getDriverName() {
        return driverName;
    }

    @Override
    public void initUiSchemaOrSID() {
        String[] analyseURL = DatabaseConnStrUtil.analyseURL(getCurrentDbType(), getDbVersion(), url);
        if (analyseURL == null) {
            return;
        }
        analyseResult(analyseURL);
    }

    protected abstract void analyseResult(String[] analyseURL);

    @Override
    public List<String> getExtractResult() {
        List<String> result = new ArrayList<>();
        result.add(sid);
        result.add(uiSchema);
        return result;
    }

    @Override
    public boolean hasCatalog() {
        return false;
    }

    @Override
    public boolean hasSchema() {
        return false;
    }

    @Override
    public boolean hasBothSturctor() {
        return hasCatalog() && hasSchema();
    }

    protected abstract String getDbVersion();

    protected abstract String getCurrentDbType();

}
