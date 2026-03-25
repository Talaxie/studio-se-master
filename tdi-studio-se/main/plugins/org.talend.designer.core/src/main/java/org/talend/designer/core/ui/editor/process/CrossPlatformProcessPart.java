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

import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.talend.designer.core.ui.editor.subjobcontainer.AbsCrossPlatformEditPart;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class CrossPlatformProcessPart extends AbsCrossPlatformEditPart implements ICrossPlatformProcessPart {

    public CrossPlatformProcessPart(Object model) {
        super(model);
    }

    @Override
    public void createEditPolicies() {
        super.createEditPolicies();
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new CrossPlatformProcessLayoutEditPolicy());
    }

    @Override
    public List getCrossPlatformModelChildren() {
        return ICrossPlatformProcessPart.super.getCrossPlatformModelChildren();
    }

}
