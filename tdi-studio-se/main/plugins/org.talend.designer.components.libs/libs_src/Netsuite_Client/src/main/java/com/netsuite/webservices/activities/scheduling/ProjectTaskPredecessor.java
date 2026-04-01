
package com.netsuite.webservices.activities.scheduling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.activities.scheduling.types.ProjectTaskPredecessorPredecessorType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for ProjectTaskPredecessor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectTaskPredecessor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="task" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:types.scheduling_2014_2.activities.webservices.netsuite.com}ProjectTaskPredecessorPredecessorType" minOccurs="0"/&gt;
 *         &lt;element name="lagDays" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTaskPredecessor", propOrder = {
    "task",
    "type",
    "lagDays",
    "startDate",
    "endDate"
})
public class ProjectTaskPredecessor {

    protected RecordRef task;
    @XmlSchemaType(name = "string")
    protected ProjectTaskPredecessorPredecessorType type;
    protected Double lagDays;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTask(RecordRef value) {
        this.task = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskPredecessorPredecessorType }
     *     
     */
    public ProjectTaskPredecessorPredecessorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskPredecessorPredecessorType }
     *     
     */
    public void setType(ProjectTaskPredecessorPredecessorType value) {
        this.type = value;
    }

    /**
     * Gets the value of the lagDays property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLagDays() {
        return lagDays;
    }

    /**
     * Sets the value of the lagDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLagDays(Double value) {
        this.lagDays = value;
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

}
