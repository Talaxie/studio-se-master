
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoutingOrderV2Array complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRoutingOrderV2Array"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsRoutingOrder" type="{http://www.talend.com/mdm}WSRoutingOrderV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingOrderV2Array", propOrder = {
    "wsRoutingOrder"
})
public class WSRoutingOrderV2Array {

    @XmlElement(nillable = true)
    protected List<WSRoutingOrderV2> wsRoutingOrder;

    /**
     * Default no-arg constructor
     * 
     */
    public WSRoutingOrderV2Array() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSRoutingOrderV2Array(final List<WSRoutingOrderV2> wsRoutingOrder) {
        this.wsRoutingOrder = wsRoutingOrder;
    }

    /**
     * Gets the value of the wsRoutingOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsRoutingOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsRoutingOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSRoutingOrderV2 }
     * 
     * 
     */
    public List<WSRoutingOrderV2> getWsRoutingOrder() {
        if (wsRoutingOrder == null) {
            wsRoutingOrder = new ArrayList<WSRoutingOrderV2>();
        }
        return this.wsRoutingOrder;
    }

}
