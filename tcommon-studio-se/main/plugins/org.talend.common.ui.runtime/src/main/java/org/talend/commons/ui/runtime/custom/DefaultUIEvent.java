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


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class DefaultUIEvent extends AbsUIEvent {

    public DefaultUIEvent(String key, String id) {
        // type is null, means it is an event side the custom ui, which id is 'id'
        super(key, id, null);
    }

    public DefaultUIEvent(String key, String id, String type) {
        super(key, id, type);
    }

}
