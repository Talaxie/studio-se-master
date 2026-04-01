
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemOverallQuantityPricingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemOverallQuantityPricingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_byLineQuantity"/&gt;
 *     &lt;enumeration value="_byOverallItemQuantity"/&gt;
 *     &lt;enumeration value="_byOverallParentQuantity"/&gt;
 *     &lt;enumeration value="_byOverallScheduleQuantity"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemOverallQuantityPricingType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemOverallQuantityPricingType {

    @XmlEnumValue("_byLineQuantity")
    BY_LINE_QUANTITY("_byLineQuantity"),
    @XmlEnumValue("_byOverallItemQuantity")
    BY_OVERALL_ITEM_QUANTITY("_byOverallItemQuantity"),
    @XmlEnumValue("_byOverallParentQuantity")
    BY_OVERALL_PARENT_QUANTITY("_byOverallParentQuantity"),
    @XmlEnumValue("_byOverallScheduleQuantity")
    BY_OVERALL_SCHEDULE_QUANTITY("_byOverallScheduleQuantity");
    private final String value;

    ItemOverallQuantityPricingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemOverallQuantityPricingType fromValue(String v) {
        for (ItemOverallQuantityPricingType c: ItemOverallQuantityPricingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
