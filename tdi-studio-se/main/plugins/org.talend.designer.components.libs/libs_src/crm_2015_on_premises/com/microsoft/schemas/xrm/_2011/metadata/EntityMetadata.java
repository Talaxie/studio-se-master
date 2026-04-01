
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty;
import com.microsoft.schemas.xrm._2011.contracts.Label;


/**
 * <p>Java class for EntityMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase">
 *       &lt;sequence>
 *         &lt;element name="ActivityTypeMask" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ArrayOfAttributeMetadata" minOccurs="0"/>
 *         &lt;element name="AutoCreateAccessTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoRouteToOwnerQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanBeInManyToMany" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanBePrimaryEntityInRelationship" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanBeRelatedEntityInRelationship" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanCreateAttributes" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanCreateCharts" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanCreateForms" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanCreateViews" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanModifyAdditionalSettings" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="CanTriggerWorkflow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="DisplayCollectionName" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="EnforceStateTransitions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IconLargeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconMediumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconSmallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAIRUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsActivityParty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAuditEnabled" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsAvailableOffline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBusinessProcessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsChildEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsConnectionsEnabled" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsCustomEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomizable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsDocumentManagementEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDuplicateDetectionEnabled" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsEnabledForCharts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnabledForTrace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsImportable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsIntersect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMailMergeEnabled" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsManaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMappable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsQuickCreateEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReadOnlyInMobileClient" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsReadingPaneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRenameable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsStateModelAware" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidForAdvancedFind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidForQueue" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsVisibleInMobile" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsVisibleInMobileClient" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="LogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManyToManyRelationships" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ArrayOfManyToManyRelationshipMetadata" minOccurs="0"/>
 *         &lt;element name="ManyToOneRelationships" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ArrayOfOneToManyRelationshipMetadata" minOccurs="0"/>
 *         &lt;element name="ObjectTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OneToManyRelationships" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ArrayOfOneToManyRelationshipMetadata" minOccurs="0"/>
 *         &lt;element name="OwnershipType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OwnershipTypes" minOccurs="0"/>
 *         &lt;element name="PrimaryIdAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Privileges" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ArrayOfSecurityPrivilegeMetadata" minOccurs="0"/>
 *         &lt;element name="RecurrenceBaseEntityLogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportViewName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntroducedVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryImageAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanChangeHierarchicalRelationship" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="EntityHelpUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityHelpUrlEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityMetadata", propOrder = {
    "activityTypeMask",
    "attributes",
    "autoCreateAccessTeams",
    "autoRouteToOwnerQueue",
    "canBeInManyToMany",
    "canBePrimaryEntityInRelationship",
    "canBeRelatedEntityInRelationship",
    "canCreateAttributes",
    "canCreateCharts",
    "canCreateForms",
    "canCreateViews",
    "canModifyAdditionalSettings",
    "canTriggerWorkflow",
    "description",
    "displayCollectionName",
    "displayName",
    "enforceStateTransitions",
    "iconLargeName",
    "iconMediumName",
    "iconSmallName",
    "isAIRUpdated",
    "isActivity",
    "isActivityParty",
    "isAuditEnabled",
    "isAvailableOffline",
    "isBusinessProcessEnabled",
    "isChildEntity",
    "isConnectionsEnabled",
    "isCustomEntity",
    "isCustomizable",
    "isDocumentManagementEnabled",
    "isDuplicateDetectionEnabled",
    "isEnabledForCharts",
    "isEnabledForTrace",
    "isImportable",
    "isIntersect",
    "isMailMergeEnabled",
    "isManaged",
    "isMappable",
    "isQuickCreateEnabled",
    "isReadOnlyInMobileClient",
    "isReadingPaneEnabled",
    "isRenameable",
    "isStateModelAware",
    "isValidForAdvancedFind",
    "isValidForQueue",
    "isVisibleInMobile",
    "isVisibleInMobileClient",
    "logicalName",
    "manyToManyRelationships",
    "manyToOneRelationships",
    "objectTypeCode",
    "oneToManyRelationships",
    "ownershipType",
    "primaryIdAttribute",
    "primaryNameAttribute",
    "privileges",
    "recurrenceBaseEntityLogicalName",
    "reportViewName",
    "schemaName",
    "introducedVersion",
    "primaryImageAttribute",
    "canChangeHierarchicalRelationship",
    "entityHelpUrl",
    "entityHelpUrlEnabled"
})
public class EntityMetadata
    extends MetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ActivityTypeMask", nillable = true)
    protected Integer activityTypeMask;
    @XmlElement(name = "Attributes", nillable = true)
    protected ArrayOfAttributeMetadata attributes;
    @XmlElement(name = "AutoCreateAccessTeams", nillable = true)
    protected Boolean autoCreateAccessTeams;
    @XmlElement(name = "AutoRouteToOwnerQueue", nillable = true)
    protected Boolean autoRouteToOwnerQueue;
    @XmlElement(name = "CanBeInManyToMany", nillable = true)
    protected BooleanManagedProperty canBeInManyToMany;
    @XmlElement(name = "CanBePrimaryEntityInRelationship", nillable = true)
    protected BooleanManagedProperty canBePrimaryEntityInRelationship;
    @XmlElement(name = "CanBeRelatedEntityInRelationship", nillable = true)
    protected BooleanManagedProperty canBeRelatedEntityInRelationship;
    @XmlElement(name = "CanCreateAttributes", nillable = true)
    protected BooleanManagedProperty canCreateAttributes;
    @XmlElement(name = "CanCreateCharts", nillable = true)
    protected BooleanManagedProperty canCreateCharts;
    @XmlElement(name = "CanCreateForms", nillable = true)
    protected BooleanManagedProperty canCreateForms;
    @XmlElement(name = "CanCreateViews", nillable = true)
    protected BooleanManagedProperty canCreateViews;
    @XmlElement(name = "CanModifyAdditionalSettings", nillable = true)
    protected BooleanManagedProperty canModifyAdditionalSettings;
    @XmlElement(name = "CanTriggerWorkflow", nillable = true)
    protected Boolean canTriggerWorkflow;
    @XmlElement(name = "Description", nillable = true)
    protected Label description;
    @XmlElement(name = "DisplayCollectionName", nillable = true)
    protected Label displayCollectionName;
    @XmlElement(name = "DisplayName", nillable = true)
    protected Label displayName;
    @XmlElement(name = "EnforceStateTransitions", nillable = true)
    protected Boolean enforceStateTransitions;
    @XmlElement(name = "IconLargeName", nillable = true)
    protected String iconLargeName;
    @XmlElement(name = "IconMediumName", nillable = true)
    protected String iconMediumName;
    @XmlElement(name = "IconSmallName", nillable = true)
    protected String iconSmallName;
    @XmlElement(name = "IsAIRUpdated", nillable = true)
    protected Boolean isAIRUpdated;
    @XmlElement(name = "IsActivity", nillable = true)
    protected Boolean isActivity;
    @XmlElement(name = "IsActivityParty", nillable = true)
    protected Boolean isActivityParty;
    @XmlElement(name = "IsAuditEnabled", nillable = true)
    protected BooleanManagedProperty isAuditEnabled;
    @XmlElement(name = "IsAvailableOffline", nillable = true)
    protected Boolean isAvailableOffline;
    @XmlElement(name = "IsBusinessProcessEnabled", nillable = true)
    protected Boolean isBusinessProcessEnabled;
    @XmlElement(name = "IsChildEntity", nillable = true)
    protected Boolean isChildEntity;
    @XmlElement(name = "IsConnectionsEnabled", nillable = true)
    protected BooleanManagedProperty isConnectionsEnabled;
    @XmlElement(name = "IsCustomEntity", nillable = true)
    protected Boolean isCustomEntity;
    @XmlElement(name = "IsCustomizable", nillable = true)
    protected BooleanManagedProperty isCustomizable;
    @XmlElement(name = "IsDocumentManagementEnabled", nillable = true)
    protected Boolean isDocumentManagementEnabled;
    @XmlElement(name = "IsDuplicateDetectionEnabled", nillable = true)
    protected BooleanManagedProperty isDuplicateDetectionEnabled;
    @XmlElement(name = "IsEnabledForCharts", nillable = true)
    protected Boolean isEnabledForCharts;
    @XmlElement(name = "IsEnabledForTrace", nillable = true)
    protected Boolean isEnabledForTrace;
    @XmlElement(name = "IsImportable", nillable = true)
    protected Boolean isImportable;
    @XmlElement(name = "IsIntersect", nillable = true)
    protected Boolean isIntersect;
    @XmlElement(name = "IsMailMergeEnabled", nillable = true)
    protected BooleanManagedProperty isMailMergeEnabled;
    @XmlElement(name = "IsManaged", nillable = true)
    protected Boolean isManaged;
    @XmlElement(name = "IsMappable", nillable = true)
    protected BooleanManagedProperty isMappable;
    @XmlElement(name = "IsQuickCreateEnabled", nillable = true)
    protected Boolean isQuickCreateEnabled;
    @XmlElement(name = "IsReadOnlyInMobileClient", nillable = true)
    protected BooleanManagedProperty isReadOnlyInMobileClient;
    @XmlElement(name = "IsReadingPaneEnabled", nillable = true)
    protected Boolean isReadingPaneEnabled;
    @XmlElement(name = "IsRenameable", nillable = true)
    protected BooleanManagedProperty isRenameable;
    @XmlElement(name = "IsStateModelAware", nillable = true)
    protected Boolean isStateModelAware;
    @XmlElement(name = "IsValidForAdvancedFind", nillable = true)
    protected Boolean isValidForAdvancedFind;
    @XmlElement(name = "IsValidForQueue", nillable = true)
    protected BooleanManagedProperty isValidForQueue;
    @XmlElement(name = "IsVisibleInMobile", nillable = true)
    protected BooleanManagedProperty isVisibleInMobile;
    @XmlElement(name = "IsVisibleInMobileClient", nillable = true)
    protected BooleanManagedProperty isVisibleInMobileClient;
    @XmlElement(name = "LogicalName", nillable = true)
    protected String logicalName;
    @XmlElement(name = "ManyToManyRelationships", nillable = true)
    protected ArrayOfManyToManyRelationshipMetadata manyToManyRelationships;
    @XmlElement(name = "ManyToOneRelationships", nillable = true)
    protected ArrayOfOneToManyRelationshipMetadata manyToOneRelationships;
    @XmlElement(name = "ObjectTypeCode", nillable = true)
    protected Integer objectTypeCode;
    @XmlElement(name = "OneToManyRelationships", nillable = true)
    protected ArrayOfOneToManyRelationshipMetadata oneToManyRelationships;
    @XmlElement(name = "OwnershipType", nillable = true)
    protected OwnershipTypes ownershipType;
    @XmlElement(name = "PrimaryIdAttribute", nillable = true)
    protected String primaryIdAttribute;
    @XmlElement(name = "PrimaryNameAttribute", nillable = true)
    protected String primaryNameAttribute;
    @XmlElement(name = "Privileges", nillable = true)
    protected ArrayOfSecurityPrivilegeMetadata privileges;
    @XmlElement(name = "RecurrenceBaseEntityLogicalName", nillable = true)
    protected String recurrenceBaseEntityLogicalName;
    @XmlElement(name = "ReportViewName", nillable = true)
    protected String reportViewName;
    @XmlElement(name = "SchemaName", nillable = true)
    protected String schemaName;
    @XmlElement(name = "IntroducedVersion", nillable = true)
    protected String introducedVersion;
    @XmlElement(name = "PrimaryImageAttribute", nillable = true)
    protected String primaryImageAttribute;
    @XmlElement(name = "CanChangeHierarchicalRelationship", nillable = true)
    protected BooleanManagedProperty canChangeHierarchicalRelationship;
    @XmlElement(name = "EntityHelpUrl", nillable = true)
    protected String entityHelpUrl;
    @XmlElement(name = "EntityHelpUrlEnabled", nillable = true)
    protected Boolean entityHelpUrlEnabled;

    /**
     * Gets the value of the activityTypeMask property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityTypeMask() {
        return activityTypeMask;
    }

    /**
     * Sets the value of the activityTypeMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityTypeMask(Integer value) {
        this.activityTypeMask = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeMetadata }
     *     
     */
    public ArrayOfAttributeMetadata getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeMetadata }
     *     
     */
    public void setAttributes(ArrayOfAttributeMetadata value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the autoCreateAccessTeams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateAccessTeams() {
        return autoCreateAccessTeams;
    }

    /**
     * Sets the value of the autoCreateAccessTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateAccessTeams(Boolean value) {
        this.autoCreateAccessTeams = value;
    }

    /**
     * Gets the value of the autoRouteToOwnerQueue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRouteToOwnerQueue() {
        return autoRouteToOwnerQueue;
    }

    /**
     * Sets the value of the autoRouteToOwnerQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRouteToOwnerQueue(Boolean value) {
        this.autoRouteToOwnerQueue = value;
    }

    /**
     * Gets the value of the canBeInManyToMany property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanBeInManyToMany() {
        return canBeInManyToMany;
    }

    /**
     * Sets the value of the canBeInManyToMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanBeInManyToMany(BooleanManagedProperty value) {
        this.canBeInManyToMany = value;
    }

    /**
     * Gets the value of the canBePrimaryEntityInRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanBePrimaryEntityInRelationship() {
        return canBePrimaryEntityInRelationship;
    }

    /**
     * Sets the value of the canBePrimaryEntityInRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanBePrimaryEntityInRelationship(BooleanManagedProperty value) {
        this.canBePrimaryEntityInRelationship = value;
    }

    /**
     * Gets the value of the canBeRelatedEntityInRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanBeRelatedEntityInRelationship() {
        return canBeRelatedEntityInRelationship;
    }

    /**
     * Sets the value of the canBeRelatedEntityInRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanBeRelatedEntityInRelationship(BooleanManagedProperty value) {
        this.canBeRelatedEntityInRelationship = value;
    }

    /**
     * Gets the value of the canCreateAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanCreateAttributes() {
        return canCreateAttributes;
    }

    /**
     * Sets the value of the canCreateAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanCreateAttributes(BooleanManagedProperty value) {
        this.canCreateAttributes = value;
    }

    /**
     * Gets the value of the canCreateCharts property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanCreateCharts() {
        return canCreateCharts;
    }

    /**
     * Sets the value of the canCreateCharts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanCreateCharts(BooleanManagedProperty value) {
        this.canCreateCharts = value;
    }

    /**
     * Gets the value of the canCreateForms property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanCreateForms() {
        return canCreateForms;
    }

    /**
     * Sets the value of the canCreateForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanCreateForms(BooleanManagedProperty value) {
        this.canCreateForms = value;
    }

    /**
     * Gets the value of the canCreateViews property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanCreateViews() {
        return canCreateViews;
    }

    /**
     * Sets the value of the canCreateViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanCreateViews(BooleanManagedProperty value) {
        this.canCreateViews = value;
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
     * Gets the value of the canTriggerWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanTriggerWorkflow() {
        return canTriggerWorkflow;
    }

    /**
     * Sets the value of the canTriggerWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanTriggerWorkflow(Boolean value) {
        this.canTriggerWorkflow = value;
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
     * Gets the value of the displayCollectionName property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getDisplayCollectionName() {
        return displayCollectionName;
    }

    /**
     * Sets the value of the displayCollectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setDisplayCollectionName(Label value) {
        this.displayCollectionName = value;
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
     * Gets the value of the enforceStateTransitions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceStateTransitions() {
        return enforceStateTransitions;
    }

    /**
     * Sets the value of the enforceStateTransitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceStateTransitions(Boolean value) {
        this.enforceStateTransitions = value;
    }

    /**
     * Gets the value of the iconLargeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconLargeName() {
        return iconLargeName;
    }

    /**
     * Sets the value of the iconLargeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconLargeName(String value) {
        this.iconLargeName = value;
    }

    /**
     * Gets the value of the iconMediumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconMediumName() {
        return iconMediumName;
    }

    /**
     * Sets the value of the iconMediumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconMediumName(String value) {
        this.iconMediumName = value;
    }

    /**
     * Gets the value of the iconSmallName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconSmallName() {
        return iconSmallName;
    }

    /**
     * Sets the value of the iconSmallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconSmallName(String value) {
        this.iconSmallName = value;
    }

    /**
     * Gets the value of the isAIRUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAIRUpdated() {
        return isAIRUpdated;
    }

    /**
     * Sets the value of the isAIRUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAIRUpdated(Boolean value) {
        this.isAIRUpdated = value;
    }

    /**
     * Gets the value of the isActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActivity() {
        return isActivity;
    }

    /**
     * Sets the value of the isActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActivity(Boolean value) {
        this.isActivity = value;
    }

    /**
     * Gets the value of the isActivityParty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActivityParty() {
        return isActivityParty;
    }

    /**
     * Sets the value of the isActivityParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActivityParty(Boolean value) {
        this.isActivityParty = value;
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
     * Gets the value of the isAvailableOffline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailableOffline() {
        return isAvailableOffline;
    }

    /**
     * Sets the value of the isAvailableOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailableOffline(Boolean value) {
        this.isAvailableOffline = value;
    }

    /**
     * Gets the value of the isBusinessProcessEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBusinessProcessEnabled() {
        return isBusinessProcessEnabled;
    }

    /**
     * Sets the value of the isBusinessProcessEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBusinessProcessEnabled(Boolean value) {
        this.isBusinessProcessEnabled = value;
    }

    /**
     * Gets the value of the isChildEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChildEntity() {
        return isChildEntity;
    }

    /**
     * Sets the value of the isChildEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChildEntity(Boolean value) {
        this.isChildEntity = value;
    }

    /**
     * Gets the value of the isConnectionsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsConnectionsEnabled() {
        return isConnectionsEnabled;
    }

    /**
     * Sets the value of the isConnectionsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsConnectionsEnabled(BooleanManagedProperty value) {
        this.isConnectionsEnabled = value;
    }

    /**
     * Gets the value of the isCustomEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomEntity() {
        return isCustomEntity;
    }

    /**
     * Sets the value of the isCustomEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomEntity(Boolean value) {
        this.isCustomEntity = value;
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
     * Gets the value of the isDocumentManagementEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDocumentManagementEnabled() {
        return isDocumentManagementEnabled;
    }

    /**
     * Sets the value of the isDocumentManagementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDocumentManagementEnabled(Boolean value) {
        this.isDocumentManagementEnabled = value;
    }

    /**
     * Gets the value of the isDuplicateDetectionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsDuplicateDetectionEnabled() {
        return isDuplicateDetectionEnabled;
    }

    /**
     * Sets the value of the isDuplicateDetectionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsDuplicateDetectionEnabled(BooleanManagedProperty value) {
        this.isDuplicateDetectionEnabled = value;
    }

    /**
     * Gets the value of the isEnabledForCharts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledForCharts() {
        return isEnabledForCharts;
    }

    /**
     * Sets the value of the isEnabledForCharts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledForCharts(Boolean value) {
        this.isEnabledForCharts = value;
    }

    /**
     * Gets the value of the isEnabledForTrace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledForTrace() {
        return isEnabledForTrace;
    }

    /**
     * Sets the value of the isEnabledForTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledForTrace(Boolean value) {
        this.isEnabledForTrace = value;
    }

    /**
     * Gets the value of the isImportable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImportable() {
        return isImportable;
    }

    /**
     * Sets the value of the isImportable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImportable(Boolean value) {
        this.isImportable = value;
    }

    /**
     * Gets the value of the isIntersect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntersect() {
        return isIntersect;
    }

    /**
     * Sets the value of the isIntersect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntersect(Boolean value) {
        this.isIntersect = value;
    }

    /**
     * Gets the value of the isMailMergeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsMailMergeEnabled() {
        return isMailMergeEnabled;
    }

    /**
     * Sets the value of the isMailMergeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsMailMergeEnabled(BooleanManagedProperty value) {
        this.isMailMergeEnabled = value;
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
     * Gets the value of the isMappable property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsMappable() {
        return isMappable;
    }

    /**
     * Sets the value of the isMappable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsMappable(BooleanManagedProperty value) {
        this.isMappable = value;
    }

    /**
     * Gets the value of the isQuickCreateEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuickCreateEnabled() {
        return isQuickCreateEnabled;
    }

    /**
     * Sets the value of the isQuickCreateEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuickCreateEnabled(Boolean value) {
        this.isQuickCreateEnabled = value;
    }

    /**
     * Gets the value of the isReadOnlyInMobileClient property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsReadOnlyInMobileClient() {
        return isReadOnlyInMobileClient;
    }

    /**
     * Sets the value of the isReadOnlyInMobileClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsReadOnlyInMobileClient(BooleanManagedProperty value) {
        this.isReadOnlyInMobileClient = value;
    }

    /**
     * Gets the value of the isReadingPaneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadingPaneEnabled() {
        return isReadingPaneEnabled;
    }

    /**
     * Sets the value of the isReadingPaneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadingPaneEnabled(Boolean value) {
        this.isReadingPaneEnabled = value;
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
     * Gets the value of the isStateModelAware property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStateModelAware() {
        return isStateModelAware;
    }

    /**
     * Sets the value of the isStateModelAware property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStateModelAware(Boolean value) {
        this.isStateModelAware = value;
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
     * Gets the value of the isValidForQueue property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsValidForQueue() {
        return isValidForQueue;
    }

    /**
     * Sets the value of the isValidForQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsValidForQueue(BooleanManagedProperty value) {
        this.isValidForQueue = value;
    }

    /**
     * Gets the value of the isVisibleInMobile property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsVisibleInMobile() {
        return isVisibleInMobile;
    }

    /**
     * Sets the value of the isVisibleInMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsVisibleInMobile(BooleanManagedProperty value) {
        this.isVisibleInMobile = value;
    }

    /**
     * Gets the value of the isVisibleInMobileClient property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsVisibleInMobileClient() {
        return isVisibleInMobileClient;
    }

    /**
     * Sets the value of the isVisibleInMobileClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsVisibleInMobileClient(BooleanManagedProperty value) {
        this.isVisibleInMobileClient = value;
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
     * Gets the value of the manyToManyRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfManyToManyRelationshipMetadata }
     *     
     */
    public ArrayOfManyToManyRelationshipMetadata getManyToManyRelationships() {
        return manyToManyRelationships;
    }

    /**
     * Sets the value of the manyToManyRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfManyToManyRelationshipMetadata }
     *     
     */
    public void setManyToManyRelationships(ArrayOfManyToManyRelationshipMetadata value) {
        this.manyToManyRelationships = value;
    }

    /**
     * Gets the value of the manyToOneRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOneToManyRelationshipMetadata }
     *     
     */
    public ArrayOfOneToManyRelationshipMetadata getManyToOneRelationships() {
        return manyToOneRelationships;
    }

    /**
     * Sets the value of the manyToOneRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOneToManyRelationshipMetadata }
     *     
     */
    public void setManyToOneRelationships(ArrayOfOneToManyRelationshipMetadata value) {
        this.manyToOneRelationships = value;
    }

    /**
     * Gets the value of the objectTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectTypeCode() {
        return objectTypeCode;
    }

    /**
     * Sets the value of the objectTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectTypeCode(Integer value) {
        this.objectTypeCode = value;
    }

    /**
     * Gets the value of the oneToManyRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOneToManyRelationshipMetadata }
     *     
     */
    public ArrayOfOneToManyRelationshipMetadata getOneToManyRelationships() {
        return oneToManyRelationships;
    }

    /**
     * Sets the value of the oneToManyRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOneToManyRelationshipMetadata }
     *     
     */
    public void setOneToManyRelationships(ArrayOfOneToManyRelationshipMetadata value) {
        this.oneToManyRelationships = value;
    }

    /**
     * Gets the value of the ownershipType property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypes }
     *     
     */
    public OwnershipTypes getOwnershipType() {
        return ownershipType;
    }

    /**
     * Sets the value of the ownershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypes }
     *     
     */
    public void setOwnershipType(OwnershipTypes value) {
        this.ownershipType = value;
    }

    /**
     * Gets the value of the primaryIdAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdAttribute() {
        return primaryIdAttribute;
    }

    /**
     * Sets the value of the primaryIdAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdAttribute(String value) {
        this.primaryIdAttribute = value;
    }

    /**
     * Gets the value of the primaryNameAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryNameAttribute() {
        return primaryNameAttribute;
    }

    /**
     * Sets the value of the primaryNameAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryNameAttribute(String value) {
        this.primaryNameAttribute = value;
    }

    /**
     * Gets the value of the privileges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityPrivilegeMetadata }
     *     
     */
    public ArrayOfSecurityPrivilegeMetadata getPrivileges() {
        return privileges;
    }

    /**
     * Sets the value of the privileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityPrivilegeMetadata }
     *     
     */
    public void setPrivileges(ArrayOfSecurityPrivilegeMetadata value) {
        this.privileges = value;
    }

    /**
     * Gets the value of the recurrenceBaseEntityLogicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceBaseEntityLogicalName() {
        return recurrenceBaseEntityLogicalName;
    }

    /**
     * Sets the value of the recurrenceBaseEntityLogicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceBaseEntityLogicalName(String value) {
        this.recurrenceBaseEntityLogicalName = value;
    }

    /**
     * Gets the value of the reportViewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportViewName() {
        return reportViewName;
    }

    /**
     * Sets the value of the reportViewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportViewName(String value) {
        this.reportViewName = value;
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
     * Gets the value of the primaryImageAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryImageAttribute() {
        return primaryImageAttribute;
    }

    /**
     * Sets the value of the primaryImageAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryImageAttribute(String value) {
        this.primaryImageAttribute = value;
    }

    /**
     * Gets the value of the canChangeHierarchicalRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getCanChangeHierarchicalRelationship() {
        return canChangeHierarchicalRelationship;
    }

    /**
     * Sets the value of the canChangeHierarchicalRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setCanChangeHierarchicalRelationship(BooleanManagedProperty value) {
        this.canChangeHierarchicalRelationship = value;
    }

    /**
     * Gets the value of the entityHelpUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityHelpUrl() {
        return entityHelpUrl;
    }

    /**
     * Sets the value of the entityHelpUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityHelpUrl(String value) {
        this.entityHelpUrl = value;
    }

    /**
     * Gets the value of the entityHelpUrlEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntityHelpUrlEnabled() {
        return entityHelpUrlEnabled;
    }

    /**
     * Sets the value of the entityHelpUrlEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntityHelpUrlEnabled(Boolean value) {
        this.entityHelpUrlEnabled = value;
    }

}
