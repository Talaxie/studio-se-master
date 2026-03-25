
package com.netsuite.webservices.lists.supplychain.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManufacturingOperationTaskPredecessorPredecessorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManufacturingOperationTaskPredecessorPredecessorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_finishToFinish"/&gt;
 *     &lt;enumeration value="_finishToStart"/&gt;
 *     &lt;enumeration value="_startToFinish"/&gt;
 *     &lt;enumeration value="_startToStart"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManufacturingOperationTaskPredecessorPredecessorType", namespace = "urn:types.supplychain_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ManufacturingOperationTaskPredecessorPredecessorType {

    @XmlEnumValue("_finishToFinish")
    FINISH_TO_FINISH("_finishToFinish"),
    @XmlEnumValue("_finishToStart")
    FINISH_TO_START("_finishToStart"),
    @XmlEnumValue("_startToFinish")
    START_TO_FINISH("_startToFinish"),
    @XmlEnumValue("_startToStart")
    START_TO_START("_startToStart");
    private final String value;

    ManufacturingOperationTaskPredecessorPredecessorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManufacturingOperationTaskPredecessorPredecessorType fromValue(String v) {
        for (ManufacturingOperationTaskPredecessorPredecessorType c: ManufacturingOperationTaskPredecessorPredecessorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
