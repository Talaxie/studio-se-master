
package com.netsuite.webservices.transactions.inventory.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkOrderOrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_built"/&gt;
 *     &lt;enumeration value="_cancelled"/&gt;
 *     &lt;enumeration value="_closed"/&gt;
 *     &lt;enumeration value="_inProcess"/&gt;
 *     &lt;enumeration value="_planned"/&gt;
 *     &lt;enumeration value="_released"/&gt;
 *     &lt;enumeration value="_undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkOrderOrderStatus", namespace = "urn:types.inventory_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum WorkOrderOrderStatus {

    @XmlEnumValue("_built")
    BUILT("_built"),
    @XmlEnumValue("_cancelled")
    CANCELLED("_cancelled"),
    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_inProcess")
    IN_PROCESS("_inProcess"),
    @XmlEnumValue("_planned")
    PLANNED("_planned"),
    @XmlEnumValue("_released")
    RELEASED("_released"),
    @XmlEnumValue("_undefined")
    UNDEFINED("_undefined");
    private final String value;

    WorkOrderOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkOrderOrderStatus fromValue(String v) {
        for (WorkOrderOrderStatus c: WorkOrderOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
