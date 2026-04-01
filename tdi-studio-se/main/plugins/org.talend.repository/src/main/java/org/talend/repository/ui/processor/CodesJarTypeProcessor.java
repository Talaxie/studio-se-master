// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.processor;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.Viewer;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;

public class CodesJarTypeProcessor extends SingleTypeProcessor {

    private ERepositoryObjectType type;
    private Set<String> sourceItems = new HashSet<String>();

    public CodesJarTypeProcessor(String repositoryType, ERepositoryObjectType type,  Set<String> sourceItems) {
        super(repositoryType);
        this.type = type;
        this.sourceItems = sourceItems;
    }

    @Override
    protected ERepositoryObjectType getType() {
        return type;
    }

    @Override
    protected boolean selectRepositoryNode(Viewer viewer, RepositoryNode parentNode, RepositoryNode node) {
        return node.getProperties(EProperties.CONTENT_TYPE) == type;
    }
    
    @Override
    public boolean isSelectionValid(RepositoryNode node) {
        if (node.getObjectType() != getType()) {
            return false;
        }
        for (IRepositoryNode child: node.getChildren()) {
            if (sourceItems.contains(child.getObject().getProperty().getLabel())) {
                return false;
            }
        }     
        return true;
    }

}
