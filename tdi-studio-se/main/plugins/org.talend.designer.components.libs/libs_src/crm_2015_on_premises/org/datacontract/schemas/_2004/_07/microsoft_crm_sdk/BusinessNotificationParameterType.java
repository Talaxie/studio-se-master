
package org.datacontract.schemas._2004._07.microsoft_crm_sdk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessNotificationParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessNotificationParameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Attribute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessNotificationParameterType")
@XmlEnum
public enum BusinessNotificationParameterType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute");
    private final String value;

    BusinessNotificationParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessNotificationParameterType fromValue(String v) {
        for (BusinessNotificationParameterType c: BusinessNotificationParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
