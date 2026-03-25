
package com.netsuite.webservices.transactions.inventory.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderSchedulingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkOrderSchedulingMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_backward"/&gt;
 *     &lt;enumeration value="_forward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkOrderSchedulingMethod", namespace = "urn:types.inventory_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum WorkOrderSchedulingMethod {

    @XmlEnumValue("_backward")
    BACKWARD("_backward"),
    @XmlEnumValue("_forward")
    FORWARD("_forward");
    private final String value;

    WorkOrderSchedulingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkOrderSchedulingMethod fromValue(String v) {
        for (WorkOrderSchedulingMethod c: WorkOrderSchedulingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
