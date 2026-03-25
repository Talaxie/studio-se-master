
package com.netsuite.webservices.lists.relationships;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.relationships.types.EntityGroupDefView;
import com.netsuite.webservices.lists.relationships.types.EntityGroupType;
import com.netsuite.webservices.platform.core.CustomFieldList;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for EntityGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupType" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EntityGroupType" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupOwner" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isSavedSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="parentGroupType" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EntityGroupType" minOccurs="0"/&gt;
 *         &lt;element name="savedSearch" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isSalesTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="restrictionGroup" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSalesRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSupportRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isProductTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isFunctionalTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="issueRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="isManufacturingWorkCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="calendarName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calendarStartTime" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EntityGroupDailyTime" minOccurs="0"/&gt;
 *         &lt;element name="calendarEndTime" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EntityGroupDailyTime" minOccurs="0"/&gt;
 *         &lt;element name="calendarDefaultView" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EntityGroupDefView" minOccurs="0"/&gt;
 *         &lt;element name="calendarPeriod" type="{urn:types.relationships_2014_2.lists.webservices.netsuite.com}EntityGroupPeriodSize" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="workCalendar" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2014_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityGroup", propOrder = {
    "groupName",
    "groupType",
    "email",
    "groupOwner",
    "isSavedSearch",
    "parentGroupType",
    "savedSearch",
    "isSalesTeam",
    "comments",
    "isPrivate",
    "restrictionGroup",
    "isInactive",
    "isSalesRep",
    "isSupportRep",
    "isProductTeam",
    "isFunctionalTeam",
    "issueRole",
    "isManufacturingWorkCenter",
    "calendarName",
    "calendarStartTime",
    "calendarEndTime",
    "calendarDefaultView",
    "calendarPeriod",
    "subsidiary",
    "machineResources",
    "laborResources",
    "workCalendar",
    "customFieldList"
})
public class EntityGroup
    extends Record
{

    protected String groupName;
    @XmlSchemaType(name = "string")
    protected EntityGroupType groupType;
    protected String email;
    protected RecordRef groupOwner;
    protected Boolean isSavedSearch;
    @XmlSchemaType(name = "string")
    protected EntityGroupType parentGroupType;
    protected RecordRef savedSearch;
    protected Boolean isSalesTeam;
    protected String comments;
    protected Boolean isPrivate;
    protected RecordRef restrictionGroup;
    protected Boolean isInactive;
    protected Boolean isSalesRep;
    protected Boolean isSupportRep;
    protected Boolean isProductTeam;
    protected Boolean isFunctionalTeam;
    protected RecordRef issueRole;
    protected Boolean isManufacturingWorkCenter;
    protected String calendarName;
    protected String calendarStartTime;
    protected String calendarEndTime;
    @XmlSchemaType(name = "string")
    protected EntityGroupDefView calendarDefaultView;
    protected String calendarPeriod;
    protected RecordRef subsidiary;
    protected Long machineResources;
    protected Long laborResources;
    protected RecordRef workCalendar;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupType }
     *     
     */
    public EntityGroupType getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupType }
     *     
     */
    public void setGroupType(EntityGroupType value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the groupOwner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getGroupOwner() {
        return groupOwner;
    }

    /**
     * Sets the value of the groupOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setGroupOwner(RecordRef value) {
        this.groupOwner = value;
    }

    /**
     * Gets the value of the isSavedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSavedSearch() {
        return isSavedSearch;
    }

    /**
     * Sets the value of the isSavedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSavedSearch(Boolean value) {
        this.isSavedSearch = value;
    }

    /**
     * Gets the value of the parentGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupType }
     *     
     */
    public EntityGroupType getParentGroupType() {
        return parentGroupType;
    }

    /**
     * Sets the value of the parentGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupType }
     *     
     */
    public void setParentGroupType(EntityGroupType value) {
        this.parentGroupType = value;
    }

    /**
     * Gets the value of the savedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSavedSearch() {
        return savedSearch;
    }

    /**
     * Sets the value of the savedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSavedSearch(RecordRef value) {
        this.savedSearch = value;
    }

    /**
     * Gets the value of the isSalesTeam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesTeam() {
        return isSalesTeam;
    }

    /**
     * Sets the value of the isSalesTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesTeam(Boolean value) {
        this.isSalesTeam = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the restrictionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRestrictionGroup() {
        return restrictionGroup;
    }

    /**
     * Sets the value of the restrictionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRestrictionGroup(RecordRef value) {
        this.restrictionGroup = value;
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
     * Gets the value of the isSalesRep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesRep() {
        return isSalesRep;
    }

    /**
     * Sets the value of the isSalesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesRep(Boolean value) {
        this.isSalesRep = value;
    }

    /**
     * Gets the value of the isSupportRep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupportRep() {
        return isSupportRep;
    }

    /**
     * Sets the value of the isSupportRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupportRep(Boolean value) {
        this.isSupportRep = value;
    }

    /**
     * Gets the value of the isProductTeam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductTeam() {
        return isProductTeam;
    }

    /**
     * Sets the value of the isProductTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductTeam(Boolean value) {
        this.isProductTeam = value;
    }

    /**
     * Gets the value of the isFunctionalTeam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFunctionalTeam() {
        return isFunctionalTeam;
    }

    /**
     * Sets the value of the isFunctionalTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFunctionalTeam(Boolean value) {
        this.isFunctionalTeam = value;
    }

    /**
     * Gets the value of the issueRole property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueRole() {
        return issueRole;
    }

    /**
     * Sets the value of the issueRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueRole(RecordRef value) {
        this.issueRole = value;
    }

    /**
     * Gets the value of the isManufacturingWorkCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManufacturingWorkCenter() {
        return isManufacturingWorkCenter;
    }

    /**
     * Sets the value of the isManufacturingWorkCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManufacturingWorkCenter(Boolean value) {
        this.isManufacturingWorkCenter = value;
    }

    /**
     * Gets the value of the calendarName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * Sets the value of the calendarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarName(String value) {
        this.calendarName = value;
    }

    /**
     * Gets the value of the calendarStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarStartTime() {
        return calendarStartTime;
    }

    /**
     * Sets the value of the calendarStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarStartTime(String value) {
        this.calendarStartTime = value;
    }

    /**
     * Gets the value of the calendarEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarEndTime() {
        return calendarEndTime;
    }

    /**
     * Sets the value of the calendarEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarEndTime(String value) {
        this.calendarEndTime = value;
    }

    /**
     * Gets the value of the calendarDefaultView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupDefView }
     *     
     */
    public EntityGroupDefView getCalendarDefaultView() {
        return calendarDefaultView;
    }

    /**
     * Sets the value of the calendarDefaultView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupDefView }
     *     
     */
    public void setCalendarDefaultView(EntityGroupDefView value) {
        this.calendarDefaultView = value;
    }

    /**
     * Gets the value of the calendarPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarPeriod() {
        return calendarPeriod;
    }

    /**
     * Sets the value of the calendarPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarPeriod(String value) {
        this.calendarPeriod = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the machineResources property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMachineResources() {
        return machineResources;
    }

    /**
     * Sets the value of the machineResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMachineResources(Long value) {
        this.machineResources = value;
    }

    /**
     * Gets the value of the laborResources property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLaborResources() {
        return laborResources;
    }

    /**
     * Sets the value of the laborResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLaborResources(Long value) {
        this.laborResources = value;
    }

    /**
     * Gets the value of the workCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkCalendar() {
        return workCalendar;
    }

    /**
     * Sets the value of the workCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkCalendar(RecordRef value) {
        this.workCalendar = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
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

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
