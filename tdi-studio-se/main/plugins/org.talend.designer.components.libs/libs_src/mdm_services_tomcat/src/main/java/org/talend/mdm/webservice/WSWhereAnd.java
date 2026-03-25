
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSWhereAnd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSWhereAnd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="whereItems" type="{http://www.talend.com/mdm}WSWhereItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWhereAnd", propOrder = {
    "whereItems"
})
public class WSWhereAnd {

    @XmlElement(nillable = true)
    protected List<WSWhereItem> whereItems;

    /**
     * Default no-arg constructor
     * 
     */
    public WSWhereAnd() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSWhereAnd(final List<WSWhereItem> whereItems) {
        this.whereItems = whereItems;
    }

    /**
     * Gets the value of the whereItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whereItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhereItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSWhereItem }
     * 
     * 
     */
    public List<WSWhereItem> getWhereItems() {
        if (whereItems == null) {
            whereItems = new ArrayList<WSWhereItem>();
        }
        return this.whereItems;
    }

}
