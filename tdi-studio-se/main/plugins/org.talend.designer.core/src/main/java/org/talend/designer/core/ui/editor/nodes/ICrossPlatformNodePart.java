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

import java.util.List;

import org.talend.core.model.process.INode;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;

public interface ICrossPlatformNodePart extends ICrossPlatformEditPart {

    @Override
    default List getCrossPlatformModelSourceConnections() {
        return ((INode) this.getCrossPlatformModel()).getOutgoingConnections();
    }

    @Override
    default List getCrossPlatformModelTargetConnections() {
        return ((INode) this.getCrossPlatformModel()).getIncomingConnections();
    }

}
