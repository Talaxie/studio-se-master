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
package org.talend.designer.core.ui.editor.properties.controllers.ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.executors.SchemaTypeControllerExecutor;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class SchemaTypeSWTControllerUI extends AbsSchemaSWTControllerUI implements ISchemaTypeControllerUI {

    public SchemaTypeSWTControllerUI(IDynamicProperty dp) {
        super(dp, new SchemaTypeControllerExecutor());
        getControllerExecutor().init(getControllerContext(), this);
    }

    @Override
    public Control createControl(Composite subComposite, IElementParameter param, int numInRow, int nbInRow, int top,
            Control lastControl) {
        Control lastControlUsed = lastControl;
        if (elem instanceof Node) {
            lastControlUsed = super.createControl(subComposite, param, numInRow, nbInRow, top, lastControl);
        }
        lastControlUsed = addButton(subComposite, param, lastControlUsed, numInRow, top);
        return lastControlUsed;
    }

    @Override
    public SchemaTypeControllerExecutor getControllerExecutor() {
        return (SchemaTypeControllerExecutor) super.getControllerExecutor();
    }


}
