
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOneToManyRelationshipMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOneToManyRelationshipMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OneToManyRelationshipMetadata" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OneToManyRelationshipMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOneToManyRelationshipMetadata", propOrder = {
    "oneToManyRelationshipMetadatas"
})
public class ArrayOfOneToManyRelationshipMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OneToManyRelationshipMetadata", nillable = true)
    protected List<OneToManyRelationshipMetadata> oneToManyRelationshipMetadatas;

    /**
     * Gets the value of the oneToManyRelationshipMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneToManyRelationshipMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneToManyRelationshipMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OneToManyRelationshipMetadata }
     * 
     * 
     */
    public List<OneToManyRelationshipMetadata> getOneToManyRelationshipMetadatas() {
        if (oneToManyRelationshipMetadatas == null) {
            oneToManyRelationshipMetadatas = new ArrayList<OneToManyRelationshipMetadata>();
        }
        return this.oneToManyRelationshipMetadatas;
    }

}
