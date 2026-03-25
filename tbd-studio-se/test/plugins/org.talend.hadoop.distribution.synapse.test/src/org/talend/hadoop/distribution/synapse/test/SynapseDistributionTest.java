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
package org.talend.hadoop.distribution.synapse.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.talend.hadoop.distribution.EHadoopVersion;
import org.talend.hadoop.distribution.component.HBaseComponent;
import org.talend.hadoop.distribution.component.HCatalogComponent;
import org.talend.hadoop.distribution.component.HadoopComponent;
import org.talend.hadoop.distribution.component.HiveComponent;
import org.talend.hadoop.distribution.component.ImpalaComponent;
import org.talend.hadoop.distribution.component.MRComponent;
import org.talend.hadoop.distribution.component.SqoopComponent;
import org.talend.hadoop.distribution.synapse.SynapseDistribution;

/**
 * Test class for the {@link SynapseDistribution} distribution.
 *
 */
public class SynapseDistributionTest {

    
	private final static String YARN_APPLICATION_CLASSPATH = "$HADOOP_CONF_DIR,/usr/hdp/current/hadoop-client/*,/usr/hdp/current/hadoop-client/lib/*,/usr/hdp/current/hadoop-hdfs-client/*,/usr/hdp/current/hadoop-hdfs-client/lib/*,/usr/hdp/current/hadoop-yarn-client/*,/usr/hdp/current/hadoop-yarn-client/lib/*"; //$NON-NLS-1$

    @Test
    public void testSynapseDistribution() throws Exception {
        HadoopComponent distribution = new SynapseDistribution();
        assertNotNull(distribution.getDistributionName());
        assertNotNull(distribution.getVersionName(null));
        assertFalse(distribution.doSupportS3());
        assertEquals(SynapseDistribution.DISTRIBUTION_NAME, distribution.getDistribution());
        assertEquals(SynapseDistribution.VERSION, distribution.getVersion());
        assertEquals(EHadoopVersion.HADOOP_3, distribution.getHadoopVersion());
        
        assertFalse(distribution.doSupportKerberos());
        assertTrue(distribution.doSupportUseDatanodeHostname());
        assertFalse(distribution.doSupportGroup());
        assertFalse(distribution.doSupportOldImportMode());
        assertFalse(((MRComponent) distribution).isExecutedThroughWebHCat());
        assertFalse(((MRComponent) distribution).doSupportCrossPlatformSubmission());
        assertFalse(((MRComponent) distribution).doSupportImpersonation());
        assertEquals(((MRComponent) distribution).getYarnApplicationClasspath(), YARN_APPLICATION_CLASSPATH);
        assertFalse(distribution instanceof HBaseComponent);
        assertFalse(distribution instanceof SqoopComponent);
        assertFalse(distribution instanceof HCatalogComponent);
        assertFalse(distribution instanceof ImpalaComponent);
        assertTrue(distribution.doSupportAzureDataLakeStorageGen2());
        assertTrue(distribution.doSupportWebHDFS());
    }

}
