
package com.netsuite.webservices.setup.customization.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationAccessLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_none"/&gt;
 *     &lt;enumeration value="_edit"/&gt;
 *     &lt;enumeration value="_view"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomizationAccessLevel", namespace = "urn:types.customization_2014_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationAccessLevel {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_edit")
    EDIT("_edit"),
    @XmlEnumValue("_view")
    VIEW("_view");
    private final String value;

    CustomizationAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationAccessLevel fromValue(String v) {
        for (CustomizationAccessLevel c: CustomizationAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
