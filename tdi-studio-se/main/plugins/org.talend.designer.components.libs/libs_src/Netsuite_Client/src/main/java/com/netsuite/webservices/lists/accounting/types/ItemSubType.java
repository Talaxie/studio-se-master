
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSubType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_forPurchase"/&gt;
 *     &lt;enumeration value="_forResale"/&gt;
 *     &lt;enumeration value="_forSale"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemSubType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSubType {

    @XmlEnumValue("_forPurchase")
    FOR_PURCHASE("_forPurchase"),
    @XmlEnumValue("_forResale")
    FOR_RESALE("_forResale"),
    @XmlEnumValue("_forSale")
    FOR_SALE("_forSale");
    private final String value;

    ItemSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSubType fromValue(String v) {
        for (ItemSubType c: ItemSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
