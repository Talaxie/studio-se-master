
package com.netsuite.webservices.transactions.inventory.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderItemItemCommitInventory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkOrderItemItemCommitInventory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_availableQty"/&gt;
 *     &lt;enumeration value="_completeQty"/&gt;
 *     &lt;enumeration value="_doNotCommit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkOrderItemItemCommitInventory", namespace = "urn:types.inventory_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum WorkOrderItemItemCommitInventory {

    @XmlEnumValue("_availableQty")
    AVAILABLE_QTY("_availableQty"),
    @XmlEnumValue("_completeQty")
    COMPLETE_QTY("_completeQty"),
    @XmlEnumValue("_doNotCommit")
    DO_NOT_COMMIT("_doNotCommit");
    private final String value;

    WorkOrderItemItemCommitInventory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkOrderItemItemCommitInventory fromValue(String v) {
        for (WorkOrderItemItemCommitInventory c: WorkOrderItemItemCommitInventory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
