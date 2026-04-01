
package com.netsuite.webservices.platform.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchBooleanField;
import com.netsuite.webservices.platform.core.SearchCustomFieldList;
import com.netsuite.webservices.platform.core.SearchDateField;
import com.netsuite.webservices.platform.core.SearchDoubleField;
import com.netsuite.webservices.platform.core.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core.SearchLongField;
import com.netsuite.webservices.platform.core.SearchMultiSelectField;
import com.netsuite.webservices.platform.core.SearchRecordBasic;
import com.netsuite.webservices.platform.core.SearchStringField;


/**
 * <p>Java class for ItemSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="accountingBook" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookAmortization" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookRevRecSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="allowedShippingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="alternateDemandSourceItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="atpLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="atpMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="autoLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="autoPreferredStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="autoReorderPoint" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="availableToPartners" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="averageCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="backwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="binNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="binOnHandAvail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="binOnHandCount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="bomQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="buildEntireAssembly" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="buildTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="buyItNowPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="caption" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="component" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="componentOf" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="componentYield" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="copyDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemCorrelation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemCount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemLift" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemPurchaseRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="costAccountingStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="costCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="costEstimate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="costEstimateType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="costingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="countryOfManufacture" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="createJob" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="dateViewed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="daysBeforeExpiration" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="defaultReturnCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="defaultShippingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="deferRevRec" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="demandModifier" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="demandSource" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="demandTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="displayIneBayStore" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="distributionCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="distributionNetwork" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="dontShowPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="eBayItemDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="eBayItemSubtitle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="eBayItemTitle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="ebayRelistingOption" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="effectiveBomControl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="effectiveDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="effectiveRevision" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="endAuctionsWhenOutOfStock" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="excludeFromSitemap" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="featuredDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="feedDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="feedName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="fixedLotSize" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="forwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="fraudRisk" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="froogleProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="fxCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertAuthCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertEmail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertExpDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertFrom" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertMsg" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertOrigAmt" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="giftCertRecipient" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="imageUrl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="inventoryLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="invtClassification" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="invtCountInterval" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="isAvailable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isDropShipItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isFulfillable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isGcoCompliant" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isLotItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isOnline" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isPreferredVendor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isSerialItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isSpecialOrderItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isSpecialWorkOrderItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="issueProduct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="isTaxable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isVsoeBundle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="isWip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="itemUrl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="lastInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="lastPurchasePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="lastQuantityAvailableChange" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="leadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="listingDuration" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationAtpLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationAverageCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationBuildTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationCostAccountingStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationDefaultReturnCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationDemandSource" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationDemandTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locationFixedLotSize" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationInventoryCostTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationInvtClassification" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationInvtCountInterval" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locationLastInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="locationLeadTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locationNextInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="locationPeriodicLotSizeDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locationPeriodicLotSizeType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationPreferredStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityAvailable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityBackOrdered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityInTransit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityOnHand" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationQuantityOnOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationReorderPoint" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationRescheduleInDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locationRescheduleOutDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locationSafetyStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locationSupplyLotSizingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationSupplyTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locationSupplyType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="locationTotalValue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="locBackwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="locForwardConsumptionDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="manufactureraddr1" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTariff" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerTaxId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerZip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingChargeItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="matchBillToReceipt" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="matrix" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="matrixChild" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="metaTagHtml" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="minimumQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="mpn" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="multManufactureAddr" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="nexTagCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="nexTagProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="nextInvtCountDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="numActiveListings" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="numberAllowedDownloads" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="numCurrentlyListed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteRevision" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="offerSupport" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="onlineCustomerPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="onSpecial" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="otherVendor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="outOfStockBehavior" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="overallQuantityPricingType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="overheadType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="pageTitle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="periodicLotSizeDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="periodicLotSizeType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="preferenceCriterion" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="preferredBin" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="preferredLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevelDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="pricesIncludeTax" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="pricingGroup" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="primaryCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantityDiff" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="purchaseUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="quantityAvailable" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityBackOrdered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityCommitted" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnHand" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="receiptAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantityDiff" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="reorderMultiple" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="reorderPoint" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="rescheduleInDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="rescheduleOutDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="reservePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="revRecSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="roundUpAsComponent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="safetyStockLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="safetyStockLevelDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="salesDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="saleUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="sameAsPrimaryBookAmortization" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="sameAsPrimaryBookRevRec" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="scheduleBQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="searchKeywords" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="seasonalDemand" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="sellOnEBay" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="serialNumberLocation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shipIndividually" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="shipPackage" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shippingCarrier" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="shippingRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="shoppingDotComCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="shoppingProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="shopzillaCategoryId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="shopzillaProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="sitemapPriority" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="softDescriptor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="startingPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="stockDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="stockUnit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="storeDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="supplyLotSizingMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="supplyReplenishmentMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="supplyTimeFence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="supplyType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="taxCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="taxSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailUrl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="totalValue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="trackLandedCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="transferPrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="unitsType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="upcCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="urlComponent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="useBins" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="useComponentYield" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="useMarginalRates" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vendorCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="vendorCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="vendorCostEntered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="vendorName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="vendorPriceCurrency" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDeferral" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vsoeDelivered" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="vsoePermitDiscount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="vsoePrice" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="webSite" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="yahooProductFeed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
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
@XmlType(name = "ItemSearchBasic", propOrder = {
    "account",
    "accountingBook",
    "accountingBookAmortization",
    "accountingBookRevRecSchedule",
    "allowedShippingMethod",
    "alternateDemandSourceItem",
    "atpLeadTime",
    "atpMethod",
    "autoLeadTime",
    "autoPreferredStockLevel",
    "autoReorderPoint",
    "availableToPartners",
    "averageCost",
    "backwardConsumptionDays",
    "binNumber",
    "binOnHandAvail",
    "binOnHandCount",
    "bomQuantity",
    "buildEntireAssembly",
    "buildTime",
    "buyItNowPrice",
    "caption",
    "category",
    "clazz",
    "component",
    "componentOf",
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
    "dateViewed",
    "daysBeforeExpiration",
    "defaultReturnCost",
    "defaultShippingMethod",
    "deferRevRec",
    "demandModifier",
    "demandSource",
    "demandTimeFence",
    "department",
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
    "externalId",
    "externalIdString",
    "featuredDescription",
    "feedDescription",
    "feedName",
    "fixedLotSize",
    "forwardConsumptionDays",
    "fraudRisk",
    "froogleProductFeed",
    "fxCost",
    "giftCertAuthCode",
    "giftCertEmail",
    "giftCertExpDate",
    "giftCertFrom",
    "giftCertMsg",
    "giftCertOrigAmt",
    "giftCertRecipient",
    "imageUrl",
    "internalId",
    "internalIdNumber",
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
    "isPreferredVendor",
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
    "lastModifiedDate",
    "lastPurchasePrice",
    "lastQuantityAvailableChange",
    "leadTime",
    "listingDuration",
    "location",
    "locationAtpLeadTime",
    "locationAverageCost",
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
    "locationReorderPoint",
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
    "manufactureraddr1",
    "manufacturerCity",
    "manufacturerState",
    "manufacturerTariff",
    "manufacturerTaxId",
    "manufacturerZip",
    "manufacturingChargeItem",
    "matchBillToReceipt",
    "matrix",
    "matrixChild",
    "metaTagHtml",
    "minimumQuantity",
    "mpn",
    "multManufactureAddr",
    "nexTagCategory",
    "nexTagProductFeed",
    "nextInvtCountDate",
    "numActiveListings",
    "numberAllowedDownloads",
    "numCurrentlyListed",
    "obsoleteDate",
    "obsoleteRevision",
    "offerSupport",
    "onlineCustomerPrice",
    "onSpecial",
    "otherVendor",
    "outOfStockBehavior",
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
    "price",
    "pricesIncludeTax",
    "pricingGroup",
    "primaryCategory",
    "purchaseOrderAmount",
    "purchaseOrderQuantity",
    "purchaseOrderQuantityDiff",
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
    "reorderPoint",
    "rescheduleInDays",
    "rescheduleOutDays",
    "reservePrice",
    "revRecSchedule",
    "roundUpAsComponent",
    "safetyStockLevel",
    "safetyStockLevelDays",
    "salesDescription",
    "saleUnit",
    "sameAsPrimaryBookAmortization",
    "sameAsPrimaryBookRevRec",
    "scheduleBCode",
    "scheduleBNumber",
    "scheduleBQuantity",
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
    "subsidiary",
    "subType",
    "supplyLotSizingMethod",
    "supplyReplenishmentMethod",
    "supplyTimeFence",
    "supplyType",
    "taxCode",
    "taxSchedule",
    "thumbnailUrl",
    "totalValue",
    "trackLandedCost",
    "transferPrice",
    "type",
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
    "vsoeDeferral",
    "vsoeDelivered",
    "vsoePermitDiscount",
    "vsoePrice",
    "webSite",
    "weight",
    "yahooProductFeed",
    "customFieldList"
})
public class ItemSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField account;
    protected SearchMultiSelectField accountingBook;
    protected SearchMultiSelectField accountingBookAmortization;
    protected SearchMultiSelectField accountingBookRevRecSchedule;
    protected SearchMultiSelectField allowedShippingMethod;
    protected SearchMultiSelectField alternateDemandSourceItem;
    protected SearchDoubleField atpLeadTime;
    protected SearchEnumMultiSelectField atpMethod;
    protected SearchBooleanField autoLeadTime;
    protected SearchBooleanField autoPreferredStockLevel;
    protected SearchBooleanField autoReorderPoint;
    protected SearchBooleanField availableToPartners;
    protected SearchDoubleField averageCost;
    protected SearchLongField backwardConsumptionDays;
    protected SearchStringField binNumber;
    protected SearchDoubleField binOnHandAvail;
    protected SearchDoubleField binOnHandCount;
    protected SearchDoubleField bomQuantity;
    protected SearchBooleanField buildEntireAssembly;
    protected SearchDoubleField buildTime;
    protected SearchDoubleField buyItNowPrice;
    protected SearchStringField caption;
    protected SearchMultiSelectField category;
    @XmlElement(name = "class")
    protected SearchMultiSelectField clazz;
    protected SearchMultiSelectField component;
    protected SearchMultiSelectField componentOf;
    protected SearchDoubleField componentYield;
    protected SearchBooleanField copyDescription;
    protected SearchMultiSelectField correlatedItem;
    protected SearchDoubleField correlatedItemCorrelation;
    protected SearchLongField correlatedItemCount;
    protected SearchDoubleField correlatedItemLift;
    protected SearchDoubleField correlatedItemPurchaseRate;
    protected SearchDoubleField cost;
    protected SearchEnumMultiSelectField costAccountingStatus;
    protected SearchMultiSelectField costCategory;
    protected SearchDoubleField costEstimate;
    protected SearchEnumMultiSelectField costEstimateType;
    protected SearchEnumMultiSelectField costingMethod;
    protected SearchEnumMultiSelectField countryOfManufacture;
    protected SearchDateField created;
    protected SearchBooleanField createJob;
    protected SearchDateField dateViewed;
    protected SearchDoubleField daysBeforeExpiration;
    protected SearchDoubleField defaultReturnCost;
    protected SearchMultiSelectField defaultShippingMethod;
    protected SearchBooleanField deferRevRec;
    protected SearchDoubleField demandModifier;
    protected SearchEnumMultiSelectField demandSource;
    protected SearchLongField demandTimeFence;
    protected SearchMultiSelectField department;
    protected SearchBooleanField displayIneBayStore;
    protected SearchStringField displayName;
    protected SearchMultiSelectField distributionCategory;
    protected SearchMultiSelectField distributionNetwork;
    protected SearchBooleanField dontShowPrice;
    protected SearchStringField eBayItemDescription;
    protected SearchStringField eBayItemSubtitle;
    protected SearchStringField eBayItemTitle;
    protected SearchEnumMultiSelectField ebayRelistingOption;
    protected SearchEnumMultiSelectField effectiveBomControl;
    protected SearchDateField effectiveDate;
    protected SearchMultiSelectField effectiveRevision;
    protected SearchBooleanField endAuctionsWhenOutOfStock;
    protected SearchBooleanField excludeFromSitemap;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchStringField featuredDescription;
    protected SearchStringField feedDescription;
    protected SearchStringField feedName;
    protected SearchDoubleField fixedLotSize;
    protected SearchLongField forwardConsumptionDays;
    protected SearchEnumMultiSelectField fraudRisk;
    protected SearchBooleanField froogleProductFeed;
    protected SearchDoubleField fxCost;
    protected SearchStringField giftCertAuthCode;
    protected SearchStringField giftCertEmail;
    protected SearchDateField giftCertExpDate;
    protected SearchStringField giftCertFrom;
    protected SearchStringField giftCertMsg;
    protected SearchStringField giftCertOrigAmt;
    protected SearchStringField giftCertRecipient;
    protected SearchStringField imageUrl;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchMultiSelectField inventoryLocation;
    protected SearchEnumMultiSelectField invtClassification;
    protected SearchLongField invtCountInterval;
    protected SearchBooleanField isAvailable;
    protected SearchBooleanField isDropShipItem;
    protected SearchBooleanField isFulfillable;
    protected SearchBooleanField isGcoCompliant;
    protected SearchBooleanField isInactive;
    protected SearchBooleanField isLotItem;
    protected SearchBooleanField isOnline;
    protected SearchBooleanField isPreferredVendor;
    protected SearchBooleanField isSerialItem;
    protected SearchBooleanField isSpecialOrderItem;
    protected SearchBooleanField isSpecialWorkOrderItem;
    protected SearchMultiSelectField issueProduct;
    protected SearchBooleanField isTaxable;
    protected SearchBooleanField isVsoeBundle;
    protected SearchBooleanField isWip;
    protected SearchStringField itemId;
    protected SearchStringField itemUrl;
    protected SearchDateField lastInvtCountDate;
    protected SearchDateField lastModifiedDate;
    protected SearchDoubleField lastPurchasePrice;
    protected SearchDateField lastQuantityAvailableChange;
    protected SearchLongField leadTime;
    protected SearchEnumMultiSelectField listingDuration;
    protected SearchMultiSelectField location;
    protected SearchDoubleField locationAtpLeadTime;
    protected SearchDoubleField locationAverageCost;
    protected SearchDoubleField locationBuildTime;
    protected SearchDoubleField locationCost;
    protected SearchEnumMultiSelectField locationCostAccountingStatus;
    protected SearchDoubleField locationDefaultReturnCost;
    protected SearchEnumMultiSelectField locationDemandSource;
    protected SearchLongField locationDemandTimeFence;
    protected SearchDoubleField locationFixedLotSize;
    protected SearchMultiSelectField locationInventoryCostTemplate;
    protected SearchEnumMultiSelectField locationInvtClassification;
    protected SearchLongField locationInvtCountInterval;
    protected SearchDateField locationLastInvtCountDate;
    protected SearchLongField locationLeadTime;
    protected SearchDateField locationNextInvtCountDate;
    protected SearchLongField locationPeriodicLotSizeDays;
    protected SearchEnumMultiSelectField locationPeriodicLotSizeType;
    protected SearchDoubleField locationPreferredStockLevel;
    protected SearchDoubleField locationQuantityAvailable;
    protected SearchDoubleField locationQuantityBackOrdered;
    protected SearchDoubleField locationQuantityCommitted;
    protected SearchDoubleField locationQuantityInTransit;
    protected SearchDoubleField locationQuantityOnHand;
    protected SearchDoubleField locationQuantityOnOrder;
    protected SearchDoubleField locationReorderPoint;
    protected SearchLongField locationRescheduleInDays;
    protected SearchLongField locationRescheduleOutDays;
    protected SearchDoubleField locationSafetyStockLevel;
    protected SearchEnumMultiSelectField locationSupplyLotSizingMethod;
    protected SearchLongField locationSupplyTimeFence;
    protected SearchEnumMultiSelectField locationSupplyType;
    protected SearchDoubleField locationTotalValue;
    protected SearchLongField locBackwardConsumptionDays;
    protected SearchLongField locForwardConsumptionDays;
    protected SearchStringField manufacturer;
    protected SearchStringField manufactureraddr1;
    protected SearchStringField manufacturerCity;
    protected SearchStringField manufacturerState;
    protected SearchStringField manufacturerTariff;
    protected SearchStringField manufacturerTaxId;
    protected SearchStringField manufacturerZip;
    protected SearchBooleanField manufacturingChargeItem;
    protected SearchBooleanField matchBillToReceipt;
    protected SearchBooleanField matrix;
    protected SearchBooleanField matrixChild;
    protected SearchStringField metaTagHtml;
    protected SearchLongField minimumQuantity;
    protected SearchStringField mpn;
    protected SearchBooleanField multManufactureAddr;
    protected SearchStringField nexTagCategory;
    protected SearchBooleanField nexTagProductFeed;
    protected SearchDateField nextInvtCountDate;
    protected SearchLongField numActiveListings;
    protected SearchDoubleField numberAllowedDownloads;
    protected SearchLongField numCurrentlyListed;
    protected SearchDateField obsoleteDate;
    protected SearchMultiSelectField obsoleteRevision;
    protected SearchBooleanField offerSupport;
    protected SearchDoubleField onlineCustomerPrice;
    protected SearchBooleanField onSpecial;
    protected SearchMultiSelectField otherVendor;
    protected SearchMultiSelectField outOfStockBehavior;
    protected SearchEnumMultiSelectField overallQuantityPricingType;
    protected SearchEnumMultiSelectField overheadType;
    protected SearchStringField pageTitle;
    protected SearchMultiSelectField parent;
    protected SearchLongField periodicLotSizeDays;
    protected SearchEnumMultiSelectField periodicLotSizeType;
    protected SearchStringField preferenceCriterion;
    protected SearchBooleanField preferredBin;
    protected SearchMultiSelectField preferredLocation;
    protected SearchDoubleField preferredStockLevel;
    protected SearchLongField preferredStockLevelDays;
    protected SearchDoubleField price;
    protected SearchBooleanField pricesIncludeTax;
    protected SearchMultiSelectField pricingGroup;
    protected SearchLongField primaryCategory;
    protected SearchDoubleField purchaseOrderAmount;
    protected SearchDoubleField purchaseOrderQuantity;
    protected SearchDoubleField purchaseOrderQuantityDiff;
    protected SearchMultiSelectField purchaseUnit;
    protected SearchDoubleField quantityAvailable;
    protected SearchDoubleField quantityBackOrdered;
    protected SearchDoubleField quantityCommitted;
    protected SearchDoubleField quantityOnHand;
    protected SearchDoubleField quantityOnOrder;
    protected SearchMultiSelectField quantityPricingSchedule;
    protected SearchDoubleField receiptAmount;
    protected SearchDoubleField receiptQuantity;
    protected SearchDoubleField receiptQuantityDiff;
    protected SearchLongField reorderMultiple;
    protected SearchDoubleField reorderPoint;
    protected SearchLongField rescheduleInDays;
    protected SearchLongField rescheduleOutDays;
    protected SearchDoubleField reservePrice;
    protected SearchMultiSelectField revRecSchedule;
    protected SearchBooleanField roundUpAsComponent;
    protected SearchDoubleField safetyStockLevel;
    protected SearchLongField safetyStockLevelDays;
    protected SearchStringField salesDescription;
    protected SearchMultiSelectField saleUnit;
    protected SearchBooleanField sameAsPrimaryBookAmortization;
    protected SearchBooleanField sameAsPrimaryBookRevRec;
    protected SearchEnumMultiSelectField scheduleBCode;
    protected SearchStringField scheduleBNumber;
    protected SearchStringField scheduleBQuantity;
    protected SearchStringField searchKeywords;
    protected SearchBooleanField seasonalDemand;
    protected SearchBooleanField sellOnEBay;
    protected SearchStringField serialNumber;
    protected SearchMultiSelectField serialNumberLocation;
    protected SearchBooleanField shipIndividually;
    protected SearchMultiSelectField shipPackage;
    protected SearchEnumMultiSelectField shippingCarrier;
    protected SearchDoubleField shippingRate;
    protected SearchStringField shoppingDotComCategory;
    protected SearchBooleanField shoppingProductFeed;
    protected SearchLongField shopzillaCategoryId;
    protected SearchBooleanField shopzillaProductFeed;
    protected SearchEnumMultiSelectField sitemapPriority;
    protected SearchMultiSelectField softDescriptor;
    protected SearchDoubleField startingPrice;
    protected SearchStringField stockDescription;
    protected SearchMultiSelectField stockUnit;
    protected SearchStringField storeDescription;
    protected SearchMultiSelectField subsidiary;
    protected SearchEnumMultiSelectField subType;
    protected SearchEnumMultiSelectField supplyLotSizingMethod;
    protected SearchEnumMultiSelectField supplyReplenishmentMethod;
    protected SearchLongField supplyTimeFence;
    protected SearchEnumMultiSelectField supplyType;
    protected SearchMultiSelectField taxCode;
    protected SearchMultiSelectField taxSchedule;
    protected SearchStringField thumbnailUrl;
    protected SearchDoubleField totalValue;
    protected SearchBooleanField trackLandedCost;
    protected SearchDoubleField transferPrice;
    protected SearchEnumMultiSelectField type;
    protected SearchMultiSelectField unitsType;
    protected SearchStringField upcCode;
    protected SearchStringField urlComponent;
    protected SearchBooleanField useBins;
    protected SearchBooleanField useComponentYield;
    protected SearchBooleanField useMarginalRates;
    protected SearchMultiSelectField vendor;
    protected SearchStringField vendorCode;
    protected SearchDoubleField vendorCost;
    protected SearchDoubleField vendorCostEntered;
    protected SearchStringField vendorName;
    protected SearchMultiSelectField vendorPriceCurrency;
    protected SearchEnumMultiSelectField vsoeDeferral;
    protected SearchBooleanField vsoeDelivered;
    protected SearchEnumMultiSelectField vsoePermitDiscount;
    protected SearchDoubleField vsoePrice;
    protected SearchMultiSelectField webSite;
    protected SearchDoubleField weight;
    protected SearchBooleanField yahooProductFeed;
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
     * Gets the value of the accountingBook property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }

    /**
     * Sets the value of the accountingBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBook(SearchMultiSelectField value) {
        this.accountingBook = value;
    }

    /**
     * Gets the value of the accountingBookAmortization property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBookAmortization() {
        return accountingBookAmortization;
    }

    /**
     * Sets the value of the accountingBookAmortization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBookAmortization(SearchMultiSelectField value) {
        this.accountingBookAmortization = value;
    }

    /**
     * Gets the value of the accountingBookRevRecSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBookRevRecSchedule() {
        return accountingBookRevRecSchedule;
    }

    /**
     * Sets the value of the accountingBookRevRecSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBookRevRecSchedule(SearchMultiSelectField value) {
        this.accountingBookRevRecSchedule = value;
    }

    /**
     * Gets the value of the allowedShippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAllowedShippingMethod() {
        return allowedShippingMethod;
    }

    /**
     * Sets the value of the allowedShippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAllowedShippingMethod(SearchMultiSelectField value) {
        this.allowedShippingMethod = value;
    }

    /**
     * Gets the value of the alternateDemandSourceItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }

    /**
     * Sets the value of the alternateDemandSourceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAlternateDemandSourceItem(SearchMultiSelectField value) {
        this.alternateDemandSourceItem = value;
    }

    /**
     * Gets the value of the atpLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAtpLeadTime() {
        return atpLeadTime;
    }

    /**
     * Sets the value of the atpLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAtpLeadTime(SearchDoubleField value) {
        this.atpLeadTime = value;
    }

    /**
     * Gets the value of the atpMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAtpMethod() {
        return atpMethod;
    }

    /**
     * Sets the value of the atpMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAtpMethod(SearchEnumMultiSelectField value) {
        this.atpMethod = value;
    }

    /**
     * Gets the value of the autoLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoLeadTime() {
        return autoLeadTime;
    }

    /**
     * Sets the value of the autoLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoLeadTime(SearchBooleanField value) {
        this.autoLeadTime = value;
    }

    /**
     * Gets the value of the autoPreferredStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }

    /**
     * Sets the value of the autoPreferredStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoPreferredStockLevel(SearchBooleanField value) {
        this.autoPreferredStockLevel = value;
    }

    /**
     * Gets the value of the autoReorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoReorderPoint() {
        return autoReorderPoint;
    }

    /**
     * Sets the value of the autoReorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoReorderPoint(SearchBooleanField value) {
        this.autoReorderPoint = value;
    }

    /**
     * Gets the value of the availableToPartners property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAvailableToPartners() {
        return availableToPartners;
    }

    /**
     * Sets the value of the availableToPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAvailableToPartners(SearchBooleanField value) {
        this.availableToPartners = value;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAverageCost() {
        return averageCost;
    }

    /**
     * Sets the value of the averageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAverageCost(SearchDoubleField value) {
        this.averageCost = value;
    }

    /**
     * Gets the value of the backwardConsumptionDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getBackwardConsumptionDays() {
        return backwardConsumptionDays;
    }

    /**
     * Sets the value of the backwardConsumptionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setBackwardConsumptionDays(SearchLongField value) {
        this.backwardConsumptionDays = value;
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
     * Gets the value of the binOnHandAvail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBinOnHandAvail() {
        return binOnHandAvail;
    }

    /**
     * Sets the value of the binOnHandAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBinOnHandAvail(SearchDoubleField value) {
        this.binOnHandAvail = value;
    }

    /**
     * Gets the value of the binOnHandCount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBinOnHandCount() {
        return binOnHandCount;
    }

    /**
     * Sets the value of the binOnHandCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBinOnHandCount(SearchDoubleField value) {
        this.binOnHandCount = value;
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
     * Gets the value of the buildTime property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuildTime() {
        return buildTime;
    }

    /**
     * Sets the value of the buildTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuildTime(SearchDoubleField value) {
        this.buildTime = value;
    }

    /**
     * Gets the value of the buyItNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuyItNowPrice() {
        return buyItNowPrice;
    }

    /**
     * Sets the value of the buyItNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuyItNowPrice(SearchDoubleField value) {
        this.buyItNowPrice = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCaption(SearchStringField value) {
        this.caption = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCategory(SearchMultiSelectField value) {
        this.category = value;
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
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setComponent(SearchMultiSelectField value) {
        this.component = value;
    }

    /**
     * Gets the value of the componentOf property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getComponentOf() {
        return componentOf;
    }

    /**
     * Sets the value of the componentOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setComponentOf(SearchMultiSelectField value) {
        this.componentOf = value;
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
     * Gets the value of the copyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCopyDescription() {
        return copyDescription;
    }

    /**
     * Sets the value of the copyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCopyDescription(SearchBooleanField value) {
        this.copyDescription = value;
    }

    /**
     * Gets the value of the correlatedItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCorrelatedItem() {
        return correlatedItem;
    }

    /**
     * Sets the value of the correlatedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCorrelatedItem(SearchMultiSelectField value) {
        this.correlatedItem = value;
    }

    /**
     * Gets the value of the correlatedItemCorrelation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCorrelatedItemCorrelation() {
        return correlatedItemCorrelation;
    }

    /**
     * Sets the value of the correlatedItemCorrelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCorrelatedItemCorrelation(SearchDoubleField value) {
        this.correlatedItemCorrelation = value;
    }

    /**
     * Gets the value of the correlatedItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getCorrelatedItemCount() {
        return correlatedItemCount;
    }

    /**
     * Sets the value of the correlatedItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setCorrelatedItemCount(SearchLongField value) {
        this.correlatedItemCount = value;
    }

    /**
     * Gets the value of the correlatedItemLift property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCorrelatedItemLift() {
        return correlatedItemLift;
    }

    /**
     * Sets the value of the correlatedItemLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCorrelatedItemLift(SearchDoubleField value) {
        this.correlatedItemLift = value;
    }

    /**
     * Gets the value of the correlatedItemPurchaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCorrelatedItemPurchaseRate() {
        return correlatedItemPurchaseRate;
    }

    /**
     * Sets the value of the correlatedItemPurchaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCorrelatedItemPurchaseRate(SearchDoubleField value) {
        this.correlatedItemPurchaseRate = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCost(SearchDoubleField value) {
        this.cost = value;
    }

    /**
     * Gets the value of the costAccountingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCostAccountingStatus() {
        return costAccountingStatus;
    }

    /**
     * Sets the value of the costAccountingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCostAccountingStatus(SearchEnumMultiSelectField value) {
        this.costAccountingStatus = value;
    }

    /**
     * Gets the value of the costCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCostCategory() {
        return costCategory;
    }

    /**
     * Sets the value of the costCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCostCategory(SearchMultiSelectField value) {
        this.costCategory = value;
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
     * Gets the value of the costingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCostingMethod() {
        return costingMethod;
    }

    /**
     * Sets the value of the costingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCostingMethod(SearchEnumMultiSelectField value) {
        this.costingMethod = value;
    }

    /**
     * Gets the value of the countryOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCountryOfManufacture() {
        return countryOfManufacture;
    }

    /**
     * Sets the value of the countryOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCountryOfManufacture(SearchEnumMultiSelectField value) {
        this.countryOfManufacture = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCreated(SearchDateField value) {
        this.created = value;
    }

    /**
     * Gets the value of the createJob property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCreateJob() {
        return createJob;
    }

    /**
     * Sets the value of the createJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCreateJob(SearchBooleanField value) {
        this.createJob = value;
    }

    /**
     * Gets the value of the dateViewed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateViewed() {
        return dateViewed;
    }

    /**
     * Sets the value of the dateViewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateViewed(SearchDateField value) {
        this.dateViewed = value;
    }

    /**
     * Gets the value of the daysBeforeExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }

    /**
     * Sets the value of the daysBeforeExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDaysBeforeExpiration(SearchDoubleField value) {
        this.daysBeforeExpiration = value;
    }

    /**
     * Gets the value of the defaultReturnCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDefaultReturnCost() {
        return defaultReturnCost;
    }

    /**
     * Sets the value of the defaultReturnCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDefaultReturnCost(SearchDoubleField value) {
        this.defaultReturnCost = value;
    }

    /**
     * Gets the value of the defaultShippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDefaultShippingMethod() {
        return defaultShippingMethod;
    }

    /**
     * Sets the value of the defaultShippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDefaultShippingMethod(SearchMultiSelectField value) {
        this.defaultShippingMethod = value;
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
     * Gets the value of the demandModifier property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDemandModifier() {
        return demandModifier;
    }

    /**
     * Sets the value of the demandModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDemandModifier(SearchDoubleField value) {
        this.demandModifier = value;
    }

    /**
     * Gets the value of the demandSource property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getDemandSource() {
        return demandSource;
    }

    /**
     * Sets the value of the demandSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setDemandSource(SearchEnumMultiSelectField value) {
        this.demandSource = value;
    }

    /**
     * Gets the value of the demandTimeFence property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDemandTimeFence() {
        return demandTimeFence;
    }

    /**
     * Sets the value of the demandTimeFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDemandTimeFence(SearchLongField value) {
        this.demandTimeFence = value;
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
     * Gets the value of the displayIneBayStore property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDisplayIneBayStore() {
        return displayIneBayStore;
    }

    /**
     * Sets the value of the displayIneBayStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDisplayIneBayStore(SearchBooleanField value) {
        this.displayIneBayStore = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setDisplayName(SearchStringField value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the distributionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDistributionCategory() {
        return distributionCategory;
    }

    /**
     * Sets the value of the distributionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDistributionCategory(SearchMultiSelectField value) {
        this.distributionCategory = value;
    }

    /**
     * Gets the value of the distributionNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDistributionNetwork() {
        return distributionNetwork;
    }

    /**
     * Sets the value of the distributionNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDistributionNetwork(SearchMultiSelectField value) {
        this.distributionNetwork = value;
    }

    /**
     * Gets the value of the dontShowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDontShowPrice() {
        return dontShowPrice;
    }

    /**
     * Sets the value of the dontShowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDontShowPrice(SearchBooleanField value) {
        this.dontShowPrice = value;
    }

    /**
     * Gets the value of the eBayItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEBayItemDescription() {
        return eBayItemDescription;
    }

    /**
     * Sets the value of the eBayItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEBayItemDescription(SearchStringField value) {
        this.eBayItemDescription = value;
    }

    /**
     * Gets the value of the eBayItemSubtitle property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEBayItemSubtitle() {
        return eBayItemSubtitle;
    }

    /**
     * Sets the value of the eBayItemSubtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEBayItemSubtitle(SearchStringField value) {
        this.eBayItemSubtitle = value;
    }

    /**
     * Gets the value of the eBayItemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEBayItemTitle() {
        return eBayItemTitle;
    }

    /**
     * Sets the value of the eBayItemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEBayItemTitle(SearchStringField value) {
        this.eBayItemTitle = value;
    }

    /**
     * Gets the value of the ebayRelistingOption property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getEbayRelistingOption() {
        return ebayRelistingOption;
    }

    /**
     * Sets the value of the ebayRelistingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setEbayRelistingOption(SearchEnumMultiSelectField value) {
        this.ebayRelistingOption = value;
    }

    /**
     * Gets the value of the effectiveBomControl property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getEffectiveBomControl() {
        return effectiveBomControl;
    }

    /**
     * Sets the value of the effectiveBomControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setEffectiveBomControl(SearchEnumMultiSelectField value) {
        this.effectiveBomControl = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEffectiveDate(SearchDateField value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the effectiveRevision property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEffectiveRevision() {
        return effectiveRevision;
    }

    /**
     * Sets the value of the effectiveRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEffectiveRevision(SearchMultiSelectField value) {
        this.effectiveRevision = value;
    }

    /**
     * Gets the value of the endAuctionsWhenOutOfStock property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getEndAuctionsWhenOutOfStock() {
        return endAuctionsWhenOutOfStock;
    }

    /**
     * Sets the value of the endAuctionsWhenOutOfStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setEndAuctionsWhenOutOfStock(SearchBooleanField value) {
        this.endAuctionsWhenOutOfStock = value;
    }

    /**
     * Gets the value of the excludeFromSitemap property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExcludeFromSitemap() {
        return excludeFromSitemap;
    }

    /**
     * Sets the value of the excludeFromSitemap property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExcludeFromSitemap(SearchBooleanField value) {
        this.excludeFromSitemap = value;
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
     * Gets the value of the featuredDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFeaturedDescription() {
        return featuredDescription;
    }

    /**
     * Sets the value of the featuredDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFeaturedDescription(SearchStringField value) {
        this.featuredDescription = value;
    }

    /**
     * Gets the value of the feedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFeedDescription() {
        return feedDescription;
    }

    /**
     * Sets the value of the feedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFeedDescription(SearchStringField value) {
        this.feedDescription = value;
    }

    /**
     * Gets the value of the feedName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFeedName() {
        return feedName;
    }

    /**
     * Sets the value of the feedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFeedName(SearchStringField value) {
        this.feedName = value;
    }

    /**
     * Gets the value of the fixedLotSize property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFixedLotSize() {
        return fixedLotSize;
    }

    /**
     * Sets the value of the fixedLotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFixedLotSize(SearchDoubleField value) {
        this.fixedLotSize = value;
    }

    /**
     * Gets the value of the forwardConsumptionDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getForwardConsumptionDays() {
        return forwardConsumptionDays;
    }

    /**
     * Sets the value of the forwardConsumptionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setForwardConsumptionDays(SearchLongField value) {
        this.forwardConsumptionDays = value;
    }

    /**
     * Gets the value of the fraudRisk property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getFraudRisk() {
        return fraudRisk;
    }

    /**
     * Sets the value of the fraudRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setFraudRisk(SearchEnumMultiSelectField value) {
        this.fraudRisk = value;
    }

    /**
     * Gets the value of the froogleProductFeed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFroogleProductFeed() {
        return froogleProductFeed;
    }

    /**
     * Sets the value of the froogleProductFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFroogleProductFeed(SearchBooleanField value) {
        this.froogleProductFeed = value;
    }

    /**
     * Gets the value of the fxCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxCost() {
        return fxCost;
    }

    /**
     * Sets the value of the fxCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxCost(SearchDoubleField value) {
        this.fxCost = value;
    }

    /**
     * Gets the value of the giftCertAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertAuthCode() {
        return giftCertAuthCode;
    }

    /**
     * Sets the value of the giftCertAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertAuthCode(SearchStringField value) {
        this.giftCertAuthCode = value;
    }

    /**
     * Gets the value of the giftCertEmail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertEmail() {
        return giftCertEmail;
    }

    /**
     * Sets the value of the giftCertEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertEmail(SearchStringField value) {
        this.giftCertEmail = value;
    }

    /**
     * Gets the value of the giftCertExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getGiftCertExpDate() {
        return giftCertExpDate;
    }

    /**
     * Sets the value of the giftCertExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setGiftCertExpDate(SearchDateField value) {
        this.giftCertExpDate = value;
    }

    /**
     * Gets the value of the giftCertFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertFrom() {
        return giftCertFrom;
    }

    /**
     * Sets the value of the giftCertFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertFrom(SearchStringField value) {
        this.giftCertFrom = value;
    }

    /**
     * Gets the value of the giftCertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertMsg() {
        return giftCertMsg;
    }

    /**
     * Sets the value of the giftCertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertMsg(SearchStringField value) {
        this.giftCertMsg = value;
    }

    /**
     * Gets the value of the giftCertOrigAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertOrigAmt() {
        return giftCertOrigAmt;
    }

    /**
     * Sets the value of the giftCertOrigAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertOrigAmt(SearchStringField value) {
        this.giftCertOrigAmt = value;
    }

    /**
     * Gets the value of the giftCertRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertRecipient() {
        return giftCertRecipient;
    }

    /**
     * Sets the value of the giftCertRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertRecipient(SearchStringField value) {
        this.giftCertRecipient = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setImageUrl(SearchStringField value) {
        this.imageUrl = value;
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
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInventoryLocation(SearchMultiSelectField value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the invtClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getInvtClassification() {
        return invtClassification;
    }

    /**
     * Sets the value of the invtClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setInvtClassification(SearchEnumMultiSelectField value) {
        this.invtClassification = value;
    }

    /**
     * Gets the value of the invtCountInterval property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInvtCountInterval() {
        return invtCountInterval;
    }

    /**
     * Sets the value of the invtCountInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInvtCountInterval(SearchLongField value) {
        this.invtCountInterval = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsAvailable(SearchBooleanField value) {
        this.isAvailable = value;
    }

    /**
     * Gets the value of the isDropShipItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDropShipItem() {
        return isDropShipItem;
    }

    /**
     * Sets the value of the isDropShipItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDropShipItem(SearchBooleanField value) {
        this.isDropShipItem = value;
    }

    /**
     * Gets the value of the isFulfillable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsFulfillable() {
        return isFulfillable;
    }

    /**
     * Sets the value of the isFulfillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsFulfillable(SearchBooleanField value) {
        this.isFulfillable = value;
    }

    /**
     * Gets the value of the isGcoCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoCompliant() {
        return isGcoCompliant;
    }

    /**
     * Sets the value of the isGcoCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoCompliant(SearchBooleanField value) {
        this.isGcoCompliant = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the isLotItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsLotItem() {
        return isLotItem;
    }

    /**
     * Sets the value of the isLotItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsLotItem(SearchBooleanField value) {
        this.isLotItem = value;
    }

    /**
     * Gets the value of the isOnline property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsOnline() {
        return isOnline;
    }

    /**
     * Sets the value of the isOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsOnline(SearchBooleanField value) {
        this.isOnline = value;
    }

    /**
     * Gets the value of the isPreferredVendor property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPreferredVendor() {
        return isPreferredVendor;
    }

    /**
     * Sets the value of the isPreferredVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPreferredVendor(SearchBooleanField value) {
        this.isPreferredVendor = value;
    }

    /**
     * Gets the value of the isSerialItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsSerialItem() {
        return isSerialItem;
    }

    /**
     * Sets the value of the isSerialItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsSerialItem(SearchBooleanField value) {
        this.isSerialItem = value;
    }

    /**
     * Gets the value of the isSpecialOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }

    /**
     * Sets the value of the isSpecialOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsSpecialOrderItem(SearchBooleanField value) {
        this.isSpecialOrderItem = value;
    }

    /**
     * Gets the value of the isSpecialWorkOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsSpecialWorkOrderItem() {
        return isSpecialWorkOrderItem;
    }

    /**
     * Sets the value of the isSpecialWorkOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsSpecialWorkOrderItem(SearchBooleanField value) {
        this.isSpecialWorkOrderItem = value;
    }

    /**
     * Gets the value of the issueProduct property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIssueProduct() {
        return issueProduct;
    }

    /**
     * Sets the value of the issueProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIssueProduct(SearchMultiSelectField value) {
        this.issueProduct = value;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsTaxable() {
        return isTaxable;
    }

    /**
     * Sets the value of the isTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsTaxable(SearchBooleanField value) {
        this.isTaxable = value;
    }

    /**
     * Gets the value of the isVsoeBundle property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsVsoeBundle() {
        return isVsoeBundle;
    }

    /**
     * Sets the value of the isVsoeBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsVsoeBundle(SearchBooleanField value) {
        this.isVsoeBundle = value;
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
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setItemId(SearchStringField value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemUrl property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getItemUrl() {
        return itemUrl;
    }

    /**
     * Sets the value of the itemUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setItemUrl(SearchStringField value) {
        this.itemUrl = value;
    }

    /**
     * Gets the value of the lastInvtCountDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastInvtCountDate() {
        return lastInvtCountDate;
    }

    /**
     * Sets the value of the lastInvtCountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastInvtCountDate(SearchDateField value) {
        this.lastInvtCountDate = value;
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
     * Gets the value of the lastPurchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLastPurchasePrice() {
        return lastPurchasePrice;
    }

    /**
     * Sets the value of the lastPurchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLastPurchasePrice(SearchDoubleField value) {
        this.lastPurchasePrice = value;
    }

    /**
     * Gets the value of the lastQuantityAvailableChange property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastQuantityAvailableChange() {
        return lastQuantityAvailableChange;
    }

    /**
     * Sets the value of the lastQuantityAvailableChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastQuantityAvailableChange(SearchDateField value) {
        this.lastQuantityAvailableChange = value;
    }

    /**
     * Gets the value of the leadTime property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLeadTime() {
        return leadTime;
    }

    /**
     * Sets the value of the leadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLeadTime(SearchLongField value) {
        this.leadTime = value;
    }

    /**
     * Gets the value of the listingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getListingDuration() {
        return listingDuration;
    }

    /**
     * Sets the value of the listingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setListingDuration(SearchEnumMultiSelectField value) {
        this.listingDuration = value;
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
     * Gets the value of the locationAtpLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationAtpLeadTime() {
        return locationAtpLeadTime;
    }

    /**
     * Sets the value of the locationAtpLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationAtpLeadTime(SearchDoubleField value) {
        this.locationAtpLeadTime = value;
    }

    /**
     * Gets the value of the locationAverageCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationAverageCost() {
        return locationAverageCost;
    }

    /**
     * Sets the value of the locationAverageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationAverageCost(SearchDoubleField value) {
        this.locationAverageCost = value;
    }

    /**
     * Gets the value of the locationBuildTime property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationBuildTime() {
        return locationBuildTime;
    }

    /**
     * Sets the value of the locationBuildTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationBuildTime(SearchDoubleField value) {
        this.locationBuildTime = value;
    }

    /**
     * Gets the value of the locationCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationCost() {
        return locationCost;
    }

    /**
     * Sets the value of the locationCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationCost(SearchDoubleField value) {
        this.locationCost = value;
    }

    /**
     * Gets the value of the locationCostAccountingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationCostAccountingStatus() {
        return locationCostAccountingStatus;
    }

    /**
     * Sets the value of the locationCostAccountingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationCostAccountingStatus(SearchEnumMultiSelectField value) {
        this.locationCostAccountingStatus = value;
    }

    /**
     * Gets the value of the locationDefaultReturnCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationDefaultReturnCost() {
        return locationDefaultReturnCost;
    }

    /**
     * Sets the value of the locationDefaultReturnCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationDefaultReturnCost(SearchDoubleField value) {
        this.locationDefaultReturnCost = value;
    }

    /**
     * Gets the value of the locationDemandSource property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationDemandSource() {
        return locationDemandSource;
    }

    /**
     * Sets the value of the locationDemandSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationDemandSource(SearchEnumMultiSelectField value) {
        this.locationDemandSource = value;
    }

    /**
     * Gets the value of the locationDemandTimeFence property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationDemandTimeFence() {
        return locationDemandTimeFence;
    }

    /**
     * Sets the value of the locationDemandTimeFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationDemandTimeFence(SearchLongField value) {
        this.locationDemandTimeFence = value;
    }

    /**
     * Gets the value of the locationFixedLotSize property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationFixedLotSize() {
        return locationFixedLotSize;
    }

    /**
     * Sets the value of the locationFixedLotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationFixedLotSize(SearchDoubleField value) {
        this.locationFixedLotSize = value;
    }

    /**
     * Gets the value of the locationInventoryCostTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocationInventoryCostTemplate() {
        return locationInventoryCostTemplate;
    }

    /**
     * Sets the value of the locationInventoryCostTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocationInventoryCostTemplate(SearchMultiSelectField value) {
        this.locationInventoryCostTemplate = value;
    }

    /**
     * Gets the value of the locationInvtClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationInvtClassification() {
        return locationInvtClassification;
    }

    /**
     * Sets the value of the locationInvtClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationInvtClassification(SearchEnumMultiSelectField value) {
        this.locationInvtClassification = value;
    }

    /**
     * Gets the value of the locationInvtCountInterval property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationInvtCountInterval() {
        return locationInvtCountInterval;
    }

    /**
     * Sets the value of the locationInvtCountInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationInvtCountInterval(SearchLongField value) {
        this.locationInvtCountInterval = value;
    }

    /**
     * Gets the value of the locationLastInvtCountDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLocationLastInvtCountDate() {
        return locationLastInvtCountDate;
    }

    /**
     * Sets the value of the locationLastInvtCountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLocationLastInvtCountDate(SearchDateField value) {
        this.locationLastInvtCountDate = value;
    }

    /**
     * Gets the value of the locationLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationLeadTime() {
        return locationLeadTime;
    }

    /**
     * Sets the value of the locationLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationLeadTime(SearchLongField value) {
        this.locationLeadTime = value;
    }

    /**
     * Gets the value of the locationNextInvtCountDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLocationNextInvtCountDate() {
        return locationNextInvtCountDate;
    }

    /**
     * Sets the value of the locationNextInvtCountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLocationNextInvtCountDate(SearchDateField value) {
        this.locationNextInvtCountDate = value;
    }

    /**
     * Gets the value of the locationPeriodicLotSizeDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationPeriodicLotSizeDays() {
        return locationPeriodicLotSizeDays;
    }

    /**
     * Sets the value of the locationPeriodicLotSizeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationPeriodicLotSizeDays(SearchLongField value) {
        this.locationPeriodicLotSizeDays = value;
    }

    /**
     * Gets the value of the locationPeriodicLotSizeType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationPeriodicLotSizeType() {
        return locationPeriodicLotSizeType;
    }

    /**
     * Sets the value of the locationPeriodicLotSizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationPeriodicLotSizeType(SearchEnumMultiSelectField value) {
        this.locationPeriodicLotSizeType = value;
    }

    /**
     * Gets the value of the locationPreferredStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationPreferredStockLevel() {
        return locationPreferredStockLevel;
    }

    /**
     * Sets the value of the locationPreferredStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationPreferredStockLevel(SearchDoubleField value) {
        this.locationPreferredStockLevel = value;
    }

    /**
     * Gets the value of the locationQuantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityAvailable() {
        return locationQuantityAvailable;
    }

    /**
     * Sets the value of the locationQuantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityAvailable(SearchDoubleField value) {
        this.locationQuantityAvailable = value;
    }

    /**
     * Gets the value of the locationQuantityBackOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityBackOrdered() {
        return locationQuantityBackOrdered;
    }

    /**
     * Sets the value of the locationQuantityBackOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityBackOrdered(SearchDoubleField value) {
        this.locationQuantityBackOrdered = value;
    }

    /**
     * Gets the value of the locationQuantityCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityCommitted() {
        return locationQuantityCommitted;
    }

    /**
     * Sets the value of the locationQuantityCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityCommitted(SearchDoubleField value) {
        this.locationQuantityCommitted = value;
    }

    /**
     * Gets the value of the locationQuantityInTransit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityInTransit() {
        return locationQuantityInTransit;
    }

    /**
     * Sets the value of the locationQuantityInTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityInTransit(SearchDoubleField value) {
        this.locationQuantityInTransit = value;
    }

    /**
     * Gets the value of the locationQuantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityOnHand() {
        return locationQuantityOnHand;
    }

    /**
     * Sets the value of the locationQuantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityOnHand(SearchDoubleField value) {
        this.locationQuantityOnHand = value;
    }

    /**
     * Gets the value of the locationQuantityOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityOnOrder() {
        return locationQuantityOnOrder;
    }

    /**
     * Sets the value of the locationQuantityOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityOnOrder(SearchDoubleField value) {
        this.locationQuantityOnOrder = value;
    }

    /**
     * Gets the value of the locationReorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationReorderPoint() {
        return locationReorderPoint;
    }

    /**
     * Sets the value of the locationReorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationReorderPoint(SearchDoubleField value) {
        this.locationReorderPoint = value;
    }

    /**
     * Gets the value of the locationRescheduleInDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationRescheduleInDays() {
        return locationRescheduleInDays;
    }

    /**
     * Sets the value of the locationRescheduleInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationRescheduleInDays(SearchLongField value) {
        this.locationRescheduleInDays = value;
    }

    /**
     * Gets the value of the locationRescheduleOutDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationRescheduleOutDays() {
        return locationRescheduleOutDays;
    }

    /**
     * Sets the value of the locationRescheduleOutDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationRescheduleOutDays(SearchLongField value) {
        this.locationRescheduleOutDays = value;
    }

    /**
     * Gets the value of the locationSafetyStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationSafetyStockLevel() {
        return locationSafetyStockLevel;
    }

    /**
     * Sets the value of the locationSafetyStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationSafetyStockLevel(SearchDoubleField value) {
        this.locationSafetyStockLevel = value;
    }

    /**
     * Gets the value of the locationSupplyLotSizingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationSupplyLotSizingMethod() {
        return locationSupplyLotSizingMethod;
    }

    /**
     * Sets the value of the locationSupplyLotSizingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationSupplyLotSizingMethod(SearchEnumMultiSelectField value) {
        this.locationSupplyLotSizingMethod = value;
    }

    /**
     * Gets the value of the locationSupplyTimeFence property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationSupplyTimeFence() {
        return locationSupplyTimeFence;
    }

    /**
     * Sets the value of the locationSupplyTimeFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationSupplyTimeFence(SearchLongField value) {
        this.locationSupplyTimeFence = value;
    }

    /**
     * Gets the value of the locationSupplyType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationSupplyType() {
        return locationSupplyType;
    }

    /**
     * Sets the value of the locationSupplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationSupplyType(SearchEnumMultiSelectField value) {
        this.locationSupplyType = value;
    }

    /**
     * Gets the value of the locationTotalValue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationTotalValue() {
        return locationTotalValue;
    }

    /**
     * Sets the value of the locationTotalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationTotalValue(SearchDoubleField value) {
        this.locationTotalValue = value;
    }

    /**
     * Gets the value of the locBackwardConsumptionDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocBackwardConsumptionDays() {
        return locBackwardConsumptionDays;
    }

    /**
     * Sets the value of the locBackwardConsumptionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocBackwardConsumptionDays(SearchLongField value) {
        this.locBackwardConsumptionDays = value;
    }

    /**
     * Gets the value of the locForwardConsumptionDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocForwardConsumptionDays() {
        return locForwardConsumptionDays;
    }

    /**
     * Sets the value of the locForwardConsumptionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocForwardConsumptionDays(SearchLongField value) {
        this.locForwardConsumptionDays = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturer(SearchStringField value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the manufactureraddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufactureraddr1() {
        return manufactureraddr1;
    }

    /**
     * Sets the value of the manufactureraddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufactureraddr1(SearchStringField value) {
        this.manufactureraddr1 = value;
    }

    /**
     * Gets the value of the manufacturerCity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerCity() {
        return manufacturerCity;
    }

    /**
     * Sets the value of the manufacturerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerCity(SearchStringField value) {
        this.manufacturerCity = value;
    }

    /**
     * Gets the value of the manufacturerState property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerState() {
        return manufacturerState;
    }

    /**
     * Sets the value of the manufacturerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerState(SearchStringField value) {
        this.manufacturerState = value;
    }

    /**
     * Gets the value of the manufacturerTariff property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerTariff() {
        return manufacturerTariff;
    }

    /**
     * Sets the value of the manufacturerTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerTariff(SearchStringField value) {
        this.manufacturerTariff = value;
    }

    /**
     * Gets the value of the manufacturerTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerTaxId() {
        return manufacturerTaxId;
    }

    /**
     * Sets the value of the manufacturerTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerTaxId(SearchStringField value) {
        this.manufacturerTaxId = value;
    }

    /**
     * Gets the value of the manufacturerZip property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerZip() {
        return manufacturerZip;
    }

    /**
     * Sets the value of the manufacturerZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerZip(SearchStringField value) {
        this.manufacturerZip = value;
    }

    /**
     * Gets the value of the manufacturingChargeItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getManufacturingChargeItem() {
        return manufacturingChargeItem;
    }

    /**
     * Sets the value of the manufacturingChargeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setManufacturingChargeItem(SearchBooleanField value) {
        this.manufacturingChargeItem = value;
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
     * Gets the value of the matrix property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMatrix() {
        return matrix;
    }

    /**
     * Sets the value of the matrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMatrix(SearchBooleanField value) {
        this.matrix = value;
    }

    /**
     * Gets the value of the matrixChild property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMatrixChild() {
        return matrixChild;
    }

    /**
     * Sets the value of the matrixChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMatrixChild(SearchBooleanField value) {
        this.matrixChild = value;
    }

    /**
     * Gets the value of the metaTagHtml property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMetaTagHtml() {
        return metaTagHtml;
    }

    /**
     * Sets the value of the metaTagHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMetaTagHtml(SearchStringField value) {
        this.metaTagHtml = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setMinimumQuantity(SearchLongField value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMpn() {
        return mpn;
    }

    /**
     * Sets the value of the mpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMpn(SearchStringField value) {
        this.mpn = value;
    }

    /**
     * Gets the value of the multManufactureAddr property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMultManufactureAddr() {
        return multManufactureAddr;
    }

    /**
     * Sets the value of the multManufactureAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMultManufactureAddr(SearchBooleanField value) {
        this.multManufactureAddr = value;
    }

    /**
     * Gets the value of the nexTagCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getNexTagCategory() {
        return nexTagCategory;
    }

    /**
     * Sets the value of the nexTagCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setNexTagCategory(SearchStringField value) {
        this.nexTagCategory = value;
    }

    /**
     * Gets the value of the nexTagProductFeed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getNexTagProductFeed() {
        return nexTagProductFeed;
    }

    /**
     * Sets the value of the nexTagProductFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setNexTagProductFeed(SearchBooleanField value) {
        this.nexTagProductFeed = value;
    }

    /**
     * Gets the value of the nextInvtCountDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getNextInvtCountDate() {
        return nextInvtCountDate;
    }

    /**
     * Sets the value of the nextInvtCountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setNextInvtCountDate(SearchDateField value) {
        this.nextInvtCountDate = value;
    }

    /**
     * Gets the value of the numActiveListings property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getNumActiveListings() {
        return numActiveListings;
    }

    /**
     * Sets the value of the numActiveListings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setNumActiveListings(SearchLongField value) {
        this.numActiveListings = value;
    }

    /**
     * Gets the value of the numberAllowedDownloads property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getNumberAllowedDownloads() {
        return numberAllowedDownloads;
    }

    /**
     * Sets the value of the numberAllowedDownloads property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setNumberAllowedDownloads(SearchDoubleField value) {
        this.numberAllowedDownloads = value;
    }

    /**
     * Gets the value of the numCurrentlyListed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getNumCurrentlyListed() {
        return numCurrentlyListed;
    }

    /**
     * Sets the value of the numCurrentlyListed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setNumCurrentlyListed(SearchLongField value) {
        this.numCurrentlyListed = value;
    }

    /**
     * Gets the value of the obsoleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getObsoleteDate() {
        return obsoleteDate;
    }

    /**
     * Sets the value of the obsoleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setObsoleteDate(SearchDateField value) {
        this.obsoleteDate = value;
    }

    /**
     * Gets the value of the obsoleteRevision property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getObsoleteRevision() {
        return obsoleteRevision;
    }

    /**
     * Sets the value of the obsoleteRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setObsoleteRevision(SearchMultiSelectField value) {
        this.obsoleteRevision = value;
    }

    /**
     * Gets the value of the offerSupport property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getOfferSupport() {
        return offerSupport;
    }

    /**
     * Sets the value of the offerSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setOfferSupport(SearchBooleanField value) {
        this.offerSupport = value;
    }

    /**
     * Gets the value of the onlineCustomerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOnlineCustomerPrice() {
        return onlineCustomerPrice;
    }

    /**
     * Sets the value of the onlineCustomerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOnlineCustomerPrice(SearchDoubleField value) {
        this.onlineCustomerPrice = value;
    }

    /**
     * Gets the value of the onSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getOnSpecial() {
        return onSpecial;
    }

    /**
     * Sets the value of the onSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setOnSpecial(SearchBooleanField value) {
        this.onSpecial = value;
    }

    /**
     * Gets the value of the otherVendor property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOtherVendor() {
        return otherVendor;
    }

    /**
     * Sets the value of the otherVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOtherVendor(SearchMultiSelectField value) {
        this.otherVendor = value;
    }

    /**
     * Gets the value of the outOfStockBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOutOfStockBehavior() {
        return outOfStockBehavior;
    }

    /**
     * Sets the value of the outOfStockBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOutOfStockBehavior(SearchMultiSelectField value) {
        this.outOfStockBehavior = value;
    }

    /**
     * Gets the value of the overallQuantityPricingType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }

    /**
     * Sets the value of the overallQuantityPricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setOverallQuantityPricingType(SearchEnumMultiSelectField value) {
        this.overallQuantityPricingType = value;
    }

    /**
     * Gets the value of the overheadType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getOverheadType() {
        return overheadType;
    }

    /**
     * Sets the value of the overheadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setOverheadType(SearchEnumMultiSelectField value) {
        this.overheadType = value;
    }

    /**
     * Gets the value of the pageTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPageTitle() {
        return pageTitle;
    }

    /**
     * Sets the value of the pageTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPageTitle(SearchStringField value) {
        this.pageTitle = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParent(SearchMultiSelectField value) {
        this.parent = value;
    }

    /**
     * Gets the value of the periodicLotSizeDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPeriodicLotSizeDays() {
        return periodicLotSizeDays;
    }

    /**
     * Sets the value of the periodicLotSizeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPeriodicLotSizeDays(SearchLongField value) {
        this.periodicLotSizeDays = value;
    }

    /**
     * Gets the value of the periodicLotSizeType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPeriodicLotSizeType() {
        return periodicLotSizeType;
    }

    /**
     * Sets the value of the periodicLotSizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPeriodicLotSizeType(SearchEnumMultiSelectField value) {
        this.periodicLotSizeType = value;
    }

    /**
     * Gets the value of the preferenceCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPreferenceCriterion() {
        return preferenceCriterion;
    }

    /**
     * Sets the value of the preferenceCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPreferenceCriterion(SearchStringField value) {
        this.preferenceCriterion = value;
    }

    /**
     * Gets the value of the preferredBin property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPreferredBin() {
        return preferredBin;
    }

    /**
     * Sets the value of the preferredBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPreferredBin(SearchBooleanField value) {
        this.preferredBin = value;
    }

    /**
     * Gets the value of the preferredLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPreferredLocation() {
        return preferredLocation;
    }

    /**
     * Sets the value of the preferredLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPreferredLocation(SearchMultiSelectField value) {
        this.preferredLocation = value;
    }

    /**
     * Gets the value of the preferredStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPreferredStockLevel() {
        return preferredStockLevel;
    }

    /**
     * Sets the value of the preferredStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPreferredStockLevel(SearchDoubleField value) {
        this.preferredStockLevel = value;
    }

    /**
     * Gets the value of the preferredStockLevelDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }

    /**
     * Sets the value of the preferredStockLevelDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPreferredStockLevelDays(SearchLongField value) {
        this.preferredStockLevelDays = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPrice(SearchDoubleField value) {
        this.price = value;
    }

    /**
     * Gets the value of the pricesIncludeTax property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPricesIncludeTax() {
        return pricesIncludeTax;
    }

    /**
     * Sets the value of the pricesIncludeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPricesIncludeTax(SearchBooleanField value) {
        this.pricesIncludeTax = value;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPricingGroup() {
        return pricingGroup;
    }

    /**
     * Sets the value of the pricingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPricingGroup(SearchMultiSelectField value) {
        this.pricingGroup = value;
    }

    /**
     * Gets the value of the primaryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPrimaryCategory() {
        return primaryCategory;
    }

    /**
     * Sets the value of the primaryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPrimaryCategory(SearchLongField value) {
        this.primaryCategory = value;
    }

    /**
     * Gets the value of the purchaseOrderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }

    /**
     * Sets the value of the purchaseOrderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPurchaseOrderAmount(SearchDoubleField value) {
        this.purchaseOrderAmount = value;
    }

    /**
     * Gets the value of the purchaseOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }

    /**
     * Sets the value of the purchaseOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPurchaseOrderQuantity(SearchDoubleField value) {
        this.purchaseOrderQuantity = value;
    }

    /**
     * Gets the value of the purchaseOrderQuantityDiff property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }

    /**
     * Sets the value of the purchaseOrderQuantityDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPurchaseOrderQuantityDiff(SearchDoubleField value) {
        this.purchaseOrderQuantityDiff = value;
    }

    /**
     * Gets the value of the purchaseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPurchaseUnit() {
        return purchaseUnit;
    }

    /**
     * Sets the value of the purchaseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPurchaseUnit(SearchMultiSelectField value) {
        this.purchaseUnit = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityAvailable(SearchDoubleField value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * Sets the value of the quantityBackOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityBackOrdered(SearchDoubleField value) {
        this.quantityBackOrdered = value;
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
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityOnHand(SearchDoubleField value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the quantityOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * Sets the value of the quantityOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityOnOrder(SearchDoubleField value) {
        this.quantityOnOrder = value;
    }

    /**
     * Gets the value of the quantityPricingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }

    /**
     * Sets the value of the quantityPricingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setQuantityPricingSchedule(SearchMultiSelectField value) {
        this.quantityPricingSchedule = value;
    }

    /**
     * Gets the value of the receiptAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * Sets the value of the receiptAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReceiptAmount(SearchDoubleField value) {
        this.receiptAmount = value;
    }

    /**
     * Gets the value of the receiptQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * Sets the value of the receiptQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReceiptQuantity(SearchDoubleField value) {
        this.receiptQuantity = value;
    }

    /**
     * Gets the value of the receiptQuantityDiff property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }

    /**
     * Sets the value of the receiptQuantityDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReceiptQuantityDiff(SearchDoubleField value) {
        this.receiptQuantityDiff = value;
    }

    /**
     * Gets the value of the reorderMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getReorderMultiple() {
        return reorderMultiple;
    }

    /**
     * Sets the value of the reorderMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setReorderMultiple(SearchLongField value) {
        this.reorderMultiple = value;
    }

    /**
     * Gets the value of the reorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReorderPoint() {
        return reorderPoint;
    }

    /**
     * Sets the value of the reorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReorderPoint(SearchDoubleField value) {
        this.reorderPoint = value;
    }

    /**
     * Gets the value of the rescheduleInDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRescheduleInDays() {
        return rescheduleInDays;
    }

    /**
     * Sets the value of the rescheduleInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRescheduleInDays(SearchLongField value) {
        this.rescheduleInDays = value;
    }

    /**
     * Gets the value of the rescheduleOutDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRescheduleOutDays() {
        return rescheduleOutDays;
    }

    /**
     * Sets the value of the rescheduleOutDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRescheduleOutDays(SearchLongField value) {
        this.rescheduleOutDays = value;
    }

    /**
     * Gets the value of the reservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReservePrice() {
        return reservePrice;
    }

    /**
     * Sets the value of the reservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReservePrice(SearchDoubleField value) {
        this.reservePrice = value;
    }

    /**
     * Gets the value of the revRecSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevRecSchedule() {
        return revRecSchedule;
    }

    /**
     * Sets the value of the revRecSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevRecSchedule(SearchMultiSelectField value) {
        this.revRecSchedule = value;
    }

    /**
     * Gets the value of the roundUpAsComponent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRoundUpAsComponent() {
        return roundUpAsComponent;
    }

    /**
     * Sets the value of the roundUpAsComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRoundUpAsComponent(SearchBooleanField value) {
        this.roundUpAsComponent = value;
    }

    /**
     * Gets the value of the safetyStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSafetyStockLevel() {
        return safetyStockLevel;
    }

    /**
     * Sets the value of the safetyStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSafetyStockLevel(SearchDoubleField value) {
        this.safetyStockLevel = value;
    }

    /**
     * Gets the value of the safetyStockLevelDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }

    /**
     * Sets the value of the safetyStockLevelDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setSafetyStockLevelDays(SearchLongField value) {
        this.safetyStockLevelDays = value;
    }

    /**
     * Gets the value of the salesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSalesDescription() {
        return salesDescription;
    }

    /**
     * Sets the value of the salesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSalesDescription(SearchStringField value) {
        this.salesDescription = value;
    }

    /**
     * Gets the value of the saleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSaleUnit() {
        return saleUnit;
    }

    /**
     * Sets the value of the saleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSaleUnit(SearchMultiSelectField value) {
        this.saleUnit = value;
    }

    /**
     * Gets the value of the sameAsPrimaryBookAmortization property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSameAsPrimaryBookAmortization() {
        return sameAsPrimaryBookAmortization;
    }

    /**
     * Sets the value of the sameAsPrimaryBookAmortization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSameAsPrimaryBookAmortization(SearchBooleanField value) {
        this.sameAsPrimaryBookAmortization = value;
    }

    /**
     * Gets the value of the sameAsPrimaryBookRevRec property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSameAsPrimaryBookRevRec() {
        return sameAsPrimaryBookRevRec;
    }

    /**
     * Sets the value of the sameAsPrimaryBookRevRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSameAsPrimaryBookRevRec(SearchBooleanField value) {
        this.sameAsPrimaryBookRevRec = value;
    }

    /**
     * Gets the value of the scheduleBCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getScheduleBCode() {
        return scheduleBCode;
    }

    /**
     * Sets the value of the scheduleBCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setScheduleBCode(SearchEnumMultiSelectField value) {
        this.scheduleBCode = value;
    }

    /**
     * Gets the value of the scheduleBNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getScheduleBNumber() {
        return scheduleBNumber;
    }

    /**
     * Sets the value of the scheduleBNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setScheduleBNumber(SearchStringField value) {
        this.scheduleBNumber = value;
    }

    /**
     * Gets the value of the scheduleBQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getScheduleBQuantity() {
        return scheduleBQuantity;
    }

    /**
     * Sets the value of the scheduleBQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setScheduleBQuantity(SearchStringField value) {
        this.scheduleBQuantity = value;
    }

    /**
     * Gets the value of the searchKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSearchKeywords() {
        return searchKeywords;
    }

    /**
     * Sets the value of the searchKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSearchKeywords(SearchStringField value) {
        this.searchKeywords = value;
    }

    /**
     * Gets the value of the seasonalDemand property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSeasonalDemand() {
        return seasonalDemand;
    }

    /**
     * Sets the value of the seasonalDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSeasonalDemand(SearchBooleanField value) {
        this.seasonalDemand = value;
    }

    /**
     * Gets the value of the sellOnEBay property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSellOnEBay() {
        return sellOnEBay;
    }

    /**
     * Sets the value of the sellOnEBay property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSellOnEBay(SearchBooleanField value) {
        this.sellOnEBay = value;
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
     * Gets the value of the serialNumberLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSerialNumberLocation() {
        return serialNumberLocation;
    }

    /**
     * Sets the value of the serialNumberLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSerialNumberLocation(SearchMultiSelectField value) {
        this.serialNumberLocation = value;
    }

    /**
     * Gets the value of the shipIndividually property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipIndividually() {
        return shipIndividually;
    }

    /**
     * Sets the value of the shipIndividually property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipIndividually(SearchBooleanField value) {
        this.shipIndividually = value;
    }

    /**
     * Gets the value of the shipPackage property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipPackage() {
        return shipPackage;
    }

    /**
     * Sets the value of the shipPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipPackage(SearchMultiSelectField value) {
        this.shipPackage = value;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getShippingCarrier() {
        return shippingCarrier;
    }

    /**
     * Sets the value of the shippingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setShippingCarrier(SearchEnumMultiSelectField value) {
        this.shippingCarrier = value;
    }

    /**
     * Gets the value of the shippingRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getShippingRate() {
        return shippingRate;
    }

    /**
     * Sets the value of the shippingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setShippingRate(SearchDoubleField value) {
        this.shippingRate = value;
    }

    /**
     * Gets the value of the shoppingDotComCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }

    /**
     * Sets the value of the shoppingDotComCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShoppingDotComCategory(SearchStringField value) {
        this.shoppingDotComCategory = value;
    }

    /**
     * Gets the value of the shoppingProductFeed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShoppingProductFeed() {
        return shoppingProductFeed;
    }

    /**
     * Sets the value of the shoppingProductFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShoppingProductFeed(SearchBooleanField value) {
        this.shoppingProductFeed = value;
    }

    /**
     * Gets the value of the shopzillaCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }

    /**
     * Sets the value of the shopzillaCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setShopzillaCategoryId(SearchLongField value) {
        this.shopzillaCategoryId = value;
    }

    /**
     * Gets the value of the shopzillaProductFeed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShopzillaProductFeed() {
        return shopzillaProductFeed;
    }

    /**
     * Sets the value of the shopzillaProductFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShopzillaProductFeed(SearchBooleanField value) {
        this.shopzillaProductFeed = value;
    }

    /**
     * Gets the value of the sitemapPriority property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSitemapPriority() {
        return sitemapPriority;
    }

    /**
     * Sets the value of the sitemapPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSitemapPriority(SearchEnumMultiSelectField value) {
        this.sitemapPriority = value;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Sets the value of the softDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSoftDescriptor(SearchMultiSelectField value) {
        this.softDescriptor = value;
    }

    /**
     * Gets the value of the startingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getStartingPrice() {
        return startingPrice;
    }

    /**
     * Sets the value of the startingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setStartingPrice(SearchDoubleField value) {
        this.startingPrice = value;
    }

    /**
     * Gets the value of the stockDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getStockDescription() {
        return stockDescription;
    }

    /**
     * Sets the value of the stockDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setStockDescription(SearchStringField value) {
        this.stockDescription = value;
    }

    /**
     * Gets the value of the stockUnit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getStockUnit() {
        return stockUnit;
    }

    /**
     * Sets the value of the stockUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setStockUnit(SearchMultiSelectField value) {
        this.stockUnit = value;
    }

    /**
     * Gets the value of the storeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getStoreDescription() {
        return storeDescription;
    }

    /**
     * Sets the value of the storeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setStoreDescription(SearchStringField value) {
        this.storeDescription = value;
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
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSubType(SearchEnumMultiSelectField value) {
        this.subType = value;
    }

    /**
     * Gets the value of the supplyLotSizingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }

    /**
     * Sets the value of the supplyLotSizingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSupplyLotSizingMethod(SearchEnumMultiSelectField value) {
        this.supplyLotSizingMethod = value;
    }

    /**
     * Gets the value of the supplyReplenishmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }

    /**
     * Sets the value of the supplyReplenishmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSupplyReplenishmentMethod(SearchEnumMultiSelectField value) {
        this.supplyReplenishmentMethod = value;
    }

    /**
     * Gets the value of the supplyTimeFence property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getSupplyTimeFence() {
        return supplyTimeFence;
    }

    /**
     * Sets the value of the supplyTimeFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setSupplyTimeFence(SearchLongField value) {
        this.supplyTimeFence = value;
    }

    /**
     * Gets the value of the supplyType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSupplyType() {
        return supplyType;
    }

    /**
     * Sets the value of the supplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSupplyType(SearchEnumMultiSelectField value) {
        this.supplyType = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTaxCode(SearchMultiSelectField value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTaxSchedule() {
        return taxSchedule;
    }

    /**
     * Sets the value of the taxSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTaxSchedule(SearchMultiSelectField value) {
        this.taxSchedule = value;
    }

    /**
     * Gets the value of the thumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Sets the value of the thumbnailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setThumbnailUrl(SearchStringField value) {
        this.thumbnailUrl = value;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTotalValue(SearchDoubleField value) {
        this.totalValue = value;
    }

    /**
     * Gets the value of the trackLandedCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTrackLandedCost() {
        return trackLandedCost;
    }

    /**
     * Sets the value of the trackLandedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTrackLandedCost(SearchBooleanField value) {
        this.trackLandedCost = value;
    }

    /**
     * Gets the value of the transferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferPrice() {
        return transferPrice;
    }

    /**
     * Sets the value of the transferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferPrice(SearchDoubleField value) {
        this.transferPrice = value;
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
     * Gets the value of the upcCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getUpcCode() {
        return upcCode;
    }

    /**
     * Sets the value of the upcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setUpcCode(SearchStringField value) {
        this.upcCode = value;
    }

    /**
     * Gets the value of the urlComponent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getUrlComponent() {
        return urlComponent;
    }

    /**
     * Sets the value of the urlComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setUrlComponent(SearchStringField value) {
        this.urlComponent = value;
    }

    /**
     * Gets the value of the useBins property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseBins() {
        return useBins;
    }

    /**
     * Sets the value of the useBins property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseBins(SearchBooleanField value) {
        this.useBins = value;
    }

    /**
     * Gets the value of the useComponentYield property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseComponentYield() {
        return useComponentYield;
    }

    /**
     * Sets the value of the useComponentYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseComponentYield(SearchBooleanField value) {
        this.useComponentYield = value;
    }

    /**
     * Gets the value of the useMarginalRates property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseMarginalRates() {
        return useMarginalRates;
    }

    /**
     * Sets the value of the useMarginalRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseMarginalRates(SearchBooleanField value) {
        this.useMarginalRates = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendor(SearchMultiSelectField value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVendorCode(SearchStringField value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the vendorCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVendorCost() {
        return vendorCost;
    }

    /**
     * Sets the value of the vendorCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVendorCost(SearchDoubleField value) {
        this.vendorCost = value;
    }

    /**
     * Gets the value of the vendorCostEntered property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVendorCostEntered() {
        return vendorCostEntered;
    }

    /**
     * Sets the value of the vendorCostEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVendorCostEntered(SearchDoubleField value) {
        this.vendorCostEntered = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVendorName(SearchStringField value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorPriceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendorPriceCurrency() {
        return vendorPriceCurrency;
    }

    /**
     * Sets the value of the vendorPriceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendorPriceCurrency(SearchMultiSelectField value) {
        this.vendorPriceCurrency = value;
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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setWeight(SearchDoubleField value) {
        this.weight = value;
    }

    /**
     * Gets the value of the yahooProductFeed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getYahooProductFeed() {
        return yahooProductFeed;
    }

    /**
     * Sets the value of the yahooProductFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setYahooProductFeed(SearchBooleanField value) {
        this.yahooProductFeed = value;
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
