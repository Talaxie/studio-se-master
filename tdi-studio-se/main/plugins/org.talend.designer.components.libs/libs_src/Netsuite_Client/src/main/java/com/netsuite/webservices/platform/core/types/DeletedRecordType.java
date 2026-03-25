
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeletedRecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeletedRecordType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="assemblyBuild"/&gt;
 *     &lt;enumeration value="assemblyItem"/&gt;
 *     &lt;enumeration value="assemblyUnbuild"/&gt;
 *     &lt;enumeration value="billingSchedule"/&gt;
 *     &lt;enumeration value="bin"/&gt;
 *     &lt;enumeration value="binTransfer"/&gt;
 *     &lt;enumeration value="binWorksheet"/&gt;
 *     &lt;enumeration value="calendarEvent"/&gt;
 *     &lt;enumeration value="campaign"/&gt;
 *     &lt;enumeration value="cashRefund"/&gt;
 *     &lt;enumeration value="cashSale"/&gt;
 *     &lt;enumeration value="charge"/&gt;
 *     &lt;enumeration value="check"/&gt;
 *     &lt;enumeration value="contact"/&gt;
 *     &lt;enumeration value="contactCategory"/&gt;
 *     &lt;enumeration value="costCategory"/&gt;
 *     &lt;enumeration value="couponCode"/&gt;
 *     &lt;enumeration value="creditMemo"/&gt;
 *     &lt;enumeration value="currencyRate"/&gt;
 *     &lt;enumeration value="customRecord"/&gt;
 *     &lt;enumeration value="customer"/&gt;
 *     &lt;enumeration value="customerCategory"/&gt;
 *     &lt;enumeration value="customerMessage"/&gt;
 *     &lt;enumeration value="customerDeposit"/&gt;
 *     &lt;enumeration value="customerPayment"/&gt;
 *     &lt;enumeration value="customerRefund"/&gt;
 *     &lt;enumeration value="customerStatus"/&gt;
 *     &lt;enumeration value="deposit"/&gt;
 *     &lt;enumeration value="depositApplication"/&gt;
 *     &lt;enumeration value="descriptionItem"/&gt;
 *     &lt;enumeration value="discountItem"/&gt;
 *     &lt;enumeration value="downloadItem"/&gt;
 *     &lt;enumeration value="employee"/&gt;
 *     &lt;enumeration value="estimate"/&gt;
 *     &lt;enumeration value="expenseReport"/&gt;
 *     &lt;enumeration value="file"/&gt;
 *     &lt;enumeration value="folder"/&gt;
 *     &lt;enumeration value="giftCertificateItem"/&gt;
 *     &lt;enumeration value="globalAccountMapping"/&gt;
 *     &lt;enumeration value="interCompanyJournalEntry"/&gt;
 *     &lt;enumeration value="interCompanyTransferOrder"/&gt;
 *     &lt;enumeration value="inventoryAdjustment"/&gt;
 *     &lt;enumeration value="inventoryCostRevaluation"/&gt;
 *     &lt;enumeration value="inventoryItem"/&gt;
 *     &lt;enumeration value="inventoryNumber"/&gt;
 *     &lt;enumeration value="inventoryTransfer"/&gt;
 *     &lt;enumeration value="invoice"/&gt;
 *     &lt;enumeration value="issue"/&gt;
 *     &lt;enumeration value="itemAccountMapping"/&gt;
 *     &lt;enumeration value="itemDemandPlan"/&gt;
 *     &lt;enumeration value="itemFulfillment"/&gt;
 *     &lt;enumeration value="itemSupplyPlan"/&gt;
 *     &lt;enumeration value="itemGroup"/&gt;
 *     &lt;enumeration value="itemReceipt"/&gt;
 *     &lt;enumeration value="itemRevision"/&gt;
 *     &lt;enumeration value="job"/&gt;
 *     &lt;enumeration value="jobStatus"/&gt;
 *     &lt;enumeration value="journalEntry"/&gt;
 *     &lt;enumeration value="kitItem"/&gt;
 *     &lt;enumeration value="lotNumberedAssemblyItem"/&gt;
 *     &lt;enumeration value="lotNumberedInventoryItem"/&gt;
 *     &lt;enumeration value="markupItem"/&gt;
 *     &lt;enumeration value="message"/&gt;
 *     &lt;enumeration value="manufacturingCostTemplate"/&gt;
 *     &lt;enumeration value="manufacturingOperationTask"/&gt;
 *     &lt;enumeration value="manufacturingRouting"/&gt;
 *     &lt;enumeration value="nexus"/&gt;
 *     &lt;enumeration value="nonInventoryPurchaseItem"/&gt;
 *     &lt;enumeration value="nonInventoryResaleItem"/&gt;
 *     &lt;enumeration value="nonInventorySaleItem"/&gt;
 *     &lt;enumeration value="note"/&gt;
 *     &lt;enumeration value="noteType"/&gt;
 *     &lt;enumeration value="opportunity"/&gt;
 *     &lt;enumeration value="otherChargePurchaseItem"/&gt;
 *     &lt;enumeration value="otherChargeResaleItem"/&gt;
 *     &lt;enumeration value="otherChargeSaleItem"/&gt;
 *     &lt;enumeration value="otherNameCategory"/&gt;
 *     &lt;enumeration value="partner"/&gt;
 *     &lt;enumeration value="paymentItem"/&gt;
 *     &lt;enumeration value="paymentMethod"/&gt;
 *     &lt;enumeration value="payrollItem"/&gt;
 *     &lt;enumeration value="phoneCall"/&gt;
 *     &lt;enumeration value="priceLevel"/&gt;
 *     &lt;enumeration value="pricingGroup"/&gt;
 *     &lt;enumeration value="projectTask"/&gt;
 *     &lt;enumeration value="promotionCode"/&gt;
 *     &lt;enumeration value="purchaseOrder"/&gt;
 *     &lt;enumeration value="resourceAllocation"/&gt;
 *     &lt;enumeration value="returnAuthorization"/&gt;
 *     &lt;enumeration value="salesOrder"/&gt;
 *     &lt;enumeration value="salesTaxItem"/&gt;
 *     &lt;enumeration value="serializedAssemblyItem"/&gt;
 *     &lt;enumeration value="serializedInventoryItem"/&gt;
 *     &lt;enumeration value="servicePurchaseItem"/&gt;
 *     &lt;enumeration value="serviceResaleItem"/&gt;
 *     &lt;enumeration value="serviceSaleItem"/&gt;
 *     &lt;enumeration value="statisticalJournalEntry"/&gt;
 *     &lt;enumeration value="subtotalItem"/&gt;
 *     &lt;enumeration value="supportCase"/&gt;
 *     &lt;enumeration value="supportCaseIssue"/&gt;
 *     &lt;enumeration value="supportCaseOrigin"/&gt;
 *     &lt;enumeration value="supportCasePriority"/&gt;
 *     &lt;enumeration value="supportCaseStatus"/&gt;
 *     &lt;enumeration value="supportCaseType"/&gt;
 *     &lt;enumeration value="task"/&gt;
 *     &lt;enumeration value="term"/&gt;
 *     &lt;enumeration value="timeSheet"/&gt;
 *     &lt;enumeration value="transferOrder"/&gt;
 *     &lt;enumeration value="vendor"/&gt;
 *     &lt;enumeration value="vendorBill"/&gt;
 *     &lt;enumeration value="vendorCredit"/&gt;
 *     &lt;enumeration value="vendorPayment"/&gt;
 *     &lt;enumeration value="vendorReturnAuthorization"/&gt;
 *     &lt;enumeration value="winLossReason"/&gt;
 *     &lt;enumeration value="workOrder"/&gt;
 *     &lt;enumeration value="workOrderIssue"/&gt;
 *     &lt;enumeration value="workOrderCompletion"/&gt;
 *     &lt;enumeration value="workOrderClose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeletedRecordType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum DeletedRecordType {

    @XmlEnumValue("assemblyBuild")
    ASSEMBLY_BUILD("assemblyBuild"),
    @XmlEnumValue("assemblyItem")
    ASSEMBLY_ITEM("assemblyItem"),
    @XmlEnumValue("assemblyUnbuild")
    ASSEMBLY_UNBUILD("assemblyUnbuild"),
    @XmlEnumValue("billingSchedule")
    BILLING_SCHEDULE("billingSchedule"),
    @XmlEnumValue("bin")
    BIN("bin"),
    @XmlEnumValue("binTransfer")
    BIN_TRANSFER("binTransfer"),
    @XmlEnumValue("binWorksheet")
    BIN_WORKSHEET("binWorksheet"),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent"),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),
    @XmlEnumValue("cashRefund")
    CASH_REFUND("cashRefund"),
    @XmlEnumValue("cashSale")
    CASH_SALE("cashSale"),
    @XmlEnumValue("charge")
    CHARGE("charge"),
    @XmlEnumValue("check")
    CHECK("check"),
    @XmlEnumValue("contact")
    CONTACT("contact"),
    @XmlEnumValue("contactCategory")
    CONTACT_CATEGORY("contactCategory"),
    @XmlEnumValue("costCategory")
    COST_CATEGORY("costCategory"),
    @XmlEnumValue("couponCode")
    COUPON_CODE("couponCode"),
    @XmlEnumValue("creditMemo")
    CREDIT_MEMO("creditMemo"),
    @XmlEnumValue("currencyRate")
    CURRENCY_RATE("currencyRate"),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("customerCategory")
    CUSTOMER_CATEGORY("customerCategory"),
    @XmlEnumValue("customerMessage")
    CUSTOMER_MESSAGE("customerMessage"),
    @XmlEnumValue("customerDeposit")
    CUSTOMER_DEPOSIT("customerDeposit"),
    @XmlEnumValue("customerPayment")
    CUSTOMER_PAYMENT("customerPayment"),
    @XmlEnumValue("customerRefund")
    CUSTOMER_REFUND("customerRefund"),
    @XmlEnumValue("customerStatus")
    CUSTOMER_STATUS("customerStatus"),
    @XmlEnumValue("deposit")
    DEPOSIT("deposit"),
    @XmlEnumValue("depositApplication")
    DEPOSIT_APPLICATION("depositApplication"),
    @XmlEnumValue("descriptionItem")
    DESCRIPTION_ITEM("descriptionItem"),
    @XmlEnumValue("discountItem")
    DISCOUNT_ITEM("discountItem"),
    @XmlEnumValue("downloadItem")
    DOWNLOAD_ITEM("downloadItem"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("expenseReport")
    EXPENSE_REPORT("expenseReport"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("folder")
    FOLDER("folder"),
    @XmlEnumValue("giftCertificateItem")
    GIFT_CERTIFICATE_ITEM("giftCertificateItem"),
    @XmlEnumValue("globalAccountMapping")
    GLOBAL_ACCOUNT_MAPPING("globalAccountMapping"),
    @XmlEnumValue("interCompanyJournalEntry")
    INTER_COMPANY_JOURNAL_ENTRY("interCompanyJournalEntry"),
    @XmlEnumValue("interCompanyTransferOrder")
    INTER_COMPANY_TRANSFER_ORDER("interCompanyTransferOrder"),
    @XmlEnumValue("inventoryAdjustment")
    INVENTORY_ADJUSTMENT("inventoryAdjustment"),
    @XmlEnumValue("inventoryCostRevaluation")
    INVENTORY_COST_REVALUATION("inventoryCostRevaluation"),
    @XmlEnumValue("inventoryItem")
    INVENTORY_ITEM("inventoryItem"),
    @XmlEnumValue("inventoryNumber")
    INVENTORY_NUMBER("inventoryNumber"),
    @XmlEnumValue("inventoryTransfer")
    INVENTORY_TRANSFER("inventoryTransfer"),
    @XmlEnumValue("invoice")
    INVOICE("invoice"),
    @XmlEnumValue("issue")
    ISSUE("issue"),
    @XmlEnumValue("itemAccountMapping")
    ITEM_ACCOUNT_MAPPING("itemAccountMapping"),
    @XmlEnumValue("itemDemandPlan")
    ITEM_DEMAND_PLAN("itemDemandPlan"),
    @XmlEnumValue("itemFulfillment")
    ITEM_FULFILLMENT("itemFulfillment"),
    @XmlEnumValue("itemSupplyPlan")
    ITEM_SUPPLY_PLAN("itemSupplyPlan"),
    @XmlEnumValue("itemGroup")
    ITEM_GROUP("itemGroup"),
    @XmlEnumValue("itemReceipt")
    ITEM_RECEIPT("itemReceipt"),
    @XmlEnumValue("itemRevision")
    ITEM_REVISION("itemRevision"),
    @XmlEnumValue("job")
    JOB("job"),
    @XmlEnumValue("jobStatus")
    JOB_STATUS("jobStatus"),
    @XmlEnumValue("journalEntry")
    JOURNAL_ENTRY("journalEntry"),
    @XmlEnumValue("kitItem")
    KIT_ITEM("kitItem"),
    @XmlEnumValue("lotNumberedAssemblyItem")
    LOT_NUMBERED_ASSEMBLY_ITEM("lotNumberedAssemblyItem"),
    @XmlEnumValue("lotNumberedInventoryItem")
    LOT_NUMBERED_INVENTORY_ITEM("lotNumberedInventoryItem"),
    @XmlEnumValue("markupItem")
    MARKUP_ITEM("markupItem"),
    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("manufacturingCostTemplate")
    MANUFACTURING_COST_TEMPLATE("manufacturingCostTemplate"),
    @XmlEnumValue("manufacturingOperationTask")
    MANUFACTURING_OPERATION_TASK("manufacturingOperationTask"),
    @XmlEnumValue("manufacturingRouting")
    MANUFACTURING_ROUTING("manufacturingRouting"),
    @XmlEnumValue("nexus")
    NEXUS("nexus"),
    @XmlEnumValue("nonInventoryPurchaseItem")
    NON_INVENTORY_PURCHASE_ITEM("nonInventoryPurchaseItem"),
    @XmlEnumValue("nonInventoryResaleItem")
    NON_INVENTORY_RESALE_ITEM("nonInventoryResaleItem"),
    @XmlEnumValue("nonInventorySaleItem")
    NON_INVENTORY_SALE_ITEM("nonInventorySaleItem"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("noteType")
    NOTE_TYPE("noteType"),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity"),
    @XmlEnumValue("otherChargePurchaseItem")
    OTHER_CHARGE_PURCHASE_ITEM("otherChargePurchaseItem"),
    @XmlEnumValue("otherChargeResaleItem")
    OTHER_CHARGE_RESALE_ITEM("otherChargeResaleItem"),
    @XmlEnumValue("otherChargeSaleItem")
    OTHER_CHARGE_SALE_ITEM("otherChargeSaleItem"),
    @XmlEnumValue("otherNameCategory")
    OTHER_NAME_CATEGORY("otherNameCategory"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("paymentItem")
    PAYMENT_ITEM("paymentItem"),
    @XmlEnumValue("paymentMethod")
    PAYMENT_METHOD("paymentMethod"),
    @XmlEnumValue("payrollItem")
    PAYROLL_ITEM("payrollItem"),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall"),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel"),
    @XmlEnumValue("pricingGroup")
    PRICING_GROUP("pricingGroup"),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask"),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode"),
    @XmlEnumValue("purchaseOrder")
    PURCHASE_ORDER("purchaseOrder"),
    @XmlEnumValue("resourceAllocation")
    RESOURCE_ALLOCATION("resourceAllocation"),
    @XmlEnumValue("returnAuthorization")
    RETURN_AUTHORIZATION("returnAuthorization"),
    @XmlEnumValue("salesOrder")
    SALES_ORDER("salesOrder"),
    @XmlEnumValue("salesTaxItem")
    SALES_TAX_ITEM("salesTaxItem"),
    @XmlEnumValue("serializedAssemblyItem")
    SERIALIZED_ASSEMBLY_ITEM("serializedAssemblyItem"),
    @XmlEnumValue("serializedInventoryItem")
    SERIALIZED_INVENTORY_ITEM("serializedInventoryItem"),
    @XmlEnumValue("servicePurchaseItem")
    SERVICE_PURCHASE_ITEM("servicePurchaseItem"),
    @XmlEnumValue("serviceResaleItem")
    SERVICE_RESALE_ITEM("serviceResaleItem"),
    @XmlEnumValue("serviceSaleItem")
    SERVICE_SALE_ITEM("serviceSaleItem"),
    @XmlEnumValue("statisticalJournalEntry")
    STATISTICAL_JOURNAL_ENTRY("statisticalJournalEntry"),
    @XmlEnumValue("subtotalItem")
    SUBTOTAL_ITEM("subtotalItem"),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase"),
    @XmlEnumValue("supportCaseIssue")
    SUPPORT_CASE_ISSUE("supportCaseIssue"),
    @XmlEnumValue("supportCaseOrigin")
    SUPPORT_CASE_ORIGIN("supportCaseOrigin"),
    @XmlEnumValue("supportCasePriority")
    SUPPORT_CASE_PRIORITY("supportCasePriority"),
    @XmlEnumValue("supportCaseStatus")
    SUPPORT_CASE_STATUS("supportCaseStatus"),
    @XmlEnumValue("supportCaseType")
    SUPPORT_CASE_TYPE("supportCaseType"),
    @XmlEnumValue("task")
    TASK("task"),
    @XmlEnumValue("term")
    TERM("term"),
    @XmlEnumValue("timeSheet")
    TIME_SHEET("timeSheet"),
    @XmlEnumValue("transferOrder")
    TRANSFER_ORDER("transferOrder"),
    @XmlEnumValue("vendor")
    VENDOR("vendor"),
    @XmlEnumValue("vendorBill")
    VENDOR_BILL("vendorBill"),
    @XmlEnumValue("vendorCredit")
    VENDOR_CREDIT("vendorCredit"),
    @XmlEnumValue("vendorPayment")
    VENDOR_PAYMENT("vendorPayment"),
    @XmlEnumValue("vendorReturnAuthorization")
    VENDOR_RETURN_AUTHORIZATION("vendorReturnAuthorization"),
    @XmlEnumValue("winLossReason")
    WIN_LOSS_REASON("winLossReason"),
    @XmlEnumValue("workOrder")
    WORK_ORDER("workOrder"),
    @XmlEnumValue("workOrderIssue")
    WORK_ORDER_ISSUE("workOrderIssue"),
    @XmlEnumValue("workOrderCompletion")
    WORK_ORDER_COMPLETION("workOrderCompletion"),
    @XmlEnumValue("workOrderClose")
    WORK_ORDER_CLOSE("workOrderClose");
    private final String value;

    DeletedRecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeletedRecordType fromValue(String v) {
        for (DeletedRecordType c: DeletedRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
