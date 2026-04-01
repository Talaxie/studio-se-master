
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOtherRelationships.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerOtherRelationships"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_otherName"/&gt;
 *     &lt;enumeration value="_partner"/&gt;
 *     &lt;enumeration value="_vendor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerOtherRelationships", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerOtherRelationships {

    @XmlEnumValue("_otherName")
    OTHER_NAME("_otherName"),
    @XmlEnumValue("_partner")
    PARTNER("_partner"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    CustomerOtherRelationships(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerOtherRelationships fromValue(String v) {
        for (CustomerOtherRelationships c: CustomerOtherRelationships.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
