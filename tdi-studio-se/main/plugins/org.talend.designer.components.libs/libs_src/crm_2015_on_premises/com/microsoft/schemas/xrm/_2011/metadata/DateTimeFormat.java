
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTimeFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DateOnly"/>
 *     &lt;enumeration value="DateAndTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateTimeFormat")
@XmlEnum
public enum DateTimeFormat {

    @XmlEnumValue("DateOnly")
    DATE_ONLY("DateOnly"),
    @XmlEnumValue("DateAndTime")
    DATE_AND_TIME("DateAndTime");
    private final String value;

    DateTimeFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTimeFormat fromValue(String v) {
        for (DateTimeFormat c: DateTimeFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
