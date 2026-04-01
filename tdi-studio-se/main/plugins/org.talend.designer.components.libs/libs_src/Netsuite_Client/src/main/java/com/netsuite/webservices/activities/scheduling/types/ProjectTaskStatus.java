
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectTaskStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectTaskStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_completed"/&gt;
 *     &lt;enumeration value="_inProgress"/&gt;
 *     &lt;enumeration value="_notStarted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProjectTaskStatus", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ProjectTaskStatus {

    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_notStarted")
    NOT_STARTED("_notStarted");
    private final String value;

    ProjectTaskStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectTaskStatus fromValue(String v) {
        for (ProjectTaskStatus c: ProjectTaskStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
