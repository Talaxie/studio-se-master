
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingTransactionRevCommitStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingTransactionRevCommitStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_committed"/&gt;
 *     &lt;enumeration value="_partiallyCommitted"/&gt;
 *     &lt;enumeration value="_pendingCommitment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountingTransactionRevCommitStatus", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum AccountingTransactionRevCommitStatus {

    @XmlEnumValue("_committed")
    COMMITTED("_committed"),
    @XmlEnumValue("_partiallyCommitted")
    PARTIALLY_COMMITTED("_partiallyCommitted"),
    @XmlEnumValue("_pendingCommitment")
    PENDING_COMMITMENT("_pendingCommitment");
    private final String value;

    AccountingTransactionRevCommitStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingTransactionRevCommitStatus fromValue(String v) {
        for (AccountingTransactionRevCommitStatus c: AccountingTransactionRevCommitStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
