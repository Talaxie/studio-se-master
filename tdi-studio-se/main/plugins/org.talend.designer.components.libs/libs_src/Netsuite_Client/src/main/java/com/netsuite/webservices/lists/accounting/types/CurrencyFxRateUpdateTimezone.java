
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyFxRateUpdateTimezone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyFxRateUpdateTimezone"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_americaNewYork"/&gt;
 *     &lt;enumeration value="_asiaMagadan"/&gt;
 *     &lt;enumeration value="_asiaTokyo"/&gt;
 *     &lt;enumeration value="_europeParis"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyFxRateUpdateTimezone", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CurrencyFxRateUpdateTimezone {

    @XmlEnumValue("_americaNewYork")
    AMERICA_NEW_YORK("_americaNewYork"),
    @XmlEnumValue("_asiaMagadan")
    ASIA_MAGADAN("_asiaMagadan"),
    @XmlEnumValue("_asiaTokyo")
    ASIA_TOKYO("_asiaTokyo"),
    @XmlEnumValue("_europeParis")
    EUROPE_PARIS("_europeParis");
    private final String value;

    CurrencyFxRateUpdateTimezone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyFxRateUpdateTimezone fromValue(String v) {
        for (CurrencyFxRateUpdateTimezone c: CurrencyFxRateUpdateTimezone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
