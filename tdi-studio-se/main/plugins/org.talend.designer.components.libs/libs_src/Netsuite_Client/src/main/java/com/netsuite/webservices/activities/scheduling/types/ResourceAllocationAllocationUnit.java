
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceAllocationAllocationUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceAllocationAllocationUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_hours"/&gt;
 *     &lt;enumeration value="_percentOfTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceAllocationAllocationUnit", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ResourceAllocationAllocationUnit {

    @XmlEnumValue("_hours")
    HOURS("_hours"),
    @XmlEnumValue("_percentOfTime")
    PERCENT_OF_TIME("_percentOfTime");
    private final String value;

    ResourceAllocationAllocationUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceAllocationAllocationUnit fromValue(String v) {
        for (ResourceAllocationAllocationUnit c: ResourceAllocationAllocationUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
