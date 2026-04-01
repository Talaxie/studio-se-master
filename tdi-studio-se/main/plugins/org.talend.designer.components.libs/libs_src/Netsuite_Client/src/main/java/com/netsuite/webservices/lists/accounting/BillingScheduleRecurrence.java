
package com.netsuite.webservices.lists.accounting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting.types.BillingScheduleRecurrenceRecurrenceUnits;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for BillingScheduleRecurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingScheduleRecurrence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurrenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{urn:types.accounting_2014_2.lists.webservices.netsuite.com}BillingScheduleRecurrenceRecurrenceUnits" minOccurs="0"/&gt;
 *         &lt;element name="relativeToPrevious" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="paymentTerms" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingScheduleRecurrence", propOrder = {
    "recurrenceId",
    "count",
    "units",
    "relativeToPrevious",
    "recurrenceDate",
    "amount",
    "paymentTerms"
})
public class BillingScheduleRecurrence {

    protected Long recurrenceId;
    protected Long count;
    @XmlSchemaType(name = "string")
    protected BillingScheduleRecurrenceRecurrenceUnits units;
    protected Boolean relativeToPrevious;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurrenceDate;
    protected Double amount;
    protected RecordRef paymentTerms;

    /**
     * Gets the value of the recurrenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurrenceId() {
        return recurrenceId;
    }

    /**
     * Sets the value of the recurrenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurrenceId(Long value) {
        this.recurrenceId = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleRecurrenceRecurrenceUnits }
     *     
     */
    public BillingScheduleRecurrenceRecurrenceUnits getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleRecurrenceRecurrenceUnits }
     *     
     */
    public void setUnits(BillingScheduleRecurrenceRecurrenceUnits value) {
        this.units = value;
    }

    /**
     * Gets the value of the relativeToPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelativeToPrevious() {
        return relativeToPrevious;
    }

    /**
     * Sets the value of the relativeToPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelativeToPrevious(Boolean value) {
        this.relativeToPrevious = value;
    }

    /**
     * Gets the value of the recurrenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceDate() {
        return recurrenceDate;
    }

    /**
     * Sets the value of the recurrenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceDate(XMLGregorianCalendar value) {
        this.recurrenceDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentTerms(RecordRef value) {
        this.paymentTerms = value;
    }

}
