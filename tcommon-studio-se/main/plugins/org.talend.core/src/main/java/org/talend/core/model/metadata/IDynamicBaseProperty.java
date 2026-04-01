// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.metadata;

import java.util.Map;

import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.properties.ConnectionItem;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface IDynamicBaseProperty {

    Element getElement();

    EComponentCategory getSection();

    Map<String, String> getTableIdAndDbTypeMap();

    Map<String, String> getTableIdAndDbSchemaMap();

    String getRepositoryAliasName(ConnectionItem connectionItem);

    IProcess2 getProcess();

    default ConnectionItem getConnectionItem() {
        return null;
    }

}
