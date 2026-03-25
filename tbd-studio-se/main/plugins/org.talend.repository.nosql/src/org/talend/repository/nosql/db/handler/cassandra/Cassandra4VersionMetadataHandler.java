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
package org.talend.repository.nosql.db.handler.cassandra;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.talend.core.model.metadata.MappingTypeRetriever;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.nosql.db.common.cassandra.ICassandraAttributies;
import org.talend.repository.nosql.db.common.cassandra.ICassandraConstants;
import org.talend.repository.nosql.db.util.cassandra.CassandraConnectionUtil;
import org.talend.repository.nosql.exceptions.NoSQLReflectionException;
import org.talend.repository.nosql.exceptions.NoSQLServerException;
import org.talend.repository.nosql.factory.NoSQLClassLoaderFactory;
import org.talend.repository.nosql.i18n.Messages;
import org.talend.repository.nosql.reflection.NoSQLReflection;

/**
 * created by ycbai on 2014年11月26日 Detailled comment
 *
 */
public class Cassandra4VersionMetadataHandler implements ICassandraMetadataHandler {

    private static ICassandraMetadataHandler instance = null;

    private static ICassandraMetadataHandler instanceForDataStax = null;

    private static Object cluster;

    private String dbmsId = ICassandraConstants.DBM40_DATASTAX_ID;

    private Cassandra4VersionMetadataHandler(String _dbmsId) {
        this.dbmsId = _dbmsId;
    }

    public static synchronized ICassandraMetadataHandler getInstanceFor40DataStax() {
        if (instanceForDataStax == null) {
            instanceForDataStax = new Cassandra4VersionMetadataHandler(ICassandraConstants.DBM40_DATASTAX_ID);
        }
        return instanceForDataStax;
    }

