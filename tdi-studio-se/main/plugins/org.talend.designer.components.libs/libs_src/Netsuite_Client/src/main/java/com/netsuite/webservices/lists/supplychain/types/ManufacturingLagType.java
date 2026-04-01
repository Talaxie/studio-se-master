
package com.netsuite.webservices.lists.supplychain.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManufacturingLagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManufacturingLagType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_quantity"/&gt;
 *     &lt;enumeration value="_quantityPercentage"/&gt;
 *     &lt;enumeration value="_time"/&gt;
 *     &lt;enumeration value="_timePercentage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManufacturingLagType", namespace = "urn:types.supplychain_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ManufacturingLagType {

    @XmlEnumValue("_quantity")
    QUANTITY("_quantity"),
    @XmlEnumValue("_quantityPercentage")
    QUANTITY_PERCENTAGE("_quantityPercentage"),
    @XmlEnumValue("_time")
    TIME("_time"),
    @XmlEnumValue("_timePercentage")
    TIME_PERCENTAGE("_timePercentage");
    private final String value;

    ManufacturingLagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManufacturingLagType fromValue(String v) {
        for (ManufacturingLagType c: ManufacturingLagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
