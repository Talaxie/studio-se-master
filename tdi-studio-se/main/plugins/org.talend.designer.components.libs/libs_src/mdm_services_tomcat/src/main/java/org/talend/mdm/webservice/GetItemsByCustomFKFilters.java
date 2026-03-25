
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemsByCustomFKFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemsByCustomFKFilters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetItemsByCustomFKFilters" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemsByCustomFKFilters", propOrder = {
    "arg0"
})
public class GetItemsByCustomFKFilters {

    protected WSGetItemsByCustomFKFilters arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetItemsByCustomFKFilters() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetItemsByCustomFKFilters(final WSGetItemsByCustomFKFilters arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetItemsByCustomFKFilters }
     *     
     */
    public WSGetItemsByCustomFKFilters getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetItemsByCustomFKFilters }
     *     
     */
    public void setArg0(WSGetItemsByCustomFKFilters value) {
        this.arg0 = value;
    }

}
