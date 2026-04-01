
package com.netsuite.webservices.lists.support.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportCaseStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportCaseStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_closed"/&gt;
 *     &lt;enumeration value="_escalated"/&gt;
 *     &lt;enumeration value="_open"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupportCaseStage", namespace = "urn:types.support_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum SupportCaseStage {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_escalated")
    ESCALATED("_escalated"),
    @XmlEnumValue("_open")
    OPEN("_open");
    private final String value;

    SupportCaseStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportCaseStage fromValue(String v) {
        for (SupportCaseStage c: SupportCaseStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
