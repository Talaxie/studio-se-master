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
package org.talend.core;

import org.eclipse.swt.widgets.Shell;
import org.talend.commons.ui.swt.dialogs.IConfigModuleDialog;

/**
 * Manages user-driven choices for library installation, with graphical UI.
 */
public interface ILibraryManagerUIService extends ILibraryManagerUserService {

    public IConfigModuleDialog getConfigModuleDialog(Shell parentShell, String initValue, boolean allowDetectDependencies);
}
