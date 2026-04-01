
package com.netsuite.webservices.platform.common.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvsMatchCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvsMatchCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_n"/&gt;
 *     &lt;enumeration value="_x"/&gt;
 *     &lt;enumeration value="_y"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvsMatchCode", namespace = "urn:types.common_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum AvsMatchCode {

    @XmlEnumValue("_n")
    N("_n"),
    @XmlEnumValue("_x")
    X("_x"),
    @XmlEnumValue("_y")
    Y("_y");
    private final String value;

    AvsMatchCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvsMatchCode fromValue(String v) {
        for (AvsMatchCode c: AvsMatchCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
