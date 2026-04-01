
package com.netsuite.webservices.platform.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchColumnCustomFieldList;
import com.netsuite.webservices.platform.core.SearchColumnDateField;
import com.netsuite.webservices.platform.core.SearchColumnDoubleField;
import com.netsuite.webservices.platform.core.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core.SearchColumnLongField;
import com.netsuite.webservices.platform.core.SearchColumnSelectField;
import com.netsuite.webservices.platform.core.SearchColumnStringField;
import com.netsuite.webservices.platform.core.SearchRowBasic;


/**
 * <p>Java class for ManufacturingOperationTaskSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTaskSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualRunTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="actualSetupTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="completedQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estimatedWork" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inputQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="laborResources" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lagAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lagType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lagUnits" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="machineResources" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingCostTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufacturingWorkCenter" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="predecessor" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="predecessorType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remainingQuantity" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="runRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="runTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sequence" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="setupTime" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="workOrder" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnCustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingOperationTaskSearchRowBasic", propOrder = {
    "actualRunTime",
    "actualSetupTime",
    "completedQuantity",
    "endDate",
    "estimatedWork",
    "externalId",
    "id",
    "inputQuantity",
    "internalId",
    "laborResources",
    "lagAmount",
    "lagType",
    "lagUnits",
    "machineResources",
    "manufacturingCostTemplate",
    "manufacturingWorkCenter",
    "message",
    "name",
    "order",
    "predecessor",
    "predecessorType",
    "remainingQuantity",
    "runRate",
    "runTime",
    "sequence",
    "setupTime",
    "startDate",
    "status",
    "workOrder",
    "customFieldList"
})
public class ManufacturingOperationTaskSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnDoubleField> actualRunTime;
    protected List<SearchColumnDoubleField> actualSetupTime;
    protected List<SearchColumnDoubleField> completedQuantity;
    protected List<SearchColumnDateField> endDate;
    protected List<SearchColumnDoubleField> estimatedWork;
    protected List<SearchColumnStringField> externalId;
    protected List<SearchColumnLongField> id;
    protected List<SearchColumnDoubleField> inputQuantity;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnLongField> laborResources;
    protected List<SearchColumnDoubleField> lagAmount;
    protected List<SearchColumnEnumSelectField> lagType;
    protected List<SearchColumnStringField> lagUnits;
    protected List<SearchColumnLongField> machineResources;
    protected List<SearchColumnSelectField> manufacturingCostTemplate;
    protected List<SearchColumnSelectField> manufacturingWorkCenter;
    protected List<SearchColumnStringField> message;
    protected List<SearchColumnStringField> name;
    protected List<SearchColumnDoubleField> order;
    protected List<SearchColumnSelectField> predecessor;
    protected List<SearchColumnStringField> predecessorType;
    protected List<SearchColumnDoubleField> remainingQuantity;
    protected List<SearchColumnDoubleField> runRate;
    protected List<SearchColumnDoubleField> runTime;
    protected List<SearchColumnLongField> sequence;
    protected List<SearchColumnDoubleField> setupTime;
    protected List<SearchColumnDateField> startDate;
    protected List<SearchColumnSelectField> status;
    protected List<SearchColumnStringField> workOrder;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the actualRunTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualRunTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualRunTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getActualRunTime() {
        if (actualRunTime == null) {
            actualRunTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.actualRunTime;
    }

    /**
     * Gets the value of the actualSetupTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualSetupTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualSetupTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getActualSetupTime() {
        if (actualSetupTime == null) {
            actualSetupTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.actualSetupTime;
    }

    /**
     * Gets the value of the completedQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completedQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompletedQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCompletedQuantity() {
        if (completedQuantity == null) {
            completedQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.completedQuantity;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getEndDate() {
        if (endDate == null) {
            endDate = new ArrayList<SearchColumnDateField>();
        }
        return this.endDate;
    }

    /**
     * Gets the value of the estimatedWork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedWork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstimatedWork() {
        if (estimatedWork == null) {
            estimatedWork = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estimatedWork;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnStringField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getId() {
        if (id == null) {
            id = new ArrayList<SearchColumnLongField>();
        }
        return this.id;
    }

    /**
     * Gets the value of the inputQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getInputQuantity() {
        if (inputQuantity == null) {
            inputQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.inputQuantity;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the laborResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLaborResources() {
        if (laborResources == null) {
            laborResources = new ArrayList<SearchColumnLongField>();
        }
        return this.laborResources;
    }

    /**
     * Gets the value of the lagAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lagAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLagAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLagAmount() {
        if (lagAmount == null) {
            lagAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.lagAmount;
    }

    /**
     * Gets the value of the lagType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lagType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLagType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLagType() {
        if (lagType == null) {
            lagType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.lagType;
    }

    /**
     * Gets the value of the lagUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lagUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLagUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLagUnits() {
        if (lagUnits == null) {
            lagUnits = new ArrayList<SearchColumnStringField>();
        }
        return this.lagUnits;
    }

    /**
     * Gets the value of the machineResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the machineResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMachineResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getMachineResources() {
        if (machineResources == null) {
            machineResources = new ArrayList<SearchColumnLongField>();
        }
        return this.machineResources;
    }

    /**
     * Gets the value of the manufacturingCostTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturingCostTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturingCostTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getManufacturingCostTemplate() {
        if (manufacturingCostTemplate == null) {
            manufacturingCostTemplate = new ArrayList<SearchColumnSelectField>();
        }
        return this.manufacturingCostTemplate;
    }

    /**
     * Gets the value of the manufacturingWorkCenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturingWorkCenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturingWorkCenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getManufacturingWorkCenter() {
        if (manufacturingWorkCenter == null) {
            manufacturingWorkCenter = new ArrayList<SearchColumnSelectField>();
        }
        return this.manufacturingWorkCenter;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMessage() {
        if (message == null) {
            message = new ArrayList<SearchColumnStringField>();
        }
        return this.message;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getName() {
        if (name == null) {
            name = new ArrayList<SearchColumnStringField>();
        }
        return this.name;
    }

    /**
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOrder() {
        if (order == null) {
            order = new ArrayList<SearchColumnDoubleField>();
        }
        return this.order;
    }

    /**
     * Gets the value of the predecessor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predecessor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredecessor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPredecessor() {
        if (predecessor == null) {
            predecessor = new ArrayList<SearchColumnSelectField>();
        }
        return this.predecessor;
    }

    /**
     * Gets the value of the predecessorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predecessorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredecessorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPredecessorType() {
        if (predecessorType == null) {
            predecessorType = new ArrayList<SearchColumnStringField>();
        }
        return this.predecessorType;
    }

    /**
     * Gets the value of the remainingQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remainingQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemainingQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRemainingQuantity() {
        if (remainingQuantity == null) {
            remainingQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.remainingQuantity;
    }

    /**
     * Gets the value of the runRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRunRate() {
        if (runRate == null) {
            runRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.runRate;
    }

    /**
     * Gets the value of the runTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRunTime() {
        if (runTime == null) {
            runTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.runTime;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getSequence() {
        if (sequence == null) {
            sequence = new ArrayList<SearchColumnLongField>();
        }
        return this.sequence;
    }

    /**
     * Gets the value of the setupTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setupTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetupTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getSetupTime() {
        if (setupTime == null) {
            setupTime = new ArrayList<SearchColumnDoubleField>();
        }
        return this.setupTime;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getStartDate() {
        if (startDate == null) {
            startDate = new ArrayList<SearchColumnDateField>();
        }
        return this.startDate;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getStatus() {
        if (status == null) {
            status = new ArrayList<SearchColumnSelectField>();
        }
        return this.status;
    }

    /**
     * Gets the value of the workOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getWorkOrder() {
        if (workOrder == null) {
            workOrder = new ArrayList<SearchColumnStringField>();
        }
        return this.workOrder;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchColumnCustomFieldList value) {
        this.customFieldList = value;
    }

}
