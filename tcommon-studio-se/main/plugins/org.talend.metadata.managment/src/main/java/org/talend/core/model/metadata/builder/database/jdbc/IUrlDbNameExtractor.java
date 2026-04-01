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

import java.util.List;

public interface IUrlDbNameExtractor {

    void setUrl(String url);

    String getUrl();

    void initUiSchemaOrSID();

    void setDriverName(String driverName);

    String getDriverName();

    void setVersion(String version);

    String getVersion();

    /**
     * Return the result of url extract
     * 0 is sid null mean that can not found it
     * 1 is uiSchema null mean that can not found it
     */
    List<String> getExtractResult();

    boolean hasCatalog();

    boolean hasSchema();

    boolean hasBothSturctor();
}
