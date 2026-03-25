
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivilegeDepth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivilegeDepth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Local"/>
 *     &lt;enumeration value="Deep"/>
 *     &lt;enumeration value="Global"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrivilegeDepth")
@XmlEnum
public enum PrivilegeDepth {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("Deep")
    DEEP("Deep"),
    @XmlEnumValue("Global")
    GLOBAL("Global");
    private final String value;

    PrivilegeDepth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrivilegeDepth fromValue(String v) {
        for (PrivilegeDepth c: PrivilegeDepth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
