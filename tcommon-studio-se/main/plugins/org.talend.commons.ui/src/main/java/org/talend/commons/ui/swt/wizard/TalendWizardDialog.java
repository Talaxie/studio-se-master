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
package org.talend.commons.ui.swt.wizard;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class TalendWizardDialog extends Dialog {

    public TalendWizardDialog(Shell parentShell) {
        super(parentShell);
    }

    @Override
    protected Control createContents(Composite parent) {
        return super.createContents(parent);
    }

    public static void main(String[] args) throws Exception {
        int sleep = 1000 / 60;
        double time = 1.0 / 50;
        int total = 0;
        for (int i = 1; i <= 25; i++) {
            double curTime = time * i;
            double value = 1.0 - Math.sqrt(1 - curTime * curTime);
            int lengh = (int) (250 * value);
            total += lengh;
            System.out.println(i + "\t:" + lengh + ", total: " + total);
        }
        for (int i = 25; i <= 50; i++) {
            double curTime = 1 - time * i;
            double value = 1.0 - Math.sqrt(1 - curTime * curTime);
            int lengh = (int) (250 * value);
            total += lengh;
            System.out.println(i + "\t:" + lengh + ", total: " + total);
        }
    }

}
