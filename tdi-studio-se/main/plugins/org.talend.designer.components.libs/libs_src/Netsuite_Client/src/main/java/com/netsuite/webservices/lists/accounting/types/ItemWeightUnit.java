
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemWeightUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemWeightUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_g"/&gt;
 *     &lt;enumeration value="_kg"/&gt;
 *     &lt;enumeration value="_lb"/&gt;
 *     &lt;enumeration value="_oz"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemWeightUnit", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemWeightUnit {

    @XmlEnumValue("_g")
    G("_g"),
    @XmlEnumValue("_kg")
    KG("_kg"),
    @XmlEnumValue("_lb")
    LB("_lb"),
    @XmlEnumValue("_oz")
    OZ("_oz");
    private final String value;

    ItemWeightUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemWeightUnit fromValue(String v) {
        for (ItemWeightUnit c: ItemWeightUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
