
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common.AccountingPeriodSearchRowBasic;
import com.netsuite.webservices.platform.common.AccountingTransactionSearchRowBasic;
import com.netsuite.webservices.platform.common.AppDefinitionSearchRowBasic;
import com.netsuite.webservices.platform.common.AppPackageSearchRowBasic;
import com.netsuite.webservices.platform.common.BillingScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common.BinSearchRowBasic;
import com.netsuite.webservices.platform.common.BudgetSearchRowBasic;
import com.netsuite.webservices.platform.common.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common.ChargeSearchRowBasic;
import com.netsuite.webservices.platform.common.ClassificationSearchRowBasic;
import com.netsuite.webservices.platform.common.ContactCategorySearchRowBasic;
import com.netsuite.webservices.platform.common.ContactRoleSearchRowBasic;
import com.netsuite.webservices.platform.common.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common.CouponCodeSearchRowBasic;
import com.netsuite.webservices.platform.common.CurrencyRateSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomListSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomRecordSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomerCategorySearchRowBasic;
import com.netsuite.webservices.platform.common.CustomerMessageSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomerStatusSearchRowBasic;
import com.netsuite.webservices.platform.common.DepartmentSearchRowBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common.EntityGroupSearchRowBasic;
import com.netsuite.webservices.platform.common.EntitySearchRowBasic;
import com.netsuite.webservices.platform.common.ExpenseCategorySearchRowBasic;
import com.netsuite.webservices.platform.common.FileSearchRowBasic;
import com.netsuite.webservices.platform.common.FolderSearchRowBasic;
import com.netsuite.webservices.platform.common.GiftCertificateSearchRowBasic;
import com.netsuite.webservices.platform.common.GlobalAccountMappingSearchRowBasic;
import com.netsuite.webservices.platform.common.InventoryDetailSearchRowBasic;
import com.netsuite.webservices.platform.common.InventoryNumberBinSearchRowBasic;
import com.netsuite.webservices.platform.common.InventoryNumberSearchRowBasic;
import com.netsuite.webservices.platform.common.IssueSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemAccountMappingSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemBinNumberSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemDemandPlanSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemRevisionSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemSupplyPlanSearchRowBasic;
import com.netsuite.webservices.platform.common.JobSearchRowBasic;
import com.netsuite.webservices.platform.common.JobStatusSearchRowBasic;
import com.netsuite.webservices.platform.common.JobTypeSearchRowBasic;
import com.netsuite.webservices.platform.common.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common.ManufacturingCostTemplateSearchRowBasic;
import com.netsuite.webservices.platform.common.ManufacturingOperationTaskSearchRowBasic;
import com.netsuite.webservices.platform.common.ManufacturingRoutingSearchRowBasic;
import com.netsuite.webservices.platform.common.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common.NexusSearchRowBasic;
import com.netsuite.webservices.platform.common.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common.NoteTypeSearchRowBasic;
import com.netsuite.webservices.platform.common.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common.OriginatingLeadSearchRowBasic;
import com.netsuite.webservices.platform.common.OtherNameCategorySearchRowBasic;
import com.netsuite.webservices.platform.common.PartnerCategorySearchRowBasic;
import com.netsuite.webservices.platform.common.PartnerSearchRowBasic;
import com.netsuite.webservices.platform.common.PaymentMethodSearchRowBasic;
import com.netsuite.webservices.platform.common.PayrollItemSearchRowBasic;
import com.netsuite.webservices.platform.common.PhoneCallSearchRowBasic;
import com.netsuite.webservices.platform.common.PriceLevelSearchRowBasic;
import com.netsuite.webservices.platform.common.PricingGroupSearchRowBasic;
import com.netsuite.webservices.platform.common.PricingSearchRowBasic;
import com.netsuite.webservices.platform.common.ProjectTaskAssignmentSearchRowBasic;
import com.netsuite.webservices.platform.common.ProjectTaskSearchRowBasic;
import com.netsuite.webservices.platform.common.PromotionCodeSearchRowBasic;
import com.netsuite.webservices.platform.common.ResourceAllocationSearchRowBasic;
import com.netsuite.webservices.platform.common.RevRecScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common.RevRecTemplateSearchRowBasic;
import com.netsuite.webservices.platform.common.SalesRoleSearchRowBasic;
import com.netsuite.webservices.platform.common.SiteCategorySearchRowBasic;
import com.netsuite.webservices.platform.common.SolutionSearchRowBasic;
import com.netsuite.webservices.platform.common.SubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.common.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common.TermSearchRowBasic;
import com.netsuite.webservices.platform.common.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.common.TimeEntrySearchRowBasic;
import com.netsuite.webservices.platform.common.TimeSheetSearchRowBasic;
import com.netsuite.webservices.platform.common.TopicSearchRowBasic;
import com.netsuite.webservices.platform.common.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common.UnitsTypeSearchRowBasic;
import com.netsuite.webservices.platform.common.VendorCategorySearchRowBasic;
import com.netsuite.webservices.platform.common.VendorSearchRowBasic;
import com.netsuite.webservices.platform.common.WinLossReasonSearchRowBasic;


