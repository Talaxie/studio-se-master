
package com.netsuite.webservices.lists.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.support.types.IssueTrackCode;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.platform.core.RecordRefList;


/**
 * <p>Java class for Issue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Issue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="issueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="issueType" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="module" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="productTeam" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="reportedBy" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="reproduce" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="versionBroken" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="buildBroken" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="versionTarget" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="buildTarget" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="versionFixed" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="buildFixed" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="severity" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isShowStopper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="assigned" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="reviewer" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isReviewed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="issueStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="issueTagsList" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="issueAbstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="trackCode" type="{urn:types.support_2014_2.lists.webservices.netsuite.com}IssueTrackCode" minOccurs="0"/&gt;
 *         &lt;element name="emailAssignee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="emailEmployeesList" type="{urn:support_2014_2.lists.webservices.netsuite.com}EmailEmployeesList" minOccurs="0"/&gt;
 *         &lt;element name="emailCellsList" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="externalAbstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brokenInVersionList" type="{urn:support_2014_2.lists.webservices.netsuite.com}IssueVersionList" minOccurs="0"/&gt;
 *         &lt;element name="targetVersionList" type="{urn:support_2014_2.lists.webservices.netsuite.com}IssueVersionList" minOccurs="0"/&gt;
 *         &lt;element name="fixedInVersionList" type="{urn:support_2014_2.lists.webservices.netsuite.com}IssueVersionList" minOccurs="0"/&gt;
 *         &lt;element name="relatedIssuesList" type="{urn:support_2014_2.lists.webservices.netsuite.com}IssueRelatedIssuesList" minOccurs="0"/&gt;
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
@XmlType(name = "Issue", propOrder = {
    "customForm",
    "issueNumber",
    "createdDate",
    "issueType",
    "product",
    "module",
    "item",
    "productTeam",
    "source",
    "reportedBy",
    "reproduce",
    "versionBroken",
    "buildBroken",
    "versionTarget",
    "buildTarget",
    "versionFixed",
    "buildFixed",
    "severity",
    "priority",
    "isShowStopper",
    "assigned",
    "reviewer",
    "isReviewed",
    "issueStatus",
    "lastModifiedDate",
    "issueTagsList",
    "issueAbstract",
    "newDetails",
    "isOwner",
    "trackCode",
    "emailAssignee",
    "emailEmployeesList",
    "emailCellsList",
    "externalAbstract",
    "externalDetails",
    "brokenInVersionList",
    "targetVersionList",
    "fixedInVersionList",
    "relatedIssuesList",
    "customFieldList"
})
public class Issue
    extends Record
{

    protected RecordRef customForm;
    protected String issueNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected RecordRef issueType;
    protected RecordRef product;
    protected RecordRef module;
    protected RecordRef item;
    protected RecordRef productTeam;
    protected RecordRef source;
    protected RecordRef reportedBy;
    protected RecordRef reproduce;
    protected RecordRef versionBroken;
    protected RecordRef buildBroken;
    protected RecordRef versionTarget;
    protected RecordRef buildTarget;
    protected RecordRef versionFixed;
    protected RecordRef buildFixed;
    protected RecordRef severity;
    protected RecordRef priority;
    protected Boolean isShowStopper;
    protected RecordRef assigned;
    protected RecordRef reviewer;
    protected Boolean isReviewed;
    protected RecordRef issueStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRefList issueTagsList;
    protected String issueAbstract;
    protected String newDetails;
    protected Boolean isOwner;
    @XmlSchemaType(name = "string")
    protected IssueTrackCode trackCode;
    protected Boolean emailAssignee;
    protected EmailEmployeesList emailEmployeesList;
    protected RecordRefList emailCellsList;
    protected String externalAbstract;
    protected String externalDetails;
    protected IssueVersionList brokenInVersionList;
    protected IssueVersionList targetVersionList;
    protected IssueVersionList fixedInVersionList;
    protected IssueRelatedIssuesList relatedIssuesList;
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
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueType(RecordRef value) {
        this.issueType = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProduct(RecordRef value) {
        this.product = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setModule(RecordRef value) {
        this.module = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * Gets the value of the productTeam property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProductTeam() {
        return productTeam;
    }

    /**
     * Sets the value of the productTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProductTeam(RecordRef value) {
        this.productTeam = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSource(RecordRef value) {
        this.source = value;
    }

    /**
     * Gets the value of the reportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReportedBy() {
        return reportedBy;
    }

    /**
     * Sets the value of the reportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReportedBy(RecordRef value) {
        this.reportedBy = value;
    }

    /**
     * Gets the value of the reproduce property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReproduce() {
        return reproduce;
    }

    /**
     * Sets the value of the reproduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReproduce(RecordRef value) {
        this.reproduce = value;
    }

    /**
     * Gets the value of the versionBroken property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVersionBroken() {
        return versionBroken;
    }

    /**
     * Sets the value of the versionBroken property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVersionBroken(RecordRef value) {
        this.versionBroken = value;
    }

    /**
     * Gets the value of the buildBroken property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuildBroken() {
        return buildBroken;
    }

    /**
     * Sets the value of the buildBroken property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuildBroken(RecordRef value) {
        this.buildBroken = value;
    }

    /**
     * Gets the value of the versionTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVersionTarget() {
        return versionTarget;
    }

    /**
     * Sets the value of the versionTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVersionTarget(RecordRef value) {
        this.versionTarget = value;
    }

    /**
     * Gets the value of the buildTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuildTarget() {
        return buildTarget;
    }

    /**
     * Sets the value of the buildTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuildTarget(RecordRef value) {
        this.buildTarget = value;
    }

    /**
     * Gets the value of the versionFixed property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVersionFixed() {
        return versionFixed;
    }

    /**
     * Sets the value of the versionFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVersionFixed(RecordRef value) {
        this.versionFixed = value;
    }

    /**
     * Gets the value of the buildFixed property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuildFixed() {
        return buildFixed;
    }

    /**
     * Sets the value of the buildFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuildFixed(RecordRef value) {
        this.buildFixed = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSeverity(RecordRef value) {
        this.severity = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPriority(RecordRef value) {
        this.priority = value;
    }

    /**
     * Gets the value of the isShowStopper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowStopper() {
        return isShowStopper;
    }

    /**
     * Sets the value of the isShowStopper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowStopper(Boolean value) {
        this.isShowStopper = value;
    }

    /**
     * Gets the value of the assigned property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAssigned() {
        return assigned;
    }

    /**
     * Sets the value of the assigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAssigned(RecordRef value) {
        this.assigned = value;
    }

    /**
     * Gets the value of the reviewer property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReviewer() {
        return reviewer;
    }

    /**
     * Sets the value of the reviewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReviewer(RecordRef value) {
        this.reviewer = value;
    }

    /**
     * Gets the value of the isReviewed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReviewed() {
        return isReviewed;
    }

    /**
     * Sets the value of the isReviewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReviewed(Boolean value) {
        this.isReviewed = value;
    }

    /**
     * Gets the value of the issueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueStatus() {
        return issueStatus;
    }

    /**
     * Sets the value of the issueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueStatus(RecordRef value) {
        this.issueStatus = value;
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
     * Gets the value of the issueTagsList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getIssueTagsList() {
        return issueTagsList;
    }

    /**
     * Sets the value of the issueTagsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setIssueTagsList(RecordRefList value) {
        this.issueTagsList = value;
    }

    /**
     * Gets the value of the issueAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueAbstract() {
        return issueAbstract;
    }

    /**
     * Sets the value of the issueAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueAbstract(String value) {
        this.issueAbstract = value;
    }

    /**
     * Gets the value of the newDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDetails() {
        return newDetails;
    }

    /**
     * Sets the value of the newDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDetails(String value) {
        this.newDetails = value;
    }

    /**
     * Gets the value of the isOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
    }

    /**
     * Gets the value of the trackCode property.
     * 
     * @return
     *     possible object is
     *     {@link IssueTrackCode }
     *     
     */
    public IssueTrackCode getTrackCode() {
        return trackCode;
    }

    /**
     * Sets the value of the trackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTrackCode }
     *     
     */
    public void setTrackCode(IssueTrackCode value) {
        this.trackCode = value;
    }

    /**
     * Gets the value of the emailAssignee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailAssignee() {
        return emailAssignee;
    }

    /**
     * Sets the value of the emailAssignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailAssignee(Boolean value) {
        this.emailAssignee = value;
    }

    /**
     * Gets the value of the emailEmployeesList property.
     * 
     * @return
     *     possible object is
     *     {@link EmailEmployeesList }
     *     
     */
    public EmailEmployeesList getEmailEmployeesList() {
        return emailEmployeesList;
    }

    /**
     * Sets the value of the emailEmployeesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailEmployeesList }
     *     
     */
    public void setEmailEmployeesList(EmailEmployeesList value) {
        this.emailEmployeesList = value;
    }

    /**
     * Gets the value of the emailCellsList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getEmailCellsList() {
        return emailCellsList;
    }

    /**
     * Sets the value of the emailCellsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setEmailCellsList(RecordRefList value) {
        this.emailCellsList = value;
    }

    /**
     * Gets the value of the externalAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAbstract() {
        return externalAbstract;
    }

    /**
     * Sets the value of the externalAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAbstract(String value) {
        this.externalAbstract = value;
    }

    /**
     * Gets the value of the externalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDetails() {
        return externalDetails;
    }

    /**
     * Sets the value of the externalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDetails(String value) {
        this.externalDetails = value;
    }

    /**
     * Gets the value of the brokenInVersionList property.
     * 
     * @return
     *     possible object is
     *     {@link IssueVersionList }
     *     
     */
    public IssueVersionList getBrokenInVersionList() {
        return brokenInVersionList;
    }

    /**
     * Sets the value of the brokenInVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueVersionList }
     *     
     */
    public void setBrokenInVersionList(IssueVersionList value) {
        this.brokenInVersionList = value;
    }

    /**
     * Gets the value of the targetVersionList property.
     * 
     * @return
     *     possible object is
     *     {@link IssueVersionList }
     *     
     */
    public IssueVersionList getTargetVersionList() {
        return targetVersionList;
    }

    /**
     * Sets the value of the targetVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueVersionList }
     *     
     */
    public void setTargetVersionList(IssueVersionList value) {
        this.targetVersionList = value;
    }

    /**
     * Gets the value of the fixedInVersionList property.
     * 
     * @return
     *     possible object is
     *     {@link IssueVersionList }
     *     
     */
    public IssueVersionList getFixedInVersionList() {
        return fixedInVersionList;
    }

    /**
     * Sets the value of the fixedInVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueVersionList }
     *     
     */
    public void setFixedInVersionList(IssueVersionList value) {
        this.fixedInVersionList = value;
    }

    /**
     * Gets the value of the relatedIssuesList property.
     * 
     * @return
     *     possible object is
     *     {@link IssueRelatedIssuesList }
     *     
     */
    public IssueRelatedIssuesList getRelatedIssuesList() {
        return relatedIssuesList;
    }

    /**
     * Sets the value of the relatedIssuesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueRelatedIssuesList }
     *     
     */
    public void setRelatedIssuesList(IssueRelatedIssuesList value) {
        this.relatedIssuesList = value;
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
