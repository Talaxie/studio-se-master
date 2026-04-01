
package com.netsuite.webservices.lists.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for ItemOptionsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemOptionsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemOptions" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemOptionsList", propOrder = {
    "itemOptions"
})
public class ItemOptionsList {

    @XmlElement(required = true)
    protected List<RecordRef> itemOptions;

    /**
     * Gets the value of the itemOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordRef }
     * 
     * 
     */
    public List<RecordRef> getItemOptions() {
        if (itemOptions == null) {
            itemOptions = new ArrayList<RecordRef>();
        }
        return this.itemOptions;
    }

}
