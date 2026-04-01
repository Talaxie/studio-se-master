
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoutingOrderV2SearchCriteriaWithPaging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRoutingOrderV2SearchCriteriaWithPaging"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anyFieldContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemPKConceptContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemPKIDFieldsContain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="messageContain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceJNDIContains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceParametersContain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="status" type="{http://www.talend.com/mdm}WSRoutingOrderV2Status" minOccurs="0"/&gt;
 *         &lt;element name="timeCreatedMax" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeCreatedMin" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeLastRunCompletedMax" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeLastRunCompletedMin" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeLastRunStartedMax" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeLastRunStartedMin" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeScheduledMax" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeScheduledMin" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalCountOnFirstResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingOrderV2SearchCriteriaWithPaging", propOrder = {
    "anyFieldContains",
    "itemPKConceptContains",
    "itemPKIDFieldsContain",
    "maxItems",
    "messageContain",
    "nameContains",
    "serviceJNDIContains",
    "serviceParametersContain",
    "skip",
    "status",
    "timeCreatedMax",
    "timeCreatedMin",
    "timeLastRunCompletedMax",
    "timeLastRunCompletedMin",
    "timeLastRunStartedMax",
    "timeLastRunStartedMin",
    "timeScheduledMax",
    "timeScheduledMin",
    "totalCountOnFirstResult"
})
public class WSRoutingOrderV2SearchCriteriaWithPaging {

    protected String anyFieldContains;
    protected String itemPKConceptContains;
    protected String itemPKIDFieldsContain;
    protected int maxItems;
    protected String messageContain;
    protected String nameContains;
    protected String serviceJNDIContains;
    protected String serviceParametersContain;
    protected int skip;
    @XmlSchemaType(name = "string")
    protected WSRoutingOrderV2Status status;
    protected long timeCreatedMax;
    protected long timeCreatedMin;
    protected long timeLastRunCompletedMax;
    protected long timeLastRunCompletedMin;
    protected long timeLastRunStartedMax;
    protected long timeLastRunStartedMin;
    protected long timeScheduledMax;
    protected long timeScheduledMin;
    protected Boolean totalCountOnFirstResult;

    /**
     * Default no-arg constructor
     * 
     */
    public WSRoutingOrderV2SearchCriteriaWithPaging() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSRoutingOrderV2SearchCriteriaWithPaging(final String anyFieldContains, final String itemPKConceptContains, final String itemPKIDFieldsContain, final int maxItems, final String messageContain, final String nameContains, final String serviceJNDIContains, final String serviceParametersContain, final int skip, final WSRoutingOrderV2Status status, final long timeCreatedMax, final long timeCreatedMin, final long timeLastRunCompletedMax, final long timeLastRunCompletedMin, final long timeLastRunStartedMax, final long timeLastRunStartedMin, final long timeScheduledMax, final long timeScheduledMin, final Boolean totalCountOnFirstResult) {
        this.anyFieldContains = anyFieldContains;
        this.itemPKConceptContains = itemPKConceptContains;
        this.itemPKIDFieldsContain = itemPKIDFieldsContain;
        this.maxItems = maxItems;
        this.messageContain = messageContain;
        this.nameContains = nameContains;
        this.serviceJNDIContains = serviceJNDIContains;
        this.serviceParametersContain = serviceParametersContain;
        this.skip = skip;
        this.status = status;
        this.timeCreatedMax = timeCreatedMax;
        this.timeCreatedMin = timeCreatedMin;
        this.timeLastRunCompletedMax = timeLastRunCompletedMax;
        this.timeLastRunCompletedMin = timeLastRunCompletedMin;
        this.timeLastRunStartedMax = timeLastRunStartedMax;
        this.timeLastRunStartedMin = timeLastRunStartedMin;
        this.timeScheduledMax = timeScheduledMax;
        this.timeScheduledMin = timeScheduledMin;
        this.totalCountOnFirstResult = totalCountOnFirstResult;
    }

    /**
     * Gets the value of the anyFieldContains property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyFieldContains() {
        return anyFieldContains;
    }

    /**
     * Sets the value of the anyFieldContains property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyFieldContains(String value) {
        this.anyFieldContains = value;
    }

    /**
     * Gets the value of the itemPKConceptContains property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPKConceptContains() {
        return itemPKConceptContains;
    }

    /**
     * Sets the value of the itemPKConceptContains property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPKConceptContains(String value) {
        this.itemPKConceptContains = value;
    }

    /**
     * Gets the value of the itemPKIDFieldsContain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPKIDFieldsContain() {
        return itemPKIDFieldsContain;
    }

    /**
     * Sets the value of the itemPKIDFieldsContain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPKIDFieldsContain(String value) {
        this.itemPKIDFieldsContain = value;
    }

    /**
     * Gets the value of the maxItems property.
     * 
     */
    public int getMaxItems() {
        return maxItems;
    }

