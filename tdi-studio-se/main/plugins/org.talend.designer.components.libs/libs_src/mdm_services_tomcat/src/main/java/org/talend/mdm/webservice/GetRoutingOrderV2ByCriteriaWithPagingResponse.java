
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoutingOrderV2ByCriteriaWithPagingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoutingOrderV2ByCriteriaWithPagingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSRoutingOrderV2Array" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingOrderV2ByCriteriaWithPagingResponse", propOrder = {
    "_return"
})
public class GetRoutingOrderV2ByCriteriaWithPagingResponse {

    @XmlElement(name = "return")
    protected WSRoutingOrderV2Array _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetRoutingOrderV2ByCriteriaWithPagingResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetRoutingOrderV2ByCriteriaWithPagingResponse(final WSRoutingOrderV2Array _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2Array }
     *     
     */
    public WSRoutingOrderV2Array getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2Array }
     *     
     */
    public void setReturn(WSRoutingOrderV2Array value) {
        this._return = value;
    }

}
