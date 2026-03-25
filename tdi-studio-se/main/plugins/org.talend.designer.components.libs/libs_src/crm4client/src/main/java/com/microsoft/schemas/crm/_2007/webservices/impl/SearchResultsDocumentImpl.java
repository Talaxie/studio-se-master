/*
 * An XML document type.
 * Localname: SearchResults
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SearchResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one SearchResults(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class SearchResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.SearchResultsDocument
{
    
    public SearchResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SearchResults");
    
    
    /**
     * Gets the "SearchResults" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SearchResults getSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SearchResults" element
     */
    public boolean isNilSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SearchResults" element
     */
    public void setSearchResults(com.microsoft.schemas.crm._2006.scheduling.SearchResults searchResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().add_element_user(SEARCHRESULTS$0);
            }
            target.set(searchResults);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchResults" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SearchResults addNewSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().add_element_user(SEARCHRESULTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "SearchResults" element
     */
    public void setNilSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().add_element_user(SEARCHRESULTS$0);
            }
            target.setNil();
        }
    }
}
