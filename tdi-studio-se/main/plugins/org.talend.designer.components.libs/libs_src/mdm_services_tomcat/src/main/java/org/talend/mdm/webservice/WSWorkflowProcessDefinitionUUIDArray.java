
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSWorkflowProcessDefinitionUUIDArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSWorkflowProcessDefinitionUUIDArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsWorkflowProcessDefinitions" type="{http://www.talend.com/mdm}WSWorkflowProcessDefinitionUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWorkflowProcessDefinitionUUIDArray", propOrder = {
    "wsWorkflowProcessDefinitions"
})
public class WSWorkflowProcessDefinitionUUIDArray {

    @XmlElement(nillable = true)
    protected List<WSWorkflowProcessDefinitionUUID> wsWorkflowProcessDefinitions;

    /**
     * Default no-arg constructor
     * 
     */
    public WSWorkflowProcessDefinitionUUIDArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSWorkflowProcessDefinitionUUIDArray(final List<WSWorkflowProcessDefinitionUUID> wsWorkflowProcessDefinitions) {
        this.wsWorkflowProcessDefinitions = wsWorkflowProcessDefinitions;
    }

    /**
     * Gets the value of the wsWorkflowProcessDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsWorkflowProcessDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsWorkflowProcessDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSWorkflowProcessDefinitionUUID }
     * 
     * 
     */
    public List<WSWorkflowProcessDefinitionUUID> getWsWorkflowProcessDefinitions() {
        if (wsWorkflowProcessDefinitions == null) {
            wsWorkflowProcessDefinitions = new ArrayList<WSWorkflowProcessDefinitionUUID>();
        }
        return this.wsWorkflowProcessDefinitions;
    }

}
