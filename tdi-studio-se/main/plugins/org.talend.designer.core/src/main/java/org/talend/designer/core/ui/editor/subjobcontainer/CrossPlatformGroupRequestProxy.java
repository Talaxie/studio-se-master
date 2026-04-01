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

import java.util.List;

import org.eclipse.gef.requests.GroupRequest;


public class CrossPlatformGroupRequestProxy extends CrossPlatformRequestProxy implements ICrossPlatformGroupRequest {

    public CrossPlatformGroupRequestProxy(GroupRequest request) {
        super(request);
    }

    @Override
    public GroupRequest getOrigin() {
        return (GroupRequest) super.getOrigin();
    }

    @Override
    public List getEditParts() {
        return getOrigin().getEditParts();
    }

    @Override
    public void setEditParts(List list) {
        getOrigin().setEditParts(list);
    }

}
