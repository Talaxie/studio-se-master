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
package org.talend.designer.core.ui.editor.process;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.talend.designer.core.ui.editor.cmd.CreateNodeContainerCommand;
import org.talend.designer.core.ui.editor.cmd.CreateNoteCommand;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodes.AbsCrossPlatformEditPolicy;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.notes.Note;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformCreateRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRequest;


public class CrossPlatformProcessLayoutEditPolicy extends AbsCrossPlatformEditPolicy {

    public CrossPlatformProcessLayoutEditPolicy() {
    }

    @Override
    public Command getCommand(ICrossPlatformRequest request) {
        if (REQ_CREATE.equals(request.getType())) {
            ICrossPlatformCreateRequest createReq = (ICrossPlatformCreateRequest) request;
            return getCreateCommand(createReq, createReq.getLocation());
        }
        return null;
    }

    public Command getCreateCommand(final ICrossPlatformCreateRequest request, Point location) {
        if (((Process) getHost().getCrossPlatformModel()).isReadOnly()) {
            return null;
        }

        Command command = null;
        if (Note.class.equals(request.getNewObjectType())) {
            command = new CreateNoteCommand((Process) getHost().getCrossPlatformModel(), (Note) request.getNewObject(),
                    location);
        } else if (request.getNewObject() instanceof Node) {
            Node node = (Node) request.getNewObject();
            NodeContainer nodeContainer = ((Process) node.getProcess()).loadNodeContainer(node, false);
            command = new CreateNodeContainerCommand((Process) getHost().getCrossPlatformModel(), nodeContainer, location);
        }

        return command;
    }

}
