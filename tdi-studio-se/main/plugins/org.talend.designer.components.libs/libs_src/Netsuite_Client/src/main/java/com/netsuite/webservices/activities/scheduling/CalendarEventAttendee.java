
package com.netsuite.webservices.activities.scheduling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling.types.CalendarEventAttendeeAttendance;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.platform.core.types.CalendarEventAttendeeResponse;


/**
 * <p>Java class for CalendarEventAttendee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarEventAttendee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="attendee" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}CalendarEventAttendeeResponse" minOccurs="0"/&gt;
 *         &lt;element name="attendance" type="{urn:types.scheduling_2014_2.activities.webservices.netsuite.com}CalendarEventAttendeeAttendance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarEventAttendee", propOrder = {
    "sendEmail",
    "attendee",
    "response",
    "attendance"
})
public class CalendarEventAttendee {

    protected Boolean sendEmail;
    protected RecordRef attendee;
    @XmlSchemaType(name = "string")
    protected CalendarEventAttendeeResponse response;
    @XmlSchemaType(name = "string")
    protected CalendarEventAttendeeAttendance attendance;

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the attendee property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAttendee() {
        return attendee;
    }

    /**
     * Sets the value of the attendee property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAttendee(RecordRef value) {
        this.attendee = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public CalendarEventAttendeeResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public void setResponse(CalendarEventAttendeeResponse value) {
        this.response = value;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeAttendance }
     *     
     */
    public CalendarEventAttendeeAttendance getAttendance() {
        return attendance;
    }

    /**
     * Sets the value of the attendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeAttendance }
     *     
     */
    public void setAttendance(CalendarEventAttendeeAttendance value) {
        this.attendance = value;
    }

}
