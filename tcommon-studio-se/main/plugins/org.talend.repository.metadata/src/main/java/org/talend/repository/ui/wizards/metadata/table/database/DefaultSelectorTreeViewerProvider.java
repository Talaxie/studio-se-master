// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.wizards.metadata.table.database;

import java.util.List;

import org.talend.core.model.metadata.builder.database.TableNode;

/**
 * wzhang class global comment. Detailled comment
 */
public class DefaultSelectorTreeViewerProvider extends SelectorTreeViewerProvider {

    public DefaultSelectorTreeViewerProvider() {
        super();
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        TableNode tableNode = (TableNode) parentElement;
        List<TableNode> child = tableNode.getChildren();
        return child.toArray();
    }

}
