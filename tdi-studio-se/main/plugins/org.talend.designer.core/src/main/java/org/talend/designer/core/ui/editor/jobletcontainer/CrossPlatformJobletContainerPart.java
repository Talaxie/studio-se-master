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
package org.talend.designer.core.ui.editor.jobletcontainer;

import java.util.List;

import org.talend.designer.core.ui.editor.nodecontainer.CrossPlatformNodeContainerPart;


public class CrossPlatformJobletContainerPart extends CrossPlatformNodeContainerPart implements ICrossPlatformJobletContainerPart {

    public CrossPlatformJobletContainerPart(Object model) {
        super(model);
    }

    @Override
    public List getCrossPlatformModelChildren() {
        return ICrossPlatformJobletContainerPart.super.getCrossPlatformModelChildren();
    }

}
