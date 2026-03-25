
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingScheduleFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingScheduleFrequency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_annually"/&gt;
 *     &lt;enumeration value="_custom"/&gt;
 *     &lt;enumeration value="_daily"/&gt;
 *     &lt;enumeration value="_endOfPeriod"/&gt;
 *     &lt;enumeration value="_monthly"/&gt;
 *     &lt;enumeration value="_never"/&gt;
 *     &lt;enumeration value="_oneTime"/&gt;
 *     &lt;enumeration value="_startOfPeriod"/&gt;
 *     &lt;enumeration value="_weekly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingScheduleFrequency", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingScheduleFrequency {

    @XmlEnumValue("_annually")
    ANNUALLY("_annually"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_endOfPeriod")
    END_OF_PERIOD("_endOfPeriod"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly"),
    @XmlEnumValue("_never")
    NEVER("_never"),
    @XmlEnumValue("_oneTime")
    ONE_TIME("_oneTime"),
    @XmlEnumValue("_startOfPeriod")
    START_OF_PERIOD("_startOfPeriod"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly");
    private final String value;

    BillingScheduleFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingScheduleFrequency fromValue(String v) {
        for (BillingScheduleFrequency c: BillingScheduleFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
