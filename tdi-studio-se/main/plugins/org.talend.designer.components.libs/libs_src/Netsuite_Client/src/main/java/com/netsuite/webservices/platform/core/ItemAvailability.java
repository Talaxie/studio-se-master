
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef"/&gt;
 *         &lt;element name="lastQtyAvailableChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="locationId" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="onHandValueMli" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="reorderPoint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="preferredStockLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityOnOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityCommitted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantityAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAvailability", propOrder = {
    "item",
    "lastQtyAvailableChange",
    "locationId",
    "quantityOnHand",
    "onHandValueMli",
    "reorderPoint",
    "preferredStockLevel",
    "quantityOnOrder",
    "quantityCommitted",
    "quantityBackOrdered",
    "quantityAvailable"
})
public class ItemAvailability {

    @XmlElement(required = true)
    protected RecordRef item;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastQtyAvailableChange;
    protected RecordRef locationId;
    protected Double quantityOnHand;
    protected Double onHandValueMli;
    protected Double reorderPoint;
    protected Double preferredStockLevel;
    protected Double quantityOnOrder;
    protected Double quantityCommitted;
    protected Double quantityBackOrdered;
    protected Double quantityAvailable;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * Gets the value of the lastQtyAvailableChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastQtyAvailableChange() {
        return lastQtyAvailableChange;
    }

    /**
     * Sets the value of the lastQtyAvailableChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastQtyAvailableChange(XMLGregorianCalendar value) {
        this.lastQtyAvailableChange = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocationId(RecordRef value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnHand(Double value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the onHandValueMli property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOnHandValueMli() {
        return onHandValueMli;
    }

    /**
     * Sets the value of the onHandValueMli property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOnHandValueMli(Double value) {
        this.onHandValueMli = value;
    }

    /**
     * Gets the value of the reorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReorderPoint() {
        return reorderPoint;
    }

    /**
     * Sets the value of the reorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReorderPoint(Double value) {
        this.reorderPoint = value;
    }

    /**
     * Gets the value of the preferredStockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredStockLevel() {
        return preferredStockLevel;
    }

    /**
     * Sets the value of the preferredStockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredStockLevel(Double value) {
        this.preferredStockLevel = value;
    }

    /**
     * Gets the value of the quantityOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * Sets the value of the quantityOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnOrder(Double value) {
        this.quantityOnOrder = value;
    }

    /**
     * Gets the value of the quantityCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * Sets the value of the quantityCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityCommitted(Double value) {
        this.quantityCommitted = value;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * Sets the value of the quantityBackOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBackOrdered(Double value) {
        this.quantityBackOrdered = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityAvailable(Double value) {
        this.quantityAvailable = value;
    }

}
