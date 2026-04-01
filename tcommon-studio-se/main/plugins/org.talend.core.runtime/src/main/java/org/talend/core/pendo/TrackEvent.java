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


/**
 * DOC jding  class global comment. Detailled comment
 */
public enum TrackEvent {

    /**
     * create by TUP-33421 update by TUP-34791, TUP-35523, TUP-36780
     */
    PROJECT_LOGIN("Project Login"),

    /**
     * create by TUP-33990
     */
    IMPORT_API_DEF("Import API Definition"),
    /**
     * create by TUP-33990
     */
    UPDATE_API_DEF("Update API Definition"),
    /**
     * create by TUP-33990
     */
    USE_API_DEF("Use API Definition"),
    /**
     * create by TUP-33990
     */
    OPEN_IN_APIDesigner("Open in API Designer"),
    /**
     * create by TUP-33990
     */
    OPEN_IN_APITester("Open in API Tester"),
    /**
     * create by TUP-33990
     */
    OPEN_API_DOCUMENTATION("Open API Documentation"),

    /**
     * create by TUP-35644
     */
    AUTOMAP("tMap Automap"),
    /**
     * create by TUP-35644 update by TUP-36710
     */
    TMAP("tMap"),

    /**
     * create by TUP-35712 update by TUP-36893
     */
    ITEM_IMPORT("Import items"),
    /**
     * create by TUP-35712
     */
    ITEM_SIGNATURE("Item Signature");

    private String event;

    TrackEvent(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

}
