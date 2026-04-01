
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling.CalendarEventSearch;
import com.netsuite.webservices.activities.scheduling.CalendarEventSearchAdvanced;
import com.netsuite.webservices.activities.scheduling.PhoneCallSearch;
import com.netsuite.webservices.activities.scheduling.PhoneCallSearchAdvanced;
import com.netsuite.webservices.activities.scheduling.ProjectTaskSearch;
import com.netsuite.webservices.activities.scheduling.ProjectTaskSearchAdvanced;
import com.netsuite.webservices.activities.scheduling.ResourceAllocationSearch;
import com.netsuite.webservices.activities.scheduling.ResourceAllocationSearchAdvanced;
import com.netsuite.webservices.activities.scheduling.TaskSearch;
import com.netsuite.webservices.activities.scheduling.TaskSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet.FileSearch;
import com.netsuite.webservices.documents.filecabinet.FileSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet.FolderSearch;
import com.netsuite.webservices.documents.filecabinet.FolderSearchAdvanced;
import com.netsuite.webservices.general.communication.MessageSearch;
import com.netsuite.webservices.general.communication.MessageSearchAdvanced;
import com.netsuite.webservices.general.communication.NoteSearch;
import com.netsuite.webservices.general.communication.NoteSearchAdvanced;
import com.netsuite.webservices.lists.accounting.AccountSearch;
import com.netsuite.webservices.lists.accounting.AccountSearchAdvanced;
import com.netsuite.webservices.lists.accounting.AccountingPeriodSearch;
import com.netsuite.webservices.lists.accounting.AccountingPeriodSearchAdvanced;
import com.netsuite.webservices.lists.accounting.BillingScheduleSearch;
import com.netsuite.webservices.lists.accounting.BillingScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting.BinSearch;
import com.netsuite.webservices.lists.accounting.BinSearchAdvanced;
import com.netsuite.webservices.lists.accounting.ClassificationSearch;
import com.netsuite.webservices.lists.accounting.ClassificationSearchAdvanced;
import com.netsuite.webservices.lists.accounting.ContactCategorySearch;
import com.netsuite.webservices.lists.accounting.ContactCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting.ContactRoleSearch;
import com.netsuite.webservices.lists.accounting.ContactRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting.CurrencyRateSearch;
import com.netsuite.webservices.lists.accounting.CurrencyRateSearchAdvanced;
import com.netsuite.webservices.lists.accounting.CustomerCategorySearch;
import com.netsuite.webservices.lists.accounting.CustomerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting.CustomerMessageSearch;
import com.netsuite.webservices.lists.accounting.CustomerMessageSearchAdvanced;
import com.netsuite.webservices.lists.accounting.DepartmentSearch;
import com.netsuite.webservices.lists.accounting.DepartmentSearchAdvanced;
import com.netsuite.webservices.lists.accounting.ExpenseCategorySearch;
import com.netsuite.webservices.lists.accounting.ExpenseCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting.GiftCertificateSearch;
import com.netsuite.webservices.lists.accounting.GiftCertificateSearchAdvanced;
import com.netsuite.webservices.lists.accounting.GlobalAccountMappingSearch;
import com.netsuite.webservices.lists.accounting.GlobalAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting.InventoryNumberSearch;
import com.netsuite.webservices.lists.accounting.InventoryNumberSearchAdvanced;
import com.netsuite.webservices.lists.accounting.ItemAccountMappingSearch;
import com.netsuite.webservices.lists.accounting.ItemAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting.ItemRevisionSearch;
import com.netsuite.webservices.lists.accounting.ItemRevisionSearchAdvanced;
import com.netsuite.webservices.lists.accounting.ItemSearch;
import com.netsuite.webservices.lists.accounting.ItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting.LocationSearch;
import com.netsuite.webservices.lists.accounting.LocationSearchAdvanced;
import com.netsuite.webservices.lists.accounting.NexusSearch;
import com.netsuite.webservices.lists.accounting.NexusSearchAdvanced;
import com.netsuite.webservices.lists.accounting.NoteTypeSearch;
import com.netsuite.webservices.lists.accounting.NoteTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting.OtherNameCategorySearch;
import com.netsuite.webservices.lists.accounting.OtherNameCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting.PartnerCategorySearch;
import com.netsuite.webservices.lists.accounting.PartnerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting.PaymentMethodSearch;
import com.netsuite.webservices.lists.accounting.PaymentMethodSearchAdvanced;
import com.netsuite.webservices.lists.accounting.PriceLevelSearch;
import com.netsuite.webservices.lists.accounting.PriceLevelSearchAdvanced;
import com.netsuite.webservices.lists.accounting.PricingGroupSearch;
import com.netsuite.webservices.lists.accounting.PricingGroupSearchAdvanced;
import com.netsuite.webservices.lists.accounting.RevRecScheduleSearch;
import com.netsuite.webservices.lists.accounting.RevRecScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting.RevRecTemplateSearch;
import com.netsuite.webservices.lists.accounting.RevRecTemplateSearchAdvanced;
import com.netsuite.webservices.lists.accounting.SalesRoleSearch;
import com.netsuite.webservices.lists.accounting.SalesRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting.SubsidiarySearch;
import com.netsuite.webservices.lists.accounting.SubsidiarySearchAdvanced;
import com.netsuite.webservices.lists.accounting.TermSearch;
import com.netsuite.webservices.lists.accounting.TermSearchAdvanced;
import com.netsuite.webservices.lists.accounting.UnitsTypeSearch;
import com.netsuite.webservices.lists.accounting.UnitsTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting.VendorCategorySearch;
import com.netsuite.webservices.lists.accounting.VendorCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting.WinLossReasonSearch;
import com.netsuite.webservices.lists.accounting.WinLossReasonSearchAdvanced;
import com.netsuite.webservices.lists.employees.EmployeeSearch;
import com.netsuite.webservices.lists.employees.EmployeeSearchAdvanced;
import com.netsuite.webservices.lists.employees.PayrollItemSearch;
import com.netsuite.webservices.lists.employees.PayrollItemSearchAdvanced;
import com.netsuite.webservices.lists.marketing.CampaignSearch;
import com.netsuite.webservices.lists.marketing.CampaignSearchAdvanced;
import com.netsuite.webservices.lists.marketing.CouponCodeSearch;
import com.netsuite.webservices.lists.marketing.CouponCodeSearchAdvanced;
import com.netsuite.webservices.lists.marketing.PromotionCodeSearch;
import com.netsuite.webservices.lists.marketing.PromotionCodeSearchAdvanced;
import com.netsuite.webservices.lists.relationships.ContactSearch;
import com.netsuite.webservices.lists.relationships.ContactSearchAdvanced;
import com.netsuite.webservices.lists.relationships.CustomerSearch;
import com.netsuite.webservices.lists.relationships.CustomerSearchAdvanced;
import com.netsuite.webservices.lists.relationships.CustomerStatusSearch;
import com.netsuite.webservices.lists.relationships.CustomerStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships.EntityGroupSearch;
import com.netsuite.webservices.lists.relationships.EntityGroupSearchAdvanced;
import com.netsuite.webservices.lists.relationships.JobSearch;
import com.netsuite.webservices.lists.relationships.JobSearchAdvanced;
import com.netsuite.webservices.lists.relationships.JobStatusSearch;
import com.netsuite.webservices.lists.relationships.JobStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships.JobTypeSearch;
import com.netsuite.webservices.lists.relationships.JobTypeSearchAdvanced;
import com.netsuite.webservices.lists.relationships.OriginatingLeadSearch;
import com.netsuite.webservices.lists.relationships.PartnerSearch;
import com.netsuite.webservices.lists.relationships.PartnerSearchAdvanced;
import com.netsuite.webservices.lists.relationships.VendorSearch;
import com.netsuite.webservices.lists.relationships.VendorSearchAdvanced;
import com.netsuite.webservices.lists.supplychain.ManufacturingCostTemplateSearch;
import com.netsuite.webservices.lists.supplychain.ManufacturingCostTemplateSearchAdvanced;
import com.netsuite.webservices.lists.supplychain.ManufacturingOperationTaskSearch;
import com.netsuite.webservices.lists.supplychain.ManufacturingOperationTaskSearchAdvanced;
import com.netsuite.webservices.lists.supplychain.ManufacturingRoutingSearch;
import com.netsuite.webservices.lists.supplychain.ManufacturingRoutingSearchAdvanced;
import com.netsuite.webservices.lists.support.IssueSearch;
import com.netsuite.webservices.lists.support.IssueSearchAdvanced;
import com.netsuite.webservices.lists.support.SolutionSearch;
import com.netsuite.webservices.lists.support.SolutionSearchAdvanced;
import com.netsuite.webservices.lists.support.SupportCaseSearch;
import com.netsuite.webservices.lists.support.SupportCaseSearchAdvanced;
import com.netsuite.webservices.lists.support.TopicSearch;
import com.netsuite.webservices.lists.support.TopicSearchAdvanced;
import com.netsuite.webservices.lists.website.SiteCategorySearch;
import com.netsuite.webservices.lists.website.SiteCategorySearchAdvanced;
import com.netsuite.webservices.setup.customization.AppDefinitionSearch;
import com.netsuite.webservices.setup.customization.AppDefinitionSearchAdvanced;
import com.netsuite.webservices.setup.customization.AppPackageSearch;
import com.netsuite.webservices.setup.customization.AppPackageSearchAdvanced;
import com.netsuite.webservices.setup.customization.CustomListSearch;
import com.netsuite.webservices.setup.customization.CustomListSearchAdvanced;
import com.netsuite.webservices.setup.customization.CustomRecordSearch;
import com.netsuite.webservices.setup.customization.CustomRecordSearchAdvanced;
import com.netsuite.webservices.transactions.customers.ChargeSearch;
import com.netsuite.webservices.transactions.customers.ChargeSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning.ItemDemandPlanSearch;
import com.netsuite.webservices.transactions.demandplanning.ItemDemandPlanSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning.ItemSupplyPlanSearch;
import com.netsuite.webservices.transactions.demandplanning.ItemSupplyPlanSearchAdvanced;
import com.netsuite.webservices.transactions.employees.TimeBillSearch;
import com.netsuite.webservices.transactions.employees.TimeBillSearchAdvanced;
import com.netsuite.webservices.transactions.employees.TimeEntrySearch;
import com.netsuite.webservices.transactions.employees.TimeEntrySearchAdvanced;
import com.netsuite.webservices.transactions.employees.TimeSheetSearch;
import com.netsuite.webservices.transactions.employees.TimeSheetSearchAdvanced;
import com.netsuite.webservices.transactions.financial.BudgetSearch;
import com.netsuite.webservices.transactions.financial.BudgetSearchAdvanced;
import com.netsuite.webservices.transactions.sales.AccountingTransactionSearch;
import com.netsuite.webservices.transactions.sales.AccountingTransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales.OpportunitySearch;
import com.netsuite.webservices.transactions.sales.OpportunitySearchAdvanced;
import com.netsuite.webservices.transactions.sales.TransactionSearch;
import com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced;


