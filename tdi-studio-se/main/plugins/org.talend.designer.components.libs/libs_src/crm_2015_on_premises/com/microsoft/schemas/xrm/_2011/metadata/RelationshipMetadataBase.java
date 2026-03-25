
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty;


/**
 * <p>Java class for RelationshipMetadataBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipMetadataBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase">
 *       &lt;sequence>
 *         &lt;element name="IsCustomRelationship" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomizable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsManaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidForAdvancedFind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityTypes" type="{http://schemas.microsoft.com/xrm/2011/Metadata}SecurityTypes" minOccurs="0"/>
 *         &lt;element name="IntroducedVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}RelationshipType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipMetadataBase", propOrder = {
    "isCustomRelationship",
    "isCustomizable",
    "isManaged",
    "isValidForAdvancedFind",
    "schemaName",
    "securityTypes",
    "introducedVersion",
    "relationshipType"
})
@XmlSeeAlso({
    OneToManyRelationshipMetadata.class,
    ManyToManyRelationshipMetadata.class
})
public class RelationshipMetadataBase
    extends MetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IsCustomRelationship", nillable = true)
    protected Boolean isCustomRelationship;
    @XmlElement(name = "IsCustomizable", nillable = true)
    protected BooleanManagedProperty isCustomizable;
    @XmlElement(name = "IsManaged", nillable = true)
    protected Boolean isManaged;
    @XmlElement(name = "IsValidForAdvancedFind", nillable = true)
    protected Boolean isValidForAdvancedFind;
    @XmlElement(name = "SchemaName", nillable = true)
    protected String schemaName;
    @XmlElement(name = "SecurityTypes", nillable = true)
    protected SecurityTypes securityTypes;
    @XmlElement(name = "IntroducedVersion", nillable = true)
    protected String introducedVersion;
    @XmlElement(name = "RelationshipType")
    protected RelationshipType relationshipType;

    /**
     * Gets the value of the isCustomRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomRelationship() {
        return isCustomRelationship;
    }

    /**
     * Sets the value of the isCustomRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomRelationship(Boolean value) {
        this.isCustomRelationship = value;
    }

    /**
     * Gets the value of the isCustomizable property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsCustomizable() {
        return isCustomizable;
    }

    /**
     * Sets the value of the isCustomizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsCustomizable(BooleanManagedProperty value) {
        this.isCustomizable = value;
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
     * Gets the value of the isValidForAdvancedFind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidForAdvancedFind() {
        return isValidForAdvancedFind;
    }

    /**
     * Sets the value of the isValidForAdvancedFind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidForAdvancedFind(Boolean value) {
        this.isValidForAdvancedFind = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the securityTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTypes }
     *     
     */
    public SecurityTypes getSecurityTypes() {
        return securityTypes;
    }

    /**
     * Sets the value of the securityTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTypes }
     *     
     */
    public void setSecurityTypes(SecurityTypes value) {
        this.securityTypes = value;
    }

    /**
     * Gets the value of the introducedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducedVersion() {
        return introducedVersion;
    }

    /**
     * Sets the value of the introducedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducedVersion(String value) {
        this.introducedVersion = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType }
     *     
     */
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType }
     *     
     */
    public void setRelationshipType(RelationshipType value) {
        this.relationshipType = value;
    }

}
