// ============================================================================
//
// Copyright (C) 2006-2019 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.constants.apache;

import org.talend.hadoop.distribution.constants.databricks.EDatabricksCloudProvider;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksClusterType;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksSubmitMode;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesAzureCredentials;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesBucketCloudProvider;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesS3Credentials;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesSubmitMode;

import java.util.List;

public interface ISparkDistribution {

    static final String DISTRIBUTION_NAME = "SPARK";

    static final String DISTRIBUTION_DISPLAY_NAME = "Universal";

    public List<ESparkMode> getSparkModes();

    List<EDatabricksCloudProvider> getSupportCloudProviders();

    List<EDatabricksClusterType> getClusterTypes();

    List<EDatabricksSubmitMode> getRunSubmitMode();

    List<EKubernetesSubmitMode> getK8sRunSubmitModes();

    List<EKubernetesBucketCloudProvider> getK8sCloudProviders();

    List<EKubernetesAzureCredentials> getK8sAzureCredentials();

    List<EKubernetesS3Credentials> getK8sS3Credentials();

    public boolean doSupportUniversalDBRMode();
    
    public boolean doSupportUniversalDataprocMode();
    
    public boolean doSupportUniversalLocalMode();
    
    public boolean doSupportSparkYarnK8SMode();
    
    public boolean doSupportSparkYarnClusterMode();
    
    public boolean doSupportUniversalStandaloneMode();
    
    public boolean doSupportSparkSubmitScripts();
    
    default boolean doSupportUniversalEMRServerlessMode() {
        return false;
    }
    
    default boolean isSpark2() {
        return false;
    }
}
