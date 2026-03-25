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


public class CrossPlatformRequest implements ICrossPlatformRequest {

    private Object type;

    private Map extendedData;

    public CrossPlatformRequest(Object type) {
        setType(type);
    }

    @Override
    public Map getExtendedData() {
        return extendedData;
    }

    @Override
    public void setExtendedData(Map map) {
        this.extendedData = map;
    }

    @Override
    public Object getType() {
        return type;
    }

    @Override
    public void setType(Object type) {
        this.type = type;
    }

}
