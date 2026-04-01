
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
 * <p>Java class for EmployeeSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address1" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address2" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address3" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressInternalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressLabel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alienNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altEmail" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="approvalLimit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="approver" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attention" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authWorkDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress1" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress2" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress3" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddressee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAttention" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billCountry" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billCountryCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billingClass" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billZipCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="birthDay" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="concurrentWebServicesUser" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dateCreated" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eligibleForCommission" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="employeeStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="employeeType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ethnicity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expenseLimit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="giveAccess" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="globalSubscriptionStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hireDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="i9Verified" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isDefaultBilling" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isDefaultShipping" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isJobResource" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isSalesRep" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isSupportRep" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="laborCost" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastPaidDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastReviewDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="level" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nextReviewDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offlineAccess" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payFrequency" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="permChangeDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="permChangeLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="permission" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="permissionChange" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="phoneticName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaryEarningAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaryEarningItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaryEarningType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderApprovalLimit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderApprover" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderLimit" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="releaseDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="residentStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roleChange" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roleChangeAction" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roleChangeDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salesRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salutation" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress1" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress2" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddress3" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAddressee" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipAttention" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipCity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipCountry" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipCountryCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipPhone" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipState" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipZip" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="socialSecurityNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supervisor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timeApprover" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usePerquest" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useTimeData" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="visaExpDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="visaType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="workCalendar" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="workplace" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EmployeeSearchRowBasic", propOrder = {
    "accountNumber",
    "address",
    "address1",
    "address2",
    "address3",
    "addressee",
    "addressInternalId",
    "addressLabel",
    "addressPhone",
    "alienNumber",
    "altEmail",
    "altName",
    "altPhone",
    "approvalLimit",
    "approver",
    "attention",
    "authWorkDate",
    "billAddress",
    "billAddress1",
    "billAddress2",
    "billAddress3",
    "billAddressee",
    "billAttention",
    "billCity",
    "billCountry",
    "billCountryCode",
    "billingClass",
    "billPhone",
    "billState",
    "billZipCode",
    "birthDate",
    "birthDay",
    "city",
    "clazz",
    "comments",
    "concurrentWebServicesUser",
    "country",
    "countryCode",
    "dateCreated",
    "department",
    "eligibleForCommission",
    "email",
    "employeeStatus",
    "employeeType",
    "entityId",
    "entityNumber",
    "ethnicity",
    "expenseLimit",
    "externalId",
    "fax",
    "firstName",
    "gender",
    "giveAccess",
    "globalSubscriptionStatus",
    "hireDate",
    "homePhone",
    "i9Verified",
    "image",
    "internalId",
    "isDefaultBilling",
    "isDefaultShipping",
    "isInactive",
    "isJobResource",
    "isSalesRep",
    "isSupportRep",
    "isTemplate",
    "laborCost",
    "language",
    "lastModifiedDate",
    "lastName",
    "lastPaidDate",
    "lastReviewDate",
    "level",
    "location",
    "maritalStatus",
    "middleName",
    "mobilePhone",
    "nextReviewDate",
    "offlineAccess",
    "payFrequency",
    "permChangeDate",
    "permChangeLevel",
    "permission",
    "permissionChange",
    "phone",
    "phoneticName",
    "primaryEarningAmount",
    "primaryEarningItem",
    "primaryEarningType",
    "purchaseOrderApprovalLimit",
    "purchaseOrderApprover",
    "purchaseOrderLimit",
    "releaseDate",
    "residentStatus",
    "role",
    "roleChange",
    "roleChangeAction",
    "roleChangeDate",
    "salesRole",
    "salutation",
    "shipAddress1",
    "shipAddress2",
    "shipAddress3",
    "shipAddressee",
    "shipAttention",
    "shipCity",
    "shipCountry",
    "shipCountryCode",
    "shipPhone",
    "shipState",
    "shipZip",
    "socialSecurityNumber",
    "state",
    "subscription",
    "subscriptionDate",
    "subscriptionStatus",
    "subsidiary",
    "supervisor",
    "timeApprover",
    "title",
    "usePerquest",
    "useTimeData",
    "visaExpDate",
    "visaType",
    "workCalendar",
    "workplace",
    "zipCode",
    "customFieldList"
})
public class EmployeeSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnStringField> accountNumber;
    protected List<SearchColumnStringField> address;
    protected List<SearchColumnStringField> address1;
    protected List<SearchColumnStringField> address2;
    protected List<SearchColumnStringField> address3;
    protected List<SearchColumnStringField> addressee;
    protected List<SearchColumnStringField> addressInternalId;
    protected List<SearchColumnStringField> addressLabel;
    protected List<SearchColumnStringField> addressPhone;
    protected List<SearchColumnStringField> alienNumber;
    protected List<SearchColumnStringField> altEmail;
    protected List<SearchColumnStringField> altName;
    protected List<SearchColumnStringField> altPhone;
    protected List<SearchColumnDoubleField> approvalLimit;
    protected List<SearchColumnSelectField> approver;
    protected List<SearchColumnStringField> attention;
    protected List<SearchColumnDateField> authWorkDate;
    protected List<SearchColumnStringField> billAddress;
    protected List<SearchColumnStringField> billAddress1;
    protected List<SearchColumnStringField> billAddress2;
    protected List<SearchColumnStringField> billAddress3;
    protected List<SearchColumnStringField> billAddressee;
    protected List<SearchColumnStringField> billAttention;
    protected List<SearchColumnStringField> billCity;
    protected List<SearchColumnEnumSelectField> billCountry;
    protected List<SearchColumnStringField> billCountryCode;
    protected List<SearchColumnSelectField> billingClass;
    protected List<SearchColumnStringField> billPhone;
    protected List<SearchColumnStringField> billState;
    protected List<SearchColumnStringField> billZipCode;
    protected List<SearchColumnDateField> birthDate;
    protected List<SearchColumnDateField> birthDay;
    protected List<SearchColumnStringField> city;
    @XmlElement(name = "class")
    protected List<SearchColumnSelectField> clazz;
    protected List<SearchColumnStringField> comments;
    protected List<SearchColumnBooleanField> concurrentWebServicesUser;
    protected List<SearchColumnEnumSelectField> country;
    protected List<SearchColumnStringField> countryCode;
    protected List<SearchColumnDateField> dateCreated;
    protected List<SearchColumnSelectField> department;
    protected List<SearchColumnBooleanField> eligibleForCommission;
    protected List<SearchColumnStringField> email;
    protected List<SearchColumnSelectField> employeeStatus;
    protected List<SearchColumnSelectField> employeeType;
    protected List<SearchColumnStringField> entityId;
    protected List<SearchColumnLongField> entityNumber;
    protected List<SearchColumnSelectField> ethnicity;
    protected List<SearchColumnDoubleField> expenseLimit;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnStringField> fax;
    protected List<SearchColumnStringField> firstName;
    protected List<SearchColumnEnumSelectField> gender;
    protected List<SearchColumnBooleanField> giveAccess;
    protected List<SearchColumnEnumSelectField> globalSubscriptionStatus;
    protected List<SearchColumnDateField> hireDate;
    protected List<SearchColumnStringField> homePhone;
    protected List<SearchColumnBooleanField> i9Verified;
    protected List<SearchColumnSelectField> image;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnBooleanField> isDefaultBilling;
    protected List<SearchColumnBooleanField> isDefaultShipping;
    protected List<SearchColumnBooleanField> isInactive;
    protected List<SearchColumnBooleanField> isJobResource;
    protected List<SearchColumnBooleanField> isSalesRep;
    protected List<SearchColumnBooleanField> isSupportRep;
    protected List<SearchColumnBooleanField> isTemplate;
    protected List<SearchColumnDoubleField> laborCost;
    protected List<SearchColumnEnumSelectField> language;
    protected List<SearchColumnDateField> lastModifiedDate;
    protected List<SearchColumnStringField> lastName;
    protected List<SearchColumnDateField> lastPaidDate;
    protected List<SearchColumnDateField> lastReviewDate;
    protected List<SearchColumnEnumSelectField> level;
    protected List<SearchColumnSelectField> location;
    protected List<SearchColumnSelectField> maritalStatus;
    protected List<SearchColumnStringField> middleName;
    protected List<SearchColumnStringField> mobilePhone;
    protected List<SearchColumnDateField> nextReviewDate;
    protected List<SearchColumnBooleanField> offlineAccess;
    protected List<SearchColumnEnumSelectField> payFrequency;
    protected List<SearchColumnDateField> permChangeDate;
    protected List<SearchColumnStringField> permChangeLevel;
    protected List<SearchColumnEnumSelectField> permission;
    protected List<SearchColumnEnumSelectField> permissionChange;
    protected List<SearchColumnStringField> phone;
    protected List<SearchColumnStringField> phoneticName;
    protected List<SearchColumnDoubleField> primaryEarningAmount;
    protected List<SearchColumnStringField> primaryEarningItem;
    protected List<SearchColumnStringField> primaryEarningType;
    protected List<SearchColumnDoubleField> purchaseOrderApprovalLimit;
    protected List<SearchColumnSelectField> purchaseOrderApprover;
    protected List<SearchColumnDoubleField> purchaseOrderLimit;
    protected List<SearchColumnDateField> releaseDate;
    protected List<SearchColumnSelectField> residentStatus;
    protected List<SearchColumnSelectField> role;
    protected List<SearchColumnStringField> roleChange;
    protected List<SearchColumnStringField> roleChangeAction;
    protected List<SearchColumnDateField> roleChangeDate;
    protected List<SearchColumnSelectField> salesRole;
    protected List<SearchColumnStringField> salutation;
    protected List<SearchColumnStringField> shipAddress1;
    protected List<SearchColumnStringField> shipAddress2;
    protected List<SearchColumnStringField> shipAddress3;
    protected List<SearchColumnStringField> shipAddressee;
    protected List<SearchColumnStringField> shipAttention;
    protected List<SearchColumnStringField> shipCity;
    protected List<SearchColumnEnumSelectField> shipCountry;
    protected List<SearchColumnStringField> shipCountryCode;
    protected List<SearchColumnStringField> shipPhone;
    protected List<SearchColumnStringField> shipState;
    protected List<SearchColumnStringField> shipZip;
    protected List<SearchColumnStringField> socialSecurityNumber;
    protected List<SearchColumnEnumSelectField> state;
    protected List<SearchColumnSelectField> subscription;
    protected List<SearchColumnDateField> subscriptionDate;
    protected List<SearchColumnBooleanField> subscriptionStatus;
    protected List<SearchColumnSelectField> subsidiary;
    protected List<SearchColumnSelectField> supervisor;
    protected List<SearchColumnSelectField> timeApprover;
    protected List<SearchColumnStringField> title;
    protected List<SearchColumnBooleanField> usePerquest;
    protected List<SearchColumnBooleanField> useTimeData;
    protected List<SearchColumnDateField> visaExpDate;
    protected List<SearchColumnSelectField> visaType;
    protected List<SearchColumnStringField> workCalendar;
    protected List<SearchColumnSelectField> workplace;
    protected List<SearchColumnStringField> zipCode;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the accountNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAccountNumber() {
        if (accountNumber == null) {
            accountNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.accountNumber;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress() {
        if (address == null) {
            address = new ArrayList<SearchColumnStringField>();
        }
        return this.address;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress1() {
        if (address1 == null) {
            address1 = new ArrayList<SearchColumnStringField>();
        }
        return this.address1;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress2() {
        if (address2 == null) {
            address2 = new ArrayList<SearchColumnStringField>();
        }
        return this.address2;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress3() {
        if (address3 == null) {
            address3 = new ArrayList<SearchColumnStringField>();
        }
        return this.address3;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressee() {
        if (addressee == null) {
            addressee = new ArrayList<SearchColumnStringField>();
        }
        return this.addressee;
    }

    /**
     * Gets the value of the addressInternalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInternalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressInternalId() {
        if (addressInternalId == null) {
            addressInternalId = new ArrayList<SearchColumnStringField>();
        }
        return this.addressInternalId;
    }

    /**
     * Gets the value of the addressLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressLabel() {
        if (addressLabel == null) {
            addressLabel = new ArrayList<SearchColumnStringField>();
        }
        return this.addressLabel;
    }

    /**
     * Gets the value of the addressPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressPhone() {
        if (addressPhone == null) {
            addressPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.addressPhone;
    }

    /**
     * Gets the value of the alienNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alienNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlienNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAlienNumber() {
        if (alienNumber == null) {
            alienNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.alienNumber;
    }

    /**
     * Gets the value of the altEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltEmail() {
        if (altEmail == null) {
            altEmail = new ArrayList<SearchColumnStringField>();
        }
        return this.altEmail;
    }

    /**
     * Gets the value of the altName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltName() {
        if (altName == null) {
            altName = new ArrayList<SearchColumnStringField>();
        }
        return this.altName;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltPhone() {
        if (altPhone == null) {
            altPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.altPhone;
    }

    /**
     * Gets the value of the approvalLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getApprovalLimit() {
        if (approvalLimit == null) {
            approvalLimit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.approvalLimit;
    }

    /**
     * Gets the value of the approver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getApprover() {
        if (approver == null) {
            approver = new ArrayList<SearchColumnSelectField>();
        }
        return this.approver;
    }

    /**
     * Gets the value of the attention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAttention() {
        if (attention == null) {
            attention = new ArrayList<SearchColumnStringField>();
        }
        return this.attention;
    }

    /**
     * Gets the value of the authWorkDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authWorkDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthWorkDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getAuthWorkDate() {
        if (authWorkDate == null) {
            authWorkDate = new ArrayList<SearchColumnDateField>();
        }
        return this.authWorkDate;
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
     * Gets the value of the billingClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillingClass() {
        if (billingClass == null) {
            billingClass = new ArrayList<SearchColumnSelectField>();
        }
        return this.billingClass;
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
     * Gets the value of the billZipCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billZipCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillZipCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillZipCode() {
        if (billZipCode == null) {
            billZipCode = new ArrayList<SearchColumnStringField>();
        }
        return this.billZipCode;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birthDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirthDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getBirthDate() {
        if (birthDate == null) {
            birthDate = new ArrayList<SearchColumnDateField>();
        }
        return this.birthDate;
    }

    /**
     * Gets the value of the birthDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birthDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirthDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getBirthDay() {
        if (birthDay == null) {
            birthDay = new ArrayList<SearchColumnDateField>();
        }
        return this.birthDay;
    }

    /**
     * Gets the value of the city property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the city property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCity() {
        if (city == null) {
            city = new ArrayList<SearchColumnStringField>();
        }
        return this.city;
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
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getComments() {
        if (comments == null) {
            comments = new ArrayList<SearchColumnStringField>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the concurrentWebServicesUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concurrentWebServicesUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcurrentWebServicesUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getConcurrentWebServicesUser() {
        if (concurrentWebServicesUser == null) {
            concurrentWebServicesUser = new ArrayList<SearchColumnBooleanField>();
        }
        return this.concurrentWebServicesUser;
    }

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCountry() {
        if (country == null) {
            country = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.country;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCountryCode() {
        if (countryCode == null) {
            countryCode = new ArrayList<SearchColumnStringField>();
        }
        return this.countryCode;
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
     * Gets the value of the eligibleForCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibleForCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibleForCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getEligibleForCommission() {
        if (eligibleForCommission == null) {
            eligibleForCommission = new ArrayList<SearchColumnBooleanField>();
        }
        return this.eligibleForCommission;
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
     * Gets the value of the employeeStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEmployeeStatus() {
        if (employeeStatus == null) {
            employeeStatus = new ArrayList<SearchColumnSelectField>();
        }
        return this.employeeStatus;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEmployeeType() {
        if (employeeType == null) {
            employeeType = new ArrayList<SearchColumnSelectField>();
        }
        return this.employeeType;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEntityId() {
        if (entityId == null) {
            entityId = new ArrayList<SearchColumnStringField>();
        }
        return this.entityId;
    }

    /**
     * Gets the value of the entityNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getEntityNumber() {
        if (entityNumber == null) {
            entityNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.entityNumber;
    }

    /**
     * Gets the value of the ethnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ethnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEthnicity() {
        if (ethnicity == null) {
            ethnicity = new ArrayList<SearchColumnSelectField>();
        }
        return this.ethnicity;
    }

    /**
     * Gets the value of the expenseLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getExpenseLimit() {
        if (expenseLimit == null) {
            expenseLimit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.expenseLimit;
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
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFax() {
        if (fax == null) {
            fax = new ArrayList<SearchColumnStringField>();
        }
        return this.fax;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFirstName() {
        if (firstName == null) {
            firstName = new ArrayList<SearchColumnStringField>();
        }
        return this.firstName;
    }

    /**
     * Gets the value of the gender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getGender() {
        if (gender == null) {
            gender = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.gender;
    }

    /**
     * Gets the value of the giveAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giveAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiveAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getGiveAccess() {
        if (giveAccess == null) {
            giveAccess = new ArrayList<SearchColumnBooleanField>();
        }
        return this.giveAccess;
    }

    /**
     * Gets the value of the globalSubscriptionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalSubscriptionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalSubscriptionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getGlobalSubscriptionStatus() {
        if (globalSubscriptionStatus == null) {
            globalSubscriptionStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.globalSubscriptionStatus;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hireDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHireDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getHireDate() {
        if (hireDate == null) {
            hireDate = new ArrayList<SearchColumnDateField>();
        }
        return this.hireDate;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getHomePhone() {
        if (homePhone == null) {
            homePhone = new ArrayList<SearchColumnStringField>();
        }
        return this.homePhone;
    }

    /**
     * Gets the value of the i9Verified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i9Verified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI9Verified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getI9Verified() {
        if (i9Verified == null) {
            i9Verified = new ArrayList<SearchColumnBooleanField>();
        }
        return this.i9Verified;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getImage() {
        if (image == null) {
            image = new ArrayList<SearchColumnSelectField>();
        }
        return this.image;
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
     * Gets the value of the isDefaultBilling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isDefaultBilling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsDefaultBilling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsDefaultBilling() {
        if (isDefaultBilling == null) {
            isDefaultBilling = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isDefaultBilling;
    }

    /**
     * Gets the value of the isDefaultShipping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isDefaultShipping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsDefaultShipping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsDefaultShipping() {
        if (isDefaultShipping == null) {
            isDefaultShipping = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isDefaultShipping;
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
     * Gets the value of the isJobResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isJobResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsJobResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsJobResource() {
        if (isJobResource == null) {
            isJobResource = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isJobResource;
    }

    /**
     * Gets the value of the isSalesRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSalesRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSalesRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSalesRep() {
        if (isSalesRep == null) {
            isSalesRep = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSalesRep;
    }

    /**
     * Gets the value of the isSupportRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSupportRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSupportRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSupportRep() {
        if (isSupportRep == null) {
            isSupportRep = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSupportRep;
    }

    /**
     * Gets the value of the isTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsTemplate() {
        if (isTemplate == null) {
            isTemplate = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isTemplate;
    }

    /**
     * Gets the value of the laborCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLaborCost() {
        if (laborCost == null) {
            laborCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.laborCost;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLanguage() {
        if (language == null) {
            language = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.language;
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
     * Gets the value of the lastName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLastName() {
        if (lastName == null) {
            lastName = new ArrayList<SearchColumnStringField>();
        }
        return this.lastName;
    }

    /**
     * Gets the value of the lastPaidDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastPaidDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastPaidDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastPaidDate() {
        if (lastPaidDate == null) {
            lastPaidDate = new ArrayList<SearchColumnDateField>();
        }
        return this.lastPaidDate;
    }

    /**
     * Gets the value of the lastReviewDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastReviewDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastReviewDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastReviewDate() {
        if (lastReviewDate == null) {
            lastReviewDate = new ArrayList<SearchColumnDateField>();
        }
        return this.lastReviewDate;
    }

    /**
     * Gets the value of the level property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLevel() {
        if (level == null) {
            level = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.level;
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
     * Gets the value of the maritalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maritalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaritalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getMaritalStatus() {
        if (maritalStatus == null) {
            maritalStatus = new ArrayList<SearchColumnSelectField>();
        }
        return this.maritalStatus;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<SearchColumnStringField>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMobilePhone() {
        if (mobilePhone == null) {
            mobilePhone = new ArrayList<SearchColumnStringField>();
        }
        return this.mobilePhone;
    }

    /**
     * Gets the value of the nextReviewDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextReviewDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextReviewDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getNextReviewDate() {
        if (nextReviewDate == null) {
            nextReviewDate = new ArrayList<SearchColumnDateField>();
        }
        return this.nextReviewDate;
    }

    /**
     * Gets the value of the offlineAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offlineAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfflineAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getOfflineAccess() {
        if (offlineAccess == null) {
            offlineAccess = new ArrayList<SearchColumnBooleanField>();
        }
        return this.offlineAccess;
    }

    /**
     * Gets the value of the payFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPayFrequency() {
        if (payFrequency == null) {
            payFrequency = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.payFrequency;
    }

    /**
     * Gets the value of the permChangeDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permChangeDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermChangeDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getPermChangeDate() {
        if (permChangeDate == null) {
            permChangeDate = new ArrayList<SearchColumnDateField>();
        }
        return this.permChangeDate;
    }

    /**
     * Gets the value of the permChangeLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permChangeLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermChangeLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPermChangeLevel() {
        if (permChangeLevel == null) {
            permChangeLevel = new ArrayList<SearchColumnStringField>();
        }
        return this.permChangeLevel;
    }

    /**
     * Gets the value of the permission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPermission() {
        if (permission == null) {
            permission = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.permission;
    }

    /**
     * Gets the value of the permissionChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissionChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissionChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPermissionChange() {
        if (permissionChange == null) {
            permissionChange = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.permissionChange;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPhone() {
        if (phone == null) {
            phone = new ArrayList<SearchColumnStringField>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the phoneticName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneticName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneticName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPhoneticName() {
        if (phoneticName == null) {
            phoneticName = new ArrayList<SearchColumnStringField>();
        }
        return this.phoneticName;
    }

    /**
     * Gets the value of the primaryEarningAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryEarningAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryEarningAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPrimaryEarningAmount() {
        if (primaryEarningAmount == null) {
            primaryEarningAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.primaryEarningAmount;
    }

    /**
     * Gets the value of the primaryEarningItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryEarningItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryEarningItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPrimaryEarningItem() {
        if (primaryEarningItem == null) {
            primaryEarningItem = new ArrayList<SearchColumnStringField>();
        }
        return this.primaryEarningItem;
    }

    /**
     * Gets the value of the primaryEarningType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryEarningType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryEarningType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPrimaryEarningType() {
        if (primaryEarningType == null) {
            primaryEarningType = new ArrayList<SearchColumnStringField>();
        }
        return this.primaryEarningType;
    }

    /**
     * Gets the value of the purchaseOrderApprovalLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderApprovalLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderApprovalLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPurchaseOrderApprovalLimit() {
        if (purchaseOrderApprovalLimit == null) {
            purchaseOrderApprovalLimit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.purchaseOrderApprovalLimit;
    }

    /**
     * Gets the value of the purchaseOrderApprover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderApprover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderApprover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPurchaseOrderApprover() {
        if (purchaseOrderApprover == null) {
            purchaseOrderApprover = new ArrayList<SearchColumnSelectField>();
        }
        return this.purchaseOrderApprover;
    }

    /**
     * Gets the value of the purchaseOrderLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPurchaseOrderLimit() {
        if (purchaseOrderLimit == null) {
            purchaseOrderLimit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.purchaseOrderLimit;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getReleaseDate() {
        if (releaseDate == null) {
            releaseDate = new ArrayList<SearchColumnDateField>();
        }
        return this.releaseDate;
    }

    /**
     * Gets the value of the residentStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residentStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResidentStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getResidentStatus() {
        if (residentStatus == null) {
            residentStatus = new ArrayList<SearchColumnSelectField>();
        }
        return this.residentStatus;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getRole() {
        if (role == null) {
            role = new ArrayList<SearchColumnSelectField>();
        }
        return this.role;
    }

    /**
     * Gets the value of the roleChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getRoleChange() {
        if (roleChange == null) {
            roleChange = new ArrayList<SearchColumnStringField>();
        }
        return this.roleChange;
    }

    /**
     * Gets the value of the roleChangeAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleChangeAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleChangeAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getRoleChangeAction() {
        if (roleChangeAction == null) {
            roleChangeAction = new ArrayList<SearchColumnStringField>();
        }
        return this.roleChangeAction;
    }

    /**
     * Gets the value of the roleChangeDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleChangeDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleChangeDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getRoleChangeDate() {
        if (roleChangeDate == null) {
            roleChangeDate = new ArrayList<SearchColumnDateField>();
        }
        return this.roleChangeDate;
    }

    /**
     * Gets the value of the salesRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesRole() {
        if (salesRole == null) {
            salesRole = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesRole;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salutation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalutation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSalutation() {
        if (salutation == null) {
            salutation = new ArrayList<SearchColumnStringField>();
        }
        return this.salutation;
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
     * Gets the value of the socialSecurityNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialSecurityNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialSecurityNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSocialSecurityNumber() {
        if (socialSecurityNumber == null) {
            socialSecurityNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.socialSecurityNumber;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getState() {
        if (state == null) {
            state = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.state;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<SearchColumnSelectField>();
        }
        return this.subscription;
    }

    /**
     * Gets the value of the subscriptionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getSubscriptionDate() {
        if (subscriptionDate == null) {
            subscriptionDate = new ArrayList<SearchColumnDateField>();
        }
        return this.subscriptionDate;
    }

    /**
     * Gets the value of the subscriptionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSubscriptionStatus() {
        if (subscriptionStatus == null) {
            subscriptionStatus = new ArrayList<SearchColumnBooleanField>();
        }
        return this.subscriptionStatus;
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
     * Gets the value of the supervisor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSupervisor() {
        if (supervisor == null) {
            supervisor = new ArrayList<SearchColumnSelectField>();
        }
        return this.supervisor;
    }

    /**
     * Gets the value of the timeApprover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeApprover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeApprover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTimeApprover() {
        if (timeApprover == null) {
            timeApprover = new ArrayList<SearchColumnSelectField>();
        }
        return this.timeApprover;
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
     * Gets the value of the usePerquest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usePerquest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsePerquest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUsePerquest() {
        if (usePerquest == null) {
            usePerquest = new ArrayList<SearchColumnBooleanField>();
        }
        return this.usePerquest;
    }

    /**
     * Gets the value of the useTimeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useTimeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseTimeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseTimeData() {
        if (useTimeData == null) {
            useTimeData = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useTimeData;
    }

    /**
     * Gets the value of the visaExpDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaExpDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaExpDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getVisaExpDate() {
        if (visaExpDate == null) {
            visaExpDate = new ArrayList<SearchColumnDateField>();
        }
        return this.visaExpDate;
    }

    /**
     * Gets the value of the visaType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVisaType() {
        if (visaType == null) {
            visaType = new ArrayList<SearchColumnSelectField>();
        }
        return this.visaType;
    }

    /**
     * Gets the value of the workCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getWorkCalendar() {
        if (workCalendar == null) {
            workCalendar = new ArrayList<SearchColumnStringField>();
        }
        return this.workCalendar;
    }

    /**
     * Gets the value of the workplace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workplace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkplace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getWorkplace() {
        if (workplace == null) {
            workplace = new ArrayList<SearchColumnSelectField>();
        }
        return this.workplace;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zipCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZipCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getZipCode() {
        if (zipCode == null) {
            zipCode = new ArrayList<SearchColumnStringField>();
        }
        return this.zipCode;
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
