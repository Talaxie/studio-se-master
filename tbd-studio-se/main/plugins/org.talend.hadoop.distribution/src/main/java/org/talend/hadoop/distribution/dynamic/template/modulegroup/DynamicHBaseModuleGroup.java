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

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.condition.BasicExpression;
import org.talend.hadoop.distribution.condition.BooleanOperator;
import org.talend.hadoop.distribution.condition.ComponentCondition;
import org.talend.hadoop.distribution.condition.EqualityOperator;
import org.talend.hadoop.distribution.condition.LinkedNodeExpression;
import org.talend.hadoop.distribution.condition.MultiComponentCondition;
import org.talend.hadoop.distribution.condition.SimpleComponentCondition;
import org.talend.hadoop.distribution.constants.HDFSConstant;
import org.talend.hadoop.distribution.constants.SparkBatchConstant;
import org.talend.hadoop.distribution.dynamic.adapter.DynamicPluginAdapter;

public class DynamicHBaseModuleGroup extends AbstractModuleGroup {

    public DynamicHBaseModuleGroup(DynamicPluginAdapter pluginAdapter) {
        super(pluginAdapter);
    }

    @Override
    public Set<DistributionModuleGroup> getModuleGroups() throws Exception {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        DynamicPluginAdapter pluginAdapter = getPluginAdapter();
        ComponentCondition notHBaseOnKnox = new MultiComponentCondition(
        			new SimpleComponentCondition(new LinkedNodeExpression(SparkBatchConstant.SPARK_BATCH_SPARKCONFIGURATION_LINKEDPARAMETER,
    					SparkBatchConstant.SPARKCONFIGURATION_USE_KNOX,
    					EqualityOperator.EQ, "false")),
        			BooleanOperator.OR,
        			new SimpleComponentCondition(new BasicExpression("isDIJob[]", EqualityOperator.EQ, "true"))
        		);
        ComponentCondition hBaseOnKnox = new SimpleComponentCondition(new LinkedNodeExpression(SparkBatchConstant.SPARK_BATCH_SPARKCONFIGURATION_LINKEDPARAMETER,
                SparkBatchConstant.SPARKCONFIGURATION_USE_KNOX,
                EqualityOperator.EQ, "true"));
        String runtimeId = pluginAdapter.getRuntimeModuleGroupIdByTemplateId(DynamicModuleGroupConstant.HBASE_MODULE_GROUP.getModuleName());
        checkRuntimeId(runtimeId);
        if (StringUtils.isNotBlank(runtimeId)) {
            hs.add(new DistributionModuleGroup(runtimeId, true, notHBaseOnKnox));
            hs.add(new DistributionModuleGroup(runtimeId, false, hBaseOnKnox));
        }
        return hs;
    }

}
