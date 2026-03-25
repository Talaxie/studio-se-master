
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.GetSavedSearchResult;


/**
 * <p>Java class for GetSavedSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSavedSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}getSavedSearchResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSavedSearchResponse", propOrder = {
    "getSavedSearchResult"
})
public class GetSavedSearchResponse {

    @XmlElement(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", required = true)
    protected GetSavedSearchResult getSavedSearchResult;

    /**
     * Gets the value of the getSavedSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSavedSearchResult }
     *     
     */
    public GetSavedSearchResult getGetSavedSearchResult() {
        return getSavedSearchResult;
    }

    /**
     * Sets the value of the getSavedSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSavedSearchResult }
     *     
     */
    public void setGetSavedSearchResult(GetSavedSearchResult value) {
        this.getSavedSearchResult = value;
    }

}
