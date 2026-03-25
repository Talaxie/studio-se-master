
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExPriorityAlertTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExPriorityAlertTypeFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_fedexPriorityAlert"/&gt;
 *     &lt;enumeration value="_fedexPriorityAlertPlus"/&gt;
 *     &lt;enumeration value="_noneSelected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExPriorityAlertTypeFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExPriorityAlertTypeFedEx {

    @XmlEnumValue("_fedexPriorityAlert")
    FEDEX_PRIORITY_ALERT("_fedexPriorityAlert"),
    @XmlEnumValue("_fedexPriorityAlertPlus")
    FEDEX_PRIORITY_ALERT_PLUS("_fedexPriorityAlertPlus"),
    @XmlEnumValue("_noneSelected")
    NONE_SELECTED("_noneSelected");
    private final String value;

    ItemFulfillmentPackageFedExPriorityAlertTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExPriorityAlertTypeFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExPriorityAlertTypeFedEx c: ItemFulfillmentPackageFedExPriorityAlertTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
