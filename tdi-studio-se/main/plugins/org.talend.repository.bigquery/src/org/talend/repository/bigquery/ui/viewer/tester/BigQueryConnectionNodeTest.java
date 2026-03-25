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
package org.talend.repository.bigquery.ui.viewer.tester;

import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.tester.AbstractNodeTester;

public class BigQueryConnectionNodeTest extends AbstractNodeTester {

    private static final String isBigQueryConnectionNode = "isBigQueryConnectionNode";

    private static final String isDeletedSubNode = "isDeletedSubNode";

    @Override
    protected Boolean testProperty(Object receiver, String property, Object[] args, Object expectedValue) {
        if (isBigQueryConnectionNode.equals(property)) {
            if (receiver instanceof RepositoryNode) {
                RepositoryNode node = (RepositoryNode) receiver;
                if (node.getObject() != null && ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS == getNodeContentType(node)) {
                    return true;
                }
            }

        } else if (isDeletedSubNode.equals(property)) {
            IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
            if (receiver instanceof RepositoryNode) {
                RepositoryNode node = (RepositoryNode) receiver;
                if (node.getObject() != null && (factory.getStatus(node.getObject()) == ERepositoryStatus.DELETED)) {
                    return true;
                }
            }
        }
        return false;

    }
}
