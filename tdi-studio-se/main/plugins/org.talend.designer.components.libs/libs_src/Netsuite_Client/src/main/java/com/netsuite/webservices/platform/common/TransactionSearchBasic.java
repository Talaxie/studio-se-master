
package com.netsuite.webservices.platform.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.types.PostingPeriodDate;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.platform.core.SearchBooleanField;
import com.netsuite.webservices.platform.core.SearchCustomFieldList;
import com.netsuite.webservices.platform.core.SearchDateField;
import com.netsuite.webservices.platform.core.SearchDoubleField;
import com.netsuite.webservices.platform.core.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core.SearchLongField;
import com.netsuite.webservices.platform.core.SearchMultiSelectField;
import com.netsuite.webservices.platform.core.SearchRecordBasic;
import com.netsuite.webservices.platform.core.SearchStringField;
import com.netsuite.webservices.platform.core.SearchTextNumberField;


/**
 * <p>Java class for TransactionSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="actualShipDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="altSalesAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="altSalesNetAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="amountPaid" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="amountRemaining" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="amountUnbilled" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="anyLineItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="appliedToForeignAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="appliedToIsFxVariance" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="appliedToLinkAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="appliedToLinkType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="appliedToTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="applyingForeignAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="applyingIsFxVariance" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="applyingLinkAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="applyingLinkType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="applyingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="approvalStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="authCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="autoCalculateLag" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="avsStreetMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="avsZipMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="billable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="billAddress" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="billAddressee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="billAttention" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="billCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="billCountry" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="billCounty" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="billedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="billingSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="billingStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="billingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="billPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="billState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="billVarianceStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="billZip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="binNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="binNumberQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="bomQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="bookSpecificTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="buildEntireAssembly" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="buildVariance" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="built" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="catchUpPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="ccCustomerCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="ccExpireDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="ccName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="ccNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="chargeType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="cleared" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="closed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="closeDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="cogs" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="commissionEffectiveDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="commit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="componentYield" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="confirmationNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="contribution" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="costComponentAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="costComponentCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="costComponentItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="costComponentQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="costComponentStandardCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="costEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="createdBy" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="createdFrom" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="creditAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="cscMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="customerSubOf" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="custType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="dateCreated" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="daysOpen" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="daysOverdue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="debitAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="deferredRevenue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="deferRevRec" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="depositDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="depositTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="drAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="employee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="entityStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="estGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="estGrossProfitPct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="excludeCommission" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="excludeFromRateRequest" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="expectedCloseDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="expectedReceiptDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="expenseCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="expenseDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="finChrg" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="firmed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="forecastType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="fulfillingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="fxAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="fxAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="fxCostEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="fxCostEstimateRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="fxEstGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="fxTranCostEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="fxVsoeAllocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="fxVsoeAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="fxVsoePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvailabelToCharge" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvailableToRefund" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvsStreetMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvsZipMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="gcoBuyerAccountAge" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="gcoBuyerIp" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="gcoChargeAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoChargebackAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoConfirmedChargedTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoConfirmedRefundedTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoCreditcardNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="gcoCscMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="gcoFinancialState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="gcoFulfillmentState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="gcoOrderId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="gcoOrderTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoPromotionAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoPromotionName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="gcoRefundAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoShippingTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="gcoStateChangedDetail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertificate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="grossAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="includeInForecast" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="intercoStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="intercoTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="inVsoeBundle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isAllocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isBackflush" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isGcoChargeback" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isGcoChargeConfirmed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isGcoPaymentGuaranteed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isGcoRefundConfirmed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isIntercompanyAdjustment" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isMultiShipTo" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isPayPalMeth" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isReversal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isRevRecTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isScrap" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isShipAddress" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isTransferPriceCosting" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isVsoeAlloc" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isWip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="itemRevision" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="itemSubOf" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="landedCostPerLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="leadSource" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="mainLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="mainName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingRouting" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="matchBillToReceipt" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="memoMain" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="memorized" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="merchantAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="multiSubsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="nameText" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="netAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="nextApprover" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="nextBillDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="nonReimbursable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="opportunity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="orderPriority" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="otherRefNum" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchTextNumberField" minOccurs="0"/&gt;
 *         &lt;element name="otherRefNumNonDeposit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchTextNumberField" minOccurs="0"/&gt;
 *         &lt;element name="overheadParentItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="packageCount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="paidTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="partner" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="partnerContribution" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="partnerRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="partnerTeamMember" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="payingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="paymentApproved" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventHoldReason" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventPurchaseCardUsed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventPurchaseDataSent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventResult" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="payPalPending" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="payPalStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="payPalTranId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="pnRefNum" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="poAsText" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="posting" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="postingPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="postingPeriodRelative" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}PostingPeriodDate" minOccurs="0"/&gt;
 *         &lt;element name="priceLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="printedPickingTicket" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="probability" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="projectedAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="promoCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityBilled" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityPacked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityPicked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityRevCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityShipRecv" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="recognizedRevenue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="recordType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="refNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="revCommitStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="revCommittingStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="revCommittingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="revenueStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="reversalDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="reversalNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="revRecEndDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="revRecOnRevCommitment" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="revRecStartDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="revRecTermInMonths" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="salesEffectiveDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="salesOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="salesRep" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="salesTeamMember" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="salesTeamRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="schedulingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberCostAdjustment" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="serialNumbers" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shipAddressee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shipAttention" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shipCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shipComplete" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="shipCountry" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shipCounty" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shipDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="shipGroup" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="shipMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shipPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shipping" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="shipRecvStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="shipRecvStatusLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="shipState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shipZip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="statistical" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="taxItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="taxLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="taxPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="taxPeriodRelative" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}PostingPeriodDate" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="terms" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="toBeEmailed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="toBePrinted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="toSubsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="trackingNumbers" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="tranCostEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="tranDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="tranEstGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="tranEstGrossProfitPct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="tranFxEstGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="tranId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="tranIsVsoeBundle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="transactionDiscount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="transactionLineType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="transactionNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="transferLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityPacked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityPicked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityReceived" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityShipped" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="unitCostOverride" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="unitsType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vendType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="visibleToCustomer" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="voided" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="vsoeAllocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="vsoeAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDeferral" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDelivered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="vsoePermitDiscount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vsoePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="webSite" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchBasic", propOrder = {
    "account",
    "accountType",
    "actualShipDate",
    "altSalesAmount",
    "altSalesNetAmount",
    "amount",
    "amountPaid",
    "amountRemaining",
    "amountUnbilled",
    "anyLineItem",
    "appliedToForeignAmount",
    "appliedToIsFxVariance",
    "appliedToLinkAmount",
    "appliedToLinkType",
    "appliedToTransaction",
    "applyingForeignAmount",
    "applyingIsFxVariance",
    "applyingLinkAmount",
    "applyingLinkType",
    "applyingTransaction",
    "approvalStatus",
    "authCode",
    "autoCalculateLag",
    "avsStreetMatch",
    "avsZipMatch",
    "billable",
    "billAddress",
    "billAddressee",
    "billAttention",
    "billCity",
    "billCountry",
    "billCounty",
    "billedDate",
    "billingSchedule",
    "billingStatus",
    "billingTransaction",
    "billPhone",
    "billState",
    "billVarianceStatus",
    "billZip",
    "binNumber",
    "binNumberQuantity",
    "bomQuantity",
    "bookSpecificTransaction",
    "buildEntireAssembly",
    "buildVariance",
    "built",
    "catchUpPeriod",
    "ccCustomerCode",
    "ccExpireDate",
    "ccName",
    "ccNumber",
    "chargeType",
    "clazz",
    "cleared",
    "closed",
    "closeDate",
    "cogs",
    "commissionEffectiveDate",
    "commit",
    "componentYield",
    "confirmationNumber",
    "contribution",
    "costComponentAmount",
    "costComponentCategory",
    "costComponentItem",
    "costComponentQuantity",
    "costComponentStandardCost",
    "costEstimate",
    "costEstimateRate",
    "costEstimateType",
    "createdBy",
    "createdFrom",
    "creditAmount",
    "cscMatch",
    "currency",
    "customerSubOf",
    "customForm",
    "custType",
    "dateCreated",
    "daysOpen",
    "daysOverdue",
    "debitAmount",
    "deferredRevenue",
    "deferRevRec",
    "department",
    "depositDate",
    "depositTransaction",
    "drAccount",
    "dueDate",
    "email",
    "employee",
    "endDate",
    "entity",
    "entityStatus",
    "estGrossProfit",
    "estGrossProfitPct",
    "exchangeRate",
    "excludeCommission",
    "excludeFromRateRequest",
    "expectedCloseDate",
    "expectedReceiptDate",
    "expenseCategory",
    "expenseDate",
    "externalId",
    "externalIdString",
    "finChrg",
    "firmed",
    "forecastType",
    "fulfillingTransaction",
    "fxAccount",
    "fxAmount",
    "fxCostEstimate",
    "fxCostEstimateRate",
    "fxEstGrossProfit",
    "fxTranCostEstimate",
    "fxVsoeAllocation",
    "fxVsoeAmount",
    "fxVsoePrice",
    "gcoAvailabelToCharge",
    "gcoAvailableToRefund",
    "gcoAvsStreetMatch",
    "gcoAvsZipMatch",
    "gcoBuyerAccountAge",
    "gcoBuyerIp",
    "gcoChargeAmount",
    "gcoChargebackAmount",
    "gcoConfirmedChargedTotal",
    "gcoConfirmedRefundedTotal",
    "gcoCreditcardNumber",
    "gcoCscMatch",
    "gcoFinancialState",
    "gcoFulfillmentState",
    "gcoOrderId",
    "gcoOrderTotal",
    "gcoPromotionAmount",
    "gcoPromotionName",
    "gcoRefundAmount",
    "gcoShippingTotal",
    "gcoStateChangedDetail",
    "giftCertificate",
    "grossAmount",
    "includeInForecast",
    "intercoStatus",
    "intercoTransaction",
    "internalId",
    "internalIdNumber",
    "inVsoeBundle",
    "isAllocation",
    "isBackflush",
    "isGcoChargeback",
    "isGcoChargeConfirmed",
    "isGcoPaymentGuaranteed",
    "isGcoRefundConfirmed",
    "isIntercompanyAdjustment",
    "isMultiShipTo",
    "isPayPalMeth",
    "isReversal",
    "isRevRecTransaction",
    "isScrap",
    "isShipAddress",
    "isTransferPriceCosting",
    "isVsoeAlloc",
    "isWip",
    "item",
    "itemRevision",
    "itemSubOf",
    "landedCostPerLine",
    "lastModifiedDate",
    "leadSource",
    "location",
    "mainLine",
    "mainName",
    "manufacturingRouting",
    "matchBillToReceipt",
    "memo",
    "memoMain",
    "memorized",
    "merchantAccount",
    "message",
    "multiSubsidiary",
    "nameText",
    "netAmount",
    "nextApprover",
    "nextBillDate",
    "nonReimbursable",
    "number",
    "opportunity",
    "orderPriority",
    "otherRefNum",
    "otherRefNumNonDeposit",
    "overheadParentItem",
    "packageCount",
    "paidTransaction",
    "parent",
    "partner",
    "partnerContribution",
    "partnerRole",
    "partnerTeamMember",
    "payingTransaction",
    "paymentApproved",
    "paymentEventDate",
    "paymentEventHoldReason",
    "paymentEventPurchaseCardUsed",
    "paymentEventPurchaseDataSent",
    "paymentEventResult",
    "paymentEventType",
    "paymentMethod",
    "payPalPending",
    "payPalStatus",
    "payPalTranId",
    "pnRefNum",
    "poAsText",
    "posting",
    "postingPeriod",
    "postingPeriodRelative",
    "priceLevel",
    "printedPickingTicket",
    "probability",
    "projectedAmount",
    "promoCode",
    "purchaseOrder",
    "quantity",
    "quantityBilled",
    "quantityCommitted",
    "quantityPacked",
    "quantityPicked",
    "quantityRevCommitted",
    "quantityShipRecv",
    "recognizedRevenue",
    "recordType",
    "refNumber",
    "revCommitStatus",
    "revCommittingStatus",
    "revCommittingTransaction",
    "revenueStatus",
    "reversalDate",
    "reversalNumber",
    "revRecEndDate",
    "revRecOnRevCommitment",
    "revRecStartDate",
    "revRecTermInMonths",
    "salesEffectiveDate",
    "salesOrder",
    "salesRep",
    "salesTeamMember",
    "salesTeamRole",
    "schedulingMethod",
    "serialNumber",
    "serialNumberCost",
    "serialNumberCostAdjustment",
    "serialNumberQuantity",
    "serialNumbers",
    "shipAddress",
    "shipAddressee",
    "shipAttention",
    "shipCity",
    "shipComplete",
    "shipCountry",
    "shipCounty",
    "shipDate",
    "shipGroup",
    "shipMethod",
    "shipPhone",
    "shipping",
    "shipRecvStatus",
    "shipRecvStatusLine",
    "shipState",
    "shipTo",
    "shipZip",
    "source",
    "startDate",
    "statistical",
    "status",
    "subsidiary",
    "taxItem",
    "taxLine",
    "taxPeriod",
    "taxPeriodRelative",
    "taxRate",
    "terms",
    "title",
    "toBeEmailed",
    "toBePrinted",
    "toSubsidiary",
    "totalAmount",
    "trackingNumbers",
    "tranCostEstimate",
    "tranDate",
    "tranEstGrossProfit",
    "tranEstGrossProfitPct",
    "tranFxEstGrossProfit",
    "tranId",
    "tranIsVsoeBundle",
    "transactionDiscount",
    "transactionLineType",
    "transactionNumber",
    "transferLocation",
    "transferOrderQuantityCommitted",
    "transferOrderQuantityPacked",
    "transferOrderQuantityPicked",
    "transferOrderQuantityReceived",
    "transferOrderQuantityShipped",
    "type",
    "unit",
    "unitCostOverride",
    "unitsType",
    "vendType",
    "visibleToCustomer",
    "voided",
    "vsoeAllocation",
    "vsoeAmount",
    "vsoeDeferral",
    "vsoeDelivered",
    "vsoePermitDiscount",
    "vsoePrice",
    "webSite",
    "customFieldList"
})
public class TransactionSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField account;
    protected SearchMultiSelectField accountType;
    protected SearchDateField actualShipDate;
    protected SearchDoubleField altSalesAmount;
    protected SearchDoubleField altSalesNetAmount;
    protected SearchDoubleField amount;
    protected SearchDoubleField amountPaid;
    protected SearchDoubleField amountRemaining;
    protected SearchDoubleField amountUnbilled;
    protected SearchMultiSelectField anyLineItem;
    protected SearchDoubleField appliedToForeignAmount;
    protected SearchBooleanField appliedToIsFxVariance;
    protected SearchDoubleField appliedToLinkAmount;
    protected SearchEnumMultiSelectField appliedToLinkType;
    protected SearchMultiSelectField appliedToTransaction;
    protected SearchDoubleField applyingForeignAmount;
    protected SearchBooleanField applyingIsFxVariance;
    protected SearchDoubleField applyingLinkAmount;
    protected SearchEnumMultiSelectField applyingLinkType;
    protected SearchMultiSelectField applyingTransaction;
    protected SearchEnumMultiSelectField approvalStatus;
    protected SearchStringField authCode;
    protected SearchBooleanField autoCalculateLag;
    protected SearchEnumMultiSelectField avsStreetMatch;
    protected SearchEnumMultiSelectField avsZipMatch;
    protected SearchBooleanField billable;
    protected SearchStringField billAddress;
    protected SearchStringField billAddressee;
    protected SearchStringField billAttention;
    protected SearchStringField billCity;
    protected SearchEnumMultiSelectField billCountry;
    protected SearchStringField billCounty;
    protected SearchDateField billedDate;
    protected SearchMultiSelectField billingSchedule;
    protected SearchBooleanField billingStatus;
    protected SearchMultiSelectField billingTransaction;
    protected SearchStringField billPhone;
    protected SearchStringField billState;
    protected SearchEnumMultiSelectField billVarianceStatus;
    protected SearchStringField billZip;
    protected SearchStringField binNumber;
    protected SearchDoubleField binNumberQuantity;
    protected SearchDoubleField bomQuantity;
    protected SearchBooleanField bookSpecificTransaction;
    protected SearchBooleanField buildEntireAssembly;
    protected SearchDoubleField buildVariance;
    protected SearchDoubleField built;
    protected SearchMultiSelectField catchUpPeriod;
    protected SearchStringField ccCustomerCode;
    protected SearchDateField ccExpireDate;
    protected SearchStringField ccName;
    protected SearchStringField ccNumber;
    protected SearchEnumMultiSelectField chargeType;
    @XmlElement(name = "class")
    protected SearchMultiSelectField clazz;
    protected SearchBooleanField cleared;
    protected SearchBooleanField closed;
    protected SearchDateField closeDate;
    protected SearchBooleanField cogs;
    protected SearchDateField commissionEffectiveDate;
    protected SearchEnumMultiSelectField commit;
    protected SearchDoubleField componentYield;
    protected SearchStringField confirmationNumber;
    protected SearchLongField contribution;
    protected SearchDoubleField costComponentAmount;
    protected SearchMultiSelectField costComponentCategory;
    protected SearchMultiSelectField costComponentItem;
    protected SearchDoubleField costComponentQuantity;
    protected SearchDoubleField costComponentStandardCost;
    protected SearchDoubleField costEstimate;
    protected SearchDoubleField costEstimateRate;
    protected SearchEnumMultiSelectField costEstimateType;
    protected SearchMultiSelectField createdBy;
    protected SearchMultiSelectField createdFrom;
    protected SearchDoubleField creditAmount;
    protected SearchEnumMultiSelectField cscMatch;
    protected SearchMultiSelectField currency;
    protected SearchMultiSelectField customerSubOf;
    protected SearchMultiSelectField customForm;
    protected SearchMultiSelectField custType;
    protected SearchDateField dateCreated;
    protected SearchLongField daysOpen;
    protected SearchLongField daysOverdue;
    protected SearchDoubleField debitAmount;
    protected SearchDoubleField deferredRevenue;
    protected SearchBooleanField deferRevRec;
    protected SearchMultiSelectField department;
    protected SearchDateField depositDate;
    protected SearchMultiSelectField depositTransaction;
    protected SearchMultiSelectField drAccount;
    protected SearchDateField dueDate;
    protected SearchStringField email;
    protected SearchMultiSelectField employee;
    protected SearchDateField endDate;
    protected SearchMultiSelectField entity;
    protected SearchMultiSelectField entityStatus;
    protected SearchDoubleField estGrossProfit;
    protected SearchDoubleField estGrossProfitPct;
    protected SearchDoubleField exchangeRate;
    protected SearchBooleanField excludeCommission;
    protected SearchBooleanField excludeFromRateRequest;
    protected SearchDateField expectedCloseDate;
    protected SearchDateField expectedReceiptDate;
    protected SearchMultiSelectField expenseCategory;
    protected SearchDateField expenseDate;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchBooleanField finChrg;
    protected SearchBooleanField firmed;
    protected SearchEnumMultiSelectField forecastType;
    protected SearchMultiSelectField fulfillingTransaction;
    protected SearchMultiSelectField fxAccount;
    protected SearchDoubleField fxAmount;
    protected SearchDoubleField fxCostEstimate;
    protected SearchDoubleField fxCostEstimateRate;
    protected SearchDoubleField fxEstGrossProfit;
    protected SearchDoubleField fxTranCostEstimate;
    protected SearchDoubleField fxVsoeAllocation;
    protected SearchDoubleField fxVsoeAmount;
    protected SearchDoubleField fxVsoePrice;
    protected SearchBooleanField gcoAvailabelToCharge;
    protected SearchBooleanField gcoAvailableToRefund;
    protected SearchEnumMultiSelectField gcoAvsStreetMatch;
    protected SearchEnumMultiSelectField gcoAvsZipMatch;
    protected SearchLongField gcoBuyerAccountAge;
    protected SearchStringField gcoBuyerIp;
    protected SearchDoubleField gcoChargeAmount;
    protected SearchDoubleField gcoChargebackAmount;
    protected SearchDoubleField gcoConfirmedChargedTotal;
    protected SearchDoubleField gcoConfirmedRefundedTotal;
    protected SearchStringField gcoCreditcardNumber;
    protected SearchEnumMultiSelectField gcoCscMatch;
    protected SearchStringField gcoFinancialState;
    protected SearchStringField gcoFulfillmentState;
    protected SearchStringField gcoOrderId;
    protected SearchDoubleField gcoOrderTotal;
    protected SearchDoubleField gcoPromotionAmount;
    protected SearchStringField gcoPromotionName;
    protected SearchDoubleField gcoRefundAmount;
    protected SearchDoubleField gcoShippingTotal;
    protected SearchStringField gcoStateChangedDetail;
    protected SearchStringField giftCertificate;
    protected SearchDoubleField grossAmount;
    protected SearchBooleanField includeInForecast;
    protected SearchEnumMultiSelectField intercoStatus;
    protected SearchMultiSelectField intercoTransaction;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField inVsoeBundle;
    protected SearchBooleanField isAllocation;
    protected SearchBooleanField isBackflush;
    protected SearchBooleanField isGcoChargeback;
    protected SearchBooleanField isGcoChargeConfirmed;
    protected SearchBooleanField isGcoPaymentGuaranteed;
    protected SearchBooleanField isGcoRefundConfirmed;
    protected SearchBooleanField isIntercompanyAdjustment;
    protected SearchBooleanField isMultiShipTo;
    protected SearchBooleanField isPayPalMeth;
    protected SearchBooleanField isReversal;
    protected SearchBooleanField isRevRecTransaction;
    protected SearchBooleanField isScrap;
    protected SearchBooleanField isShipAddress;
    protected SearchBooleanField isTransferPriceCosting;
    protected SearchBooleanField isVsoeAlloc;
    protected SearchBooleanField isWip;
    protected SearchMultiSelectField item;
    protected SearchMultiSelectField itemRevision;
    protected SearchMultiSelectField itemSubOf;
    protected SearchBooleanField landedCostPerLine;
    protected SearchDateField lastModifiedDate;
    protected SearchMultiSelectField leadSource;
    protected SearchMultiSelectField location;
    protected SearchBooleanField mainLine;
    protected SearchMultiSelectField mainName;
    protected SearchMultiSelectField manufacturingRouting;
    protected SearchBooleanField matchBillToReceipt;
    protected SearchStringField memo;
    protected SearchStringField memoMain;
    protected SearchBooleanField memorized;
    protected SearchStringField merchantAccount;
    protected SearchStringField message;
    protected SearchBooleanField multiSubsidiary;
    protected SearchStringField nameText;
    protected SearchDoubleField netAmount;
    protected SearchMultiSelectField nextApprover;
    protected SearchDateField nextBillDate;
    protected SearchBooleanField nonReimbursable;
    protected SearchLongField number;
    protected SearchMultiSelectField opportunity;
    protected SearchDoubleField orderPriority;
    protected SearchTextNumberField otherRefNum;
    protected SearchTextNumberField otherRefNumNonDeposit;
    protected SearchMultiSelectField overheadParentItem;
    protected SearchLongField packageCount;
    protected SearchMultiSelectField paidTransaction;
    protected SearchLongField parent;
    protected SearchMultiSelectField partner;
    protected SearchLongField partnerContribution;
    protected SearchMultiSelectField partnerRole;
    protected SearchMultiSelectField partnerTeamMember;
    protected SearchMultiSelectField payingTransaction;
    protected SearchBooleanField paymentApproved;
    protected SearchDateField paymentEventDate;
    protected SearchEnumMultiSelectField paymentEventHoldReason;
    protected SearchBooleanField paymentEventPurchaseCardUsed;
    protected SearchBooleanField paymentEventPurchaseDataSent;
    protected SearchEnumMultiSelectField paymentEventResult;
    protected SearchEnumMultiSelectField paymentEventType;
    protected SearchMultiSelectField paymentMethod;
    protected SearchBooleanField payPalPending;
    protected SearchStringField payPalStatus;
    protected SearchStringField payPalTranId;
    protected SearchStringField pnRefNum;
    protected SearchStringField poAsText;
    protected SearchBooleanField posting;
    protected RecordRef postingPeriod;
    @XmlSchemaType(name = "string")
    protected PostingPeriodDate postingPeriodRelative;
    protected SearchMultiSelectField priceLevel;
    protected SearchBooleanField printedPickingTicket;
    protected SearchLongField probability;
    protected SearchDoubleField projectedAmount;
    protected SearchMultiSelectField promoCode;
    protected SearchMultiSelectField purchaseOrder;
    protected SearchDoubleField quantity;
    protected SearchDoubleField quantityBilled;
    protected SearchDoubleField quantityCommitted;
    protected SearchDoubleField quantityPacked;
    protected SearchDoubleField quantityPicked;
    protected SearchDoubleField quantityRevCommitted;
    protected SearchDoubleField quantityShipRecv;
    protected SearchDoubleField recognizedRevenue;
    protected SearchStringField recordType;
    protected SearchLongField refNumber;
    protected SearchEnumMultiSelectField revCommitStatus;
    protected SearchBooleanField revCommittingStatus;
    protected SearchMultiSelectField revCommittingTransaction;
    protected SearchEnumMultiSelectField revenueStatus;
    protected SearchDateField reversalDate;
    protected SearchStringField reversalNumber;
    protected SearchDateField revRecEndDate;
    protected SearchBooleanField revRecOnRevCommitment;
    protected SearchDateField revRecStartDate;
    protected SearchLongField revRecTermInMonths;
    protected SearchDateField salesEffectiveDate;
    protected SearchMultiSelectField salesOrder;
    protected SearchMultiSelectField salesRep;
    protected SearchMultiSelectField salesTeamMember;
    protected SearchMultiSelectField salesTeamRole;
    protected SearchEnumMultiSelectField schedulingMethod;
    protected SearchStringField serialNumber;
    protected SearchDoubleField serialNumberCost;
    protected SearchDoubleField serialNumberCostAdjustment;
    protected SearchDoubleField serialNumberQuantity;
    protected SearchStringField serialNumbers;
    protected SearchStringField shipAddress;
    protected SearchStringField shipAddressee;
    protected SearchStringField shipAttention;
    protected SearchStringField shipCity;
    protected SearchBooleanField shipComplete;
    protected SearchEnumMultiSelectField shipCountry;
    protected SearchStringField shipCounty;
    protected SearchDateField shipDate;
    protected SearchLongField shipGroup;
    protected SearchMultiSelectField shipMethod;
    protected SearchStringField shipPhone;
    protected SearchBooleanField shipping;
    protected SearchBooleanField shipRecvStatus;
    protected SearchBooleanField shipRecvStatusLine;
    protected SearchMultiSelectField shipState;
    protected SearchMultiSelectField shipTo;
    protected SearchStringField shipZip;
    protected SearchEnumMultiSelectField source;
    protected SearchDateField startDate;
    protected SearchBooleanField statistical;
    protected SearchEnumMultiSelectField status;
    protected SearchMultiSelectField subsidiary;
    protected SearchMultiSelectField taxItem;
    protected SearchBooleanField taxLine;
    protected RecordRef taxPeriod;
    @XmlSchemaType(name = "string")
    protected PostingPeriodDate taxPeriodRelative;
    protected SearchDoubleField taxRate;
    protected SearchMultiSelectField terms;
    protected SearchStringField title;
    protected SearchBooleanField toBeEmailed;
    protected SearchBooleanField toBePrinted;
    protected SearchMultiSelectField toSubsidiary;
    protected SearchDoubleField totalAmount;
    protected SearchStringField trackingNumbers;
    protected SearchDoubleField tranCostEstimate;
    protected SearchDateField tranDate;
    protected SearchDoubleField tranEstGrossProfit;
    protected SearchDoubleField tranEstGrossProfitPct;
    protected SearchDoubleField tranFxEstGrossProfit;
    protected SearchStringField tranId;
    protected SearchBooleanField tranIsVsoeBundle;
    protected SearchBooleanField transactionDiscount;
    protected SearchEnumMultiSelectField transactionLineType;
    protected SearchStringField transactionNumber;
    protected SearchMultiSelectField transferLocation;
    protected SearchDoubleField transferOrderQuantityCommitted;
    protected SearchDoubleField transferOrderQuantityPacked;
    protected SearchDoubleField transferOrderQuantityPicked;
    protected SearchDoubleField transferOrderQuantityReceived;
    protected SearchDoubleField transferOrderQuantityShipped;
    protected SearchEnumMultiSelectField type;
    protected SearchMultiSelectField unit;
    protected SearchDoubleField unitCostOverride;
    protected SearchMultiSelectField unitsType;
    protected SearchMultiSelectField vendType;
    protected SearchBooleanField visibleToCustomer;
    protected SearchBooleanField voided;
    protected SearchDoubleField vsoeAllocation;
    protected SearchDoubleField vsoeAmount;
    protected SearchEnumMultiSelectField vsoeDeferral;
    protected SearchBooleanField vsoeDelivered;
    protected SearchEnumMultiSelectField vsoePermitDiscount;
    protected SearchDoubleField vsoePrice;
    protected SearchMultiSelectField webSite;
    protected SearchCustomFieldList customFieldList;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccount(SearchMultiSelectField value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountType(SearchMultiSelectField value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setActualShipDate(SearchDateField value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the altSalesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAltSalesAmount() {
        return altSalesAmount;
    }

    /**
     * Sets the value of the altSalesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAltSalesAmount(SearchDoubleField value) {
        this.altSalesAmount = value;
    }

    /**
     * Gets the value of the altSalesNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAltSalesNetAmount() {
        return altSalesNetAmount;
    }

    /**
     * Sets the value of the altSalesNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAltSalesNetAmount(SearchDoubleField value) {
        this.altSalesNetAmount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmount(SearchDoubleField value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmountPaid(SearchDoubleField value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the amountRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmountRemaining() {
        return amountRemaining;
    }

    /**
     * Sets the value of the amountRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmountRemaining(SearchDoubleField value) {
        this.amountRemaining = value;
    }

    /**
     * Gets the value of the amountUnbilled property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmountUnbilled() {
        return amountUnbilled;
    }

    /**
     * Sets the value of the amountUnbilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmountUnbilled(SearchDoubleField value) {
        this.amountUnbilled = value;
    }

    /**
     * Gets the value of the anyLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAnyLineItem() {
        return anyLineItem;
    }

    /**
     * Sets the value of the anyLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAnyLineItem(SearchMultiSelectField value) {
        this.anyLineItem = value;
    }

    /**
     * Gets the value of the appliedToForeignAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAppliedToForeignAmount() {
        return appliedToForeignAmount;
    }

    /**
     * Sets the value of the appliedToForeignAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAppliedToForeignAmount(SearchDoubleField value) {
        this.appliedToForeignAmount = value;
    }

    /**
     * Gets the value of the appliedToIsFxVariance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAppliedToIsFxVariance() {
        return appliedToIsFxVariance;
    }

    /**
     * Sets the value of the appliedToIsFxVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAppliedToIsFxVariance(SearchBooleanField value) {
        this.appliedToIsFxVariance = value;
    }

    /**
     * Gets the value of the appliedToLinkAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAppliedToLinkAmount() {
        return appliedToLinkAmount;
    }

    /**
     * Sets the value of the appliedToLinkAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAppliedToLinkAmount(SearchDoubleField value) {
        this.appliedToLinkAmount = value;
    }

    /**
     * Gets the value of the appliedToLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAppliedToLinkType() {
        return appliedToLinkType;
    }

    /**
     * Sets the value of the appliedToLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAppliedToLinkType(SearchEnumMultiSelectField value) {
        this.appliedToLinkType = value;
    }

    /**
     * Gets the value of the appliedToTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAppliedToTransaction() {
        return appliedToTransaction;
    }

    /**
     * Sets the value of the appliedToTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAppliedToTransaction(SearchMultiSelectField value) {
        this.appliedToTransaction = value;
    }

    /**
     * Gets the value of the applyingForeignAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getApplyingForeignAmount() {
        return applyingForeignAmount;
    }

    /**
     * Sets the value of the applyingForeignAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setApplyingForeignAmount(SearchDoubleField value) {
        this.applyingForeignAmount = value;
    }

    /**
     * Gets the value of the applyingIsFxVariance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getApplyingIsFxVariance() {
        return applyingIsFxVariance;
    }

    /**
     * Sets the value of the applyingIsFxVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setApplyingIsFxVariance(SearchBooleanField value) {
        this.applyingIsFxVariance = value;
    }

    /**
     * Gets the value of the applyingLinkAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getApplyingLinkAmount() {
        return applyingLinkAmount;
    }

    /**
     * Sets the value of the applyingLinkAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setApplyingLinkAmount(SearchDoubleField value) {
        this.applyingLinkAmount = value;
    }

    /**
     * Gets the value of the applyingLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getApplyingLinkType() {
        return applyingLinkType;
    }

    /**
     * Sets the value of the applyingLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setApplyingLinkType(SearchEnumMultiSelectField value) {
        this.applyingLinkType = value;
    }

    /**
     * Gets the value of the applyingTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getApplyingTransaction() {
        return applyingTransaction;
    }

    /**
     * Sets the value of the applyingTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setApplyingTransaction(SearchMultiSelectField value) {
        this.applyingTransaction = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setApprovalStatus(SearchEnumMultiSelectField value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAuthCode(SearchStringField value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the autoCalculateLag property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoCalculateLag() {
        return autoCalculateLag;
    }

    /**
     * Sets the value of the autoCalculateLag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoCalculateLag(SearchBooleanField value) {
        this.autoCalculateLag = value;
    }

    /**
     * Gets the value of the avsStreetMatch property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAvsStreetMatch() {
        return avsStreetMatch;
    }

    /**
     * Sets the value of the avsStreetMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAvsStreetMatch(SearchEnumMultiSelectField value) {
        this.avsStreetMatch = value;
    }

    /**
     * Gets the value of the avsZipMatch property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAvsZipMatch() {
        return avsZipMatch;
    }

    /**
     * Sets the value of the avsZipMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAvsZipMatch(SearchEnumMultiSelectField value) {
        this.avsZipMatch = value;
    }

    /**
     * Gets the value of the billable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBillable() {
        return billable;
    }

    /**
     * Sets the value of the billable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBillable(SearchBooleanField value) {
        this.billable = value;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillAddress() {
        return billAddress;
    }

    /**
     * Sets the value of the billAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillAddress(SearchStringField value) {
        this.billAddress = value;
    }

    /**
     * Gets the value of the billAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillAddressee() {
        return billAddressee;
    }

    /**
     * Sets the value of the billAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillAddressee(SearchStringField value) {
        this.billAddressee = value;
    }

    /**
     * Gets the value of the billAttention property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillAttention() {
        return billAttention;
    }

    /**
     * Sets the value of the billAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillAttention(SearchStringField value) {
        this.billAttention = value;
    }

    /**
     * Gets the value of the billCity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillCity() {
        return billCity;
    }

    /**
     * Sets the value of the billCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillCity(SearchStringField value) {
        this.billCity = value;
    }

    /**
     * Gets the value of the billCountry property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getBillCountry() {
        return billCountry;
    }

    /**
     * Sets the value of the billCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setBillCountry(SearchEnumMultiSelectField value) {
        this.billCountry = value;
    }

    /**
     * Gets the value of the billCounty property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillCounty() {
        return billCounty;
    }

    /**
     * Sets the value of the billCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillCounty(SearchStringField value) {
        this.billCounty = value;
    }

    /**
     * Gets the value of the billedDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getBilledDate() {
        return billedDate;
    }

    /**
     * Sets the value of the billedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setBilledDate(SearchDateField value) {
        this.billedDate = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBillingSchedule(SearchMultiSelectField value) {
        this.billingSchedule = value;
    }

    /**
     * Gets the value of the billingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBillingStatus() {
        return billingStatus;
    }

    /**
     * Sets the value of the billingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBillingStatus(SearchBooleanField value) {
        this.billingStatus = value;
    }

    /**
     * Gets the value of the billingTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBillingTransaction() {
        return billingTransaction;
    }

    /**
     * Sets the value of the billingTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBillingTransaction(SearchMultiSelectField value) {
        this.billingTransaction = value;
    }

    /**
     * Gets the value of the billPhone property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillPhone() {
        return billPhone;
    }

    /**
     * Sets the value of the billPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillPhone(SearchStringField value) {
        this.billPhone = value;
    }

    /**
     * Gets the value of the billState property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillState() {
        return billState;
    }

    /**
     * Sets the value of the billState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillState(SearchStringField value) {
        this.billState = value;
    }

    /**
     * Gets the value of the billVarianceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getBillVarianceStatus() {
        return billVarianceStatus;
    }

    /**
     * Sets the value of the billVarianceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setBillVarianceStatus(SearchEnumMultiSelectField value) {
        this.billVarianceStatus = value;
    }

    /**
     * Gets the value of the billZip property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillZip() {
        return billZip;
    }

    /**
     * Sets the value of the billZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillZip(SearchStringField value) {
        this.billZip = value;
    }

    /**
     * Gets the value of the binNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBinNumber() {
        return binNumber;
    }

    /**
     * Sets the value of the binNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBinNumber(SearchStringField value) {
        this.binNumber = value;
    }

    /**
     * Gets the value of the binNumberQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBinNumberQuantity() {
        return binNumberQuantity;
    }

    /**
     * Sets the value of the binNumberQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBinNumberQuantity(SearchDoubleField value) {
        this.binNumberQuantity = value;
    }

    /**
     * Gets the value of the bomQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBomQuantity() {
        return bomQuantity;
    }

    /**
     * Sets the value of the bomQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBomQuantity(SearchDoubleField value) {
        this.bomQuantity = value;
    }

    /**
     * Gets the value of the bookSpecificTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBookSpecificTransaction() {
        return bookSpecificTransaction;
    }

    /**
     * Sets the value of the bookSpecificTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBookSpecificTransaction(SearchBooleanField value) {
        this.bookSpecificTransaction = value;
    }

    /**
     * Gets the value of the buildEntireAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBuildEntireAssembly() {
        return buildEntireAssembly;
    }

    /**
     * Sets the value of the buildEntireAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBuildEntireAssembly(SearchBooleanField value) {
        this.buildEntireAssembly = value;
    }

    /**
     * Gets the value of the buildVariance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuildVariance() {
        return buildVariance;
    }

    /**
     * Sets the value of the buildVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuildVariance(SearchDoubleField value) {
        this.buildVariance = value;
    }

    /**
     * Gets the value of the built property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuilt() {
        return built;
    }

    /**
     * Sets the value of the built property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuilt(SearchDoubleField value) {
        this.built = value;
    }

    /**
     * Gets the value of the catchUpPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCatchUpPeriod() {
        return catchUpPeriod;
    }

    /**
     * Sets the value of the catchUpPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCatchUpPeriod(SearchMultiSelectField value) {
        this.catchUpPeriod = value;
    }

    /**
     * Gets the value of the ccCustomerCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcCustomerCode() {
        return ccCustomerCode;
    }

    /**
     * Sets the value of the ccCustomerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcCustomerCode(SearchStringField value) {
        this.ccCustomerCode = value;
    }

    /**
     * Gets the value of the ccExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCcExpireDate() {
        return ccExpireDate;
    }

    /**
     * Sets the value of the ccExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCcExpireDate(SearchDateField value) {
        this.ccExpireDate = value;
    }

    /**
     * Gets the value of the ccName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcName() {
        return ccName;
    }

    /**
     * Sets the value of the ccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcName(SearchStringField value) {
        this.ccName = value;
    }

    /**
     * Gets the value of the ccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcNumber() {
        return ccNumber;
    }

    /**
     * Sets the value of the ccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcNumber(SearchStringField value) {
        this.ccNumber = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setChargeType(SearchEnumMultiSelectField value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setClazz(SearchMultiSelectField value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the cleared property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCleared() {
        return cleared;
    }

    /**
     * Sets the value of the cleared property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCleared(SearchBooleanField value) {
        this.cleared = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setClosed(SearchBooleanField value) {
        this.closed = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCloseDate(SearchDateField value) {
        this.closeDate = value;
    }

    /**
     * Gets the value of the cogs property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCogs() {
        return cogs;
    }

    /**
     * Sets the value of the cogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCogs(SearchBooleanField value) {
        this.cogs = value;
    }

    /**
     * Gets the value of the commissionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCommissionEffectiveDate() {
        return commissionEffectiveDate;
    }

    /**
     * Sets the value of the commissionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCommissionEffectiveDate(SearchDateField value) {
        this.commissionEffectiveDate = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCommit() {
        return commit;
    }

    /**
     * Sets the value of the commit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCommit(SearchEnumMultiSelectField value) {
        this.commit = value;
    }

    /**
     * Gets the value of the componentYield property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getComponentYield() {
        return componentYield;
    }

    /**
     * Sets the value of the componentYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setComponentYield(SearchDoubleField value) {
        this.componentYield = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setConfirmationNumber(SearchStringField value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the contribution property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getContribution() {
        return contribution;
    }

    /**
     * Sets the value of the contribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setContribution(SearchLongField value) {
        this.contribution = value;
    }

    /**
     * Gets the value of the costComponentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostComponentAmount() {
        return costComponentAmount;
    }

    /**
     * Sets the value of the costComponentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostComponentAmount(SearchDoubleField value) {
        this.costComponentAmount = value;
    }

    /**
     * Gets the value of the costComponentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCostComponentCategory() {
        return costComponentCategory;
    }

    /**
     * Sets the value of the costComponentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCostComponentCategory(SearchMultiSelectField value) {
        this.costComponentCategory = value;
    }

    /**
     * Gets the value of the costComponentItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCostComponentItem() {
        return costComponentItem;
    }

    /**
     * Sets the value of the costComponentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCostComponentItem(SearchMultiSelectField value) {
        this.costComponentItem = value;
    }

    /**
     * Gets the value of the costComponentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostComponentQuantity() {
        return costComponentQuantity;
    }

    /**
     * Sets the value of the costComponentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostComponentQuantity(SearchDoubleField value) {
        this.costComponentQuantity = value;
    }

    /**
     * Gets the value of the costComponentStandardCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostComponentStandardCost() {
        return costComponentStandardCost;
    }

    /**
     * Sets the value of the costComponentStandardCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostComponentStandardCost(SearchDoubleField value) {
        this.costComponentStandardCost = value;
    }

    /**
     * Gets the value of the costEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostEstimate() {
        return costEstimate;
    }

    /**
     * Sets the value of the costEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostEstimate(SearchDoubleField value) {
        this.costEstimate = value;
    }

    /**
     * Gets the value of the costEstimateRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostEstimateRate() {
        return costEstimateRate;
    }

    /**
     * Sets the value of the costEstimateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostEstimateRate(SearchDoubleField value) {
        this.costEstimateRate = value;
    }

    /**
     * Gets the value of the costEstimateType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCostEstimateType() {
        return costEstimateType;
    }

    /**
     * Sets the value of the costEstimateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCostEstimateType(SearchEnumMultiSelectField value) {
        this.costEstimateType = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCreatedBy(SearchMultiSelectField value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCreatedFrom() {
        return createdFrom;
    }

    /**
     * Sets the value of the createdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCreatedFrom(SearchMultiSelectField value) {
        this.createdFrom = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCreditAmount(SearchDoubleField value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the cscMatch property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCscMatch() {
        return cscMatch;
    }

    /**
     * Sets the value of the cscMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCscMatch(SearchEnumMultiSelectField value) {
        this.cscMatch = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCurrency(SearchMultiSelectField value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customerSubOf property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustomerSubOf() {
        return customerSubOf;
    }

    /**
     * Sets the value of the customerSubOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustomerSubOf(SearchMultiSelectField value) {
        this.customerSubOf = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustomForm(SearchMultiSelectField value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustType(SearchMultiSelectField value) {
        this.custType = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateCreated(SearchDateField value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the daysOpen property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysOpen() {
        return daysOpen;
    }

    /**
     * Sets the value of the daysOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysOpen(SearchLongField value) {
        this.daysOpen = value;
    }

    /**
     * Gets the value of the daysOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysOverdue() {
        return daysOverdue;
    }

    /**
     * Sets the value of the daysOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysOverdue(SearchLongField value) {
        this.daysOverdue = value;
    }

    /**
     * Gets the value of the debitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDebitAmount() {
        return debitAmount;
    }

    /**
     * Sets the value of the debitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDebitAmount(SearchDoubleField value) {
        this.debitAmount = value;
    }

    /**
     * Gets the value of the deferredRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDeferredRevenue() {
        return deferredRevenue;
    }

    /**
     * Sets the value of the deferredRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDeferredRevenue(SearchDoubleField value) {
        this.deferredRevenue = value;
    }

    /**
     * Gets the value of the deferRevRec property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDeferRevRec() {
        return deferRevRec;
    }

    /**
     * Sets the value of the deferRevRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDeferRevRec(SearchBooleanField value) {
        this.deferRevRec = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDepartment(SearchMultiSelectField value) {
        this.department = value;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDepositDate(SearchDateField value) {
        this.depositDate = value;
    }

    /**
     * Gets the value of the depositTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDepositTransaction() {
        return depositTransaction;
    }

    /**
     * Sets the value of the depositTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDepositTransaction(SearchMultiSelectField value) {
        this.depositTransaction = value;
    }

    /**
     * Gets the value of the drAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDrAccount() {
        return drAccount;
    }

    /**
     * Sets the value of the drAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDrAccount(SearchMultiSelectField value) {
        this.drAccount = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDueDate(SearchDateField value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEmail(SearchStringField value) {
        this.email = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEmployee(SearchMultiSelectField value) {
        this.employee = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEndDate(SearchDateField value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEntity(SearchMultiSelectField value) {
        this.entity = value;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEntityStatus(SearchMultiSelectField value) {
        this.entityStatus = value;
    }

    /**
     * Gets the value of the estGrossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstGrossProfit() {
        return estGrossProfit;
    }

    /**
     * Sets the value of the estGrossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstGrossProfit(SearchDoubleField value) {
        this.estGrossProfit = value;
    }

    /**
     * Gets the value of the estGrossProfitPct property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstGrossProfitPct() {
        return estGrossProfitPct;
    }

    /**
     * Sets the value of the estGrossProfitPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstGrossProfitPct(SearchDoubleField value) {
        this.estGrossProfitPct = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setExchangeRate(SearchDoubleField value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the excludeCommission property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExcludeCommission() {
        return excludeCommission;
    }

    /**
     * Sets the value of the excludeCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExcludeCommission(SearchBooleanField value) {
        this.excludeCommission = value;
    }

    /**
     * Gets the value of the excludeFromRateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExcludeFromRateRequest() {
        return excludeFromRateRequest;
    }

    /**
     * Sets the value of the excludeFromRateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExcludeFromRateRequest(SearchBooleanField value) {
        this.excludeFromRateRequest = value;
    }

    /**
     * Gets the value of the expectedCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedCloseDate() {
        return expectedCloseDate;
    }

    /**
     * Sets the value of the expectedCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedCloseDate(SearchDateField value) {
        this.expectedCloseDate = value;
    }

    /**
     * Gets the value of the expectedReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedReceiptDate() {
        return expectedReceiptDate;
    }

    /**
     * Sets the value of the expectedReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedReceiptDate(SearchDateField value) {
        this.expectedReceiptDate = value;
    }

    /**
     * Gets the value of the expenseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExpenseCategory() {
        return expenseCategory;
    }

    /**
     * Sets the value of the expenseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExpenseCategory(SearchMultiSelectField value) {
        this.expenseCategory = value;
    }

    /**
     * Gets the value of the expenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpenseDate() {
        return expenseDate;
    }

    /**
     * Sets the value of the expenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpenseDate(SearchDateField value) {
        this.expenseDate = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalIdString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * Sets the value of the externalIdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * Gets the value of the finChrg property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFinChrg() {
        return finChrg;
    }

    /**
     * Sets the value of the finChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFinChrg(SearchBooleanField value) {
        this.finChrg = value;
    }

    /**
     * Gets the value of the firmed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFirmed() {
        return firmed;
    }

    /**
     * Sets the value of the firmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFirmed(SearchBooleanField value) {
        this.firmed = value;
    }

    /**
     * Gets the value of the forecastType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getForecastType() {
        return forecastType;
    }

    /**
     * Sets the value of the forecastType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setForecastType(SearchEnumMultiSelectField value) {
        this.forecastType = value;
    }

    /**
     * Gets the value of the fulfillingTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getFulfillingTransaction() {
        return fulfillingTransaction;
    }

    /**
     * Sets the value of the fulfillingTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setFulfillingTransaction(SearchMultiSelectField value) {
        this.fulfillingTransaction = value;
    }

    /**
     * Gets the value of the fxAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getFxAccount() {
        return fxAccount;
    }

    /**
     * Sets the value of the fxAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setFxAccount(SearchMultiSelectField value) {
        this.fxAccount = value;
    }

    /**
     * Gets the value of the fxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxAmount() {
        return fxAmount;
    }

    /**
     * Sets the value of the fxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxAmount(SearchDoubleField value) {
        this.fxAmount = value;
    }

    /**
     * Gets the value of the fxCostEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxCostEstimate() {
        return fxCostEstimate;
    }

    /**
     * Sets the value of the fxCostEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxCostEstimate(SearchDoubleField value) {
        this.fxCostEstimate = value;
    }

    /**
     * Gets the value of the fxCostEstimateRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxCostEstimateRate() {
        return fxCostEstimateRate;
    }

    /**
     * Sets the value of the fxCostEstimateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxCostEstimateRate(SearchDoubleField value) {
        this.fxCostEstimateRate = value;
    }

    /**
     * Gets the value of the fxEstGrossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxEstGrossProfit() {
        return fxEstGrossProfit;
    }

    /**
     * Sets the value of the fxEstGrossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxEstGrossProfit(SearchDoubleField value) {
        this.fxEstGrossProfit = value;
    }

    /**
     * Gets the value of the fxTranCostEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }

    /**
     * Sets the value of the fxTranCostEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxTranCostEstimate(SearchDoubleField value) {
        this.fxTranCostEstimate = value;
    }

    /**
     * Gets the value of the fxVsoeAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxVsoeAllocation() {
        return fxVsoeAllocation;
    }

    /**
     * Sets the value of the fxVsoeAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxVsoeAllocation(SearchDoubleField value) {
        this.fxVsoeAllocation = value;
    }

    /**
     * Gets the value of the fxVsoeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxVsoeAmount() {
        return fxVsoeAmount;
    }

    /**
     * Sets the value of the fxVsoeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxVsoeAmount(SearchDoubleField value) {
        this.fxVsoeAmount = value;
    }

    /**
     * Gets the value of the fxVsoePrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxVsoePrice() {
        return fxVsoePrice;
    }

    /**
     * Sets the value of the fxVsoePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxVsoePrice(SearchDoubleField value) {
        this.fxVsoePrice = value;
    }

    /**
     * Gets the value of the gcoAvailabelToCharge property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGcoAvailabelToCharge() {
        return gcoAvailabelToCharge;
    }

    /**
     * Sets the value of the gcoAvailabelToCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGcoAvailabelToCharge(SearchBooleanField value) {
        this.gcoAvailabelToCharge = value;
    }

    /**
     * Gets the value of the gcoAvailableToRefund property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGcoAvailableToRefund() {
        return gcoAvailableToRefund;
    }

    /**
     * Sets the value of the gcoAvailableToRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGcoAvailableToRefund(SearchBooleanField value) {
        this.gcoAvailableToRefund = value;
    }

    /**
     * Gets the value of the gcoAvsStreetMatch property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGcoAvsStreetMatch() {
        return gcoAvsStreetMatch;
    }

    /**
     * Sets the value of the gcoAvsStreetMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGcoAvsStreetMatch(SearchEnumMultiSelectField value) {
        this.gcoAvsStreetMatch = value;
    }

    /**
     * Gets the value of the gcoAvsZipMatch property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGcoAvsZipMatch() {
        return gcoAvsZipMatch;
    }

    /**
     * Sets the value of the gcoAvsZipMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGcoAvsZipMatch(SearchEnumMultiSelectField value) {
        this.gcoAvsZipMatch = value;
    }

    /**
     * Gets the value of the gcoBuyerAccountAge property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getGcoBuyerAccountAge() {
        return gcoBuyerAccountAge;
    }

    /**
     * Sets the value of the gcoBuyerAccountAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setGcoBuyerAccountAge(SearchLongField value) {
        this.gcoBuyerAccountAge = value;
    }

    /**
     * Gets the value of the gcoBuyerIp property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoBuyerIp() {
        return gcoBuyerIp;
    }

    /**
     * Sets the value of the gcoBuyerIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoBuyerIp(SearchStringField value) {
        this.gcoBuyerIp = value;
    }

    /**
     * Gets the value of the gcoChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoChargeAmount() {
        return gcoChargeAmount;
    }

    /**
     * Sets the value of the gcoChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoChargeAmount(SearchDoubleField value) {
        this.gcoChargeAmount = value;
    }

    /**
     * Gets the value of the gcoChargebackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoChargebackAmount() {
        return gcoChargebackAmount;
    }

    /**
     * Sets the value of the gcoChargebackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoChargebackAmount(SearchDoubleField value) {
        this.gcoChargebackAmount = value;
    }

    /**
     * Gets the value of the gcoConfirmedChargedTotal property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoConfirmedChargedTotal() {
        return gcoConfirmedChargedTotal;
    }

    /**
     * Sets the value of the gcoConfirmedChargedTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoConfirmedChargedTotal(SearchDoubleField value) {
        this.gcoConfirmedChargedTotal = value;
    }

    /**
     * Gets the value of the gcoConfirmedRefundedTotal property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoConfirmedRefundedTotal() {
        return gcoConfirmedRefundedTotal;
    }

    /**
     * Sets the value of the gcoConfirmedRefundedTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoConfirmedRefundedTotal(SearchDoubleField value) {
        this.gcoConfirmedRefundedTotal = value;
    }

    /**
     * Gets the value of the gcoCreditcardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoCreditcardNumber() {
        return gcoCreditcardNumber;
    }

    /**
     * Sets the value of the gcoCreditcardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoCreditcardNumber(SearchStringField value) {
        this.gcoCreditcardNumber = value;
    }

    /**
     * Gets the value of the gcoCscMatch property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGcoCscMatch() {
        return gcoCscMatch;
    }

    /**
     * Sets the value of the gcoCscMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGcoCscMatch(SearchEnumMultiSelectField value) {
        this.gcoCscMatch = value;
    }

    /**
     * Gets the value of the gcoFinancialState property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoFinancialState() {
        return gcoFinancialState;
    }

    /**
     * Sets the value of the gcoFinancialState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoFinancialState(SearchStringField value) {
        this.gcoFinancialState = value;
    }

    /**
     * Gets the value of the gcoFulfillmentState property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoFulfillmentState() {
        return gcoFulfillmentState;
    }

    /**
     * Sets the value of the gcoFulfillmentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoFulfillmentState(SearchStringField value) {
        this.gcoFulfillmentState = value;
    }

    /**
     * Gets the value of the gcoOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoOrderId() {
        return gcoOrderId;
    }

    /**
     * Sets the value of the gcoOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoOrderId(SearchStringField value) {
        this.gcoOrderId = value;
    }

    /**
     * Gets the value of the gcoOrderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoOrderTotal() {
        return gcoOrderTotal;
    }

    /**
     * Sets the value of the gcoOrderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoOrderTotal(SearchDoubleField value) {
        this.gcoOrderTotal = value;
    }

    /**
     * Gets the value of the gcoPromotionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoPromotionAmount() {
        return gcoPromotionAmount;
    }

    /**
     * Sets the value of the gcoPromotionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoPromotionAmount(SearchDoubleField value) {
        this.gcoPromotionAmount = value;
    }

    /**
     * Gets the value of the gcoPromotionName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoPromotionName() {
        return gcoPromotionName;
    }

    /**
     * Sets the value of the gcoPromotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoPromotionName(SearchStringField value) {
        this.gcoPromotionName = value;
    }

    /**
     * Gets the value of the gcoRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoRefundAmount() {
        return gcoRefundAmount;
    }

    /**
     * Sets the value of the gcoRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoRefundAmount(SearchDoubleField value) {
        this.gcoRefundAmount = value;
    }

    /**
     * Gets the value of the gcoShippingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoShippingTotal() {
        return gcoShippingTotal;
    }

    /**
     * Sets the value of the gcoShippingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoShippingTotal(SearchDoubleField value) {
        this.gcoShippingTotal = value;
    }

    /**
     * Gets the value of the gcoStateChangedDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoStateChangedDetail() {
        return gcoStateChangedDetail;
    }

    /**
     * Sets the value of the gcoStateChangedDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoStateChangedDetail(SearchStringField value) {
        this.gcoStateChangedDetail = value;
    }

    /**
     * Gets the value of the giftCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertificate() {
        return giftCertificate;
    }

    /**
     * Sets the value of the giftCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertificate(SearchStringField value) {
        this.giftCertificate = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGrossAmount(SearchDoubleField value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the includeInForecast property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIncludeInForecast() {
        return includeInForecast;
    }

    /**
     * Sets the value of the includeInForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIncludeInForecast(SearchBooleanField value) {
        this.includeInForecast = value;
    }

    /**
     * Gets the value of the intercoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getIntercoStatus() {
        return intercoStatus;
    }

    /**
     * Sets the value of the intercoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setIntercoStatus(SearchEnumMultiSelectField value) {
        this.intercoStatus = value;
    }

    /**
     * Gets the value of the intercoTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIntercoTransaction() {
        return intercoTransaction;
    }

    /**
     * Sets the value of the intercoTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIntercoTransaction(SearchMultiSelectField value) {
        this.intercoTransaction = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the inVsoeBundle property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getInVsoeBundle() {
        return inVsoeBundle;
    }

    /**
     * Sets the value of the inVsoeBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setInVsoeBundle(SearchBooleanField value) {
        this.inVsoeBundle = value;
    }

    /**
     * Gets the value of the isAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsAllocation() {
        return isAllocation;
    }

    /**
     * Sets the value of the isAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsAllocation(SearchBooleanField value) {
        this.isAllocation = value;
    }

    /**
     * Gets the value of the isBackflush property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsBackflush() {
        return isBackflush;
    }

    /**
     * Sets the value of the isBackflush property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsBackflush(SearchBooleanField value) {
        this.isBackflush = value;
    }

    /**
     * Gets the value of the isGcoChargeback property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoChargeback() {
        return isGcoChargeback;
    }

    /**
     * Sets the value of the isGcoChargeback property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoChargeback(SearchBooleanField value) {
        this.isGcoChargeback = value;
    }

    /**
     * Gets the value of the isGcoChargeConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoChargeConfirmed() {
        return isGcoChargeConfirmed;
    }

    /**
     * Sets the value of the isGcoChargeConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoChargeConfirmed(SearchBooleanField value) {
        this.isGcoChargeConfirmed = value;
    }

    /**
     * Gets the value of the isGcoPaymentGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoPaymentGuaranteed() {
        return isGcoPaymentGuaranteed;
    }

    /**
     * Sets the value of the isGcoPaymentGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoPaymentGuaranteed(SearchBooleanField value) {
        this.isGcoPaymentGuaranteed = value;
    }

    /**
     * Gets the value of the isGcoRefundConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoRefundConfirmed() {
        return isGcoRefundConfirmed;
    }

    /**
     * Sets the value of the isGcoRefundConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoRefundConfirmed(SearchBooleanField value) {
        this.isGcoRefundConfirmed = value;
    }

    /**
     * Gets the value of the isIntercompanyAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsIntercompanyAdjustment() {
        return isIntercompanyAdjustment;
    }

    /**
     * Sets the value of the isIntercompanyAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsIntercompanyAdjustment(SearchBooleanField value) {
        this.isIntercompanyAdjustment = value;
    }

    /**
     * Gets the value of the isMultiShipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsMultiShipTo() {
        return isMultiShipTo;
    }

    /**
     * Sets the value of the isMultiShipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsMultiShipTo(SearchBooleanField value) {
        this.isMultiShipTo = value;
    }

    /**
     * Gets the value of the isPayPalMeth property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPayPalMeth() {
        return isPayPalMeth;
    }

    /**
     * Sets the value of the isPayPalMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPayPalMeth(SearchBooleanField value) {
        this.isPayPalMeth = value;
    }

    /**
     * Gets the value of the isReversal property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsReversal() {
        return isReversal;
    }

    /**
     * Sets the value of the isReversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsReversal(SearchBooleanField value) {
        this.isReversal = value;
    }

    /**
     * Gets the value of the isRevRecTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsRevRecTransaction() {
        return isRevRecTransaction;
    }

    /**
     * Sets the value of the isRevRecTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsRevRecTransaction(SearchBooleanField value) {
        this.isRevRecTransaction = value;
    }

    /**
     * Gets the value of the isScrap property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsScrap() {
        return isScrap;
    }

    /**
     * Sets the value of the isScrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsScrap(SearchBooleanField value) {
        this.isScrap = value;
    }

    /**
     * Gets the value of the isShipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsShipAddress() {
        return isShipAddress;
    }

    /**
     * Sets the value of the isShipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsShipAddress(SearchBooleanField value) {
        this.isShipAddress = value;
    }

    /**
     * Gets the value of the isTransferPriceCosting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsTransferPriceCosting() {
        return isTransferPriceCosting;
    }

    /**
     * Sets the value of the isTransferPriceCosting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsTransferPriceCosting(SearchBooleanField value) {
        this.isTransferPriceCosting = value;
    }

    /**
     * Gets the value of the isVsoeAlloc property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsVsoeAlloc() {
        return isVsoeAlloc;
    }

    /**
     * Sets the value of the isVsoeAlloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsVsoeAlloc(SearchBooleanField value) {
        this.isVsoeAlloc = value;
    }

    /**
     * Gets the value of the isWip property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsWip() {
        return isWip;
    }

    /**
     * Sets the value of the isWip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsWip(SearchBooleanField value) {
        this.isWip = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItem(SearchMultiSelectField value) {
        this.item = value;
    }

    /**
     * Gets the value of the itemRevision property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemRevision() {
        return itemRevision;
    }

    /**
     * Sets the value of the itemRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemRevision(SearchMultiSelectField value) {
        this.itemRevision = value;
    }

    /**
     * Gets the value of the itemSubOf property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemSubOf() {
        return itemSubOf;
    }

    /**
     * Sets the value of the itemSubOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemSubOf(SearchMultiSelectField value) {
        this.itemSubOf = value;
    }

    /**
     * Gets the value of the landedCostPerLine property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getLandedCostPerLine() {
        return landedCostPerLine;
    }

    /**
     * Sets the value of the landedCostPerLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setLandedCostPerLine(SearchBooleanField value) {
        this.landedCostPerLine = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastModifiedDate(SearchDateField value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the leadSource property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the value of the leadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLeadSource(SearchMultiSelectField value) {
        this.leadSource = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocation(SearchMultiSelectField value) {
        this.location = value;
    }

    /**
     * Gets the value of the mainLine property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMainLine() {
        return mainLine;
    }

    /**
     * Sets the value of the mainLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMainLine(SearchBooleanField value) {
        this.mainLine = value;
    }

    /**
     * Gets the value of the mainName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getMainName() {
        return mainName;
    }

    /**
     * Sets the value of the mainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setMainName(SearchMultiSelectField value) {
        this.mainName = value;
    }

    /**
     * Gets the value of the manufacturingRouting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getManufacturingRouting() {
        return manufacturingRouting;
    }

    /**
     * Sets the value of the manufacturingRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setManufacturingRouting(SearchMultiSelectField value) {
        this.manufacturingRouting = value;
    }

    /**
     * Gets the value of the matchBillToReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMatchBillToReceipt() {
        return matchBillToReceipt;
    }

    /**
     * Sets the value of the matchBillToReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMatchBillToReceipt(SearchBooleanField value) {
        this.matchBillToReceipt = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMemo(SearchStringField value) {
        this.memo = value;
    }

    /**
     * Gets the value of the memoMain property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMemoMain() {
        return memoMain;
    }

    /**
     * Sets the value of the memoMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMemoMain(SearchStringField value) {
        this.memoMain = value;
    }

    /**
     * Gets the value of the memorized property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMemorized() {
        return memorized;
    }

    /**
     * Sets the value of the memorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMemorized(SearchBooleanField value) {
        this.memorized = value;
    }

    /**
     * Gets the value of the merchantAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMerchantAccount() {
        return merchantAccount;
    }

    /**
     * Sets the value of the merchantAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMerchantAccount(SearchStringField value) {
        this.merchantAccount = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMessage(SearchStringField value) {
        this.message = value;
    }

    /**
     * Gets the value of the multiSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMultiSubsidiary() {
        return multiSubsidiary;
    }

    /**
     * Sets the value of the multiSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMultiSubsidiary(SearchBooleanField value) {
        this.multiSubsidiary = value;
    }

    /**
     * Gets the value of the nameText property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getNameText() {
        return nameText;
    }

    /**
     * Sets the value of the nameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setNameText(SearchStringField value) {
        this.nameText = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setNetAmount(SearchDoubleField value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the nextApprover property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getNextApprover() {
        return nextApprover;
    }

    /**
     * Sets the value of the nextApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setNextApprover(SearchMultiSelectField value) {
        this.nextApprover = value;
    }

    /**
     * Gets the value of the nextBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getNextBillDate() {
        return nextBillDate;
    }

    /**
     * Sets the value of the nextBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setNextBillDate(SearchDateField value) {
        this.nextBillDate = value;
    }

    /**
     * Gets the value of the nonReimbursable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getNonReimbursable() {
        return nonReimbursable;
    }

    /**
     * Sets the value of the nonReimbursable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setNonReimbursable(SearchBooleanField value) {
        this.nonReimbursable = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setNumber(SearchLongField value) {
        this.number = value;
    }

    /**
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOpportunity(SearchMultiSelectField value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOrderPriority(SearchDoubleField value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the otherRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTextNumberField }
     *     
     */
    public SearchTextNumberField getOtherRefNum() {
        return otherRefNum;
    }

    /**
     * Sets the value of the otherRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTextNumberField }
     *     
     */
    public void setOtherRefNum(SearchTextNumberField value) {
        this.otherRefNum = value;
    }

    /**
     * Gets the value of the otherRefNumNonDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTextNumberField }
     *     
     */
    public SearchTextNumberField getOtherRefNumNonDeposit() {
        return otherRefNumNonDeposit;
    }

    /**
     * Sets the value of the otherRefNumNonDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTextNumberField }
     *     
     */
    public void setOtherRefNumNonDeposit(SearchTextNumberField value) {
        this.otherRefNumNonDeposit = value;
    }

    /**
     * Gets the value of the overheadParentItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOverheadParentItem() {
        return overheadParentItem;
    }

    /**
     * Sets the value of the overheadParentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOverheadParentItem(SearchMultiSelectField value) {
        this.overheadParentItem = value;
    }

    /**
     * Gets the value of the packageCount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPackageCount() {
        return packageCount;
    }

    /**
     * Sets the value of the packageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPackageCount(SearchLongField value) {
        this.packageCount = value;
    }

    /**
     * Gets the value of the paidTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPaidTransaction() {
        return paidTransaction;
    }

    /**
     * Sets the value of the paidTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPaidTransaction(SearchMultiSelectField value) {
        this.paidTransaction = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setParent(SearchLongField value) {
        this.parent = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartner(SearchMultiSelectField value) {
        this.partner = value;
    }

    /**
     * Gets the value of the partnerContribution property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPartnerContribution() {
        return partnerContribution;
    }

    /**
     * Sets the value of the partnerContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPartnerContribution(SearchLongField value) {
        this.partnerContribution = value;
    }

    /**
     * Gets the value of the partnerRole property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }

    /**
     * Sets the value of the partnerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartnerRole(SearchMultiSelectField value) {
        this.partnerRole = value;
    }

    /**
     * Gets the value of the partnerTeamMember property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }

    /**
     * Sets the value of the partnerTeamMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartnerTeamMember(SearchMultiSelectField value) {
        this.partnerTeamMember = value;
    }

    /**
     * Gets the value of the payingTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPayingTransaction() {
        return payingTransaction;
    }

    /**
     * Sets the value of the payingTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPayingTransaction(SearchMultiSelectField value) {
        this.payingTransaction = value;
    }

    /**
     * Gets the value of the paymentApproved property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPaymentApproved() {
        return paymentApproved;
    }

    /**
     * Sets the value of the paymentApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPaymentApproved(SearchBooleanField value) {
        this.paymentApproved = value;
    }

    /**
     * Gets the value of the paymentEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getPaymentEventDate() {
        return paymentEventDate;
    }

    /**
     * Sets the value of the paymentEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setPaymentEventDate(SearchDateField value) {
        this.paymentEventDate = value;
    }

    /**
     * Gets the value of the paymentEventHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPaymentEventHoldReason() {
        return paymentEventHoldReason;
    }

    /**
     * Sets the value of the paymentEventHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPaymentEventHoldReason(SearchEnumMultiSelectField value) {
        this.paymentEventHoldReason = value;
    }

    /**
     * Gets the value of the paymentEventPurchaseCardUsed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPaymentEventPurchaseCardUsed() {
        return paymentEventPurchaseCardUsed;
    }

    /**
     * Sets the value of the paymentEventPurchaseCardUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPaymentEventPurchaseCardUsed(SearchBooleanField value) {
        this.paymentEventPurchaseCardUsed = value;
    }

    /**
     * Gets the value of the paymentEventPurchaseDataSent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPaymentEventPurchaseDataSent() {
        return paymentEventPurchaseDataSent;
    }

    /**
     * Sets the value of the paymentEventPurchaseDataSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPaymentEventPurchaseDataSent(SearchBooleanField value) {
        this.paymentEventPurchaseDataSent = value;
    }

    /**
     * Gets the value of the paymentEventResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPaymentEventResult() {
        return paymentEventResult;
    }

    /**
     * Sets the value of the paymentEventResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPaymentEventResult(SearchEnumMultiSelectField value) {
        this.paymentEventResult = value;
    }

    /**
     * Gets the value of the paymentEventType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPaymentEventType() {
        return paymentEventType;
    }

    /**
     * Sets the value of the paymentEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPaymentEventType(SearchEnumMultiSelectField value) {
        this.paymentEventType = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPaymentMethod(SearchMultiSelectField value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the payPalPending property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPayPalPending() {
        return payPalPending;
    }

    /**
     * Sets the value of the payPalPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPayPalPending(SearchBooleanField value) {
        this.payPalPending = value;
    }

    /**
     * Gets the value of the payPalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPayPalStatus() {
        return payPalStatus;
    }

    /**
     * Sets the value of the payPalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPayPalStatus(SearchStringField value) {
        this.payPalStatus = value;
    }

    /**
     * Gets the value of the payPalTranId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPayPalTranId() {
        return payPalTranId;
    }

    /**
     * Sets the value of the payPalTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPayPalTranId(SearchStringField value) {
        this.payPalTranId = value;
    }

    /**
     * Gets the value of the pnRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPnRefNum() {
        return pnRefNum;
    }

    /**
     * Sets the value of the pnRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPnRefNum(SearchStringField value) {
        this.pnRefNum = value;
    }

    /**
     * Gets the value of the poAsText property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPoAsText() {
        return poAsText;
    }

    /**
     * Sets the value of the poAsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPoAsText(SearchStringField value) {
        this.poAsText = value;
    }

    /**
     * Gets the value of the posting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPosting() {
        return posting;
    }

    /**
     * Sets the value of the posting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPosting(SearchBooleanField value) {
        this.posting = value;
    }

    /**
     * Gets the value of the postingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPostingPeriod() {
        return postingPeriod;
    }

    /**
     * Sets the value of the postingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPostingPeriod(RecordRef value) {
        this.postingPeriod = value;
    }

    /**
     * Gets the value of the postingPeriodRelative property.
     * 
     * @return
     *     possible object is
     *     {@link PostingPeriodDate }
     *     
     */
    public PostingPeriodDate getPostingPeriodRelative() {
        return postingPeriodRelative;
    }

    /**
     * Sets the value of the postingPeriodRelative property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingPeriodDate }
     *     
     */
    public void setPostingPeriodRelative(PostingPeriodDate value) {
        this.postingPeriodRelative = value;
    }

    /**
     * Gets the value of the priceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPriceLevel() {
        return priceLevel;
    }

    /**
     * Sets the value of the priceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPriceLevel(SearchMultiSelectField value) {
        this.priceLevel = value;
    }

    /**
     * Gets the value of the printedPickingTicket property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPrintedPickingTicket() {
        return printedPickingTicket;
    }

    /**
     * Sets the value of the printedPickingTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPrintedPickingTicket(SearchBooleanField value) {
        this.printedPickingTicket = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setProbability(SearchLongField value) {
        this.probability = value;
    }

    /**
     * Gets the value of the projectedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getProjectedAmount() {
        return projectedAmount;
    }

    /**
     * Sets the value of the projectedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setProjectedAmount(SearchDoubleField value) {
        this.projectedAmount = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPromoCode(SearchMultiSelectField value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPurchaseOrder(SearchMultiSelectField value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantity(SearchDoubleField value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityBilled property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityBilled() {
        return quantityBilled;
    }

    /**
     * Sets the value of the quantityBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityBilled(SearchDoubleField value) {
        this.quantityBilled = value;
    }

    /**
     * Gets the value of the quantityCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * Sets the value of the quantityCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityCommitted(SearchDoubleField value) {
        this.quantityCommitted = value;
    }

    /**
     * Gets the value of the quantityPacked property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityPacked() {
        return quantityPacked;
    }

    /**
     * Sets the value of the quantityPacked property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityPacked(SearchDoubleField value) {
        this.quantityPacked = value;
    }

    /**
     * Gets the value of the quantityPicked property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityPicked() {
        return quantityPicked;
    }

    /**
     * Sets the value of the quantityPicked property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityPicked(SearchDoubleField value) {
        this.quantityPicked = value;
    }

    /**
     * Gets the value of the quantityRevCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityRevCommitted() {
        return quantityRevCommitted;
    }

    /**
     * Sets the value of the quantityRevCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityRevCommitted(SearchDoubleField value) {
        this.quantityRevCommitted = value;
    }

    /**
     * Gets the value of the quantityShipRecv property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityShipRecv() {
        return quantityShipRecv;
    }

    /**
     * Sets the value of the quantityShipRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityShipRecv(SearchDoubleField value) {
        this.quantityShipRecv = value;
    }

    /**
     * Gets the value of the recognizedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRecognizedRevenue() {
        return recognizedRevenue;
    }

    /**
     * Sets the value of the recognizedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRecognizedRevenue(SearchDoubleField value) {
        this.recognizedRevenue = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setRecordType(SearchStringField value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRefNumber(SearchLongField value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the revCommitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRevCommitStatus() {
        return revCommitStatus;
    }

    /**
     * Sets the value of the revCommitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRevCommitStatus(SearchEnumMultiSelectField value) {
        this.revCommitStatus = value;
    }

    /**
     * Gets the value of the revCommittingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRevCommittingStatus() {
        return revCommittingStatus;
    }

    /**
     * Sets the value of the revCommittingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRevCommittingStatus(SearchBooleanField value) {
        this.revCommittingStatus = value;
    }

    /**
     * Gets the value of the revCommittingTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevCommittingTransaction() {
        return revCommittingTransaction;
    }

    /**
     * Sets the value of the revCommittingTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevCommittingTransaction(SearchMultiSelectField value) {
        this.revCommittingTransaction = value;
    }

    /**
     * Gets the value of the revenueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRevenueStatus() {
        return revenueStatus;
    }

    /**
     * Sets the value of the revenueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRevenueStatus(SearchEnumMultiSelectField value) {
        this.revenueStatus = value;
    }

    /**
     * Gets the value of the reversalDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getReversalDate() {
        return reversalDate;
    }

    /**
     * Sets the value of the reversalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setReversalDate(SearchDateField value) {
        this.reversalDate = value;
    }

    /**
     * Gets the value of the reversalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getReversalNumber() {
        return reversalNumber;
    }

    /**
     * Sets the value of the reversalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setReversalNumber(SearchStringField value) {
        this.reversalNumber = value;
    }

    /**
     * Gets the value of the revRecEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getRevRecEndDate() {
        return revRecEndDate;
    }

    /**
     * Sets the value of the revRecEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setRevRecEndDate(SearchDateField value) {
        this.revRecEndDate = value;
    }

    /**
     * Gets the value of the revRecOnRevCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }

    /**
     * Sets the value of the revRecOnRevCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRevRecOnRevCommitment(SearchBooleanField value) {
        this.revRecOnRevCommitment = value;
    }

    /**
     * Gets the value of the revRecStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getRevRecStartDate() {
        return revRecStartDate;
    }

    /**
     * Sets the value of the revRecStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setRevRecStartDate(SearchDateField value) {
        this.revRecStartDate = value;
    }

    /**
     * Gets the value of the revRecTermInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRevRecTermInMonths() {
        return revRecTermInMonths;
    }

    /**
     * Sets the value of the revRecTermInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRevRecTermInMonths(SearchLongField value) {
        this.revRecTermInMonths = value;
    }

    /**
     * Gets the value of the salesEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getSalesEffectiveDate() {
        return salesEffectiveDate;
    }

    /**
     * Sets the value of the salesEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setSalesEffectiveDate(SearchDateField value) {
        this.salesEffectiveDate = value;
    }

    /**
     * Gets the value of the salesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesOrder() {
        return salesOrder;
    }

    /**
     * Sets the value of the salesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesOrder(SearchMultiSelectField value) {
        this.salesOrder = value;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesRep() {
        return salesRep;
    }

    /**
     * Sets the value of the salesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesRep(SearchMultiSelectField value) {
        this.salesRep = value;
    }

    /**
     * Gets the value of the salesTeamMember property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }

    /**
     * Sets the value of the salesTeamMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesTeamMember(SearchMultiSelectField value) {
        this.salesTeamMember = value;
    }

    /**
     * Gets the value of the salesTeamRole property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }

    /**
     * Sets the value of the salesTeamRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesTeamRole(SearchMultiSelectField value) {
        this.salesTeamRole = value;
    }

    /**
     * Gets the value of the schedulingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSchedulingMethod() {
        return schedulingMethod;
    }

    /**
     * Sets the value of the schedulingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSchedulingMethod(SearchEnumMultiSelectField value) {
        this.schedulingMethod = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSerialNumber(SearchStringField value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNumberCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSerialNumberCost() {
        return serialNumberCost;
    }

    /**
     * Sets the value of the serialNumberCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSerialNumberCost(SearchDoubleField value) {
        this.serialNumberCost = value;
    }

    /**
     * Gets the value of the serialNumberCostAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSerialNumberCostAdjustment() {
        return serialNumberCostAdjustment;
    }

    /**
     * Sets the value of the serialNumberCostAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSerialNumberCostAdjustment(SearchDoubleField value) {
        this.serialNumberCostAdjustment = value;
    }

    /**
     * Gets the value of the serialNumberQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSerialNumberQuantity() {
        return serialNumberQuantity;
    }

    /**
     * Sets the value of the serialNumberQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSerialNumberQuantity(SearchDoubleField value) {
        this.serialNumberQuantity = value;
    }

    /**
     * Gets the value of the serialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * Sets the value of the serialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSerialNumbers(SearchStringField value) {
        this.serialNumbers = value;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipAddress() {
        return shipAddress;
    }

    /**
     * Sets the value of the shipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipAddress(SearchStringField value) {
        this.shipAddress = value;
    }

    /**
     * Gets the value of the shipAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipAddressee() {
        return shipAddressee;
    }

    /**
     * Sets the value of the shipAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipAddressee(SearchStringField value) {
        this.shipAddressee = value;
    }

    /**
     * Gets the value of the shipAttention property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipAttention() {
        return shipAttention;
    }

    /**
     * Sets the value of the shipAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipAttention(SearchStringField value) {
        this.shipAttention = value;
    }

    /**
     * Gets the value of the shipCity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipCity() {
        return shipCity;
    }

    /**
     * Sets the value of the shipCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipCity(SearchStringField value) {
        this.shipCity = value;
    }

    /**
     * Gets the value of the shipComplete property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipComplete() {
        return shipComplete;
    }

    /**
     * Sets the value of the shipComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipComplete(SearchBooleanField value) {
        this.shipComplete = value;
    }

    /**
     * Gets the value of the shipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getShipCountry() {
        return shipCountry;
    }

    /**
     * Sets the value of the shipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setShipCountry(SearchEnumMultiSelectField value) {
        this.shipCountry = value;
    }

    /**
     * Gets the value of the shipCounty property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipCounty() {
        return shipCounty;
    }

    /**
     * Sets the value of the shipCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipCounty(SearchStringField value) {
        this.shipCounty = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setShipDate(SearchDateField value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getShipGroup() {
        return shipGroup;
    }

    /**
     * Sets the value of the shipGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setShipGroup(SearchLongField value) {
        this.shipGroup = value;
    }

    /**
     * Gets the value of the shipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipMethod() {
        return shipMethod;
    }

    /**
     * Sets the value of the shipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipMethod(SearchMultiSelectField value) {
        this.shipMethod = value;
    }

    /**
     * Gets the value of the shipPhone property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipPhone() {
        return shipPhone;
    }

    /**
     * Sets the value of the shipPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipPhone(SearchStringField value) {
        this.shipPhone = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipping(SearchBooleanField value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the shipRecvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipRecvStatus() {
        return shipRecvStatus;
    }

    /**
     * Sets the value of the shipRecvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipRecvStatus(SearchBooleanField value) {
        this.shipRecvStatus = value;
    }

    /**
     * Gets the value of the shipRecvStatusLine property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipRecvStatusLine() {
        return shipRecvStatusLine;
    }

    /**
     * Sets the value of the shipRecvStatusLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipRecvStatusLine(SearchBooleanField value) {
        this.shipRecvStatusLine = value;
    }

    /**
     * Gets the value of the shipState property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipState() {
        return shipState;
    }

    /**
     * Sets the value of the shipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipState(SearchMultiSelectField value) {
        this.shipState = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipTo(SearchMultiSelectField value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipZip property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipZip() {
        return shipZip;
    }

    /**
     * Sets the value of the shipZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipZip(SearchStringField value) {
        this.shipZip = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSource(SearchEnumMultiSelectField value) {
        this.source = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setStartDate(SearchDateField value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the statistical property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getStatistical() {
        return statistical;
    }

    /**
     * Sets the value of the statistical property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setStatistical(SearchBooleanField value) {
        this.statistical = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setStatus(SearchEnumMultiSelectField value) {
        this.status = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the taxItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTaxItem() {
        return taxItem;
    }

    /**
     * Sets the value of the taxItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTaxItem(SearchMultiSelectField value) {
        this.taxItem = value;
    }

    /**
     * Gets the value of the taxLine property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTaxLine() {
        return taxLine;
    }

    /**
     * Sets the value of the taxLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTaxLine(SearchBooleanField value) {
        this.taxLine = value;
    }

    /**
     * Gets the value of the taxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Sets the value of the taxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxPeriod(RecordRef value) {
        this.taxPeriod = value;
    }

    /**
     * Gets the value of the taxPeriodRelative property.
     * 
     * @return
     *     possible object is
     *     {@link PostingPeriodDate }
     *     
     */
    public PostingPeriodDate getTaxPeriodRelative() {
        return taxPeriodRelative;
    }

    /**
     * Sets the value of the taxPeriodRelative property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingPeriodDate }
     *     
     */
    public void setTaxPeriodRelative(PostingPeriodDate value) {
        this.taxPeriodRelative = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTaxRate(SearchDoubleField value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTerms(SearchMultiSelectField value) {
        this.terms = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTitle(SearchStringField value) {
        this.title = value;
    }

    /**
     * Gets the value of the toBeEmailed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getToBeEmailed() {
        return toBeEmailed;
    }

    /**
     * Sets the value of the toBeEmailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setToBeEmailed(SearchBooleanField value) {
        this.toBeEmailed = value;
    }

    /**
     * Gets the value of the toBePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getToBePrinted() {
        return toBePrinted;
    }

    /**
     * Sets the value of the toBePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setToBePrinted(SearchBooleanField value) {
        this.toBePrinted = value;
    }

    /**
     * Gets the value of the toSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getToSubsidiary() {
        return toSubsidiary;
    }

    /**
     * Sets the value of the toSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setToSubsidiary(SearchMultiSelectField value) {
        this.toSubsidiary = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTotalAmount(SearchDoubleField value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the trackingNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTrackingNumbers() {
        return trackingNumbers;
    }

    /**
     * Sets the value of the trackingNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTrackingNumbers(SearchStringField value) {
        this.trackingNumbers = value;
    }

    /**
     * Gets the value of the tranCostEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranCostEstimate() {
        return tranCostEstimate;
    }

    /**
     * Sets the value of the tranCostEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranCostEstimate(SearchDoubleField value) {
        this.tranCostEstimate = value;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setTranDate(SearchDateField value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the tranEstGrossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }

    /**
     * Sets the value of the tranEstGrossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranEstGrossProfit(SearchDoubleField value) {
        this.tranEstGrossProfit = value;
    }

    /**
     * Gets the value of the tranEstGrossProfitPct property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }

    /**
     * Sets the value of the tranEstGrossProfitPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranEstGrossProfitPct(SearchDoubleField value) {
        this.tranEstGrossProfitPct = value;
    }

    /**
     * Gets the value of the tranFxEstGrossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }

    /**
     * Sets the value of the tranFxEstGrossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranFxEstGrossProfit(SearchDoubleField value) {
        this.tranFxEstGrossProfit = value;
    }

    /**
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTranId(SearchStringField value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the tranIsVsoeBundle property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }

    /**
     * Sets the value of the tranIsVsoeBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTranIsVsoeBundle(SearchBooleanField value) {
        this.tranIsVsoeBundle = value;
    }

    /**
     * Gets the value of the transactionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTransactionDiscount() {
        return transactionDiscount;
    }

    /**
     * Sets the value of the transactionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTransactionDiscount(SearchBooleanField value) {
        this.transactionDiscount = value;
    }

    /**
     * Gets the value of the transactionLineType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getTransactionLineType() {
        return transactionLineType;
    }

    /**
     * Sets the value of the transactionLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setTransactionLineType(SearchEnumMultiSelectField value) {
        this.transactionLineType = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTransactionNumber(SearchStringField value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the transferLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTransferLocation() {
        return transferLocation;
    }

    /**
     * Sets the value of the transferLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTransferLocation(SearchMultiSelectField value) {
        this.transferLocation = value;
    }

    /**
     * Gets the value of the transferOrderQuantityCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityCommitted() {
        return transferOrderQuantityCommitted;
    }

    /**
     * Sets the value of the transferOrderQuantityCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityCommitted(SearchDoubleField value) {
        this.transferOrderQuantityCommitted = value;
    }

    /**
     * Gets the value of the transferOrderQuantityPacked property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityPacked() {
        return transferOrderQuantityPacked;
    }

    /**
     * Sets the value of the transferOrderQuantityPacked property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityPacked(SearchDoubleField value) {
        this.transferOrderQuantityPacked = value;
    }

    /**
     * Gets the value of the transferOrderQuantityPicked property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityPicked() {
        return transferOrderQuantityPicked;
    }

    /**
     * Sets the value of the transferOrderQuantityPicked property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityPicked(SearchDoubleField value) {
        this.transferOrderQuantityPicked = value;
    }

    /**
     * Gets the value of the transferOrderQuantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityReceived() {
        return transferOrderQuantityReceived;
    }

    /**
     * Sets the value of the transferOrderQuantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityReceived(SearchDoubleField value) {
        this.transferOrderQuantityReceived = value;
    }

    /**
     * Gets the value of the transferOrderQuantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityShipped() {
        return transferOrderQuantityShipped;
    }

    /**
     * Sets the value of the transferOrderQuantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityShipped(SearchDoubleField value) {
        this.transferOrderQuantityShipped = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setType(SearchEnumMultiSelectField value) {
        this.type = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setUnit(SearchMultiSelectField value) {
        this.unit = value;
    }

    /**
     * Gets the value of the unitCostOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnitCostOverride() {
        return unitCostOverride;
    }

    /**
     * Sets the value of the unitCostOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnitCostOverride(SearchDoubleField value) {
        this.unitCostOverride = value;
    }

    /**
     * Gets the value of the unitsType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getUnitsType() {
        return unitsType;
    }

    /**
     * Sets the value of the unitsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setUnitsType(SearchMultiSelectField value) {
        this.unitsType = value;
    }

    /**
     * Gets the value of the vendType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendType() {
        return vendType;
    }

    /**
     * Sets the value of the vendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendType(SearchMultiSelectField value) {
        this.vendType = value;
    }

    /**
     * Gets the value of the visibleToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getVisibleToCustomer() {
        return visibleToCustomer;
    }

    /**
     * Sets the value of the visibleToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setVisibleToCustomer(SearchBooleanField value) {
        this.visibleToCustomer = value;
    }

    /**
     * Gets the value of the voided property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getVoided() {
        return voided;
    }

    /**
     * Sets the value of the voided property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setVoided(SearchBooleanField value) {
        this.voided = value;
    }

    /**
     * Gets the value of the vsoeAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVsoeAllocation() {
        return vsoeAllocation;
    }

    /**
     * Sets the value of the vsoeAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVsoeAllocation(SearchDoubleField value) {
        this.vsoeAllocation = value;
    }

    /**
     * Gets the value of the vsoeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVsoeAmount() {
        return vsoeAmount;
    }

    /**
     * Sets the value of the vsoeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVsoeAmount(SearchDoubleField value) {
        this.vsoeAmount = value;
    }

    /**
     * Gets the value of the vsoeDeferral property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getVsoeDeferral() {
        return vsoeDeferral;
    }

    /**
     * Sets the value of the vsoeDeferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setVsoeDeferral(SearchEnumMultiSelectField value) {
        this.vsoeDeferral = value;
    }

    /**
     * Gets the value of the vsoeDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getVsoeDelivered() {
        return vsoeDelivered;
    }

    /**
     * Sets the value of the vsoeDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setVsoeDelivered(SearchBooleanField value) {
        this.vsoeDelivered = value;
    }

    /**
     * Gets the value of the vsoePermitDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }

    /**
     * Sets the value of the vsoePermitDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setVsoePermitDiscount(SearchEnumMultiSelectField value) {
        this.vsoePermitDiscount = value;
    }

    /**
     * Gets the value of the vsoePrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVsoePrice() {
        return vsoePrice;
    }

    /**
     * Sets the value of the vsoePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVsoePrice(SearchDoubleField value) {
        this.vsoePrice = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setWebSite(SearchMultiSelectField value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
