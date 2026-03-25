
package com.netsuite.webservices.lists.website;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.lists.website package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SiteCategory_QNAME = new QName("urn:website_2014_2.lists.webservices.netsuite.com", "SiteCategory");
    private final static QName _SiteCategorySearch_QNAME = new QName("urn:website_2014_2.lists.webservices.netsuite.com", "siteCategorySearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.lists.website
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SiteCategory }
     * 
     */
    public SiteCategory createSiteCategory() {
        return new SiteCategory();
    }

    /**
     * Create an instance of {@link SiteCategorySearch }
     * 
     */
    public SiteCategorySearch createSiteCategorySearch() {
        return new SiteCategorySearch();
    }

    /**
     * Create an instance of {@link SiteCategoryTranslation }
     * 
     */
    public SiteCategoryTranslation createSiteCategoryTranslation() {
        return new SiteCategoryTranslation();
    }

    /**
     * Create an instance of {@link SiteCategoryTranslationList }
     * 
     */
    public SiteCategoryTranslationList createSiteCategoryTranslationList() {
        return new SiteCategoryTranslationList();
    }

    /**
     * Create an instance of {@link SiteCategoryPresentationItemList }
     * 
     */
    public SiteCategoryPresentationItemList createSiteCategoryPresentationItemList() {
        return new SiteCategoryPresentationItemList();
    }

    /**
     * Create an instance of {@link SiteCategorySearchAdvanced }
     * 
     */
    public SiteCategorySearchAdvanced createSiteCategorySearchAdvanced() {
        return new SiteCategorySearchAdvanced();
    }

    /**
     * Create an instance of {@link SiteCategorySearchRow }
     * 
     */
    public SiteCategorySearchRow createSiteCategorySearchRow() {
        return new SiteCategorySearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:website_2014_2.lists.webservices.netsuite.com", name = "SiteCategory")
    public JAXBElement<SiteCategory> createSiteCategory(SiteCategory value) {
        return new JAXBElement<SiteCategory>(_SiteCategory_QNAME, SiteCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteCategorySearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:website_2014_2.lists.webservices.netsuite.com", name = "siteCategorySearch")
    public JAXBElement<SiteCategorySearch> createSiteCategorySearch(SiteCategorySearch value) {
        return new JAXBElement<SiteCategorySearch>(_SiteCategorySearch_QNAME, SiteCategorySearch.class, null, value);
    }

}
