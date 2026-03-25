
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingBookStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingBookStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_active"/&gt;
 *     &lt;enumeration value="_inactive"/&gt;
 *     &lt;enumeration value="_pending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountingBookStatus", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum AccountingBookStatus {

    @XmlEnumValue("_active")
    ACTIVE("_active"),
    @XmlEnumValue("_inactive")
    INACTIVE("_inactive"),
    @XmlEnumValue("_pending")
    PENDING("_pending");
    private final String value;

    AccountingBookStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingBookStatus fromValue(String v) {
        for (AccountingBookStatus c: AccountingBookStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
