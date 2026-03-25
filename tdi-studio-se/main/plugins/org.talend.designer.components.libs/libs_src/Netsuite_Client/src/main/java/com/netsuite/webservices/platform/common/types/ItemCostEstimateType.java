
package com.netsuite.webservices.platform.common.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCostEstimateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCostEstimateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_averageCost"/&gt;
 *     &lt;enumeration value="_custom"/&gt;
 *     &lt;enumeration value="_derivedFromMemberItems"/&gt;
 *     &lt;enumeration value="_itemDefinedCost"/&gt;
 *     &lt;enumeration value="_lastPurchasePrice"/&gt;
 *     &lt;enumeration value="_preferredVendorRate"/&gt;
 *     &lt;enumeration value="_purchaseOrderRate"/&gt;
 *     &lt;enumeration value="_purchasePrice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemCostEstimateType", namespace = "urn:types.common_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum ItemCostEstimateType {

    @XmlEnumValue("_averageCost")
    AVERAGE_COST("_averageCost"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_derivedFromMemberItems")
    DERIVED_FROM_MEMBER_ITEMS("_derivedFromMemberItems"),
    @XmlEnumValue("_itemDefinedCost")
    ITEM_DEFINED_COST("_itemDefinedCost"),
    @XmlEnumValue("_lastPurchasePrice")
    LAST_PURCHASE_PRICE("_lastPurchasePrice"),
    @XmlEnumValue("_preferredVendorRate")
    PREFERRED_VENDOR_RATE("_preferredVendorRate"),
    @XmlEnumValue("_purchaseOrderRate")
    PURCHASE_ORDER_RATE("_purchaseOrderRate"),
    @XmlEnumValue("_purchasePrice")
    PURCHASE_PRICE("_purchasePrice");
    private final String value;

    ItemCostEstimateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCostEstimateType fromValue(String v) {
        for (ItemCostEstimateType c: ItemCostEstimateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
