
package com.microsoft.schemas.xrm._2011.metadata.query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMetadataConditionExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMetadataConditionExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetadataConditionExpression" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataConditionExpression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMetadataConditionExpression", propOrder = {
    "metadataConditionExpressions"
})
public class ArrayOfMetadataConditionExpression
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MetadataConditionExpression", nillable = true)
    protected List<MetadataConditionExpression> metadataConditionExpressions;

    /**
     * Gets the value of the metadataConditionExpressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataConditionExpressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataConditionExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataConditionExpression }
     * 
     * 
     */
    public List<MetadataConditionExpression> getMetadataConditionExpressions() {
        if (metadataConditionExpressions == null) {
            metadataConditionExpressions = new ArrayList<MetadataConditionExpression>();
        }
        return this.metadataConditionExpressions;
    }

}
