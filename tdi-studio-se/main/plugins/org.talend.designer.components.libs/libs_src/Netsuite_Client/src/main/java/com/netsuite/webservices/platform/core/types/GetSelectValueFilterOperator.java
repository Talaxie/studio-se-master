
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSelectValueFilterOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetSelectValueFilterOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="contains"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="startsWith"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetSelectValueFilterOperator", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum GetSelectValueFilterOperator {

    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("startsWith")
    STARTS_WITH("startsWith");
    private final String value;

    GetSelectValueFilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetSelectValueFilterOperator fromValue(String v) {
        for (GetSelectValueFilterOperator c: GetSelectValueFilterOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
