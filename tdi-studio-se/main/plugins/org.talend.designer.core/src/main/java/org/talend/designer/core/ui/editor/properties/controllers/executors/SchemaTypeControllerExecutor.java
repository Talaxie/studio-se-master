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
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class SchemaTypeControllerExecutor extends SchemaControllerExecutor implements ISchemaTypeControllerExecutor {

    /**
     * DOC cmeng SchemaTypeControllerExecutor constructor comment.
     */
    public SchemaTypeControllerExecutor() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean execute(Map<String, Object> params) {
        Command command = createButtonCommand(getUi().getButtonContext());
        if (command != null) {
            if (command.canExecute()) {
                getUi().executeCommand(command);
                return true;
            }
        }
        return false;
    }

    @Override
    public IMetadataTable getMetadataTableFromXml(INode node) {
        IElementParameter param = node.getElementParameterFromField(EParameterFieldType.SCHEMA_TYPE);
        if (param.getValue() instanceof IMetadataTable) {
            IMetadataTable table = (IMetadataTable) param.getValue();
            return table;
        }
        return null;
    }

}
