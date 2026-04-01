
package com.netsuite.webservices.general.communication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common.EntitySearchRowBasic;
import com.netsuite.webservices.platform.common.FileSearchRowBasic;
import com.netsuite.webservices.platform.common.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common.OriginatingLeadSearchRowBasic;
import com.netsuite.webservices.platform.common.PartnerSearchRowBasic;
import com.netsuite.webservices.platform.common.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for MessageSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="attachmentsJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="authorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="campaignJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="caseJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="employeeJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="entityJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="opportunityJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}OriginatingLeadSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="partnerJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}PartnerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="recipientJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSearchRow", propOrder = {
    "basic",
    "attachmentsJoin",
    "authorJoin",
    "campaignJoin",
    "caseJoin",
    "contactJoin",
    "customerJoin",
    "employeeJoin",
    "entityJoin",
    "opportunityJoin",
    "originatingLeadJoin",
    "partnerJoin",
    "recipientJoin",
    "transactionJoin",
    "userJoin",
    "vendorJoin"
})
public class MessageSearchRow
    extends SearchRow
{

    protected MessageSearchRowBasic basic;
    protected FileSearchRowBasic attachmentsJoin;
    protected EntitySearchRowBasic authorJoin;
    protected CampaignSearchRowBasic campaignJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected ContactSearchRowBasic contactJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected EmployeeSearchRowBasic employeeJoin;
    protected EntitySearchRowBasic entityJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected OriginatingLeadSearchRowBasic originatingLeadJoin;
    protected PartnerSearchRowBasic partnerJoin;
    protected EntitySearchRowBasic recipientJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected VendorSearchRowBasic vendorJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setBasic(MessageSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the attachmentsJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getAttachmentsJoin() {
        return attachmentsJoin;
    }

    /**
     * Sets the value of the attachmentsJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setAttachmentsJoin(FileSearchRowBasic value) {
        this.attachmentsJoin = value;
    }

    /**
     * Gets the value of the authorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getAuthorJoin() {
        return authorJoin;
    }

    /**
     * Sets the value of the authorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setAuthorJoin(EntitySearchRowBasic value) {
        this.authorJoin = value;
    }

    /**
     * Gets the value of the campaignJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getCampaignJoin() {
        return campaignJoin;
    }

    /**
     * Sets the value of the campaignJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setCampaignJoin(CampaignSearchRowBasic value) {
        this.campaignJoin = value;
    }

    /**
     * Gets the value of the caseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * Sets the value of the caseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * Gets the value of the contactJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactJoin() {
        return contactJoin;
    }

    /**
     * Sets the value of the contactJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactJoin(ContactSearchRowBasic value) {
        this.contactJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the entityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getEntityJoin() {
        return entityJoin;
    }

    /**
     * Sets the value of the entityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setEntityJoin(EntitySearchRowBasic value) {
        this.entityJoin = value;
    }

    /**
     * Gets the value of the opportunityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * Sets the value of the opportunityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchRowBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * Gets the value of the originatingLeadJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * Sets the value of the originatingLeadJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic value) {
        this.originatingLeadJoin = value;
    }

    /**
     * Gets the value of the partnerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * Sets the value of the partnerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchRowBasic value) {
        this.partnerJoin = value;
    }

    /**
     * Gets the value of the recipientJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getRecipientJoin() {
        return recipientJoin;
    }

    /**
     * Sets the value of the recipientJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setRecipientJoin(EntitySearchRowBasic value) {
        this.recipientJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
        this.vendorJoin = value;
    }

}
