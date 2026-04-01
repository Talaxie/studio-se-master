
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.BudgetExchangeRateFilter;


/**
 * <p>Java class for GetBudgetExchangeRateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="budgetExchangeRateFilter" type="{urn:core_2014_2.platform.webservices.netsuite.com}BudgetExchangeRateFilter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateRequest", propOrder = {
    "budgetExchangeRateFilter"
})
public class GetBudgetExchangeRateRequest {

    @XmlElement(required = true)
    protected BudgetExchangeRateFilter budgetExchangeRateFilter;

    /**
     * Gets the value of the budgetExchangeRateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetExchangeRateFilter }
     *     
     */
    public BudgetExchangeRateFilter getBudgetExchangeRateFilter() {
        return budgetExchangeRateFilter;
    }

    /**
     * Sets the value of the budgetExchangeRateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetExchangeRateFilter }
     *     
     */
    public void setBudgetExchangeRateFilter(BudgetExchangeRateFilter value) {
        this.budgetExchangeRateFilter = value;
    }

}
