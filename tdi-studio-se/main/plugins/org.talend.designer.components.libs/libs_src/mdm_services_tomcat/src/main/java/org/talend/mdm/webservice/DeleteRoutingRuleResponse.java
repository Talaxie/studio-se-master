
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteRoutingRuleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteRoutingRuleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSRoutingRulePK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteRoutingRuleResponse", propOrder = {
    "_return"
})
public class DeleteRoutingRuleResponse {

    @XmlElement(name = "return")
    protected WSRoutingRulePK _return;

    /**
     * Default no-arg constructor
     * 
     */
    public DeleteRoutingRuleResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeleteRoutingRuleResponse(final WSRoutingRulePK _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingRulePK }
     *     
     */
    public WSRoutingRulePK getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingRulePK }
     *     
     */
    public void setReturn(WSRoutingRulePK value) {
        this._return = value;
    }

}
