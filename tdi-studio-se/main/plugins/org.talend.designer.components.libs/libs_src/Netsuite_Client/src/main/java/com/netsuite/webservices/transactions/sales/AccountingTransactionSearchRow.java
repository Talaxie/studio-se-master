
package com.netsuite.webservices.transactions.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common.AccountingTransactionSearchRowBasic;
import com.netsuite.webservices.platform.common.RevRecScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for AccountingTransactionSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingTransactionSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}AccountingTransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="accountJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="revRecScheduleJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}RevRecScheduleSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingTransactionSearchRow", propOrder = {
    "basic",
    "accountJoin",
    "revRecScheduleJoin",
    "transactionJoin"
})
public class AccountingTransactionSearchRow
    extends SearchRow
{

    protected AccountingTransactionSearchRowBasic basic;
    protected AccountSearchRowBasic accountJoin;
    protected RevRecScheduleSearchRowBasic revRecScheduleJoin;
    protected TransactionSearchRowBasic transactionJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSearchRowBasic }
     *     
     */
    public AccountingTransactionSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSearchRowBasic }
     *     
     */
    public void setBasic(AccountingTransactionSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the accountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * Sets the value of the accountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAccountJoin(AccountSearchRowBasic value) {
        this.accountJoin = value;
    }

    /**
     * Gets the value of the revRecScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchRowBasic }
     *     
     */
    public RevRecScheduleSearchRowBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }

    /**
     * Sets the value of the revRecScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchRowBasic }
     *     
     */
    public void setRevRecScheduleJoin(RevRecScheduleSearchRowBasic value) {
        this.revRecScheduleJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

}
