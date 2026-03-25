
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DurationUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="hour"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DurationUnit", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum DurationUnit {

    @XmlEnumValue("hour")
    HOUR("hour");
    private final String value;

    DurationUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DurationUnit fromValue(String v) {
        for (DurationUnit c: DurationUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
