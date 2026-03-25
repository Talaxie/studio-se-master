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
package org.talend.cwm.db.connection;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.database.ExtractMetaDataUtils;
import org.talend.core.model.metadata.builder.database.JavaSqlFactory;
import org.talend.cwm.helper.CatalogHelper;
import org.talend.cwm.helper.ColumnHelper;
import org.talend.cwm.helper.SchemaHelper;
import org.talend.cwm.helper.SwitchHelpers;
import org.talend.cwm.relational.TdColumn;
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.matchmerge.Record;
import org.talend.dataquality.record.linkage.iterator.ResultSetIterator;
import org.talend.dq.analysis.connpool.TdqAnalysisConnectionPool;
import org.talend.dq.dbms.DbmsLanguage;
import org.talend.dq.dbms.DbmsLanguageFactory;
import org.talend.dq.helper.ContextHelper;
import org.talend.utils.sql.ResultSetUtils;
import org.talend.utils.sugars.ReturnCode;
import org.talend.utils.sugars.TypedReturnCode;

import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.resource.relational.Catalog;
import orgomg.cwm.resource.relational.ColumnSet;
import orgomg.cwm.resource.relational.Schema;

/**
 * SQL executor dedicated for relational database query.
 */
public class DatabaseSQLExecutor extends SQLExecutor {

    private static Logger log = Logger.getLogger(DatabaseSQLExecutor.class);

    /*
     * (non-Javadoc)
     *
     * @see org.talend.cwm.db.connection.ISQLExecutor#executeQuery(org.talend.dataquality.analysis.Analysis)
     */
    public List<Object[]> executeQuery(DataManager connection, List<ModelElement> analysedElements)
            throws SQLException {
        return executeQuery(connection, analysedElements, null);
    }

    /**
     * DOC yyin Comment method "getSQLConnection".
     *
     * @param connection
     * @return
     * @throws SQLException
     */
    private TypedReturnCode<java.sql.Connection> getSQLConnection(DataManager connection) throws SQLException {
        org.talend.core.model.metadata.builder.connection.Connection copyConnection =
                ContextHelper.getPromptContextValuedConnection((Connection) connection);
        TypedReturnCode<java.sql.Connection> sqlconnection = null;
        if (this.getAnalysis() == null) {
            sqlconnection = JavaSqlFactory.createConnection(copyConnection);
        } else {
            sqlconnection = this.getSqlConnection(this.getAnalysis());
        }
        if (!sqlconnection.isOk()) {
            throw new SQLException(sqlconnection.getMessage());
        }
        return sqlconnection;
    }

    /**
     * Create a sql query for common database or JDBC connection database based on DbmsLanguage
     * 
     * @param connection
     * @param analysedElements
     * @param where
     * @param sqlconnection
     * @param ignoreLimit if it is true,no Limit
     * @return
     * @throws SQLException
     */
    private String createSqlStatement(DataManager connection, List<ModelElement> analysedElements, String where,
            TypedReturnCode<java.sql.Connection> sqlconnection, boolean ignoreLimit) throws SQLException {
        DbmsLanguage dbms = createDbmsLanguage(connection, sqlconnection);
        TdColumn col = null;
        StringBuilder sql = new StringBuilder("SELECT ");//$NON-NLS-1$
        final Iterator<ModelElement> iterator = analysedElements.iterator();
        while (iterator.hasNext()) {
            ModelElement modelElement = iterator.next();
            col = SwitchHelpers.COLUMN_SWITCH.doSwitch(modelElement);
            sql.append(dbms.quote(col.getName()));
            // append comma if more columns exist
            if (iterator.hasNext()) {
                sql.append(',');
            }
        }
        sql.append(dbms.from());
        sql.append(dbms.getQueryColumnSetWithPrefix(col));
        if (where != null && where.length() > 0) {
            sql.append(dbms.where());
            sql.append(where);
        }

        String finalQuery = sql.toString();

        if (isShowRandomData()) {
            finalQuery = dbms.getRandomQuery(finalQuery);
        }

        if (getLimit() > 0 && !ignoreLimit) {
            return dbms.getTopNQuery(finalQuery, getLimit());
        }
        return finalQuery;

    }

    /**
     * 
     * @param connection
     * @param sqlconnection
     * @return Create a DbmsLanguage for common database or a jdbc connection, so that can use some corresponds function
     * @throws SQLException
     */
    private DbmsLanguage createDbmsLanguage(DataManager connection, TypedReturnCode<java.sql.Connection> sqlconnection)
            throws SQLException {
        DbmsLanguage dbms = null;
        Connection con = (Connection) connection;
        String databaseProductName = null;
        boolean isJdbc = ConnectionUtils.isTcompJdbc(con) && !ConnectionUtils.isGeneralJdbc(con);
        // if it is JDBC connection, extract the db type from sqlconnection and create correspond DbmsLanguage
        if (isJdbc) {
            DatabaseMetaData metadata =
                    ExtractMetaDataUtils.getInstance().getConnectionMetadata(sqlconnection.getObject());
            databaseProductName = metadata.getDatabaseProductName();
            if (databaseProductName != null) {
                dbms = DbmsLanguageFactory.createDbmsLanguage(databaseProductName,
                        metadata.getDatabaseProductVersion());
            }
        }
        if (!isJdbc || isJdbc && databaseProductName == null) {
            dbms = DbmsLanguageFactory.createDbmsLanguage(connection);
        }
        return dbms;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.cwm.db.connection.ISQLExecutor#getResultSetIterator(orgomg.cwm.foundation.softwaredeployment.
     * DataManager
     * , java.util.List)
     */
    public Iterator<Record> getResultSetIterator(DataManager connection, List<ModelElement> analysedElements)
            throws SQLException {
        TypedReturnCode<java.sql.Connection> sqlconnection = getSQLConnection(connection);
        return getResultSetIterator(connection, analysedElements, sqlconnection);
    }

