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

import org.eclipse.gef.commands.Command;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformCreateConnectionRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformReconnectRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRequest;


public abstract class CrossPlatformGraphicalNodeEditPolicy extends AbsCrossPlatformEditPolicy {

    public CrossPlatformGraphicalNodeEditPolicy() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Command getCommand(ICrossPlatformRequest request) {
        if (REQ_CONNECTION_START.equals(request.getType()))
            return getConnectionCreateCommand((ICrossPlatformCreateConnectionRequest) request);
        if (REQ_CONNECTION_END.equals(request.getType()))
            return getConnectionCompleteCommand((ICrossPlatformCreateConnectionRequest) request);
        if (REQ_RECONNECT_TARGET.equals(request.getType()))
            return getReconnectTargetCommand((ICrossPlatformReconnectRequest) request);
        if (REQ_RECONNECT_SOURCE.equals(request.getType()))
            return getReconnectSourceCommand((ICrossPlatformReconnectRequest) request);

        return null;
    }

    public abstract Command getConnectionCreateCommand(ICrossPlatformCreateConnectionRequest request);

    public abstract Command getConnectionCompleteCommand(ICrossPlatformCreateConnectionRequest request);

    public abstract Command getReconnectTargetCommand(ICrossPlatformReconnectRequest request);

    public abstract Command getReconnectSourceCommand(ICrossPlatformReconnectRequest request);

}
