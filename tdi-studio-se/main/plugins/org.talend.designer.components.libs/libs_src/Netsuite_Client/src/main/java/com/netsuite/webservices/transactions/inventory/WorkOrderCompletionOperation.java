
package com.netsuite.webservices.transactions.inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderCompletionOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderCompletionOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="inputQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="predecessorCompletedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="completedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="recordSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="machineSetupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="laborSetupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="machineRunTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="laborRunTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderCompletionOperation", propOrder = {
    "operationSequence",
    "operationName",
    "workCenter",
    "machineResources",
    "laborResources",
    "inputQuantity",
    "quantityRemaining",
    "predecessorCompletedQuantity",
    "completedQuantity",
    "recordSetup",
    "machineSetupTime",
    "laborSetupTime",
    "machineRunTime",
    "laborRunTime"
})
public class WorkOrderCompletionOperation {

    protected Long operationSequence;
    protected String operationName;
    protected String workCenter;
    protected Long machineResources;
    protected Long laborResources;
    protected Double inputQuantity;
    protected Double quantityRemaining;
    protected Double predecessorCompletedQuantity;
    protected Double completedQuantity;
    protected Boolean recordSetup;
    protected Double machineSetupTime;
    protected Double laborSetupTime;
    protected Double machineRunTime;
    protected Double laborRunTime;

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
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the workCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCenter() {
        return workCenter;
    }

    /**
     * Sets the value of the workCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCenter(String value) {
        this.workCenter = value;
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
     * Gets the value of the quantityRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityRemaining() {
        return quantityRemaining;
    }

    /**
     * Sets the value of the quantityRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityRemaining(Double value) {
        this.quantityRemaining = value;
    }

    /**
     * Gets the value of the predecessorCompletedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPredecessorCompletedQuantity() {
        return predecessorCompletedQuantity;
    }

    /**
     * Sets the value of the predecessorCompletedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPredecessorCompletedQuantity(Double value) {
        this.predecessorCompletedQuantity = value;
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
     * Gets the value of the recordSetup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordSetup() {
        return recordSetup;
    }

    /**
     * Sets the value of the recordSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordSetup(Boolean value) {
        this.recordSetup = value;
    }

    /**
     * Gets the value of the machineSetupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMachineSetupTime() {
        return machineSetupTime;
    }

    /**
     * Sets the value of the machineSetupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMachineSetupTime(Double value) {
        this.machineSetupTime = value;
    }

    /**
     * Gets the value of the laborSetupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLaborSetupTime() {
        return laborSetupTime;
    }

    /**
     * Sets the value of the laborSetupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLaborSetupTime(Double value) {
        this.laborSetupTime = value;
    }

    /**
     * Gets the value of the machineRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMachineRunTime() {
        return machineRunTime;
    }

    /**
     * Sets the value of the machineRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMachineRunTime(Double value) {
        this.machineRunTime = value;
    }

    /**
     * Gets the value of the laborRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLaborRunTime() {
        return laborRunTime;
    }

    /**
     * Sets the value of the laborRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLaborRunTime(Double value) {
        this.laborRunTime = value;
    }

}
