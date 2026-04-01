
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AccountSearchBasic;
import com.netsuite.webservices.platform.common.AccountingPeriodSearchBasic;
import com.netsuite.webservices.platform.common.AccountingTransactionSearchBasic;
import com.netsuite.webservices.platform.common.AppDefinitionSearchBasic;
import com.netsuite.webservices.platform.common.AppPackageSearchBasic;
import com.netsuite.webservices.platform.common.BillingScheduleSearchBasic;
import com.netsuite.webservices.platform.common.BinSearchBasic;
import com.netsuite.webservices.platform.common.BudgetSearchBasic;
import com.netsuite.webservices.platform.common.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common.CampaignSearchBasic;
import com.netsuite.webservices.platform.common.ChargeSearchBasic;
import com.netsuite.webservices.platform.common.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common.ContactCategorySearchBasic;
import com.netsuite.webservices.platform.common.ContactRoleSearchBasic;
import com.netsuite.webservices.platform.common.ContactSearchBasic;
import com.netsuite.webservices.platform.common.CouponCodeSearchBasic;
import com.netsuite.webservices.platform.common.CurrencyRateSearchBasic;
import com.netsuite.webservices.platform.common.CustomListSearchBasic;
import com.netsuite.webservices.platform.common.CustomRecordSearchBasic;
import com.netsuite.webservices.platform.common.CustomerCategorySearchBasic;
import com.netsuite.webservices.platform.common.CustomerMessageSearchBasic;
import com.netsuite.webservices.platform.common.CustomerSearchBasic;
import com.netsuite.webservices.platform.common.CustomerStatusSearchBasic;
import com.netsuite.webservices.platform.common.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common.EntityGroupSearchBasic;
import com.netsuite.webservices.platform.common.EntitySearchBasic;
import com.netsuite.webservices.platform.common.ExpenseCategorySearchBasic;
import com.netsuite.webservices.platform.common.FileSearchBasic;
import com.netsuite.webservices.platform.common.FolderSearchBasic;
import com.netsuite.webservices.platform.common.GiftCertificateSearchBasic;
import com.netsuite.webservices.platform.common.GlobalAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common.GroupMemberSearchBasic;
import com.netsuite.webservices.platform.common.InventoryDetailSearchBasic;
import com.netsuite.webservices.platform.common.InventoryNumberBinSearchBasic;
import com.netsuite.webservices.platform.common.InventoryNumberSearchBasic;
import com.netsuite.webservices.platform.common.IssueSearchBasic;
import com.netsuite.webservices.platform.common.ItemAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common.ItemBinNumberSearchBasic;
import com.netsuite.webservices.platform.common.ItemDemandPlanSearchBasic;
import com.netsuite.webservices.platform.common.ItemRevisionSearchBasic;
import com.netsuite.webservices.platform.common.ItemSearchBasic;
import com.netsuite.webservices.platform.common.ItemSupplyPlanSearchBasic;
import com.netsuite.webservices.platform.common.JobSearchBasic;
import com.netsuite.webservices.platform.common.JobStatusSearchBasic;
import com.netsuite.webservices.platform.common.JobTypeSearchBasic;
import com.netsuite.webservices.platform.common.LocationSearchBasic;
import com.netsuite.webservices.platform.common.ManufacturingCostTemplateSearchBasic;
import com.netsuite.webservices.platform.common.ManufacturingOperationTaskSearchBasic;
import com.netsuite.webservices.platform.common.ManufacturingRoutingSearchBasic;
import com.netsuite.webservices.platform.common.MessageSearchBasic;
import com.netsuite.webservices.platform.common.NexusSearchBasic;
import com.netsuite.webservices.platform.common.NoteSearchBasic;
import com.netsuite.webservices.platform.common.NoteTypeSearchBasic;
import com.netsuite.webservices.platform.common.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common.OtherNameCategorySearchBasic;
import com.netsuite.webservices.platform.common.PartnerCategorySearchBasic;
import com.netsuite.webservices.platform.common.PartnerSearchBasic;
import com.netsuite.webservices.platform.common.PaymentMethodSearchBasic;
import com.netsuite.webservices.platform.common.PayrollItemSearchBasic;
import com.netsuite.webservices.platform.common.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common.PriceLevelSearchBasic;
import com.netsuite.webservices.platform.common.PricingGroupSearchBasic;
import com.netsuite.webservices.platform.common.PricingSearchBasic;
import com.netsuite.webservices.platform.common.ProjectTaskAssignmentSearchBasic;
import com.netsuite.webservices.platform.common.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common.PromotionCodeSearchBasic;
import com.netsuite.webservices.platform.common.ResourceAllocationSearchBasic;
import com.netsuite.webservices.platform.common.RevRecScheduleSearchBasic;
import com.netsuite.webservices.platform.common.RevRecTemplateSearchBasic;
import com.netsuite.webservices.platform.common.SalesRoleSearchBasic;
import com.netsuite.webservices.platform.common.SiteCategorySearchBasic;
import com.netsuite.webservices.platform.common.SolutionSearchBasic;
import com.netsuite.webservices.platform.common.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.common.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common.TaskSearchBasic;
import com.netsuite.webservices.platform.common.TermSearchBasic;
import com.netsuite.webservices.platform.common.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common.TimeEntrySearchBasic;
import com.netsuite.webservices.platform.common.TimeSheetSearchBasic;
import com.netsuite.webservices.platform.common.TopicSearchBasic;
import com.netsuite.webservices.platform.common.TransactionSearchBasic;
import com.netsuite.webservices.platform.common.UnitsTypeSearchBasic;
import com.netsuite.webservices.platform.common.VendorCategorySearchBasic;
import com.netsuite.webservices.platform.common.VendorSearchBasic;
import com.netsuite.webservices.platform.common.WinLossReasonSearchBasic;


