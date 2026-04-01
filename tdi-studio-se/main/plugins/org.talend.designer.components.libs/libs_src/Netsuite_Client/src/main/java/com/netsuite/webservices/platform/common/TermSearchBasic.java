
package com.netsuite.webservices.platform.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchBooleanField;
import com.netsuite.webservices.platform.core.SearchDoubleField;
import com.netsuite.webservices.platform.core.SearchLongField;
import com.netsuite.webservices.platform.core.SearchMultiSelectField;
import com.netsuite.webservices.platform.core.SearchRecordBasic;
import com.netsuite.webservices.platform.core.SearchStringField;


/**
 * <p>Java class for TermSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateDriven" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="dayDiscountExpires" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="dayOfMonthNetDue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilExpiry" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilNetDue" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="discountPercent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="discountPercentDateDriven" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="dueNextMonthIfWithinDays" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="preferred" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermSearchBasic", propOrder = {
    "dateDriven",
    "dayDiscountExpires",
    "dayOfMonthNetDue",
    "daysUntilExpiry",
    "daysUntilNetDue",
    "discountPercent",
    "discountPercentDateDriven",
    "dueNextMonthIfWithinDays",
    "externalId",
    "externalIdString",
    "internalId",
    "internalIdNumber",
    "isInactive",
    "name",
    "preferred"
})
public class TermSearchBasic
    extends SearchRecordBasic
{

    protected SearchBooleanField dateDriven;
    protected SearchLongField dayDiscountExpires;
    protected SearchLongField dayOfMonthNetDue;
    protected SearchLongField daysUntilExpiry;
    protected SearchLongField daysUntilNetDue;
    protected SearchDoubleField discountPercent;
    protected SearchDoubleField discountPercentDateDriven;
    protected SearchLongField dueNextMonthIfWithinDays;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInactive;
    protected SearchStringField name;
    protected SearchBooleanField preferred;

    /**
     * Gets the value of the dateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDateDriven() {
        return dateDriven;
    }

    /**
     * Sets the value of the dateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDateDriven(SearchBooleanField value) {
        this.dateDriven = value;
    }

    /**
     * Gets the value of the dayDiscountExpires property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDayDiscountExpires() {
        return dayDiscountExpires;
    }

    /**
     * Sets the value of the dayDiscountExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDayDiscountExpires(SearchLongField value) {
        this.dayDiscountExpires = value;
    }

    /**
     * Gets the value of the dayOfMonthNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }

    /**
     * Sets the value of the dayOfMonthNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDayOfMonthNetDue(SearchLongField value) {
        this.dayOfMonthNetDue = value;
    }

    /**
     * Gets the value of the daysUntilExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysUntilExpiry() {
        return daysUntilExpiry;
    }

    /**
     * Sets the value of the daysUntilExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysUntilExpiry(SearchLongField value) {
        this.daysUntilExpiry = value;
    }

    /**
     * Gets the value of the daysUntilNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysUntilNetDue() {
        return daysUntilNetDue;
    }

    /**
     * Sets the value of the daysUntilNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysUntilNetDue(SearchLongField value) {
        this.daysUntilNetDue = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDiscountPercent(SearchDoubleField value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountPercentDateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }

    /**
     * Sets the value of the discountPercentDateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDiscountPercentDateDriven(SearchDoubleField value) {
        this.discountPercentDateDriven = value;
    }

    /**
     * Gets the value of the dueNextMonthIfWithinDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }

    /**
     * Sets the value of the dueNextMonthIfWithinDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDueNextMonthIfWithinDays(SearchLongField value) {
        this.dueNextMonthIfWithinDays = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalIdString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * Sets the value of the externalIdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
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
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
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
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPreferred(SearchBooleanField value) {
        this.preferred = value;
    }

}
