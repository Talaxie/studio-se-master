
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;
import com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty;
import com.microsoft.schemas.xrm._2011.contracts.Label;
import com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName;
import com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata;


/**
 * <p>Java class for AttributeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase">
 *       &lt;sequence>
 *         &lt;element name="AttributeOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeTypeCode" minOccurs="0"/>
 *         &lt;element name="CanBeSecuredForCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanBeSecuredForRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanBeSecuredForUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanModifyAdditionalSettings" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="ColumnNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeprecatedVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="EntityLogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAuditEnabled" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsCustomAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomizable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsManaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPrimaryId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPrimaryName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRenameable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsSecured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidForAdvancedFind" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsValidForCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidForRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidForUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkedAttributeId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="LogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequiredLevel" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeRequiredLevelManagedProperty" minOccurs="0"/>
 *         &lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeTypeName" type="{http://schemas.microsoft.com/xrm/2013/Metadata}AttributeTypeDisplayName" minOccurs="0"/>
 *         &lt;element name="IntroducedVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsLogical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeMetadata", propOrder = {
    "attributeOf",
    "attributeType",
    "canBeSecuredForCreate",
    "canBeSecuredForRead",
    "canBeSecuredForUpdate",
    "canModifyAdditionalSettings",
    "columnNumber",
    "deprecatedVersion",
    "description",
    "displayName",
    "entityLogicalName",
    "isAuditEnabled",
    "isCustomAttribute",
    "isCustomizable",
    "isManaged",
    "isPrimaryId",
    "isPrimaryName",
    "isRenameable",
    "isSecured",
    "isValidForAdvancedFind",
    "isValidForCreate",
    "isValidForRead",
    "isValidForUpdate",
    "linkedAttributeId",
    "logicalName",
    "requiredLevel",
    "schemaName",
    "attributeTypeName",
    "introducedVersion",
    "isLogical",
    "sourceType"
})
@XmlSeeAlso({
    ManagedPropertyAttributeMetadata.class,
    StringAttributeMetadata.class,
    LookupAttributeMetadata.class,
    DateTimeAttributeMetadata.class,
    DoubleAttributeMetadata.class,
    MoneyAttributeMetadata.class,
    DecimalAttributeMetadata.class,
    MemoAttributeMetadata.class,
    BooleanAttributeMetadata.class,
    IntegerAttributeMetadata.class,
    EnumAttributeMetadata.class,
    BigIntAttributeMetadata.class,
    ImageAttributeMetadata.class
})
public class AttributeMetadata
    extends MetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AttributeOf", nillable = true)
    protected String attributeOf;
    @XmlElement(name = "AttributeType", nillable = true)
    protected AttributeTypeCode attributeType;
    @XmlElement(name = "CanBeSecuredForCreate", nillable = true)
    protected Boolean canBeSecuredForCreate;
    @XmlElement(name = "CanBeSecuredForRead", nillable = true)
    protected Boolean canBeSecuredForRead;
    @XmlElement(name = "CanBeSecuredForUpdate", nillable = true)
    protected Boolean canBeSecuredForUpdate;
    @XmlElement(name = "CanModifyAdditionalSettings", nillable = true)
    protected BooleanManagedProperty canModifyAdditionalSettings;
    @XmlElement(name = "ColumnNumber", nillable = true)
    protected Integer columnNumber;
    @XmlElement(name = "DeprecatedVersion", nillable = true)
    protected String deprecatedVersion;
    @XmlElement(name = "Description", nillable = true)
    protected Label description;
    @XmlElement(name = "DisplayName", nillable = true)
    protected Label displayName;
    @XmlElement(name = "EntityLogicalName", nillable = true)
    protected String entityLogicalName;
    @XmlElement(name = "IsAuditEnabled", nillable = true)
    protected BooleanManagedProperty isAuditEnabled;
    @XmlElement(name = "IsCustomAttribute", nillable = true)
    protected Boolean isCustomAttribute;
    @XmlElement(name = "IsCustomizable", nillable = true)
    protected BooleanManagedProperty isCustomizable;
    @XmlElement(name = "IsManaged", nillable = true)
    protected Boolean isManaged;
    @XmlElement(name = "IsPrimaryId", nillable = true)
    protected Boolean isPrimaryId;
    @XmlElement(name = "IsPrimaryName", nillable = true)
    protected Boolean isPrimaryName;
    @XmlElement(name = "IsRenameable", nillable = true)
    protected BooleanManagedProperty isRenameable;
    @XmlElement(name = "IsSecured", nillable = true)
    protected Boolean isSecured;
    @XmlElement(name = "IsValidForAdvancedFind", nillable = true)
    protected BooleanManagedProperty isValidForAdvancedFind;
    @XmlElement(name = "IsValidForCreate", nillable = true)
    protected Boolean isValidForCreate;
    @XmlElement(name = "IsValidForRead", nillable = true)
    protected Boolean isValidForRead;
    @XmlElement(name = "IsValidForUpdate", nillable = true)
    protected Boolean isValidForUpdate;
    @XmlElement(name = "LinkedAttributeId", nillable = true)
    protected Guid linkedAttributeId;
    @XmlElement(name = "LogicalName", nillable = true)
    protected String logicalName;
    @XmlElement(name = "RequiredLevel", nillable = true)
    protected AttributeRequiredLevelManagedProperty requiredLevel;
    @XmlElement(name = "SchemaName", nillable = true)
    protected String schemaName;
    @XmlElement(name = "AttributeTypeName", nillable = true)
    protected AttributeTypeDisplayName attributeTypeName;
    @XmlElement(name = "IntroducedVersion", nillable = true)
    protected String introducedVersion;
    @XmlElement(name = "IsLogical", nillable = true)
    protected Boolean isLogical;
    @XmlElement(name = "SourceType", nillable = true)
    protected Integer sourceType;

    /**
     * Gets the value of the attributeOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeOf() {
        return attributeOf;
    }

    /**
     * Sets the value of the attributeOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeOf(String value) {
        this.attributeOf = value;
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeCode }
     *     
     */
    public AttributeTypeCode getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeCode }
     *     
     */
    public void setAttributeType(AttributeTypeCode value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the canBeSecuredForCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeSecuredForCreate() {
        return canBeSecuredForCreate;
    }

    /**
     * Sets the value of the canBeSecuredForCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeSecuredForCreate(Boolean value) {
        this.canBeSecuredForCreate = value;
    }

    /**
     * Gets the value of the canBeSecuredForRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeSecuredForRead() {
        return canBeSecuredForRead;
    }

    /**
     * Sets the value of the canBeSecuredForRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeSecuredForRead(Boolean value) {
        this.canBeSecuredForRead = value;
    }

    /**
     * Gets the value of the canBeSecuredForUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeSecuredForUpdate() {
        return canBeSecuredForUpdate;
    }

    /**
     * Sets the value of the canBeSecuredForUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeSecuredForUpdate(Boolean value) {
        this.canBeSecuredForUpdate = value;
    }

    /**
     * Gets the value of the canModifyAdditionalSettings property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanModifyAdditionalSettings() {
        return canModifyAdditionalSettings;
    }

    /**
     * Sets the value of the canModifyAdditionalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanModifyAdditionalSettings(BooleanManagedProperty value) {
        this.canModifyAdditionalSettings = value;
    }

    /**
     * Gets the value of the columnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColumnNumber() {
        return columnNumber;
    }

    /**
     * Sets the value of the columnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColumnNumber(Integer value) {
        this.columnNumber = value;
    }

    /**
     * Gets the value of the deprecatedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeprecatedVersion() {
        return deprecatedVersion;
    }

    /**
     * Sets the value of the deprecatedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeprecatedVersion(String value) {
        this.deprecatedVersion = value;
    }

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setDisplayName(Label value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the entityLogicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLogicalName() {
        return entityLogicalName;
    }

    /**
     * Sets the value of the entityLogicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLogicalName(String value) {
        this.entityLogicalName = value;
    }

    /**
     * Gets the value of the isAuditEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsAuditEnabled() {
        return isAuditEnabled;
    }

    /**
     * Sets the value of the isAuditEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsAuditEnabled(BooleanManagedProperty value) {
        this.isAuditEnabled = value;
    }

    /**
     * Gets the value of the isCustomAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomAttribute() {
        return isCustomAttribute;
    }

    /**
     * Sets the value of the isCustomAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomAttribute(Boolean value) {
        this.isCustomAttribute = value;
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
     * Gets the value of the isPrimaryId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryId() {
        return isPrimaryId;
    }

    /**
     * Sets the value of the isPrimaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryId(Boolean value) {
        this.isPrimaryId = value;
    }

    /**
     * Gets the value of the isPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryName() {
        return isPrimaryName;
    }

    /**
     * Sets the value of the isPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryName(Boolean value) {
        this.isPrimaryName = value;
    }

    /**
     * Gets the value of the isRenameable property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsRenameable() {
        return isRenameable;
    }

    /**
     * Sets the value of the isRenameable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsRenameable(BooleanManagedProperty value) {
        this.isRenameable = value;
    }

    /**
     * Gets the value of the isSecured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecured() {
        return isSecured;
    }

    /**
     * Sets the value of the isSecured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecured(Boolean value) {
        this.isSecured = value;
    }

    /**
     * Gets the value of the isValidForAdvancedFind property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsValidForAdvancedFind() {
        return isValidForAdvancedFind;
    }

    /**
     * Sets the value of the isValidForAdvancedFind property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsValidForAdvancedFind(BooleanManagedProperty value) {
        this.isValidForAdvancedFind = value;
    }

    /**
     * Gets the value of the isValidForCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidForCreate() {
        return isValidForCreate;
    }

    /**
     * Sets the value of the isValidForCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidForCreate(Boolean value) {
        this.isValidForCreate = value;
    }

    /**
     * Gets the value of the isValidForRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidForRead() {
        return isValidForRead;
    }

    /**
     * Sets the value of the isValidForRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidForRead(Boolean value) {
        this.isValidForRead = value;
    }

    /**
     * Gets the value of the isValidForUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidForUpdate() {
        return isValidForUpdate;
    }

    /**
     * Sets the value of the isValidForUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidForUpdate(Boolean value) {
        this.isValidForUpdate = value;
    }

    /**
     * Gets the value of the linkedAttributeId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getLinkedAttributeId() {
        return linkedAttributeId;
    }

    /**
     * Sets the value of the linkedAttributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setLinkedAttributeId(Guid value) {
        this.linkedAttributeId = value;
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
     * Gets the value of the requiredLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeRequiredLevelManagedProperty }
     *     
     */
    public AttributeRequiredLevelManagedProperty getRequiredLevel() {
        return requiredLevel;
    }

    /**
     * Sets the value of the requiredLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeRequiredLevelManagedProperty }
     *     
     */
    public void setRequiredLevel(AttributeRequiredLevelManagedProperty value) {
        this.requiredLevel = value;
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
     * Gets the value of the attributeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeDisplayName }
     *     
     */
    public AttributeTypeDisplayName getAttributeTypeName() {
        return attributeTypeName;
    }

    /**
     * Sets the value of the attributeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeDisplayName }
     *     
     */
    public void setAttributeTypeName(AttributeTypeDisplayName value) {
        this.attributeTypeName = value;
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
     * Gets the value of the isLogical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLogical() {
        return isLogical;
    }

    /**
     * Sets the value of the isLogical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLogical(Boolean value) {
        this.isLogical = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceType(Integer value) {
        this.sourceType = value;
    }

}
