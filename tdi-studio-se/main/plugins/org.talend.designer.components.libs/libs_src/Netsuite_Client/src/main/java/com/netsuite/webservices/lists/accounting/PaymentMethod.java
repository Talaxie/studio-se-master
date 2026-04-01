
package com.netsuite.webservices.lists.accounting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.platform.core.RecordRefList;


/**
 * <p>Java class for PaymentMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="undepFunds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="visualsList" type="{urn:accounting_2014_2.lists.webservices.netsuite.com}PaymentMethodVisualsList" minOccurs="0"/&gt;
 *         &lt;element name="isDebitCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="merchantAccountsList" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="payPalEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expressCheckoutArrangement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useExpressCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentMethod", propOrder = {
    "name",
    "creditCard",
    "undepFunds",
    "account",
    "isInactive",
    "isOnline",
    "visualsList",
    "isDebitCard",
    "merchantAccountsList",
    "payPalEmailAddress",
    "expressCheckoutArrangement",
    "useExpressCheckout"
})
public class PaymentMethod
    extends Record
{

    protected String name;
    protected Boolean creditCard;
    protected Boolean undepFunds;
    protected RecordRef account;
    protected Boolean isInactive;
    protected Boolean isOnline;
    protected PaymentMethodVisualsList visualsList;
    protected Boolean isDebitCard;
    protected RecordRefList merchantAccountsList;
    protected String payPalEmailAddress;
    protected String expressCheckoutArrangement;
    protected Boolean useExpressCheckout;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditCard(Boolean value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the undepFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUndepFunds() {
        return undepFunds;
    }

    /**
     * Sets the value of the undepFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndepFunds(Boolean value) {
        this.undepFunds = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccount(RecordRef value) {
        this.account = value;
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
     * Gets the value of the isOnline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnline() {
        return isOnline;
    }

    /**
     * Sets the value of the isOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnline(Boolean value) {
        this.isOnline = value;
    }

    /**
     * Gets the value of the visualsList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodVisualsList }
     *     
     */
    public PaymentMethodVisualsList getVisualsList() {
        return visualsList;
    }

    /**
     * Sets the value of the visualsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodVisualsList }
     *     
     */
    public void setVisualsList(PaymentMethodVisualsList value) {
        this.visualsList = value;
    }

    /**
     * Gets the value of the isDebitCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDebitCard() {
        return isDebitCard;
    }

    /**
     * Sets the value of the isDebitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDebitCard(Boolean value) {
        this.isDebitCard = value;
    }

    /**
     * Gets the value of the merchantAccountsList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getMerchantAccountsList() {
        return merchantAccountsList;
    }

    /**
     * Sets the value of the merchantAccountsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setMerchantAccountsList(RecordRefList value) {
        this.merchantAccountsList = value;
    }

    /**
     * Gets the value of the payPalEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalEmailAddress() {
        return payPalEmailAddress;
    }

    /**
     * Sets the value of the payPalEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalEmailAddress(String value) {
        this.payPalEmailAddress = value;
    }

    /**
     * Gets the value of the expressCheckoutArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressCheckoutArrangement() {
        return expressCheckoutArrangement;
    }

    /**
     * Sets the value of the expressCheckoutArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressCheckoutArrangement(String value) {
        this.expressCheckoutArrangement = value;
    }

    /**
     * Gets the value of the useExpressCheckout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseExpressCheckout() {
        return useExpressCheckout;
    }

    /**
     * Sets the value of the useExpressCheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExpressCheckout(Boolean value) {
        this.useExpressCheckout = value;
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