/**
 * <p>Java class for SearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecord")
@XmlSeeAlso({
    OpportunitySearch.class,
    TransactionSearch.class,
    AccountingTransactionSearch.class,
    OpportunitySearchAdvanced.class,
    TransactionSearchAdvanced.class,
    AccountingTransactionSearchAdvanced.class,
    TimeBillSearch.class,
    TimeEntrySearch.class,
    TimeSheetSearch.class,
    TimeBillSearchAdvanced.class,
    TimeEntrySearchAdvanced.class,
    TimeSheetSearchAdvanced.class,
    ManufacturingCostTemplateSearch.class,
    ManufacturingRoutingSearch.class,
    ManufacturingOperationTaskSearch.class,
    ManufacturingCostTemplateSearchAdvanced.class,
    ManufacturingRoutingSearchAdvanced.class,
    ManufacturingOperationTaskSearchAdvanced.class,
    NoteSearch.class,
    MessageSearch.class,
    NoteSearchAdvanced.class,
    MessageSearchAdvanced.class,
    CalendarEventSearch.class,
    TaskSearch.class,
    PhoneCallSearch.class,
    ProjectTaskSearch.class,
    ResourceAllocationSearch.class,
    CalendarEventSearchAdvanced.class,
    TaskSearchAdvanced.class,
    PhoneCallSearchAdvanced.class,
    ProjectTaskSearchAdvanced.class,
    ResourceAllocationSearchAdvanced.class,
    SiteCategorySearch.class,
    SiteCategorySearchAdvanced.class,
    CustomRecordSearch.class,
    CustomListSearch.class,
    AppDefinitionSearch.class,
    AppPackageSearch.class,
    CustomRecordSearchAdvanced.class,
    CustomListSearchAdvanced.class,
    AppDefinitionSearchAdvanced.class,
    AppPackageSearchAdvanced.class,
    ContactSearch.class,
    CustomerSearch.class,
    PartnerSearch.class,
    VendorSearch.class,
    EntityGroupSearch.class,
    JobSearch.class,
    CustomerStatusSearch.class,
    JobStatusSearch.class,
    JobTypeSearch.class,
    OriginatingLeadSearch.class,
    ContactSearchAdvanced.class,
    CustomerSearchAdvanced.class,
    PartnerSearchAdvanced.class,
    VendorSearchAdvanced.class,
    EntityGroupSearchAdvanced.class,
    JobSearchAdvanced.class,
    CustomerStatusSearchAdvanced.class,
    JobStatusSearchAdvanced.class,
    JobTypeSearchAdvanced.class,
    SupportCaseSearch.class,
    SolutionSearch.class,
    TopicSearch.class,
    IssueSearch.class,
    SupportCaseSearchAdvanced.class,
    SolutionSearchAdvanced.class,
    TopicSearchAdvanced.class,
    IssueSearchAdvanced.class,
    AccountSearch.class,
    DepartmentSearch.class,
    ClassificationSearch.class,
    LocationSearch.class,
    ItemSearch.class,
    BinSearch.class,
    SubsidiarySearch.class,
    GiftCertificateSearch.class,
    AccountingPeriodSearch.class,
    ContactCategorySearch.class,
    ContactRoleSearch.class,
    CustomerCategorySearch.class,
    ExpenseCategorySearch.class,
    NoteTypeSearch.class,
    PartnerCategorySearch.class,
    PaymentMethodSearch.class,
    PriceLevelSearch.class,
    SalesRoleSearch.class,
    TermSearch.class,
    VendorCategorySearch.class,
    WinLossReasonSearch.class,
    UnitsTypeSearch.class,
    PricingGroupSearch.class,
    InventoryNumberSearch.class,
    RevRecScheduleSearch.class,
    RevRecTemplateSearch.class,
    NexusSearch.class,
    OtherNameCategorySearch.class,
    CustomerMessageSearch.class,
    CurrencyRateSearch.class,
    ItemRevisionSearch.class,
    BillingScheduleSearch.class,
    GlobalAccountMappingSearch.class,
    ItemAccountMappingSearch.class,
    AccountSearchAdvanced.class,
    DepartmentSearchAdvanced.class,
    ClassificationSearchAdvanced.class,
    LocationSearchAdvanced.class,
    ItemSearchAdvanced.class,
    BinSearchAdvanced.class,
    SubsidiarySearchAdvanced.class,
    GiftCertificateSearchAdvanced.class,
    AccountingPeriodSearchAdvanced.class,
    ContactCategorySearchAdvanced.class,
    ContactRoleSearchAdvanced.class,
    CustomerCategorySearchAdvanced.class,
    ExpenseCategorySearchAdvanced.class,
    NoteTypeSearchAdvanced.class,
    PartnerCategorySearchAdvanced.class,
    PaymentMethodSearchAdvanced.class,
    PriceLevelSearchAdvanced.class,
    SalesRoleSearchAdvanced.class,
    TermSearchAdvanced.class,
    VendorCategorySearchAdvanced.class,
    WinLossReasonSearchAdvanced.class,
    UnitsTypeSearchAdvanced.class,
    PricingGroupSearchAdvanced.class,
    InventoryNumberSearchAdvanced.class,
    RevRecScheduleSearchAdvanced.class,
    RevRecTemplateSearchAdvanced.class,
    NexusSearchAdvanced.class,
    OtherNameCategorySearchAdvanced.class,
    CustomerMessageSearchAdvanced.class,
    CurrencyRateSearchAdvanced.class,
    ItemRevisionSearchAdvanced.class,
    BillingScheduleSearchAdvanced.class,
    GlobalAccountMappingSearchAdvanced.class,
    ItemAccountMappingSearchAdvanced.class,
    CampaignSearch.class,
    PromotionCodeSearch.class,
    CouponCodeSearch.class,
    CampaignSearchAdvanced.class,
    PromotionCodeSearchAdvanced.class,
    CouponCodeSearchAdvanced.class,
    BudgetSearch.class,
    BudgetSearchAdvanced.class,
    FileSearch.class,
    FolderSearch.class,
    FileSearchAdvanced.class,
    FolderSearchAdvanced.class,
    ItemDemandPlanSearch.class,
    ItemSupplyPlanSearch.class,
    ItemDemandPlanSearchAdvanced.class,
    ItemSupplyPlanSearchAdvanced.class,
    ChargeSearch.class,
    ChargeSearchAdvanced.class,
    SearchRecordBasic.class,
    EmployeeSearch.class,
    PayrollItemSearch.class,
    EmployeeSearchAdvanced.class,
    PayrollItemSearchAdvanced.class
})
public abstract class SearchRecord {


}
