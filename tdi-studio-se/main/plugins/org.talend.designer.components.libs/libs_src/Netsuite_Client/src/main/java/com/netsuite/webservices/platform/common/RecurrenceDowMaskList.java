
package com.netsuite.webservices.platform.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.types.RecurrenceDow;


/**
 * <p>Java class for RecurrenceDowMaskList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceDowMaskList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurrenceDowMask" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}RecurrenceDow" maxOccurs="7"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceDowMaskList", propOrder = {
    "recurrenceDowMask"
})
public class RecurrenceDowMaskList {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RecurrenceDow> recurrenceDowMask;

    /**
     * Gets the value of the recurrenceDowMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurrenceDowMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurrenceDowMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurrenceDow }
     * 
     * 
     */
    public List<RecurrenceDow> getRecurrenceDowMask() {
        if (recurrenceDowMask == null) {
            recurrenceDowMask = new ArrayList<RecurrenceDow>();
        }
        return this.recurrenceDowMask;
    }

}
