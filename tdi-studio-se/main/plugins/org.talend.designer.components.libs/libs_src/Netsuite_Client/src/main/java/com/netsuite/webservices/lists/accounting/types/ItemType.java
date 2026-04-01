
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_assembly"/&gt;
 *     &lt;enumeration value="_description"/&gt;
 *     &lt;enumeration value="_discount"/&gt;
 *     &lt;enumeration value="_downloadItem"/&gt;
 *     &lt;enumeration value="_giftCertificateItem"/&gt;
 *     &lt;enumeration value="_inventoryItem"/&gt;
 *     &lt;enumeration value="_itemGroup"/&gt;
 *     &lt;enumeration value="_kit"/&gt;
 *     &lt;enumeration value="_markup"/&gt;
 *     &lt;enumeration value="_nonInventoryItem"/&gt;
 *     &lt;enumeration value="_otherCharge"/&gt;
 *     &lt;enumeration value="_payment"/&gt;
 *     &lt;enumeration value="_service"/&gt;
 *     &lt;enumeration value="_subtotal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemType {

    @XmlEnumValue("_assembly")
    ASSEMBLY("_assembly"),
    @XmlEnumValue("_description")
    DESCRIPTION("_description"),
    @XmlEnumValue("_discount")
    DISCOUNT("_discount"),
    @XmlEnumValue("_downloadItem")
    DOWNLOAD_ITEM("_downloadItem"),
    @XmlEnumValue("_giftCertificateItem")
    GIFT_CERTIFICATE_ITEM("_giftCertificateItem"),
    @XmlEnumValue("_inventoryItem")
    INVENTORY_ITEM("_inventoryItem"),
    @XmlEnumValue("_itemGroup")
    ITEM_GROUP("_itemGroup"),
    @XmlEnumValue("_kit")
    KIT("_kit"),
    @XmlEnumValue("_markup")
    MARKUP("_markup"),
    @XmlEnumValue("_nonInventoryItem")
    NON_INVENTORY_ITEM("_nonInventoryItem"),
    @XmlEnumValue("_otherCharge")
    OTHER_CHARGE("_otherCharge"),
    @XmlEnumValue("_payment")
    PAYMENT("_payment"),
    @XmlEnumValue("_service")
    SERVICE("_service"),
    @XmlEnumValue("_subtotal")
    SUBTOTAL("_subtotal");
    private final String value;

    ItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemType fromValue(String v) {
        for (ItemType c: ItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
