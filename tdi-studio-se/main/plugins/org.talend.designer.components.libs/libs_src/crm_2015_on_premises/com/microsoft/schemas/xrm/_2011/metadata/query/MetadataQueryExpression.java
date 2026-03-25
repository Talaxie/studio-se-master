
package com.microsoft.schemas.xrm._2011.metadata.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataQueryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataQueryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataQueryBase">
 *       &lt;sequence>
 *         &lt;element name="Criteria" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataFilterExpression" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataPropertiesExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataQueryExpression", propOrder = {
    "criteria",
    "properties"
})
@XmlSeeAlso({
    EntityQueryExpression.class,
    AttributeQueryExpression.class,
    RelationshipQueryExpression.class
})
public class MetadataQueryExpression
    extends MetadataQueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Criteria", nillable = true)
    protected MetadataFilterExpression criteria;
    @XmlElement(name = "Properties", nillable = true)
    protected MetadataPropertiesExpression properties;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataFilterExpression }
     *     
     */
    public MetadataFilterExpression getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataFilterExpression }
     *     
     */
    public void setCriteria(MetadataFilterExpression value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataPropertiesExpression }
     *     
     */
    public MetadataPropertiesExpression getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataPropertiesExpression }
     *     
     */
    public void setProperties(MetadataPropertiesExpression value) {
        this.properties = value;
    }

}
