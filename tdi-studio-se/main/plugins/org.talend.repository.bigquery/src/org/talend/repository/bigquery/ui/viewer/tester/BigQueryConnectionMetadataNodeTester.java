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

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.view.di.metadata.tester.CoMetadataNodeTester;
import org.talend.repository.view.di.metadata.tester.SchemaColumnNodeTester;
import org.talend.repository.view.di.metadata.tester.SchemaNodeTester;

public class BigQueryConnectionMetadataNodeTester extends CoMetadataNodeTester {

    private SchemaNodeTester schemaTester = new SchemaNodeTester();

    private SchemaColumnNodeTester schemaColTester = new SchemaColumnNodeTester();

    private static final String IS_BIGQUERY_CONNECTION = "isBigQueryConnection"; //$NON-NLS-1$

    @Override
    protected ERepositoryObjectType findType(String property) {
        if (IS_BIGQUERY_CONNECTION.equals(property)) {
            return ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS;
        }
        return null;
    }

    @Override
    protected Boolean testProperty(Object receiver, String property, Object[] args, Object expectedValue) {
        if (receiver instanceof RepositoryNode) {
            RepositoryNode repositoryNode = (RepositoryNode) receiver;

            final ERepositoryObjectType propertyType = findType(property);

            if (propertyType != null) {
                if (repositoryNode.getType() == ENodeType.STABLE_SYSTEM_FOLDER) {
                    Boolean parentTest = testProperty(repositoryNode.getParent(), property, args, expectedValue);
                    if (parentTest != null) { // only do for the checked parent.
                        return parentTest;
                    }
                }
                boolean currentType = isTypeNode(repositoryNode, propertyType);
                boolean isBigQuerySchema = checkImplicatedTeser(schemaTester, repositoryNode,
                        ERepositoryObjectType.METADATA_CON_TABLE, propertyType);
                boolean isBigQuerySchemaColumn = checkImplicatedTeser(schemaColTester, repositoryNode,
                        ERepositoryObjectType.METADATA_CON_COLUMN, propertyType);

                return currentType || isBigQuerySchema || isBigQuerySchemaColumn;
            }
        }
        return null;
    }
}
