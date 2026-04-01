
package com.netsuite.webservices.platform.common.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsoePermitDiscount.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VsoePermitDiscount"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_asAllowed"/&gt;
 *     &lt;enumeration value="_never"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VsoePermitDiscount", namespace = "urn:types.common_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum VsoePermitDiscount {

    @XmlEnumValue("_asAllowed")
    AS_ALLOWED("_asAllowed"),
    @XmlEnumValue("_never")
    NEVER("_never");
    private final String value;

    VsoePermitDiscount(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VsoePermitDiscount fromValue(String v) {
        for (VsoePermitDiscount c: VsoePermitDiscount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
