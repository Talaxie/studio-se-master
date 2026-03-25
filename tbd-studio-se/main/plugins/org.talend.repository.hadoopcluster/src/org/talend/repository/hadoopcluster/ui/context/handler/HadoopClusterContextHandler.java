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
package org.talend.repository.hadoopcluster.ui.context.handler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.talend.core.database.conn.ConnParameterKeys;
import org.talend.core.hadoop.repository.HadoopRepositoryUtil;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.ui.context.model.table.ConectionAdaptContextVariableModel;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.model.IConnParamName;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.ui.utils.ExtendedNodeConnectionContextUtils.EHadoopParamName;
import org.talend.metadata.managment.ui.wizard.context.AbstractRepositoryContextHandler;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnection;

/**
 * created by ldong on Mar 16, 2015 Detailled comment
 *
 */
public class HadoopClusterContextHandler extends AbstractRepositoryContextHandler {

    @Override
    public boolean isRepositoryConType(Connection connection) {
        return connection instanceof HadoopClusterConnection;
    }

    @Override
    public List<IContextParameter> createContextParameters(String prefixName, Connection connection, Set<IConnParamName> paramSet) {
        List<IContextParameter> varList = new ArrayList<IContextParameter>();
        if (connection instanceof HadoopClusterConnection) {
            HadoopClusterConnection conn = (HadoopClusterConnection) connection;

            String paramPrefix = prefixName + ConnectionContextHelper.LINE;
            String paramName = null;
            for (IConnParamName param : paramSet) {
                if (param instanceof EHadoopParamName) {
                    EHadoopParamName hadoopParam = (EHadoopParamName) param;
                    paramName = paramPrefix + hadoopParam;
                    switch (hadoopParam) {
                    case NameNodeUri:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getNameNodeURI());
                        break;
                    case JobTrackerUri:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getJobTrackerURI());
                        break;
                    case ResourceManager:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getJobTrackerURI());
                        break;
                    case ResourceManagerScheduler:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getRmScheduler());
                        break;
                    case JobHistory:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getJobHistory());
                        break;
                    case StagingDirectory:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getStagingDirectory());
                        break;
                    case NameNodePrin:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getPrincipal());
                        break;
                    case JTOrRMPrin:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getJtOrRmPrincipal());
                        break;
                    case JobHistroyPrin:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getJobHistoryPrincipal());
                        break;
                    case User:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getUserName());
                        break;
                    case Group:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getGroup());
                        break;
                    case Principal:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getKeytabPrincipal());
                        break;
                    case KeyTab:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getKeytab());
                        break;
                    case maprTPassword:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getMaprTPassword(),
                                JavaTypesManager.PASSWORD);
                        break;
                    case maprTCluster:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getMaprTCluster());
                        break;
                    case maprTDuration:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getMaprTDuration(),
                                JavaTypesManager.LONG);
                        break;
                    case maprTHomeDir:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getMaprTHomeDir());
                        break;
                    case maprTHadoopLogin:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getMaprTHadoopLogin());
                        break;

                    case WebHostName:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_HOSTNAME));
                        break;
                    case WebPort:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_PORT));
                        break;
                    case WebUser:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_USERNAME));
                        break;
                    case WebJobResFolder:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_JOB_RESULT_FOLDER));
                        break;
                    case HDIUser:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HDI_USERNAME));
                        break;
                    case HDIPassword:
                        ConnectionContextHelper
                                .createParameters(varList, paramName,
                                        conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HDI_PASSWORD),
                                        JavaTypesManager.PASSWORD);
                        break;
                    case KeyAzureHost:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AZURE_HOSTNAME));
                        break;
                    case KeyAzureContainer:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AZURE_CONTAINER));
                        break;
                    case KeyAzuresUser:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AZURE_USERNAME));
                        break;
                    case KeyAzurePassword:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AZURE_PASSWORD),
                                JavaTypesManager.PASSWORD);
                        break;
                    case KeyAzureDeployBlob:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AZURE_DEPLOY_BLOB));
                        break;
                    case GoogleProjectId:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_PROJECT_ID));
                        break;
                    case GoogleClusterId:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_CLUSTER_ID));
                        break;
                    case GoogleRegion:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_REGION));
                        break;
                    case GoogleJarsBucket:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_JARS_BUCKET));
                        break;
                    case useGoogleCredentials:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_PROVIDE_GOOGLE_CREDENTIALS));
                        break;
                    case GoogleAuthMode:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AUTH_MODE));
                        break;
                    case PathToGoogleCredentials:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_PATH_TO_GOOGLE_CREDENTIALS));
                        break;
                    case GoogleOauthToken:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                              conn.getParameters().get(ConnParameterKeys.CONN_PARA_OAUTH2_TOKEN_TO_GOOGLE_CREDENTIALS), JavaTypesManager.PASSWORD );
                        break;
                    case DataBricksEndpoint:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_ENDPOINT));
                        break;
                    case DataBricksCloudProvider:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER));
                        break;
                    case DatabricksRunMode:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUN_MODE));
                        break;
                    case DataBricksClusterId:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_ID));
                        break;
                    case DataBricksToken:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_TOKEN), JavaTypesManager.PASSWORD );
                        break;
                    case DataBricksDBFSDepFolder:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DBFS_DEP_FOLDER));
                    case DataBricksClusterType:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_TYPE));
                    case DataBricksDriverNodeType:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DRIVER_NODE_TYPE));
                    case DataBricksNodeType:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_NODE_TYPE));
                    case DataBricksRuntimeVersion:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUNTIME_VERSION));
                    case setHadoopConf:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SET_HADOOP_CONF),
                                JavaTypesManager.BOOLEAN);
                        break;
                    case hadoopConfSpecificJar:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CONF_SPECIFIC_JAR));
                        break;
                    case WebHDFSSSLTrustStorePath:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getWebHDFSSSLTrustStorePath());
                        break;
                    case WebHDFSSSLTrustStorePassword:
                        ConnectionContextHelper.createParameters(varList, paramName, conn.getWebHDFSSSLTrustStorePassword(),JavaTypesManager.PASSWORD);
                        break;
                    case UseKnox:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_USE_KNOX));
                        break;
                    case SparkMode:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SPARK_MODE));
                        break;
                    case KnoxUrl:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_KNOX_URL));
                        break;
                    case KnoxUsername:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_KNOX_USER));
                        break;
                    case KnoxPassword:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_KNOX_PASSWORD), JavaTypesManager.PASSWORD);
                        break;
                    case KnoxDirectory:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_KNOX_DIRECTORY));
                        break;
                    case KnoxTimeout:
                        ConnectionContextHelper.createParameters(varList, paramName,
                            conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_KNOX_TIMEOUT));
                        break;
                    case SynapseHostName:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_HOST));
                        break;
                    case SynapseAuthToken:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_TOKEN), JavaTypesManager.PASSWORD);
                        break;
                    case SynapseSparkPools:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_SPARK_POOLS));
                        break;
                    case SynapseFsHostName:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_HOSTNAME));
                        break;
                    case SynapseFsContainer:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_CONTAINER));
                        break;
                    case SynapseAuthType:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_MODE));
                        break;    
                    case SynapseFsUserName:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_USERNAME));
                        break;
                    case SynapseFsPassword:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_PASSWORD), JavaTypesManager.PASSWORD);
                        break;
                    case SynapseClientId:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_APPLICATION_ID));
                        break;  
                    case SynapseDirectoryId:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DIRECTORY_ID));
                        break;  
                    case SynapseSecretKey:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_KEY));
                        break;
                    case UseSynapseCertificate:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_USE_SYNAPSE_CLIENT_CERTIFICATE));
                    	break;
                    case SynapseClientCertificate:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_CERTIFICATE));
                    	break;
                    case SynapseDeployBlob:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DEPLOY_BLOB));
                        break;
                    case SynapseDriverMemory:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DRIVER_MEMORY));
                        break;
                    case SynapseDriverCores:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DRIVER_CORES));
                        break;
                    case SynapseExecutorMemory:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_EXECUTOR_MEMORY));
                        break;
                    case UseTuningProperties:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_TUNING_PROPERTIES));
                        break;
                    case k8sMaster:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_MASTER));
                    	 break;
                    case k8sInstances:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_INSTANCES));
                    	 break;
                    case k8sRegistrySecret:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_REGISTRYSECRET));
                    	 break;
                    case k8sImage:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_IMAGE));
                    	 break;
                    case k8sNamespace:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_NAMESPACE));
                    	 break;
                    case k8sServiceAccount:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_SERVICEACCOUNT));
                    	 break;
                    case k8sS3Bucket:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3BUCKET));
                    	 break;
                    case k8sS3Folder:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3FOLDER));
                    	 break;
                    case k8sS3Credentials:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3CREDENTIALS));
                    	 break;
                    case k8sS3AccessKey:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3ACCESSKEY));
                    	 break;
                    case k8sS3SecretKey:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3SECRETKEY), JavaTypesManager.PASSWORD);
                    	 break;
                    case k8sBlobAccount:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBACCOUNT));
                    	 break;
                    case k8sBlobContainer:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBCONTAINER));
                    	 break;
                    case k8sBlobSecretKey:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBSECRETKEY), JavaTypesManager.PASSWORD);
                    	 break;
                    case k8sAzureAccount:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREACCOUNT));
                    	 break;
                    case k8sAzureContainer:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURECONTAINER));
                    	 break;
                    case k8sAzureSecretKey:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURESECRETKEY), JavaTypesManager.PASSWORD);
                    	 break;
                    case k8sAzureAADKey:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADKEY), JavaTypesManager.PASSWORD);
                    	 break;
                    case k8sAzureAADClientID:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADCLIENTID));
                    	 break;
                    case k8sAzureAADDirectoryID:
                    	ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADDIRECTORYID));
                    	 break;
                    case StandaloneMaster:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_MASTER));
                        break;
                    case StandaloneConfigureExecutors : 
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_CONFIGURE_EXEC),
                                JavaTypesManager.BOOLEAN);
                        break;
                    case StandaloneExecutorCore:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_CORE));
                        break;
                    case StandaloneExecutorMemory:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_MEMORY));
                        break;
                    case SparkSubmitScriptHome:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_UNIV_SPARK_SUBMIT_SCRIPT_HOME));
                        break;
                    case CdeApiEndPoint:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_CDE_API_ENDPOINT));
                        break;
                    case CdeToken:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN), JavaTypesManager.PASSWORD);
                        break;
                    case CdeTokenEndpoint:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN_ENDPOINT));
                        break;
                    case CdeWorkloadUser:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_USER));
                        break;
                    case CdeWorkloadPassword:
                        ConnectionContextHelper.createParameters(varList, paramName,
                                conn.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_PASSWORD), JavaTypesManager.PASSWORD);
                        break;
                        
                    default:
                    }
                }
            }
            createHadoopPropertiesContextVariable(prefixName, varList, conn.getHadoopProperties());
            createHadoopPropertiesContextVariable(prefixName, varList, conn.getSparkProperties());
        }
        return varList;
    }

    @Override
    public void setPropertiesForContextMode(String prefixName, Connection connection, Set<IConnParamName> paramSet) {
        if (connection == null) {
            return;
        }
        if (connection instanceof HadoopClusterConnection) {
            HadoopClusterConnection hadoopConn = (HadoopClusterConnection) connection;
            String originalVariableName = prefixName + ConnectionContextHelper.LINE;
            String hadoopVariableName = null;
            for (IConnParamName param : paramSet) {
                if (param instanceof EHadoopParamName) {
                    EHadoopParamName hadoopConnectionParam = (EHadoopParamName) param;
                    originalVariableName = prefixName + ConnectionContextHelper.LINE;
                    hadoopVariableName = originalVariableName + hadoopConnectionParam;
                    matchContextForAttribues(hadoopConn, hadoopConnectionParam, hadoopVariableName);
                }
            }
            String hadoopProperties = hadoopConn.getHadoopProperties();
            List<Map<String, Object>> propertiesAfterContext = transformHadoopPropertiesForContextMode(
                    HadoopRepositoryUtil.getHadoopPropertiesList(hadoopProperties), prefixName);
            hadoopConn.setHadoopProperties(HadoopRepositoryUtil.getHadoopPropertiesJsonStr(propertiesAfterContext));
            //
            String sparkProperties = hadoopConn.getSparkProperties();
            List<Map<String, Object>> sparkPropertiesAfterContext = transformHadoopPropertiesForContextMode(
                    HadoopRepositoryUtil.getHadoopPropertiesList(sparkProperties), prefixName);
            hadoopConn.setSparkProperties(HadoopRepositoryUtil.getHadoopPropertiesJsonStr(sparkPropertiesAfterContext));
        }

    }

    @Override
    public void setPropertiesForExistContextMode(Connection connection, Set<IConnParamName> paramSet,
            Map<ContextItem, List<ConectionAdaptContextVariableModel>> adaptMap) {
        if (connection == null) {
            return;
        }
        if (connection instanceof HadoopClusterConnection) {
            HadoopClusterConnection hadoopConn = (HadoopClusterConnection) connection;
            ContextItem currentContext = null;
            for (IConnParamName param : paramSet) {
                if (param instanceof EHadoopParamName) {
                    String hadoopVariableName = null;
                    EHadoopParamName hadoopParam = (EHadoopParamName) param;
                    if (adaptMap != null && adaptMap.size() > 0) {
                        for (Map.Entry<ContextItem, List<ConectionAdaptContextVariableModel>> entry : adaptMap.entrySet()) {
                            currentContext = entry.getKey();
                            List<ConectionAdaptContextVariableModel> modelList = entry.getValue();
                            for (ConectionAdaptContextVariableModel model : modelList) {
                                if (model.getValue().equals(hadoopParam.name())) {
                                    hadoopVariableName = model.getName();
                                    break;
                                }
                            }
                        }
                    }
                    if (hadoopVariableName != null) {
                        hadoopVariableName = getCorrectVariableName(currentContext, hadoopVariableName, hadoopParam);
                        matchContextForAttribues(hadoopConn, hadoopParam, hadoopVariableName);
                    }
                }

            }
            matchAdditionProperties(hadoopConn, adaptMap);
        }
    }

    @Override
    protected void matchAdditionProperties(Connection conn, Map<ContextItem, List<ConectionAdaptContextVariableModel>> adaptMap) {
        if (conn instanceof HadoopClusterConnection) {
            HadoopClusterConnection hadoopConn = (HadoopClusterConnection) conn;
            if (adaptMap != null && !adaptMap.isEmpty()) {
                List<Map<String, Object>> hadoopListProperties = HadoopRepositoryUtil.getHadoopPropertiesList(hadoopConn
                        .getHadoopProperties());
                Set<String> keys = getConAdditionPropertiesForContextMode(conn);
                List<Map<String, Object>> sparkListProperties = HadoopRepositoryUtil.getHadoopPropertiesList(hadoopConn
                        .getSparkProperties());
                Set<String> sparkKeys = getConAdditionPropertiesForContextMode(conn);
                for (Map.Entry<ContextItem, List<ConectionAdaptContextVariableModel>> entry : adaptMap.entrySet()) {
                    List<ConectionAdaptContextVariableModel> modelList = entry.getValue();
                    for (ConectionAdaptContextVariableModel model : modelList) {
                        String propertyKey = model.getValue();
                        if (keys.contains(propertyKey)) {
                            List<Map<String, Object>> propertiesAfterContext = transformHadoopPropertiesForExistContextMode(
                                    hadoopListProperties, propertyKey, model.getName());
                            hadoopConn.setHadoopProperties(HadoopRepositoryUtil
                                    .getHadoopPropertiesJsonStr(propertiesAfterContext));
                        }
                        if (sparkKeys.contains(propertyKey)) {
                            List<Map<String, Object>> propertiesAfterContext = transformHadoopPropertiesForExistContextMode(
                                    sparkListProperties, propertyKey, model.getName());
                            hadoopConn
                                    .setSparkProperties(HadoopRepositoryUtil.getHadoopPropertiesJsonStr(propertiesAfterContext));
                        }
                    }
                }
            }
        }
    }

    @Override
    protected void matchContextForAttribues(Connection conn, IConnParamName paramName, String hadoopVariableName) {
        HadoopClusterConnection hadoopConn = (HadoopClusterConnection) conn;
        EHadoopParamName hadoopParam = (EHadoopParamName) paramName;
        switch (hadoopParam) {
        case NameNodeUri:
            hadoopConn.setNameNodeURI(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case JobTrackerUri:
            hadoopConn.setJobTrackerURI(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case ResourceManager:
            hadoopConn.setJobTrackerURI(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case ResourceManagerScheduler:
            hadoopConn.setRmScheduler(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case JobHistory:
            hadoopConn.setJobHistory(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case StagingDirectory:
            hadoopConn.setStagingDirectory(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case NameNodePrin:
            hadoopConn.setPrincipal(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case JTOrRMPrin:
            hadoopConn.setJtOrRmPrincipal(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case JobHistroyPrin:
            hadoopConn.setJobHistoryPrincipal(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case User:
            hadoopConn.setUserName(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case Group:
            hadoopConn.setGroup(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case Principal:
            hadoopConn.setKeytabPrincipal(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KeyTab:
            hadoopConn.setKeytab(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case WebHostName:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_HOSTNAME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case WebPort:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_PORT,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case WebUser:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_USERNAME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case WebJobResFolder:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_JOB_RESULT_FOLDER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case HDIUser:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HDI_USERNAME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case HDIPassword:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HDI_PASSWORD,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KeyAzureHost:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AZURE_HOSTNAME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KeyAzureContainer:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AZURE_CONTAINER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KeyAzuresUser:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AZURE_USERNAME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KeyAzurePassword:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AZURE_PASSWORD,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KeyAzureDeployBlob:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AZURE_DEPLOY_BLOB,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseHostName:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_HOST,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseAuthToken:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_TOKEN,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseSparkPools:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_SPARK_POOLS,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	break;
        case SynapseFsHostName:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_HOSTNAME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseFsContainer:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_CONTAINER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseAuthType:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_MODE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseClientId:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_APPLICATION_ID,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseDirectoryId:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DIRECTORY_ID,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseSecretKey:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_KEY,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseClientCertificate:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_CERTIFICATE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseFsUserName:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_USERNAME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseFsPassword:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_PASSWORD,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseDeployBlob:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DEPLOY_BLOB,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseDriverMemory:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DRIVER_MEMORY,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseDriverCores:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DRIVER_CORES,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SynapseExecutorMemory:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_EXECUTOR_MEMORY,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	break;
        case ClouderaNavigatorUsername:
            hadoopConn.setClouderaNaviUserName(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case ClouderaNavigatorPassword:
            hadoopConn.setClouderaNaviPassword(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case ClouderaNavigatorUrl:
            hadoopConn.setClouderaNaviUrl(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case ClouderaNavigatorMetadataUrl:
            hadoopConn.setClouderaNaviMetadataUrl(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case maprTPassword:
            hadoopConn.setMaprTPassword(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case maprTCluster:
            hadoopConn.setMaprTCluster(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case maprTDuration:
            hadoopConn.setMaprTDuration(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case maprTHomeDir:
            hadoopConn.setMaprTHomeDir(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case maprTHadoopLogin:
            hadoopConn.setMaprTHadoopLogin(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case GoogleProjectId:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_PROJECT_ID,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case GoogleClusterId:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_CLUSTER_ID,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case GoogleRegion:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_REGION,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case GoogleJarsBucket:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_JARS_BUCKET,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case useGoogleCredentials:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_PROVIDE_GOOGLE_CREDENTIALS,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;    
        case GoogleAuthMode:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AUTH_MODE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;    
        case PathToGoogleCredentials:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_PATH_TO_GOOGLE_CREDENTIALS,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case GoogleOauthToken:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_OAUTH2_TOKEN_TO_GOOGLE_CREDENTIALS,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksEndpoint:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_ENDPOINT,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksCloudProvider:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DatabricksRunMode:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUN_MODE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksClusterId:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_ID,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksToken:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_TOKEN,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksDBFSDepFolder:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DBFS_DEP_FOLDER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksDriverNodeType:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DRIVER_NODE_TYPE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksClusterType:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_TYPE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksNodeType:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_NODE_TYPE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case DataBricksRuntimeVersion:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUNTIME_VERSION,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case WebHDFSSSLTrustStorePath:
            hadoopConn.setWebHDFSSSLTrustStorePath(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case WebHDFSSSLTrustStorePassword:
            hadoopConn.setWebHDFSSSLTrustStorePassword(ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case setHadoopConf:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SET_HADOOP_CONF,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case hadoopConfSpecificJar:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CONF_SPECIFIC_JAR,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case UseKnox:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_USE_KNOX,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SparkMode:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SPARK_MODE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KnoxUrl:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_KNOX_URL,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KnoxUsername:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_KNOX_USER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KnoxPassword:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_KNOX_PASSWORD,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case KnoxDirectory:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_KNOX_DIRECTORY,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case k8sMaster:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_MASTER, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sInstances:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_INSTANCES, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sRegistrySecret:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_REGISTRYSECRET, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sImage:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_IMAGE, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sNamespace:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_NAMESPACE, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sServiceAccount:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_SERVICEACCOUNT, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sS3Bucket:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3BUCKET, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sS3Folder:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3FOLDER, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sS3Credentials:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3CREDENTIALS, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sS3AccessKey:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3ACCESSKEY, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sS3SecretKey:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3SECRETKEY, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sBlobAccount:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBACCOUNT, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sBlobContainer:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBCONTAINER, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sBlobSecretKey:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBSECRETKEY, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sAzureAccount:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREACCOUNT, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sAzureContainer:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURECONTAINER, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sAzureSecretKey:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURESECRETKEY, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sAzureAADKey:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADKEY, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sAzureAADClientID:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADCLIENTID, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case k8sAzureAADDirectoryID:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADDIRECTORYID, ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
        	 break;
        case KnoxTimeout:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_KNOX_TIMEOUT,
                ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
// CDE
        case CdeApiEndPoint:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_CDE_API_ENDPOINT,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case CdeToken:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case CdeTokenEndpoint:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN_ENDPOINT,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case CdeWorkloadUser:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_USER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case CdeWorkloadPassword:
            hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_PASSWORD,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case StandaloneMaster:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_MASTER,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case StandaloneConfigureExecutors : 
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_CONFIGURE_EXEC,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case StandaloneExecutorCore:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_CORE,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case StandaloneExecutorMemory:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_MEMORY,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        case SparkSubmitScriptHome:
        	hadoopConn.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_UNIV_SPARK_SUBMIT_SCRIPT_HOME,
                    ContextParameterUtils.getNewScriptCode(hadoopVariableName, LANGUAGE));
            break;
        default:
        }
    }

    @Override
    public void revertPropertiesForContextMode(Connection hadoopConn, ContextType contextType) {
        if (hadoopConn instanceof HadoopClusterConnection) {
            HadoopClusterConnection conn = (HadoopClusterConnection) hadoopConn;
            String nameNodeUri = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getNameNodeURI()));
            String jobTrackerUri = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getJobTrackerURI()));
            String rmScheduler = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getRmScheduler()));
            String jobHistory = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getJobHistory()));
            String stagingDir = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getStagingDirectory()));
            String nameNodePrin = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getPrincipal()));
            String jtOrRmPrin = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getValue(conn.getJtOrRmPrincipal(), false)));
            String jobHisPrin = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getJobHistoryPrincipal()));
            String userName = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getUserName()));
            String group = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType, conn.getGroup()));
            String principal = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getKeytabPrincipal()));
            String keyTab = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType, conn.getKeytab()));

            String cnUserName = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getClouderaNaviUserName()));

            String cnPassword = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getClouderaNaviPassword()));

            String cnUrl = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getClouderaNaviUrl()));

            String cnMetadataUrl = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getClouderaNaviMetadataUrl()));

            String cnClientUrl = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getClouderaNaviClientUrl()));

            String maprTPassword = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getMaprTPassword()));
            String maprTCluster = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getMaprTCluster()));
            String maprTDuration = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getMaprTDuration()));
            String maprTHomeDir = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getMaprTHomeDir()));
            String maprTHadoopLogin = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getMaprTHadoopLogin()));

            String webHDFSSSLTrustStorePath = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(contextType,
                    conn.getWebHDFSSSLTrustStorePath()));
            String webHDFSSSLTrustStorePassword = TalendQuoteUtils.removeQuotes(ContextParameterUtils.getOriginalValue(
                    contextType, conn.getWebHDFSSSLTrustStorePassword()));

            for (String paramKey : ((HadoopClusterConnection) hadoopConn).getParameters().keySet()) {
                String originalValue = ContextParameterUtils.getOriginalValue(contextType, conn.getParameters().get(paramKey));
                conn.getParameters().put(paramKey, originalValue);
            }

            String hadoopProperties = conn.getHadoopProperties();
            List<Map<String, Object>> propertiesAfterRevert = transformContextModeToHadoopProperties(
                    HadoopRepositoryUtil.getHadoopPropertiesList(hadoopProperties), contextType);
            conn.setHadoopProperties(HadoopRepositoryUtil.getHadoopPropertiesJsonStr(propertiesAfterRevert));

            String sparkProperties = conn.getSparkProperties();
            List<Map<String, Object>> sparkPropertiesAfterRevert = transformContextModeToHadoopProperties(
                    HadoopRepositoryUtil.getHadoopPropertiesList(sparkProperties), contextType);
            conn.setSparkProperties(HadoopRepositoryUtil.getHadoopPropertiesJsonStr(sparkPropertiesAfterRevert));

            conn.setNameNodeURI(nameNodeUri);
            conn.setJobTrackerURI(jobTrackerUri);
            conn.setRmScheduler(rmScheduler);
            conn.setJobHistory(jobHistory);
            conn.setStagingDirectory(stagingDir);
            conn.setPrincipal(nameNodePrin);
            conn.setJtOrRmPrincipal(jtOrRmPrin);
            conn.setJobHistoryPrincipal(jobHisPrin);
            conn.setUserName(userName);
            conn.setGroup(group);
            conn.setKeytab(keyTab);
            conn.setKeytabPrincipal(principal);
            conn.setClouderaNaviUserName(cnUserName);
            conn.setClouderaNaviPassword(cnPassword);
            conn.setClouderaNaviUrl(cnUrl);
            conn.setClouderaNaviMetadataUrl(cnMetadataUrl);
            conn.setClouderaNaviClientUrl(cnClientUrl);
            conn.setMaprTPassword(maprTPassword);
            conn.setMaprTCluster(maprTCluster);
            conn.setMaprTDuration(maprTDuration);
            conn.setMaprTHomeDir(maprTHomeDir);
            conn.setMaprTHadoopLogin(maprTHadoopLogin);
            conn.setWebHDFSSSLTrustStorePath(webHDFSSSLTrustStorePath);
            conn.setWebHDFSSSLTrustStorePassword(webHDFSSSLTrustStorePassword);
        }
    }

    @Override
    public Set<String> getConAdditionPropertiesForContextMode(Connection conn) {
        Set<String> conVarList = new HashSet<String>();
        if (conn instanceof HadoopClusterConnection) {
            HadoopClusterConnection hadoopConn = (HadoopClusterConnection) conn;
            conVarList = getConAdditionProperties(HadoopRepositoryUtil.getHadoopPropertiesList(hadoopConn.getHadoopProperties()));
            conVarList.addAll(
                    getConAdditionProperties(HadoopRepositoryUtil.getHadoopPropertiesList(hadoopConn.getSparkProperties())));
        }
        return conVarList;
    }
}
