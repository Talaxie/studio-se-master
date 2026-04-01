
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAttributeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAttributeMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeMetadata" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttributeMetadata", propOrder = {
    "attributeMetadatas"
})
public class ArrayOfAttributeMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AttributeMetadata", nillable = true)
    protected List<AttributeMetadata> attributeMetadatas;

    /**
     * Gets the value of the attributeMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeMetadata }
     * 
     * 
     */
    public List<AttributeMetadata> getAttributeMetadatas() {
        if (attributeMetadatas == null) {
            attributeMetadatas = new ArrayList<AttributeMetadata>();
        }
        return this.attributeMetadatas;
    }

}
