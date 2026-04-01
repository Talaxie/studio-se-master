
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.Label;


/**
 * <p>Java class for OptionMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="IsManaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionMetadata", propOrder = {
    "description",
    "isManaged",
    "label",
    "value"
})
@XmlSeeAlso({
    StatusOptionMetadata.class,
    StateOptionMetadata.class
})
public class OptionMetadata
    extends MetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Description", nillable = true)
    protected Label description;
    @XmlElement(name = "IsManaged", nillable = true)
    protected Boolean isManaged;
    @XmlElement(name = "Label", nillable = true)
    protected Label label;
    @XmlElement(name = "Value", nillable = true)
    protected Integer value;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setDescription(Label value) {
        this.description = value;
    }

    /**
     * Gets the value of the isManaged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManaged() {
        return isManaged;
    }

    /**
     * Sets the value of the isManaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManaged(Boolean value) {
        this.isManaged = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}
