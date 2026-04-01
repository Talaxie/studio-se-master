
package com.microsoft.schemas.xrm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unchanged"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Changed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityState")
@XmlEnum
public enum EntityState {

    @XmlEnumValue("Unchanged")
    UNCHANGED("Unchanged"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Changed")
    CHANGED("Changed");
    private final String value;

    EntityState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityState fromValue(String v) {
        for (EntityState c: EntityState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
