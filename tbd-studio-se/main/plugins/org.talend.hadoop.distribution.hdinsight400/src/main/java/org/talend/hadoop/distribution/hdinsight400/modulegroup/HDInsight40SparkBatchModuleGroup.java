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
package org.talend.hadoop.distribution.hdinsight400.modulegroup;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.ESparkVersion;
import org.talend.hadoop.distribution.condition.BasicExpression;
import org.talend.hadoop.distribution.condition.ComponentCondition;
import org.talend.hadoop.distribution.condition.EqualityOperator;
import org.talend.hadoop.distribution.condition.SimpleComponentCondition;
import org.talend.hadoop.distribution.hdinsight400.HDInsight40Constant;

public class HDInsight40SparkBatchModuleGroup {

    private final static ComponentCondition conditionSpark2_3 = new SimpleComponentCondition(
            new BasicExpression("SUPPORTED_SPARK_VERSION", EqualityOperator.EQ, ESparkVersion.SPARK_2_3_X.getSparkVersion())); //$NON-NLS-1$

    private final static ComponentCondition conditionSpark2_4 = new SimpleComponentCondition(
            new BasicExpression("SUPPORTED_SPARK_VERSION", EqualityOperator.EQ, ESparkVersion.SPARK_2_4_X.getSparkVersion())); //$NON-NLS-1$

    public static Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        hs.add(new DistributionModuleGroup(HDInsight40Constant.SPARK23_MODULE_GROUP.getModuleName(), false, conditionSpark2_3));
        hs.add(new DistributionModuleGroup(HDInsight40Constant.SPARK24_MODULE_GROUP.getModuleName(), false, conditionSpark2_4));
        //should be true because job is using FileSystem
        hs.add(new DistributionModuleGroup(HDInsight40Constant.BIGDATALAUNCHER_MODULE_GROUP.getModuleName(), true));
        hs.add(new DistributionModuleGroup(HDInsight40Constant.HDINSIGHT400COMMON_MODULE_GROUP.getModuleName(), false));
        return hs;
    }

}
