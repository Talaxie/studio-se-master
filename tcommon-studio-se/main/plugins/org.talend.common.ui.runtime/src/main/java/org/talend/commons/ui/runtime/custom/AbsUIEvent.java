// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime.custom;

import java.util.HashMap;
import java.util.Map;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class AbsUIEvent implements IUIEvent {

    private String type;

    private String id;

    private String key;

    private Map<String, Object> params = new HashMap<>();

    public AbsUIEvent(String key, String id, String type) {
        this.key = key;
        this.id = id;
        this.type = type;
    }

    @Override
    public String getUIId() {
        return id;
    }

    @Override
    public void setUIId(String id) {
        this.id = id;
    }

    @Override
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Map<String, Object> getParams() {
        return params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
