
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSProcessInstanceArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSProcessInstanceArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instance" type="{http://www.talend.com/mdm}WSProcessInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSProcessInstanceArray", propOrder = {
    "instance"
})
public class WSProcessInstanceArray {

    @XmlElement(nillable = true)
    protected List<WSProcessInstance> instance;

    /**
     * Default no-arg constructor
     * 
     */
    public WSProcessInstanceArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSProcessInstanceArray(final List<WSProcessInstance> instance) {
        this.instance = instance;
    }

    /**
     * Gets the value of the instance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProcessInstance }
     * 
     * 
     */
    public List<WSProcessInstance> getInstance() {
        if (instance == null) {
            instance = new ArrayList<WSProcessInstance>();
        }
        return this.instance;
    }

}
