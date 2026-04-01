
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskPriority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_high"/&gt;
 *     &lt;enumeration value="_low"/&gt;
 *     &lt;enumeration value="_medium"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskPriority", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum TaskPriority {

    @XmlEnumValue("_high")
    HIGH("_high"),
    @XmlEnumValue("_low")
    LOW("_low"),
    @XmlEnumValue("_medium")
    MEDIUM("_medium");
    private final String value;

    TaskPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskPriority fromValue(String v) {
        for (TaskPriority c: TaskPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
