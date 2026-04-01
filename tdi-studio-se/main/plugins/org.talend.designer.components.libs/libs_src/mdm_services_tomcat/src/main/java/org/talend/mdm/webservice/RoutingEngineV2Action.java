
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routingEngineV2Action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routingEngineV2Action"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSRoutingEngineV2Action" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routingEngineV2Action", propOrder = {
    "arg0"
})
public class RoutingEngineV2Action {

    protected WSRoutingEngineV2Action arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public RoutingEngineV2Action() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RoutingEngineV2Action(final WSRoutingEngineV2Action arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingEngineV2Action }
     *     
     */
    public WSRoutingEngineV2Action getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingEngineV2Action }
     *     
     */
    public void setArg0(WSRoutingEngineV2Action value) {
        this.arg0 = value;
    }

}
