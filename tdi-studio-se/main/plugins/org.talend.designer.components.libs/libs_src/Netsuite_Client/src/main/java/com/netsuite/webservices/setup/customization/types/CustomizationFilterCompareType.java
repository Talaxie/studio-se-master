
package com.netsuite.webservices.setup.customization.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationFilterCompareType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationFilterCompareType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_equal"/&gt;
 *     &lt;enumeration value="_greaterThan"/&gt;
 *     &lt;enumeration value="_greaterThanOrEqual"/&gt;
 *     &lt;enumeration value="_lessThan"/&gt;
 *     &lt;enumeration value="_lessThanOrEqual"/&gt;
 *     &lt;enumeration value="_notEqual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomizationFilterCompareType", namespace = "urn:types.customization_2014_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationFilterCompareType {

    @XmlEnumValue("_equal")
    EQUAL("_equal"),
    @XmlEnumValue("_greaterThan")
    GREATER_THAN("_greaterThan"),
    @XmlEnumValue("_greaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("_greaterThanOrEqual"),
    @XmlEnumValue("_lessThan")
    LESS_THAN("_lessThan"),
    @XmlEnumValue("_lessThanOrEqual")
    LESS_THAN_OR_EQUAL("_lessThanOrEqual"),
    @XmlEnumValue("_notEqual")
    NOT_EQUAL("_notEqual");
    private final String value;

    CustomizationFilterCompareType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationFilterCompareType fromValue(String v) {
        for (CustomizationFilterCompareType c: CustomizationFilterCompareType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
