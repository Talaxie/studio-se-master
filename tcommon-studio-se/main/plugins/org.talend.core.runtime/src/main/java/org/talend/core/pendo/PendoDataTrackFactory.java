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
package org.talend.core.pendo;

import org.talend.core.pendo.properties.IPendoDataProperties;
import org.talend.core.service.ICoreTisRuntimeService;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoDataTrackFactory {

    private static PendoDataTrackFactory instance;

    private static ICoreTisRuntimeService coreRuntimeService;

    static {
        instance = new PendoDataTrackFactory();
        coreRuntimeService = ICoreTisRuntimeService.get();
    }

    private PendoDataTrackFactory() {
    }

    public static PendoDataTrackFactory getInstance() {
        return instance;
    }

    public boolean isTrackSendAvailable() throws Exception {
        if (coreRuntimeService != null) {
            return coreRuntimeService.isPendoTrackAvailable();
        }
        return false;
    }

    public void sendTrackData(TrackEvent event, IPendoDataProperties properties) throws Exception {
        if (coreRuntimeService != null) {
            coreRuntimeService.sendPendoTrackData(event, properties);
        }
    }

    public void sendProjectLoginTrack() {
        if (coreRuntimeService != null) {
            AbstractPendoTrackManager pendoProjectLoginManager = coreRuntimeService.getPendoProjectLoginManager();
            pendoProjectLoginManager.sendTrackToPendo();
        }
    }

    public void sendGenericTrack(TrackEvent event, IPendoDataProperties properties) {
        if (coreRuntimeService != null) {
            AbstractPendoTrackManager genericManager = coreRuntimeService.getPendoGenericManager(event, properties);
            genericManager.sendTrackToPendo();
        }
    }

    public String getTmcUser(String url, String token) {
        if (coreRuntimeService != null) {
            return coreRuntimeService.getTmcUser(url, token);
        }
        return "";
    }

}
