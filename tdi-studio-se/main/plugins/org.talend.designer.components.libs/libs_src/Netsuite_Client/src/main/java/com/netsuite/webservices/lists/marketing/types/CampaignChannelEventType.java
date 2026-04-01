
package com.netsuite.webservices.lists.marketing.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignChannelEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignChannelEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_directMail"/&gt;
 *     &lt;enumeration value="_email"/&gt;
 *     &lt;enumeration value="_integration"/&gt;
 *     &lt;enumeration value="_other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CampaignChannelEventType", namespace = "urn:types.marketing_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignChannelEventType {

    @XmlEnumValue("_directMail")
    DIRECT_MAIL("_directMail"),
    @XmlEnumValue("_email")
    EMAIL("_email"),
    @XmlEnumValue("_integration")
    INTEGRATION("_integration"),
    @XmlEnumValue("_other")
    OTHER("_other");
    private final String value;

    CampaignChannelEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignChannelEventType fromValue(String v) {
        for (CampaignChannelEventType c: CampaignChannelEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
