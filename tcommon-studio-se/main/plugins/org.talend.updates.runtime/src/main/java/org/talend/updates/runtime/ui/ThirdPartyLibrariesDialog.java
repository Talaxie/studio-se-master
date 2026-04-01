// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.updates.runtime.ui;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * DOC wchen class global comment. Detailled comment
 */
public class ThirdPartyLibrariesDialog extends WizardDialog {


    /**
     * DOC sgandon WizardDialogExtension constructor comment.
     *
     * @param parentShell
     * @param newWizard
     * @param updateStudioWizard TODO
     * @param shell
     */
    ThirdPartyLibrariesDialog(ThirdPartyLibrariesWizard updateStudioWizard, Shell parentShell) {
        super(parentShell, updateStudioWizard);
    }

    @Override
    protected org.eclipse.jface.wizard.ProgressMonitorPart createProgressMonitorPart(Composite parent,
            org.eclipse.swt.layout.GridLayout pmlayout) {
        final ThirdPartyLibrariesWizard thirdPartyLibrariesWizard = (ThirdPartyLibrariesWizard) getWizard();
        Composite checkAndProgressComposite = new Composite(parent, SWT.NONE);
        checkAndProgressComposite.setLayout(new GridLayout(3, false));
        GridDataFactory.fillDefaults().grab(true, false).applyTo(checkAndProgressComposite);
        // progress bar
        ProgressMonitorPart createProgressMonitorPart = super.createProgressMonitorPart(checkAndProgressComposite, pmlayout);
        return createProgressMonitorPart;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.dialogs.Dialog#create()
     */
    @Override
    public void create() {
        super.create();
        ((ThirdPartyLibrariesWizard) getWizard()).launchInitialRunnable(this);
    }
}
