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
package org.talend.designer.core.ui.editor.cmd;

import org.talend.commons.ui.runtime.custom.ICommonUIHandler;
import org.talend.commons.ui.runtime.custom.IUIHandler;
import org.talend.designer.core.ui.editor.cmd.ChangeMetadataCommand.IChangeMetadataCommandUIHandler;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class DesignerSwtUIHandlerFactory extends AbsCmdUIHandlerFactory {

    public DesignerSwtUIHandlerFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public <T extends IUIHandler> T getUIHandler(Class<T> clz) {
        if (IChangeMetadataCommandUIHandler.class.equals(clz)) {
            return (T) new ChangeMetadataCommandSwtUIHandler();
        } else if (ICommonUIHandler.class.equals(clz)) {
            return (T) new CommonSwtUIHandler();
        }
        return null;
    }

}
