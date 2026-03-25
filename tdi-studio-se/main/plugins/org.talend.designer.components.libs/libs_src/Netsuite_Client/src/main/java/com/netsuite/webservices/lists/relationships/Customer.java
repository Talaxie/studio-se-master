
package com.netsuite.webservices.lists.relationships;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.relationships.types.CustomerCreditHoldOverride;
import com.netsuite.webservices.lists.relationships.types.CustomerMonthlyClosing;
import com.netsuite.webservices.lists.relationships.types.CustomerNegativeNumberFormat;
import com.netsuite.webservices.lists.relationships.types.CustomerNumberFormat;
import com.netsuite.webservices.lists.relationships.types.CustomerStage;
import com.netsuite.webservices.lists.relationships.types.EmailPreference;
import com.netsuite.webservices.platform.common.types.Country;
import com.netsuite.webservices.platform.common.types.CurrencySymbolPlacement;
import com.netsuite.webservices.platform.common.types.GlobalSubscriptionStatus;
import com.netsuite.webservices.platform.common.types.Language;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="printOnCheckAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}Language" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberFormat" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}CustomerNumberFormat" minOccurs="0"/&gt;
 *         &lt;element name="negativeNumberFormat" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}CustomerNegativeNumberFormat" minOccurs="0"/&gt;
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="emailPreference" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EmailPreference" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="representingSubsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="salesRep" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="territory" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="contribPct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partner" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="salesGroup" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="vatRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="terms" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="creditHoldOverride" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}CustomerCreditHoldOverride" minOccurs="0"/&gt;
 *         &lt;element name="monthlyClosing" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}CustomerMonthlyClosing" minOccurs="0"/&gt;
 *         &lt;element name="overrideCurrencyFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="displaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="symbolPlacement" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}CurrencySymbolPlacement" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="overdueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="daysOverdue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="unbilledOrders" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consolUnbilledOrders" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consolOverdueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consolDepositBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consolBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consolAging" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consolDaysOverdue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="priceLevel" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="prefCCProcessor" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="depositBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shipComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="taxItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="resaleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aging" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="reminderDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="shippingItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyCountry" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}Country" minOccurs="0"/&gt;
 *         &lt;element name="giveAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="estimatedBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="accessRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requirePwdChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="campaignCategory" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="leadSource" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="receivablesAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="drAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="fxAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="defaultOrderPriority" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="webLead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referrer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clickStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPageVisited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="firstVisit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastVisit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="billPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="openingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="openingBalanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="openingBalanceAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="stage" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}CustomerStage" minOccurs="0"/&gt;
 *         &lt;element name="emailTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="printTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="faxTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="syncPartnerTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isBudgetApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="globalSubscriptionStatus" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}GlobalSubscriptionStatus" minOccurs="0"/&gt;
 *         &lt;element name="salesReadiness" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="salesTeamList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerSalesTeamList" minOccurs="0"/&gt;
 *         &lt;element name="buyingReason" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="downloadList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerDownloadList" minOccurs="0"/&gt;
 *         &lt;element name="buyingTimeFrame" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="addressbookList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerAddressbookList" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionsList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}SubscriptionsList" minOccurs="0"/&gt;
 *         &lt;element name="contactRolesList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}ContactAccessRolesList" minOccurs="0"/&gt;
 *         &lt;element name="currencyList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerCurrencyList" minOccurs="0"/&gt;
 *         &lt;element name="creditCardsList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerCreditCardsList" minOccurs="0"/&gt;
 *         &lt;element name="partnersList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerPartnersList" minOccurs="0"/&gt;
 *         &lt;element name="groupPricingList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerGroupPricingList" minOccurs="0"/&gt;
 *         &lt;element name="itemPricingList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}CustomerItemPricingList" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2014_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "customForm",
    "entityId",
    "altName",
    "isPerson",
    "phoneticName",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "companyName",
    "entityStatus",
    "parent",
    "phone",
    "fax",
    "email",
    "url",
    "defaultAddress",
    "isInactive",
    "category",
    "title",
    "printOnCheckAs",
    "altPhone",
    "homePhone",
    "mobilePhone",
    "altEmail",
    "language",
    "comments",
    "numberFormat",
    "negativeNumberFormat",
    "dateCreated",
    "image",
    "emailPreference",
    "subsidiary",
    "representingSubsidiary",
    "salesRep",
    "territory",
    "contribPct",
    "partner",
    "salesGroup",
    "vatRegNumber",
    "accountNumber",
    "taxExempt",
    "terms",
    "creditLimit",
    "creditHoldOverride",
    "monthlyClosing",
    "overrideCurrencyFormat",
    "displaySymbol",
    "symbolPlacement",
    "balance",
    "overdueBalance",
    "daysOverdue",
    "unbilledOrders",
    "consolUnbilledOrders",
    "consolOverdueBalance",
    "consolDepositBalance",
    "consolBalance",
    "consolAging",
    "consolDaysOverdue",
    "priceLevel",
    "currency",
    "prefCCProcessor",
    "depositBalance",
    "shipComplete",
    "taxable",
    "taxItem",
    "resaleNumber",
    "aging",
    "startDate",
    "endDate",
    "reminderDays",
    "shippingItem",
    "thirdPartyAcct",
    "thirdPartyZipcode",
    "thirdPartyCountry",
    "giveAccess",
    "estimatedBudget",
    "accessRole",
    "sendEmail",
    "password",
    "password2",
    "requirePwdChange",
    "campaignCategory",
    "leadSource",
    "receivablesAccount",
    "drAccount",
    "fxAccount",
    "defaultOrderPriority",
    "webLead",
    "referrer",
    "keywords",
    "clickStream",
    "lastPageVisited",
    "visits",
    "firstVisit",
    "lastVisit",
    "billPay",
    "openingBalance",
    "lastModifiedDate",
    "openingBalanceDate",
    "openingBalanceAccount",
    "stage",
    "emailTransactions",
    "printTransactions",
    "faxTransactions",
    "syncPartnerTeams",
    "isBudgetApproved",
    "globalSubscriptionStatus",
    "salesReadiness",
    "salesTeamList",
    "buyingReason",
    "downloadList",
    "buyingTimeFrame",
    "addressbookList",
    "subscriptionsList",
    "contactRolesList",
    "currencyList",
    "creditCardsList",
    "partnersList",
    "groupPricingList",
    "itemPricingList",
    "customFieldList"
})
public class Customer
    extends Record
{

    protected RecordRef customForm;
    protected String entityId;
    protected String altName;
    protected Boolean isPerson;
    protected String phoneticName;
    protected String salutation;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String companyName;
    protected RecordRef entityStatus;
    protected RecordRef parent;
    protected String phone;
    protected String fax;
    protected String email;
    protected String url;
    protected String defaultAddress;
    protected Boolean isInactive;
    protected RecordRef category;
    protected String title;
    protected String printOnCheckAs;
    protected String altPhone;
    protected String homePhone;
    protected String mobilePhone;
    protected String altEmail;
    @XmlSchemaType(name = "string")
    protected Language language;
    protected String comments;
    @XmlSchemaType(name = "string")
    protected CustomerNumberFormat numberFormat;
    @XmlSchemaType(name = "string")
    protected CustomerNegativeNumberFormat negativeNumberFormat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    protected RecordRef image;
    @XmlSchemaType(name = "string")
    protected EmailPreference emailPreference;
    protected RecordRef subsidiary;
    protected RecordRef representingSubsidiary;
    protected RecordRef salesRep;
    protected RecordRef territory;
    protected String contribPct;
    protected RecordRef partner;
    protected RecordRef salesGroup;
    protected String vatRegNumber;
    protected String accountNumber;
    protected Boolean taxExempt;
    protected RecordRef terms;
    protected Double creditLimit;
    @XmlSchemaType(name = "string")
    protected CustomerCreditHoldOverride creditHoldOverride;
    @XmlSchemaType(name = "string")
    protected CustomerMonthlyClosing monthlyClosing;
    protected Boolean overrideCurrencyFormat;
    protected String displaySymbol;
    @XmlSchemaType(name = "string")
    protected CurrencySymbolPlacement symbolPlacement;
    protected Double balance;
    protected Double overdueBalance;
    protected Long daysOverdue;
    protected Double unbilledOrders;
    protected Double consolUnbilledOrders;
    protected Double consolOverdueBalance;
    protected Double consolDepositBalance;
    protected Double consolBalance;
    protected Double consolAging;
    protected Long consolDaysOverdue;
    protected RecordRef priceLevel;
    protected RecordRef currency;
    protected RecordRef prefCCProcessor;
    protected Double depositBalance;
    protected Boolean shipComplete;
    protected Boolean taxable;
    protected RecordRef taxItem;
    protected String resaleNumber;
    protected Double aging;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Long reminderDays;
    protected RecordRef shippingItem;
    protected String thirdPartyAcct;
    protected String thirdPartyZipcode;
    @XmlSchemaType(name = "string")
    protected Country thirdPartyCountry;
    protected Boolean giveAccess;
    protected Double estimatedBudget;
    protected RecordRef accessRole;
    protected Boolean sendEmail;
    protected String password;
    protected String password2;
    protected Boolean requirePwdChange;
    protected RecordRef campaignCategory;
    protected RecordRef leadSource;
    protected RecordRef receivablesAccount;
    protected RecordRef drAccount;
    protected RecordRef fxAccount;
    protected Double defaultOrderPriority;
    protected String webLead;
    protected String referrer;
    protected String keywords;
    protected String clickStream;
    protected String lastPageVisited;
    protected Long visits;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstVisit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastVisit;
    protected Boolean billPay;
    protected Double openingBalance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingBalanceDate;
    protected RecordRef openingBalanceAccount;
    @XmlSchemaType(name = "string")
    protected CustomerStage stage;
    protected Boolean emailTransactions;
    protected Boolean printTransactions;
    protected Boolean faxTransactions;
    protected Boolean syncPartnerTeams;
    protected Boolean isBudgetApproved;
    @XmlSchemaType(name = "string")
    protected GlobalSubscriptionStatus globalSubscriptionStatus;
    protected RecordRef salesReadiness;
    protected CustomerSalesTeamList salesTeamList;
    protected RecordRef buyingReason;
    protected CustomerDownloadList downloadList;
    protected RecordRef buyingTimeFrame;
    protected CustomerAddressbookList addressbookList;
    protected SubscriptionsList subscriptionsList;
    protected ContactAccessRolesList contactRolesList;
    protected CustomerCurrencyList currencyList;
    protected CustomerCreditCardsList creditCardsList;
    protected CustomerPartnersList partnersList;
    protected CustomerGroupPricingList groupPricingList;
    protected CustomerItemPricingList itemPricingList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the altName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * Sets the value of the altName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
    }

    /**
     * Gets the value of the isPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerson() {
        return isPerson;
    }

    /**
     * Sets the value of the isPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerson(Boolean value) {
        this.isPerson = value;
    }

    /**
     * Gets the value of the phoneticName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticName() {
        return phoneticName;
    }

    /**
     * Sets the value of the phoneticName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticName(String value) {
        this.phoneticName = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntityStatus(RecordRef value) {
        this.entityStatus = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the defaultAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * Sets the value of the defaultAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAddress(String value) {
        this.defaultAddress = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCategory(RecordRef value) {
        this.category = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the printOnCheckAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOnCheckAs() {
        return printOnCheckAs;
    }

    /**
     * Sets the value of the printOnCheckAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOnCheckAs(String value) {
        this.printOnCheckAs = value;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the value of the altPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the altEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltEmail() {
        return altEmail;
    }

    /**
     * Sets the value of the altEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltEmail(String value) {
        this.altEmail = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the numberFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNumberFormat }
     *     
     */
    public CustomerNumberFormat getNumberFormat() {
        return numberFormat;
    }

    /**
     * Sets the value of the numberFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNumberFormat }
     *     
     */
    public void setNumberFormat(CustomerNumberFormat value) {
        this.numberFormat = value;
    }

    /**
     * Gets the value of the negativeNumberFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNegativeNumberFormat }
     *     
     */
    public CustomerNegativeNumberFormat getNegativeNumberFormat() {
        return negativeNumberFormat;
    }

    /**
     * Sets the value of the negativeNumberFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNegativeNumberFormat }
     *     
     */
    public void setNegativeNumberFormat(CustomerNegativeNumberFormat value) {
        this.negativeNumberFormat = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setImage(RecordRef value) {
        this.image = value;
    }

    /**
     * Gets the value of the emailPreference property.
     * 
     * @return
     *     possible object is
     *     {@link EmailPreference }
     *     
     */
    public EmailPreference getEmailPreference() {
        return emailPreference;
    }

    /**
     * Sets the value of the emailPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailPreference }
     *     
     */
    public void setEmailPreference(EmailPreference value) {
        this.emailPreference = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the representingSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRepresentingSubsidiary() {
        return representingSubsidiary;
    }

    /**
     * Sets the value of the representingSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRepresentingSubsidiary(RecordRef value) {
        this.representingSubsidiary = value;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesRep() {
        return salesRep;
    }

    /**
     * Sets the value of the salesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesRep(RecordRef value) {
        this.salesRep = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTerritory(RecordRef value) {
        this.territory = value;
    }

    /**
     * Gets the value of the contribPct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContribPct() {
        return contribPct;
    }

    /**
     * Sets the value of the contribPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContribPct(String value) {
        this.contribPct = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPartner(RecordRef value) {
        this.partner = value;
    }

    /**
     * Gets the value of the salesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesGroup() {
        return salesGroup;
    }

    /**
     * Sets the value of the salesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesGroup(RecordRef value) {
        this.salesGroup = value;
    }

    /**
     * Gets the value of the vatRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegNumber() {
        return vatRegNumber;
    }

    /**
     * Sets the value of the vatRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegNumber(String value) {
        this.vatRegNumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempt(Boolean value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTerms(RecordRef value) {
        this.terms = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditLimit(Double value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the creditHoldOverride property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditHoldOverride }
     *     
     */
    public CustomerCreditHoldOverride getCreditHoldOverride() {
        return creditHoldOverride;
    }

    /**
     * Sets the value of the creditHoldOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditHoldOverride }
     *     
     */
    public void setCreditHoldOverride(CustomerCreditHoldOverride value) {
        this.creditHoldOverride = value;
    }

    /**
     * Gets the value of the monthlyClosing property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMonthlyClosing }
     *     
     */
    public CustomerMonthlyClosing getMonthlyClosing() {
        return monthlyClosing;
    }

    /**
     * Sets the value of the monthlyClosing property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMonthlyClosing }
     *     
     */
    public void setMonthlyClosing(CustomerMonthlyClosing value) {
        this.monthlyClosing = value;
    }

    /**
     * Gets the value of the overrideCurrencyFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideCurrencyFormat() {
        return overrideCurrencyFormat;
    }

    /**
     * Sets the value of the overrideCurrencyFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideCurrencyFormat(Boolean value) {
        this.overrideCurrencyFormat = value;
    }

    /**
     * Gets the value of the displaySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    /**
     * Sets the value of the displaySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySymbol(String value) {
        this.displaySymbol = value;
    }

    /**
     * Gets the value of the symbolPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public CurrencySymbolPlacement getSymbolPlacement() {
        return symbolPlacement;
    }

    /**
     * Sets the value of the symbolPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public void setSymbolPlacement(CurrencySymbolPlacement value) {
        this.symbolPlacement = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalance(Double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the overdueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverdueBalance() {
        return overdueBalance;
    }

    /**
     * Sets the value of the overdueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverdueBalance(Double value) {
        this.overdueBalance = value;
    }

    /**
     * Gets the value of the daysOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysOverdue() {
        return daysOverdue;
    }

    /**
     * Sets the value of the daysOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysOverdue(Long value) {
        this.daysOverdue = value;
    }

    /**
     * Gets the value of the unbilledOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnbilledOrders() {
        return unbilledOrders;
    }

    /**
     * Sets the value of the unbilledOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnbilledOrders(Double value) {
        this.unbilledOrders = value;
    }

    /**
     * Gets the value of the consolUnbilledOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }

    /**
     * Sets the value of the consolUnbilledOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolUnbilledOrders(Double value) {
        this.consolUnbilledOrders = value;
    }

    /**
     * Gets the value of the consolOverdueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolOverdueBalance() {
        return consolOverdueBalance;
    }

    /**
     * Sets the value of the consolOverdueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolOverdueBalance(Double value) {
        this.consolOverdueBalance = value;
    }

    /**
     * Gets the value of the consolDepositBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolDepositBalance() {
        return consolDepositBalance;
    }

    /**
     * Sets the value of the consolDepositBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolDepositBalance(Double value) {
        this.consolDepositBalance = value;
    }

    /**
     * Gets the value of the consolBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolBalance() {
        return consolBalance;
    }

    /**
     * Sets the value of the consolBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolBalance(Double value) {
        this.consolBalance = value;
    }

    /**
     * Gets the value of the consolAging property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolAging() {
        return consolAging;
    }

    /**
     * Sets the value of the consolAging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolAging(Double value) {
        this.consolAging = value;
    }

    /**
     * Gets the value of the consolDaysOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsolDaysOverdue() {
        return consolDaysOverdue;
    }

    /**
     * Sets the value of the consolDaysOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsolDaysOverdue(Long value) {
        this.consolDaysOverdue = value;
    }

    /**
     * Gets the value of the priceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPriceLevel() {
        return priceLevel;
    }

    /**
     * Sets the value of the priceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPriceLevel(RecordRef value) {
        this.priceLevel = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the prefCCProcessor property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPrefCCProcessor() {
        return prefCCProcessor;
    }

    /**
     * Sets the value of the prefCCProcessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPrefCCProcessor(RecordRef value) {
        this.prefCCProcessor = value;
    }

    /**
     * Gets the value of the depositBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepositBalance() {
        return depositBalance;
    }

    /**
     * Sets the value of the depositBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepositBalance(Double value) {
        this.depositBalance = value;
    }

    /**
     * Gets the value of the shipComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipComplete() {
        return shipComplete;
    }

    /**
     * Sets the value of the shipComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipComplete(Boolean value) {
        this.shipComplete = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the taxItem property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxItem() {
        return taxItem;
    }

    /**
     * Sets the value of the taxItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxItem(RecordRef value) {
        this.taxItem = value;
    }

    /**
     * Gets the value of the resaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResaleNumber() {
        return resaleNumber;
    }

    /**
     * Sets the value of the resaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResaleNumber(String value) {
        this.resaleNumber = value;
    }

    /**
     * Gets the value of the aging property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAging() {
        return aging;
    }

    /**
     * Sets the value of the aging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAging(Double value) {
        this.aging = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the reminderDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReminderDays() {
        return reminderDays;
    }

    /**
     * Sets the value of the reminderDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReminderDays(Long value) {
        this.reminderDays = value;
    }

    /**
     * Gets the value of the shippingItem property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShippingItem() {
        return shippingItem;
    }

    /**
     * Sets the value of the shippingItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShippingItem(RecordRef value) {
        this.shippingItem = value;
    }

    /**
     * Gets the value of the thirdPartyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcct() {
        return thirdPartyAcct;
    }

    /**
     * Sets the value of the thirdPartyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcct(String value) {
        this.thirdPartyAcct = value;
    }

    /**
     * Gets the value of the thirdPartyZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyZipcode() {
        return thirdPartyZipcode;
    }

    /**
     * Sets the value of the thirdPartyZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyZipcode(String value) {
        this.thirdPartyZipcode = value;
    }

    /**
     * Gets the value of the thirdPartyCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getThirdPartyCountry() {
        return thirdPartyCountry;
    }

    /**
     * Sets the value of the thirdPartyCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setThirdPartyCountry(Country value) {
        this.thirdPartyCountry = value;
    }

    /**
     * Gets the value of the giveAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiveAccess() {
        return giveAccess;
    }

    /**
     * Sets the value of the giveAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiveAccess(Boolean value) {
        this.giveAccess = value;
    }

    /**
     * Gets the value of the estimatedBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedBudget() {
        return estimatedBudget;
    }

    /**
     * Sets the value of the estimatedBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedBudget(Double value) {
        this.estimatedBudget = value;
    }

    /**
     * Gets the value of the accessRole property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccessRole() {
        return accessRole;
    }

    /**
     * Sets the value of the accessRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccessRole(RecordRef value) {
        this.accessRole = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the password2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * Sets the value of the password2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword2(String value) {
        this.password2 = value;
    }

    /**
     * Gets the value of the requirePwdChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirePwdChange() {
        return requirePwdChange;
    }

    /**
     * Sets the value of the requirePwdChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePwdChange(Boolean value) {
        this.requirePwdChange = value;
    }

    /**
     * Gets the value of the campaignCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCampaignCategory() {
        return campaignCategory;
    }

    /**
     * Sets the value of the campaignCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCampaignCategory(RecordRef value) {
        this.campaignCategory = value;
    }

    /**
     * Gets the value of the leadSource property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the value of the leadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLeadSource(RecordRef value) {
        this.leadSource = value;
    }

    /**
     * Gets the value of the receivablesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReceivablesAccount() {
        return receivablesAccount;
    }

    /**
     * Sets the value of the receivablesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReceivablesAccount(RecordRef value) {
        this.receivablesAccount = value;
    }

    /**
     * Gets the value of the drAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDrAccount() {
        return drAccount;
    }

    /**
     * Sets the value of the drAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDrAccount(RecordRef value) {
        this.drAccount = value;
    }

    /**
     * Gets the value of the fxAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFxAccount() {
        return fxAccount;
    }

    /**
     * Sets the value of the fxAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFxAccount(RecordRef value) {
        this.fxAccount = value;
    }

    /**
     * Gets the value of the defaultOrderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultOrderPriority() {
        return defaultOrderPriority;
    }

    /**
     * Sets the value of the defaultOrderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultOrderPriority(Double value) {
        this.defaultOrderPriority = value;
    }

    /**
     * Gets the value of the webLead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebLead() {
        return webLead;
    }

    /**
     * Sets the value of the webLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebLead(String value) {
        this.webLead = value;
    }

    /**
     * Gets the value of the referrer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferrer() {
        return referrer;
    }

    /**
     * Sets the value of the referrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferrer(String value) {
        this.referrer = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the clickStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClickStream() {
        return clickStream;
    }

    /**
     * Sets the value of the clickStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClickStream(String value) {
        this.clickStream = value;
    }

    /**
     * Gets the value of the lastPageVisited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPageVisited() {
        return lastPageVisited;
    }

    /**
     * Sets the value of the lastPageVisited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPageVisited(String value) {
        this.lastPageVisited = value;
    }

    /**
     * Gets the value of the visits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisits() {
        return visits;
    }

    /**
     * Sets the value of the visits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisits(Long value) {
        this.visits = value;
    }

    /**
     * Gets the value of the firstVisit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstVisit() {
        return firstVisit;
    }

    /**
     * Sets the value of the firstVisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstVisit(XMLGregorianCalendar value) {
        this.firstVisit = value;
    }

    /**
     * Gets the value of the lastVisit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastVisit() {
        return lastVisit;
    }

    /**
     * Sets the value of the lastVisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastVisit(XMLGregorianCalendar value) {
        this.lastVisit = value;
    }

    /**
     * Gets the value of the billPay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillPay() {
        return billPay;
    }

    /**
     * Sets the value of the billPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillPay(Boolean value) {
        this.billPay = value;
    }

    /**
     * Gets the value of the openingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpeningBalance() {
        return openingBalance;
    }

    /**
     * Sets the value of the openingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpeningBalance(Double value) {
        this.openingBalance = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the openingBalanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningBalanceDate() {
        return openingBalanceDate;
    }

    /**
     * Sets the value of the openingBalanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningBalanceDate(XMLGregorianCalendar value) {
        this.openingBalanceDate = value;
    }

    /**
     * Gets the value of the openingBalanceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOpeningBalanceAccount() {
        return openingBalanceAccount;
    }

    /**
     * Sets the value of the openingBalanceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOpeningBalanceAccount(RecordRef value) {
        this.openingBalanceAccount = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerStage }
     *     
     */
    public CustomerStage getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerStage }
     *     
     */
    public void setStage(CustomerStage value) {
        this.stage = value;
    }

    /**
     * Gets the value of the emailTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailTransactions() {
        return emailTransactions;
    }

    /**
     * Sets the value of the emailTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailTransactions(Boolean value) {
        this.emailTransactions = value;
    }

    /**
     * Gets the value of the printTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintTransactions() {
        return printTransactions;
    }

    /**
     * Sets the value of the printTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintTransactions(Boolean value) {
        this.printTransactions = value;
    }

    /**
     * Gets the value of the faxTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxTransactions() {
        return faxTransactions;
    }

    /**
     * Sets the value of the faxTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxTransactions(Boolean value) {
        this.faxTransactions = value;
    }

    /**
     * Gets the value of the syncPartnerTeams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncPartnerTeams() {
        return syncPartnerTeams;
    }

    /**
     * Sets the value of the syncPartnerTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncPartnerTeams(Boolean value) {
        this.syncPartnerTeams = value;
    }

    /**
     * Gets the value of the isBudgetApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBudgetApproved() {
        return isBudgetApproved;
    }

    /**
     * Sets the value of the isBudgetApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBudgetApproved(Boolean value) {
        this.isBudgetApproved = value;
    }

    /**
     * Gets the value of the globalSubscriptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }

    /**
     * Sets the value of the globalSubscriptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus value) {
        this.globalSubscriptionStatus = value;
    }

    /**
     * Gets the value of the salesReadiness property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesReadiness() {
        return salesReadiness;
    }

    /**
     * Sets the value of the salesReadiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesReadiness(RecordRef value) {
        this.salesReadiness = value;
    }

    /**
     * Gets the value of the salesTeamList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSalesTeamList }
     *     
     */
    public CustomerSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }

    /**
     * Sets the value of the salesTeamList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSalesTeamList }
     *     
     */
    public void setSalesTeamList(CustomerSalesTeamList value) {
        this.salesTeamList = value;
    }

    /**
     * Gets the value of the buyingReason property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuyingReason() {
        return buyingReason;
    }

    /**
     * Sets the value of the buyingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuyingReason(RecordRef value) {
        this.buyingReason = value;
    }

    /**
     * Gets the value of the downloadList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDownloadList }
     *     
     */
    public CustomerDownloadList getDownloadList() {
        return downloadList;
    }

    /**
     * Sets the value of the downloadList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDownloadList }
     *     
     */
    public void setDownloadList(CustomerDownloadList value) {
        this.downloadList = value;
    }

    /**
     * Gets the value of the buyingTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuyingTimeFrame() {
        return buyingTimeFrame;
    }

    /**
     * Sets the value of the buyingTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuyingTimeFrame(RecordRef value) {
        this.buyingTimeFrame = value;
    }

    /**
     * Gets the value of the addressbookList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressbookList }
     *     
     */
    public CustomerAddressbookList getAddressbookList() {
        return addressbookList;
    }

    /**
     * Sets the value of the addressbookList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressbookList }
     *     
     */
    public void setAddressbookList(CustomerAddressbookList value) {
        this.addressbookList = value;
    }

    /**
     * Gets the value of the subscriptionsList property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionsList }
     *     
     */
    public SubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }

    /**
     * Sets the value of the subscriptionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionsList }
     *     
     */
    public void setSubscriptionsList(SubscriptionsList value) {
        this.subscriptionsList = value;
    }

    /**
     * Gets the value of the contactRolesList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAccessRolesList }
     *     
     */
    public ContactAccessRolesList getContactRolesList() {
        return contactRolesList;
    }

    /**
     * Sets the value of the contactRolesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAccessRolesList }
     *     
     */
    public void setContactRolesList(ContactAccessRolesList value) {
        this.contactRolesList = value;
    }

    /**
     * Gets the value of the currencyList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCurrencyList }
     *     
     */
    public CustomerCurrencyList getCurrencyList() {
        return currencyList;
    }

    /**
     * Sets the value of the currencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCurrencyList }
     *     
     */
    public void setCurrencyList(CustomerCurrencyList value) {
        this.currencyList = value;
    }

    /**
     * Gets the value of the creditCardsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditCardsList }
     *     
     */
    public CustomerCreditCardsList getCreditCardsList() {
        return creditCardsList;
    }

    /**
     * Sets the value of the creditCardsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditCardsList }
     *     
     */
    public void setCreditCardsList(CustomerCreditCardsList value) {
        this.creditCardsList = value;
    }

    /**
     * Gets the value of the partnersList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartnersList }
     *     
     */
    public CustomerPartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * Sets the value of the partnersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartnersList }
     *     
     */
    public void setPartnersList(CustomerPartnersList value) {
        this.partnersList = value;
    }

    /**
     * Gets the value of the groupPricingList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerGroupPricingList }
     *     
     */
    public CustomerGroupPricingList getGroupPricingList() {
        return groupPricingList;
    }

    /**
     * Sets the value of the groupPricingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerGroupPricingList }
     *     
     */
    public void setGroupPricingList(CustomerGroupPricingList value) {
        this.groupPricingList = value;
    }

    /**
     * Gets the value of the itemPricingList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerItemPricingList }
     *     
     */
    public CustomerItemPricingList getItemPricingList() {
        return itemPricingList;
    }

    /**
     * Sets the value of the itemPricingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerItemPricingList }
     *     
     */
    public void setItemPricingList(CustomerItemPricingList value) {
        this.itemPricingList = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
