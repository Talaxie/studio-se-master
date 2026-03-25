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
package org.talend.hadoop.distribution.dynamic.template.modulegroup;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.dynamic.adapter.DynamicPluginAdapter;

import java.util.HashSet;
import java.util.Set;

public class DynamicHiveOnSparkModuleGroup extends AbstractModuleGroup {

    public DynamicHiveOnSparkModuleGroup(DynamicPluginAdapter pluginAdapter) {
        super(pluginAdapter);
    }

    @Override
    public Set<DistributionModuleGroup> getModuleGroups() throws Exception {
        Set<DistributionModuleGroup> distributionGroups = new HashSet<>();

        requiredDistributionGroup(DynamicModuleGroupConstant.SPARK_HIVE_MRREQUIRED_MODULE_GROUP)
                .ifPresent(distributionGroups::add);

        optionalDistributionGroup(DynamicModuleGroupConstant.HIVE_WAREHOUSE_MODULE_GROUP)
                .ifPresent(distributionGroups::add);

        return distributionGroups;
    }

}
