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
package org.talend.designer.gefabstractmap.part;

import org.eclipse.gef.EditPart;
import org.talend.designer.core.ui.editor.connections.AbstractSwtConnectionEditPart;

/**
 * DOC talend class global comment. Detailled comment
 */
public abstract class BaseConnectionEditPart extends AbstractSwtConnectionEditPart {

    private boolean nodeCollapsed = false;

    private boolean sourceConcained = true;

    private boolean targetContained = true;

    public boolean isDOTStyle() {
        return nodeCollapsed || !sourceConcained || !targetContained;
    }

    public void setNodeCollapsed(boolean nodeCollapsed) {
        this.nodeCollapsed = nodeCollapsed;
    }

    public void setSourceConcained(boolean sourceConcained) {
        this.sourceConcained = sourceConcained;
    }

    public void setTargetContained(boolean targetContained) {
        this.targetContained = targetContained;
    }

    public abstract void updateForegroundColor(boolean selected);

    @Override
    protected void createEditPolicies() {

    }

    @Override
    public EditPart getSource() {
        return super.getSource();
    }

    @Override
    public EditPart getTarget() {
        return super.getTarget();
    }

}
