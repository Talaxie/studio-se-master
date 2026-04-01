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
package org.talend.core.pendo.mapper;

import org.talend.core.pendo.AbstractPendoTrackManager;
import org.talend.core.pendo.TrackEvent;
import org.talend.core.pendo.properties.IPendoDataProperties;
import org.talend.core.pendo.properties.PendoAutoMapProperties;

/**
 * Assume no multiple thread, one AutoMapper one PendoAutoMapManager
 * 
 * DOC jding class global comment. Detailled comment
 */
public class PendoAutoMapManager extends AbstractPendoTrackManager {
    
    private int mappingChangeCount = 0;

    public void setMappingChangeCount(int mappingChangeCount) {
        this.mappingChangeCount = mappingChangeCount;
    }

    public void incrementMappingChangeCount() {
        this.mappingChangeCount++;
    }

    public void resetMappingChangeCount() {
        this.mappingChangeCount = 0;
    }

    public int getMappingChangeCount() {
        return mappingChangeCount;
    }

    public void sendTrackToPendo() {
        if (mappingChangeCount < 1) {
            return;
        }
        super.sendTrackToPendo();
    }

    @Override
    public TrackEvent getTrackEvent() {
        return TrackEvent.AUTOMAP;
    }

    @Override
    public IPendoDataProperties collectProperties() {
        PendoAutoMapProperties properties = new PendoAutoMapProperties();
        properties.setAutoMappings(mappingChangeCount);
        return properties;
    }
}
