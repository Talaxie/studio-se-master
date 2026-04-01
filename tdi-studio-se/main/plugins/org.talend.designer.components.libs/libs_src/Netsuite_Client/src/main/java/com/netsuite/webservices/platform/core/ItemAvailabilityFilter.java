
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemAvailabilityFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAvailabilityFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRefList"/&gt;
 *         &lt;element name="lastQtyAvailableChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAvailabilityFilter", propOrder = {
    "item",
    "lastQtyAvailableChange"
})
public class ItemAvailabilityFilter {

    @XmlElement(required = true)
    protected RecordRefList item;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastQtyAvailableChange;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setItem(RecordRefList value) {
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

}
