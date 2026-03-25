
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RollupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RollupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Related"/>
 *     &lt;enumeration value="Extended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RollupType")
@XmlEnum
public enum RollupType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Related")
    RELATED("Related"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    RollupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RollupType fromValue(String v) {
        for (RollupType c: RollupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
