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
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.talend.core.model.process.IExternalNode;
import org.talend.core.ui.metadata.dialog.MetadataDialog;
import org.talend.designer.core.model.components.ExternalUtilities;
import org.talend.designer.core.ui.editor.cmd.ExternalNodeChangeCommand;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.ExternalTypeDialogBusinessHandler;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IExternalControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IWidgetContext;

public class ExternalTypeControllerExecutor extends BusinessControllerExecutor
        implements IExternalTypeControllerExecutor {

    @Override
    protected IExternalControllerUI getUi() {
        return (IExternalControllerUI) super.getUi();
    }

    @Override
    public boolean execute(Map<String, Object> params) {
        Command command = createCommand(getUi().getButtonContext());
        if (command != null) {
            if (command.canExecute()) {
                getUi().executeCommand(command);
                return true;
            }
        }
        return false;
    }

    public Command createCommand(IWidgetContext iWidgetContext) {
        // Node node = (Node) elem;
        Node node = (Node) getElem();

        IExternalNode externalNode = ExternalUtilities.getExternalNodeReadyToOpen(node);

        if (externalNode == null) {
            getUi().openError("Error", "Component plugin not found: " + node.getComponent().getPluginExtension());
        } else {
            ExternalTypeDialogBusinessHandler dialogHandler = new ExternalTypeDialogBusinessHandler(externalNode);
            ExternalTypeDialogBusinessHandler externalDialog = getUi().openExternalNodeDialog(dialogHandler);
            if (externalDialog.getOpenResult().equals(MetadataDialog.OK)) {
                return new ExternalNodeChangeCommand(node, externalNode);
            }
        }
        return null;
    }


}
