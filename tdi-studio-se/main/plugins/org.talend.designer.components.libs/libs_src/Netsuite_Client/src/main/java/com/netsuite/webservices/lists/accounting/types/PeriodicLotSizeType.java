
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicLotSizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodicLotSizeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_interval"/&gt;
 *     &lt;enumeration value="_monthly"/&gt;
 *     &lt;enumeration value="_weekly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodicLotSizeType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PeriodicLotSizeType {

    @XmlEnumValue("_interval")
    INTERVAL("_interval"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly");
    private final String value;

    PeriodicLotSizeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodicLotSizeType fromValue(String v) {
        for (PeriodicLotSizeType c: PeriodicLotSizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
