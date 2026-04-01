
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentAccessibilityTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentAccessibilityTypeFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_accessible"/&gt;
 *     &lt;enumeration value="_inaccessible"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentAccessibilityTypeFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentAccessibilityTypeFedEx {

    @XmlEnumValue("_accessible")
    ACCESSIBLE("_accessible"),
    @XmlEnumValue("_inaccessible")
    INACCESSIBLE("_inaccessible");
    private final String value;

    ItemFulfillmentAccessibilityTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentAccessibilityTypeFedEx fromValue(String v) {
        for (ItemFulfillmentAccessibilityTypeFedEx c: ItemFulfillmentAccessibilityTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
