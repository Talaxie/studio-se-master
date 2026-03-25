
package com.netsuite.webservices.platform.common.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CscMatchCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CscMatchCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_n"/&gt;
 *     &lt;enumeration value="_x"/&gt;
 *     &lt;enumeration value="_y"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CscMatchCode", namespace = "urn:types.common_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum CscMatchCode {

    @XmlEnumValue("_n")
    N("_n"),
    @XmlEnumValue("_x")
    X("_x"),
    @XmlEnumValue("_y")
    Y("_y");
    private final String value;

    CscMatchCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CscMatchCode fromValue(String v) {
        for (CscMatchCode c: CscMatchCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