    @Override
    public Iterator<Record> getResultSetIterator(DataManager connection, List<ModelElement> analysedElements,
            TypedReturnCode<java.sql.Connection> sqlConnection) throws SQLException {
        String sqlString = createSqlStatement(connection, analysedElements, null, sqlConnection, false);
        List<String> elementsName = new ArrayList<String>();
        for (ModelElement element : analysedElements) {
            elementsName.add(element.getName());
        }

        return new ResultSetIterator(sqlConnection.getObject(), sqlString, elementsName);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.cwm.db.connection.ISQLExecutor#executeQuery(orgomg.cwm.foundation.softwaredeployment.DataManager,
     * java.util.List, java.lang.String, org.talend.dataquality.analysis.SampleDataShowWay)
     */
    public List<Object[]> executeQuery(DataManager connection, List<ModelElement> analysedElements, String where)
            throws SQLException {
        getDataFromTable().clear();
        try {
            beginQuery();
        } catch (Exception e1) {
            log.error(e1.getMessage(), e1);
            return getDataFromTable();
        }
        int columnListSize = analysedElements.size();

        TypedReturnCode<java.sql.Connection> sqlconnection = getSQLConnection(connection);
        PreparedStatement prepStmt = null;
        ResultSet resultSet = null;
        try {
            // for JDBC type, use 'statement.setMaxRows(limit)' instead of Limit in sql query;
            int limit = getLimit();
            Connection con = (Connection) connection;
            // TDQ-17324: set the connection's catalog for Snowflake specially when not set db parameter
            if (columnListSize > 0) {
                DatabaseMetaData metadata =
                        ExtractMetaDataUtils.getInstance().getConnectionMetadata(sqlconnection.getObject());
                if (org.talend.utils.sql.ConnectionUtils.isSnowflake(metadata)) {
                    ModelElement modelElement = analysedElements.get(0);
                    ColumnSet columnOwnerAsColumnSet = ColumnHelper.getColumnOwnerAsColumnSet(modelElement);
                    Schema parentSchema = SchemaHelper.getParentSchema(columnOwnerAsColumnSet);
                    Catalog parentCatalog = CatalogHelper.getParentCatalog(parentSchema);
                    if (parentCatalog != null) {
                        changeCatalog(parentCatalog.getName(), sqlconnection.getObject());
                    }
                }
            }
            // TDQ-17324~

            // TDQ-20694
            // Improve performance when'resultSet.next()': Using a Limit keyword like 'LIMIT 50' or others in SQL
            // 1. create a sql with Limit condition by DbmsLanguage.getTopNQuery(...) even if it is JDBC connection
            String query = createSqlStatement(connection, analysedElements, where, sqlconnection, false);
            if (log.isInfoEnabled()) {
                log.info("Executing query: " + query); //$NON-NLS-1$
            }
            try {
                // 2.execute the query with 'LIMIT' or similar ones
                prepStmt = sqlconnection.getObject().prepareStatement(query);
                prepStmt.execute();
            } catch (SQLException e) {
                // 3.'getTopNQuery(...)' may not be fit for some JDBC connection,then use original way 'setMaxRows()'
                // TODO if found the performance issue on this type JDBC Connection, can create a class XXXDbmsLanguage
                // to implement 'getTopNQuery(...)'
                if (limit > 0 && (ConnectionUtils.isTcompJdbc(con) || ConnectionUtils.isGeneralJdbc(con))) {
                    query = createSqlStatement(connection, analysedElements, where, sqlconnection, true);
                    prepStmt = sqlconnection.getObject().prepareStatement(query);
                    prepStmt.setMaxRows(limit);
                } else {
                    throw new SQLException(e);
                }
            }

            // TDQ-20694~
            resultSet = prepStmt.getResultSet();

            while (resultSet.next()) {
                Object[] oneRow = new Object[columnListSize];
                // --- for each column
                for (int i = 0; i < columnListSize; i++) {
                    // --- get content of column
                    oneRow[i] = ResultSetUtils.getBigObject(resultSet, i + 1);
                }
                handleRow(oneRow);
            }
        } catch (Exception e) {
            log.error(e, e);
            if (SQLException.class.isInstance(e)) {
                throw (SQLException) e;
            }
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (prepStmt != null) {
                prepStmt.close();
            }
            ReturnCode closed = this.closeSqlConnection(cachedAnalysis, sqlconnection.getObject());
            if (!closed.isOk()) {
                log.error(closed.getMessage());
            }
        }

        try {
            endQuery();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return getDataFromTable();
    }

}
