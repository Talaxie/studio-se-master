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

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.talend.core.pendo.properties.PendoImportAPIproperties;
import org.talend.core.pendo.properties.PendoUseAPIProperties;
import org.talend.utils.json.JSONObject;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoTrackDataUtilTest {

    @Test
    public void testGenerateTrackData() throws Exception {
        String pendoInfo = "{\"visitor\":{\"id\":\"test.talend.com@rd.aws.ap.talend.com\"},\"account\":{\"id\":\"rd.aws.ap.talend.com\"}}";
        // open in API Designer event
        String trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.OPEN_IN_APIDesigner, null);
        String timeString = getTimestampStringFromJson(trackData);
        String expect = "{\"type\":\"track\",\"event\":\"Open in API Designer\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":null}";
        assertEquals(expect, trackData);

        // Open in API Tester
        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.OPEN_IN_APITester, null);
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Open in API Tester\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":null}";
        assertEquals(expect, trackData);

        // Open API Documentation
        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.OPEN_API_DOCUMENTATION, null);
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Open API Documentation\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":null}";
        assertEquals(expect, trackData);

        // Use API Definition event
        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.USE_API_DEF,
                new PendoUseAPIProperties("tRESTRequest"));
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Use API Definition\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":{\"component\":\"tRESTRequest\"}}";
        assertEquals(expect, trackData);

        // Import API Definition
        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.IMPORT_API_DEF,
                new PendoImportAPIproperties(ESourceType.LOCAL_FILE.getSourceType()));
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Import API Definition\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":{\"source\":\"file\"}}";
        assertEquals(expect, trackData);

        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.IMPORT_API_DEF,
                new PendoImportAPIproperties(ESourceType.API_DESIGNER.getSourceType()));
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Import API Definition\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":{\"source\":\"API Designer\"}}";
        assertEquals(expect, trackData);

        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.IMPORT_API_DEF,
                new PendoImportAPIproperties(ESourceType.REMOTE_URL.getSourceType()));
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Import API Definition\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":{\"source\":\"Remote URL\"}}";
        assertEquals(expect, trackData);

        // Update API Definition
        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.UPDATE_API_DEF,
                new PendoImportAPIproperties(ESourceType.LOCAL_FILE.getSourceType()));
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Update API Definition\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":{\"source\":\"file\"}}";
        assertEquals(expect, trackData);

        trackData = PendoTrackDataUtil.generateTrackData(pendoInfo, TrackEvent.UPDATE_API_DEF,
                new PendoImportAPIproperties(ESourceType.API_DESIGNER.getSourceType()));
        timeString = getTimestampStringFromJson(trackData);
        expect = "{\"type\":\"track\",\"event\":\"Update API Definition\",\"visitorId\":\"test.talend.com@rd.aws.ap.talend.com\",\"accountId\":\"rd.aws.ap.talend.com\",\"timestamp\":"
                + timeString + ",\"properties\":{\"source\":\"API Designer\"}}";
        assertEquals(expect, trackData);
    }

    private String getTimestampStringFromJson(String trackData) throws Exception {
        JSONObject trackDataJson = new JSONObject(trackData);
        long time = trackDataJson.getLong("timestamp");
        return String.valueOf(time);
    }

    // org.talend.repository.model.ESourceType
    enum ESourceType {

        LOCAL_FILE("LOCAL_FILE"), //$NON-NLS-1$
        API_DESIGNER("API_DESIGNER"), //$NON-NLS-1$
        REMOTE_URL("REMOTE_URL"); //$NON-NLS-1$

        private String sourceType;

        private ESourceType(String sourceType) {
            this.sourceType = sourceType;
        }

        public String getSourceType() {
            return this.sourceType;
        }

    }

}
