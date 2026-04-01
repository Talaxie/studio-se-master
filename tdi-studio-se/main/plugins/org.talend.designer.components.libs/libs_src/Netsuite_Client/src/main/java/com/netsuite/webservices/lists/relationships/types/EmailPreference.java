
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailPreference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailPreference"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_default"/&gt;
 *     &lt;enumeration value="_hTML"/&gt;
 *     &lt;enumeration value="_pDF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailPreference", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmailPreference {

    @XmlEnumValue("_default")
    DEFAULT("_default"),
    @XmlEnumValue("_hTML")
    H_TML("_hTML"),
    @XmlEnumValue("_pDF")
    P_DF("_pDF");
    private final String value;

    EmailPreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailPreference fromValue(String v) {
        for (EmailPreference c: EmailPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
