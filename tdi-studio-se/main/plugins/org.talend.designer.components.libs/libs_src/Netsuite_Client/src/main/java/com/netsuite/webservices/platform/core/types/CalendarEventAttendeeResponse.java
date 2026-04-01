
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventAttendeeResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventAttendeeResponse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_accepted"/&gt;
 *     &lt;enumeration value="_declined"/&gt;
 *     &lt;enumeration value="_noResponse"/&gt;
 *     &lt;enumeration value="_tentative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventAttendeeResponse", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventAttendeeResponse {

    @XmlEnumValue("_accepted")
    ACCEPTED("_accepted"),
    @XmlEnumValue("_declined")
    DECLINED("_declined"),
    @XmlEnumValue("_noResponse")
    NO_RESPONSE("_noResponse"),
    @XmlEnumValue("_tentative")
    TENTATIVE("_tentative");
    private final String value;

    CalendarEventAttendeeResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventAttendeeResponse fromValue(String v) {
        for (CalendarEventAttendeeResponse c: CalendarEventAttendeeResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
