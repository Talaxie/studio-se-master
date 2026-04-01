
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImeMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImeMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImeMode")
@XmlEnum
public enum ImeMode {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    ImeMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImeMode fromValue(String v) {
        for (ImeMode c: ImeMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
