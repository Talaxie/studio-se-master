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
package org.talend.designer.maven.repo.tck;

import org.talend.core.model.utils.BaseComponentInstallerTask;
import org.talend.updates.runtime.maven.M2repoBaseInstaller;

/**
 * @author bhe created on Jul 29, 2021
 *
 */
public class TckInstaller extends M2repoBaseInstaller {

    @Override
    protected Class<? extends BaseComponentInstallerTask> getInstallerClass() {
        return TckInstaller.class;
    }

}
