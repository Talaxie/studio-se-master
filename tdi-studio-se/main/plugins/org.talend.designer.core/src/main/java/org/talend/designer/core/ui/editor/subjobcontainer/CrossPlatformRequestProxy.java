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

import java.util.Map;

import org.eclipse.gef.Request;


public class CrossPlatformRequestProxy implements ICrossPlatformRequest, ICrossPlatformRequestProxy {

    private Request request;

    public CrossPlatformRequestProxy(Request request) {
        this.request = request;
    }

    @Override
    public Request getHost() {
        return request;
    }

    @Override
    public Map getExtendedData() {
        return request.getExtendedData();
    }

    @Override
    public void setExtendedData(Map map) {
        request.setExtendedData(map);
    }

    @Override
    public Object getType() {
        return request.getType();
    }

    @Override
    public void setType(Object type) {
        request.setType(type);
    }

    public Request getOrigin() {
        return request;
    }

}
