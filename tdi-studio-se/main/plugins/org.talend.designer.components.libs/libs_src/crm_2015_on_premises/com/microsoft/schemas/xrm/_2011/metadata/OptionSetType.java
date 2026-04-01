
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionSetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionSetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Picklist"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Boolean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionSetType")
@XmlEnum
public enum OptionSetType {

    @XmlEnumValue("Picklist")
    PICKLIST("Picklist"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean");
    private final String value;

    OptionSetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptionSetType fromValue(String v) {
        for (OptionSetType c: OptionSetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
