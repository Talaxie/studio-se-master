
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMenuPKArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMenuPKArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsMenuPK" type="{http://www.talend.com/mdm}WSMenuPK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMenuPKArray", propOrder = {
    "wsMenuPK"
})
public class WSMenuPKArray {

    @XmlElement(nillable = true)
    protected List<WSMenuPK> wsMenuPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSMenuPKArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSMenuPKArray(final List<WSMenuPK> wsMenuPK) {
        this.wsMenuPK = wsMenuPK;
    }

    /**
     * Gets the value of the wsMenuPK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsMenuPK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsMenuPK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSMenuPK }
     * 
     * 
     */
    public List<WSMenuPK> getWsMenuPK() {
        if (wsMenuPK == null) {
            wsMenuPK = new ArrayList<WSMenuPK>();
        }
        return this.wsMenuPK;
    }

}
