
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionLinkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_closedPeriodFxVariance"/&gt;
 *     &lt;enumeration value="_closeWorkOrder"/&gt;
 *     &lt;enumeration value="_cogsLink"/&gt;
 *     &lt;enumeration value="_collectTegata"/&gt;
 *     &lt;enumeration value="_commission"/&gt;
 *     &lt;enumeration value="_deferredRevenueReallocation"/&gt;
 *     &lt;enumeration value="_depositApplication"/&gt;
 *     &lt;enumeration value="_depositRefundCheck"/&gt;
 *     &lt;enumeration value="_discountTegata"/&gt;
 *     &lt;enumeration value="_dropShipment"/&gt;
 *     &lt;enumeration value="_endorseTegata"/&gt;
 *     &lt;enumeration value="_estimateInvoicing"/&gt;
 *     &lt;enumeration value="_intercompanyAdjustment"/&gt;
 *     &lt;enumeration value="_inventoryCountAdjustment"/&gt;
 *     &lt;enumeration value="_landedCost"/&gt;
 *     &lt;enumeration value="_linkedReturnCost"/&gt;
 *     &lt;enumeration value="_opportunityClose"/&gt;
 *     &lt;enumeration value="_opportunityEstimate"/&gt;
 *     &lt;enumeration value="_orderBillInvoice"/&gt;
 *     &lt;enumeration value="_orderPickingPacking"/&gt;
 *     &lt;enumeration value="_payment"/&gt;
 *     &lt;enumeration value="_payTegata"/&gt;
 *     &lt;enumeration value="_purchaseContractOrder"/&gt;
 *     &lt;enumeration value="_purchaseOrderRequisition"/&gt;
 *     &lt;enumeration value="_purchaseOrderToBlanket"/&gt;
 *     &lt;enumeration value="_purchaseReturn"/&gt;
 *     &lt;enumeration value="_receiptBill"/&gt;
 *     &lt;enumeration value="_receiptFulfillment"/&gt;
 *     &lt;enumeration value="_reimbursement"/&gt;
 *     &lt;enumeration value="_revalueWorkOrder"/&gt;
 *     &lt;enumeration value="_revenueAmortizatonRecognition"/&gt;
 *     &lt;enumeration value="_revenueCommitted"/&gt;
 *     &lt;enumeration value="_saleReturn"/&gt;
 *     &lt;enumeration value="_salesOrderDegross"/&gt;
 *     &lt;enumeration value="_salesOrderDeposit"/&gt;
 *     &lt;enumeration value="_salesOrderRevenueRevaluation"/&gt;
 *     &lt;enumeration value="_sourceOfRevenueContract"/&gt;
 *     &lt;enumeration value="_specialOrder"/&gt;
 *     &lt;enumeration value="_vendorBillVariance"/&gt;
 *     &lt;enumeration value="_wipBuild"/&gt;
 *     &lt;enumeration value="_workOrderBuild"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionLinkType", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionLinkType {

    @XmlEnumValue("_closedPeriodFxVariance")
    CLOSED_PERIOD_FX_VARIANCE("_closedPeriodFxVariance"),
    @XmlEnumValue("_closeWorkOrder")
    CLOSE_WORK_ORDER("_closeWorkOrder"),
    @XmlEnumValue("_cogsLink")
    COGS_LINK("_cogsLink"),
    @XmlEnumValue("_collectTegata")
    COLLECT_TEGATA("_collectTegata"),
    @XmlEnumValue("_commission")
    COMMISSION("_commission"),
    @XmlEnumValue("_deferredRevenueReallocation")
    DEFERRED_REVENUE_REALLOCATION("_deferredRevenueReallocation"),
    @XmlEnumValue("_depositApplication")
    DEPOSIT_APPLICATION("_depositApplication"),
    @XmlEnumValue("_depositRefundCheck")
    DEPOSIT_REFUND_CHECK("_depositRefundCheck"),
    @XmlEnumValue("_discountTegata")
    DISCOUNT_TEGATA("_discountTegata"),
    @XmlEnumValue("_dropShipment")
    DROP_SHIPMENT("_dropShipment"),
    @XmlEnumValue("_endorseTegata")
    ENDORSE_TEGATA("_endorseTegata"),
    @XmlEnumValue("_estimateInvoicing")
    ESTIMATE_INVOICING("_estimateInvoicing"),
    @XmlEnumValue("_intercompanyAdjustment")
    INTERCOMPANY_ADJUSTMENT("_intercompanyAdjustment"),
    @XmlEnumValue("_inventoryCountAdjustment")
    INVENTORY_COUNT_ADJUSTMENT("_inventoryCountAdjustment"),
    @XmlEnumValue("_landedCost")
    LANDED_COST("_landedCost"),
    @XmlEnumValue("_linkedReturnCost")
    LINKED_RETURN_COST("_linkedReturnCost"),
    @XmlEnumValue("_opportunityClose")
    OPPORTUNITY_CLOSE("_opportunityClose"),
    @XmlEnumValue("_opportunityEstimate")
    OPPORTUNITY_ESTIMATE("_opportunityEstimate"),
    @XmlEnumValue("_orderBillInvoice")
    ORDER_BILL_INVOICE("_orderBillInvoice"),
    @XmlEnumValue("_orderPickingPacking")
    ORDER_PICKING_PACKING("_orderPickingPacking"),
    @XmlEnumValue("_payment")
    PAYMENT("_payment"),
    @XmlEnumValue("_payTegata")
    PAY_TEGATA("_payTegata"),
    @XmlEnumValue("_purchaseContractOrder")
    PURCHASE_CONTRACT_ORDER("_purchaseContractOrder"),
    @XmlEnumValue("_purchaseOrderRequisition")
    PURCHASE_ORDER_REQUISITION("_purchaseOrderRequisition"),
    @XmlEnumValue("_purchaseOrderToBlanket")
    PURCHASE_ORDER_TO_BLANKET("_purchaseOrderToBlanket"),
    @XmlEnumValue("_purchaseReturn")
    PURCHASE_RETURN("_purchaseReturn"),
    @XmlEnumValue("_receiptBill")
    RECEIPT_BILL("_receiptBill"),
    @XmlEnumValue("_receiptFulfillment")
    RECEIPT_FULFILLMENT("_receiptFulfillment"),
    @XmlEnumValue("_reimbursement")
    REIMBURSEMENT("_reimbursement"),
    @XmlEnumValue("_revalueWorkOrder")
    REVALUE_WORK_ORDER("_revalueWorkOrder"),
    @XmlEnumValue("_revenueAmortizatonRecognition")
    REVENUE_AMORTIZATON_RECOGNITION("_revenueAmortizatonRecognition"),
    @XmlEnumValue("_revenueCommitted")
    REVENUE_COMMITTED("_revenueCommitted"),
    @XmlEnumValue("_saleReturn")
    SALE_RETURN("_saleReturn"),
    @XmlEnumValue("_salesOrderDegross")
    SALES_ORDER_DEGROSS("_salesOrderDegross"),
    @XmlEnumValue("_salesOrderDeposit")
    SALES_ORDER_DEPOSIT("_salesOrderDeposit"),
    @XmlEnumValue("_salesOrderRevenueRevaluation")
    SALES_ORDER_REVENUE_REVALUATION("_salesOrderRevenueRevaluation"),
    @XmlEnumValue("_sourceOfRevenueContract")
    SOURCE_OF_REVENUE_CONTRACT("_sourceOfRevenueContract"),
    @XmlEnumValue("_specialOrder")
    SPECIAL_ORDER("_specialOrder"),
    @XmlEnumValue("_vendorBillVariance")
    VENDOR_BILL_VARIANCE("_vendorBillVariance"),
    @XmlEnumValue("_wipBuild")
    WIP_BUILD("_wipBuild"),
    @XmlEnumValue("_workOrderBuild")
    WORK_ORDER_BUILD("_workOrderBuild");
    private final String value;

    TransactionLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionLinkType fromValue(String v) {
        for (TransactionLinkType c: TransactionLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
