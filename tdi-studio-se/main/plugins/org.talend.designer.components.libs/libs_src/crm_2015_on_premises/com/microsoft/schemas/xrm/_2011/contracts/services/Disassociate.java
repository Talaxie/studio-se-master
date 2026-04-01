
package com.microsoft.schemas.xrm._2011.contracts.services;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;
import com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection;
import com.microsoft.schemas.xrm._2011.contracts.Relationship;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Relationship" minOccurs="0"/>
 *         &lt;element name="relatedEntities" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityReferenceCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entityName",
    "entityId",
    "relationship",
    "relatedEntities"
})
@XmlRootElement(name = "Disassociate")
public class Disassociate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(nillable = true)
    protected String entityName;
    protected Guid entityId;
    @XmlElement(nillable = true)
    protected Relationship relationship;
    @XmlElement(nillable = true)
    protected EntityReferenceCollection relatedEntities;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setEntityId(Guid value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship }
     *     
     */
    public Relationship getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship }
     *     
     */
    public void setRelationship(Relationship value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the relatedEntities property.
     * 
     * @return
     *     possible object is
     *     {@link EntityReferenceCollection }
     *     
     */
    public EntityReferenceCollection getRelatedEntities() {
        return relatedEntities;
    }

    /**
     * Sets the value of the relatedEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityReferenceCollection }
     *     
     */
    public void setRelatedEntities(EntityReferenceCollection value) {
        this.relatedEntities = value;
    }

}
