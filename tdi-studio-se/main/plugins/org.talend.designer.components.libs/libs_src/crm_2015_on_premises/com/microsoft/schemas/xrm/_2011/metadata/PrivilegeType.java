
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivilegeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivilegeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Write"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Assign"/>
 *     &lt;enumeration value="Share"/>
 *     &lt;enumeration value="Append"/>
 *     &lt;enumeration value="AppendTo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrivilegeType")
@XmlEnum
public enum PrivilegeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Write")
    WRITE("Write"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Assign")
    ASSIGN("Assign"),
    @XmlEnumValue("Share")
    SHARE("Share"),
    @XmlEnumValue("Append")
    APPEND("Append"),
    @XmlEnumValue("AppendTo")
    APPEND_TO("AppendTo");
    private final String value;

    PrivilegeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrivilegeType fromValue(String v) {
        for (PrivilegeType c: PrivilegeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
