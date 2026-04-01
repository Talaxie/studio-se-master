
package org.datacontract.schemas._2004._07.microsoft_crm_sdk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessNotificationSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessNotificationSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Information"/>
 *     &lt;enumeration value="UserDefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessNotificationSeverity")
@XmlEnum
public enum BusinessNotificationSeverity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined");
    private final String value;

    BusinessNotificationSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessNotificationSeverity fromValue(String v) {
        for (BusinessNotificationSeverity c: BusinessNotificationSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
