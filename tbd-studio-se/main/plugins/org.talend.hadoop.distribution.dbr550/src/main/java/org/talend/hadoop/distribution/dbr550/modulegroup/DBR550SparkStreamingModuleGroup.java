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
package org.talend.hadoop.distribution.dbr550.modulegroup;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.dbr550.DBR550Constant;

public class DBR550SparkStreamingModuleGroup {

    public static Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        //hs.add(new DistributionModuleGroup(DatabricksConstant.HDFS_MODULE_GROUP.getModuleName(), false, condition));
        hs.add(new DistributionModuleGroup(DBR550Constant.SPARK_MRREQUIRED_MODULE_GROUP.getModuleName(), true));
        hs.add(new DistributionModuleGroup(DBR550Constant.SPARK_STREAMING_MRREQUIRED_MODULE_GROUP.getModuleName(), true));
        hs.add(new DistributionModuleGroup(DBR550Constant.BIGDATALAUNCHER_MODULE_GROUP.getModuleName(), true));
        hs.add(new DistributionModuleGroup(DBR550Constant.SPARK_HIVE_MRREQUIRED_MODULE_GROUP.getModuleName(), true));
        return hs;
    }
}
