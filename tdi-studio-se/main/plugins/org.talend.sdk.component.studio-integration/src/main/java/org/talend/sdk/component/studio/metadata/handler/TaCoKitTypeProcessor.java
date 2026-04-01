/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.studio.metadata.handler;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.Viewer;
import org.talend.core.model.properties.TacokitDatabaseConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.processor.MultiTypesProcessor;
import org.talend.sdk.component.studio.metadata.node.TaCoKitFamilyRepositoryNode;

/**
 * TaCoKit specific TypeProcessor. TypeProcessor filters repository in Repository Review dialog.
 * It allows to show only nodes related to component
 */
public class TaCoKitTypeProcessor extends MultiTypesProcessor {

    boolean isJDBC;

    public TaCoKitTypeProcessor(final String[] repositoryTypes) {
        super(repositoryTypes);
        isJDBC = getShowRootTypes().contains(ERepositoryObjectType.METADATA_TACOKIT_JDBC);
    }

    /**
     * Returns repository object types supported by current component
     *
     * @return types supported by the component
     */
    @Override
    protected List<ERepositoryObjectType> getTypes() {
        return Arrays.stream(getRepositoryTypes()).map(ERepositoryObjectType::getTypeFromKey).collect(
                Collectors.toList());
    }

    @Override
    protected boolean selectRepositoryNode(final Viewer viewer, final RepositoryNode parentNode,
            final RepositoryNode node) {
        if (node instanceof TaCoKitFamilyRepositoryNode) {
            TaCoKitFamilyRepositoryNode tacokitNode = (TaCoKitFamilyRepositoryNode) node;
            ERepositoryObjectType type = tacokitNode.getContentType();
            for (String repositoryType : getRepositoryTypes()) {
                if (repositoryType.startsWith(type.getKey())) {
                    return true;
                }
            }
        }
        ERepositoryObjectType nodeObjectType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        if (ENodeType.SIMPLE_FOLDER == node.getType()) {
            return true;
        }
        if (isJDBC) {
            if (node.getObject() != null && node.getObject().getProperty() != null) {
                return TacokitDatabaseConnectionItem.class.isInstance(node.getObject().getProperty().getItem());
            }
        }

        if (getShowRootTypes().contains(nodeObjectType)) {
            return true;
        }
        return false;
    }

}
