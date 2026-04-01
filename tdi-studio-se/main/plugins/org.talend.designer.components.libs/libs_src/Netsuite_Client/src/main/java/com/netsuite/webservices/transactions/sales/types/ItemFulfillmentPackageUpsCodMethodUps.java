
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageUpsCodMethodUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageUpsCodMethodUps"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_cashiersCheckMoneyOrder"/&gt;
 *     &lt;enumeration value="_checkCashiersCheckMoneyOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageUpsCodMethodUps", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageUpsCodMethodUps {

    @XmlEnumValue("_cashiersCheckMoneyOrder")
    CASHIERS_CHECK_MONEY_ORDER("_cashiersCheckMoneyOrder"),
    @XmlEnumValue("_checkCashiersCheckMoneyOrder")
    CHECK_CASHIERS_CHECK_MONEY_ORDER("_checkCashiersCheckMoneyOrder");
    private final String value;

    ItemFulfillmentPackageUpsCodMethodUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageUpsCodMethodUps fromValue(String v) {
        for (ItemFulfillmentPackageUpsCodMethodUps c: ItemFulfillmentPackageUpsCodMethodUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
