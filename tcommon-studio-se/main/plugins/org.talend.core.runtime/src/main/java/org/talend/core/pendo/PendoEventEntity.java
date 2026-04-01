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
package org.talend.core.pendo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoEventEntity {

    @JsonProperty("type")
    private String type;

    @JsonProperty("event")
    private String event;

    @JsonProperty("visitorId")
    private String visitorId;

    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("timestamp")
    private long timestamp;

    @JsonProperty("properties")
    private Object properties;

    /**
     * Getter for type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for event.
     * 
     * @return the event
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the event.
     * 
     * @param event the event to set
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Getter for visitorId.
     * 
     * @return the visitorId
     */
    public String getVisitorId() {
        return visitorId;
    }

    /**
     * Sets the visitorId.
     * 
     * @param visitorId the visitorId to set
     */
    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    /**
     * Getter for accountId.
     * 
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the accountId.
     * 
     * @param accountId the accountId to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for timestamp.
     * 
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp.
     * 
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Getter for properties.
     * @return the properties
     */
    public Object getProperties() {
        return properties;
    }


    /**
     * Sets the properties.
     * @param properties the properties to set
     */
    public void setProperties(Object properties) {
        this.properties = properties;
    }
}
