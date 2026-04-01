
package com.netsuite.webservices.platform.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchBooleanField;
import com.netsuite.webservices.platform.core.SearchDateField;
import com.netsuite.webservices.platform.core.SearchDoubleField;
import com.netsuite.webservices.platform.core.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core.SearchLongField;
import com.netsuite.webservices.platform.core.SearchMultiSelectField;
import com.netsuite.webservices.platform.core.SearchRecordBasic;
import com.netsuite.webservices.platform.core.SearchStringField;


/**
 * <p>Java class for RevRecScheduleSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevRecScheduleSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountingBook" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="amorStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="amortizedAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="amorType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="deferredAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="destAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="initialAmt" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="isRecognized" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="jeDoc" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="pctComplete" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="pctRecognition" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="periodOffset" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="postPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="schedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="scheduleNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="scheduleNumberText" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="sourceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="srcTranPostPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="srcTranType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="startOffset" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="templateName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="useForeignAmounts" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevRecScheduleSearchBasic", propOrder = {
    "accountingBook",
    "amorStatus",
    "amortizedAmount",
    "amorType",
    "amount",
    "currency",
    "deferredAmount",
    "destAcct",
    "initialAmt",
    "internalId",
    "internalIdNumber",
    "isRecognized",
    "jeDoc",
    "name",
    "pctComplete",
    "pctRecognition",
    "periodOffset",
    "postPeriod",
    "schedDate",
    "scheduleNumber",
    "scheduleNumberText",
    "sourceAcct",
    "srcTranPostPeriod",
    "srcTranType",
    "startOffset",
    "templateName",
    "useForeignAmounts"
})
public class RevRecScheduleSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField accountingBook;
    protected SearchEnumMultiSelectField amorStatus;
    protected SearchDoubleField amortizedAmount;
    protected SearchEnumMultiSelectField amorType;
    protected SearchDoubleField amount;
    protected SearchMultiSelectField currency;
    protected SearchDoubleField deferredAmount;
    protected SearchMultiSelectField destAcct;
    protected SearchDoubleField initialAmt;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isRecognized;
    protected SearchMultiSelectField jeDoc;
    protected SearchStringField name;
    protected SearchDoubleField pctComplete;
    protected SearchDoubleField pctRecognition;
    protected SearchLongField periodOffset;
    protected SearchMultiSelectField postPeriod;
    protected SearchDateField schedDate;
    protected SearchLongField scheduleNumber;
    protected SearchStringField scheduleNumberText;
    protected SearchMultiSelectField sourceAcct;
    protected SearchMultiSelectField srcTranPostPeriod;
    protected SearchMultiSelectField srcTranType;
    protected SearchLongField startOffset;
    protected SearchStringField templateName;
    protected SearchBooleanField useForeignAmounts;

    /**
     * Gets the value of the accountingBook property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }

    /**
     * Sets the value of the accountingBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBook(SearchMultiSelectField value) {
        this.accountingBook = value;
    }

    /**
     * Gets the value of the amorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAmorStatus() {
        return amorStatus;
    }

    /**
     * Sets the value of the amorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAmorStatus(SearchEnumMultiSelectField value) {
        this.amorStatus = value;
    }

    /**
     * Gets the value of the amortizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmortizedAmount() {
        return amortizedAmount;
    }

    /**
     * Sets the value of the amortizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmortizedAmount(SearchDoubleField value) {
        this.amortizedAmount = value;
    }

    /**
     * Gets the value of the amorType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAmorType() {
        return amorType;
    }

    /**
     * Sets the value of the amorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAmorType(SearchEnumMultiSelectField value) {
        this.amorType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmount(SearchDoubleField value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCurrency(SearchMultiSelectField value) {
        this.currency = value;
    }

    /**
     * Gets the value of the deferredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDeferredAmount() {
        return deferredAmount;
    }

    /**
     * Sets the value of the deferredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDeferredAmount(SearchDoubleField value) {
        this.deferredAmount = value;
    }

    /**
     * Gets the value of the destAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDestAcct() {
        return destAcct;
    }

    /**
     * Sets the value of the destAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDestAcct(SearchMultiSelectField value) {
        this.destAcct = value;
    }

    /**
     * Gets the value of the initialAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getInitialAmt() {
        return initialAmt;
    }

    /**
     * Sets the value of the initialAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setInitialAmt(SearchDoubleField value) {
        this.initialAmt = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the isRecognized property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsRecognized() {
        return isRecognized;
    }

    /**
     * Sets the value of the isRecognized property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsRecognized(SearchBooleanField value) {
        this.isRecognized = value;
    }

    /**
     * Gets the value of the jeDoc property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getJeDoc() {
        return jeDoc;
    }

    /**
     * Sets the value of the jeDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setJeDoc(SearchMultiSelectField value) {
        this.jeDoc = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setName(SearchStringField value) {
        this.name = value;
    }

    /**
     * Gets the value of the pctComplete property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPctComplete() {
        return pctComplete;
    }

    /**
     * Sets the value of the pctComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPctComplete(SearchDoubleField value) {
        this.pctComplete = value;
    }

    /**
     * Gets the value of the pctRecognition property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPctRecognition() {
        return pctRecognition;
    }

    /**
     * Sets the value of the pctRecognition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPctRecognition(SearchDoubleField value) {
        this.pctRecognition = value;
    }

    /**
     * Gets the value of the periodOffset property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPeriodOffset() {
        return periodOffset;
    }

    /**
     * Sets the value of the periodOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPeriodOffset(SearchLongField value) {
        this.periodOffset = value;
    }

    /**
     * Gets the value of the postPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPostPeriod() {
        return postPeriod;
    }

    /**
     * Sets the value of the postPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPostPeriod(SearchMultiSelectField value) {
        this.postPeriod = value;
    }

    /**
     * Gets the value of the schedDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getSchedDate() {
        return schedDate;
    }

    /**
     * Sets the value of the schedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setSchedDate(SearchDateField value) {
        this.schedDate = value;
    }

    /**
     * Gets the value of the scheduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getScheduleNumber() {
        return scheduleNumber;
    }

    /**
     * Sets the value of the scheduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setScheduleNumber(SearchLongField value) {
        this.scheduleNumber = value;
    }

    /**
     * Gets the value of the scheduleNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getScheduleNumberText() {
        return scheduleNumberText;
    }

    /**
     * Sets the value of the scheduleNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setScheduleNumberText(SearchStringField value) {
        this.scheduleNumberText = value;
    }

    /**
     * Gets the value of the sourceAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSourceAcct() {
        return sourceAcct;
    }

    /**
     * Sets the value of the sourceAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSourceAcct(SearchMultiSelectField value) {
        this.sourceAcct = value;
    }

    /**
     * Gets the value of the srcTranPostPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSrcTranPostPeriod() {
        return srcTranPostPeriod;
    }

    /**
     * Sets the value of the srcTranPostPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSrcTranPostPeriod(SearchMultiSelectField value) {
        this.srcTranPostPeriod = value;
    }

    /**
     * Gets the value of the srcTranType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSrcTranType() {
        return srcTranType;
    }

    /**
     * Sets the value of the srcTranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSrcTranType(SearchMultiSelectField value) {
        this.srcTranType = value;
    }

    /**
     * Gets the value of the startOffset property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getStartOffset() {
        return startOffset;
    }

    /**
     * Sets the value of the startOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setStartOffset(SearchLongField value) {
        this.startOffset = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTemplateName(SearchStringField value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the useForeignAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseForeignAmounts() {
        return useForeignAmounts;
    }

    /**
     * Sets the value of the useForeignAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseForeignAmounts(SearchBooleanField value) {
        this.useForeignAmounts = value;
    }

}
