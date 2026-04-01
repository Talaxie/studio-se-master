
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingScheduleYearDow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingScheduleYearDow"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_sunday"/&gt;
 *     &lt;enumeration value="_monday"/&gt;
 *     &lt;enumeration value="_tuesday"/&gt;
 *     &lt;enumeration value="_wednesday"/&gt;
 *     &lt;enumeration value="_thursday"/&gt;
 *     &lt;enumeration value="_friday"/&gt;
 *     &lt;enumeration value="_saturday"/&gt;
 *     &lt;enumeration value="_day"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingScheduleYearDow", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingScheduleYearDow {

    @XmlEnumValue("_sunday")
    SUNDAY("_sunday"),
    @XmlEnumValue("_monday")
    MONDAY("_monday"),
    @XmlEnumValue("_tuesday")
    TUESDAY("_tuesday"),
    @XmlEnumValue("_wednesday")
    WEDNESDAY("_wednesday"),
    @XmlEnumValue("_thursday")
    THURSDAY("_thursday"),
    @XmlEnumValue("_friday")
    FRIDAY("_friday"),
    @XmlEnumValue("_saturday")
    SATURDAY("_saturday"),
    @XmlEnumValue("_day")
    DAY("_day");
    private final String value;

    BillingScheduleYearDow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingScheduleYearDow fromValue(String v) {
        for (BillingScheduleYearDow c: BillingScheduleYearDow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
