
package com.netsuite.webservices.lists.marketing.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignCampaignEventStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCampaignEventStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_completed"/&gt;
 *     &lt;enumeration value="_execute"/&gt;
 *     &lt;enumeration value="_inProgress"/&gt;
 *     &lt;enumeration value="_notStarted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CampaignCampaignEventStatus", namespace = "urn:types.marketing_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignCampaignEventStatus {

    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_execute")
    EXECUTE("_execute"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_notStarted")
    NOT_STARTED("_notStarted");
    private final String value;

    CampaignCampaignEventStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignCampaignEventStatus fromValue(String v) {
        for (CampaignCampaignEventStatus c: CampaignCampaignEventStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
