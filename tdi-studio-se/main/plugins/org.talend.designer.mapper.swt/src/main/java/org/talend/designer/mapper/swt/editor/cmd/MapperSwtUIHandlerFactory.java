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
package org.talend.designer.mapper.swt.editor.cmd;

import org.talend.commons.ui.runtime.custom.IUIHandler;
import org.talend.designer.core.ui.editor.cmd.AbsCmdUIHandlerFactory;

public class MapperSwtUIHandlerFactory extends AbsCmdUIHandlerFactory {

    public MapperSwtUIHandlerFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public <T extends IUIHandler> T getUIHandler(Class<T> clz) {
        if (ChangeMapperCommandSwtUIHandler.class.equals(clz)) {
            return (T) new ChangeMapperCommandSwtUIHandler();
        } 
        return null;
    }

}
