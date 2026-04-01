
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesTaxItemAvailable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesTaxItemAvailable"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_both"/&gt;
 *     &lt;enumeration value="_purchase"/&gt;
 *     &lt;enumeration value="_sale"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalesTaxItemAvailable", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum SalesTaxItemAvailable {

    @XmlEnumValue("_both")
    BOTH("_both"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase"),
    @XmlEnumValue("_sale")
    SALE("_sale");
    private final String value;

    SalesTaxItemAvailable(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesTaxItemAvailable fromValue(String v) {
        for (SalesTaxItemAvailable c: SalesTaxItemAvailable.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
