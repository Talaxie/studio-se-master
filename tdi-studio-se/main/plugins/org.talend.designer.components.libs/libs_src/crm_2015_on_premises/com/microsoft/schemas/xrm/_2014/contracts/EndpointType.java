
package com.microsoft.schemas.xrm._2014.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndpointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndpointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OrganizationService"/>
 *     &lt;enumeration value="OrganizationDataService"/>
 *     &lt;enumeration value="WebApplication"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndpointType")
@XmlEnum
public enum EndpointType {

    @XmlEnumValue("OrganizationService")
    ORGANIZATION_SERVICE("OrganizationService"),
    @XmlEnumValue("OrganizationDataService")
    ORGANIZATION_DATA_SERVICE("OrganizationDataService"),
    @XmlEnumValue("WebApplication")
    WEB_APPLICATION("WebApplication");
    private final String value;

    EndpointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndpointType fromValue(String v) {
        for (EndpointType c: EndpointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
