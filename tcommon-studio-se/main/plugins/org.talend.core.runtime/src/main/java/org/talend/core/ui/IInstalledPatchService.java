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
package org.talend.core.ui;

import java.io.IOException;

import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.runtime.maven.MavenArtifact;

/**
 * @author hwang
 *
 */
public interface IInstalledPatchService extends IService {

	public String getLatestInstalledVersion(boolean isBar);
	
    public MavenArtifact getLastIntalledP2Patch();

    void updatePatchInstalled(String installedName, String installedVersion, String comment) throws IOException;

    String getLatestInstalledPatchVersion();

    public static IInstalledPatchService get() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IInstalledPatchService.class)) {
            return GlobalServiceRegister.getDefault().getService(IInstalledPatchService.class);
        }
        return null;
    }

}
