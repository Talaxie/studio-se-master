
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedMenuBehavior.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssociatedMenuBehavior">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UseCollectionName"/>
 *     &lt;enumeration value="UseLabel"/>
 *     &lt;enumeration value="DoNotDisplay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssociatedMenuBehavior")
@XmlEnum
public enum AssociatedMenuBehavior {

    @XmlEnumValue("UseCollectionName")
    USE_COLLECTION_NAME("UseCollectionName"),
    @XmlEnumValue("UseLabel")
    USE_LABEL("UseLabel"),
    @XmlEnumValue("DoNotDisplay")
    DO_NOT_DISPLAY("DoNotDisplay");
    private final String value;

    AssociatedMenuBehavior(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssociatedMenuBehavior fromValue(String v) {
        for (AssociatedMenuBehavior c: AssociatedMenuBehavior.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
