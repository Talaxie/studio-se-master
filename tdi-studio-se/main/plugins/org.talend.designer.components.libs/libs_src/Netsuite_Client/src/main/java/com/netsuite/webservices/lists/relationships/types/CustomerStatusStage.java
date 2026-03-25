
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerStatusStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerStatusStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_customer"/&gt;
 *     &lt;enumeration value="_lead"/&gt;
 *     &lt;enumeration value="_prospect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerStatusStage", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerStatusStage {

    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_lead")
    LEAD("_lead"),
    @XmlEnumValue("_prospect")
    PROSPECT("_prospect");
    private final String value;

    CustomerStatusStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerStatusStage fromValue(String v) {
        for (CustomerStatusStage c: CustomerStatusStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