/**
 * <p>Java class for SearchRecordBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecordBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecordBasic")
@XmlSeeAlso({
    InventoryDetailSearchBasic.class,
    EntitySearchBasic.class,
    ContactSearchBasic.class,
    CustomerSearchBasic.class,
    CalendarEventSearchBasic.class,
    TaskSearchBasic.class,
    OpportunitySearchBasic.class,
    EmployeeSearchBasic.class,
    PhoneCallSearchBasic.class,
    SupportCaseSearchBasic.class,
    MessageSearchBasic.class,
    NoteSearchBasic.class,
    CustomRecordSearchBasic.class,
    AccountSearchBasic.class,
    RevRecScheduleSearchBasic.class,
    RevRecTemplateSearchBasic.class,
    BinSearchBasic.class,
    DepartmentSearchBasic.class,
    LocationSearchBasic.class,
    ClassificationSearchBasic.class,
    TransactionSearchBasic.class,
    ItemSearchBasic.class,
    PartnerSearchBasic.class,
    VendorSearchBasic.class,
    SiteCategorySearchBasic.class,
    TimeBillSearchBasic.class,
    SolutionSearchBasic.class,
    TopicSearchBasic.class,
    SubsidiarySearchBasic.class,
    GiftCertificateSearchBasic.class,
    FolderSearchBasic.class,
    FileSearchBasic.class,
    JobSearchBasic.class,
    IssueSearchBasic.class,
    GroupMemberSearchBasic.class,
    CampaignSearchBasic.class,
    EntityGroupSearchBasic.class,
    PromotionCodeSearchBasic.class,
    BudgetSearchBasic.class,
    ProjectTaskSearchBasic.class,
    ProjectTaskAssignmentSearchBasic.class,
    AccountingPeriodSearchBasic.class,
    ContactCategorySearchBasic.class,
    ContactRoleSearchBasic.class,
    CustomerCategorySearchBasic.class,
    CustomerStatusSearchBasic.class,
    ExpenseCategorySearchBasic.class,
    JobStatusSearchBasic.class,
    JobTypeSearchBasic.class,
    NoteTypeSearchBasic.class,
    PartnerCategorySearchBasic.class,
    PaymentMethodSearchBasic.class,
    PriceLevelSearchBasic.class,
    SalesRoleSearchBasic.class,
    TermSearchBasic.class,
    VendorCategorySearchBasic.class,
    WinLossReasonSearchBasic.class,
    OriginatingLeadSearchBasic.class,
    UnitsTypeSearchBasic.class,
    CustomListSearchBasic.class,
    PricingGroupSearchBasic.class,
    InventoryNumberSearchBasic.class,
    InventoryNumberBinSearchBasic.class,
    ItemBinNumberSearchBasic.class,
    PricingSearchBasic.class,
    AppDefinitionSearchBasic.class,
    AppPackageSearchBasic.class,
    NexusSearchBasic.class,
    OtherNameCategorySearchBasic.class,
    CustomerMessageSearchBasic.class,
    ItemDemandPlanSearchBasic.class,
    ItemSupplyPlanSearchBasic.class,
    CurrencyRateSearchBasic.class,
    ItemRevisionSearchBasic.class,
    CouponCodeSearchBasic.class,
    PayrollItemSearchBasic.class,
    ManufacturingCostTemplateSearchBasic.class,
    ManufacturingRoutingSearchBasic.class,
    ManufacturingOperationTaskSearchBasic.class,
    ResourceAllocationSearchBasic.class,
    ChargeSearchBasic.class,
    BillingScheduleSearchBasic.class,
    GlobalAccountMappingSearchBasic.class,
    ItemAccountMappingSearchBasic.class,
    TimeEntrySearchBasic.class,
    TimeSheetSearchBasic.class,
    AccountingTransactionSearchBasic.class
})
public abstract class SearchRecordBasic
    extends SearchRecord
{


}
