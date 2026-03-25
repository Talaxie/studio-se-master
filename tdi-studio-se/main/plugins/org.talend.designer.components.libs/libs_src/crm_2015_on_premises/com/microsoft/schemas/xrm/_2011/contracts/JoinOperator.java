
package com.microsoft.schemas.xrm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JoinOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JoinOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inner"/>
 *     &lt;enumeration value="LeftOuter"/>
 *     &lt;enumeration value="Natural"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JoinOperator")
@XmlEnum
public enum JoinOperator {

    @XmlEnumValue("Inner")
    INNER("Inner"),
    @XmlEnumValue("LeftOuter")
    LEFT_OUTER("LeftOuter"),
    @XmlEnumValue("Natural")
    NATURAL("Natural");
    private final String value;

    JoinOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JoinOperator fromValue(String v) {
        for (JoinOperator c: JoinOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
