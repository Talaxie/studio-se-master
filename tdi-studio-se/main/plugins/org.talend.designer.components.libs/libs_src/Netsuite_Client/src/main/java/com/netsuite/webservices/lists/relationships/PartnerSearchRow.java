
package com.netsuite.webservices.lists.relationships;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common.FileSearchRowBasic;
import com.netsuite.webservices.platform.common.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common.PartnerSearchRowBasic;
import com.netsuite.webservices.platform.common.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for PartnerSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}PartnerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="campaignResponseJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesFromJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesToJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="opportunityJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerSearchRow", propOrder = {
    "basic",
    "campaignResponseJoin",
    "contactJoin",
    "contactPrimaryJoin",
    "customerJoin",
    "fileJoin",
    "messagesJoin",
    "messagesFromJoin",
    "messagesToJoin",
    "opportunityJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class PartnerSearchRow
    extends SearchRow
{

    protected PartnerSearchRowBasic basic;
    protected CampaignSearchRowBasic campaignResponseJoin;
    protected ContactSearchRowBasic contactJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected FileSearchRowBasic fileJoin;
    protected MessageSearchRowBasic messagesJoin;
    protected MessageSearchRowBasic messagesFromJoin;
    protected MessageSearchRowBasic messagesToJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public PartnerSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public void setBasic(PartnerSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the campaignResponseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }

    /**
     * Sets the value of the campaignResponseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setCampaignResponseJoin(CampaignSearchRowBasic value) {
        this.campaignResponseJoin = value;
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
     * Gets the value of the contactPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * Sets the value of the contactPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchRowBasic value) {
        this.contactPrimaryJoin = value;
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
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the messagesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * Sets the value of the messagesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchRowBasic value) {
        this.messagesJoin = value;
    }

    /**
     * Gets the value of the messagesFromJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }

    /**
     * Sets the value of the messagesFromJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesFromJoin(MessageSearchRowBasic value) {
        this.messagesFromJoin = value;
    }

    /**
     * Gets the value of the messagesToJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesToJoin() {
        return messagesToJoin;
    }

    /**
     * Sets the value of the messagesToJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesToJoin(MessageSearchRowBasic value) {
        this.messagesToJoin = value;
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
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
