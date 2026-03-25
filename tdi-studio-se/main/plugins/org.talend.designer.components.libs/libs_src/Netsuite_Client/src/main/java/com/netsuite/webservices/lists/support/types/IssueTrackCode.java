
package com.netsuite.webservices.lists.support.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssueTrackCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueTrackCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_never"/&gt;
 *     &lt;enumeration value="_onAnyChange"/&gt;
 *     &lt;enumeration value="_whenBaseStatusIsClosed"/&gt;
 *     &lt;enumeration value="_whenBaseStatusIsOnHold"/&gt;
 *     &lt;enumeration value="_whenBaseStatusIsOpen"/&gt;
 *     &lt;enumeration value="_whenBaseStatusIsResolved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IssueTrackCode", namespace = "urn:types.support_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum IssueTrackCode {

    @XmlEnumValue("_never")
    NEVER("_never"),
    @XmlEnumValue("_onAnyChange")
    ON_ANY_CHANGE("_onAnyChange"),
    @XmlEnumValue("_whenBaseStatusIsClosed")
    WHEN_BASE_STATUS_IS_CLOSED("_whenBaseStatusIsClosed"),
    @XmlEnumValue("_whenBaseStatusIsOnHold")
    WHEN_BASE_STATUS_IS_ON_HOLD("_whenBaseStatusIsOnHold"),
    @XmlEnumValue("_whenBaseStatusIsOpen")
    WHEN_BASE_STATUS_IS_OPEN("_whenBaseStatusIsOpen"),
    @XmlEnumValue("_whenBaseStatusIsResolved")
    WHEN_BASE_STATUS_IS_RESOLVED("_whenBaseStatusIsResolved");
    private final String value;

    IssueTrackCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssueTrackCode fromValue(String v) {
        for (IssueTrackCode c: IssueTrackCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
