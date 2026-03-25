
package com.netsuite.webservices.platform.common.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurrenceFrequency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_none"/&gt;
 *     &lt;enumeration value="_day"/&gt;
 *     &lt;enumeration value="_week"/&gt;
 *     &lt;enumeration value="_month"/&gt;
 *     &lt;enumeration value="_year"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecurrenceFrequency", namespace = "urn:types.common_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum RecurrenceFrequency {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_day")
    DAY("_day"),
    @XmlEnumValue("_week")
    WEEK("_week"),
    @XmlEnumValue("_month")
    MONTH("_month"),
    @XmlEnumValue("_year")
    YEAR("_year");
    private final String value;

    RecurrenceFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurrenceFrequency fromValue(String v) {
        for (RecurrenceFrequency c: RecurrenceFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
