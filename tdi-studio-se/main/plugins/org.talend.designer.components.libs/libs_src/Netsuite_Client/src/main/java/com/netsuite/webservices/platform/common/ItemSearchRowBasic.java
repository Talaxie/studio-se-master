
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
import com.netsuite.webservices.platform.core.SearchRowBasic;


/**
 * <p>Java class for ItemSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountingBook" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookAmortization" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookRevRecSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowedShippingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alternateDemandSourceItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="assetAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="atpLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="atpMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autoLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autoPreferredStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autoReorderPoint" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availableToPartners" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="averageCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="backwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="basePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billExchRateVarianceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billPriceVarianceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billQtyVarianceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="binNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="binOnHandAvail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="binOnHandCount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bomQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="buildEntireAssembly" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="buildTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="buyItNowPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="categoryPreferred" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="componentYield" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="copyDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemCorrelation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemCount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemLift" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemPurchaseRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costAccountingStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="costingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countryOfManufacture" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="createJob" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custReturnVarianceAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dateViewed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="daysBeforeExpiration" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defaultReturnCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defaultShippingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deferredExpenseAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deferredRevenueAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deferRevRec" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="demandModifier" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="demandSource" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="demandTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="departmentnohierarchy" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="displayIneBayStore" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distributionCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distributionNetwork" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dontShowPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eBayItemDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eBayItemSubtitle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eBayItemTitle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ebayRelistingOption" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effectiveBomControl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effectiveDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effectiveRevision" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endAuctionsWhenOutOfStock" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="excludeFromSitemap" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expenseAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="featuredDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fixedLotSize" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="forwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fraudRisk" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="froogleProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fxCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gainLossAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCertAuthCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCertEmail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCertExpirationDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCertFrom" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCertMessage" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCertOriginalAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giftCertRecipient" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hits" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="imageUrl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="incomeAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inventoryLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="invtClassification" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="invtCountInterval" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isAvailable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isDropShipItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isFulfillable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isGcoCompliant" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isLotItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isOnline" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isSerialItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isSpecialOrderItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isSpecialWorkOrderItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="issueProduct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTaxable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isVsoeBundle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isWip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemUrl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastPurchasePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastQuantityAvailableChange" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="leadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="liabilityAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listingDuration" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationAtpLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationAverageCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationBinQuantityAvailable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationBuildTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationCostAccountingStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationDefaultReturnCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationDemandSource" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationDemandTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationFixedLotSize" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationInventoryCostTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationInvtClassification" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationInvtCountInterval" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationLastInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationNextInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationPeriodicLotSizeDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationPeriodicLotSizeType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationPreferredStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityAvailable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityBackOrdered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityInTransit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityOnHand" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityOnOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationReOrderPoint" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationRescheduleInDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationRescheduleOutDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationSafetyStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationSupplyLotSizingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationSupplyTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationSupplyType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationTotalValue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locBackwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locForwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerAddr1" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTariff" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTaxId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerZip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingChargeItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchBillToReceipt" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="memberItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="memberQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="metaTagHtml" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minimumQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="modified" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mpn" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="multManufactureAddr" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nextagCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nextagProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nextInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="noPriceMessage" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numActiveListings" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberAllowedDownloads" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numCurrentlyListed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteRevision" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offerSupport" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="onlineCustomerPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="onlinePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="onSpecial" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="otherPrices" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="otherVendor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outOfStockBehavior" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outOfStockMessage" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="overallQuantityPricingType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="overheadType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pageTitle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="periodicLotSizeDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="periodicLotSizeType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preferenceCriterion" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preferredBin" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preferredLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevelDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pricesIncludeTax" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pricingGroup" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaryCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="prodPriceVarianceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="prodQtyVarianceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantityDiff" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchasePriceVarianceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityAvailable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityBackOrdered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnHand" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="receiptAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantityDiff" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reorderMultiple" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reOrderPoint" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rescheduleInDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rescheduleOutDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reservePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revRecSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roundUpAsComponent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="safetyStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="safetyStockLevelDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesTaxCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="saleUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sameAsPrimaryBookAmortization" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sameAsPrimaryBookRevRec" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scrapAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="searchKeywords" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="seasonalDemand" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sellOnEBay" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipIndividually" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipPackage" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingCarrier" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shoppingDotComCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shoppingProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shopzillaCategoryId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shopzillaProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sitemapPriority" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="softDescriptor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="startingPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stockDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stockUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="storeDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="storeDetailedDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="storeDisplayImage" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="storeDisplayName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supplyLotSizingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supplyReplenishmentMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supplyTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supplyType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thumbNailUrl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalValue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trackLandedCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unbuildVarianceAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unitsType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="upcCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="urlComponent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useBins" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useComponentYield" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useMarginalRates" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendorCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendorCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendorCostEntered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendorName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendorPriceCurrency" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendorSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendReturnVarianceAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDeferral" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDelivered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoePermitDiscount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vsoePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="webSite" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="weightUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wipAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wipVarianceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="yahooProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ItemSearchRowBasic", propOrder = {
    "accountingBook",
    "accountingBookAmortization",
    "accountingBookRevRecSchedule",
    "allowedShippingMethod",
    "alternateDemandSourceItem",
    "assetAccount",
    "atpLeadTime",
    "atpMethod",
    "autoLeadTime",
    "autoPreferredStockLevel",
    "autoReorderPoint",
    "availableToPartners",
    "averageCost",
    "backwardConsumptionDays",
    "basePrice",
    "billExchRateVarianceAcct",
    "billPriceVarianceAcct",
    "billQtyVarianceAcct",
    "binNumber",
    "binOnHandAvail",
    "binOnHandCount",
    "bomQuantity",
    "buildEntireAssembly",
    "buildTime",
    "buyItNowPrice",
    "category",
    "categoryPreferred",
    "clazz",
    "componentYield",
    "copyDescription",
    "correlatedItem",
    "correlatedItemCorrelation",
    "correlatedItemCount",
    "correlatedItemLift",
    "correlatedItemPurchaseRate",
    "cost",
    "costAccountingStatus",
    "costCategory",
    "costEstimate",
    "costEstimateType",
    "costingMethod",
    "countryOfManufacture",
    "created",
    "createJob",
    "custReturnVarianceAccount",
    "dateViewed",
    "daysBeforeExpiration",
    "defaultReturnCost",
    "defaultShippingMethod",
    "deferredExpenseAccount",
    "deferredRevenueAccount",
    "deferRevRec",
    "demandModifier",
    "demandSource",
    "demandTimeFence",
    "department",
    "departmentnohierarchy",
    "displayIneBayStore",
    "displayName",
    "distributionCategory",
    "distributionNetwork",
    "dontShowPrice",
    "eBayItemDescription",
    "eBayItemSubtitle",
    "eBayItemTitle",
    "ebayRelistingOption",
    "effectiveBomControl",
    "effectiveDate",
    "effectiveRevision",
    "endAuctionsWhenOutOfStock",
    "excludeFromSitemap",
    "expenseAccount",
    "externalId",
    "featuredDescription",
    "feedDescription",
    "feedName",
    "fixedLotSize",
    "forwardConsumptionDays",
    "fraudRisk",
    "froogleProductFeed",
    "fxCost",
    "gainLossAccount",
    "giftCertAuthCode",
    "giftCertEmail",
    "giftCertExpirationDate",
    "giftCertFrom",
    "giftCertMessage",
    "giftCertOriginalAmount",
    "giftCertRecipient",
    "hits",
    "imageUrl",
    "incomeAccount",
    "internalId",
    "inventoryLocation",
    "invtClassification",
    "invtCountInterval",
    "isAvailable",
    "isDropShipItem",
    "isFulfillable",
    "isGcoCompliant",
    "isInactive",
    "isLotItem",
    "isOnline",
    "isSerialItem",
    "isSpecialOrderItem",
    "isSpecialWorkOrderItem",
    "issueProduct",
    "isTaxable",
    "isVsoeBundle",
    "isWip",
    "itemId",
    "itemUrl",
    "lastInvtCountDate",
    "lastPurchasePrice",
    "lastQuantityAvailableChange",
    "leadTime",
    "liabilityAccount",
    "listingDuration",
    "location",
    "locationAtpLeadTime",
    "locationAverageCost",
    "locationBinQuantityAvailable",
    "locationBuildTime",
    "locationCost",
    "locationCostAccountingStatus",
    "locationDefaultReturnCost",
    "locationDemandSource",
    "locationDemandTimeFence",
    "locationFixedLotSize",
    "locationInventoryCostTemplate",
    "locationInvtClassification",
    "locationInvtCountInterval",
    "locationLastInvtCountDate",
    "locationLeadTime",
    "locationNextInvtCountDate",
    "locationPeriodicLotSizeDays",
    "locationPeriodicLotSizeType",
    "locationPreferredStockLevel",
    "locationQuantityAvailable",
    "locationQuantityBackOrdered",
    "locationQuantityCommitted",
    "locationQuantityInTransit",
    "locationQuantityOnHand",
    "locationQuantityOnOrder",
    "locationReOrderPoint",
    "locationRescheduleInDays",
    "locationRescheduleOutDays",
    "locationSafetyStockLevel",
    "locationSupplyLotSizingMethod",
    "locationSupplyTimeFence",
    "locationSupplyType",
    "locationTotalValue",
    "locBackwardConsumptionDays",
    "locForwardConsumptionDays",
    "manufacturer",
    "manufacturerAddr1",
    "manufacturerCity",
    "manufacturerState",
    "manufacturerTariff",
    "manufacturerTaxId",
    "manufacturerZip",
    "manufacturingChargeItem",
    "matchBillToReceipt",
    "memberItem",
    "memberQuantity",
    "metaTagHtml",
    "minimumQuantity",
    "modified",
    "mpn",
    "multManufactureAddr",
    "nextagCategory",
    "nextagProductFeed",
    "nextInvtCountDate",
    "noPriceMessage",
    "numActiveListings",
    "numberAllowedDownloads",
    "numCurrentlyListed",
    "obsoleteDate",
    "obsoleteRevision",
    "offerSupport",
    "onlineCustomerPrice",
    "onlinePrice",
    "onSpecial",
    "otherPrices",
    "otherVendor",
    "outOfStockBehavior",
    "outOfStockMessage",
    "overallQuantityPricingType",
    "overheadType",
    "pageTitle",
    "parent",
    "periodicLotSizeDays",
    "periodicLotSizeType",
    "preferenceCriterion",
    "preferredBin",
    "preferredLocation",
    "preferredStockLevel",
    "preferredStockLevelDays",
    "pricesIncludeTax",
    "pricingGroup",
    "primaryCategory",
    "prodPriceVarianceAcct",
    "prodQtyVarianceAcct",
    "purchaseDescription",
    "purchaseOrderAmount",
    "purchaseOrderQuantity",
    "purchaseOrderQuantityDiff",
    "purchasePriceVarianceAcct",
    "purchaseUnit",
    "quantityAvailable",
    "quantityBackOrdered",
    "quantityCommitted",
    "quantityOnHand",
    "quantityOnOrder",
    "quantityPricingSchedule",
    "receiptAmount",
    "receiptQuantity",
    "receiptQuantityDiff",
    "reorderMultiple",
    "reOrderPoint",
    "rescheduleInDays",
    "rescheduleOutDays",
    "reservePrice",
    "revRecSchedule",
    "roundUpAsComponent",
    "safetyStockLevel",
    "safetyStockLevelDays",
    "salesDescription",
    "salesTaxCode",
    "saleUnit",
    "sameAsPrimaryBookAmortization",
    "sameAsPrimaryBookRevRec",
    "scheduleBCode",
    "scheduleBNumber",
    "scheduleBQuantity",
    "scrapAcct",
    "searchKeywords",
    "seasonalDemand",
    "sellOnEBay",
    "serialNumber",
    "serialNumberLocation",
    "shipIndividually",
    "shipPackage",
    "shippingCarrier",
    "shippingRate",
    "shoppingDotComCategory",
    "shoppingProductFeed",
    "shopzillaCategoryId",
    "shopzillaProductFeed",
    "sitemapPriority",
    "softDescriptor",
    "startingPrice",
    "stockDescription",
    "stockUnit",
    "storeDescription",
    "storeDetailedDescription",
    "storeDisplayImage",
    "storeDisplayName",
    "storeDisplayThumbnail",
    "subsidiary",
    "subType",
    "supplyLotSizingMethod",
    "supplyReplenishmentMethod",
    "supplyTimeFence",
    "supplyType",
    "taxSchedule",
    "thumbNailUrl",
    "totalValue",
    "trackLandedCost",
    "transferPrice",
    "type",
    "unbuildVarianceAccount",
    "unitsType",
    "upcCode",
    "urlComponent",
    "useBins",
    "useComponentYield",
    "useMarginalRates",
    "vendor",
    "vendorCode",
    "vendorCost",
    "vendorCostEntered",
    "vendorName",
    "vendorPriceCurrency",
    "vendorSchedule",
    "vendReturnVarianceAccount",
    "vsoeDeferral",
    "vsoeDelivered",
    "vsoePermitDiscount",
    "vsoePrice",
    "webSite",
    "weight",
    "weightUnit",
    "wipAcct",
    "wipVarianceAcct",
    "yahooProductFeed",
    "customFieldList"
})
public class ItemSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnSelectField> accountingBook;
    protected List<SearchColumnSelectField> accountingBookAmortization;
    protected List<SearchColumnSelectField> accountingBookRevRecSchedule;
    protected List<SearchColumnSelectField> allowedShippingMethod;
    protected List<SearchColumnStringField> alternateDemandSourceItem;
    protected List<SearchColumnSelectField> assetAccount;
    protected List<SearchColumnDoubleField> atpLeadTime;
    protected List<SearchColumnEnumSelectField> atpMethod;
    protected List<SearchColumnBooleanField> autoLeadTime;
    protected List<SearchColumnBooleanField> autoPreferredStockLevel;
    protected List<SearchColumnBooleanField> autoReorderPoint;
    protected List<SearchColumnBooleanField> availableToPartners;
    protected List<SearchColumnDoubleField> averageCost;
    protected List<SearchColumnLongField> backwardConsumptionDays;
    protected List<SearchColumnDoubleField> basePrice;
    protected List<SearchColumnSelectField> billExchRateVarianceAcct;
    protected List<SearchColumnSelectField> billPriceVarianceAcct;
    protected List<SearchColumnSelectField> billQtyVarianceAcct;
    protected List<SearchColumnStringField> binNumber;
    protected List<SearchColumnDoubleField> binOnHandAvail;
    protected List<SearchColumnDoubleField> binOnHandCount;
    protected List<SearchColumnDoubleField> bomQuantity;
    protected List<SearchColumnBooleanField> buildEntireAssembly;
    protected List<SearchColumnDoubleField> buildTime;
    protected List<SearchColumnDoubleField> buyItNowPrice;
    protected List<SearchColumnStringField> category;
    protected List<SearchColumnStringField> categoryPreferred;
    @XmlElement(name = "class")
    protected List<SearchColumnSelectField> clazz;
    protected List<SearchColumnDoubleField> componentYield;
    protected List<SearchColumnBooleanField> copyDescription;
    protected List<SearchColumnSelectField> correlatedItem;
    protected List<SearchColumnDoubleField> correlatedItemCorrelation;
    protected List<SearchColumnLongField> correlatedItemCount;
    protected List<SearchColumnDoubleField> correlatedItemLift;
    protected List<SearchColumnDoubleField> correlatedItemPurchaseRate;
    protected List<SearchColumnDoubleField> cost;
    protected List<SearchColumnEnumSelectField> costAccountingStatus;
    protected List<SearchColumnStringField> costCategory;
    protected List<SearchColumnDoubleField> costEstimate;
    protected List<SearchColumnEnumSelectField> costEstimateType;
    protected List<SearchColumnEnumSelectField> costingMethod;
    protected List<SearchColumnEnumSelectField> countryOfManufacture;
    protected List<SearchColumnDateField> created;
    protected List<SearchColumnBooleanField> createJob;
    protected List<SearchColumnSelectField> custReturnVarianceAccount;
    protected List<SearchColumnDateField> dateViewed;
    protected List<SearchColumnStringField> daysBeforeExpiration;
    protected List<SearchColumnDoubleField> defaultReturnCost;
    protected List<SearchColumnStringField> defaultShippingMethod;
    protected List<SearchColumnSelectField> deferredExpenseAccount;
    protected List<SearchColumnSelectField> deferredRevenueAccount;
    protected List<SearchColumnBooleanField> deferRevRec;
    protected List<SearchColumnDoubleField> demandModifier;
    protected List<SearchColumnEnumSelectField> demandSource;
    protected List<SearchColumnLongField> demandTimeFence;
    protected List<SearchColumnSelectField> department;
    protected List<SearchColumnSelectField> departmentnohierarchy;
    protected List<SearchColumnBooleanField> displayIneBayStore;
    protected List<SearchColumnStringField> displayName;
    protected List<SearchColumnSelectField> distributionCategory;
    protected List<SearchColumnSelectField> distributionNetwork;
    protected List<SearchColumnBooleanField> dontShowPrice;
    protected List<SearchColumnStringField> eBayItemDescription;
    protected List<SearchColumnStringField> eBayItemSubtitle;
    protected List<SearchColumnStringField> eBayItemTitle;
    protected List<SearchColumnEnumSelectField> ebayRelistingOption;
    protected List<SearchColumnEnumSelectField> effectiveBomControl;
    protected List<SearchColumnDateField> effectiveDate;
    protected List<SearchColumnSelectField> effectiveRevision;
    protected List<SearchColumnBooleanField> endAuctionsWhenOutOfStock;
    protected List<SearchColumnBooleanField> excludeFromSitemap;
    protected List<SearchColumnSelectField> expenseAccount;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnStringField> featuredDescription;
    protected List<SearchColumnStringField> feedDescription;
    protected List<SearchColumnStringField> feedName;
    protected List<SearchColumnDoubleField> fixedLotSize;
    protected List<SearchColumnLongField> forwardConsumptionDays;
    protected List<SearchColumnEnumSelectField> fraudRisk;
    protected List<SearchColumnBooleanField> froogleProductFeed;
    protected List<SearchColumnDoubleField> fxCost;
    protected List<SearchColumnSelectField> gainLossAccount;
    protected List<SearchColumnStringField> giftCertAuthCode;
    protected List<SearchColumnStringField> giftCertEmail;
    protected List<SearchColumnStringField> giftCertExpirationDate;
    protected List<SearchColumnStringField> giftCertFrom;
    protected List<SearchColumnStringField> giftCertMessage;
    protected List<SearchColumnStringField> giftCertOriginalAmount;
    protected List<SearchColumnStringField> giftCertRecipient;
    protected List<SearchColumnLongField> hits;
    protected List<SearchColumnStringField> imageUrl;
    protected List<SearchColumnSelectField> incomeAccount;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnSelectField> inventoryLocation;
    protected List<SearchColumnEnumSelectField> invtClassification;
    protected List<SearchColumnLongField> invtCountInterval;
    protected List<SearchColumnBooleanField> isAvailable;
    protected List<SearchColumnBooleanField> isDropShipItem;
    protected List<SearchColumnBooleanField> isFulfillable;
    protected List<SearchColumnBooleanField> isGcoCompliant;
    protected List<SearchColumnBooleanField> isInactive;
    protected List<SearchColumnBooleanField> isLotItem;
    protected List<SearchColumnBooleanField> isOnline;
    protected List<SearchColumnBooleanField> isSerialItem;
    protected List<SearchColumnBooleanField> isSpecialOrderItem;
    protected List<SearchColumnBooleanField> isSpecialWorkOrderItem;
    protected List<SearchColumnSelectField> issueProduct;
    protected List<SearchColumnBooleanField> isTaxable;
    protected List<SearchColumnBooleanField> isVsoeBundle;
    protected List<SearchColumnBooleanField> isWip;
    protected List<SearchColumnStringField> itemId;
    protected List<SearchColumnStringField> itemUrl;
    protected List<SearchColumnDateField> lastInvtCountDate;
    protected List<SearchColumnDoubleField> lastPurchasePrice;
    protected List<SearchColumnDateField> lastQuantityAvailableChange;
    protected List<SearchColumnLongField> leadTime;
    protected List<SearchColumnSelectField> liabilityAccount;
    protected List<SearchColumnEnumSelectField> listingDuration;
    protected List<SearchColumnSelectField> location;
    protected List<SearchColumnDoubleField> locationAtpLeadTime;
    protected List<SearchColumnDoubleField> locationAverageCost;
    protected List<SearchColumnStringField> locationBinQuantityAvailable;
    protected List<SearchColumnDoubleField> locationBuildTime;
    protected List<SearchColumnDoubleField> locationCost;
    protected List<SearchColumnEnumSelectField> locationCostAccountingStatus;
    protected List<SearchColumnDoubleField> locationDefaultReturnCost;
    protected List<SearchColumnEnumSelectField> locationDemandSource;
    protected List<SearchColumnLongField> locationDemandTimeFence;
    protected List<SearchColumnDoubleField> locationFixedLotSize;
    protected List<SearchColumnStringField> locationInventoryCostTemplate;
    protected List<SearchColumnEnumSelectField> locationInvtClassification;
    protected List<SearchColumnLongField> locationInvtCountInterval;
    protected List<SearchColumnDateField> locationLastInvtCountDate;
    protected List<SearchColumnLongField> locationLeadTime;
    protected List<SearchColumnDateField> locationNextInvtCountDate;
    protected List<SearchColumnLongField> locationPeriodicLotSizeDays;
    protected List<SearchColumnEnumSelectField> locationPeriodicLotSizeType;
    protected List<SearchColumnDoubleField> locationPreferredStockLevel;
    protected List<SearchColumnDoubleField> locationQuantityAvailable;
    protected List<SearchColumnDoubleField> locationQuantityBackOrdered;
    protected List<SearchColumnDoubleField> locationQuantityCommitted;
    protected List<SearchColumnDoubleField> locationQuantityInTransit;
    protected List<SearchColumnDoubleField> locationQuantityOnHand;
    protected List<SearchColumnDoubleField> locationQuantityOnOrder;
    protected List<SearchColumnDoubleField> locationReOrderPoint;
    protected List<SearchColumnLongField> locationRescheduleInDays;
    protected List<SearchColumnLongField> locationRescheduleOutDays;
    protected List<SearchColumnDoubleField> locationSafetyStockLevel;
    protected List<SearchColumnEnumSelectField> locationSupplyLotSizingMethod;
    protected List<SearchColumnLongField> locationSupplyTimeFence;
    protected List<SearchColumnEnumSelectField> locationSupplyType;
    protected List<SearchColumnDoubleField> locationTotalValue;
    protected List<SearchColumnLongField> locBackwardConsumptionDays;
    protected List<SearchColumnLongField> locForwardConsumptionDays;
    protected List<SearchColumnStringField> manufacturer;
    protected List<SearchColumnStringField> manufacturerAddr1;
    protected List<SearchColumnStringField> manufacturerCity;
    protected List<SearchColumnStringField> manufacturerState;
    protected List<SearchColumnStringField> manufacturerTariff;
    protected List<SearchColumnStringField> manufacturerTaxId;
    protected List<SearchColumnStringField> manufacturerZip;
    protected List<SearchColumnBooleanField> manufacturingChargeItem;
    protected List<SearchColumnBooleanField> matchBillToReceipt;
    protected List<SearchColumnSelectField> memberItem;
    protected List<SearchColumnDoubleField> memberQuantity;
    protected List<SearchColumnStringField> metaTagHtml;
    protected List<SearchColumnStringField> minimumQuantity;
    protected List<SearchColumnDateField> modified;
    protected List<SearchColumnStringField> mpn;
    protected List<SearchColumnBooleanField> multManufactureAddr;
    protected List<SearchColumnStringField> nextagCategory;
    protected List<SearchColumnBooleanField> nextagProductFeed;
    protected List<SearchColumnDateField> nextInvtCountDate;
    protected List<SearchColumnStringField> noPriceMessage;
    protected List<SearchColumnLongField> numActiveListings;
    protected List<SearchColumnStringField> numberAllowedDownloads;
    protected List<SearchColumnLongField> numCurrentlyListed;
    protected List<SearchColumnDateField> obsoleteDate;
    protected List<SearchColumnSelectField> obsoleteRevision;
    protected List<SearchColumnBooleanField> offerSupport;
    protected List<SearchColumnDoubleField> onlineCustomerPrice;
    protected List<SearchColumnDoubleField> onlinePrice;
    protected List<SearchColumnBooleanField> onSpecial;
    protected List<SearchColumnDoubleField> otherPrices;
    protected List<SearchColumnSelectField> otherVendor;
    protected List<SearchColumnStringField> outOfStockBehavior;
    protected List<SearchColumnStringField> outOfStockMessage;
    protected List<SearchColumnEnumSelectField> overallQuantityPricingType;
    protected List<SearchColumnEnumSelectField> overheadType;
    protected List<SearchColumnStringField> pageTitle;
    protected List<SearchColumnSelectField> parent;
    protected List<SearchColumnLongField> periodicLotSizeDays;
    protected List<SearchColumnEnumSelectField> periodicLotSizeType;
    protected List<SearchColumnStringField> preferenceCriterion;
    protected List<SearchColumnBooleanField> preferredBin;
    protected List<SearchColumnSelectField> preferredLocation;
    protected List<SearchColumnDoubleField> preferredStockLevel;
    protected List<SearchColumnLongField> preferredStockLevelDays;
    protected List<SearchColumnBooleanField> pricesIncludeTax;
    protected List<SearchColumnSelectField> pricingGroup;
    protected List<SearchColumnStringField> primaryCategory;
    protected List<SearchColumnSelectField> prodPriceVarianceAcct;
    protected List<SearchColumnSelectField> prodQtyVarianceAcct;
    protected List<SearchColumnStringField> purchaseDescription;
    protected List<SearchColumnDoubleField> purchaseOrderAmount;
    protected List<SearchColumnDoubleField> purchaseOrderQuantity;
    protected List<SearchColumnDoubleField> purchaseOrderQuantityDiff;
    protected List<SearchColumnSelectField> purchasePriceVarianceAcct;
    protected List<SearchColumnSelectField> purchaseUnit;
    protected List<SearchColumnDoubleField> quantityAvailable;
    protected List<SearchColumnDoubleField> quantityBackOrdered;
    protected List<SearchColumnDoubleField> quantityCommitted;
    protected List<SearchColumnDoubleField> quantityOnHand;
    protected List<SearchColumnDoubleField> quantityOnOrder;
    protected List<SearchColumnSelectField> quantityPricingSchedule;
    protected List<SearchColumnDoubleField> receiptAmount;
    protected List<SearchColumnDoubleField> receiptQuantity;
    protected List<SearchColumnDoubleField> receiptQuantityDiff;
    protected List<SearchColumnLongField> reorderMultiple;
    protected List<SearchColumnDoubleField> reOrderPoint;
    protected List<SearchColumnLongField> rescheduleInDays;
    protected List<SearchColumnLongField> rescheduleOutDays;
    protected List<SearchColumnDoubleField> reservePrice;
    protected List<SearchColumnSelectField> revRecSchedule;
    protected List<SearchColumnBooleanField> roundUpAsComponent;
    protected List<SearchColumnDoubleField> safetyStockLevel;
    protected List<SearchColumnLongField> safetyStockLevelDays;
    protected List<SearchColumnStringField> salesDescription;
    protected List<SearchColumnSelectField> salesTaxCode;
    protected List<SearchColumnSelectField> saleUnit;
    protected List<SearchColumnBooleanField> sameAsPrimaryBookAmortization;
    protected List<SearchColumnBooleanField> sameAsPrimaryBookRevRec;
    protected List<SearchColumnEnumSelectField> scheduleBCode;
    protected List<SearchColumnStringField> scheduleBNumber;
    protected List<SearchColumnStringField> scheduleBQuantity;
    protected List<SearchColumnSelectField> scrapAcct;
    protected List<SearchColumnStringField> searchKeywords;
    protected List<SearchColumnBooleanField> seasonalDemand;
    protected List<SearchColumnBooleanField> sellOnEBay;
    protected List<SearchColumnStringField> serialNumber;
    protected List<SearchColumnStringField> serialNumberLocation;
    protected List<SearchColumnBooleanField> shipIndividually;
    protected List<SearchColumnSelectField> shipPackage;
    protected List<SearchColumnEnumSelectField> shippingCarrier;
    protected List<SearchColumnDoubleField> shippingRate;
    protected List<SearchColumnStringField> shoppingDotComCategory;
    protected List<SearchColumnBooleanField> shoppingProductFeed;
    protected List<SearchColumnLongField> shopzillaCategoryId;
    protected List<SearchColumnBooleanField> shopzillaProductFeed;
    protected List<SearchColumnEnumSelectField> sitemapPriority;
    protected List<SearchColumnSelectField> softDescriptor;
    protected List<SearchColumnDoubleField> startingPrice;
    protected List<SearchColumnStringField> stockDescription;
    protected List<SearchColumnSelectField> stockUnit;
    protected List<SearchColumnStringField> storeDescription;
    protected List<SearchColumnStringField> storeDetailedDescription;
    protected List<SearchColumnSelectField> storeDisplayImage;
    protected List<SearchColumnStringField> storeDisplayName;
    protected List<SearchColumnSelectField> storeDisplayThumbnail;
    protected List<SearchColumnSelectField> subsidiary;
    protected List<SearchColumnEnumSelectField> subType;
    protected List<SearchColumnEnumSelectField> supplyLotSizingMethod;
    protected List<SearchColumnEnumSelectField> supplyReplenishmentMethod;
    protected List<SearchColumnLongField> supplyTimeFence;
    protected List<SearchColumnEnumSelectField> supplyType;
    protected List<SearchColumnSelectField> taxSchedule;
    protected List<SearchColumnStringField> thumbNailUrl;
    protected List<SearchColumnDoubleField> totalValue;
    protected List<SearchColumnBooleanField> trackLandedCost;
    protected List<SearchColumnDoubleField> transferPrice;
    protected List<SearchColumnEnumSelectField> type;
    protected List<SearchColumnSelectField> unbuildVarianceAccount;
    protected List<SearchColumnSelectField> unitsType;
    protected List<SearchColumnStringField> upcCode;
    protected List<SearchColumnStringField> urlComponent;
    protected List<SearchColumnBooleanField> useBins;
    protected List<SearchColumnBooleanField> useComponentYield;
    protected List<SearchColumnBooleanField> useMarginalRates;
    protected List<SearchColumnSelectField> vendor;
    protected List<SearchColumnStringField> vendorCode;
    protected List<SearchColumnDoubleField> vendorCost;
    protected List<SearchColumnDoubleField> vendorCostEntered;
    protected List<SearchColumnStringField> vendorName;
    protected List<SearchColumnStringField> vendorPriceCurrency;
    protected List<SearchColumnSelectField> vendorSchedule;
    protected List<SearchColumnSelectField> vendReturnVarianceAccount;
    protected List<SearchColumnEnumSelectField> vsoeDeferral;
    protected List<SearchColumnBooleanField> vsoeDelivered;
    protected List<SearchColumnEnumSelectField> vsoePermitDiscount;
    protected List<SearchColumnDoubleField> vsoePrice;
    protected List<SearchColumnSelectField> webSite;
    protected List<SearchColumnDoubleField> weight;
    protected List<SearchColumnEnumSelectField> weightUnit;
    protected List<SearchColumnSelectField> wipAcct;
    protected List<SearchColumnSelectField> wipVarianceAcct;
    protected List<SearchColumnBooleanField> yahooProductFeed;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the accountingBook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingBook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingBook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAccountingBook() {
        if (accountingBook == null) {
            accountingBook = new ArrayList<SearchColumnSelectField>();
        }
        return this.accountingBook;
    }

    /**
     * Gets the value of the accountingBookAmortization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingBookAmortization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingBookAmortization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAccountingBookAmortization() {
        if (accountingBookAmortization == null) {
            accountingBookAmortization = new ArrayList<SearchColumnSelectField>();
        }
        return this.accountingBookAmortization;
    }

    /**
     * Gets the value of the accountingBookRevRecSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingBookRevRecSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingBookRevRecSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAccountingBookRevRecSchedule() {
        if (accountingBookRevRecSchedule == null) {
            accountingBookRevRecSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.accountingBookRevRecSchedule;
    }

    /**
     * Gets the value of the allowedShippingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedShippingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedShippingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAllowedShippingMethod() {
        if (allowedShippingMethod == null) {
            allowedShippingMethod = new ArrayList<SearchColumnSelectField>();
        }
        return this.allowedShippingMethod;
    }

    /**
     * Gets the value of the alternateDemandSourceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateDemandSourceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateDemandSourceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAlternateDemandSourceItem() {
        if (alternateDemandSourceItem == null) {
            alternateDemandSourceItem = new ArrayList<SearchColumnStringField>();
        }
        return this.alternateDemandSourceItem;
    }

    /**
     * Gets the value of the assetAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAssetAccount() {
        if (assetAccount == null) {
            assetAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.assetAccount;
    }

    /**
     * Gets the value of the atpLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atpLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtpLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAtpLeadTime() {
        if (atpLeadTime == null) {
            atpLeadTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.atpLeadTime;
    }

    /**
     * Gets the value of the atpMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atpMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtpMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getAtpMethod() {
        if (atpMethod == null) {
            atpMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.atpMethod;
    }

    /**
     * Gets the value of the autoLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAutoLeadTime() {
        if (autoLeadTime == null) {
            autoLeadTime = new ArrayList<SearchColumnBooleanField>();
        }
        return this.autoLeadTime;
    }

    /**
     * Gets the value of the autoPreferredStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoPreferredStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoPreferredStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAutoPreferredStockLevel() {
        if (autoPreferredStockLevel == null) {
            autoPreferredStockLevel = new ArrayList<SearchColumnBooleanField>();
        }
        return this.autoPreferredStockLevel;
    }

    /**
     * Gets the value of the autoReorderPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoReorderPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoReorderPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAutoReorderPoint() {
        if (autoReorderPoint == null) {
            autoReorderPoint = new ArrayList<SearchColumnBooleanField>();
        }
        return this.autoReorderPoint;
    }

    /**
     * Gets the value of the availableToPartners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableToPartners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableToPartners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAvailableToPartners() {
        if (availableToPartners == null) {
            availableToPartners = new ArrayList<SearchColumnBooleanField>();
        }
        return this.availableToPartners;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAverageCost() {
        if (averageCost == null) {
            averageCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.averageCost;
    }

    /**
     * Gets the value of the backwardConsumptionDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backwardConsumptionDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackwardConsumptionDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getBackwardConsumptionDays() {
        if (backwardConsumptionDays == null) {
            backwardConsumptionDays = new ArrayList<SearchColumnLongField>();
        }
        return this.backwardConsumptionDays;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBasePrice() {
        if (basePrice == null) {
            basePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.basePrice;
    }

    /**
     * Gets the value of the billExchRateVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billExchRateVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillExchRateVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillExchRateVarianceAcct() {
        if (billExchRateVarianceAcct == null) {
            billExchRateVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.billExchRateVarianceAcct;
    }

    /**
     * Gets the value of the billPriceVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billPriceVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillPriceVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillPriceVarianceAcct() {
        if (billPriceVarianceAcct == null) {
            billPriceVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.billPriceVarianceAcct;
    }

    /**
     * Gets the value of the billQtyVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billQtyVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillQtyVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillQtyVarianceAcct() {
        if (billQtyVarianceAcct == null) {
            billQtyVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.billQtyVarianceAcct;
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
     * Gets the value of the binOnHandAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binOnHandAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinOnHandAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBinOnHandAvail() {
        if (binOnHandAvail == null) {
            binOnHandAvail = new ArrayList<SearchColumnDoubleField>();
        }
        return this.binOnHandAvail;
    }

    /**
     * Gets the value of the binOnHandCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binOnHandCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinOnHandCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBinOnHandCount() {
        if (binOnHandCount == null) {
            binOnHandCount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.binOnHandCount;
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
     * Gets the value of the buildTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBuildTime() {
        if (buildTime == null) {
            buildTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.buildTime;
    }

    /**
     * Gets the value of the buyItNowPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyItNowPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyItNowPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBuyItNowPrice() {
        if (buyItNowPrice == null) {
            buyItNowPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.buyItNowPrice;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCategory() {
        if (category == null) {
            category = new ArrayList<SearchColumnStringField>();
        }
        return this.category;
    }

    /**
     * Gets the value of the categoryPreferred property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryPreferred property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryPreferred().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCategoryPreferred() {
        if (categoryPreferred == null) {
            categoryPreferred = new ArrayList<SearchColumnStringField>();
        }
        return this.categoryPreferred;
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
     * Gets the value of the copyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getCopyDescription() {
        if (copyDescription == null) {
            copyDescription = new ArrayList<SearchColumnBooleanField>();
        }
        return this.copyDescription;
    }

    /**
     * Gets the value of the correlatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCorrelatedItem() {
        if (correlatedItem == null) {
            correlatedItem = new ArrayList<SearchColumnSelectField>();
        }
        return this.correlatedItem;
    }

    /**
     * Gets the value of the correlatedItemCorrelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlatedItemCorrelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelatedItemCorrelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCorrelatedItemCorrelation() {
        if (correlatedItemCorrelation == null) {
            correlatedItemCorrelation = new ArrayList<SearchColumnDoubleField>();
        }
        return this.correlatedItemCorrelation;
    }

    /**
     * Gets the value of the correlatedItemCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlatedItemCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelatedItemCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getCorrelatedItemCount() {
        if (correlatedItemCount == null) {
            correlatedItemCount = new ArrayList<SearchColumnLongField>();
        }
        return this.correlatedItemCount;
    }

    /**
     * Gets the value of the correlatedItemLift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlatedItemLift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelatedItemLift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCorrelatedItemLift() {
        if (correlatedItemLift == null) {
            correlatedItemLift = new ArrayList<SearchColumnDoubleField>();
        }
        return this.correlatedItemLift;
    }

    /**
     * Gets the value of the correlatedItemPurchaseRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlatedItemPurchaseRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelatedItemPurchaseRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCorrelatedItemPurchaseRate() {
        if (correlatedItemPurchaseRate == null) {
            correlatedItemPurchaseRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.correlatedItemPurchaseRate;
    }

    /**
     * Gets the value of the cost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCost() {
        if (cost == null) {
            cost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.cost;
    }

    /**
     * Gets the value of the costAccountingStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costAccountingStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostAccountingStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCostAccountingStatus() {
        if (costAccountingStatus == null) {
            costAccountingStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.costAccountingStatus;
    }

    /**
     * Gets the value of the costCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCostCategory() {
        if (costCategory == null) {
            costCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.costCategory;
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
     * Gets the value of the costingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCostingMethod() {
        if (costingMethod == null) {
            costingMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.costingMethod;
    }

    /**
     * Gets the value of the countryOfManufacture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfManufacture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfManufacture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCountryOfManufacture() {
        if (countryOfManufacture == null) {
            countryOfManufacture = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.countryOfManufacture;
    }

    /**
     * Gets the value of the created property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the created property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCreated() {
        if (created == null) {
            created = new ArrayList<SearchColumnDateField>();
        }
        return this.created;
    }

    /**
     * Gets the value of the createJob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createJob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getCreateJob() {
        if (createJob == null) {
            createJob = new ArrayList<SearchColumnBooleanField>();
        }
        return this.createJob;
    }

    /**
     * Gets the value of the custReturnVarianceAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custReturnVarianceAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustReturnVarianceAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCustReturnVarianceAccount() {
        if (custReturnVarianceAccount == null) {
            custReturnVarianceAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.custReturnVarianceAccount;
    }

    /**
     * Gets the value of the dateViewed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateViewed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateViewed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDateViewed() {
        if (dateViewed == null) {
            dateViewed = new ArrayList<SearchColumnDateField>();
        }
        return this.dateViewed;
    }

    /**
     * Gets the value of the daysBeforeExpiration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysBeforeExpiration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysBeforeExpiration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDaysBeforeExpiration() {
        if (daysBeforeExpiration == null) {
            daysBeforeExpiration = new ArrayList<SearchColumnStringField>();
        }
        return this.daysBeforeExpiration;
    }

    /**
     * Gets the value of the defaultReturnCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultReturnCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultReturnCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDefaultReturnCost() {
        if (defaultReturnCost == null) {
            defaultReturnCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.defaultReturnCost;
    }

    /**
     * Gets the value of the defaultShippingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultShippingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultShippingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDefaultShippingMethod() {
        if (defaultShippingMethod == null) {
            defaultShippingMethod = new ArrayList<SearchColumnStringField>();
        }
        return this.defaultShippingMethod;
    }

    /**
     * Gets the value of the deferredExpenseAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredExpenseAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredExpenseAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDeferredExpenseAccount() {
        if (deferredExpenseAccount == null) {
            deferredExpenseAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.deferredExpenseAccount;
    }

    /**
     * Gets the value of the deferredRevenueAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredRevenueAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredRevenueAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDeferredRevenueAccount() {
        if (deferredRevenueAccount == null) {
            deferredRevenueAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.deferredRevenueAccount;
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
     * Gets the value of the demandModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDemandModifier() {
        if (demandModifier == null) {
            demandModifier = new ArrayList<SearchColumnDoubleField>();
        }
        return this.demandModifier;
    }

    /**
     * Gets the value of the demandSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getDemandSource() {
        if (demandSource == null) {
            demandSource = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.demandSource;
    }

    /**
     * Gets the value of the demandTimeFence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandTimeFence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandTimeFence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDemandTimeFence() {
        if (demandTimeFence == null) {
            demandTimeFence = new ArrayList<SearchColumnLongField>();
        }
        return this.demandTimeFence;
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
     * Gets the value of the departmentnohierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departmentnohierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartmentnohierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDepartmentnohierarchy() {
        if (departmentnohierarchy == null) {
            departmentnohierarchy = new ArrayList<SearchColumnSelectField>();
        }
        return this.departmentnohierarchy;
    }

    /**
     * Gets the value of the displayIneBayStore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayIneBayStore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayIneBayStore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDisplayIneBayStore() {
        if (displayIneBayStore == null) {
            displayIneBayStore = new ArrayList<SearchColumnBooleanField>();
        }
        return this.displayIneBayStore;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<SearchColumnStringField>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the distributionCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDistributionCategory() {
        if (distributionCategory == null) {
            distributionCategory = new ArrayList<SearchColumnSelectField>();
        }
        return this.distributionCategory;
    }

    /**
     * Gets the value of the distributionNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDistributionNetwork() {
        if (distributionNetwork == null) {
            distributionNetwork = new ArrayList<SearchColumnSelectField>();
        }
        return this.distributionNetwork;
    }

    /**
     * Gets the value of the dontShowPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dontShowPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDontShowPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDontShowPrice() {
        if (dontShowPrice == null) {
            dontShowPrice = new ArrayList<SearchColumnBooleanField>();
        }
        return this.dontShowPrice;
    }

    /**
     * Gets the value of the eBayItemDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eBayItemDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBayItemDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEBayItemDescription() {
        if (eBayItemDescription == null) {
            eBayItemDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.eBayItemDescription;
    }

    /**
     * Gets the value of the eBayItemSubtitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eBayItemSubtitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBayItemSubtitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEBayItemSubtitle() {
        if (eBayItemSubtitle == null) {
            eBayItemSubtitle = new ArrayList<SearchColumnStringField>();
        }
        return this.eBayItemSubtitle;
    }

    /**
     * Gets the value of the eBayItemTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eBayItemTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBayItemTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEBayItemTitle() {
        if (eBayItemTitle == null) {
            eBayItemTitle = new ArrayList<SearchColumnStringField>();
        }
        return this.eBayItemTitle;
    }

    /**
     * Gets the value of the ebayRelistingOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebayRelistingOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEbayRelistingOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getEbayRelistingOption() {
        if (ebayRelistingOption == null) {
            ebayRelistingOption = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.ebayRelistingOption;
    }

    /**
     * Gets the value of the effectiveBomControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveBomControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveBomControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getEffectiveBomControl() {
        if (effectiveBomControl == null) {
            effectiveBomControl = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.effectiveBomControl;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getEffectiveDate() {
        if (effectiveDate == null) {
            effectiveDate = new ArrayList<SearchColumnDateField>();
        }
        return this.effectiveDate;
    }

    /**
     * Gets the value of the effectiveRevision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveRevision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEffectiveRevision() {
        if (effectiveRevision == null) {
            effectiveRevision = new ArrayList<SearchColumnSelectField>();
        }
        return this.effectiveRevision;
    }

    /**
     * Gets the value of the endAuctionsWhenOutOfStock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endAuctionsWhenOutOfStock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndAuctionsWhenOutOfStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getEndAuctionsWhenOutOfStock() {
        if (endAuctionsWhenOutOfStock == null) {
            endAuctionsWhenOutOfStock = new ArrayList<SearchColumnBooleanField>();
        }
        return this.endAuctionsWhenOutOfStock;
    }

    /**
     * Gets the value of the excludeFromSitemap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeFromSitemap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeFromSitemap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getExcludeFromSitemap() {
        if (excludeFromSitemap == null) {
            excludeFromSitemap = new ArrayList<SearchColumnBooleanField>();
        }
        return this.excludeFromSitemap;
    }

    /**
     * Gets the value of the expenseAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExpenseAccount() {
        if (expenseAccount == null) {
            expenseAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.expenseAccount;
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
     * Gets the value of the featuredDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featuredDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeaturedDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFeaturedDescription() {
        if (featuredDescription == null) {
            featuredDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.featuredDescription;
    }

    /**
     * Gets the value of the feedDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFeedDescription() {
        if (feedDescription == null) {
            feedDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.feedDescription;
    }

    /**
     * Gets the value of the feedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFeedName() {
        if (feedName == null) {
            feedName = new ArrayList<SearchColumnStringField>();
        }
        return this.feedName;
    }

    /**
     * Gets the value of the fixedLotSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedLotSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedLotSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFixedLotSize() {
        if (fixedLotSize == null) {
            fixedLotSize = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fixedLotSize;
    }

    /**
     * Gets the value of the forwardConsumptionDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwardConsumptionDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwardConsumptionDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getForwardConsumptionDays() {
        if (forwardConsumptionDays == null) {
            forwardConsumptionDays = new ArrayList<SearchColumnLongField>();
        }
        return this.forwardConsumptionDays;
    }

    /**
     * Gets the value of the fraudRisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fraudRisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFraudRisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getFraudRisk() {
        if (fraudRisk == null) {
            fraudRisk = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.fraudRisk;
    }

    /**
     * Gets the value of the froogleProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the froogleProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFroogleProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getFroogleProductFeed() {
        if (froogleProductFeed == null) {
            froogleProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.froogleProductFeed;
    }

    /**
     * Gets the value of the fxCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxCost() {
        if (fxCost == null) {
            fxCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxCost;
    }

    /**
     * Gets the value of the gainLossAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gainLossAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGainLossAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getGainLossAccount() {
        if (gainLossAccount == null) {
            gainLossAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.gainLossAccount;
    }

    /**
     * Gets the value of the giftCertAuthCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertAuthCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertAuthCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertAuthCode() {
        if (giftCertAuthCode == null) {
            giftCertAuthCode = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertAuthCode;
    }

    /**
     * Gets the value of the giftCertEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertEmail() {
        if (giftCertEmail == null) {
            giftCertEmail = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertEmail;
    }

    /**
     * Gets the value of the giftCertExpirationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertExpirationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertExpirationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertExpirationDate() {
        if (giftCertExpirationDate == null) {
            giftCertExpirationDate = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertExpirationDate;
    }

    /**
     * Gets the value of the giftCertFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertFrom() {
        if (giftCertFrom == null) {
            giftCertFrom = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertFrom;
    }

    /**
     * Gets the value of the giftCertMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertMessage() {
        if (giftCertMessage == null) {
            giftCertMessage = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertMessage;
    }

    /**
     * Gets the value of the giftCertOriginalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertOriginalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertOriginalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertOriginalAmount() {
        if (giftCertOriginalAmount == null) {
            giftCertOriginalAmount = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertOriginalAmount;
    }

    /**
     * Gets the value of the giftCertRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertRecipient() {
        if (giftCertRecipient == null) {
            giftCertRecipient = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertRecipient;
    }

    /**
     * Gets the value of the hits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getHits() {
        if (hits == null) {
            hits = new ArrayList<SearchColumnLongField>();
        }
        return this.hits;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getImageUrl() {
        if (imageUrl == null) {
            imageUrl = new ArrayList<SearchColumnStringField>();
        }
        return this.imageUrl;
    }

    /**
     * Gets the value of the incomeAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomeAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomeAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getIncomeAccount() {
        if (incomeAccount == null) {
            incomeAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.incomeAccount;
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
     * Gets the value of the inventoryLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInventoryLocation() {
        if (inventoryLocation == null) {
            inventoryLocation = new ArrayList<SearchColumnSelectField>();
        }
        return this.inventoryLocation;
    }

    /**
     * Gets the value of the invtClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invtClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvtClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getInvtClassification() {
        if (invtClassification == null) {
            invtClassification = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.invtClassification;
    }

    /**
     * Gets the value of the invtCountInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invtCountInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvtCountInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getInvtCountInterval() {
        if (invtCountInterval == null) {
            invtCountInterval = new ArrayList<SearchColumnLongField>();
        }
        return this.invtCountInterval;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsAvailable() {
        if (isAvailable == null) {
            isAvailable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isAvailable;
    }

    /**
     * Gets the value of the isDropShipItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isDropShipItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsDropShipItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsDropShipItem() {
        if (isDropShipItem == null) {
            isDropShipItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isDropShipItem;
    }

    /**
     * Gets the value of the isFulfillable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isFulfillable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsFulfillable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsFulfillable() {
        if (isFulfillable == null) {
            isFulfillable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isFulfillable;
    }

    /**
     * Gets the value of the isGcoCompliant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isGcoCompliant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsGcoCompliant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsGcoCompliant() {
        if (isGcoCompliant == null) {
            isGcoCompliant = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isGcoCompliant;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isInactive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsInactive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsInactive() {
        if (isInactive == null) {
            isInactive = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isInactive;
    }

    /**
     * Gets the value of the isLotItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isLotItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsLotItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsLotItem() {
        if (isLotItem == null) {
            isLotItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isLotItem;
    }

    /**
     * Gets the value of the isOnline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isOnline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsOnline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsOnline() {
        if (isOnline == null) {
            isOnline = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isOnline;
    }

    /**
     * Gets the value of the isSerialItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSerialItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSerialItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSerialItem() {
        if (isSerialItem == null) {
            isSerialItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSerialItem;
    }

    /**
     * Gets the value of the isSpecialOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSpecialOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSpecialOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSpecialOrderItem() {
        if (isSpecialOrderItem == null) {
            isSpecialOrderItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSpecialOrderItem;
    }

    /**
     * Gets the value of the isSpecialWorkOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSpecialWorkOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSpecialWorkOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSpecialWorkOrderItem() {
        if (isSpecialWorkOrderItem == null) {
            isSpecialWorkOrderItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSpecialWorkOrderItem;
    }

    /**
     * Gets the value of the issueProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getIssueProduct() {
        if (issueProduct == null) {
            issueProduct = new ArrayList<SearchColumnSelectField>();
        }
        return this.issueProduct;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isTaxable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsTaxable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsTaxable() {
        if (isTaxable == null) {
            isTaxable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isTaxable;
    }

    /**
     * Gets the value of the isVsoeBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isVsoeBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsVsoeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsVsoeBundle() {
        if (isVsoeBundle == null) {
            isVsoeBundle = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isVsoeBundle;
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
     * Gets the value of the itemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getItemId() {
        if (itemId == null) {
            itemId = new ArrayList<SearchColumnStringField>();
        }
        return this.itemId;
    }

    /**
     * Gets the value of the itemUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getItemUrl() {
        if (itemUrl == null) {
            itemUrl = new ArrayList<SearchColumnStringField>();
        }
        return this.itemUrl;
    }

    /**
     * Gets the value of the lastInvtCountDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastInvtCountDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastInvtCountDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastInvtCountDate() {
        if (lastInvtCountDate == null) {
            lastInvtCountDate = new ArrayList<SearchColumnDateField>();
        }
        return this.lastInvtCountDate;
    }

    /**
     * Gets the value of the lastPurchasePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastPurchasePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastPurchasePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLastPurchasePrice() {
        if (lastPurchasePrice == null) {
            lastPurchasePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.lastPurchasePrice;
    }

    /**
     * Gets the value of the lastQuantityAvailableChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastQuantityAvailableChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastQuantityAvailableChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastQuantityAvailableChange() {
        if (lastQuantityAvailableChange == null) {
            lastQuantityAvailableChange = new ArrayList<SearchColumnDateField>();
        }
        return this.lastQuantityAvailableChange;
    }

    /**
     * Gets the value of the leadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLeadTime() {
        if (leadTime == null) {
            leadTime = new ArrayList<SearchColumnLongField>();
        }
        return this.leadTime;
    }

    /**
     * Gets the value of the liabilityAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liabilityAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiabilityAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLiabilityAccount() {
        if (liabilityAccount == null) {
            liabilityAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.liabilityAccount;
    }

    /**
     * Gets the value of the listingDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getListingDuration() {
        if (listingDuration == null) {
            listingDuration = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.listingDuration;
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
     * Gets the value of the locationAtpLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAtpLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAtpLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationAtpLeadTime() {
        if (locationAtpLeadTime == null) {
            locationAtpLeadTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationAtpLeadTime;
    }

    /**
     * Gets the value of the locationAverageCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAverageCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAverageCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationAverageCost() {
        if (locationAverageCost == null) {
            locationAverageCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationAverageCost;
    }

    /**
     * Gets the value of the locationBinQuantityAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationBinQuantityAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationBinQuantityAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLocationBinQuantityAvailable() {
        if (locationBinQuantityAvailable == null) {
            locationBinQuantityAvailable = new ArrayList<SearchColumnStringField>();
        }
        return this.locationBinQuantityAvailable;
    }

    /**
     * Gets the value of the locationBuildTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationBuildTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationBuildTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationBuildTime() {
        if (locationBuildTime == null) {
            locationBuildTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationBuildTime;
    }

    /**
     * Gets the value of the locationCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationCost() {
        if (locationCost == null) {
            locationCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationCost;
    }

    /**
     * Gets the value of the locationCostAccountingStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCostAccountingStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCostAccountingStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLocationCostAccountingStatus() {
        if (locationCostAccountingStatus == null) {
            locationCostAccountingStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.locationCostAccountingStatus;
    }

    /**
     * Gets the value of the locationDefaultReturnCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDefaultReturnCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDefaultReturnCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationDefaultReturnCost() {
        if (locationDefaultReturnCost == null) {
            locationDefaultReturnCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationDefaultReturnCost;
    }

    /**
     * Gets the value of the locationDemandSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDemandSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDemandSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLocationDemandSource() {
        if (locationDemandSource == null) {
            locationDemandSource = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.locationDemandSource;
    }

    /**
     * Gets the value of the locationDemandTimeFence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDemandTimeFence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDemandTimeFence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocationDemandTimeFence() {
        if (locationDemandTimeFence == null) {
            locationDemandTimeFence = new ArrayList<SearchColumnLongField>();
        }
        return this.locationDemandTimeFence;
    }

    /**
     * Gets the value of the locationFixedLotSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationFixedLotSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationFixedLotSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationFixedLotSize() {
        if (locationFixedLotSize == null) {
            locationFixedLotSize = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationFixedLotSize;
    }

    /**
     * Gets the value of the locationInventoryCostTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationInventoryCostTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInventoryCostTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLocationInventoryCostTemplate() {
        if (locationInventoryCostTemplate == null) {
            locationInventoryCostTemplate = new ArrayList<SearchColumnStringField>();
        }
        return this.locationInventoryCostTemplate;
    }

    /**
     * Gets the value of the locationInvtClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationInvtClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInvtClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLocationInvtClassification() {
        if (locationInvtClassification == null) {
            locationInvtClassification = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.locationInvtClassification;
    }

    /**
     * Gets the value of the locationInvtCountInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationInvtCountInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInvtCountInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocationInvtCountInterval() {
        if (locationInvtCountInterval == null) {
            locationInvtCountInterval = new ArrayList<SearchColumnLongField>();
        }
        return this.locationInvtCountInterval;
    }

    /**
     * Gets the value of the locationLastInvtCountDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationLastInvtCountDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationLastInvtCountDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLocationLastInvtCountDate() {
        if (locationLastInvtCountDate == null) {
            locationLastInvtCountDate = new ArrayList<SearchColumnDateField>();
        }
        return this.locationLastInvtCountDate;
    }

    /**
     * Gets the value of the locationLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocationLeadTime() {
        if (locationLeadTime == null) {
            locationLeadTime = new ArrayList<SearchColumnLongField>();
        }
        return this.locationLeadTime;
    }

    /**
     * Gets the value of the locationNextInvtCountDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationNextInvtCountDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationNextInvtCountDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLocationNextInvtCountDate() {
        if (locationNextInvtCountDate == null) {
            locationNextInvtCountDate = new ArrayList<SearchColumnDateField>();
        }
        return this.locationNextInvtCountDate;
    }

    /**
     * Gets the value of the locationPeriodicLotSizeDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationPeriodicLotSizeDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationPeriodicLotSizeDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocationPeriodicLotSizeDays() {
        if (locationPeriodicLotSizeDays == null) {
            locationPeriodicLotSizeDays = new ArrayList<SearchColumnLongField>();
        }
        return this.locationPeriodicLotSizeDays;
    }

    /**
     * Gets the value of the locationPeriodicLotSizeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationPeriodicLotSizeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationPeriodicLotSizeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLocationPeriodicLotSizeType() {
        if (locationPeriodicLotSizeType == null) {
            locationPeriodicLotSizeType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.locationPeriodicLotSizeType;
    }

    /**
     * Gets the value of the locationPreferredStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationPreferredStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationPreferredStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationPreferredStockLevel() {
        if (locationPreferredStockLevel == null) {
            locationPreferredStockLevel = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationPreferredStockLevel;
    }

    /**
     * Gets the value of the locationQuantityAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityAvailable() {
        if (locationQuantityAvailable == null) {
            locationQuantityAvailable = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityAvailable;
    }

    /**
     * Gets the value of the locationQuantityBackOrdered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityBackOrdered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityBackOrdered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityBackOrdered() {
        if (locationQuantityBackOrdered == null) {
            locationQuantityBackOrdered = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityBackOrdered;
    }

    /**
     * Gets the value of the locationQuantityCommitted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityCommitted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityCommitted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityCommitted() {
        if (locationQuantityCommitted == null) {
            locationQuantityCommitted = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityCommitted;
    }

    /**
     * Gets the value of the locationQuantityInTransit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityInTransit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityInTransit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityInTransit() {
        if (locationQuantityInTransit == null) {
            locationQuantityInTransit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityInTransit;
    }

    /**
     * Gets the value of the locationQuantityOnHand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityOnHand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityOnHand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityOnHand() {
        if (locationQuantityOnHand == null) {
            locationQuantityOnHand = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityOnHand;
    }

    /**
     * Gets the value of the locationQuantityOnOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityOnOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityOnOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityOnOrder() {
        if (locationQuantityOnOrder == null) {
            locationQuantityOnOrder = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityOnOrder;
    }

    /**
     * Gets the value of the locationReOrderPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationReOrderPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationReOrderPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationReOrderPoint() {
        if (locationReOrderPoint == null) {
            locationReOrderPoint = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationReOrderPoint;
    }

    /**
     * Gets the value of the locationRescheduleInDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationRescheduleInDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRescheduleInDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocationRescheduleInDays() {
        if (locationRescheduleInDays == null) {
            locationRescheduleInDays = new ArrayList<SearchColumnLongField>();
        }
        return this.locationRescheduleInDays;
    }

    /**
     * Gets the value of the locationRescheduleOutDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationRescheduleOutDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRescheduleOutDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocationRescheduleOutDays() {
        if (locationRescheduleOutDays == null) {
            locationRescheduleOutDays = new ArrayList<SearchColumnLongField>();
        }
        return this.locationRescheduleOutDays;
    }

    /**
     * Gets the value of the locationSafetyStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationSafetyStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationSafetyStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationSafetyStockLevel() {
        if (locationSafetyStockLevel == null) {
            locationSafetyStockLevel = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationSafetyStockLevel;
    }

    /**
     * Gets the value of the locationSupplyLotSizingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationSupplyLotSizingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationSupplyLotSizingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLocationSupplyLotSizingMethod() {
        if (locationSupplyLotSizingMethod == null) {
            locationSupplyLotSizingMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.locationSupplyLotSizingMethod;
    }

    /**
     * Gets the value of the locationSupplyTimeFence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationSupplyTimeFence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationSupplyTimeFence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocationSupplyTimeFence() {
        if (locationSupplyTimeFence == null) {
            locationSupplyTimeFence = new ArrayList<SearchColumnLongField>();
        }
        return this.locationSupplyTimeFence;
    }

    /**
     * Gets the value of the locationSupplyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationSupplyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationSupplyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLocationSupplyType() {
        if (locationSupplyType == null) {
            locationSupplyType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.locationSupplyType;
    }

    /**
     * Gets the value of the locationTotalValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationTotalValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationTotalValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationTotalValue() {
        if (locationTotalValue == null) {
            locationTotalValue = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationTotalValue;
    }

    /**
     * Gets the value of the locBackwardConsumptionDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locBackwardConsumptionDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocBackwardConsumptionDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocBackwardConsumptionDays() {
        if (locBackwardConsumptionDays == null) {
            locBackwardConsumptionDays = new ArrayList<SearchColumnLongField>();
        }
        return this.locBackwardConsumptionDays;
    }

    /**
     * Gets the value of the locForwardConsumptionDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locForwardConsumptionDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocForwardConsumptionDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLocForwardConsumptionDays() {
        if (locForwardConsumptionDays == null) {
            locForwardConsumptionDays = new ArrayList<SearchColumnLongField>();
        }
        return this.locForwardConsumptionDays;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturer() {
        if (manufacturer == null) {
            manufacturer = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturer;
    }

    /**
     * Gets the value of the manufacturerAddr1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerAddr1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerAddr1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerAddr1() {
        if (manufacturerAddr1 == null) {
            manufacturerAddr1 = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerAddr1;
    }

    /**
     * Gets the value of the manufacturerCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerCity() {
        if (manufacturerCity == null) {
            manufacturerCity = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerCity;
    }

    /**
     * Gets the value of the manufacturerState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerState() {
        if (manufacturerState == null) {
            manufacturerState = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerState;
    }

    /**
     * Gets the value of the manufacturerTariff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerTariff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerTariff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerTariff() {
        if (manufacturerTariff == null) {
            manufacturerTariff = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerTariff;
    }

    /**
     * Gets the value of the manufacturerTaxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerTaxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerTaxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerTaxId() {
        if (manufacturerTaxId == null) {
            manufacturerTaxId = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerTaxId;
    }

    /**
     * Gets the value of the manufacturerZip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerZip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerZip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerZip() {
        if (manufacturerZip == null) {
            manufacturerZip = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerZip;
    }

    /**
     * Gets the value of the manufacturingChargeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturingChargeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturingChargeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getManufacturingChargeItem() {
        if (manufacturingChargeItem == null) {
            manufacturingChargeItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.manufacturingChargeItem;
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
     * Gets the value of the memberItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getMemberItem() {
        if (memberItem == null) {
            memberItem = new ArrayList<SearchColumnSelectField>();
        }
        return this.memberItem;
    }

    /**
     * Gets the value of the memberQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getMemberQuantity() {
        if (memberQuantity == null) {
            memberQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.memberQuantity;
    }

    /**
     * Gets the value of the metaTagHtml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaTagHtml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaTagHtml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMetaTagHtml() {
        if (metaTagHtml == null) {
            metaTagHtml = new ArrayList<SearchColumnStringField>();
        }
        return this.metaTagHtml;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMinimumQuantity() {
        if (minimumQuantity == null) {
            minimumQuantity = new ArrayList<SearchColumnStringField>();
        }
        return this.minimumQuantity;
    }

    /**
     * Gets the value of the modified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getModified() {
        if (modified == null) {
            modified = new ArrayList<SearchColumnDateField>();
        }
        return this.modified;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMpn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMpn() {
        if (mpn == null) {
            mpn = new ArrayList<SearchColumnStringField>();
        }
        return this.mpn;
    }

    /**
     * Gets the value of the multManufactureAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multManufactureAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultManufactureAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getMultManufactureAddr() {
        if (multManufactureAddr == null) {
            multManufactureAddr = new ArrayList<SearchColumnBooleanField>();
        }
        return this.multManufactureAddr;
    }

    /**
     * Gets the value of the nextagCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextagCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextagCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNextagCategory() {
        if (nextagCategory == null) {
            nextagCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.nextagCategory;
    }

    /**
     * Gets the value of the nextagProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextagProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextagProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getNextagProductFeed() {
        if (nextagProductFeed == null) {
            nextagProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.nextagProductFeed;
    }

    /**
     * Gets the value of the nextInvtCountDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextInvtCountDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextInvtCountDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getNextInvtCountDate() {
        if (nextInvtCountDate == null) {
            nextInvtCountDate = new ArrayList<SearchColumnDateField>();
        }
        return this.nextInvtCountDate;
    }

    /**
     * Gets the value of the noPriceMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noPriceMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoPriceMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNoPriceMessage() {
        if (noPriceMessage == null) {
            noPriceMessage = new ArrayList<SearchColumnStringField>();
        }
        return this.noPriceMessage;
    }

    /**
     * Gets the value of the numActiveListings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numActiveListings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumActiveListings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getNumActiveListings() {
        if (numActiveListings == null) {
            numActiveListings = new ArrayList<SearchColumnLongField>();
        }
        return this.numActiveListings;
    }

    /**
     * Gets the value of the numberAllowedDownloads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberAllowedDownloads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberAllowedDownloads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNumberAllowedDownloads() {
        if (numberAllowedDownloads == null) {
            numberAllowedDownloads = new ArrayList<SearchColumnStringField>();
        }
        return this.numberAllowedDownloads;
    }

    /**
     * Gets the value of the numCurrentlyListed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numCurrentlyListed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumCurrentlyListed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getNumCurrentlyListed() {
        if (numCurrentlyListed == null) {
            numCurrentlyListed = new ArrayList<SearchColumnLongField>();
        }
        return this.numCurrentlyListed;
    }

    /**
     * Gets the value of the obsoleteDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obsoleteDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObsoleteDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getObsoleteDate() {
        if (obsoleteDate == null) {
            obsoleteDate = new ArrayList<SearchColumnDateField>();
        }
        return this.obsoleteDate;
    }

    /**
     * Gets the value of the obsoleteRevision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obsoleteRevision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObsoleteRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getObsoleteRevision() {
        if (obsoleteRevision == null) {
            obsoleteRevision = new ArrayList<SearchColumnSelectField>();
        }
        return this.obsoleteRevision;
    }

    /**
     * Gets the value of the offerSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getOfferSupport() {
        if (offerSupport == null) {
            offerSupport = new ArrayList<SearchColumnBooleanField>();
        }
        return this.offerSupport;
    }

    /**
     * Gets the value of the onlineCustomerPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlineCustomerPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlineCustomerPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOnlineCustomerPrice() {
        if (onlineCustomerPrice == null) {
            onlineCustomerPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.onlineCustomerPrice;
    }

    /**
     * Gets the value of the onlinePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlinePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlinePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOnlinePrice() {
        if (onlinePrice == null) {
            onlinePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.onlinePrice;
    }

    /**
     * Gets the value of the onSpecial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onSpecial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnSpecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getOnSpecial() {
        if (onSpecial == null) {
            onSpecial = new ArrayList<SearchColumnBooleanField>();
        }
        return this.onSpecial;
    }

    /**
     * Gets the value of the otherPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOtherPrices() {
        if (otherPrices == null) {
            otherPrices = new ArrayList<SearchColumnDoubleField>();
        }
        return this.otherPrices;
    }

    /**
     * Gets the value of the otherVendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherVendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getOtherVendor() {
        if (otherVendor == null) {
            otherVendor = new ArrayList<SearchColumnSelectField>();
        }
        return this.otherVendor;
    }

    /**
     * Gets the value of the outOfStockBehavior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outOfStockBehavior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutOfStockBehavior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getOutOfStockBehavior() {
        if (outOfStockBehavior == null) {
            outOfStockBehavior = new ArrayList<SearchColumnStringField>();
        }
        return this.outOfStockBehavior;
    }

    /**
     * Gets the value of the outOfStockMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outOfStockMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutOfStockMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getOutOfStockMessage() {
        if (outOfStockMessage == null) {
            outOfStockMessage = new ArrayList<SearchColumnStringField>();
        }
        return this.outOfStockMessage;
    }

    /**
     * Gets the value of the overallQuantityPricingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overallQuantityPricingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverallQuantityPricingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getOverallQuantityPricingType() {
        if (overallQuantityPricingType == null) {
            overallQuantityPricingType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.overallQuantityPricingType;
    }

    /**
     * Gets the value of the overheadType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overheadType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverheadType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getOverheadType() {
        if (overheadType == null) {
            overheadType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.overheadType;
    }

    /**
     * Gets the value of the pageTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPageTitle() {
        if (pageTitle == null) {
            pageTitle = new ArrayList<SearchColumnStringField>();
        }
        return this.pageTitle;
    }

    /**
     * Gets the value of the parent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getParent() {
        if (parent == null) {
            parent = new ArrayList<SearchColumnSelectField>();
        }
        return this.parent;
    }

    /**
     * Gets the value of the periodicLotSizeDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodicLotSizeDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodicLotSizeDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getPeriodicLotSizeDays() {
        if (periodicLotSizeDays == null) {
            periodicLotSizeDays = new ArrayList<SearchColumnLongField>();
        }
        return this.periodicLotSizeDays;
    }

    /**
     * Gets the value of the periodicLotSizeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodicLotSizeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodicLotSizeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPeriodicLotSizeType() {
        if (periodicLotSizeType == null) {
            periodicLotSizeType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.periodicLotSizeType;
    }

    /**
     * Gets the value of the preferenceCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferenceCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferenceCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPreferenceCriterion() {
        if (preferenceCriterion == null) {
            preferenceCriterion = new ArrayList<SearchColumnStringField>();
        }
        return this.preferenceCriterion;
    }

    /**
     * Gets the value of the preferredBin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredBin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredBin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPreferredBin() {
        if (preferredBin == null) {
            preferredBin = new ArrayList<SearchColumnBooleanField>();
        }
        return this.preferredBin;
    }

    /**
     * Gets the value of the preferredLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPreferredLocation() {
        if (preferredLocation == null) {
            preferredLocation = new ArrayList<SearchColumnSelectField>();
        }
        return this.preferredLocation;
    }

    /**
     * Gets the value of the preferredStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPreferredStockLevel() {
        if (preferredStockLevel == null) {
            preferredStockLevel = new ArrayList<SearchColumnDoubleField>();
        }
        return this.preferredStockLevel;
    }

    /**
     * Gets the value of the preferredStockLevelDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredStockLevelDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredStockLevelDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getPreferredStockLevelDays() {
        if (preferredStockLevelDays == null) {
            preferredStockLevelDays = new ArrayList<SearchColumnLongField>();
        }
        return this.preferredStockLevelDays;
    }

    /**
     * Gets the value of the pricesIncludeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricesIncludeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricesIncludeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPricesIncludeTax() {
        if (pricesIncludeTax == null) {
            pricesIncludeTax = new ArrayList<SearchColumnBooleanField>();
        }
        return this.pricesIncludeTax;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPricingGroup() {
        if (pricingGroup == null) {
            pricingGroup = new ArrayList<SearchColumnSelectField>();
        }
        return this.pricingGroup;
    }

    /**
     * Gets the value of the primaryCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPrimaryCategory() {
        if (primaryCategory == null) {
            primaryCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.primaryCategory;
    }

    /**
     * Gets the value of the prodPriceVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodPriceVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdPriceVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getProdPriceVarianceAcct() {
        if (prodPriceVarianceAcct == null) {
            prodPriceVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.prodPriceVarianceAcct;
    }

    /**
     * Gets the value of the prodQtyVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodQtyVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdQtyVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getProdQtyVarianceAcct() {
        if (prodQtyVarianceAcct == null) {
            prodQtyVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.prodQtyVarianceAcct;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPurchaseDescription() {
        if (purchaseDescription == null) {
            purchaseDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.purchaseDescription;
    }

    /**
     * Gets the value of the purchaseOrderAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPurchaseOrderAmount() {
        if (purchaseOrderAmount == null) {
            purchaseOrderAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.purchaseOrderAmount;
    }

    /**
     * Gets the value of the purchaseOrderQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPurchaseOrderQuantity() {
        if (purchaseOrderQuantity == null) {
            purchaseOrderQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.purchaseOrderQuantity;
    }

    /**
     * Gets the value of the purchaseOrderQuantityDiff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderQuantityDiff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderQuantityDiff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPurchaseOrderQuantityDiff() {
        if (purchaseOrderQuantityDiff == null) {
            purchaseOrderQuantityDiff = new ArrayList<SearchColumnDoubleField>();
        }
        return this.purchaseOrderQuantityDiff;
    }

    /**
     * Gets the value of the purchasePriceVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasePriceVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasePriceVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPurchasePriceVarianceAcct() {
        if (purchasePriceVarianceAcct == null) {
            purchasePriceVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.purchasePriceVarianceAcct;
    }

    /**
     * Gets the value of the purchaseUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPurchaseUnit() {
        if (purchaseUnit == null) {
            purchaseUnit = new ArrayList<SearchColumnSelectField>();
        }
        return this.purchaseUnit;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityAvailable() {
        if (quantityAvailable == null) {
            quantityAvailable = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityAvailable;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityBackOrdered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityBackOrdered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityBackOrdered() {
        if (quantityBackOrdered == null) {
            quantityBackOrdered = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityBackOrdered;
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
     * Gets the value of the quantityOnHand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityOnHand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityOnHand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityOnHand() {
        if (quantityOnHand == null) {
            quantityOnHand = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityOnHand;
    }

    /**
     * Gets the value of the quantityOnOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityOnOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityOnOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityOnOrder() {
        if (quantityOnOrder == null) {
            quantityOnOrder = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityOnOrder;
    }

    /**
     * Gets the value of the quantityPricingSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityPricingSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityPricingSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getQuantityPricingSchedule() {
        if (quantityPricingSchedule == null) {
            quantityPricingSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.quantityPricingSchedule;
    }

    /**
     * Gets the value of the receiptAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getReceiptAmount() {
        if (receiptAmount == null) {
            receiptAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.receiptAmount;
    }

    /**
     * Gets the value of the receiptQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getReceiptQuantity() {
        if (receiptQuantity == null) {
            receiptQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.receiptQuantity;
    }

    /**
     * Gets the value of the receiptQuantityDiff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptQuantityDiff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptQuantityDiff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getReceiptQuantityDiff() {
        if (receiptQuantityDiff == null) {
            receiptQuantityDiff = new ArrayList<SearchColumnDoubleField>();
        }
        return this.receiptQuantityDiff;
    }

    /**
     * Gets the value of the reorderMultiple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reorderMultiple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReorderMultiple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getReorderMultiple() {
        if (reorderMultiple == null) {
            reorderMultiple = new ArrayList<SearchColumnLongField>();
        }
        return this.reorderMultiple;
    }

    /**
     * Gets the value of the reOrderPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reOrderPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReOrderPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getReOrderPoint() {
        if (reOrderPoint == null) {
            reOrderPoint = new ArrayList<SearchColumnDoubleField>();
        }
        return this.reOrderPoint;
    }

    /**
     * Gets the value of the rescheduleInDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rescheduleInDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRescheduleInDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getRescheduleInDays() {
        if (rescheduleInDays == null) {
            rescheduleInDays = new ArrayList<SearchColumnLongField>();
        }
        return this.rescheduleInDays;
    }

    /**
     * Gets the value of the rescheduleOutDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rescheduleOutDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRescheduleOutDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getRescheduleOutDays() {
        if (rescheduleOutDays == null) {
            rescheduleOutDays = new ArrayList<SearchColumnLongField>();
        }
        return this.rescheduleOutDays;
    }

    /**
     * Gets the value of the reservePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getReservePrice() {
        if (reservePrice == null) {
            reservePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.reservePrice;
    }

    /**
     * Gets the value of the revRecSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revRecSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevRecSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getRevRecSchedule() {
        if (revRecSchedule == null) {
            revRecSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.revRecSchedule;
    }

    /**
     * Gets the value of the roundUpAsComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roundUpAsComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoundUpAsComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getRoundUpAsComponent() {
        if (roundUpAsComponent == null) {
            roundUpAsComponent = new ArrayList<SearchColumnBooleanField>();
        }
        return this.roundUpAsComponent;
    }

    /**
     * Gets the value of the safetyStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getSafetyStockLevel() {
        if (safetyStockLevel == null) {
            safetyStockLevel = new ArrayList<SearchColumnDoubleField>();
        }
        return this.safetyStockLevel;
    }

    /**
     * Gets the value of the safetyStockLevelDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyStockLevelDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyStockLevelDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getSafetyStockLevelDays() {
        if (safetyStockLevelDays == null) {
            safetyStockLevelDays = new ArrayList<SearchColumnLongField>();
        }
        return this.safetyStockLevelDays;
    }

    /**
     * Gets the value of the salesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSalesDescription() {
        if (salesDescription == null) {
            salesDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.salesDescription;
    }

    /**
     * Gets the value of the salesTaxCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTaxCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTaxCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesTaxCode() {
        if (salesTaxCode == null) {
            salesTaxCode = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesTaxCode;
    }

    /**
     * Gets the value of the saleUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSaleUnit() {
        if (saleUnit == null) {
            saleUnit = new ArrayList<SearchColumnSelectField>();
        }
        return this.saleUnit;
    }

    /**
     * Gets the value of the sameAsPrimaryBookAmortization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sameAsPrimaryBookAmortization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameAsPrimaryBookAmortization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSameAsPrimaryBookAmortization() {
        if (sameAsPrimaryBookAmortization == null) {
            sameAsPrimaryBookAmortization = new ArrayList<SearchColumnBooleanField>();
        }
        return this.sameAsPrimaryBookAmortization;
    }

    /**
     * Gets the value of the sameAsPrimaryBookRevRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sameAsPrimaryBookRevRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameAsPrimaryBookRevRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSameAsPrimaryBookRevRec() {
        if (sameAsPrimaryBookRevRec == null) {
            sameAsPrimaryBookRevRec = new ArrayList<SearchColumnBooleanField>();
        }
        return this.sameAsPrimaryBookRevRec;
    }

    /**
     * Gets the value of the scheduleBCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleBCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleBCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getScheduleBCode() {
        if (scheduleBCode == null) {
            scheduleBCode = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.scheduleBCode;
    }

    /**
     * Gets the value of the scheduleBNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleBNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleBNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getScheduleBNumber() {
        if (scheduleBNumber == null) {
            scheduleBNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.scheduleBNumber;
    }

    /**
     * Gets the value of the scheduleBQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleBQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleBQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getScheduleBQuantity() {
        if (scheduleBQuantity == null) {
            scheduleBQuantity = new ArrayList<SearchColumnStringField>();
        }
        return this.scheduleBQuantity;
    }

    /**
     * Gets the value of the scrapAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scrapAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScrapAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getScrapAcct() {
        if (scrapAcct == null) {
            scrapAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.scrapAcct;
    }

    /**
     * Gets the value of the searchKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSearchKeywords() {
        if (searchKeywords == null) {
            searchKeywords = new ArrayList<SearchColumnStringField>();
        }
        return this.searchKeywords;
    }

    /**
     * Gets the value of the seasonalDemand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seasonalDemand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasonalDemand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSeasonalDemand() {
        if (seasonalDemand == null) {
            seasonalDemand = new ArrayList<SearchColumnBooleanField>();
        }
        return this.seasonalDemand;
    }

    /**
     * Gets the value of the sellOnEBay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellOnEBay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellOnEBay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSellOnEBay() {
        if (sellOnEBay == null) {
            sellOnEBay = new ArrayList<SearchColumnBooleanField>();
        }
        return this.sellOnEBay;
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
     * Gets the value of the serialNumberLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSerialNumberLocation() {
        if (serialNumberLocation == null) {
            serialNumberLocation = new ArrayList<SearchColumnStringField>();
        }
        return this.serialNumberLocation;
    }

    /**
     * Gets the value of the shipIndividually property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipIndividually property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipIndividually().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShipIndividually() {
        if (shipIndividually == null) {
            shipIndividually = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shipIndividually;
    }

    /**
     * Gets the value of the shipPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getShipPackage() {
        if (shipPackage == null) {
            shipPackage = new ArrayList<SearchColumnSelectField>();
        }
        return this.shipPackage;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getShippingCarrier() {
        if (shippingCarrier == null) {
            shippingCarrier = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.shippingCarrier;
    }

    /**
     * Gets the value of the shippingRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getShippingRate() {
        if (shippingRate == null) {
            shippingRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.shippingRate;
    }

    /**
     * Gets the value of the shoppingDotComCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingDotComCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingDotComCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShoppingDotComCategory() {
        if (shoppingDotComCategory == null) {
            shoppingDotComCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.shoppingDotComCategory;
    }

    /**
     * Gets the value of the shoppingProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShoppingProductFeed() {
        if (shoppingProductFeed == null) {
            shoppingProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shoppingProductFeed;
    }

    /**
     * Gets the value of the shopzillaCategoryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopzillaCategoryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShopzillaCategoryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getShopzillaCategoryId() {
        if (shopzillaCategoryId == null) {
            shopzillaCategoryId = new ArrayList<SearchColumnLongField>();
        }
        return this.shopzillaCategoryId;
    }

    /**
     * Gets the value of the shopzillaProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopzillaProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShopzillaProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShopzillaProductFeed() {
        if (shopzillaProductFeed == null) {
            shopzillaProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shopzillaProductFeed;
    }

    /**
     * Gets the value of the sitemapPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitemapPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitemapPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSitemapPriority() {
        if (sitemapPriority == null) {
            sitemapPriority = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.sitemapPriority;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSoftDescriptor() {
        if (softDescriptor == null) {
            softDescriptor = new ArrayList<SearchColumnSelectField>();
        }
        return this.softDescriptor;
    }

    /**
     * Gets the value of the startingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartingPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getStartingPrice() {
        if (startingPrice == null) {
            startingPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.startingPrice;
    }

    /**
     * Gets the value of the stockDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStockDescription() {
        if (stockDescription == null) {
            stockDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.stockDescription;
    }

    /**
     * Gets the value of the stockUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getStockUnit() {
        if (stockUnit == null) {
            stockUnit = new ArrayList<SearchColumnSelectField>();
        }
        return this.stockUnit;
    }

    /**
     * Gets the value of the storeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStoreDescription() {
        if (storeDescription == null) {
            storeDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.storeDescription;
    }

    /**
     * Gets the value of the storeDetailedDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDetailedDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDetailedDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStoreDetailedDescription() {
        if (storeDetailedDescription == null) {
            storeDetailedDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.storeDetailedDescription;
    }

    /**
     * Gets the value of the storeDisplayImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDisplayImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDisplayImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getStoreDisplayImage() {
        if (storeDisplayImage == null) {
            storeDisplayImage = new ArrayList<SearchColumnSelectField>();
        }
        return this.storeDisplayImage;
    }

    /**
     * Gets the value of the storeDisplayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDisplayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStoreDisplayName() {
        if (storeDisplayName == null) {
            storeDisplayName = new ArrayList<SearchColumnStringField>();
        }
        return this.storeDisplayName;
    }

    /**
     * Gets the value of the storeDisplayThumbnail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDisplayThumbnail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDisplayThumbnail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getStoreDisplayThumbnail() {
        if (storeDisplayThumbnail == null) {
            storeDisplayThumbnail = new ArrayList<SearchColumnSelectField>();
        }
        return this.storeDisplayThumbnail;
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
     * Gets the value of the subType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSubType() {
        if (subType == null) {
            subType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.subType;
    }

    /**
     * Gets the value of the supplyLotSizingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyLotSizingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyLotSizingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSupplyLotSizingMethod() {
        if (supplyLotSizingMethod == null) {
            supplyLotSizingMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.supplyLotSizingMethod;
    }

    /**
     * Gets the value of the supplyReplenishmentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyReplenishmentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyReplenishmentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSupplyReplenishmentMethod() {
        if (supplyReplenishmentMethod == null) {
            supplyReplenishmentMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.supplyReplenishmentMethod;
    }

    /**
     * Gets the value of the supplyTimeFence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyTimeFence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyTimeFence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getSupplyTimeFence() {
        if (supplyTimeFence == null) {
            supplyTimeFence = new ArrayList<SearchColumnLongField>();
        }
        return this.supplyTimeFence;
    }

    /**
     * Gets the value of the supplyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSupplyType() {
        if (supplyType == null) {
            supplyType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.supplyType;
    }

    /**
     * Gets the value of the taxSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTaxSchedule() {
        if (taxSchedule == null) {
            taxSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.taxSchedule;
    }

    /**
     * Gets the value of the thumbNailUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thumbNailUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThumbNailUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getThumbNailUrl() {
        if (thumbNailUrl == null) {
            thumbNailUrl = new ArrayList<SearchColumnStringField>();
        }
        return this.thumbNailUrl;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTotalValue() {
        if (totalValue == null) {
            totalValue = new ArrayList<SearchColumnDoubleField>();
        }
        return this.totalValue;
    }

    /**
     * Gets the value of the trackLandedCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackLandedCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackLandedCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getTrackLandedCost() {
        if (trackLandedCost == null) {
            trackLandedCost = new ArrayList<SearchColumnBooleanField>();
        }
        return this.trackLandedCost;
    }

    /**
     * Gets the value of the transferPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTransferPrice() {
        if (transferPrice == null) {
            transferPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.transferPrice;
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
     * Gets the value of the unbuildVarianceAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unbuildVarianceAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbuildVarianceAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getUnbuildVarianceAccount() {
        if (unbuildVarianceAccount == null) {
            unbuildVarianceAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.unbuildVarianceAccount;
    }

    /**
     * Gets the value of the unitsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getUnitsType() {
        if (unitsType == null) {
            unitsType = new ArrayList<SearchColumnSelectField>();
        }
        return this.unitsType;
    }

    /**
     * Gets the value of the upcCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upcCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpcCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUpcCode() {
        if (upcCode == null) {
            upcCode = new ArrayList<SearchColumnStringField>();
        }
        return this.upcCode;
    }

    /**
     * Gets the value of the urlComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUrlComponent() {
        if (urlComponent == null) {
            urlComponent = new ArrayList<SearchColumnStringField>();
        }
        return this.urlComponent;
    }

    /**
     * Gets the value of the useBins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useBins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseBins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseBins() {
        if (useBins == null) {
            useBins = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useBins;
    }

    /**
     * Gets the value of the useComponentYield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useComponentYield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseComponentYield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseComponentYield() {
        if (useComponentYield == null) {
            useComponentYield = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useComponentYield;
    }

    /**
     * Gets the value of the useMarginalRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useMarginalRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseMarginalRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseMarginalRates() {
        if (useMarginalRates == null) {
            useMarginalRates = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useMarginalRates;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<SearchColumnSelectField>();
        }
        return this.vendor;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVendorCode() {
        if (vendorCode == null) {
            vendorCode = new ArrayList<SearchColumnStringField>();
        }
        return this.vendorCode;
    }

    /**
     * Gets the value of the vendorCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getVendorCost() {
        if (vendorCost == null) {
            vendorCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.vendorCost;
    }

    /**
     * Gets the value of the vendorCostEntered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorCostEntered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorCostEntered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getVendorCostEntered() {
        if (vendorCostEntered == null) {
            vendorCostEntered = new ArrayList<SearchColumnDoubleField>();
        }
        return this.vendorCostEntered;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVendorName() {
        if (vendorName == null) {
            vendorName = new ArrayList<SearchColumnStringField>();
        }
        return this.vendorName;
    }

    /**
     * Gets the value of the vendorPriceCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPriceCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPriceCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVendorPriceCurrency() {
        if (vendorPriceCurrency == null) {
            vendorPriceCurrency = new ArrayList<SearchColumnStringField>();
        }
        return this.vendorPriceCurrency;
    }

    /**
     * Gets the value of the vendorSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVendorSchedule() {
        if (vendorSchedule == null) {
            vendorSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.vendorSchedule;
    }

    /**
     * Gets the value of the vendReturnVarianceAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendReturnVarianceAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendReturnVarianceAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVendReturnVarianceAccount() {
        if (vendReturnVarianceAccount == null) {
            vendReturnVarianceAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.vendReturnVarianceAccount;
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
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getWebSite() {
        if (webSite == null) {
            webSite = new ArrayList<SearchColumnSelectField>();
        }
        return this.webSite;
    }

    /**
     * Gets the value of the weight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getWeight() {
        if (weight == null) {
            weight = new ArrayList<SearchColumnDoubleField>();
        }
        return this.weight;
    }

    /**
     * Gets the value of the weightUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getWeightUnit() {
        if (weightUnit == null) {
            weightUnit = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.weightUnit;
    }

    /**
     * Gets the value of the wipAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wipAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWipAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getWipAcct() {
        if (wipAcct == null) {
            wipAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.wipAcct;
    }

    /**
     * Gets the value of the wipVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wipVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWipVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getWipVarianceAcct() {
        if (wipVarianceAcct == null) {
            wipVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.wipVarianceAcct;
    }

    /**
     * Gets the value of the yahooProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yahooProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYahooProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getYahooProductFeed() {
        if (yahooProductFeed == null) {
            yahooProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.yahooProductFeed;
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
