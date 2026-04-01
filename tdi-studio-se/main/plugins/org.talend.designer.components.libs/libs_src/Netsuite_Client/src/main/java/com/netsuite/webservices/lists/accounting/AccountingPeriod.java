
package com.netsuite.webservices.lists.accounting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for AccountingPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="periodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fiscalCalendar" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="closedOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isAdjust" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fiscalCalendarsList" type="{urn:accounting_2014_2.lists.webservices.netsuite.com}AccountingPeriodFiscalCalendarsList" minOccurs="0"/&gt;
 *         &lt;element name="isQuarter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="apLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="arLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="payrollLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allowNonGLChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingPeriod", propOrder = {
    "periodName",
    "parent",
    "startDate",
    "endDate",
    "fiscalCalendar",
    "closedOnDate",
    "isAdjust",
    "fiscalCalendarsList",
    "isQuarter",
    "isYear",
    "closed",
    "apLocked",
    "arLocked",
    "payrollLocked",
    "allLocked",
    "allowNonGLChanges"
})
public class AccountingPeriod
    extends Record
{

    protected String periodName;
    protected RecordRef parent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected RecordRef fiscalCalendar;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedOnDate;
    protected Boolean isAdjust;
    protected AccountingPeriodFiscalCalendarsList fiscalCalendarsList;
    protected Boolean isQuarter;
    protected Boolean isYear;
    protected Boolean closed;
    protected Boolean apLocked;
    protected Boolean arLocked;
    protected Boolean payrollLocked;
    protected Boolean allLocked;
    protected Boolean allowNonGLChanges;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * Gets the value of the periodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodName() {
        return periodName;
    }

    /**
     * Sets the value of the periodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodName(String value) {
        this.periodName = value;
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
     * Gets the value of the closedOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedOnDate() {
        return closedOnDate;
    }

    /**
     * Sets the value of the closedOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedOnDate(XMLGregorianCalendar value) {
        this.closedOnDate = value;
    }

    /**
     * Gets the value of the isAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdjust() {
        return isAdjust;
    }

    /**
     * Sets the value of the isAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdjust(Boolean value) {
        this.isAdjust = value;
    }

    /**
     * Gets the value of the fiscalCalendarsList property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodFiscalCalendarsList }
     *     
     */
    public AccountingPeriodFiscalCalendarsList getFiscalCalendarsList() {
        return fiscalCalendarsList;
    }

    /**
     * Sets the value of the fiscalCalendarsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodFiscalCalendarsList }
     *     
     */
    public void setFiscalCalendarsList(AccountingPeriodFiscalCalendarsList value) {
        this.fiscalCalendarsList = value;
    }

    /**
     * Gets the value of the isQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuarter() {
        return isQuarter;
    }

    /**
     * Sets the value of the isQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuarter(Boolean value) {
        this.isQuarter = value;
    }

    /**
     * Gets the value of the isYear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsYear() {
        return isYear;
    }

    /**
     * Sets the value of the isYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsYear(Boolean value) {
        this.isYear = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed(Boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the apLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApLocked() {
        return apLocked;
    }

    /**
     * Sets the value of the apLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApLocked(Boolean value) {
        this.apLocked = value;
    }

    /**
     * Gets the value of the arLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArLocked() {
        return arLocked;
    }

    /**
     * Sets the value of the arLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArLocked(Boolean value) {
        this.arLocked = value;
    }

    /**
     * Gets the value of the payrollLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayrollLocked() {
        return payrollLocked;
    }

    /**
     * Sets the value of the payrollLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayrollLocked(Boolean value) {
        this.payrollLocked = value;
    }

    /**
     * Gets the value of the allLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllLocked() {
        return allLocked;
    }

    /**
     * Sets the value of the allLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllLocked(Boolean value) {
        this.allLocked = value;
    }

    /**
     * Gets the value of the allowNonGLChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowNonGLChanges() {
        return allowNonGLChanges;
    }

    /**
     * Sets the value of the allowNonGLChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNonGLChanges(Boolean value) {
        this.allowNonGLChanges = value;
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

}
