
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_canceled"/&gt;
 *     &lt;enumeration value="_completed"/&gt;
 *     &lt;enumeration value="_confirmed"/&gt;
 *     &lt;enumeration value="_tentative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventStatus", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventStatus {

    @XmlEnumValue("_canceled")
    CANCELED("_canceled"),
    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_confirmed")
    CONFIRMED("_confirmed"),
    @XmlEnumValue("_tentative")
    TENTATIVE("_tentative");
    private final String value;

    CalendarEventStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventStatus fromValue(String v) {
        for (CalendarEventStatus c: CalendarEventStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
