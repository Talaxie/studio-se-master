
package com.netsuite.webservices.lists.accounting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for BillingScheduleMilestone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingScheduleMilestone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="milestoneId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="milestoneAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="milestoneTerms" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="projectTask" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="milestoneDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="milestoneCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="milestoneActualCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingScheduleMilestone", propOrder = {
    "milestoneId",
    "milestoneAmount",
    "milestoneTerms",
    "projectTask",
    "milestoneDate",
    "milestoneCompleted",
    "milestoneActualCompletionDate",
    "comments"
})
public class BillingScheduleMilestone {

    protected Long milestoneId;
    protected Double milestoneAmount;
    protected RecordRef milestoneTerms;
    protected RecordRef projectTask;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar milestoneDate;
    protected Boolean milestoneCompleted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar milestoneActualCompletionDate;
    protected String comments;

    /**
     * Gets the value of the milestoneId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMilestoneId() {
        return milestoneId;
    }

    /**
     * Sets the value of the milestoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMilestoneId(Long value) {
        this.milestoneId = value;
    }

    /**
     * Gets the value of the milestoneAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMilestoneAmount() {
        return milestoneAmount;
    }

    /**
     * Sets the value of the milestoneAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMilestoneAmount(Double value) {
        this.milestoneAmount = value;
    }

    /**
     * Gets the value of the milestoneTerms property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getMilestoneTerms() {
        return milestoneTerms;
    }

    /**
     * Sets the value of the milestoneTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setMilestoneTerms(RecordRef value) {
        this.milestoneTerms = value;
    }

    /**
     * Gets the value of the projectTask property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProjectTask() {
        return projectTask;
    }

    /**
     * Sets the value of the projectTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProjectTask(RecordRef value) {
        this.projectTask = value;
    }

    /**
     * Gets the value of the milestoneDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilestoneDate() {
        return milestoneDate;
    }

    /**
     * Sets the value of the milestoneDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilestoneDate(XMLGregorianCalendar value) {
        this.milestoneDate = value;
    }

    /**
     * Gets the value of the milestoneCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMilestoneCompleted() {
        return milestoneCompleted;
    }

    /**
     * Sets the value of the milestoneCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMilestoneCompleted(Boolean value) {
        this.milestoneCompleted = value;
    }

    /**
     * Gets the value of the milestoneActualCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilestoneActualCompletionDate() {
        return milestoneActualCompletionDate;
    }

    /**
     * Sets the value of the milestoneActualCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilestoneActualCompletionDate(XMLGregorianCalendar value) {
        this.milestoneActualCompletionDate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
