
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling.CalendarEvent;
import com.netsuite.webservices.activities.scheduling.PhoneCall;
import com.netsuite.webservices.activities.scheduling.ProjectTask;
import com.netsuite.webservices.activities.scheduling.ResourceAllocation;
import com.netsuite.webservices.activities.scheduling.Task;
import com.netsuite.webservices.documents.filecabinet.File;
import com.netsuite.webservices.documents.filecabinet.Folder;
import com.netsuite.webservices.general.communication.Message;
import com.netsuite.webservices.general.communication.Note;
import com.netsuite.webservices.lists.accounting.Account;
import com.netsuite.webservices.lists.accounting.AccountingPeriod;
import com.netsuite.webservices.lists.accounting.AssemblyItem;
import com.netsuite.webservices.lists.accounting.BillingSchedule;
import com.netsuite.webservices.lists.accounting.Bin;
import com.netsuite.webservices.lists.accounting.BudgetCategory;
import com.netsuite.webservices.lists.accounting.Classification;
import com.netsuite.webservices.lists.accounting.ContactCategory;
import com.netsuite.webservices.lists.accounting.ContactRole;
import com.netsuite.webservices.lists.accounting.CostCategory;
import com.netsuite.webservices.lists.accounting.Currency;
import com.netsuite.webservices.lists.accounting.CurrencyRate;
import com.netsuite.webservices.lists.accounting.CustomerCategory;
import com.netsuite.webservices.lists.accounting.CustomerMessage;
import com.netsuite.webservices.lists.accounting.Department;
import com.netsuite.webservices.lists.accounting.DescriptionItem;
import com.netsuite.webservices.lists.accounting.DiscountItem;
import com.netsuite.webservices.lists.accounting.DownloadItem;
import com.netsuite.webservices.lists.accounting.ExpenseCategory;
import com.netsuite.webservices.lists.accounting.GiftCertificate;
import com.netsuite.webservices.lists.accounting.GiftCertificateItem;
import com.netsuite.webservices.lists.accounting.GlobalAccountMapping;
import com.netsuite.webservices.lists.accounting.InventoryItem;
import com.netsuite.webservices.lists.accounting.InventoryNumber;
import com.netsuite.webservices.lists.accounting.ItemAccountMapping;
import com.netsuite.webservices.lists.accounting.ItemGroup;
import com.netsuite.webservices.lists.accounting.ItemRevision;
import com.netsuite.webservices.lists.accounting.KitItem;
import com.netsuite.webservices.lists.accounting.LeadSource;
import com.netsuite.webservices.lists.accounting.Location;
import com.netsuite.webservices.lists.accounting.LotNumberedAssemblyItem;
import com.netsuite.webservices.lists.accounting.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.accounting.MarkupItem;
import com.netsuite.webservices.lists.accounting.Nexus;
import com.netsuite.webservices.lists.accounting.NonInventoryPurchaseItem;
import com.netsuite.webservices.lists.accounting.NonInventoryResaleItem;
import com.netsuite.webservices.lists.accounting.NonInventorySaleItem;
import com.netsuite.webservices.lists.accounting.NoteType;
import com.netsuite.webservices.lists.accounting.OtherChargePurchaseItem;
import com.netsuite.webservices.lists.accounting.OtherChargeResaleItem;
import com.netsuite.webservices.lists.accounting.OtherChargeSaleItem;
import com.netsuite.webservices.lists.accounting.OtherNameCategory;
import com.netsuite.webservices.lists.accounting.PartnerCategory;
import com.netsuite.webservices.lists.accounting.PaymentItem;
import com.netsuite.webservices.lists.accounting.PaymentMethod;
import com.netsuite.webservices.lists.accounting.PriceLevel;
import com.netsuite.webservices.lists.accounting.PricingGroup;
import com.netsuite.webservices.lists.accounting.RevRecSchedule;
import com.netsuite.webservices.lists.accounting.RevRecTemplate;
import com.netsuite.webservices.lists.accounting.SalesRole;
import com.netsuite.webservices.lists.accounting.SalesTaxItem;
import com.netsuite.webservices.lists.accounting.SerializedAssemblyItem;
import com.netsuite.webservices.lists.accounting.SerializedInventoryItem;
import com.netsuite.webservices.lists.accounting.ServicePurchaseItem;
import com.netsuite.webservices.lists.accounting.ServiceResaleItem;
import com.netsuite.webservices.lists.accounting.ServiceSaleItem;
import com.netsuite.webservices.lists.accounting.State;
import com.netsuite.webservices.lists.accounting.Subsidiary;
import com.netsuite.webservices.lists.accounting.SubtotalItem;
import com.netsuite.webservices.lists.accounting.TaxAcct;
import com.netsuite.webservices.lists.accounting.TaxGroup;
import com.netsuite.webservices.lists.accounting.TaxType;
import com.netsuite.webservices.lists.accounting.Term;
import com.netsuite.webservices.lists.accounting.UnitsType;
import com.netsuite.webservices.lists.accounting.VendorCategory;
import com.netsuite.webservices.lists.accounting.WinLossReason;
import com.netsuite.webservices.lists.employees.Employee;
import com.netsuite.webservices.lists.employees.PayrollItem;
import com.netsuite.webservices.lists.marketing.Campaign;
import com.netsuite.webservices.lists.marketing.CampaignAudience;
import com.netsuite.webservices.lists.marketing.CampaignCategory;
import com.netsuite.webservices.lists.marketing.CampaignChannel;
import com.netsuite.webservices.lists.marketing.CampaignFamily;
import com.netsuite.webservices.lists.marketing.CampaignOffer;
import com.netsuite.webservices.lists.marketing.CampaignResponse;
import com.netsuite.webservices.lists.marketing.CampaignSearchEngine;
import com.netsuite.webservices.lists.marketing.CampaignSubscription;
import com.netsuite.webservices.lists.marketing.CampaignVertical;
import com.netsuite.webservices.lists.marketing.CouponCode;
import com.netsuite.webservices.lists.marketing.PromotionCode;
import com.netsuite.webservices.lists.relationships.Contact;
import com.netsuite.webservices.lists.relationships.Customer;
import com.netsuite.webservices.lists.relationships.CustomerStatus;
import com.netsuite.webservices.lists.relationships.EntityGroup;
import com.netsuite.webservices.lists.relationships.Job;
import com.netsuite.webservices.lists.relationships.JobStatus;
import com.netsuite.webservices.lists.relationships.JobType;
import com.netsuite.webservices.lists.relationships.Partner;
import com.netsuite.webservices.lists.relationships.Vendor;
import com.netsuite.webservices.lists.supplychain.ManufacturingCostTemplate;
import com.netsuite.webservices.lists.supplychain.ManufacturingOperationTask;
import com.netsuite.webservices.lists.supplychain.ManufacturingRouting;
import com.netsuite.webservices.lists.support.Issue;
import com.netsuite.webservices.lists.support.Solution;
import com.netsuite.webservices.lists.support.SupportCase;
import com.netsuite.webservices.lists.support.SupportCaseIssue;
import com.netsuite.webservices.lists.support.SupportCaseOrigin;
import com.netsuite.webservices.lists.support.SupportCasePriority;
import com.netsuite.webservices.lists.support.SupportCaseStatus;
import com.netsuite.webservices.lists.support.SupportCaseType;
import com.netsuite.webservices.lists.support.Topic;
import com.netsuite.webservices.lists.website.SiteCategory;
import com.netsuite.webservices.platform.common.Address;
import com.netsuite.webservices.platform.common.InventoryDetail;
import com.netsuite.webservices.platform.common.LandedCost;
import com.netsuite.webservices.setup.customization.AppDefinition;
import com.netsuite.webservices.setup.customization.AppPackage;
import com.netsuite.webservices.setup.customization.CustomFieldType;
import com.netsuite.webservices.setup.customization.CustomList;
import com.netsuite.webservices.setup.customization.CustomRecord;
import com.netsuite.webservices.setup.customization.CustomRecordType;
import com.netsuite.webservices.transactions.bank.Check;
import com.netsuite.webservices.transactions.bank.Deposit;
import com.netsuite.webservices.transactions.customers.CashRefund;
import com.netsuite.webservices.transactions.customers.Charge;
import com.netsuite.webservices.transactions.customers.CreditMemo;
import com.netsuite.webservices.transactions.customers.CustomerDeposit;
import com.netsuite.webservices.transactions.customers.CustomerPayment;
import com.netsuite.webservices.transactions.customers.CustomerRefund;
import com.netsuite.webservices.transactions.customers.DepositApplication;
import com.netsuite.webservices.transactions.customers.ReturnAuthorization;
import com.netsuite.webservices.transactions.demandplanning.ItemDemandPlan;
import com.netsuite.webservices.transactions.demandplanning.ItemSupplyPlan;
import com.netsuite.webservices.transactions.employees.ExpenseReport;
import com.netsuite.webservices.transactions.employees.PaycheckJournal;
import com.netsuite.webservices.transactions.employees.TimeBill;
import com.netsuite.webservices.transactions.employees.TimeEntry;
import com.netsuite.webservices.transactions.employees.TimeSheet;
import com.netsuite.webservices.transactions.financial.Budget;
import com.netsuite.webservices.transactions.general.InterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general.JournalEntry;
import com.netsuite.webservices.transactions.general.StatisticalJournalEntry;
import com.netsuite.webservices.transactions.inventory.AssemblyBuild;
import com.netsuite.webservices.transactions.inventory.AssemblyUnbuild;
import com.netsuite.webservices.transactions.inventory.BinTransfer;
import com.netsuite.webservices.transactions.inventory.BinWorksheet;
import com.netsuite.webservices.transactions.inventory.InterCompanyTransferOrder;
import com.netsuite.webservices.transactions.inventory.InventoryAdjustment;
import com.netsuite.webservices.transactions.inventory.InventoryCostRevaluation;
import com.netsuite.webservices.transactions.inventory.InventoryTransfer;
import com.netsuite.webservices.transactions.inventory.TransferOrder;
import com.netsuite.webservices.transactions.inventory.WorkOrder;
import com.netsuite.webservices.transactions.inventory.WorkOrderClose;
import com.netsuite.webservices.transactions.inventory.WorkOrderCompletion;
import com.netsuite.webservices.transactions.inventory.WorkOrderIssue;
import com.netsuite.webservices.transactions.purchases.ItemReceipt;
import com.netsuite.webservices.transactions.purchases.PurchaseOrder;
import com.netsuite.webservices.transactions.purchases.VendorBill;
import com.netsuite.webservices.transactions.purchases.VendorCredit;
import com.netsuite.webservices.transactions.purchases.VendorPayment;
import com.netsuite.webservices.transactions.purchases.VendorReturnAuthorization;
import com.netsuite.webservices.transactions.sales.CashSale;
import com.netsuite.webservices.transactions.sales.Estimate;
import com.netsuite.webservices.transactions.sales.Invoice;
import com.netsuite.webservices.transactions.sales.ItemFulfillment;
import com.netsuite.webservices.transactions.sales.Opportunity;
import com.netsuite.webservices.transactions.sales.SalesOrder;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nullFieldList" type="{urn:core_2014_2.platform.webservices.netsuite.com}NullField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
    "nullFieldList"
})
@XmlSeeAlso({
    Check.class,
    Deposit.class,
    Opportunity.class,
    SalesOrder.class,
    ItemFulfillment.class,
    Invoice.class,
    CashSale.class,
    Estimate.class,
    TimeBill.class,
    ExpenseReport.class,
    PaycheckJournal.class,
    TimeEntry.class,
    TimeSheet.class,
    JournalEntry.class,
    InterCompanyJournalEntry.class,
    StatisticalJournalEntry.class,
    ManufacturingCostTemplate.class,
    ManufacturingRouting.class,
    ManufacturingOperationTask.class,
    Note.class,
    Message.class,
    InventoryAdjustment.class,
    AssemblyBuild.class,
    AssemblyUnbuild.class,
    TransferOrder.class,
    InterCompanyTransferOrder.class,
    WorkOrder.class,
    InventoryTransfer.class,
    BinTransfer.class,
    BinWorksheet.class,
    WorkOrderIssue.class,
    WorkOrderCompletion.class,
    WorkOrderClose.class,
    InventoryCostRevaluation.class,
    CalendarEvent.class,
    Task.class,
    PhoneCall.class,
    ProjectTask.class,
    ResourceAllocation.class,
    SiteCategory.class,
    CustomRecord.class,
    CustomList.class,
    CustomRecordType.class,
    AppDefinition.class,
    AppPackage.class,
    CustomFieldType.class,
    Contact.class,
    Customer.class,
    CustomerStatus.class,
    Partner.class,
    Vendor.class,
    EntityGroup.class,
    Job.class,
    JobType.class,
    JobStatus.class,
    SupportCase.class,
    SupportCaseStatus.class,
    SupportCaseType.class,
    SupportCaseOrigin.class,
    SupportCaseIssue.class,
    SupportCasePriority.class,
    Solution.class,
    Topic.class,
    Issue.class,
    ContactCategory.class,
    CustomerCategory.class,
    SalesRole.class,
    PriceLevel.class,
    WinLossReason.class,
    Term.class,
    NoteType.class,
    PaymentMethod.class,
    LeadSource.class,
    InventoryItem.class,
    DescriptionItem.class,
    DiscountItem.class,
    DownloadItem.class,
    MarkupItem.class,
    PaymentItem.class,
    SubtotalItem.class,
    NonInventoryPurchaseItem.class,
    NonInventorySaleItem.class,
    NonInventoryResaleItem.class,
    OtherChargeResaleItem.class,
    OtherChargePurchaseItem.class,
    ServiceResaleItem.class,
    ServicePurchaseItem.class,
    ServiceSaleItem.class,
    OtherChargeSaleItem.class,
    Currency.class,
    ExpenseCategory.class,
    Account.class,
    Department.class,
    Classification.class,
    Location.class,
    UnitsType.class,
    ContactRole.class,
    Bin.class,
    SalesTaxItem.class,
    TaxGroup.class,
    TaxType.class,
    SerializedInventoryItem.class,
    LotNumberedInventoryItem.class,
    GiftCertificateItem.class,
    Subsidiary.class,
    GiftCertificate.class,
    PartnerCategory.class,
    VendorCategory.class,
    KitItem.class,
    AssemblyItem.class,
    SerializedAssemblyItem.class,
    LotNumberedAssemblyItem.class,
    State.class,
    AccountingPeriod.class,
    BudgetCategory.class,
    PricingGroup.class,
    InventoryNumber.class,
    RevRecSchedule.class,
    RevRecTemplate.class,
    CostCategory.class,
    Nexus.class,
    CustomerMessage.class,
    OtherNameCategory.class,
    ItemGroup.class,
    CurrencyRate.class,
    ItemRevision.class,
    TaxAcct.class,
    BillingSchedule.class,
    GlobalAccountMapping.class,
    ItemAccountMapping.class,
    Campaign.class,
    CampaignCategory.class,
    CampaignAudience.class,
    CampaignFamily.class,
    CampaignSearchEngine.class,
    CampaignChannel.class,
    CampaignOffer.class,
    CampaignResponse.class,
    CampaignVertical.class,
    CampaignSubscription.class,
    PromotionCode.class,
    CouponCode.class,
    Budget.class,
    VendorBill.class,
    PurchaseOrder.class,
    ItemReceipt.class,
    VendorPayment.class,
    VendorCredit.class,
    VendorReturnAuthorization.class,
    File.class,
    Folder.class,
    ItemDemandPlan.class,
    ItemSupplyPlan.class,
    CashRefund.class,
    CustomerPayment.class,
    ReturnAuthorization.class,
    CreditMemo.class,
    CustomerRefund.class,
    CustomerDeposit.class,
    DepositApplication.class,
    Charge.class,
    Address.class,
    LandedCost.class,
    InventoryDetail.class,
    Employee.class,
    PayrollItem.class
})
public abstract class Record {

    protected NullField nullFieldList;

    /**
     * Gets the value of the nullFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link NullField }
     *     
     */
    public NullField getNullFieldList() {
        return nullFieldList;
    }

    /**
     * Sets the value of the nullFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullField }
     *     
     */
    public void setNullFieldList(NullField value) {
        this.nullFieldList = value;
    }

}
