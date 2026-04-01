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
package org.talend.designer.core.ui.editor.nodes;

import org.eclipse.gef.RequestConstants;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;

public abstract class AbsCrossPlatformEditPolicy implements ICrossPlatformEditPolicy, RequestConstants {

    private ICrossPlatformEditPart host;

    public AbsCrossPlatformEditPolicy() {
    }

    @Override
    public ICrossPlatformEditPart getHost() {
        return host;
    }

    @Override
    public void setHost(ICrossPlatformEditPart host) {
        this.host = host;
    }

    @Override
    public void cpActivate() {
    }

    @Override
    public void cpDeactivate() {
    }

}
