
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedPropertyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedPropertyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Operation"/>
 *     &lt;enumeration value="Attribute"/>
 *     &lt;enumeration value="CustomEvaluator"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManagedPropertyType")
@XmlEnum
public enum ManagedPropertyType {

    @XmlEnumValue("Operation")
    OPERATION("Operation"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),
    @XmlEnumValue("CustomEvaluator")
    CUSTOM_EVALUATOR("CustomEvaluator"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    ManagedPropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagedPropertyType fromValue(String v) {
        for (ManagedPropertyType c: ManagedPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
