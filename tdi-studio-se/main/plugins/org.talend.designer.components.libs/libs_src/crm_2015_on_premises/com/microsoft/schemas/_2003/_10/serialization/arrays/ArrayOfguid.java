
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for ArrayOfguid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfguid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfguid", propOrder = {
    "guids"
})
public class ArrayOfguid
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "guid")
    protected List<Guid> guids;

    /**
     * Gets the value of the guids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guid }
     * 
     * 
     */
    public List<Guid> getGuids() {
        if (guids == null) {
            guids = new ArrayList<Guid>();
        }
        return this.guids;
    }

}
