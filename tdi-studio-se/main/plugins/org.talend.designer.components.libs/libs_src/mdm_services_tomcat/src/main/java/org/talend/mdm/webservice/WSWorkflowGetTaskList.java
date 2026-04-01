
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSWorkflowGetTaskList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSWorkflowGetTaskList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processInstanceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWorkflowGetTaskList", propOrder = {
    "processInstanceId"
})
public class WSWorkflowGetTaskList {

    protected long processInstanceId;

    /**
     * Default no-arg constructor
     * 
     */
    public WSWorkflowGetTaskList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSWorkflowGetTaskList(final long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    /**
     * Gets the value of the processInstanceId property.
     * 
     */
    public long getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * Sets the value of the processInstanceId property.
     * 
     */
    public void setProcessInstanceId(long value) {
        this.processInstanceId = value;
    }

}
