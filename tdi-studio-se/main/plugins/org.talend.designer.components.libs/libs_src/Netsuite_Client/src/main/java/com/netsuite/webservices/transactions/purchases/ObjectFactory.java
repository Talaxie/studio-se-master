
package com.netsuite.webservices.transactions.purchases;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.purchases package. 
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

    private final static QName _VendorBill_QNAME = new QName("urn:purchases_2014_2.transactions.webservices.netsuite.com", "VendorBill");
    private final static QName _PurchaseOrder_QNAME = new QName("urn:purchases_2014_2.transactions.webservices.netsuite.com", "PurchaseOrder");
    private final static QName _ItemReceipt_QNAME = new QName("urn:purchases_2014_2.transactions.webservices.netsuite.com", "ItemReceipt");
    private final static QName _VendorPayment_QNAME = new QName("urn:purchases_2014_2.transactions.webservices.netsuite.com", "vendorPayment");
    private final static QName _VendorCredit_QNAME = new QName("urn:purchases_2014_2.transactions.webservices.netsuite.com", "vendorCredit");
    private final static QName _VendorReturnAuthorization_QNAME = new QName("urn:purchases_2014_2.transactions.webservices.netsuite.com", "vendorReturnAuthorization");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.purchases
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VendorBill }
     * 
     */
    public VendorBill createVendorBill() {
        return new VendorBill();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link ItemReceipt }
     * 
     */
    public ItemReceipt createItemReceipt() {
        return new ItemReceipt();
    }

    /**
     * Create an instance of {@link VendorPayment }
     * 
     */
    public VendorPayment createVendorPayment() {
        return new VendorPayment();
    }

    /**
     * Create an instance of {@link VendorCredit }
     * 
     */
    public VendorCredit createVendorCredit() {
        return new VendorCredit();
    }

    /**
     * Create an instance of {@link VendorReturnAuthorization }
     * 
     */
    public VendorReturnAuthorization createVendorReturnAuthorization() {
        return new VendorReturnAuthorization();
    }

    /**
     * Create an instance of {@link PurchLandedCostList }
     * 
     */
    public PurchLandedCostList createPurchLandedCostList() {
        return new PurchLandedCostList();
    }

    /**
     * Create an instance of {@link VendorBillExpense }
     * 
     */
    public VendorBillExpense createVendorBillExpense() {
        return new VendorBillExpense();
    }

    /**
     * Create an instance of {@link VendorBillExpenseList }
     * 
     */
    public VendorBillExpenseList createVendorBillExpenseList() {
        return new VendorBillExpenseList();
    }

    /**
     * Create an instance of {@link VendorBillItem }
     * 
     */
    public VendorBillItem createVendorBillItem() {
        return new VendorBillItem();
    }

    /**
     * Create an instance of {@link VendorBillItemList }
     * 
     */
    public VendorBillItemList createVendorBillItemList() {
        return new VendorBillItemList();
    }

    /**
     * Create an instance of {@link PurchaseOrderExpense }
     * 
     */
    public PurchaseOrderExpense createPurchaseOrderExpense() {
        return new PurchaseOrderExpense();
    }

    /**
     * Create an instance of {@link PurchaseOrderExpenseList }
     * 
     */
    public PurchaseOrderExpenseList createPurchaseOrderExpenseList() {
        return new PurchaseOrderExpenseList();
    }

    /**
     * Create an instance of {@link PurchaseOrderItem }
     * 
     */
    public PurchaseOrderItem createPurchaseOrderItem() {
        return new PurchaseOrderItem();
    }

    /**
     * Create an instance of {@link PurchaseOrderItemList }
     * 
     */
    public PurchaseOrderItemList createPurchaseOrderItemList() {
        return new PurchaseOrderItemList();
    }

    /**
     * Create an instance of {@link ItemReceiptItem }
     * 
     */
    public ItemReceiptItem createItemReceiptItem() {
        return new ItemReceiptItem();
    }

    /**
     * Create an instance of {@link ItemReceiptItemList }
     * 
     */
    public ItemReceiptItemList createItemReceiptItemList() {
        return new ItemReceiptItemList();
    }

    /**
     * Create an instance of {@link ItemReceiptExpense }
     * 
     */
    public ItemReceiptExpense createItemReceiptExpense() {
        return new ItemReceiptExpense();
    }

    /**
     * Create an instance of {@link ItemReceiptExpenseList }
     * 
     */
    public ItemReceiptExpenseList createItemReceiptExpenseList() {
        return new ItemReceiptExpenseList();
    }

    /**
     * Create an instance of {@link VendorPaymentApply }
     * 
     */
    public VendorPaymentApply createVendorPaymentApply() {
        return new VendorPaymentApply();
    }

    /**
     * Create an instance of {@link VendorPaymentApplyList }
     * 
     */
    public VendorPaymentApplyList createVendorPaymentApplyList() {
        return new VendorPaymentApplyList();
    }

    /**
     * Create an instance of {@link VendorPaymentCredit }
     * 
     */
    public VendorPaymentCredit createVendorPaymentCredit() {
        return new VendorPaymentCredit();
    }

    /**
     * Create an instance of {@link VendorPaymentCreditList }
     * 
     */
    public VendorPaymentCreditList createVendorPaymentCreditList() {
        return new VendorPaymentCreditList();
    }

    /**
     * Create an instance of {@link VendorCreditExpense }
     * 
     */
    public VendorCreditExpense createVendorCreditExpense() {
        return new VendorCreditExpense();
    }

    /**
     * Create an instance of {@link VendorCreditExpenseList }
     * 
     */
    public VendorCreditExpenseList createVendorCreditExpenseList() {
        return new VendorCreditExpenseList();
    }

    /**
     * Create an instance of {@link VendorCreditItem }
     * 
     */
    public VendorCreditItem createVendorCreditItem() {
        return new VendorCreditItem();
    }

    /**
     * Create an instance of {@link VendorCreditItemList }
     * 
     */
    public VendorCreditItemList createVendorCreditItemList() {
        return new VendorCreditItemList();
    }

    /**
     * Create an instance of {@link VendorCreditApply }
     * 
     */
    public VendorCreditApply createVendorCreditApply() {
        return new VendorCreditApply();
    }

    /**
     * Create an instance of {@link VendorCreditApplyList }
     * 
     */
    public VendorCreditApplyList createVendorCreditApplyList() {
        return new VendorCreditApplyList();
    }

    /**
     * Create an instance of {@link VendorReturnAuthorizationExpense }
     * 
     */
    public VendorReturnAuthorizationExpense createVendorReturnAuthorizationExpense() {
        return new VendorReturnAuthorizationExpense();
    }

    /**
     * Create an instance of {@link VendorReturnAuthorizationExpenseList }
     * 
     */
    public VendorReturnAuthorizationExpenseList createVendorReturnAuthorizationExpenseList() {
        return new VendorReturnAuthorizationExpenseList();
    }

    /**
     * Create an instance of {@link VendorReturnAuthorizationItem }
     * 
     */
    public VendorReturnAuthorizationItem createVendorReturnAuthorizationItem() {
        return new VendorReturnAuthorizationItem();
    }

    /**
     * Create an instance of {@link VendorReturnAuthorizationItemList }
     * 
     */
    public VendorReturnAuthorizationItemList createVendorReturnAuthorizationItemList() {
        return new VendorReturnAuthorizationItemList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2014_2.transactions.webservices.netsuite.com", name = "VendorBill")
    public JAXBElement<VendorBill> createVendorBill(VendorBill value) {
        return new JAXBElement<VendorBill>(_VendorBill_QNAME, VendorBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2014_2.transactions.webservices.netsuite.com", name = "PurchaseOrder")
    public JAXBElement<PurchaseOrder> createPurchaseOrder(PurchaseOrder value) {
        return new JAXBElement<PurchaseOrder>(_PurchaseOrder_QNAME, PurchaseOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2014_2.transactions.webservices.netsuite.com", name = "ItemReceipt")
    public JAXBElement<ItemReceipt> createItemReceipt(ItemReceipt value) {
        return new JAXBElement<ItemReceipt>(_ItemReceipt_QNAME, ItemReceipt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2014_2.transactions.webservices.netsuite.com", name = "vendorPayment")
    public JAXBElement<VendorPayment> createVendorPayment(VendorPayment value) {
        return new JAXBElement<VendorPayment>(_VendorPayment_QNAME, VendorPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2014_2.transactions.webservices.netsuite.com", name = "vendorCredit")
    public JAXBElement<VendorCredit> createVendorCredit(VendorCredit value) {
        return new JAXBElement<VendorCredit>(_VendorCredit_QNAME, VendorCredit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorReturnAuthorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2014_2.transactions.webservices.netsuite.com", name = "vendorReturnAuthorization")
    public JAXBElement<VendorReturnAuthorization> createVendorReturnAuthorization(VendorReturnAuthorization value) {
        return new JAXBElement<VendorReturnAuthorization>(_VendorReturnAuthorization_QNAME, VendorReturnAuthorization.class, null, value);
    }

}
