
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.GetConsolidatedExchangeRateResult;


/**
 * <p>Java class for GetConsolidatedExchangeRateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConsolidatedExchangeRateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}getConsolidatedExchangeRateResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConsolidatedExchangeRateResponse", propOrder = {
    "getConsolidatedExchangeRateResult"
})
public class GetConsolidatedExchangeRateResponse {

    @XmlElement(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", required = true)
    protected GetConsolidatedExchangeRateResult getConsolidatedExchangeRateResult;

    /**
     * Gets the value of the getConsolidatedExchangeRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetConsolidatedExchangeRateResult }
     *     
     */
    public GetConsolidatedExchangeRateResult getGetConsolidatedExchangeRateResult() {
        return getConsolidatedExchangeRateResult;
    }

    /**
     * Sets the value of the getConsolidatedExchangeRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetConsolidatedExchangeRateResult }
     *     
     */
    public void setGetConsolidatedExchangeRateResult(GetConsolidatedExchangeRateResult value) {
        this.getConsolidatedExchangeRateResult = value;
    }

}
