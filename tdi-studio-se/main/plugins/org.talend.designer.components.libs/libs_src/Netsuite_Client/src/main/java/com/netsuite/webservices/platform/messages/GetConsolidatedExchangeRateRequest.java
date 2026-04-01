
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.ConsolidatedExchangeRateFilter;


/**
 * <p>Java class for GetConsolidatedExchangeRateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConsolidatedExchangeRateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consolidatedExchangeRateFilter" type="{urn:core_2014_2.platform.webservices.netsuite.com}ConsolidatedExchangeRateFilter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConsolidatedExchangeRateRequest", propOrder = {
    "consolidatedExchangeRateFilter"
})
public class GetConsolidatedExchangeRateRequest {

    @XmlElement(required = true)
    protected ConsolidatedExchangeRateFilter consolidatedExchangeRateFilter;

    /**
     * Gets the value of the consolidatedExchangeRateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedExchangeRateFilter }
     *     
     */
    public ConsolidatedExchangeRateFilter getConsolidatedExchangeRateFilter() {
        return consolidatedExchangeRateFilter;
    }

    /**
     * Sets the value of the consolidatedExchangeRateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedExchangeRateFilter }
     *     
     */
    public void setConsolidatedExchangeRateFilter(ConsolidatedExchangeRateFilter value) {
        this.consolidatedExchangeRateFilter = value;
    }

}
