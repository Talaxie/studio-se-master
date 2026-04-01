
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemInvtClassification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemInvtClassification"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_a"/&gt;
 *     &lt;enumeration value="_b"/&gt;
 *     &lt;enumeration value="_c"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemInvtClassification", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemInvtClassification {

    @XmlEnumValue("_a")
    A("_a"),
    @XmlEnumValue("_b")
    B("_b"),
    @XmlEnumValue("_c")
    C("_c");
    private final String value;

    ItemInvtClassification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemInvtClassification fromValue(String v) {
        for (ItemInvtClassification c: ItemInvtClassification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
