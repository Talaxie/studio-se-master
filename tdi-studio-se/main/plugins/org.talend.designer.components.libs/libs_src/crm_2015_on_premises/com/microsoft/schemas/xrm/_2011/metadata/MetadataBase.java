
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;
import com.microsoft.schemas.xrm._2011.contracts.LocalizedLabel;


/**
 * <p>Java class for MetadataBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetadataId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="HasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataBase", propOrder = {
    "metadataId",
    "hasChanged"
})
@XmlSeeAlso({
    LocalizedLabel.class,
    OptionMetadata.class,
    RelationshipMetadataBase.class,
    OptionSetMetadataBase.class,
    ManagedPropertyMetadata.class,
    EntityMetadata.class,
    AttributeMetadata.class
})
public class MetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MetadataId", nillable = true)
    protected Guid metadataId;
    @XmlElement(name = "HasChanged", nillable = true)
    protected Boolean hasChanged;

    /**
     * Gets the value of the metadataId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getMetadataId() {
        return metadataId;
    }

    /**
     * Sets the value of the metadataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setMetadataId(Guid value) {
        this.metadataId = value;
    }

    /**
     * Gets the value of the hasChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChanged() {
        return hasChanged;
    }

    /**
     * Sets the value of the hasChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChanged(Boolean value) {
        this.hasChanged = value;
    }

}