/**
 * <p>Java class for SearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRowBasic")
@XmlSeeAlso({
    InventoryDetailSearchRowBasic.class,
    EntitySearchRowBasic.class,
    ContactSearchRowBasic.class,
    CustomerSearchRowBasic.class,
    CalendarEventSearchRowBasic.class,
    TaskSearchRowBasic.class,
    OpportunitySearchRowBasic.class,
    EmployeeSearchRowBasic.class,
    PhoneCallSearchRowBasic.class,
    SupportCaseSearchRowBasic.class,
    MessageSearchRowBasic.class,
    NoteSearchRowBasic.class,
    CustomRecordSearchRowBasic.class,
    AccountSearchRowBasic.class,
    RevRecScheduleSearchRowBasic.class,
    RevRecTemplateSearchRowBasic.class,
    BinSearchRowBasic.class,
    DepartmentSearchRowBasic.class,
    LocationSearchRowBasic.class,
    ClassificationSearchRowBasic.class,
    TransactionSearchRowBasic.class,
    ItemSearchRowBasic.class,
    PartnerSearchRowBasic.class,
    VendorSearchRowBasic.class,
    SiteCategorySearchRowBasic.class,
    TimeBillSearchRowBasic.class,
    SolutionSearchRowBasic.class,
    TopicSearchRowBasic.class,
    SubsidiarySearchRowBasic.class,
    GiftCertificateSearchRowBasic.class,
    FolderSearchRowBasic.class,
    FileSearchRowBasic.class,
    JobSearchRowBasic.class,
    IssueSearchRowBasic.class,
    CampaignSearchRowBasic.class,
    EntityGroupSearchRowBasic.class,
    PromotionCodeSearchRowBasic.class,
    BudgetSearchRowBasic.class,
    ProjectTaskSearchRowBasic.class,
    ProjectTaskAssignmentSearchRowBasic.class,
    AccountingPeriodSearchRowBasic.class,
    ContactCategorySearchRowBasic.class,
    ContactRoleSearchRowBasic.class,
    CustomerCategorySearchRowBasic.class,
    CustomerStatusSearchRowBasic.class,
    ExpenseCategorySearchRowBasic.class,
    JobStatusSearchRowBasic.class,
    JobTypeSearchRowBasic.class,
    NoteTypeSearchRowBasic.class,
    PartnerCategorySearchRowBasic.class,
    PaymentMethodSearchRowBasic.class,
    PriceLevelSearchRowBasic.class,
    SalesRoleSearchRowBasic.class,
    TermSearchRowBasic.class,
    VendorCategorySearchRowBasic.class,
    WinLossReasonSearchRowBasic.class,
    OriginatingLeadSearchRowBasic.class,
    UnitsTypeSearchRowBasic.class,
    CustomListSearchRowBasic.class,
    PricingGroupSearchRowBasic.class,
    InventoryNumberSearchRowBasic.class,
    InventoryNumberBinSearchRowBasic.class,
    ItemBinNumberSearchRowBasic.class,
    PricingSearchRowBasic.class,
    AppDefinitionSearchRowBasic.class,
    AppPackageSearchRowBasic.class,
    NexusSearchRowBasic.class,
    OtherNameCategorySearchRowBasic.class,
    CustomerMessageSearchRowBasic.class,
    ItemDemandPlanSearchRowBasic.class,
    ItemSupplyPlanSearchRowBasic.class,
    CurrencyRateSearchRowBasic.class,
    ItemRevisionSearchRowBasic.class,
    CouponCodeSearchRowBasic.class,
    PayrollItemSearchRowBasic.class,
    ManufacturingCostTemplateSearchRowBasic.class,
    ManufacturingRoutingSearchRowBasic.class,
    ManufacturingOperationTaskSearchRowBasic.class,
    ResourceAllocationSearchRowBasic.class,
    ChargeSearchRowBasic.class,
    BillingScheduleSearchRowBasic.class,
    GlobalAccountMappingSearchRowBasic.class,
    ItemAccountMappingSearchRowBasic.class,
    TimeEntrySearchRowBasic.class,
    TimeSheetSearchRowBasic.class,
    AccountingTransactionSearchRowBasic.class
})
public abstract class SearchRowBasic
    extends SearchRow
{


}
