package org.talend.netsuite;

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
import com.netsuite.webservices.platform.common.AccountSearchBasic;
import com.netsuite.webservices.platform.common.AccountingPeriodSearchBasic;
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
import com.netsuite.webservices.platform.common.ExpenseCategorySearchBasic;
import com.netsuite.webservices.platform.common.FileSearchBasic;
import com.netsuite.webservices.platform.common.FolderSearchBasic;
import com.netsuite.webservices.platform.common.GiftCertificateSearchBasic;
import com.netsuite.webservices.platform.common.GlobalAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common.InventoryNumberSearchBasic;
import com.netsuite.webservices.platform.common.IssueSearchBasic;
import com.netsuite.webservices.platform.common.ItemAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common.ItemDemandPlanSearchBasic;
import com.netsuite.webservices.platform.common.ItemRevisionSearchBasic;
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
import com.netsuite.webservices.platform.common.OtherNameCategorySearchBasic;
import com.netsuite.webservices.platform.common.PartnerCategorySearchBasic;
import com.netsuite.webservices.platform.common.PartnerSearchBasic;
import com.netsuite.webservices.platform.common.PaymentMethodSearchBasic;
import com.netsuite.webservices.platform.common.PayrollItemSearchBasic;
import com.netsuite.webservices.platform.common.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common.PriceLevelSearchBasic;
import com.netsuite.webservices.platform.common.PricingGroupSearchBasic;
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

public class TalendComponentGenerator {

	private static Class<?> findClass(Class<?>[][] classlist, String classname, int key) {
		for (int i = 0; i < classlist.length; i++) {
			if (classlist[i][0].getName().equals(classname)) {
				return classlist[i][key];
			}
		}
		return null;
	}

	public static Class<?> findSearchBasicClass(String classname) {
		for (int i = 0; i < netSuiteClasses.length; i++) {
			if (netSuiteClasses[i][2].getSimpleName().equals(classname)) {
				return netSuiteClasses[i][2];
			}
		}
		return null;
	}

	public static Class<?> getEntityClass(String classname) {
		return findClass(netSuiteClasses, classname, 0);
	}

	public static Class<?> getSearchClass(String classname) {
		return findClass(netSuiteClasses, classname, 1);
	}

	public static Class<?> getSearchBasicClass(String classname) {
		return findClass(netSuiteClasses, classname, 2);
	}

	public static Class<?> getSearchAdvancedClass(String classname) {
		return findClass(netSuiteClasses, classname, 3);
	}

	public static String toInitialUpper(String value) {
		return value.substring(0, 1).toUpperCase() + value.substring(1);
	}

	public static String toInitialLower(String value) {
		return value.substring(0, 1).toLowerCase() + value.substring(1);
	}

	public static String toNetSuiteType(String value) {
		return "_" + toInitialLower(value);
	}
  
    public static String[] transactionTypeList = { "AssemblyBuild", "AssemblyUnbuild", "BinTransfer", "BinWorksheet", "CashRefund", "CashSale", "Check", "CreditMemo", "CustomerDeposit", "CustomerPayment", "CustomerRefund", "Deposit", "DepositApplication", "Estimate", "ExpenseReport", "InterCompanyJournalEntry", "InventoryAdjustment", "InventoryCostRevaluation", "InventoryTransfer", "Invoice", "ItemFulfillment", "ItemReceipt", "JournalEntry", "Opportunity", "PaycheckJournal", "PurchaseOrder", "ReturnAuthorization", "SalesOrder", "State", "TransferOrder", "VendorBill", "VendorCredit", "VendorPayment", "VendorReturnAuthorization", "WorkOrder", "WorkOrderClose", "WorkOrderCompletion", "WorkOrderIssue" };
    public static String[] itemTypeList = { "Address", "AssemblyItem", "BudgetCategory", "CampaignAudience", "CampaignCategory", "CampaignChannel", "CampaignFamily", "CampaignOffer", "CampaignResponse", "CampaignSearchEngine", "CampaignSubscription", "CampaignVertical", "CostCategory", "CrmCustomField", "Currency", "CustomFieldType", "CustomRecordCustomField", "CustomRecordType", "DescriptionItem", "DiscountItem", "DownloadItem", "EntityCustomField", "GiftCertificateItem", "InterCompanyTransferOrder", "InventoryItem", "ItemCustomField", "ItemGroup", "ItemNumberCustomField", "ItemOptionCustomField", "KitItem", "LandedCost", "LeadSource", "LotNumberedAssemblyItem", "LotNumberedInventoryItem", "MarkupItem", "NonInventoryPurchaseItem", "NonInventoryResaleItem", "NonInventorySaleItem", "OtherChargePurchaseItem", "OtherChargeResaleItem", "OtherChargeSaleItem", "OtherCustomField", "PaymentItem", "SalesTaxItem", "SerializedAssemblyItem", "SerializedInventoryItem", "ServicePurchaseItem", "ServiceResaleItem", "ServiceSaleItem", "SubtotalItem", "SupportCaseIssue", "SupportCaseOrigin", "SupportCasePriority", "SupportCaseStatus", "SupportCaseType", "TaxAcct", "TaxGroup", "TaxType", "TransactionBodyCustomField", "TransactionColumnCustomField" };
  
