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
package org.talend.repository.nosql.db.util.mongodb;

import static java.lang.String.format;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.apache.commons.lang.StringUtils;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure;
import org.eclipse.jface.preference.IPreferenceStore;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.prefs.SSLPreferenceConstants;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.ui.utils.PluginUtil;
import org.talend.core.utils.StudioSSLContextProvider;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.nosql.constants.INoSQLCommonAttributes;
import org.talend.repository.nosql.db.common.mongodb.IMongoConstants;
import org.talend.repository.nosql.db.common.mongodb.IMongoDBAttributes;
import org.talend.repository.nosql.exceptions.NoSQLReflectionException;
import org.talend.repository.nosql.exceptions.NoSQLServerException;
import org.talend.repository.nosql.factory.NoSQLClassLoaderFactory;
import org.talend.repository.nosql.i18n.Messages;
import org.talend.repository.nosql.reflection.NoSQLReflection;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONException;
import org.talend.utils.json.JSONObject;
import org.talend.utils.security.StudioEncryption;

public class MongoDBConnectionUtil {

    private static List<Object> mongos = new ArrayList<Object>();

    public static synchronized boolean checkConnection(NoSQLConnection connection) throws NoSQLServerException {
        boolean canConnect = true;
        try {
            // if cancel to interrupt check connection, throw exception
            if (Thread.currentThread().interrupted()) {
                throw new InterruptedException();
            }
            Object db = getDB(connection);
            if (db == null) {
                Object mongoClient = getMongoVersioned(connection);
                List<String> databaseNames = getDatabaseNames(connection, mongoClient);
                if (databaseNames != null && databaseNames.size() > 0) {
                    for (String databaseName : databaseNames) {
                        if (StringUtils.isNotEmpty(databaseName)) {
                            // if cancel to interrupt check connection, throw exception
                            if (Thread.currentThread().interrupted()) {
                                throw new InterruptedException();
                            }
                            db = getDB(connection, databaseName, mongoClient);
                            if (db != null) {
                                break;
                            }

                        }
                    }
                }
            }
            if (db == null) {
                throw new NoSQLServerException(Messages.getString("MongoDBConnectionUtil.NoAvailableDatabase")); //$NON-NLS-1$
            }
            // if cancel to interrupt check connection, throw exception
            if (Thread.currentThread().interrupted()) {
                throw new InterruptedException();
            }
            if (isUpgradeLatestVersion(connection)) {
                Iterable<String> iter = (Iterable<String>) NoSQLReflection.invokeMethod(db, "listCollectionNames"); //$NON-NLS-1$
                for(Object dbname:iter) {//empty, just activate the real call to mongodb server
                }
            } else {
                NoSQLReflection.invokeMethod(db, "getStats"); //$NON-NLS-1$
            }
            
        } catch (Exception e) {
            canConnect = false;
            if (e instanceof InterruptedException) {
                throw new NoSQLServerException(Messages.getString("noSQLConnectionTest.cancelCheckConnection"), e); //$NON-NLS-1$
            } else {
                throw new NoSQLServerException(Messages.getString("MongoDBConnectionUtil.CanotConnectDatabase"), e); //$NON-NLS-1$
            }
        }

        return canConnect;
    }

    public static synchronized Object getMongoVersioned(NoSQLConnection connection) throws NoSQLServerException {
        if(isUpgradeVersion(connection)){
            String requireAuthAttr = connection.getAttributes().get(IMongoDBAttributes.REQUIRED_AUTHENTICATION);
            boolean requireAuth = requireAuthAttr == null ? false : Boolean.valueOf(requireAuthAttr);
            //
            String requireEncryptionAttr = connection.getAttributes().get(IMongoDBAttributes.REQUIRED_ENCRYPTION);
            boolean requireEncryption = requireEncryptionAttr == null ? false : Boolean.valueOf(requireEncryptionAttr);
            
            return getMongo(connection, requireAuth, requireEncryption);
        }
        
        return getMongo(connection);
    }
    
