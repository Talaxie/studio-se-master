
package com.netsuite.webservices.transactions.inventory.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderItemItemCreatePo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkOrderItemItemCreatePo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_dropShipment"/&gt;
 *     &lt;enumeration value="_specialOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkOrderItemItemCreatePo", namespace = "urn:types.inventory_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum WorkOrderItemItemCreatePo {

    @XmlEnumValue("_dropShipment")
    DROP_SHIPMENT("_dropShipment"),
    @XmlEnumValue("_specialOrder")
    SPECIAL_ORDER("_specialOrder");
    private final String value;

    WorkOrderItemItemCreatePo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkOrderItemItemCreatePo fromValue(String v) {
        for (WorkOrderItemItemCreatePo c: WorkOrderItemItemCreatePo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
