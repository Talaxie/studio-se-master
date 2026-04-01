
package com.netsuite.webservices.lists.supplychain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.supplychain.types.ManufacturingOperationTaskStatus;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for ManufacturingOperationTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingWorkCenter" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingCostTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="workOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:types.supplychain_2014_2.lists.webservices.netsuite.com}ManufacturingOperationTaskStatus" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estimatedWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="actualWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="remainingWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inputQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="completedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="setupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="runRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="autoCalculateLag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="costDetailList" type="{urn:supplychain_2014_2.lists.webservices.netsuite.com}ManufacturingCostDetailList" minOccurs="0"/&gt;
 *         &lt;element name="predecessorList" type="{urn:supplychain_2014_2.lists.webservices.netsuite.com}ManufacturingOperationTaskPredecessorList" minOccurs="0"/&gt;
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
@XmlType(name = "ManufacturingOperationTask", propOrder = {
    "customForm",
    "manufacturingWorkCenter",
    "manufacturingCostTemplate",
    "title",
    "operationSequence",
    "workOrder",
    "order",
    "status",
    "message",
    "estimatedWork",
    "actualWork",
    "remainingWork",
    "inputQuantity",
    "completedQuantity",
    "setupTime",
    "runRate",
    "startDate",
    "endDate",
    "autoCalculateLag",
    "machineResources",
    "laborResources",
    "costDetailList",
    "predecessorList",
    "customFieldList"
})
public class ManufacturingOperationTask
    extends Record
{

    protected RecordRef customForm;
    protected RecordRef manufacturingWorkCenter;
    protected RecordRef manufacturingCostTemplate;
    protected String title;
    protected Long operationSequence;
    protected RecordRef workOrder;
    protected RecordRef order;
    @XmlSchemaType(name = "string")
    protected ManufacturingOperationTaskStatus status;
    protected String message;
    protected Double estimatedWork;
    protected Double actualWork;
    protected Double remainingWork;
    protected Double inputQuantity;
    protected Double completedQuantity;
    protected Double setupTime;
    protected Double runRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Boolean autoCalculateLag;
    protected Long machineResources;
    protected Long laborResources;
    protected ManufacturingCostDetailList costDetailList;
    protected ManufacturingOperationTaskPredecessorList predecessorList;
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
     * Gets the value of the manufacturingWorkCenter property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }

    /**
     * Sets the value of the manufacturingWorkCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setManufacturingWorkCenter(RecordRef value) {
        this.manufacturingWorkCenter = value;
    }

    /**
     * Gets the value of the manufacturingCostTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }

    /**
     * Sets the value of the manufacturingCostTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setManufacturingCostTemplate(RecordRef value) {
        this.manufacturingCostTemplate = value;
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
     * Gets the value of the operationSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperationSequence() {
        return operationSequence;
    }

    /**
     * Sets the value of the operationSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperationSequence(Long value) {
        this.operationSequence = value;
    }

    /**
     * Gets the value of the workOrder property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkOrder() {
        return workOrder;
    }

    /**
     * Sets the value of the workOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkOrder(RecordRef value) {
        this.workOrder = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskStatus }
     *     
     */
    public ManufacturingOperationTaskStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskStatus }
     *     
     */
    public void setStatus(ManufacturingOperationTaskStatus value) {
        this.status = value;
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
     * Gets the value of the inputQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInputQuantity() {
        return inputQuantity;
    }

    /**
     * Sets the value of the inputQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInputQuantity(Double value) {
        this.inputQuantity = value;
    }

    /**
     * Gets the value of the completedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompletedQuantity() {
        return completedQuantity;
    }

    /**
     * Sets the value of the completedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompletedQuantity(Double value) {
        this.completedQuantity = value;
    }

    /**
     * Gets the value of the setupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSetupTime() {
        return setupTime;
    }

    /**
     * Sets the value of the setupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSetupTime(Double value) {
        this.setupTime = value;
    }

    /**
     * Gets the value of the runRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRunRate() {
        return runRate;
    }

    /**
     * Sets the value of the runRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRunRate(Double value) {
        this.runRate = value;
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
     * Gets the value of the autoCalculateLag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCalculateLag() {
        return autoCalculateLag;
    }

    /**
     * Sets the value of the autoCalculateLag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCalculateLag(Boolean value) {
        this.autoCalculateLag = value;
    }

    /**
     * Gets the value of the machineResources property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMachineResources() {
        return machineResources;
    }

    /**
     * Sets the value of the machineResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMachineResources(Long value) {
        this.machineResources = value;
    }

    /**
     * Gets the value of the laborResources property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLaborResources() {
        return laborResources;
    }

    /**
     * Sets the value of the laborResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLaborResources(Long value) {
        this.laborResources = value;
    }

    /**
     * Gets the value of the costDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingCostDetailList }
     *     
     */
    public ManufacturingCostDetailList getCostDetailList() {
        return costDetailList;
    }

    /**
     * Sets the value of the costDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingCostDetailList }
     *     
     */
    public void setCostDetailList(ManufacturingCostDetailList value) {
        this.costDetailList = value;
    }

    /**
     * Gets the value of the predecessorList property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskPredecessorList }
     *     
     */
    public ManufacturingOperationTaskPredecessorList getPredecessorList() {
        return predecessorList;
    }

    /**
     * Sets the value of the predecessorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskPredecessorList }
     *     
     */
    public void setPredecessorList(ManufacturingOperationTaskPredecessorList value) {
        this.predecessorList = value;
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
