
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerOtherRelationships.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartnerOtherRelationships"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_customer"/&gt;
 *     &lt;enumeration value="_otherName"/&gt;
 *     &lt;enumeration value="_vendor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartnerOtherRelationships", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PartnerOtherRelationships {

    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_otherName")
    OTHER_NAME("_otherName"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    PartnerOtherRelationships(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerOtherRelationships fromValue(String v) {
        for (PartnerOtherRelationships c: PartnerOtherRelationships.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
