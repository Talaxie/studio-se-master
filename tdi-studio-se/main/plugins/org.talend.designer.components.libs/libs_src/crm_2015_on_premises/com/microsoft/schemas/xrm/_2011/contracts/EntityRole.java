
package com.microsoft.schemas.xrm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Referencing"/>
 *     &lt;enumeration value="Referenced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityRole")
@XmlEnum
public enum EntityRole {

    @XmlEnumValue("Referencing")
    REFERENCING("Referencing"),
    @XmlEnumValue("Referenced")
    REFERENCED("Referenced");
    private final String value;

    EntityRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityRole fromValue(String v) {
        for (EntityRole c: EntityRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
