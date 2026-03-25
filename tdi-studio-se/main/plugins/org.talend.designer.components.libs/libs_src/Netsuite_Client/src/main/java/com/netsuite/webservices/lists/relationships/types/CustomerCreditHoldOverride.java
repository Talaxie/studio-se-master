
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerCreditHoldOverride.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerCreditHoldOverride"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_auto"/&gt;
 *     &lt;enumeration value="_on"/&gt;
 *     &lt;enumeration value="_off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerCreditHoldOverride", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerCreditHoldOverride {

    @XmlEnumValue("_auto")
    AUTO("_auto"),
    @XmlEnumValue("_on")
    ON("_on"),
    @XmlEnumValue("_off")
    OFF("_off");
    private final String value;

    CustomerCreditHoldOverride(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerCreditHoldOverride fromValue(String v) {
        for (CustomerCreditHoldOverride c: CustomerCreditHoldOverride.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
