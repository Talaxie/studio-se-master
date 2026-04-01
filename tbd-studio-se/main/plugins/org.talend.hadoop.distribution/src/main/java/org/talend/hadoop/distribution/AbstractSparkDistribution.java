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
package org.talend.hadoop.distribution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.talend.core.model.process.INode;
import org.talend.hadoop.distribution.condition.common.HDFSLinkedNodeCondition;
import org.talend.hadoop.distribution.constants.ModuleGroupName;
import org.talend.hadoop.distribution.constants.apache.ESparkMode;
import org.talend.hadoop.distribution.constants.apache.ISparkDistribution;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksCloudProvider;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksClusterType ;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksSubmitMode;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesAzureCredentials;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesBucketCloudProvider;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesS3Credentials;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesSubmitMode;
import org.talend.hadoop.distribution.kafka.SparkStreamingKafkaVersion;
import org.talend.hadoop.distribution.utils.ModuleGroupsUtils;

public abstract class AbstractSparkDistribution extends AbstractDistribution implements ISparkDistribution {
	
	@Override
	protected Map<ComponentType, Set<DistributionModuleGroup>> buildModuleGroups() {
        Map<ComponentType, Set<DistributionModuleGroup>> result = super.buildModuleGroups();
        HDFSLinkedNodeCondition hDFSLinkedNodeCondition = new HDFSLinkedNodeCondition(this.getDistribution(), this.getVersion());
        Set<DistributionModuleGroup> hdfsDistributionModuleGroup = ModuleGroupsUtils.getModuleGroups(hDFSLinkedNodeCondition.getWebHDFSCondition(), ModuleGroupName.WEBHDFS.get(this.getVersion()), false);
        hdfsDistributionModuleGroup.addAll(ModuleGroupsUtils.getModuleGroups(null, ModuleGroupName.SPARK_COMPILE.get(this.getVersion()), false));
        result.put(ComponentType.HDFS, hdfsDistributionModuleGroup);
        result.put(ComponentType.HIVE, ModuleGroupsUtils.getModuleGroups(null, ModuleGroupName.HIVE.get(this.getVersion()), false));
        result.put(ComponentType.HBASE, ModuleGroupsUtils.getModuleGroups(null, ModuleGroupName.HBASE.get(this.getVersion()), false));
        result.put(ComponentType.IMPALA, ModuleGroupsUtils.getModuleGroups(null, ModuleGroupName.IMPALA.get(this.getVersion()), false));
        result.put(ComponentType.SQOOP, ModuleGroupsUtils.getModuleGroups(null, ModuleGroupName.SQOOP.get(this.getVersion()), false));
        result.put(ComponentType.SPARKBATCH, ModuleGroupsUtils.getModuleGroups(null, ModuleGroupName.SPARK_COMPILE.get(this.getVersion()), false));
        result.put(ComponentType.SPARKSTREAMING, ModuleGroupsUtils.getModuleGroups(null, ModuleGroupName.SPARK_COMPILE.get(this.getVersion()), false));
        return result;
    }

    @Override
    protected Map<NodeComponentTypeBean, Set<DistributionModuleGroup>> buildNodeModuleGroups( String distribution, String version) {

        Map<NodeComponentTypeBean, Set<DistributionModuleGroup>> result = super.buildNodeModuleGroups(distribution, version);

        return result;
    }

    @Override
    public String getSparkClasspath(List<? extends INode> nodes) {
        String hadoopHome = "${HADOOP_HOME}";
        String classpathSeparator = ",";
        String cdhSpark2Jars = "/opt/cloudera/parcels/CDH/lib/spark/jars/*";
        String cdhSpark3Jars = "/opt/cloudera/parcels/SPARK3/lib/spark3/jars/*";
        String baseCdhSparkJars = this.isSpark2() ? cdhSpark2Jars : cdhSpark3Jars;
        String classpath = baseCdhSparkJars//CDH&CDP base classpath
                + classpathSeparator + hadoopHome + "/../spark2/jars/*" //HDP base classpath
                + classpathSeparator + "/usr/lib/spark/jars/*" + classpathSeparator + "/usr/lib/hadoop-lzo/lib/*" + classpathSeparator + "/usr/lib/hadoop-lzo/lib/native/*"; //EMR base classpath
        if (doesJobContain(nodes, "hive")) {
            classpath += classpathSeparator + "/opt/cloudera/parcels/CDH/lib/spark/hive/*" //CDH&CDP hive lib for spark
                    + classpathSeparator + "/usr/lib/hive/lib/*" + classpathSeparator + "/usr/lib/tez/*"; //Hive for EMR
        }
        if (doesJobContain(nodes, "hbase")) {
            classpath += classpathSeparator + "/opt/cloudera/parcels/CDH/lib/hbase/lib/*"; //CDH&CDP hbase lib for spark
            classpath += classpathSeparator + hadoopHome + "/../hbase/lib/*"; //HDP hbase lib for spark
            classpath += classpathSeparator + "/usr/lib/hbase/lib/*"; //EMR
        }
        if (doesJobContain(nodes, "sqoop")) {
            classpath += classpathSeparator + "/opt/cloudera/parcels/CDH/lib/sqoop/*"; //CDH&CDP hbase lib for spark
            classpath += classpathSeparator + hadoopHome + "/../sqoop/*"; //HDP hbase lib for spark
            classpath += classpathSeparator + "/usr/lib/sqoop/lib/*"; //EMR
        }
        if (doesJobContain(nodes, "kudu")) {
            classpath += classpathSeparator + "/opt/cloudera/parcels/CDH/lib/kudu/*"; //CDH&CDP hbase lib for spark
        }
        if (doesJobContain(nodes, "tS3Configuration")) {
            classpath += classpathSeparator + "/usr/share/aws/emr/s3select/lib/*"; // S3 Select on EMR
        }
        if (doesJobContain(nodes,"avro")){
            classpath += classpathSeparator + "/usr/lib/spark/external/lib/*";
        }
        return classpath;
    }

