
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AsyncStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="failed"/&gt;
 *     &lt;enumeration value="finishedWithErrors"/&gt;
 *     &lt;enumeration value="pending"/&gt;
 *     &lt;enumeration value="processing"/&gt;
 *     &lt;enumeration value="finished"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AsyncStatusType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum AsyncStatusType {

    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("finishedWithErrors")
    FINISHED_WITH_ERRORS("finishedWithErrors"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("processing")
    PROCESSING("processing"),
    @XmlEnumValue("finished")
    FINISHED("finished");
    private final String value;

    AsyncStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AsyncStatusType fromValue(String v) {
        for (AsyncStatusType c: AsyncStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
