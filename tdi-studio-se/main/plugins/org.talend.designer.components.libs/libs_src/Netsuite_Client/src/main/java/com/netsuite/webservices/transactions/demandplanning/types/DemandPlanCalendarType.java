
package com.netsuite.webservices.transactions.demandplanning.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandPlanCalendarType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DemandPlanCalendarType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_daily"/&gt;
 *     &lt;enumeration value="_monthly"/&gt;
 *     &lt;enumeration value="_weekly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DemandPlanCalendarType", namespace = "urn:types.demandplanning_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum DemandPlanCalendarType {

    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly");
    private final String value;

    DemandPlanCalendarType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DemandPlanCalendarType fromValue(String v) {
        for (DemandPlanCalendarType c: DemandPlanCalendarType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
