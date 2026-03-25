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
package org.talend.repository.bigquery.ui.dnd;

import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.properties.BigQueryConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.DefaultRepositoryComponentDndFilter;
import org.talend.core.repository.model.repositoryObject.MetadataTableRepositoryObject;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;

public class BigQueryDragAndDropTableFilter extends DefaultRepositoryComponentDndFilter {

    @Override
    public boolean valid(Item item, ERepositoryObjectType type, RepositoryNode seletetedNode, IComponent component,
            String repositoryType) {
        if (item instanceof BigQueryConnectionItem && seletetedNode != null) {
            IRepositoryViewObject repositoryObject = seletetedNode.getObject();
            if (repositoryObject instanceof MetadataTableRepositoryObject) {
                MetadataTableRepositoryObject tableObject = (MetadataTableRepositoryObject) repositoryObject;
                if (tableObject.getAbstractMetadataObject() instanceof MetadataTable) {// BigQueryTable
                    return isBigQueryComponent(component);
                }
            }
        }
        
        if (ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS == type) {
            return isBigQueryComponent(component);
        }

        return false;
    }

	private boolean isBigQueryComponent(IComponent component) {
		return component.getName().equals("tBigQueryInput") || component.getName().equals("tBigQueryOutput")
		        || component.getName().equals("tBigQuerySQLRow") || component.getName().equals("tBigQueryBulkExec");
	}

    @Override
    public boolean except(Item item, ERepositoryObjectType type, RepositoryNode seletetedNode, IComponent component,
            String repositoryType) {
        RepositoryNode pNode = null;
        Object objProperty = null;
        if (item instanceof BigQueryConnectionItem && seletetedNode != null) {
            if (ERepositoryObjectType.METADATA_CON_TABLE == type) {
                pNode = seletetedNode.getParent();
                if (pNode == null) {
                    return false;
                }
                objProperty = pNode.getProperties(EProperties.CONTENT_TYPE);

            } else if (ERepositoryObjectType.METADATA_CON_COLUMN == type) {
                pNode = seletetedNode.getParent();
                if (pNode == null) {
                    return false;
                }
                RepositoryNode ppNode = pNode.getParent();
                if (ppNode == null) {
                    return false;
                }
                RepositoryNode pppNode = ppNode.getParent();
                if (pppNode == null) {
                    return false;
                }
                objProperty = pppNode.getProperties(EProperties.CONTENT_TYPE);
            }

            if (objProperty == null) {
                return false;
            }

            if (ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS == objProperty) {
                return !isBigQueryComponent(component);
            }
            
            return true;
        }
        return false;
    }
}
