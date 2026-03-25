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
package org.talend.dataprofiler.core.migration.impl;

import java.util.Date;
import java.util.List;

import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.dataprofiler.core.migration.AbstractWorksapceUpdateTask;
import org.talend.metadata.managment.ui.convert.DbConnectionAdapter;
import org.talend.metadata.managment.ui.convert.strategy.SwitchContextWithTaggedValue;


public class AddTaggedValueJDBCSwitchContextTask extends AbstractWorksapceUpdateTask {


    /*
     * (non-Javadoc)
     *
     * @see org.talend.dataprofiler.migration.IMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        return createDate(2022, 7, 28);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.dataprofiler.migration.IMigrationTask#getMigrationTaskType()
     */
    @Override
    public MigrationTaskType getMigrationTaskType() {
        return MigrationTaskType.FILE;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.dataprofiler.migration.AMigrationTask#doExecute()
     */
    @Override
    protected boolean doExecute() throws Exception {
        List<IRepositoryViewObject> allConnectionObject = ProxyRepositoryFactory.getInstance()
                .getAll(
                        ERepositoryObjectType.METADATA_CONNECTIONS);

        for (IRepositoryViewObject object : allConnectionObject) {
            ConnectionItem item = (ConnectionItem) object.getProperty().getItem();
            Connection connection = item.getConnection();
            if (connection instanceof DatabaseConnection) {
                DatabaseConnection dbConn = (DatabaseConnection) connection;
                DbConnectionAdapter dbConnectionAdapter =
                        new DbConnectionAdapter(dbConn);
                if (!dbConnectionAdapter.needTobeMigration()) {
                    continue;
                }
                new SwitchContextWithTaggedValue().updateContextGroup(item, dbConn.getContextName(),
                        dbConn.getContextName(), true);
            }
        }
        return true;
    }

}
