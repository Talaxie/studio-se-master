
package com.netsuite.webservices.activities.scheduling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.activities.scheduling.types.ProjectTaskConstraintType;
import com.netsuite.webservices.activities.scheduling.types.ProjectTaskStatus;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for ProjectTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="eventId" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="percentTimeComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="estimatedWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedWorkBaseline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="constraintType" type="{urn:types.scheduling_2014_2.activities.webservices.netsuite.com}ProjectTaskConstraintType" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="finishByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="actualWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="remainingWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMilestone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isOnCriticalPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="slackMinutes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:types.scheduling_2014_2.activities.webservices.netsuite.com}ProjectTaskStatus" minOccurs="0"/&gt;
 *         &lt;element name="nonBillableTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="assigneeList" type="{urn:scheduling_2014_2.activities.webservices.netsuite.com}ProjectTaskAssigneeList" minOccurs="0"/&gt;
 *         &lt;element name="predecessorList" type="{urn:scheduling_2014_2.activities.webservices.netsuite.com}ProjectTaskPredecessorList" minOccurs="0"/&gt;
 *         &lt;element name="timeItemList" type="{urn:scheduling_2014_2.activities.webservices.netsuite.com}ProjectTaskTimeItemList" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2014_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTask", propOrder = {
    "customForm",
    "eventId",
    "percentTimeComplete",
    "title",
    "company",
    "contact",
    "order",
    "owner",
    "parent",
    "priority",
    "estimatedWork",
    "estimatedWorkBaseline",
    "constraintType",
    "startDate",
    "startDateBaseline",
    "endDate",
    "finishByDate",
    "endDateBaseline",
    "actualWork",
    "remainingWork",
    "message",
    "isMilestone",
    "isOnCriticalPath",
    "slackMinutes",
    "lateEnd",
    "lateStart",
    "status",
    "nonBillableTask",
    "assigneeList",
    "predecessorList",
    "timeItemList",
    "customFieldList"
})
public class ProjectTask
    extends Record
{

    protected RecordRef customForm;
    protected RecordRef eventId;
    protected Double percentTimeComplete;
    protected String title;
    protected RecordRef company;
    protected RecordRef contact;
    protected RecordRef order;
    protected RecordRef owner;
    protected RecordRef parent;
    protected RecordRef priority;
    protected Double estimatedWork;
    protected Double estimatedWorkBaseline;
    @XmlSchemaType(name = "string")
    protected ProjectTaskConstraintType constraintType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishByDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateBaseline;
    protected Double actualWork;
    protected Double remainingWork;
    protected String message;
    protected Boolean isMilestone;
    protected String isOnCriticalPath;
    protected Double slackMinutes;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lateEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lateStart;
    @XmlSchemaType(name = "string")
    protected ProjectTaskStatus status;
    protected Boolean nonBillableTask;
    protected ProjectTaskAssigneeList assigneeList;
    protected ProjectTaskPredecessorList predecessorList;
    protected ProjectTaskTimeItemList timeItemList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEventId(RecordRef value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the percentTimeComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentTimeComplete() {
        return percentTimeComplete;
    }

    /**
     * Sets the value of the percentTimeComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentTimeComplete(Double value) {
        this.percentTimeComplete = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCompany(RecordRef value) {
        this.company = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setContact(RecordRef value) {
        this.contact = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOrder(RecordRef value) {
        this.order = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOwner(RecordRef value) {
        this.owner = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPriority(RecordRef value) {
        this.priority = value;
    }

    /**
     * Gets the value of the estimatedWork property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWork() {
        return estimatedWork;
    }

    /**
     * Sets the value of the estimatedWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWork(Double value) {
        this.estimatedWork = value;
    }

    /**
     * Gets the value of the estimatedWorkBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }

    /**
     * Sets the value of the estimatedWorkBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWorkBaseline(Double value) {
        this.estimatedWorkBaseline = value;
    }

    /**
     * Gets the value of the constraintType property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskConstraintType }
     *     
     */
    public ProjectTaskConstraintType getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskConstraintType }
     *     
     */
    public void setConstraintType(ProjectTaskConstraintType value) {
        this.constraintType = value;
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
     * Gets the value of the startDateBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateBaseline() {
        return startDateBaseline;
    }

    /**
     * Sets the value of the startDateBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateBaseline(XMLGregorianCalendar value) {
        this.startDateBaseline = value;
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
     * Gets the value of the finishByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishByDate() {
        return finishByDate;
    }

    /**
     * Sets the value of the finishByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishByDate(XMLGregorianCalendar value) {
        this.finishByDate = value;
    }

    /**
     * Gets the value of the endDateBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateBaseline() {
        return endDateBaseline;
    }

    /**
     * Sets the value of the endDateBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateBaseline(XMLGregorianCalendar value) {
        this.endDateBaseline = value;
    }

    /**
     * Gets the value of the actualWork property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualWork() {
        return actualWork;
    }

    /**
     * Sets the value of the actualWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualWork(Double value) {
        this.actualWork = value;
    }

    /**
     * Gets the value of the remainingWork property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainingWork() {
        return remainingWork;
    }

    /**
     * Sets the value of the remainingWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainingWork(Double value) {
        this.remainingWork = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the isMilestone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMilestone() {
        return isMilestone;
    }

    /**
     * Sets the value of the isMilestone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMilestone(Boolean value) {
        this.isMilestone = value;
    }

    /**
     * Gets the value of the isOnCriticalPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOnCriticalPath() {
        return isOnCriticalPath;
    }

    /**
     * Sets the value of the isOnCriticalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOnCriticalPath(String value) {
        this.isOnCriticalPath = value;
    }

    /**
     * Gets the value of the slackMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlackMinutes() {
        return slackMinutes;
    }

    /**
     * Sets the value of the slackMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlackMinutes(Double value) {
        this.slackMinutes = value;
    }

    /**
     * Gets the value of the lateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLateEnd() {
        return lateEnd;
    }

    /**
     * Sets the value of the lateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLateEnd(XMLGregorianCalendar value) {
        this.lateEnd = value;
    }

    /**
     * Gets the value of the lateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLateStart() {
        return lateStart;
    }

    /**
     * Sets the value of the lateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLateStart(XMLGregorianCalendar value) {
        this.lateStart = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskStatus }
     *     
     */
    public ProjectTaskStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskStatus }
     *     
     */
    public void setStatus(ProjectTaskStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the nonBillableTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonBillableTask() {
        return nonBillableTask;
    }

    /**
     * Sets the value of the nonBillableTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonBillableTask(Boolean value) {
        this.nonBillableTask = value;
    }

    /**
     * Gets the value of the assigneeList property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskAssigneeList }
     *     
     */
    public ProjectTaskAssigneeList getAssigneeList() {
        return assigneeList;
    }

    /**
     * Sets the value of the assigneeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskAssigneeList }
     *     
     */
    public void setAssigneeList(ProjectTaskAssigneeList value) {
        this.assigneeList = value;
    }

    /**
     * Gets the value of the predecessorList property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskPredecessorList }
     *     
     */
    public ProjectTaskPredecessorList getPredecessorList() {
        return predecessorList;
    }

    /**
     * Sets the value of the predecessorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskPredecessorList }
     *     
     */
    public void setPredecessorList(ProjectTaskPredecessorList value) {
        this.predecessorList = value;
    }

    /**
     * Gets the value of the timeItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskTimeItemList }
     *     
     */
    public ProjectTaskTimeItemList getTimeItemList() {
        return timeItemList;
    }

    /**
     * Sets the value of the timeItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskTimeItemList }
     *     
     */
    public void setTimeItemList(ProjectTaskTimeItemList value) {
        this.timeItemList = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
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

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
