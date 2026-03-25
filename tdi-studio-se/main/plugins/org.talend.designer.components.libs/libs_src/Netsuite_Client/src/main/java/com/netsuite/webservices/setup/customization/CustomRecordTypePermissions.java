
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.setup.customization.types.CustomRecordTypePermissionsPermittedLevel;
import com.netsuite.webservices.setup.customization.types.CustomRecordTypePermissionsRestriction;


/**
 * <p>Java class for CustomRecordTypePermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypePermissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="permittedRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="permittedLevel" type="{urn:types.customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypePermissionsPermittedLevel" minOccurs="0"/&gt;
 *         &lt;element name="restriction" type="{urn:types.customization_2014_2.setup.webservices.netsuite.com}CustomRecordTypePermissionsRestriction" minOccurs="0"/&gt;
 *         &lt;element name="defaultForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="restrictForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="searchForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="searchResults" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="listView" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="listViewRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dashboardView" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="restrictDashboardView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sublistView" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="restrictSublistView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypePermissions", propOrder = {
    "permittedRole",
    "permittedLevel",
    "restriction",
    "defaultForm",
    "restrictForm",
    "searchForm",
    "searchResults",
    "listView",
    "listViewRestricted",
    "dashboardView",
    "restrictDashboardView",
    "sublistView",
    "restrictSublistView"
})
public class CustomRecordTypePermissions {

    protected RecordRef permittedRole;
    @XmlSchemaType(name = "string")
    protected CustomRecordTypePermissionsPermittedLevel permittedLevel;
    @XmlSchemaType(name = "string")
    protected CustomRecordTypePermissionsRestriction restriction;
    protected RecordRef defaultForm;
    protected Boolean restrictForm;
    protected RecordRef searchForm;
    protected RecordRef searchResults;
    protected RecordRef listView;
    protected Boolean listViewRestricted;
    protected RecordRef dashboardView;
    protected Boolean restrictDashboardView;
    protected RecordRef sublistView;
    protected Boolean restrictSublistView;

    /**
     * Gets the value of the permittedRole property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPermittedRole() {
        return permittedRole;
    }

    /**
     * Sets the value of the permittedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPermittedRole(RecordRef value) {
        this.permittedRole = value;
    }

    /**
     * Gets the value of the permittedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypePermissionsPermittedLevel }
     *     
     */
    public CustomRecordTypePermissionsPermittedLevel getPermittedLevel() {
        return permittedLevel;
    }

    /**
     * Sets the value of the permittedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypePermissionsPermittedLevel }
     *     
     */
    public void setPermittedLevel(CustomRecordTypePermissionsPermittedLevel value) {
        this.permittedLevel = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypePermissionsRestriction }
     *     
     */
    public CustomRecordTypePermissionsRestriction getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypePermissionsRestriction }
     *     
     */
    public void setRestriction(CustomRecordTypePermissionsRestriction value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the defaultForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDefaultForm() {
        return defaultForm;
    }

    /**
     * Sets the value of the defaultForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDefaultForm(RecordRef value) {
        this.defaultForm = value;
    }

    /**
     * Gets the value of the restrictForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictForm() {
        return restrictForm;
    }

    /**
     * Sets the value of the restrictForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictForm(Boolean value) {
        this.restrictForm = value;
    }

    /**
     * Gets the value of the searchForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchForm() {
        return searchForm;
    }

    /**
     * Sets the value of the searchForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchForm(RecordRef value) {
        this.searchForm = value;
    }

    /**
     * Gets the value of the searchResults property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchResults() {
        return searchResults;
    }

    /**
     * Sets the value of the searchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchResults(RecordRef value) {
        this.searchResults = value;
    }

    /**
     * Gets the value of the listView property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getListView() {
        return listView;
    }

    /**
     * Sets the value of the listView property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setListView(RecordRef value) {
        this.listView = value;
    }

    /**
     * Gets the value of the listViewRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListViewRestricted() {
        return listViewRestricted;
    }

    /**
     * Sets the value of the listViewRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListViewRestricted(Boolean value) {
        this.listViewRestricted = value;
    }

    /**
     * Gets the value of the dashboardView property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDashboardView() {
        return dashboardView;
    }

    /**
     * Sets the value of the dashboardView property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDashboardView(RecordRef value) {
        this.dashboardView = value;
    }

    /**
     * Gets the value of the restrictDashboardView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictDashboardView() {
        return restrictDashboardView;
    }

    /**
     * Sets the value of the restrictDashboardView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictDashboardView(Boolean value) {
        this.restrictDashboardView = value;
    }

    /**
     * Gets the value of the sublistView property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSublistView() {
        return sublistView;
    }

    /**
     * Sets the value of the sublistView property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSublistView(RecordRef value) {
        this.sublistView = value;
    }

    /**
     * Gets the value of the restrictSublistView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictSublistView() {
        return restrictSublistView;
    }

    /**
     * Sets the value of the restrictSublistView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictSublistView(Boolean value) {
        this.restrictSublistView = value;
    }

}
