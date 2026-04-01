
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.setup.customization.types.CustomRecordTypeAccessType;


/**
 * <p>Java class for CustomRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includeName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showCreationDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showCreationDateOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showLastModified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showLastModifiedOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showOwnerOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showOwnerAllowChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="accessType" type="{urn:types.customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeAccessType" minOccurs="0"/&gt;
 *         &lt;element name="allowAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableMailMerge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isOrdered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isAvailableOffline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allowQuickSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableDle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableNameTranslation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enableNumbering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numberingPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberingSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberingMinDigits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numberingInit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numberingCurrentNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="allowNumberingOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isNumberingUpdateable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tabsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeTabsList" minOccurs="0"/&gt;
 *         &lt;element name="sublistsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeSublistsList" minOccurs="0"/&gt;
 *         &lt;element name="formsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeFormsList" minOccurs="0"/&gt;
 *         &lt;element name="onlineFormsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeOnlineFormsList" minOccurs="0"/&gt;
 *         &lt;element name="permissionsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypePermissionsList" minOccurs="0"/&gt;
 *         &lt;element name="linksList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeLinksList" minOccurs="0"/&gt;
 *         &lt;element name="managersList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeManagersList" minOccurs="0"/&gt;
 *         &lt;element name="childrenList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeChildrenList" minOccurs="0"/&gt;
 *         &lt;element name="parentsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeParentsList" minOccurs="0"/&gt;
 *         &lt;element name="translationsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeTranslationsList" minOccurs="0"/&gt;
 *         &lt;element name="scriptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypeFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordType", propOrder = {
    "recordName",
    "includeName",
    "showId",
    "showCreationDate",
    "showCreationDateOnList",
    "showLastModified",
    "showLastModifiedOnList",
    "showOwner",
    "showOwnerOnList",
    "showOwnerAllowChange",
    "accessType",
    "allowAttachments",
    "showNotes",
    "enableMailMerge",
    "isOrdered",
    "isAvailableOffline",
    "allowQuickSearch",
    "enableDle",
    "enableNameTranslation",
    "isInactive",
    "disclaimer",
    "enableNumbering",
    "numberingPrefix",
    "numberingSuffix",
    "numberingMinDigits",
    "numberingInit",
    "numberingCurrentNumber",
    "allowNumberingOverride",
    "isNumberingUpdateable",
    "owner",
    "description",
    "tabsList",
    "sublistsList",
    "formsList",
    "onlineFormsList",
    "permissionsList",
    "linksList",
    "managersList",
    "childrenList",
    "parentsList",
    "translationsList",
    "scriptId",
    "customFieldList"
})
public class CustomRecordType
    extends Record
{

    protected String recordName;
    protected Boolean includeName;
    protected Boolean showId;
    protected Boolean showCreationDate;
    protected Boolean showCreationDateOnList;
    protected Boolean showLastModified;
    protected Boolean showLastModifiedOnList;
    protected Boolean showOwner;
    protected Boolean showOwnerOnList;
    protected Boolean showOwnerAllowChange;
    @XmlSchemaType(name = "string")
    protected CustomRecordTypeAccessType accessType;
    protected Boolean allowAttachments;
    protected Boolean showNotes;
    protected Boolean enableMailMerge;
    protected Boolean isOrdered;
    protected Boolean isAvailableOffline;
    protected Boolean allowQuickSearch;
    protected Boolean enableDle;
    protected Boolean enableNameTranslation;
    protected Boolean isInactive;
    protected String disclaimer;
    protected Boolean enableNumbering;
    protected String numberingPrefix;
    protected String numberingSuffix;
    protected Long numberingMinDigits;
    protected Long numberingInit;
    protected Long numberingCurrentNumber;
    protected Boolean allowNumberingOverride;
    protected Boolean isNumberingUpdateable;
    protected RecordRef owner;
    protected String description;
    protected CustomRecordTypeTabsList tabsList;
    protected CustomRecordTypeSublistsList sublistsList;
    protected CustomRecordTypeFormsList formsList;
    protected CustomRecordTypeOnlineFormsList onlineFormsList;
    protected CustomRecordTypePermissionsList permissionsList;
    protected CustomRecordTypeLinksList linksList;
    protected CustomRecordTypeManagersList managersList;
    protected CustomRecordTypeChildrenList childrenList;
    protected CustomRecordTypeParentsList parentsList;
    protected CustomRecordTypeTranslationsList translationsList;
    protected String scriptId;
    protected CustomRecordTypeFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the includeName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeName() {
        return includeName;
    }

    /**
     * Sets the value of the includeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeName(Boolean value) {
        this.includeName = value;
    }

    /**
     * Gets the value of the showId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowId() {
        return showId;
    }

    /**
     * Sets the value of the showId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowId(Boolean value) {
        this.showId = value;
    }

    /**
     * Gets the value of the showCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCreationDate() {
        return showCreationDate;
    }

    /**
     * Sets the value of the showCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCreationDate(Boolean value) {
        this.showCreationDate = value;
    }

    /**
     * Gets the value of the showCreationDateOnList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCreationDateOnList() {
        return showCreationDateOnList;
    }

    /**
     * Sets the value of the showCreationDateOnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCreationDateOnList(Boolean value) {
        this.showCreationDateOnList = value;
    }

    /**
     * Gets the value of the showLastModified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLastModified() {
        return showLastModified;
    }

    /**
     * Sets the value of the showLastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLastModified(Boolean value) {
        this.showLastModified = value;
    }

    /**
     * Gets the value of the showLastModifiedOnList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLastModifiedOnList() {
        return showLastModifiedOnList;
    }

    /**
     * Sets the value of the showLastModifiedOnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLastModifiedOnList(Boolean value) {
        this.showLastModifiedOnList = value;
    }

    /**
     * Gets the value of the showOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOwner() {
        return showOwner;
    }

    /**
     * Sets the value of the showOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOwner(Boolean value) {
        this.showOwner = value;
    }

    /**
     * Gets the value of the showOwnerOnList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOwnerOnList() {
        return showOwnerOnList;
    }

    /**
     * Sets the value of the showOwnerOnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOwnerOnList(Boolean value) {
        this.showOwnerOnList = value;
    }

    /**
     * Gets the value of the showOwnerAllowChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOwnerAllowChange() {
        return showOwnerAllowChange;
    }

    /**
     * Sets the value of the showOwnerAllowChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOwnerAllowChange(Boolean value) {
        this.showOwnerAllowChange = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeAccessType }
     *     
     */
    public CustomRecordTypeAccessType getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeAccessType }
     *     
     */
    public void setAccessType(CustomRecordTypeAccessType value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the allowAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAttachments() {
        return allowAttachments;
    }

    /**
     * Sets the value of the allowAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAttachments(Boolean value) {
        this.allowAttachments = value;
    }

    /**
     * Gets the value of the showNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowNotes() {
        return showNotes;
    }

    /**
     * Sets the value of the showNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowNotes(Boolean value) {
        this.showNotes = value;
    }

    /**
     * Gets the value of the enableMailMerge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMailMerge() {
        return enableMailMerge;
    }

    /**
     * Sets the value of the enableMailMerge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMailMerge(Boolean value) {
        this.enableMailMerge = value;
    }

    /**
     * Gets the value of the isOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrdered() {
        return isOrdered;
    }

    /**
     * Sets the value of the isOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrdered(Boolean value) {
        this.isOrdered = value;
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
     * Gets the value of the allowQuickSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowQuickSearch() {
        return allowQuickSearch;
    }

    /**
     * Sets the value of the allowQuickSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowQuickSearch(Boolean value) {
        this.allowQuickSearch = value;
    }

    /**
     * Gets the value of the enableDle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDle() {
        return enableDle;
    }

    /**
     * Sets the value of the enableDle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDle(Boolean value) {
        this.enableDle = value;
    }

    /**
     * Gets the value of the enableNameTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNameTranslation() {
        return enableNameTranslation;
    }

    /**
     * Sets the value of the enableNameTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNameTranslation(Boolean value) {
        this.enableNameTranslation = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

    /**
     * Gets the value of the enableNumbering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNumbering() {
        return enableNumbering;
    }

    /**
     * Sets the value of the enableNumbering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNumbering(Boolean value) {
        this.enableNumbering = value;
    }

    /**
     * Gets the value of the numberingPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingPrefix() {
        return numberingPrefix;
    }

    /**
     * Sets the value of the numberingPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingPrefix(String value) {
        this.numberingPrefix = value;
    }

    /**
     * Gets the value of the numberingSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingSuffix() {
        return numberingSuffix;
    }

    /**
     * Sets the value of the numberingSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingSuffix(String value) {
        this.numberingSuffix = value;
    }

    /**
     * Gets the value of the numberingMinDigits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberingMinDigits() {
        return numberingMinDigits;
    }

    /**
     * Sets the value of the numberingMinDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberingMinDigits(Long value) {
        this.numberingMinDigits = value;
    }

    /**
     * Gets the value of the numberingInit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberingInit() {
        return numberingInit;
    }

    /**
     * Sets the value of the numberingInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberingInit(Long value) {
        this.numberingInit = value;
    }

    /**
     * Gets the value of the numberingCurrentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberingCurrentNumber() {
        return numberingCurrentNumber;
    }

    /**
     * Sets the value of the numberingCurrentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberingCurrentNumber(Long value) {
        this.numberingCurrentNumber = value;
    }

    /**
     * Gets the value of the allowNumberingOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowNumberingOverride() {
        return allowNumberingOverride;
    }

    /**
     * Sets the value of the allowNumberingOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNumberingOverride(Boolean value) {
        this.allowNumberingOverride = value;
    }

    /**
     * Gets the value of the isNumberingUpdateable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNumberingUpdateable() {
        return isNumberingUpdateable;
    }

    /**
     * Sets the value of the isNumberingUpdateable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNumberingUpdateable(Boolean value) {
        this.isNumberingUpdateable = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOwner(RecordRef value) {
        this.owner = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the tabsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeTabsList }
     *     
     */
    public CustomRecordTypeTabsList getTabsList() {
        return tabsList;
    }

    /**
     * Sets the value of the tabsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeTabsList }
     *     
     */
    public void setTabsList(CustomRecordTypeTabsList value) {
        this.tabsList = value;
    }

    /**
     * Gets the value of the sublistsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeSublistsList }
     *     
     */
    public CustomRecordTypeSublistsList getSublistsList() {
        return sublistsList;
    }

    /**
     * Sets the value of the sublistsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeSublistsList }
     *     
     */
    public void setSublistsList(CustomRecordTypeSublistsList value) {
        this.sublistsList = value;
    }

    /**
     * Gets the value of the formsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeFormsList }
     *     
     */
    public CustomRecordTypeFormsList getFormsList() {
        return formsList;
    }

    /**
     * Sets the value of the formsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeFormsList }
     *     
     */
    public void setFormsList(CustomRecordTypeFormsList value) {
        this.formsList = value;
    }

    /**
     * Gets the value of the onlineFormsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeOnlineFormsList }
     *     
     */
    public CustomRecordTypeOnlineFormsList getOnlineFormsList() {
        return onlineFormsList;
    }

    /**
     * Sets the value of the onlineFormsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeOnlineFormsList }
     *     
     */
    public void setOnlineFormsList(CustomRecordTypeOnlineFormsList value) {
        this.onlineFormsList = value;
    }

    /**
     * Gets the value of the permissionsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypePermissionsList }
     *     
     */
    public CustomRecordTypePermissionsList getPermissionsList() {
        return permissionsList;
    }

    /**
     * Sets the value of the permissionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypePermissionsList }
     *     
     */
    public void setPermissionsList(CustomRecordTypePermissionsList value) {
        this.permissionsList = value;
    }

    /**
     * Gets the value of the linksList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeLinksList }
     *     
     */
    public CustomRecordTypeLinksList getLinksList() {
        return linksList;
    }

    /**
     * Sets the value of the linksList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeLinksList }
     *     
     */
    public void setLinksList(CustomRecordTypeLinksList value) {
        this.linksList = value;
    }

    /**
     * Gets the value of the managersList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeManagersList }
     *     
     */
    public CustomRecordTypeManagersList getManagersList() {
        return managersList;
    }

    /**
     * Sets the value of the managersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeManagersList }
     *     
     */
    public void setManagersList(CustomRecordTypeManagersList value) {
        this.managersList = value;
    }

    /**
     * Gets the value of the childrenList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeChildrenList }
     *     
     */
    public CustomRecordTypeChildrenList getChildrenList() {
        return childrenList;
    }

    /**
     * Sets the value of the childrenList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeChildrenList }
     *     
     */
    public void setChildrenList(CustomRecordTypeChildrenList value) {
        this.childrenList = value;
    }

    /**
     * Gets the value of the parentsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeParentsList }
     *     
     */
    public CustomRecordTypeParentsList getParentsList() {
        return parentsList;
    }

    /**
     * Sets the value of the parentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeParentsList }
     *     
     */
    public void setParentsList(CustomRecordTypeParentsList value) {
        this.parentsList = value;
    }

    /**
     * Gets the value of the translationsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeTranslationsList }
     *     
     */
    public CustomRecordTypeTranslationsList getTranslationsList() {
        return translationsList;
    }

    /**
     * Sets the value of the translationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeTranslationsList }
     *     
     */
    public void setTranslationsList(CustomRecordTypeTranslationsList value) {
        this.translationsList = value;
    }

    /**
     * Gets the value of the scriptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptId() {
        return scriptId;
    }

    /**
     * Sets the value of the scriptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptId(String value) {
        this.scriptId = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeFieldList }
     *     
     */
    public CustomRecordTypeFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeFieldList }
     *     
     */
    public void setCustomFieldList(CustomRecordTypeFieldList value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

}
