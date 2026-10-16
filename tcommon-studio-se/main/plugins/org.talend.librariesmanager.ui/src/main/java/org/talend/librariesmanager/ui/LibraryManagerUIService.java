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
package org.talend.librariesmanager.ui;

import java.util.Collection;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.commons.ui.swt.dialogs.IConfigModuleDialog;
import org.talend.core.ILibraryManagerUIService;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.librariesmanager.model.service.AbstractLibraryManagerUserService;
import org.talend.librariesmanager.ui.dialogs.ConfigModuleDialog;
import org.talend.librariesmanager.utils.ModulesInstaller;

/**
 * created by wchen on 2013-1-24 Detailled comment
 *
 */
public class LibraryManagerUIService extends AbstractLibraryManagerUserService implements ILibraryManagerUIService {

    @Override
    public void installModules(final String[] jarNames) {
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            @Override
            public void run() {
                ModulesInstaller.installModules(DisplayUtils.getDefaultShell(false), jarNames);
            }
        });

    }

    @Override
    public void installModules(final Collection<ModuleNeeded> requiredModules) {
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            @Override
            public void run() {
                ModulesInstaller.installModules(DisplayUtils.getDefaultShell(false), requiredModules);
            }
        });

    }

    public IConfigModuleDialog getConfigModuleDialog(Shell parentShell, String initValue, boolean allowDetectDependencies) {
        return new ConfigModuleDialog(parentShell, initValue, allowDetectDependencies);
    }
}
