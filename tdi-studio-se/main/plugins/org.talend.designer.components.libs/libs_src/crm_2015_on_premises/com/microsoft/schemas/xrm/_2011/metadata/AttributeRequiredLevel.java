
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeRequiredLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeRequiredLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SystemRequired"/>
 *     &lt;enumeration value="ApplicationRequired"/>
 *     &lt;enumeration value="Recommended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeRequiredLevel")
@XmlEnum
public enum AttributeRequiredLevel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SystemRequired")
    SYSTEM_REQUIRED("SystemRequired"),
    @XmlEnumValue("ApplicationRequired")
    APPLICATION_REQUIRED("ApplicationRequired"),
    @XmlEnumValue("Recommended")
    RECOMMENDED("Recommended");
    private final String value;

    AttributeRequiredLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeRequiredLevel fromValue(String v) {
        for (AttributeRequiredLevel c: AttributeRequiredLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
