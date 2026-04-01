
package com.netsuite.webservices.lists.marketing.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignResponseCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignResponseCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_bounced"/&gt;
 *     &lt;enumeration value="_clickedThrough"/&gt;
 *     &lt;enumeration value="_failed"/&gt;
 *     &lt;enumeration value="_purchased"/&gt;
 *     &lt;enumeration value="_queued"/&gt;
 *     &lt;enumeration value="_received"/&gt;
 *     &lt;enumeration value="_responded"/&gt;
 *     &lt;enumeration value="_sent"/&gt;
 *     &lt;enumeration value="_subscribed"/&gt;
 *     &lt;enumeration value="_unsubscribed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CampaignResponseCategory", namespace = "urn:types.marketing_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignResponseCategory {

    @XmlEnumValue("_bounced")
    BOUNCED("_bounced"),
    @XmlEnumValue("_clickedThrough")
    CLICKED_THROUGH("_clickedThrough"),
    @XmlEnumValue("_failed")
    FAILED("_failed"),
    @XmlEnumValue("_purchased")
    PURCHASED("_purchased"),
    @XmlEnumValue("_queued")
    QUEUED("_queued"),
    @XmlEnumValue("_received")
    RECEIVED("_received"),
    @XmlEnumValue("_responded")
    RESPONDED("_responded"),
    @XmlEnumValue("_sent")
    SENT("_sent"),
    @XmlEnumValue("_subscribed")
    SUBSCRIBED("_subscribed"),
    @XmlEnumValue("_unsubscribed")
    UNSUBSCRIBED("_unsubscribed");
    private final String value;

    CampaignResponseCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignResponseCategory fromValue(String v) {
        for (CampaignResponseCategory c: CampaignResponseCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
