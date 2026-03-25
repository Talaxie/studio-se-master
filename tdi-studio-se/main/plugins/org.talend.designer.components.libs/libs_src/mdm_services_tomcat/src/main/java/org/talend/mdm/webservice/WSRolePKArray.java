
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRolePKArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRolePKArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsRolePK" type="{http://www.talend.com/mdm}WSRolePK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRolePKArray", propOrder = {
    "wsRolePK"
})
public class WSRolePKArray {

    @XmlElement(nillable = true)
    protected List<WSRolePK> wsRolePK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSRolePKArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSRolePKArray(final List<WSRolePK> wsRolePK) {
        this.wsRolePK = wsRolePK;
    }

    /**
     * Gets the value of the wsRolePK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsRolePK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsRolePK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSRolePK }
     * 
     * 
     */
    public List<WSRolePK> getWsRolePK() {
        if (wsRolePK == null) {
            wsRolePK = new ArrayList<WSRolePK>();
        }
        return this.wsRolePK;
    }

}
