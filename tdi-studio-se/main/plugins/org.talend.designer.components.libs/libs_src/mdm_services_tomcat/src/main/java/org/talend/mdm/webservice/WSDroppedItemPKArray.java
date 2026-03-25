
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDroppedItemPKArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDroppedItemPKArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsDroppedItemPK" type="{http://www.talend.com/mdm}WSDroppedItemPK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDroppedItemPKArray", propOrder = {
    "wsDroppedItemPK"
})
public class WSDroppedItemPKArray {

    @XmlElement(nillable = true)
    protected List<WSDroppedItemPK> wsDroppedItemPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSDroppedItemPKArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSDroppedItemPKArray(final List<WSDroppedItemPK> wsDroppedItemPK) {
        this.wsDroppedItemPK = wsDroppedItemPK;
    }

    /**
     * Gets the value of the wsDroppedItemPK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsDroppedItemPK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsDroppedItemPK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSDroppedItemPK }
     * 
     * 
     */
    public List<WSDroppedItemPK> getWsDroppedItemPK() {
        if (wsDroppedItemPK == null) {
            wsDroppedItemPK = new ArrayList<WSDroppedItemPK>();
        }
        return this.wsDroppedItemPK;
    }

}
