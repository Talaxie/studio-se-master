
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemOverheadType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemOverheadType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_amountBaseUnit"/&gt;
 *     &lt;enumeration value="_percentOfMaterial"/&gt;
 *     &lt;enumeration value="_percentOfTotal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemOverheadType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemOverheadType {

    @XmlEnumValue("_amountBaseUnit")
    AMOUNT_BASE_UNIT("_amountBaseUnit"),
    @XmlEnumValue("_percentOfMaterial")
    PERCENT_OF_MATERIAL("_percentOfMaterial"),
    @XmlEnumValue("_percentOfTotal")
    PERCENT_OF_TOTAL("_percentOfTotal");
    private final String value;

    ItemOverheadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemOverheadType fromValue(String v) {
        for (ItemOverheadType c: ItemOverheadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
