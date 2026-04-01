
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBudgetExchangeRateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}status"/&gt;
 *         &lt;element name="budgetExchangeRateList" type="{urn:core_2014_2.platform.webservices.netsuite.com}BudgetExchangeRateList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateResult", propOrder = {
    "status",
    "budgetExchangeRateList"
})
public class GetBudgetExchangeRateResult {

    @XmlElement(required = true)
    protected Status status;
    protected BudgetExchangeRateList budgetExchangeRateList;

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
     * Gets the value of the budgetExchangeRateList property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetExchangeRateList }
     *     
     */
    public BudgetExchangeRateList getBudgetExchangeRateList() {
        return budgetExchangeRateList;
    }

    /**
     * Sets the value of the budgetExchangeRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetExchangeRateList }
     *     
     */
    public void setBudgetExchangeRateList(BudgetExchangeRateList value) {
        this.budgetExchangeRateList = value;
    }

}
