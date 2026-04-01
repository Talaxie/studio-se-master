
package com.netsuite.webservices.lists.marketing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.CampaignSearchBasic;
import com.netsuite.webservices.platform.common.CustomSearchJoin;
import com.netsuite.webservices.platform.common.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common.EntitySearchBasic;
import com.netsuite.webservices.platform.common.FileSearchBasic;
import com.netsuite.webservices.platform.common.MessageSearchBasic;
import com.netsuite.webservices.platform.common.NoteSearchBasic;
import com.netsuite.webservices.platform.common.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common.PromotionCodeSearchBasic;
import com.netsuite.webservices.platform.common.TransactionSearchBasic;
import com.netsuite.webservices.platform.core.SearchRecord;


/**
 * <p>Java class for CampaignSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="campaignRecipientJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="messagesJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}OriginatingLeadSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="promotionCodeJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}PromotionCodeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignSearch", propOrder = {
    "basic",
    "campaignRecipientJoin",
    "fileJoin",
    "messagesJoin",
    "originatingLeadJoin",
    "promotionCodeJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class CampaignSearch
    extends SearchRecord
{

    protected CampaignSearchBasic basic;
    protected EntitySearchBasic campaignRecipientJoin;
    protected FileSearchBasic fileJoin;
    protected MessageSearchBasic messagesJoin;
    protected OriginatingLeadSearchBasic originatingLeadJoin;
    protected PromotionCodeSearchBasic promotionCodeJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setBasic(CampaignSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the campaignRecipientJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getCampaignRecipientJoin() {
        return campaignRecipientJoin;
    }

    /**
     * Sets the value of the campaignRecipientJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setCampaignRecipientJoin(EntitySearchBasic value) {
        this.campaignRecipientJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setFileJoin(FileSearchBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the messagesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * Sets the value of the messagesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchBasic value) {
        this.messagesJoin = value;
    }

    /**
     * Gets the value of the originatingLeadJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchBasic }
     *     
     */
    public OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * Sets the value of the originatingLeadJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchBasic value) {
        this.originatingLeadJoin = value;
    }

    /**
     * Gets the value of the promotionCodeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeSearchBasic }
     *     
     */
    public PromotionCodeSearchBasic getPromotionCodeJoin() {
        return promotionCodeJoin;
    }

    /**
     * Sets the value of the promotionCodeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeSearchBasic }
     *     
     */
    public void setPromotionCodeJoin(PromotionCodeSearchBasic value) {
        this.promotionCodeJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchBasic }
     *     
     */
    public NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchBasic value) {
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
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
