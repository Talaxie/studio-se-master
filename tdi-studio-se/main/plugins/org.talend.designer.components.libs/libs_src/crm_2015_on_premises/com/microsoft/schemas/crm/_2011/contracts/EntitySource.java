
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntitySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="Lead"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntitySource")
@XmlEnum
public enum EntitySource {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("Lead")
    LEAD("Lead"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    EntitySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntitySource fromValue(String v) {
        for (EntitySource c: EntitySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
