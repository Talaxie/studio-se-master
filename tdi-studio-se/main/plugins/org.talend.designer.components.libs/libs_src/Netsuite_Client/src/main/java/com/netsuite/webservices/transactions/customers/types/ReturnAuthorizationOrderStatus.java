
package com.netsuite.webservices.transactions.customers.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnAuthorizationOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnAuthorizationOrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_pendingApproval"/&gt;
 *     &lt;enumeration value="_pendingReceipt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnAuthorizationOrderStatus", namespace = "urn:types.customers_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ReturnAuthorizationOrderStatus {

    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_pendingReceipt")
    PENDING_RECEIPT("_pendingReceipt");
    private final String value;

    ReturnAuthorizationOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnAuthorizationOrderStatus fromValue(String v) {
        for (ReturnAuthorizationOrderStatus c: ReturnAuthorizationOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
