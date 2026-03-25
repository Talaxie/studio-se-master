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
import org.talend.designer.core.ui.editor.properties.controllers.executors.ISchemaControllerExecutor;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 *
 * $Id: talend-code-templates.xml 1 2006-09-29 17:06:40 +0000 (ven., 29 sept. 2006) nrousseau $
 *
 */
public class SchemaTypeGenerator implements IControllerGenerator {

    private IDynamicProperty dp;

    @Override
    public ISWTBusinessControllerUI generate() {
        return (ISWTBusinessControllerUI) ControllerFactories.inst().createUI(SchemaTypeGenerator.class.getCanonicalName(), dp);
    }

    @Override
    public void setDynamicProperty(IDynamicProperty dp) {
        this.dp = dp;
    }

    @Override
    public ISchemaControllerExecutor createExecutor(IDynamicBaseProperty dynamicBaseProp, IElementParameter curParameter) {
        return (ISchemaControllerExecutor) ControllerFactories.inst().createExecutor(SchemaTypeGenerator.class.getCanonicalName(),
                dynamicBaseProp, curParameter);
    }

}
