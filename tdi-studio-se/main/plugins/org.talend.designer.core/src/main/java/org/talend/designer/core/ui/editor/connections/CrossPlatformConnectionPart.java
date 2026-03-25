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
package org.talend.designer.core.ui.editor.connections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.talend.designer.core.ui.editor.cmd.ConnectionDeleteCommand;
import org.talend.designer.core.ui.editor.subjobcontainer.AbsCrossPlatformConnectionEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformGroupRequest;


public class CrossPlatformConnectionPart extends AbsCrossPlatformConnectionEditPart implements ICrossPlatformConnectionPart {

    public CrossPlatformConnectionPart(Object model, ICrossPlatformEditPart source, ICrossPlatformEditPart target) {
        super(model, source, target);
    }

    @Override
    public void createEditPolicies() {
        super.createEditPolicies();
        // Allows the removal of the connection model element
        installEditPolicy(EditPolicy.CONNECTION_ROLE, new CrossPlatformConnectionEditPolicy() {

            @Override
            protected Command getDeleteCommand(ICrossPlatformGroupRequest request) {
                if (((Connection) getCrossPlatformModel()).isReadOnly()) {
                    return null;
                }
                List<Connection> connectionList = new ArrayList<Connection>();
                for (int i = 0; i < request.getEditParts().size(); i++) {
                    if (request.getEditParts().get(i) instanceof ICrossPlatformConnectionPart) {
                        connectionList
                                .add(((Connection) ((ICrossPlatformConnectionPart) request.getEditParts().get(i)).getCrossPlatformModel()));
                    }
                }
                return new ConnectionDeleteCommand(connectionList);
            }
        });
    }

    @Override
    public List getCrossPlatformModelChildren() {
        return ICrossPlatformConnectionPart.super.getCrossPlatformModelChildren();
    }

}
