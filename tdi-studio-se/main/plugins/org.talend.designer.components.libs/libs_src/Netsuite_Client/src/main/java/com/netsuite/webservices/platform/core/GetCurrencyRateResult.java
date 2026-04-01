
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCurrencyRateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrencyRateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}status"/&gt;
 *         &lt;element name="currencyRateList" type="{urn:core_2014_2.platform.webservices.netsuite.com}CurrencyRateList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyRateResult", propOrder = {
    "status",
    "currencyRateList"
})
public class GetCurrencyRateResult {

    @XmlElement(required = true)
    protected Status status;
    protected CurrencyRateList currencyRateList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the currencyRateList property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRateList }
     *     
     */
    public CurrencyRateList getCurrencyRateList() {
        return currencyRateList;
    }

    /**
     * Sets the value of the currencyRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRateList }
     *     
     */
    public void setCurrencyRateList(CurrencyRateList value) {
        this.currencyRateList = value;
    }

}
