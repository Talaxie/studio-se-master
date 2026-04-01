
package com.netsuite.webservices.lists.employees;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.employees.types.EmployeeAccruedTimeAccrualMethod;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for EmployeeAccruedTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeAccruedTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payrollItem" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="accruedHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="accrualRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="monetaryRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="resetAccruedHoursAtYearEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="accrualMethod" type="{urn:types.employees_2014_2.lists.webservices.netsuite.com}EmployeeAccruedTimeAccrualMethod" minOccurs="0"/&gt;
 *         &lt;element name="maximumAccruedHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeAccruedTime", propOrder = {
    "payrollItem",
    "accruedHours",
    "accrualRate",
    "monetaryRate",
    "resetAccruedHoursAtYearEnd",
    "accrualMethod",
    "maximumAccruedHours",
    "inactive",
    "effectiveDate",
    "expirationDate"
})
public class EmployeeAccruedTime {

    protected RecordRef payrollItem;
    protected Double accruedHours;
    protected Double accrualRate;
    protected Double monetaryRate;
    protected Boolean resetAccruedHoursAtYearEnd;
    @XmlSchemaType(name = "string")
    protected EmployeeAccruedTimeAccrualMethod accrualMethod;
    protected Double maximumAccruedHours;
    protected Boolean inactive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Gets the value of the payrollItem property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPayrollItem() {
        return payrollItem;
    }

    /**
     * Sets the value of the payrollItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPayrollItem(RecordRef value) {
        this.payrollItem = value;
    }

    /**
     * Gets the value of the accruedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccruedHours() {
        return accruedHours;
    }

    /**
     * Sets the value of the accruedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccruedHours(Double value) {
        this.accruedHours = value;
    }

    /**
     * Gets the value of the accrualRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccrualRate() {
        return accrualRate;
    }

    /**
     * Sets the value of the accrualRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccrualRate(Double value) {
        this.accrualRate = value;
    }

    /**
     * Gets the value of the monetaryRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonetaryRate() {
        return monetaryRate;
    }

    /**
     * Sets the value of the monetaryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonetaryRate(Double value) {
        this.monetaryRate = value;
    }

    /**
     * Gets the value of the resetAccruedHoursAtYearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetAccruedHoursAtYearEnd() {
        return resetAccruedHoursAtYearEnd;
    }

    /**
     * Sets the value of the resetAccruedHoursAtYearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetAccruedHoursAtYearEnd(Boolean value) {
        this.resetAccruedHoursAtYearEnd = value;
    }

    /**
     * Gets the value of the accrualMethod property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeAccruedTimeAccrualMethod }
     *     
     */
    public EmployeeAccruedTimeAccrualMethod getAccrualMethod() {
        return accrualMethod;
    }

    /**
     * Sets the value of the accrualMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeAccruedTimeAccrualMethod }
     *     
     */
    public void setAccrualMethod(EmployeeAccruedTimeAccrualMethod value) {
        this.accrualMethod = value;
    }

    /**
     * Gets the value of the maximumAccruedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumAccruedHours() {
        return maximumAccruedHours;
    }

    /**
     * Sets the value of the maximumAccruedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumAccruedHours(Double value) {
        this.maximumAccruedHours = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

}
