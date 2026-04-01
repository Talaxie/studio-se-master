
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventReminderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventReminderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_none"/&gt;
 *     &lt;enumeration value="_eMail"/&gt;
 *     &lt;enumeration value="_popupWindow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventReminderType", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventReminderType {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_eMail")
    E_MAIL("_eMail"),
    @XmlEnumValue("_popupWindow")
    POPUP_WINDOW("_popupWindow");
    private final String value;

    CalendarEventReminderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventReminderType fromValue(String v) {
        for (CalendarEventReminderType c: CalendarEventReminderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
