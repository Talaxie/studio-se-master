package org.talend.repository.hdfs.ui.viewer.seeker;

import java.util.List;

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.hdfs.node.model.HDFSRepositoryNodeType;
import org.talend.repository.metadata.seeker.AbstractMetadataRepoViewSeeker;

/**
 * created by ycbai on 2013-1-28 Detailled comment
 * 
 */
public class HDFSRepositorySeeker extends AbstractMetadataRepoViewSeeker {

    @Override
    protected List<ERepositoryObjectType> getValidationTypes() {
        List<ERepositoryObjectType> validationTypes = super.getValidationTypes();
        validationTypes.add(HDFSRepositoryNodeType.HDFS);

        return validationTypes;
    }

}
