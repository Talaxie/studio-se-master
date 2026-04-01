
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventAttendeeAttendance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventAttendeeAttendance"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_optional"/&gt;
 *     &lt;enumeration value="_required"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventAttendeeAttendance", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventAttendeeAttendance {

    @XmlEnumValue("_optional")
    OPTIONAL("_optional"),
    @XmlEnumValue("_required")
    REQUIRED("_required");
    private final String value;

    CalendarEventAttendeeAttendance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventAttendeeAttendance fromValue(String v) {
        for (CalendarEventAttendeeAttendance c: CalendarEventAttendeeAttendance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
