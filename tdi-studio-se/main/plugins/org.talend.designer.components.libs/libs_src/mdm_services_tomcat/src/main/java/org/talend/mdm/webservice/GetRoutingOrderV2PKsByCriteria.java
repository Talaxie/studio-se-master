
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoutingOrderV2PKsByCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoutingOrderV2PKsByCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetRoutingOrderV2PKsByCriteria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingOrderV2PKsByCriteria", propOrder = {
    "arg0"
})
public class GetRoutingOrderV2PKsByCriteria {

    protected WSGetRoutingOrderV2PKsByCriteria arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetRoutingOrderV2PKsByCriteria() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetRoutingOrderV2PKsByCriteria(final WSGetRoutingOrderV2PKsByCriteria arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetRoutingOrderV2PKsByCriteria }
     *     
     */
    public WSGetRoutingOrderV2PKsByCriteria getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetRoutingOrderV2PKsByCriteria }
     *     
     */
    public void setArg0(WSGetRoutingOrderV2PKsByCriteria value) {
        this.arg0 = value;
    }

}
