package org.talend.spark.distribution.spark33x.modulegroup.node;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.ESparkVersion;
import org.talend.hadoop.distribution.condition.ComponentCondition;
import org.talend.hadoop.distribution.condition.EqualityOperator;
import org.talend.hadoop.distribution.condition.LinkedNodeExpression;
import org.talend.hadoop.distribution.condition.SimpleComponentCondition;
import org.talend.hadoop.distribution.constants.SparkBatchConstant;

public class Spark33xNodeModuleGroup {

    public static Set<DistributionModuleGroup> getModuleGroup(String moduleGroupName, String sparkConfigLinkedParameter,
            ESparkVersion sparkVersion) {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        DistributionModuleGroup dmg = new DistributionModuleGroup(moduleGroupName, true, spark32xCondition(sparkConfigLinkedParameter, sparkVersion));
        hs.add(dmg);
        return hs;
    }

    static ComponentCondition spark32xCondition(String sparkConfigLinkedParameter, ESparkVersion sparkVersion) {
        
        return new SimpleComponentCondition(new LinkedNodeExpression(sparkConfigLinkedParameter,
                                                                    SparkBatchConstant.VERSION_PARAMETER,//
                                                                    EqualityOperator.EQ, sparkVersion.getSparkVersion()));
    }
    
}
