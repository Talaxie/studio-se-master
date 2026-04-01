
package com.netsuite.webservices.platform.faults.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusDetailType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusDetailType", namespace = "urn:types.faults_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum StatusDetailType {

    ERROR,
    WARN,
    INFO;

    public String value() {
        return name();
    }

    public static StatusDetailType fromValue(String v) {
        return valueOf(v);
    }

}
