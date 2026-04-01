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

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.pendo.properties.IPendoDataProperties;
import org.talend.core.ui.IInstalledPatchService;
import org.talend.utils.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoTrackDataUtil {

    private static final String FEATURE_PREFIX = "org.talend.lite.";

    private static final String FEATURE_TAIL = ".feature.feature.group";

    public static String generateTrackData(String pendoInfo, TrackEvent event, IPendoDataProperties properties) throws Exception {
        JSONObject infoJson = new JSONObject(pendoInfo);
        String visitorId = ((JSONObject) infoJson.get("visitor")).getString("id");
        String accountId = ((JSONObject) infoJson.get("account")).getString("id");

        PendoEventEntity entity = new PendoEventEntity();
        entity.setType("track");
        entity.setEvent(event.getEvent());
        entity.setVisitorId(visitorId);
        entity.setAccountId(accountId);
        entity.setTimestamp(new Date().getTime());
        entity.setProperties(properties);

        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(entity);
        return content;
    }

    public static String getLatestPatchInstalledVersion() {
        String studioPatch = "";
        IInstalledPatchService installedPatchService = IInstalledPatchService.get();
        if (installedPatchService != null) {
            studioPatch = installedPatchService.getLatestInstalledVersion(true);
        }
        return studioPatch;
    }

    public static String convertEntityJsonString(Object entity) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String content = mapper.writeValueAsString(entity);
            if (StringUtils.isNotBlank(content)) {
                return content;
            }
        } catch (JsonProcessingException e) {
            ExceptionHandler.process(e);
        }
        return "";
    }

}
