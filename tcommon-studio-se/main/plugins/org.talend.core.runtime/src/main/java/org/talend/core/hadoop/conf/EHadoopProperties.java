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
package org.talend.core.hadoop.conf;

/**
 * created by ycbai on Jul 31, 2014 Detailled comment
 *
 */
public enum EHadoopProperties {

    NAMENODE_URI,

    JOBTRACKER,

    RESOURCE_MANAGER,

    RESOURCEMANAGER_SCHEDULER_ADDRESS,

    JOBHISTORY_ADDRESS,

    STAGING_DIRECTORY,

    USE_DATANODE_HOSTNAME,

    NAMENODE_PRINCIPAL,

    JOBTRACKER_PRINCIPAL,

    RESOURCE_MANAGER_PRINCIPAL,

    JOBHISTORY_PRINCIPAL,

    HIVE_PRINCIPAL,

    DATABASE,

    PORT,

    HBASE_MASTER_PRINCIPAL,

    HBASE_REGIONSERVER_PRINCIPAL,

    HBASE_TABLE_NS_MAPPING,

    MAPRDB_MASTER_PRINCIPAL,

    MAPRDB_REGIONSERVER_PRINCIPAL,

    MAPRDB_TABLE_NS_MAPPING,

    CLOUDERA_NAVIGATOR_USERNAME,

    CLOUDERA_NAVIGATOR_PASSWORD,

    CLOUDERA_NAVIGATOR_URL,

    CLOUDERA_NAVIGATOR_METADATA_URL,

    CLOUDERA_NAVIGATOR_CLIENT_URL,

    MAPRTICKET_CLUSTER,

    MAPRTICKET_DURATION,

    MAPR_HOME_DIR,

    HADOOP_LOGIN,

    GOOGLE_PROJECT_ID,

    GOOGLE_CLUSTER_ID,

    GOOGLE_REGION,

    GOOGLE_JARS_BUCKET,
    
    AUTH_MODE,
    
    PATH_TO_GOOGLE_CREDENTIALS,
    
    OAUTH_ACCESS_TOKEN,

    HD_WEBHCAT_HOSTNAME,

    HD_WEBHCAT_PORT,

    HD_WEBHCAT_USERNAME,

    HD_INSIGHT_USERNAME,

    HD_AZURE_HOSTNAME,

    HD_AZURE_CONTAINER,

    HD_AZURE_USERNAME,

    HD_AZURE_DEPLOYBOLB,

    HD_JOB_RESULT_FOLDER,

    SYNAPSE_ENDPOINT,
    
    SYNAPSE_TOKEN,
    
    SPARK_POOL_NAME,
    
    SYNAPSE_STORAGE_HOST,
    
    SYNAPSE_STORAGE_CONTAINER,
    
    ADLSGEN2AUTH,
    
    SYNAPSE_STORAGE_USERNAME,
    
    SYNAPSE_STORAGE_PASSWORD,
    
    SYNAPSE_APPLICATION_ID,
    
    SYNAPSE_DIRECTORY_ID,
    
    SYNAPSE_CLIENT_KEY,
    
    SYNAPSE_USE_CERTIFICATE,
    
    SYNAPSE_CLIENT_CERTIFICATE,
    
    DEPLOY_FOLDER,
    
    SPARK_DRIVER_MEM,
    
    SPARK_DRIVER_CORES,
    
    SPARK_EXECUTOR_MEMORY,
    
    SPARK_EXECUTOR_CORES,
    
    DATABRICKS_ENDPOINT,
    
    DATABRICKS_CLOUD_PROVIDER,

    DATABRICKS_RUN_MODE,

    DATABRICKS_CLUSTER_ID,
    
    DATABRICKS_TOKEN,
    
    DATABRICKS_DBFS_DEP_FOLDER,

    K8S_SUBMIT_MODE,
    
    K8S_MASTER,
    
    K8S_INSTANCES,
    
    K8S_REGISTRYSECRET,
    
    K8S_IMAGE,
    
    K8S_NAMESPACE,
    
    K8S_SERVICEACCOUNT,
    
    K8S_DISTUPLOAD,
    
    K8S_S3BUCKET,
    
    K8S_S3FOLDER,
    
    K8S_S3CREDENTIALS,
    
    K8S_S3ACCESSKEY,
    
    K8S_S3SECRETKEY,
    
    K8S_BLOBACCOUNT,
    
    K8S_BLOBCONTAINER,
    
    K8S_BLOBSECRETKEY,
    
    K8S_AZUREACCOUNT,
    
    K8S_AZURECREDENTIALS,
    
    K8S_AZURECONTAINER,
    
    K8S_AZURESECRETKEY,
    
    K8S_AZUREAADKEY,
    
    K8S_AZUREAADCLIENTID,
    
    K8S_AZUREAADDIRECTORYID,
    
    DATABRICKS_NODE_TYPE,
    
    DATABRICKS_DRIVER_NODE_TYPE,
    
    DATABRICKS_RUNTIME_VERSION,
    
    DATABRICKS_CLUSTER_TYPE,
    
    UNIV_STANDALONE_MASTER,
    
    UNIV_STANDALONE_EXEC_MEMORY,
    
    UNIV_STANDALONE_EXEC_CORE,
    
    UNIV_SPARK_SUBMIT_SCRIPT_HOME;

    public String getName() {
        return this.name();
    }

}
