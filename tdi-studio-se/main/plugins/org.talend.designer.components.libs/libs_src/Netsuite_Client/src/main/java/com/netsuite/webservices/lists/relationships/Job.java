
package com.netsuite.webservices.lists.relationships;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.relationships.types.EmailPreference;
import com.netsuite.webservices.lists.relationships.types.JobBillingType;
import com.netsuite.webservices.platform.common.types.GlobalSubscriptionStatus;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Duration;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="billPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="workplace" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="fxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calculatedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="calculatedEndDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="projectedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="projectedEndDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastBaselineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="jobType" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="percentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/&gt;
 *         &lt;element name="estimatedTimeOverride" type="{urn:core_2014_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailPreference" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EmailPreference" minOccurs="0"/&gt;
 *         &lt;element name="openingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="openingBalanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="openingBalanceAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="jobBillingType" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}JobBillingType" minOccurs="0"/&gt;
 *         &lt;element name="billingSchedule" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="jobItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="percentTimeComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="actualTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/&gt;
 *         &lt;element name="allowTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeRemaining" type="{urn:core_2014_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/&gt;
 *         &lt;element name="limitTimeToAssignees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="estimatedLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedLaborCostBaseline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimateRevRecTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="estimatedLaborRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedGrossProfit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedGrossProfitPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="projectExpenseType" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="applyProjectExpenseTypeToAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allowAllResourcesForTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="jobPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isUtilizedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isProductiveTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isExemptTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="materializeTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allowExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allocatePayrollExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeCrmTasksInTotals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="globalSubscriptionStatus" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}GlobalSubscriptionStatus" minOccurs="0"/&gt;
 *         &lt;element name="jobResourcesList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}JobResourcesList" minOccurs="0"/&gt;
 *         &lt;element name="plStatementList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}JobPlStatementList" minOccurs="0"/&gt;
 *         &lt;element name="addressbookList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}JobAddressbookList" minOccurs="0"/&gt;
 *         &lt;element name="milestonesList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}JobMilestonesList" minOccurs="0"/&gt;
 *         &lt;element name="creditCardsList" type="{urn:relationships_2014_2.lists.webservices.netsuite.com}JobCreditCardsList" minOccurs="0"/&gt;
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
@XmlType(name = "Job", propOrder = {
    "customForm",
    "entityId",
    "altName",
    "companyName",
    "phoneticName",
    "entityStatus",
    "defaultAddress",
    "parent",
    "isInactive",
    "lastModifiedDate",
    "billPay",
    "dateCreated",
    "category",
    "workplace",
    "language",
    "comments",
    "accountNumber",
    "currency",
    "fxRate",
    "startDate",
    "endDate",
    "phone",
    "altPhone",
    "calculatedEndDate",
    "calculatedEndDateBaseline",
    "startDateBaseline",
    "projectedEndDate",
    "projectedEndDateBaseline",
    "lastBaselineDate",
    "jobType",
    "percentComplete",
    "estimatedCost",
    "estimatedRevenue",
    "estimatedTime",
    "estimatedTimeOverride",
    "fax",
    "email",
    "emailPreference",
    "openingBalance",
    "openingBalanceDate",
    "openingBalanceAccount",
    "subsidiary",
    "jobBillingType",
    "billingSchedule",
    "jobItem",
    "percentTimeComplete",
    "actualTime",
    "allowTime",
    "timeRemaining",
    "limitTimeToAssignees",
    "estimatedLaborCost",
    "estimatedLaborCostBaseline",
    "estimateRevRecTemplate",
    "estimatedLaborRevenue",
    "estimatedGrossProfit",
    "estimatedGrossProfitPercent",
    "projectExpenseType",
    "applyProjectExpenseTypeToAll",
    "allowAllResourcesForTasks",
    "jobPrice",
    "isUtilizedTime",
    "isProductiveTime",
    "isExemptTime",
    "materializeTime",
    "allowExpenses",
    "allocatePayrollExpenses",
    "includeCrmTasksInTotals",
    "globalSubscriptionStatus",
    "jobResourcesList",
    "plStatementList",
    "addressbookList",
    "milestonesList",
    "creditCardsList",
    "customFieldList"
})
public class Job
    extends Record
{

    protected RecordRef customForm;
    protected String entityId;
    protected String altName;
    protected String companyName;
    protected String phoneticName;
    protected RecordRef entityStatus;
    protected String defaultAddress;
    protected RecordRef parent;
    protected Boolean isInactive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected Boolean billPay;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    protected RecordRef category;
    protected RecordRef workplace;
    protected RecordRef language;
    protected String comments;
    protected String accountNumber;
    protected RecordRef currency;
    protected Double fxRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String phone;
    protected String altPhone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculatedEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculatedEndDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectedEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectedEndDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBaselineDate;
    protected RecordRef jobType;
    protected Double percentComplete;
    protected Double estimatedCost;
    protected Double estimatedRevenue;
    protected Duration estimatedTime;
    protected Duration estimatedTimeOverride;
    protected String fax;
    protected String email;
    @XmlSchemaType(name = "string")
    protected EmailPreference emailPreference;
    protected Double openingBalance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingBalanceDate;
    protected RecordRef openingBalanceAccount;
    protected RecordRef subsidiary;
    @XmlSchemaType(name = "string")
    protected JobBillingType jobBillingType;
    protected RecordRef billingSchedule;
    protected RecordRef jobItem;
    protected Double percentTimeComplete;
    protected Duration actualTime;
    protected Boolean allowTime;
    protected Duration timeRemaining;
    protected Boolean limitTimeToAssignees;
    protected Double estimatedLaborCost;
    protected Double estimatedLaborCostBaseline;
    protected RecordRef estimateRevRecTemplate;
    protected Double estimatedLaborRevenue;
    protected Double estimatedGrossProfit;
    protected Double estimatedGrossProfitPercent;
    protected RecordRef projectExpenseType;
    protected Boolean applyProjectExpenseTypeToAll;
    protected Boolean allowAllResourcesForTasks;
    protected Double jobPrice;
    protected Boolean isUtilizedTime;
    protected Boolean isProductiveTime;
    protected Boolean isExemptTime;
    protected Boolean materializeTime;
    protected Boolean allowExpenses;
    protected Boolean allocatePayrollExpenses;
    protected Boolean includeCrmTasksInTotals;
    @XmlSchemaType(name = "string")
    protected GlobalSubscriptionStatus globalSubscriptionStatus;
    protected JobResourcesList jobResourcesList;
    protected JobPlStatementList plStatementList;
    protected JobAddressbookList addressbookList;
    protected JobMilestonesList milestonesList;
    protected JobCreditCardsList creditCardsList;
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
     * Gets the value of the workplace property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkplace() {
        return workplace;
    }

    /**
     * Sets the value of the workplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkplace(RecordRef value) {
        this.workplace = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLanguage(RecordRef value) {
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
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFxRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFxRate(Double value) {
        this.fxRate = value;
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
     * Gets the value of the calculatedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedEndDate() {
        return calculatedEndDate;
    }

    /**
     * Sets the value of the calculatedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedEndDate(XMLGregorianCalendar value) {
        this.calculatedEndDate = value;
    }

    /**
     * Gets the value of the calculatedEndDateBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedEndDateBaseline() {
        return calculatedEndDateBaseline;
    }

    /**
     * Sets the value of the calculatedEndDateBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedEndDateBaseline(XMLGregorianCalendar value) {
        this.calculatedEndDateBaseline = value;
    }

    /**
     * Gets the value of the startDateBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateBaseline() {
        return startDateBaseline;
    }

    /**
     * Sets the value of the startDateBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateBaseline(XMLGregorianCalendar value) {
        this.startDateBaseline = value;
    }

    /**
     * Gets the value of the projectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedEndDate() {
        return projectedEndDate;
    }

    /**
     * Sets the value of the projectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedEndDate(XMLGregorianCalendar value) {
        this.projectedEndDate = value;
    }

    /**
     * Gets the value of the projectedEndDateBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedEndDateBaseline() {
        return projectedEndDateBaseline;
    }

    /**
     * Sets the value of the projectedEndDateBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedEndDateBaseline(XMLGregorianCalendar value) {
        this.projectedEndDateBaseline = value;
    }

    /**
     * Gets the value of the lastBaselineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBaselineDate() {
        return lastBaselineDate;
    }

    /**
     * Sets the value of the lastBaselineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBaselineDate(XMLGregorianCalendar value) {
        this.lastBaselineDate = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJobType(RecordRef value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the percentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Gets the value of the estimatedCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * Sets the value of the estimatedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedCost(Double value) {
        this.estimatedCost = value;
    }

    /**
     * Gets the value of the estimatedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedRevenue() {
        return estimatedRevenue;
    }

    /**
     * Sets the value of the estimatedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedRevenue(Double value) {
        this.estimatedRevenue = value;
    }

    /**
     * Gets the value of the estimatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the value of the estimatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedTime(Duration value) {
        this.estimatedTime = value;
    }

    /**
     * Gets the value of the estimatedTimeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }

    /**
     * Sets the value of the estimatedTimeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedTimeOverride(Duration value) {
        this.estimatedTimeOverride = value;
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
     * Gets the value of the jobBillingType property.
     * 
     * @return
     *     possible object is
     *     {@link JobBillingType }
     *     
     */
    public JobBillingType getJobBillingType() {
        return jobBillingType;
    }

    /**
     * Sets the value of the jobBillingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobBillingType }
     *     
     */
    public void setJobBillingType(JobBillingType value) {
        this.jobBillingType = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingSchedule(RecordRef value) {
        this.billingSchedule = value;
    }

    /**
     * Gets the value of the jobItem property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJobItem() {
        return jobItem;
    }

    /**
     * Sets the value of the jobItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJobItem(RecordRef value) {
        this.jobItem = value;
    }

    /**
     * Gets the value of the percentTimeComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentTimeComplete() {
        return percentTimeComplete;
    }

    /**
     * Sets the value of the percentTimeComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentTimeComplete(Double value) {
        this.percentTimeComplete = value;
    }

    /**
     * Gets the value of the actualTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActualTime() {
        return actualTime;
    }

    /**
     * Sets the value of the actualTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActualTime(Duration value) {
        this.actualTime = value;
    }

    /**
     * Gets the value of the allowTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowTime() {
        return allowTime;
    }

    /**
     * Sets the value of the allowTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTime(Boolean value) {
        this.allowTime = value;
    }

    /**
     * Gets the value of the timeRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeRemaining() {
        return timeRemaining;
    }

    /**
     * Sets the value of the timeRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeRemaining(Duration value) {
        this.timeRemaining = value;
    }

    /**
     * Gets the value of the limitTimeToAssignees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLimitTimeToAssignees() {
        return limitTimeToAssignees;
    }

    /**
     * Sets the value of the limitTimeToAssignees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimitTimeToAssignees(Boolean value) {
        this.limitTimeToAssignees = value;
    }

    /**
     * Gets the value of the estimatedLaborCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedLaborCost() {
        return estimatedLaborCost;
    }

    /**
     * Sets the value of the estimatedLaborCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedLaborCost(Double value) {
        this.estimatedLaborCost = value;
    }

    /**
     * Gets the value of the estimatedLaborCostBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedLaborCostBaseline() {
        return estimatedLaborCostBaseline;
    }

    /**
     * Sets the value of the estimatedLaborCostBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedLaborCostBaseline(Double value) {
        this.estimatedLaborCostBaseline = value;
    }

    /**
     * Gets the value of the estimateRevRecTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEstimateRevRecTemplate() {
        return estimateRevRecTemplate;
    }

    /**
     * Sets the value of the estimateRevRecTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEstimateRevRecTemplate(RecordRef value) {
        this.estimateRevRecTemplate = value;
    }

    /**
     * Gets the value of the estimatedLaborRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedLaborRevenue() {
        return estimatedLaborRevenue;
    }

    /**
     * Sets the value of the estimatedLaborRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedLaborRevenue(Double value) {
        this.estimatedLaborRevenue = value;
    }

    /**
     * Gets the value of the estimatedGrossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedGrossProfit() {
        return estimatedGrossProfit;
    }

    /**
     * Sets the value of the estimatedGrossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedGrossProfit(Double value) {
        this.estimatedGrossProfit = value;
    }

    /**
     * Gets the value of the estimatedGrossProfitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedGrossProfitPercent() {
        return estimatedGrossProfitPercent;
    }

    /**
     * Sets the value of the estimatedGrossProfitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedGrossProfitPercent(Double value) {
        this.estimatedGrossProfitPercent = value;
    }

    /**
     * Gets the value of the projectExpenseType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProjectExpenseType() {
        return projectExpenseType;
    }

    /**
     * Sets the value of the projectExpenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProjectExpenseType(RecordRef value) {
        this.projectExpenseType = value;
    }

    /**
     * Gets the value of the applyProjectExpenseTypeToAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyProjectExpenseTypeToAll() {
        return applyProjectExpenseTypeToAll;
    }

    /**
     * Sets the value of the applyProjectExpenseTypeToAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyProjectExpenseTypeToAll(Boolean value) {
        this.applyProjectExpenseTypeToAll = value;
    }

    /**
     * Gets the value of the allowAllResourcesForTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAllResourcesForTasks() {
        return allowAllResourcesForTasks;
    }

    /**
     * Sets the value of the allowAllResourcesForTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAllResourcesForTasks(Boolean value) {
        this.allowAllResourcesForTasks = value;
    }

    /**
     * Gets the value of the jobPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJobPrice() {
        return jobPrice;
    }

    /**
     * Sets the value of the jobPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJobPrice(Double value) {
        this.jobPrice = value;
    }

    /**
     * Gets the value of the isUtilizedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUtilizedTime() {
        return isUtilizedTime;
    }

    /**
     * Sets the value of the isUtilizedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUtilizedTime(Boolean value) {
        this.isUtilizedTime = value;
    }

    /**
     * Gets the value of the isProductiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductiveTime() {
        return isProductiveTime;
    }

    /**
     * Sets the value of the isProductiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductiveTime(Boolean value) {
        this.isProductiveTime = value;
    }

    /**
     * Gets the value of the isExemptTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExemptTime() {
        return isExemptTime;
    }

    /**
     * Sets the value of the isExemptTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExemptTime(Boolean value) {
        this.isExemptTime = value;
    }

    /**
     * Gets the value of the materializeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaterializeTime() {
        return materializeTime;
    }

    /**
     * Sets the value of the materializeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaterializeTime(Boolean value) {
        this.materializeTime = value;
    }

    /**
     * Gets the value of the allowExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowExpenses() {
        return allowExpenses;
    }

    /**
     * Sets the value of the allowExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowExpenses(Boolean value) {
        this.allowExpenses = value;
    }

    /**
     * Gets the value of the allocatePayrollExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllocatePayrollExpenses() {
        return allocatePayrollExpenses;
    }

    /**
     * Sets the value of the allocatePayrollExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllocatePayrollExpenses(Boolean value) {
        this.allocatePayrollExpenses = value;
    }

    /**
     * Gets the value of the includeCrmTasksInTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCrmTasksInTotals() {
        return includeCrmTasksInTotals;
    }

    /**
     * Sets the value of the includeCrmTasksInTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCrmTasksInTotals(Boolean value) {
        this.includeCrmTasksInTotals = value;
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
     * Gets the value of the jobResourcesList property.
     * 
     * @return
     *     possible object is
     *     {@link JobResourcesList }
     *     
     */
    public JobResourcesList getJobResourcesList() {
        return jobResourcesList;
    }

    /**
     * Sets the value of the jobResourcesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobResourcesList }
     *     
     */
    public void setJobResourcesList(JobResourcesList value) {
        this.jobResourcesList = value;
    }

    /**
     * Gets the value of the plStatementList property.
     * 
     * @return
     *     possible object is
     *     {@link JobPlStatementList }
     *     
     */
    public JobPlStatementList getPlStatementList() {
        return plStatementList;
    }

    /**
     * Sets the value of the plStatementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobPlStatementList }
     *     
     */
    public void setPlStatementList(JobPlStatementList value) {
        this.plStatementList = value;
    }

    /**
     * Gets the value of the addressbookList property.
     * 
     * @return
     *     possible object is
     *     {@link JobAddressbookList }
     *     
     */
    public JobAddressbookList getAddressbookList() {
        return addressbookList;
    }

    /**
     * Sets the value of the addressbookList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobAddressbookList }
     *     
     */
    public void setAddressbookList(JobAddressbookList value) {
        this.addressbookList = value;
    }

    /**
     * Gets the value of the milestonesList property.
     * 
     * @return
     *     possible object is
     *     {@link JobMilestonesList }
     *     
     */
    public JobMilestonesList getMilestonesList() {
        return milestonesList;
    }

    /**
     * Sets the value of the milestonesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobMilestonesList }
     *     
     */
    public void setMilestonesList(JobMilestonesList value) {
        this.milestonesList = value;
    }

    /**
     * Gets the value of the creditCardsList property.
     * 
     * @return
     *     possible object is
     *     {@link JobCreditCardsList }
     *     
     */
    public JobCreditCardsList getCreditCardsList() {
        return creditCardsList;
    }

    /**
     * Sets the value of the creditCardsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCreditCardsList }
     *     
     */
    public void setCreditCardsList(JobCreditCardsList value) {
        this.creditCardsList = value;
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
