
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectTaskPredecessorPredecessorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectTaskPredecessorPredecessorType"&gt;
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
@XmlType(name = "ProjectTaskPredecessorPredecessorType", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ProjectTaskPredecessorPredecessorType {

    @XmlEnumValue("_finishToFinish")
    FINISH_TO_FINISH("_finishToFinish"),
    @XmlEnumValue("_finishToStart")
    FINISH_TO_START("_finishToStart"),
    @XmlEnumValue("_startToFinish")
    START_TO_FINISH("_startToFinish"),
    @XmlEnumValue("_startToStart")
    START_TO_START("_startToStart");
    private final String value;

    ProjectTaskPredecessorPredecessorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectTaskPredecessorPredecessorType fromValue(String v) {
        for (ProjectTaskPredecessorPredecessorType c: ProjectTaskPredecessorPredecessorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
