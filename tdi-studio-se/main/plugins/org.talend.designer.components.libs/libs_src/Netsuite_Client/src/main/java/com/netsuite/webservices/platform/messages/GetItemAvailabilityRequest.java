
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.ItemAvailabilityFilter;


/**
 * <p>Java class for GetItemAvailabilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemAvailabilityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemAvailabilityFilter" type="{urn:core_2014_2.platform.webservices.netsuite.com}ItemAvailabilityFilter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemAvailabilityRequest", propOrder = {
    "itemAvailabilityFilter"
})
public class GetItemAvailabilityRequest {

    @XmlElement(required = true)
    protected ItemAvailabilityFilter itemAvailabilityFilter;

    /**
     * Gets the value of the itemAvailabilityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAvailabilityFilter }
     *     
     */
    public ItemAvailabilityFilter getItemAvailabilityFilter() {
        return itemAvailabilityFilter;
    }

    /**
     * Sets the value of the itemAvailabilityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAvailabilityFilter }
     *     
     */
    public void setItemAvailabilityFilter(ItemAvailabilityFilter value) {
        this.itemAvailabilityFilter = value;
    }

}
