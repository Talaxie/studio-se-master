
package com.netsuite.webservices.general.communication.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageMessageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_email"/&gt;
 *     &lt;enumeration value="_emailedReport"/&gt;
 *     &lt;enumeration value="_fax"/&gt;
 *     &lt;enumeration value="_pdf"/&gt;
 *     &lt;enumeration value="_print"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageMessageType", namespace = "urn:types.communication_2014_2.general.webservices.netsuite.com")
@XmlEnum
public enum MessageMessageType {

    @XmlEnumValue("_email")
    EMAIL("_email"),
    @XmlEnumValue("_emailedReport")
    EMAILED_REPORT("_emailedReport"),
    @XmlEnumValue("_fax")
    FAX("_fax"),
    @XmlEnumValue("_pdf")
    PDF("_pdf"),
    @XmlEnumValue("_print")
    PRINT("_print");
    private final String value;

    MessageMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageMessageType fromValue(String v) {
        for (MessageMessageType c: MessageMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
