
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderItemCreatePo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesOrderItemCreatePo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_dropShipment"/&gt;
 *     &lt;enumeration value="_specialOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalesOrderItemCreatePo", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum SalesOrderItemCreatePo {

    @XmlEnumValue("_dropShipment")
    DROP_SHIPMENT("_dropShipment"),
    @XmlEnumValue("_specialOrder")
    SPECIAL_ORDER("_specialOrder");
    private final String value;

    SalesOrderItemCreatePo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesOrderItemCreatePo fromValue(String v) {
        for (SalesOrderItemCreatePo c: SalesOrderItemCreatePo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
