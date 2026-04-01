
package com.microsoft.schemas.xrm._2011.metadata.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityQueryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityQueryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataQueryExpression">
 *       &lt;sequence>
 *         &lt;element name="AttributeQuery" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}AttributeQueryExpression" minOccurs="0"/>
 *         &lt;element name="LabelQuery" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}LabelQueryExpression" minOccurs="0"/>
 *         &lt;element name="RelationshipQuery" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}RelationshipQueryExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityQueryExpression", propOrder = {
    "attributeQuery",
    "labelQuery",
    "relationshipQuery"
})
public class EntityQueryExpression
    extends MetadataQueryExpression
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AttributeQuery", nillable = true)
    protected AttributeQueryExpression attributeQuery;
    @XmlElement(name = "LabelQuery", nillable = true)
    protected LabelQueryExpression labelQuery;
    @XmlElement(name = "RelationshipQuery", nillable = true)
    protected RelationshipQueryExpression relationshipQuery;

    /**
     * Gets the value of the attributeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeQueryExpression }
     *     
     */
    public AttributeQueryExpression getAttributeQuery() {
        return attributeQuery;
    }

    /**
     * Sets the value of the attributeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeQueryExpression }
     *     
     */
    public void setAttributeQuery(AttributeQueryExpression value) {
        this.attributeQuery = value;
    }

    /**
     * Gets the value of the labelQuery property.
     * 
     * @return
     *     possible object is
     *     {@link LabelQueryExpression }
     *     
     */
    public LabelQueryExpression getLabelQuery() {
        return labelQuery;
    }

    /**
     * Sets the value of the labelQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelQueryExpression }
     *     
     */
    public void setLabelQuery(LabelQueryExpression value) {
        this.labelQuery = value;
    }

    /**
     * Gets the value of the relationshipQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipQueryExpression }
     *     
     */
    public RelationshipQueryExpression getRelationshipQuery() {
        return relationshipQuery;
    }

    /**
     * Sets the value of the relationshipQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipQueryExpression }
     *     
     */
    public void setRelationshipQuery(RelationshipQueryExpression value) {
        this.relationshipQuery = value;
    }

}
