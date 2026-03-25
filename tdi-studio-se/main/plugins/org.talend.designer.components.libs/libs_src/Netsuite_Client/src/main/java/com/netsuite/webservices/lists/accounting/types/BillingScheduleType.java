
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingScheduleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingScheduleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_chargeBased"/&gt;
 *     &lt;enumeration value="_fixedBidInterval"/&gt;
 *     &lt;enumeration value="_fixedBidMilestone"/&gt;
 *     &lt;enumeration value="_standard"/&gt;
 *     &lt;enumeration value="_timeAndMaterials"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingScheduleType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingScheduleType {

    @XmlEnumValue("_chargeBased")
    CHARGE_BASED("_chargeBased"),
    @XmlEnumValue("_fixedBidInterval")
    FIXED_BID_INTERVAL("_fixedBidInterval"),
    @XmlEnumValue("_fixedBidMilestone")
    FIXED_BID_MILESTONE("_fixedBidMilestone"),
    @XmlEnumValue("_standard")
    STANDARD("_standard"),
    @XmlEnumValue("_timeAndMaterials")
    TIME_AND_MATERIALS("_timeAndMaterials");
    private final String value;

    BillingScheduleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingScheduleType fromValue(String v) {
        for (BillingScheduleType c: BillingScheduleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
