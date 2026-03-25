
package com.netsuite.webservices.transactions.purchases.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorReturnAuthorizationOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VendorReturnAuthorizationOrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_cancelled"/&gt;
 *     &lt;enumeration value="_closed"/&gt;
 *     &lt;enumeration value="_credited"/&gt;
 *     &lt;enumeration value="_partiallyReturned"/&gt;
 *     &lt;enumeration value="_pendingApproval"/&gt;
 *     &lt;enumeration value="_pendingCredit"/&gt;
 *     &lt;enumeration value="_pendingCreditPartiallyReturned"/&gt;
 *     &lt;enumeration value="_pendingReturn"/&gt;
 *     &lt;enumeration value="_undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VendorReturnAuthorizationOrderStatus", namespace = "urn:types.purchases_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum VendorReturnAuthorizationOrderStatus {

    @XmlEnumValue("_cancelled")
    CANCELLED("_cancelled"),
    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_credited")
    CREDITED("_credited"),
    @XmlEnumValue("_partiallyReturned")
    PARTIALLY_RETURNED("_partiallyReturned"),
    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_pendingCredit")
    PENDING_CREDIT("_pendingCredit"),
    @XmlEnumValue("_pendingCreditPartiallyReturned")
    PENDING_CREDIT_PARTIALLY_RETURNED("_pendingCreditPartiallyReturned"),
    @XmlEnumValue("_pendingReturn")
    PENDING_RETURN("_pendingReturn"),
    @XmlEnumValue("_undefined")
    UNDEFINED("_undefined");
    private final String value;

    VendorReturnAuthorizationOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VendorReturnAuthorizationOrderStatus fromValue(String v) {
        for (VendorReturnAuthorizationOrderStatus c: VendorReturnAuthorizationOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
