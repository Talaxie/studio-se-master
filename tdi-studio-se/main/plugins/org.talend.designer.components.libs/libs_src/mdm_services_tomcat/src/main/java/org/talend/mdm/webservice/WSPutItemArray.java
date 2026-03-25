
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutItemArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutItemArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsPutItem" type="{http://www.talend.com/mdm}WSPutItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutItemArray", propOrder = {
    "wsPutItem"
})
public class WSPutItemArray {

    @XmlElement(nillable = true)
    protected List<WSPutItem> wsPutItem;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutItemArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutItemArray(final List<WSPutItem> wsPutItem) {
        this.wsPutItem = wsPutItem;
    }

    /**
     * Gets the value of the wsPutItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsPutItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsPutItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPutItem }
     * 
     * 
     */
    public List<WSPutItem> getWsPutItem() {
        if (wsPutItem == null) {
            wsPutItem = new ArrayList<WSPutItem>();
        }
        return this.wsPutItem;
    }

}
