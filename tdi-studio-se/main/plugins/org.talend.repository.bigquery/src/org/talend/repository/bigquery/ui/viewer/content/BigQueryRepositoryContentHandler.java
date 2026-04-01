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
package org.talend.repository.bigquery.ui.viewer.content;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.resource.Resource;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.AbstractRepositoryContentHandler;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.utils.XmiResourceManager;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;

public class BigQueryRepositoryContentHandler extends AbstractRepositoryContentHandler {

    XmiResourceManager xmiResourceManager = ProxyRepositoryFactory.getInstance().getRepositoryFactoryFromProvider()
            .getResourceManager();

    @Override
    public Resource create(IProject project, Item item, int classifierID, IPath path) throws PersistenceException {
        // create is handled in LocalRepositoryFactory
        return null;
    }

    @Override
    public Resource save(Item item) throws PersistenceException {
        // save is handled in LocalRepositoryFactory
        return null;
    }

    @Override
    public boolean isOwnTable(IRepositoryNode node, Class type) {
        if (type != BigQueryConnection.class) {
            return false;
        }

        ERepositoryObjectType nodeType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        if (nodeType == ERepositoryObjectType.METADATA_CON_TABLE) {
            RepositoryNode repNode = node.getParent();
            nodeType = (ERepositoryObjectType) repNode.getProperties(EProperties.CONTENT_TYPE);
            if (nodeType == ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS) {
                return true;
            }
        } else if (nodeType == ERepositoryObjectType.METADATA_CON_COLUMN) {
            RepositoryNode repNode = node.getParent().getParent().getParent();
            nodeType = (ERepositoryObjectType) repNode.getProperties(EProperties.CONTENT_TYPE);
            if (nodeType == ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Item createNewItem(ERepositoryObjectType type) {
        return null;
    }

    @Override
    public boolean isRepObjType(ERepositoryObjectType type) {
        return false;
    }

    @Override
    public ERepositoryObjectType getRepositoryObjectType(Item item) {
        return null;
    }

}
