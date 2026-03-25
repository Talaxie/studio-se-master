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
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import java.util.Map;

import org.talend.designer.core.ui.editor.properties.controllers.IControllerContext;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IControllerUI;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface IControllerExecutor {

    void init(IControllerContext ctx, IControllerUI ui);

    default Object getData(Map<String, Object> params) {
        return null;
    }

    boolean execute(Map<String, Object> params);

}
