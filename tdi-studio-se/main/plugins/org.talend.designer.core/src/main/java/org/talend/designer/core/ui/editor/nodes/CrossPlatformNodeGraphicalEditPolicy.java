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

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.talend.core.model.process.ProcessUtils;
import org.talend.designer.core.ui.editor.cmd.ConnectionCreateCommand;
import org.talend.designer.core.ui.editor.cmd.ConnectionReconnectCommand;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformCreateConnectionRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformReconnectRequest;

public class CrossPlatformNodeGraphicalEditPolicy extends CrossPlatformGraphicalNodeEditPolicy {

    public CrossPlatformNodeGraphicalEditPolicy() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Command getConnectionCompleteCommand(ICrossPlatformCreateConnectionRequest request) {
        ConnectionCreateCommand cmd = (ConnectionCreateCommand) request.getStartCommand();
        cmd.setTarget((Node) getHost().getCrossPlatformModel());
        return cmd;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Command getConnectionCreateCommand(ICrossPlatformCreateConnectionRequest request) {
        Node source = (Node) getHost().getCrossPlatformModel();
        if (checkConnectionStatus(source)) {
            return null;
        }
        String style = (String) request.getNewObjectType();
        ConnectionCreateCommand cmd = new ConnectionCreateCommand(source, style, (List<Object>) request.getNewObject());
        request.setStartCommand(cmd);
        return cmd;
    }

    @Override
    public Command getReconnectSourceCommand(ICrossPlatformReconnectRequest request) {
        Connection conn = (Connection) request.getConnectionEditPart().getCrossPlatformModel();
        Node newSource = (Node) getHost().getCrossPlatformModel();
        if (checkConnectionStatus(newSource)) {
            return null;
        }
        ConnectionReconnectCommand cmd = new ConnectionReconnectCommand(conn);
        cmd.setNewSource(newSource);
        return cmd;
    }

    @Override
    public Command getReconnectTargetCommand(ICrossPlatformReconnectRequest request) {
        Connection conn = (Connection) request.getConnectionEditPart().getCrossPlatformModel();
        Node newTarget = (Node) getHost().getCrossPlatformModel();
        if (checkConnectionStatus(newTarget)) {
            return null;
        }

        ConnectionReconnectCommand cmd = new ConnectionReconnectCommand(conn);
        cmd.setNewTarget(newTarget);
        return cmd;
    }

    private boolean checkConnectionStatus(Node node) {
        if (node.isReadOnly() && !ProcessUtils.isTestContainer(node.getProcess())) {
            return true;
        }
        return false;
    }

}
