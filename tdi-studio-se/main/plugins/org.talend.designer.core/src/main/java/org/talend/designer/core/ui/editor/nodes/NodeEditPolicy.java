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

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.CrossPlatformGroupRequestProxy;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;

/**
 * Edit policy that will manage the deletion of a node and the changement of status. <br/>
 *
 * $Id$
 *
 */
public class NodeEditPolicy extends ComponentEditPolicy implements IEditPolicy {

    private CrossPlatformNodeEditPolicy editPolicy;

    public NodeEditPolicy() {
        super();
        editPolicy = new CrossPlatformNodeEditPolicy();
    }

    @Override
    public ICrossPlatformEditPolicy getCrossPlatformEditPolicy() {
        return editPolicy;
    }

    @Override
    public void setHost(EditPart host) {
        super.setHost(host);
        if (host != null) {
            editPolicy.setHost((ICrossPlatformEditPart) host);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.gef.editpolicies.ComponentEditPolicy#createDeleteCommand(org.eclipse.gef.requests.GroupRequest)
     */
    @Override
    protected Command createDeleteCommand(GroupRequest request) {
        CrossPlatformGroupRequestProxy deleteReq = new CrossPlatformGroupRequestProxy(request);
        return editPolicy.createDeleteCommand(deleteReq);
    }
}
