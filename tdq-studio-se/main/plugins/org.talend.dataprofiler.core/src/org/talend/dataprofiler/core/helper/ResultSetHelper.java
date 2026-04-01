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
package org.talend.dataprofiler.core.helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.talend.core.model.metadata.IMetadataConnection;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.dq.dbms.DbmsLanguage;
import org.talend.dq.dbms.DbmsLanguageFactory;
import org.talend.metadata.managment.utils.MetadataConnectionUtils;
import org.talend.utils.sugars.TypedReturnCode;

import orgomg.cwm.objectmodel.core.Expression;

/**
 * DOC talend class global comment. Detailled comment
 */
public class ResultSetHelper {

    public static ResultSet getResultSet(MetadataTable metadataTable, String whereExpression) throws SQLException {
        return getResultSet(metadataTable, whereExpression, 0);
    }

    public static ResultSet getResultSet(MetadataTable metadataTable, String whereExpression, int maxRows) throws SQLException {
        return getResultSet(metadataTable, null, whereExpression, maxRows);
    }

    public static ResultSet getResultSet(MetadataTable metadataTable, java.sql.Connection sqlConn, String whereExpression,
            int maxRows) throws SQLException {
        Connection tdDataProvider = ConnectionHelper.getTdDataProvider(metadataTable);
        if (sqlConn == null) {
            // TDQ-19889 msjian: check whether context confirmation needed popup,
            // Enabling the prompt to context variables
            org.talend.core.model.metadata.builder.connection.Connection copyConnection =
                    MetadataConnectionUtils.prepareConection(tdDataProvider, true);
            IMetadataConnection metadataBean = ConvertionHelper.convert(copyConnection);
            TypedReturnCode<java.sql.Connection> createConnection = MetadataConnectionUtils.createConnection(metadataBean, false);
            if (!createConnection.isOk()) {
                return null;
            }
            sqlConn = createConnection.getObject();
        }

        DbmsLanguage dbmsLanguage = DbmsLanguageFactory.createDbmsLanguage(tdDataProvider);
        PreparedStatement preparedStatement = null;
        Expression columnQueryExpression = dbmsLanguage.getTableQueryExpression(metadataTable, whereExpression);
        if (maxRows != 0) {// TOPN algorithm, it has row limited,no need the fetch size.
            preparedStatement = dbmsLanguage.preparedStatement(sqlConn, columnQueryExpression.getBody());
        } else {// Resevoir Sample algorithm
            preparedStatement = dbmsLanguage.preparedStatement(sqlConn, 1000, columnQueryExpression.getBody());
        }
        preparedStatement.setMaxRows(maxRows);

        return preparedStatement.executeQuery();
    }
}
