
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPaymentEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_authorizationRequest"/&gt;
 *     &lt;enumeration value="_captureRequest"/&gt;
 *     &lt;enumeration value="_creditRequest"/&gt;
 *     &lt;enumeration value="_overrideHold"/&gt;
 *     &lt;enumeration value="_refundRequest"/&gt;
 *     &lt;enumeration value="_saleRequest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventType", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventType {

    @XmlEnumValue("_authorizationRequest")
    AUTHORIZATION_REQUEST("_authorizationRequest"),
    @XmlEnumValue("_captureRequest")
    CAPTURE_REQUEST("_captureRequest"),
    @XmlEnumValue("_creditRequest")
    CREDIT_REQUEST("_creditRequest"),
    @XmlEnumValue("_overrideHold")
    OVERRIDE_HOLD("_overrideHold"),
    @XmlEnumValue("_refundRequest")
    REFUND_REQUEST("_refundRequest"),
    @XmlEnumValue("_saleRequest")
    SALE_REQUEST("_saleRequest");
    private final String value;

    TransactionPaymentEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventType fromValue(String v) {
        for (TransactionPaymentEventType c: TransactionPaymentEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
