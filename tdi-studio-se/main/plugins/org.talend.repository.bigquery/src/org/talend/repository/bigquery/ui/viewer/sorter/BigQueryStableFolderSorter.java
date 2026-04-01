// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.bigquery.ui.viewer.sorter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.StableRepositoryNode;

public class BigQueryStableFolderSorter extends ViewerSorter {

    List<ERepositoryObjectType> typeList = new ArrayList<ERepositoryObjectType>();

    public BigQueryStableFolderSorter() {
        typeList.add(ERepositoryObjectType.METADATA_CON_TABLE);
    }

    @Override
    public int compare(Viewer viewer, Object e1, Object e2) {
        if (e1 instanceof StableRepositoryNode && e2 instanceof StableRepositoryNode) {
            ERepositoryObjectType typeE1 = (ERepositoryObjectType) ((StableRepositoryNode) e1)
                    .getProperties(EProperties.CONTENT_TYPE);
            if (typeE1 == null) {
                typeE1 = ((StableRepositoryNode) e1).getChildrenObjectType();
            }
            ERepositoryObjectType typeE2 = (ERepositoryObjectType) ((StableRepositoryNode) e2)
                    .getProperties(EProperties.CONTENT_TYPE);
            if (typeE2 == null) {
                typeE2 = ((StableRepositoryNode) e2).getChildrenObjectType();
            }
            int index1 = typeList.indexOf(typeE1);
            int index2 = typeList.indexOf(typeE2);
            return index1 - index2;
        }
        return super.compare(viewer, e1, e2);
    }

    public ERepositoryObjectType getNodeContentType(RepositoryNode repositoryNode) {
        return repositoryNode != null ? (ERepositoryObjectType) repositoryNode.getProperties(EProperties.CONTENT_TYPE) : null;
    }

}
