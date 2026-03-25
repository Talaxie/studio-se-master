
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workflowGetProcessInstancesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflowGetProcessInstancesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSProcessInstanceArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowGetProcessInstancesResponse", propOrder = {
    "_return"
})
public class WorkflowGetProcessInstancesResponse {

    @XmlElement(name = "return")
    protected WSProcessInstanceArray _return;

    /**
     * Default no-arg constructor
     * 
     */
    public WorkflowGetProcessInstancesResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WorkflowGetProcessInstancesResponse(final WSProcessInstanceArray _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSProcessInstanceArray }
     *     
     */
    public WSProcessInstanceArray getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSProcessInstanceArray }
     *     
     */
    public void setReturn(WSProcessInstanceArray value) {
        this._return = value;
    }

}