    /**
     * Sets the value of the maxItems property.
     * 
     */
    public void setMaxItems(int value) {
        this.maxItems = value;
    }

    /**
     * Gets the value of the messageContain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageContain() {
        return messageContain;
    }

    /**
     * Sets the value of the messageContain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageContain(String value) {
        this.messageContain = value;
    }

    /**
     * Gets the value of the nameContains property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * Sets the value of the nameContains property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameContains(String value) {
        this.nameContains = value;
    }

    /**
     * Gets the value of the serviceJNDIContains property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceJNDIContains() {
        return serviceJNDIContains;
    }

    /**
     * Sets the value of the serviceJNDIContains property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceJNDIContains(String value) {
        this.serviceJNDIContains = value;
    }

    /**
     * Gets the value of the serviceParametersContain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceParametersContain() {
        return serviceParametersContain;
    }

    /**
     * Sets the value of the serviceParametersContain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceParametersContain(String value) {
        this.serviceParametersContain = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     */
    public int getSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     */
    public void setSkip(int value) {
        this.skip = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2Status }
     *     
     */
    public WSRoutingOrderV2Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2Status }
     *     
     */
    public void setStatus(WSRoutingOrderV2Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeCreatedMax property.
     * 
     */
    public long getTimeCreatedMax() {
        return timeCreatedMax;
    }

    /**
     * Sets the value of the timeCreatedMax property.
     * 
     */
    public void setTimeCreatedMax(long value) {
        this.timeCreatedMax = value;
    }

    /**
     * Gets the value of the timeCreatedMin property.
     * 
     */
    public long getTimeCreatedMin() {
        return timeCreatedMin;
    }

    /**
     * Sets the value of the timeCreatedMin property.
     * 
     */
    public void setTimeCreatedMin(long value) {
        this.timeCreatedMin = value;
    }

    /**
     * Gets the value of the timeLastRunCompletedMax property.
     * 
     */
    public long getTimeLastRunCompletedMax() {
        return timeLastRunCompletedMax;
    }

    /**
     * Sets the value of the timeLastRunCompletedMax property.
     * 
     */
    public void setTimeLastRunCompletedMax(long value) {
        this.timeLastRunCompletedMax = value;
    }

    /**
     * Gets the value of the timeLastRunCompletedMin property.
     * 
     */
    public long getTimeLastRunCompletedMin() {
        return timeLastRunCompletedMin;
    }

    /**
     * Sets the value of the timeLastRunCompletedMin property.
     * 
     */
    public void setTimeLastRunCompletedMin(long value) {
        this.timeLastRunCompletedMin = value;
    }

    /**
     * Gets the value of the timeLastRunStartedMax property.
     * 
     */
    public long getTimeLastRunStartedMax() {
        return timeLastRunStartedMax;
    }

    /**
     * Sets the value of the timeLastRunStartedMax property.
     * 
     */
    public void setTimeLastRunStartedMax(long value) {
        this.timeLastRunStartedMax = value;
    }

    /**
     * Gets the value of the timeLastRunStartedMin property.
     * 
     */
    public long getTimeLastRunStartedMin() {
        return timeLastRunStartedMin;
    }

    /**
     * Sets the value of the timeLastRunStartedMin property.
     * 
     */
    public void setTimeLastRunStartedMin(long value) {
        this.timeLastRunStartedMin = value;
    }

    /**
     * Gets the value of the timeScheduledMax property.
     * 
     */
    public long getTimeScheduledMax() {
        return timeScheduledMax;
    }

    /**
     * Sets the value of the timeScheduledMax property.
     * 
     */
    public void setTimeScheduledMax(long value) {
        this.timeScheduledMax = value;
    }

    /**
     * Gets the value of the timeScheduledMin property.
     * 
     */
    public long getTimeScheduledMin() {
        return timeScheduledMin;
    }

    /**
     * Sets the value of the timeScheduledMin property.
     * 
     */
    public void setTimeScheduledMin(long value) {
        this.timeScheduledMin = value;
    }

    /**
     * Gets the value of the totalCountOnFirstResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalCountOnFirstResult() {
        return totalCountOnFirstResult;
    }

    /**
     * Sets the value of the totalCountOnFirstResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalCountOnFirstResult(Boolean value) {
        this.totalCountOnFirstResult = value;
    }

}
