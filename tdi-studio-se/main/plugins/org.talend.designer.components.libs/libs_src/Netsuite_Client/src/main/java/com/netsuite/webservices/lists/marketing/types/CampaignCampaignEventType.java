
package com.netsuite.webservices.lists.marketing.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignCampaignEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCampaignEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_default"/&gt;
 *     &lt;enumeration value="_directMail"/&gt;
 *     &lt;enumeration value="_email"/&gt;
 *     &lt;enumeration value="_integration"/&gt;
 *     &lt;enumeration value="_leadNurturingEmail"/&gt;
 *     &lt;enumeration value="_other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CampaignCampaignEventType", namespace = "urn:types.marketing_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignCampaignEventType {

    @XmlEnumValue("_default")
    DEFAULT("_default"),
    @XmlEnumValue("_directMail")
    DIRECT_MAIL("_directMail"),
    @XmlEnumValue("_email")
    EMAIL("_email"),
    @XmlEnumValue("_integration")
    INTEGRATION("_integration"),
    @XmlEnumValue("_leadNurturingEmail")
    LEAD_NURTURING_EMAIL("_leadNurturingEmail"),
    @XmlEnumValue("_other")
    OTHER("_other");
    private final String value;

    CampaignCampaignEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignCampaignEventType fromValue(String v) {
        for (CampaignCampaignEventType c: CampaignCampaignEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
