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
package org.talend.designer.core.ui.editor.subjobcontainer;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.requests.ReconnectRequest;
import org.talend.designer.core.ui.editor.connections.ICrossPlatformConnectionPart;


public class CrossPlatformReconnectRequestProxy extends CrossPlatformLocationRequestProxy
        implements ICrossPlatformReconnectRequest {

    private ICrossPlatformConnectionPart connectionEditPart;

    public CrossPlatformReconnectRequestProxy(ReconnectRequest request) {
        super(request);
    }

    @Override
    public ReconnectRequest getOrigin() {
        return (ReconnectRequest) super.getOrigin();
    }

    @Override
    public ICrossPlatformConnectionPart getConnectionEditPart() {
        if (connectionEditPart != null) {
            return connectionEditPart;
        }
        return (ICrossPlatformConnectionPart) getOrigin().getConnectionEditPart();
    }

    @Override
    public void setConnectionEditPart(ICrossPlatformConnectionPart part) {
        this.connectionEditPart = part;
    }

    @Override
    public ICrossPlatformEditPart getTarget() {
        return (ICrossPlatformEditPart) getOrigin().getTarget();
    }

    @Override
    public void setTargetEditPart(ICrossPlatformEditPart ep) {
        getOrigin().setTargetEditPart((EditPart) ep);
    }

}
