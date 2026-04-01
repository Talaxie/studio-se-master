// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime.custom;

import org.eclipse.jface.dialogs.Dialog;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class AbsBusinessHandler implements IBusinessHandler {

    private Object openResult = Dialog.CANCEL;

    public AbsBusinessHandler() {
    }

    @Override
    public boolean isModalDialog() {
        return true;
    }

    @Override
    public Object getOpenResult() {
        return openResult;
    }

    public void setOpenResult(Object openResult) {
        this.openResult = openResult;
    }

}
