
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitializeAuxRefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitializeAuxRefType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="shippingGroup"/&gt;
 *     &lt;enumeration value="arAccount"/&gt;
 *     &lt;enumeration value="apAccount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitializeAuxRefType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum InitializeAuxRefType {

    @XmlEnumValue("shippingGroup")
    SHIPPING_GROUP("shippingGroup"),
    @XmlEnumValue("arAccount")
    AR_ACCOUNT("arAccount"),
    @XmlEnumValue("apAccount")
    AP_ACCOUNT("apAccount");
    private final String value;

    InitializeAuxRefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitializeAuxRefType fromValue(String v) {
        for (InitializeAuxRefType c: InitializeAuxRefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
