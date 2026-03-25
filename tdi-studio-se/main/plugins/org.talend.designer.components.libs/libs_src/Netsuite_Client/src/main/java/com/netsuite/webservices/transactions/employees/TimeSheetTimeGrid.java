
package com.netsuite.webservices.transactions.employees;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSheetTimeGrid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSheetTimeGrid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sunday" type="{urn:employees_2014_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/&gt;
 *         &lt;element name="monday" type="{urn:employees_2014_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/&gt;
 *         &lt;element name="tuesday" type="{urn:employees_2014_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/&gt;
 *         &lt;element name="wednesday" type="{urn:employees_2014_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/&gt;
 *         &lt;element name="thursday" type="{urn:employees_2014_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/&gt;
 *         &lt;element name="friday" type="{urn:employees_2014_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/&gt;
 *         &lt;element name="saturday" type="{urn:employees_2014_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSheetTimeGrid", propOrder = {
    "sunday",
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday"
})
public class TimeSheetTimeGrid {

    protected TimeEntry sunday;
    protected TimeEntry monday;
    protected TimeEntry tuesday;
    protected TimeEntry wednesday;
    protected TimeEntry thursday;
    protected TimeEntry friday;
    protected TimeEntry saturday;

    /**
     * Gets the value of the sunday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setSunday(TimeEntry value) {
        this.sunday = value;
    }

    /**
     * Gets the value of the monday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setMonday(TimeEntry value) {
        this.monday = value;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setTuesday(TimeEntry value) {
        this.tuesday = value;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setWednesday(TimeEntry value) {
        this.wednesday = value;
    }

    /**
     * Gets the value of the thursday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setThursday(TimeEntry value) {
        this.thursday = value;
    }

    /**
     * Gets the value of the friday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setFriday(TimeEntry value) {
        this.friday = value;
    }

    /**
     * Gets the value of the saturday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setSaturday(TimeEntry value) {
        this.saturday = value;
    }

}
