// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.service;

import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.pendo.AbstractPendoTrackManager;
import org.talend.core.pendo.TrackEvent;
import org.talend.core.pendo.properties.IPendoDataProperties;

/**
 * DOC jding  class global comment. Detailled comment
 */
public interface ICoreTisRuntimeService extends IService {

    String getTmcUser(String url, String token);

    AbstractPendoTrackManager getPendoProjectLoginManager();

    AbstractPendoTrackManager getPendoGenericManager(TrackEvent event, IPendoDataProperties peoperties);

    boolean isPendoTrackAvailable() throws Exception;

    void sendPendoTrackData(TrackEvent event, IPendoDataProperties properties) throws Exception;

    void sendPTPTrackData(String componentName, String componentUniqName, String jobId, String data);

    static ICoreTisRuntimeService get() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ICoreTisRuntimeService.class)) {
            return GlobalServiceRegister.getDefault().getService(ICoreTisRuntimeService.class);
        }
        return null;
    }

}
