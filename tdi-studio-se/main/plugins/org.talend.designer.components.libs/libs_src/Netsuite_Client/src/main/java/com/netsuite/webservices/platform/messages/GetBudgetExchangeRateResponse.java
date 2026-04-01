
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.GetBudgetExchangeRateResult;


/**
 * <p>Java class for GetBudgetExchangeRateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}getBudgetExchangeRateResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateResponse", propOrder = {
    "getBudgetExchangeRateResult"
})
public class GetBudgetExchangeRateResponse {

    @XmlElement(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", required = true)
    protected GetBudgetExchangeRateResult getBudgetExchangeRateResult;

    /**
     * Gets the value of the getBudgetExchangeRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetBudgetExchangeRateResult }
     *     
     */
    public GetBudgetExchangeRateResult getGetBudgetExchangeRateResult() {
        return getBudgetExchangeRateResult;
    }

    /**
     * Sets the value of the getBudgetExchangeRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBudgetExchangeRateResult }
     *     
     */
    public void setGetBudgetExchangeRateResult(GetBudgetExchangeRateResult value) {
        this.getBudgetExchangeRateResult = value;
    }

}
