
package com.netsuite.webservices.transactions.inventory.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferOrderOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferOrderOrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_pendingApproval"/&gt;
 *     &lt;enumeration value="_pendingFulfillment"/&gt;
 *     &lt;enumeration value="_rejected"/&gt;
 *     &lt;enumeration value="_partiallyFulfilled"/&gt;
 *     &lt;enumeration value="_pendingReceiptPartFulfilled"/&gt;
 *     &lt;enumeration value="_pendingReceipt"/&gt;
 *     &lt;enumeration value="_received"/&gt;
 *     &lt;enumeration value="_closed"/&gt;
 *     &lt;enumeration value="_undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferOrderOrderStatus", namespace = "urn:types.inventory_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransferOrderOrderStatus {

    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_pendingFulfillment")
    PENDING_FULFILLMENT("_pendingFulfillment"),
    @XmlEnumValue("_rejected")
    REJECTED("_rejected"),
    @XmlEnumValue("_partiallyFulfilled")
    PARTIALLY_FULFILLED("_partiallyFulfilled"),
    @XmlEnumValue("_pendingReceiptPartFulfilled")
    PENDING_RECEIPT_PART_FULFILLED("_pendingReceiptPartFulfilled"),
    @XmlEnumValue("_pendingReceipt")
    PENDING_RECEIPT("_pendingReceipt"),
    @XmlEnumValue("_received")
    RECEIVED("_received"),
    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_undefined")
    UNDEFINED("_undefined");
    private final String value;

    TransferOrderOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferOrderOrderStatus fromValue(String v) {
        for (TransferOrderOrderStatus c: TransferOrderOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
