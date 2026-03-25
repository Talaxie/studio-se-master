
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CascadeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CascadeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoCascade"/>
 *     &lt;enumeration value="Cascade"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="UserOwned"/>
 *     &lt;enumeration value="RemoveLink"/>
 *     &lt;enumeration value="Restrict"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CascadeType")
@XmlEnum
public enum CascadeType {

    @XmlEnumValue("NoCascade")
    NO_CASCADE("NoCascade"),
    @XmlEnumValue("Cascade")
    CASCADE("Cascade"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("UserOwned")
    USER_OWNED("UserOwned"),
    @XmlEnumValue("RemoveLink")
    REMOVE_LINK("RemoveLink"),
    @XmlEnumValue("Restrict")
    RESTRICT("Restrict");
    private final String value;

    CascadeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CascadeType fromValue(String v) {
        for (CascadeType c: CascadeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
