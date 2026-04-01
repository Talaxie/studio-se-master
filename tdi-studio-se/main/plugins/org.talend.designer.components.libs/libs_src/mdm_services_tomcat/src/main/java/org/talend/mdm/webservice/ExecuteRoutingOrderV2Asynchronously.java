
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeRoutingOrderV2Asynchronously complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeRoutingOrderV2Asynchronously"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSExecuteRoutingOrderV2Asynchronously" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeRoutingOrderV2Asynchronously", propOrder = {
    "arg0"
})
public class ExecuteRoutingOrderV2Asynchronously {

    protected WSExecuteRoutingOrderV2Asynchronously arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public ExecuteRoutingOrderV2Asynchronously() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ExecuteRoutingOrderV2Asynchronously(final WSExecuteRoutingOrderV2Asynchronously arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSExecuteRoutingOrderV2Asynchronously }
     *     
     */
    public WSExecuteRoutingOrderV2Asynchronously getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExecuteRoutingOrderV2Asynchronously }
     *     
     */
    public void setArg0(WSExecuteRoutingOrderV2Asynchronously value) {
        this.arg0 = value;
    }

}
