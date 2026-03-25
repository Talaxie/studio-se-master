
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_omitted"/&gt;
 *     &lt;enumeration value="_worstCase"/&gt;
 *     &lt;enumeration value="_mostLikely"/&gt;
 *     &lt;enumeration value="_upside"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastType", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ForecastType {

    @XmlEnumValue("_omitted")
    OMITTED("_omitted"),
    @XmlEnumValue("_worstCase")
    WORST_CASE("_worstCase"),
    @XmlEnumValue("_mostLikely")
    MOST_LIKELY("_mostLikely"),
    @XmlEnumValue("_upside")
    UPSIDE("_upside");
    private final String value;

    ForecastType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForecastType fromValue(String v) {
        for (ForecastType c: ForecastType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
