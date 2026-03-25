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

import org.eclipse.gef.commands.Command;


public class CrossPlatformCreateConnectionRequest extends CrossPlatformCreateRequest
        implements ICrossPlatformCreateConnectionRequest {

    private ICrossPlatformEditPart sourceEditPart;

    private ICrossPlatformEditPart targetEditPart;

    private Command startCmd;

    public CrossPlatformCreateConnectionRequest() {
        super();
    }

    @Override
    public ICrossPlatformEditPart getSourceEditPart() {
        return sourceEditPart;
    }

    @Override
    public void setSourceEditPart(ICrossPlatformEditPart ep) {
        this.sourceEditPart = ep;
    }

    @Override
    public ICrossPlatformEditPart getTargetEditPart() {
        return targetEditPart;
    }

    @Override
    public void setTargetEditPart(ICrossPlatformEditPart ep) {
        this.targetEditPart = ep;
    }

    @Override
    public Command getStartCommand() {
        return startCmd;
    }

    @Override
    public void setStartCommand(Command c) {
        this.startCmd = c;
    }

}
