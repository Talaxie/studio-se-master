
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGetRoutingOrderV2SByCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetRoutingOrderV2SByCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsSearchCriteria" type="{http://www.talend.com/mdm}WSRoutingOrderV2SearchCriteria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetRoutingOrderV2SByCriteria", propOrder = {
    "wsSearchCriteria"
})
public class WSGetRoutingOrderV2SByCriteria {

    protected WSRoutingOrderV2SearchCriteria wsSearchCriteria;

    /**
     * Default no-arg constructor
     * 
     */
    public WSGetRoutingOrderV2SByCriteria() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSGetRoutingOrderV2SByCriteria(final WSRoutingOrderV2SearchCriteria wsSearchCriteria) {
        this.wsSearchCriteria = wsSearchCriteria;
    }

    /**
     * Gets the value of the wsSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingOrderV2SearchCriteria }
     *     
     */
    public WSRoutingOrderV2SearchCriteria getWsSearchCriteria() {
        return wsSearchCriteria;
    }

    /**
     * Sets the value of the wsSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingOrderV2SearchCriteria }
     *     
     */
    public void setWsSearchCriteria(WSRoutingOrderV2SearchCriteria value) {
        this.wsSearchCriteria = value;
    }

}
