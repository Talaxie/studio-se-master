
package com.netsuite.webservices.transactions.purchases.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionBillVarianceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionBillVarianceStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_journalNotPosted"/&gt;
 *     &lt;enumeration value="_journalPosted"/&gt;
 *     &lt;enumeration value="_noVariances"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionBillVarianceStatus", namespace = "urn:types.purchases_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionBillVarianceStatus {

    @XmlEnumValue("_journalNotPosted")
    JOURNAL_NOT_POSTED("_journalNotPosted"),
    @XmlEnumValue("_journalPosted")
    JOURNAL_POSTED("_journalPosted"),
    @XmlEnumValue("_noVariances")
    NO_VARIANCES("_noVariances");
    private final String value;

    TransactionBillVarianceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionBillVarianceStatus fromValue(String v) {
        for (TransactionBillVarianceStatus c: TransactionBillVarianceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
