
package com.netsuite.webservices.lists.accounting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.Address;
import com.netsuite.webservices.platform.common.types.Country;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for Subsidiary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subsidiary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showSubsidiaryName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="logo" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="tranPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageLogo" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}Country" minOccurs="0"/&gt;
 *         &lt;element name="mainAddress" type="{urn:common_2014_2.platform.webservices.netsuite.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddress" type="{urn:common_2014_2.platform.webservices.netsuite.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="returnAddress" type="{urn:common_2014_2.platform.webservices.netsuite.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isElimination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fiscalCalendar" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="taxFiscalCalendar" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="allowPayroll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receiptQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="federalIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addrLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonConsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state1TaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssnOrTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interCoAccount" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="nexusList" type="{urn:accounting_2014_2.lists.webservices.netsuite.com}SubsidiaryNexusList" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookDetailList" type="{urn:accounting_2014_2.lists.webservices.netsuite.com}SubsidiaryAccountingBookDetailList" minOccurs="0"/&gt;
 *         &lt;element name="checkLayout" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="inboundEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classTranslationList" type="{urn:accounting_2014_2.lists.webservices.netsuite.com}ClassTranslationList" minOccurs="0"/&gt;
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
@XmlType(name = "Subsidiary", propOrder = {
    "name",
    "parent",
    "isInactive",
    "showSubsidiaryName",
    "url",
    "logo",
    "tranPrefix",
    "pageLogo",
    "state",
    "country",
    "mainAddress",
    "shippingAddress",
    "returnAddress",
    "legalName",
    "isElimination",
    "fiscalCalendar",
    "taxFiscalCalendar",
    "allowPayroll",
    "email",
    "currency",
    "purchaseOrderQuantity",
    "purchaseOrderAmount",
    "purchaseOrderQuantityDiff",
    "receiptQuantity",
    "receiptAmount",
    "receiptQuantityDiff",
    "fax",
    "edition",
    "federalIdNumber",
    "addrLanguage",
    "nonConsol",
    "consol",
    "state1TaxNumber",
    "ssnOrTin",
    "interCoAccount",
    "nexusList",
    "accountingBookDetailList",
    "checkLayout",
    "inboundEmail",
    "classTranslationList",
    "customFieldList"
})
public class Subsidiary
    extends Record
{

    protected String name;
    protected RecordRef parent;
    protected Boolean isInactive;
    protected Boolean showSubsidiaryName;
    protected String url;
    protected RecordRef logo;
    protected String tranPrefix;
    protected RecordRef pageLogo;
    protected String state;
    @XmlSchemaType(name = "string")
    protected Country country;
    protected Address mainAddress;
    protected Address shippingAddress;
    protected Address returnAddress;
    protected String legalName;
    protected Boolean isElimination;
    protected RecordRef fiscalCalendar;
    protected RecordRef taxFiscalCalendar;
    protected Boolean allowPayroll;
    protected String email;
    protected RecordRef currency;
    protected Double purchaseOrderQuantity;
    protected Double purchaseOrderAmount;
    protected Double purchaseOrderQuantityDiff;
    protected Double receiptQuantity;
    protected Double receiptAmount;
    protected Double receiptQuantityDiff;
    protected String fax;
    protected String edition;
    protected String federalIdNumber;
    protected String addrLanguage;
    protected String nonConsol;
    protected String consol;
    protected String state1TaxNumber;
    protected String ssnOrTin;
    protected RecordRef interCoAccount;
    protected SubsidiaryNexusList nexusList;
    protected SubsidiaryAccountingBookDetailList accountingBookDetailList;
    protected RecordRef checkLayout;
    protected String inboundEmail;
    protected ClassTranslationList classTranslationList;
    protected CustomFieldList customFieldList;
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
     * Gets the value of the showSubsidiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSubsidiaryName() {
        return showSubsidiaryName;
    }

    /**
     * Sets the value of the showSubsidiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSubsidiaryName(Boolean value) {
        this.showSubsidiaryName = value;
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
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLogo(RecordRef value) {
        this.logo = value;
    }

    /**
     * Gets the value of the tranPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranPrefix() {
        return tranPrefix;
    }

    /**
     * Sets the value of the tranPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranPrefix(String value) {
        this.tranPrefix = value;
    }

    /**
     * Gets the value of the pageLogo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPageLogo() {
        return pageLogo;
    }

    /**
     * Sets the value of the pageLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPageLogo(RecordRef value) {
        this.pageLogo = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the mainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the value of the mainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMainAddress(Address value) {
        this.mainAddress = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the returnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReturnAddress() {
        return returnAddress;
    }

    /**
     * Sets the value of the returnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReturnAddress(Address value) {
        this.returnAddress = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the isElimination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsElimination() {
        return isElimination;
    }

    /**
     * Sets the value of the isElimination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsElimination(Boolean value) {
        this.isElimination = value;
    }

    /**
     * Gets the value of the fiscalCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFiscalCalendar() {
        return fiscalCalendar;
    }

    /**
     * Sets the value of the fiscalCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFiscalCalendar(RecordRef value) {
        this.fiscalCalendar = value;
    }

    /**
     * Gets the value of the taxFiscalCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxFiscalCalendar() {
        return taxFiscalCalendar;
    }

    /**
     * Sets the value of the taxFiscalCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxFiscalCalendar(RecordRef value) {
        this.taxFiscalCalendar = value;
    }

    /**
     * Gets the value of the allowPayroll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPayroll() {
        return allowPayroll;
    }

    /**
     * Sets the value of the allowPayroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPayroll(Boolean value) {
        this.allowPayroll = value;
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
     * Gets the value of the purchaseOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }

    /**
     * Sets the value of the purchaseOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantity(Double value) {
        this.purchaseOrderQuantity = value;
    }

    /**
     * Gets the value of the purchaseOrderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }

    /**
     * Sets the value of the purchaseOrderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderAmount(Double value) {
        this.purchaseOrderAmount = value;
    }

    /**
     * Gets the value of the purchaseOrderQuantityDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }

    /**
     * Sets the value of the purchaseOrderQuantityDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantityDiff(Double value) {
        this.purchaseOrderQuantityDiff = value;
    }

    /**
     * Gets the value of the receiptQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * Sets the value of the receiptQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantity(Double value) {
        this.receiptQuantity = value;
    }

    /**
     * Gets the value of the receiptAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * Sets the value of the receiptAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptAmount(Double value) {
        this.receiptAmount = value;
    }

    /**
     * Gets the value of the receiptQuantityDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }

    /**
     * Sets the value of the receiptQuantityDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantityDiff(Double value) {
        this.receiptQuantityDiff = value;
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
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the federalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalIdNumber() {
        return federalIdNumber;
    }

    /**
     * Sets the value of the federalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalIdNumber(String value) {
        this.federalIdNumber = value;
    }

    /**
     * Gets the value of the addrLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLanguage() {
        return addrLanguage;
    }

    /**
     * Sets the value of the addrLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLanguage(String value) {
        this.addrLanguage = value;
    }

    /**
     * Gets the value of the nonConsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonConsol() {
        return nonConsol;
    }

    /**
     * Sets the value of the nonConsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonConsol(String value) {
        this.nonConsol = value;
    }

    /**
     * Gets the value of the consol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsol() {
        return consol;
    }

    /**
     * Sets the value of the consol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsol(String value) {
        this.consol = value;
    }

    /**
     * Gets the value of the state1TaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState1TaxNumber() {
        return state1TaxNumber;
    }

    /**
     * Sets the value of the state1TaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState1TaxNumber(String value) {
        this.state1TaxNumber = value;
    }

    /**
     * Gets the value of the ssnOrTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnOrTin() {
        return ssnOrTin;
    }

    /**
     * Sets the value of the ssnOrTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnOrTin(String value) {
        this.ssnOrTin = value;
    }

    /**
     * Gets the value of the interCoAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInterCoAccount() {
        return interCoAccount;
    }

    /**
     * Sets the value of the interCoAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInterCoAccount(RecordRef value) {
        this.interCoAccount = value;
    }

    /**
     * Gets the value of the nexusList property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryNexusList }
     *     
     */
    public SubsidiaryNexusList getNexusList() {
        return nexusList;
    }

    /**
     * Sets the value of the nexusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryNexusList }
     *     
     */
    public void setNexusList(SubsidiaryNexusList value) {
        this.nexusList = value;
    }

    /**
     * Gets the value of the accountingBookDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryAccountingBookDetailList }
     *     
     */
    public SubsidiaryAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * Sets the value of the accountingBookDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryAccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(SubsidiaryAccountingBookDetailList value) {
        this.accountingBookDetailList = value;
    }

    /**
     * Gets the value of the checkLayout property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCheckLayout() {
        return checkLayout;
    }

    /**
     * Sets the value of the checkLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCheckLayout(RecordRef value) {
        this.checkLayout = value;
    }

    /**
     * Gets the value of the inboundEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundEmail() {
        return inboundEmail;
    }

    /**
     * Sets the value of the inboundEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundEmail(String value) {
        this.inboundEmail = value;
    }

    /**
     * Gets the value of the classTranslationList property.
     * 
     * @return
     *     possible object is
     *     {@link ClassTranslationList }
     *     
     */
    public ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }

    /**
     * Sets the value of the classTranslationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTranslationList }
     *     
     */
    public void setClassTranslationList(ClassTranslationList value) {
        this.classTranslationList = value;
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
