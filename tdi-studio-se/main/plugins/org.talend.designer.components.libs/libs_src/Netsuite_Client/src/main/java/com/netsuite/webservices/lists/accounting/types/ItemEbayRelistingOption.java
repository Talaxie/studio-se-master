
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemEbayRelistingOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemEbayRelistingOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_doNotRelist"/&gt;
 *     &lt;enumeration value="_relistWhenItemExpires"/&gt;
 *     &lt;enumeration value="_relistWhenItemIsSold"/&gt;
 *     &lt;enumeration value="_relistWhenItemIsSoldExpires"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemEbayRelistingOption", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemEbayRelistingOption {

    @XmlEnumValue("_doNotRelist")
    DO_NOT_RELIST("_doNotRelist"),
    @XmlEnumValue("_relistWhenItemExpires")
    RELIST_WHEN_ITEM_EXPIRES("_relistWhenItemExpires"),
    @XmlEnumValue("_relistWhenItemIsSold")
    RELIST_WHEN_ITEM_IS_SOLD("_relistWhenItemIsSold"),
    @XmlEnumValue("_relistWhenItemIsSoldExpires")
    RELIST_WHEN_ITEM_IS_SOLD_EXPIRES("_relistWhenItemIsSoldExpires");
    private final String value;

    ItemEbayRelistingOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemEbayRelistingOption fromValue(String v) {
        for (ItemEbayRelistingOption c: ItemEbayRelistingOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
