
package com.netsuite.webservices.lists.supplychain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.supplychain.types.ManufacturingLagType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for ManufacturingRoutingRoutingStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingRoutingRoutingStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingWorkCenter" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingCostTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="setupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="runRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
@XmlType(name = "ManufacturingRoutingRoutingStep", propOrder = {
    "operationSequence",
    "operationName",
    "manufacturingWorkCenter",
    "machineResources",
    "laborResources",
    "manufacturingCostTemplate",
    "setupTime",
    "runRate",
    "lagType",
    "lagAmount",
    "lagUnits"
})
public class ManufacturingRoutingRoutingStep {

    protected Long operationSequence;
    protected String operationName;
    protected RecordRef manufacturingWorkCenter;
    protected Long machineResources;
    protected Long laborResources;
    protected RecordRef manufacturingCostTemplate;
    protected Double setupTime;
    protected Double runRate;
    @XmlSchemaType(name = "string")
    protected ManufacturingLagType lagType;
    protected Long lagAmount;
    protected String lagUnits;

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
