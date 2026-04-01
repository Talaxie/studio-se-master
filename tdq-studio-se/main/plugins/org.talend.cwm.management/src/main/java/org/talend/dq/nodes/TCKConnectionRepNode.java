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
package org.talend.dq.nodes;

import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.TacokitDatabaseConnection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.repository.model.RepositoryNode;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;

public class TCKConnectionRepNode extends DBConnectionRepNode implements ITaCoKitRepositoryNode {

    /**
     * TCKConnectionRepNode constructor.
     *
     * @param object
     * @param parent
     * @param type
     * @param inWhichProject
     */
    public TCKConnectionRepNode(IRepositoryViewObject object, RepositoryNode parent, ENodeType type,
            org.talend.core.model.general.Project inWhichProject) {
        super(object, parent, type, inWhichProject);
    }

    public TacokitDatabaseConnection getDatabaseConnection() {
        Property property = this.getObject().getProperty();
        if (property != null && property.getItem() != null
                && ((ConnectionItem) property.getItem()).getConnection() instanceof TacokitDatabaseConnection) {
            return (TacokitDatabaseConnection) ConvertionHelper
                    .fillJDBCParams4TacokitDatabaseConnection(((ConnectionItem) property.getItem()).getConnection());
        }
        return null;
    }

    @Override
    public ConfigTypeNode getConfigTypeNode() {
        TaCoKitConfigurationModel module = new TaCoKitConfigurationModel(getDatabaseConnection());
        return module.getConfigTypeNode();
    }

    /**
     * DQ don't use this method.
     */
    @Override
    public ITaCoKitRepositoryNode getParentTaCoKitNode() {
        return null;
    }

    @Override
    public boolean isLeafNode() {
        return true;
    }

    @Override
    public boolean isFolderNode() {
        return false;
    }

    @Override
    public boolean isFamilyNode() {
        return false;
    }

    @Override
    public boolean isConfigNode() {
        return false;
    }

}
