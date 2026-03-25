
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoutingOrderV2ByCriteriaWithPaging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoutingOrderV2ByCriteriaWithPaging"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetRoutingOrderV2ByCriteriaWithPaging" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingOrderV2ByCriteriaWithPaging", propOrder = {
    "arg0"
})
public class GetRoutingOrderV2ByCriteriaWithPaging {

    protected WSGetRoutingOrderV2ByCriteriaWithPaging arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetRoutingOrderV2ByCriteriaWithPaging() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetRoutingOrderV2ByCriteriaWithPaging(final WSGetRoutingOrderV2ByCriteriaWithPaging arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetRoutingOrderV2ByCriteriaWithPaging }
     *     
     */
    public WSGetRoutingOrderV2ByCriteriaWithPaging getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetRoutingOrderV2ByCriteriaWithPaging }
     *     
     */
    public void setArg0(WSGetRoutingOrderV2ByCriteriaWithPaging value) {
        this.arg0 = value;
    }

}
