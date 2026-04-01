
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityGroupDefView.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityGroupDefView"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_daily"/&gt;
 *     &lt;enumeration value="_weekly"/&gt;
 *     &lt;enumeration value="_monthly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityGroupDefView", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EntityGroupDefView {

    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly");
    private final String value;

    EntityGroupDefView(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityGroupDefView fromValue(String v) {
        for (EntityGroupDefView c: EntityGroupDefView.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
