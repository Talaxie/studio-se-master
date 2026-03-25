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
package org.talend.designer.core.ui.editor.properties.controllers.ui;

import java.util.HashMap;
import java.util.Map;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class WidgetContext extends AbsWidgetContext {

    private String text;

    private Map<String, Object> dataMap = new HashMap<>();

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Object getData(String param) {
        return dataMap.get(param);
    }

    @Override
    public void setData(String param, Object value) {
        dataMap.put(param, value);
    }

}
