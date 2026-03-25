// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers.generator;

import org.talend.core.model.metadata.IDynamicBaseProperty;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.ISWTBusinessControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.executors.IExternalTypeControllerExecutor;

/**
 * DOC yzhang class global comment. Detailled comment <br/>
 *
 * $Id: ExternalGenerator.java 1 2006-12-22 下午04:39:57 +0000 (下午04:39:57) yzhang $
 *
 */
public class ExternalGenerator implements IControllerGenerator {

    private IDynamicProperty dp;

    /*
     * (non-Javadoc)
     *
     * @see org.talend.designer.core.ui.editor.properties.controllers.generator.IControllerGenerator#generate()
     */
    public ISWTBusinessControllerUI generate() {
        return (ISWTBusinessControllerUI) ControllerFactories.inst().createUI(ExternalGenerator.class.getCanonicalName(), dp);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.designer.core.ui.editor.properties.controllers.generator.IControllerGenerator#setDynamicProperty(org.talend.designer.core.ui.editor.properties.controllers.generator.IDynamicProperty)
     */
    public void setDynamicProperty(IDynamicProperty dp) {
        this.dp = dp;
    }
    

    @Override
    public IExternalTypeControllerExecutor createExecutor(IDynamicBaseProperty dynamicBaseProp, IElementParameter curParameter) {
        return (IExternalTypeControllerExecutor) ControllerFactories.inst().createExecutor(ExternalGenerator.class.getCanonicalName(),
                dynamicBaseProp, curParameter);
    }

}
