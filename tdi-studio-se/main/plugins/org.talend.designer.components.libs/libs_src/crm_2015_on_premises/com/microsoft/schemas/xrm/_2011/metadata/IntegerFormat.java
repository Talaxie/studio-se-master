
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegerFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegerFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="TimeZone"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="Locale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntegerFormat")
@XmlEnum
public enum IntegerFormat {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("TimeZone")
    TIME_ZONE("TimeZone"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("Locale")
    LOCALE("Locale");
    private final String value;

    IntegerFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegerFormat fromValue(String v) {
        for (IntegerFormat c: IntegerFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
