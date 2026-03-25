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
package org.talend.designer.core.ui.action.business;

import org.talend.core.model.process.IProcess2;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class AbsCrossPlatformProcessEditorAction extends AbsCrossPlatformEditorAction implements ICrossPlatformProcessEditorAction {

    private IProcess2 process;

    public AbsCrossPlatformProcessEditorAction(IProcess2 process, ICrossPlatformActionHook actionHook) {
        super(actionHook);
        this.process = process;
    }

    protected IProcess2 getProcess() {
        return process;
    }

}