    @Override
    public boolean checkConnection(NoSQLConnection connection) throws NoSQLServerException {
        Object session = null;
        try {
            cluster = null;
            initCluster(connection);
            ContextType contextType = null;
            String ksName = connection.getAttributes().get(ICassandraAttributies.DATABASE);
            if (connection.isContextMode()) {
                contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
            }
            if (contextType != null) {
                ksName = ContextParameterUtils.getOriginalValue(contextType, ksName);
            }
            // if cancel to interrupt check connection, throw exception
            if (Thread.currentThread().interrupted()) {
                throw new InterruptedException(); // $NON-NLS-1$
            }
            session = cluster;
            String sessionName = (String) NoSQLReflection.invokeMethod(cluster, "getName"); //$NON-NLS-1$
            if (StringUtils.isBlank(sessionName)) {
                throw new NoSQLServerException(Messages.getString("noSQLConnectionTest.failCheckConnection")); //$NON-NLS-1$
            }

            return true;
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                throw new NoSQLServerException(Messages.getString("noSQLConnectionTest.cancelCheckConnection"), e); //$NON-NLS-1$
            } else {
                throw new NoSQLServerException(e);
            }
        } finally {
            try {
                if (session != null) {
                    NoSQLReflection.invokeMethod(session, "closeAsync"); //$NON-NLS-1$
                }
            } catch (NoSQLReflectionException e) {
                // only for debug
                e.printStackTrace();
            }
        }
    }

    private void initCluster(NoSQLConnection connection) throws NoSQLServerException {
        try {

            if (cluster != null) {
                
                String sessionName = (String) NoSQLReflection.invokeMethod(cluster, "getName"); //$NON-NLS-1$
                if(StringUtils.isNotBlank(sessionName)) {
                    return;
                }
            }
            ClassLoader classLoader = NoSQLClassLoaderFactory.getClassLoader(connection);
            ContextType contextType = null;
            String host = connection.getAttributes().get(ICassandraAttributies.HOST);
            String port = connection.getAttributes().get(ICassandraAttributies.PORT);
            String datacenter = connection.getAttributes().get(ICassandraAttributies.DATACENTER);
            if (connection.isContextMode()) {
                contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
            }
            if (contextType != null) {
                host = ContextParameterUtils.getOriginalValue(contextType, host);
                port = ContextParameterUtils.getOriginalValue(contextType, port);
            }

            cluster = NoSQLReflection.invokeStaticMethod("com.datastax.oss.driver.api.core.CqlSession", "builder",
                    classLoader);
            InetAddress inetAddress = InetAddress.getByName(host);
            InetSocketAddress socketAddress = new InetSocketAddress(inetAddress, Integer.valueOf(port));
            cluster = NoSQLReflection.invokeMethod(cluster, "addContactPoint", new Object[] { socketAddress }, //$NON-NLS-1$
                    InetSocketAddress.class);
            if (StringUtils.isNotBlank(datacenter)) {
                cluster = NoSQLReflection.invokeMethod(cluster, "withLocalDatacenter", new Object[] { datacenter });//$NON-NLS-1$
            }
            cluster = NoSQLReflection.invokeMethod(cluster, "withClassLoader", new Object[] { classLoader }, //$NON-NLS-1$
                    ClassLoader.class);

            // Do authenticate
            String requireAuthAttr = connection.getAttributes().get(ICassandraAttributies.REQUIRED_AUTHENTICATION);
            boolean requireAuth = requireAuthAttr == null ? false : Boolean.valueOf(requireAuthAttr);
            if (requireAuth) {
                String username = connection.getAttributes().get(ICassandraAttributies.USERNAME);
                String password = connection.getValue(connection.getAttributes().get(ICassandraAttributies.PASSWORD),
                        false);
                if (contextType != null) {
                    username = ContextParameterUtils.getOriginalValue(contextType, username);
                    password = ContextParameterUtils.getOriginalValue(contextType, password);
                }
                cluster = NoSQLReflection.invokeMethod(cluster, "withAuthCredentials", //$NON-NLS-1$
                        new Object[] { username, password });
            }
            cluster = NoSQLReflection.invokeMethod(cluster, "build"); //$NON-NLS-1$

        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
    }

    private Object getKeySpace(NoSQLConnection connection) throws NoSQLServerException {
        ContextType contextType = null;
        String ksName = connection.getAttributes().get(ICassandraAttributies.DATABASE);
        if (connection.isContextMode()) {
            contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
        }
        if (contextType != null) {
            ksName = ContextParameterUtils.getOriginalValue(contextType, ksName);
        }
        return getKeySpace(connection, ksName);

    }

    private Object getKeySpace(NoSQLConnection connection, String ksName) throws NoSQLServerException {
        ContextType contextType = null;
        if (StringUtils.isEmpty(ksName)) {
            return null;
        }
        if (connection.isContextMode()) {
            contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
        }
        if (contextType != null) {
            ksName = ContextParameterUtils.getOriginalValue(contextType, ksName);
        }
        // if ksName has quote,then case sensitive
        boolean hasQuote = (ksName.charAt(0) == '"') && (ksName.charAt(ksName.length() - 1) == '"');
        try {
            initCluster(connection);
            List<Object> keySpaces = getKeySpaces(connection);
            for (Object keySpace : keySpaces) {
                String tmpKsName = (String) NoSQLReflection.invokeMethod(keySpace, "getName").toString(); //$NON-NLS-1$
                if (hasQuote) {
                    ksName = TalendQuoteUtils.removeQuotesIfExist(ksName);
                    if (ksName.equals(tmpKsName)) {
                        return keySpace;
                    }
                    // case in-sensitive by default for kaName
                } else if (ksName.equalsIgnoreCase(tmpKsName)) {
                    return keySpace;
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return null;
    }

    private List<Object> getKeySpaces(NoSQLConnection connection) throws NoSQLServerException {
        List<Object> keySpaces = new ArrayList<Object>();
        initCluster(connection);
        try {
            Object metadata = NoSQLReflection.invokeMethod(cluster, "getMetadata"); //$NON-NLS-1$
            Map<Object, Object> map = (Map<Object, Object>) NoSQLReflection.invokeMethod(metadata, "getKeyspaces");
            keySpaces.addAll(map.values());

        } catch (NoSQLReflectionException e) {
            throw new NoSQLServerException(e);
        }
        return keySpaces;
    }

    @Override
    public List<String> getKeySpaceNames(NoSQLConnection connection) throws NoSQLServerException {
        List<String> ksNames = new ArrayList<String>();
        initCluster(connection);
        try {
            List<Object> keySpaces = getKeySpaces(connection);
            for (Object keySpace : keySpaces) {
                String ksName = NoSQLReflection.invokeMethod(keySpace, "getName").toString(); //$NON-NLS-1$
                ksNames.add(ksName);
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return ksNames;
    }

    @Override
    public Set<String> getColumnFamilyNames(NoSQLConnection connection) throws NoSQLServerException {
        return getColumnFamilyNames(connection, null);
    }

    @Override
    public Set<String> getColumnFamilyNames(NoSQLConnection connection, String ksName) throws NoSQLServerException {
        Set<String> cfNames = new HashSet<String>();
        try {
            Object keySpace = null;
            if (ksName == null) {
                keySpace = getKeySpace(connection);
            } else {
                keySpace = getKeySpace(connection, ksName);
                if (keySpace == null) {
                    return cfNames;
                }
            }
            if (keySpace == null) {
                List<String> ksNames = getKeySpaceNames(connection);
                for (String name : ksNames) {
                    cfNames.addAll(getColumnFamilyNames(connection, name));
                }
            } else {
                Map<Object, Object> map = (Map<Object, Object>) NoSQLReflection.invokeMethod(keySpace, "getTables"); //$NON-NLS-1$
                Collection tables = map.values();
                for (Object table : tables) {
                    String cfName = NoSQLReflection.invokeMethod(table, "getName").toString(); //$NON-NLS-1$
                    cfNames.add(cfName);
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return cfNames;
    }

    @Override
    public Set<String> getSuperColumnFamilyNames(NoSQLConnection connection) throws NoSQLServerException {
        return getSuperColumnFamilyNames(connection, null);
    }

    @Override
    public Set<String> getSuperColumnFamilyNames(NoSQLConnection connection, String ksName)
            throws NoSQLServerException {
        Set<String> scfNames = new HashSet<String>();
        ClassLoader classLoader = NoSQLClassLoaderFactory.getClassLoader(connection);

        try {
            if (ksName == null) {
                List<String> ksNames = getKeySpaceNames(connection);
                for (String name : ksNames) {
                    scfNames.addAll(getColumnFamilyNames(connection, name));
                }
            } else {
                initCluster(connection);

                Object toPrepare = NoSQLReflection.newInstance("com.datastax.oss.driver.core.SimpleStatement", //$NON-NLS-1$
                        new Object[] { "select * from schema_columnfamilies where keyspace_name =?" }, classLoader); //$NON-NLS-1$
                Object prepared = NoSQLReflection.invokeMethod(cluster, "prepare", new Object[] { toPrepare }, //$NON-NLS-1$
                        Class.forName("com.datastax.oss.driver.core.RegularStatement", false, classLoader)); //$NON-NLS-1$
                Object statement = NoSQLReflection.invokeMethod(prepared, "bind", //$NON-NLS-1$
                        new Object[] { new Object[] { ksName } }, Object[].class);
                // Statement
                Object resultSet = NoSQLReflection.invokeMethod(cluster, "execute", new Object[] { statement }, //$NON-NLS-1$
                        Class.forName("com.datastax.oss.driver.core.Statement", false, classLoader)); //$NON-NLS-1$
                Iterator iterator = (Iterator) NoSQLReflection.invokeMethod(resultSet, "iterator"); //$NON-NLS-1$
                while (iterator.hasNext()) {
                    Object row = iterator.next();
                    String type = NoSQLReflection.invokeMethod(row, "getString", new Object[] { "type" }).toString(); //$NON-NLS-1$ //$NON-NLS-2$
                    String scfName = NoSQLReflection
                            .invokeMethod(row, "getString", new Object[] { "columnfamily_name" }).toString(); //$NON-NLS-1$ //$NON-NLS-2$
                    if (type.equalsIgnoreCase("super")) { //$NON-NLS-1$
                        scfNames.add(scfName);
                    }
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        } finally {
            try {
                if (cluster != null) {
                    NoSQLReflection.invokeMethod(cluster, "closeAsync"); //$NON-NLS-1$
                }
            } catch (NoSQLReflectionException e) {
                // only for debug
                e.printStackTrace();
            }
        }
        return scfNames;
    }

    @Override
    public List<Object> getColumns(NoSQLConnection connection, String ksName, String cfName)
            throws NoSQLServerException {
        List<Object> columns = new ArrayList<Object>();
        try {
            Object keySpace = getKeySpace(connection, ksName);
            if (keySpace == null) {
                return columns;
            }
            Map<Object, Object> map = (Map<Object, Object>) NoSQLReflection.invokeMethod(keySpace, "getTables"); //$NON-NLS-1$
            Collection<Object> tables = map.values();
            for (Object table : tables) {
                String name = (String) NoSQLReflection.invokeMethod(table, "getName").toString(); //$NON-NLS-1$
                if (name != null && cfName.equals(name)) {
                    Map<Object, Object> mapColumns = (Map<Object, Object>) NoSQLReflection.invokeMethod(table,
                            "getColumns");
                    columns.addAll((List) mapColumns.values()); // $NON-NLS-1$

                    break;
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return columns;
    }

    @Override
    public String getColumnName(NoSQLConnection connection, Object column) throws NoSQLServerException {
        String columnName = ""; //$NON-NLS-1$
        try {
            columnName = NoSQLReflection.invokeMethod(column, "getName").toString(); //$NON-NLS-1$
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return columnName;
    }

    @Override
    public String getColumnTalendType(Object column) throws NoSQLServerException {
        String talendType = null;
        try {
            String dbType = getColumnDbType(column);
            MappingTypeRetriever mappingTypeRetriever = MetadataTalendType.getMappingTypeRetriever(dbmsId);
            talendType = mappingTypeRetriever.getDefaultSelectedTalendType(dbType);
            if (talendType == null) {
                talendType = JavaTypesManager.STRING.getId();
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return talendType;
    }

    @Override
    public String getColumnDbType(Object column) throws NoSQLServerException {
        String dbType = null;
        try {
            Object type = NoSQLReflection.invokeMethod(column, "getType"); //$NON-NLS-1$
            if (type != null) {
                Object typeName = NoSQLReflection.invokeMethod(type, "toString"); //$NON-NLS-1$
                dbType = ((String) NoSQLReflection.invokeMethod(typeName, "toString")); //$NON-NLS-1$
                if (ICassandraConstants.DBM40_DATASTAX_ID.equals(dbmsId)) {
                    dbType = dbType.toUpperCase();
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return dbType;
    }

    @Override
    public void closeConnections() throws NoSQLServerException {
        try {
            if (cluster != null) {
                NoSQLReflection.invokeMethod(cluster, "closeAsync"); //$NON-NLS-1$
            }
        } catch (NoSQLReflectionException e) {
            // only for debug
            e.printStackTrace();
        }
    }

}
