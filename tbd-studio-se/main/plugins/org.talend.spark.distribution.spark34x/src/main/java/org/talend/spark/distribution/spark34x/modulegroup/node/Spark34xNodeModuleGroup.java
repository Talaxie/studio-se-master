package org.talend.spark.distribution.spark34x.modulegroup.node;

import java.util.*;
import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.ESparkVersion;
import org.talend.hadoop.distribution.condition.*;
import org.talend.hadoop.distribution.constants.SparkBatchConstant;

public class Spark34xNodeModuleGroup {

    public static Set<DistributionModuleGroup> getModuleGroup(String moduleGroupName, String sparkConfigLinkedParameter,
            ESparkVersion sparkVersion) {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        DistributionModuleGroup dmg = new DistributionModuleGroup(moduleGroupName, true, spark34xCondition(sparkConfigLinkedParameter, sparkVersion));
        hs.add(dmg);
        return hs;
    }

    static ComponentCondition spark34xCondition(String sparkConfigLinkedParameter, ESparkVersion sparkVersion) {
        
        return new SimpleComponentCondition(new LinkedNodeExpression(sparkConfigLinkedParameter,
                                                                    SparkBatchConstant.VERSION_PARAMETER,//
                                                                    EqualityOperator.EQ, sparkVersion.getSparkVersion()));
    }
    
}
