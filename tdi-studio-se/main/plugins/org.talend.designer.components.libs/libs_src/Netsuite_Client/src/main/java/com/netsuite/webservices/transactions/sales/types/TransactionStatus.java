
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_billCancelled"/&gt;
 *     &lt;enumeration value="_billOpen"/&gt;
 *     &lt;enumeration value="_billPaidInFull"/&gt;
 *     &lt;enumeration value="_billPaymentOnlineBillPayPendingAccountingApproval"/&gt;
 *     &lt;enumeration value="_billPaymentVoided"/&gt;
 *     &lt;enumeration value="_billPendingApproval"/&gt;
 *     &lt;enumeration value="_billRejected"/&gt;
 *     &lt;enumeration value="_cashSaleDeposited"/&gt;
 *     &lt;enumeration value="_cashSaleNotDeposited"/&gt;
 *     &lt;enumeration value="_cashSaleUnapprovedPayment"/&gt;
 *     &lt;enumeration value="_checkOnlineBillPayPendingAccountingApproval"/&gt;
 *     &lt;enumeration value="_checkVoided"/&gt;
 *     &lt;enumeration value="_commissionOverpaid"/&gt;
 *     &lt;enumeration value="_commissionPaidInFull"/&gt;
 *     &lt;enumeration value="_commissionPendingAccountingApproval"/&gt;
 *     &lt;enumeration value="_commissionPendingPayment"/&gt;
 *     &lt;enumeration value="_commissionRejectedByAccounting"/&gt;
 *     &lt;enumeration value="_creditMemoFullyApplied"/&gt;
 *     &lt;enumeration value="_creditMemoOpen"/&gt;
 *     &lt;enumeration value="_customerDepositDeposited"/&gt;
 *     &lt;enumeration value="_customerDepositFullyApplied"/&gt;
 *     &lt;enumeration value="_customerDepositNotDeposited"/&gt;
 *     &lt;enumeration value="_customerRefundVoided"/&gt;
 *     &lt;enumeration value="_estimateClosed"/&gt;
 *     &lt;enumeration value="_estimateExpired"/&gt;
 *     &lt;enumeration value="_estimateOpen"/&gt;
 *     &lt;enumeration value="_estimateProcessed"/&gt;
 *     &lt;enumeration value="_estimateVoided"/&gt;
 *     &lt;enumeration value="_expenseReportApprovedByAccounting"/&gt;
 *     &lt;enumeration value="_expenseReportApprovedOverriddenByAccounting"/&gt;
 *     &lt;enumeration value="_expenseReportInProgress"/&gt;
 *     &lt;enumeration value="_expenseReportPaidInFull"/&gt;
 *     &lt;enumeration value="_expenseReportPendingAccountingApproval"/&gt;
 *     &lt;enumeration value="_expenseReportPendingSupervisorApproval"/&gt;
 *     &lt;enumeration value="_expenseReportRejectedByAccounting"/&gt;
 *     &lt;enumeration value="_expenseReportRejectedBySupervisor"/&gt;
 *     &lt;enumeration value="_expenseReportRejectedOverriddenByAccounting"/&gt;
 *     &lt;enumeration value="_invoiceOpen"/&gt;
 *     &lt;enumeration value="_invoicePaidInFull"/&gt;
 *     &lt;enumeration value="_invoicePendingApproval"/&gt;
 *     &lt;enumeration value="_invoiceRejected"/&gt;
 *     &lt;enumeration value="_itemFulfillmentPacked"/&gt;
 *     &lt;enumeration value="_itemFulfillmentPicked"/&gt;
 *     &lt;enumeration value="_itemFulfillmentShipped"/&gt;
 *     &lt;enumeration value="_journalApprovedForPosting"/&gt;
 *     &lt;enumeration value="_journalPendingApproval"/&gt;
 *     &lt;enumeration value="_opportunityClosedLost"/&gt;
 *     &lt;enumeration value="_opportunityClosedWon"/&gt;
 *     &lt;enumeration value="_opportunityInProgress"/&gt;
 *     &lt;enumeration value="_opportunityIssuedEstimate"/&gt;
 *     &lt;enumeration value="_paycheckCommitted"/&gt;
 *     &lt;enumeration value="_paycheckError"/&gt;
 *     &lt;enumeration value="_paycheckPendingCommitment"/&gt;
 *     &lt;enumeration value="_paycheckPendingTaxCalculation"/&gt;
 *     &lt;enumeration value="_paycheckPreview"/&gt;
 *     &lt;enumeration value="_paycheckReversed"/&gt;
 *     &lt;enumeration value="_paycheckUndefined"/&gt;
 *     &lt;enumeration value="_paymentDeposited"/&gt;
 *     &lt;enumeration value="_paymentNotDeposited"/&gt;
 *     &lt;enumeration value="_paymentUnapprovedPayment"/&gt;
 *     &lt;enumeration value="_payrollLiabilityCheckVoided"/&gt;
 *     &lt;enumeration value="_purchaseOrderClosed"/&gt;
 *     &lt;enumeration value="_purchaseOrderFullyBilled"/&gt;
 *     &lt;enumeration value="_purchaseOrderPartiallyReceived"/&gt;
 *     &lt;enumeration value="_purchaseOrderPendingBill"/&gt;
 *     &lt;enumeration value="_purchaseOrderPendingBillingPartiallyReceived"/&gt;
 *     &lt;enumeration value="_purchaseOrderPendingReceipt"/&gt;
 *     &lt;enumeration value="_purchaseOrderPendingSupervisorApproval"/&gt;
 *     &lt;enumeration value="_purchaseOrderRejectedBySupervisor"/&gt;
 *     &lt;enumeration value="_returnAuthorizationCancelled"/&gt;
 *     &lt;enumeration value="_returnAuthorizationClosed"/&gt;
 *     &lt;enumeration value="_returnAuthorizationPartiallyReceived"/&gt;
 *     &lt;enumeration value="_returnAuthorizationPendingApproval"/&gt;
 *     &lt;enumeration value="_returnAuthorizationPendingReceipt"/&gt;
 *     &lt;enumeration value="_returnAuthorizationPendingRefund"/&gt;
 *     &lt;enumeration value="_returnAuthorizationPendingRefundPartiallyReceived"/&gt;
 *     &lt;enumeration value="_returnAuthorizationRefunded"/&gt;
 *     &lt;enumeration value="_salesOrderBilled"/&gt;
 *     &lt;enumeration value="_salesOrderCancelled"/&gt;
 *     &lt;enumeration value="_salesOrderClosed"/&gt;
 *     &lt;enumeration value="_salesOrderPartiallyFulfilled"/&gt;
 *     &lt;enumeration value="_salesOrderPendingApproval"/&gt;
 *     &lt;enumeration value="_salesOrderPendingBilling"/&gt;
 *     &lt;enumeration value="_salesOrderPendingBillingPartiallyFulfilled"/&gt;
 *     &lt;enumeration value="_salesOrderPendingFulfillment"/&gt;
 *     &lt;enumeration value="_salesTaxPaymentOnlineBillPayPendingAccountingApproval"/&gt;
 *     &lt;enumeration value="_salesTaxPaymentVoided"/&gt;
 *     &lt;enumeration value="_statementChargeOpen"/&gt;
 *     &lt;enumeration value="_statementChargePaidInFull"/&gt;
 *     &lt;enumeration value="_taxLiabilityChequeVoided"/&gt;
 *     &lt;enumeration value="_tegataPayableEndorsed"/&gt;
 *     &lt;enumeration value="_tegataPayableIssued"/&gt;
 *     &lt;enumeration value="_tegataPayablePaid"/&gt;
 *     &lt;enumeration value="_tegataReceivablesCollected"/&gt;
 *     &lt;enumeration value="_tegataReceivablesDiscounted"/&gt;
 *     &lt;enumeration value="_tegataReceivablesEndorsed"/&gt;
 *     &lt;enumeration value="_tegataReceivablesHolding"/&gt;
 *     &lt;enumeration value="_transferOrderClosed"/&gt;
 *     &lt;enumeration value="_transferOrderPartiallyFulfilled"/&gt;
 *     &lt;enumeration value="_transferOrderPendingApproval"/&gt;
 *     &lt;enumeration value="_transferOrderPendingFulfillment"/&gt;
 *     &lt;enumeration value="_transferOrderPendingReceipt"/&gt;
 *     &lt;enumeration value="_transferOrderPendingReceiptPartiallyFulfilled"/&gt;
 *     &lt;enumeration value="_transferOrderReceived"/&gt;
 *     &lt;enumeration value="_transferOrderRejected"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationCancelled"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationClosed"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationCredited"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationPartiallyReturned"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingApproval"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingCredit"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingCreditPartiallyReturned"/&gt;
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingReturn"/&gt;
 *     &lt;enumeration value="_workOrderBuilt"/&gt;
 *     &lt;enumeration value="_workOrderCancelled"/&gt;
 *     &lt;enumeration value="_workOrderClosed"/&gt;
 *     &lt;enumeration value="_workOrderPartiallyBuilt"/&gt;
 *     &lt;enumeration value="_workOrderPendingBuild"/&gt;
 *     &lt;enumeration value="_workOrderPlanned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionStatus", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionStatus {

    @XmlEnumValue("_billCancelled")
    BILL_CANCELLED("_billCancelled"),
    @XmlEnumValue("_billOpen")
    BILL_OPEN("_billOpen"),
    @XmlEnumValue("_billPaidInFull")
    BILL_PAID_IN_FULL("_billPaidInFull"),
    @XmlEnumValue("_billPaymentOnlineBillPayPendingAccountingApproval")
    BILL_PAYMENT_ONLINE_BILL_PAY_PENDING_ACCOUNTING_APPROVAL("_billPaymentOnlineBillPayPendingAccountingApproval"),
    @XmlEnumValue("_billPaymentVoided")
    BILL_PAYMENT_VOIDED("_billPaymentVoided"),
    @XmlEnumValue("_billPendingApproval")
    BILL_PENDING_APPROVAL("_billPendingApproval"),
    @XmlEnumValue("_billRejected")
    BILL_REJECTED("_billRejected"),
    @XmlEnumValue("_cashSaleDeposited")
    CASH_SALE_DEPOSITED("_cashSaleDeposited"),
    @XmlEnumValue("_cashSaleNotDeposited")
    CASH_SALE_NOT_DEPOSITED("_cashSaleNotDeposited"),
    @XmlEnumValue("_cashSaleUnapprovedPayment")
    CASH_SALE_UNAPPROVED_PAYMENT("_cashSaleUnapprovedPayment"),
    @XmlEnumValue("_checkOnlineBillPayPendingAccountingApproval")
    CHECK_ONLINE_BILL_PAY_PENDING_ACCOUNTING_APPROVAL("_checkOnlineBillPayPendingAccountingApproval"),
    @XmlEnumValue("_checkVoided")
    CHECK_VOIDED("_checkVoided"),
    @XmlEnumValue("_commissionOverpaid")
    COMMISSION_OVERPAID("_commissionOverpaid"),
    @XmlEnumValue("_commissionPaidInFull")
    COMMISSION_PAID_IN_FULL("_commissionPaidInFull"),
    @XmlEnumValue("_commissionPendingAccountingApproval")
    COMMISSION_PENDING_ACCOUNTING_APPROVAL("_commissionPendingAccountingApproval"),
    @XmlEnumValue("_commissionPendingPayment")
    COMMISSION_PENDING_PAYMENT("_commissionPendingPayment"),
    @XmlEnumValue("_commissionRejectedByAccounting")
    COMMISSION_REJECTED_BY_ACCOUNTING("_commissionRejectedByAccounting"),
    @XmlEnumValue("_creditMemoFullyApplied")
    CREDIT_MEMO_FULLY_APPLIED("_creditMemoFullyApplied"),
    @XmlEnumValue("_creditMemoOpen")
    CREDIT_MEMO_OPEN("_creditMemoOpen"),
    @XmlEnumValue("_customerDepositDeposited")
    CUSTOMER_DEPOSIT_DEPOSITED("_customerDepositDeposited"),
    @XmlEnumValue("_customerDepositFullyApplied")
    CUSTOMER_DEPOSIT_FULLY_APPLIED("_customerDepositFullyApplied"),
    @XmlEnumValue("_customerDepositNotDeposited")
    CUSTOMER_DEPOSIT_NOT_DEPOSITED("_customerDepositNotDeposited"),
    @XmlEnumValue("_customerRefundVoided")
    CUSTOMER_REFUND_VOIDED("_customerRefundVoided"),
    @XmlEnumValue("_estimateClosed")
    ESTIMATE_CLOSED("_estimateClosed"),
    @XmlEnumValue("_estimateExpired")
    ESTIMATE_EXPIRED("_estimateExpired"),
    @XmlEnumValue("_estimateOpen")
    ESTIMATE_OPEN("_estimateOpen"),
    @XmlEnumValue("_estimateProcessed")
    ESTIMATE_PROCESSED("_estimateProcessed"),
    @XmlEnumValue("_estimateVoided")
    ESTIMATE_VOIDED("_estimateVoided"),
    @XmlEnumValue("_expenseReportApprovedByAccounting")
    EXPENSE_REPORT_APPROVED_BY_ACCOUNTING("_expenseReportApprovedByAccounting"),
    @XmlEnumValue("_expenseReportApprovedOverriddenByAccounting")
    EXPENSE_REPORT_APPROVED_OVERRIDDEN_BY_ACCOUNTING("_expenseReportApprovedOverriddenByAccounting"),
    @XmlEnumValue("_expenseReportInProgress")
    EXPENSE_REPORT_IN_PROGRESS("_expenseReportInProgress"),
    @XmlEnumValue("_expenseReportPaidInFull")
    EXPENSE_REPORT_PAID_IN_FULL("_expenseReportPaidInFull"),
    @XmlEnumValue("_expenseReportPendingAccountingApproval")
    EXPENSE_REPORT_PENDING_ACCOUNTING_APPROVAL("_expenseReportPendingAccountingApproval"),
    @XmlEnumValue("_expenseReportPendingSupervisorApproval")
    EXPENSE_REPORT_PENDING_SUPERVISOR_APPROVAL("_expenseReportPendingSupervisorApproval"),
    @XmlEnumValue("_expenseReportRejectedByAccounting")
    EXPENSE_REPORT_REJECTED_BY_ACCOUNTING("_expenseReportRejectedByAccounting"),
    @XmlEnumValue("_expenseReportRejectedBySupervisor")
    EXPENSE_REPORT_REJECTED_BY_SUPERVISOR("_expenseReportRejectedBySupervisor"),
    @XmlEnumValue("_expenseReportRejectedOverriddenByAccounting")
    EXPENSE_REPORT_REJECTED_OVERRIDDEN_BY_ACCOUNTING("_expenseReportRejectedOverriddenByAccounting"),
    @XmlEnumValue("_invoiceOpen")
    INVOICE_OPEN("_invoiceOpen"),
    @XmlEnumValue("_invoicePaidInFull")
    INVOICE_PAID_IN_FULL("_invoicePaidInFull"),
    @XmlEnumValue("_invoicePendingApproval")
    INVOICE_PENDING_APPROVAL("_invoicePendingApproval"),
    @XmlEnumValue("_invoiceRejected")
    INVOICE_REJECTED("_invoiceRejected"),
    @XmlEnumValue("_itemFulfillmentPacked")
    ITEM_FULFILLMENT_PACKED("_itemFulfillmentPacked"),
    @XmlEnumValue("_itemFulfillmentPicked")
    ITEM_FULFILLMENT_PICKED("_itemFulfillmentPicked"),
    @XmlEnumValue("_itemFulfillmentShipped")
    ITEM_FULFILLMENT_SHIPPED("_itemFulfillmentShipped"),
    @XmlEnumValue("_journalApprovedForPosting")
    JOURNAL_APPROVED_FOR_POSTING("_journalApprovedForPosting"),
    @XmlEnumValue("_journalPendingApproval")
    JOURNAL_PENDING_APPROVAL("_journalPendingApproval"),
    @XmlEnumValue("_opportunityClosedLost")
    OPPORTUNITY_CLOSED_LOST("_opportunityClosedLost"),
    @XmlEnumValue("_opportunityClosedWon")
    OPPORTUNITY_CLOSED_WON("_opportunityClosedWon"),
    @XmlEnumValue("_opportunityInProgress")
    OPPORTUNITY_IN_PROGRESS("_opportunityInProgress"),
    @XmlEnumValue("_opportunityIssuedEstimate")
    OPPORTUNITY_ISSUED_ESTIMATE("_opportunityIssuedEstimate"),
    @XmlEnumValue("_paycheckCommitted")
    PAYCHECK_COMMITTED("_paycheckCommitted"),
    @XmlEnumValue("_paycheckError")
    PAYCHECK_ERROR("_paycheckError"),
    @XmlEnumValue("_paycheckPendingCommitment")
    PAYCHECK_PENDING_COMMITMENT("_paycheckPendingCommitment"),
    @XmlEnumValue("_paycheckPendingTaxCalculation")
    PAYCHECK_PENDING_TAX_CALCULATION("_paycheckPendingTaxCalculation"),
    @XmlEnumValue("_paycheckPreview")
    PAYCHECK_PREVIEW("_paycheckPreview"),
    @XmlEnumValue("_paycheckReversed")
    PAYCHECK_REVERSED("_paycheckReversed"),
    @XmlEnumValue("_paycheckUndefined")
    PAYCHECK_UNDEFINED("_paycheckUndefined"),
    @XmlEnumValue("_paymentDeposited")
    PAYMENT_DEPOSITED("_paymentDeposited"),
    @XmlEnumValue("_paymentNotDeposited")
    PAYMENT_NOT_DEPOSITED("_paymentNotDeposited"),
    @XmlEnumValue("_paymentUnapprovedPayment")
    PAYMENT_UNAPPROVED_PAYMENT("_paymentUnapprovedPayment"),
    @XmlEnumValue("_payrollLiabilityCheckVoided")
    PAYROLL_LIABILITY_CHECK_VOIDED("_payrollLiabilityCheckVoided"),
    @XmlEnumValue("_purchaseOrderClosed")
    PURCHASE_ORDER_CLOSED("_purchaseOrderClosed"),
    @XmlEnumValue("_purchaseOrderFullyBilled")
    PURCHASE_ORDER_FULLY_BILLED("_purchaseOrderFullyBilled"),
    @XmlEnumValue("_purchaseOrderPartiallyReceived")
    PURCHASE_ORDER_PARTIALLY_RECEIVED("_purchaseOrderPartiallyReceived"),
    @XmlEnumValue("_purchaseOrderPendingBill")
    PURCHASE_ORDER_PENDING_BILL("_purchaseOrderPendingBill"),
    @XmlEnumValue("_purchaseOrderPendingBillingPartiallyReceived")
    PURCHASE_ORDER_PENDING_BILLING_PARTIALLY_RECEIVED("_purchaseOrderPendingBillingPartiallyReceived"),
    @XmlEnumValue("_purchaseOrderPendingReceipt")
    PURCHASE_ORDER_PENDING_RECEIPT("_purchaseOrderPendingReceipt"),
    @XmlEnumValue("_purchaseOrderPendingSupervisorApproval")
    PURCHASE_ORDER_PENDING_SUPERVISOR_APPROVAL("_purchaseOrderPendingSupervisorApproval"),
    @XmlEnumValue("_purchaseOrderRejectedBySupervisor")
    PURCHASE_ORDER_REJECTED_BY_SUPERVISOR("_purchaseOrderRejectedBySupervisor"),
    @XmlEnumValue("_returnAuthorizationCancelled")
    RETURN_AUTHORIZATION_CANCELLED("_returnAuthorizationCancelled"),
    @XmlEnumValue("_returnAuthorizationClosed")
    RETURN_AUTHORIZATION_CLOSED("_returnAuthorizationClosed"),
    @XmlEnumValue("_returnAuthorizationPartiallyReceived")
    RETURN_AUTHORIZATION_PARTIALLY_RECEIVED("_returnAuthorizationPartiallyReceived"),
    @XmlEnumValue("_returnAuthorizationPendingApproval")
    RETURN_AUTHORIZATION_PENDING_APPROVAL("_returnAuthorizationPendingApproval"),
    @XmlEnumValue("_returnAuthorizationPendingReceipt")
    RETURN_AUTHORIZATION_PENDING_RECEIPT("_returnAuthorizationPendingReceipt"),
    @XmlEnumValue("_returnAuthorizationPendingRefund")
    RETURN_AUTHORIZATION_PENDING_REFUND("_returnAuthorizationPendingRefund"),
    @XmlEnumValue("_returnAuthorizationPendingRefundPartiallyReceived")
    RETURN_AUTHORIZATION_PENDING_REFUND_PARTIALLY_RECEIVED("_returnAuthorizationPendingRefundPartiallyReceived"),
    @XmlEnumValue("_returnAuthorizationRefunded")
    RETURN_AUTHORIZATION_REFUNDED("_returnAuthorizationRefunded"),
    @XmlEnumValue("_salesOrderBilled")
    SALES_ORDER_BILLED("_salesOrderBilled"),
    @XmlEnumValue("_salesOrderCancelled")
    SALES_ORDER_CANCELLED("_salesOrderCancelled"),
    @XmlEnumValue("_salesOrderClosed")
    SALES_ORDER_CLOSED("_salesOrderClosed"),
    @XmlEnumValue("_salesOrderPartiallyFulfilled")
    SALES_ORDER_PARTIALLY_FULFILLED("_salesOrderPartiallyFulfilled"),
    @XmlEnumValue("_salesOrderPendingApproval")
    SALES_ORDER_PENDING_APPROVAL("_salesOrderPendingApproval"),
    @XmlEnumValue("_salesOrderPendingBilling")
    SALES_ORDER_PENDING_BILLING("_salesOrderPendingBilling"),
    @XmlEnumValue("_salesOrderPendingBillingPartiallyFulfilled")
    SALES_ORDER_PENDING_BILLING_PARTIALLY_FULFILLED("_salesOrderPendingBillingPartiallyFulfilled"),
    @XmlEnumValue("_salesOrderPendingFulfillment")
    SALES_ORDER_PENDING_FULFILLMENT("_salesOrderPendingFulfillment"),
    @XmlEnumValue("_salesTaxPaymentOnlineBillPayPendingAccountingApproval")
    SALES_TAX_PAYMENT_ONLINE_BILL_PAY_PENDING_ACCOUNTING_APPROVAL("_salesTaxPaymentOnlineBillPayPendingAccountingApproval"),
    @XmlEnumValue("_salesTaxPaymentVoided")
    SALES_TAX_PAYMENT_VOIDED("_salesTaxPaymentVoided"),
    @XmlEnumValue("_statementChargeOpen")
    STATEMENT_CHARGE_OPEN("_statementChargeOpen"),
    @XmlEnumValue("_statementChargePaidInFull")
    STATEMENT_CHARGE_PAID_IN_FULL("_statementChargePaidInFull"),
    @XmlEnumValue("_taxLiabilityChequeVoided")
    TAX_LIABILITY_CHEQUE_VOIDED("_taxLiabilityChequeVoided"),
    @XmlEnumValue("_tegataPayableEndorsed")
    TEGATA_PAYABLE_ENDORSED("_tegataPayableEndorsed"),
    @XmlEnumValue("_tegataPayableIssued")
    TEGATA_PAYABLE_ISSUED("_tegataPayableIssued"),
    @XmlEnumValue("_tegataPayablePaid")
    TEGATA_PAYABLE_PAID("_tegataPayablePaid"),
    @XmlEnumValue("_tegataReceivablesCollected")
    TEGATA_RECEIVABLES_COLLECTED("_tegataReceivablesCollected"),
    @XmlEnumValue("_tegataReceivablesDiscounted")
    TEGATA_RECEIVABLES_DISCOUNTED("_tegataReceivablesDiscounted"),
    @XmlEnumValue("_tegataReceivablesEndorsed")
    TEGATA_RECEIVABLES_ENDORSED("_tegataReceivablesEndorsed"),
    @XmlEnumValue("_tegataReceivablesHolding")
    TEGATA_RECEIVABLES_HOLDING("_tegataReceivablesHolding"),
    @XmlEnumValue("_transferOrderClosed")
    TRANSFER_ORDER_CLOSED("_transferOrderClosed"),
    @XmlEnumValue("_transferOrderPartiallyFulfilled")
    TRANSFER_ORDER_PARTIALLY_FULFILLED("_transferOrderPartiallyFulfilled"),
    @XmlEnumValue("_transferOrderPendingApproval")
    TRANSFER_ORDER_PENDING_APPROVAL("_transferOrderPendingApproval"),
    @XmlEnumValue("_transferOrderPendingFulfillment")
    TRANSFER_ORDER_PENDING_FULFILLMENT("_transferOrderPendingFulfillment"),
    @XmlEnumValue("_transferOrderPendingReceipt")
    TRANSFER_ORDER_PENDING_RECEIPT("_transferOrderPendingReceipt"),
    @XmlEnumValue("_transferOrderPendingReceiptPartiallyFulfilled")
    TRANSFER_ORDER_PENDING_RECEIPT_PARTIALLY_FULFILLED("_transferOrderPendingReceiptPartiallyFulfilled"),
    @XmlEnumValue("_transferOrderReceived")
    TRANSFER_ORDER_RECEIVED("_transferOrderReceived"),
    @XmlEnumValue("_transferOrderRejected")
    TRANSFER_ORDER_REJECTED("_transferOrderRejected"),
    @XmlEnumValue("_vendorReturnAuthorizationCancelled")
    VENDOR_RETURN_AUTHORIZATION_CANCELLED("_vendorReturnAuthorizationCancelled"),
    @XmlEnumValue("_vendorReturnAuthorizationClosed")
    VENDOR_RETURN_AUTHORIZATION_CLOSED("_vendorReturnAuthorizationClosed"),
    @XmlEnumValue("_vendorReturnAuthorizationCredited")
    VENDOR_RETURN_AUTHORIZATION_CREDITED("_vendorReturnAuthorizationCredited"),
    @XmlEnumValue("_vendorReturnAuthorizationPartiallyReturned")
    VENDOR_RETURN_AUTHORIZATION_PARTIALLY_RETURNED("_vendorReturnAuthorizationPartiallyReturned"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingApproval")
    VENDOR_RETURN_AUTHORIZATION_PENDING_APPROVAL("_vendorReturnAuthorizationPendingApproval"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingCredit")
    VENDOR_RETURN_AUTHORIZATION_PENDING_CREDIT("_vendorReturnAuthorizationPendingCredit"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingCreditPartiallyReturned")
    VENDOR_RETURN_AUTHORIZATION_PENDING_CREDIT_PARTIALLY_RETURNED("_vendorReturnAuthorizationPendingCreditPartiallyReturned"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingReturn")
    VENDOR_RETURN_AUTHORIZATION_PENDING_RETURN("_vendorReturnAuthorizationPendingReturn"),
    @XmlEnumValue("_workOrderBuilt")
    WORK_ORDER_BUILT("_workOrderBuilt"),
    @XmlEnumValue("_workOrderCancelled")
    WORK_ORDER_CANCELLED("_workOrderCancelled"),
    @XmlEnumValue("_workOrderClosed")
    WORK_ORDER_CLOSED("_workOrderClosed"),
    @XmlEnumValue("_workOrderPartiallyBuilt")
    WORK_ORDER_PARTIALLY_BUILT("_workOrderPartiallyBuilt"),
    @XmlEnumValue("_workOrderPendingBuild")
    WORK_ORDER_PENDING_BUILD("_workOrderPendingBuild"),
    @XmlEnumValue("_workOrderPlanned")
    WORK_ORDER_PLANNED("_workOrderPlanned");
    private final String value;

    TransactionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatus fromValue(String v) {
        for (TransactionStatus c: TransactionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