    public static final Class<?>[][] netSuiteClasses = {{com.netsuite.webservices.lists.accounting.Account.class, AccountSearch.class, AccountSearchBasic.class, AccountSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.AccountingPeriod.class, AccountingPeriodSearch.class, AccountingPeriodSearchBasic.class, AccountingPeriodSearchAdvanced.class},
    	{com.netsuite.webservices.setup.customization.AppDefinition.class, AppDefinitionSearch.class, AppDefinitionSearchBasic.class, AppDefinitionSearchAdvanced.class},
    	{com.netsuite.webservices.setup.customization.AppPackage.class, AppPackageSearch.class, AppPackageSearchBasic.class, AppPackageSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.BillingSchedule.class, BillingScheduleSearch.class, BillingScheduleSearchBasic.class, BillingScheduleSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.Bin.class, BinSearch.class, BinSearchBasic.class, BinSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.financial.Budget.class, BudgetSearch.class, BudgetSearchBasic.class, BudgetSearchAdvanced.class},
    	{com.netsuite.webservices.activities.scheduling.CalendarEvent.class, CalendarEventSearch.class, CalendarEventSearchBasic.class, CalendarEventSearchAdvanced.class},
    	{com.netsuite.webservices.lists.marketing.Campaign.class, CampaignSearch.class, CampaignSearchBasic.class, CampaignSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.Charge.class, ChargeSearch.class, ChargeSearchBasic.class, ChargeSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.Classification.class, ClassificationSearch.class, ClassificationSearchBasic.class, ClassificationSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.Contact.class, ContactSearch.class, ContactSearchBasic.class, ContactSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.ContactCategory.class, ContactCategorySearch.class, ContactCategorySearchBasic.class, ContactCategorySearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.ContactRole.class, ContactRoleSearch.class, ContactRoleSearchBasic.class, ContactRoleSearchAdvanced.class},
    	{com.netsuite.webservices.lists.marketing.CouponCode.class, CouponCodeSearch.class, CouponCodeSearchBasic.class, CouponCodeSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.CurrencyRate.class, CurrencyRateSearch.class, CurrencyRateSearchBasic.class, CurrencyRateSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.Customer.class, CustomerSearch.class, CustomerSearchBasic.class, CustomerSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.CustomerCategory.class, CustomerCategorySearch.class, CustomerCategorySearchBasic.class, CustomerCategorySearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.CustomerMessage.class, CustomerMessageSearch.class, CustomerMessageSearchBasic.class, CustomerMessageSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.CustomerStatus.class, CustomerStatusSearch.class, CustomerStatusSearchBasic.class, CustomerStatusSearchAdvanced.class},
    	{com.netsuite.webservices.setup.customization.CustomList.class, CustomListSearch.class, CustomListSearchBasic.class, CustomListSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.Department.class, DepartmentSearch.class, DepartmentSearchBasic.class, DepartmentSearchAdvanced.class},
    	{com.netsuite.webservices.lists.employees.Employee.class, EmployeeSearch.class, EmployeeSearchBasic.class, EmployeeSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.EntityGroup.class, EntityGroupSearch.class, EntityGroupSearchBasic.class, EntityGroupSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.ExpenseCategory.class, ExpenseCategorySearch.class, ExpenseCategorySearchBasic.class, ExpenseCategorySearchAdvanced.class},
    	{com.netsuite.webservices.documents.filecabinet.File.class, FileSearch.class, FileSearchBasic.class, FileSearchAdvanced.class},
    	{com.netsuite.webservices.documents.filecabinet.Folder.class, FolderSearch.class, FolderSearchBasic.class, FolderSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.GiftCertificate.class, GiftCertificateSearch.class, GiftCertificateSearchBasic.class, GiftCertificateSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.GlobalAccountMapping.class, GlobalAccountMappingSearch.class, GlobalAccountMappingSearchBasic.class, GlobalAccountMappingSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.InventoryNumber.class, InventoryNumberSearch.class, InventoryNumberSearchBasic.class, InventoryNumberSearchAdvanced.class},
    	{com.netsuite.webservices.lists.support.Issue.class, IssueSearch.class, IssueSearchBasic.class, IssueSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.ItemAccountMapping.class, ItemAccountMappingSearch.class, ItemAccountMappingSearchBasic.class, ItemAccountMappingSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.demandplanning.ItemDemandPlan.class, ItemDemandPlanSearch.class, ItemDemandPlanSearchBasic.class, ItemDemandPlanSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.ItemRevision.class, ItemRevisionSearch.class, ItemRevisionSearchBasic.class, ItemRevisionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.demandplanning.ItemSupplyPlan.class, ItemSupplyPlanSearch.class, ItemSupplyPlanSearchBasic.class, ItemSupplyPlanSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.Job.class, JobSearch.class, JobSearchBasic.class, JobSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.JobStatus.class, JobStatusSearch.class, JobStatusSearchBasic.class, JobStatusSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.JobType.class, JobTypeSearch.class, JobTypeSearchBasic.class, JobTypeSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.Location.class, LocationSearch.class, LocationSearchBasic.class, LocationSearchAdvanced.class},
    	{com.netsuite.webservices.lists.supplychain.ManufacturingCostTemplate.class, ManufacturingCostTemplateSearch.class, ManufacturingCostTemplateSearchBasic.class, ManufacturingCostTemplateSearchAdvanced.class},
    	{com.netsuite.webservices.lists.supplychain.ManufacturingOperationTask.class, ManufacturingOperationTaskSearch.class, ManufacturingOperationTaskSearchBasic.class, ManufacturingOperationTaskSearchAdvanced.class},
    	{com.netsuite.webservices.lists.supplychain.ManufacturingRouting.class, ManufacturingRoutingSearch.class, ManufacturingRoutingSearchBasic.class, ManufacturingRoutingSearchAdvanced.class},
    	{com.netsuite.webservices.general.communication.Message.class, MessageSearch.class, MessageSearchBasic.class, MessageSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.Nexus.class, NexusSearch.class, NexusSearchBasic.class, NexusSearchAdvanced.class},
    	{com.netsuite.webservices.general.communication.Note.class, NoteSearch.class, NoteSearchBasic.class, NoteSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.NoteType.class, NoteTypeSearch.class, NoteTypeSearchBasic.class, NoteTypeSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.OtherNameCategory.class, OtherNameCategorySearch.class, OtherNameCategorySearchBasic.class, OtherNameCategorySearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.Partner.class, PartnerSearch.class, PartnerSearchBasic.class, PartnerSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.PartnerCategory.class, PartnerCategorySearch.class, PartnerCategorySearchBasic.class, PartnerCategorySearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.PaymentMethod.class, PaymentMethodSearch.class, PaymentMethodSearchBasic.class, PaymentMethodSearchAdvanced.class},
    	{com.netsuite.webservices.lists.employees.PayrollItem.class, PayrollItemSearch.class, PayrollItemSearchBasic.class, PayrollItemSearchAdvanced.class},
    	{com.netsuite.webservices.activities.scheduling.PhoneCall.class, PhoneCallSearch.class, PhoneCallSearchBasic.class, PhoneCallSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.PriceLevel.class, PriceLevelSearch.class, PriceLevelSearchBasic.class, PriceLevelSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.PricingGroup.class, PricingGroupSearch.class, PricingGroupSearchBasic.class, PricingGroupSearchAdvanced.class},
    	{com.netsuite.webservices.activities.scheduling.ProjectTask.class, ProjectTaskSearch.class, ProjectTaskSearchBasic.class, ProjectTaskSearchAdvanced.class},
    	{com.netsuite.webservices.lists.marketing.PromotionCode.class, PromotionCodeSearch.class, PromotionCodeSearchBasic.class, PromotionCodeSearchAdvanced.class},
    	{com.netsuite.webservices.activities.scheduling.ResourceAllocation.class, ResourceAllocationSearch.class, ResourceAllocationSearchBasic.class, ResourceAllocationSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.RevRecSchedule.class, RevRecScheduleSearch.class, RevRecScheduleSearchBasic.class, RevRecScheduleSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.RevRecTemplate.class, RevRecTemplateSearch.class, RevRecTemplateSearchBasic.class, RevRecTemplateSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.SalesRole.class, SalesRoleSearch.class, SalesRoleSearchBasic.class, SalesRoleSearchAdvanced.class},
    	{com.netsuite.webservices.lists.website.SiteCategory.class, SiteCategorySearch.class, SiteCategorySearchBasic.class, SiteCategorySearchAdvanced.class},
    	{com.netsuite.webservices.lists.support.Solution.class, SolutionSearch.class, SolutionSearchBasic.class, SolutionSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.Subsidiary.class, SubsidiarySearch.class, SubsidiarySearchBasic.class, SubsidiarySearchAdvanced.class},
    	{com.netsuite.webservices.lists.support.SupportCase.class, SupportCaseSearch.class, SupportCaseSearchBasic.class, SupportCaseSearchAdvanced.class},
    	{com.netsuite.webservices.activities.scheduling.Task.class, TaskSearch.class, TaskSearchBasic.class, TaskSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.Term.class, TermSearch.class, TermSearchBasic.class, TermSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.employees.TimeBill.class, TimeBillSearch.class, TimeBillSearchBasic.class, TimeBillSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.employees.TimeEntry.class, TimeEntrySearch.class, TimeEntrySearchBasic.class, TimeEntrySearchAdvanced.class},
    	{com.netsuite.webservices.transactions.employees.TimeSheet.class, TimeSheetSearch.class, TimeSheetSearchBasic.class, TimeSheetSearchAdvanced.class},
    	{com.netsuite.webservices.lists.support.Topic.class, TopicSearch.class, TopicSearchBasic.class, TopicSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.UnitsType.class, UnitsTypeSearch.class, UnitsTypeSearchBasic.class, UnitsTypeSearchAdvanced.class},
    	{com.netsuite.webservices.lists.relationships.Vendor.class, VendorSearch.class, VendorSearchBasic.class, VendorSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.VendorCategory.class, VendorCategorySearch.class, VendorCategorySearchBasic.class, VendorCategorySearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.WinLossReason.class, WinLossReasonSearch.class, WinLossReasonSearchBasic.class, WinLossReasonSearchAdvanced.class},
    	
    	{com.netsuite.webservices.transactions.inventory.AssemblyBuild.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.AssemblyUnbuild.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.BinTransfer.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.BinWorksheet.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.CashRefund.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.sales.CashSale.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.bank.Check.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.CreditMemo.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.CustomerDeposit.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.CustomerPayment.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.CustomerRefund.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.bank.Deposit.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.DepositApplication.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.sales.Estimate.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.employees.ExpenseReport.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.general.InterCompanyJournalEntry.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.InventoryAdjustment.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.InventoryCostRevaluation.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.InventoryTransfer.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.sales.Invoice.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.sales.ItemFulfillment.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.purchases.ItemReceipt.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.general.JournalEntry.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.sales.Opportunity.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.employees.PaycheckJournal.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.purchases.PurchaseOrder.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.customers.ReturnAuthorization.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.sales.SalesOrder.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.lists.accounting.State.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.TransferOrder.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.purchases.VendorBill.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.purchases.VendorCredit.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.purchases.VendorPayment.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.purchases.VendorReturnAuthorization.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.WorkOrder.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.WorkOrderClose.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.WorkOrderCompletion.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class},
    	{com.netsuite.webservices.transactions.inventory.WorkOrderIssue.class, com.netsuite.webservices.transactions.sales.TransactionSearch.class, TransactionSearchBasic.class, com.netsuite.webservices.transactions.sales.TransactionSearchAdvanced.class}
    };
}