
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="Schedulable"/>
 *     &lt;enumeration value="Committed"/>
 *     &lt;enumeration value="Uncommitted"/>
 *     &lt;enumeration value="Break"/>
 *     &lt;enumeration value="Holiday"/>
 *     &lt;enumeration value="Vacation"/>
 *     &lt;enumeration value="Appointment"/>
 *     &lt;enumeration value="ResourceStartTime"/>
 *     &lt;enumeration value="ResourceServiceRestriction"/>
 *     &lt;enumeration value="ResourceCapacity"/>
 *     &lt;enumeration value="ServiceRestriction"/>
 *     &lt;enumeration value="ServiceCost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubCode")
@XmlEnum
public enum SubCode {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Schedulable")
    SCHEDULABLE("Schedulable"),
    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("Uncommitted")
    UNCOMMITTED("Uncommitted"),
    @XmlEnumValue("Break")
    BREAK("Break"),
    @XmlEnumValue("Holiday")
    HOLIDAY("Holiday"),
    @XmlEnumValue("Vacation")
    VACATION("Vacation"),
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),
    @XmlEnumValue("ResourceStartTime")
    RESOURCE_START_TIME("ResourceStartTime"),
    @XmlEnumValue("ResourceServiceRestriction")
    RESOURCE_SERVICE_RESTRICTION("ResourceServiceRestriction"),
    @XmlEnumValue("ResourceCapacity")
    RESOURCE_CAPACITY("ResourceCapacity"),
    @XmlEnumValue("ServiceRestriction")
    SERVICE_RESTRICTION("ServiceRestriction"),
    @XmlEnumValue("ServiceCost")
    SERVICE_COST("ServiceCost");
    private final String value;

    SubCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubCode fromValue(String v) {
        for (SubCode c: SubCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
