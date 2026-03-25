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
package org.talend.designer.core.ui.editor.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess2;
import org.talend.designer.core.ui.editor.cmd.DeleteNodeContainerCommand;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformGroupRequest;

public class CrossPlatformNodeEditPolicy extends CrossPlatformComponentEditPolicy {

    public CrossPlatformNodeEditPolicy() {
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Command createDeleteCommand(ICrossPlatformGroupRequest request) {
        if (((Node) getHost().getCrossPlatformModel()).isReadOnly()) {
            return null;
        }
        List<INode> nodeList = new ArrayList<INode>();
        for (int i = 0; i < request.getEditParts().size(); i++) {
            if (request.getEditParts().get(i) instanceof ICrossPlatformNodePart) {
                INode node = ((INode) ((ICrossPlatformNodePart) request.getEditParts().get(i)).getCrossPlatformModel());
                if (node.isReadOnly()) {
                    continue;
                }
                if (!nodeList.contains(node)) {
                    nodeList.add(node);
                }
            }
        }
        ICrossPlatformEditPartViewer viewer = this.getHost().getCrossPlatformViewer();
        if (viewer != null) {
            viewer.deselectAll();
        }

        DeleteNodeContainerCommand deleteCommand = new DeleteNodeContainerCommand((IProcess2) nodeList.get(0).getProcess(),
                nodeList);
        return deleteCommand;
    }

}
