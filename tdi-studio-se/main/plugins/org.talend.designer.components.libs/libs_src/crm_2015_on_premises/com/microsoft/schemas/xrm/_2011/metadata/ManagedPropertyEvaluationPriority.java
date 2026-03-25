
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedPropertyEvaluationPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedPropertyEvaluationPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Essential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManagedPropertyEvaluationPriority")
@XmlEnum
public enum ManagedPropertyEvaluationPriority {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Essential")
    ESSENTIAL("Essential");
    private final String value;

    ManagedPropertyEvaluationPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagedPropertyEvaluationPriority fromValue(String v) {
        for (ManagedPropertyEvaluationPriority c: ManagedPropertyEvaluationPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
