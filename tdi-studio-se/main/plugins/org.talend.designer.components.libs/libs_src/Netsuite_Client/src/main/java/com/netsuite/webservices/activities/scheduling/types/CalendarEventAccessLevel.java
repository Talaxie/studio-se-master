
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventAccessLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_private"/&gt;
 *     &lt;enumeration value="_public"/&gt;
 *     &lt;enumeration value="_showAsBusy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventAccessLevel", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventAccessLevel {

    @XmlEnumValue("_private")
    PRIVATE("_private"),
    @XmlEnumValue("_public")
    PUBLIC("_public"),
    @XmlEnumValue("_showAsBusy")
    SHOW_AS_BUSY("_showAsBusy");
    private final String value;

    CalendarEventAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventAccessLevel fromValue(String v) {
        for (CalendarEventAccessLevel c: CalendarEventAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
