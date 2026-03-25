
package com.netsuite.webservices.lists.employees;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.employees.types.EmployeeCommissionPaymentPreference;
import com.netsuite.webservices.lists.employees.types.EmployeePayFrequency;
import com.netsuite.webservices.lists.employees.types.EmployeeUseTimeData;
import com.netsuite.webservices.lists.employees.types.Gender;
import com.netsuite.webservices.platform.common.types.GlobalSubscriptionStatus;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for Employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="template" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billingClass" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="globalSubscriptionStatus" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}GlobalSubscriptionStatus" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="payFrequency" type="{urn:types.employees_2014_2.lists.webservices.netsuite.com}EmployeePayFrequency" minOccurs="0"/&gt;
 *         &lt;element name="lastPaidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="useTimeData" type="{urn:types.employees_2014_2.lists.webservices.netsuite.com}EmployeeUseTimeData" minOccurs="0"/&gt;
 *         &lt;element name="usePerquest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="workplace" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="adpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="expenseLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderApprovalLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supervisor" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="approver" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="approvalLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="timeApprover" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="employeeType" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isSalesRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="salesRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isSupportRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isJobResource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="laborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nextReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="jobDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="ethnicity" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{urn:types.employees_2014_2.lists.webservices.netsuite.com}Gender" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderApprover" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="workCalendar" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="giveAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="concurrentWebServicesUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasOfflineAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requirePwdChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="inheritIPRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IPAddressRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commissionPaymentPreference" type="{urn:types.employees_2014_2.lists.webservices.netsuite.com}EmployeeCommissionPaymentPreference" minOccurs="0"/&gt;
 *         &lt;element name="billPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibleForCommission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionsList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeSubscriptionsList" minOccurs="0"/&gt;
 *         &lt;element name="addressbookList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeAddressbookList" minOccurs="0"/&gt;
 *         &lt;element name="rolesList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeRolesList" minOccurs="0"/&gt;
 *         &lt;element name="hrEducationList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeHrEducationList" minOccurs="0"/&gt;
 *         &lt;element name="accruedTimeList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeAccruedTimeList" minOccurs="0"/&gt;
 *         &lt;element name="directDepositList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeDirectDepositList" minOccurs="0"/&gt;
 *         &lt;element name="companyContributionList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeCompanyContributionList" minOccurs="0"/&gt;
 *         &lt;element name="earningList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeEarningList" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContactList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeEmergencyContactList" minOccurs="0"/&gt;
 *         &lt;element name="deductionList" type="{urn:employees_2014_2.lists.webservices.netsuite.com}EmployeeDeductionList" minOccurs="0"/&gt;
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
@XmlType(name = "Employee", propOrder = {
    "customForm",
    "template",
    "entityId",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "altName",
    "phone",
    "fax",
    "email",
    "defaultAddress",
    "isInactive",
    "phoneticName",
    "lastModifiedDate",
    "dateCreated",
    "initials",
    "officePhone",
    "homePhone",
    "mobilePhone",
    "department",
    "clazz",
    "location",
    "subsidiary",
    "billingClass",
    "accountNumber",
    "comments",
    "globalSubscriptionStatus",
    "image",
    "payFrequency",
    "lastPaidDate",
    "currency",
    "useTimeData",
    "usePerquest",
    "workplace",
    "adpId",
    "directDeposit",
    "expenseLimit",
    "purchaseOrderLimit",
    "purchaseOrderApprovalLimit",
    "socialSecurityNumber",
    "supervisor",
    "approver",
    "approvalLimit",
    "timeApprover",
    "employeeType",
    "isSalesRep",
    "salesRole",
    "isSupportRep",
    "isJobResource",
    "laborCost",
    "birthDate",
    "hireDate",
    "releaseDate",
    "lastReviewDate",
    "nextReviewDate",
    "title",
    "employeeStatus",
    "jobDescription",
    "maritalStatus",
    "ethnicity",
    "gender",
    "purchaseOrderApprover",
    "workCalendar",
    "giveAccess",
    "concurrentWebServicesUser",
    "sendEmail",
    "hasOfflineAccess",
    "password",
    "password2",
    "requirePwdChange",
    "inheritIPRules",
    "ipAddressRule",
    "commissionPaymentPreference",
    "billPay",
    "eligibleForCommission",
    "subscriptionsList",
    "addressbookList",
    "rolesList",
    "hrEducationList",
    "accruedTimeList",
    "directDepositList",
    "companyContributionList",
    "earningList",
    "emergencyContactList",
    "deductionList",
    "customFieldList"
})
public class Employee
    extends Record
{

    protected RecordRef customForm;
    protected RecordRef template;
    protected String entityId;
    protected String salutation;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String altName;
    protected String phone;
    protected String fax;
    protected String email;
    protected String defaultAddress;
    protected Boolean isInactive;
    protected String phoneticName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    protected String initials;
    protected String officePhone;
    protected String homePhone;
    protected String mobilePhone;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef subsidiary;
    protected RecordRef billingClass;
    protected String accountNumber;
    protected String comments;
    @XmlSchemaType(name = "string")
    protected GlobalSubscriptionStatus globalSubscriptionStatus;
    protected RecordRef image;
    @XmlSchemaType(name = "string")
    protected EmployeePayFrequency payFrequency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaidDate;
    protected RecordRef currency;
    @XmlSchemaType(name = "string")
    protected EmployeeUseTimeData useTimeData;
    protected Boolean usePerquest;
    protected RecordRef workplace;
    protected String adpId;
    protected Boolean directDeposit;
    protected Double expenseLimit;
    protected Double purchaseOrderLimit;
    protected Double purchaseOrderApprovalLimit;
    protected String socialSecurityNumber;
    protected RecordRef supervisor;
    protected RecordRef approver;
    protected Double approvalLimit;
    protected RecordRef timeApprover;
    protected RecordRef employeeType;
    protected Boolean isSalesRep;
    protected RecordRef salesRole;
    protected Boolean isSupportRep;
    protected Boolean isJobResource;
    protected Double laborCost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hireDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReviewDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextReviewDate;
    protected String title;
    protected RecordRef employeeStatus;
    protected String jobDescription;
    protected RecordRef maritalStatus;
    protected RecordRef ethnicity;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    protected RecordRef purchaseOrderApprover;
    protected RecordRef workCalendar;
    protected Boolean giveAccess;
    protected Boolean concurrentWebServicesUser;
    protected Boolean sendEmail;
    protected Boolean hasOfflineAccess;
    protected String password;
    protected String password2;
    protected Boolean requirePwdChange;
    protected Boolean inheritIPRules;
    @XmlElement(name = "IPAddressRule")
    protected String ipAddressRule;
    @XmlSchemaType(name = "string")
    protected EmployeeCommissionPaymentPreference commissionPaymentPreference;
    protected Boolean billPay;
    protected Boolean eligibleForCommission;
    protected EmployeeSubscriptionsList subscriptionsList;
    protected EmployeeAddressbookList addressbookList;
    protected EmployeeRolesList rolesList;
    protected EmployeeHrEducationList hrEducationList;
    protected EmployeeAccruedTimeList accruedTimeList;
    protected EmployeeDirectDepositList directDepositList;
    protected EmployeeCompanyContributionList companyContributionList;
    protected EmployeeEarningList earningList;
    protected EmployeeEmergencyContactList emergencyContactList;
    protected EmployeeDeductionList deductionList;
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
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTemplate(RecordRef value) {
        this.template = value;
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
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the officePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the value of the officePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
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
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
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
     * Gets the value of the billingClass property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingClass() {
        return billingClass;
    }

    /**
     * Sets the value of the billingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingClass(RecordRef value) {
        this.billingClass = value;
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
     * Gets the value of the payFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeePayFrequency }
     *     
     */
    public EmployeePayFrequency getPayFrequency() {
        return payFrequency;
    }

    /**
     * Sets the value of the payFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeePayFrequency }
     *     
     */
    public void setPayFrequency(EmployeePayFrequency value) {
        this.payFrequency = value;
    }

    /**
     * Gets the value of the lastPaidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaidDate() {
        return lastPaidDate;
    }

    /**
     * Sets the value of the lastPaidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaidDate(XMLGregorianCalendar value) {
        this.lastPaidDate = value;
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
     * Gets the value of the useTimeData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeUseTimeData }
     *     
     */
    public EmployeeUseTimeData getUseTimeData() {
        return useTimeData;
    }

    /**
     * Sets the value of the useTimeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeUseTimeData }
     *     
     */
    public void setUseTimeData(EmployeeUseTimeData value) {
        this.useTimeData = value;
    }

    /**
     * Gets the value of the usePerquest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePerquest() {
        return usePerquest;
    }

    /**
     * Sets the value of the usePerquest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePerquest(Boolean value) {
        this.usePerquest = value;
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
     * Gets the value of the adpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdpId() {
        return adpId;
    }

    /**
     * Sets the value of the adpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdpId(String value) {
        this.adpId = value;
    }

    /**
     * Gets the value of the directDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectDeposit() {
        return directDeposit;
    }

    /**
     * Sets the value of the directDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectDeposit(Boolean value) {
        this.directDeposit = value;
    }

    /**
     * Gets the value of the expenseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpenseLimit() {
        return expenseLimit;
    }

    /**
     * Sets the value of the expenseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpenseLimit(Double value) {
        this.expenseLimit = value;
    }

    /**
     * Gets the value of the purchaseOrderLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderLimit() {
        return purchaseOrderLimit;
    }

    /**
     * Sets the value of the purchaseOrderLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderLimit(Double value) {
        this.purchaseOrderLimit = value;
    }

    /**
     * Gets the value of the purchaseOrderApprovalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderApprovalLimit() {
        return purchaseOrderApprovalLimit;
    }

    /**
     * Sets the value of the purchaseOrderApprovalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderApprovalLimit(Double value) {
        this.purchaseOrderApprovalLimit = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupervisor(RecordRef value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the approver property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setApprover(RecordRef value) {
        this.approver = value;
    }

    /**
     * Gets the value of the approvalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApprovalLimit() {
        return approvalLimit;
    }

    /**
     * Sets the value of the approvalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApprovalLimit(Double value) {
        this.approvalLimit = value;
    }

    /**
     * Gets the value of the timeApprover property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTimeApprover() {
        return timeApprover;
    }

    /**
     * Sets the value of the timeApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTimeApprover(RecordRef value) {
        this.timeApprover = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEmployeeType(RecordRef value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the isSalesRep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesRep() {
        return isSalesRep;
    }

    /**
     * Sets the value of the isSalesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesRep(Boolean value) {
        this.isSalesRep = value;
    }

    /**
     * Gets the value of the salesRole property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesRole() {
        return salesRole;
    }

    /**
     * Sets the value of the salesRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesRole(RecordRef value) {
        this.salesRole = value;
    }

    /**
     * Gets the value of the isSupportRep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupportRep() {
        return isSupportRep;
    }

    /**
     * Sets the value of the isSupportRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupportRep(Boolean value) {
        this.isSupportRep = value;
    }

    /**
     * Gets the value of the isJobResource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsJobResource() {
        return isJobResource;
    }

    /**
     * Sets the value of the isJobResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsJobResource(Boolean value) {
        this.isJobResource = value;
    }

    /**
     * Gets the value of the laborCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLaborCost() {
        return laborCost;
    }

    /**
     * Sets the value of the laborCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLaborCost(Double value) {
        this.laborCost = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the lastReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * Sets the value of the lastReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReviewDate(XMLGregorianCalendar value) {
        this.lastReviewDate = value;
    }

    /**
     * Gets the value of the nextReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextReviewDate() {
        return nextReviewDate;
    }

    /**
     * Sets the value of the nextReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextReviewDate(XMLGregorianCalendar value) {
        this.nextReviewDate = value;
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
     * Gets the value of the employeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * Sets the value of the employeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEmployeeStatus(RecordRef value) {
        this.employeeStatus = value;
    }

    /**
     * Gets the value of the jobDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * Sets the value of the jobDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescription(String value) {
        this.jobDescription = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setMaritalStatus(RecordRef value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the ethnicity property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEthnicity() {
        return ethnicity;
    }

    /**
     * Sets the value of the ethnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEthnicity(RecordRef value) {
        this.ethnicity = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the purchaseOrderApprover property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseOrderApprover() {
        return purchaseOrderApprover;
    }

    /**
     * Sets the value of the purchaseOrderApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseOrderApprover(RecordRef value) {
        this.purchaseOrderApprover = value;
    }

    /**
     * Gets the value of the workCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkCalendar() {
        return workCalendar;
    }

    /**
     * Sets the value of the workCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkCalendar(RecordRef value) {
        this.workCalendar = value;
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
     * Gets the value of the concurrentWebServicesUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcurrentWebServicesUser() {
        return concurrentWebServicesUser;
    }

    /**
     * Sets the value of the concurrentWebServicesUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcurrentWebServicesUser(Boolean value) {
        this.concurrentWebServicesUser = value;
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
     * Gets the value of the hasOfflineAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOfflineAccess() {
        return hasOfflineAccess;
    }

    /**
     * Sets the value of the hasOfflineAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOfflineAccess(Boolean value) {
        this.hasOfflineAccess = value;
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
     * Gets the value of the inheritIPRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritIPRules() {
        return inheritIPRules;
    }

    /**
     * Sets the value of the inheritIPRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritIPRules(Boolean value) {
        this.inheritIPRules = value;
    }

    /**
     * Gets the value of the ipAddressRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddressRule() {
        return ipAddressRule;
    }

    /**
     * Sets the value of the ipAddressRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddressRule(String value) {
        this.ipAddressRule = value;
    }

    /**
     * Gets the value of the commissionPaymentPreference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCommissionPaymentPreference }
     *     
     */
    public EmployeeCommissionPaymentPreference getCommissionPaymentPreference() {
        return commissionPaymentPreference;
    }

    /**
     * Sets the value of the commissionPaymentPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCommissionPaymentPreference }
     *     
     */
    public void setCommissionPaymentPreference(EmployeeCommissionPaymentPreference value) {
        this.commissionPaymentPreference = value;
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
     * Gets the value of the eligibleForCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForCommission() {
        return eligibleForCommission;
    }

    /**
     * Sets the value of the eligibleForCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForCommission(Boolean value) {
        this.eligibleForCommission = value;
    }

    /**
     * Gets the value of the subscriptionsList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSubscriptionsList }
     *     
     */
    public EmployeeSubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }

    /**
     * Sets the value of the subscriptionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSubscriptionsList }
     *     
     */
    public void setSubscriptionsList(EmployeeSubscriptionsList value) {
        this.subscriptionsList = value;
    }

    /**
     * Gets the value of the addressbookList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeAddressbookList }
     *     
     */
    public EmployeeAddressbookList getAddressbookList() {
        return addressbookList;
    }

    /**
     * Sets the value of the addressbookList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeAddressbookList }
     *     
     */
    public void setAddressbookList(EmployeeAddressbookList value) {
        this.addressbookList = value;
    }

    /**
     * Gets the value of the rolesList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRolesList }
     *     
     */
    public EmployeeRolesList getRolesList() {
        return rolesList;
    }

    /**
     * Sets the value of the rolesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRolesList }
     *     
     */
    public void setRolesList(EmployeeRolesList value) {
        this.rolesList = value;
    }

    /**
     * Gets the value of the hrEducationList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHrEducationList }
     *     
     */
    public EmployeeHrEducationList getHrEducationList() {
        return hrEducationList;
    }

    /**
     * Sets the value of the hrEducationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHrEducationList }
     *     
     */
    public void setHrEducationList(EmployeeHrEducationList value) {
        this.hrEducationList = value;
    }

    /**
     * Gets the value of the accruedTimeList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeAccruedTimeList }
     *     
     */
    public EmployeeAccruedTimeList getAccruedTimeList() {
        return accruedTimeList;
    }

    /**
     * Sets the value of the accruedTimeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeAccruedTimeList }
     *     
     */
    public void setAccruedTimeList(EmployeeAccruedTimeList value) {
        this.accruedTimeList = value;
    }

    /**
     * Gets the value of the directDepositList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDirectDepositList }
     *     
     */
    public EmployeeDirectDepositList getDirectDepositList() {
        return directDepositList;
    }

    /**
     * Sets the value of the directDepositList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDirectDepositList }
     *     
     */
    public void setDirectDepositList(EmployeeDirectDepositList value) {
        this.directDepositList = value;
    }

    /**
     * Gets the value of the companyContributionList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompanyContributionList }
     *     
     */
    public EmployeeCompanyContributionList getCompanyContributionList() {
        return companyContributionList;
    }

    /**
     * Sets the value of the companyContributionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompanyContributionList }
     *     
     */
    public void setCompanyContributionList(EmployeeCompanyContributionList value) {
        this.companyContributionList = value;
    }

    /**
     * Gets the value of the earningList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeEarningList }
     *     
     */
    public EmployeeEarningList getEarningList() {
        return earningList;
    }

    /**
     * Sets the value of the earningList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeEarningList }
     *     
     */
    public void setEarningList(EmployeeEarningList value) {
        this.earningList = value;
    }

    /**
     * Gets the value of the emergencyContactList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeEmergencyContactList }
     *     
     */
    public EmployeeEmergencyContactList getEmergencyContactList() {
        return emergencyContactList;
    }

    /**
     * Sets the value of the emergencyContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeEmergencyContactList }
     *     
     */
    public void setEmergencyContactList(EmployeeEmergencyContactList value) {
        this.emergencyContactList = value;
    }

    /**
     * Gets the value of the deductionList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDeductionList }
     *     
     */
    public EmployeeDeductionList getDeductionList() {
        return deductionList;
    }

    /**
     * Sets the value of the deductionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDeductionList }
     *     
     */
    public void setDeductionList(EmployeeDeductionList value) {
        this.deductionList = value;
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
