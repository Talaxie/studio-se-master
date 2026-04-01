
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRounding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRounding"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_roundDown"/&gt;
 *     &lt;enumeration value="_roundOff"/&gt;
 *     &lt;enumeration value="_roundUp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxRounding", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum TaxRounding {

    @XmlEnumValue("_roundDown")
    ROUND_DOWN("_roundDown"),
    @XmlEnumValue("_roundOff")
    ROUND_OFF("_roundOff"),
    @XmlEnumValue("_roundUp")
    ROUND_UP("_roundUp");
    private final String value;

    TaxRounding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxRounding fromValue(String v) {
        for (TaxRounding c: TaxRounding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
