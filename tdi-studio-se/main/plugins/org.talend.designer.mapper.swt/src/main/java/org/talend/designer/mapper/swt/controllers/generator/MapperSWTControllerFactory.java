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
package org.talend.designer.mapper.swt.controllers.generator;

import org.talend.core.model.metadata.IDynamicBaseProperty;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.executors.IControllerExecutor;
import org.talend.designer.core.ui.editor.properties.controllers.generator.AbsControllerFactory;
import org.talend.designer.core.ui.editor.properties.controllers.generator.ExternalGenerator;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IControllerUI;
import org.talend.designer.mapper.swt.controllers.ui.ExternalTypeSWTControllerUI;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class MapperSWTControllerFactory extends AbsControllerFactory {

    @Override
    public IControllerUI createUI(String name, IDynamicProperty dp) {
        if (ExternalGenerator.class.getCanonicalName().equals(name)) {
            return new ExternalTypeSWTControllerUI(dp);
        }
        return null;
    }

    @Override
    public IControllerExecutor createExecutor(String name, IDynamicBaseProperty dynamicBaseProp, IElementParameter curParameter) {
        // SWT Studio shouldn't call createExecutor directly, the executor can be found from Controller UI
        throw new UnsupportedOperationException("Bad call");
    }

}
