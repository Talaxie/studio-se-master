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
package org.talend.designer.core.ui.editor.properties.controllers.generator;

import org.talend.core.model.metadata.IDynamicBaseProperty;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.executors.IControllerExecutor;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IControllerUI;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface IControllerFactory {

    IControllerUI createUI(String name, IDynamicProperty dp);

    IControllerExecutor createExecutor(String name, IDynamicBaseProperty dynamicBaseProp, IElementParameter curParameter);

}
