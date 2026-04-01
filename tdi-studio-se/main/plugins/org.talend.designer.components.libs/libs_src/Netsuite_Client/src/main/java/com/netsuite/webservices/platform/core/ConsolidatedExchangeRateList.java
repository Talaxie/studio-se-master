
package com.netsuite.webservices.platform.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidatedExchangeRateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedExchangeRateList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consolidatedExchangeRate" type="{urn:core_2014_2.platform.webservices.netsuite.com}ConsolidatedExchangeRate" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedExchangeRateList", propOrder = {
    "consolidatedExchangeRate"
})
public class ConsolidatedExchangeRateList {

    @XmlElement(required = true)
    protected List<ConsolidatedExchangeRate> consolidatedExchangeRate;

    /**
     * Gets the value of the consolidatedExchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatedExchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatedExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidatedExchangeRate }
     * 
     * 
     */
    public List<ConsolidatedExchangeRate> getConsolidatedExchangeRate() {
        if (consolidatedExchangeRate == null) {
            consolidatedExchangeRate = new ArrayList<ConsolidatedExchangeRate>();
        }
        return this.consolidatedExchangeRate;
    }

}