    public static synchronized Object getMongo(NoSQLConnection connection) throws NoSQLServerException {
        Object mongo = null;
        ClassLoader classLoader = NoSQLClassLoaderFactory.getClassLoader(connection);
        String useReplicaAttr = connection.getAttributes().get(IMongoDBAttributes.USE_REPLICA_SET);
        boolean useReplica = useReplicaAttr == null ? false : Boolean.valueOf(useReplicaAttr);
        ContextType contextType = null;
        if (connection.isContextMode()) {
            contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
        }
        try {
            if (useReplica) {
                List<Object> addrs = new ArrayList<Object>();
                String replicaSet = connection.getAttributes().get(IMongoDBAttributes.REPLICA_SET);
                List<HashMap<String, Object>> replicaSetList = getReplicaSetList(replicaSet, false);
                for (HashMap<String, Object> rowMap : replicaSetList) {
                    String host = (String) rowMap.get(IMongoConstants.REPLICA_HOST_KEY);
                    String port = (String) rowMap.get(IMongoConstants.REPLICA_PORT_KEY);
                    if (contextType != null) {
                        host = ContextParameterUtils.getOriginalValue(contextType, host);
                        port = ContextParameterUtils.getOriginalValue(contextType, port);
                    }
                    if (host != null && port != null) {
                        Object serverAddress = NoSQLReflection.newInstance("com.mongodb.ServerAddress", //$NON-NLS-1$
                                new Object[] { host, Integer.parseInt(port) }, classLoader, String.class, int.class);
                        addrs.add(serverAddress);
                    }
                }
                mongo = NoSQLReflection.newInstance("com.mongodb.Mongo", new Object[] { addrs }, //$NON-NLS-1$
                        classLoader, List.class);
            } else {
                String host = connection.getAttributes().get(IMongoDBAttributes.HOST);
                String port = connection.getAttributes().get(IMongoDBAttributes.PORT);
                if (contextType != null) {
                    host = ContextParameterUtils.getOriginalValue(contextType, host);
                    port = ContextParameterUtils.getOriginalValue(contextType, port);
                }
                mongo = NoSQLReflection.newInstance("com.mongodb.Mongo", new Object[] { host, Integer.parseInt(port) }, //$NON-NLS-1$
                        classLoader, String.class, int.class);
            }
            mongos.add(mongo);
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return mongo;
    }

    public static synchronized Object getMongo(NoSQLConnection connection, boolean requireAuth, boolean requireEncryption)
            throws NoSQLServerException {
        Object mongo = null;
        ClassLoader classLoader = NoSQLClassLoaderFactory.getClassLoader(connection);
        String useReplicaAttr = connection.getAttributes().get(IMongoDBAttributes.USE_REPLICA_SET);
        boolean useReplica = useReplicaAttr == null ? false : Boolean.valueOf(useReplicaAttr);
        
        String useConnStringAttr = connection.getAttributes().get(IMongoDBAttributes.USE_CONN_STRING);
        boolean useConnString = useConnStringAttr == null ? false : Boolean.valueOf(useConnStringAttr);
        
        ContextType contextType = null;
        if (connection.isContextMode()) {
            contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
        }
        try {
            if(useConnString) {
                mongo = getMongo4ConnStringVersion(connection, contextType, classLoader, requireAuth, requireEncryption);
            } else if(useReplica){
                String replicaSet = connection.getAttributes().get(IMongoDBAttributes.REPLICA_SET);
                List<HashMap<String, Object>> replicaSetList = getReplicaSetList(replicaSet, false);
                Map<String, String> hosts = new HashMap<String, String>();
                for (HashMap<String, Object> rowMap : replicaSetList) {
                    String host = (String) rowMap.get(IMongoConstants.REPLICA_HOST_KEY);
                    String port = (String) rowMap.get(IMongoConstants.REPLICA_PORT_KEY);
                    if (contextType != null) {
                        host = ContextParameterUtils.getOriginalValue(contextType, host);
                        port = ContextParameterUtils.getOriginalValue(contextType, port);
                    }
                    if (host != null && port != null) {
                        hosts.put(host, port);
                    }
                }
                if (isUpgradeLatestVersion(connection)) {
                    mongo = getMongo4LatestVersion(connection, contextType, classLoader, hosts, requireAuth, requireEncryption);
                } else {
                    mongo = getMongo4OlderVersion(connection, contextType, classLoader, hosts, requireAuth, requireEncryption);
                }
            }else{
                String host = connection.getAttributes().get(IMongoDBAttributes.HOST);
                String port = connection.getAttributes().get(IMongoDBAttributes.PORT);
                if (contextType != null) {
                    host = ContextParameterUtils.getOriginalValue(contextType, host);
                    port = ContextParameterUtils.getOriginalValue(contextType, port);
                }
                Map<String, String> hosts = new HashMap<String, String>();
                if (host != null && port != null) {
                    hosts.put(host, port);
                }
                if (isUpgradeLatestVersion(connection)) {
                    mongo = getMongo4LatestVersion(connection, contextType, classLoader, hosts, requireAuth, requireEncryption);
                } else {
                    mongo = getMongo4OlderVersion(connection, contextType, classLoader, hosts, requireAuth, requireEncryption);
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return mongo;
    }

    private static synchronized Object getMongo4LatestVersion(NoSQLConnection connection, ContextType contextType,
            ClassLoader classLoader, Map<String, String> hosts, boolean requireAuth, boolean requireEncryption)
            throws NoSQLServerException {
        List<Object> addrs = new ArrayList<Object>();
        Object mongo = null;

        String user = connection.getAttributes().get(IMongoDBAttributes.USERNAME);
        String pass = connection.getAttributes().get(IMongoDBAttributes.PASSWORD);
        if (contextType != null) {
            user = ContextParameterUtils.getOriginalValue(contextType, user);
            pass = ContextParameterUtils.getOriginalValue(contextType, pass);
        } else {
            pass = connection.getValue(pass, false);
        }
        try {
            Object clientSettingsBuilder = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoClientSettings", "builder", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[0], classLoader);
            Object clusterSettingsBuilder = NoSQLReflection.invokeStaticMethod("com.mongodb.connection.ClusterSettings", //$NON-NLS-1$
                    "builder", new Object[0], classLoader); //$NON-NLS-1$
            Object sslSettingsBuilder = NoSQLReflection.invokeStaticMethod("com.mongodb.connection.SslSettings", "builder", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[0], classLoader);
            
            //
            SSLContext sslContext = null;
            String authMechanism = connection.getAttributes().get(IMongoDBAttributes.AUTHENTICATION_MECHANISM);
            if(requireAuth && IMongoConstants.X509.equals(authMechanism)) {
                sslContext = mongoX509SSLContext(connection);
            } else if (requireEncryption) {
            	sslContext = StudioSSLContextProvider.getContext();
            }
            
            NoSQLReflection.invokeMethod(sslSettingsBuilder, "enabled", new Object[] { requireEncryption }, boolean.class); //$NON-NLS-1$
            if(sslContext != null) {
                NoSQLReflection.invokeMethod(sslSettingsBuilder, "context", new Object[] { sslContext }, SSLContext.class); //$NON-NLS-1$
            }
            
            Object sslSettingsBuild = NoSQLReflection.invokeMethod(sslSettingsBuilder, "build", new Object[0]); //$NON-NLS-1$
            Class<?> sslBlockClasszz = Class.forName("com.mongodb.Block", false, classLoader); //$NON-NLS-1$
            Class[] sslInterfaces = new Class[1];
            sslInterfaces[0] = sslBlockClasszz;
            Object sslBlock = Proxy.newProxyInstance(classLoader, sslInterfaces, (proxy, method, args) -> {
                switch (method.getName()) {
                case "apply": //$NON-NLS-1$
                    if (args[0] != null) {
                        NoSQLReflection.invokeMethod(args[0], "applySettings", new Object[] { sslSettingsBuild }, //$NON-NLS-1$
                                Class.forName("com.mongodb.connection.SslSettings", true, classLoader)); //$NON-NLS-1$
                    }
                    return null;
                default:
                    throw new NoSQLServerException(
                            Messages.getString("MongoDBConnectionUtil.CannotFindMethod", method.getName())); //$NON-NLS-1$
                }
            });
            NoSQLReflection.invokeMethod(clientSettingsBuilder, "applyToSslSettings", new Object[] { sslBlock }, sslBlockClasszz); //$NON-NLS-1$

            for (String host : hosts.keySet()) {
                String port = hosts.get(host);
                Object serverAddress = NoSQLReflection.newInstance("com.mongodb.ServerAddress", //$NON-NLS-1$
                        new Object[] { host, Integer.parseInt(port) }, classLoader, String.class, int.class);
                addrs.add(serverAddress);
                NoSQLReflection.invokeMethod(clusterSettingsBuilder, "hosts", new Object[] { addrs }, List.class); //$NON-NLS-1$
            }

            if (requireAuth) {
                Object credential = getCredential(connection, contextType, user, pass, classLoader);
                NoSQLReflection.invokeMethod(clientSettingsBuilder, "credential", new Object[] { credential }, //$NON-NLS-1$
                        Class.forName("com.mongodb.MongoCredential", true, classLoader)); //$NON-NLS-1$
            }

            Object clusterSettingsBuild = NoSQLReflection.invokeMethod(clusterSettingsBuilder, "build", new Object[0]); //$NON-NLS-1$
            Class<?> blockClasszz = Class.forName("com.mongodb.Block", false, classLoader); //$NON-NLS-1$
            Class[] interfaces = new Class[1];
            interfaces[0] = blockClasszz;
            Object block = Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
                switch (method.getName()) {
                case "apply": //$NON-NLS-1$
                    if (args[0] != null) {
                        NoSQLReflection.invokeMethod(args[0], "applySettings", new Object[] { clusterSettingsBuild }, //$NON-NLS-1$
                                Class.forName("com.mongodb.connection.ClusterSettings", true, classLoader)); //$NON-NLS-1$
                    }
                    return null;
                default:
                    throw new NoSQLServerException(
                            Messages.getString("MongoDBConnectionUtil.CannotFindMethod", method.getName())); //$NON-NLS-1$
                }
            });

            NoSQLReflection.invokeMethod(clientSettingsBuilder, "applyToClusterSettings", new Object[] { block }, blockClasszz); //$NON-NLS-1$
            Object clientSettingsBuild = NoSQLReflection.invokeMethod(clientSettingsBuilder, "build", new Object[0]); //$NON-NLS-1$
            mongo = NoSQLReflection.invokeStaticMethod("com.mongodb.client.MongoClients", "create", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[] { clientSettingsBuild }, classLoader,
                    Class.forName("com.mongodb.MongoClientSettings", true, classLoader)); //$NON-NLS-1$
            mongos.add(mongo);
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return mongo;
    }

    private static synchronized Object getMongo4OlderVersion(NoSQLConnection connection, ContextType contextType,
            ClassLoader classLoader, Map<String, String> hosts, boolean requireAuth, boolean requireEncryption)
            throws NoSQLServerException {
        List<Object> addrs = new ArrayList<Object>();
        List<Object> credentials = new ArrayList<Object>();
        Object mongo = null;

        String user = connection.getAttributes().get(IMongoDBAttributes.USERNAME);
        String pass = connection.getAttributes().get(IMongoDBAttributes.PASSWORD);
        if (contextType != null) {
            user = ContextParameterUtils.getOriginalValue(contextType, user);
            pass = ContextParameterUtils.getOriginalValue(contextType, pass);
        } else {
            pass = connection.getValue(pass, false);
        }
        try {
            Object builder = NoSQLReflection.newInstance("com.mongodb.MongoClientOptions$Builder", new Object[0], classLoader); //$NON-NLS-1$
            
            //
            SSLContext sslContext = null;
            String authMechanism = connection.getAttributes().get(IMongoDBAttributes.AUTHENTICATION_MECHANISM);
            if(requireAuth && authMechanism.equals(IMongoConstants.X509)) {
                sslContext = mongoX509SSLContext(connection);
            } else if (requireEncryption) {
                sslContext = StudioSSLContextProvider.getContext();
            }
            NoSQLReflection.invokeMethod(builder, "sslEnabled", new Object[] { requireEncryption }, boolean.class); //$NON-NLS-1$
            if(sslContext != null) {
                NoSQLReflection.invokeMethod(builder, "sslContext", new Object[] { sslContext }, SSLContext.class); //$NON-NLS-1$
            }
            
            Object build = NoSQLReflection.invokeMethod(builder, "build", new Object[0]); //$NON-NLS-1$

            for (String host : hosts.keySet()) {
                String port = hosts.get(host);
                Object serverAddress = NoSQLReflection.newInstance("com.mongodb.ServerAddress", //$NON-NLS-1$
                        new Object[] { host, Integer.parseInt(port) }, classLoader, String.class, int.class);
                addrs.add(serverAddress);
            }

            if (requireAuth) {
                Object credential = getCredential(connection, contextType, user, pass, classLoader);
                credentials.add(credential);
            }

            mongo = NoSQLReflection.newInstance("com.mongodb.MongoClient", new Object[] { addrs, credentials, build }, //$NON-NLS-1$
                    classLoader, List.class, List.class, Class.forName("com.mongodb.MongoClientOptions", true, classLoader)); //$NON-NLS-1$
            mongos.add(mongo);
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return mongo;
    }

    public static synchronized Object getMongo4ConnStringVersion(NoSQLConnection connection, ContextType contextType,
            ClassLoader classLoader, boolean requireAuth, boolean requireEncryption) throws NoSQLServerException{
        Object mongo = null;
        
        String user = connection.getAttributes().get(IMongoDBAttributes.USERNAME);
        String pass = connection.getAttributes().get(IMongoDBAttributes.PASSWORD);
        if (contextType != null) {
            user = ContextParameterUtils.getOriginalValue(contextType, user);
            pass = ContextParameterUtils.getOriginalValue(contextType, pass);
        } else {
            pass = connection.getValue(pass, false);
        }
        
        try {
            String connString = extractFromContext(connection, IMongoDBAttributes.CONN_STRING);
            String[] usernamePassword = getUsernamePassword(connString);
            if(usernamePassword != null) {
                if(StringUtils.isBlank(user) || StringUtils.isBlank(pass)) {
                    user = usernamePassword[0];
                    pass = usernamePassword[1];
                }
            }
            
            Object clientSettingsBuilder = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoClientSettings", "builder", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[0], classLoader);
            Object connectionString = NoSQLReflection.newInstance("com.mongodb.ConnectionString", new Object[] { connString },
                    classLoader, String.class);
            clientSettingsBuilder = NoSQLReflection.invokeMethod(clientSettingsBuilder, "applyConnectionString",
                    new Object[] { connectionString }, connectionString.getClass());
            Object mongoCredential = getCredential(connection, contextType, user, pass, classLoader);
            clientSettingsBuilder = NoSQLReflection.invokeMethod(clientSettingsBuilder, "credential",
                    new Object[] { mongoCredential }, Class.forName("com.mongodb.MongoCredential", true, classLoader));
            
            String authMechanism = connection.getAttributes().get(IMongoDBAttributes.AUTHENTICATION_MECHANISM);
            //
            if((requireAuth && authMechanism.equals(IMongoConstants.X509)) || requireEncryption) {//enable ssl & context
                Class<?> blockClasszz = Class.forName("com.mongodb.Block", false, classLoader); //$NON-NLS-1$
                Class[] interfaces = new Class[1];
                interfaces[0] = blockClasszz;
                Object block = Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
                    switch (method.getName()) {
                    case "apply": //$NON-NLS-1$
                        if (args[0] != null) {
                            SSLContext sslContext = null;
                            if(requireAuth && authMechanism.equals(IMongoConstants.X509)) {
                                sslContext = mongoX509SSLContext(connection);
                            } else if (requireEncryption) {
                                sslContext = StudioSSLContextProvider.getContext();
                            }
                            NoSQLReflection.invokeMethod(args[0], "context", new Object[] { sslContext}, //$NON-NLS-1$
                                    SSLContext.class); //$NON-NLS-1$
                        }
                        return null;
                    default:
                        throw new NoSQLServerException(
                                Messages.getString("MongoDBConnectionUtil.CannotFindMethod", method.getName())); //$NON-NLS-1$
                    }
                });
                clientSettingsBuilder = NoSQLReflection.invokeMethod(clientSettingsBuilder,"applyToSslSettings",new Object[] {block}, blockClasszz);
                
                blockClasszz = Class.forName("com.mongodb.Block", false, classLoader); //$NON-NLS-1$
                interfaces = new Class[1];
                interfaces[0] = blockClasszz;
                block = Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
                    switch (method.getName()) {
                    case "apply": //$NON-NLS-1$
                        if (args[0] != null) {
                            NoSQLReflection.invokeMethod(args[0], "enabled", new Object[] { true}, //$NON-NLS-1$
                                    boolean.class);
                        }
                        return null;
                    default:
                        throw new Exception(
                                "MongoDBConnectionUtil.CannotFindMethod"+ method.getName()); //$NON-NLS-1$
                    }
                });
                clientSettingsBuilder = NoSQLReflection.invokeMethod(clientSettingsBuilder,"applyToSslSettings",new Object[] {block}, blockClasszz);
            }
            
            
            Object mongoClientSettings = NoSQLReflection.invokeMethod(clientSettingsBuilder, "build", new Object[0]); 
            
            mongo = NoSQLReflection.invokeStaticMethod("com.mongodb.client.MongoClients", "create", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[] { mongoClientSettings }, classLoader,
                    Class.forName("com.mongodb.MongoClientSettings", true, classLoader)); //$NON-NLS-1$
            mongos.add(mongo);
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return mongo;
    }
    
    public static String[] getUsernamePassword(String connectionString) {
        boolean isMongoDBProtocol = connectionString.startsWith(IMongoConstants.MONGODB_PREFIX);
        boolean isSrvProtocol = connectionString.startsWith(IMongoConstants.MONGODB_SRV_PREFIX);
        if (!isMongoDBProtocol && !isSrvProtocol) {
            throw new IllegalArgumentException(format("The connection string is invalid. "
                    + "Connection strings must start with either '%s' or '%s", IMongoConstants.MONGODB_PREFIX, IMongoConstants.MONGODB_SRV_PREFIX));
        }

        String unprocessedConnectionString;
        if (isMongoDBProtocol) {
            unprocessedConnectionString = connectionString.substring(IMongoConstants.MONGODB_PREFIX.length());
        } else {
            unprocessedConnectionString = connectionString.substring(IMongoConstants.MONGODB_SRV_PREFIX.length());
        }

        // Split out the user and host information
        String userAndHostInformation;
        int idx = unprocessedConnectionString.indexOf("/");
        if (idx == -1) {
            if (unprocessedConnectionString.contains("?")) {
                throw new IllegalArgumentException("The connection string contains options without trailing slash");
            }
            userAndHostInformation = unprocessedConnectionString;
            unprocessedConnectionString = "";
        } else {
            userAndHostInformation = unprocessedConnectionString.substring(0, idx);
            unprocessedConnectionString = unprocessedConnectionString.substring(idx + 1);
        }

        // Split the user and host information
        String userInfo;
        String hostIdentifier;
        String userName = null;
        String password = null;
        idx = userAndHostInformation.lastIndexOf("@");
        if (idx > 0) {
            userInfo = userAndHostInformation.substring(0, idx).replace("+", "%2B");
            hostIdentifier = userAndHostInformation.substring(idx + 1);
            int colonCount = countOccurrences(userInfo, ":");
            if (userInfo.contains("@") || colonCount > 1) {
                throw new IllegalArgumentException("The connection string contains invalid user information. "
                        + "If the username or password contains a colon (:) or an at-sign (@) then it must be urlencoded");
            }
            if (colonCount == 0) {
                userName = urldecode(userInfo, false);
            } else {
                idx = userInfo.indexOf(":");
                if (idx == 0) {
                    throw new IllegalArgumentException("No username is provided in the connection string");
                }
                userName = urldecode(userInfo.substring(0, idx), false);
                password = urldecode(userInfo.substring(idx + 1), true);
            }
            
            return new String[] {userName, password};
        }
        
        return null;
    }
    
    private static int countOccurrences(final String haystack, final String needle) {
        return haystack.length() - haystack.replace(needle, "").length();
    }
    
    private static String urldecode(final String input, final boolean password) {
        try {
            return URLDecoder.decode(input, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            if (password) {
                throw new IllegalArgumentException("The connection string contained unsupported characters in the password.");
            } else {
                throw new IllegalArgumentException(format("The connection string contained unsupported characters: '%s'."
                        + "Decoding produced the following error: %s", input, e.getMessage()));
            }
        }
    }
    
    public static SSLContext mongoX509SSLContext(NoSQLConnection connection) {
        String _keystore = extractFromContext(connection, IMongoDBAttributes.X509_CERT);
        String _keystorePass = decrypt(extractFromContext(connection, IMongoDBAttributes.X509_CERT_KEYSTORE_PASSWORD));
        String isUseX509CertAuth = connection.getAttributes().get(IMongoDBAttributes.X509_USE_CERT_AUTH);
        String _truststore = null;
        String _truststorePass = null;
        if("true".equals(isUseX509CertAuth)) {
            _truststore = extractFromContext(connection, IMongoDBAttributes.X509_CERT_AUTH);
            _truststorePass = decrypt(extractFromContext(connection, IMongoDBAttributes.X509_CERT_AUTH_TRUSTSTORE_PASSWORD));
        }
        //
        SSLContext sslContext = null;
        if(_keystore.endsWith("jks")) {
            sslContext = buildSSLContext_JKS(_keystore, _keystorePass, _truststore, _truststorePass, sslContext);
        } else if(_keystore.endsWith("pem")) {
            sslContext = buildSSLContext_PEM(_keystore, _keystorePass, _truststore, _truststorePass, sslContext);
        }

        return sslContext;
    }

    private static SSLContext buildSSLContext_JKS(String _keystore, String _keystorePass, String _truststore,
            String _truststorePass, SSLContext sslContext) {
        try {
            sslContext = SSLContext.getInstance("TLS");
            //keystore
            KeyManagerFactory keyManagerFactory;
            
            String keystoreType = KeyStore.getDefaultType();
            KeyStore keystore = KeyStore.getInstance(keystoreType);
            try (InputStream in = new FileInputStream(_keystore)) {
                keystore.load(in, _keystorePass.toCharArray());
            }
            keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keystore, _keystorePass.toCharArray());
            
            //truststore
            TrustManagerFactory trustManagerFactory = null;
            if(StringUtils.isNotEmpty(_truststore)) {
                KeyStore trustStore = KeyStore.getInstance(keystoreType);
                try (InputStream in = new FileInputStream(_truststore)) {
                    trustStore.load(in, _truststorePass.toCharArray());
                }
                trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(trustStore);    
            }

            
            sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory == null? null:trustManagerFactory.getTrustManagers(), new SecureRandom());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sslContext;
    }
    
    private static SSLContext buildSSLContext_PEM(String _keystore, String _keystorePass, String _truststore,
            String _truststorePass, SSLContext sslContext) {
        SSLContext context = null;
        
        final String pubCertEndDelimiter = "-----END CERTIFICATE-----";
        final String privateKeyStartDelimiter = "-----BEGIN PRIVATE KEY-----";
        final String privateKeyEndDelimiter = "-----END PRIVATE KEY-----";
        final String privateKeyRSAStartDelimiter = "-----BEGIN RSA PRIVATE KEY-----";
        final String privateKeyRSAEndDelimiter = "-----END RSA PRIVATE KEY-----";
        try {
            context = SSLContext.getInstance("TLS");

            byte[] certAndKey = Files.readAllBytes(Paths.get(new File(_keystore).toURI()));
            
            String[] tokens = new String(certAndKey).split(pubCertEndDelimiter);

            byte[] certBytes = tokens[0].concat(pubCertEndDelimiter).getBytes();

            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            java.security.cert.Certificate certificate = certificateFactory.generateCertificate(new ByteArrayInputStream(certBytes));
            X509Certificate cert = (X509Certificate)certificate;//
            
            PrivateKey key = null;
            KeyFactory kf = KeyFactory.getInstance("RSA");
            if(tokens[1].contains(privateKeyStartDelimiter)) {
                byte[] privatekeyBytes = tokens[1].replace(privateKeyStartDelimiter, "").replace(privateKeyEndDelimiter, "").replace("\r\n", "").replace("\n", "").getBytes();
                byte[] decode = Base64.getDecoder().decode(privatekeyBytes);
                PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decode);
                key = kf.generatePrivate(spec);
            } else if(tokens[1].contains(privateKeyRSAStartDelimiter)) {
                byte[] privateKeyBytes = tokens[1].replace(privateKeyRSAStartDelimiter, "").replace(privateKeyRSAEndDelimiter, "").replace("\r\n", "").replace("\n", "").getBytes("UTF-8");
                byte[] decodeBytes = Base64.getDecoder().decode(privateKeyBytes);
                ASN1Object fromByteArray = ASN1Sequence.fromByteArray(decodeBytes);
                RSAPrivateKeyStructure asn1PrivKey = new RSAPrivateKeyStructure((ASN1Sequence) fromByteArray);
                RSAPrivateKeySpec rsaPrivKeySpec = new RSAPrivateKeySpec(asn1PrivKey.getModulus(), asn1PrivKey.getPrivateExponent());
                key= kf.generatePrivate(rsaPrivKeySpec);
            }
            
            KeyStore keystore = KeyStore.getInstance("JKS");
            keystore.load(null);
            keystore.setCertificateEntry("cert-alias", cert);
            keystore.setKeyEntry("key-alias", key, "changeit".toCharArray(), new Certificate[] {cert});

            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(keystore, "changeit".toCharArray());

            KeyManager[] km = kmf.getKeyManagers();
            
            context.init(km, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return context;
    }
    
    private static String extractFromContext(NoSQLConnection connection, String attr) {
        String attrVal = connection.getAttributes().get(attr);
        if (connection.isContextMode()) {
            ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
            attrVal = ContextParameterUtils.getOriginalValue(contextType, attrVal);
        }
        
        return attrVal;
    }
    
    public static synchronized Object getDB(NoSQLConnection connection) throws NoSQLServerException {
        String dbName = connection.getAttributes().get(IMongoDBAttributes.DATABASE);
        if (connection.isContextMode()) {
            ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
            dbName = ContextParameterUtils.getOriginalValue(contextType, dbName);
        }

        return getDB(connection, dbName);
    }

    public static synchronized Object getDB(NoSQLConnection connection, String dbName) throws NoSQLServerException {
        if (StringUtils.isEmpty(dbName)) {
            return null;
        }
        
        Object mongoClient = getMongoVersioned(connection);
        
        return getDB(connection, dbName, mongoClient);
    }
    
    public static synchronized Object getDB(NoSQLConnection connection, String dbName, Object mongoClient) throws NoSQLServerException {
        Object db = null;
        if (StringUtils.isEmpty(dbName)) {
            return db;
        }
        try {
            String requireAuthAttr = connection.getAttributes().get(IMongoDBAttributes.REQUIRED_AUTHENTICATION);
            boolean requireAuth = requireAuthAttr == null ? false : Boolean.valueOf(requireAuthAttr);
            //
            String requireEncryptionAttr = connection.getAttributes().get(IMongoDBAttributes.REQUIRED_ENCRYPTION);
            boolean requireEncryption = requireEncryptionAttr == null ? false : Boolean.valueOf(requireEncryptionAttr);

            updateConfigProperties(requireEncryption);

            if (isUpgradeLatestVersion(connection)) {
                if(mongoClient == null) {
                    mongoClient = getMongo(connection, requireAuth, requireEncryption);
                }
                db = NoSQLReflection.invokeMethod(mongoClient, "getDatabase", //$NON-NLS-1$
                        new Object[] { dbName });
            } else if (isUpgradeVersion(connection)) {
                if(mongoClient == null) {
                    mongoClient = getMongo(connection, requireAuth, requireEncryption);
                }
                db = NoSQLReflection.invokeMethod(mongoClient, "getDB", //$NON-NLS-1$
                        new Object[] { dbName });
            } else {
                if(mongoClient == null) {
                    mongoClient = getMongo(connection);
                }
                db = NoSQLReflection.invokeMethod(mongoClient, "getDB", new Object[] { dbName }); //$NON-NLS-1$
                // Do authenticate
                if (requireAuth) {
                    String userName = connection.getAttributes().get(IMongoDBAttributes.USERNAME);
                    String password = connection.getValue(connection.getAttributes().get(IMongoDBAttributes.PASSWORD), false);
                    if (connection.isContextMode()) {
                        ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
                        userName = ContextParameterUtils.getOriginalValue(contextType, userName);
                        password = ContextParameterUtils.getOriginalValue(contextType, password);
                    }
                    if (userName != null && password != null) {
                        boolean authorized = (Boolean) NoSQLReflection.invokeMethod(db,
                                "authenticate", new Object[] { userName, password.toCharArray() }); //$NON-NLS-1$
                        if (!authorized) {
                            throw new NoSQLServerException(Messages.getString("MongoDBConnectionUtil.ConnotLogon", dbName)); //$NON-NLS-1$
                        }
                    }
                }
            }
        } catch (NoSQLReflectionException e) {
            throw new NoSQLServerException(e);
        }

        return db;
    }

    public static synchronized List<String> getDatabaseNames(NoSQLConnection connection) throws NoSQLServerException {
        Object mongoClient = getMongoVersioned(connection);
        
        return getDatabaseNames(connection, mongoClient);
    }
    
    public static synchronized List<String> getDatabaseNames(NoSQLConnection connection, Object mongoClient) throws NoSQLServerException {
        List<String> databaseNames = null;
        try {
            databaseNames = Collections.synchronizedList(new ArrayList<String>());
            if(isUpgradeVersion(connection)){
                String requireAuthAttr = connection.getAttributes().get(IMongoDBAttributes.REQUIRED_AUTHENTICATION);
                boolean requireAuth = requireAuthAttr == null ? false : Boolean.valueOf(requireAuthAttr);
                //
                String requireEncryptionAttr = connection.getAttributes().get(IMongoDBAttributes.REQUIRED_ENCRYPTION);
                boolean requireEncryption = requireEncryptionAttr == null ? false : Boolean.valueOf(requireEncryptionAttr);
                
                if(mongoClient == null) {
                    mongoClient = getMongo(connection, requireAuth, requireEncryption);
                }
                
                Iterable mongoIterable = (Iterable)NoSQLReflection.invokeMethod(mongoClient, "listDatabaseNames");
                for(Object dbname:mongoIterable) {
                    databaseNames.add((String)dbname);
                }
            }else{
                if(mongoClient == null) {
                    mongoClient = getMongo(connection);
                }
                Iterable mongoIterable = (Iterable)NoSQLReflection.invokeMethod(mongoClient, "listDatabaseNames");
                for(Object dbname:mongoIterable) {
                    databaseNames.add((String)dbname);
                }
            }
        } catch (NoSQLReflectionException e) {
            throw new NoSQLServerException(e);
        }

        return databaseNames;
    }

    public static synchronized Set<String> getCollectionNames(NoSQLConnection connection) throws NoSQLServerException {
        return getCollectionNames(connection, null);
    }
    
    public static synchronized Set<String> getCollectionNames(NoSQLConnection connection, String dbName)
            throws NoSQLServerException {
        return getCollectionNames(connection, null, null);
    }

    public static synchronized Set<String> getCollectionNames(NoSQLConnection connection, String dbName, Object mongoClient)
            throws NoSQLServerException {
        Set<String> collectionNames = new HashSet<String>();
        Object db = null;
        
        if(mongoClient == null) {
            mongoClient = getMongoVersioned(connection);
        }
        if (dbName != null) {
            db = getDB(connection, dbName, mongoClient);
        } else {
            dbName = connection.getAttributes().get(IMongoDBAttributes.DATABASE);
            if (connection.isContextMode()) {
                ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
                dbName = ContextParameterUtils.getOriginalValue(contextType, dbName);
            }
            db = getDB(connection, dbName, mongoClient);
        }
        if (db == null) {
            List<String> databaseNames = getDatabaseNames(connection, mongoClient);
            for (String databaseName : databaseNames) {
                collectionNames.addAll(getCollectionNames(connection, databaseName, mongoClient));
            }
        } else {
            try {
                if(isUpgradeLatestVersion(connection)){
                    Iterable<String> iter = (Iterable<String>) NoSQLReflection.invokeMethod(db, "listCollectionNames");//$NON-NLS-1$
                    Iterator<String> iterator = iter.iterator();
                    while (iterator.hasNext()) {
                        collectionNames.add(iterator.next());
                    }
                } else {
                    collectionNames = (Set<String>) NoSQLReflection.invokeMethod(db, "getCollectionNames"); //$NON-NLS-1$
                }
            } catch (NoSQLReflectionException e) {
                throw new NoSQLServerException(e);
            }
        }

        return collectionNames;
    }

    public static synchronized void closeConnections() throws NoSQLServerException {
        try {
            for (Object mongo : mongos) {
                if (mongo != null) {
                    NoSQLReflection.invokeMethod(mongo, "close"); //$NON-NLS-1$
                }
            }
        } catch (NoSQLReflectionException e) {
            throw new NoSQLServerException(e);
        }
    }

    public static List<HashMap<String, Object>> getReplicaSetList(String replicaSetJsonStr, boolean includeQuotes)
            throws JSONException {
        List<HashMap<String, Object>> replicaSet = new ArrayList<HashMap<String, Object>>();
        if (StringUtils.isNotEmpty(replicaSetJsonStr)) {
            JSONArray jsonArr = new JSONArray(replicaSetJsonStr);
            for (int i = 0; i < jsonArr.length(); i++) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                JSONObject object = jsonArr.getJSONObject(i);
                Iterator<String> it = object.keys();
                while (it.hasNext()) {
                    String key = StringUtils.trimToNull(it.next());
                    String value = StringUtils.trimToNull(String.valueOf(object.get(key)));
                    if (includeQuotes) {
                        value = TalendQuoteUtils.addQuotesIfNotExist(value);
                    } else {
                        value = TalendQuoteUtils.removeQuotesIfExist(value);
                    }
                    if (IMongoConstants.REPLICA_PORT_KEY.equals(key)) {
                        value = TalendQuoteUtils.removeQuotesIfExist(value);
                    }
                    map.put(key, value);
                }
                replicaSet.add(map);
            }
        }

        return replicaSet;
    }
    
    public static boolean isUpgradeLatestVersion(NoSQLConnection connection) {
        String dbVersion = connection.getAttributes().get(INoSQLCommonAttributes.DB_VERSION);
        return isUpgradeLatestVersion(dbVersion);
    }

    public static boolean isUpgradeLatestVersion(String dbVersion) {
        try{
             Pattern pattern = Pattern.compile("MONGODB_(\\d+)_(\\d+)");//$NON-NLS-1$
             Matcher matcher = pattern.matcher(dbVersion);
             while (matcher.find()) {
                 String firstStr = matcher.group(1);
                 Integer firstInt = Integer.parseInt(firstStr);
                 if(firstInt>4){//MONGODB_4_4_X is latest version
                     return true;
                 }else if(firstInt<4){
                     return false;
                 }else{
                     String secondStr= matcher.group(2);
                     Integer secondInt = Integer.parseInt(secondStr);
                     if(secondInt<4){
                         return false;
                     }else{
                         return true;
                     }
                 }
             }
        } catch (Exception ex) {
            //do nothing
        }
        return false;
    }

    public static boolean isUpgradeVersion(NoSQLConnection connection) {
        String dbVersion = connection.getAttributes().get(INoSQLCommonAttributes.DB_VERSION);
        try{
             Pattern pattern = Pattern.compile("MONGODB_(\\d+)_(\\d+)");//$NON-NLS-1$
             Matcher matcher = pattern.matcher(dbVersion);
             while (matcher.find()) {
                 String firstStr = matcher.group(1);
                 Integer firstInt = Integer.parseInt(firstStr);
                 if(firstInt>3){
                     return true;
                 }else if(firstInt<3){
                     return false;
                 }else{
                     String secondStr= matcher.group(2);
                     Integer secondInt = Integer.parseInt(secondStr);
                     if(secondInt<5){
                         return false;
                     }else{
                         return true;
                     }
                 }
             }
        } catch (Exception ex) {
            //do nothing
        }
        return false;
    }

    public static void updateConfigProperties(boolean isUseSSL) {
        if (isUseSSL) {
            try {
                IPreferenceStore store = CoreRuntimePlugin.getInstance().getCoreService().getPreferenceStore();
                File configFile = PluginUtil.getStudioConfigFile();
                Properties configProperties = PluginUtil.readProperties(configFile);
                String truststoreType = store.getString(SSLPreferenceConstants.TRUSTSTORE_TYPE);
                if(!StringUtils.isEmpty(truststoreType)) {
                    configProperties.setProperty(SSLPreferenceConstants.TRUSTSTORE_TYPE, truststoreType);
                }
                configProperties.setProperty(SSLPreferenceConstants.TRUSTSTORE_FILE,
                        store.getString(SSLPreferenceConstants.TRUSTSTORE_FILE));
                configProperties.setProperty(SSLPreferenceConstants.TRUSTSTORE_PASSWORD,
                        StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM)
                                .decrypt(store.getString(SSLPreferenceConstants.TRUSTSTORE_PASSWORD)));
                PluginUtil.saveProperties(configFile, configProperties, null);
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
    }
    
    //TUP-32857, keep the same configuration as tMongoDBConnection and the logic is referred from GeneralMongoDBConnectionSettings_4_4_X.javajet
    private static Object getCredential(NoSQLConnection connection, ContextType contextType, String user, String pass, ClassLoader classLoader) throws Exception{
        // Client Credentials
        String authDatabase = connection.getAttributes().get(IMongoDBAttributes.AUTHENTICATION_DATABASE);
        String authMechanism = connection.getAttributes().get(IMongoDBAttributes.AUTHENTICATION_MECHANISM);
        String database = connection.getAttributes().get(IMongoDBAttributes.DATABASE);
        String setAuthDatabase = connection.getAttributes().get(IMongoDBAttributes.SET_AUTHENTICATION_DATABASE);
        boolean useAuthDB = setAuthDatabase == null ? false : Boolean.valueOf(setAuthDatabase);
        authDatabase = useAuthDB ? authDatabase : database;
        if (contextType != null) {
            authDatabase = ContextParameterUtils.getOriginalValue(contextType, authDatabase);
            database = ContextParameterUtils.getOriginalValue(contextType, database);
        }
        //for backport on legacy metadata configuration
        if (authMechanism == null) authMechanism = IMongoConstants.SCRAMSHA1_MEC;
        Object credential = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoCredential", "createScramSha1Credential", //$NON-NLS-1$ //$NON-NLS-2$
                new Object[] { user, database, pass.toCharArray() }, classLoader, String.class, String.class,
                char[].class);
        if (authMechanism.equals(IMongoConstants.NEGOTIATE_MEC)) {
            credential = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoCredential", "createCredential", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[] { user, authDatabase, pass.toCharArray() }, classLoader, String.class, String.class,
                    char[].class);
        } else if (authMechanism.equals(IMongoConstants.PLAIN_MEC)) {
            credential = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoCredential", "createPlainCredential", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[] { user, "$external", pass.toCharArray() }, classLoader, String.class, String.class,
                    char[].class);
        } else if (authMechanism.equals(IMongoConstants.SCRAMSHA1_MEC)) {
            credential = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoCredential", "createScramSha1Credential", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[] { user, authDatabase, pass.toCharArray() }, classLoader, String.class, String.class,
                    char[].class);
        } else if (authMechanism.equals(IMongoConstants.SCRAMSHA256_MEC)) {
            credential = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoCredential", "createScramSha256Credential", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[] { user, authDatabase, pass.toCharArray() }, classLoader, String.class, String.class,
                    char[].class);
        } else if (authMechanism.equals(IMongoConstants.KERBEROS_MEC)) {
            String krbUserPrincipal = connection.getAttributes().get(IMongoDBAttributes.KRB_USER_PRINCIPAL);
            String krbRealm = connection.getAttributes().get(IMongoDBAttributes.KRB_REALM);
            String krbKdc = connection.getAttributes().get(IMongoDBAttributes.KRB_KDC);
            if (contextType != null) {
                krbUserPrincipal = ContextParameterUtils.getOriginalValue(contextType, krbUserPrincipal);
                krbRealm = ContextParameterUtils.getOriginalValue(contextType, krbRealm);
                krbKdc = ContextParameterUtils.getOriginalValue(contextType, krbKdc);
            }
            // GSSAPI SASL (KERBEROS)
            System.setProperty("java.security.krb5.realm", krbRealm);
            System.setProperty("java.security.krb5.kdc", krbKdc);
            System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
            credential = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoCredential", "createGSSAPICredential", //$NON-NLS-1$ //$NON-NLS-2$
                    new Object[] { krbUserPrincipal }, classLoader, String.class);
        } else if (authMechanism.equals(IMongoConstants.X509)) {
            credential = NoSQLReflection.invokeStaticMethod("com.mongodb.MongoCredential", "createMongoX509Credential", new Object[0], classLoader);
        }
        return credential;
    }
    
    public static String encrypt(String src) {
        return StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).encrypt(src);
    }
    public static String decrypt(String src) {
        return StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).decrypt(src);
    }
}
