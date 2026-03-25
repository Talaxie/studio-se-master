
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentHomeDeliveryTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentHomeDeliveryTypeFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_appointment"/&gt;
 *     &lt;enumeration value="_dateCertain"/&gt;
 *     &lt;enumeration value="_evening"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentHomeDeliveryTypeFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentHomeDeliveryTypeFedEx {

    @XmlEnumValue("_appointment")
    APPOINTMENT("_appointment"),
    @XmlEnumValue("_dateCertain")
    DATE_CERTAIN("_dateCertain"),
    @XmlEnumValue("_evening")
    EVENING("_evening");
    private final String value;

    ItemFulfillmentHomeDeliveryTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentHomeDeliveryTypeFedEx fromValue(String v) {
        for (ItemFulfillmentHomeDeliveryTypeFedEx c: ItemFulfillmentHomeDeliveryTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
