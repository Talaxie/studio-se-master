
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoutingOrderV2PKsByCriteriaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoutingOrderV2PKsByCriteriaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSRoutingOrderV2PKArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingOrderV2PKsByCriteriaResponse", propOrder = {
    "_return"
})
public class GetRoutingOrderV2PKsByCriteriaResponse {

    @XmlElement(name = "return")
    protected WSRoutingOrderV2PKArray _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetRoutingOrderV2PKsByCriteriaResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetRoutingOrderV2PKsByCriteriaResponse(final WSRoutingOrderV2PKArray _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2PKArray }
     *     
     */
    public WSRoutingOrderV2PKArray getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2PKArray }
     *     
     */
    public void setReturn(WSRoutingOrderV2PKArray value) {
        this._return = value;
    }

}
