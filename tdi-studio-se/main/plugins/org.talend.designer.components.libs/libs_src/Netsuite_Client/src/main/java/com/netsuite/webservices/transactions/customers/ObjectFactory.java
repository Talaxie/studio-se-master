
package com.netsuite.webservices.transactions.customers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.customers package. 
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

    private final static QName _CashRefund_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "CashRefund");
    private final static QName _CustomerPayment_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "CustomerPayment");
    private final static QName _ReturnAuthorization_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "ReturnAuthorization");
    private final static QName _CreditMemo_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "CreditMemo");
    private final static QName _CustomerRefund_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "CustomerRefund");
    private final static QName _CustomerDeposit_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "CustomerDeposit");
    private final static QName _DepositApplication_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "DepositApplication");
    private final static QName _Charge_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "charge");
    private final static QName _ChargeSearch_QNAME = new QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "chargeSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.customers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CashRefund }
     * 
     */
    public CashRefund createCashRefund() {
        return new CashRefund();
    }

    /**
     * Create an instance of {@link CustomerPayment }
     * 
     */
    public CustomerPayment createCustomerPayment() {
        return new CustomerPayment();
    }

    /**
     * Create an instance of {@link ReturnAuthorization }
     * 
     */
    public ReturnAuthorization createReturnAuthorization() {
        return new ReturnAuthorization();
    }

    /**
     * Create an instance of {@link CreditMemo }
     * 
     */
    public CreditMemo createCreditMemo() {
        return new CreditMemo();
    }

    /**
     * Create an instance of {@link CustomerRefund }
     * 
     */
    public CustomerRefund createCustomerRefund() {
        return new CustomerRefund();
    }

    /**
     * Create an instance of {@link CustomerDeposit }
     * 
     */
    public CustomerDeposit createCustomerDeposit() {
        return new CustomerDeposit();
    }

    /**
     * Create an instance of {@link DepositApplication }
     * 
     */
    public DepositApplication createDepositApplication() {
        return new DepositApplication();
    }

    /**
     * Create an instance of {@link Charge }
     * 
     */
    public Charge createCharge() {
        return new Charge();
    }

    /**
     * Create an instance of {@link ChargeSearch }
     * 
     */
    public ChargeSearch createChargeSearch() {
        return new ChargeSearch();
    }

    /**
     * Create an instance of {@link CashRefundItem }
     * 
     */
    public CashRefundItem createCashRefundItem() {
        return new CashRefundItem();
    }

    /**
     * Create an instance of {@link CashRefundItemList }
     * 
     */
    public CashRefundItemList createCashRefundItemList() {
        return new CashRefundItemList();
    }

    /**
     * Create an instance of {@link CashRefundSalesTeam }
     * 
     */
    public CashRefundSalesTeam createCashRefundSalesTeam() {
        return new CashRefundSalesTeam();
    }

    /**
     * Create an instance of {@link CashRefundSalesTeamList }
     * 
     */
    public CashRefundSalesTeamList createCashRefundSalesTeamList() {
        return new CashRefundSalesTeamList();
    }

    /**
     * Create an instance of {@link CashRefundPartnersList }
     * 
     */
    public CashRefundPartnersList createCashRefundPartnersList() {
        return new CashRefundPartnersList();
    }

    /**
     * Create an instance of {@link CustomerPaymentApply }
     * 
     */
    public CustomerPaymentApply createCustomerPaymentApply() {
        return new CustomerPaymentApply();
    }

    /**
     * Create an instance of {@link CustomerPaymentApplyList }
     * 
     */
    public CustomerPaymentApplyList createCustomerPaymentApplyList() {
        return new CustomerPaymentApplyList();
    }

    /**
     * Create an instance of {@link CustomerPaymentCredit }
     * 
     */
    public CustomerPaymentCredit createCustomerPaymentCredit() {
        return new CustomerPaymentCredit();
    }

    /**
     * Create an instance of {@link CustomerPaymentCreditList }
     * 
     */
    public CustomerPaymentCreditList createCustomerPaymentCreditList() {
        return new CustomerPaymentCreditList();
    }

    /**
     * Create an instance of {@link CustomerPaymentDeposit }
     * 
     */
    public CustomerPaymentDeposit createCustomerPaymentDeposit() {
        return new CustomerPaymentDeposit();
    }

    /**
     * Create an instance of {@link CustomerPaymentDepositList }
     * 
     */
    public CustomerPaymentDepositList createCustomerPaymentDepositList() {
        return new CustomerPaymentDepositList();
    }

    /**
     * Create an instance of {@link ReturnAuthorizationItem }
     * 
     */
    public ReturnAuthorizationItem createReturnAuthorizationItem() {
        return new ReturnAuthorizationItem();
    }

    /**
     * Create an instance of {@link ReturnAuthorizationItemList }
     * 
     */
    public ReturnAuthorizationItemList createReturnAuthorizationItemList() {
        return new ReturnAuthorizationItemList();
    }

    /**
     * Create an instance of {@link ReturnAuthorizationSalesTeam }
     * 
     */
    public ReturnAuthorizationSalesTeam createReturnAuthorizationSalesTeam() {
        return new ReturnAuthorizationSalesTeam();
    }

    /**
     * Create an instance of {@link ReturnAuthorizationSalesTeamList }
     * 
     */
    public ReturnAuthorizationSalesTeamList createReturnAuthorizationSalesTeamList() {
        return new ReturnAuthorizationSalesTeamList();
    }

    /**
     * Create an instance of {@link ReturnAuthorizationPartnersList }
     * 
     */
    public ReturnAuthorizationPartnersList createReturnAuthorizationPartnersList() {
        return new ReturnAuthorizationPartnersList();
    }

    /**
     * Create an instance of {@link CreditMemoSalesTeam }
     * 
     */
    public CreditMemoSalesTeam createCreditMemoSalesTeam() {
        return new CreditMemoSalesTeam();
    }

    /**
     * Create an instance of {@link CreditMemoSalesTeamList }
     * 
     */
    public CreditMemoSalesTeamList createCreditMemoSalesTeamList() {
        return new CreditMemoSalesTeamList();
    }

    /**
     * Create an instance of {@link CreditMemoItem }
     * 
     */
    public CreditMemoItem createCreditMemoItem() {
        return new CreditMemoItem();
    }

    /**
     * Create an instance of {@link CreditMemoItemList }
     * 
     */
    public CreditMemoItemList createCreditMemoItemList() {
        return new CreditMemoItemList();
    }

    /**
     * Create an instance of {@link CreditMemoApply }
     * 
     */
    public CreditMemoApply createCreditMemoApply() {
        return new CreditMemoApply();
    }

    /**
     * Create an instance of {@link CreditMemoApplyList }
     * 
     */
    public CreditMemoApplyList createCreditMemoApplyList() {
        return new CreditMemoApplyList();
    }

    /**
     * Create an instance of {@link CreditMemoPartnersList }
     * 
     */
    public CreditMemoPartnersList createCreditMemoPartnersList() {
        return new CreditMemoPartnersList();
    }

    /**
     * Create an instance of {@link CustomerRefundApply }
     * 
     */
    public CustomerRefundApply createCustomerRefundApply() {
        return new CustomerRefundApply();
    }

    /**
     * Create an instance of {@link CustomerRefundApplyList }
     * 
     */
    public CustomerRefundApplyList createCustomerRefundApplyList() {
        return new CustomerRefundApplyList();
    }

    /**
     * Create an instance of {@link CustomerRefundDeposit }
     * 
     */
    public CustomerRefundDeposit createCustomerRefundDeposit() {
        return new CustomerRefundDeposit();
    }

    /**
     * Create an instance of {@link CustomerRefundDepositList }
     * 
     */
    public CustomerRefundDepositList createCustomerRefundDepositList() {
        return new CustomerRefundDepositList();
    }

    /**
     * Create an instance of {@link CustomerDepositApply }
     * 
     */
    public CustomerDepositApply createCustomerDepositApply() {
        return new CustomerDepositApply();
    }

    /**
     * Create an instance of {@link CustomerDepositApplyList }
     * 
     */
    public CustomerDepositApplyList createCustomerDepositApplyList() {
        return new CustomerDepositApplyList();
    }

    /**
     * Create an instance of {@link DepositApplicationApply }
     * 
     */
    public DepositApplicationApply createDepositApplicationApply() {
        return new DepositApplicationApply();
    }

    /**
     * Create an instance of {@link DepositApplicationApplyList }
     * 
     */
    public DepositApplicationApplyList createDepositApplicationApplyList() {
        return new DepositApplicationApplyList();
    }

    /**
     * Create an instance of {@link ChargeSearchAdvanced }
     * 
     */
    public ChargeSearchAdvanced createChargeSearchAdvanced() {
        return new ChargeSearchAdvanced();
    }

    /**
     * Create an instance of {@link ChargeSearchRow }
     * 
     */
    public ChargeSearchRow createChargeSearchRow() {
        return new ChargeSearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashRefund }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "CashRefund")
    public JAXBElement<CashRefund> createCashRefund(CashRefund value) {
        return new JAXBElement<CashRefund>(_CashRefund_QNAME, CashRefund.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "CustomerPayment")
    public JAXBElement<CustomerPayment> createCustomerPayment(CustomerPayment value) {
        return new JAXBElement<CustomerPayment>(_CustomerPayment_QNAME, CustomerPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAuthorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "ReturnAuthorization")
    public JAXBElement<ReturnAuthorization> createReturnAuthorization(ReturnAuthorization value) {
        return new JAXBElement<ReturnAuthorization>(_ReturnAuthorization_QNAME, ReturnAuthorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "CreditMemo")
    public JAXBElement<CreditMemo> createCreditMemo(CreditMemo value) {
        return new JAXBElement<CreditMemo>(_CreditMemo_QNAME, CreditMemo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRefund }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "CustomerRefund")
    public JAXBElement<CustomerRefund> createCustomerRefund(CustomerRefund value) {
        return new JAXBElement<CustomerRefund>(_CustomerRefund_QNAME, CustomerRefund.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "CustomerDeposit")
    public JAXBElement<CustomerDeposit> createCustomerDeposit(CustomerDeposit value) {
        return new JAXBElement<CustomerDeposit>(_CustomerDeposit_QNAME, CustomerDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "DepositApplication")
    public JAXBElement<DepositApplication> createDepositApplication(DepositApplication value) {
        return new JAXBElement<DepositApplication>(_DepositApplication_QNAME, DepositApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Charge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "charge")
    public JAXBElement<Charge> createCharge(Charge value) {
        return new JAXBElement<Charge>(_Charge_QNAME, Charge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:customers_2014_2.transactions.webservices.netsuite.com", name = "chargeSearch")
    public JAXBElement<ChargeSearch> createChargeSearch(ChargeSearch value) {
        return new JAXBElement<ChargeSearch>(_ChargeSearch_QNAME, ChargeSearch.class, null, value);
    }

}
