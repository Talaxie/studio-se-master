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
import org.talend.designer.core.ui.editor.properties.controllers.executors.IComponentListControllerExecutor;
import org.talend.designer.core.ui.editor.properties.controllers.executors.IControllerExecutor;
import org.talend.designer.core.ui.editor.properties.controllers.tdq.ControllerUtils;
import org.talend.designer.core.ui.editor.properties.controllers.tdq.TGKComponentListController;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 *
 */
public class ComponentListGenerator implements IControllerGenerator {

    private IDynamicProperty dp;

    @Override
    public ISWTBusinessControllerUI generate() {
        if (ControllerUtils.isFromTGenKey(dp.getElement())) {
            return new TGKComponentListController(dp);
        } else {
            return (ISWTBusinessControllerUI) ControllerFactories.inst().createUI(ComponentListGenerator.class.getCanonicalName(),
                    dp);
        }

    }

    @Override
    public void setDynamicProperty(IDynamicProperty dp) {
        this.dp = dp;
    }

    @Override
    public IControllerExecutor createExecutor(IDynamicBaseProperty dynamicBaseProp, IElementParameter curParameter) {
        return (IComponentListControllerExecutor) ControllerFactories.inst()
                .createExecutor(ComponentListGenerator.class.getCanonicalName(), dynamicBaseProp, curParameter);
    }

}
