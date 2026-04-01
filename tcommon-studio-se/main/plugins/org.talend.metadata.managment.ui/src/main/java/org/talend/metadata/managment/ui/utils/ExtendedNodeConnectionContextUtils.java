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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.ui.context.model.table.ConectionAdaptContextVariableModel;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.model.IConnParamName;

/**
 * created by ldong on Dec 18, 2014 Detailled comment
 *
 */
public class ExtendedNodeConnectionContextUtils {

    public enum EHadoopParamName implements IConnParamName {
        // NoSql param
        Server,
        Port,
        ConnectionString,
        Keyspace,
        Datacenter,
        Database,
        Databasepath,
        UserName,
        Password,
        Keystore,
        KeystorePass,
        Truststore,
        TruststorePass,
        ServerUrl,
        ReplicaSets,
        ReplicaHost,
        ReplicaPort,
        
        AuthenticationDatabase,
        UserPrincipal,
        Realm,
        KDCServer,

        // Hadoop standard param
        NameNodeUri,
        JobTrackerUri,
        ResourceManager,
        ResourceManagerScheduler,
        JobHistory,
        StagingDirectory,
        NameNodePrin,
        JTOrRMPrin,
        JobHistroyPrin,
        User,
        Group,
        Principal,
        KeyTab,
        ClouderaNavigatorUsername,
        ClouderaNavigatorPassword,
        ClouderaNavigatorUrl,
        ClouderaNavigatorMetadataUrl,
        ClouderaNavigatorClientUrl,

        maprTPassword,
        maprTCluster,
        maprTDuration,
        maprTHomeDir,
        maprTHadoopLogin,

        // Hadoop hd insight param
        WebHostName,
        WebPort,
        WebUser,
        WebJobResFolder,
        HDIUser,
        HDIPassword,
        KeyAzureHost,
        KeyAzureContainer,
        KeyAzuresUser,
        KeyAzurePassword,
        KeyAzureDeployBlob,
        
        // Azure Synapse param
        SynapseHostName,
        SynapseAuthToken,
        SynapseSparkPools,
        SynapseFsHostName,
        SynapseFsContainer,
        SynapseAuthType,
        SynapseFsUserName,
        SynapseFsPassword,
        SynapseClientId,
        SynapseDirectoryId,
        SynapseSecretKey,
        UseSynapseCertificate,
        SynapseClientCertificate,
        SynapseDeployBlob,
        SynapseDriverMemory,
        SynapseDriverCores,
        SynapseExecutorMemory,
        UseTuningProperties,

        // Hcatalog param
        HCatalogHostName,
        HCatalogPort,
        HCatalogUser,
        HCatalogPassword,
        HCatalogKerPrin,
        HCatalogRealm,
        HCatalogDatabase,
        HcataLogRowSeparator,
        HcatalogFileSeparator,

        // Hdfs param
        HdfsUser,
        HdfsRowSeparator,
        HdfsFileSeparator,
        HdfsRowHeader,

        // Oozie
        OozieUser,
        OozieEndpoint,

        //
        WebHDFSSSLTrustStorePath,
        WebHDFSSSLTrustStorePassword,

        // Google Dataproc
        GoogleProjectId,
        GoogleClusterId,
        GoogleRegion,
        GoogleJarsBucket,
        useGoogleCredentials,
        GoogleAuthMode,
        PathToGoogleCredentials,
        GoogleOauthToken,

        // Override hadoop configuration
        setHadoopConf,
        hadoopConfSpecificJar,

        // DataBricks
        DataBricksEndpoint,
        DatabricksRunMode,
        DataBricksCloudProvider,
        DataBricksClusterId,
        DataBricksToken,
        DataBricksDBFSDepFolder,
        DataBricksClusterType,
        DataBricksRuntimeVersion,
        DataBricksDriverNodeType,
        DataBricksNodeType,
        
        // Kubernetes
        k8sSubmitMode,
        k8sMaster,
        k8sInstances,
        k8sUseRegistrySecret,
        k8sRegistrySecret,
        k8sImage,
        k8sNamespace,
        k8sServiceAccount,
        k8sDistUpload,
        k8sS3Bucket,
        k8sS3Folder,
        k8sS3Credentials,
        k8sS3AccessKey,
        k8sS3SecretKey,
        k8sBlobAccount,
        k8sBlobContainer,
        k8sBlobSecretKey,
        k8sAzureAccount,
        k8sAzureCredentials,
        k8sAzureContainer,
        k8sAzureSecretKey,
        k8sAzureAADKey,
        k8sAzureAADClientID,
        k8sAzureAADDirectoryID,
        
        //Knox
        SparkMode,
        UseKnox,
        KnoxUrl,
        KnoxUsername,
        KnoxPassword,
        KnoxDirectory,
        KnoxTimeout,
        
        //Cde
        CdeApiEndPoint,
        CdeAutoGenerateToken,
        CdeToken,
        CdeTokenEndpoint,
        CdeWorkloadUser,
        CdeWorkloadPassword,
        
        //Standalone
        StandaloneMaster,
        StandaloneConfigureExecutors,
        StandaloneExecutorMemory,
        StandaloneExecutorCore,
        
        //spark submit script
        SparkSubmitScriptHome
    }

    static List<IContextParameter> getContextVariables(final String prefixName, Connection conn, Set<IConnParamName> paramSet) {
        List<IContextParameter> varList = new ArrayList<IContextParameter>();
        for (IRepositoryContextHandler handler : RepositoryContextManager.getHandlers()) {
            if (handler.isRepositoryConType(conn)) {
                varList = handler.createContextParameters(prefixName, conn, paramSet);
            }
        }
        return varList;
    }

    static void setConnectionPropertiesForContextMode(String prefixName, Connection conn, Set<IConnParamName> paramSet) {
        if (conn == null || prefixName == null) {
            return;
        }
        for (IRepositoryContextHandler handler : RepositoryContextManager.getHandlers()) {
            if (handler.isRepositoryConType(conn)) {
                handler.setPropertiesForContextMode(prefixName, conn, paramSet);
            }
        }
    }

    static void setConnectionPropertiesForExistContextMode(Connection conn, Set<IConnParamName> paramSet,
            Map<ContextItem, List<ConectionAdaptContextVariableModel>> adaptMap) {
        if (conn == null) {
            return;
        }
        for (IRepositoryContextHandler handler : RepositoryContextManager.getHandlers()) {
            if (handler.isRepositoryConType(conn)) {
                handler.setPropertiesForExistContextMode(conn, paramSet, adaptMap);
            }
        }
    }

    static void revertPropertiesForContextMode(Connection conn, ContextType contextType) {
        if (conn == null) {
            return;
        }
        for (IRepositoryContextHandler handler : RepositoryContextManager.getHandlers()) {
            if (handler.isRepositoryConType(conn)) {
                handler.revertPropertiesForContextMode(conn, contextType);
            }
        }
    }

    static Set<String> getAdditionalPropertiesVariablesForExistContext(Connection conn) {
        Set<String> varList = new HashSet<String>();
        if (conn == null) {
            return Collections.emptySet();
        }
        for (IRepositoryContextHandler handler : RepositoryContextManager.getHandlers()) {
            if (handler.isRepositoryConType(conn)) {
                varList = handler.getConAdditionPropertiesForContextMode(conn);
            }
        }
        return varList;
    }

    public static String getReplicaParamName(EHadoopParamName param, int number) {
        if (param == EHadoopParamName.ReplicaHost || param == EHadoopParamName.ReplicaPort) {
            return param.name() + ConnectionContextHelper.LINE + number;
        }
        return null;
    }

}
