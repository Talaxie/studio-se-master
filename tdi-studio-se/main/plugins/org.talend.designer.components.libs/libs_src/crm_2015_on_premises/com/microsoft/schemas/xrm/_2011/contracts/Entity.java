
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{http://schemas.microsoft.com/xrm/2011/Contracts}AttributeCollection" minOccurs="0"/>
 *         &lt;element name="EntityState" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityState" minOccurs="0"/>
 *         &lt;element name="FormattedValues" type="{http://schemas.microsoft.com/xrm/2011/Contracts}FormattedValueCollection" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="LogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedEntities" type="{http://schemas.microsoft.com/xrm/2011/Contracts}RelatedEntityCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "attributes",
    "entityState",
    "formattedValues",
    "id",
    "logicalName",
    "relatedEntities"
})
public class Entity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Attributes", nillable = true)
    protected AttributeCollection attributes;
    @XmlElement(name = "EntityState", nillable = true)
    protected EntityState entityState;
    @XmlElement(name = "FormattedValues", nillable = true)
    protected FormattedValueCollection formattedValues;
    @XmlElement(name = "Id")
    protected Guid id;
    @XmlElement(name = "LogicalName", nillable = true)
    protected String logicalName;
    @XmlElement(name = "RelatedEntities", nillable = true)
    protected RelatedEntityCollection relatedEntities;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCollection }
     *     
     */
    public AttributeCollection getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCollection }
     *     
     */
    public void setAttributes(AttributeCollection value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the entityState property.
     * 
     * @return
     *     possible object is
     *     {@link EntityState }
     *     
     */
    public EntityState getEntityState() {
        return entityState;
    }

    /**
     * Sets the value of the entityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityState }
     *     
     */
    public void setEntityState(EntityState value) {
        this.entityState = value;
    }

    /**
     * Gets the value of the formattedValues property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedValueCollection }
     *     
     */
    public FormattedValueCollection getFormattedValues() {
        return formattedValues;
    }

    /**
     * Sets the value of the formattedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedValueCollection }
     *     
     */
    public void setFormattedValues(FormattedValueCollection value) {
        this.formattedValues = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setId(Guid value) {
        this.id = value;
    }

    /**
     * Gets the value of the logicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalName() {
        return logicalName;
    }

    /**
     * Sets the value of the logicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalName(String value) {
        this.logicalName = value;
    }

    /**
     * Gets the value of the relatedEntities property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEntityCollection }
     *     
     */
    public RelatedEntityCollection getRelatedEntities() {
        return relatedEntities;
    }

    /**
     * Sets the value of the relatedEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEntityCollection }
     *     
     */
    public void setRelatedEntities(RelatedEntityCollection value) {
        this.relatedEntities = value;
    }

}
