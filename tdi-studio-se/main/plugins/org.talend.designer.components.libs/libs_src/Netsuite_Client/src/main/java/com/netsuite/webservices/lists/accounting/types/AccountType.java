
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_accountsPayable"/&gt;
 *     &lt;enumeration value="_accountsReceivable"/&gt;
 *     &lt;enumeration value="_bank"/&gt;
 *     &lt;enumeration value="_costOfGoodsSold"/&gt;
 *     &lt;enumeration value="_creditCard"/&gt;
 *     &lt;enumeration value="_deferredExpense"/&gt;
 *     &lt;enumeration value="_deferredRevenue"/&gt;
 *     &lt;enumeration value="_equity"/&gt;
 *     &lt;enumeration value="_expense"/&gt;
 *     &lt;enumeration value="_fixedAsset"/&gt;
 *     &lt;enumeration value="_income"/&gt;
 *     &lt;enumeration value="_longTermLiability"/&gt;
 *     &lt;enumeration value="_nonPosting"/&gt;
 *     &lt;enumeration value="_otherAsset"/&gt;
 *     &lt;enumeration value="_otherCurrentAsset"/&gt;
 *     &lt;enumeration value="_otherCurrentLiability"/&gt;
 *     &lt;enumeration value="_otherExpense"/&gt;
 *     &lt;enumeration value="_otherIncome"/&gt;
 *     &lt;enumeration value="_statistical"/&gt;
 *     &lt;enumeration value="_unbilledReceivable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum AccountType {

    @XmlEnumValue("_accountsPayable")
    ACCOUNTS_PAYABLE("_accountsPayable"),
    @XmlEnumValue("_accountsReceivable")
    ACCOUNTS_RECEIVABLE("_accountsReceivable"),
    @XmlEnumValue("_bank")
    BANK("_bank"),
    @XmlEnumValue("_costOfGoodsSold")
    COST_OF_GOODS_SOLD("_costOfGoodsSold"),
    @XmlEnumValue("_creditCard")
    CREDIT_CARD("_creditCard"),
    @XmlEnumValue("_deferredExpense")
    DEFERRED_EXPENSE("_deferredExpense"),
    @XmlEnumValue("_deferredRevenue")
    DEFERRED_REVENUE("_deferredRevenue"),
    @XmlEnumValue("_equity")
    EQUITY("_equity"),
    @XmlEnumValue("_expense")
    EXPENSE("_expense"),
    @XmlEnumValue("_fixedAsset")
    FIXED_ASSET("_fixedAsset"),
    @XmlEnumValue("_income")
    INCOME("_income"),
    @XmlEnumValue("_longTermLiability")
    LONG_TERM_LIABILITY("_longTermLiability"),
    @XmlEnumValue("_nonPosting")
    NON_POSTING("_nonPosting"),
    @XmlEnumValue("_otherAsset")
    OTHER_ASSET("_otherAsset"),
    @XmlEnumValue("_otherCurrentAsset")
    OTHER_CURRENT_ASSET("_otherCurrentAsset"),
    @XmlEnumValue("_otherCurrentLiability")
    OTHER_CURRENT_LIABILITY("_otherCurrentLiability"),
    @XmlEnumValue("_otherExpense")
    OTHER_EXPENSE("_otherExpense"),
    @XmlEnumValue("_otherIncome")
    OTHER_INCOME("_otherIncome"),
    @XmlEnumValue("_statistical")
    STATISTICAL("_statistical"),
    @XmlEnumValue("_unbilledReceivable")
    UNBILLED_RECEIVABLE("_unbilledReceivable");
    private final String value;

    AccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountType fromValue(String v) {
        for (AccountType c: AccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
