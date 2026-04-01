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
package org.talend.repository.ui.login;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.talend.commons.exception.ExceptionHandler;

public class LoginWithSSODialog extends LoginDialogV2 {

    public LoginWithSSODialog(Shell parentShell) {
        super(parentShell);
    }
    
    protected void showFirstPage() {
        AbstractLoginActionPage loginPage  = new LoginWithCloudPage(base, this, SWT.NONE, true);
        try {
            loginPage.preShowPage();
            loginPage.showPage();
        } catch (Throwable e) {
            ExceptionHandler.process(e);
        }

    }

    @Override
    protected void okPressed() {
        super.okPressed();
    }

    @Override
    protected int getShellStyle() {
        return SWT.TITLE | SWT.APPLICATION_MODAL;
    }

}
