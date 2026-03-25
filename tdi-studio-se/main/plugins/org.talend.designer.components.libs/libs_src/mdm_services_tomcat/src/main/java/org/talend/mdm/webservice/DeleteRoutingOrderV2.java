
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteRoutingOrderV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteRoutingOrderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSDeleteRoutingOrderV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteRoutingOrderV2", propOrder = {
    "arg0"
})
public class DeleteRoutingOrderV2 {

    protected WSDeleteRoutingOrderV2 arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public DeleteRoutingOrderV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeleteRoutingOrderV2(final WSDeleteRoutingOrderV2 arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSDeleteRoutingOrderV2 }
     *     
     */
    public WSDeleteRoutingOrderV2 getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDeleteRoutingOrderV2 }
     *     
     */
    public void setArg0(WSDeleteRoutingOrderV2 value) {
        this.arg0 = value;
    }

}
