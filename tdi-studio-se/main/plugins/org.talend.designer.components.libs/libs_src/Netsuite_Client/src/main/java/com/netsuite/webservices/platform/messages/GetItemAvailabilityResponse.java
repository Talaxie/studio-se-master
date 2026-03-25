
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.GetItemAvailabilityResult;


/**
 * <p>Java class for GetItemAvailabilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemAvailabilityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}getItemAvailabilityResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemAvailabilityResponse", propOrder = {
    "getItemAvailabilityResult"
})
public class GetItemAvailabilityResponse {

    @XmlElement(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", required = true)
    protected GetItemAvailabilityResult getItemAvailabilityResult;

    /**
     * Gets the value of the getItemAvailabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetItemAvailabilityResult }
     *     
     */
    public GetItemAvailabilityResult getGetItemAvailabilityResult() {
        return getItemAvailabilityResult;
    }

    /**
     * Sets the value of the getItemAvailabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemAvailabilityResult }
     *     
     */
    public void setGetItemAvailabilityResult(GetItemAvailabilityResult value) {
        this.getItemAvailabilityResult = value;
    }

}
