
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemProductFeed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemProductFeed"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_googleBase"/&gt;
 *     &lt;enumeration value="_nexTag"/&gt;
 *     &lt;enumeration value="_shoppingCom"/&gt;
 *     &lt;enumeration value="_shopzilla"/&gt;
 *     &lt;enumeration value="_yahooShopping"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemProductFeed", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemProductFeed {

    @XmlEnumValue("_googleBase")
    GOOGLE_BASE("_googleBase"),
    @XmlEnumValue("_nexTag")
    NEX_TAG("_nexTag"),
    @XmlEnumValue("_shoppingCom")
    SHOPPING_COM("_shoppingCom"),
    @XmlEnumValue("_shopzilla")
    SHOPZILLA("_shopzilla"),
    @XmlEnumValue("_yahooShopping")
    YAHOO_SHOPPING("_yahooShopping");
    private final String value;

    ItemProductFeed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemProductFeed fromValue(String v) {
        for (ItemProductFeed c: ItemProductFeed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
