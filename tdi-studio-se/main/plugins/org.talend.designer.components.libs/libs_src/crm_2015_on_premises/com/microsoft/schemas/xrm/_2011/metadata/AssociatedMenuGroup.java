
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedMenuGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssociatedMenuGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Details"/>
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Marketing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssociatedMenuGroup")
@XmlEnum
public enum AssociatedMenuGroup {

    @XmlEnumValue("Details")
    DETAILS("Details"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Marketing")
    MARKETING("Marketing");
    private final String value;

    AssociatedMenuGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssociatedMenuGroup fromValue(String v) {
        for (AssociatedMenuGroup c: AssociatedMenuGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
