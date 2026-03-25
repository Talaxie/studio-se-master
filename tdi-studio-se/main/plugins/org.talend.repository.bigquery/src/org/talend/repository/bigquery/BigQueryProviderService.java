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
package org.talend.repository.bigquery;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.ui.IWorkbench;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.properties.BigQueryConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.repositoryObject.MetadataTableRepositoryObject;
import org.talend.core.service.IBigQueryProviderService;
import org.talend.repository.ProjectManager;
import org.talend.repository.UpdateRepositoryUtils;
import org.talend.repository.bigquery.ui.wizards.BigQueryConnectionWizard;
import org.talend.repository.bigquery.ui.wizards.bigquerytable.BigQueryTableWizard;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;

public class BigQueryProviderService implements IBigQueryProviderService {

    @Override
    public BigQueryConnectionItem getRepositoryItem(INode node) {
        if (node != null) {
            if (isBigQueryNode(node)) {
                IElementParameter param = node.getElementParameter("PROPERTY");
                IElementParameter typeParam = param.getChildParameters().get("PROPERTY_TYPE");
                if (typeParam != null && "REPOSITORY".equals(typeParam.getValue())) {
                    IElementParameter repositoryParam = param.getChildParameters().get("REPOSITORY_PROPERTY_TYPE");
                    final String value = (String) repositoryParam.getValue();

                    Item item = UpdateRepositoryUtils.getConnectionItemByItemId(value);
                    if (item != null && item instanceof BigQueryConnectionItem) {
                        return (BigQueryConnectionItem) item;
                    }
                }
            }
        }
        return null;

    }

    @Override
    public boolean isBigQueryNode(INode node) {
        if (node != null) {
            IElementParameter param = node.getElementParameter("PROPERTY");
            if (param != null && param.getFieldType() == EParameterFieldType.PROPERTY_TYPE
                    && "BigQuery".equals(param.getRepositoryValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isRepositorySchemaLine(INode node, Map<String, Object> lineValue) {
        return false;
    }

    @Override
    public boolean isBigQueryNode(RepositoryNode node) {
        //seems no need to implement it
        return false;
    }

    @Override
    public IWizard newWizard(IWorkbench workbench, boolean creation, RepositoryNode node, String[] existingNames) {
        IRepositoryViewObject repositoryObject = node.getObject();
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        boolean isReadOnly = false;
        if (factory.isUserReadOnlyOnCurrentProject() || !ProjectManager.getInstance().isInCurrentMainProject(node)) {
            isReadOnly = true;
        }
        if (ENodeType.REPOSITORY_ELEMENT.equals(node.getType())) {
            if (repositoryObject.getRepositoryStatus() == ERepositoryStatus.DELETED
                    || factory.getStatus(repositoryObject) == ERepositoryStatus.DELETED
                    || factory.getStatus(node.getObject()) == ERepositoryStatus.LOCK_BY_OTHER) {
                isReadOnly = true;
            }
        }
        if (repositoryObject instanceof MetadataTableRepositoryObject) {
            MetadataTableRepositoryObject metadataTableRepositoryObject = (MetadataTableRepositoryObject) node.getObject();
            MetadataTable bigqueryTable = (MetadataTable) metadataTableRepositoryObject.getAbstractMetadataObject();
            if (bigqueryTable != null) {
                EMap<String, String> properties = bigqueryTable.getAdditionalProperties();
                String partitionKey = properties.get(EProperties.CONTENT_TYPE.name());
                BigQueryTableWizard bigqueryWizard = new BigQueryTableWizard(workbench, metadataTableRepositoryObject, bigqueryTable,
                        existingNames, isReadOnly);
                return bigqueryWizard;
            }
        } else if (repositoryObject.getRepositoryObjectType() == ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS) {
            return new BigQueryConnectionWizard(workbench, creation, node, existingNames);
        }
        return null;
    }

}
