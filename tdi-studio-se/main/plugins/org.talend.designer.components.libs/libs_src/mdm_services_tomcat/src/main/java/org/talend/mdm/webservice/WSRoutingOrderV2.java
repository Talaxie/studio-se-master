
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoutingOrderV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRoutingOrderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingUniverseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bindingUserToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceJNDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.talend.com/mdm}WSRoutingOrderV2Status" minOccurs="0"/&gt;
 *         &lt;element name="timeCreated" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeLastRunCompleted" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeLastRunStarted" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timeScheduled" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="wsItemPK" type="{http://www.talend.com/mdm}WSItemPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingOrderV2", propOrder = {
    "bindingUniverseName",
    "bindingUserToken",
    "message",
    "name",
    "serviceJNDI",
    "serviceParameters",
    "status",
    "timeCreated",
    "timeLastRunCompleted",
    "timeLastRunStarted",
    "timeScheduled",
    "wsItemPK"
})
public class WSRoutingOrderV2 {

    protected String bindingUniverseName;
    protected String bindingUserToken;
    protected String message;
    protected String name;
    protected String serviceJNDI;
    protected String serviceParameters;
    @XmlSchemaType(name = "string")
    protected WSRoutingOrderV2Status status;
    protected long timeCreated;
    protected long timeLastRunCompleted;
    protected long timeLastRunStarted;
    protected long timeScheduled;
    protected WSItemPK wsItemPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSRoutingOrderV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSRoutingOrderV2(final String bindingUniverseName, final String bindingUserToken, final String message, final String name, final String serviceJNDI, final String serviceParameters, final WSRoutingOrderV2Status status, final long timeCreated, final long timeLastRunCompleted, final long timeLastRunStarted, final long timeScheduled, final WSItemPK wsItemPK) {
        this.bindingUniverseName = bindingUniverseName;
        this.bindingUserToken = bindingUserToken;
        this.message = message;
        this.name = name;
        this.serviceJNDI = serviceJNDI;
        this.serviceParameters = serviceParameters;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeLastRunCompleted = timeLastRunCompleted;
        this.timeLastRunStarted = timeLastRunStarted;
        this.timeScheduled = timeScheduled;
        this.wsItemPK = wsItemPK;
    }

    /**
     * Gets the value of the bindingUniverseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingUniverseName() {
        return bindingUniverseName;
    }

    /**
     * Sets the value of the bindingUniverseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingUniverseName(String value) {
        this.bindingUniverseName = value;
    }

    /**
     * Gets the value of the bindingUserToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingUserToken() {
        return bindingUserToken;
    }

    /**
     * Sets the value of the bindingUserToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingUserToken(String value) {
        this.bindingUserToken = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the serviceJNDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceJNDI() {
        return serviceJNDI;
    }

    /**
     * Sets the value of the serviceJNDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceJNDI(String value) {
        this.serviceJNDI = value;
    }

    /**
     * Gets the value of the serviceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceParameters() {
        return serviceParameters;
    }

    /**
     * Sets the value of the serviceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceParameters(String value) {
        this.serviceParameters = value;
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
     * Gets the value of the timeCreated property.
     * 
     */
    public long getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     */
    public void setTimeCreated(long value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the timeLastRunCompleted property.
     * 
     */
    public long getTimeLastRunCompleted() {
        return timeLastRunCompleted;
    }

    /**
     * Sets the value of the timeLastRunCompleted property.
     * 
     */
    public void setTimeLastRunCompleted(long value) {
        this.timeLastRunCompleted = value;
    }

    /**
     * Gets the value of the timeLastRunStarted property.
     * 
     */
    public long getTimeLastRunStarted() {
        return timeLastRunStarted;
    }

    /**
     * Sets the value of the timeLastRunStarted property.
     * 
     */
    public void setTimeLastRunStarted(long value) {
        this.timeLastRunStarted = value;
    }

    /**
     * Gets the value of the timeScheduled property.
     * 
     */
    public long getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * Sets the value of the timeScheduled property.
     * 
     */
    public void setTimeScheduled(long value) {
        this.timeScheduled = value;
    }

    /**
     * Gets the value of the wsItemPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSItemPK }
     *     
     */
    public WSItemPK getWsItemPK() {
        return wsItemPK;
    }

    /**
     * Sets the value of the wsItemPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSItemPK }
     *     
     */
    public void setWsItemPK(WSItemPK value) {
        this.wsItemPK = value;
    }

}
