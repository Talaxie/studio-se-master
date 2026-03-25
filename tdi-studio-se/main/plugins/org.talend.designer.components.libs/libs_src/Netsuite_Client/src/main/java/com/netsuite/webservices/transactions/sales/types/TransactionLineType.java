
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionLineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionLineType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_adjustedQuantity"/&gt;
 *     &lt;enumeration value="_billExchangeRateVariance"/&gt;
 *     &lt;enumeration value="_billPriceVariance"/&gt;
 *     &lt;enumeration value="_billQuantityVariance"/&gt;
 *     &lt;enumeration value="_countQuantity"/&gt;
 *     &lt;enumeration value="_dropshipExpense"/&gt;
 *     &lt;enumeration value="_gainLoss"/&gt;
 *     &lt;enumeration value="_item"/&gt;
 *     &lt;enumeration value="_materialOverhead"/&gt;
 *     &lt;enumeration value="_nonReimbursuableExpenseOffset"/&gt;
 *     &lt;enumeration value="_nonReimbursuableExpenseOriginal"/&gt;
 *     &lt;enumeration value="_productionPriceVariance"/&gt;
 *     &lt;enumeration value="_productionQuantityVariance"/&gt;
 *     &lt;enumeration value="_purchasePriceVariance"/&gt;
 *     &lt;enumeration value="_receiving"/&gt;
 *     &lt;enumeration value="_routingItem"/&gt;
 *     &lt;enumeration value="_routingWorkInProcess"/&gt;
 *     &lt;enumeration value="_scrap"/&gt;
 *     &lt;enumeration value="_shipping"/&gt;
 *     &lt;enumeration value="_snapshotQuantity"/&gt;
 *     &lt;enumeration value="_totalBillVariance"/&gt;
 *     &lt;enumeration value="_unbuildVariance"/&gt;
 *     &lt;enumeration value="_workInProcess"/&gt;
 *     &lt;enumeration value="_workInProcessVariance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionLineType", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionLineType {

    @XmlEnumValue("_adjustedQuantity")
    ADJUSTED_QUANTITY("_adjustedQuantity"),
    @XmlEnumValue("_billExchangeRateVariance")
    BILL_EXCHANGE_RATE_VARIANCE("_billExchangeRateVariance"),
    @XmlEnumValue("_billPriceVariance")
    BILL_PRICE_VARIANCE("_billPriceVariance"),
    @XmlEnumValue("_billQuantityVariance")
    BILL_QUANTITY_VARIANCE("_billQuantityVariance"),
    @XmlEnumValue("_countQuantity")
    COUNT_QUANTITY("_countQuantity"),
    @XmlEnumValue("_dropshipExpense")
    DROPSHIP_EXPENSE("_dropshipExpense"),
    @XmlEnumValue("_gainLoss")
    GAIN_LOSS("_gainLoss"),
    @XmlEnumValue("_item")
    ITEM("_item"),
    @XmlEnumValue("_materialOverhead")
    MATERIAL_OVERHEAD("_materialOverhead"),
    @XmlEnumValue("_nonReimbursuableExpenseOffset")
    NON_REIMBURSUABLE_EXPENSE_OFFSET("_nonReimbursuableExpenseOffset"),
    @XmlEnumValue("_nonReimbursuableExpenseOriginal")
    NON_REIMBURSUABLE_EXPENSE_ORIGINAL("_nonReimbursuableExpenseOriginal"),
    @XmlEnumValue("_productionPriceVariance")
    PRODUCTION_PRICE_VARIANCE("_productionPriceVariance"),
    @XmlEnumValue("_productionQuantityVariance")
    PRODUCTION_QUANTITY_VARIANCE("_productionQuantityVariance"),
    @XmlEnumValue("_purchasePriceVariance")
    PURCHASE_PRICE_VARIANCE("_purchasePriceVariance"),
    @XmlEnumValue("_receiving")
    RECEIVING("_receiving"),
    @XmlEnumValue("_routingItem")
    ROUTING_ITEM("_routingItem"),
    @XmlEnumValue("_routingWorkInProcess")
    ROUTING_WORK_IN_PROCESS("_routingWorkInProcess"),
    @XmlEnumValue("_scrap")
    SCRAP("_scrap"),
    @XmlEnumValue("_shipping")
    SHIPPING("_shipping"),
    @XmlEnumValue("_snapshotQuantity")
    SNAPSHOT_QUANTITY("_snapshotQuantity"),
    @XmlEnumValue("_totalBillVariance")
    TOTAL_BILL_VARIANCE("_totalBillVariance"),
    @XmlEnumValue("_unbuildVariance")
    UNBUILD_VARIANCE("_unbuildVariance"),
    @XmlEnumValue("_workInProcess")
    WORK_IN_PROCESS("_workInProcess"),
    @XmlEnumValue("_workInProcessVariance")
    WORK_IN_PROCESS_VARIANCE("_workInProcessVariance");
    private final String value;

    TransactionLineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionLineType fromValue(String v) {
        for (TransactionLineType c: TransactionLineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
