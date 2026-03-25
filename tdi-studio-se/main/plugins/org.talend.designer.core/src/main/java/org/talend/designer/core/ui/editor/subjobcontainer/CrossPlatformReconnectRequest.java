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

import org.talend.designer.core.ui.editor.connections.ICrossPlatformConnectionPart;


public class CrossPlatformReconnectRequest extends CrossPlatformLocationRequest implements ICrossPlatformReconnectRequest {

    private ICrossPlatformConnectionPart connectionEditPart;

    private ICrossPlatformEditPart target;

    public CrossPlatformReconnectRequest(Object type) {
        super(type);
    }

    @Override
    public ICrossPlatformConnectionPart getConnectionEditPart() {
        return connectionEditPart;
    }

    @Override
    public void setConnectionEditPart(ICrossPlatformConnectionPart part) {
        this.connectionEditPart = part;
    }

    @Override
    public ICrossPlatformEditPart getTarget() {
        return target;
    }

    @Override
    public void setTargetEditPart(ICrossPlatformEditPart ep) {
        this.target = ep;
    }

}
