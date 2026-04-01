
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemOutOfStockBehavior.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemOutOfStockBehavior"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_allowBackOrdersButDisplayOutOfStockMessage"/&gt;
 *     &lt;enumeration value="_allowBackOrdersWithNoOutOfStockMessage"/&gt;
 *     &lt;enumeration value="_default"/&gt;
 *     &lt;enumeration value="_disallowBackOrdersButDisplayOutOfStockMessage"/&gt;
 *     &lt;enumeration value="_removeItemWhenOutOfStock"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemOutOfStockBehavior", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemOutOfStockBehavior {

    @XmlEnumValue("_allowBackOrdersButDisplayOutOfStockMessage")
    ALLOW_BACK_ORDERS_BUT_DISPLAY_OUT_OF_STOCK_MESSAGE("_allowBackOrdersButDisplayOutOfStockMessage"),
    @XmlEnumValue("_allowBackOrdersWithNoOutOfStockMessage")
    ALLOW_BACK_ORDERS_WITH_NO_OUT_OF_STOCK_MESSAGE("_allowBackOrdersWithNoOutOfStockMessage"),
    @XmlEnumValue("_default")
    DEFAULT("_default"),
    @XmlEnumValue("_disallowBackOrdersButDisplayOutOfStockMessage")
    DISALLOW_BACK_ORDERS_BUT_DISPLAY_OUT_OF_STOCK_MESSAGE("_disallowBackOrdersButDisplayOutOfStockMessage"),
    @XmlEnumValue("_removeItemWhenOutOfStock")
    REMOVE_ITEM_WHEN_OUT_OF_STOCK("_removeItemWhenOutOfStock");
    private final String value;

    ItemOutOfStockBehavior(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemOutOfStockBehavior fromValue(String v) {
        for (ItemOutOfStockBehavior c: ItemOutOfStockBehavior.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
