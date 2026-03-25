package org.talend.repository.hdfs.action;

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.hadoopcluster.action.common.EditHadoopNodePropertiesAction;
import org.talend.repository.hdfs.node.model.HDFSRepositoryNodeType;

public class EditHDFSPropertiesAction extends EditHadoopNodePropertiesAction {

    @Override
    protected ERepositoryObjectType getNodeType() {
        return HDFSRepositoryNodeType.HDFS;
    }

}
