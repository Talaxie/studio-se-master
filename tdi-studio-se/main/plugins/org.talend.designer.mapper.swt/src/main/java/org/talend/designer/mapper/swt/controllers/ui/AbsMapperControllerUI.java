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
package org.talend.designer.mapper.swt.controllers.ui;

import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.ISWTBusinessControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.executors.BusinessControllerExecutor;
import org.talend.designer.core.ui.editor.properties.controllers.ui.ControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IBusinessControllerUI;

public abstract class AbsMapperControllerUI extends ControllerUI implements IBusinessControllerUI, ISWTBusinessControllerUI  {


    public AbsMapperControllerUI(IDynamicProperty dp, BusinessControllerExecutor controllerExecutor) {
        super(dp, controllerExecutor);
    }


}
