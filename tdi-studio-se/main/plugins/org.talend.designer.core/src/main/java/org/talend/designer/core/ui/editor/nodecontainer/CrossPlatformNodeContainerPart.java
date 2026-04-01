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
package org.talend.designer.core.ui.editor.nodecontainer;

import java.util.List;

import org.talend.designer.core.ui.editor.nodes.ICrossPlatformNodePart;
import org.talend.designer.core.ui.editor.subjobcontainer.AbsCrossPlatformEditPart;


public class CrossPlatformNodeContainerPart extends AbsCrossPlatformEditPart implements ICrossPlatformNodeContainerPart {

    public CrossPlatformNodeContainerPart(Object model) {
        super(model);
    }

    @Override
    public ICrossPlatformNodePart getCrossPlatformNodePart() {
        Object o = this.getCrossPlatformChildren().get(0);
        if (o instanceof ICrossPlatformNodePart) {
            return (ICrossPlatformNodePart) o;
        }
        return null;
    }

    @Override
    public List getCrossPlatformModelChildren() {
        return ICrossPlatformNodeContainerPart.super.getCrossPlatformModelChildren();
    }

}
