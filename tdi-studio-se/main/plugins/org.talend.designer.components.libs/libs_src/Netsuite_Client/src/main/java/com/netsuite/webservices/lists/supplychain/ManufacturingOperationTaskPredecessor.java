
package com.netsuite.webservices.lists.supplychain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.supplychain.types.ManufacturingLagType;
import com.netsuite.webservices.lists.supplychain.types.ManufacturingOperationTaskPredecessorPredecessorType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for ManufacturingOperationTaskPredecessor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTaskPredecessor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="task" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:types.supplychain_2014_2.lists.webservices.netsuite.com}ManufacturingOperationTaskPredecessorPredecessorType" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lagType" type="{urn:types.supplychain_2014_2.lists.webservices.netsuite.com}ManufacturingLagType" minOccurs="0"/&gt;
 *         &lt;element name="lagAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lagUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingOperationTaskPredecessor", propOrder = {
    "task",
    "type",
    "startDate",
    "endDate",
    "lagType",
    "lagAmount",
    "lagUnits"
})
public class ManufacturingOperationTaskPredecessor {

    protected RecordRef task;
    @XmlSchemaType(name = "string")
    protected ManufacturingOperationTaskPredecessorPredecessorType type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "string")
    protected ManufacturingLagType lagType;
    protected Long lagAmount;
    protected String lagUnits;

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
     *     {@link ManufacturingOperationTaskPredecessorPredecessorType }
     *     
     */
    public ManufacturingOperationTaskPredecessorPredecessorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskPredecessorPredecessorType }
     *     
     */
    public void setType(ManufacturingOperationTaskPredecessorPredecessorType value) {
        this.type = value;
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
     * Gets the value of the lagType property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingLagType }
     *     
     */
    public ManufacturingLagType getLagType() {
        return lagType;
    }

    /**
     * Sets the value of the lagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingLagType }
     *     
     */
    public void setLagType(ManufacturingLagType value) {
        this.lagType = value;
    }

    /**
     * Gets the value of the lagAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLagAmount() {
        return lagAmount;
    }

    /**
     * Sets the value of the lagAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLagAmount(Long value) {
        this.lagAmount = value;
    }

    /**
     * Gets the value of the lagUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLagUnits() {
        return lagUnits;
    }

    /**
     * Sets the value of the lagUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLagUnits(String value) {
        this.lagUnits = value;
    }

}
