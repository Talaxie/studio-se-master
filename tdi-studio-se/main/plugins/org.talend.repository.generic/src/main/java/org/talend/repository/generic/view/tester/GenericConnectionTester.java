package org.talend.repository.generic.view.tester;

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.generic.util.GenericWizardServiceFactory;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.tester.SubNodeTester;
import org.talend.repository.view.di.metadata.tester.CoMetadataNodeTester;

/**
 * 
 * created by ycbai on 2015年9月16日 Detailled comment
 *
 */
public class GenericConnectionTester extends CoMetadataNodeTester {

    private static final String IS_GENERIC_CONNECTION = "isGenericConnection"; //$NON-NLS-1$

    @Override
    protected Boolean testProperty(Object receiver, String property, Object[] args, Object expectedValue) {
        if (receiver instanceof RepositoryNode) {
            RepositoryNode repositoryNode = (RepositoryNode) receiver;
            if (IS_GENERIC_CONNECTION.equals(property)) {
                ERepositoryObjectType contentType = getNodeContentType(repositoryNode);
                boolean isGenericType = GenericWizardServiceFactory.getGenericWizardService().isGenericType(contentType);
                if (repositoryNode.getType() == ENodeType.STABLE_SYSTEM_FOLDER) {
                    // stable folder(Queries,Table schemas, View schemas, Synonym schemas, Columns)
                    Boolean parentTest = testProperty(repositoryNode.getParent(), property, args, expectedValue);
                    if (parentTest != null) { // only do for the checked parent.
                        return parentTest;
                    }
                }
                /*
                 * check the implication, such as query, schema, column,[CDC] etc
                 */
                boolean schemaTest = checkImplicatedTeser(schemaTester, repositoryNode, ERepositoryObjectType.METADATA_CON_TABLE,
                        contentType);
                boolean schemaColTest = checkImplicatedTeser(schemaColTester, repositoryNode,
                        ERepositoryObjectType.METADATA_CON_COLUMN, contentType);
                boolean queryTest = checkImplicatedTeser(queryTester, repositoryNode, ERepositoryObjectType.METADATA_CON_QUERY,
                        contentType);
                
                boolean isNewJDBC = isNewJDBCObjectType(contentType);
                return isGenericType || schemaTest || schemaColTest || queryTest || isNewJDBC;
            }
        }
        return null;
    }
    
    private boolean isNewJDBCObjectType(ERepositoryObjectType contentType) {
        if (ERepositoryObjectType.METADATA_TACOKIT_JDBC.equals(contentType)) {
            return true;
        }
        return false;
    }

    @Override
    protected boolean checkImplicatedTeser(SubNodeTester subTester, RepositoryNode repositoryNode,
            ERepositoryObjectType testerType, ERepositoryObjectType propertyType) {
        boolean isTypeNode = subTester.isTypeNode(repositoryNode, testerType);
        ERepositoryObjectType parentItemType = subTester.findParentItemType(repositoryNode);
        boolean isGenericType = GenericWizardServiceFactory.getGenericWizardService().isGenericType(parentItemType) || isNewJDBCObjectType(parentItemType);
        return isTypeNode && isGenericType;
    }

    @Override
    protected ERepositoryObjectType findType(String property) {
        return null;
    }

}
