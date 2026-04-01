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
package org.talend.designer.core.ui.editor.nodes;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.talend.designer.core.DesignerPlugin;
import org.talend.designer.core.ui.editor.connections.TalendBorderItemRectilinearRouter;
import org.talend.designer.core.ui.editor.connections.TalendDummyConnection;
import org.talend.designer.core.ui.editor.subjobcontainer.CrossPlatformCreateConnectionRequestProxy;
import org.talend.designer.core.ui.editor.subjobcontainer.CrossPlatformReconnectRequestProxy;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;
import org.talend.designer.core.ui.preferences.TalendDesignerPrefConstants;

/**
 * Edit policy that will allow connections to connect to the node. <br/>
 *
 * $Id$
 *
 */
public class NodeGraphicalEditPolicy extends GraphicalNodeEditPolicy {

    private CrossPlatformNodeGraphicalEditPolicy editPolicy;

    public NodeGraphicalEditPolicy() {
        editPolicy = new CrossPlatformNodeGraphicalEditPolicy();
    }

    @Override
    public void setHost(EditPart host) {
        super.setHost(host);
        if (host != null) {
            editPolicy.setHost((ICrossPlatformEditPart) host);
        }
    }

    @Override
    protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
        return editPolicy.getConnectionCompleteCommand(new CrossPlatformCreateConnectionRequestProxy(request));
    }

    @Override
    @SuppressWarnings("unchecked")
    protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
        return editPolicy.getConnectionCreateCommand(new CrossPlatformCreateConnectionRequestProxy(request));
    }

    @Override
    protected Command getReconnectSourceCommand(ReconnectRequest request) {
        return editPolicy.getReconnectSourceCommand(new CrossPlatformReconnectRequestProxy(request));
    }

    @Override
    protected Command getReconnectTargetCommand(ReconnectRequest request) {
        return editPolicy.getReconnectTargetCommand(new CrossPlatformReconnectRequestProxy(request));
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#createDummyConnection(org.eclipse.gef.Request)
     */
    @Override
    protected org.eclipse.draw2d.Connection createDummyConnection(Request req) {
        if (DesignerPlugin.getDefault().getPreferenceStore().getBoolean(TalendDesignerPrefConstants.EDITOR_LINESTYLE)) {
            TalendDummyConnection dummyConn = new TalendDummyConnection();
            dummyConn.setRoundedBendpointsRadius(32);
            return dummyConn;
        }
        return super.createDummyConnection(req);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#getDummyConnectionRouter(org.eclipse.gef.requests.
     * CreateConnectionRequest)
     */
    @Override
    protected ConnectionRouter getDummyConnectionRouter(CreateConnectionRequest request) {
        if (DesignerPlugin.getDefault().getPreferenceStore().getBoolean(TalendDesignerPrefConstants.EDITOR_LINESTYLE)) {
            return new TalendBorderItemRectilinearRouter(request);
        }
        return super.getDummyConnectionRouter(request);
    }

}
