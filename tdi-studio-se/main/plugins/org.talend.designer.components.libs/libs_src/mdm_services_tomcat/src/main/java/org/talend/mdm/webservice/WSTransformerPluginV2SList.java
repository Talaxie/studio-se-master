
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerPluginV2SList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerPluginV2SList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" type="{http://www.talend.com/mdm}WSTransformerPluginV2SListItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerPluginV2SList", propOrder = {
    "item"
})
public class WSTransformerPluginV2SList {

    @XmlElement(nillable = true)
    protected List<WSTransformerPluginV2SListItem> item;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerPluginV2SList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerPluginV2SList(final List<WSTransformerPluginV2SListItem> item) {
        this.item = item;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerPluginV2SListItem }
     * 
     * 
     */
    public List<WSTransformerPluginV2SListItem> getItem() {
        if (item == null) {
            item = new ArrayList<WSTransformerPluginV2SListItem>();
        }
        return this.item;
    }

}
