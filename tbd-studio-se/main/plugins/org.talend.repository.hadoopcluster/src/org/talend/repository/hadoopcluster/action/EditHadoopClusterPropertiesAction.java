package org.talend.repository.hadoopcluster.action;

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.hadoopcluster.action.common.EditHadoopNodePropertiesAction;
import org.talend.repository.hadoopcluster.node.model.HadoopClusterRepositoryNodeType;

/**
 * created by ycbai on 2013-1-21 Detailled comment
 * 
 */
public class EditHadoopClusterPropertiesAction extends EditHadoopNodePropertiesAction {

    @Override
    protected ERepositoryObjectType getNodeType() {
        return HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
    }

}
