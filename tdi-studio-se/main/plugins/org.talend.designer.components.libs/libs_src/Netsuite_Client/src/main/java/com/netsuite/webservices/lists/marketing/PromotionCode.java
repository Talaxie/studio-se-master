
package com.netsuite.webservices.lists.marketing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.marketing.types.PromotionCodeApplyDiscountTo;
import com.netsuite.webservices.lists.marketing.types.PromotionCodeUseType;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for PromotionCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="implementation" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="useType" type="{urn:types.marketing_2014_2.lists.webservices.netsuite.com}PromotionCodeUseType" minOccurs="0"/&gt;
 *         &lt;element name="displayLineDiscounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberToGenerate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="discount" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="applyDiscountTo" type="{urn:types.marketing_2014_2.lists.webservices.netsuite.com}PromotionCodeApplyDiscountTo" minOccurs="0"/&gt;
 *         &lt;element name="freeShipMethod" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="minimumOrderAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="currencyList" type="{urn:marketing_2014_2.lists.webservices.netsuite.com}PromotionCodeCurrencyList" minOccurs="0"/&gt;
 *         &lt;element name="excludeItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemsList" type="{urn:marketing_2014_2.lists.webservices.netsuite.com}PromotionCodeItemsList" minOccurs="0"/&gt;
 *         &lt;element name="partnersList" type="{urn:marketing_2014_2.lists.webservices.netsuite.com}PromotionCodePartnersList" minOccurs="0"/&gt;
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
@XmlType(name = "PromotionCode", propOrder = {
    "implementation",
    "customForm",
    "useType",
    "displayLineDiscounts",
    "code",
    "codePattern",
    "numberToGenerate",
    "description",
    "isInactive",
    "discount",
    "rate",
    "discountType",
    "applyDiscountTo",
    "freeShipMethod",
    "minimumOrderAmount",
    "startDate",
    "endDate",
    "isPublic",
    "currencyList",
    "excludeItems",
    "name",
    "itemsList",
    "partnersList"
})
public class PromotionCode
    extends Record
{

    protected RecordRef implementation;
    protected RecordRef customForm;
    @XmlSchemaType(name = "string")
    protected PromotionCodeUseType useType;
    protected Boolean displayLineDiscounts;
    protected String code;
    protected String codePattern;
    protected Long numberToGenerate;
    protected String description;
    protected Boolean isInactive;
    protected RecordRef discount;
    protected String rate;
    protected Boolean discountType;
    @XmlSchemaType(name = "string")
    protected PromotionCodeApplyDiscountTo applyDiscountTo;
    protected RecordRef freeShipMethod;
    protected Double minimumOrderAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Boolean isPublic;
    protected PromotionCodeCurrencyList currencyList;
    protected Boolean excludeItems;
    protected String name;
    protected PromotionCodeItemsList itemsList;
    protected PromotionCodePartnersList partnersList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getImplementation() {
        return implementation;
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setImplementation(RecordRef value) {
        this.implementation = value;
    }

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
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeUseType }
     *     
     */
    public PromotionCodeUseType getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeUseType }
     *     
     */
    public void setUseType(PromotionCodeUseType value) {
        this.useType = value;
    }

    /**
     * Gets the value of the displayLineDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayLineDiscounts() {
        return displayLineDiscounts;
    }

    /**
     * Sets the value of the displayLineDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayLineDiscounts(Boolean value) {
        this.displayLineDiscounts = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the codePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePattern() {
        return codePattern;
    }

    /**
     * Sets the value of the codePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePattern(String value) {
        this.codePattern = value;
    }

    /**
     * Gets the value of the numberToGenerate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberToGenerate() {
        return numberToGenerate;
    }

    /**
     * Sets the value of the numberToGenerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberToGenerate(Long value) {
        this.numberToGenerate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDiscount(RecordRef value) {
        this.discount = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountType(Boolean value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the applyDiscountTo property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeApplyDiscountTo }
     *     
     */
    public PromotionCodeApplyDiscountTo getApplyDiscountTo() {
        return applyDiscountTo;
    }

    /**
     * Sets the value of the applyDiscountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeApplyDiscountTo }
     *     
     */
    public void setApplyDiscountTo(PromotionCodeApplyDiscountTo value) {
        this.applyDiscountTo = value;
    }

    /**
     * Gets the value of the freeShipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFreeShipMethod() {
        return freeShipMethod;
    }

    /**
     * Sets the value of the freeShipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFreeShipMethod(RecordRef value) {
        this.freeShipMethod = value;
    }

    /**
     * Gets the value of the minimumOrderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumOrderAmount() {
        return minimumOrderAmount;
    }

    /**
     * Sets the value of the minimumOrderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumOrderAmount(Double value) {
        this.minimumOrderAmount = value;
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
     * Gets the value of the isPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the currencyList property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeCurrencyList }
     *     
     */
    public PromotionCodeCurrencyList getCurrencyList() {
        return currencyList;
    }

    /**
     * Sets the value of the currencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeCurrencyList }
     *     
     */
    public void setCurrencyList(PromotionCodeCurrencyList value) {
        this.currencyList = value;
    }

    /**
     * Gets the value of the excludeItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeItems() {
        return excludeItems;
    }

    /**
     * Sets the value of the excludeItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeItems(Boolean value) {
        this.excludeItems = value;
    }

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
     * Gets the value of the itemsList property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeItemsList }
     *     
     */
    public PromotionCodeItemsList getItemsList() {
        return itemsList;
    }

    /**
     * Sets the value of the itemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeItemsList }
     *     
     */
    public void setItemsList(PromotionCodeItemsList value) {
        this.itemsList = value;
    }

    /**
     * Gets the value of the partnersList property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodePartnersList }
     *     
     */
    public PromotionCodePartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * Sets the value of the partnersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodePartnersList }
     *     
     */
    public void setPartnersList(PromotionCodePartnersList value) {
        this.partnersList = value;
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
