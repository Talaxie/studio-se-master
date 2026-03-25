
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for TimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityStatusCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CalendarId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Effort" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="SourceTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubCode" type="{http://schemas.microsoft.com/crm/2011/Contracts}SubCode" minOccurs="0"/>
 *         &lt;element name="TimeCode" type="{http://schemas.microsoft.com/crm/2011/Contracts}TimeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInfo", propOrder = {
    "activityStatusCode",
    "calendarId",
    "displayText",
    "effort",
    "end",
    "isActivity",
    "sourceId",
    "sourceTypeCode",
    "start",
    "subCode",
    "timeCode"
})
public class TimeInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ActivityStatusCode")
    protected Integer activityStatusCode;
    @XmlElement(name = "CalendarId")
    protected Guid calendarId;
    @XmlElement(name = "DisplayText", nillable = true)
    protected String displayText;
    @XmlElement(name = "Effort")
    protected Double effort;
    @XmlElement(name = "End", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "IsActivity")
    protected Boolean isActivity;
    @XmlElement(name = "SourceId")
    protected Guid sourceId;
    @XmlElement(name = "SourceTypeCode")
    protected Integer sourceTypeCode;
    @XmlElement(name = "Start", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "SubCode")
    protected SubCode subCode;
    @XmlElement(name = "TimeCode")
    protected TimeCode timeCode;

    /**
     * Gets the value of the activityStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityStatusCode() {
        return activityStatusCode;
    }

    /**
     * Sets the value of the activityStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityStatusCode(Integer value) {
        this.activityStatusCode = value;
    }

    /**
     * Gets the value of the calendarId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getCalendarId() {
        return calendarId;
    }

    /**
     * Sets the value of the calendarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setCalendarId(Guid value) {
        this.calendarId = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the effort property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEffort() {
        return effort;
    }

    /**
     * Sets the value of the effort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEffort(Double value) {
        this.effort = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the isActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActivity() {
        return isActivity;
    }

    /**
     * Sets the value of the isActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActivity(Boolean value) {
        this.isActivity = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setSourceId(Guid value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceTypeCode() {
        return sourceTypeCode;
    }

    /**
     * Sets the value of the sourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceTypeCode(Integer value) {
        this.sourceTypeCode = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubCode }
     *     
     */
    public SubCode getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCode }
     *     
     */
    public void setSubCode(SubCode value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the timeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCode }
     *     
     */
    public TimeCode getTimeCode() {
        return timeCode;
    }

    /**
     * Sets the value of the timeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCode }
     *     
     */
    public void setTimeCode(TimeCode value) {
        this.timeCode = value;
    }

}
