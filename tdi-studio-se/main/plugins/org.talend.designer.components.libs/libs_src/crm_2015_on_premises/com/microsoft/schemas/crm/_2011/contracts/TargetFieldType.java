
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="ValidForCreate"/>
 *     &lt;enumeration value="ValidForUpdate"/>
 *     &lt;enumeration value="ValidForRead"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetFieldType")
@XmlEnum
public enum TargetFieldType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("ValidForCreate")
    VALID_FOR_CREATE("ValidForCreate"),
    @XmlEnumValue("ValidForUpdate")
    VALID_FOR_UPDATE("ValidForUpdate"),
    @XmlEnumValue("ValidForRead")
    VALID_FOR_READ("ValidForRead");
    private final String value;

    TargetFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetFieldType fromValue(String v) {
        for (TargetFieldType c: TargetFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
