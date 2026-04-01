
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExCodFreightTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExCodFreightTypeFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_cODCharge"/&gt;
 *     &lt;enumeration value="_noneSelected"/&gt;
 *     &lt;enumeration value="_orderChargeNet"/&gt;
 *     &lt;enumeration value="_orderChargeTotal"/&gt;
 *     &lt;enumeration value="_shippingCharge"/&gt;
 *     &lt;enumeration value="_totalCharge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExCodFreightTypeFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExCodFreightTypeFedEx {

    @XmlEnumValue("_cODCharge")
    C_OD_CHARGE("_cODCharge"),
    @XmlEnumValue("_noneSelected")
    NONE_SELECTED("_noneSelected"),
    @XmlEnumValue("_orderChargeNet")
    ORDER_CHARGE_NET("_orderChargeNet"),
    @XmlEnumValue("_orderChargeTotal")
    ORDER_CHARGE_TOTAL("_orderChargeTotal"),
    @XmlEnumValue("_shippingCharge")
    SHIPPING_CHARGE("_shippingCharge"),
    @XmlEnumValue("_totalCharge")
    TOTAL_CHARGE("_totalCharge");
    private final String value;

    ItemFulfillmentPackageFedExCodFreightTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExCodFreightTypeFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExCodFreightTypeFedEx c: ItemFulfillmentPackageFedExCodFreightTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
