
package com.netsuite.webservices.platform.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core.SearchColumnCustomFieldList;
import com.netsuite.webservices.platform.core.SearchColumnDateField;
import com.netsuite.webservices.platform.core.SearchColumnDoubleField;
import com.netsuite.webservices.platform.core.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core.SearchColumnLongField;
import com.netsuite.webservices.platform.core.SearchColumnSelectField;
import com.netsuite.webservices.platform.core.SearchColumnStringField;
import com.netsuite.webservices.platform.core.SearchColumnTextNumberField;
import com.netsuite.webservices.platform.core.SearchRowBasic;


/**
 * <p>Java class for TransactionSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abbrev" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="actualShipDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altSalesAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altSalesNetAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amountPaid" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amountRemaining" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amountUnbilled" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedToForeignAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedToIsFxVariance" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedToLinkAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedToLinkType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedToTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applyingForeignAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applyingIsFxVariance" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applyingLinkAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applyingLinkType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applyingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="approvalStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autoCalculateLag" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avsStreetMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="avsZipMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress1" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress2" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress3" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddressee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAttention" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billCountry" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billCountryCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billingAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billingSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billVarianceStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billZip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="binNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="binNumberQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bomQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="buildEntireAssembly" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="buildVariance" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="built" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catchUpPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ccCustomerCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ccExpDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ccHolderName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ccNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ccStreet" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ccZipCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cleared" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="closed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="closeDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cogsAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commissionEffectiveDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="componentYield" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="confirmationNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contribution" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contributionPrimary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costComponentAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costComponentCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costComponentItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costComponentQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costComponentStandardCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="createdBy" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="createdFrom" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cscMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dateCreated" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="daysOpen" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="daysOverdue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="debitAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deferredRevenue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deferRevRec" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="depositDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="depositTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="docUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="drAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effectiveRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estGrossProfitPct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estGrossProfitPercent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="excludeCommission" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="excludeFromRateRequest" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expectedCloseDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expectedReceiptDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expenseCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expenseDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="firmed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="forecastType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fulfillingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxCostEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxCostEstimateRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxEstGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxTranCostEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxVsoeAllocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxVsoeAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxVsoePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvailabelToCharge" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvailableToRefund" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvsStreetMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoAvsZipMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoBuyerAccountAge" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoBuyerIp" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoChargeAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoChargebackAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoConfirmedChargedTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoConfirmedRefundedTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoCreditcardNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoCscMatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoFinancialState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoFulfillmentState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoOrderId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoOrderTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoPromotionAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoPromotionName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoRefundAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoShippingTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gcoStateChangedDetail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCert" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="grossAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includeInForecast" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="intercoStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="intercoTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inVsoeBundle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isAllocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isBackflush" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isGcoChargeback" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isGcoChargeConfirmed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isGcoPaymentGuaranteed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isGcoRefundConfirmed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isIntercompanyAdjustment" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isMultiShipTo" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isReversal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isRevRecTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isScrap" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isShipAddress" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTransferPriceCosting" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isWip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemRevision" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landedCostPerLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="leadSource" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="line" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lineSequenceNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mainLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mainName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingRouting" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchBillToReceipt" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="memoMain" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="memorized" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="merchantAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="multiSubsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="netAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="netAmountNoTax" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nextApprover" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nextBillDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nonReimbursable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="opportunity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="orderPriority" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="otherRefNum" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnTextNumberField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="overheadParentItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packageCount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paidAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paidTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partner" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partnerContribution" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partnerRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partnerTeamMember" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payingAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentApproved" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventHoldReason" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventPurchaseCardUsed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventPurchaseDataSent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventResult" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentEventType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payPalPending" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payPalStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payPalTranId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payrollBatch" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pnRefNum" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="poRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="posting" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="postingPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="priceLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="print" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="probability" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="projectedAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="promoCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityBilled" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityPacked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityPicked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityRevCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityShipRecv" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityUom" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="realizedGainPostingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recognizedRevenue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="refNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revCommitStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revCommittingTransaction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revenueStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reversalDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reversalNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revRecEndDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revRecOnRevCommitment" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revRecStartDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rgAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rgAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesEffectiveDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesRep" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesTeamMember" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesTeamRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="schedulingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberCostAdjustment" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialNumbers" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress1" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress2" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress3" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddressee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAttention" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipComplete" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipCountry" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipCountryCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipGroup" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipRecvStatusLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipZip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="signedAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxTotal" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="termInMonths" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="terms" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="toBeEmailed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="toBePrinted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="toSubsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalCostEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trackingNumbers" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tranDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tranEstGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tranFxEstGrossProfit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tranId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tranIsVsoeBundle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transactionDiscount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transactionLineType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transactionNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderItemLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityPacked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityPicked" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityReceived" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferOrderQuantityShipped" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unitCostOverride" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="visibleToCustomer" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoeAllocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoeAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDeferral" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDelivered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoePermitDiscount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="webSite" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnCustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchRowBasic", propOrder = {
    "abbrev",
    "account",
    "accountType",
    "actualShipDate",
    "altSalesAmount",
    "altSalesNetAmount",
    "amount",
    "amountPaid",
    "amountRemaining",
    "amountUnbilled",
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
    "billAddress1",
    "billAddress2",
    "billAddress3",
    "billAddressee",
    "billAttention",
    "billCity",
    "billCountry",
    "billCountryCode",
    "billedDate",
    "billingAmount",
    "billingSchedule",
    "billingTransaction",
    "billPhone",
    "billState",
    "billVarianceStatus",
    "billZip",
    "binNumber",
    "binNumberQuantity",
    "bomQuantity",
    "buildEntireAssembly",
    "buildVariance",
    "built",
    "catchUpPeriod",
    "ccCustomerCode",
    "ccExpDate",
    "ccHolderName",
    "ccNumber",
    "ccStreet",
    "ccZipCode",
    "clazz",
    "cleared",
    "closed",
    "closeDate",
    "cogsAmount",
    "commissionEffectiveDate",
    "commit",
    "componentYield",
    "confirmationNumber",
    "contribution",
    "contributionPrimary",
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
    "discountAmount",
    "docUnit",
    "drAccount",
    "dueDate",
    "effectiveRate",
    "email",
    "endDate",
    "entity",
    "entityStatus",
    "estGrossProfit",
    "estGrossProfitPct",
    "estGrossProfitPercent",
    "exchangeRate",
    "excludeCommission",
    "excludeFromRateRequest",
    "expectedCloseDate",
    "expectedReceiptDate",
    "expenseCategory",
    "expenseDate",
    "externalId",
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
    "giftCert",
    "grossAmount",
    "includeInForecast",
    "intercoStatus",
    "intercoTransaction",
    "internalId",
    "inVsoeBundle",
    "isAllocation",
    "isBackflush",
    "isGcoChargeback",
    "isGcoChargeConfirmed",
    "isGcoPaymentGuaranteed",
    "isGcoRefundConfirmed",
    "isIntercompanyAdjustment",
    "isMultiShipTo",
    "isReversal",
    "isRevRecTransaction",
    "isScrap",
    "isShipAddress",
    "isTransferPriceCosting",
    "isWip",
    "item",
    "itemRevision",
    "landedCostPerLine",
    "lastModifiedDate",
    "leadSource",
    "line",
    "lineSequenceNumber",
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
    "netAmount",
    "netAmountNoTax",
    "nextApprover",
    "nextBillDate",
    "nonReimbursable",
    "opportunity",
    "options",
    "orderPriority",
    "originator",
    "otherRefNum",
    "overheadParentItem",
    "packageCount",
    "paidAmount",
    "paidTransaction",
    "partner",
    "partnerContribution",
    "partnerRole",
    "partnerTeamMember",
    "payingAmount",
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
    "payrollBatch",
    "pnRefNum",
    "poRate",
    "posting",
    "postingPeriod",
    "priceLevel",
    "print",
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
    "quantityUom",
    "rate",
    "realizedGainPostingTransaction",
    "recognizedRevenue",
    "recordType",
    "refNumber",
    "revCommitStatus",
    "revCommittingTransaction",
    "revenueStatus",
    "reversalDate",
    "reversalNumber",
    "revRecEndDate",
    "revRecOnRevCommitment",
    "revRecStartDate",
    "rgAccount",
    "rgAmount",
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
    "shipAddress1",
    "shipAddress2",
    "shipAddress3",
    "shipAddressee",
    "shipAttention",
    "shipCity",
    "shipComplete",
    "shipCountry",
    "shipCountryCode",
    "shipDate",
    "shipGroup",
    "shipMethod",
    "shipPhone",
    "shippingAmount",
    "shipRecvStatusLine",
    "shipState",
    "shipTo",
    "shipZip",
    "signedAmount",
    "source",
    "startDate",
    "status",
    "subsidiary",
    "taxAmount",
    "taxCode",
    "taxLine",
    "taxPeriod",
    "taxTotal",
    "termInMonths",
    "terms",
    "title",
    "toBeEmailed",
    "toBePrinted",
    "toSubsidiary",
    "total",
    "totalCostEstimate",
    "trackingNumbers",
    "tranDate",
    "tranEstGrossProfit",
    "tranFxEstGrossProfit",
    "tranId",
    "tranIsVsoeBundle",
    "transactionDiscount",
    "transactionLineType",
    "transactionNumber",
    "transferLocation",
    "transferOrderItemLine",
    "transferOrderQuantityCommitted",
    "transferOrderQuantityPacked",
    "transferOrderQuantityPicked",
    "transferOrderQuantityReceived",
    "transferOrderQuantityShipped",
    "type",
    "unit",
    "unitCostOverride",
    "vendType",
    "visibleToCustomer",
    "vsoeAllocation",
    "vsoeAmount",
    "vsoeDeferral",
    "vsoeDelivered",
    "vsoePermitDiscount",
    "vsoePrice",
    "webSite",
    "customFieldList"
})
public class TransactionSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnStringField> abbrev;
    protected List<SearchColumnSelectField> account;
    protected List<SearchColumnStringField> accountType;
    protected List<SearchColumnDateField> actualShipDate;
    protected List<SearchColumnDoubleField> altSalesAmount;
    protected List<SearchColumnDoubleField> altSalesNetAmount;
    protected List<SearchColumnDoubleField> amount;
    protected List<SearchColumnDoubleField> amountPaid;
    protected List<SearchColumnDoubleField> amountRemaining;
    protected List<SearchColumnDoubleField> amountUnbilled;
    protected List<SearchColumnDoubleField> appliedToForeignAmount;
    protected List<SearchColumnBooleanField> appliedToIsFxVariance;
    protected List<SearchColumnDoubleField> appliedToLinkAmount;
    protected List<SearchColumnStringField> appliedToLinkType;
    protected List<SearchColumnSelectField> appliedToTransaction;
    protected List<SearchColumnDoubleField> applyingForeignAmount;
    protected List<SearchColumnBooleanField> applyingIsFxVariance;
    protected List<SearchColumnDoubleField> applyingLinkAmount;
    protected List<SearchColumnStringField> applyingLinkType;
    protected List<SearchColumnSelectField> applyingTransaction;
    protected List<SearchColumnEnumSelectField> approvalStatus;
    protected List<SearchColumnStringField> authCode;
    protected List<SearchColumnBooleanField> autoCalculateLag;
    protected List<SearchColumnEnumSelectField> avsStreetMatch;
    protected List<SearchColumnEnumSelectField> avsZipMatch;
    protected List<SearchColumnBooleanField> billable;
    protected List<SearchColumnStringField> billAddress;
    protected List<SearchColumnStringField> billAddress1;
    protected List<SearchColumnStringField> billAddress2;
    protected List<SearchColumnStringField> billAddress3;
    protected List<SearchColumnStringField> billAddressee;
    protected List<SearchColumnStringField> billAttention;
    protected List<SearchColumnStringField> billCity;
    protected List<SearchColumnEnumSelectField> billCountry;
    protected List<SearchColumnStringField> billCountryCode;
    protected List<SearchColumnDateField> billedDate;
    protected List<SearchColumnDoubleField> billingAmount;
    protected List<SearchColumnSelectField> billingSchedule;
    protected List<SearchColumnSelectField> billingTransaction;
    protected List<SearchColumnStringField> billPhone;
    protected List<SearchColumnStringField> billState;
    protected List<SearchColumnEnumSelectField> billVarianceStatus;
    protected List<SearchColumnStringField> billZip;
    protected List<SearchColumnStringField> binNumber;
    protected List<SearchColumnDoubleField> binNumberQuantity;
    protected List<SearchColumnDoubleField> bomQuantity;
    protected List<SearchColumnBooleanField> buildEntireAssembly;
    protected List<SearchColumnDoubleField> buildVariance;
    protected List<SearchColumnDoubleField> built;
    protected List<SearchColumnStringField> catchUpPeriod;
    protected List<SearchColumnStringField> ccCustomerCode;
    protected List<SearchColumnDateField> ccExpDate;
    protected List<SearchColumnStringField> ccHolderName;
    protected List<SearchColumnStringField> ccNumber;
    protected List<SearchColumnStringField> ccStreet;
    protected List<SearchColumnStringField> ccZipCode;
    @XmlElement(name = "class")
    protected List<SearchColumnSelectField> clazz;
    protected List<SearchColumnBooleanField> cleared;
    protected List<SearchColumnBooleanField> closed;
    protected List<SearchColumnDateField> closeDate;
    protected List<SearchColumnDoubleField> cogsAmount;
    protected List<SearchColumnDateField> commissionEffectiveDate;
    protected List<SearchColumnEnumSelectField> commit;
    protected List<SearchColumnDoubleField> componentYield;
    protected List<SearchColumnStringField> confirmationNumber;
    protected List<SearchColumnDoubleField> contribution;
    protected List<SearchColumnDoubleField> contributionPrimary;
    protected List<SearchColumnDoubleField> costComponentAmount;
    protected List<SearchColumnStringField> costComponentCategory;
    protected List<SearchColumnStringField> costComponentItem;
    protected List<SearchColumnDoubleField> costComponentQuantity;
    protected List<SearchColumnDoubleField> costComponentStandardCost;
    protected List<SearchColumnDoubleField> costEstimate;
    protected List<SearchColumnDoubleField> costEstimateRate;
    protected List<SearchColumnEnumSelectField> costEstimateType;
    protected List<SearchColumnSelectField> createdBy;
    protected List<SearchColumnSelectField> createdFrom;
    protected List<SearchColumnDoubleField> creditAmount;
    protected List<SearchColumnEnumSelectField> cscMatch;
    protected List<SearchColumnSelectField> currency;
    protected List<SearchColumnSelectField> customForm;
    protected List<SearchColumnSelectField> custType;
    protected List<SearchColumnDateField> dateCreated;
    protected List<SearchColumnLongField> daysOpen;
    protected List<SearchColumnLongField> daysOverdue;
    protected List<SearchColumnDoubleField> debitAmount;
    protected List<SearchColumnDoubleField> deferredRevenue;
    protected List<SearchColumnBooleanField> deferRevRec;
    protected List<SearchColumnSelectField> department;
    protected List<SearchColumnDateField> depositDate;
    protected List<SearchColumnSelectField> depositTransaction;
    protected List<SearchColumnDoubleField> discountAmount;
    protected List<SearchColumnStringField> docUnit;
    protected List<SearchColumnStringField> drAccount;
    protected List<SearchColumnDateField> dueDate;
    protected List<SearchColumnDoubleField> effectiveRate;
    protected List<SearchColumnStringField> email;
    protected List<SearchColumnDateField> endDate;
    protected List<SearchColumnSelectField> entity;
    protected List<SearchColumnSelectField> entityStatus;
    protected List<SearchColumnDoubleField> estGrossProfit;
    protected List<SearchColumnDoubleField> estGrossProfitPct;
    protected List<SearchColumnDoubleField> estGrossProfitPercent;
    protected List<SearchColumnDoubleField> exchangeRate;
    protected List<SearchColumnBooleanField> excludeCommission;
    protected List<SearchColumnBooleanField> excludeFromRateRequest;
    protected List<SearchColumnDateField> expectedCloseDate;
    protected List<SearchColumnDateField> expectedReceiptDate;
    protected List<SearchColumnSelectField> expenseCategory;
    protected List<SearchColumnDateField> expenseDate;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnBooleanField> firmed;
    protected List<SearchColumnEnumSelectField> forecastType;
    protected List<SearchColumnSelectField> fulfillingTransaction;
    protected List<SearchColumnStringField> fxAccount;
    protected List<SearchColumnDoubleField> fxAmount;
    protected List<SearchColumnDoubleField> fxCostEstimate;
    protected List<SearchColumnDoubleField> fxCostEstimateRate;
    protected List<SearchColumnDoubleField> fxEstGrossProfit;
    protected List<SearchColumnDoubleField> fxTranCostEstimate;
    protected List<SearchColumnDoubleField> fxVsoeAllocation;
    protected List<SearchColumnDoubleField> fxVsoeAmount;
    protected List<SearchColumnDoubleField> fxVsoePrice;
    protected List<SearchColumnBooleanField> gcoAvailabelToCharge;
    protected List<SearchColumnBooleanField> gcoAvailableToRefund;
    protected List<SearchColumnEnumSelectField> gcoAvsStreetMatch;
    protected List<SearchColumnEnumSelectField> gcoAvsZipMatch;
    protected List<SearchColumnLongField> gcoBuyerAccountAge;
    protected List<SearchColumnStringField> gcoBuyerIp;
    protected List<SearchColumnDoubleField> gcoChargeAmount;
    protected List<SearchColumnDoubleField> gcoChargebackAmount;
    protected List<SearchColumnDoubleField> gcoConfirmedChargedTotal;
    protected List<SearchColumnDoubleField> gcoConfirmedRefundedTotal;
    protected List<SearchColumnStringField> gcoCreditcardNumber;
    protected List<SearchColumnEnumSelectField> gcoCscMatch;
    protected List<SearchColumnStringField> gcoFinancialState;
    protected List<SearchColumnStringField> gcoFulfillmentState;
    protected List<SearchColumnStringField> gcoOrderId;
    protected List<SearchColumnDoubleField> gcoOrderTotal;
    protected List<SearchColumnDoubleField> gcoPromotionAmount;
    protected List<SearchColumnStringField> gcoPromotionName;
    protected List<SearchColumnDoubleField> gcoRefundAmount;
    protected List<SearchColumnDoubleField> gcoShippingTotal;
    protected List<SearchColumnStringField> gcoStateChangedDetail;
    protected List<SearchColumnStringField> giftCert;
    protected List<SearchColumnDoubleField> grossAmount;
    protected List<SearchColumnBooleanField> includeInForecast;
    protected List<SearchColumnEnumSelectField> intercoStatus;
    protected List<SearchColumnStringField> intercoTransaction;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnBooleanField> inVsoeBundle;
    protected List<SearchColumnBooleanField> isAllocation;
    protected List<SearchColumnBooleanField> isBackflush;
    protected List<SearchColumnBooleanField> isGcoChargeback;
    protected List<SearchColumnBooleanField> isGcoChargeConfirmed;
    protected List<SearchColumnBooleanField> isGcoPaymentGuaranteed;
    protected List<SearchColumnBooleanField> isGcoRefundConfirmed;
    protected List<SearchColumnBooleanField> isIntercompanyAdjustment;
    protected List<SearchColumnBooleanField> isMultiShipTo;
    protected List<SearchColumnBooleanField> isReversal;
    protected List<SearchColumnBooleanField> isRevRecTransaction;
    protected List<SearchColumnBooleanField> isScrap;
    protected List<SearchColumnBooleanField> isShipAddress;
    protected List<SearchColumnBooleanField> isTransferPriceCosting;
    protected List<SearchColumnBooleanField> isWip;
    protected List<SearchColumnSelectField> item;
    protected List<SearchColumnSelectField> itemRevision;
    protected List<SearchColumnBooleanField> landedCostPerLine;
    protected List<SearchColumnDateField> lastModifiedDate;
    protected List<SearchColumnSelectField> leadSource;
    protected List<SearchColumnLongField> line;
    protected List<SearchColumnLongField> lineSequenceNumber;
    protected List<SearchColumnSelectField> location;
    protected List<SearchColumnBooleanField> mainLine;
    protected List<SearchColumnStringField> mainName;
    protected List<SearchColumnSelectField> manufacturingRouting;
    protected List<SearchColumnBooleanField> matchBillToReceipt;
    protected List<SearchColumnStringField> memo;
    protected List<SearchColumnStringField> memoMain;
    protected List<SearchColumnBooleanField> memorized;
    protected List<SearchColumnSelectField> merchantAccount;
    protected List<SearchColumnStringField> message;
    protected List<SearchColumnBooleanField> multiSubsidiary;
    protected List<SearchColumnDoubleField> netAmount;
    protected List<SearchColumnDoubleField> netAmountNoTax;
    protected List<SearchColumnSelectField> nextApprover;
    protected List<SearchColumnDateField> nextBillDate;
    protected List<SearchColumnBooleanField> nonReimbursable;
    protected List<SearchColumnSelectField> opportunity;
    protected List<SearchColumnStringField> options;
    protected List<SearchColumnDoubleField> orderPriority;
    protected List<SearchColumnEnumSelectField> originator;
    protected List<SearchColumnTextNumberField> otherRefNum;
    protected List<SearchColumnSelectField> overheadParentItem;
    protected List<SearchColumnLongField> packageCount;
    protected List<SearchColumnDoubleField> paidAmount;
    protected List<SearchColumnSelectField> paidTransaction;
    protected List<SearchColumnSelectField> partner;
    protected List<SearchColumnDoubleField> partnerContribution;
    protected List<SearchColumnSelectField> partnerRole;
    protected List<SearchColumnSelectField> partnerTeamMember;
    protected List<SearchColumnDoubleField> payingAmount;
    protected List<SearchColumnSelectField> payingTransaction;
    protected List<SearchColumnBooleanField> paymentApproved;
    protected List<SearchColumnDateField> paymentEventDate;
    protected List<SearchColumnEnumSelectField> paymentEventHoldReason;
    protected List<SearchColumnBooleanField> paymentEventPurchaseCardUsed;
    protected List<SearchColumnBooleanField> paymentEventPurchaseDataSent;
    protected List<SearchColumnEnumSelectField> paymentEventResult;
    protected List<SearchColumnEnumSelectField> paymentEventType;
    protected List<SearchColumnSelectField> paymentMethod;
    protected List<SearchColumnBooleanField> payPalPending;
    protected List<SearchColumnStringField> payPalStatus;
    protected List<SearchColumnStringField> payPalTranId;
    protected List<SearchColumnStringField> payrollBatch;
    protected List<SearchColumnStringField> pnRefNum;
    protected List<SearchColumnDoubleField> poRate;
    protected List<SearchColumnBooleanField> posting;
    protected List<SearchColumnSelectField> postingPeriod;
    protected List<SearchColumnSelectField> priceLevel;
    protected List<SearchColumnStringField> print;
    protected List<SearchColumnDoubleField> probability;
    protected List<SearchColumnDoubleField> projectedAmount;
    protected List<SearchColumnSelectField> promoCode;
    protected List<SearchColumnSelectField> purchaseOrder;
    protected List<SearchColumnDoubleField> quantity;
    protected List<SearchColumnDoubleField> quantityBilled;
    protected List<SearchColumnDoubleField> quantityCommitted;
    protected List<SearchColumnDoubleField> quantityPacked;
    protected List<SearchColumnDoubleField> quantityPicked;
    protected List<SearchColumnDoubleField> quantityRevCommitted;
    protected List<SearchColumnDoubleField> quantityShipRecv;
    protected List<SearchColumnDoubleField> quantityUom;
    protected List<SearchColumnDoubleField> rate;
    protected List<SearchColumnStringField> realizedGainPostingTransaction;
    protected List<SearchColumnDoubleField> recognizedRevenue;
    protected List<SearchColumnStringField> recordType;
    protected List<SearchColumnLongField> refNumber;
    protected List<SearchColumnEnumSelectField> revCommitStatus;
    protected List<SearchColumnSelectField> revCommittingTransaction;
    protected List<SearchColumnEnumSelectField> revenueStatus;
    protected List<SearchColumnDateField> reversalDate;
    protected List<SearchColumnStringField> reversalNumber;
    protected List<SearchColumnDateField> revRecEndDate;
    protected List<SearchColumnBooleanField> revRecOnRevCommitment;
    protected List<SearchColumnDateField> revRecStartDate;
    protected List<SearchColumnSelectField> rgAccount;
    protected List<SearchColumnDoubleField> rgAmount;
    protected List<SearchColumnDateField> salesEffectiveDate;
    protected List<SearchColumnSelectField> salesOrder;
    protected List<SearchColumnSelectField> salesRep;
    protected List<SearchColumnSelectField> salesTeamMember;
    protected List<SearchColumnSelectField> salesTeamRole;
    protected List<SearchColumnEnumSelectField> schedulingMethod;
    protected List<SearchColumnStringField> serialNumber;
    protected List<SearchColumnDoubleField> serialNumberCost;
    protected List<SearchColumnDoubleField> serialNumberCostAdjustment;
    protected List<SearchColumnDoubleField> serialNumberQuantity;
    protected List<SearchColumnStringField> serialNumbers;
    protected List<SearchColumnStringField> shipAddress;
    protected List<SearchColumnStringField> shipAddress1;
    protected List<SearchColumnStringField> shipAddress2;
    protected List<SearchColumnStringField> shipAddress3;
    protected List<SearchColumnStringField> shipAddressee;
    protected List<SearchColumnStringField> shipAttention;
    protected List<SearchColumnStringField> shipCity;
    protected List<SearchColumnBooleanField> shipComplete;
    protected List<SearchColumnEnumSelectField> shipCountry;
    protected List<SearchColumnStringField> shipCountryCode;
    protected List<SearchColumnDateField> shipDate;
    protected List<SearchColumnLongField> shipGroup;
    protected List<SearchColumnSelectField> shipMethod;
    protected List<SearchColumnStringField> shipPhone;
    protected List<SearchColumnDoubleField> shippingAmount;
    protected List<SearchColumnBooleanField> shipRecvStatusLine;
    protected List<SearchColumnStringField> shipState;
    protected List<SearchColumnSelectField> shipTo;
    protected List<SearchColumnStringField> shipZip;
    protected List<SearchColumnDoubleField> signedAmount;
    protected List<SearchColumnStringField> source;
    protected List<SearchColumnDateField> startDate;
    protected List<SearchColumnEnumSelectField> status;
    protected List<SearchColumnSelectField> subsidiary;
    protected List<SearchColumnDoubleField> taxAmount;
    protected List<SearchColumnSelectField> taxCode;
    protected List<SearchColumnBooleanField> taxLine;
    protected List<SearchColumnSelectField> taxPeriod;
    protected List<SearchColumnDoubleField> taxTotal;
    protected List<SearchColumnLongField> termInMonths;
    protected List<SearchColumnSelectField> terms;
    protected List<SearchColumnStringField> title;
    protected List<SearchColumnBooleanField> toBeEmailed;
    protected List<SearchColumnBooleanField> toBePrinted;
    protected List<SearchColumnSelectField> toSubsidiary;
    protected List<SearchColumnDoubleField> total;
    protected List<SearchColumnDoubleField> totalCostEstimate;
    protected List<SearchColumnStringField> trackingNumbers;
    protected List<SearchColumnDateField> tranDate;
    protected List<SearchColumnDoubleField> tranEstGrossProfit;
    protected List<SearchColumnDoubleField> tranFxEstGrossProfit;
    protected List<SearchColumnStringField> tranId;
    protected List<SearchColumnBooleanField> tranIsVsoeBundle;
    protected List<SearchColumnBooleanField> transactionDiscount;
    protected List<SearchColumnEnumSelectField> transactionLineType;
    protected List<SearchColumnStringField> transactionNumber;
    protected List<SearchColumnSelectField> transferLocation;
    protected List<SearchColumnStringField> transferOrderItemLine;
    protected List<SearchColumnDoubleField> transferOrderQuantityCommitted;
    protected List<SearchColumnDoubleField> transferOrderQuantityPacked;
    protected List<SearchColumnDoubleField> transferOrderQuantityPicked;
    protected List<SearchColumnDoubleField> transferOrderQuantityReceived;
    protected List<SearchColumnDoubleField> transferOrderQuantityShipped;
    protected List<SearchColumnEnumSelectField> type;
    protected List<SearchColumnStringField> unit;
    protected List<SearchColumnDoubleField> unitCostOverride;
    protected List<SearchColumnSelectField> vendType;
    protected List<SearchColumnBooleanField> visibleToCustomer;
    protected List<SearchColumnDoubleField> vsoeAllocation;
    protected List<SearchColumnDoubleField> vsoeAmount;
    protected List<SearchColumnEnumSelectField> vsoeDeferral;
    protected List<SearchColumnBooleanField> vsoeDelivered;
    protected List<SearchColumnEnumSelectField> vsoePermitDiscount;
    protected List<SearchColumnDoubleField> vsoePrice;
    protected List<SearchColumnStringField> webSite;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the abbrev property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbrev property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbrev().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAbbrev() {
        if (abbrev == null) {
            abbrev = new ArrayList<SearchColumnStringField>();
        }
        return this.abbrev;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAccount() {
        if (account == null) {
            account = new ArrayList<SearchColumnSelectField>();
        }
        return this.account;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAccountType() {
        if (accountType == null) {
            accountType = new ArrayList<SearchColumnStringField>();
        }
        return this.accountType;
    }

    /**
     * Gets the value of the actualShipDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualShipDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualShipDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getActualShipDate() {
        if (actualShipDate == null) {
            actualShipDate = new ArrayList<SearchColumnDateField>();
        }
        return this.actualShipDate;
    }

    /**
     * Gets the value of the altSalesAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altSalesAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltSalesAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAltSalesAmount() {
        if (altSalesAmount == null) {
            altSalesAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.altSalesAmount;
    }

    /**
     * Gets the value of the altSalesNetAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altSalesNetAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltSalesNetAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAltSalesNetAmount() {
        if (altSalesNetAmount == null) {
            altSalesNetAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.altSalesNetAmount;
    }

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmount() {
        if (amount == null) {
            amount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amount;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountPaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountPaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmountPaid() {
        if (amountPaid == null) {
            amountPaid = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amountPaid;
    }

    /**
     * Gets the value of the amountRemaining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountRemaining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountRemaining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmountRemaining() {
        if (amountRemaining == null) {
            amountRemaining = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amountRemaining;
    }

    /**
     * Gets the value of the amountUnbilled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountUnbilled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountUnbilled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmountUnbilled() {
        if (amountUnbilled == null) {
            amountUnbilled = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amountUnbilled;
    }

    /**
     * Gets the value of the appliedToForeignAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedToForeignAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedToForeignAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAppliedToForeignAmount() {
        if (appliedToForeignAmount == null) {
            appliedToForeignAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.appliedToForeignAmount;
    }

    /**
     * Gets the value of the appliedToIsFxVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedToIsFxVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedToIsFxVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAppliedToIsFxVariance() {
        if (appliedToIsFxVariance == null) {
            appliedToIsFxVariance = new ArrayList<SearchColumnBooleanField>();
        }
        return this.appliedToIsFxVariance;
    }

    /**
     * Gets the value of the appliedToLinkAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedToLinkAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedToLinkAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAppliedToLinkAmount() {
        if (appliedToLinkAmount == null) {
            appliedToLinkAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.appliedToLinkAmount;
    }

    /**
     * Gets the value of the appliedToLinkType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedToLinkType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedToLinkType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAppliedToLinkType() {
        if (appliedToLinkType == null) {
            appliedToLinkType = new ArrayList<SearchColumnStringField>();
        }
        return this.appliedToLinkType;
    }

    /**
     * Gets the value of the appliedToTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedToTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedToTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAppliedToTransaction() {
        if (appliedToTransaction == null) {
            appliedToTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.appliedToTransaction;
    }

    /**
     * Gets the value of the applyingForeignAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyingForeignAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyingForeignAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getApplyingForeignAmount() {
        if (applyingForeignAmount == null) {
            applyingForeignAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.applyingForeignAmount;
    }

    /**
     * Gets the value of the applyingIsFxVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyingIsFxVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyingIsFxVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getApplyingIsFxVariance() {
        if (applyingIsFxVariance == null) {
            applyingIsFxVariance = new ArrayList<SearchColumnBooleanField>();
        }
        return this.applyingIsFxVariance;
    }

    /**
     * Gets the value of the applyingLinkAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyingLinkAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyingLinkAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getApplyingLinkAmount() {
        if (applyingLinkAmount == null) {
            applyingLinkAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.applyingLinkAmount;
    }

    /**
     * Gets the value of the applyingLinkType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyingLinkType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyingLinkType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getApplyingLinkType() {
        if (applyingLinkType == null) {
            applyingLinkType = new ArrayList<SearchColumnStringField>();
        }
        return this.applyingLinkType;
    }

    /**
     * Gets the value of the applyingTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyingTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyingTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getApplyingTransaction() {
        if (applyingTransaction == null) {
            applyingTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.applyingTransaction;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getApprovalStatus() {
        if (approvalStatus == null) {
            approvalStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.approvalStatus;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAuthCode() {
        if (authCode == null) {
            authCode = new ArrayList<SearchColumnStringField>();
        }
        return this.authCode;
    }

    /**
     * Gets the value of the autoCalculateLag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoCalculateLag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoCalculateLag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAutoCalculateLag() {
        if (autoCalculateLag == null) {
            autoCalculateLag = new ArrayList<SearchColumnBooleanField>();
        }
        return this.autoCalculateLag;
    }

    /**
     * Gets the value of the avsStreetMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avsStreetMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvsStreetMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getAvsStreetMatch() {
        if (avsStreetMatch == null) {
            avsStreetMatch = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.avsStreetMatch;
    }

    /**
     * Gets the value of the avsZipMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avsZipMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvsZipMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getAvsZipMatch() {
        if (avsZipMatch == null) {
            avsZipMatch = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.avsZipMatch;
    }

    /**
     * Gets the value of the billable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getBillable() {
        if (billable == null) {
            billable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.billable;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress() {
        if (billAddress == null) {
            billAddress = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress;
    }

    /**
     * Gets the value of the billAddress1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress1() {
        if (billAddress1 == null) {
            billAddress1 = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress1;
    }

    /**
     * Gets the value of the billAddress2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress2() {
        if (billAddress2 == null) {
            billAddress2 = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress2;
    }

    /**
     * Gets the value of the billAddress3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress3() {
        if (billAddress3 == null) {
            billAddress3 = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress3;
    }

    /**
     * Gets the value of the billAddressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddressee() {
        if (billAddressee == null) {
            billAddressee = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddressee;
    }

    /**
     * Gets the value of the billAttention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAttention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAttention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAttention() {
        if (billAttention == null) {
            billAttention = new ArrayList<SearchColumnStringField>();
        }
        return this.billAttention;
    }

    /**
     * Gets the value of the billCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillCity() {
        if (billCity == null) {
            billCity = new ArrayList<SearchColumnStringField>();
        }
        return this.billCity;
    }

    /**
     * Gets the value of the billCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getBillCountry() {
        if (billCountry == null) {
            billCountry = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.billCountry;
    }

    /**
     * Gets the value of the billCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillCountryCode() {
        if (billCountryCode == null) {
            billCountryCode = new ArrayList<SearchColumnStringField>();
        }
        return this.billCountryCode;
    }

    /**
     * Gets the value of the billedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilledDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getBilledDate() {
        if (billedDate == null) {
            billedDate = new ArrayList<SearchColumnDateField>();
        }
        return this.billedDate;
    }

    /**
     * Gets the value of the billingAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBillingAmount() {
        if (billingAmount == null) {
            billingAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.billingAmount;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillingSchedule() {
        if (billingSchedule == null) {
            billingSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.billingSchedule;
    }

    /**
     * Gets the value of the billingTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillingTransaction() {
        if (billingTransaction == null) {
            billingTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.billingTransaction;
    }

    /**
     * Gets the value of the billPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillPhone() {
        if (billPhone == null) {
            billPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.billPhone;
    }

    /**
     * Gets the value of the billState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillState() {
        if (billState == null) {
            billState = new ArrayList<SearchColumnStringField>();
        }
        return this.billState;
    }

    /**
     * Gets the value of the billVarianceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billVarianceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillVarianceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getBillVarianceStatus() {
        if (billVarianceStatus == null) {
            billVarianceStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.billVarianceStatus;
    }

    /**
     * Gets the value of the billZip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billZip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillZip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillZip() {
        if (billZip == null) {
            billZip = new ArrayList<SearchColumnStringField>();
        }
        return this.billZip;
    }

    /**
     * Gets the value of the binNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBinNumber() {
        if (binNumber == null) {
            binNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.binNumber;
    }

    /**
     * Gets the value of the binNumberQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binNumberQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinNumberQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBinNumberQuantity() {
        if (binNumberQuantity == null) {
            binNumberQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.binNumberQuantity;
    }

    /**
     * Gets the value of the bomQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBomQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBomQuantity() {
        if (bomQuantity == null) {
            bomQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.bomQuantity;
    }

    /**
     * Gets the value of the buildEntireAssembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildEntireAssembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildEntireAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getBuildEntireAssembly() {
        if (buildEntireAssembly == null) {
            buildEntireAssembly = new ArrayList<SearchColumnBooleanField>();
        }
        return this.buildEntireAssembly;
    }

    /**
     * Gets the value of the buildVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBuildVariance() {
        if (buildVariance == null) {
            buildVariance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.buildVariance;
    }

    /**
     * Gets the value of the built property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the built property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuilt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBuilt() {
        if (built == null) {
            built = new ArrayList<SearchColumnDoubleField>();
        }
        return this.built;
    }

    /**
     * Gets the value of the catchUpPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catchUpPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatchUpPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCatchUpPeriod() {
        if (catchUpPeriod == null) {
            catchUpPeriod = new ArrayList<SearchColumnStringField>();
        }
        return this.catchUpPeriod;
    }

    /**
     * Gets the value of the ccCustomerCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccCustomerCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcCustomerCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcCustomerCode() {
        if (ccCustomerCode == null) {
            ccCustomerCode = new ArrayList<SearchColumnStringField>();
        }
        return this.ccCustomerCode;
    }

    /**
     * Gets the value of the ccExpDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccExpDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcExpDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCcExpDate() {
        if (ccExpDate == null) {
            ccExpDate = new ArrayList<SearchColumnDateField>();
        }
        return this.ccExpDate;
    }

    /**
     * Gets the value of the ccHolderName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccHolderName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcHolderName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcHolderName() {
        if (ccHolderName == null) {
            ccHolderName = new ArrayList<SearchColumnStringField>();
        }
        return this.ccHolderName;
    }

    /**
     * Gets the value of the ccNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcNumber() {
        if (ccNumber == null) {
            ccNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.ccNumber;
    }

    /**
     * Gets the value of the ccStreet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccStreet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcStreet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcStreet() {
        if (ccStreet == null) {
            ccStreet = new ArrayList<SearchColumnStringField>();
        }
        return this.ccStreet;
    }

    /**
     * Gets the value of the ccZipCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccZipCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcZipCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcZipCode() {
        if (ccZipCode == null) {
            ccZipCode = new ArrayList<SearchColumnStringField>();
        }
        return this.ccZipCode;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<SearchColumnSelectField>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the cleared property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cleared property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCleared().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getCleared() {
        if (cleared == null) {
            cleared = new ArrayList<SearchColumnBooleanField>();
        }
        return this.cleared;
    }

    /**
     * Gets the value of the closed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClosed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getClosed() {
        if (closed == null) {
            closed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.closed;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closeDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCloseDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCloseDate() {
        if (closeDate == null) {
            closeDate = new ArrayList<SearchColumnDateField>();
        }
        return this.closeDate;
    }

    /**
     * Gets the value of the cogsAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cogsAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCogsAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCogsAmount() {
        if (cogsAmount == null) {
            cogsAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.cogsAmount;
    }

    /**
     * Gets the value of the commissionEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCommissionEffectiveDate() {
        if (commissionEffectiveDate == null) {
            commissionEffectiveDate = new ArrayList<SearchColumnDateField>();
        }
        return this.commissionEffectiveDate;
    }

    /**
     * Gets the value of the commit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCommit() {
        if (commit == null) {
            commit = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.commit;
    }

    /**
     * Gets the value of the componentYield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentYield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentYield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getComponentYield() {
        if (componentYield == null) {
            componentYield = new ArrayList<SearchColumnDoubleField>();
        }
        return this.componentYield;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmationNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getConfirmationNumber() {
        if (confirmationNumber == null) {
            confirmationNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.confirmationNumber;
    }

    /**
     * Gets the value of the contribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getContribution() {
        if (contribution == null) {
            contribution = new ArrayList<SearchColumnDoubleField>();
        }
        return this.contribution;
    }

    /**
     * Gets the value of the contributionPrimary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributionPrimary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributionPrimary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getContributionPrimary() {
        if (contributionPrimary == null) {
            contributionPrimary = new ArrayList<SearchColumnDoubleField>();
        }
        return this.contributionPrimary;
    }

    /**
     * Gets the value of the costComponentAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costComponentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostComponentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostComponentAmount() {
        if (costComponentAmount == null) {
            costComponentAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costComponentAmount;
    }

    /**
     * Gets the value of the costComponentCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costComponentCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostComponentCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCostComponentCategory() {
        if (costComponentCategory == null) {
            costComponentCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.costComponentCategory;
    }

    /**
     * Gets the value of the costComponentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costComponentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostComponentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCostComponentItem() {
        if (costComponentItem == null) {
            costComponentItem = new ArrayList<SearchColumnStringField>();
        }
        return this.costComponentItem;
    }

    /**
     * Gets the value of the costComponentQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costComponentQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostComponentQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostComponentQuantity() {
        if (costComponentQuantity == null) {
            costComponentQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costComponentQuantity;
    }

    /**
     * Gets the value of the costComponentStandardCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costComponentStandardCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostComponentStandardCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostComponentStandardCost() {
        if (costComponentStandardCost == null) {
            costComponentStandardCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costComponentStandardCost;
    }

    /**
     * Gets the value of the costEstimate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costEstimate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostEstimate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostEstimate() {
        if (costEstimate == null) {
            costEstimate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costEstimate;
    }

    /**
     * Gets the value of the costEstimateRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costEstimateRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostEstimateRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostEstimateRate() {
        if (costEstimateRate == null) {
            costEstimateRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costEstimateRate;
    }

    /**
     * Gets the value of the costEstimateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costEstimateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostEstimateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCostEstimateType() {
        if (costEstimateType == null) {
            costEstimateType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.costEstimateType;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createdBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCreatedBy() {
        if (createdBy == null) {
            createdBy = new ArrayList<SearchColumnSelectField>();
        }
        return this.createdBy;
    }

    /**
     * Gets the value of the createdFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createdFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCreatedFrom() {
        if (createdFrom == null) {
            createdFrom = new ArrayList<SearchColumnSelectField>();
        }
        return this.createdFrom;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCreditAmount() {
        if (creditAmount == null) {
            creditAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.creditAmount;
    }

    /**
     * Gets the value of the cscMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cscMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCscMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCscMatch() {
        if (cscMatch == null) {
            cscMatch = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.cscMatch;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<SearchColumnSelectField>();
        }
        return this.currency;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCustomForm() {
        if (customForm == null) {
            customForm = new ArrayList<SearchColumnSelectField>();
        }
        return this.customForm;
    }

    /**
     * Gets the value of the custType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCustType() {
        if (custType == null) {
            custType = new ArrayList<SearchColumnSelectField>();
        }
        return this.custType;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateCreated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDateCreated() {
        if (dateCreated == null) {
            dateCreated = new ArrayList<SearchColumnDateField>();
        }
        return this.dateCreated;
    }

    /**
     * Gets the value of the daysOpen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOpen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOpen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDaysOpen() {
        if (daysOpen == null) {
            daysOpen = new ArrayList<SearchColumnLongField>();
        }
        return this.daysOpen;
    }

    /**
     * Gets the value of the daysOverdue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOverdue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOverdue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDaysOverdue() {
        if (daysOverdue == null) {
            daysOverdue = new ArrayList<SearchColumnLongField>();
        }
        return this.daysOverdue;
    }

    /**
     * Gets the value of the debitAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debitAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebitAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDebitAmount() {
        if (debitAmount == null) {
            debitAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.debitAmount;
    }

    /**
     * Gets the value of the deferredRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDeferredRevenue() {
        if (deferredRevenue == null) {
            deferredRevenue = new ArrayList<SearchColumnDoubleField>();
        }
        return this.deferredRevenue;
    }

    /**
     * Gets the value of the deferRevRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferRevRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferRevRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDeferRevRec() {
        if (deferRevRec == null) {
            deferRevRec = new ArrayList<SearchColumnBooleanField>();
        }
        return this.deferRevRec;
    }

    /**
     * Gets the value of the department property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the department property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDepartment() {
        if (department == null) {
            department = new ArrayList<SearchColumnSelectField>();
        }
        return this.department;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDepositDate() {
        if (depositDate == null) {
            depositDate = new ArrayList<SearchColumnDateField>();
        }
        return this.depositDate;
    }

    /**
     * Gets the value of the depositTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDepositTransaction() {
        if (depositTransaction == null) {
            depositTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.depositTransaction;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDiscountAmount() {
        if (discountAmount == null) {
            discountAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.discountAmount;
    }

    /**
     * Gets the value of the docUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDocUnit() {
        if (docUnit == null) {
            docUnit = new ArrayList<SearchColumnStringField>();
        }
        return this.docUnit;
    }

    /**
     * Gets the value of the drAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDrAccount() {
        if (drAccount == null) {
            drAccount = new ArrayList<SearchColumnStringField>();
        }
        return this.drAccount;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dueDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDueDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDueDate() {
        if (dueDate == null) {
            dueDate = new ArrayList<SearchColumnDateField>();
        }
        return this.dueDate;
    }

    /**
     * Gets the value of the effectiveRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEffectiveRate() {
        if (effectiveRate == null) {
            effectiveRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.effectiveRate;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEmail() {
        if (email == null) {
            email = new ArrayList<SearchColumnStringField>();
        }
        return this.email;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getEndDate() {
        if (endDate == null) {
            endDate = new ArrayList<SearchColumnDateField>();
        }
        return this.endDate;
    }

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEntity() {
        if (entity == null) {
            entity = new ArrayList<SearchColumnSelectField>();
        }
        return this.entity;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEntityStatus() {
        if (entityStatus == null) {
            entityStatus = new ArrayList<SearchColumnSelectField>();
        }
        return this.entityStatus;
    }

    /**
     * Gets the value of the estGrossProfit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estGrossProfit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstGrossProfit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstGrossProfit() {
        if (estGrossProfit == null) {
            estGrossProfit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estGrossProfit;
    }

    /**
     * Gets the value of the estGrossProfitPct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estGrossProfitPct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstGrossProfitPct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstGrossProfitPct() {
        if (estGrossProfitPct == null) {
            estGrossProfitPct = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estGrossProfitPct;
    }

    /**
     * Gets the value of the estGrossProfitPercent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estGrossProfitPercent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstGrossProfitPercent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstGrossProfitPercent() {
        if (estGrossProfitPercent == null) {
            estGrossProfitPercent = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estGrossProfitPercent;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getExchangeRate() {
        if (exchangeRate == null) {
            exchangeRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.exchangeRate;
    }

    /**
     * Gets the value of the excludeCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getExcludeCommission() {
        if (excludeCommission == null) {
            excludeCommission = new ArrayList<SearchColumnBooleanField>();
        }
        return this.excludeCommission;
    }

    /**
     * Gets the value of the excludeFromRateRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeFromRateRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeFromRateRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getExcludeFromRateRequest() {
        if (excludeFromRateRequest == null) {
            excludeFromRateRequest = new ArrayList<SearchColumnBooleanField>();
        }
        return this.excludeFromRateRequest;
    }

    /**
     * Gets the value of the expectedCloseDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedCloseDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedCloseDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getExpectedCloseDate() {
        if (expectedCloseDate == null) {
            expectedCloseDate = new ArrayList<SearchColumnDateField>();
        }
        return this.expectedCloseDate;
    }

    /**
     * Gets the value of the expectedReceiptDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedReceiptDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedReceiptDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getExpectedReceiptDate() {
        if (expectedReceiptDate == null) {
            expectedReceiptDate = new ArrayList<SearchColumnDateField>();
        }
        return this.expectedReceiptDate;
    }

    /**
     * Gets the value of the expenseCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExpenseCategory() {
        if (expenseCategory == null) {
            expenseCategory = new ArrayList<SearchColumnSelectField>();
        }
        return this.expenseCategory;
    }

    /**
     * Gets the value of the expenseDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getExpenseDate() {
        if (expenseDate == null) {
            expenseDate = new ArrayList<SearchColumnDateField>();
        }
        return this.expenseDate;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the firmed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firmed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirmed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getFirmed() {
        if (firmed == null) {
            firmed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.firmed;
    }

    /**
     * Gets the value of the forecastType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getForecastType() {
        if (forecastType == null) {
            forecastType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.forecastType;
    }

    /**
     * Gets the value of the fulfillingTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fulfillingTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFulfillingTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getFulfillingTransaction() {
        if (fulfillingTransaction == null) {
            fulfillingTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.fulfillingTransaction;
    }

    /**
     * Gets the value of the fxAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFxAccount() {
        if (fxAccount == null) {
            fxAccount = new ArrayList<SearchColumnStringField>();
        }
        return this.fxAccount;
    }

    /**
     * Gets the value of the fxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxAmount() {
        if (fxAmount == null) {
            fxAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxAmount;
    }

    /**
     * Gets the value of the fxCostEstimate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxCostEstimate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxCostEstimate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxCostEstimate() {
        if (fxCostEstimate == null) {
            fxCostEstimate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxCostEstimate;
    }

    /**
     * Gets the value of the fxCostEstimateRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxCostEstimateRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxCostEstimateRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxCostEstimateRate() {
        if (fxCostEstimateRate == null) {
            fxCostEstimateRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxCostEstimateRate;
    }

    /**
     * Gets the value of the fxEstGrossProfit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxEstGrossProfit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxEstGrossProfit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxEstGrossProfit() {
        if (fxEstGrossProfit == null) {
            fxEstGrossProfit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxEstGrossProfit;
    }

    /**
     * Gets the value of the fxTranCostEstimate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxTranCostEstimate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxTranCostEstimate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxTranCostEstimate() {
        if (fxTranCostEstimate == null) {
            fxTranCostEstimate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxTranCostEstimate;
    }

    /**
     * Gets the value of the fxVsoeAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxVsoeAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxVsoeAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxVsoeAllocation() {
        if (fxVsoeAllocation == null) {
            fxVsoeAllocation = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxVsoeAllocation;
    }

    /**
     * Gets the value of the fxVsoeAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxVsoeAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxVsoeAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxVsoeAmount() {
        if (fxVsoeAmount == null) {
            fxVsoeAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxVsoeAmount;
    }

    /**
     * Gets the value of the fxVsoePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxVsoePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxVsoePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxVsoePrice() {
        if (fxVsoePrice == null) {
            fxVsoePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxVsoePrice;
    }

    /**
     * Gets the value of the gcoAvailabelToCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoAvailabelToCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoAvailabelToCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getGcoAvailabelToCharge() {
        if (gcoAvailabelToCharge == null) {
            gcoAvailabelToCharge = new ArrayList<SearchColumnBooleanField>();
        }
        return this.gcoAvailabelToCharge;
    }

    /**
     * Gets the value of the gcoAvailableToRefund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoAvailableToRefund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoAvailableToRefund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getGcoAvailableToRefund() {
        if (gcoAvailableToRefund == null) {
            gcoAvailableToRefund = new ArrayList<SearchColumnBooleanField>();
        }
        return this.gcoAvailableToRefund;
    }

    /**
     * Gets the value of the gcoAvsStreetMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoAvsStreetMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoAvsStreetMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getGcoAvsStreetMatch() {
        if (gcoAvsStreetMatch == null) {
            gcoAvsStreetMatch = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.gcoAvsStreetMatch;
    }

    /**
     * Gets the value of the gcoAvsZipMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoAvsZipMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoAvsZipMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getGcoAvsZipMatch() {
        if (gcoAvsZipMatch == null) {
            gcoAvsZipMatch = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.gcoAvsZipMatch;
    }

    /**
     * Gets the value of the gcoBuyerAccountAge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoBuyerAccountAge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoBuyerAccountAge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getGcoBuyerAccountAge() {
        if (gcoBuyerAccountAge == null) {
            gcoBuyerAccountAge = new ArrayList<SearchColumnLongField>();
        }
        return this.gcoBuyerAccountAge;
    }

    /**
     * Gets the value of the gcoBuyerIp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoBuyerIp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoBuyerIp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGcoBuyerIp() {
        if (gcoBuyerIp == null) {
            gcoBuyerIp = new ArrayList<SearchColumnStringField>();
        }
        return this.gcoBuyerIp;
    }

    /**
     * Gets the value of the gcoChargeAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoChargeAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoChargeAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoChargeAmount() {
        if (gcoChargeAmount == null) {
            gcoChargeAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoChargeAmount;
    }

    /**
     * Gets the value of the gcoChargebackAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoChargebackAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoChargebackAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoChargebackAmount() {
        if (gcoChargebackAmount == null) {
            gcoChargebackAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoChargebackAmount;
    }

    /**
     * Gets the value of the gcoConfirmedChargedTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoConfirmedChargedTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoConfirmedChargedTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoConfirmedChargedTotal() {
        if (gcoConfirmedChargedTotal == null) {
            gcoConfirmedChargedTotal = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoConfirmedChargedTotal;
    }

    /**
     * Gets the value of the gcoConfirmedRefundedTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoConfirmedRefundedTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoConfirmedRefundedTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoConfirmedRefundedTotal() {
        if (gcoConfirmedRefundedTotal == null) {
            gcoConfirmedRefundedTotal = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoConfirmedRefundedTotal;
    }

    /**
     * Gets the value of the gcoCreditcardNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoCreditcardNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoCreditcardNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGcoCreditcardNumber() {
        if (gcoCreditcardNumber == null) {
            gcoCreditcardNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.gcoCreditcardNumber;
    }

    /**
     * Gets the value of the gcoCscMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoCscMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoCscMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getGcoCscMatch() {
        if (gcoCscMatch == null) {
            gcoCscMatch = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.gcoCscMatch;
    }

    /**
     * Gets the value of the gcoFinancialState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoFinancialState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoFinancialState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGcoFinancialState() {
        if (gcoFinancialState == null) {
            gcoFinancialState = new ArrayList<SearchColumnStringField>();
        }
        return this.gcoFinancialState;
    }

    /**
     * Gets the value of the gcoFulfillmentState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoFulfillmentState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoFulfillmentState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGcoFulfillmentState() {
        if (gcoFulfillmentState == null) {
            gcoFulfillmentState = new ArrayList<SearchColumnStringField>();
        }
        return this.gcoFulfillmentState;
    }

    /**
     * Gets the value of the gcoOrderId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoOrderId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoOrderId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGcoOrderId() {
        if (gcoOrderId == null) {
            gcoOrderId = new ArrayList<SearchColumnStringField>();
        }
        return this.gcoOrderId;
    }

    /**
     * Gets the value of the gcoOrderTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoOrderTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoOrderTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoOrderTotal() {
        if (gcoOrderTotal == null) {
            gcoOrderTotal = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoOrderTotal;
    }

    /**
     * Gets the value of the gcoPromotionAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoPromotionAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoPromotionAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoPromotionAmount() {
        if (gcoPromotionAmount == null) {
            gcoPromotionAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoPromotionAmount;
    }

    /**
     * Gets the value of the gcoPromotionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoPromotionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoPromotionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGcoPromotionName() {
        if (gcoPromotionName == null) {
            gcoPromotionName = new ArrayList<SearchColumnStringField>();
        }
        return this.gcoPromotionName;
    }

    /**
     * Gets the value of the gcoRefundAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoRefundAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoRefundAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoRefundAmount() {
        if (gcoRefundAmount == null) {
            gcoRefundAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoRefundAmount;
    }

    /**
     * Gets the value of the gcoShippingTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoShippingTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoShippingTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGcoShippingTotal() {
        if (gcoShippingTotal == null) {
            gcoShippingTotal = new ArrayList<SearchColumnDoubleField>();
        }
        return this.gcoShippingTotal;
    }

    /**
     * Gets the value of the gcoStateChangedDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcoStateChangedDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcoStateChangedDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGcoStateChangedDetail() {
        if (gcoStateChangedDetail == null) {
            gcoStateChangedDetail = new ArrayList<SearchColumnStringField>();
        }
        return this.gcoStateChangedDetail;
    }

    /**
     * Gets the value of the giftCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCert() {
        if (giftCert == null) {
            giftCert = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCert;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getGrossAmount() {
        if (grossAmount == null) {
            grossAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.grossAmount;
    }

    /**
     * Gets the value of the includeInForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeInForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeInForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIncludeInForecast() {
        if (includeInForecast == null) {
            includeInForecast = new ArrayList<SearchColumnBooleanField>();
        }
        return this.includeInForecast;
    }

    /**
     * Gets the value of the intercoStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intercoStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntercoStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getIntercoStatus() {
        if (intercoStatus == null) {
            intercoStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.intercoStatus;
    }

    /**
     * Gets the value of the intercoTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intercoTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntercoTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getIntercoTransaction() {
        if (intercoTransaction == null) {
            intercoTransaction = new ArrayList<SearchColumnStringField>();
        }
        return this.intercoTransaction;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the inVsoeBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inVsoeBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInVsoeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getInVsoeBundle() {
        if (inVsoeBundle == null) {
            inVsoeBundle = new ArrayList<SearchColumnBooleanField>();
        }
        return this.inVsoeBundle;
    }

    /**
     * Gets the value of the isAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsAllocation() {
        if (isAllocation == null) {
            isAllocation = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isAllocation;
    }

    /**
     * Gets the value of the isBackflush property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isBackflush property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsBackflush().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsBackflush() {
        if (isBackflush == null) {
            isBackflush = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isBackflush;
    }

    /**
     * Gets the value of the isGcoChargeback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isGcoChargeback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsGcoChargeback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsGcoChargeback() {
        if (isGcoChargeback == null) {
            isGcoChargeback = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isGcoChargeback;
    }

    /**
     * Gets the value of the isGcoChargeConfirmed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isGcoChargeConfirmed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsGcoChargeConfirmed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsGcoChargeConfirmed() {
        if (isGcoChargeConfirmed == null) {
            isGcoChargeConfirmed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isGcoChargeConfirmed;
    }

    /**
     * Gets the value of the isGcoPaymentGuaranteed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isGcoPaymentGuaranteed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsGcoPaymentGuaranteed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsGcoPaymentGuaranteed() {
        if (isGcoPaymentGuaranteed == null) {
            isGcoPaymentGuaranteed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isGcoPaymentGuaranteed;
    }

    /**
     * Gets the value of the isGcoRefundConfirmed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isGcoRefundConfirmed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsGcoRefundConfirmed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsGcoRefundConfirmed() {
        if (isGcoRefundConfirmed == null) {
            isGcoRefundConfirmed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isGcoRefundConfirmed;
    }

    /**
     * Gets the value of the isIntercompanyAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isIntercompanyAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsIntercompanyAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsIntercompanyAdjustment() {
        if (isIntercompanyAdjustment == null) {
            isIntercompanyAdjustment = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isIntercompanyAdjustment;
    }

    /**
     * Gets the value of the isMultiShipTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isMultiShipTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsMultiShipTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsMultiShipTo() {
        if (isMultiShipTo == null) {
            isMultiShipTo = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isMultiShipTo;
    }

    /**
     * Gets the value of the isReversal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isReversal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsReversal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsReversal() {
        if (isReversal == null) {
            isReversal = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isReversal;
    }

    /**
     * Gets the value of the isRevRecTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isRevRecTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsRevRecTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsRevRecTransaction() {
        if (isRevRecTransaction == null) {
            isRevRecTransaction = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isRevRecTransaction;
    }

    /**
     * Gets the value of the isScrap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isScrap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsScrap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsScrap() {
        if (isScrap == null) {
            isScrap = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isScrap;
    }

    /**
     * Gets the value of the isShipAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isShipAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsShipAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsShipAddress() {
        if (isShipAddress == null) {
            isShipAddress = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isShipAddress;
    }

    /**
     * Gets the value of the isTransferPriceCosting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isTransferPriceCosting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsTransferPriceCosting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsTransferPriceCosting() {
        if (isTransferPriceCosting == null) {
            isTransferPriceCosting = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isTransferPriceCosting;
    }

    /**
     * Gets the value of the isWip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isWip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsWip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsWip() {
        if (isWip == null) {
            isWip = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isWip;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getItem() {
        if (item == null) {
            item = new ArrayList<SearchColumnSelectField>();
        }
        return this.item;
    }

    /**
     * Gets the value of the itemRevision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemRevision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getItemRevision() {
        if (itemRevision == null) {
            itemRevision = new ArrayList<SearchColumnSelectField>();
        }
        return this.itemRevision;
    }

    /**
     * Gets the value of the landedCostPerLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landedCostPerLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandedCostPerLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getLandedCostPerLine() {
        if (landedCostPerLine == null) {
            landedCostPerLine = new ArrayList<SearchColumnBooleanField>();
        }
        return this.landedCostPerLine;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastModifiedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastModifiedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastModifiedDate() {
        if (lastModifiedDate == null) {
            lastModifiedDate = new ArrayList<SearchColumnDateField>();
        }
        return this.lastModifiedDate;
    }

    /**
     * Gets the value of the leadSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLeadSource() {
        if (leadSource == null) {
            leadSource = new ArrayList<SearchColumnSelectField>();
        }
        return this.leadSource;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLine() {
        if (line == null) {
            line = new ArrayList<SearchColumnLongField>();
        }
        return this.line;
    }

    /**
     * Gets the value of the lineSequenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineSequenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineSequenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLineSequenceNumber() {
        if (lineSequenceNumber == null) {
            lineSequenceNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.lineSequenceNumber;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLocation() {
        if (location == null) {
            location = new ArrayList<SearchColumnSelectField>();
        }
        return this.location;
    }

    /**
     * Gets the value of the mainLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getMainLine() {
        if (mainLine == null) {
            mainLine = new ArrayList<SearchColumnBooleanField>();
        }
        return this.mainLine;
    }

    /**
     * Gets the value of the mainName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMainName() {
        if (mainName == null) {
            mainName = new ArrayList<SearchColumnStringField>();
        }
        return this.mainName;
    }

    /**
     * Gets the value of the manufacturingRouting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturingRouting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturingRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getManufacturingRouting() {
        if (manufacturingRouting == null) {
            manufacturingRouting = new ArrayList<SearchColumnSelectField>();
        }
        return this.manufacturingRouting;
    }

    /**
     * Gets the value of the matchBillToReceipt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchBillToReceipt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchBillToReceipt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getMatchBillToReceipt() {
        if (matchBillToReceipt == null) {
            matchBillToReceipt = new ArrayList<SearchColumnBooleanField>();
        }
        return this.matchBillToReceipt;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMemo() {
        if (memo == null) {
            memo = new ArrayList<SearchColumnStringField>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the memoMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMemoMain() {
        if (memoMain == null) {
            memoMain = new ArrayList<SearchColumnStringField>();
        }
        return this.memoMain;
    }

    /**
     * Gets the value of the memorized property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memorized property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemorized().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getMemorized() {
        if (memorized == null) {
            memorized = new ArrayList<SearchColumnBooleanField>();
        }
        return this.memorized;
    }

    /**
     * Gets the value of the merchantAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the merchantAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerchantAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getMerchantAccount() {
        if (merchantAccount == null) {
            merchantAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.merchantAccount;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMessage() {
        if (message == null) {
            message = new ArrayList<SearchColumnStringField>();
        }
        return this.message;
    }

    /**
     * Gets the value of the multiSubsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSubsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getMultiSubsidiary() {
        if (multiSubsidiary == null) {
            multiSubsidiary = new ArrayList<SearchColumnBooleanField>();
        }
        return this.multiSubsidiary;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getNetAmount() {
        if (netAmount == null) {
            netAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.netAmount;
    }

    /**
     * Gets the value of the netAmountNoTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netAmountNoTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetAmountNoTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getNetAmountNoTax() {
        if (netAmountNoTax == null) {
            netAmountNoTax = new ArrayList<SearchColumnDoubleField>();
        }
        return this.netAmountNoTax;
    }

    /**
     * Gets the value of the nextApprover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextApprover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextApprover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getNextApprover() {
        if (nextApprover == null) {
            nextApprover = new ArrayList<SearchColumnSelectField>();
        }
        return this.nextApprover;
    }

    /**
     * Gets the value of the nextBillDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextBillDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextBillDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getNextBillDate() {
        if (nextBillDate == null) {
            nextBillDate = new ArrayList<SearchColumnDateField>();
        }
        return this.nextBillDate;
    }

    /**
     * Gets the value of the nonReimbursable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonReimbursable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonReimbursable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getNonReimbursable() {
        if (nonReimbursable == null) {
            nonReimbursable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.nonReimbursable;
    }

    /**
     * Gets the value of the opportunity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getOpportunity() {
        if (opportunity == null) {
            opportunity = new ArrayList<SearchColumnSelectField>();
        }
        return this.opportunity;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getOptions() {
        if (options == null) {
            options = new ArrayList<SearchColumnStringField>();
        }
        return this.options;
    }

    /**
     * Gets the value of the orderPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOrderPriority() {
        if (orderPriority == null) {
            orderPriority = new ArrayList<SearchColumnDoubleField>();
        }
        return this.orderPriority;
    }

    /**
     * Gets the value of the originator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getOriginator() {
        if (originator == null) {
            originator = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.originator;
    }

    /**
     * Gets the value of the otherRefNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRefNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRefNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnTextNumberField }
     * 
     * 
     */
    public List<SearchColumnTextNumberField> getOtherRefNum() {
        if (otherRefNum == null) {
            otherRefNum = new ArrayList<SearchColumnTextNumberField>();
        }
        return this.otherRefNum;
    }

    /**
     * Gets the value of the overheadParentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overheadParentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverheadParentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getOverheadParentItem() {
        if (overheadParentItem == null) {
            overheadParentItem = new ArrayList<SearchColumnSelectField>();
        }
        return this.overheadParentItem;
    }

    /**
     * Gets the value of the packageCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getPackageCount() {
        if (packageCount == null) {
            packageCount = new ArrayList<SearchColumnLongField>();
        }
        return this.packageCount;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paidAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaidAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPaidAmount() {
        if (paidAmount == null) {
            paidAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.paidAmount;
    }

    /**
     * Gets the value of the paidTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paidTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaidTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPaidTransaction() {
        if (paidTransaction == null) {
            paidTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.paidTransaction;
    }

    /**
     * Gets the value of the partner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPartner() {
        if (partner == null) {
            partner = new ArrayList<SearchColumnSelectField>();
        }
        return this.partner;
    }

    /**
     * Gets the value of the partnerContribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerContribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerContribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPartnerContribution() {
        if (partnerContribution == null) {
            partnerContribution = new ArrayList<SearchColumnDoubleField>();
        }
        return this.partnerContribution;
    }

    /**
     * Gets the value of the partnerRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPartnerRole() {
        if (partnerRole == null) {
            partnerRole = new ArrayList<SearchColumnSelectField>();
        }
        return this.partnerRole;
    }

    /**
     * Gets the value of the partnerTeamMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerTeamMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerTeamMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPartnerTeamMember() {
        if (partnerTeamMember == null) {
            partnerTeamMember = new ArrayList<SearchColumnSelectField>();
        }
        return this.partnerTeamMember;
    }

    /**
     * Gets the value of the payingAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payingAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayingAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPayingAmount() {
        if (payingAmount == null) {
            payingAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.payingAmount;
    }

    /**
     * Gets the value of the payingTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payingTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayingTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPayingTransaction() {
        if (payingTransaction == null) {
            payingTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.payingTransaction;
    }

    /**
     * Gets the value of the paymentApproved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentApproved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentApproved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPaymentApproved() {
        if (paymentApproved == null) {
            paymentApproved = new ArrayList<SearchColumnBooleanField>();
        }
        return this.paymentApproved;
    }

    /**
     * Gets the value of the paymentEventDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentEventDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentEventDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getPaymentEventDate() {
        if (paymentEventDate == null) {
            paymentEventDate = new ArrayList<SearchColumnDateField>();
        }
        return this.paymentEventDate;
    }

    /**
     * Gets the value of the paymentEventHoldReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentEventHoldReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentEventHoldReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPaymentEventHoldReason() {
        if (paymentEventHoldReason == null) {
            paymentEventHoldReason = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.paymentEventHoldReason;
    }

    /**
     * Gets the value of the paymentEventPurchaseCardUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentEventPurchaseCardUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentEventPurchaseCardUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPaymentEventPurchaseCardUsed() {
        if (paymentEventPurchaseCardUsed == null) {
            paymentEventPurchaseCardUsed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.paymentEventPurchaseCardUsed;
    }

    /**
     * Gets the value of the paymentEventPurchaseDataSent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentEventPurchaseDataSent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentEventPurchaseDataSent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPaymentEventPurchaseDataSent() {
        if (paymentEventPurchaseDataSent == null) {
            paymentEventPurchaseDataSent = new ArrayList<SearchColumnBooleanField>();
        }
        return this.paymentEventPurchaseDataSent;
    }

    /**
     * Gets the value of the paymentEventResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentEventResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentEventResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPaymentEventResult() {
        if (paymentEventResult == null) {
            paymentEventResult = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.paymentEventResult;
    }

    /**
     * Gets the value of the paymentEventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentEventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPaymentEventType() {
        if (paymentEventType == null) {
            paymentEventType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.paymentEventType;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<SearchColumnSelectField>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the payPalPending property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payPalPending property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayPalPending().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPayPalPending() {
        if (payPalPending == null) {
            payPalPending = new ArrayList<SearchColumnBooleanField>();
        }
        return this.payPalPending;
    }

    /**
     * Gets the value of the payPalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payPalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayPalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPayPalStatus() {
        if (payPalStatus == null) {
            payPalStatus = new ArrayList<SearchColumnStringField>();
        }
        return this.payPalStatus;
    }

    /**
     * Gets the value of the payPalTranId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payPalTranId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayPalTranId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPayPalTranId() {
        if (payPalTranId == null) {
            payPalTranId = new ArrayList<SearchColumnStringField>();
        }
        return this.payPalTranId;
    }

    /**
     * Gets the value of the payrollBatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payrollBatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayrollBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPayrollBatch() {
        if (payrollBatch == null) {
            payrollBatch = new ArrayList<SearchColumnStringField>();
        }
        return this.payrollBatch;
    }

    /**
     * Gets the value of the pnRefNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnRefNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnRefNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPnRefNum() {
        if (pnRefNum == null) {
            pnRefNum = new ArrayList<SearchColumnStringField>();
        }
        return this.pnRefNum;
    }

    /**
     * Gets the value of the poRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPoRate() {
        if (poRate == null) {
            poRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.poRate;
    }

    /**
     * Gets the value of the posting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPosting() {
        if (posting == null) {
            posting = new ArrayList<SearchColumnBooleanField>();
        }
        return this.posting;
    }

    /**
     * Gets the value of the postingPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postingPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostingPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPostingPeriod() {
        if (postingPeriod == null) {
            postingPeriod = new ArrayList<SearchColumnSelectField>();
        }
        return this.postingPeriod;
    }

    /**
     * Gets the value of the priceLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPriceLevel() {
        if (priceLevel == null) {
            priceLevel = new ArrayList<SearchColumnSelectField>();
        }
        return this.priceLevel;
    }

    /**
     * Gets the value of the print property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the print property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPrint() {
        if (print == null) {
            print = new ArrayList<SearchColumnStringField>();
        }
        return this.print;
    }

    /**
     * Gets the value of the probability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the probability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProbability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getProbability() {
        if (probability == null) {
            probability = new ArrayList<SearchColumnDoubleField>();
        }
        return this.probability;
    }

    /**
     * Gets the value of the projectedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getProjectedAmount() {
        if (projectedAmount == null) {
            projectedAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.projectedAmount;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promoCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromoCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPromoCode() {
        if (promoCode == null) {
            promoCode = new ArrayList<SearchColumnSelectField>();
        }
        return this.promoCode;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPurchaseOrder() {
        if (purchaseOrder == null) {
            purchaseOrder = new ArrayList<SearchColumnSelectField>();
        }
        return this.purchaseOrder;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the quantityBilled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityBilled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityBilled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityBilled() {
        if (quantityBilled == null) {
            quantityBilled = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityBilled;
    }

    /**
     * Gets the value of the quantityCommitted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityCommitted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityCommitted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityCommitted() {
        if (quantityCommitted == null) {
            quantityCommitted = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityCommitted;
    }

    /**
     * Gets the value of the quantityPacked property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityPacked property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityPacked().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityPacked() {
        if (quantityPacked == null) {
            quantityPacked = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityPacked;
    }

    /**
     * Gets the value of the quantityPicked property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityPicked property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityPicked().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityPicked() {
        if (quantityPicked == null) {
            quantityPicked = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityPicked;
    }

    /**
     * Gets the value of the quantityRevCommitted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityRevCommitted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityRevCommitted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityRevCommitted() {
        if (quantityRevCommitted == null) {
            quantityRevCommitted = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityRevCommitted;
    }

    /**
     * Gets the value of the quantityShipRecv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityShipRecv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityShipRecv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityShipRecv() {
        if (quantityShipRecv == null) {
            quantityShipRecv = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityShipRecv;
    }

    /**
     * Gets the value of the quantityUom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityUom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityUom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityUom() {
        if (quantityUom == null) {
            quantityUom = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityUom;
    }

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRate() {
        if (rate == null) {
            rate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.rate;
    }

    /**
     * Gets the value of the realizedGainPostingTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realizedGainPostingTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealizedGainPostingTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getRealizedGainPostingTransaction() {
        if (realizedGainPostingTransaction == null) {
            realizedGainPostingTransaction = new ArrayList<SearchColumnStringField>();
        }
        return this.realizedGainPostingTransaction;
    }

    /**
     * Gets the value of the recognizedRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recognizedRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecognizedRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRecognizedRevenue() {
        if (recognizedRevenue == null) {
            recognizedRevenue = new ArrayList<SearchColumnDoubleField>();
        }
        return this.recognizedRevenue;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getRecordType() {
        if (recordType == null) {
            recordType = new ArrayList<SearchColumnStringField>();
        }
        return this.recordType;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getRefNumber() {
        if (refNumber == null) {
            refNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.refNumber;
    }

    /**
     * Gets the value of the revCommitStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revCommitStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevCommitStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getRevCommitStatus() {
        if (revCommitStatus == null) {
            revCommitStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.revCommitStatus;
    }

    /**
     * Gets the value of the revCommittingTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revCommittingTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevCommittingTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getRevCommittingTransaction() {
        if (revCommittingTransaction == null) {
            revCommittingTransaction = new ArrayList<SearchColumnSelectField>();
        }
        return this.revCommittingTransaction;
    }

    /**
     * Gets the value of the revenueStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getRevenueStatus() {
        if (revenueStatus == null) {
            revenueStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.revenueStatus;
    }

    /**
     * Gets the value of the reversalDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reversalDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReversalDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getReversalDate() {
        if (reversalDate == null) {
            reversalDate = new ArrayList<SearchColumnDateField>();
        }
        return this.reversalDate;
    }

    /**
     * Gets the value of the reversalNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reversalNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReversalNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getReversalNumber() {
        if (reversalNumber == null) {
            reversalNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.reversalNumber;
    }

    /**
     * Gets the value of the revRecEndDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revRecEndDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevRecEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getRevRecEndDate() {
        if (revRecEndDate == null) {
            revRecEndDate = new ArrayList<SearchColumnDateField>();
        }
        return this.revRecEndDate;
    }

    /**
     * Gets the value of the revRecOnRevCommitment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revRecOnRevCommitment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevRecOnRevCommitment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getRevRecOnRevCommitment() {
        if (revRecOnRevCommitment == null) {
            revRecOnRevCommitment = new ArrayList<SearchColumnBooleanField>();
        }
        return this.revRecOnRevCommitment;
    }

    /**
     * Gets the value of the revRecStartDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revRecStartDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevRecStartDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getRevRecStartDate() {
        if (revRecStartDate == null) {
            revRecStartDate = new ArrayList<SearchColumnDateField>();
        }
        return this.revRecStartDate;
    }

    /**
     * Gets the value of the rgAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getRgAccount() {
        if (rgAccount == null) {
            rgAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.rgAccount;
    }

    /**
     * Gets the value of the rgAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRgAmount() {
        if (rgAmount == null) {
            rgAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.rgAmount;
    }

    /**
     * Gets the value of the salesEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getSalesEffectiveDate() {
        if (salesEffectiveDate == null) {
            salesEffectiveDate = new ArrayList<SearchColumnDateField>();
        }
        return this.salesEffectiveDate;
    }

    /**
     * Gets the value of the salesOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesOrder() {
        if (salesOrder == null) {
            salesOrder = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesOrder;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesRep() {
        if (salesRep == null) {
            salesRep = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesRep;
    }

    /**
     * Gets the value of the salesTeamMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTeamMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTeamMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesTeamMember() {
        if (salesTeamMember == null) {
            salesTeamMember = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesTeamMember;
    }

    /**
     * Gets the value of the salesTeamRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTeamRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTeamRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesTeamRole() {
        if (salesTeamRole == null) {
            salesTeamRole = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesTeamRole;
    }

    /**
     * Gets the value of the schedulingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedulingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedulingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSchedulingMethod() {
        if (schedulingMethod == null) {
            schedulingMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.schedulingMethod;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSerialNumber() {
        if (serialNumber == null) {
            serialNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.serialNumber;
    }

    /**
     * Gets the value of the serialNumberCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getSerialNumberCost() {
        if (serialNumberCost == null) {
            serialNumberCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.serialNumberCost;
    }

    /**
     * Gets the value of the serialNumberCostAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberCostAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberCostAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getSerialNumberCostAdjustment() {
        if (serialNumberCostAdjustment == null) {
            serialNumberCostAdjustment = new ArrayList<SearchColumnDoubleField>();
        }
        return this.serialNumberCostAdjustment;
    }

    /**
     * Gets the value of the serialNumberQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getSerialNumberQuantity() {
        if (serialNumberQuantity == null) {
            serialNumberQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.serialNumberQuantity;
    }

    /**
     * Gets the value of the serialNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSerialNumbers() {
        if (serialNumbers == null) {
            serialNumbers = new ArrayList<SearchColumnStringField>();
        }
        return this.serialNumbers;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress() {
        if (shipAddress == null) {
            shipAddress = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress;
    }

    /**
     * Gets the value of the shipAddress1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress1() {
        if (shipAddress1 == null) {
            shipAddress1 = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress1;
    }

    /**
     * Gets the value of the shipAddress2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress2() {
        if (shipAddress2 == null) {
            shipAddress2 = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress2;
    }

    /**
     * Gets the value of the shipAddress3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress3() {
        if (shipAddress3 == null) {
            shipAddress3 = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress3;
    }

    /**
     * Gets the value of the shipAddressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddressee() {
        if (shipAddressee == null) {
            shipAddressee = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddressee;
    }

    /**
     * Gets the value of the shipAttention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAttention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAttention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAttention() {
        if (shipAttention == null) {
            shipAttention = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAttention;
    }

    /**
     * Gets the value of the shipCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipCity() {
        if (shipCity == null) {
            shipCity = new ArrayList<SearchColumnStringField>();
        }
        return this.shipCity;
    }

    /**
     * Gets the value of the shipComplete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipComplete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipComplete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShipComplete() {
        if (shipComplete == null) {
            shipComplete = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shipComplete;
    }

    /**
     * Gets the value of the shipCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getShipCountry() {
        if (shipCountry == null) {
            shipCountry = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.shipCountry;
    }

    /**
     * Gets the value of the shipCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipCountryCode() {
        if (shipCountryCode == null) {
            shipCountryCode = new ArrayList<SearchColumnStringField>();
        }
        return this.shipCountryCode;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getShipDate() {
        if (shipDate == null) {
            shipDate = new ArrayList<SearchColumnDateField>();
        }
        return this.shipDate;
    }

    /**
     * Gets the value of the shipGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getShipGroup() {
        if (shipGroup == null) {
            shipGroup = new ArrayList<SearchColumnLongField>();
        }
        return this.shipGroup;
    }

    /**
     * Gets the value of the shipMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getShipMethod() {
        if (shipMethod == null) {
            shipMethod = new ArrayList<SearchColumnSelectField>();
        }
        return this.shipMethod;
    }

    /**
     * Gets the value of the shipPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipPhone() {
        if (shipPhone == null) {
            shipPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.shipPhone;
    }

    /**
     * Gets the value of the shippingAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getShippingAmount() {
        if (shippingAmount == null) {
            shippingAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.shippingAmount;
    }

    /**
     * Gets the value of the shipRecvStatusLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipRecvStatusLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipRecvStatusLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShipRecvStatusLine() {
        if (shipRecvStatusLine == null) {
            shipRecvStatusLine = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shipRecvStatusLine;
    }

    /**
     * Gets the value of the shipState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipState() {
        if (shipState == null) {
            shipState = new ArrayList<SearchColumnStringField>();
        }
        return this.shipState;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getShipTo() {
        if (shipTo == null) {
            shipTo = new ArrayList<SearchColumnSelectField>();
        }
        return this.shipTo;
    }

    /**
     * Gets the value of the shipZip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipZip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipZip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipZip() {
        if (shipZip == null) {
            shipZip = new ArrayList<SearchColumnStringField>();
        }
        return this.shipZip;
    }

    /**
     * Gets the value of the signedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getSignedAmount() {
        if (signedAmount == null) {
            signedAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.signedAmount;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSource() {
        if (source == null) {
            source = new ArrayList<SearchColumnStringField>();
        }
        return this.source;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getStartDate() {
        if (startDate == null) {
            startDate = new ArrayList<SearchColumnDateField>();
        }
        return this.startDate;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getStatus() {
        if (status == null) {
            status = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.status;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSubsidiary() {
        if (subsidiary == null) {
            subsidiary = new ArrayList<SearchColumnSelectField>();
        }
        return this.subsidiary;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTaxAmount() {
        if (taxAmount == null) {
            taxAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.taxAmount;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTaxCode() {
        if (taxCode == null) {
            taxCode = new ArrayList<SearchColumnSelectField>();
        }
        return this.taxCode;
    }

    /**
     * Gets the value of the taxLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getTaxLine() {
        if (taxLine == null) {
            taxLine = new ArrayList<SearchColumnBooleanField>();
        }
        return this.taxLine;
    }

    /**
     * Gets the value of the taxPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTaxPeriod() {
        if (taxPeriod == null) {
            taxPeriod = new ArrayList<SearchColumnSelectField>();
        }
        return this.taxPeriod;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTaxTotal() {
        if (taxTotal == null) {
            taxTotal = new ArrayList<SearchColumnDoubleField>();
        }
        return this.taxTotal;
    }

    /**
     * Gets the value of the termInMonths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termInMonths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermInMonths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getTermInMonths() {
        if (termInMonths == null) {
            termInMonths = new ArrayList<SearchColumnLongField>();
        }
        return this.termInMonths;
    }

    /**
     * Gets the value of the terms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTerms() {
        if (terms == null) {
            terms = new ArrayList<SearchColumnSelectField>();
        }
        return this.terms;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTitle() {
        if (title == null) {
            title = new ArrayList<SearchColumnStringField>();
        }
        return this.title;
    }

    /**
     * Gets the value of the toBeEmailed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toBeEmailed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToBeEmailed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getToBeEmailed() {
        if (toBeEmailed == null) {
            toBeEmailed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.toBeEmailed;
    }

    /**
     * Gets the value of the toBePrinted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toBePrinted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToBePrinted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getToBePrinted() {
        if (toBePrinted == null) {
            toBePrinted = new ArrayList<SearchColumnBooleanField>();
        }
        return this.toBePrinted;
    }

    /**
     * Gets the value of the toSubsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toSubsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getToSubsidiary() {
        if (toSubsidiary == null) {
            toSubsidiary = new ArrayList<SearchColumnSelectField>();
        }
        return this.toSubsidiary;
    }

    /**
     * Gets the value of the total property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the total property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTotal() {
        if (total == null) {
            total = new ArrayList<SearchColumnDoubleField>();
        }
        return this.total;
    }

    /**
     * Gets the value of the totalCostEstimate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalCostEstimate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalCostEstimate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTotalCostEstimate() {
        if (totalCostEstimate == null) {
            totalCostEstimate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.totalCostEstimate;
    }

    /**
     * Gets the value of the trackingNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTrackingNumbers() {
        if (trackingNumbers == null) {
            trackingNumbers = new ArrayList<SearchColumnStringField>();
        }
        return this.trackingNumbers;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getTranDate() {
        if (tranDate == null) {
            tranDate = new ArrayList<SearchColumnDateField>();
        }
        return this.tranDate;
    }

    /**
     * Gets the value of the tranEstGrossProfit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranEstGrossProfit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranEstGrossProfit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTranEstGrossProfit() {
        if (tranEstGrossProfit == null) {
            tranEstGrossProfit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.tranEstGrossProfit;
    }

    /**
     * Gets the value of the tranFxEstGrossProfit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranFxEstGrossProfit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranFxEstGrossProfit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTranFxEstGrossProfit() {
        if (tranFxEstGrossProfit == null) {
            tranFxEstGrossProfit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.tranFxEstGrossProfit;
    }

    /**
     * Gets the value of the tranId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTranId() {
        if (tranId == null) {
            tranId = new ArrayList<SearchColumnStringField>();
        }
        return this.tranId;
    }

    /**
     * Gets the value of the tranIsVsoeBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranIsVsoeBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranIsVsoeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getTranIsVsoeBundle() {
        if (tranIsVsoeBundle == null) {
            tranIsVsoeBundle = new ArrayList<SearchColumnBooleanField>();
        }
        return this.tranIsVsoeBundle;
    }

    /**
     * Gets the value of the transactionDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getTransactionDiscount() {
        if (transactionDiscount == null) {
            transactionDiscount = new ArrayList<SearchColumnBooleanField>();
        }
        return this.transactionDiscount;
    }

    /**
     * Gets the value of the transactionLineType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLineType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLineType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getTransactionLineType() {
        if (transactionLineType == null) {
            transactionLineType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.transactionLineType;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTransactionNumber() {
        if (transactionNumber == null) {
            transactionNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.transactionNumber;
    }

    /**
     * Gets the value of the transferLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTransferLocation() {
        if (transferLocation == null) {
            transferLocation = new ArrayList<SearchColumnSelectField>();
        }
        return this.transferLocation;
    }

    /**
     * Gets the value of the transferOrderItemLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOrderItemLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOrderItemLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTransferOrderItemLine() {
        if (transferOrderItemLine == null) {
            transferOrderItemLine = new ArrayList<SearchColumnStringField>();
        }
        return this.transferOrderItemLine;
    }

    /**
     * Gets the value of the transferOrderQuantityCommitted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOrderQuantityCommitted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOrderQuantityCommitted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTransferOrderQuantityCommitted() {
        if (transferOrderQuantityCommitted == null) {
            transferOrderQuantityCommitted = new ArrayList<SearchColumnDoubleField>();
        }
        return this.transferOrderQuantityCommitted;
    }

    /**
     * Gets the value of the transferOrderQuantityPacked property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOrderQuantityPacked property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOrderQuantityPacked().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTransferOrderQuantityPacked() {
        if (transferOrderQuantityPacked == null) {
            transferOrderQuantityPacked = new ArrayList<SearchColumnDoubleField>();
        }
        return this.transferOrderQuantityPacked;
    }

    /**
     * Gets the value of the transferOrderQuantityPicked property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOrderQuantityPicked property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOrderQuantityPicked().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTransferOrderQuantityPicked() {
        if (transferOrderQuantityPicked == null) {
            transferOrderQuantityPicked = new ArrayList<SearchColumnDoubleField>();
        }
        return this.transferOrderQuantityPicked;
    }

    /**
     * Gets the value of the transferOrderQuantityReceived property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOrderQuantityReceived property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOrderQuantityReceived().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTransferOrderQuantityReceived() {
        if (transferOrderQuantityReceived == null) {
            transferOrderQuantityReceived = new ArrayList<SearchColumnDoubleField>();
        }
        return this.transferOrderQuantityReceived;
    }

    /**
     * Gets the value of the transferOrderQuantityShipped property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOrderQuantityShipped property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOrderQuantityShipped().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTransferOrderQuantityShipped() {
        if (transferOrderQuantityShipped == null) {
            transferOrderQuantityShipped = new ArrayList<SearchColumnDoubleField>();
        }
        return this.transferOrderQuantityShipped;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getType() {
        if (type == null) {
            type = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.type;
    }

    /**
     * Gets the value of the unit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUnit() {
        if (unit == null) {
            unit = new ArrayList<SearchColumnStringField>();
        }
        return this.unit;
    }

    /**
     * Gets the value of the unitCostOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitCostOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitCostOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getUnitCostOverride() {
        if (unitCostOverride == null) {
            unitCostOverride = new ArrayList<SearchColumnDoubleField>();
        }
        return this.unitCostOverride;
    }

    /**
     * Gets the value of the vendType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVendType() {
        if (vendType == null) {
            vendType = new ArrayList<SearchColumnSelectField>();
        }
        return this.vendType;
    }

    /**
     * Gets the value of the visibleToCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visibleToCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisibleToCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getVisibleToCustomer() {
        if (visibleToCustomer == null) {
            visibleToCustomer = new ArrayList<SearchColumnBooleanField>();
        }
        return this.visibleToCustomer;
    }

    /**
     * Gets the value of the vsoeAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoeAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoeAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getVsoeAllocation() {
        if (vsoeAllocation == null) {
            vsoeAllocation = new ArrayList<SearchColumnDoubleField>();
        }
        return this.vsoeAllocation;
    }

    /**
     * Gets the value of the vsoeAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoeAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoeAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getVsoeAmount() {
        if (vsoeAmount == null) {
            vsoeAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.vsoeAmount;
    }

    /**
     * Gets the value of the vsoeDeferral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoeDeferral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoeDeferral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getVsoeDeferral() {
        if (vsoeDeferral == null) {
            vsoeDeferral = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.vsoeDeferral;
    }

    /**
     * Gets the value of the vsoeDelivered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoeDelivered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoeDelivered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getVsoeDelivered() {
        if (vsoeDelivered == null) {
            vsoeDelivered = new ArrayList<SearchColumnBooleanField>();
        }
        return this.vsoeDelivered;
    }

    /**
     * Gets the value of the vsoePermitDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoePermitDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoePermitDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getVsoePermitDiscount() {
        if (vsoePermitDiscount == null) {
            vsoePermitDiscount = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.vsoePermitDiscount;
    }

    /**
     * Gets the value of the vsoePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getVsoePrice() {
        if (vsoePrice == null) {
            vsoePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.vsoePrice;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getWebSite() {
        if (webSite == null) {
            webSite = new ArrayList<SearchColumnStringField>();
        }
        return this.webSite;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchColumnCustomFieldList value) {
        this.customFieldList = value;
    }

}
