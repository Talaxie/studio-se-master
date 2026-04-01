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
package org.talend.core.ui.token;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.utils.time.PropertiesCollectorUtil;
import org.talend.core.service.IStudioLiteP2Service;

import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;

public class AdditionalPackagesTokenCollector extends AbstractTokenCollector {

    @Override
    public JSONObject collect() throws Exception {
        // String records = PropertiesCollectorUtil.getAdditionalPackageRecording();
        //
        // JSONObject allRecords;
        // try {
        // allRecords = new JSONObject(records);
        // } catch (Exception e) {
        // // the value is not set, or is empty
        // allRecords = new JSONObject();
        // allRecords.put(PropertiesCollectorUtil.getAdditionalPackagePreferenceNode(), new JSONObject());
        // }
        //
        // return allRecords;
        JSONObject allRecords = new JSONObject();
        if (IStudioLiteP2Service.get() != null) {
            JSONArray jsonArray = new JSONArray();
            IStudioLiteP2Service.get().getStudioInstalledFeatures(null, false).stream()
                    .map(id -> StringUtils.substringBeforeLast(id, ".feature.group"))
                    .sorted().forEach(id -> jsonArray.put(id));
            allRecords.put(PropertiesCollectorUtil.getAdditionalPackagePreferenceNode(), jsonArray);
        }
        return allRecords;
    }

}
