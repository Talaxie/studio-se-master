
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSWorkflowGetProcessInstances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSWorkflowGetProcessInstances"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuid" type="{http://www.talend.com/mdm}WSWorkflowProcessDefinitionUUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWorkflowGetProcessInstances", propOrder = {
    "uuid"
})
public class WSWorkflowGetProcessInstances {

    protected WSWorkflowProcessDefinitionUUID uuid;

    /**
     * Default no-arg constructor
     * 
     */
    public WSWorkflowGetProcessInstances() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSWorkflowGetProcessInstances(final WSWorkflowProcessDefinitionUUID uuid) {
        this.uuid = uuid;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link WSWorkflowProcessDefinitionUUID }
     *     
     */
    public WSWorkflowProcessDefinitionUUID getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSWorkflowProcessDefinitionUUID }
     *     
     */
    public void setUuid(WSWorkflowProcessDefinitionUUID value) {
        this.uuid = value;
    }

}
