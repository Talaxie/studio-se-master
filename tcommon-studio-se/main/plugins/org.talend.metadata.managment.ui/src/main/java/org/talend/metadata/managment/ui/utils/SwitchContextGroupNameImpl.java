// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.metadata.managment.ui.utils;

import java.util.Map;

import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.metadata.managment.ui.convert.strategy.SwitchContextWithReplace;
import org.talend.metadata.managment.ui.convert.strategy.SwitchContextWithTaggedValue;

/**
 * this class is used when switching context group name.
 */
public class SwitchContextGroupNameImpl implements ISwitchContext {

    private static SwitchContextGroupNameImpl instance;

    // default strategy is replace
    private ISwitchContext strategy = new SwitchContextWithReplace();

    private SwitchContextGroupNameImpl() {
    }

    /**
     * get a instance of this class.
     *
     * @return
     */
    public static SwitchContextGroupNameImpl getInstance() {
        if (instance == null) {
            instance = new SwitchContextGroupNameImpl();
        }
        return instance;
    }

    public boolean switchStrategy(ConnectionItem connItem) {
        if (connItem == null || !(connItem instanceof DatabaseConnectionItem)) {
            return false;
        }

        DatabaseConnection dbCon = (DatabaseConnection) connItem.getConnection();
        String databaseType = dbCon.getDatabaseType();
        if (EDatabaseTypeName.GENERAL_JDBC.getXMLType().equals(databaseType)) {
            strategy = new SwitchContextWithTaggedValue();
        } else {
            strategy = new SwitchContextWithReplace();
        }
        return true;

    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.metadata.builder.database.ISwitchContext#updateContextGroup(org.talend.core.model.
     * properties .ContextItem, org.talend.core.model.metadata.builder.connection.Connection)
     */
    @Override
    public boolean updateContextGroup(ConnectionItem connItem, String selectedContext) {
        if (connItem == null || connItem.getConnection() == null) {
            return false;
        }
        return updateContextGroup(connItem, selectedContext, connItem.getConnection().getContextName());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.metadata.builder.database.ISwitchContext#updateContextGroup(org.talend.core.model.
     * properties .ContextItem, org.talend.core.model.metadata.builder.connection.Connection)
     */
    @Override
    public boolean updateContextGroup(ConnectionItem connItem, String selectedContext, String originalContext,
            boolean... isMigrationTask) {
        switchStrategy(connItem);
        return strategy.updateContextGroup(connItem, selectedContext, originalContext, isMigrationTask);

    }



    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.utils.ISwitchContext#updateContextForConnectionItems(java.util.Map,
     * org.talend.core.model.properties.ContextItem)
     */
    @Override
    public boolean updateContextForConnectionItems(Map<String, String> contextGroupRanamedMap, ContextItem contextItem) {
        return strategy.updateContextForConnectionItems(contextGroupRanamedMap, contextItem);
    }
}