    private boolean doesJobContain(List<? extends INode> nodes, String nodeName) {
        return nodes.stream().anyMatch(x -> x.getComponent().getName().toLowerCase().contains(nodeName.toLowerCase()));
    }

    @Override
    public List<String> getSupportedHBaseVersion() {
        List<String> hBaseVersions = new ArrayList<String>();
        if (this.doSupportHBase2x()) {
            hBaseVersions.add("HBase2");
        }
        if (this.doSupportHBase1x()) {
            hBaseVersions.add("HBase1");
        }
        return hBaseVersions;
    }

    @Override
    public boolean doSupportEmbeddedMode() {
        return false;
    }

    @Override
    public SparkStreamingKafkaVersion getSparkStreamingKafkaVersion(ESparkVersion version) {
        return SparkStreamingKafkaVersion.KAFKA_0_10;
    }

    public List<ESparkMode> getSparkModes() {
        List<ESparkMode> result = new ArrayList<ESparkMode>();
        if (this.doSupportUniversalLocalMode()) {
            result.add(ESparkMode.SPARK_LOCAL);
        }
        if (this.doSupportSparkYarnK8SMode()) {
            result.add(ESparkMode.KUBERNETES);
        }
        if (this.doSupportSparkYarnClusterMode()) {
            result.add(ESparkMode.YARN_CLUSTER);
        }
        if (this.doSupportUniversalDataprocMode()) {
            result.add(ESparkMode.DATAPROC);
        }
        if (this.doSupportUniversalDBRMode()) {
            result.add(ESparkMode.DATABRICKS);
        }
        if (this.doSupportUniversalCDEMode()) {
            result.add(ESparkMode.CDE);
        }
        if (this.doSupportUniversalStandaloneMode()) {
            result.add(ESparkMode.STANDALONE);
        }
        if (this.doSupportSparkSubmitScripts()) {
            result.add(ESparkMode.SPARK_SUBMIT);
        }
        if (this.doSupportUniversalSynapseMode()) {
            result.add(ESparkMode.SYNAPSE);
        }
        if(this.doSupportUniversalEMRServerlessMode()) {
            result.add(ESparkMode.EMR_SERVERLESS);
        }
        if (this.doSupportUniversalHDIMode()) {
            result.add(ESparkMode.HDI);
        }
        return result;
    }

    @Override
    public boolean doSupportHBase2x() {
        return true;
    }

    @Override
    public boolean doSupportHBase1x() {
        return true;
    }

    public List<EDatabricksCloudProvider> getSupportCloudProviders() {
        return Arrays.asList(EDatabricksCloudProvider.values());
    }
    
    public List<EDatabricksClusterType > getClusterTypes() {
        return Arrays.asList(EDatabricksClusterType.values());
    }

    public List<EDatabricksSubmitMode> getRunSubmitMode() {
        return Arrays.asList(EDatabricksSubmitMode.values());
    }
    
    @Override
    public boolean isHiveMRRequired() {
    	return false;
    }
    
    @Override
    public boolean isParquetMRRequired() {
    	return false;
    }
    
    @Override
    public boolean doSupportUniversalDBRMode() {
    	return false;
    }
    
    @Override
    public boolean doSupportUniversalDataprocMode() {
    	return false;
    }
    
    @Override
    public boolean doSupportUniversalLocalMode() {
    	return false;
    }
    
    @Override
    public boolean doSupportSparkYarnK8SMode() {
    	return false;
    }
    
    @Override
    public boolean doSupportSparkYarnClusterMode() {
    	return false;
    }
    
    @Override
    public boolean doSupportUniversalStandaloneMode() {
    	return false;
    }
    
    @Override
    public boolean doSupportSparkSubmitScripts() {
    	return false;
    }
    
    public List<EKubernetesSubmitMode> getK8sRunSubmitModes() {
    	return Arrays.asList(EKubernetesSubmitMode.values());
    }
    
    public List<EKubernetesBucketCloudProvider> getK8sCloudProviders() {
    	return Arrays.asList(EKubernetesBucketCloudProvider.values());
    }
    
    public List<EKubernetesAzureCredentials> getK8sAzureCredentials() {
    	return Arrays.asList(EKubernetesAzureCredentials.values());
    }
    
    public List<EKubernetesS3Credentials> getK8sS3Credentials() {
    	return Arrays.asList(EKubernetesS3Credentials.values());
    }
}
