
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCurrencyPrecision.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCurrencyPrecision"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_one"/&gt;
 *     &lt;enumeration value="_two"/&gt;
 *     &lt;enumeration value="_zero"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCurrencyPrecision", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CurrencyCurrencyPrecision {

    @XmlEnumValue("_one")
    ONE("_one"),
    @XmlEnumValue("_two")
    TWO("_two"),
    @XmlEnumValue("_zero")
    ZERO("_zero");
    private final String value;

    CurrencyCurrencyPrecision(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyCurrencyPrecision fromValue(String v) {
        for (CurrencyCurrencyPrecision c: CurrencyCurrencyPrecision.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
