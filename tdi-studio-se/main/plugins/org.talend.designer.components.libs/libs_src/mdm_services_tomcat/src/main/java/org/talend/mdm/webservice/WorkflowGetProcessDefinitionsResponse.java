
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workflowGetProcessDefinitionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflowGetProcessDefinitionsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSWorkflowProcessDefinitionUUIDArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowGetProcessDefinitionsResponse", propOrder = {
    "_return"
})
public class WorkflowGetProcessDefinitionsResponse {

    @XmlElement(name = "return")
    protected WSWorkflowProcessDefinitionUUIDArray _return;

    /**
     * Default no-arg constructor
     * 
     */
    public WorkflowGetProcessDefinitionsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WorkflowGetProcessDefinitionsResponse(final WSWorkflowProcessDefinitionUUIDArray _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSWorkflowProcessDefinitionUUIDArray }
     *     
     */
    public WSWorkflowProcessDefinitionUUIDArray getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSWorkflowProcessDefinitionUUIDArray }
     *     
     */
    public void setReturn(WSWorkflowProcessDefinitionUUIDArray value) {
        this._return = value;
    }

}
