
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobBillingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobBillingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_none"/&gt;
 *     &lt;enumeration value="_chargeBased"/&gt;
 *     &lt;enumeration value="_fixedBidInterval"/&gt;
 *     &lt;enumeration value="_fixedBidMilestone"/&gt;
 *     &lt;enumeration value="_timeAndMaterials"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JobBillingType", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum JobBillingType {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_chargeBased")
    CHARGE_BASED("_chargeBased"),
    @XmlEnumValue("_fixedBidInterval")
    FIXED_BID_INTERVAL("_fixedBidInterval"),
    @XmlEnumValue("_fixedBidMilestone")
    FIXED_BID_MILESTONE("_fixedBidMilestone"),
    @XmlEnumValue("_timeAndMaterials")
    TIME_AND_MATERIALS("_timeAndMaterials");
    private final String value;

    JobBillingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobBillingType fromValue(String v) {
        for (JobBillingType c: JobBillingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
