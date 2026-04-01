
package com.netsuite.webservices.platform.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core.SearchColumnDateField;
import com.netsuite.webservices.platform.core.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core.SearchColumnLongField;
import com.netsuite.webservices.platform.core.SearchColumnSelectField;
import com.netsuite.webservices.platform.core.SearchColumnStringField;
import com.netsuite.webservices.platform.core.SearchRowBasic;


/**
 * <p>Java class for SiteCategorySearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteCategorySearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateViewed" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="excludeFromSitemap" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hidden" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hits" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="longDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pageTitle" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sitemapPriority" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="urlComponent" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteCategorySearchRowBasic", propOrder = {
    "dateViewed",
    "description",
    "excludeFromSitemap",
    "externalId",
    "fullName",
    "hidden",
    "hits",
    "internalId",
    "longDescription",
    "name",
    "pageTitle",
    "sitemapPriority",
    "urlComponent"
})
public class SiteCategorySearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnDateField> dateViewed;
    protected List<SearchColumnStringField> description;
    protected List<SearchColumnBooleanField> excludeFromSitemap;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnStringField> fullName;
    protected List<SearchColumnBooleanField> hidden;
    protected List<SearchColumnLongField> hits;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnStringField> longDescription;
    protected List<SearchColumnStringField> name;
    protected List<SearchColumnStringField> pageTitle;
    protected List<SearchColumnEnumSelectField> sitemapPriority;
    protected List<SearchColumnStringField> urlComponent;

    /**
     * Gets the value of the dateViewed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateViewed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateViewed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDateViewed() {
        if (dateViewed == null) {
            dateViewed = new ArrayList<SearchColumnDateField>();
        }
        return this.dateViewed;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDescription() {
        if (description == null) {
            description = new ArrayList<SearchColumnStringField>();
        }
        return this.description;
    }

    /**
     * Gets the value of the excludeFromSitemap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeFromSitemap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeFromSitemap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getExcludeFromSitemap() {
        if (excludeFromSitemap == null) {
            excludeFromSitemap = new ArrayList<SearchColumnBooleanField>();
        }
        return this.excludeFromSitemap;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFullName() {
        if (fullName == null) {
            fullName = new ArrayList<SearchColumnStringField>();
        }
        return this.fullName;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hidden property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHidden().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getHidden() {
        if (hidden == null) {
            hidden = new ArrayList<SearchColumnBooleanField>();
        }
        return this.hidden;
    }

    /**
     * Gets the value of the hits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getHits() {
        if (hits == null) {
            hits = new ArrayList<SearchColumnLongField>();
        }
        return this.hits;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLongDescription() {
        if (longDescription == null) {
            longDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.longDescription;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getName() {
        if (name == null) {
            name = new ArrayList<SearchColumnStringField>();
        }
        return this.name;
    }

    /**
     * Gets the value of the pageTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPageTitle() {
        if (pageTitle == null) {
            pageTitle = new ArrayList<SearchColumnStringField>();
        }
        return this.pageTitle;
    }

    /**
     * Gets the value of the sitemapPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitemapPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitemapPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSitemapPriority() {
        if (sitemapPriority == null) {
            sitemapPriority = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.sitemapPriority;
    }

    /**
     * Gets the value of the urlComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUrlComponent() {
        if (urlComponent == null) {
            urlComponent = new ArrayList<SearchColumnStringField>();
        }
        return this.urlComponent;
    }

}
