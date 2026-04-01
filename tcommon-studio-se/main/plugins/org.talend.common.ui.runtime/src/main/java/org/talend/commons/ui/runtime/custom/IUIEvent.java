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

import java.util.Map;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface IUIEvent {

    static final String TYPE_GLOBAL = "global";

    String getType();

    String getUIId();

    void setUIId(String id);

    String getKey();

    Map<String, Object> getParams();

}
