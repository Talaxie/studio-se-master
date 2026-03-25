
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Busy"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Filter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeCode")
@XmlEnum
public enum TimeCode {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Busy")
    BUSY("Busy"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Filter")
    FILTER("Filter");
    private final String value;

    TimeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeCode fromValue(String v) {
        for (TimeCode c: TimeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
