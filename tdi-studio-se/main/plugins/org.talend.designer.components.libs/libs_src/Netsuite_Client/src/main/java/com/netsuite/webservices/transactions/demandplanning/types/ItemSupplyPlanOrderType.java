
package com.netsuite.webservices.transactions.demandplanning.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSupplyPlanOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSupplyPlanOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_purchaseOrder"/&gt;
 *     &lt;enumeration value="_transferOrder"/&gt;
 *     &lt;enumeration value="_workOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemSupplyPlanOrderType", namespace = "urn:types.demandplanning_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemSupplyPlanOrderType {

    @XmlEnumValue("_purchaseOrder")
    PURCHASE_ORDER("_purchaseOrder"),
    @XmlEnumValue("_transferOrder")
    TRANSFER_ORDER("_transferOrder"),
    @XmlEnumValue("_workOrder")
    WORK_ORDER("_workOrder");
    private final String value;

    ItemSupplyPlanOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSupplyPlanOrderType fromValue(String v) {
        for (ItemSupplyPlanOrderType c: ItemSupplyPlanOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
