
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExCodMethodFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExCodMethodFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_any"/&gt;
 *     &lt;enumeration value="_cash"/&gt;
 *     &lt;enumeration value="_guaranteedFunds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExCodMethodFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExCodMethodFedEx {

    @XmlEnumValue("_any")
    ANY("_any"),
    @XmlEnumValue("_cash")
    CASH("_cash"),
    @XmlEnumValue("_guaranteedFunds")
    GUARANTEED_FUNDS("_guaranteedFunds");
    private final String value;

    ItemFulfillmentPackageFedExCodMethodFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExCodMethodFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExCodMethodFedEx c: ItemFulfillmentPackageFedExCodMethodFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
