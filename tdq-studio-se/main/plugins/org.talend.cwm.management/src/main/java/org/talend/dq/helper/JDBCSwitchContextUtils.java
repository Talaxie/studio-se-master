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
package org.talend.dq.helper;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.dq.nodes.DBConnectionRepNode;
import org.talend.dq.nodes.TCKConnectionRepNode;
import org.talend.metadata.managment.ui.convert.DbConnectionAdapter;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.RepositoryNode;

public class JDBCSwitchContextUtils {

    public static boolean isJDBCContextMode(RepositoryNode connNode) {
        if (connNode == null) {
            return false;
        }
        if (!(connNode instanceof DBConnectionRepNode)) {
            return false;
        }
        DatabaseConnection dbConn = ((DBConnectionRepNode) connNode).getDatabaseConnection();
        DbConnectionAdapter dbConnectionAdapter =
                new DbConnectionAdapter(dbConn);
        return dbConnectionAdapter.isSwitchWithTaggedValueMode();
    }

    public static boolean isJDBCContextMode(List<IRepositoryNode> subNodes) {
        try {
            if (subNodes == null || subNodes.size() < 1) {
                return false;
            }
            Item item = subNodes.get(0).getObject().getProperty().getItem();
            if (!(item instanceof DatabaseConnectionItem)) {
                return false;
            }
            Connection dbConn = ((DatabaseConnectionItem) item).getConnection();
            if (!(dbConn instanceof DatabaseConnection)) {
                return false;
            }
            DbConnectionAdapter dbConnectionAdapter =
                    new DbConnectionAdapter((DatabaseConnection) dbConn);
            return dbConnectionAdapter.isSwitchWithTaggedValueMode();
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static DatabaseConnection findConnection(IRepositoryNode parentNode) {
        DatabaseConnection conn = null;
        IRepositoryNode connNode = parentNode;
        if (connNode.getObjectType() == ERepositoryObjectType.METADATA_CON_TABLE
                || connNode.getObjectType() == ERepositoryObjectType.METADATA_CON_VIEW) {
            connNode = connNode.getParent().getParent();
        }
        if (connNode.getObjectType() == ERepositoryObjectType.METADATA_CON_SCHEMA) {
            connNode = connNode.getParent();
        }
        if (connNode.getObjectType() == ERepositoryObjectType.METADATA_CON_CATALOG) {
            connNode = connNode.getParent();
        }
        if (connNode.getObjectType() != null) {
            if (connNode.getObjectType().equals(ERepositoryObjectType.JDBC)
                    && connNode instanceof DBConnectionRepNode) {
                conn = ((DBConnectionRepNode) connNode).getDatabaseConnection();
            }
        }
        if (connNode instanceof TCKConnectionRepNode) {
            conn = ((DBConnectionRepNode) connNode).getDatabaseConnection();
        }

        return conn;
    }

    public static String getCatalogOrSchemaName(IRepositoryNode node) {
        IRepositoryNode subNode = node;
        IRepositoryNode parentNode = node;
        if (parentNode.getObjectType() == ERepositoryObjectType.METADATA_CON_TABLE
                || parentNode.getObjectType() == ERepositoryObjectType.METADATA_CON_VIEW) {
            parentNode = subNode.getParent().getParent();
        }
        if (parentNode.getObjectType() == ERepositoryObjectType.METADATA_CON_SCHEMA) {
            subNode = parentNode;
            parentNode = subNode.getParent();
        }
        if (parentNode.getObjectType() == ERepositoryObjectType.METADATA_CON_CATALOG) {
            subNode = parentNode;
            parentNode = subNode.getParent();
        }
        if (parentNode.getObjectType().equals(ERepositoryObjectType.JDBC)
                && parentNode instanceof DBConnectionRepNode) {
            return subNode.getLabel();
        }

        return StringUtils.EMPTY;
    }

}
