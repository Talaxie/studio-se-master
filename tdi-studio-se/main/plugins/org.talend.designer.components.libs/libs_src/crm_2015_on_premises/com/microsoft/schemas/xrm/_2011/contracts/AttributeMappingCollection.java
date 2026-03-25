
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2014.contracts.AttributeMapping;


/**
 * <p>Java class for AttributeMappingCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeMappingCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeMapping" type="{http://schemas.microsoft.com/xrm/2014/Contracts}AttributeMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeMappingCollection", propOrder = {
    "attributeMappings"
})
public class AttributeMappingCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AttributeMapping", nillable = true)
    protected List<AttributeMapping> attributeMappings;

    /**
     * Gets the value of the attributeMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeMapping }
     * 
     * 
     */
    public List<AttributeMapping> getAttributeMappings() {
        if (attributeMappings == null) {
            attributeMappings = new ArrayList<AttributeMapping>();
        }
        return this.attributeMappings;
    }

}
