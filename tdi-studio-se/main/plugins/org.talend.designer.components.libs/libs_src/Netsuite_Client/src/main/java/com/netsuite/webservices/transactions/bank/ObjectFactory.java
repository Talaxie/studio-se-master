
package com.netsuite.webservices.transactions.bank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.bank package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Check_QNAME = new QName("urn:bank_2014_2.transactions.webservices.netsuite.com", "Check");
    private final static QName _Deposit_QNAME = new QName("urn:bank_2014_2.transactions.webservices.netsuite.com", "deposit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.bank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link CheckLandedCostList }
     * 
     */
    public CheckLandedCostList createCheckLandedCostList() {
        return new CheckLandedCostList();
    }

    /**
     * Create an instance of {@link CheckExpense }
     * 
     */
    public CheckExpense createCheckExpense() {
        return new CheckExpense();
    }

    /**
     * Create an instance of {@link CheckExpenseList }
     * 
     */
    public CheckExpenseList createCheckExpenseList() {
        return new CheckExpenseList();
    }

    /**
     * Create an instance of {@link CheckItem }
     * 
     */
    public CheckItem createCheckItem() {
        return new CheckItem();
    }

    /**
     * Create an instance of {@link CheckItemList }
     * 
     */
    public CheckItemList createCheckItemList() {
        return new CheckItemList();
    }

    /**
     * Create an instance of {@link DepositPayment }
     * 
     */
    public DepositPayment createDepositPayment() {
        return new DepositPayment();
    }

    /**
     * Create an instance of {@link DepositPaymentList }
     * 
     */
    public DepositPaymentList createDepositPaymentList() {
        return new DepositPaymentList();
    }

    /**
     * Create an instance of {@link DepositCashBack }
     * 
     */
    public DepositCashBack createDepositCashBack() {
        return new DepositCashBack();
    }

    /**
     * Create an instance of {@link DepositCashBackList }
     * 
     */
    public DepositCashBackList createDepositCashBackList() {
        return new DepositCashBackList();
    }

    /**
     * Create an instance of {@link DepositOther }
     * 
     */
    public DepositOther createDepositOther() {
        return new DepositOther();
    }

    /**
     * Create an instance of {@link DepositOtherList }
     * 
     */
    public DepositOtherList createDepositOtherList() {
        return new DepositOtherList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Check }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:bank_2014_2.transactions.webservices.netsuite.com", name = "Check")
    public JAXBElement<Check> createCheck(Check value) {
        return new JAXBElement<Check>(_Check_QNAME, Check.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:bank_2014_2.transactions.webservices.netsuite.com", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

}
