
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.Guid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;


/**
 * <p>Java class for AppointmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnchorOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AppointmentsToIgnore" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfAppointmentsToIgnore" minOccurs="0"/>
 *         &lt;element name="Constraints" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfConstraintRelation" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://schemas.microsoft.com/crm/2011/Contracts}SearchDirection" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Objectives" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfObjectiveRelation" minOccurs="0"/>
 *         &lt;element name="RecurrenceDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceTimeZoneCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequiredResources" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfRequiredResource" minOccurs="0"/>
 *         &lt;element name="SearchRecurrenceRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchRecurrenceStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SearchWindowEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SearchWindowStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Sites" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="UserTimeZoneCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentRequest", propOrder = {
    "anchorOffset",
    "appointmentsToIgnore",
    "constraints",
    "direction",
    "duration",
    "numberOfResults",
    "objectives",
    "recurrenceDuration",
    "recurrenceTimeZoneCode",
    "requiredResources",
    "searchRecurrenceRule",
    "searchRecurrenceStart",
    "searchWindowEnd",
    "searchWindowStart",
    "serviceId",
    "sites",
    "userTimeZoneCode"
})
public class AppointmentRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AnchorOffset")
    protected Integer anchorOffset;
    @XmlElement(name = "AppointmentsToIgnore", nillable = true)
    protected ArrayOfAppointmentsToIgnore appointmentsToIgnore;
    @XmlElement(name = "Constraints", nillable = true)
    protected ArrayOfConstraintRelation constraints;
    @XmlElement(name = "Direction")
    protected SearchDirection direction;
    @XmlElement(name = "Duration")
    protected Integer duration;
    @XmlElement(name = "NumberOfResults")
    protected Integer numberOfResults;
    @XmlElement(name = "Objectives", nillable = true)
    protected ArrayOfObjectiveRelation objectives;
    @XmlElement(name = "RecurrenceDuration")
    protected Integer recurrenceDuration;
    @XmlElement(name = "RecurrenceTimeZoneCode")
    protected Integer recurrenceTimeZoneCode;
    @XmlElement(name = "RequiredResources", nillable = true)
    protected ArrayOfRequiredResource requiredResources;
    @XmlElement(name = "SearchRecurrenceRule", nillable = true)
    protected String searchRecurrenceRule;
    @XmlElement(name = "SearchRecurrenceStart", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchRecurrenceStart;
    @XmlElement(name = "SearchWindowEnd", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchWindowEnd;
    @XmlElement(name = "SearchWindowStart", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchWindowStart;
    @XmlElement(name = "ServiceId")
    protected Guid serviceId;
    @XmlElement(name = "Sites", nillable = true)
    protected ArrayOfguid sites;
    @XmlElement(name = "UserTimeZoneCode")
    protected Integer userTimeZoneCode;

    /**
     * Gets the value of the anchorOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchorOffset() {
        return anchorOffset;
    }

    /**
     * Sets the value of the anchorOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchorOffset(Integer value) {
        this.anchorOffset = value;
    }

    /**
     * Gets the value of the appointmentsToIgnore property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppointmentsToIgnore }
     *     
     */
    public ArrayOfAppointmentsToIgnore getAppointmentsToIgnore() {
        return appointmentsToIgnore;
    }

    /**
     * Sets the value of the appointmentsToIgnore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppointmentsToIgnore }
     *     
     */
    public void setAppointmentsToIgnore(ArrayOfAppointmentsToIgnore value) {
        this.appointmentsToIgnore = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConstraintRelation }
     *     
     */
    public ArrayOfConstraintRelation getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConstraintRelation }
     *     
     */
    public void setConstraints(ArrayOfConstraintRelation value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDirection }
     *     
     */
    public SearchDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDirection }
     *     
     */
    public void setDirection(SearchDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfResults(Integer value) {
        this.numberOfResults = value;
    }

    /**
     * Gets the value of the objectives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectiveRelation }
     *     
     */
    public ArrayOfObjectiveRelation getObjectives() {
        return objectives;
    }

    /**
     * Sets the value of the objectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectiveRelation }
     *     
     */
    public void setObjectives(ArrayOfObjectiveRelation value) {
        this.objectives = value;
    }

    /**
     * Gets the value of the recurrenceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceDuration() {
        return recurrenceDuration;
    }

    /**
     * Sets the value of the recurrenceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceDuration(Integer value) {
        this.recurrenceDuration = value;
    }

    /**
     * Gets the value of the recurrenceTimeZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceTimeZoneCode() {
        return recurrenceTimeZoneCode;
    }

    /**
     * Sets the value of the recurrenceTimeZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceTimeZoneCode(Integer value) {
        this.recurrenceTimeZoneCode = value;
    }

    /**
     * Gets the value of the requiredResources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredResource }
     *     
     */
    public ArrayOfRequiredResource getRequiredResources() {
        return requiredResources;
    }

    /**
     * Sets the value of the requiredResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredResource }
     *     
     */
    public void setRequiredResources(ArrayOfRequiredResource value) {
        this.requiredResources = value;
    }

    /**
     * Gets the value of the searchRecurrenceRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchRecurrenceRule() {
        return searchRecurrenceRule;
    }

    /**
     * Sets the value of the searchRecurrenceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchRecurrenceRule(String value) {
        this.searchRecurrenceRule = value;
    }

    /**
     * Gets the value of the searchRecurrenceStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchRecurrenceStart() {
        return searchRecurrenceStart;
    }

    /**
     * Sets the value of the searchRecurrenceStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchRecurrenceStart(XMLGregorianCalendar value) {
        this.searchRecurrenceStart = value;
    }

    /**
     * Gets the value of the searchWindowEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchWindowEnd() {
        return searchWindowEnd;
    }

    /**
     * Sets the value of the searchWindowEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchWindowEnd(XMLGregorianCalendar value) {
        this.searchWindowEnd = value;
    }

    /**
     * Gets the value of the searchWindowStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchWindowStart() {
        return searchWindowStart;
    }

    /**
     * Sets the value of the searchWindowStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchWindowStart(XMLGregorianCalendar value) {
        this.searchWindowStart = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setServiceId(Guid value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the sites property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getSites() {
        return sites;
    }

    /**
     * Sets the value of the sites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setSites(ArrayOfguid value) {
        this.sites = value;
    }

    /**
     * Gets the value of the userTimeZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserTimeZoneCode() {
        return userTimeZoneCode;
    }

    /**
     * Sets the value of the userTimeZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserTimeZoneCode(Integer value) {
        this.userTimeZoneCode = value;
    }

}
