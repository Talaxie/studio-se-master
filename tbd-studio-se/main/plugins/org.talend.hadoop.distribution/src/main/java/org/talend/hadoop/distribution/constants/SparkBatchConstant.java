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
package org.talend.hadoop.distribution.constants;

import org.talend.hadoop.distribution.i18n.Messages;

public final class SparkBatchConstant {

    public static final String SERVICE = "org.talend.hadoop.distribution.component.SparkBatchComponent";//$NON-NLS-1$

    public static final String DISTRIBUTION_PARAMETER = "DISTRIBUTION";//$NON-NLS-1$

    public static final String DISTRIBUTION_REPOSITORYVALUE = "DISTRIBUTION";//$NON-NLS-1$

    public static final String VERSION_PARAMETER = "SPARK_VERSION";//$NON-NLS-1$
    
    public static final String SPARKCONFIGURATION_USE_KNOX = "USE_KNOX";//$NON-NLS-1$
    
    public static final String VERSION_REPOSITORYVALUE = "DB_VERSION";//$NON-NLS-1$

    public static final String SPARK_BATCH_SPARKCONFIGURATION_LINKEDPARAMETER = "SPARK_CONFIGURATION";//$NON-NLS-1$

    public static final String SPARK_BATCH_S3_SPARKCONFIGURATION_LINKEDPARAMETER = "STORAGE_CONFIGURATION";//$NON-NLS-1$

    public static final String SPARK_BATCH_AZURE_SPARKCONFIGURATION_LINKEDPARAMETER = "STORAGE_CONFIGURATION";//$NON-NLS-1$

    public static final String SPARK_MODE_PARAMETER = "SPARK_MODE"; //$NON-NLS-1$

    public static final String DATABRICKS_RUNTIME_VERSION = "DATABRICKS_RUNTIME_VERSION"; //$NON-NLS-1$
    
    public static final String DATABRICKS_CLOUD_PROVIDER = "DATABRICKS_CLOUD_PROVIDER"; //$NON-NLS-1$
    
    public static final String DATABRICKS_NODE_TYPE_AZURE = "DATABRICKS_NODE_TYPE_AZURE"; //$NON-NLS-1$
    
    public static final String DATABRICKS_DRIVER_NODE_TYPE_AZURE = "DATABRICKS_DRIVER_NODE_TYPE_AZURE"; //$NON-NLS-1$
    
    public static final String DATABRICKS_NODE_TYPE_GCP = "DATABRICKS_NODE_TYPE_GCP"; //$NON-NLS-1$
    
    public static final String DATABRICKS_DRIVER_NODE_TYPE_GCP = "DATABRICKS_DRIVER_NODE_TYPE_GCP"; //$NON-NLS-1$
    
    public static final String DATABRICKS_NODE_TYPE = "DATABRICKS_NODE_TYPE"; //$NON-NLS-1$
    
    public static final String DATABRICKS_DRIVER_NODE_TYPE = "DATABRICKS_DRIVER_NODE_TYPE"; //$NON-NLS-1$
    
    public static final String DATABRICKS_USE_TRANSIENT_CLUSTER = "DATABRICKS_USE_TRANSIENT_CLUSTER"; //$NON-NLS-1$
    
    public static final String DATABRICKS_CLUSTER_TYPE = "DATABRICKS_CLUSTER_TYPE"; //$NON-NLS-1$

    public static final String SUPPORTED_SPARK_VERSION_PARAMETER = "SUPPORTED_SPARK_VERSION"; //$NON-NLS-1$

    public static final String PARQUET_INPUT_COMPONENT = "tFileInputParquet"; //$NON-NLS-1$

    public static final String PARQUET_OUTPUT_COMPONENT = "tFileOutputParquet"; //$NON-NLS-1$

    public static final String NAIVEBAYES_MODEL_COMPONENT = "tNaiveBayesModel"; //$NON-NLS-1$

    public static final String SVM_MODEL_COMPONENT = "tSVMModel"; //$NON-NLS-1$

    public static final String CLASSIFY_SVM_COMPONENT = "tClassifySVM"; //$NON-NLS-1$

    public static final String KMEANS_MODEL_COMPONENT = "tKMeansModel"; //$NON-NLS-1$

    public static final String PREDICT_CLUSTER_COMPONENT = "tPredictCluster"; //$NON-NLS-1$

    public static final String PREDICT_COMPONENT = "tPredict"; //$NON-NLS-1$

    public static final String S3_CONFIGURATION_COMPONENT = "tS3Configuration"; //$NON-NLS-1$

    public static final String AZURE_CONFIGURATION_COMPONENT = "tAzureFSConfiguration"; //$NON-NLS-1$

    public static final String AZURE_FS_CONFIGURATION_COMPONENT = "tAzureFSConfiguration"; //$NON-NLS-1$

    public static final String BIGQUERY_CONFIGURATION_COMPONENT = "tBigQueryConfiguration"; //$NON-NLS-1$
    
    public static final String BIGQUERY_INPUT_COMPONENT = "tBigQueryInput"; //$NON-NLS-1$
    
    public static final String BIGQUERY_OUTPUT_COMPONENT = "tBigQueryOutput"; //$NON-NLS-1$

