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
package org.talend.studio.components.tck.jdbc;

import org.talend.sdk.component.studio.util.TCKComponentInstallerTask;

/**
 * @author bhe created on Jul 1, 2021
 *
 */
public class JDBCInstaller extends TCKComponentInstallerTask {

    @Override
    protected Class<? extends TCKComponentInstallerTask> getInstallerClass() {
        return JDBCInstaller.class;
    }

}
