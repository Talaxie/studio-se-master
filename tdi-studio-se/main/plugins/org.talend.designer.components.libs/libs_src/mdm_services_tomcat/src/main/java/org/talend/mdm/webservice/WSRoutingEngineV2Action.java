
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoutingEngineV2Action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRoutingEngineV2Action"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAction" type="{http://www.talend.com/mdm}WSRoutingEngineV2ActionCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingEngineV2Action", propOrder = {
    "wsAction"
})
public class WSRoutingEngineV2Action {

    @XmlSchemaType(name = "string")
    protected WSRoutingEngineV2ActionCode wsAction;

    /**
     * Default no-arg constructor
     * 
     */
    public WSRoutingEngineV2Action() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSRoutingEngineV2Action(final WSRoutingEngineV2ActionCode wsAction) {
        this.wsAction = wsAction;
    }

    /**
     * Gets the value of the wsAction property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingEngineV2ActionCode }
     *     
     */
    public WSRoutingEngineV2ActionCode getWsAction() {
        return wsAction;
    }

    /**
     * Sets the value of the wsAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingEngineV2ActionCode }
     *     
     */
    public void setWsAction(WSRoutingEngineV2ActionCode value) {
        this.wsAction = value;
    }

}
