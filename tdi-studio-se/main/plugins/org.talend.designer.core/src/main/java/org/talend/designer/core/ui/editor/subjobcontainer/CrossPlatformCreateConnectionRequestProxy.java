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
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateConnectionRequest;


public class CrossPlatformCreateConnectionRequestProxy extends CrossPlatformCreateRequestProxy
        implements ICrossPlatformCreateConnectionRequest {

    public CrossPlatformCreateConnectionRequestProxy(CreateConnectionRequest request) {
        super(request);
    }

    @Override
    public CreateConnectionRequest getOrigin() {
        return (CreateConnectionRequest) super.getOrigin();
    }

    @Override
    public ICrossPlatformEditPart getSourceEditPart() {
        return (ICrossPlatformEditPart) getOrigin().getSourceEditPart();
    }

    @Override
    public void setSourceEditPart(ICrossPlatformEditPart ep) {
        getOrigin().setSourceEditPart((EditPart) ep);
    }

    @Override
    public ICrossPlatformEditPart getTargetEditPart() {
        return (ICrossPlatformEditPart) getOrigin().getTargetEditPart();
    }

    @Override
    public void setTargetEditPart(ICrossPlatformEditPart ep) {
        getOrigin().setTargetEditPart((EditPart) ep);
    }

    @Override
    public Command getStartCommand() {
        return getOrigin().getStartCommand();
    }

    @Override
    public void setStartCommand(Command c) {
        getOrigin().setStartCommand(c);
    }

}
