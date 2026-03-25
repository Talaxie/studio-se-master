
package com.netsuite.webservices.lists.marketing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CampaignEventResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignEventResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="opened" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="openedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="clickedThru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="clickedThruRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="responded" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="respondedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unsubscribed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="unsubscribedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="bounced" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="bouncedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignEventResponse", propOrder = {
    "name",
    "type",
    "dateSent",
    "sent",
    "opened",
    "openedRatio",
    "clickedThru",
    "clickedThruRatio",
    "responded",
    "respondedRatio",
    "unsubscribed",
    "unsubscribedRatio",
    "bounced",
    "bouncedRatio"
})
public class CampaignEventResponse {

    protected String name;
    protected String type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSent;
    protected Double sent;
    protected Double opened;
    protected Double openedRatio;
    protected Double clickedThru;
    protected Double clickedThruRatio;
    protected Long responded;
    protected Double respondedRatio;
    protected Long unsubscribed;
    protected Double unsubscribedRatio;
    protected Long bounced;
    protected Double bouncedRatio;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
    }

    /**
     * Gets the value of the sent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSent() {
        return sent;
    }

    /**
     * Sets the value of the sent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSent(Double value) {
        this.sent = value;
    }

    /**
     * Gets the value of the opened property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpened() {
        return opened;
    }

    /**
     * Sets the value of the opened property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpened(Double value) {
        this.opened = value;
    }

    /**
     * Gets the value of the openedRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenedRatio() {
        return openedRatio;
    }

    /**
     * Sets the value of the openedRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenedRatio(Double value) {
        this.openedRatio = value;
    }

    /**
     * Gets the value of the clickedThru property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickedThru() {
        return clickedThru;
    }

    /**
     * Sets the value of the clickedThru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickedThru(Double value) {
        this.clickedThru = value;
    }

    /**
     * Gets the value of the clickedThruRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickedThruRatio() {
        return clickedThruRatio;
    }

    /**
     * Sets the value of the clickedThruRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickedThruRatio(Double value) {
        this.clickedThruRatio = value;
    }

    /**
     * Gets the value of the responded property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponded() {
        return responded;
    }

    /**
     * Sets the value of the responded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponded(Long value) {
        this.responded = value;
    }

    /**
     * Gets the value of the respondedRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRespondedRatio() {
        return respondedRatio;
    }

    /**
     * Sets the value of the respondedRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRespondedRatio(Double value) {
        this.respondedRatio = value;
    }

    /**
     * Gets the value of the unsubscribed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnsubscribed() {
        return unsubscribed;
    }

    /**
     * Sets the value of the unsubscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnsubscribed(Long value) {
        this.unsubscribed = value;
    }

    /**
     * Gets the value of the unsubscribedRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnsubscribedRatio() {
        return unsubscribedRatio;
    }

    /**
     * Sets the value of the unsubscribedRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnsubscribedRatio(Double value) {
        this.unsubscribedRatio = value;
    }

    /**
     * Gets the value of the bounced property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBounced() {
        return bounced;
    }

    /**
     * Sets the value of the bounced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBounced(Long value) {
        this.bounced = value;
    }

    /**
     * Gets the value of the bouncedRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBouncedRatio() {
        return bouncedRatio;
    }

    /**
     * Sets the value of the bouncedRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBouncedRatio(Double value) {
        this.bouncedRatio = value;
    }

}
