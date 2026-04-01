
package com.netsuite.webservices.lists.marketing.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_closed"/&gt;
 *     &lt;enumeration value="_completed"/&gt;
 *     &lt;enumeration value="_execute"/&gt;
 *     &lt;enumeration value="_inProgress"/&gt;
 *     &lt;enumeration value="_scheduled"/&gt;
 *     &lt;enumeration value="_sent"/&gt;
 *     &lt;enumeration value="_toPrint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CampaignStatus", namespace = "urn:types.marketing_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignStatus {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_execute")
    EXECUTE("_execute"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_scheduled")
    SCHEDULED("_scheduled"),
    @XmlEnumValue("_sent")
    SENT("_sent"),
    @XmlEnumValue("_toPrint")
    TO_PRINT("_toPrint");
    private final String value;

    CampaignStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignStatus fromValue(String v) {
        for (CampaignStatus c: CampaignStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
