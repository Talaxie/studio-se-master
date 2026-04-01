
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDeleteRoutingOrderV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteRoutingOrderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsRoutingOrderPK" type="{http://www.talend.com/mdm}WSRoutingOrderV2PK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteRoutingOrderV2", propOrder = {
    "wsRoutingOrderPK"
})
public class WSDeleteRoutingOrderV2 {

    protected WSRoutingOrderV2PK wsRoutingOrderPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSDeleteRoutingOrderV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSDeleteRoutingOrderV2(final WSRoutingOrderV2PK wsRoutingOrderPK) {
        this.wsRoutingOrderPK = wsRoutingOrderPK;
    }

    /**
     * Gets the value of the wsRoutingOrderPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2PK }
     *     
     */
    public WSRoutingOrderV2PK getWsRoutingOrderPK() {
        return wsRoutingOrderPK;
    }

    /**
     * Sets the value of the wsRoutingOrderPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2PK }
     *     
     */
    public void setWsRoutingOrderPK(WSRoutingOrderV2PK value) {
        this.wsRoutingOrderPK = value;
    }

}