    public static final String DYNAMODB_CONFIGURATION_COMPONENT = "tDynamoDBConfiguration"; //$NON-NLS-1$

    public static final String CASSANDRA_CONFIGURATION_COMPONENT = "tCassandraConfiguration"; //$NON-NLS-1$

    public static final String DYNAMODB_OUTPUT_COMPONENT = "tDynamoDBOutput"; //$NON-NLS-1$

    public static final String DYNAMODB_INPUT_COMPONENT = "tDynamoDBInput"; //$NON-NLS-1$

    public static final String KUDU_CONFIGURATION_COMPONENT = "tKuduConfiguration"; //$NON-NLS-1$

    public static final String KUDU_OUTPUT_COMPONENT = "tKuduOutput"; //$NON-NLS-1$

    public static final String KUDU_INPUT_COMPONENT = "tKuduInput"; //$NON-NLS-1$

    public static final String MATCH_PREDICT_COMPONENT = "tMatchPredict";//$NON-NLS-1$

    public static final String USE_CLOUDERA_NAVIGATOR = "USE_CLOUDERA_NAVIGATOR";//$NON-NLS-1$

    public static final String USE_ATLAS = "USE_ATLAS"; //$NON-NLS-1$

    public static final String MAPRDB_CONFIGURATION_COMPONENT = "tMapRDBConfiguration"; //$NON-NLS-1$

    public static final String MAPRDB_INPUT_COMPONENT = "tMapRDBInput"; //$NON-NLS-1$

    public static final String MAPRDB_OUTPUT_COMPONENT = "tMapRDBOutput"; //$NON-NLS-1$

    public static final String SPARK_SQL_ROW_COMPONENT = "tSqlRow"; //$NON-NLS-1$

    public static final String TMODEL_ENCODER_COMPONENT = "tModelEncoder"; //$NON-NLS-1$

    public static final String TERADATA_OUTPUT_COMPONENT = "tTeradataOutput";  //$NON-NLS-1$
    public static final String TERADATA_INPUT_COMPONENT = "tTeradataInput";  //$NON-NLS-1$
    public static final String TERADATA_CONFIG_COMPONENT = "tTeradataConfiguration";  //$NON-NLS-1$

    public static final String ORACLE_OUTPUT_COMPONENT = "tOracleOutput";  //$NON-NLS-1$
    public static final String ORACLE_INPUT_COMPONENT = "tOracleInput";  //$NON-NLS-1$
    public static final String ORACLE_CONFIG_COMPONENT = "tOracleConfiguration";  //$NON-NLS-1$

    public static final String GCS_CONFIG_COMPONENT = "tGSConfiguration";  //$NON-NLS-1$

    public static final String BIGQUERY_CONFIG_COMPONENT = "tBigQueryConfiguration";  //$NON-NLS-1$

    public static final String TOP_BY_COMPONENT = "tTopBy"; //$NON-NLS-1$

    public static final String DELTALAKE_INPUT_COMPONENT = "tDeltaLakeInput";
    public static final String DELTALAKE_OUTPUT_COMPONENT = "tDeltaLakeOutput";
    
    public static final String HIVE_WAREHOUSE_CONFIGURATION_COMPONENT = "tHiveWarehouseConfiguration";
    public static final String HIVE_WAREHOUSE_INPUT_COMPONENT = "tHiveWarehouseInput";
    public static final String HIVE_WAREHOUSE_OUTPUT_COMPONENT = "tHiveWarehouseOutput";
    
    public static final String HIVE_CONFIGURATION_COMPONENT = "tHiveConfiguration";
    public static final String HIVE_INPUT_COMPONENT = "tHiveInput";
    public static final String HIVE_OUTPUT_COMPONENT = "tHiveOutput";

    public static final String REDSHIFT_CONFIGURATION_COMPONENT = "tRedshiftConfiguration";
    public static final String REDSHIFT_INPUT_COMPONENT = "tRedshiftInput";
    public static final String REDSHIFT_OUTPUT_COMPONENT = "tRedshiftOutput";

    public static final String SNOWFLAKE_CONFIGURATION_COMPONENT = "tSnowflakeConfiguration";
    public static final String SNOWFLAKE_INPUT_COMPONENT = "tSnowflakeInput";
    public static final String SNOWFLAKE_OUTPUT_COMPONENT = "tSnowflakeOutput";

    public static final String HMAP_FILE_COMPONENT = "tHMapFile";
    public static final String HMAP_INPUT_COMPONENT = "tHMapInput";
    public static final String HCONVERT_FILE_COMPONENT = "tHConvertFile";

    public static final String LINEAR_REGRESSION_MODEL_COMPONENT = "tLinearRegressionModel";
    public static final String LOGISTIC_REGRESSION_MODEL_COMPONENT = "tLogisticRegressionModel";

    public static final String DECISION_TREE_MODEL_COMPONENT = "tDecisionTreeModel";
    public static final String GRADIENT_BOOSTED_TREE_MODEL = "tGradientBoostedTreeModel";

    public static final String ALS_MODEL_COMPONENT = "tALSModel";

    public static final String RECOMMEND_COMPONENT = "tRecommend";

    public static String getName(String key) {
        return Messages.getString(key + ".NAME");
    }
}
