
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExSignatureOptionsFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExSignatureOptionsFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_adult"/&gt;
 *     &lt;enumeration value="_direct"/&gt;
 *     &lt;enumeration value="_indirect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExSignatureOptionsFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExSignatureOptionsFedEx {

    @XmlEnumValue("_adult")
    ADULT("_adult"),
    @XmlEnumValue("_direct")
    DIRECT("_direct"),
    @XmlEnumValue("_indirect")
    INDIRECT("_indirect");
    private final String value;

    ItemFulfillmentPackageFedExSignatureOptionsFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExSignatureOptionsFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExSignatureOptionsFedEx c: ItemFulfillmentPackageFedExSignatureOptionsFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
