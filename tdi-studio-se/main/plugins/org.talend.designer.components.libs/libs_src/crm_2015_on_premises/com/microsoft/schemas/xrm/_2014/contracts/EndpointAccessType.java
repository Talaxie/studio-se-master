
package com.microsoft.schemas.xrm._2014.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndpointAccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndpointAccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="Intranet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndpointAccessType")
@XmlEnum
public enum EndpointAccessType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),
    @XmlEnumValue("Intranet")
    INTRANET("Intranet");
    private final String value;

    EndpointAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndpointAccessType fromValue(String v) {
        for (EndpointAccessType c: EndpointAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
