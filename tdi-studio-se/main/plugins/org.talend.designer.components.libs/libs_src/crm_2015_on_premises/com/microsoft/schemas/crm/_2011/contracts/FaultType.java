
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CrmException"/>
 *     &lt;enumeration value="ClrException"/>
 *     &lt;enumeration value="Assertion"/>
 *     &lt;enumeration value="Watson"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultType")
@XmlEnum
public enum FaultType {

    @XmlEnumValue("CrmException")
    CRM_EXCEPTION("CrmException"),
    @XmlEnumValue("ClrException")
    CLR_EXCEPTION("ClrException"),
    @XmlEnumValue("Assertion")
    ASSERTION("Assertion"),
    @XmlEnumValue("Watson")
    WATSON("Watson");
    private final String value;

    FaultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultType fromValue(String v) {
        for (FaultType c: FaultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
