
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPreferenceCriterion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemPreferenceCriterion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_A"/&gt;
 *     &lt;enumeration value="_B"/&gt;
 *     &lt;enumeration value="_C"/&gt;
 *     &lt;enumeration value="_D"/&gt;
 *     &lt;enumeration value="_E"/&gt;
 *     &lt;enumeration value="_F"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemPreferenceCriterion", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemPreferenceCriterion {

    @XmlEnumValue("_A")
    A("_A"),
    @XmlEnumValue("_B")
    B("_B"),
    @XmlEnumValue("_C")
    C("_C"),
    @XmlEnumValue("_D")
    D("_D"),
    @XmlEnumValue("_E")
    E("_E"),
    @XmlEnumValue("_F")
    F("_F");
    private final String value;

    ItemPreferenceCriterion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemPreferenceCriterion fromValue(String v) {
        for (ItemPreferenceCriterion c: ItemPreferenceCriterion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
